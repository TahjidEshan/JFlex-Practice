import java.io.*;
import java.util.*;
%%
%public
%type Void
%class eshan

%{
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



%}

letter = [A-Za-z]
keyword=("abstract"|"boolean"|"break"|"byte"|"case"|"catch"|"char"|"class"|"continue"|"default"|"do"|"double"|"else"|"extends"|"final"|"finally"|"float"|"for"|"if"|"implements"|"import"|"instanceof"|"int"|"interface"|"long"|"native"|"new"|"package"|"private"|"protected"|"public"|"return"|"short"|"static"|"super"|"switch"|"synchronized"|"this"|"throw"|"throws"|"transient"|"try"|"void"|"volatile"|"While")
logics=("=="|"!="|">"|"<"|">="|"<="|"&&"|"||"|"!")
operators=("="|"+"|"-"|"*"|"/"|"%"|"+"|"-"|"++"|"--")
others=("("|")"|"{"|"}"|"["|"]"|","|";")
identifiers=[a-zA-Z]+[a-zA-Z0-9]*
numericals=([0-9]+.*[0-9]*)
newline = \r|\n|\r\n

%%
<YYINITIAL>{
{keyword}     {keywords.add(yytext());}
{logics}     {logics.add(yytext());}
{operators}   {operators.add(yytext());}
{others}      {others.add(yytext());}
{identifiers} {identifiers.add(yytext());}
{numericals}  {numericals.add(yytext());}
{newline}      { }
.              { }

}
