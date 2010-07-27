/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala.macro;

public class MTransitionTarget {

  private final String pSymbol;
  private final String pTarget;
  private final MTransitionTarget mTransitionTarget = this;

  MTransitionTarget(String pSymbol, String pTarget) {
    if(pSymbol == null) throw new NullPointerException();
    this.pSymbol = pSymbol;
    if(pTarget == null) throw new NullPointerException();
    this.pTarget = pTarget;
  }

  String pSymbol() {
    return this.pSymbol;
  }

  String pTarget() {
    return this.pTarget;
  }

  private String rSymbol() {
    return this.mTransitionTarget.pSymbol();
  }

  private String rTarget() {
    return this.mTransitionTarget.pTarget();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("    case Symbol.Symbol_");
    sb.append(rSymbol());
    sb.append(" => S_");
    sb.append(rTarget());
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
