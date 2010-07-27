/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala.macro;

import java.util.*;

public class MParserException {

  private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();

  public MParserException() {
  }

  public MDefaultPackage newDefaultPackage(String pLanguageName) {
    MDefaultPackage lDefaultPackage = new MDefaultPackage(pLanguageName);
    this.eDefaultPackage_SpecifiedPackage.add(lDefaultPackage);
    return lDefaultPackage;
  }

  public MSpecifiedPackage newSpecifiedPackage(String pLanguageName, String pPackage) {
    MSpecifiedPackage lSpecifiedPackage = new MSpecifiedPackage(pLanguageName, pPackage);
    this.eDefaultPackage_SpecifiedPackage.add(lSpecifiedPackage);
    return lSpecifiedPackage;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MHeader().toString());
    if(this.eDefaultPackage_SpecifiedPackage.size() > 0) {
      sb.append(System.getProperty("line.separator"));
    }
    for(Object oDefaultPackage_SpecifiedPackage : this.eDefaultPackage_SpecifiedPackage) {
      sb.append(oDefaultPackage_SpecifiedPackage.toString());
    }
    sb.append(System.getProperty("line.separator"));
    sb.append("class ParserException(val token: Token)");
    sb.append(System.getProperty("line.separator"));
    sb.append("    extends Exception() {");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  override def getMessage = \"unexpected token '\" + token.text + \"' on line \" + token.line + \", pos \" + token.pos");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}