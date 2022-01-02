
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main
{

    public static void main(String args[]) throws IOException
    {
        String program = "code.txt";
        System.out.println("Cargando programa: " + program);

        File f = new File(program);
        InputStream inputStream = new FileInputStream(f);

        //----------------------------------------------------------

        CharStream stream = CharStreams.fromStream(inputStream);

        GrammarLexer lexer = new GrammarLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        //-----------------------------------------------------------

        GrammarParser.ProgramContext tree = parser.program();
        System.out.println("--------------------------------------");
    }
}


