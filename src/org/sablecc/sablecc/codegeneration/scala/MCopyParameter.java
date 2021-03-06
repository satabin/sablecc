/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala;

public class MCopyParameter {

  private final String pElementName;
  private final String pElementType;
  private final MCopyParameter mCopyParameter = this;

  MCopyParameter(String pElementName, String pElementType) {
    if(pElementName == null) throw new NullPointerException();
    this.pElementName = pElementName;
    if(pElementType == null) throw new NullPointerException();
    this.pElementType = pElementType;
  }

  String pElementName() {
    return this.pElementName;
  }

  String pElementType() {
    return this.pElementType;
  }

  private String rElementName() {
    return this.mCopyParameter.pElementName();
  }

  private String rElementType() {
    return this.mCopyParameter.pElementType();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("e");
    sb.append(rElementName());
    sb.append(": N");
    sb.append(rElementType());
    sb.append(" = this.e");
    sb.append(rElementName());
    return sb.toString();
  }

}
