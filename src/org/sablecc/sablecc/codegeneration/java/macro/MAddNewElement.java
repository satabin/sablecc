/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MAddNewElement {

  private final String pListName;
  private final String pElementName;
  private final MAddNewElement mAddNewElement = this;

  MAddNewElement(String pListName, String pElementName) {
    if(pListName == null) throw new NullPointerException();
    this.pListName = pListName;
    if(pElementName == null) throw new NullPointerException();
    this.pElementName = pElementName;
  }

  String pListName() {
    return this.pListName;
  }

  String pElementName() {
    return this.pElementName;
  }

  private String rListName() {
    return this.mAddNewElement.pListName();
  }

  private String rElementName() {
    return this.mAddNewElement.pElementName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("      n");
    sb.append(rListName());
    sb.append(".add(");
    sb.append(rElementName());
    sb.append(");");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
