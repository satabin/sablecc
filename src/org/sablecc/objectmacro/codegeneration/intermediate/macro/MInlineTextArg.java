/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.intermediate.macro;

import java.util.*;

public class MInlineTextArg {

  private final String pIndent;
  private final MInlineTextArg mInlineTextArg = this;
  private final List<Object> eInlineString_InlineEol = new LinkedList<Object>();

  public MInlineTextArg(String pIndent) {
    if(pIndent == null) throw new NullPointerException();
    this.pIndent = pIndent;
  }

  public MInlineString newInlineString(String pString) {
    MInlineString lInlineString = new MInlineString(pString);
    this.eInlineString_InlineEol.add(lInlineString);
    return lInlineString;
  }

  public MInlineEol newInlineEol() {
    MInlineEol lInlineEol = new MInlineEol();
    this.eInlineString_InlineEol.add(lInlineEol);
    return lInlineEol;
  }

  String pIndent() {
    return this.pIndent;
  }

  private String rIndent() {
    return this.mInlineTextArg.pIndent();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(rIndent());
    sb.append("    arg = ");
    {
      boolean first = true;
      for(Object oInlineString_InlineEol : this.eInlineString_InlineEol) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oInlineString_InlineEol.toString());
      }
    }
    sb.append(";");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
