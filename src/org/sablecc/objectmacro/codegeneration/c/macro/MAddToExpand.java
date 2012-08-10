/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MAddToExpand {

  private final String pSignature;
  private final MAddToExpand mAddToExpand = this;
  private final MFile mFile;
  private final MMacroCreator mMacroCreator;

  MAddToExpand(String pSignature, MFile mFile, MMacroCreator mMacroCreator) {
    if(pSignature == null) throw new NullPointerException();
    this.pSignature = pSignature;
    if(mFile == null) throw new NullPointerException();
    this.mFile = mFile;
    if(mMacroCreator == null) throw new NullPointerException();
    this.mMacroCreator = mMacroCreator;
  }

  String pSignature() {
    return this.pSignature;
  }

  private String rFileName() {
    return this.mFile.pFileName();
  }

  private String rSignature() {
    return this.mAddToExpand.pSignature();
  }

  private String rName() {
    return this.mMacroCreator.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  List_pushback_MType(m");
    sb.append(rFileName());
    sb.append("->_e");
    sb.append(rSignature());
    sb.append("_, l");
    sb.append(rName());
    sb.append(", 1);");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
