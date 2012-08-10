/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.core.errormessage;

public class MNotImplemented {

  private final String pLine;
  private final String pChar;
  private final MNotImplemented mNotImplemented = this;

  public MNotImplemented(String pLine, String pChar) {
    if(pLine == null) throw new NullPointerException();
    this.pLine = pLine;
    if(pChar == null) throw new NullPointerException();
    this.pChar = pChar;
  }

  String pLine() {
    return this.pLine;
  }

  String pChar() {
    return this.pChar;
  }

  private String rLine() {
    return this.mNotImplemented.pLine();
  }

  private String rChar() {
    return this.mNotImplemented.pChar();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("*** NOT IMPLEMENTED ***");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("Line: ");
    sb.append(rLine());
    sb.append(System.getProperty("line.separator"));
    sb.append("Char: ");
    sb.append(rChar());
    sb.append(System.getProperty("line.separator"));
    sb.append("This feature is not yet implemented.");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
