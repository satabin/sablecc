/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.sablecc3.macro;

public class MSymbolDeclaration {

    private final String pName;

    private final MSymbolDeclaration mSymbolDeclaration = this;

    MSymbolDeclaration(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mSymbolDeclaration.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  Symbol_");
        sb.append(rName());
        sb.append(",");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
