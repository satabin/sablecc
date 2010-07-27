/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala.macro;

import java.util.*;

public class MLrStateSingleton {

  private final String pNumber;
  private final MLrStateSingleton mLrStateSingleton = this;
  private final MParser mParser;
  private final List<Object> eDistance = new LinkedList<Object>();
  private final List<Object> eLr1OrMore = new LinkedList<Object>();
  private final List<Object> eProductionLrTransitionTarget = new LinkedList<Object>();
  private final List<Object> eNormalTokenLrTransitionTarget = new LinkedList<Object>();
  private final List<Object> eEndTokenLrTransitionTarget = new LinkedList<Object>();

  MLrStateSingleton(String pNumber, MParser mParser) {
    if(pNumber == null) throw new NullPointerException();
    this.pNumber = pNumber;
    if(mParser == null) throw new NullPointerException();
    this.mParser = mParser;
  }

  public MDistance newDistance(String pDistance) {
    MDistance lDistance = new MDistance(pDistance);
    this.eDistance.add(lDistance);
    return lDistance;
  }

  public MLr1OrMore newLr1OrMore() {
    MLr1OrMore lLr1OrMore = new MLr1OrMore();
    this.eLr1OrMore.add(lLr1OrMore);
    return lLr1OrMore;
  }

  public MProductionLrTransitionTarget newProductionLrTransitionTarget(String pNodeType, String pTarget) {
    MProductionLrTransitionTarget lProductionLrTransitionTarget = new MProductionLrTransitionTarget(pNodeType, pTarget);
    this.eProductionLrTransitionTarget.add(lProductionLrTransitionTarget);
    return lProductionLrTransitionTarget;
  }

  public MNormalTokenLrTransitionTarget newNormalTokenLrTransitionTarget(String pNodeType, String pTarget) {
    MNormalTokenLrTransitionTarget lNormalTokenLrTransitionTarget = new MNormalTokenLrTransitionTarget(pNodeType, pTarget);
    this.eNormalTokenLrTransitionTarget.add(lNormalTokenLrTransitionTarget);
    return lNormalTokenLrTransitionTarget;
  }

  public MEndTokenLrTransitionTarget newEndTokenLrTransitionTarget(String pTarget) {
    MEndTokenLrTransitionTarget lEndTokenLrTransitionTarget = new MEndTokenLrTransitionTarget(pTarget);
    this.eEndTokenLrTransitionTarget.add(lEndTokenLrTransitionTarget);
    return lEndTokenLrTransitionTarget;
  }

  String pNumber() {
    return this.pNumber;
  }

  private String rPkg() {
    return this.mParser.pPkg();
  }

  private String rNumber() {
    return this.mLrStateSingleton.pNumber();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(System.getProperty("line.separator"));
    sb.append("protected[");
    sb.append(rPkg());
    sb.append("] object L_");
    sb.append(rNumber());
    sb.append(System.getProperty("line.separator"));
    sb.append("    extends LRState {");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  override def apply(parser: Parser): Node = {");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    for(Object oDistance : this.eDistance) {
      sb.append(oDistance.toString());
    }
    for(Object oLr1OrMore : this.eLr1OrMore) {
      sb.append(oLr1OrMore.toString());
    }
    sb.append("  }");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  import Node._");
    sb.append(System.getProperty("line.separator"));
    sb.append("  ");
    sb.append(System.getProperty("line.separator"));
    sb.append("  protected[");
    sb.append(rPkg());
    sb.append("] override def target(node: Node): LRState = node.productionType match {");
    sb.append(System.getProperty("line.separator"));
    for(Object oProductionLrTransitionTarget : this.eProductionLrTransitionTarget) {
      sb.append(oProductionLrTransitionTarget.toString());
    }
    sb.append("    case _ => node.internalType match {");
    sb.append(System.getProperty("line.separator"));
    for(Object oNormalTokenLrTransitionTarget : this.eNormalTokenLrTransitionTarget) {
      sb.append(oNormalTokenLrTransitionTarget.toString());
    }
    for(Object oEndTokenLrTransitionTarget : this.eEndTokenLrTransitionTarget) {
      sb.append(oEndTokenLrTransitionTarget.toString());
    }
    sb.append("        case _ =>");
    sb.append(System.getProperty("line.separator"));
    sb.append("          throw new ParserException(node.asInstanceOf[Token])");
    sb.append(System.getProperty("line.separator"));
    sb.append("      }");
    sb.append(System.getProperty("line.separator"));
    sb.append("    }");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}