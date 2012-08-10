/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.*;

public class MTextInsert {

  private final String pName;
  private final MTextInsert mTextInsert = this;
  private final MFile mFile;
  private final List<Object> eInlineText_ParamInsert_TextInsert_TextInsertAncestor = new LinkedList<Object>();

  MTextInsert(String pName, MFile mFile) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
    if(mFile == null) throw new NullPointerException();
    this.mFile = mFile;
  }

  public MInlineText newInlineText() {
    MInlineText lInlineText = new MInlineText();
    this.eInlineText_ParamInsert_TextInsert_TextInsertAncestor.add(lInlineText);
    return lInlineText;
  }

  public MParamInsert newParamInsert(String pName) {
    MParamInsert lParamInsert = new MParamInsert(pName, mFile);
    this.eInlineText_ParamInsert_TextInsert_TextInsertAncestor.add(lParamInsert);
    return lParamInsert;
  }

  public MTextInsert newTextInsert(String pName) {
    MTextInsert lTextInsert = new MTextInsert(pName, mFile);
    this.eInlineText_ParamInsert_TextInsert_TextInsertAncestor.add(lTextInsert);
    return lTextInsert;
  }

  public MTextInsertAncestor newTextInsertAncestor(String pName) {
    MTextInsertAncestor lTextInsertAncestor = new MTextInsertAncestor(pName, mFile);
    this.eInlineText_ParamInsert_TextInsert_TextInsertAncestor.add(lTextInsertAncestor);
    return lTextInsertAncestor;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mTextInsert.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  struct M");
    sb.append(rName());
    sb.append("* t");
    sb.append(rName());
    sb.append(" = M");
    sb.append(rName());
    sb.append("_init(");
    {
      boolean first = true;
      for(Object oInlineText_ParamInsert_TextInsert_TextInsertAncestor : this.eInlineText_ParamInsert_TextInsert_TextInsertAncestor) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oInlineText_ParamInsert_TextInsert_TextInsertAncestor.toString());
      }
    }
    sb.append(");");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
