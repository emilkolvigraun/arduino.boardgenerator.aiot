/*
 * generated by Xtext 2.21.0
 */
lexer grammar InternalIoTLexer;

@header {
package org.xtext.mdsd.arduino.boardgenerator.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Microseconds : 'microseconds';

Milliseconds : 'milliseconds';

Frequency : 'frequency';

Abstract : 'abstract';

ByWindow : 'byWindow';

Function : 'function';

Channel : 'channel';

Command : 'command';

Extends : 'extends';

Include : 'include';

Seconds : 'seconds';

Broker : 'broker';

Filter : 'filter';

Median : 'median';

Reduce : 'reduce';

Sample : 'sample';

Sensor : 'sensor';

Board : 'board';

Count : 'count';

Model : 'model';

Route : 'route';

Stdev : 'stdev';

Topic : 'topic';

Baud : 'baud';

Byte : 'byte';

Char : 'char';

Mean : 'mean';

Pass : 'pass';

Pipe : 'pipe';

Port : 'port';

Ssid : 'ssid';

Stop : 'stop';

Type : 'type';

Wifi : 'wifi';

Abs : 'abs';

And : 'and';

Map : 'map';

Max : 'max';

Min : 'min';

Url : 'url';

Var : 'var';

Vcc : 'vcc';

ExclamationMarkEqualsSign : '!=';

AmpersandAmpersand : '&&';

AsteriskAsterisk : '**';

HyphenMinusGreaterThanSign : '->';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

As : 'as';

Id : 'id';

VerticalLineVerticalLine : '||';

ExclamationMark : '!';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

QuestionMark : '?';

LeftSquareBracket : '[';

RightSquareBracket : ']';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

RULE_NINT : '-' ('0'|'1'..'9' ('0'..'9')*);

RULE_DBL : RULE_INT? '.' ('0'..'9')+;

RULE_NDBL : '-' RULE_INT? '.' ('0'..'9')+;

RULE_BOOLEAN : ('true'|'false'|'True'|'False');

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ML_COMMENT : '#*' ( options {greedy=false;} : . )*'*#';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
