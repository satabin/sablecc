/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala;

public class MTostringNodes {

  private final String pElementName;
  private final MTostringNodes mTostringNodes = this;

  MTostringNodes(String pElementName) {
    if(pElementName == null) throw new NullPointerException();
    this.pElementName = pElementName;
  }

  String pElementName() {
    return this.pElementName;
  }

  private String rElementName() {
    return this.mTostringNodes.pElementName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("this.e");
    sb.append(rElementName());
    return sb.toString();
  }

}
