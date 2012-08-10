/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala;

import java.util.*;

public class MState {

  private final String pPkg;
  private final MState mState = this;
  private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();

  public MState(String pPkg) {
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
    return this.mState.pPkg();
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
    sb.append("abstract class State {");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  import State._");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  protected[");
    sb.append(rPkg());
    sb.append("] def stateType: StateType");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    sb.append("object State {");
    sb.append(System.getProperty("line.separator"));
    sb.append("  sealed trait StateType");
    sb.append(System.getProperty("line.separator"));
    sb.append("  case object TRANSITION extends StateType");
    sb.append(System.getProperty("line.separator"));
    sb.append("  case object FINAL extends StateType");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
