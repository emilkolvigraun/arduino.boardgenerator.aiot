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
    public static final int RULE_NINT=67;
    public static final int RULE_BEGIN=64;
    public static final int Port=27;
    public static final int Include=13;
    public static final int Median=16;
    public static final int RULE_BOOLEAN=70;
    public static final int LessThanSign=58;
    public static final int Board=19;
    public static final int LeftParenthesis=49;
    public static final int Pass=25;
    public static final int ByWindow=7;
    public static final int Extends=12;
    public static final int Wifi=30;
    public static final int Route=21;
    public static final int RightSquareBracket=63;
    public static final int ExclamationMark=48;
    public static final int GreaterThanSign=60;
    public static final int RULE_ID=73;
    public static final int Channel=10;
    public static final int RightParenthesis=50;
    public static final int GreaterThanSignEqualsSign=42;
    public static final int Baud=23;
    public static final int EqualsSignEqualsSign=41;
    public static final int Min=34;
    public static final int And=31;
    public static final int PlusSign=52;
    public static final int RULE_INT=66;
    public static final int Vcc=35;
    public static final int AsteriskAsterisk=38;
    public static final int RULE_ML_COMMENT=72;
    public static final int LeftSquareBracket=62;
    public static final int Id=45;
    public static final int Ssid=28;
    public static final int Map=32;
    public static final int Interval=9;
    public static final int Sensor=18;
    public static final int Mean=24;
    public static final int RULE_END=65;
    public static final int Max=33;
    public static final int RULE_NDBL=69;
    public static final int VerticalLineVerticalLine=47;
    public static final int Ip=46;
    public static final int RULE_STRING=74;
    public static final int RULE_SL_COMMENT=71;
    public static final int Function=8;
    public static final int SD=43;
    public static final int Comma=53;
    public static final int EqualsSign=59;
    public static final int As=44;
    public static final int HyphenMinus=54;
    public static final int AmpersandAmpersand=37;
    public static final int LessThanSignEqualsSign=40;
    public static final int Solidus=56;
    public static final int Colon=57;
    public static final int Topic=22;
    public static final int EOF=-1;
    public static final int Asterisk=51;
    public static final int FullStop=55;
    public static final int Broker=15;
    public static final int RULE_WS=75;
    public static final int Abstract=6;
    public static final int Sample=17;
    public static final int Pipe=26;
    public static final int RULE_ANY_OTHER=76;
    public static final int Milliseconds=5;
    public static final int Microseconds=4;
    public static final int RULE_DBL=68;
    public static final int Type=29;
    public static final int Command=11;
    public static final int QuestionMark=61;
    public static final int Model=20;
    public static final int Seconds=14;
    public static final int ExclamationMarkEqualsSign=36;
    public static final int HyphenMinusGreaterThanSign=39;

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

    // $ANTLR start "Abstract"
    public final void mAbstract() throws RecognitionException {
        try {
            int _type = Abstract;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:18:10: ( 'abstract' )
            // InternalIoTLexer.g:18:12: 'abstract'
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
            // InternalIoTLexer.g:20:10: ( 'byWindow' )
            // InternalIoTLexer.g:20:12: 'byWindow'
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
            // InternalIoTLexer.g:22:10: ( 'function' )
            // InternalIoTLexer.g:22:12: 'function'
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

    // $ANTLR start "Interval"
    public final void mInterval() throws RecognitionException {
        try {
            int _type = Interval;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:24:10: ( 'interval' )
            // InternalIoTLexer.g:24:12: 'interval'
            {
            match("interval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interval"

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

    // $ANTLR start "Median"
    public final void mMedian() throws RecognitionException {
        try {
            int _type = Median;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:38:8: ( 'median' )
            // InternalIoTLexer.g:38:10: 'median'
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

    // $ANTLR start "Sample"
    public final void mSample() throws RecognitionException {
        try {
            int _type = Sample;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:40:8: ( 'sample' )
            // InternalIoTLexer.g:40:10: 'sample'
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
            // InternalIoTLexer.g:42:8: ( 'sensor' )
            // InternalIoTLexer.g:42:10: 'sensor'
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
            // InternalIoTLexer.g:44:7: ( 'board' )
            // InternalIoTLexer.g:44:9: 'board'
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

    // $ANTLR start "Model"
    public final void mModel() throws RecognitionException {
        try {
            int _type = Model;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:46:7: ( 'model' )
            // InternalIoTLexer.g:46:9: 'model'
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
            // InternalIoTLexer.g:48:7: ( 'route' )
            // InternalIoTLexer.g:48:9: 'route'
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

    // $ANTLR start "Topic"
    public final void mTopic() throws RecognitionException {
        try {
            int _type = Topic;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:50:7: ( 'topic' )
            // InternalIoTLexer.g:50:9: 'topic'
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
            // InternalIoTLexer.g:52:6: ( 'baud' )
            // InternalIoTLexer.g:52:8: 'baud'
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

    // $ANTLR start "Mean"
    public final void mMean() throws RecognitionException {
        try {
            int _type = Mean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:54:6: ( 'mean' )
            // InternalIoTLexer.g:54:8: 'mean'
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
            // InternalIoTLexer.g:56:6: ( 'pass' )
            // InternalIoTLexer.g:56:8: 'pass'
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
            // InternalIoTLexer.g:58:6: ( 'pipe' )
            // InternalIoTLexer.g:58:8: 'pipe'
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
            // InternalIoTLexer.g:60:6: ( 'port' )
            // InternalIoTLexer.g:60:8: 'port'
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
            // InternalIoTLexer.g:62:6: ( 'ssid' )
            // InternalIoTLexer.g:62:8: 'ssid'
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

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:64:6: ( 'type' )
            // InternalIoTLexer.g:64:8: 'type'
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
            // InternalIoTLexer.g:66:6: ( 'wifi' )
            // InternalIoTLexer.g:66:8: 'wifi'
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

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:68:5: ( 'and' )
            // InternalIoTLexer.g:68:7: 'and'
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
            // InternalIoTLexer.g:70:5: ( 'map' )
            // InternalIoTLexer.g:70:7: 'map'
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
            // InternalIoTLexer.g:72:5: ( 'max' )
            // InternalIoTLexer.g:72:7: 'max'
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
            // InternalIoTLexer.g:74:5: ( 'min' )
            // InternalIoTLexer.g:74:7: 'min'
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

    // $ANTLR start "Vcc"
    public final void mVcc() throws RecognitionException {
        try {
            int _type = Vcc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:76:5: ( 'vcc' )
            // InternalIoTLexer.g:76:7: 'vcc'
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
            // InternalIoTLexer.g:78:27: ( '!=' )
            // InternalIoTLexer.g:78:29: '!='
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
            // InternalIoTLexer.g:80:20: ( '&&' )
            // InternalIoTLexer.g:80:22: '&&'
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
            // InternalIoTLexer.g:82:18: ( '**' )
            // InternalIoTLexer.g:82:20: '**'
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
            // InternalIoTLexer.g:84:28: ( '->' )
            // InternalIoTLexer.g:84:30: '->'
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
            // InternalIoTLexer.g:86:24: ( '<=' )
            // InternalIoTLexer.g:86:26: '<='
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
            // InternalIoTLexer.g:88:22: ( '==' )
            // InternalIoTLexer.g:88:24: '=='
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
            // InternalIoTLexer.g:90:27: ( '>=' )
            // InternalIoTLexer.g:90:29: '>='
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

    // $ANTLR start "SD"
    public final void mSD() throws RecognitionException {
        try {
            int _type = SD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:92:4: ( 'SD' )
            // InternalIoTLexer.g:92:6: 'SD'
            {
            match("SD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SD"

    // $ANTLR start "As"
    public final void mAs() throws RecognitionException {
        try {
            int _type = As;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:94:4: ( 'as' )
            // InternalIoTLexer.g:94:6: 'as'
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
            // InternalIoTLexer.g:96:4: ( 'id' )
            // InternalIoTLexer.g:96:6: 'id'
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

    // $ANTLR start "Ip"
    public final void mIp() throws RecognitionException {
        try {
            int _type = Ip;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:98:4: ( 'ip' )
            // InternalIoTLexer.g:98:6: 'ip'
            {
            match("ip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ip"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:100:26: ( '||' )
            // InternalIoTLexer.g:100:28: '||'
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
            // InternalIoTLexer.g:102:17: ( '!' )
            // InternalIoTLexer.g:102:19: '!'
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
            // InternalIoTLexer.g:104:17: ( '(' )
            // InternalIoTLexer.g:104:19: '('
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
            // InternalIoTLexer.g:106:18: ( ')' )
            // InternalIoTLexer.g:106:20: ')'
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
            // InternalIoTLexer.g:108:10: ( '*' )
            // InternalIoTLexer.g:108:12: '*'
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
            // InternalIoTLexer.g:110:10: ( '+' )
            // InternalIoTLexer.g:110:12: '+'
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
            // InternalIoTLexer.g:112:7: ( ',' )
            // InternalIoTLexer.g:112:9: ','
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
            // InternalIoTLexer.g:114:13: ( '-' )
            // InternalIoTLexer.g:114:15: '-'
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
            // InternalIoTLexer.g:116:10: ( '.' )
            // InternalIoTLexer.g:116:12: '.'
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
            // InternalIoTLexer.g:118:9: ( '/' )
            // InternalIoTLexer.g:118:11: '/'
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
            // InternalIoTLexer.g:120:7: ( ':' )
            // InternalIoTLexer.g:120:9: ':'
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
            // InternalIoTLexer.g:122:14: ( '<' )
            // InternalIoTLexer.g:122:16: '<'
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
            // InternalIoTLexer.g:124:12: ( '=' )
            // InternalIoTLexer.g:124:14: '='
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
            // InternalIoTLexer.g:126:17: ( '>' )
            // InternalIoTLexer.g:126:19: '>'
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
            // InternalIoTLexer.g:128:14: ( '?' )
            // InternalIoTLexer.g:128:16: '?'
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
            // InternalIoTLexer.g:130:19: ( '[' )
            // InternalIoTLexer.g:130:21: '['
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
            // InternalIoTLexer.g:132:20: ( ']' )
            // InternalIoTLexer.g:132:22: ']'
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
            // InternalIoTLexer.g:134:21: ()
            // InternalIoTLexer.g:134:23: 
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
            // InternalIoTLexer.g:136:19: ()
            // InternalIoTLexer.g:136:21: 
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
            // InternalIoTLexer.g:138:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalIoTLexer.g:138:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalIoTLexer.g:138:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalIoTLexer.g:138:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:138:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalIoTLexer.g:138:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalIoTLexer.g:138:27: '0' .. '9'
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
            // InternalIoTLexer.g:140:11: ( '-' ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalIoTLexer.g:140:13: '-' ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            match('-'); 
            // InternalIoTLexer.g:140:17: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalIoTLexer.g:140:18: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:140:22: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalIoTLexer.g:140:31: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalIoTLexer.g:140:32: '0' .. '9'
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
            // InternalIoTLexer.g:142:10: ( ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalIoTLexer.g:142:12: ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            // InternalIoTLexer.g:142:12: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoTLexer.g:142:12: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalIoTLexer.g:142:26: ( '0' .. '9' )+
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
            	    // InternalIoTLexer.g:142:27: '0' .. '9'
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
            // InternalIoTLexer.g:144:11: ( '-' ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalIoTLexer.g:144:13: '-' ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            match('-'); 
            // InternalIoTLexer.g:144:17: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoTLexer.g:144:17: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalIoTLexer.g:144:31: ( '0' .. '9' )+
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
            	    // InternalIoTLexer.g:144:32: '0' .. '9'
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
            // InternalIoTLexer.g:146:14: ( ( 'true' | 'false' ) )
            // InternalIoTLexer.g:146:16: ( 'true' | 'false' )
            {
            // InternalIoTLexer.g:146:16: ( 'true' | 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='t') ) {
                alt9=1;
            }
            else if ( (LA9_0=='f') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoTLexer.g:146:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:146:24: 'false'
                    {
                    match("false"); 


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
            // InternalIoTLexer.g:148:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIoTLexer.g:148:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalIoTLexer.g:148:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIoTLexer.g:148:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalIoTLexer.g:148:39: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoTLexer.g:148:40: ( '\\r' )? '\\n'
                    {
                    // InternalIoTLexer.g:148:40: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalIoTLexer.g:148:40: '\\r'
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
            // InternalIoTLexer.g:150:17: ( '#*' ( options {greedy=false; } : . )* '*#' )
            // InternalIoTLexer.g:150:19: '#*' ( options {greedy=false; } : . )* '*#'
            {
            match("#*"); 

            // InternalIoTLexer.g:150:24: ( options {greedy=false; } : . )*
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
            	    // InternalIoTLexer.g:150:52: .
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
            // InternalIoTLexer.g:152:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIoTLexer.g:152:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIoTLexer.g:152:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoTLexer.g:152:11: '^'
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

            // InternalIoTLexer.g:152:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalIoTLexer.g:154:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIoTLexer.g:154:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIoTLexer.g:154:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalIoTLexer.g:154:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIoTLexer.g:154:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalIoTLexer.g:154:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:154:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalIoTLexer.g:154:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIoTLexer.g:154:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalIoTLexer.g:154:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:154:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalIoTLexer.g:156:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIoTLexer.g:156:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIoTLexer.g:156:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalIoTLexer.g:158:16: ( . )
            // InternalIoTLexer.g:158:18: .
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
        // InternalIoTLexer.g:1:8: ( Microseconds | Milliseconds | Abstract | ByWindow | Function | Interval | Channel | Command | Extends | Include | Seconds | Broker | Median | Sample | Sensor | Board | Model | Route | Topic | Baud | Mean | Pass | Pipe | Port | Ssid | Type | Wifi | And | Map | Max | Min | Vcc | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | SD | As | Id | Ip | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_NINT | RULE_DBL | RULE_NDBL | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt20=71;
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
                // InternalIoTLexer.g:1:36: Abstract
                {
                mAbstract(); 

                }
                break;
            case 4 :
                // InternalIoTLexer.g:1:45: ByWindow
                {
                mByWindow(); 

                }
                break;
            case 5 :
                // InternalIoTLexer.g:1:54: Function
                {
                mFunction(); 

                }
                break;
            case 6 :
                // InternalIoTLexer.g:1:63: Interval
                {
                mInterval(); 

                }
                break;
            case 7 :
                // InternalIoTLexer.g:1:72: Channel
                {
                mChannel(); 

                }
                break;
            case 8 :
                // InternalIoTLexer.g:1:80: Command
                {
                mCommand(); 

                }
                break;
            case 9 :
                // InternalIoTLexer.g:1:88: Extends
                {
                mExtends(); 

                }
                break;
            case 10 :
                // InternalIoTLexer.g:1:96: Include
                {
                mInclude(); 

                }
                break;
            case 11 :
                // InternalIoTLexer.g:1:104: Seconds
                {
                mSeconds(); 

                }
                break;
            case 12 :
                // InternalIoTLexer.g:1:112: Broker
                {
                mBroker(); 

                }
                break;
            case 13 :
                // InternalIoTLexer.g:1:119: Median
                {
                mMedian(); 

                }
                break;
            case 14 :
                // InternalIoTLexer.g:1:126: Sample
                {
                mSample(); 

                }
                break;
            case 15 :
                // InternalIoTLexer.g:1:133: Sensor
                {
                mSensor(); 

                }
                break;
            case 16 :
                // InternalIoTLexer.g:1:140: Board
                {
                mBoard(); 

                }
                break;
            case 17 :
                // InternalIoTLexer.g:1:146: Model
                {
                mModel(); 

                }
                break;
            case 18 :
                // InternalIoTLexer.g:1:152: Route
                {
                mRoute(); 

                }
                break;
            case 19 :
                // InternalIoTLexer.g:1:158: Topic
                {
                mTopic(); 

                }
                break;
            case 20 :
                // InternalIoTLexer.g:1:164: Baud
                {
                mBaud(); 

                }
                break;
            case 21 :
                // InternalIoTLexer.g:1:169: Mean
                {
                mMean(); 

                }
                break;
            case 22 :
                // InternalIoTLexer.g:1:174: Pass
                {
                mPass(); 

                }
                break;
            case 23 :
                // InternalIoTLexer.g:1:179: Pipe
                {
                mPipe(); 

                }
                break;
            case 24 :
                // InternalIoTLexer.g:1:184: Port
                {
                mPort(); 

                }
                break;
            case 25 :
                // InternalIoTLexer.g:1:189: Ssid
                {
                mSsid(); 

                }
                break;
            case 26 :
                // InternalIoTLexer.g:1:194: Type
                {
                mType(); 

                }
                break;
            case 27 :
                // InternalIoTLexer.g:1:199: Wifi
                {
                mWifi(); 

                }
                break;
            case 28 :
                // InternalIoTLexer.g:1:204: And
                {
                mAnd(); 

                }
                break;
            case 29 :
                // InternalIoTLexer.g:1:208: Map
                {
                mMap(); 

                }
                break;
            case 30 :
                // InternalIoTLexer.g:1:212: Max
                {
                mMax(); 

                }
                break;
            case 31 :
                // InternalIoTLexer.g:1:216: Min
                {
                mMin(); 

                }
                break;
            case 32 :
                // InternalIoTLexer.g:1:220: Vcc
                {
                mVcc(); 

                }
                break;
            case 33 :
                // InternalIoTLexer.g:1:224: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 34 :
                // InternalIoTLexer.g:1:250: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 35 :
                // InternalIoTLexer.g:1:269: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 36 :
                // InternalIoTLexer.g:1:286: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 37 :
                // InternalIoTLexer.g:1:313: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 38 :
                // InternalIoTLexer.g:1:336: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 39 :
                // InternalIoTLexer.g:1:357: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 40 :
                // InternalIoTLexer.g:1:383: SD
                {
                mSD(); 

                }
                break;
            case 41 :
                // InternalIoTLexer.g:1:386: As
                {
                mAs(); 

                }
                break;
            case 42 :
                // InternalIoTLexer.g:1:389: Id
                {
                mId(); 

                }
                break;
            case 43 :
                // InternalIoTLexer.g:1:392: Ip
                {
                mIp(); 

                }
                break;
            case 44 :
                // InternalIoTLexer.g:1:395: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 45 :
                // InternalIoTLexer.g:1:420: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 46 :
                // InternalIoTLexer.g:1:436: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 47 :
                // InternalIoTLexer.g:1:452: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 48 :
                // InternalIoTLexer.g:1:469: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 49 :
                // InternalIoTLexer.g:1:478: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 50 :
                // InternalIoTLexer.g:1:487: Comma
                {
                mComma(); 

                }
                break;
            case 51 :
                // InternalIoTLexer.g:1:493: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 52 :
                // InternalIoTLexer.g:1:505: FullStop
                {
                mFullStop(); 

                }
                break;
            case 53 :
                // InternalIoTLexer.g:1:514: Solidus
                {
                mSolidus(); 

                }
                break;
            case 54 :
                // InternalIoTLexer.g:1:522: Colon
                {
                mColon(); 

                }
                break;
            case 55 :
                // InternalIoTLexer.g:1:528: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 56 :
                // InternalIoTLexer.g:1:541: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 57 :
                // InternalIoTLexer.g:1:552: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 58 :
                // InternalIoTLexer.g:1:568: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 59 :
                // InternalIoTLexer.g:1:581: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 60 :
                // InternalIoTLexer.g:1:599: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 61 :
                // InternalIoTLexer.g:1:618: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 62 :
                // InternalIoTLexer.g:1:627: RULE_NINT
                {
                mRULE_NINT(); 

                }
                break;
            case 63 :
                // InternalIoTLexer.g:1:637: RULE_DBL
                {
                mRULE_DBL(); 

                }
                break;
            case 64 :
                // InternalIoTLexer.g:1:646: RULE_NDBL
                {
                mRULE_NDBL(); 

                }
                break;
            case 65 :
                // InternalIoTLexer.g:1:656: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 66 :
                // InternalIoTLexer.g:1:669: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 67 :
                // InternalIoTLexer.g:1:685: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 68 :
                // InternalIoTLexer.g:1:701: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // InternalIoTLexer.g:1:709: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // InternalIoTLexer.g:1:721: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 71 :
                // InternalIoTLexer.g:1:729: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\15\56\1\113\1\51\1\116\1\120\1\125\1\127\1\131\1\56\1\51\4\uffff\1\140\5\uffff\2\147\1\152\1\51\1\uffff\2\51\2\uffff\4\56\1\uffff\2\56\1\167\7\56\1\u0080\1\u0081\17\56\7\uffff\2\u0092\7\uffff\1\u0094\15\uffff\1\147\1\152\3\uffff\2\56\1\u009b\3\56\1\u009f\1\u00a0\1\56\1\u00a2\1\uffff\10\56\2\uffff\17\56\1\u00ba\1\uffff\1\u0092\2\uffff\3\152\2\56\1\uffff\1\56\1\u00c0\1\56\2\uffff\1\56\1\uffff\3\56\1\u00c6\12\56\1\u00d1\2\56\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8\1\u00d9\2\uffff\1\152\3\56\1\uffff\1\u00dd\3\56\1\u00e1\1\uffff\1\56\1\u00d5\10\56\1\uffff\1\u00eb\1\u00ec\6\uffff\2\56\1\u00ef\1\uffff\2\56\1\u00f2\1\uffff\7\56\1\u00fa\1\u00fb\2\uffff\2\56\1\uffff\2\56\1\uffff\2\56\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\2\uffff\2\56\1\u0109\1\u010a\1\u010b\1\u010c\5\uffff\2\56\4\uffff\4\56\1\u0113\1\u0114\2\uffff";
    static final String DFA20_eofS =
        "\u0115\uffff";
    static final String DFA20_minS =
        "\1\0\1\141\1\142\2\141\1\144\1\150\1\170\1\141\2\157\1\141\1\151\1\143\1\75\1\46\1\52\1\56\3\75\1\104\1\174\4\uffff\1\60\5\uffff\2\56\1\52\1\101\1\uffff\2\0\2\uffff\1\143\1\141\1\144\1\160\1\uffff\1\163\1\144\1\60\1\127\1\157\1\141\1\165\1\156\1\154\1\143\2\60\1\141\1\155\1\164\1\143\1\155\1\151\1\165\2\160\1\165\1\163\1\160\1\162\1\146\1\143\7\uffff\2\56\7\uffff\1\60\15\uffff\1\56\1\0\3\uffff\1\162\1\154\1\60\1\151\1\156\1\145\2\60\1\164\1\60\1\uffff\1\151\1\153\1\162\1\144\1\143\1\163\1\145\1\154\2\uffff\1\156\1\155\1\145\1\157\1\163\1\160\1\144\1\164\1\151\2\145\1\163\1\145\1\164\1\151\1\60\1\uffff\1\56\1\uffff\4\0\1\157\1\151\1\uffff\1\141\1\60\1\154\2\uffff\1\162\1\uffff\1\156\1\145\1\144\1\60\1\164\1\145\1\162\1\165\1\156\1\141\2\156\1\157\1\154\1\60\1\145\1\143\6\60\2\uffff\1\0\2\163\1\156\1\uffff\1\60\1\141\1\144\1\162\1\60\1\uffff\1\151\1\60\1\166\1\144\1\145\1\156\2\144\1\162\1\145\1\uffff\2\60\6\uffff\2\145\1\60\1\uffff\1\143\1\157\1\60\1\uffff\1\157\1\141\1\145\1\154\1\144\2\163\2\60\2\uffff\2\143\1\uffff\1\164\1\167\1\uffff\1\156\1\154\5\60\2\uffff\2\157\4\60\5\uffff\2\156\4\uffff\2\144\2\163\2\60\2\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\157\1\163\1\171\1\165\1\160\1\157\1\170\1\163\1\157\1\171\1\157\1\151\1\143\1\75\1\46\1\52\1\76\3\75\1\104\1\174\4\uffff\1\71\5\uffff\1\56\1\71\1\52\1\172\1\uffff\2\uffff\2\uffff\1\156\2\144\1\170\1\uffff\1\163\1\144\1\172\1\127\1\157\1\141\1\165\1\156\1\154\1\164\2\172\1\141\1\155\1\164\1\156\1\155\1\151\1\165\2\160\1\165\1\163\1\160\1\162\1\146\1\143\7\uffff\1\56\1\71\7\uffff\1\172\15\uffff\1\71\1\uffff\3\uffff\1\162\1\154\1\172\1\151\1\156\1\145\2\172\1\164\1\172\1\uffff\1\151\1\153\1\162\1\144\1\143\1\163\1\145\1\154\2\uffff\1\156\1\155\1\145\1\157\1\163\1\160\1\144\1\164\1\151\2\145\1\163\1\145\1\164\1\151\1\172\1\uffff\1\71\1\uffff\4\uffff\1\157\1\151\1\uffff\1\141\1\172\1\154\2\uffff\1\162\1\uffff\1\156\1\145\1\144\1\172\1\164\1\145\1\162\1\165\1\156\1\141\2\156\1\157\1\154\1\172\1\145\1\143\6\172\2\uffff\1\uffff\2\163\1\156\1\uffff\1\172\1\141\1\144\1\162\1\172\1\uffff\1\151\1\172\1\166\1\144\1\145\1\156\2\144\1\162\1\145\1\uffff\2\172\6\uffff\2\145\1\172\1\uffff\1\143\1\157\1\172\1\uffff\1\157\1\141\1\145\1\154\1\144\2\163\2\172\2\uffff\2\143\1\uffff\1\164\1\167\1\uffff\1\156\1\154\5\172\2\uffff\2\157\4\172\5\uffff\2\156\4\uffff\2\144\2\163\2\172\2\uffff";
    static final String DFA20_acceptS =
        "\27\uffff\1\56\1\57\1\61\1\62\1\uffff\1\65\1\66\1\72\1\73\1\74\4\uffff\1\104\2\uffff\1\106\1\107\4\uffff\1\104\33\uffff\1\41\1\55\1\42\1\43\1\60\1\44\1\63\2\uffff\1\100\1\45\1\67\1\46\1\70\1\47\1\71\1\uffff\1\54\1\56\1\57\1\61\1\62\1\64\1\77\1\65\1\66\1\72\1\73\1\74\1\75\2\uffff\1\102\1\105\1\106\12\uffff\1\51\10\uffff\1\52\1\53\20\uffff\1\76\1\uffff\1\50\6\uffff\1\37\3\uffff\1\35\1\36\1\uffff\1\34\27\uffff\1\40\1\103\4\uffff\1\25\5\uffff\1\24\12\uffff\1\31\2\uffff\1\32\1\101\1\26\1\27\1\30\1\33\3\uffff\1\21\3\uffff\1\20\11\uffff\1\22\1\23\2\uffff\1\15\2\uffff\1\14\7\uffff\1\17\1\16\6\uffff\1\12\1\7\1\10\1\11\1\13\2\uffff\1\3\1\4\1\5\1\6\6\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\1\0\45\uffff\1\3\1\10\101\uffff\1\6\53\uffff\1\4\1\7\1\2\1\1\43\uffff\1\5\130\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\16\1\46\1\43\2\51\1\17\1\47\1\27\1\30\1\20\1\31\1\32\1\21\1\33\1\34\1\41\11\42\1\35\1\51\1\22\1\23\1\24\1\36\1\51\22\45\1\25\7\45\1\37\1\51\1\40\1\44\1\45\1\51\1\2\1\3\1\6\1\45\1\7\1\4\2\45\1\5\3\45\1\1\2\45\1\13\1\45\1\11\1\10\1\12\1\45\1\15\1\14\3\45\1\51\1\26\uff83\51",
            "\1\55\3\uffff\1\53\3\uffff\1\52\5\uffff\1\54",
            "\1\57\13\uffff\1\60\4\uffff\1\61",
            "\1\65\15\uffff\1\64\2\uffff\1\63\6\uffff\1\62",
            "\1\67\23\uffff\1\66",
            "\1\71\11\uffff\1\70\1\uffff\1\72",
            "\1\73\6\uffff\1\74",
            "\1\75",
            "\1\77\3\uffff\1\76\15\uffff\1\100",
            "\1\101",
            "\1\102\2\uffff\1\104\6\uffff\1\103",
            "\1\105\7\uffff\1\106\5\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\114",
            "\1\115",
            "\1\123\1\uffff\1\121\11\122\4\uffff\1\117",
            "\1\124",
            "\1\126",
            "\1\130",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "\12\141",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\141\1\uffff\12\150",
            "\1\151",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\0\153",
            "\0\153",
            "",
            "",
            "\1\155\10\uffff\1\156\1\uffff\1\157",
            "\1\161\2\uffff\1\160",
            "\1\162",
            "\1\163\7\uffff\1\164",
            "",
            "\1\165",
            "\1\166",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\177\20\uffff\1\176",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\12\uffff\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\123\1\uffff\12\u0093",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            "\1\141\1\uffff\12\150",
            "\12\u0098\1\u0096\2\u0098\1\u0095\34\u0098\1\u0097\uffd5\u0098",
            "",
            "",
            "",
            "\1\u0099",
            "\1\u009a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\123\1\uffff\12\u0093",
            "",
            "\12\u00bb\1\u0096\ufff5\u00bb",
            "\0\u00bb",
            "\12\u0098\1\u0096\2\u0098\1\u0095\25\u0098\1\u00bc\6\u0098\1\u0097\uffd5\u0098",
            "\12\u0098\1\u0096\2\u0098\1\u0095\34\u0098\1\u0097\uffd5\u0098",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c1",
            "",
            "",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00d2",
            "\1\u00d3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\u0098\1\u0096\2\u0098\1\u0095\34\u0098\1\u0097\uffd5\u0098",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00e2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0107",
            "\1\u0108",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "\1\u010d",
            "\1\u010e",
            "",
            "",
            "",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            return "1:1: Tokens : ( Microseconds | Milliseconds | Abstract | ByWindow | Function | Interval | Channel | Command | Extends | Include | Seconds | Broker | Median | Sample | Sensor | Board | Model | Route | Topic | Baud | Mean | Pass | Pipe | Port | Ssid | Type | Wifi | And | Map | Max | Min | Vcc | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | SD | As | Id | Ip | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_NINT | RULE_DBL | RULE_NDBL | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='m') ) {s = 1;}

                        else if ( (LA20_0=='a') ) {s = 2;}

                        else if ( (LA20_0=='b') ) {s = 3;}

                        else if ( (LA20_0=='f') ) {s = 4;}

                        else if ( (LA20_0=='i') ) {s = 5;}

                        else if ( (LA20_0=='c') ) {s = 6;}

                        else if ( (LA20_0=='e') ) {s = 7;}

                        else if ( (LA20_0=='s') ) {s = 8;}

                        else if ( (LA20_0=='r') ) {s = 9;}

                        else if ( (LA20_0=='t') ) {s = 10;}

                        else if ( (LA20_0=='p') ) {s = 11;}

                        else if ( (LA20_0=='w') ) {s = 12;}

                        else if ( (LA20_0=='v') ) {s = 13;}

                        else if ( (LA20_0=='!') ) {s = 14;}

                        else if ( (LA20_0=='&') ) {s = 15;}

                        else if ( (LA20_0=='*') ) {s = 16;}

                        else if ( (LA20_0=='-') ) {s = 17;}

                        else if ( (LA20_0=='<') ) {s = 18;}

                        else if ( (LA20_0=='=') ) {s = 19;}

                        else if ( (LA20_0=='>') ) {s = 20;}

                        else if ( (LA20_0=='S') ) {s = 21;}

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

                        else if ( (LA20_0=='#') ) {s = 35;}

                        else if ( (LA20_0=='^') ) {s = 36;}

                        else if ( ((LA20_0>='A' && LA20_0<='R')||(LA20_0>='T' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='d'||(LA20_0>='g' && LA20_0<='h')||(LA20_0>='j' && LA20_0<='l')||(LA20_0>='n' && LA20_0<='o')||LA20_0=='q'||LA20_0=='u'||(LA20_0>='x' && LA20_0<='z')) ) {s = 37;}

                        else if ( (LA20_0=='\"') ) {s = 38;}

                        else if ( (LA20_0=='\'') ) {s = 39;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 40;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||(LA20_0>='$' && LA20_0<='%')||LA20_0==';'||LA20_0=='@'||LA20_0=='\\'||LA20_0=='`'||LA20_0=='{'||(LA20_0>='}' && LA20_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_152 = input.LA(1);

                        s = -1;
                        if ( (LA20_152=='\r') ) {s = 149;}

                        else if ( (LA20_152=='\n') ) {s = 150;}

                        else if ( (LA20_152=='*') ) {s = 151;}

                        else if ( ((LA20_152>='\u0000' && LA20_152<='\t')||(LA20_152>='\u000B' && LA20_152<='\f')||(LA20_152>='\u000E' && LA20_152<=')')||(LA20_152>='+' && LA20_152<='\uFFFF')) ) {s = 152;}

                        else s = 106;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_151 = input.LA(1);

                        s = -1;
                        if ( (LA20_151=='#') ) {s = 188;}

                        else if ( (LA20_151=='\r') ) {s = 149;}

                        else if ( (LA20_151=='\n') ) {s = 150;}

                        else if ( (LA20_151=='*') ) {s = 151;}

                        else if ( ((LA20_151>='\u0000' && LA20_151<='\t')||(LA20_151>='\u000B' && LA20_151<='\f')||(LA20_151>='\u000E' && LA20_151<='\"')||(LA20_151>='$' && LA20_151<=')')||(LA20_151>='+' && LA20_151<='\uFFFF')) ) {s = 152;}

                        else s = 106;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_38 = input.LA(1);

                        s = -1;
                        if ( ((LA20_38>='\u0000' && LA20_38<='\uFFFF')) ) {s = 107;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_149 = input.LA(1);

                        s = -1;
                        if ( (LA20_149=='\n') ) {s = 150;}

                        else if ( ((LA20_149>='\u0000' && LA20_149<='\t')||(LA20_149>='\u000B' && LA20_149<='\uFFFF')) ) {s = 187;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_188 = input.LA(1);

                        s = -1;
                        if ( (LA20_188=='\r') ) {s = 149;}

                        else if ( (LA20_188=='\n') ) {s = 150;}

                        else if ( (LA20_188=='*') ) {s = 151;}

                        else if ( ((LA20_188>='\u0000' && LA20_188<='\t')||(LA20_188>='\u000B' && LA20_188<='\f')||(LA20_188>='\u000E' && LA20_188<=')')||(LA20_188>='+' && LA20_188<='\uFFFF')) ) {s = 152;}

                        else s = 106;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_105 = input.LA(1);

                        s = -1;
                        if ( (LA20_105=='\r') ) {s = 149;}

                        else if ( (LA20_105=='\n') ) {s = 150;}

                        else if ( (LA20_105=='*') ) {s = 151;}

                        else if ( ((LA20_105>='\u0000' && LA20_105<='\t')||(LA20_105>='\u000B' && LA20_105<='\f')||(LA20_105>='\u000E' && LA20_105<=')')||(LA20_105>='+' && LA20_105<='\uFFFF')) ) {s = 152;}

                        else s = 106;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_150 = input.LA(1);

                        s = -1;
                        if ( ((LA20_150>='\u0000' && LA20_150<='\uFFFF')) ) {s = 187;}

                        else s = 106;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_39 = input.LA(1);

                        s = -1;
                        if ( ((LA20_39>='\u0000' && LA20_39<='\uFFFF')) ) {s = 107;}

                        else s = 41;

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