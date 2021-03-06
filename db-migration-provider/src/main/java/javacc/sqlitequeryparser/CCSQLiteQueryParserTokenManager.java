/* CCSQLiteQueryParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. CCSQLiteQueryParserTokenManager.java */
package javacc.sqlitequeryparser;
import db.migration.model.*;
import db.migration.model.modification.*;
import db.migration.model.modification.create.*;
import db.migration.model.modification.alter.*;
import db.migration.model.modification.drop.*;
import db.migration.model.modification.insert.*;
import java.util.ArrayList;
import java.util.List;

/** Token Manager. */
@SuppressWarnings("unused")public class CCSQLiteQueryParserTokenManager implements CCSQLiteQueryParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 5;
         return jjMoveNfa_0(5, 0);
      case 10:
         jjmatchedKind = 1;
         return jjMoveNfa_0(5, 0);
      case 13:
         jjmatchedKind = 2;
         return jjMoveStringLiteralDfa1_0(0x8L);
      case 32:
         jjmatchedKind = 6;
         return jjMoveNfa_0(5, 0);
      case 40:
         jjmatchedKind = 17;
         return jjMoveNfa_0(5, 0);
      case 41:
         jjmatchedKind = 18;
         return jjMoveNfa_0(5, 0);
      case 44:
         jjmatchedKind = 19;
         return jjMoveNfa_0(5, 0);
      case 46:
         jjmatchedKind = 67;
         return jjMoveNfa_0(5, 0);
      case 59:
         jjmatchedKind = 66;
         return jjMoveNfa_0(5, 0);
      case 92:
         jjmatchedKind = 4;
         return jjMoveNfa_0(5, 0);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0xd0800800400000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x100100280004000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x25020020010000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x9000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x180a002012000000L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400001800000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x200214400000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x400000000008000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa1_0(0x40008000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x2000000000000000L);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 0);
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x8L) != 0L)
         {
            jjmatchedKind = 3;
            jjmatchedPos = 1;
         }
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000101000008000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2252b4020200000L);
      case 70:
      case 102:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 1;
         }
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x1802000018000000L);
      case 79:
      case 111:
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x400000000000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x100008680800000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x114000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1400000L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 1);
   }
   switch(curChar)
   {
      case 66:
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 67:
      case 99:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 2;
         }
         break;
      case 68:
      case 100:
         if ((active0 & 0x80000000000000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x40010000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x5010020000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x200100c100000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2100020401000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x200002280000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800010000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x820300000000000L);
      case 84:
      case 116:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x1040800000400000L);
      case 89:
      case 121:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 2;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 2);
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x200040020004000L);
      case 67:
      case 99:
         if ((active0 & 0x20000000000000L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x84d038010000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000L);
      case 76:
      case 108:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x4400008000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 79:
      case 111:
         if ((active0 & 0x1000000000000000L) != 0L)
         {
            jjmatchedKind = 60;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x2000400000L);
      case 80:
      case 112:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 3;
         }
         break;
      case 81:
      case 113:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x84000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x2200000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2100000000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 3);
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x104000100000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000000L);
      case 69:
      case 101:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x2008000400000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x300000000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000000L);
      case 82:
      case 114:
         if ((active0 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x805212000000000L);
      case 84:
      case 116:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x60084004000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x28000000L);
      case 88:
      case 120:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 4;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 4);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 4);
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000400000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000000L);
      case 69:
      case 101:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x40000000000L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x200000000000000L) != 0L)
         {
            jjmatchedKind = 57;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x8200200000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000L);
      case 78:
      case 110:
         if ((active0 & 0x800000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x100000000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x5000080100000L);
      case 83:
      case 115:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x2000000000000000L) != 0L)
         {
            jjmatchedKind = 61;
            jjmatchedPos = 5;
         }
         break;
      case 84:
      case 116:
         if ((active0 & 0x800000000000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 5);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 5);
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x9000080000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x200600400000L);
      case 69:
      case 101:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 6;
         }
         else if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000000L);
      case 84:
      case 116:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 6;
         }
         break;
      case 89:
      case 121:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 6;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 6);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 6);
   }
   switch(curChar)
   {
      case 66:
      case 98:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000000000L);
      case 68:
      case 100:
         if ((active0 & 0x4000000000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 7;
         }
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000000L);
      case 75:
      case 107:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 7;
         }
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000L);
      case 84:
      case 116:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 7;
         }
         else if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 7;
         }
         return jjMoveStringLiteralDfa8_0(active0, 0x8000000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 7);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 7);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 7);
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x8000000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 8;
         }
         return jjMoveStringLiteralDfa9_0(active0, 0x10000400000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x80000000L);
      case 89:
      case 121:
         if ((active0 & 0x2000000000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 8;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 8);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 8);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 8);
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x1000000000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 9;
         }
         break;
      case 77:
      case 109:
         return jjMoveStringLiteralDfa10_0(active0, 0x400000L);
      case 83:
      case 115:
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 9;
         }
         break;
      case 84:
      case 116:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 9;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 9);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 9);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 9);
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa11_0(active0, 0x400000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 10);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 10);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 10);
   }
   switch(curChar)
   {
      case 78:
      case 110:
         return jjMoveStringLiteralDfa12_0(active0, 0x400000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 11);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 11);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 11);
   }
   switch(curChar)
   {
      case 84:
      case 116:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 12;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 12);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 37;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 8)
                        kind = 8;
                     { jjCheckNAddStates(0, 6); }
                  }
                  else if ((0x280000000000L & l) != 0L)
                     { jjCheckNAddStates(7, 11); }
                  else if ((0x8400000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 62)
                        kind = 62;
                     { jjCheckNAdd(18); }
                  }
                  else if (curChar == 46)
                     { jjCheckNAdd(1); }
                  if (curChar == 39)
                     { jjCheckNAddTwoStates(9, 10); }
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 0:
                  if (curChar == 46)
                     { jjCheckNAdd(1); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 3:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(4); }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAdd(4); }
                  break;
               case 6:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 7:
                  if (curChar == 34 && kind > 11)
                     kind = 11;
                  break;
               case 8:
                  if (curChar == 39)
                     { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 9:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 10:
                  if (curChar == 39 && kind > 11)
                     kind = 11;
                  break;
               case 11:
                  if (curChar == 39)
                     { jjCheckNAddStates(12, 14); }
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(12, 14); }
                  break;
               case 14:
                  if (curChar == 39 && kind > 12)
                     kind = 12;
                  break;
               case 16:
                  if ((0x8400000000L & l) != 0L && kind > 30)
                     kind = 30;
                  break;
               case 17:
                  if (curChar != 36)
                     break;
                  if (kind > 62)
                     kind = 62;
                  { jjCheckNAdd(18); }
                  break;
               case 18:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 62)
                     kind = 62;
                  { jjCheckNAdd(18); }
                  break;
               case 20:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjAddStates(15, 16); }
                  break;
               case 22:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAddStates(7, 11); }
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(23, 24); }
                  break;
               case 24:
                  if (curChar != 46)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 26:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(27); }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAdd(27); }
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(28, 29); }
                  break;
               case 30:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(31); }
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAdd(31); }
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(17, 22); }
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(33, 0); }
                  break;
               case 34:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(23, 28); }
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjCheckNAddStates(0, 6); }
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjCheckNAdd(36); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 62)
                        kind = 62;
                     { jjCheckNAdd(18); }
                  }
                  else if ((0x128000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                  }
                  if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 91)
                     { jjCheckNAddTwoStates(20, 21); }
                  break;
               case 2:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(23, 24); }
                  break;
               case 6:
                  { jjAddStates(25, 26); }
                  break;
               case 9:
                  { jjAddStates(27, 28); }
                  break;
               case 13:
                  if ((0x7e0000007eL & l) != 0L)
                     { jjAddStates(12, 14); }
                  break;
               case 15:
                  if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 16:
                  if ((0x128000000L & l) != 0L && kind > 30)
                     kind = 30;
                  break;
               case 17:
               case 18:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 62)
                     kind = 62;
                  { jjCheckNAdd(18); }
                  break;
               case 19:
                  if (curChar == 91)
                     { jjCheckNAddTwoStates(20, 21); }
                  break;
               case 20:
                  if ((0xffffffffd7ffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(20, 21); }
                  break;
               case 21:
                  if (curChar == 93 && kind > 65)
                     kind = 65;
                  break;
               case 25:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(29, 30); }
                  break;
               case 29:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(31, 32); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(25, 26); }
                  break;
               case 9:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(27, 28); }
                  break;
               case 20:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(15, 16); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 37 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   36, 33, 0, 23, 24, 28, 29, 0, 23, 28, 32, 34, 12, 13, 14, 20, 
   21, 33, 0, 23, 24, 28, 29, 3, 4, 6, 7, 9, 10, 26, 27, 30, 
   31, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, "\50", "\51", "\54", null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, "\73", 
"\56", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public CCSQLiteQueryParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public CCSQLiteQueryParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 37; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fffffffffffdd01L, 0xeL, 
};
static final long[] jjtoSkip = {
   0x7eL, 0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[37];
    private final int[] jjstateSet = new int[2 * 37];

    
    protected char curChar;
}
