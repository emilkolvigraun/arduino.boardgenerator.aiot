package org.xtext.mdsd.arduino.boardgenerator.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIoTLexer extends Lexer {
    public static final int RULE_NINT=75;
    public static final int RULE_BEGIN=72;
    public static final int Stop=35;
    public static final int Var=44;
    public static final int Port=33;
    public static final int Include=13;
    public static final int Median=17;
    public static final int RULE_BOOLEAN=78;
    public static final int Count=22;
    public static final int LessThanSign=66;
    public static final int Board=21;
    public static final int LeftParenthesis=57;
    public static final int Pass=31;
    public static final int ByWindow=8;
    public static final int Extends=12;
    public static final int Wifi=37;
    public static final int Route=24;
    public static final int RightSquareBracket=71;
    public static final int ExclamationMark=56;
    public static final int GreaterThanSign=68;
    public static final int RULE_ID=81;
    public static final int Channel=10;
    public static final int RightParenthesis=58;
    public static final int Reduce=18;
    public static final int GreaterThanSignEqualsSign=52;
    public static final int Baud=27;
    public static final int EqualsSignEqualsSign=51;
    public static final int Stdev=25;
    public static final int Min=42;
    public static final int And=39;
    public static final int PlusSign=60;
    public static final int RULE_INT=74;
    public static final int Byte=28;
    public static final int Vcc=45;
    public static final int AsteriskAsterisk=48;
    public static final int RULE_ML_COMMENT=80;
    public static final int LeftSquareBracket=70;
    public static final int Id=54;
    public static final int Ssid=34;
    public static final int Map=40;
    public static final int Sensor=20;
    public static final int Mean=30;
    public static final int RULE_END=73;
    public static final int Max=41;
    public static final int RULE_NDBL=77;
    public static final int VerticalLineVerticalLine=55;
    public static final int RULE_STRING=82;
    public static final int Url=43;
    public static final int RULE_SL_COMMENT=79;
    public static final int Function=9;
    public static final int Comma=61;
    public static final int EqualsSign=67;
    public static final int As=53;
    public static final int HyphenMinus=62;
    public static final int Abs=38;
    public static final int AmpersandAmpersand=47;
    public static final int Char=29;
    public static final int LessThanSignEqualsSign=50;
    public static final int Solidus=64;
    public static final int Colon=65;
    public static final int Topic=26;
    public static final int EOF=-1;
    public static final int Asterisk=59;
    public static final int FullStop=63;
    public static final int Broker=15;
    public static final int RULE_WS=83;
    public static final int Abstract=7;
    public static final int Sample=19;
    public static final int Pipe=32;
    public static final int RULE_ANY_OTHER=84;
    public static final int Milliseconds=5;
    public static final int Microseconds=4;
    public static final int RULE_DBL=76;
    public static final int Type=36;
    public static final int Command=11;
    public static final int Filter=16;
    public static final int QuestionMark=69;
    public static final int Model=23;
    public static final int Frequency=6;
    public static final int Seconds=14;
    public static final int ExclamationMarkEqualsSign=46;
    public static final int HyphenMinusGreaterThanSign=49;

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

    // $ANTLR start "Reduce"
    public final void mReduce() throws RecognitionException {
        try {
            int _type = Reduce;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:42:8: ( 'reduce' )
            // InternalIoTLexer.g:42:10: 'reduce'
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
            // InternalIoTLexer.g:44:8: ( 'sample' )
            // InternalIoTLexer.g:44:10: 'sample'
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
            // InternalIoTLexer.g:46:8: ( 'sensor' )
            // InternalIoTLexer.g:46:10: 'sensor'
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

    // $ANTLR start "Board"
    public final void mBoard() throws RecognitionException {
        try {
            int _type = Board;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:48:7: ( 'board' )
            // InternalIoTLexer.g:48:9: 'board'
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
            // InternalIoTLexer.g:50:7: ( 'count' )
            // InternalIoTLexer.g:50:9: 'count'
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
            // InternalIoTLexer.g:52:7: ( 'model' )
            // InternalIoTLexer.g:52:9: 'model'
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

    // $ANTLR start "Route"
    public final void mRoute() throws RecognitionException {
        try {
            int _type = Route;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:54:7: ( 'route' )
            // InternalIoTLexer.g:54:9: 'route'
            {
            match("route"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Route"

    // $ANTLR start "Stdev"
    public final void mStdev() throws RecognitionException {
        try {
            int _type = Stdev;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:56:7: ( 'stdev' )
            // InternalIoTLexer.g:56:9: 'stdev'
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
            // InternalIoTLexer.g:58:7: ( 'topic' )
            // InternalIoTLexer.g:58:9: 'topic'
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
            // InternalIoTLexer.g:60:6: ( 'baud' )
            // InternalIoTLexer.g:60:8: 'baud'
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

    // $ANTLR start "Byte"
    public final void mByte() throws RecognitionException {
        try {
            int _type = Byte;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:62:6: ( 'byte' )
            // InternalIoTLexer.g:62:8: 'byte'
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
            // InternalIoTLexer.g:64:6: ( 'char' )
            // InternalIoTLexer.g:64:8: 'char'
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
            // InternalIoTLexer.g:66:6: ( 'mean' )
            // InternalIoTLexer.g:66:8: 'mean'
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

    // $ANTLR start "Pass"
    public final void mPass() throws RecognitionException {
        try {
            int _type = Pass;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:68:6: ( 'pass' )
            // InternalIoTLexer.g:68:8: 'pass'
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
            // InternalIoTLexer.g:70:6: ( 'pipe' )
            // InternalIoTLexer.g:70:8: 'pipe'
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
            // InternalIoTLexer.g:72:6: ( 'port' )
            // InternalIoTLexer.g:72:8: 'port'
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
            // InternalIoTLexer.g:74:6: ( 'ssid' )
            // InternalIoTLexer.g:74:8: 'ssid'
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
            // InternalIoTLexer.g:76:6: ( 'stop' )
            // InternalIoTLexer.g:76:8: 'stop'
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
            // InternalIoTLexer.g:78:6: ( 'type' )
            // InternalIoTLexer.g:78:8: 'type'
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
            // InternalIoTLexer.g:80:6: ( 'wifi' )
            // InternalIoTLexer.g:80:8: 'wifi'
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
            // InternalIoTLexer.g:82:5: ( 'abs' )
            // InternalIoTLexer.g:82:7: 'abs'
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
            // InternalIoTLexer.g:84:5: ( 'and' )
            // InternalIoTLexer.g:84:7: 'and'
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
            // InternalIoTLexer.g:86:5: ( 'map' )
            // InternalIoTLexer.g:86:7: 'map'
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
            // InternalIoTLexer.g:88:5: ( 'max' )
            // InternalIoTLexer.g:88:7: 'max'
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
            // InternalIoTLexer.g:90:5: ( 'min' )
            // InternalIoTLexer.g:90:7: 'min'
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

    // $ANTLR start "Url"
    public final void mUrl() throws RecognitionException {
        try {
            int _type = Url;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:92:5: ( 'url' )
            // InternalIoTLexer.g:92:7: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Url"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:94:5: ( 'var' )
            // InternalIoTLexer.g:94:7: 'var'
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
            // InternalIoTLexer.g:96:5: ( 'vcc' )
            // InternalIoTLexer.g:96:7: 'vcc'
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
            // InternalIoTLexer.g:98:27: ( '!=' )
            // InternalIoTLexer.g:98:29: '!='
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
            // InternalIoTLexer.g:100:20: ( '&&' )
            // InternalIoTLexer.g:100:22: '&&'
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
            // InternalIoTLexer.g:102:18: ( '**' )
            // InternalIoTLexer.g:102:20: '**'
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
            // InternalIoTLexer.g:104:28: ( '->' )
            // InternalIoTLexer.g:104:30: '->'
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
            // InternalIoTLexer.g:106:24: ( '<=' )
            // InternalIoTLexer.g:106:26: '<='
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
            // InternalIoTLexer.g:108:22: ( '==' )
            // InternalIoTLexer.g:108:24: '=='
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
            // InternalIoTLexer.g:110:27: ( '>=' )
            // InternalIoTLexer.g:110:29: '>='
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
            // InternalIoTLexer.g:112:4: ( 'as' )
            // InternalIoTLexer.g:112:6: 'as'
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
            // InternalIoTLexer.g:114:4: ( 'id' )
            // InternalIoTLexer.g:114:6: 'id'
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
            // InternalIoTLexer.g:116:26: ( '||' )
            // InternalIoTLexer.g:116:28: '||'
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
            // InternalIoTLexer.g:118:17: ( '!' )
            // InternalIoTLexer.g:118:19: '!'
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
            // InternalIoTLexer.g:120:17: ( '(' )
            // InternalIoTLexer.g:120:19: '('
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
            // InternalIoTLexer.g:122:18: ( ')' )
            // InternalIoTLexer.g:122:20: ')'
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
            // InternalIoTLexer.g:124:10: ( '*' )
            // InternalIoTLexer.g:124:12: '*'
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
            // InternalIoTLexer.g:126:10: ( '+' )
            // InternalIoTLexer.g:126:12: '+'
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
            // InternalIoTLexer.g:128:7: ( ',' )
            // InternalIoTLexer.g:128:9: ','
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
            // InternalIoTLexer.g:130:13: ( '-' )
            // InternalIoTLexer.g:130:15: '-'
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
            // InternalIoTLexer.g:132:10: ( '.' )
            // InternalIoTLexer.g:132:12: '.'
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
            // InternalIoTLexer.g:134:9: ( '/' )
            // InternalIoTLexer.g:134:11: '/'
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
            // InternalIoTLexer.g:136:7: ( ':' )
            // InternalIoTLexer.g:136:9: ':'
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
            // InternalIoTLexer.g:138:14: ( '<' )
            // InternalIoTLexer.g:138:16: '<'
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
            // InternalIoTLexer.g:140:12: ( '=' )
            // InternalIoTLexer.g:140:14: '='
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
            // InternalIoTLexer.g:142:17: ( '>' )
            // InternalIoTLexer.g:142:19: '>'
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
            // InternalIoTLexer.g:144:14: ( '?' )
            // InternalIoTLexer.g:144:16: '?'
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
            // InternalIoTLexer.g:146:19: ( '[' )
            // InternalIoTLexer.g:146:21: '['
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
            // InternalIoTLexer.g:148:20: ( ']' )
            // InternalIoTLexer.g:148:22: ']'
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
            // InternalIoTLexer.g:150:21: ()
            // InternalIoTLexer.g:150:23: 
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
            // InternalIoTLexer.g:152:19: ()
            // InternalIoTLexer.g:152:21: 
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
            // InternalIoTLexer.g:154:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalIoTLexer.g:154:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalIoTLexer.g:154:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalIoTLexer.g:154:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:154:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalIoTLexer.g:154:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalIoTLexer.g:154:27: '0' .. '9'
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
            // InternalIoTLexer.g:156:11: ( '-' ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalIoTLexer.g:156:13: '-' ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            match('-'); 
            // InternalIoTLexer.g:156:17: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalIoTLexer.g:156:18: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:156:22: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalIoTLexer.g:156:31: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalIoTLexer.g:156:32: '0' .. '9'
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
            // InternalIoTLexer.g:158:10: ( ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalIoTLexer.g:158:12: ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            // InternalIoTLexer.g:158:12: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoTLexer.g:158:12: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalIoTLexer.g:158:26: ( '0' .. '9' )+
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
            	    // InternalIoTLexer.g:158:27: '0' .. '9'
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
            // InternalIoTLexer.g:160:11: ( '-' ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalIoTLexer.g:160:13: '-' ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            match('-'); 
            // InternalIoTLexer.g:160:17: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoTLexer.g:160:17: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalIoTLexer.g:160:31: ( '0' .. '9' )+
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
            	    // InternalIoTLexer.g:160:32: '0' .. '9'
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

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:162:14: ( ( 'true' | 'false' | 'True' | 'False' ) )
            // InternalIoTLexer.g:162:16: ( 'true' | 'false' | 'True' | 'False' )
            {
            // InternalIoTLexer.g:162:16: ( 'true' | 'false' | 'True' | 'False' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt9=1;
                }
                break;
            case 'f':
                {
                alt9=2;
                }
                break;
            case 'T':
                {
                alt9=3;
                }
                break;
            case 'F':
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalIoTLexer.g:162:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:162:24: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // InternalIoTLexer.g:162:32: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 4 :
                    // InternalIoTLexer.g:162:39: 'False'
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
            // InternalIoTLexer.g:164:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIoTLexer.g:164:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalIoTLexer.g:164:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIoTLexer.g:164:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalIoTLexer.g:164:39: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoTLexer.g:164:40: ( '\\r' )? '\\n'
                    {
                    // InternalIoTLexer.g:164:40: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalIoTLexer.g:164:40: '\\r'
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
            // InternalIoTLexer.g:166:17: ( '#*' ( options {greedy=false; } : . )* '*#' )
            // InternalIoTLexer.g:166:19: '#*' ( options {greedy=false; } : . )* '*#'
            {
            match("#*"); 

            // InternalIoTLexer.g:166:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='#') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='\"')||(LA13_1>='$' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIoTLexer.g:166:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalIoTLexer.g:168:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIoTLexer.g:168:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIoTLexer.g:168:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoTLexer.g:168:11: '^'
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

            // InternalIoTLexer.g:168:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    break loop15;
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
            // InternalIoTLexer.g:170:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIoTLexer.g:170:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIoTLexer.g:170:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalIoTLexer.g:170:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIoTLexer.g:170:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalIoTLexer.g:170:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:170:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop16;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:170:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIoTLexer.g:170:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalIoTLexer.g:170:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:170:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop17;
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
            // InternalIoTLexer.g:172:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIoTLexer.g:172:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIoTLexer.g:172:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalIoTLexer.g:174:16: ( . )
            // InternalIoTLexer.g:174:18: .
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
        // InternalIoTLexer.g:1:8: ( Microseconds | Milliseconds | Frequency | Abstract | ByWindow | Function | Channel | Command | Extends | Include | Seconds | Broker | Filter | Median | Reduce | Sample | Sensor | Board | Count | Model | Route | Stdev | Topic | Baud | Byte | Char | Mean | Pass | Pipe | Port | Ssid | Stop | Type | Wifi | Abs | And | Map | Max | Min | Url | Var | Vcc | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | As | Id | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_NINT | RULE_DBL | RULE_NDBL | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt20=79;
        alt20 = dfa20.predict(input);
        switch (alt20) {
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
                // InternalIoTLexer.g:1:134: Reduce
                {
                mReduce(); 

                }
                break;
            case 16 :
                // InternalIoTLexer.g:1:141: Sample
                {
                mSample(); 

                }
                break;
            case 17 :
                // InternalIoTLexer.g:1:148: Sensor
                {
                mSensor(); 

                }
                break;
            case 18 :
                // InternalIoTLexer.g:1:155: Board
                {
                mBoard(); 

                }
                break;
            case 19 :
                // InternalIoTLexer.g:1:161: Count
                {
                mCount(); 

                }
                break;
            case 20 :
                // InternalIoTLexer.g:1:167: Model
                {
                mModel(); 

                }
                break;
            case 21 :
                // InternalIoTLexer.g:1:173: Route
                {
                mRoute(); 

                }
                break;
            case 22 :
                // InternalIoTLexer.g:1:179: Stdev
                {
                mStdev(); 

                }
                break;
            case 23 :
                // InternalIoTLexer.g:1:185: Topic
                {
                mTopic(); 

                }
                break;
            case 24 :
                // InternalIoTLexer.g:1:191: Baud
                {
                mBaud(); 

                }
                break;
            case 25 :
                // InternalIoTLexer.g:1:196: Byte
                {
                mByte(); 

                }
                break;
            case 26 :
                // InternalIoTLexer.g:1:201: Char
                {
                mChar(); 

                }
                break;
            case 27 :
                // InternalIoTLexer.g:1:206: Mean
                {
                mMean(); 

                }
                break;
            case 28 :
                // InternalIoTLexer.g:1:211: Pass
                {
                mPass(); 

                }
                break;
            case 29 :
                // InternalIoTLexer.g:1:216: Pipe
                {
                mPipe(); 

                }
                break;
            case 30 :
                // InternalIoTLexer.g:1:221: Port
                {
                mPort(); 

                }
                break;
            case 31 :
                // InternalIoTLexer.g:1:226: Ssid
                {
                mSsid(); 

                }
                break;
            case 32 :
                // InternalIoTLexer.g:1:231: Stop
                {
                mStop(); 

                }
                break;
            case 33 :
                // InternalIoTLexer.g:1:236: Type
                {
                mType(); 

                }
                break;
            case 34 :
                // InternalIoTLexer.g:1:241: Wifi
                {
                mWifi(); 

                }
                break;
            case 35 :
                // InternalIoTLexer.g:1:246: Abs
                {
                mAbs(); 

                }
                break;
            case 36 :
                // InternalIoTLexer.g:1:250: And
                {
                mAnd(); 

                }
                break;
            case 37 :
                // InternalIoTLexer.g:1:254: Map
                {
                mMap(); 

                }
                break;
            case 38 :
                // InternalIoTLexer.g:1:258: Max
                {
                mMax(); 

                }
                break;
            case 39 :
                // InternalIoTLexer.g:1:262: Min
                {
                mMin(); 

                }
                break;
            case 40 :
                // InternalIoTLexer.g:1:266: Url
                {
                mUrl(); 

                }
                break;
            case 41 :
                // InternalIoTLexer.g:1:270: Var
                {
                mVar(); 

                }
                break;
            case 42 :
                // InternalIoTLexer.g:1:274: Vcc
                {
                mVcc(); 

                }
                break;
            case 43 :
                // InternalIoTLexer.g:1:278: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 44 :
                // InternalIoTLexer.g:1:304: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 45 :
                // InternalIoTLexer.g:1:323: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 46 :
                // InternalIoTLexer.g:1:340: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 47 :
                // InternalIoTLexer.g:1:367: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 48 :
                // InternalIoTLexer.g:1:390: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 49 :
                // InternalIoTLexer.g:1:411: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 50 :
                // InternalIoTLexer.g:1:437: As
                {
                mAs(); 

                }
                break;
            case 51 :
                // InternalIoTLexer.g:1:440: Id
                {
                mId(); 

                }
                break;
            case 52 :
                // InternalIoTLexer.g:1:443: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 53 :
                // InternalIoTLexer.g:1:468: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 54 :
                // InternalIoTLexer.g:1:484: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 55 :
                // InternalIoTLexer.g:1:500: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 56 :
                // InternalIoTLexer.g:1:517: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 57 :
                // InternalIoTLexer.g:1:526: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 58 :
                // InternalIoTLexer.g:1:535: Comma
                {
                mComma(); 

                }
                break;
            case 59 :
                // InternalIoTLexer.g:1:541: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 60 :
                // InternalIoTLexer.g:1:553: FullStop
                {
                mFullStop(); 

                }
                break;
            case 61 :
                // InternalIoTLexer.g:1:562: Solidus
                {
                mSolidus(); 

                }
                break;
            case 62 :
                // InternalIoTLexer.g:1:570: Colon
                {
                mColon(); 

                }
                break;
            case 63 :
                // InternalIoTLexer.g:1:576: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 64 :
                // InternalIoTLexer.g:1:589: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 65 :
                // InternalIoTLexer.g:1:600: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 66 :
                // InternalIoTLexer.g:1:616: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 67 :
                // InternalIoTLexer.g:1:629: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 68 :
                // InternalIoTLexer.g:1:647: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 69 :
                // InternalIoTLexer.g:1:666: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // InternalIoTLexer.g:1:675: RULE_NINT
                {
                mRULE_NINT(); 

                }
                break;
            case 71 :
                // InternalIoTLexer.g:1:685: RULE_DBL
                {
                mRULE_DBL(); 

                }
                break;
            case 72 :
                // InternalIoTLexer.g:1:694: RULE_NDBL
                {
                mRULE_NDBL(); 

                }
                break;
            case 73 :
                // InternalIoTLexer.g:1:704: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 74 :
                // InternalIoTLexer.g:1:717: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 75 :
                // InternalIoTLexer.g:1:733: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // InternalIoTLexer.g:1:749: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 77 :
                // InternalIoTLexer.g:1:757: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 78 :
                // InternalIoTLexer.g:1:769: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 79 :
                // InternalIoTLexer.g:1:777: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\16\60\1\122\1\53\1\125\1\127\1\134\1\136\1\140\1\53\4\uffff\1\146\5\uffff\2\155\2\60\1\162\1\53\1\uffff\2\53\2\uffff\4\60\1\uffff\6\60\1\u0083\10\60\1\u008e\20\60\7\uffff\2\u00a1\24\uffff\1\155\2\60\1\162\3\uffff\2\60\1\u00ab\3\60\1\u00af\1\u00b0\4\60\1\u00b6\1\u00b7\1\uffff\12\60\1\uffff\17\60\1\u00d2\1\u00d3\1\u00d4\1\uffff\1\u00a1\2\60\1\uffff\3\162\2\60\1\uffff\1\60\1\u00dc\1\60\2\uffff\5\60\2\uffff\1\60\1\u00e4\2\60\1\u00e7\1\60\1\u00e9\10\60\1\u00f2\1\u00f3\3\60\1\u00f7\1\u00f8\1\u00f9\1\u00fa\1\u00fb\1\u00fc\3\uffff\1\u00f8\1\60\1\uffff\1\162\3\60\1\uffff\1\u0101\3\60\1\u00f8\2\60\1\uffff\1\60\1\u0108\1\uffff\1\60\1\uffff\1\60\1\u010b\5\60\1\u0111\2\uffff\1\60\1\u0113\1\u0114\6\uffff\1\u00f8\2\60\1\u0117\1\uffff\2\60\1\u011a\2\60\1\u011d\1\uffff\2\60\1\uffff\3\60\1\u0123\1\u0124\1\uffff\1\u0125\2\uffff\2\60\1\uffff\2\60\1\uffff\2\60\1\uffff\1\u012c\1\u012d\1\u012e\1\u012f\1\u0130\3\uffff\3\60\1\u0134\1\u0135\1\u0136\5\uffff\2\60\1\u0139\3\uffff\2\60\1\uffff\2\60\1\u013e\1\u013f\2\uffff";
    static final String DFA20_eofS =
        "\u0140\uffff";
    static final String DFA20_minS =
        "\1\0\2\141\1\142\1\141\1\150\1\170\1\144\1\141\1\145\1\157\1\141\1\151\1\162\1\141\1\75\1\46\1\52\1\56\3\75\1\174\4\uffff\1\60\5\uffff\2\56\1\162\1\141\1\52\1\101\1\uffff\2\0\2\uffff\1\143\1\141\1\144\1\160\1\uffff\1\145\1\156\2\154\1\163\1\144\1\60\1\127\1\157\1\141\1\165\1\141\1\155\1\164\1\143\1\60\1\143\1\155\1\144\1\151\1\144\1\165\2\160\1\165\1\163\1\160\1\162\1\146\1\154\1\162\1\143\7\uffff\2\56\24\uffff\1\56\1\165\1\154\1\0\3\uffff\1\162\1\154\1\60\1\151\1\156\1\145\2\60\1\161\1\143\1\164\1\163\2\60\1\uffff\1\151\1\145\1\153\1\162\1\144\1\156\1\155\1\156\1\145\1\154\1\uffff\1\157\1\163\1\160\1\145\1\160\1\144\1\165\1\164\1\151\2\145\1\163\1\145\1\164\1\151\3\60\1\uffff\1\56\1\145\1\163\4\0\1\157\1\151\1\uffff\1\141\1\60\1\154\2\uffff\1\165\1\164\2\145\1\162\2\uffff\1\156\1\60\1\145\1\144\1\60\1\156\1\60\1\141\1\164\1\156\1\165\1\156\1\157\1\154\1\166\2\60\1\143\1\145\1\143\6\60\3\uffff\1\60\1\145\1\uffff\1\0\2\163\1\156\1\uffff\1\60\1\145\1\151\1\162\1\60\1\141\1\144\1\uffff\1\162\1\60\1\uffff\1\145\1\uffff\1\156\1\60\3\144\1\162\1\145\1\60\2\uffff\1\145\2\60\6\uffff\1\60\2\145\1\60\1\uffff\1\156\1\157\1\60\1\143\1\157\1\60\1\uffff\1\154\1\144\1\uffff\1\163\1\145\1\163\2\60\1\uffff\1\60\2\uffff\2\143\1\uffff\1\143\1\156\1\uffff\1\164\1\167\1\uffff\5\60\3\uffff\2\157\1\171\3\60\5\uffff\2\156\1\60\3\uffff\2\144\1\uffff\2\163\2\60\2\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\157\1\165\1\163\1\171\1\157\1\170\1\156\1\164\1\157\1\171\1\157\1\151\1\162\1\143\1\75\1\46\1\52\1\76\3\75\1\174\4\uffff\1\71\5\uffff\1\56\1\71\1\162\1\141\1\52\1\172\1\uffff\2\uffff\2\uffff\1\156\2\144\1\170\1\uffff\1\145\1\156\2\154\1\163\1\144\1\172\1\164\1\157\1\141\1\165\1\141\1\165\1\164\1\143\1\172\1\156\1\155\1\157\1\151\1\144\1\165\2\160\1\165\1\163\1\160\1\162\1\146\1\154\1\162\1\143\7\uffff\1\56\1\71\24\uffff\1\71\1\165\1\154\1\uffff\3\uffff\1\162\1\154\1\172\1\151\1\156\1\145\2\172\1\161\1\143\1\164\1\163\2\172\1\uffff\1\151\1\145\1\153\1\162\1\144\1\162\1\155\1\156\1\145\1\154\1\uffff\1\157\1\163\1\160\1\145\1\160\1\144\1\165\1\164\1\151\2\145\1\163\1\145\1\164\1\151\3\172\1\uffff\1\71\1\145\1\163\4\uffff\1\157\1\151\1\uffff\1\141\1\172\1\154\2\uffff\1\165\1\164\2\145\1\162\2\uffff\1\156\1\172\1\145\1\144\1\172\1\156\1\172\1\141\1\164\1\156\1\165\1\156\1\157\1\154\1\166\2\172\1\143\1\145\1\143\6\172\3\uffff\1\172\1\145\1\uffff\1\uffff\2\163\1\156\1\uffff\1\172\1\145\1\151\1\162\1\172\1\141\1\144\1\uffff\1\162\1\172\1\uffff\1\145\1\uffff\1\156\1\172\3\144\1\162\1\145\1\172\2\uffff\1\145\2\172\6\uffff\1\172\2\145\1\172\1\uffff\1\156\1\157\1\172\1\143\1\157\1\172\1\uffff\1\154\1\144\1\uffff\1\163\1\145\1\163\2\172\1\uffff\1\172\2\uffff\2\143\1\uffff\1\143\1\156\1\uffff\1\164\1\167\1\uffff\5\172\3\uffff\2\157\1\171\3\172\5\uffff\2\156\1\172\3\uffff\2\144\1\uffff\2\163\2\172\2\uffff";
    static final String DFA20_acceptS =
        "\27\uffff\1\66\1\67\1\71\1\72\1\uffff\1\75\1\76\1\102\1\103\1\104\6\uffff\1\114\2\uffff\1\116\1\117\4\uffff\1\114\40\uffff\1\53\1\65\1\54\1\55\1\70\1\56\1\73\2\uffff\1\110\1\57\1\77\1\60\1\100\1\61\1\101\1\64\1\66\1\67\1\71\1\72\1\74\1\107\1\75\1\76\1\102\1\103\1\104\1\105\4\uffff\1\112\1\115\1\116\16\uffff\1\62\12\uffff\1\63\22\uffff\1\106\11\uffff\1\47\3\uffff\1\45\1\46\5\uffff\1\43\1\44\32\uffff\1\50\1\51\1\52\2\uffff\1\113\4\uffff\1\33\7\uffff\1\31\2\uffff\1\30\1\uffff\1\32\10\uffff\1\40\1\37\3\uffff\1\41\1\111\1\34\1\35\1\36\1\42\4\uffff\1\24\6\uffff\1\22\2\uffff\1\23\5\uffff\1\26\1\uffff\1\25\1\27\2\uffff\1\16\2\uffff\1\15\2\uffff\1\14\5\uffff\1\21\1\20\1\17\6\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff\1\6\1\4\1\5\2\uffff\1\3\4\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\1\0\47\uffff\1\7\1\2\107\uffff\1\3\63\uffff\1\6\1\4\1\1\1\5\57\uffff\1\10\147\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\17\1\50\1\45\2\53\1\20\1\51\1\27\1\30\1\21\1\31\1\32\1\22\1\33\1\34\1\41\11\42\1\35\1\53\1\23\1\24\1\25\1\36\1\53\5\47\1\44\15\47\1\43\6\47\1\37\1\53\1\40\1\46\1\47\1\53\1\3\1\4\1\5\1\47\1\6\1\2\2\47\1\7\3\47\1\1\2\47\1\13\1\47\1\11\1\10\1\12\1\15\1\16\1\14\3\47\1\53\1\26\uff83\53",
            "\1\57\3\uffff\1\55\3\uffff\1\54\5\uffff\1\56",
            "\1\64\7\uffff\1\63\10\uffff\1\61\2\uffff\1\62",
            "\1\65\13\uffff\1\66\4\uffff\1\67",
            "\1\73\15\uffff\1\72\2\uffff\1\71\6\uffff\1\70",
            "\1\74\6\uffff\1\75",
            "\1\76",
            "\1\100\11\uffff\1\77",
            "\1\102\3\uffff\1\101\15\uffff\1\104\1\103",
            "\1\105\11\uffff\1\106",
            "\1\107\2\uffff\1\111\6\uffff\1\110",
            "\1\112\7\uffff\1\113\5\uffff\1\114",
            "\1\115",
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
            "\1\147",
            "\1\147\1\uffff\12\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\0\163",
            "\0\163",
            "",
            "",
            "\1\165\10\uffff\1\166\1\uffff\1\167",
            "\1\171\2\uffff\1\170",
            "\1\172",
            "\1\173\7\uffff\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0084\34\uffff\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\7\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u008f\12\uffff\1\u0090",
            "\1\u0091",
            "\1\u0092\12\uffff\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\132\1\uffff\12\u00a2",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\147\1\uffff\12\156",
            "\1\u00a3",
            "\1\u00a4",
            "\12\u00a8\1\u00a6\2\u00a8\1\u00a5\34\u00a8\1\u00a7\uffd5\u00a8",
            "",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00b5\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd\3\uffff\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\132\1\uffff\12\u00a2",
            "\1\u00d5",
            "\1\u00d6",
            "\12\u00d7\1\u00a6\ufff5\u00d7",
            "\0\u00d7",
            "\12\u00a8\1\u00a6\2\u00a8\1\u00a5\25\u00a8\1\u00d8\6\u00a8\1\u00a7\uffd5\u00a8",
            "\12\u00a8\1\u00a6\2\u00a8\1\u00a5\34\u00a8\1\u00a7\uffd5\u00a8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00dd",
            "",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e5",
            "\1\u00e6",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00fd",
            "",
            "\12\u00a8\1\u00a6\2\u00a8\1\u00a5\34\u00a8\1\u00a7\uffd5\u00a8",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0109",
            "",
            "\1\u010a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0112",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0115",
            "\1\u0116",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0118",
            "\1\u0119",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011b",
            "\1\u011c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\u0129",
            "",
            "\1\u012a",
            "\1\u012b",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "\1\u0137",
            "\1\u0138",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Microseconds | Milliseconds | Frequency | Abstract | ByWindow | Function | Channel | Command | Extends | Include | Seconds | Broker | Filter | Median | Reduce | Sample | Sensor | Board | Count | Model | Route | Stdev | Topic | Baud | Byte | Char | Mean | Pass | Pipe | Port | Ssid | Stop | Type | Wifi | Abs | And | Map | Max | Min | Url | Var | Vcc | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | As | Id | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_NINT | RULE_DBL | RULE_NDBL | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='m') ) {s = 1;}

                        else if ( (LA20_0=='f') ) {s = 2;}

                        else if ( (LA20_0=='a') ) {s = 3;}

                        else if ( (LA20_0=='b') ) {s = 4;}

                        else if ( (LA20_0=='c') ) {s = 5;}

                        else if ( (LA20_0=='e') ) {s = 6;}

                        else if ( (LA20_0=='i') ) {s = 7;}

                        else if ( (LA20_0=='s') ) {s = 8;}

                        else if ( (LA20_0=='r') ) {s = 9;}

                        else if ( (LA20_0=='t') ) {s = 10;}

                        else if ( (LA20_0=='p') ) {s = 11;}

                        else if ( (LA20_0=='w') ) {s = 12;}

                        else if ( (LA20_0=='u') ) {s = 13;}

                        else if ( (LA20_0=='v') ) {s = 14;}

                        else if ( (LA20_0=='!') ) {s = 15;}

                        else if ( (LA20_0=='&') ) {s = 16;}

                        else if ( (LA20_0=='*') ) {s = 17;}

                        else if ( (LA20_0=='-') ) {s = 18;}

                        else if ( (LA20_0=='<') ) {s = 19;}

                        else if ( (LA20_0=='=') ) {s = 20;}

                        else if ( (LA20_0=='>') ) {s = 21;}

                        else if ( (LA20_0=='|') ) {s = 22;}

                        else if ( (LA20_0=='(') ) {s = 23;}

                        else if ( (LA20_0==')') ) {s = 24;}

                        else if ( (LA20_0=='+') ) {s = 25;}

                        else if ( (LA20_0==',') ) {s = 26;}

                        else if ( (LA20_0=='.') ) {s = 27;}

                        else if ( (LA20_0=='/') ) {s = 28;}

                        else if ( (LA20_0==':') ) {s = 29;}

                        else if ( (LA20_0=='?') ) {s = 30;}

                        else if ( (LA20_0=='[') ) {s = 31;}

                        else if ( (LA20_0==']') ) {s = 32;}

                        else if ( (LA20_0=='0') ) {s = 33;}

                        else if ( ((LA20_0>='1' && LA20_0<='9')) ) {s = 34;}

                        else if ( (LA20_0=='T') ) {s = 35;}

                        else if ( (LA20_0=='F') ) {s = 36;}

                        else if ( (LA20_0=='#') ) {s = 37;}

                        else if ( (LA20_0=='^') ) {s = 38;}

                        else if ( ((LA20_0>='A' && LA20_0<='E')||(LA20_0>='G' && LA20_0<='S')||(LA20_0>='U' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='d'||(LA20_0>='g' && LA20_0<='h')||(LA20_0>='j' && LA20_0<='l')||(LA20_0>='n' && LA20_0<='o')||LA20_0=='q'||(LA20_0>='x' && LA20_0<='z')) ) {s = 39;}

                        else if ( (LA20_0=='\"') ) {s = 40;}

                        else if ( (LA20_0=='\'') ) {s = 41;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 42;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||(LA20_0>='$' && LA20_0<='%')||LA20_0==';'||LA20_0=='@'||LA20_0=='\\'||LA20_0=='`'||LA20_0=='{'||(LA20_0>='}' && LA20_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_167 = input.LA(1);

                        s = -1;
                        if ( (LA20_167=='#') ) {s = 216;}

                        else if ( (LA20_167=='\r') ) {s = 165;}

                        else if ( (LA20_167=='\n') ) {s = 166;}

                        else if ( (LA20_167=='*') ) {s = 167;}

                        else if ( ((LA20_167>='\u0000' && LA20_167<='\t')||(LA20_167>='\u000B' && LA20_167<='\f')||(LA20_167>='\u000E' && LA20_167<='\"')||(LA20_167>='$' && LA20_167<=')')||(LA20_167>='+' && LA20_167<='\uFFFF')) ) {s = 168;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_41 = input.LA(1);

                        s = -1;
                        if ( ((LA20_41>='\u0000' && LA20_41<='\uFFFF')) ) {s = 115;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_113 = input.LA(1);

                        s = -1;
                        if ( (LA20_113=='\r') ) {s = 165;}

                        else if ( (LA20_113=='\n') ) {s = 166;}

                        else if ( (LA20_113=='*') ) {s = 167;}

                        else if ( ((LA20_113>='\u0000' && LA20_113<='\t')||(LA20_113>='\u000B' && LA20_113<='\f')||(LA20_113>='\u000E' && LA20_113<=')')||(LA20_113>='+' && LA20_113<='\uFFFF')) ) {s = 168;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_166 = input.LA(1);

                        s = -1;
                        if ( ((LA20_166>='\u0000' && LA20_166<='\uFFFF')) ) {s = 215;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_168 = input.LA(1);

                        s = -1;
                        if ( (LA20_168=='\r') ) {s = 165;}

                        else if ( (LA20_168=='\n') ) {s = 166;}

                        else if ( (LA20_168=='*') ) {s = 167;}

                        else if ( ((LA20_168>='\u0000' && LA20_168<='\t')||(LA20_168>='\u000B' && LA20_168<='\f')||(LA20_168>='\u000E' && LA20_168<=')')||(LA20_168>='+' && LA20_168<='\uFFFF')) ) {s = 168;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_165 = input.LA(1);

                        s = -1;
                        if ( (LA20_165=='\n') ) {s = 166;}

                        else if ( ((LA20_165>='\u0000' && LA20_165<='\t')||(LA20_165>='\u000B' && LA20_165<='\uFFFF')) ) {s = 215;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_40 = input.LA(1);

                        s = -1;
                        if ( ((LA20_40>='\u0000' && LA20_40<='\uFFFF')) ) {s = 115;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_216 = input.LA(1);

                        s = -1;
                        if ( (LA20_216=='\r') ) {s = 165;}

                        else if ( (LA20_216=='\n') ) {s = 166;}

                        else if ( (LA20_216=='*') ) {s = 167;}

                        else if ( ((LA20_216>='\u0000' && LA20_216<='\t')||(LA20_216>='\u000B' && LA20_216<='\f')||(LA20_216>='\u000E' && LA20_216<=')')||(LA20_216>='+' && LA20_216<='\uFFFF')) ) {s = 168;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}