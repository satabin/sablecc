/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.scala.macro;

public class MAncestorArg {

  private final String pName;
  private final MAncestorArg mAncestorArg = this;

  public MAncestorArg(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mAncestorArg.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("m");
    sb.append(rName());
    return sb.toString();
  }

}
