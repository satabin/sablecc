/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.*;

public class MMacroCreator {

  private final String pName;
  private final MMacroCreator mMacroCreator = this;
  private final MFile mFile;
  private final List<Object> eParamParam = new LinkedList<Object>();
  private final List<Object> eParamArg_AncestorArg = new LinkedList<Object>();
  private final List<Object> eAddToExpand = new LinkedList<Object>();

  MMacroCreator(String pName, MFile mFile) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
    if(mFile == null) throw new NullPointerException();
    this.mFile = mFile;
  }

  public MAddToExpand newAddToExpand(String pSignature) {
    MAddToExpand lAddToExpand = new MAddToExpand(pSignature, mFile, mMacroCreator);
    this.eAddToExpand.add(lAddToExpand);
    return lAddToExpand;
  }

  public MParamParam newParamParam(String pName) {
    MParamParam lParamParam = new MParamParam(pName);
    this.eParamParam.add(lParamParam);
    return lParamParam;
  }

  public MParamArg newParamArg(String pName) {
    MParamArg lParamArg = new MParamArg(pName);
    this.eParamArg_AncestorArg.add(lParamArg);
    return lParamArg;
  }

  public MAncestorArg newAncestorArg(String pName) {
    MAncestorArg lAncestorArg = new MAncestorArg(pName, mFile);
    this.eParamArg_AncestorArg.add(lAncestorArg);
    return lAncestorArg;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mMacroCreator.pName();
  }

  private String rFileName() {
    return this.mFile.pFileName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("M");
    sb.append(rName());
    sb.append("* M");
    sb.append(rFileName());
    sb.append("_new");
    sb.append(rName());
    sb.append("(M");
    sb.append(rFileName());
    sb.append("* m");
    sb.append(rFileName());
    if(this.eParamParam.size() > 0) {
      sb.append(", ");
    }
    {
      boolean first = true;
      for(Object oParamParam : this.eParamParam) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oParamParam.toString());
      }
    }
    sb.append(") {");
    sb.append(System.getProperty("line.separator"));
    sb.append("  M");
    sb.append(rName());
    sb.append("* l");
    sb.append(rName());
    sb.append(" = M");
    sb.append(rName());
    sb.append("_init(");
    {
      boolean first = true;
      for(Object oParamArg_AncestorArg : this.eParamArg_AncestorArg) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oParamArg_AncestorArg.toString());
      }
    }
    sb.append(");");
    sb.append(System.getProperty("line.separator"));
    for(Object oAddToExpand : this.eAddToExpand) {
      sb.append(oAddToExpand.toString());
    }
    sb.append("  return l");
    sb.append(rName());
    sb.append(";");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
