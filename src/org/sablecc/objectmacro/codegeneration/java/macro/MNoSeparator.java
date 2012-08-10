/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MNoSeparator {

  private final MExpandInsertPart mExpandInsertPart;

  MNoSeparator(MExpandInsertPart mExpandInsertPart) {
    if(mExpandInsertPart == null) throw new NullPointerException();
    this.mExpandInsertPart = mExpandInsertPart;
  }

  private String rName() {
    return this.mExpandInsertPart.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("    for(Object o");
    sb.append(rName());
    sb.append(" : this.e");
    sb.append(rName());
    sb.append(") {");
    sb.append(System.getProperty("line.separator"));
    sb.append("      sb.append(o");
    sb.append(rName());
    sb.append(".toString());");
    sb.append(System.getProperty("line.separator"));
    sb.append("    }");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
