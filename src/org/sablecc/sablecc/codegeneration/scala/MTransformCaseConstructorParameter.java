/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala;

public class MTransformCaseConstructorParameter {

  private final String pCaseName;
  private final MTransformCaseConstructorParameter mTransformCaseConstructorParameter = this;

  MTransformCaseConstructorParameter(String pCaseName) {
    if(pCaseName == null) throw new NullPointerException();
    this.pCaseName = pCaseName;
  }

  String pCaseName() {
    return this.pCaseName;
  }

  private String rCaseName() {
    return this.mTransformCaseConstructorParameter.pCaseName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("x");
    sb.append(rCaseName());
    return sb.toString();
  }

}
