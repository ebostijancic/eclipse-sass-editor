/*
* generated by Xtext
*/
package com.dubture.editor.sass.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SassGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Sass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSassAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cCharsetParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cVariableDeclarationParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cStatementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatementsRuleParserRuleCall_3_0 = (RuleCall)cStatementsAssignment_3.eContents().get(0);
		
		//Sass:
		//	{Sass} Charset? VariableDeclaration* statements+=Rule*;
		public ParserRule getRule() { return rule; }

		//{Sass} Charset? VariableDeclaration* statements+=Rule*
		public Group getGroup() { return cGroup; }

		//{Sass}
		public Action getSassAction_0() { return cSassAction_0; }

		//Charset?
		public RuleCall getCharsetParserRuleCall_1() { return cCharsetParserRuleCall_1; }

		//VariableDeclaration*
		public RuleCall getVariableDeclarationParserRuleCall_2() { return cVariableDeclarationParserRuleCall_2; }

		//statements+=Rule*
		public Assignment getStatementsAssignment_3() { return cStatementsAssignment_3; }

		//Rule
		public RuleCall getStatementsRuleParserRuleCall_3_0() { return cStatementsRuleParserRuleCall_3_0; }
	}

	public class CharsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Charset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCHARSET_IDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cSCTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Charset:
		//	CHARSET_ID STRING SC;
		public ParserRule getRule() { return rule; }

		//CHARSET_ID STRING SC
		public Group getGroup() { return cGroup; }

		//CHARSET_ID
		public RuleCall getCHARSET_IDTerminalRuleCall_0() { return cCHARSET_IDTerminalRuleCall_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }

		//SC
		public RuleCall getSCTerminalRuleCall_2() { return cSCTerminalRuleCall_2; }
	}

	public class VariableDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cVARIABLETerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cWORDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cSCTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//VariableDeclaration:
		//	VARIABLE CL WORD SC;
		public ParserRule getRule() { return rule; }

		//VARIABLE CL WORD SC
		public Group getGroup() { return cGroup; }

		//VARIABLE
		public RuleCall getVARIABLETerminalRuleCall_0() { return cVARIABLETerminalRuleCall_0; }

		//CL
		public RuleCall getCLTerminalRuleCall_1() { return cCLTerminalRuleCall_1; }

		//WORD
		public RuleCall getWORDTerminalRuleCall_2() { return cWORDTerminalRuleCall_2; }

		//SC
		public RuleCall getSCTerminalRuleCall_3() { return cSCTerminalRuleCall_3; }
	}

	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cRuleHeadParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cBLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cRuleBodyParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cBRTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Rule:
		//	RuleHead BL RuleBody BR;
		public ParserRule getRule() { return rule; }

		//RuleHead BL RuleBody BR
		public Group getGroup() { return cGroup; }

		//RuleHead
		public RuleCall getRuleHeadParserRuleCall_0() { return cRuleHeadParserRuleCall_0; }

		//BL
		public RuleCall getBLTerminalRuleCall_1() { return cBLTerminalRuleCall_1; }

		//RuleBody
		public RuleCall getRuleBodyParserRuleCall_2() { return cRuleBodyParserRuleCall_2; }

		//BR
		public RuleCall getBRTerminalRuleCall_3() { return cBRTerminalRuleCall_3; }
	}

	public class RuleHeadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RuleHead");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSELECTORTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cSELECTORTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//RuleHead:
		//	SELECTOR (COMMA SELECTOR)*;
		public ParserRule getRule() { return rule; }

		//SELECTOR (COMMA SELECTOR)*
		public Group getGroup() { return cGroup; }

		//SELECTOR
		public RuleCall getSELECTORTerminalRuleCall_0() { return cSELECTORTerminalRuleCall_0; }

		//(COMMA SELECTOR)*
		public Group getGroup_1() { return cGroup_1; }

		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_0() { return cCOMMATerminalRuleCall_1_0; }

		//SELECTOR
		public RuleCall getSELECTORTerminalRuleCall_1_1() { return cSELECTORTerminalRuleCall_1_1; }
	}

	public class RuleBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RuleBody");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPropertyDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//RuleBody:
		//	(PropertyDeclaration | Rule)*;
		public ParserRule getRule() { return rule; }

		//(PropertyDeclaration | Rule)*
		public Alternatives getAlternatives() { return cAlternatives; }

		//PropertyDeclaration
		public RuleCall getPropertyDeclarationParserRuleCall_0() { return cPropertyDeclarationParserRuleCall_0; }

		//Rule
		public RuleCall getRuleParserRuleCall_1() { return cRuleParserRuleCall_1; }
	}

	public class PropertyDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Alternatives cAlternatives_2_0_0 = (Alternatives)cGroup_2_0.eContents().get(0);
		private final RuleCall cWORDTerminalRuleCall_2_0_0_0 = (RuleCall)cAlternatives_2_0_0.eContents().get(0);
		private final RuleCall cVARIABLETerminalRuleCall_2_0_0_1 = (RuleCall)cAlternatives_2_0_0.eContents().get(1);
		private final RuleCall cSCTerminalRuleCall_2_0_1 = (RuleCall)cGroup_2_0.eContents().get(1);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cBLTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final RuleCall cPropertyDeclarationParserRuleCall_2_1_1 = (RuleCall)cGroup_2_1.eContents().get(1);
		private final RuleCall cBRTerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		
		//PropertyDeclaration:
		//	WORD CL ((WORD | VARIABLE)+ SC | BL PropertyDeclaration* BR);
		public ParserRule getRule() { return rule; }

		//WORD CL ((WORD | VARIABLE)+ SC | BL PropertyDeclaration* BR)
		public Group getGroup() { return cGroup; }

		//WORD
		public RuleCall getWORDTerminalRuleCall_0() { return cWORDTerminalRuleCall_0; }

		//CL
		public RuleCall getCLTerminalRuleCall_1() { return cCLTerminalRuleCall_1; }

		//(WORD | VARIABLE)+ SC | BL PropertyDeclaration* BR
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//(WORD | VARIABLE)+ SC
		public Group getGroup_2_0() { return cGroup_2_0; }

		//(WORD | VARIABLE)+
		public Alternatives getAlternatives_2_0_0() { return cAlternatives_2_0_0; }

		//WORD
		public RuleCall getWORDTerminalRuleCall_2_0_0_0() { return cWORDTerminalRuleCall_2_0_0_0; }

		//VARIABLE
		public RuleCall getVARIABLETerminalRuleCall_2_0_0_1() { return cVARIABLETerminalRuleCall_2_0_0_1; }

		//SC
		public RuleCall getSCTerminalRuleCall_2_0_1() { return cSCTerminalRuleCall_2_0_1; }

		//BL PropertyDeclaration* BR
		public Group getGroup_2_1() { return cGroup_2_1; }

		//BL
		public RuleCall getBLTerminalRuleCall_2_1_0() { return cBLTerminalRuleCall_2_1_0; }

		//PropertyDeclaration*
		public RuleCall getPropertyDeclarationParserRuleCall_2_1_1() { return cPropertyDeclarationParserRuleCall_2_1_1; }

		//BR
		public RuleCall getBRTerminalRuleCall_2_1_2() { return cBRTerminalRuleCall_2_1_2; }
	}
	
	
	private SassElements pSass;
	private CharsetElements pCharset;
	private VariableDeclarationElements pVariableDeclaration;
	private RuleElements pRule;
	private RuleHeadElements pRuleHead;
	private RuleBodyElements pRuleBody;
	private PropertyDeclarationElements pPropertyDeclaration;
	private TerminalRule tDOT;
	private TerminalRule tCOMMA;
	private TerminalRule tSHARP;
	private TerminalRule tCL;
	private TerminalRule tSC;
	private TerminalRule tBL;
	private TerminalRule tBR;
	private TerminalRule tDOLLAR;
	private TerminalRule tAMP;
	private TerminalRule tCHARSET_ID;
	private TerminalRule tWORD;
	private TerminalRule tVARIABLE;
	private TerminalRule tSELECTOR;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SassGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.dubture.editor.sass.Sass".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Sass:
	//	{Sass} Charset? VariableDeclaration* statements+=Rule*;
	public SassElements getSassAccess() {
		return (pSass != null) ? pSass : (pSass = new SassElements());
	}
	
	public ParserRule getSassRule() {
		return getSassAccess().getRule();
	}

	//Charset:
	//	CHARSET_ID STRING SC;
	public CharsetElements getCharsetAccess() {
		return (pCharset != null) ? pCharset : (pCharset = new CharsetElements());
	}
	
	public ParserRule getCharsetRule() {
		return getCharsetAccess().getRule();
	}

	//VariableDeclaration:
	//	VARIABLE CL WORD SC;
	public VariableDeclarationElements getVariableDeclarationAccess() {
		return (pVariableDeclaration != null) ? pVariableDeclaration : (pVariableDeclaration = new VariableDeclarationElements());
	}
	
	public ParserRule getVariableDeclarationRule() {
		return getVariableDeclarationAccess().getRule();
	}

	//Rule:
	//	RuleHead BL RuleBody BR;
	public RuleElements getRuleAccess() {
		return (pRule != null) ? pRule : (pRule = new RuleElements());
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}

	//RuleHead:
	//	SELECTOR (COMMA SELECTOR)*;
	public RuleHeadElements getRuleHeadAccess() {
		return (pRuleHead != null) ? pRuleHead : (pRuleHead = new RuleHeadElements());
	}
	
	public ParserRule getRuleHeadRule() {
		return getRuleHeadAccess().getRule();
	}

	//RuleBody:
	//	(PropertyDeclaration | Rule)*;
	public RuleBodyElements getRuleBodyAccess() {
		return (pRuleBody != null) ? pRuleBody : (pRuleBody = new RuleBodyElements());
	}
	
	public ParserRule getRuleBodyRule() {
		return getRuleBodyAccess().getRule();
	}

	//PropertyDeclaration:
	//	WORD CL ((WORD | VARIABLE)+ SC | BL PropertyDeclaration* BR);
	public PropertyDeclarationElements getPropertyDeclarationAccess() {
		return (pPropertyDeclaration != null) ? pPropertyDeclaration : (pPropertyDeclaration = new PropertyDeclarationElements());
	}
	
	public ParserRule getPropertyDeclarationRule() {
		return getPropertyDeclarationAccess().getRule();
	}

	//terminal DOT:
	//	".";
	public TerminalRule getDOTRule() {
		return (tDOT != null) ? tDOT : (tDOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DOT"));
	} 

	//terminal COMMA:
	//	",";
	public TerminalRule getCOMMARule() {
		return (tCOMMA != null) ? tCOMMA : (tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "COMMA"));
	} 

	//terminal SHARP:
	//	"#";
	public TerminalRule getSHARPRule() {
		return (tSHARP != null) ? tSHARP : (tSHARP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SHARP"));
	} 

	//terminal CL:
	//	":";
	public TerminalRule getCLRule() {
		return (tCL != null) ? tCL : (tCL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "CL"));
	} 

	//terminal SC:
	//	";";
	public TerminalRule getSCRule() {
		return (tSC != null) ? tSC : (tSC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SC"));
	} 

	//terminal BL:
	//	"{";
	public TerminalRule getBLRule() {
		return (tBL != null) ? tBL : (tBL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BL"));
	} 

	//terminal BR:
	//	"}";
	public TerminalRule getBRRule() {
		return (tBR != null) ? tBR : (tBR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BR"));
	} 

	//terminal DOLLAR:
	//	"$";
	public TerminalRule getDOLLARRule() {
		return (tDOLLAR != null) ? tDOLLAR : (tDOLLAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DOLLAR"));
	} 

	//terminal AMP:
	//	"&";
	public TerminalRule getAMPRule() {
		return (tAMP != null) ? tAMP : (tAMP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "AMP"));
	} 

	//terminal CHARSET_ID:
	//	"@charset ";
	public TerminalRule getCHARSET_IDRule() {
		return (tCHARSET_ID != null) ? tCHARSET_ID : (tCHARSET_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "CHARSET_ID"));
	} 

	//terminal WORD:
	//	("a".."z" | "A".."Z" | "0".."9" | "-" | "%")+;
	public TerminalRule getWORDRule() {
		return (tWORD != null) ? tWORD : (tWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WORD"));
	} 

	//terminal VARIABLE:
	//	DOLLAR WORD;
	public TerminalRule getVARIABLERule() {
		return (tVARIABLE != null) ? tVARIABLE : (tVARIABLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "VARIABLE"));
	} 

	//terminal SELECTOR:
	//	AMP CL WORD | ((SHARP | DOT)? WORD)+;
	public TerminalRule getSELECTORRule() {
		return (tSELECTOR != null) ? tSELECTOR : (tSELECTOR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SELECTOR"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}