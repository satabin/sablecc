/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MAddLToForest {

  private final String pElementName;
  private final MAddLToForest mAddLToForest = this;

  MAddLToForest(String pElementName) {
    if(pElementName == null) throw new NullPointerException();
    this.pElementName = pElementName;
  }

  String pElementName() {
    return this.pElementName;
  }

  private String rElementName() {
    return this.mAddLToForest.pElementName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("      trees.add(l");
    sb.append(rElementName());
    sb.append(");");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
