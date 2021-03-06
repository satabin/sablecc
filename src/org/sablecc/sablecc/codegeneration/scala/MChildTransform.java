/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala;

public class MChildTransform {

  private final String pElementName;
  private final String pElementType;
  private final MChildTransform mChildTransform = this;

  MChildTransform(String pElementName, String pElementType) {
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
    return this.mChildTransform.pElementName();
  }

  private String rElementType() {
    return this.mChildTransform.pElementType();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("e");
    sb.append(rElementName());
    sb.append(" = transform(x");
    sb.append(rElementName());
    sb.append(").asInstanceOf[");
    sb.append(rElementType());
    sb.append("]");
    return sb.toString();
  }

}
