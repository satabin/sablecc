/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MSeparatedListElementDeclaration {

  private final String pLeftListType;
  private final String pRightListType;
  private final String pElementName;
  private final MSeparatedListElementDeclaration mSeparatedListElementDeclaration = this;

  MSeparatedListElementDeclaration(String pLeftListType, String pRightListType, String pElementName) {
    if(pLeftListType == null) throw new NullPointerException();
    this.pLeftListType = pLeftListType;
    if(pRightListType == null) throw new NullPointerException();
    this.pRightListType = pRightListType;
    if(pElementName == null) throw new NullPointerException();
    this.pElementName = pElementName;
  }

  String pLeftListType() {
    return this.pLeftListType;
  }

  String pRightListType() {
    return this.pRightListType;
  }

  String pElementName() {
    return this.pElementName;
  }

  private String rLeftListType() {
    return this.mSeparatedListElementDeclaration.pLeftListType();
  }

  private String rRightListType() {
    return this.mSeparatedListElementDeclaration.pRightListType();
  }

  private String rElementName() {
    return this.mSeparatedListElementDeclaration.pElementName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  private final SeparatedNodeList<N");
    sb.append(rLeftListType());
    sb.append(",N");
    sb.append(rRightListType());
    sb.append("> e");
    sb.append(rElementName());
    sb.append(";");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
