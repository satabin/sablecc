/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

public class M_macro_with_parent
        extends Macro {

    // ---- constructor ----

    M_macro_with_parent(
            Macro parent

    ) {

        this.parent = parent;
    }

    // ---- parent ----

    private final Macro parent;

    @Override
    Macro get_parent() {

        return this.parent;
    }

    // ---- appendTo ----

    @Override
    public void appendTo(
            StringBuilder sb) {

        sb.append("  // ---- parent ----");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("  private final Macro parent;");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("  @Override");

        sb.append(EOL);

        sb.append("  Macro get_parent() {");

        sb.append(EOL);

        sb.append("    return this.parent;");

        sb.append(EOL);

        sb.append("  }");

        sb.append(EOL);

        sb.append(EOL);
    }

}
