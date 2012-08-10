/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.core.errormessage;

public class MTransformationElementReordered {

  private final String pTransfName;
  private final String pAltName;
  private final String pProdName;
  private final String pLine;
  private final String pChar;
  private final MTransformationElementReordered mTransformationElementReordered = this;

  public MTransformationElementReordered(String pTransfName, String pAltName, String pProdName, String pLine, String pChar) {
    if(pTransfName == null) throw new NullPointerException();
    this.pTransfName = pTransfName;
    if(pAltName == null) throw new NullPointerException();
    this.pAltName = pAltName;
    if(pProdName == null) throw new NullPointerException();
    this.pProdName = pProdName;
    if(pLine == null) throw new NullPointerException();
    this.pLine = pLine;
    if(pChar == null) throw new NullPointerException();
    this.pChar = pChar;
  }

  String pTransfName() {
    return this.pTransfName;
  }

  String pAltName() {
    return this.pAltName;
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
    return this.mTransformationElementReordered.pLine();
  }

  private String rChar() {
    return this.mTransformationElementReordered.pChar();
  }

  private String rTransfName() {
    return this.mTransformationElementReordered.pTransfName();
  }

  private String rAltName() {
    return this.mTransformationElementReordered.pAltName();
  }

  private String rProdName() {
    return this.mTransformationElementReordered.pProdName();
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
    sb.append("Element of production transformation \"");
    sb.append(rTransfName());
    sb.append("\" have been reordered in the transformation of alternative \"");
    sb.append(rAltName());
    sb.append("\" of production \"");
    sb.append(rProdName());
    sb.append("\" at line ");
    sb.append(rLine());
    sb.append(", char ");
    sb.append(rChar());
    sb.append(".");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
