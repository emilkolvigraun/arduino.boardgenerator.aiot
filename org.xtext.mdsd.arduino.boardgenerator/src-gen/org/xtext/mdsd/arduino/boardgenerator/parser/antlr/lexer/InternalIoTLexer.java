package org.xtext.mdsd.arduino.boardgenerator.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIoTLexer extends Lexer {
    public static final int RULE_NINT=78;
    public static final int RULE_BEGIN=75;
    public static final int Stop=39;
    public static final int Var=47;
    public static final int Port=37;
    public static final int Include=13;
    public static final int Median=17;
    public static final int RULE_BOOLEAN=82;
    public static final int String=23;
    public static final int Count=25;
    public static final int RULE_SCI=81;
    public static final int LessThanSign=69;
    public static final int Board=24;
    public static final int LeftParenthesis=60;
    public static final int Pass=35;
    public static final int Bool=30;
    public static final int ByWindow=8;
    public static final int Extends=12;
    public static final int Wifi=41;
    public static final int RightSquareBracket=74;
    public static final int ExclamationMark=59;
    public static final int GreaterThanSign=71;
    public static final int RULE_ID=85;
    public static final int Channel=10;
    public static final int RightParenthesis=61;
    public static final int Reduce=19;
    public static final int GreaterThanSignEqualsSign=55;
    public static final int Baud=29;
    public static final int EqualsSignEqualsSign=54;
    public static final int Stdev=27;
    public static final int Min=46;
    public static final int And=43;
    public static final int PlusSign=63;
    public static final int RULE_INT=77;
    public static final int Byte=31;
    public static final int Vcc=48;
    public static final int AsteriskAsterisk=51;
    public static final int RULE_ML_COMMENT=84;
    public static final int LeftSquareBracket=73;
    public static final int Id=57;
    public static final int Ssid=38;
    public static final int Map=44;
    public static final int Sensor=21;
    public static final int Mean=33;
    public static final int RULE_END=76;
    public static final int Max=45;
    public static final int RULE_NDBL=80;
    public static final int VerticalLineVerticalLine=58;
    public static final int RULE_STRING=86;
    public static final int RULE_SL_COMMENT=83;
    public static final int Function=9;
    public static final int Comma=64;
    public static final int EqualsSign=70;
    public static final int As=56;
    public static final int HyphenMinus=65;
    public static final int Abs=42;
    public static final int Number=18;
    public static final int AmpersandAmpersand=50;
    public static final int Char=32;
    public static final int LessThanSignEqualsSign=53;
    public static final int Solidus=67;
    public static final int Colon=68;
    public static final int Topic=28;
    public static final int EOF=-1;
    public static final int Asterisk=62;
    public static final int Mqtt=34;
    public static final int FullStop=66;
    public static final int Broker=15;
    public static final int RULE_WS=87;
    public static final int Abstract=7;
    public static final int Sample=20;
    public static final int Pipe=36;
    public static final int RULE_ANY_OTHER=88;
    public static final int Milliseconds=5;
    public static final int Microseconds=4;
    public static final int RULE_DBL=79;
    public static final int Serial=22;
    public static final int Type=40;
    public static final int Command=11;
    public static final int Filter=16;
    public static final int QuestionMark=72;
    public static final int Model=26;
    public static final int Frequency=6;
    public static final int Seconds=14;
    public static final int ExclamationMarkEqualsSign=49;
    public static final int HyphenMinusGreaterThanSign=52;

    // delegates
    // delegators

    public InternalIoTLexer() {;} 
    public InternalIoTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalIoTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalIoTLexer.g"; }

    // $ANTLR start "Microseconds"
    public final void mMicroseconds() throws RecognitionException {
        try {
            int _type = Microseconds;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:14:14: ( 'microseconds' )
            // InternalIoTLexer.g:14:16: 'microseconds'
            {
            match("microseconds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Microseconds"

    // $ANTLR start "Milliseconds"
    public final void mMilliseconds() throws RecognitionException {
        try {
            int _type = Milliseconds;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:16:14: ( 'milliseconds' )
            // InternalIoTLexer.g:16:16: 'milliseconds'
            {
            match("milliseconds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Milliseconds"

    // $ANTLR start "Frequency"
    public final void mFrequency() throws RecognitionException {
        try {
            int _type = Frequency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:18:11: ( 'frequency' )
            // InternalIoTLexer.g:18:13: 'frequency'
            {
            match("frequency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Frequency"

    // $ANTLR start "Abstract"
    public final void mAbstract() throws RecognitionException {
        try {
            int _type = Abstract;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:20:10: ( 'abstract' )
            // InternalIoTLexer.g:20:12: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Abstract"

    // $ANTLR start "ByWindow"
    public final void mByWindow() throws RecognitionException {
        try {
            int _type = ByWindow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:22:10: ( 'byWindow' )
            // InternalIoTLexer.g:22:12: 'byWindow'
            {
            match("byWindow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ByWindow"

    // $ANTLR start "Function"
    public final void mFunction() throws RecognitionException {
        try {
            int _type = Function;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:24:10: ( 'function' )
            // InternalIoTLexer.g:24:12: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Function"

    // $ANTLR start "Channel"
    public final void mChannel() throws RecognitionException {
        try {
            int _type = Channel;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:26:9: ( 'channel' )
            // InternalIoTLexer.g:26:11: 'channel'
            {
            match("channel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Channel"

    // $ANTLR start "Command"
    public final void mCommand() throws RecognitionException {
        try {
            int _type = Command;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:28:9: ( 'command' )
            // InternalIoTLexer.g:28:11: 'command'
            {
            match("command"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Command"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:30:9: ( 'extends' )
            // InternalIoTLexer.g:30:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "Include"
    public final void mInclude() throws RecognitionException {
        try {
            int _type = Include;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:32:9: ( 'include' )
            // InternalIoTLexer.g:32:11: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Include"

    // $ANTLR start "Seconds"
    public final void mSeconds() throws RecognitionException {
        try {
            int _type = Seconds;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:34:9: ( 'seconds' )
            // InternalIoTLexer.g:34:11: 'seconds'
            {
            match("seconds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Seconds"

    // $ANTLR start "Broker"
    public final void mBroker() throws RecognitionException {
        try {
            int _type = Broker;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:36:8: ( 'broker' )
            // InternalIoTLexer.g:36:10: 'broker'
            {
            match("broker"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Broker"

    // $ANTLR start "Filter"
    public final void mFilter() throws RecognitionException {
        try {
            int _type = Filter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:38:8: ( 'filter' )
            // InternalIoTLexer.g:38:10: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Filter"

    // $ANTLR start "Median"
    public final void mMedian() throws RecognitionException {
        try {
            int _type = Median;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:40:8: ( 'median' )
            // InternalIoTLexer.g:40:10: 'median'
            {
            match("median"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Median"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:42:8: ( 'number' )
            // InternalIoTLexer.g:42:10: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Reduce"
    public final void mReduce() throws RecognitionException {
        try {
            int _type = Reduce;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:44:8: ( 'reduce' )
            // InternalIoTLexer.g:44:10: 'reduce'
            {
            match("reduce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reduce"

    // $ANTLR start "Sample"
    public final void mSample() throws RecognitionException {
        try {
            int _type = Sample;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:46:8: ( 'sample' )
            // InternalIoTLexer.g:46:10: 'sample'
            {
            match("sample"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sample"

    // $ANTLR start "Sensor"
    public final void mSensor() throws RecognitionException {
        try {
            int _type = Sensor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:48:8: ( 'sensor' )
            // InternalIoTLexer.g:48:10: 'sensor'
            {
            match("sensor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sensor"

    // $ANTLR start "Serial"
    public final void mSerial() throws RecognitionException {
        try {
            int _type = Serial;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:50:8: ( 'serial' )
            // InternalIoTLexer.g:50:10: 'serial'
            {
            match("serial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Serial"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:52:8: ( 'string' )
            // InternalIoTLexer.g:52:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Board"
    public final void mBoard() throws RecognitionException {
        try {
            int _type = Board;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:54:7: ( 'board' )
            // InternalIoTLexer.g:54:9: 'board'
            {
            match("board"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Board"

    // $ANTLR start "Count"
    public final void mCount() throws RecognitionException {
        try {
            int _type = Count;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:56:7: ( 'count' )
            // InternalIoTLexer.g:56:9: 'count'
            {
            match("count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Count"

    // $ANTLR start "Model"
    public final void mModel() throws RecognitionException {
        try {
            int _type = Model;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:58:7: ( 'model' )
            // InternalIoTLexer.g:58:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Model"

    // $ANTLR start "Stdev"
    public final void mStdev() throws RecognitionException {
        try {
            int _type = Stdev;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:60:7: ( 'stdev' )
            // InternalIoTLexer.g:60:9: 'stdev'
            {
            match("stdev"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stdev"

    // $ANTLR start "Topic"
    public final void mTopic() throws RecognitionException {
        try {
            int _type = Topic;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:62:7: ( 'topic' )
            // InternalIoTLexer.g:62:9: 'topic'
            {
            match("topic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Topic"

    // $ANTLR start "Baud"
    public final void mBaud() throws RecognitionException {
        try {
            int _type = Baud;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:64:6: ( 'baud' )
            // InternalIoTLexer.g:64:8: 'baud'
            {
            match("baud"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Baud"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:66:6: ( 'bool' )
            // InternalIoTLexer.g:66:8: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Byte"
    public final void mByte() throws RecognitionException {
        try {
            int _type = Byte;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:68:6: ( 'byte' )
            // InternalIoTLexer.g:68:8: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte"

    // $ANTLR start "Char"
    public final void mChar() throws RecognitionException {
        try {
            int _type = Char;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:70:6: ( 'char' )
            // InternalIoTLexer.g:70:8: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Char"

    // $ANTLR start "Mean"
    public final void mMean() throws RecognitionException {
        try {
            int _type = Mean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:72:6: ( 'mean' )
            // InternalIoTLexer.g:72:8: 'mean'
            {
            match("mean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mean"

    // $ANTLR start "Mqtt"
    public final void mMqtt() throws RecognitionException {
        try {
            int _type = Mqtt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:74:6: ( 'mqtt' )
            // InternalIoTLexer.g:74:8: 'mqtt'
            {
            match("mqtt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mqtt"

    // $ANTLR start "Pass"
    public final void mPass() throws RecognitionException {
        try {
            int _type = Pass;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:76:6: ( 'pass' )
            // InternalIoTLexer.g:76:8: 'pass'
            {
            match("pass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pass"

    // $ANTLR start "Pipe"
    public final void mPipe() throws RecognitionException {
        try {
            int _type = Pipe;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:78:6: ( 'pipe' )
            // InternalIoTLexer.g:78:8: 'pipe'
            {
            match("pipe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pipe"

    // $ANTLR start "Port"
    public final void mPort() throws RecognitionException {
        try {
            int _type = Port;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:80:6: ( 'port' )
            // InternalIoTLexer.g:80:8: 'port'
            {
            match("port"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Port"

    // $ANTLR start "Ssid"
    public final void mSsid() throws RecognitionException {
        try {
            int _type = Ssid;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:82:6: ( 'ssid' )
            // InternalIoTLexer.g:82:8: 'ssid'
            {
            match("ssid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ssid"

    // $ANTLR start "Stop"
    public final void mStop() throws RecognitionException {
        try {
            int _type = Stop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:84:6: ( 'stop' )
            // InternalIoTLexer.g:84:8: 'stop'
            {
            match("stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stop"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:86:6: ( 'type' )
            // InternalIoTLexer.g:86:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Wifi"
    public final void mWifi() throws RecognitionException {
        try {
            int _type = Wifi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:88:6: ( 'wifi' )
            // InternalIoTLexer.g:88:8: 'wifi'
            {
            match("wifi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Wifi"

    // $ANTLR start "Abs"
    public final void mAbs() throws RecognitionException {
        try {
            int _type = Abs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:90:5: ( 'abs' )
            // InternalIoTLexer.g:90:7: 'abs'
            {
            match("abs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Abs"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:92:5: ( 'and' )
            // InternalIoTLexer.g:92:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Map"
    public final void mMap() throws RecognitionException {
        try {
            int _type = Map;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:94:5: ( 'map' )
            // InternalIoTLexer.g:94:7: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Map"

    // $ANTLR start "Max"
    public final void mMax() throws RecognitionException {
        try {
            int _type = Max;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:96:5: ( 'max' )
            // InternalIoTLexer.g:96:7: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Max"

    // $ANTLR start "Min"
    public final void mMin() throws RecognitionException {
        try {
            int _type = Min;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:98:5: ( 'min' )
            // InternalIoTLexer.g:98:7: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Min"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:100:5: ( 'var' )
            // InternalIoTLexer.g:100:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "Vcc"
    public final void mVcc() throws RecognitionException {
        try {
            int _type = Vcc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:102:5: ( 'vcc' )
            // InternalIoTLexer.g:102:7: 'vcc'
            {
            match("vcc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Vcc"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:104:27: ( '!=' )
            // InternalIoTLexer.g:104:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:106:20: ( '&&' )
            // InternalIoTLexer.g:106:22: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "AsteriskAsterisk"
    public final void mAsteriskAsterisk() throws RecognitionException {
        try {
            int _type = AsteriskAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:108:18: ( '**' )
            // InternalIoTLexer.g:108:20: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskAsterisk"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:110:28: ( '->' )
            // InternalIoTLexer.g:110:30: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:112:24: ( '<=' )
            // InternalIoTLexer.g:112:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:114:22: ( '==' )
            // InternalIoTLexer.g:114:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:116:27: ( '>=' )
            // InternalIoTLexer.g:116:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "As"
    public final void mAs() throws RecognitionException {
        try {
            int _type = As;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:118:4: ( 'as' )
            // InternalIoTLexer.g:118:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "As"

    // $ANTLR start "Id"
    public final void mId() throws RecognitionException {
        try {
            int _type = Id;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:120:4: ( 'id' )
            // InternalIoTLexer.g:120:6: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Id"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:122:26: ( '||' )
            // InternalIoTLexer.g:122:28: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:124:17: ( '!' )
            // InternalIoTLexer.g:124:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:126:17: ( '(' )
            // InternalIoTLexer.g:126:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:128:18: ( ')' )
            // InternalIoTLexer.g:128:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:130:10: ( '*' )
            // InternalIoTLexer.g:130:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:132:10: ( '+' )
            // InternalIoTLexer.g:132:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:134:7: ( ',' )
            // InternalIoTLexer.g:134:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:136:13: ( '-' )
            // InternalIoTLexer.g:136:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:138:10: ( '.' )
            // InternalIoTLexer.g:138:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:140:9: ( '/' )
            // InternalIoTLexer.g:140:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:142:7: ( ':' )
            // InternalIoTLexer.g:142:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:144:14: ( '<' )
            // InternalIoTLexer.g:144:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:146:12: ( '=' )
            // InternalIoTLexer.g:146:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:148:17: ( '>' )
            // InternalIoTLexer.g:148:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:150:14: ( '?' )
            // InternalIoTLexer.g:150:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:152:19: ( '[' )
            // InternalIoTLexer.g:152:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:154:20: ( ']' )
            // InternalIoTLexer.g:154:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalIoTLexer.g:156:21: ()
            // InternalIoTLexer.g:156:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalIoTLexer.g:158:19: ()
            // InternalIoTLexer.g:158:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:160:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalIoTLexer.g:160:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalIoTLexer.g:160:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalIoTLexer.g:160:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:160:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalIoTLexer.g:160:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalIoTLexer.g:160:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_NINT"
    public final void mRULE_NINT() throws RecognitionException {
        try {
            int _type = RULE_NINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:162:11: ( '-' ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalIoTLexer.g:162:13: '-' ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            match('-'); 
            // InternalIoTLexer.g:162:17: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIoTLexer.g:162:18: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:162:22: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalIoTLexer.g:162:31: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalIoTLexer.g:162:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NINT"

    // $ANTLR start "RULE_DBL"
    public final void mRULE_DBL() throws RecognitionException {
        try {
            int _type = RULE_DBL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:164:10: ( ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalIoTLexer.g:164:12: ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            // InternalIoTLexer.g:164:12: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoTLexer.g:164:12: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalIoTLexer.g:164:26: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIoTLexer.g:164:27: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL"

    // $ANTLR start "RULE_NDBL"
    public final void mRULE_NDBL() throws RecognitionException {
        try {
            int _type = RULE_NDBL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:166:11: ( '-' ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalIoTLexer.g:166:13: '-' ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            match('-'); 
            // InternalIoTLexer.g:166:17: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoTLexer.g:166:17: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalIoTLexer.g:166:31: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIoTLexer.g:166:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NDBL"

    // $ANTLR start "RULE_SCI"
    public final void mRULE_SCI() throws RecognitionException {
        try {
            int _type = RULE_SCI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:168:10: ( ( RULE_INT | RULE_DBL ) ( 'e' | 'E' ) ( '-' )? RULE_INT )
            // InternalIoTLexer.g:168:12: ( RULE_INT | RULE_DBL ) ( 'e' | 'E' ) ( '-' )? RULE_INT
            {
            // InternalIoTLexer.g:168:12: ( RULE_INT | RULE_DBL )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalIoTLexer.g:168:13: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:168:22: RULE_DBL
                    {
                    mRULE_DBL(); 

                    }
                    break;

            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalIoTLexer.g:168:42: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoTLexer.g:168:42: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCI"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:170:14: ( ( 'true' | 'false' | 'True' | 'False' ) )
            // InternalIoTLexer.g:170:16: ( 'true' | 'false' | 'True' | 'False' )
            {
            // InternalIoTLexer.g:170:16: ( 'true' | 'false' | 'True' | 'False' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt11=1;
                }
                break;
            case 'f':
                {
                alt11=2;
                }
                break;
            case 'T':
                {
                alt11=3;
                }
                break;
            case 'F':
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalIoTLexer.g:170:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:170:24: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // InternalIoTLexer.g:170:32: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 4 :
                    // InternalIoTLexer.g:170:39: 'False'
                    {
                    match("False"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:172:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIoTLexer.g:172:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalIoTLexer.g:172:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIoTLexer.g:172:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalIoTLexer.g:172:39: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoTLexer.g:172:40: ( '\\r' )? '\\n'
                    {
                    // InternalIoTLexer.g:172:40: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalIoTLexer.g:172:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:174:17: ( '#*' ( options {greedy=false; } : . )* '*#' )
            // InternalIoTLexer.g:174:19: '#*' ( options {greedy=false; } : . )* '*#'
            {
            match("#*"); 

            // InternalIoTLexer.g:174:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='#') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='\"')||(LA15_1>='$' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIoTLexer.g:174:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*#"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:176:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIoTLexer.g:176:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIoTLexer.g:176:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIoTLexer.g:176:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalIoTLexer.g:176:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIoTLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:178:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIoTLexer.g:178:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIoTLexer.g:178:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalIoTLexer.g:178:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIoTLexer.g:178:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalIoTLexer.g:178:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:178:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:178:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIoTLexer.g:178:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalIoTLexer.g:178:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:178:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:180:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIoTLexer.g:180:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIoTLexer.g:180:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIoTLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:182:16: ( . )
            // InternalIoTLexer.g:182:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalIoTLexer.g:1:8: ( Microseconds | Milliseconds | Frequency | Abstract | ByWindow | Function | Channel | Command | Extends | Include | Seconds | Broker | Filter | Median | Number | Reduce | Sample | Sensor | Serial | String | Board | Count | Model | Stdev | Topic | Baud | Bool | Byte | Char | Mean | Mqtt | Pass | Pipe | Port | Ssid | Stop | Type | Wifi | Abs | And | Map | Max | Min | Var | Vcc | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | As | Id | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_NINT | RULE_DBL | RULE_NDBL | RULE_SCI | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt22=83;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalIoTLexer.g:1:10: Microseconds
                {
                mMicroseconds(); 

                }
                break;
            case 2 :
                // InternalIoTLexer.g:1:23: Milliseconds
                {
                mMilliseconds(); 

                }
                break;
            case 3 :
                // InternalIoTLexer.g:1:36: Frequency
                {
                mFrequency(); 

                }
                break;
            case 4 :
                // InternalIoTLexer.g:1:46: Abstract
                {
                mAbstract(); 

                }
                break;
            case 5 :
                // InternalIoTLexer.g:1:55: ByWindow
                {
                mByWindow(); 

                }
                break;
            case 6 :
                // InternalIoTLexer.g:1:64: Function
                {
                mFunction(); 

                }
                break;
            case 7 :
                // InternalIoTLexer.g:1:73: Channel
                {
                mChannel(); 

                }
                break;
            case 8 :
                // InternalIoTLexer.g:1:81: Command
                {
                mCommand(); 

                }
                break;
            case 9 :
                // InternalIoTLexer.g:1:89: Extends
                {
                mExtends(); 

                }
                break;
            case 10 :
                // InternalIoTLexer.g:1:97: Include
                {
                mInclude(); 

                }
                break;
            case 11 :
                // InternalIoTLexer.g:1:105: Seconds
                {
                mSeconds(); 

                }
                break;
            case 12 :
                // InternalIoTLexer.g:1:113: Broker
                {
                mBroker(); 

                }
                break;
            case 13 :
                // InternalIoTLexer.g:1:120: Filter
                {
                mFilter(); 

                }
                break;
            case 14 :
                // InternalIoTLexer.g:1:127: Median
                {
                mMedian(); 

                }
                break;
            case 15 :
                // InternalIoTLexer.g:1:134: Number
                {
                mNumber(); 

                }
                break;
            case 16 :
                // InternalIoTLexer.g:1:141: Reduce
                {
                mReduce(); 

                }
                break;
            case 17 :
                // InternalIoTLexer.g:1:148: Sample
                {
                mSample(); 

                }
                break;
            case 18 :
                // InternalIoTLexer.g:1:155: Sensor
                {
                mSensor(); 

                }
                break;
            case 19 :
                // InternalIoTLexer.g:1:162: Serial
                {
                mSerial(); 

                }
                break;
            case 20 :
                // InternalIoTLexer.g:1:169: String
                {
                mString(); 

                }
                break;
            case 21 :
                // InternalIoTLexer.g:1:176: Board
                {
                mBoard(); 

                }
                break;
            case 22 :
                // InternalIoTLexer.g:1:182: Count
                {
                mCount(); 

                }
                break;
            case 23 :
                // InternalIoTLexer.g:1:188: Model
                {
                mModel(); 

                }
                break;
            case 24 :
                // InternalIoTLexer.g:1:194: Stdev
                {
                mStdev(); 

                }
                break;
            case 25 :
                // InternalIoTLexer.g:1:200: Topic
                {
                mTopic(); 

                }
                break;
            case 26 :
                // InternalIoTLexer.g:1:206: Baud
                {
                mBaud(); 

                }
                break;
            case 27 :
                // InternalIoTLexer.g:1:211: Bool
                {
                mBool(); 

                }
                break;
            case 28 :
                // InternalIoTLexer.g:1:216: Byte
                {
                mByte(); 

                }
                break;
            case 29 :
                // InternalIoTLexer.g:1:221: Char
                {
                mChar(); 

                }
                break;
            case 30 :
                // InternalIoTLexer.g:1:226: Mean
                {
                mMean(); 

                }
                break;
            case 31 :
                // InternalIoTLexer.g:1:231: Mqtt
                {
                mMqtt(); 

                }
                break;
            case 32 :
                // InternalIoTLexer.g:1:236: Pass
                {
                mPass(); 

                }
                break;
            case 33 :
                // InternalIoTLexer.g:1:241: Pipe
                {
                mPipe(); 

                }
                break;
            case 34 :
                // InternalIoTLexer.g:1:246: Port
                {
                mPort(); 

                }
                break;
            case 35 :
                // InternalIoTLexer.g:1:251: Ssid
                {
                mSsid(); 

                }
                break;
            case 36 :
                // InternalIoTLexer.g:1:256: Stop
                {
                mStop(); 

                }
                break;
            case 37 :
                // InternalIoTLexer.g:1:261: Type
                {
                mType(); 

                }
                break;
            case 38 :
                // InternalIoTLexer.g:1:266: Wifi
                {
                mWifi(); 

                }
                break;
            case 39 :
                // InternalIoTLexer.g:1:271: Abs
                {
                mAbs(); 

                }
                break;
            case 40 :
                // InternalIoTLexer.g:1:275: And
                {
                mAnd(); 

                }
                break;
            case 41 :
                // InternalIoTLexer.g:1:279: Map
                {
                mMap(); 

                }
                break;
            case 42 :
                // InternalIoTLexer.g:1:283: Max
                {
                mMax(); 

                }
                break;
            case 43 :
                // InternalIoTLexer.g:1:287: Min
                {
                mMin(); 

                }
                break;
            case 44 :
                // InternalIoTLexer.g:1:291: Var
                {
                mVar(); 

                }
                break;
            case 45 :
                // InternalIoTLexer.g:1:295: Vcc
                {
                mVcc(); 

                }
                break;
            case 46 :
                // InternalIoTLexer.g:1:299: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 47 :
                // InternalIoTLexer.g:1:325: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 48 :
                // InternalIoTLexer.g:1:344: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 49 :
                // InternalIoTLexer.g:1:361: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 50 :
                // InternalIoTLexer.g:1:388: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 51 :
                // InternalIoTLexer.g:1:411: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 52 :
                // InternalIoTLexer.g:1:432: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 53 :
                // InternalIoTLexer.g:1:458: As
                {
                mAs(); 

                }
                break;
            case 54 :
                // InternalIoTLexer.g:1:461: Id
                {
                mId(); 

                }
                break;
            case 55 :
                // InternalIoTLexer.g:1:464: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 56 :
                // InternalIoTLexer.g:1:489: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 57 :
                // InternalIoTLexer.g:1:505: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 58 :
                // InternalIoTLexer.g:1:521: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 59 :
                // InternalIoTLexer.g:1:538: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 60 :
                // InternalIoTLexer.g:1:547: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 61 :
                // InternalIoTLexer.g:1:556: Comma
                {
                mComma(); 

                }
                break;
            case 62 :
                // InternalIoTLexer.g:1:562: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 63 :
                // InternalIoTLexer.g:1:574: FullStop
                {
                mFullStop(); 

                }
                break;
            case 64 :
                // InternalIoTLexer.g:1:583: Solidus
                {
                mSolidus(); 

                }
                break;
            case 65 :
                // InternalIoTLexer.g:1:591: Colon
                {
                mColon(); 

                }
                break;
            case 66 :
                // InternalIoTLexer.g:1:597: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 67 :
                // InternalIoTLexer.g:1:610: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 68 :
                // InternalIoTLexer.g:1:621: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 69 :
                // InternalIoTLexer.g:1:637: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 70 :
                // InternalIoTLexer.g:1:650: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 71 :
                // InternalIoTLexer.g:1:668: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 72 :
                // InternalIoTLexer.g:1:687: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // InternalIoTLexer.g:1:696: RULE_NINT
                {
                mRULE_NINT(); 

                }
                break;
            case 74 :
                // InternalIoTLexer.g:1:706: RULE_DBL
                {
                mRULE_DBL(); 

                }
                break;
            case 75 :
                // InternalIoTLexer.g:1:715: RULE_NDBL
                {
                mRULE_NDBL(); 

                }
                break;
            case 76 :
                // InternalIoTLexer.g:1:725: RULE_SCI
                {
                mRULE_SCI(); 

                }
                break;
            case 77 :
                // InternalIoTLexer.g:1:734: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 78 :
                // InternalIoTLexer.g:1:747: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 79 :
                // InternalIoTLexer.g:1:763: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 80 :
                // InternalIoTLexer.g:1:779: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 81 :
                // InternalIoTLexer.g:1:787: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 82 :
                // InternalIoTLexer.g:1:799: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 83 :
                // InternalIoTLexer.g:1:807: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA9_eotS =
        "\6\uffff";
    static final String DFA9_eofS =
        "\6\uffff";
    static final String DFA9_minS =
        "\3\56\2\uffff\1\56";
    static final String DFA9_maxS =
        "\1\71\2\145\2\uffff\1\145";
    static final String DFA9_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\3\26\uffff\1\4\37\uffff\1\4",
            "\1\3\1\uffff\12\5\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            "\1\3\1\uffff\12\5\13\uffff\1\4\37\uffff\1\4"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "168:12: ( RULE_INT | RULE_DBL )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\16\61\1\122\1\53\1\125\1\127\1\134\1\136\1\140\1\53\4\uffff\1\146\5\uffff\2\155\2\61\1\164\1\53\1\uffff\2\53\2\uffff\5\61\1\uffff\6\61\1\u0086\10\61\1\u0092\17\61\7\uffff\2\u00a6\15\uffff\1\u00a8\10\uffff\1\155\2\61\1\164\3\uffff\2\61\1\u00b1\4\61\1\u00b6\1\u00b7\4\61\1\u00bd\1\u00be\1\uffff\13\61\1\uffff\21\61\1\u00dc\1\u00dd\1\uffff\1\u00a6\1\uffff\2\61\1\uffff\3\164\2\61\1\uffff\1\61\1\u00e5\1\61\1\u00e7\2\uffff\5\61\2\uffff\1\61\1\u00ee\2\61\1\u00f1\1\u00f2\1\61\1\u00f4\12\61\1\u00ff\1\u0100\3\61\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\2\uffff\1\u0105\1\61\1\uffff\1\164\3\61\1\uffff\1\u010e\1\uffff\3\61\1\u0105\2\61\1\uffff\1\61\1\u0115\2\uffff\1\61\1\uffff\1\61\1\u0118\7\61\1\u0120\2\uffff\2\61\1\u0123\6\uffff\1\u0105\2\61\1\u0126\1\uffff\2\61\1\u0129\2\61\1\u012c\1\uffff\2\61\1\uffff\3\61\1\u0132\1\u0133\1\u0134\1\u0135\1\uffff\1\u0136\1\u0137\1\uffff\2\61\1\uffff\2\61\1\uffff\2\61\1\uffff\1\u013e\1\u013f\1\u0140\1\u0141\1\u0142\6\uffff\3\61\1\u0146\1\u0147\1\u0148\5\uffff\2\61\1\u014b\3\uffff\2\61\1\uffff\2\61\1\u0150\1\u0151\2\uffff";
    static final String DFA22_eofS =
        "\u0152\uffff";
    static final String DFA22_minS =
        "\1\0\2\141\1\142\1\141\1\150\1\170\1\144\1\141\1\165\1\145\1\157\1\141\1\151\1\141\1\75\1\46\1\52\1\56\3\75\1\174\4\uffff\1\60\5\uffff\2\56\1\162\1\141\1\52\1\101\1\uffff\2\0\2\uffff\1\143\1\141\1\144\1\164\1\160\1\uffff\1\145\1\156\2\154\1\163\1\144\1\60\1\127\1\157\1\141\1\165\1\141\1\155\1\164\1\143\1\60\1\143\1\155\1\144\1\151\1\155\1\144\2\160\1\165\1\163\1\160\1\162\1\146\1\162\1\143\7\uffff\2\56\15\uffff\1\60\6\uffff\1\60\1\uffff\1\56\1\165\1\154\1\0\3\uffff\1\162\1\154\1\60\1\151\1\156\1\145\1\164\2\60\1\161\1\143\1\164\1\163\2\60\1\uffff\1\151\1\145\1\153\1\162\1\154\1\144\1\156\1\155\1\156\1\145\1\154\1\uffff\1\157\1\163\1\151\1\160\1\151\1\145\1\160\1\144\1\142\1\165\1\151\2\145\1\163\1\145\1\164\1\151\2\60\1\uffff\1\56\1\uffff\1\145\1\163\4\0\1\157\1\151\1\uffff\1\141\1\60\1\154\1\60\2\uffff\1\165\1\164\2\145\1\162\2\uffff\1\156\1\60\1\145\1\144\2\60\1\156\1\60\1\141\1\164\1\156\1\165\1\156\1\157\1\141\1\154\1\156\1\166\2\60\1\145\2\143\6\60\2\uffff\1\60\1\145\1\uffff\1\0\2\163\1\156\1\uffff\1\60\1\uffff\1\145\1\151\1\162\1\60\1\141\1\144\1\uffff\1\162\1\60\2\uffff\1\145\1\uffff\1\156\1\60\3\144\1\162\1\154\1\145\1\147\1\60\2\uffff\1\162\1\145\1\60\6\uffff\1\60\2\145\1\60\1\uffff\1\156\1\157\1\60\1\143\1\157\1\60\1\uffff\1\154\1\144\1\uffff\1\163\1\145\1\163\4\60\1\uffff\2\60\1\uffff\2\143\1\uffff\1\143\1\156\1\uffff\1\164\1\167\1\uffff\5\60\6\uffff\2\157\1\171\3\60\5\uffff\2\156\1\60\3\uffff\2\144\1\uffff\2\163\2\60\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\161\1\165\1\163\1\171\1\157\1\170\1\156\1\164\1\165\1\145\1\171\1\157\1\151\1\143\1\75\1\46\1\52\1\76\3\75\1\174\4\uffff\1\71\5\uffff\2\145\1\162\1\141\1\52\1\172\1\uffff\2\uffff\2\uffff\1\156\2\144\1\164\1\170\1\uffff\1\145\1\156\2\154\1\163\1\144\1\172\1\164\2\157\1\165\1\141\1\165\1\164\1\143\1\172\1\162\1\155\1\162\1\151\1\155\1\144\2\160\1\165\1\163\1\160\1\162\1\146\1\162\1\143\7\uffff\1\56\1\71\15\uffff\1\145\6\uffff\1\71\1\uffff\1\145\1\165\1\154\1\uffff\3\uffff\1\162\1\154\1\172\1\151\1\156\1\145\1\164\2\172\1\161\1\143\1\164\1\163\2\172\1\uffff\1\151\1\145\1\153\1\162\1\154\1\144\1\162\1\155\1\156\1\145\1\154\1\uffff\1\157\1\163\1\151\1\160\1\151\1\145\1\160\1\144\1\142\1\165\1\151\2\145\1\163\1\145\1\164\1\151\2\172\1\uffff\1\71\1\uffff\1\145\1\163\4\uffff\1\157\1\151\1\uffff\1\141\1\172\1\154\1\172\2\uffff\1\165\1\164\2\145\1\162\2\uffff\1\156\1\172\1\145\1\144\2\172\1\156\1\172\1\141\1\164\1\156\1\165\1\156\1\157\1\141\1\154\1\156\1\166\2\172\1\145\2\143\6\172\2\uffff\1\172\1\145\1\uffff\1\uffff\2\163\1\156\1\uffff\1\172\1\uffff\1\145\1\151\1\162\1\172\1\141\1\144\1\uffff\1\162\1\172\2\uffff\1\145\1\uffff\1\156\1\172\3\144\1\162\1\154\1\145\1\147\1\172\2\uffff\1\162\1\145\1\172\6\uffff\1\172\2\145\1\172\1\uffff\1\156\1\157\1\172\1\143\1\157\1\172\1\uffff\1\154\1\144\1\uffff\1\163\1\145\1\163\4\172\1\uffff\2\172\1\uffff\2\143\1\uffff\1\143\1\156\1\uffff\1\164\1\167\1\uffff\5\172\6\uffff\2\157\1\171\3\172\5\uffff\2\156\1\172\3\uffff\2\144\1\uffff\2\163\2\172\2\uffff";
    static final String DFA22_acceptS =
        "\27\uffff\1\71\1\72\1\74\1\75\1\uffff\1\100\1\101\1\105\1\106\1\107\6\uffff\1\120\2\uffff\1\122\1\123\5\uffff\1\120\37\uffff\1\56\1\70\1\57\1\60\1\73\1\61\1\76\2\uffff\1\113\1\62\1\102\1\63\1\103\1\64\1\104\1\67\1\71\1\72\1\74\1\75\1\77\1\uffff\1\100\1\101\1\105\1\106\1\107\1\110\1\uffff\1\114\4\uffff\1\116\1\121\1\122\17\uffff\1\65\13\uffff\1\66\23\uffff\1\111\1\uffff\1\112\10\uffff\1\53\4\uffff\1\51\1\52\5\uffff\1\47\1\50\35\uffff\1\54\1\55\2\uffff\1\117\4\uffff\1\36\1\uffff\1\37\6\uffff\1\34\2\uffff\1\33\1\32\1\uffff\1\35\12\uffff\1\44\1\43\3\uffff\1\45\1\115\1\40\1\41\1\42\1\46\4\uffff\1\27\6\uffff\1\25\2\uffff\1\26\7\uffff\1\30\2\uffff\1\31\2\uffff\1\16\2\uffff\1\15\2\uffff\1\14\5\uffff\1\22\1\23\1\21\1\24\1\17\1\20\6\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff\1\6\1\4\1\5\2\uffff\1\3\4\uffff\1\1\1\2";
    static final String DFA22_specialS =
        "\1\7\47\uffff\1\1\1\3\111\uffff\1\10\67\uffff\1\5\1\6\1\0\1\4\62\uffff\1\2\160\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\17\1\50\1\45\2\53\1\20\1\51\1\27\1\30\1\21\1\31\1\32\1\22\1\33\1\34\1\41\11\42\1\35\1\53\1\23\1\24\1\25\1\36\1\53\5\47\1\44\15\47\1\43\6\47\1\37\1\53\1\40\1\46\1\47\1\53\1\3\1\4\1\5\1\47\1\6\1\2\2\47\1\7\3\47\1\1\1\11\1\47\1\14\1\47\1\12\1\10\1\13\1\47\1\16\1\15\3\47\1\53\1\26\uff83\53",
            "\1\60\3\uffff\1\55\3\uffff\1\54\5\uffff\1\56\1\uffff\1\57",
            "\1\65\7\uffff\1\64\10\uffff\1\62\2\uffff\1\63",
            "\1\66\13\uffff\1\67\4\uffff\1\70",
            "\1\74\15\uffff\1\73\2\uffff\1\72\6\uffff\1\71",
            "\1\75\6\uffff\1\76",
            "\1\77",
            "\1\101\11\uffff\1\100",
            "\1\103\3\uffff\1\102\15\uffff\1\105\1\104",
            "\1\106",
            "\1\107",
            "\1\110\2\uffff\1\112\6\uffff\1\111",
            "\1\113\7\uffff\1\114\5\uffff\1\115",
            "\1\116",
            "\1\117\1\uffff\1\120",
            "\1\121",
            "\1\123",
            "\1\124",
            "\1\132\1\uffff\1\130\11\131\4\uffff\1\126",
            "\1\133",
            "\1\135",
            "\1\137",
            "\1\141",
            "",
            "",
            "",
            "",
            "\12\147",
            "",
            "",
            "",
            "",
            "",
            "\1\156\26\uffff\1\157\37\uffff\1\157",
            "\1\156\1\uffff\12\160\13\uffff\1\157\37\uffff\1\157",
            "\1\161",
            "\1\162",
            "\1\163",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\0\165",
            "\0\165",
            "",
            "",
            "\1\167\10\uffff\1\170\1\uffff\1\171",
            "\1\173\2\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\176\7\uffff\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0087\34\uffff\1\u0088",
            "\1\u0089",
            "\1\u008a\15\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e\7\uffff\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0093\12\uffff\1\u0094\3\uffff\1\u0095",
            "\1\u0096",
            "\1\u0098\12\uffff\1\u0099\2\uffff\1\u0097",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\132\1\uffff\12\u00a7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\147\13\uffff\1\157\37\uffff\1\157",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\147",
            "",
            "\1\156\1\uffff\12\160\13\uffff\1\157\37\uffff\1\157",
            "\1\u00a9",
            "\1\u00aa",
            "\12\u00ae\1\u00ac\2\u00ae\1\u00ab\34\u00ae\1\u00ad\uffd5\u00ae",
            "",
            "",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00bc\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5\3\uffff\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\132\1\uffff\12\u00a7",
            "",
            "\1\u00de",
            "\1\u00df",
            "\12\u00e0\1\u00ac\ufff5\u00e0",
            "\0\u00e0",
            "\12\u00ae\1\u00ac\2\u00ae\1\u00ab\25\u00ae\1\u00e1\6\u00ae\1\u00ad\uffd5\u00ae",
            "\12\u00ae\1\u00ac\2\u00ae\1\u00ab\34\u00ae\1\u00ad\uffd5\u00ae",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e6",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "",
            "\1\u00ed",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ef",
            "\1\u00f0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u010a",
            "",
            "\12\u00ae\1\u00ac\2\u00ae\1\u00ab\34\u00ae\1\u00ad\uffd5\u00ae",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0112",
            "\1\u0113",
            "",
            "\1\u0114",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0116",
            "",
            "\1\u0117",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0121",
            "\1\u0122",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0124",
            "\1\u0125",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0127",
            "\1\u0128",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u012a",
            "\1\u012b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0138",
            "\1\u0139",
            "",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "\1\u0149",
            "\1\u014a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\u014c",
            "\1\u014d",
            "",
            "\1\u014e",
            "\1\u014f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Microseconds | Milliseconds | Frequency | Abstract | ByWindow | Function | Channel | Command | Extends | Include | Seconds | Broker | Filter | Median | Number | Reduce | Sample | Sensor | Serial | String | Board | Count | Model | Stdev | Topic | Baud | Bool | Byte | Char | Mean | Mqtt | Pass | Pipe | Port | Ssid | Stop | Type | Wifi | Abs | And | Map | Max | Min | Var | Vcc | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | As | Id | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_NINT | RULE_DBL | RULE_NDBL | RULE_SCI | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_173 = input.LA(1);

                        s = -1;
                        if ( (LA22_173=='#') ) {s = 225;}

                        else if ( (LA22_173=='\r') ) {s = 171;}

                        else if ( (LA22_173=='\n') ) {s = 172;}

                        else if ( (LA22_173=='*') ) {s = 173;}

                        else if ( ((LA22_173>='\u0000' && LA22_173<='\t')||(LA22_173>='\u000B' && LA22_173<='\f')||(LA22_173>='\u000E' && LA22_173<='\"')||(LA22_173>='$' && LA22_173<=')')||(LA22_173>='+' && LA22_173<='\uFFFF')) ) {s = 174;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_40 = input.LA(1);

                        s = -1;
                        if ( ((LA22_40>='\u0000' && LA22_40<='\uFFFF')) ) {s = 117;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_225 = input.LA(1);

                        s = -1;
                        if ( (LA22_225=='\r') ) {s = 171;}

                        else if ( (LA22_225=='\n') ) {s = 172;}

                        else if ( (LA22_225=='*') ) {s = 173;}

                        else if ( ((LA22_225>='\u0000' && LA22_225<='\t')||(LA22_225>='\u000B' && LA22_225<='\f')||(LA22_225>='\u000E' && LA22_225<=')')||(LA22_225>='+' && LA22_225<='\uFFFF')) ) {s = 174;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_41 = input.LA(1);

                        s = -1;
                        if ( ((LA22_41>='\u0000' && LA22_41<='\uFFFF')) ) {s = 117;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_174 = input.LA(1);

                        s = -1;
                        if ( (LA22_174=='\r') ) {s = 171;}

                        else if ( (LA22_174=='\n') ) {s = 172;}

                        else if ( (LA22_174=='*') ) {s = 173;}

                        else if ( ((LA22_174>='\u0000' && LA22_174<='\t')||(LA22_174>='\u000B' && LA22_174<='\f')||(LA22_174>='\u000E' && LA22_174<=')')||(LA22_174>='+' && LA22_174<='\uFFFF')) ) {s = 174;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_171 = input.LA(1);

                        s = -1;
                        if ( (LA22_171=='\n') ) {s = 172;}

                        else if ( ((LA22_171>='\u0000' && LA22_171<='\t')||(LA22_171>='\u000B' && LA22_171<='\uFFFF')) ) {s = 224;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_172 = input.LA(1);

                        s = -1;
                        if ( ((LA22_172>='\u0000' && LA22_172<='\uFFFF')) ) {s = 224;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='m') ) {s = 1;}

                        else if ( (LA22_0=='f') ) {s = 2;}

                        else if ( (LA22_0=='a') ) {s = 3;}

                        else if ( (LA22_0=='b') ) {s = 4;}

                        else if ( (LA22_0=='c') ) {s = 5;}

                        else if ( (LA22_0=='e') ) {s = 6;}

                        else if ( (LA22_0=='i') ) {s = 7;}

                        else if ( (LA22_0=='s') ) {s = 8;}

                        else if ( (LA22_0=='n') ) {s = 9;}

                        else if ( (LA22_0=='r') ) {s = 10;}

                        else if ( (LA22_0=='t') ) {s = 11;}

                        else if ( (LA22_0=='p') ) {s = 12;}

                        else if ( (LA22_0=='w') ) {s = 13;}

                        else if ( (LA22_0=='v') ) {s = 14;}

                        else if ( (LA22_0=='!') ) {s = 15;}

                        else if ( (LA22_0=='&') ) {s = 16;}

                        else if ( (LA22_0=='*') ) {s = 17;}

                        else if ( (LA22_0=='-') ) {s = 18;}

                        else if ( (LA22_0=='<') ) {s = 19;}

                        else if ( (LA22_0=='=') ) {s = 20;}

                        else if ( (LA22_0=='>') ) {s = 21;}

                        else if ( (LA22_0=='|') ) {s = 22;}

                        else if ( (LA22_0=='(') ) {s = 23;}

                        else if ( (LA22_0==')') ) {s = 24;}

                        else if ( (LA22_0=='+') ) {s = 25;}

                        else if ( (LA22_0==',') ) {s = 26;}

                        else if ( (LA22_0=='.') ) {s = 27;}

                        else if ( (LA22_0=='/') ) {s = 28;}

                        else if ( (LA22_0==':') ) {s = 29;}

                        else if ( (LA22_0=='?') ) {s = 30;}

                        else if ( (LA22_0=='[') ) {s = 31;}

                        else if ( (LA22_0==']') ) {s = 32;}

                        else if ( (LA22_0=='0') ) {s = 33;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 34;}

                        else if ( (LA22_0=='T') ) {s = 35;}

                        else if ( (LA22_0=='F') ) {s = 36;}

                        else if ( (LA22_0=='#') ) {s = 37;}

                        else if ( (LA22_0=='^') ) {s = 38;}

                        else if ( ((LA22_0>='A' && LA22_0<='E')||(LA22_0>='G' && LA22_0<='S')||(LA22_0>='U' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='d'||(LA22_0>='g' && LA22_0<='h')||(LA22_0>='j' && LA22_0<='l')||LA22_0=='o'||LA22_0=='q'||LA22_0=='u'||(LA22_0>='x' && LA22_0<='z')) ) {s = 39;}

                        else if ( (LA22_0=='\"') ) {s = 40;}

                        else if ( (LA22_0=='\'') ) {s = 41;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 42;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||(LA22_0>='$' && LA22_0<='%')||LA22_0==';'||LA22_0=='@'||LA22_0=='\\'||LA22_0=='`'||LA22_0=='{'||(LA22_0>='}' && LA22_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_115 = input.LA(1);

                        s = -1;
                        if ( (LA22_115=='\r') ) {s = 171;}

                        else if ( (LA22_115=='\n') ) {s = 172;}

                        else if ( (LA22_115=='*') ) {s = 173;}

                        else if ( ((LA22_115>='\u0000' && LA22_115<='\t')||(LA22_115>='\u000B' && LA22_115<='\f')||(LA22_115>='\u000E' && LA22_115<=')')||(LA22_115>='+' && LA22_115<='\uFFFF')) ) {s = 174;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}