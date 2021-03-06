/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.core.errormessage;

public class MImpossibleNaturalReference {

  private final String pRefName;
  private final String pRefLine;
  private final String pRefChar;
  private final String pTransfLine;
  private final String pTransfChar;
  private final MImpossibleNaturalReference mImpossibleNaturalReference = this;

  public MImpossibleNaturalReference(String pRefName, String pRefLine, String pRefChar, String pTransfLine, String pTransfChar) {
    if(pRefName == null) throw new NullPointerException();
    this.pRefName = pRefName;
    if(pRefLine == null) throw new NullPointerException();
    this.pRefLine = pRefLine;
    if(pRefChar == null) throw new NullPointerException();
    this.pRefChar = pRefChar;
    if(pTransfLine == null) throw new NullPointerException();
    this.pTransfLine = pTransfLine;
    if(pTransfChar == null) throw new NullPointerException();
    this.pTransfChar = pTransfChar;
  }

  String pRefName() {
    return this.pRefName;
  }

  String pRefLine() {
    return this.pRefLine;
  }

  String pRefChar() {
    return this.pRefChar;
  }

  String pTransfLine() {
    return this.pTransfLine;
  }

  String pTransfChar() {
    return this.pTransfChar;
  }

  private String rRefLine() {
    return this.mImpossibleNaturalReference.pRefLine();
  }

  private String rRefChar() {
    return this.mImpossibleNaturalReference.pRefChar();
  }

  private String rRefName() {
    return this.mImpossibleNaturalReference.pRefName();
  }

  private String rTransfLine() {
    return this.mImpossibleNaturalReference.pTransfLine();
  }

  private String rTransfChar() {
    return this.mImpossibleNaturalReference.pTransfChar();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MSemanticErrorHead().toString());
    sb.append(System.getProperty("line.separator"));
    sb.append("Line: ");
    sb.append(rRefLine());
    sb.append(System.getProperty("line.separator"));
    sb.append("Char: ");
    sb.append(rRefChar());
    sb.append(System.getProperty("line.separator"));
    sb.append("Element \"");
    sb.append(rRefName());
    sb.append("\" defined at line ");
    sb.append(rRefLine());
    sb.append(", char ");
    sb.append(rRefChar());
    sb.append(" refers to a transformed production at line \"");
    sb.append(rTransfLine());
    sb.append("\", char \"");
    sb.append(rTransfChar());
    sb.append("\".");
    sb.append(System.getProperty("line.separator"));
    sb.append("The transformed reference syntax must be used : [production].[element].");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
