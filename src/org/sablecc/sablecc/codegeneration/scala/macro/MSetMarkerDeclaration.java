/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala.macro;

public class MSetMarkerDeclaration {

  private final String pName;
  private final MSetMarkerDeclaration mSetMarkerDeclaration = this;
  private final MLexer mLexer;

  MSetMarkerDeclaration(String pName, MLexer mLexer) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
    if(mLexer == null) throw new NullPointerException();
    this.mLexer = mLexer;
  }

  String pName() {
    return this.pName;
  }

  private String rPkg() {
    return this.mLexer.pPkg();
  }

  private String rName() {
    return this.mSetMarkerDeclaration.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  protected[");
    sb.append(rPkg());
    sb.append("] def setMarker");
    sb.append(rName());
    sb.append(" {");
    sb.append(System.getProperty("line.separator"));
    sb.append("    this.marker");
    sb.append(rName());
    sb.append(" = this.current_sb_length");
    sb.append(System.getProperty("line.separator"));
    sb.append("  }");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
