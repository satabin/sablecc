/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MInlineText {

  private final List<Object> eInlineString_InlineEol = new LinkedList<Object>();

  public MInlineText() {
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    {
      boolean first = true;
      for(Object oInlineString_InlineEol : this.eInlineString_InlineEol) {
        if(first) {
          first = false;
        }
        else {
          sb.append(" + ");
        }
        sb.append(oInlineString_InlineEol.toString());
      }
    }
    return sb.toString();
  }

}
