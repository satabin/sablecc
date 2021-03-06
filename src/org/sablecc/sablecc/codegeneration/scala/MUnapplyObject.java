/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala;

import java.util.*;

public class MUnapplyObject {

  private final MAlternative mAlternative;
  private final List<Object> eExtractorType = new LinkedList<Object>();
  private final List<Object> eExtractorParameter = new LinkedList<Object>();

  MUnapplyObject(MAlternative mAlternative) {
    if(mAlternative == null) throw new NullPointerException();
    this.mAlternative = mAlternative;
  }

  public MExtractorType newExtractorType(String pElementType) {
    MExtractorType lExtractorType = new MExtractorType(pElementType);
    this.eExtractorType.add(lExtractorType);
    return lExtractorType;
  }

  public MExtractorParameter newExtractorParameter(String pElementName) {
    MExtractorParameter lExtractorParameter = new MExtractorParameter(pElementName);
    this.eExtractorParameter.add(lExtractorParameter);
    return lExtractorParameter;
  }

  private String rName() {
    return this.mAlternative.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("object N");
    sb.append(rName());
    sb.append(" {");
    sb.append(System.getProperty("line.separator"));
    sb.append("  def unapply(node: N");
    sb.append(rName());
    sb.append("): Option[(");
    {
      boolean first = true;
      for(Object oExtractorType : this.eExtractorType) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oExtractorType.toString());
      }
    }
    sb.append(")] =");
    sb.append(System.getProperty("line.separator"));
    sb.append("    Some((");
    {
      boolean first = true;
      for(Object oExtractorParameter : this.eExtractorParameter) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oExtractorParameter.toString());
      }
    }
    sb.append("))");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
