/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.launcher.errormessage;

public class MInvalidArgumentCount {

  public MInvalidArgumentCount() {
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MCommandLineErrorHead().toString());
    sb.append(System.getProperty("line.separator"));
    sb.append("Many arguments were provided.");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("A single grammar file must be provided as argument.");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append(new MCommandLineErrorTail().toString());
    return sb.toString();
  }

}
