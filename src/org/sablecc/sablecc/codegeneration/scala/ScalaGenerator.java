/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.sablecc.codegeneration.scala;

import static org.sablecc.sablecc.util.Utils.to_CamelCase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.Map.Entry;

import org.sablecc.sablecc.alphabet.Bound;
import org.sablecc.sablecc.alphabet.Interval;
import org.sablecc.sablecc.alphabet.RichSymbol;
import org.sablecc.sablecc.alphabet.Symbol;
import org.sablecc.sablecc.automaton.Acceptation;
import org.sablecc.sablecc.automaton.Automaton;
import org.sablecc.sablecc.automaton.Marker;
import org.sablecc.sablecc.automaton.State;
import org.sablecc.sablecc.codegeneration.scala.macro.MAction;
import org.sablecc.sablecc.codegeneration.scala.macro.MAlternative;
import org.sablecc.sablecc.codegeneration.scala.macro.MAnonymousToken;
import org.sablecc.sablecc.codegeneration.scala.macro.MCustomToken;
import org.sablecc.sablecc.codegeneration.scala.macro.MDistance;
import org.sablecc.sablecc.codegeneration.scala.macro.MEnd;
import org.sablecc.sablecc.codegeneration.scala.macro.MFinalState;
import org.sablecc.sablecc.codegeneration.scala.macro.MFinalStateSingleton;
import org.sablecc.sablecc.codegeneration.scala.macro.MLexer;
import org.sablecc.sablecc.codegeneration.scala.macro.MLexerException;
import org.sablecc.sablecc.codegeneration.scala.macro.MLrStateSingleton;
import org.sablecc.sablecc.codegeneration.scala.macro.MNode;
import org.sablecc.sablecc.codegeneration.scala.macro.MNormalGroup;
import org.sablecc.sablecc.codegeneration.scala.macro.MNormalTransformerCase;
import org.sablecc.sablecc.codegeneration.scala.macro.MNormalTraverserCase;
import org.sablecc.sablecc.codegeneration.scala.macro.MParser;
import org.sablecc.sablecc.codegeneration.scala.macro.MParserException;
import org.sablecc.sablecc.codegeneration.scala.macro.MProduction;
import org.sablecc.sablecc.codegeneration.scala.macro.MPublicElementAccessor;
import org.sablecc.sablecc.codegeneration.scala.macro.MReduce;
import org.sablecc.sablecc.codegeneration.scala.macro.MReduceDecision;
import org.sablecc.sablecc.codegeneration.scala.macro.MState;
import org.sablecc.sablecc.codegeneration.scala.macro.MSymbol;
import org.sablecc.sablecc.codegeneration.scala.macro.MTest;
import org.sablecc.sablecc.codegeneration.scala.macro.MToken;
import org.sablecc.sablecc.codegeneration.scala.macro.MTransformer;
import org.sablecc.sablecc.codegeneration.scala.macro.MTransitionState;
import org.sablecc.sablecc.codegeneration.scala.macro.MTransitionStateSingleton;
import org.sablecc.sablecc.codegeneration.scala.macro.MTraverser;
import org.sablecc.sablecc.exception.CompilerException;
import org.sablecc.sablecc.lrautomaton.Action;
import org.sablecc.sablecc.lrautomaton.ActionType;
import org.sablecc.sablecc.lrautomaton.Alternative;
import org.sablecc.sablecc.lrautomaton.Element;
import org.sablecc.sablecc.lrautomaton.Item;
import org.sablecc.sablecc.lrautomaton.LRAutomaton;
import org.sablecc.sablecc.lrautomaton.LRState;
import org.sablecc.sablecc.lrautomaton.Production;
import org.sablecc.sablecc.lrautomaton.ProductionElement;
import org.sablecc.sablecc.lrautomaton.ReduceAction;
import org.sablecc.sablecc.lrautomaton.Token;
import org.sablecc.sablecc.lrautomaton.TokenElement;
import org.sablecc.sablecc.oldstructure.AnonymousToken;
import org.sablecc.sablecc.oldstructure.Context;
import org.sablecc.sablecc.oldstructure.GlobalIndex;
import org.sablecc.sablecc.oldstructure.MatchedToken;
import org.sablecc.sablecc.oldstructure.NameToken;

