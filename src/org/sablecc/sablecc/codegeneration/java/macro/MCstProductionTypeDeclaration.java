/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MCstProductionTypeDeclaration {

  private final String pName;
  private final MCstProductionTypeDeclaration mCstProductionTypeDeclaration = this;

  MCstProductionTypeDeclaration(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mCstProductionTypeDeclaration.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  ");
    sb.append(rName());
    sb.append(",");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
