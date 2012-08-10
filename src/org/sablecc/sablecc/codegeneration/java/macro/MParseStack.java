/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

import java.util.*;

public class MParseStack {

  private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();

  public MParseStack() {
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
    sb.append("class ParseStack {");
    sb.append(System.getProperty("line.separator"));
    sb.append("  private ParseStackEntry stack = new ParseStackEntry(null, null, L_0.instance);");
    sb.append(System.getProperty("line.separator"));
    sb.append("  private ParseStackEntry freeList;");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  void push(AbstractForest forest, LRState state) {");
    sb.append(System.getProperty("line.separator"));
    sb.append("    ParseStackEntry entry;");
    sb.append(System.getProperty("line.separator"));
    sb.append("    if(freeList != null) {");
    sb.append(System.getProperty("line.separator"));
    sb.append("      entry = freeList;");
    sb.append(System.getProperty("line.separator"));
    sb.append("      freeList = freeList.previous;");
    sb.append(System.getProperty("line.separator"));
    sb.append("      entry.set(stack,forest, state);");
    sb.append(System.getProperty("line.separator"));
    sb.append("    }");
    sb.append(System.getProperty("line.separator"));
    sb.append("    else {");
    sb.append(System.getProperty("line.separator"));
    sb.append("      entry = new ParseStackEntry(stack, forest, state);");
    sb.append(System.getProperty("line.separator"));
    sb.append("    }");
    sb.append(System.getProperty("line.separator"));
    sb.append("    stack = entry;");
    sb.append(System.getProperty("line.separator"));
    sb.append("  }");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  LRState getState() {");
    sb.append(System.getProperty("line.separator"));
    sb.append("    return stack.state;");
    sb.append(System.getProperty("line.separator"));
    sb.append("  }");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  AbstractForest pop() {");
    sb.append(System.getProperty("line.separator"));
    sb.append("    AbstractForest forest = stack.forest;");
    sb.append(System.getProperty("line.separator"));
    sb.append("    ParseStackEntry entry = stack;");
    sb.append(System.getProperty("line.separator"));
    sb.append("    stack = stack.previous;");
    sb.append(System.getProperty("line.separator"));
    sb.append("    entry.set(freeList, null, null);");
    sb.append(System.getProperty("line.separator"));
    sb.append("    freeList = entry;");
    sb.append(System.getProperty("line.separator"));
    sb.append("    return forest;");
    sb.append(System.getProperty("line.separator"));
    sb.append("  }");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  private static class ParseStackEntry {");
    sb.append(System.getProperty("line.separator"));
    sb.append("    ParseStackEntry previous;");
    sb.append(System.getProperty("line.separator"));
    sb.append("    AbstractForest forest;");
    sb.append(System.getProperty("line.separator"));
    sb.append("    LRState state;");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("    ParseStackEntry(");
    sb.append(System.getProperty("line.separator"));
    sb.append("        ParseStackEntry previous,");
    sb.append(System.getProperty("line.separator"));
    sb.append("        AbstractForest forest,");
    sb.append(System.getProperty("line.separator"));
    sb.append("        LRState state) {");
    sb.append(System.getProperty("line.separator"));
    sb.append("     this.previous = previous;");
    sb.append(System.getProperty("line.separator"));
    sb.append("     this.forest = forest;");
    sb.append(System.getProperty("line.separator"));
    sb.append("     this.state = state;");
    sb.append(System.getProperty("line.separator"));
    sb.append("    }");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("    void set(");
    sb.append(System.getProperty("line.separator"));
    sb.append("        ParseStackEntry previous,");
    sb.append(System.getProperty("line.separator"));
    sb.append("        AbstractForest forest,");
    sb.append(System.getProperty("line.separator"));
    sb.append("        LRState state) {");
    sb.append(System.getProperty("line.separator"));
    sb.append("     this.previous = previous;");
    sb.append(System.getProperty("line.separator"));
    sb.append("     this.forest = forest;");
    sb.append(System.getProperty("line.separator"));
    sb.append("     this.state = state;");
    sb.append(System.getProperty("line.separator"));
    sb.append("   }");
    sb.append(System.getProperty("line.separator"));
    sb.append("  }");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
