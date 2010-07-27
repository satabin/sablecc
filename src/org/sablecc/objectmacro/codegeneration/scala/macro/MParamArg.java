/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.scala.macro;

public class MParamArg {

  private final String pName;
  private final MParamArg mParamArg = this;

  public MParamArg(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mParamArg.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("p");
    sb.append(rName());
    return sb.toString();
  }

}
