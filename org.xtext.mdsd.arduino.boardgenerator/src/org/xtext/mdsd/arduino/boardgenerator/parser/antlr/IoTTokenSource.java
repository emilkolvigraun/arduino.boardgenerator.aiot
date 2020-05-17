/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.parser.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;
import org.xtext.mdsd.arduino.boardgenerator.parser.antlr.internal.InternalIoTParser;

public class IoTTokenSource extends AbstractIndentationTokenSource {

	public IoTTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalIoTParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalIoTParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalIoTParser.RULE_END;
	}

}