/**
 * The main class of SableCC.
 */
public class ScalaGenerator {

	public static void generateCode(File destinationDirectory,
			String destinationPackage, GlobalIndex globalIndex,
			Automaton lexer, LRAutomaton parser) {

		String languagePackageName = "language_"
				+ globalIndex.getLanguage().get_camelCaseName();
		File packageDirectory;
		MNode mNode = new MNode(languagePackageName);
		MToken mToken = new MToken();
		MState mState = new MState(languagePackageName);
		MTransitionState mTransitionState = new MTransitionState(
				languagePackageName);
		MFinalState mFinalState = new MFinalState(languagePackageName);
		MSymbol mSymbol = new MSymbol();
		MLexer mLexer = new MLexer(languagePackageName);
		MLexerException mLexerException = new MLexerException();
		MParserException mParserException = new MParserException();
		MTest mTest = new MTest();
		MEnd mEnd = new MEnd(languagePackageName);
		MTransformer mTransformer = new MTransformer();
		MTraverser mTraverser = new MTraverser();
		MParser mParser = new MParser(languagePackageName);

		if (destinationPackage.equals("")) {
			packageDirectory = new File(destinationDirectory,
					languagePackageName);
			mNode.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mToken.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mState.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mTransitionState.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mFinalState.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mSymbol.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mLexer.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mLexerException.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mParserException.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mTest.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mEnd.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mTransformer.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mTraverser.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
			mParser.newDefaultPackage(globalIndex.getLanguage()
					.get_camelCaseName());
		} else {
			packageDirectory = new File(destinationDirectory,
					destinationPackage.replace('.', '/') + "/"
							+ languagePackageName);
			mNode.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mToken.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mState.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mTransitionState.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mFinalState.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mSymbol.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mLexer.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mLexerException.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mParserException.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mTest.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mEnd.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mTransformer.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mTraverser.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
			mParser.newSpecifiedPackage(globalIndex.getLanguage()
					.get_camelCaseName(), destinationPackage);
		}

		packageDirectory.mkdirs();

		Context context = globalIndex.getContexts().iterator().next();

		for (MatchedToken matchedToken : context.getMatchedTokens()) {
			if (!matchedToken.isIgnored()) {
				if (matchedToken instanceof NameToken) {
					NameToken nameToken = (NameToken) matchedToken;

					mNode.newNodeTypeEnumEntry(nameToken.get_CamelCaseName());
					mNode.newNodeInternalTypeEnumEntry(nameToken
							.get_CamelCaseName());

					MCustomToken mCustomToken = new MCustomToken(nameToken
							.get_CamelCaseName());

					if (destinationPackage.equals("")) {
						mCustomToken.newDefaultPackage(globalIndex
								.getLanguage().get_camelCaseName());
					} else {
						mCustomToken.newSpecifiedPackage(globalIndex
								.getLanguage().get_camelCaseName(),
								destinationPackage);
					}

					try {
						BufferedWriter bw = new BufferedWriter(new FileWriter(
								new File(packageDirectory, "N"
										+ nameToken.get_CamelCaseName()
										+ ".scala")));

						bw.write(mCustomToken.toString());
						bw.close();
					} catch (IOException e) {
						throw CompilerException.outputError("N"
								+ nameToken.get_CamelCaseName() + ".scala", e);
					}
				} else {
					AnonymousToken anonymousToken = (AnonymousToken) matchedToken;

					mNode.newNodeInternalTypeEnumEntry(""
							+ anonymousToken.get_CamelCaseName());

					MAnonymousToken mAnonymousToken = new MAnonymousToken(""
							+ anonymousToken.get_CamelCaseName());

					if (destinationPackage.equals("")) {
						mAnonymousToken.newDefaultPackage(globalIndex
								.getLanguage().get_camelCaseName());
					} else {
						mAnonymousToken.newSpecifiedPackage(globalIndex
								.getLanguage().get_camelCaseName(),
								destinationPackage);
					}

					try {
						BufferedWriter bw = new BufferedWriter(new FileWriter(
								new File(packageDirectory, "N"
										+ anonymousToken.get_CamelCaseName()
										+ ".scala")));

						bw.write(mAnonymousToken.toString());
						bw.close();
					} catch (IOException e) {
						throw CompilerException.outputError(
								"N" + anonymousToken.get_CamelCaseName()
										+ ".scala", e);
					}
				}
			}
		}

		for (Symbol symbol : lexer.getAlphabet().getSymbols()) {
			mSymbol.newSymbolDeclaration(symbol.getSimpleName());
		}

		for (Map.Entry<Interval, Symbol> entry : lexer.getAlphabet()
				.getIntervalToSymbolMap().entrySet()) {
			Interval interval = entry.getKey();
			Symbol symbol = entry.getValue();

			if (interval.getLowerBound() == Bound.MIN) {
				if (interval.getUpperBound() == Bound.MAX) {
					mSymbol.newOpenInterval(symbol.getSimpleName());
				} else {
					mSymbol.newOpenLeftInterval(interval.getUpperBound()
							.getValue().toString(), symbol.getSimpleName());
				}
			} else if (interval.getUpperBound() == Bound.MAX) {
				mSymbol.newOpenRightInterval(interval.getLowerBound()
						.getValue().toString(), symbol.getSimpleName());
			} else if (interval.getLowerBound()
					.equals(interval.getUpperBound())) {
				mSymbol.newSingleChar(interval.getLowerBound().getValue()
						.toString(), symbol.getSimpleName());
			} else {
				mSymbol.newInterval(interval.getLowerBound().getValue()
						.toString(), interval.getUpperBound().getValue()
						.toString(), symbol.getSimpleName());
			}
		}

		for (State state : lexer.getStates()) {
			if (state.isAcceptState()) {
				Acceptation acceptation = state.getAcceptations().first();
				MFinalStateSingleton mFinalStateSingleton = new MFinalStateSingleton(
						"" + state.getId(), "" + acceptation.getBackCount(),
						languagePackageName);

				if (destinationPackage.equals("")) {
					mFinalStateSingleton.newDefaultPackage(globalIndex
							.getLanguage().get_camelCaseName());
				} else {
					mFinalStateSingleton.newSpecifiedPackage(globalIndex
							.getLanguage().get_camelCaseName(),
							destinationPackage);
				}

				Marker marker = acceptation.getMarker();

				if (marker == null) {
					mFinalStateSingleton.newAcceptTokenNoMarker();
				} else {
					mFinalStateSingleton.newAcceptTokenWithMarker(marker
							.getName());
				}

				MatchedToken matchedToken = context.getMatchedToken(acceptation
						.getName());

				if (matchedToken.isIgnored()) {
					mFinalStateSingleton.newAcceptIgnoredToken();
				} else {
					if (matchedToken instanceof NameToken) {
						NameToken nameToken = (NameToken) matchedToken;

						mFinalStateSingleton.newAcceptNormalToken(nameToken
								.get_CamelCaseName());
					} else {
						AnonymousToken anonymousToken = (AnonymousToken) matchedToken;

						mFinalStateSingleton.newAcceptNormalToken(""
								+ anonymousToken.get_CamelCaseName());
					}
				}

				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(
							new File(packageDirectory, "S_" + state.getId()
									+ ".scala")));

					bw.write(mFinalStateSingleton.toString());
					bw.close();
				} catch (IOException e) {
					throw CompilerException.outputError("S_" + state.getId()
							+ ".scala", e);
				}
			} else {
				MTransitionStateSingleton mTransitionStateSingleton = new MTransitionStateSingleton(
						"" + state.getId(), languagePackageName);

				if (destinationPackage.equals("")) {
					mTransitionStateSingleton.newDefaultPackage(globalIndex
							.getLanguage().get_camelCaseName());
				} else {
					mTransitionStateSingleton.newSpecifiedPackage(globalIndex
							.getLanguage().get_camelCaseName(),
							destinationPackage);
				}

				Marker marker = state.getMarker();

				if (marker == null) {
					mTransitionStateSingleton.newNoMarker();
				} else {
					mTransitionStateSingleton.newSetMarker(marker.getName());
				}

				for (Entry<RichSymbol, SortedSet<State>> entry : state
						.getTransitions().entrySet()) {
					RichSymbol richSymbol = entry.getKey();
					State target = state.getSingleTarget(richSymbol);
					String symbolName = richSymbol == RichSymbol.END ? "end"
							: richSymbol.getSymbol().getSimpleName();

					mTransitionStateSingleton.newTransitionTarget(symbolName,
							"" + target.getId());
				}

				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(
							new File(packageDirectory, "S_" + state.getId()
									+ ".scala")));

