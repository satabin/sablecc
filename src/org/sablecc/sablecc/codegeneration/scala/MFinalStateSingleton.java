/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala;

import java.util.*;

public class MFinalStateSingleton {

  private final String pNumber;
  private final String pBackCount;
  private final String pPkg;
  private final MFinalStateSingleton mFinalStateSingleton = this;
  private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();
  private final List<Object> eAcceptTokenNoMarker = new LinkedList<Object>();
  private final List<Object> eAcceptTokenWithMarker = new LinkedList<Object>();
  private final List<Object> eAcceptNormalToken = new LinkedList<Object>();
  private final List<Object> eAcceptIgnoredToken = new LinkedList<Object>();

  public MFinalStateSingleton(String pNumber, String pBackCount, String pPkg) {
    if(pNumber == null) throw new NullPointerException();
    this.pNumber = pNumber;
    if(pBackCount == null) throw new NullPointerException();
    this.pBackCount = pBackCount;
    if(pPkg == null) throw new NullPointerException();
    this.pPkg = pPkg;
  }

  public MAcceptTokenNoMarker newAcceptTokenNoMarker() {
    MAcceptTokenNoMarker lAcceptTokenNoMarker = new MAcceptTokenNoMarker(mFinalStateSingleton);
    this.eAcceptTokenNoMarker.add(lAcceptTokenNoMarker);
    return lAcceptTokenNoMarker;
  }

  public MAcceptTokenWithMarker newAcceptTokenWithMarker(String pMarkerName) {
    MAcceptTokenWithMarker lAcceptTokenWithMarker = new MAcceptTokenWithMarker(pMarkerName, mFinalStateSingleton);
    this.eAcceptTokenWithMarker.add(lAcceptTokenWithMarker);
    return lAcceptTokenWithMarker;
  }

  public MAcceptNormalToken newAcceptNormalToken(String pTokenName) {
    MAcceptNormalToken lAcceptNormalToken = new MAcceptNormalToken(pTokenName);
    this.eAcceptNormalToken.add(lAcceptNormalToken);
    return lAcceptNormalToken;
  }

  public MAcceptIgnoredToken newAcceptIgnoredToken() {
    MAcceptIgnoredToken lAcceptIgnoredToken = new MAcceptIgnoredToken();
    this.eAcceptIgnoredToken.add(lAcceptIgnoredToken);
    return lAcceptIgnoredToken;
  }

  public MDefaultPackage newDefaultPackage(String pLanguageName) {
    MDefaultPackage lDefaultPackage = new MDefaultPackage(pLanguageName);
    this.eDefaultPackage_SpecifiedPackage.add(lDefaultPackage);
    return lDefaultPackage;
  }

  public MSpecifiedPackage newSpecifiedPackage(String pLanguageName, String pPackage) {
    MSpecifiedPackage lSpecifiedPackage = new MSpecifiedPackage(pLanguageName, pPackage);
    this.eDefaultPackage_SpecifiedPackage.add(lSpecifiedPackage);
    return lSpecifiedPackage;
  }

  String pNumber() {
    return this.pNumber;
  }

  String pBackCount() {
    return this.pBackCount;
  }

  String pPkg() {
    return this.pPkg;
  }

  private String rNumber() {
    return this.mFinalStateSingleton.pNumber();
  }

  private String rPkg() {
    return this.mFinalStateSingleton.pPkg();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MHeader().toString());
    if(this.eDefaultPackage_SpecifiedPackage.size() > 0) {
      sb.append(System.getProperty("line.separator"));
    }
    for(Object oDefaultPackage_SpecifiedPackage : this.eDefaultPackage_SpecifiedPackage) {
      sb.append(oDefaultPackage_SpecifiedPackage.toString());
    }
    sb.append(System.getProperty("line.separator"));
    sb.append("object S");
    sb.append(rNumber());
    sb.append(System.getProperty("line.separator"));
    sb.append("    extends FinalState {");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  protected[");
    sb.append(rPkg());
    sb.append("] def token(lexer: Lexer) = {");
    sb.append(System.getProperty("line.separator"));
    for(Object oAcceptTokenNoMarker : this.eAcceptTokenNoMarker) {
      sb.append(oAcceptTokenNoMarker.toString());
    }
    for(Object oAcceptTokenWithMarker : this.eAcceptTokenWithMarker) {
      sb.append(oAcceptTokenWithMarker.toString());
    }
    sb.append("    val line = lexer.acceptLine");
    sb.append(System.getProperty("line.separator"));
    sb.append("    val pos = lexer.acceptPos");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    for(Object oAcceptNormalToken : this.eAcceptNormalToken) {
      sb.append(oAcceptNormalToken.toString());
    }
    for(Object oAcceptIgnoredToken : this.eAcceptIgnoredToken) {
      sb.append(oAcceptIgnoredToken.toString());
    }
    sb.append("  }");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
