/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MTextInsertStr {

    private final String pSname;

    private final MTextInsertStr mTextInsertStr = this;

    MTextInsertStr(
            String pSname) {

        if (pSname == null) {
            throw new NullPointerException();
        }
        this.pSname = pSname;
    }

    String pSname() {

        return this.pSname;
    }

    private String rSname() {

        return this.mTextInsertStr.pSname();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("M");
        sb.append(rSname());
        sb.append("_toString(t");
        sb.append(rSname());
        sb.append(")");
        return sb.toString();
    }

}
