/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.errormessage;

public class MMissingTargetOptionOperand {

  private final String pOptionName;
  private final String pOperandName;
  private final MMissingTargetOptionOperand mMissingTargetOptionOperand = this;

  public MMissingTargetOptionOperand(String pOptionName, String pOperandName) {
    if(pOptionName == null) throw new NullPointerException();
    this.pOptionName = pOptionName;
    if(pOperandName == null) throw new NullPointerException();
    this.pOperandName = pOperandName;
  }

  String pOptionName() {
    return this.pOptionName;
  }

  String pOperandName() {
    return this.pOperandName;
  }

  private String rOptionName() {
    return this.mMissingTargetOptionOperand.pOptionName();
  }

  private String rOperandName() {
    return this.mMissingTargetOptionOperand.pOperandName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MCommandLineErrorHead().toString());
    sb.append(System.getProperty("line.separator"));
    sb.append("The following option is rejected:");
    sb.append(System.getProperty("line.separator"));
    sb.append(" ---");
    sb.append(rOptionName());
    sb.append(System.getProperty("line.separator"));
    sb.append("This option expects an operand:");
    sb.append(System.getProperty("line.separator"));
    sb.append(" ---");
    sb.append(rOptionName());
    sb.append("=");
    sb.append(rOperandName());
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append(new MCommandLineErrorTail().toString());
    return sb.toString();
  }

}
