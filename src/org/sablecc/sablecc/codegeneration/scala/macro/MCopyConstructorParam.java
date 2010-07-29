/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala.macro;

import java.util.*;

public class MCopyConstructorParam {

  private final String pElementName;
  private final MCopyConstructorParam mCopyConstructorParam = this;
  private final List<Object> eThisTarget = new LinkedList<Object>();

  MCopyConstructorParam(String pElementName) {
    if(pElementName == null) throw new NullPointerException();
    this.pElementName = pElementName;
  }

  public MThisTarget newThisTarget() {
    MThisTarget lThisTarget = new MThisTarget();
    this.eThisTarget.add(lThisTarget);
    return lThisTarget;
  }

  String pElementName() {
    return this.pElementName;
  }

  private String rElementName() {
    return this.mCopyConstructorParam.pElementName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for(Object oThisTarget : this.eThisTarget) {
      sb.append(oThisTarget.toString());
    }
    sb.append(" e");
    sb.append(rElementName());
    return sb.toString();
  }

}
