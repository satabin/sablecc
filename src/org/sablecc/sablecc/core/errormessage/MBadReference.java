/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.core.errormessage;

public class MBadReference {

  private final String pNameFound;
  private final String pNameProposition;
  private final String pLine;
  private final String pChar;
  private final MBadReference mBadReference = this;

  public MBadReference(String pNameFound, String pNameProposition, String pLine, String pChar) {
    if(pNameFound == null) throw new NullPointerException();
    this.pNameFound = pNameFound;
    if(pNameProposition == null) throw new NullPointerException();
    this.pNameProposition = pNameProposition;
    if(pLine == null) throw new NullPointerException();
    this.pLine = pLine;
    if(pChar == null) throw new NullPointerException();
    this.pChar = pChar;
  }

  String pNameFound() {
    return this.pNameFound;
  }

  String pNameProposition() {
    return this.pNameProposition;
  }

  String pLine() {
    return this.pLine;
  }

  String pChar() {
    return this.pChar;
  }

  private String rLine() {
    return this.mBadReference.pLine();
  }

  private String rChar() {
    return this.mBadReference.pChar();
  }

  private String rNameFound() {
    return this.mBadReference.pNameFound();
  }

  private String rNameProposition() {
    return this.mBadReference.pNameProposition();
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
    sb.append("An element of type \"");
    sb.append(rNameFound());
    sb.append("\" has been found.");
    sb.append(System.getProperty("line.separator"));
    sb.append("Expected ");
    sb.append(rNameProposition());
    sb.append(".");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
