/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

public class T_param_accessor_head
        extends Printable {

    // ---- constructor ----

    private T_param_accessor_head() {

    }

    // ---- instance ----

    private static final T_param_accessor_head instance = new T_param_accessor_head();

    static T_param_accessor_head getInstance() {

        return instance;
    }

    // ---- appendTo ----

    @Override
    public void appendTo(
            StringBuilder sb) {

        sb.append("  // ---- parameter accessors ----");

        sb.append(EOL);

        sb.append(EOL);
    }

}
