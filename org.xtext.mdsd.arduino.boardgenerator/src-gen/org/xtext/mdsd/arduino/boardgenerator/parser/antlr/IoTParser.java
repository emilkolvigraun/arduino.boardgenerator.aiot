/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.mdsd.arduino.boardgenerator.parser.antlr.internal.InternalIoTParser;
import org.xtext.mdsd.arduino.boardgenerator.services.IoTGrammarAccess;

public class IoTParser extends AbstractAntlrParser {

	@Inject
	private IoTGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalIoTParser createParser(XtextTokenStream stream) {
		return new InternalIoTParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public IoTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IoTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}