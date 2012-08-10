/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MListH {

  public MListH() {
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MHeader().toString());
    sb.append(System.getProperty("line.separator"));
    sb.append("#ifndef List_H");
    sb.append(System.getProperty("line.separator"));
    sb.append("#define List_H");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("#include <stdlib.h>");
    sb.append(System.getProperty("line.separator"));
    sb.append("#include <string.h>");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("#include \"AbstractMacro.h\"");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("typedef struct Node {");
    sb.append(System.getProperty("line.separator"));
    sb.append("  void* _elem_;");
    sb.append(System.getProperty("line.separator"));
    sb.append("  struct Node* _next_;");
    sb.append(System.getProperty("line.separator"));
    sb.append("  int _bool_MType_;");
    sb.append(System.getProperty("line.separator"));
    sb.append("}Node;");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("typedef struct List {");
    sb.append(System.getProperty("line.separator"));
    sb.append("  int _size_;");
    sb.append(System.getProperty("line.separator"));
    sb.append("  Node* _first_;");
    sb.append(System.getProperty("line.separator"));
    sb.append("  Node* _last_;");
    sb.append(System.getProperty("line.separator"));
    sb.append("}List;");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("List* List_init();");
    sb.append(System.getProperty("line.separator"));
    sb.append("void List_free(List* array);");
    sb.append(System.getProperty("line.separator"));
    sb.append("int List_pushback(List* array, void* _elem_);");
    sb.append(System.getProperty("line.separator"));
    sb.append("int List_pushback_Mtype(List* array, void* _elem_, int _bool_MType_);");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("#endif");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
