/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.sablecc3.macro;

import java.util.*;

public class MEof {

    private final List<Object> ePackage = new LinkedList<Object>();

    public MEof() {

    }

    public MPackage newPackage(
            String pPackage) {

        MPackage lPackage = new MPackage(pPackage);
        this.ePackage.add(lPackage);
        return lPackage;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("package ");
        for (Object oPackage : this.ePackage) {
            sb.append(oPackage.toString());
        }
        sb.append("node;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("import ");
        for (Object oPackage : this.ePackage) {
            sb.append(oPackage.toString());
        }
        sb.append("analysis.Analysis;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("public class EOF");
        sb.append(System.getProperty("line.separator"));
        sb.append("    extends Token {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  public EOF(int line, int pos) {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        setText(\"\");");
        sb.append(System.getProperty("line.separator"));
        sb.append("        setLine(line);");
        sb.append(System.getProperty("line.separator"));
        sb.append("        setPos(pos);");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  public Object clone() {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    return new EOF(getLine(), getPos());");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  public void apply(");
        sb.append(System.getProperty("line.separator"));
        sb.append("      Switch sw) {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    ((Analysis) sw).caseEOF(this);");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
