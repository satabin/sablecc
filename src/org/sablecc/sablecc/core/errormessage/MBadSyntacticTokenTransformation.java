/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.core.errormessage;

public class MBadSyntacticTokenTransformation {

  private final String pProdName;
  private final String pLine;
  private final String pChar;
  private final MBadSyntacticTokenTransformation mBadSyntacticTokenTransformation = this;

  public MBadSyntacticTokenTransformation(String pProdName, String pLine, String pChar) {
    if(pProdName == null) throw new NullPointerException();
    this.pProdName = pProdName;
    if(pLine == null) throw new NullPointerException();
    this.pLine = pLine;
    if(pChar == null) throw new NullPointerException();
    this.pChar = pChar;
  }

  String pProdName() {
    return this.pProdName;
  }

  String pLine() {
    return this.pLine;
  }

  String pChar() {
    return this.pChar;
  }

  private String rLine() {
    return this.mBadSyntacticTokenTransformation.pLine();
  }

  private String rChar() {
    return this.mBadSyntacticTokenTransformation.pChar();
  }

  private String rProdName() {
    return this.mBadSyntacticTokenTransformation.pProdName();
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
    sb.append("Syntactic token \"");
    sb.append(rProdName());
    sb.append("\" must have a simple transformation p -> q or p -> p.");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
