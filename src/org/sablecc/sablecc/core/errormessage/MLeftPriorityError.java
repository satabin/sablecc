/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.core.errormessage;

public class MLeftPriorityError {

    private final String pAltName;

    private final String pAltLine;

    private final String pAltChar;

    private final String pText;

    private final String pLine;

    private final String pChar;

    private final MLeftPriorityError mLeftPriorityError = this;

    public MLeftPriorityError(
            String pAltName,
            String pAltLine,
            String pAltChar,
            String pText,
            String pLine,
            String pChar) {

        if (pAltName == null) {
            throw new NullPointerException();
        }
        this.pAltName = pAltName;
        if (pAltLine == null) {
            throw new NullPointerException();
        }
        this.pAltLine = pAltLine;
        if (pAltChar == null) {
            throw new NullPointerException();
        }
        this.pAltChar = pAltChar;
        if (pText == null) {
            throw new NullPointerException();
        }
        this.pText = pText;
        if (pLine == null) {
            throw new NullPointerException();
        }
        this.pLine = pLine;
        if (pChar == null) {
            throw new NullPointerException();
        }
        this.pChar = pChar;
    }

    String pAltName() {

        return this.pAltName;
    }

    String pAltLine() {

        return this.pAltLine;
    }

    String pAltChar() {

        return this.pAltChar;
    }

    String pText() {

        return this.pText;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    private String rLine() {

        return this.mLeftPriorityError.pLine();
    }

    private String rChar() {

        return this.mLeftPriorityError.pChar();
    }

    private String rAltName() {

        return this.mLeftPriorityError.pAltName();
    }

    private String rAltLine() {

        return this.mLeftPriorityError.pAltLine();
    }

    private String rAltChar() {

        return this.mLeftPriorityError.pAltChar();
    }

    private String rText() {

        return this.mLeftPriorityError.pText();
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
        sb.append(System.getProperty("line.separator"));
        sb.append("The alternative \"");
        sb.append(rAltName());
        sb.append("\" defined at line ");
        sb.append(rAltLine());
        sb.append(", char ");
        sb.append(rAltChar());
        sb.append(" can't be used within a Left Priority.");
        sb.append(System.getProperty("line.separator"));
        sb.append(rText());
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
