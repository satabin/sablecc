/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.core.errormessage;

public class MDuplicateAlternativeName {

  private final String pName;
  private final String pProdName;
  private final String pLine;
  private final String pChar;
  private final String pRefLine;
  private final String pRefChar;
  private final MDuplicateAlternativeName mDuplicateAlternativeName = this;

  public MDuplicateAlternativeName(String pName, String pProdName, String pLine, String pChar, String pRefLine, String pRefChar) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
    if(pProdName == null) throw new NullPointerException();
    this.pProdName = pProdName;
    if(pLine == null) throw new NullPointerException();
    this.pLine = pLine;
    if(pChar == null) throw new NullPointerException();
    this.pChar = pChar;
    if(pRefLine == null) throw new NullPointerException();
    this.pRefLine = pRefLine;
    if(pRefChar == null) throw new NullPointerException();
    this.pRefChar = pRefChar;
  }

  String pName() {
    return this.pName;
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

  String pRefLine() {
    return this.pRefLine;
  }

  String pRefChar() {
    return this.pRefChar;
  }

  private String rLine() {
    return this.mDuplicateAlternativeName.pLine();
  }

  private String rChar() {
    return this.mDuplicateAlternativeName.pChar();
  }

  private String rName() {
    return this.mDuplicateAlternativeName.pName();
  }

  private String rProdName() {
    return this.mDuplicateAlternativeName.pProdName();
  }

  private String rRefLine() {
    return this.mDuplicateAlternativeName.pRefLine();
  }

  private String rRefChar() {
    return this.mDuplicateAlternativeName.pRefChar();
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
    sb.append("The \"");
    sb.append(rName());
    sb.append("\" alternative reuses an existing name in production \"");
    sb.append(rProdName());
    sb.append("\".");
    sb.append(System.getProperty("line.separator"));
    sb.append("A \"");
    sb.append(rName());
    sb.append("\" alternative is already declared at line ");
    sb.append(rRefLine());
    sb.append(", char ");
    sb.append(rRefChar());
    sb.append(".");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
