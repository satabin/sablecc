/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.intermediate.macro;

public class MStringOption {

    private final String pOption;

    private final String pString;

    private final MStringOption mStringOption = this;

    public MStringOption(
            String pOption,
            String pString) {

        if (pOption == null) {
            throw new NullPointerException();
        }
        this.pOption = pOption;
        if (pString == null) {
            throw new NullPointerException();
        }
        this.pString = pString;
    }

    String pOption() {

        return this.pOption;
    }

    String pString() {

        return this.pString;
    }

    private String rOption() {

        return this.mStringOption.pOption();
    }

    private String rString() {

        return this.mStringOption.pString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("    ");
        sb.append(rOption());
        sb.append(" = ");
        sb.append(rString());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
