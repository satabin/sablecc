/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala;

import java.util.*;

public class MFinalState {

  private final String pPkg;
  private final MFinalState mFinalState = this;
  private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();

  public MFinalState(String pPkg) {
    if(pPkg == null) throw new NullPointerException();
    this.pPkg = pPkg;
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

  String pPkg() {
    return this.pPkg;
  }

  private String rPkg() {
    return this.mFinalState.pPkg();
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
    sb.append("abstract class FinalState");
    sb.append(System.getProperty("line.separator"));
    sb.append("    extends State {");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  import State._");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  protected[");
    sb.append(rPkg());
    sb.append("] def token(lexer: Lexer): Token");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  protected[");
    sb.append(rPkg());
    sb.append("] def stateType = FINAL");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
