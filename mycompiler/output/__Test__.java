import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        myparserLexer lex = new myparserLexer(new ANTLRFileStream("/home/hsa1155/compiler/hw2/mycompiler/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        myparserParser g = new myparserParser(tokens, 49100, null);
        try {
            g.statments();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}