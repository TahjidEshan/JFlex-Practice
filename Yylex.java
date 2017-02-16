/* The following code was generated by JFlex 1.4.3 on 3/10/16 9:34 AM */

import java.io.*;
import java.util.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/10/16 9:34 AM from the specification file
 * <tt>code.flex</tt>
 */
public class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\44\2\0\1\45\23\0\1\34\3\0\1\41\1\35\1\0"+
    "\1\42\1\42\1\41\1\37\1\42\1\40\1\0\1\41\12\43\1\0"+
    "\1\42\1\34\1\33\1\34\2\0\26\1\1\32\3\1\1\42\1\0"+
    "\1\42\3\0\1\2\1\3\1\7\1\21\1\12\1\22\1\26\1\16"+
    "\1\17\1\1\1\14\1\11\1\24\1\13\1\10\1\25\1\1\1\6"+
    "\1\4\1\5\1\20\1\27\1\30\1\23\1\15\1\31\1\42\1\36"+
    "\1\42\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\20\2\1\3\1\4\2\1\3\3\1\5"+
    "\1\6\1\1\26\2\1\7\1\2\1\7\11\2\1\4"+
    "\24\2\1\7\47\2\1\7\7\2\1\7\26\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[154];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\344\0\u010a"+
    "\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214\0\u023a"+
    "\0\u0260\0\u0286\0\u02ac\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344"+
    "\0\46\0\46\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\u0428"+
    "\0\u044e\0\u0474\0\u049a\0\u04c0\0\u04e6\0\u050c\0\u0532\0\u0558"+
    "\0\u057e\0\u05a4\0\u05ca\0\u05f0\0\u0616\0\u063c\0\u0662\0\u0688"+
    "\0\u06ae\0\u06d4\0\114\0\u06fa\0\u0720\0\u0746\0\u076c\0\u0792"+
    "\0\u07b8\0\u07de\0\u0804\0\u082a\0\u0850\0\u0876\0\46\0\u089c"+
    "\0\u08c2\0\u08e8\0\u090e\0\u0934\0\u095a\0\u0980\0\u09a6\0\u09cc"+
    "\0\u09f2\0\u0a18\0\u0a3e\0\u0a64\0\u0a8a\0\u0ab0\0\u0ad6\0\u0afc"+
    "\0\u0b22\0\u0b48\0\u0b6e\0\u0b94\0\u0bba\0\u0be0\0\u0c06\0\u0c2c"+
    "\0\u0c52\0\u0c78\0\u0c9e\0\u0cc4\0\u0cea\0\u0d10\0\u0d36\0\u0d5c"+
    "\0\u0d82\0\u0da8\0\u0dce\0\u0df4\0\u0e1a\0\u0e40\0\u0e66\0\u0e8c"+
    "\0\u0eb2\0\u0ed8\0\u0efe\0\u0f24\0\u0f4a\0\u0f70\0\u0f96\0\u0fbc"+
    "\0\u0fe2\0\u1008\0\u102e\0\u1054\0\u107a\0\u10a0\0\u10c6\0\u10ec"+
    "\0\u1112\0\u1138\0\u115e\0\u0a3e\0\u1184\0\u11aa\0\u11d0\0\u11f6"+
    "\0\u121c\0\u1242\0\u1268\0\u128e\0\u12b4\0\u12da\0\u1300\0\u1326"+
    "\0\u134c\0\u1372\0\u1398\0\u13be\0\u13e4\0\u140a\0\u1430\0\u1456"+
    "\0\u147c\0\u14a2\0\u14c8\0\u14ee\0\u1514\0\u153a\0\u1560\0\u1586"+
    "\0\u15ac\0\u15d2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[154];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\3\1\12\1\13\1\14\3\3\1\15\1\3\1\16"+
    "\1\17\2\3\1\20\1\3\1\21\2\3\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\2\1\34\47\0\32\3\10\0\1\3\3\0\2\3"+
    "\1\35\27\3\10\0\1\3\3\0\5\3\1\36\1\3"+
    "\1\37\4\3\1\40\15\3\10\0\1\3\3\0\4\3"+
    "\1\41\7\3\1\42\1\43\1\3\1\44\7\3\1\45"+
    "\2\3\10\0\1\3\3\0\5\3\1\46\7\3\1\47"+
    "\14\3\10\0\1\3\3\0\11\3\1\50\20\3\10\0"+
    "\1\3\3\0\1\3\1\51\5\3\1\52\1\53\4\3"+
    "\1\54\14\3\10\0\1\3\3\0\7\3\1\55\22\3"+
    "\10\0\1\3\3\0\10\3\1\56\11\3\1\57\7\3"+
    "\10\0\1\3\3\0\1\3\1\60\7\3\1\61\20\3"+
    "\10\0\1\3\3\0\12\3\1\62\6\3\1\63\1\3"+
    "\1\64\6\3\10\0\1\3\3\0\7\3\1\65\1\3"+
    "\1\66\20\3\10\0\1\3\3\0\7\3\1\67\1\70"+
    "\5\3\1\71\13\3\10\0\1\3\3\0\1\3\1\72"+
    "\3\3\1\73\11\3\1\74\12\3\10\0\1\3\3\0"+
    "\7\3\1\75\22\3\10\0\1\3\3\0\15\3\1\76"+
    "\14\3\10\0\1\3\35\0\1\77\47\0\1\77\46\0"+
    "\1\77\46\0\1\31\46\0\1\31\5\0\44\33\1\0"+
    "\1\33\44\0\1\2\2\0\3\3\1\100\26\3\10\0"+
    "\1\3\3\0\11\3\1\101\20\3\10\0\1\3\3\0"+
    "\7\3\1\102\22\3\10\0\1\3\3\0\4\3\1\103"+
    "\25\3\10\0\1\3\3\0\1\3\1\104\30\3\10\0"+
    "\1\3\3\0\12\3\1\105\17\3\10\0\1\3\3\0"+
    "\7\3\1\106\22\3\10\0\1\3\3\0\24\3\1\107"+
    "\5\3\10\0\1\3\3\0\16\3\1\110\13\3\10\0"+
    "\1\3\3\0\1\3\1\111\12\3\1\63\15\3\10\0"+
    "\1\3\3\0\5\3\1\112\10\3\1\113\13\3\10\0"+
    "\1\3\3\0\4\3\1\114\25\3\10\0\1\3\3\0"+
    "\3\3\1\103\1\115\25\3\10\0\1\3\3\0\12\3"+
    "\1\116\17\3\10\0\1\3\3\0\1\3\1\117\30\3"+
    "\10\0\1\3\3\0\1\3\1\67\30\3\10\0\1\3"+
    "\3\0\12\3\1\120\17\3\10\0\1\3\3\0\3\3"+
    "\1\103\26\3\10\0\1\3\3\0\4\3\1\121\25\3"+
    "\10\0\1\3\3\0\4\3\1\122\25\3\10\0\1\3"+
    "\3\0\27\3\1\63\2\3\10\0\1\3\3\0\3\3"+
    "\1\123\1\124\25\3\10\0\1\3\3\0\24\3\1\125"+
    "\5\3\10\0\1\3\3\0\17\3\1\126\12\3\10\0"+
    "\1\3\3\0\21\3\1\127\10\3\10\0\1\3\3\0"+
    "\5\3\1\63\24\3\10\0\1\3\3\0\7\3\1\130"+
    "\22\3\10\0\1\3\3\0\12\3\1\131\17\3\10\0"+
    "\1\3\3\0\6\3\1\132\23\3\10\0\1\3\3\0"+
    "\7\3\1\133\6\3\1\134\13\3\10\0\1\3\3\0"+
    "\2\3\1\135\27\3\10\0\1\3\3\0\10\3\1\136"+
    "\5\3\1\137\13\3\10\0\1\3\3\0\16\3\1\140"+
    "\13\3\10\0\1\3\3\0\4\3\1\141\25\3\10\0"+
    "\1\3\3\0\1\3\1\142\30\3\10\0\1\3\3\0"+
    "\10\3\1\143\21\3\10\0\1\3\3\0\11\3\1\63"+
    "\20\3\10\0\1\3\3\0\4\3\1\144\25\3\10\0"+
    "\1\3\3\0\6\3\1\145\23\3\10\0\1\3\3\0"+
    "\5\3\1\146\24\3\10\0\1\3\3\0\11\3\1\67"+
    "\20\3\10\0\1\3\3\0\4\3\1\115\25\3\10\0"+
    "\1\3\3\0\12\3\1\147\17\3\10\0\1\3\3\0"+
    "\7\3\1\150\22\3\10\0\1\3\3\0\3\3\1\63"+
    "\26\3\10\0\1\3\3\0\17\3\1\151\12\3\10\0"+
    "\1\3\3\0\6\3\1\152\23\3\10\0\1\3\3\0"+
    "\4\3\1\153\25\3\10\0\1\3\3\0\3\3\1\113"+
    "\26\3\10\0\1\3\3\0\25\3\1\63\4\3\10\0"+
    "\1\3\3\0\11\3\1\154\20\3\10\0\1\3\3\0"+
    "\16\3\1\155\13\3\10\0\1\3\3\0\4\3\1\156"+
    "\25\3\10\0\1\3\3\0\11\3\1\157\20\3\10\0"+
    "\1\3\3\0\7\3\1\106\1\160\21\3\10\0\1\3"+
    "\3\0\2\3\1\140\27\3\10\0\1\3\3\0\1\3"+
    "\1\161\30\3\10\0\1\3\3\0\1\3\1\146\30\3"+
    "\10\0\1\3\3\0\1\3\1\162\30\3\10\0\1\3"+
    "\3\0\13\3\1\163\16\3\10\0\1\3\3\0\4\3"+
    "\1\164\25\3\10\0\1\3\3\0\26\3\1\165\3\3"+
    "\10\0\1\3\3\0\10\3\1\144\21\3\10\0\1\3"+
    "\3\0\1\3\1\166\30\3\10\0\1\3\3\0\20\3"+
    "\1\63\11\3\10\0\1\3\3\0\10\3\1\103\21\3"+
    "\10\0\1\3\3\0\5\3\1\167\24\3\10\0\1\3"+
    "\3\0\13\3\1\63\16\3\10\0\1\3\3\0\11\3"+
    "\1\170\20\3\10\0\1\3\3\0\16\3\1\171\13\3"+
    "\10\0\1\3\3\0\15\3\1\172\14\3\10\0\1\3"+
    "\3\0\4\3\1\63\25\3\10\0\1\3\3\0\3\3"+
    "\1\173\26\3\10\0\1\3\3\0\27\3\1\174\2\3"+
    "\10\0\1\3\3\0\5\3\1\175\24\3\10\0\1\3"+
    "\3\0\15\3\1\63\14\3\10\0\1\3\3\0\16\3"+
    "\1\176\13\3\10\0\1\3\3\0\12\3\1\177\17\3"+
    "\10\0\1\3\3\0\26\3\1\103\3\3\10\0\1\3"+
    "\3\0\1\3\1\200\30\3\10\0\1\3\3\0\5\3"+
    "\1\201\24\3\10\0\1\3\3\0\11\3\1\202\20\3"+
    "\10\0\1\3\3\0\17\3\1\203\12\3\10\0\1\3"+
    "\3\0\10\3\1\204\21\3\10\0\1\3\3\0\1\3"+
    "\1\205\30\3\10\0\1\3\3\0\11\3\1\206\20\3"+
    "\10\0\1\3\3\0\1\3\1\40\30\3\10\0\1\3"+
    "\3\0\4\3\1\76\25\3\10\0\1\3\3\0\1\3"+
    "\1\207\30\3\10\0\1\3\3\0\1\3\1\175\30\3"+
    "\10\0\1\3\3\0\6\3\1\63\23\3\10\0\1\3"+
    "\3\0\5\3\1\210\24\3\10\0\1\3\3\0\16\3"+
    "\1\211\13\3\10\0\1\3\3\0\12\3\1\63\17\3"+
    "\10\0\1\3\3\0\12\3\1\212\17\3\10\0\1\3"+
    "\3\0\20\3\1\113\11\3\10\0\1\3\3\0\12\3"+
    "\1\213\17\3\10\0\1\3\3\0\21\3\1\214\10\3"+
    "\10\0\1\3\3\0\23\3\1\215\6\3\10\0\1\3"+
    "\3\0\10\3\1\146\21\3\10\0\1\3\3\0\10\3"+
    "\1\216\21\3\10\0\1\3\3\0\25\3\1\103\4\3"+
    "\10\0\1\3\3\0\6\3\1\217\23\3\10\0\1\3"+
    "\3\0\6\3\1\146\23\3\10\0\1\3\3\0\7\3"+
    "\1\220\22\3\10\0\1\3\3\0\11\3\1\221\20\3"+
    "\10\0\1\3\3\0\17\3\1\103\12\3\10\0\1\3"+
    "\3\0\6\3\1\222\23\3\10\0\1\3\3\0\1\3"+
    "\1\223\30\3\10\0\1\3\3\0\11\3\1\224\20\3"+
    "\10\0\1\3\3\0\14\3\1\63\15\3\10\0\1\3"+
    "\3\0\4\3\1\225\25\3\10\0\1\3\3\0\12\3"+
    "\1\226\17\3\10\0\1\3\3\0\12\3\1\146\17\3"+
    "\10\0\1\3\3\0\11\3\1\227\20\3\10\0\1\3"+
    "\3\0\6\3\1\103\23\3\10\0\1\3\3\0\12\3"+
    "\1\230\17\3\10\0\1\3\3\0\11\3\1\137\20\3"+
    "\10\0\1\3\3\0\16\3\1\231\13\3\10\0\1\3"+
    "\3\0\7\3\1\232\22\3\10\0\1\3\3\0\4\3"+
    "\1\113\25\3\10\0\1\3\3\0\30\3\1\225\1\3"+
    "\10\0\1\3\3\0\21\3\1\63\10\3\10\0\1\3"+
    "\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5624];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\26\1\2\11\44\1\1\11\133\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[154];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private ArrayList<String> keywords = new ArrayList();
    private ArrayList<String> operators = new ArrayList();
    private ArrayList<String> logics = new ArrayList();
    private ArrayList<String> identifiers = new ArrayList();
    private ArrayList<String> numericals = new ArrayList();
    private ArrayList<String> others = new ArrayList();

    public ArrayList<String> getKeyWords(){
      return keywords;
    } 
    public ArrayList<String> getLogics(){
      return logics;
    } 
    public ArrayList<String> getOperators(){
      return operators;
    } 
    public ArrayList<String> getOthers(){
      return others;
    } 
    public ArrayList<String> getId(){
      return identifiers;
    }
    public ArrayList<String> getNum(){
      return numericals;
    }  
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new Error("Filename must be given");
            }
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            Yylex lexer = new Yylex(fileInputStream);
            lexer.yylex();
            ArrayList<String> keywords = lexer.getKeyWords();
            ArrayList<String> logics = lexer.getLogics();
            ArrayList<String> operators = lexer.getOperators();
            ArrayList<String> others = lexer.getOthers();
            ArrayList<String> numericals = lexer.getNum();
            ArrayList<String> identifiers = lexer.getId();
            Set<String> uniqueKey = new HashSet<>(keywords);
            Set<String> uniqueLog = new HashSet<>(logics);
            Set<String> uniqueMat = new HashSet<>(operators);
            Set<String> uniqueOth = new HashSet<>(others);
            Set<String> uniqueNum = new HashSet<>(numericals);
            Set<String> uniqueId = new HashSet<>(identifiers);
            Iterator<String> itk = uniqueKey.iterator();
            System.out.print("Keywords: ");
            while (itk.hasNext()) {
                String s = itk.next();
                System.out.print(s);
                if (itk.hasNext()) {
                    System.out.print(",");
                }
            }
            System.out.print("\nLogical Operators: ");
            itk = uniqueLog.iterator();
            while (itk.hasNext()) {
                String s = itk.next();
                System.out.print(s);
                if (itk.hasNext()) {
                    System.out.print(",");
                }
            }

            System.out.print("\nMathematical Operators: ");
            itk = uniqueMat.iterator();
            while (itk.hasNext()) {
                String s = itk.next();
                System.out.print(s);
                if (itk.hasNext()) {
                    System.out.print(",");
                }
            }
            System.out.print("\nIdentifiers: ");

            itk = uniqueId.iterator();
            while (itk.hasNext()) {
                String s = itk.next();
                System.out.print(s);
                if (itk.hasNext()) {
                    System.out.print(",");
                }
            }
            System.out.print("\nNumericals: ");
            itk = uniqueNum.iterator();
            while (itk.hasNext()) {
                String s = itk.next();
                System.out.print(s);
                if (itk.hasNext()) {
                    System.out.print(",");
                }
            }
            System.out.print("\nOthers: ");
            itk = uniqueOth.iterator();
            while (itk.hasNext()) {
                String s = itk.next();
                System.out.print(s);
                if (itk.hasNext()) {
                    System.out.print(" ");
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception in Main " + exception.toString());
            exception.printStackTrace();
        }
    }





  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 124) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Void yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 3: 
          { operators.add(yytext());
          }
        case 8: break;
        case 7: 
          { keywords.add(yytext());
          }
        case 9: break;
        case 4: 
          { logics.add(yytext());
          }
        case 10: break;
        case 5: 
          { others.add(yytext());
          }
        case 11: break;
        case 6: 
          { numericals.add(yytext());
          }
        case 12: break;
        case 2: 
          { identifiers.add(yytext());
          }
        case 13: break;
        case 1: 
          { 
          }
        case 14: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
