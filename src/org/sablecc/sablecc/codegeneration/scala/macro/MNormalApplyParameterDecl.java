/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala.macro;

public class MNormalApplyParameterDecl {

  private final String pElementType;
  private final String pElementName;
  private final MNormalApplyParameterDecl mNormalApplyParameterDecl = this;

  MNormalApplyParameterDecl(String pElementType, String pElementName) {
    if(pElementType == null) throw new NullPointerException();
    this.pElementType = pElementType;
    if(pElementName == null) throw new NullPointerException();
    this.pElementName = pElementName;
  }

  String pElementType() {
    return this.pElementType;
  }

  String pElementName() {
    return this.pElementName;
  }

  private String rElementName() {
    return this.mNormalApplyParameterDecl.pElementName();
  }

  private String rElementType() {
    return this.mNormalApplyParameterDecl.pElementType();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("e");
    sb.append(rElementName());
    sb.append(": ");
    sb.append(rElementType());
    return sb.toString();
  }

}
