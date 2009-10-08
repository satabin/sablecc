/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.sablecc3.macro;

import java.util.*;

public class MCustomToken {

    private final String pName;

    private final MCustomToken mCustomToken = this;

    private final List<Object> ePackage = new LinkedList<Object>();

    public MCustomToken(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    public MPackage newPackage(
            String pPackage) {

        MPackage lPackage = new MPackage(pPackage);
        this.ePackage.add(lPackage);
        return lPackage;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mCustomToken.pName();
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
        sb.append("public class T");
        sb.append(rName());
        sb.append(System.getProperty("line.separator"));
        sb.append("    extends Token {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  public T");
        sb.append(rName());
        sb.append("(");
        sb.append(System.getProperty("line.separator"));
        sb.append("      String text,");
        sb.append(System.getProperty("line.separator"));
        sb.append("      int line,");
        sb.append(System.getProperty("line.separator"));
        sb.append("      int pos) {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("        setText(text);");
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
        sb.append("    return new T");
        sb.append(rName());
        sb.append("(getText(), getLine(), getPos());");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  public void apply(");
        sb.append(System.getProperty("line.separator"));
        sb.append("      Switch sw) {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    ((Analysis) sw).caseT");
        sb.append(rName());
        sb.append("(this);");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
