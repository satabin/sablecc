/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MOpenInterval {

  private final String pName;
  private final MOpenInterval mOpenInterval = this;

  MOpenInterval(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mOpenInterval.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("      return Symbol_");
    sb.append(rName());
    sb.append(";");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
