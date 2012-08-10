/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MParam {

  private final String pName;
  private final MParam mParam = this;

  public MParam(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mParam.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  String p");
    sb.append(rName());
    sb.append("() {");
    sb.append(System.getProperty("line.separator"));
    sb.append("    return this.p");
    sb.append(rName());
    sb.append(";");
    sb.append(System.getProperty("line.separator"));
    sb.append("  }");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
