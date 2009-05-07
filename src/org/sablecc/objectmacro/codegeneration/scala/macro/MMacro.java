/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.scala.macro;

import java.util.LinkedList;
import java.util.List;

public class MMacro {

    private final String pName;

    private final MMacro mMacro = this;

    private final List<Object> ePackageDeclaration = new LinkedList<Object>();

    private final List<Object> eImports = new LinkedList<Object>();

    private final List<Object> eProtected = new LinkedList<Object>();

    private final List<Object> eParamClass_AncestorParamClass = new LinkedList<Object>();

    private final List<Object> eSelfRefMacro_CheckParamNotNull_CheckAncestorParamNotNull_ExpandField = new LinkedList<Object>();

    private final List<Object> eMacroCreator = new LinkedList<Object>();

    private final List<Object> eParamRef = new LinkedList<Object>();

    private final List<Object> eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart = new LinkedList<Object>();

    public MMacro(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    public MPackageDeclaration newPackageDeclaration(
            String pPackageName) {

        MPackageDeclaration lPackageDeclaration = new MPackageDeclaration(
                pPackageName);
        this.ePackageDeclaration.add(lPackageDeclaration);
        return lPackageDeclaration;
    }

    public MImports newImports() {

        MImports lImports = new MImports();
        this.eImports.add(lImports);
        return lImports;
    }

    public MProtected newProtected(
            String pPackage) {

        MProtected lProtected = new MProtected(pPackage);
        this.eProtected.add(lProtected);
        return lProtected;
    }

    public MParamClass newParamClass(
            String pName) {

        MParamClass lParamClass = new MParamClass(pName);
        this.eParamClass_AncestorParamClass.add(lParamClass);
        return lParamClass;
    }

    public MAncestorParamClass newAncestorParamClass(
            String pName) {

        MAncestorParamClass lAncestorParamClass = new MAncestorParamClass(pName);
        this.eParamClass_AncestorParamClass.add(lAncestorParamClass);
        return lAncestorParamClass;
    }

    public MSelfRefMacro newSelfRefMacro() {

        MSelfRefMacro lSelfRefMacro = new MSelfRefMacro(this.mMacro);
        this.eSelfRefMacro_CheckParamNotNull_CheckAncestorParamNotNull_ExpandField
                .add(lSelfRefMacro);
        return lSelfRefMacro;
    }

    public MCheckParamNotNull newCheckParamNotNull(
            String pName) {

        MCheckParamNotNull lCheckParamNotNull = new MCheckParamNotNull(pName);
        this.eSelfRefMacro_CheckParamNotNull_CheckAncestorParamNotNull_ExpandField
                .add(lCheckParamNotNull);
        return lCheckParamNotNull;
    }

    public MCheckAncestorParamNotNull newCheckAncestorParamNotNull(
            String pName) {

        MCheckAncestorParamNotNull lCheckAncestorParamNotNull = new MCheckAncestorParamNotNull(
                pName);
        this.eSelfRefMacro_CheckParamNotNull_CheckAncestorParamNotNull_ExpandField
                .add(lCheckAncestorParamNotNull);
        return lCheckAncestorParamNotNull;
    }

    public MExpandField newExpandField(
            String pName) {

        MExpandField lExpandField = new MExpandField(pName);
        this.eSelfRefMacro_CheckParamNotNull_CheckAncestorParamNotNull_ExpandField
                .add(lExpandField);
        return lExpandField;
    }

    public MMacroCreator newMacroCreator(
            String pName) {

        MMacroCreator lMacroCreator = new MMacroCreator(pName);
        this.eMacroCreator.add(lMacroCreator);
        return lMacroCreator;
    }

    public MParamRef newParamRef(
            String pName,
            String pContext) {

        MParamRef lParamRef = new MParamRef(pName, pContext);
        this.eParamRef.add(lParamRef);
        return lParamRef;
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

    private String rName() {

        return this.mMacro.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        if (this.ePackageDeclaration.size() > 0) {
            sb.append(new MEol().toString());
        }
        for (Object oPackageDeclaration : this.ePackageDeclaration) {
            sb.append(oPackageDeclaration.toString());
        }
        if (this.eImports.size() > 0) {
            sb.append(new MEol().toString());
        }
        for (Object oImports : this.eImports) {
            sb.append(oImports.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("class M");
        sb.append(rName());
        sb.append(" ");
        for (Object oProtected : this.eProtected) {
            sb.append(oProtected.toString());
        }
        sb.append(" (");
        {
            boolean first = true;
            for (Object oParamClass_AncestorParamClass : this.eParamClass_AncestorParamClass) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oParamClass_AncestorParamClass.toString());
            }
        }
        sb.append(") {");
        sb.append(System.getProperty("line.separator"));
        if (this.eSelfRefMacro_CheckParamNotNull_CheckAncestorParamNotNull_ExpandField
                .size() > 0) {
            sb.append(new MEol().toString());
        }
        for (Object oSelfRefMacro_CheckParamNotNull_CheckAncestorParamNotNull_ExpandField : this.eSelfRefMacro_CheckParamNotNull_CheckAncestorParamNotNull_ExpandField) {
            sb
                    .append(oSelfRefMacro_CheckParamNotNull_CheckAncestorParamNotNull_ExpandField
                            .toString());
        }
        sb.append(System.getProperty("line.separator"));
        if (this.eMacroCreator.size() > 0) {
            sb.append(new MEol().toString());
        }
        {
            boolean first = true;
            for (Object oMacroCreator : this.eMacroCreator) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(new MEol().toString());
                }
                sb.append(oMacroCreator.toString());
            }
        }
        if (this.eParamRef.size() > 0) {
            sb.append(new MEol().toString());
        }
        {
            boolean first = true;
            for (Object oParamRef : this.eParamRef) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(new MEol().toString());
                }
                sb.append(oParamRef.toString());
            }
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("  override def toString = {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    var sb = new StringBuilder()");
        sb.append(System.getProperty("line.separator"));
        {
            boolean first = true;
            for (Object oStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart : this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(new MEol().toString());
                }
                sb
                        .append(oStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                                .toString());
            }
        }
        sb.append("    sb toString");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
