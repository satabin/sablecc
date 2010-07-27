/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test_scala

object test {
   def main(args: Array[String]) {

    println( "------- test text : normal identifier ------- \n")
    val m1 = new MTextNormalId
    println(m1.toString)

    println( "------- test text : rich identifier -------\n")
    val m2 = new M_teXTRIChid
    println( m2.toString )

    println( "------- test text : params -------\n")
    val m3 = new MTextParams("ObjectMacro is a simple", " language.")
    println( m3.toString )

    val m4 = new M_textparAMs("Do you want learn ObjectMacro", "OK.")
    println( m4.toString )

    println( "------- test macro : normal identifier -------\n")
    val m5 = new MMacroNormalId
    println( m5.toString )

    println( "------- test macro : rich identifier -------\n")
    val m6 = new M_mACrOrIChId
    println( m6.toString )

    println( "------- test macro : params -------\n")
    val m7 = new MMacroParams("Arnaud", "Julien")
    println( m7.toString )

    val m8 = new M_mACROpaRAms("Arnaud", "Julien")
    println( m8.toString )

    println( "------- test macro : macro in macro -------\n")
    val m9 = new MMacroInMacro("GRESIL")
    val s91 = m9.newMacroInMacroLv1("Profs :")
    val s92 = m9.newMacroInMacroLv1("Students :")
    s91.newMacroInMacroLv2("Jean")
    s91.newMacroInMacroLv2("Etienne")
    s92.newMacroInMacroLv2("Arnaud")
    s92.newMacroInMacroLv2("Julien")
    s92.newMacroInMacroLv2("Alexis")
    s92.newMacroInMacroLv2("Jean-Sebastien")
    println( m9.toString )

    println( "------- test macro : heritage of params -------\n")
    val m10 = new MMacroHeritageOfParams("GRESIL")
    val s101 = m10.newMacroHeritageOfParamsLv1("(Prof)")
    val s102 = m10.newMacroHeritageOfParamsLv1("(Student)")
    s101.newMacroHeritageOfParamsLv2("Jean")
    s101.newMacroHeritageOfParamsLv2("Etienne")
    s102.newMacroHeritageOfParamsLv2("Arnaud")
    s102.newMacroHeritageOfParamsLv2("Julien")
    s102.newMacroHeritageOfParamsLv2("Alexis")
    s102.newMacroHeritageOfParamsLv2("Jean-Sebastien")
    println( m10.toString )

    println( "------- test macro : expand -------\n")
    val m11 = new MMacroExpand
    m11.newMacroNormalId
    m11.newMacroExpandHello
    m11.new_mACrOrIChId
    m11.newMacroParams("Arnaud", "Julien")
    m11.newMacroExpandBye
    println( m11.toString )

    println( "------- test macro : insert -------\n")
    val m12 = new MMacroInsert("ObjectMacro is a simple language", "Yes !")
    println( m12.toString )

    val m13 = new M_MacroInsert("Arnaud")
    println( m13.toString )

    println( "------- test macro : no_eol -------\n")
    val m14 = new MMacroNoEol
    m14.newMacroNoEolHello
    m14.new_mACrOrIChId
    m14.newMacroNormalId
    println( m14.toString )

    println( "------- test expand : helpers -------\n")
    val m15 = new MExpandHelpers
    println( m15.toString)

    val m16 = new MExpandHelpers
    m16.newMacroParams("Arnaud", "Julien")
    println( m16.toString)

    val m17 = new MExpandHelpers
    m17.newMacroParams("Arnaud", "Julien")
    m17.newMacroParams("Jean", "Alexis")
    m17.newMacroParams("Jean", "Sebastien")
    println( m17.toString )

    println( "\n ------- ")

    val m18 = new M_expandHelpers
    println( m18.toString)

    val m19 = new M_expandHelpers
    m19.newMacroParams("Arnaud", "Julien")
    println( m19.toString)

    val m20 = new M_expandHelpers
    m20.newMacroParams("Arnaud", "Julien")
    m20.newMacroParams("Jean", "Alexis")
    m20.newMacroParams("Jean", "Sebastien")
    println( m20.toString)
  }
}
