/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessages;

public class MEndMismatch {

    private final String pName;

    private final String pLine;

    private final String pChar;

    private final String pRefName;

    private final String pRefLine;

    private final String pRefChar;

    private final MEndMismatch mEndMismatch = this;

    public MEndMismatch(
            String pName,
            String pLine,
            String pChar,
            String pRefName,
            String pRefLine,
            String pRefChar) {

        this.pName = pName;
        this.pLine = pLine;
        this.pChar = pChar;
        this.pRefName = pRefName;
        this.pRefLine = pRefLine;
        this.pRefChar = pRefChar;
    }

    String pName() {

        return this.pName;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    String pRefName() {

        return this.pRefName;
    }

    String pRefLine() {

        return this.pRefLine;
    }

    String pRefChar() {

        return this.pRefChar;
    }

    private String rLine() {

        return this.mEndMismatch.pLine();
    }

    private String rChar() {

        return this.mEndMismatch.pChar();
    }

    private String rName() {

        return this.mEndMismatch.pName();
    }

    private String rRefName() {

        return this.mEndMismatch.pRefName();
    }

    private String rRefLine() {

        return this.mEndMismatch.pRefLine();
    }

    private String rRefChar() {

        return this.mEndMismatch.pRefChar();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MSemanticErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("Line: ");
        sb.append(rLine());
        sb.append(System.getProperty("line.separator"));
        sb.append("Char: ");
        sb.append(rChar());
        sb.append(System.getProperty("line.separator"));
        sb.append("End \"");
        sb.append(rName());
        sb.append("\" does not match \"");
        sb.append(rRefName());
        sb.append("\" of line ");
        sb.append(rRefLine());
        sb.append(", char ");
        sb.append(rRefChar());
        sb.append(".");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