					bw.write(mTransitionStateSingleton.toString());
					bw.close();
				} catch (IOException e) {
					throw CompilerException.outputError("S_" + state.getId()
							+ ".scala", e);
				}
			}
		}

		for (Marker marker : lexer.getMarkers()) {
			mLexer.newMarkerDeclaration(marker.getName());
			mLexer.newSetMarkerDeclaration(marker.getName());
			mLexer.newAcceptMarkerDeclaration(marker.getName());
		}

		for (Production production : parser.getGrammar().getProductions()) {

			String production_CamelCaseName = to_CamelCase(production.getName());

			mNode.newNodeProductionTypeEnumEntry(production_CamelCaseName);

			// if production is not a single anonymous alternative
			if (production.getAlternatives().size() > 1
					|| !production.getAlternatives().iterator().next()
							.getName().equals("")) {

				MProduction mProduction = new MProduction(
						production_CamelCaseName);

				if (destinationPackage.equals("")) {
					mProduction.newDefaultPackage(globalIndex.getLanguage()
							.get_camelCaseName());
				} else {
					mProduction.newSpecifiedPackage(globalIndex.getLanguage()
							.get_camelCaseName(), destinationPackage);
				}

				if (production_CamelCaseName.indexOf('$') == -1) {
					mProduction.newNamedProductionHeader();
				} else {
					mProduction
							.newAnonymousProductionHeader(languagePackageName);
				}

				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(
							new File(packageDirectory, "N"
									+ production_CamelCaseName + ".scala")));

					bw.write(mProduction.toString());
					bw.close();
				} catch (IOException e) {
					throw CompilerException.outputError("N"
							+ production_CamelCaseName + ".scala", e);
				}
			}

			for (Alternative alternative : production.getAlternatives()) {
				String alt_CamelCaseName = to_CamelCase(alternative.getName());
				String alt_CamelCaseFullName = production_CamelCaseName
						+ (alt_CamelCaseName.equals("") ? "" : "_"
								+ alt_CamelCaseName);
				boolean altIsPublic = alt_CamelCaseFullName.indexOf('$') == -1;
				boolean altExtendsNode = alt_CamelCaseFullName.indexOf('_') == -1;

				MAlternative mAlternative = new MAlternative(
						alt_CamelCaseFullName);

				// XXX new case in the traverser
				MNormalTraverserCase mTraverserCase = null;
				MNormalTransformerCase mTransformerCase = null;
				if (altIsPublic || alt_CamelCaseFullName.equals("$Start")) {
					mTraverserCase = mTraverser.newNormalTraverserCase("N"
							+ alt_CamelCaseFullName);
					mTransformerCase = mTransformer
							.newNormalTransformerCase("N"
									+ alt_CamelCaseFullName);
				}

				mAlternative.newAltProdType(production_CamelCaseName);

				if (destinationPackage.equals("")) {
					mAlternative.newDefaultPackage(globalIndex.getLanguage()
							.get_camelCaseName());
				} else {
					mAlternative.newSpecifiedPackage(globalIndex.getLanguage()
							.get_camelCaseName(), destinationPackage);
				}

				mNode.newNodeInternalTypeEnumEntry(alt_CamelCaseFullName);
				if (altIsPublic) {
					mNode.newNodeTypeEnumEntry(alt_CamelCaseFullName);
					// mAlternative.newPublic();
					mAlternative.newNamedAltType();
				} else {
					mAlternative.newPackageProtected(languagePackageName);
					mAlternative.newAnonymousAltType();
				}

				if (altExtendsNode) {
					mAlternative.newAlternativeNodeParent();
				} else {
					mAlternative
							.newAlternativeNamedParent(production_CamelCaseName);
				}

				boolean altHasPublicConstructor = true;
				for (Element element : alternative.getElements()) {
					String element_CamelCaseName = to_CamelCase(element
							.getName());
					String element_CamelCaseType = null;
					boolean elementIsEndToken;
					boolean elementIsPublicReadable;
					boolean elementIsPublicWritable;
					if (element instanceof TokenElement) {
						TokenElement tokenElement = (TokenElement) element;
						if (tokenElement.getToken().getName().equals("$end")) {
							elementIsEndToken = true;
							elementIsPublicReadable = false;
							elementIsPublicWritable = false;
						} else {
							MatchedToken matchedToken = context
									.getMatchedToken(tokenElement.getToken()
											.getName());
							if (matchedToken instanceof NameToken) {
								NameToken nameToken = (NameToken) matchedToken;
								element_CamelCaseType = nameToken
										.get_CamelCaseName();
							} else {
								AnonymousToken anonymousToken = (AnonymousToken) matchedToken;

								element_CamelCaseType = ""
										+ anonymousToken.get_CamelCaseName();
							}

							elementIsEndToken = false;
							elementIsPublicReadable = altIsPublic
									&& element_CamelCaseName.indexOf('$') == -1;
							elementIsPublicWritable = elementIsPublicReadable
									&& element_CamelCaseType.indexOf('$') == -1;
						}
					} else {
						ProductionElement productionElement = (ProductionElement) element;
						element_CamelCaseType = to_CamelCase(productionElement
								.getProduction().getName());

						elementIsEndToken = false;
						elementIsPublicReadable = altIsPublic
								&& element_CamelCaseName.indexOf('$') == -1;
						elementIsPublicWritable = elementIsPublicReadable
								&& element_CamelCaseType.indexOf('$') == -1;
					}

					if (!elementIsPublicWritable) {
						altHasPublicConstructor = false;
					}

					if (elementIsEndToken) {
						mAlternative.newEndConstructorParameter();
						mAlternative.newEndElementAccessor(languagePackageName);
						// add the end constructor
						mAlternative.newCopyConstructorParam("$end")
								.newThisTarget();

					} else {
						// XXX test to extract token parameters as Token
						if ((altIsPublic || alt_CamelCaseFullName
								.equals("$Start"))
								&& element_CamelCaseType.indexOf("$") == -1) {
							mAlternative.newExtractorType("N"
									+ element_CamelCaseType);
							mAlternative
									.newExtractorParameter(element_CamelCaseName);
							mAlternative.newCopyParameter(
									element_CamelCaseName,
									element_CamelCaseType);
							mAlternative
									.newCopyConstructorParam(element_CamelCaseName);
						} else {
							mAlternative.newCopyConstructorParam(
									element_CamelCaseName).newThisTarget();
						}
						mAlternative.newNormalConstructorParameter(
								element_CamelCaseType, element_CamelCaseName);

						mAlternative.newNormalElementAccessor(
								element_CamelCaseType, element_CamelCaseName,
								languagePackageName);

						if (elementIsPublicReadable) {
							MPublicElementAccessor publicElementAccessor = mAlternative
									.newPublicElementAccessor(element_CamelCaseName);
							if (elementIsPublicWritable) {
								publicElementAccessor
										.newPublicElementType(element_CamelCaseType);
							} else {
								publicElementAccessor.newTokenElementType();
							}

						}

						if ((altIsPublic || alt_CamelCaseFullName
								.equals("$Start"))
								&& element_CamelCaseType.indexOf("$") == -1) {
							// XXX extract a normal parameter
							mTraverserCase
									.newCaseConstructorParameter(element_CamelCaseName);
							mTransformerCase
									.newTransformCaseConstructorParameter(element_CamelCaseName);
							// and the child to traverse
							mTraverserCase
									.newChildTraverse(element_CamelCaseName);
							mTransformerCase.newChildTransform(
									element_CamelCaseName, "N"
											+ element_CamelCaseType);
						}
					}
				}

				if (!altHasPublicConstructor) {
					mAlternative.newProtectedConstructor(languagePackageName);
				}

				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(
							new File(packageDirectory, "N"
									+ alt_CamelCaseFullName + ".scala")));

					bw.write(mAlternative.toString());
					bw.close();
				} catch (IOException e) {
					throw CompilerException.outputError("N"
							+ alt_CamelCaseFullName + ".scala", e);
				}
			}
		}

		for (LRState state : parser.getStates()) {
			MLrStateSingleton mLrStateSingleton = mParser
					.newLrStateSingleton(state.getName());

			for (Entry<Token, LRState> entry : state.getTokenTransitions()
					.entrySet()) {
				Token token = entry.getKey();
				LRState target = entry.getValue();

				if (token.getName().equals("$end")) {
					mLrStateSingleton.newEndTokenLrTransitionTarget(target
							.getName());
				} else {
					MatchedToken matchedToken = context.getMatchedToken(token
							.getName());
					String element_CamelCaseType;
					if (matchedToken instanceof NameToken) {
						NameToken nameToken = (NameToken) matchedToken;
						element_CamelCaseType = nameToken.get_CamelCaseName();
					} else {
						AnonymousToken anonymousToken = (AnonymousToken) matchedToken;

						element_CamelCaseType = ""
								+ anonymousToken.get_CamelCaseName();
					}

					mLrStateSingleton.newNormalTokenLrTransitionTarget(
							element_CamelCaseType, target.getName());
				}
			}

			for (Entry<Production, LRState> entry : state
					.getProductionTransitions().entrySet()) {
				Production production = entry.getKey();
				LRState target = entry.getValue();

				String production_CamelCaseName = to_CamelCase(production
						.getName());
				mLrStateSingleton.newProductionLrTransitionTarget(
						production_CamelCaseName, target.getName());
			}

			Map<Integer, MDistance> distanceMap = new LinkedHashMap<Integer, MDistance>();
			boolean isLr1OrMore = false;
			for (Action action : state.getActions()) {
				int maxLookahead = action.getMaxLookahead();
				while (maxLookahead > distanceMap.size() - 1) {
					int distance = distanceMap.size();
					distanceMap.put(distance, mLrStateSingleton.newDistance(""
							+ distance));
				}

				MDistance mDistance = distanceMap.get(maxLookahead);
				MAction mAction = mDistance.newAction();
				if (maxLookahead > 0) {
					isLr1OrMore = true;
					for (Entry<Integer, Set<Item>> entry : action
							.getDistanceToItemSetMap().entrySet()) {
						String ahead = "" + entry.getKey();
						Set<Item> items = entry.getValue();
						Set<Token> tokens = new LinkedHashSet<Token>();
						for (Item item : items) {
							tokens.add(item.getTokenElement().getToken());
						}

						if (tokens.size() == 0) {
							mAction.newFalseGroup();
						} else {
							MNormalGroup mNormalGroup = mAction
									.newNormalGroup();

							for (Token token : tokens) {
								if (token.getName().equals("$end")) {
									mNormalGroup.newEndCondition(ahead);
								} else {
									MatchedToken matchedToken = context
											.getMatchedToken(token.getName());
									String element_CamelCaseType;
									if (matchedToken instanceof NameToken) {
										NameToken nameToken = (NameToken) matchedToken;
										element_CamelCaseType = nameToken
												.get_CamelCaseName();
									} else {
										AnonymousToken anonymousToken = (AnonymousToken) matchedToken;

										element_CamelCaseType = ""
												+ anonymousToken
														.get_CamelCaseName();
									}

									mNormalGroup.newNormalCondition(ahead,
											element_CamelCaseType);
								}
							}
						}
					}
				}

				if (action.getType() == ActionType.SHIFT) {
					mAction.newShift();
				} else {
					ReduceAction reduceAction = (ReduceAction) action;
					Alternative alternative = reduceAction.getAlternative();
					Production production = alternative.getProduction();
					String production_CamelCaseName = to_CamelCase(production
							.getName());
					String alt_CamelCaseName = to_CamelCase(alternative
							.getName());
					String alt_CamelCaseFullName = production_CamelCaseName
							+ (alt_CamelCaseName.equals("") ? "" : "_"
									+ alt_CamelCaseName);

					MReduce mReduce = mAction.newReduce(alt_CamelCaseFullName);

					ArrayList<Element> elements = alternative.getElements();
					int elementCount = elements.size();
					for (int i = elementCount - 1; i >= 0; i--) {
						Element element = elements.get(i);
						String element_CamelCaseName = to_CamelCase(element
								.getName());
						String element_CamelCaseType = null;
						boolean elementIsEndToken;
						if (element instanceof TokenElement) {
							TokenElement tokenElement = (TokenElement) element;
							if (tokenElement.getToken().getName()
									.equals("$end")) {
								elementIsEndToken = true;
							} else {
								MatchedToken matchedToken = context
										.getMatchedToken(tokenElement
												.getToken().getName());
								if (matchedToken instanceof NameToken) {
									NameToken nameToken = (NameToken) matchedToken;
									element_CamelCaseType = nameToken
											.get_CamelCaseName();
								} else {
									AnonymousToken anonymousToken = (AnonymousToken) matchedToken;

									element_CamelCaseType = ""
											+ anonymousToken
													.get_CamelCaseName();
								}

								elementIsEndToken = false;
							}
						} else {
							ProductionElement productionElement = (ProductionElement) element;
							element_CamelCaseType = to_CamelCase(productionElement
									.getProduction().getName());

							elementIsEndToken = false;
						}

						if (elementIsEndToken) {
							mReduce.newReduceEndPop();
						} else {
							mReduce.newReduceNormalPop(element_CamelCaseType,
									element_CamelCaseName);
						}
					}

					if (alt_CamelCaseFullName.equals("$Start")) {
						mReduce.newAcceptDecision(to_CamelCase(elements.get(0)
								.getName()));
					} else {
						MReduceDecision mReduceDecision = mReduce
								.newReduceDecision();

						for (Element element : elements) {
							String element_CamelCaseName = to_CamelCase(element
									.getName());
							boolean elementIsEndToken;
							if (element instanceof TokenElement) {
								TokenElement tokenElement = (TokenElement) element;
								if (tokenElement.getToken().getName().equals(
										"$end")) {
									elementIsEndToken = true;
								} else {
									elementIsEndToken = false;
								}
							} else {
								elementIsEndToken = false;
							}
							if (elementIsEndToken) {
								mReduceDecision.newEndParameter();
							} else {
								mReduceDecision
										.newNormalParameter(element_CamelCaseName);
							}
						}
					}
				}
			}

			if (isLr1OrMore) {
				mLrStateSingleton.newLr1OrMore();
			}
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "Node.scala")));

			bw.write(mNode.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("Node.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "Token.scala")));

			bw.write(mToken.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("Token.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "State.scala")));

			bw.write(mState.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("State.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "TransitionState.scala")));

			bw.write(mTransitionState.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("TransitionState.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "FinalState.scala")));

			bw.write(mFinalState.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("FinalState.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "Symbol.scala")));

			bw.write(mSymbol.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("Symbol.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "Lexer.scala")));

			bw.write(mLexer.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("Lexer.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "LexerException.scala")));

			bw.write(mLexerException.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("LexerException.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "ParserException.scala")));

			bw.write(mParserException.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("ParserException.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "Test.scala")));

			bw.write(mTest.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("Test.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "End.scala")));

			bw.write(mEnd.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("End.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "Transformer.scala")));

			bw.write(mTransformer.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("Transformer.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "Traverser.scala")));

			bw.write(mTraverser.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("Traverser.scala", e);
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					packageDirectory, "Parser.scala")));

			bw.write(mParser.toString());
			bw.close();
		} catch (IOException e) {
			throw CompilerException.outputError("Parser.scala", e);
		}
	}
}
