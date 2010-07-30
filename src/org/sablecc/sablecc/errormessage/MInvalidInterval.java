/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.errormessage;

public class MInvalidInterval {

  private final String pLine;
  private final String pChar;
  private final String pFrom;
  private final String pTo;
  private final MInvalidInterval mInvalidInterval = this;

  public MInvalidInterval(String pLine, String pChar, String pFrom, String pTo) {
    if(pLine == null) throw new NullPointerException();
    this.pLine = pLine;
    if(pChar == null) throw new NullPointerException();
    this.pChar = pChar;
    if(pFrom == null) throw new NullPointerException();
    this.pFrom = pFrom;
    if(pTo == null) throw new NullPointerException();
    this.pTo = pTo;
  }

  String pLine() {
    return this.pLine;
  }

  String pChar() {
    return this.pChar;
  }

  String pFrom() {
    return this.pFrom;
  }

  String pTo() {
    return this.pTo;
  }

  private String rLine() {
    return this.mInvalidInterval.pLine();
  }

  private String rChar() {
    return this.mInvalidInterval.pChar();
  }

  private String rFrom() {
    return this.mInvalidInterval.pFrom();
  }

  private String rTo() {
    return this.mInvalidInterval.pTo();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MSemanticErrorHead().toString());
    sb.append(System.getProperty("line.separator"));
    sb.append("Line: ");
    sb.append(rLine());
    sb.append(System.getProperty("line.separator"));
    sb.append("Char: ");
    sb.append(rChar());
    sb.append(System.getProperty("line.separator"));
    sb.append("The interval is invalid as ");
    sb.append(rFrom());
    sb.append(" is bigger than ");
    sb.append(rTo());
    sb.append(".");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
