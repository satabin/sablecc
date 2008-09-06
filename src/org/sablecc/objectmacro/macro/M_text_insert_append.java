/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

public class M_text_insert_append
        extends Macro {

    // ---- EOL ----
    private static final String EOL = System.getProperty("line.separator");

    // ---- parameters ----
    private final String p_text_insert_name;

    // ---- text blocks ----

    // ---- expands ----

    // ---- parent ----
    @Override
    public Macro get_parent() {

        return null;
    }

    // ---- constructor ----
    M_text_insert_append(
            String p_text_insert_name) {

        this.p_text_insert_name = p_text_insert_name;
    }

    // ---- local parameter accessors ----

    String get_local_p_text_insert_name() {

        return this.p_text_insert_name;
    }

    // ---- local text block accessors ----

    // ---- parameter accessors ----

    private String cached_p_text_insert_name;

    String get_p_text_insert_name() {

        String result = this.cached_p_text_insert_name;
        if (result == null) {
            Macro current = this;
            while (!(current instanceof M_text_insert_append)) {
                current = current.get_parent();
            }
            result = ((M_text_insert_append) current)
                    .get_local_p_text_insert_name();
            this.cached_p_text_insert_name = result;
        }
        return result;
    }

    // ---- text block accessors ----

    // sub-macro creators

    // ---- append ----

    @Override
    public void appendTo(
            StringBuilder sb) {

        sb.append("    get_t_");
        sb.append(get_p_text_insert_name());
        sb.append("().appendTo(sb);");
        sb.append(EOL);
    }
}