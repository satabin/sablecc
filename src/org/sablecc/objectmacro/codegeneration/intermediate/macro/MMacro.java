/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.intermediate.macro;

import java.util.*;

public class MMacro {

    private final String pName;

    private final String pIsPublic;

    private final String pSelfRef;

    private final MMacro mMacro = this;

    private final List<Object> eParam = new LinkedList<Object>();

    private final List<Object> eAncestorRef = new LinkedList<Object>();

    private final List<Object> eParamRef = new LinkedList<Object>();

    private final List<Object> eExpand = new LinkedList<Object>();

    private final List<Object> eExpandedMacro = new LinkedList<Object>();

    private final List<Object> eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart = new LinkedList<Object>();

    public MMacro(
            String pName,
            String pIsPublic,
            String pSelfRef) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
        if (pIsPublic == null) {
            throw new NullPointerException();
        }
        this.pIsPublic = pIsPublic;
        if (pSelfRef == null) {
            throw new NullPointerException();
        }
        this.pSelfRef = pSelfRef;
    }

    public MParam newParam(
            String pName,
            String pIndent) {

        MParam lParam = new MParam(pName, pIndent);
        this.eParam.add(lParam);
        return lParam;
    }

    public MAncestorRef newAncestorRef(
            String pName,
            String pIndent) {

        MAncestorRef lAncestorRef = new MAncestorRef(pName, pIndent);
        this.eAncestorRef.add(lAncestorRef);
        return lAncestorRef;
    }

    public MParamRef newParamRef(
            String pName,
            String pContextName) {

        MParamRef lParamRef = new MParamRef(pName, pContextName);
        this.eParamRef.add(lParamRef);
        return lParamRef;
    }

    public MExpand newExpand(
            String pName,
            String pIndent) {

        MExpand lExpand = new MExpand(pName, pIndent);
        this.eExpand.add(lExpand);
        return lExpand;
    }

    public MExpandedMacro newExpandedMacro(
            String pName) {

        MExpandedMacro lExpandedMacro = new MExpandedMacro(pName);
        this.eExpandedMacro.add(lExpandedMacro);
        return lExpandedMacro;
    }

    public MStringPart newStringPart(
            String pString) {

        MStringPart lStringPart = new MStringPart(pString);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lStringPart);
        return lStringPart;
    }

    public MEolPart newEolPart() {

        MEolPart lEolPart = new MEolPart();
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lEolPart);
        return lEolPart;
    }

    public MParamInsertPart newParamInsertPart(
            String pName) {

        MParamInsertPart lParamInsertPart = new MParamInsertPart(pName);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lParamInsertPart);
        return lParamInsertPart;
    }

    public MTextInsertPart newTextInsertPart() {

        MTextInsertPart lTextInsertPart = new MTextInsertPart();
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lTextInsertPart);
        return lTextInsertPart;
    }

    public MExpandInsertPart newExpandInsertPart(
            String pName) {

        MExpandInsertPart lExpandInsertPart = new MExpandInsertPart(pName);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lExpandInsertPart);
        return lExpandInsertPart;
    }

    String pName() {

        return this.pName;
    }

    String pIsPublic() {

        return this.pIsPublic;
    }

    String pSelfRef() {

        return this.pSelfRef;
    }

    private String rName() {

        return this.mMacro.pName();
    }

    private String rIsPublic() {

        return this.mMacro.pIsPublic();
    }

    private String rSelfRef() {

        return this.mMacro.pSelfRef();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("macro {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  name = ");
        sb.append(rName());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        sb.append("  is_public = ");
        sb.append(rIsPublic());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        for (Object oParam : this.eParam) {
            sb.append(oParam.toString());
        }
        sb.append("  self_ref = ");
        sb.append(rSelfRef());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        for (Object oAncestorRef : this.eAncestorRef) {
            sb.append(oAncestorRef.toString());
        }
        for (Object oParamRef : this.eParamRef) {
            sb.append(oParamRef.toString());
        }
        for (Object oExpand : this.eExpand) {
            sb.append(oExpand.toString());
        }
        for (Object oExpandedMacro : this.eExpandedMacro) {
            sb.append(oExpandedMacro.toString());
        }
        for (Object oStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart : this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart) {
            sb.append(oStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                    .toString());
        }
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
