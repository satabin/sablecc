/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

abstract class Printable {

    // ---- EOL ----

    static final String EOL = System.getProperty("line.separator");

    // ---- appendTo ----

    public abstract void appendTo(
            StringBuilder sb);

    // ---- toString ----

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        appendTo(sb);
        return sb.toString();
    }

}
