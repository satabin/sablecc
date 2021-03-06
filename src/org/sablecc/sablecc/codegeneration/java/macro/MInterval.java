/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MInterval {

  private final String pLowerBound;
  private final String pUpperBound;
  private final String pName;
  private final MInterval mInterval = this;

  MInterval(String pLowerBound, String pUpperBound, String pName) {
    if(pLowerBound == null) throw new NullPointerException();
    this.pLowerBound = pLowerBound;
    if(pUpperBound == null) throw new NullPointerException();
    this.pUpperBound = pUpperBound;
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pLowerBound() {
    return this.pLowerBound;
  }

  String pUpperBound() {
    return this.pUpperBound;
  }

  String pName() {
    return this.pName;
  }

  private String rLowerBound() {
    return this.mInterval.pLowerBound();
  }

  private String rUpperBound() {
    return this.mInterval.pUpperBound();
  }

  private String rName() {
    return this.mInterval.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("      if(c >= ");
    sb.append(rLowerBound());
    sb.append(" && c <= ");
    sb.append(rUpperBound());
    sb.append(") {");
    sb.append(System.getProperty("line.separator"));
    sb.append("        return Symbol_");
    sb.append(rName());
    sb.append(";");
    sb.append(System.getProperty("line.separator"));
    sb.append("      }");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
