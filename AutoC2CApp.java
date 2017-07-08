// import ANTLR runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

class C2CVisitor extends AutoCBaseVisitor<Integer> 
{
	Stack<StringBuilder> out = new Stack<StringBuilder>();
	C2CVisitor(){
		out.push(new StringBuilder(""));
	}

	@Override public Integer visitDirectiveDefinition(@NotNull AutoCParser.DirectiveDefinitionContext ctx) { 
		if(ctx.getParent() instanceof AutoCParser.IncListContext)
			for (int i=0; i< ctx.getChildCount(); i++)
				out.peek().append(ctx.getChild(i).getText()+"\n\n");
		return visitChildren(ctx); 
	}

	@Override public Integer visitFunction(@NotNull AutoCParser.FunctionContext ctx) {
		int check=0;
		for (int i=0; i < ctx.getChildCount(); i++) {
			if(ctx.getChild(i) instanceof TerminalNode)
				out.peek().append(ctx.getChild(i).getText()+" ");
			if(ctx.getChild(i) instanceof AutoCParser.DeclarationContext)
				return this.visit(ctx.getChild(i));
		}
		out.peek().append("\n");
		return visitChildren(ctx); 
	}

	@Override public Integer visitDeclaration(@NotNull AutoCParser.DeclarationContext ctx) {
		for(int i=0; i < ctx.getChildCount(); i++) {
			out.peek().append(ctx.getChild(i).getText()+" ");
		}
		out.peek().append("\n");
		return visitChildren(ctx);
	}
}

public class AutoC2CApp {
	public static void main(String[] args) throws IOException {
		// Input file		
		if (args.length != 1){
			System.err.println("Input C file");
			System.exit(1);
		}
		String filename = args[0];
		System.setIn(new FileInputStream(filename)); 
		InputStream input = System.in;

		// Get lexer
		AutoCLexer lexer = new AutoCLexer(new ANTLRInputStream(input));
		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Pass tokens to parser
		AutoCParser parser = new AutoCParser(tokens);
		// ParseTree
		ParseTree tree = parser.program();
		// our visitor
		C2CVisitor visitor = new C2CVisitor();
		// visit AutoCParser
		visitor.visit(tree);
	
		// Output file
		FileOutputStream output = new FileOutputStream(new File("output_"+args[0]));
		System.out.println("Output file name:  output_"+args[0]);
		output.write(visitor.out.peek().toString().getBytes());
		output.flush();
		output.close();
	}
} 
