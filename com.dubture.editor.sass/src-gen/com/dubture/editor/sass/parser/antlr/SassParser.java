/*
* generated by Xtext
*/
package com.dubture.editor.sass.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.dubture.editor.sass.services.SassGrammarAccess;

public class SassParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SassGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.dubture.editor.sass.parser.antlr.internal.InternalSassParser createParser(XtextTokenStream stream) {
		return new com.dubture.editor.sass.parser.antlr.internal.InternalSassParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Sass";
	}
	
	public SassGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SassGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}