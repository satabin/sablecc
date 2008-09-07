/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

import java.util.LinkedList;
import java.util.List;

public class M_text_block
        extends Macro {

    // ---- constructor ----

    public M_text_block(
            String p_block_name) {

        this.p_block_name = p_block_name;
    }

    // ---- parent ----

    @Override
    Macro get_parent() {

        return null;
    }

    // ---- parameters ----

    private final String p_block_name;

    String get_local_p_block_name() {

        return this.p_block_name;
    }

    // ---- expands ----

    private final List<Macro> e_expand_0 = new LinkedList<Macro>();

    private final List<Macro> e_expand_31 = new LinkedList<Macro>();

    private final List<Macro> e_expand_32 = new LinkedList<Macro>();

    private final List<Macro> e_expand_15 = new LinkedList<Macro>();

    private final List<Macro> e_expand_16 = new LinkedList<Macro>();

    private final List<Macro> e_expand_33 = new LinkedList<Macro>();

    // ---- parameter accessors ----

    private String cached_p_block_name;

    private String get_p_block_name() {

        String result = this.cached_p_block_name;

        if (result == null) {
            Macro current = this;

            while (!(current instanceof M_text_block)) {
                current = current.get_parent();
            }

            result = ((M_text_block) current).get_local_p_block_name();
            this.cached_p_block_name = result;
        }

        return result;
    }

    // ---- text block accessors ----

    private T_header cached_t_header;

    private T_header get_t_header() {

        T_header result = this.cached_t_header;

        if (result == null) {
            result = T_header.getInstance();
            this.cached_t_header = result;
        }

        return result;
    }

    private T_param_accessor_head cached_t_param_accessor_head;

    private T_param_accessor_head get_t_param_accessor_head() {

        T_param_accessor_head result = this.cached_t_param_accessor_head;

        if (result == null) {
            result = T_param_accessor_head.getInstance();
            this.cached_t_param_accessor_head = result;
        }

        return result;
    }

    private T_text_block_accessor_head cached_t_text_block_accessor_head;

    private T_text_block_accessor_head get_t_text_block_accessor_head() {

        T_text_block_accessor_head result = this.cached_t_text_block_accessor_head;

        if (result == null) {
            result = T_text_block_accessor_head.getInstance();
            this.cached_t_text_block_accessor_head = result;
        }

        return result;
    }

    private T_blank_line cached_t_blank_line;

    private T_blank_line get_t_blank_line() {

        T_blank_line result = this.cached_t_blank_line;

        if (result == null) {
            result = T_blank_line.getInstance();
            this.cached_t_blank_line = result;
        }

        return result;
    }

    // ---- macro creators ----

    public M_package_declaration new_package_declaration(
            String p_package_name) {

        M_package_declaration result = new M_package_declaration(p_package_name);
        this.e_expand_0.add(result);
        return result;
    }

    public M_top_level_text_block new_top_level_text_block() {

        M_top_level_text_block result = new M_top_level_text_block(this);
        this.e_expand_31.add(result);
        return result;
    }

    public M_sub_level_text_block new_sub_level_text_block() {

        M_sub_level_text_block result = new M_sub_level_text_block(this);
        this.e_expand_32.add(result);
        return result;
    }

    public M_param_accessor new_param_accessor(
            String p_param_name,
            String p_containing_macro_name) {

        M_param_accessor result = new M_param_accessor(p_param_name,
                p_containing_macro_name);
        this.e_expand_15.add(result);
        return result;
    }

    public M_top_level_text_block_accessor new_top_level_text_block_accessor(
            String p_text_block_name) {

        M_top_level_text_block_accessor result = new M_top_level_text_block_accessor(
                p_text_block_name);
        this.e_expand_16.add(result);
        return result;
    }

    public M_sub_level_text_block_accessor new_sub_level_text_block_accessor(
            String p_text_block_name,
            String p_containing_macro_name) {

        M_sub_level_text_block_accessor result = new M_sub_level_text_block_accessor(
                p_text_block_name, p_containing_macro_name);
        this.e_expand_16.add(result);
        return result;
    }

    public M_text_append new_text_append(
            String p_text) {

        M_text_append result = new M_text_append(p_text);
        this.e_expand_33.add(result);
        return result;
    }

    public M_eol_append new_eol_append() {

        M_eol_append result = new M_eol_append();
        this.e_expand_33.add(result);
        return result;
    }

    public M_escape_append new_escape_append(
            String p_char) {

        M_escape_append result = new M_escape_append(p_char);
        this.e_expand_33.add(result);
        return result;
    }

    public M_var_append new_var_append(
            String p_var_name) {

        M_var_append result = new M_var_append(p_var_name);
        this.e_expand_33.add(result);
        return result;
    }

    public M_text_insert_append new_text_insert_append(
            String p_text_insert_name) {

        M_text_insert_append result = new M_text_insert_append(
                p_text_insert_name);
        this.e_expand_33.add(result);
        return result;
    }

    // ---- appendTo ----

    @Override
    public void appendTo(
            StringBuilder sb) {

        get_t_header().appendTo(sb);

        if (this.e_expand_0.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_0) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        sb.append(EOL);

        sb.append("import java.util.*;");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("public class T_");

        sb.append(get_p_block_name());

        sb.append(" extends Printable {");

        sb.append(EOL);

        sb.append(EOL);

        if (this.e_expand_31.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_31) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        if (this.e_expand_32.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_32) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        if (this.e_expand_15.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_15) {
                if (first) {
                    first = false;
                    get_t_param_accessor_head().appendTo(sb);
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        if (this.e_expand_16.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_16) {
                if (first) {
                    first = false;
                    get_t_text_block_accessor_head().appendTo(sb);
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        sb.append(EOL);

        sb.append("  // ---- appendTo ----");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("  @Override");

        sb.append(EOL);

        sb.append("  public void appendTo(StringBuilder sb) {");

        sb.append(EOL);

        if (this.e_expand_33.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_33) {
                if (first) {
                    first = false;
                }
                else {
                    get_t_blank_line().appendTo(sb);
                }
                macro.appendTo(sb);
            }
        }

        sb.append("  }");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("}");

        sb.append(EOL);
    }

}
