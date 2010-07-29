/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.scala.macro;

import java.util.*;

public class MAlternative {

  private final String pName;
  private final MAlternative mAlternative = this;
  private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();
  private final List<Object> ePackageProtected = new LinkedList<Object>();
  private final List<Object> eProtectedConstructor = new LinkedList<Object>();
  private final List<Object> eNormalConstructorParameter_EndConstructorParameter = new LinkedList<Object>();
  private final List<Object> eAlternativeNamedParent_AlternativeNodeParent = new LinkedList<Object>();
  private final List<Object> ePublicElementAccessor = new LinkedList<Object>();
  private final List<Object> eNormalElementAccessor_EndElementAccessor = new LinkedList<Object>();
  private final List<Object> eCopyParameter = new LinkedList<Object>();
  private final List<Object> eCopyConstructorParam = new LinkedList<Object>();
  private final List<Object> eExtractorType = new LinkedList<Object>();
  private final List<Object> eExtractorParameter = new LinkedList<Object>();
  private final List<Object> eNamedAltType = new LinkedList<Object>();
  private final List<Object> eAnonymousAltType = new LinkedList<Object>();
  private final List<Object> eAltProdType = new LinkedList<Object>();

  public MAlternative(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  public MNamedAltType newNamedAltType() {
    MNamedAltType lNamedAltType = new MNamedAltType(mAlternative);
    this.eNamedAltType.add(lNamedAltType);
    return lNamedAltType;
  }

  public MAnonymousAltType newAnonymousAltType() {
    MAnonymousAltType lAnonymousAltType = new MAnonymousAltType();
    this.eAnonymousAltType.add(lAnonymousAltType);
    return lAnonymousAltType;
  }

  public MAltProdType newAltProdType(String pProdName) {
    MAltProdType lAltProdType = new MAltProdType(pProdName);
    this.eAltProdType.add(lAltProdType);
    return lAltProdType;
  }

  public MDefaultPackage newDefaultPackage(String pLanguageName) {
    MDefaultPackage lDefaultPackage = new MDefaultPackage(pLanguageName);
    this.eDefaultPackage_SpecifiedPackage.add(lDefaultPackage);
    return lDefaultPackage;
  }

  public MSpecifiedPackage newSpecifiedPackage(String pLanguageName, String pPackage) {
    MSpecifiedPackage lSpecifiedPackage = new MSpecifiedPackage(pLanguageName, pPackage);
    this.eDefaultPackage_SpecifiedPackage.add(lSpecifiedPackage);
    return lSpecifiedPackage;
  }

  public MPackageProtected newPackageProtected(String pPkg) {
    MPackageProtected lPackageProtected = new MPackageProtected(pPkg);
    this.ePackageProtected.add(lPackageProtected);
    return lPackageProtected;
  }

  public MProtectedConstructor newProtectedConstructor(String pPkg) {
    MProtectedConstructor lProtectedConstructor = new MProtectedConstructor(pPkg);
    this.eProtectedConstructor.add(lProtectedConstructor);
    return lProtectedConstructor;
  }

  public MNormalConstructorParameter newNormalConstructorParameter(String pElementType, String pElementName) {
    MNormalConstructorParameter lNormalConstructorParameter = new MNormalConstructorParameter(pElementType, pElementName);
    this.eNormalConstructorParameter_EndConstructorParameter.add(lNormalConstructorParameter);
    return lNormalConstructorParameter;
  }

  public MEndConstructorParameter newEndConstructorParameter() {
    MEndConstructorParameter lEndConstructorParameter = new MEndConstructorParameter();
    this.eNormalConstructorParameter_EndConstructorParameter.add(lEndConstructorParameter);
    return lEndConstructorParameter;
  }

  public MAlternativeNamedParent newAlternativeNamedParent(String pParent) {
    MAlternativeNamedParent lAlternativeNamedParent = new MAlternativeNamedParent(pParent);
    this.eAlternativeNamedParent_AlternativeNodeParent.add(lAlternativeNamedParent);
    return lAlternativeNamedParent;
  }

  public MAlternativeNodeParent newAlternativeNodeParent() {
    MAlternativeNodeParent lAlternativeNodeParent = new MAlternativeNodeParent();
    this.eAlternativeNamedParent_AlternativeNodeParent.add(lAlternativeNodeParent);
    return lAlternativeNodeParent;
  }

  public MPublicElementAccessor newPublicElementAccessor(String pElementName) {
    MPublicElementAccessor lPublicElementAccessor = new MPublicElementAccessor(pElementName);
    this.ePublicElementAccessor.add(lPublicElementAccessor);
    return lPublicElementAccessor;
  }

  public MNormalElementAccessor newNormalElementAccessor(String pElementType, String pElementName, String pPkg) {
    MNormalElementAccessor lNormalElementAccessor = new MNormalElementAccessor(pElementType, pElementName, pPkg);
    this.eNormalElementAccessor_EndElementAccessor.add(lNormalElementAccessor);
    return lNormalElementAccessor;
  }

  public MEndElementAccessor newEndElementAccessor(String pPkg) {
    MEndElementAccessor lEndElementAccessor = new MEndElementAccessor(pPkg);
    this.eNormalElementAccessor_EndElementAccessor.add(lEndElementAccessor);
    return lEndElementAccessor;
  }

  public MCopyParameter newCopyParameter(String pElementName, String pElementType) {
    MCopyParameter lCopyParameter = new MCopyParameter(pElementName, pElementType);
    this.eCopyParameter.add(lCopyParameter);
    return lCopyParameter;
  }

  public MCopyConstructorParam newCopyConstructorParam(String pElementName) {
    MCopyConstructorParam lCopyConstructorParam = new MCopyConstructorParam(pElementName);
    this.eCopyConstructorParam.add(lCopyConstructorParam);
    return lCopyConstructorParam;
  }

  public MExtractorType newExtractorType(String pElementType) {
    MExtractorType lExtractorType = new MExtractorType(pElementType);
    this.eExtractorType.add(lExtractorType);
    return lExtractorType;
  }

  public MExtractorParameter newExtractorParameter(String pElementName) {
    MExtractorParameter lExtractorParameter = new MExtractorParameter(pElementName);
    this.eExtractorParameter.add(lExtractorParameter);
    return lExtractorParameter;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mAlternative.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MHeader().toString());
    if(this.eDefaultPackage_SpecifiedPackage.size() > 0) {
      sb.append(System.getProperty("line.separator"));
    }
    for(Object oDefaultPackage_SpecifiedPackage : this.eDefaultPackage_SpecifiedPackage) {
      sb.append(oDefaultPackage_SpecifiedPackage.toString());
    }
    sb.append(System.getProperty("line.separator"));
    for(Object oPackageProtected : this.ePackageProtected) {
      sb.append(oPackageProtected.toString());
    }
    sb.append("class N");
    sb.append(rName());
    for(Object oProtectedConstructor : this.eProtectedConstructor) {
      sb.append(oProtectedConstructor.toString());
    }
    sb.append(" (val line: Int, val pos: Int");
    if(this.eNormalConstructorParameter_EndConstructorParameter.size() > 0) {
      sb.append(", ");
    }
    {
      boolean first = true;
      for(Object oNormalConstructorParameter_EndConstructorParameter : this.eNormalConstructorParameter_EndConstructorParameter) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oNormalConstructorParameter_EndConstructorParameter.toString());
      }
    }
    sb.append(")");
    sb.append(System.getProperty("line.separator"));
    sb.append("    extends ");
    for(Object oAlternativeNamedParent_AlternativeNodeParent : this.eAlternativeNamedParent_AlternativeNodeParent) {
      sb.append(oAlternativeNamedParent_AlternativeNodeParent.toString());
    }
    sb.append(" {");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  import Node._");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  override def text = null");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  override def tpe =");
    sb.append(System.getProperty("line.separator"));
    for(Object oNamedAltType : this.eNamedAltType) {
      sb.append(oNamedAltType.toString());
    }
    for(Object oAnonymousAltType : this.eAnonymousAltType) {
      sb.append(oAnonymousAltType.toString());
    }
    sb.append(System.getProperty("line.separator"));
    sb.append("  override def productionType = ");
    sb.append(System.getProperty("line.separator"));
    for(Object oAltProdType : this.eAltProdType) {
      sb.append(oAltProdType.toString());
    }
    sb.append(System.getProperty("line.separator"));
    sb.append("  override def internalType =");
    sb.append(System.getProperty("line.separator"));
    sb.append("    InternalType.T_");
    sb.append(rName());
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    if(this.ePublicElementAccessor.size() > 0) {
      sb.append(System.getProperty("line.separator"));
    }
    {
      boolean first = true;
      for(Object oPublicElementAccessor : this.ePublicElementAccessor) {
        if(first) {
          first = false;
        }
        else {
          sb.append(System.getProperty("line.separator"));
        }
        sb.append(oPublicElementAccessor.toString());
      }
    }
    if(this.eNormalElementAccessor_EndElementAccessor.size() > 0) {
      sb.append(System.getProperty("line.separator"));
    }
    {
      boolean first = true;
      for(Object oNormalElementAccessor_EndElementAccessor : this.eNormalElementAccessor_EndElementAccessor) {
        if(first) {
          first = false;
        }
        else {
          sb.append(System.getProperty("line.separator"));
        }
        sb.append(oNormalElementAccessor_EndElementAccessor.toString());
      }
    }
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  def copy(line: Int = this.line, pos: Int = this.pos");
    if(this.eCopyParameter.size() > 0) {
      sb.append(", ");
    }
    {
      boolean first = true;
      for(Object oCopyParameter : this.eCopyParameter) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oCopyParameter.toString());
      }
    }
    sb.append(") =");
    sb.append(System.getProperty("line.separator"));
    sb.append("    new N");
    sb.append(rName());
    sb.append("(line, pos");
    if(this.eCopyConstructorParam.size() > 0) {
      sb.append(", ");
    }
    {
      boolean first = true;
      for(Object oCopyConstructorParam : this.eCopyConstructorParam) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oCopyConstructorParam.toString());
      }
    }
    sb.append(")");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("  ");
    sb.append(System.getProperty("line.separator"));
    sb.append("  override def toString = \"N");
    sb.append(rName());
    sb.append("\"");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    sb.append("object N");
    sb.append(rName());
    sb.append(" {");
    sb.append(System.getProperty("line.separator"));
    sb.append("  def unapply(node: N");
    sb.append(rName());
    sb.append("): Option[(Int, Int");
    if(this.eExtractorType.size() > 0) {
      sb.append(", ");
    }
    {
      boolean first = true;
      for(Object oExtractorType : this.eExtractorType) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oExtractorType.toString());
      }
    }
    sb.append(")] =");
    sb.append(System.getProperty("line.separator"));
    sb.append("    Some((node.line, node.pos");
    if(this.eExtractorParameter.size() > 0) {
      sb.append(", ");
    }
    {
      boolean first = true;
      for(Object oExtractorParameter : this.eExtractorParameter) {
        if(first) {
          first = false;
        }
        else {
          sb.append(", ");
        }
        sb.append(oExtractorParameter.toString());
      }
    }
    sb.append("))");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
