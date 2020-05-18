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
    public static final int RULE_NINT=72;
    public static final int RULE_BEGIN=69;
    public static final int Stop=35;
    public static final int Port=33;
    public static final int Include=12;
    public static final int Median=16;
    public static final int RULE_BOOLEAN=76;
    public static final int Count=22;
    public static final int RULE_SCI=75;
    public static final int LessThanSign=63;
    public static final int Board=21;
    public static final int LeftParenthesis=54;
    public static final int Pass=31;
    public static final int ByWindow=8;
    public static final int Extends=11;
    public static final int Wifi=37;
    public static final int RightSquareBracket=68;
    public static final int ExclamationMark=53;
    public static final int GreaterThanSign=65;
    public static final int RULE_ID=79;
    public static final int Channel=9;
    public static final int RightParenthesis=55;
    public static final int Reduce=17;
    public static final int GreaterThanSignEqualsSign=49;
    public static final int Baud=26;
    public static final int EqualsSignEqualsSign=48;
    public static final int Stdev=24;
    public static final int Min=41;
    public static final int PlusSign=57;
    public static final int RULE_INT=71;
    public static final int Byte=27;
    public static final int Vcc=42;
    public static final int AsteriskAsterisk=45;
    public static final int RULE_ML_COMMENT=78;
    public static final int LeftSquareBracket=67;
    public static final int Id=51;
    public static final int Ssid=34;
    public static final int Map=39;
    public static final int Sensor=19;
    public static final int Mean=29;
    public static final int RULE_END=70;
    public static final int Max=40;
    public static final int RULE_NDBL=74;
    public static final int VerticalLineVerticalLine=52;
    public static final int RULE_STRING=80;
    public static final int RULE_SL_COMMENT=77;
    public static final int Comma=58;
    public static final int EqualsSign=64;
    public static final int As=50;
    public static final int HyphenMinus=59;
    public static final int Abs=38;
    public static final int AmpersandAmpersand=44;
    public static final int Char=28;
    public static final int LessThanSignEqualsSign=47;
    public static final int Solidus=61;
    public static final int Colon=62;
    public static final int Topic=25;
    public static final int EOF=-1;
    public static final int Asterisk=56;
    public static final int Mqtt=30;
    public static final int FullStop=60;
    public static final int Broker=14;
    public static final int RULE_WS=81;
    public static final int Abstract=7;
    public static final int Sample=18;
    public static final int Pipe=32;
    public static final int RULE_ANY_OTHER=82;
    public static final int Milliseconds=5;
    public static final int Microseconds=4;
    public static final int RULE_DBL=73;
    public static final int Serial=20;
    public static final int Type=36;
    public static final int Command=10;
    public static final int Filter=15;
    public static final int QuestionMark=66;
    public static final int Model=23;
    public static final int Frequency=6;
    public static final int Seconds=13;
    public static final int ExclamationMarkEqualsSign=43;
    public static final int HyphenMinusGreaterThanSign=46;

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

    // $ANTLR start "Channel"
    public final void mChannel() throws RecognitionException {
        try {
            int _type = Channel;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:24:9: ( 'channel' )
            // InternalIoTLexer.g:24:11: 'channel'
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
            // InternalIoTLexer.g:26:9: ( 'command' )
            // InternalIoTLexer.g:26:11: 'command'
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
            // InternalIoTLexer.g:28:9: ( 'extends' )
            // InternalIoTLexer.g:28:11: 'extends'
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
            // InternalIoTLexer.g:30:9: ( 'include' )
            // InternalIoTLexer.g:30:11: 'include'
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
            // InternalIoTLexer.g:32:9: ( 'seconds' )
            // InternalIoTLexer.g:32:11: 'seconds'
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
            // InternalIoTLexer.g:34:8: ( 'broker' )
            // InternalIoTLexer.g:34:10: 'broker'
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
            // InternalIoTLexer.g:36:8: ( 'filter' )
            // InternalIoTLexer.g:36:10: 'filter'
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

    // $ANTLR start "Reduce"
    public final void mReduce() throws RecognitionException {
        try {
            int _type = Reduce;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:40:8: ( 'reduce' )
            // InternalIoTLexer.g:40:10: 'reduce'
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
            // InternalIoTLexer.g:42:8: ( 'sample' )
            // InternalIoTLexer.g:42:10: 'sample'
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
            // InternalIoTLexer.g:44:8: ( 'sensor' )
            // InternalIoTLexer.g:44:10: 'sensor'
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
            // InternalIoTLexer.g:46:8: ( 'serial' )
            // InternalIoTLexer.g:46:10: 'serial'
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

    // $ANTLR start "Stdev"
    public final void mStdev() throws RecognitionException {
        try {
            int _type = Stdev;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:54:7: ( 'stdev' )
            // InternalIoTLexer.g:54:9: 'stdev'
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
            // InternalIoTLexer.g:56:7: ( 'topic' )
            // InternalIoTLexer.g:56:9: 'topic'
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
            // InternalIoTLexer.g:58:6: ( 'baud' )
            // InternalIoTLexer.g:58:8: 'baud'
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
            // InternalIoTLexer.g:60:6: ( 'byte' )
            // InternalIoTLexer.g:60:8: 'byte'
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
            // InternalIoTLexer.g:62:6: ( 'char' )
            // InternalIoTLexer.g:62:8: 'char'
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
            // InternalIoTLexer.g:64:6: ( 'mean' )
            // InternalIoTLexer.g:64:8: 'mean'
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
            // InternalIoTLexer.g:66:6: ( 'mqtt' )
            // InternalIoTLexer.g:66:8: 'mqtt'
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

    // $ANTLR start "Map"
    public final void mMap() throws RecognitionException {
        try {
            int _type = Map;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:84:5: ( 'map' )
            // InternalIoTLexer.g:84:7: 'map'
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
            // InternalIoTLexer.g:86:5: ( 'max' )
            // InternalIoTLexer.g:86:7: 'max'
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
            // InternalIoTLexer.g:88:5: ( 'min' )
            // InternalIoTLexer.g:88:7: 'min'
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
            // InternalIoTLexer.g:90:5: ( 'vcc' )
            // InternalIoTLexer.g:90:7: 'vcc'
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
            // InternalIoTLexer.g:92:27: ( '!=' )
            // InternalIoTLexer.g:92:29: '!='
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
            // InternalIoTLexer.g:94:20: ( '&&' )
            // InternalIoTLexer.g:94:22: '&&'
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
            // InternalIoTLexer.g:96:18: ( '**' )
            // InternalIoTLexer.g:96:20: '**'
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
            // InternalIoTLexer.g:98:28: ( '->' )
            // InternalIoTLexer.g:98:30: '->'
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
            // InternalIoTLexer.g:100:24: ( '<=' )
            // InternalIoTLexer.g:100:26: '<='
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
            // InternalIoTLexer.g:102:22: ( '==' )
            // InternalIoTLexer.g:102:24: '=='
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
            // InternalIoTLexer.g:104:27: ( '>=' )
            // InternalIoTLexer.g:104:29: '>='
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
            // InternalIoTLexer.g:106:4: ( 'as' )
            // InternalIoTLexer.g:106:6: 'as'
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
            // InternalIoTLexer.g:108:4: ( 'id' )
            // InternalIoTLexer.g:108:6: 'id'
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
            // InternalIoTLexer.g:110:26: ( '||' )
            // InternalIoTLexer.g:110:28: '||'
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
            // InternalIoTLexer.g:112:17: ( '!' )
            // InternalIoTLexer.g:112:19: '!'
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
            // InternalIoTLexer.g:114:17: ( '(' )
            // InternalIoTLexer.g:114:19: '('
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
            // InternalIoTLexer.g:116:18: ( ')' )
            // InternalIoTLexer.g:116:20: ')'
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
            // InternalIoTLexer.g:118:10: ( '*' )
            // InternalIoTLexer.g:118:12: '*'
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
            // InternalIoTLexer.g:120:10: ( '+' )
            // InternalIoTLexer.g:120:12: '+'
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
            // InternalIoTLexer.g:122:7: ( ',' )
            // InternalIoTLexer.g:122:9: ','
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
            // InternalIoTLexer.g:124:13: ( '-' )
            // InternalIoTLexer.g:124:15: '-'
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
            // InternalIoTLexer.g:126:10: ( '.' )
            // InternalIoTLexer.g:126:12: '.'
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
            // InternalIoTLexer.g:128:9: ( '/' )
            // InternalIoTLexer.g:128:11: '/'
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
            // InternalIoTLexer.g:130:7: ( ':' )
            // InternalIoTLexer.g:130:9: ':'
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
            // InternalIoTLexer.g:132:14: ( '<' )
            // InternalIoTLexer.g:132:16: '<'
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
            // InternalIoTLexer.g:134:12: ( '=' )
            // InternalIoTLexer.g:134:14: '='
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
            // InternalIoTLexer.g:136:17: ( '>' )
            // InternalIoTLexer.g:136:19: '>'
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
            // InternalIoTLexer.g:138:14: ( '?' )
            // InternalIoTLexer.g:138:16: '?'
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
            // InternalIoTLexer.g:140:19: ( '[' )
            // InternalIoTLexer.g:140:21: '['
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
            // InternalIoTLexer.g:142:20: ( ']' )
            // InternalIoTLexer.g:142:22: ']'
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
            // InternalIoTLexer.g:144:21: ()
            // InternalIoTLexer.g:144:23: 
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
            // InternalIoTLexer.g:146:19: ()
            // InternalIoTLexer.g:146:21: 
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
            // InternalIoTLexer.g:148:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalIoTLexer.g:148:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalIoTLexer.g:148:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalIoTLexer.g:148:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:148:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalIoTLexer.g:148:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalIoTLexer.g:148:27: '0' .. '9'
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
            // InternalIoTLexer.g:150:11: ( '-' ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalIoTLexer.g:150:13: '-' ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            match('-'); 
            // InternalIoTLexer.g:150:17: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalIoTLexer.g:150:18: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:150:22: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalIoTLexer.g:150:31: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalIoTLexer.g:150:32: '0' .. '9'
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
            // InternalIoTLexer.g:152:10: ( ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalIoTLexer.g:152:12: ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            // InternalIoTLexer.g:152:12: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoTLexer.g:152:12: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalIoTLexer.g:152:26: ( '0' .. '9' )+
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
            	    // InternalIoTLexer.g:152:27: '0' .. '9'
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
            // InternalIoTLexer.g:154:11: ( '-' ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalIoTLexer.g:154:13: '-' ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            match('-'); 
            // InternalIoTLexer.g:154:17: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoTLexer.g:154:17: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalIoTLexer.g:154:31: ( '0' .. '9' )+
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
            	    // InternalIoTLexer.g:154:32: '0' .. '9'
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
            // InternalIoTLexer.g:156:10: ( ( RULE_INT | RULE_DBL ) ( 'e' | 'E' ) ( '-' )? RULE_INT )
            // InternalIoTLexer.g:156:12: ( RULE_INT | RULE_DBL ) ( 'e' | 'E' ) ( '-' )? RULE_INT
            {
            // InternalIoTLexer.g:156:12: ( RULE_INT | RULE_DBL )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalIoTLexer.g:156:13: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:156:22: RULE_DBL
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

            // InternalIoTLexer.g:156:42: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoTLexer.g:156:42: '-'
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
            // InternalIoTLexer.g:158:14: ( ( 'true' | 'false' | 'True' | 'False' ) )
            // InternalIoTLexer.g:158:16: ( 'true' | 'false' | 'True' | 'False' )
            {
            // InternalIoTLexer.g:158:16: ( 'true' | 'false' | 'True' | 'False' )
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
                    // InternalIoTLexer.g:158:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:158:24: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // InternalIoTLexer.g:158:32: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 4 :
                    // InternalIoTLexer.g:158:39: 'False'
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
            // InternalIoTLexer.g:160:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIoTLexer.g:160:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalIoTLexer.g:160:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIoTLexer.g:160:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalIoTLexer.g:160:39: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoTLexer.g:160:40: ( '\\r' )? '\\n'
                    {
                    // InternalIoTLexer.g:160:40: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalIoTLexer.g:160:40: '\\r'
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
            // InternalIoTLexer.g:162:17: ( '#*' ( options {greedy=false; } : . )* '*#' )
            // InternalIoTLexer.g:162:19: '#*' ( options {greedy=false; } : . )* '*#'
            {
            match("#*"); 

            // InternalIoTLexer.g:162:24: ( options {greedy=false; } : . )*
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
            	    // InternalIoTLexer.g:162:52: .
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
            // InternalIoTLexer.g:164:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIoTLexer.g:164:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIoTLexer.g:164:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIoTLexer.g:164:11: '^'
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

            // InternalIoTLexer.g:164:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalIoTLexer.g:166:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIoTLexer.g:166:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIoTLexer.g:166:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalIoTLexer.g:166:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIoTLexer.g:166:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalIoTLexer.g:166:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:166:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalIoTLexer.g:166:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIoTLexer.g:166:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalIoTLexer.g:166:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:166:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalIoTLexer.g:168:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIoTLexer.g:168:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIoTLexer.g:168:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalIoTLexer.g:170:16: ( . )
            // InternalIoTLexer.g:170:18: .
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
        // InternalIoTLexer.g:1:8: ( Microseconds | Milliseconds | Frequency | Abstract | ByWindow | Channel | Command | Extends | Include | Seconds | Broker | Filter | Median | Reduce | Sample | Sensor | Serial | Board | Count | Model | Stdev | Topic | Baud | Byte | Char | Mean | Mqtt | Pass | Pipe | Port | Ssid | Stop | Type | Wifi | Abs | Map | Max | Min | Vcc | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | As | Id | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_NINT | RULE_DBL | RULE_NDBL | RULE_SCI | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt22=77;
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
                // InternalIoTLexer.g:1:64: Channel
                {
                mChannel(); 

                }
                break;
            case 7 :
                // InternalIoTLexer.g:1:72: Command
                {
                mCommand(); 

                }
                break;
            case 8 :
                // InternalIoTLexer.g:1:80: Extends
                {
                mExtends(); 

                }
                break;
            case 9 :
                // InternalIoTLexer.g:1:88: Include
                {
                mInclude(); 

                }
                break;
            case 10 :
                // InternalIoTLexer.g:1:96: Seconds
                {
                mSeconds(); 

                }
                break;
            case 11 :
                // InternalIoTLexer.g:1:104: Broker
                {
                mBroker(); 

                }
                break;
            case 12 :
                // InternalIoTLexer.g:1:111: Filter
                {
                mFilter(); 

                }
                break;
            case 13 :
                // InternalIoTLexer.g:1:118: Median
                {
                mMedian(); 

                }
                break;
            case 14 :
                // InternalIoTLexer.g:1:125: Reduce
                {
                mReduce(); 

                }
                break;
            case 15 :
                // InternalIoTLexer.g:1:132: Sample
                {
                mSample(); 

                }
                break;
            case 16 :
                // InternalIoTLexer.g:1:139: Sensor
                {
                mSensor(); 

                }
                break;
            case 17 :
                // InternalIoTLexer.g:1:146: Serial
                {
                mSerial(); 

                }
                break;
            case 18 :
                // InternalIoTLexer.g:1:153: Board
                {
                mBoard(); 

                }
                break;
            case 19 :
                // InternalIoTLexer.g:1:159: Count
                {
                mCount(); 

                }
                break;
            case 20 :
                // InternalIoTLexer.g:1:165: Model
                {
                mModel(); 

                }
                break;
            case 21 :
                // InternalIoTLexer.g:1:171: Stdev
                {
                mStdev(); 

                }
                break;
            case 22 :
                // InternalIoTLexer.g:1:177: Topic
                {
                mTopic(); 

                }
                break;
            case 23 :
                // InternalIoTLexer.g:1:183: Baud
                {
                mBaud(); 

                }
                break;
            case 24 :
                // InternalIoTLexer.g:1:188: Byte
                {
                mByte(); 

                }
                break;
            case 25 :
                // InternalIoTLexer.g:1:193: Char
                {
                mChar(); 

                }
                break;
            case 26 :
                // InternalIoTLexer.g:1:198: Mean
                {
                mMean(); 

                }
                break;
            case 27 :
                // InternalIoTLexer.g:1:203: Mqtt
                {
                mMqtt(); 

                }
                break;
            case 28 :
                // InternalIoTLexer.g:1:208: Pass
                {
                mPass(); 

                }
                break;
            case 29 :
                // InternalIoTLexer.g:1:213: Pipe
                {
                mPipe(); 

                }
                break;
            case 30 :
                // InternalIoTLexer.g:1:218: Port
                {
                mPort(); 

                }
                break;
            case 31 :
                // InternalIoTLexer.g:1:223: Ssid
                {
                mSsid(); 

                }
                break;
            case 32 :
                // InternalIoTLexer.g:1:228: Stop
                {
                mStop(); 

                }
                break;
            case 33 :
                // InternalIoTLexer.g:1:233: Type
                {
                mType(); 

                }
                break;
            case 34 :
                // InternalIoTLexer.g:1:238: Wifi
                {
                mWifi(); 

                }
                break;
            case 35 :
                // InternalIoTLexer.g:1:243: Abs
                {
                mAbs(); 

                }
                break;
            case 36 :
                // InternalIoTLexer.g:1:247: Map
                {
                mMap(); 

                }
                break;
            case 37 :
                // InternalIoTLexer.g:1:251: Max
                {
                mMax(); 

                }
                break;
            case 38 :
                // InternalIoTLexer.g:1:255: Min
                {
                mMin(); 

                }
                break;
            case 39 :
                // InternalIoTLexer.g:1:259: Vcc
                {
                mVcc(); 

                }
                break;
            case 40 :
                // InternalIoTLexer.g:1:263: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 41 :
                // InternalIoTLexer.g:1:289: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 42 :
                // InternalIoTLexer.g:1:308: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 43 :
                // InternalIoTLexer.g:1:325: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 44 :
                // InternalIoTLexer.g:1:352: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 45 :
                // InternalIoTLexer.g:1:375: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 46 :
                // InternalIoTLexer.g:1:396: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 47 :
                // InternalIoTLexer.g:1:422: As
                {
                mAs(); 

                }
                break;
            case 48 :
                // InternalIoTLexer.g:1:425: Id
                {
                mId(); 

                }
                break;
            case 49 :
                // InternalIoTLexer.g:1:428: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 50 :
                // InternalIoTLexer.g:1:453: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 51 :
                // InternalIoTLexer.g:1:469: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 52 :
                // InternalIoTLexer.g:1:485: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 53 :
                // InternalIoTLexer.g:1:502: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 54 :
                // InternalIoTLexer.g:1:511: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 55 :
                // InternalIoTLexer.g:1:520: Comma
                {
                mComma(); 

                }
                break;
            case 56 :
                // InternalIoTLexer.g:1:526: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 57 :
                // InternalIoTLexer.g:1:538: FullStop
                {
                mFullStop(); 

                }
                break;
            case 58 :
                // InternalIoTLexer.g:1:547: Solidus
                {
                mSolidus(); 

                }
                break;
            case 59 :
                // InternalIoTLexer.g:1:555: Colon
                {
                mColon(); 

                }
                break;
            case 60 :
                // InternalIoTLexer.g:1:561: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 61 :
                // InternalIoTLexer.g:1:574: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 62 :
                // InternalIoTLexer.g:1:585: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 63 :
                // InternalIoTLexer.g:1:601: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 64 :
                // InternalIoTLexer.g:1:614: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 65 :
                // InternalIoTLexer.g:1:632: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 66 :
                // InternalIoTLexer.g:1:651: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 67 :
                // InternalIoTLexer.g:1:660: RULE_NINT
                {
                mRULE_NINT(); 

                }
                break;
            case 68 :
                // InternalIoTLexer.g:1:670: RULE_DBL
                {
                mRULE_DBL(); 

                }
                break;
            case 69 :
                // InternalIoTLexer.g:1:679: RULE_NDBL
                {
                mRULE_NDBL(); 

                }
                break;
            case 70 :
                // InternalIoTLexer.g:1:689: RULE_SCI
                {
                mRULE_SCI(); 

                }
                break;
            case 71 :
                // InternalIoTLexer.g:1:698: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 72 :
                // InternalIoTLexer.g:1:711: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // InternalIoTLexer.g:1:727: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // InternalIoTLexer.g:1:743: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 75 :
                // InternalIoTLexer.g:1:751: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 76 :
                // InternalIoTLexer.g:1:763: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // InternalIoTLexer.g:1:771: RULE_ANY_OTHER
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
            return "156:12: ( RULE_INT | RULE_DBL )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\15\60\1\115\1\52\1\120\1\122\1\127\1\131\1\133\1\52\4\uffff\1\142\5\uffff\2\150\2\60\1\157\1\52\1\uffff\2\52\2\uffff\5\60\1\uffff\4\60\1\177\10\60\1\u008a\15\60\7\uffff\2\u009b\14\uffff\1\u009d\11\uffff\1\150\2\60\1\157\3\uffff\2\60\1\u00a6\4\60\1\u00ab\1\u00ac\3\60\1\u00b1\1\uffff\12\60\1\uffff\17\60\1\u00cc\1\uffff\1\u009b\1\uffff\2\60\1\uffff\3\157\2\60\1\uffff\1\60\1\u00d4\1\60\1\u00d6\2\uffff\4\60\1\uffff\1\60\1\u00dc\2\60\1\u00df\1\60\1\u00e1\11\60\1\u00eb\1\u00ec\2\60\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\uffff\1\u00f0\1\60\1\uffff\1\157\3\60\1\uffff\1\u00f9\1\uffff\2\60\1\u00f0\2\60\1\uffff\1\60\1\u00ff\1\uffff\1\60\1\uffff\1\60\1\u0102\6\60\1\u0109\2\uffff\1\60\1\u010b\6\uffff\1\u00f0\2\60\1\u010e\1\uffff\1\60\1\u0110\2\60\1\u0113\1\uffff\2\60\1\uffff\3\60\1\u0119\1\u011a\1\u011b\1\uffff\1\u011c\1\uffff\2\60\1\uffff\1\60\1\uffff\2\60\1\uffff\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\4\uffff\3\60\1\u012a\1\u012b\5\uffff\2\60\1\u012e\2\uffff\2\60\1\uffff\2\60\1\u0133\1\u0134\2\uffff";
    static final String DFA22_eofS =
        "\u0135\uffff";
    static final String DFA22_minS =
        "\1\0\2\141\1\142\1\141\1\150\1\170\1\144\1\141\1\145\1\157\1\141\1\151\1\143\1\75\1\46\1\52\1\56\3\75\1\174\4\uffff\1\60\5\uffff\2\56\1\162\1\141\1\52\1\101\1\uffff\2\0\2\uffff\1\143\1\141\1\144\1\164\1\160\1\uffff\1\145\2\154\1\163\1\60\1\127\1\157\1\141\1\165\1\141\1\155\1\164\1\143\1\60\1\143\1\155\1\144\1\151\1\144\2\160\1\165\1\163\1\160\1\162\1\146\1\143\7\uffff\2\56\14\uffff\1\60\7\uffff\1\60\1\uffff\1\56\1\165\1\154\1\0\3\uffff\1\162\1\154\1\60\1\151\1\156\1\145\1\164\2\60\1\161\1\164\1\163\1\60\1\uffff\1\151\1\145\1\153\1\162\1\144\1\156\1\155\1\156\1\145\1\154\1\uffff\1\157\1\163\1\151\1\160\1\145\1\160\1\144\1\165\1\151\2\145\1\163\1\145\1\164\1\151\1\60\1\uffff\1\56\1\uffff\1\145\1\163\4\0\1\157\1\151\1\uffff\1\141\1\60\1\154\1\60\2\uffff\1\165\2\145\1\162\1\uffff\1\156\1\60\1\145\1\144\1\60\1\156\1\60\1\141\1\164\1\156\1\165\1\156\1\157\1\141\1\154\1\166\2\60\2\143\6\60\1\uffff\1\60\1\145\1\uffff\1\0\2\163\1\156\1\uffff\1\60\1\uffff\1\145\1\162\1\60\1\141\1\144\1\uffff\1\162\1\60\1\uffff\1\145\1\uffff\1\156\1\60\3\144\1\162\1\154\1\145\1\60\2\uffff\1\145\1\60\6\uffff\1\60\2\145\1\60\1\uffff\1\156\1\60\1\143\1\157\1\60\1\uffff\1\154\1\144\1\uffff\1\163\1\145\1\163\3\60\1\uffff\1\60\1\uffff\2\143\1\uffff\1\143\1\uffff\1\164\1\167\1\uffff\5\60\4\uffff\2\157\1\171\2\60\5\uffff\2\156\1\60\2\uffff\2\144\1\uffff\2\163\2\60\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\161\1\162\1\163\1\171\1\157\1\170\1\156\1\164\1\145\1\171\1\157\1\151\1\143\1\75\1\46\1\52\1\76\3\75\1\174\4\uffff\1\71\5\uffff\2\145\1\162\1\141\1\52\1\172\1\uffff\2\uffff\2\uffff\1\156\2\144\1\164\1\170\1\uffff\1\145\2\154\1\163\1\172\1\164\1\157\1\141\1\165\1\141\1\165\1\164\1\143\1\172\1\162\1\155\1\157\1\151\1\144\2\160\1\165\1\163\1\160\1\162\1\146\1\143\7\uffff\1\56\1\71\14\uffff\1\145\7\uffff\1\71\1\uffff\1\145\1\165\1\154\1\uffff\3\uffff\1\162\1\154\1\172\1\151\1\156\1\145\1\164\2\172\1\161\1\164\1\163\1\172\1\uffff\1\151\1\145\1\153\1\162\1\144\1\162\1\155\1\156\1\145\1\154\1\uffff\1\157\1\163\1\151\1\160\1\145\1\160\1\144\1\165\1\151\2\145\1\163\1\145\1\164\1\151\1\172\1\uffff\1\71\1\uffff\1\145\1\163\4\uffff\1\157\1\151\1\uffff\1\141\1\172\1\154\1\172\2\uffff\1\165\2\145\1\162\1\uffff\1\156\1\172\1\145\1\144\1\172\1\156\1\172\1\141\1\164\1\156\1\165\1\156\1\157\1\141\1\154\1\166\2\172\2\143\6\172\1\uffff\1\172\1\145\1\uffff\1\uffff\2\163\1\156\1\uffff\1\172\1\uffff\1\145\1\162\1\172\1\141\1\144\1\uffff\1\162\1\172\1\uffff\1\145\1\uffff\1\156\1\172\3\144\1\162\1\154\1\145\1\172\2\uffff\1\145\1\172\6\uffff\1\172\2\145\1\172\1\uffff\1\156\1\172\1\143\1\157\1\172\1\uffff\1\154\1\144\1\uffff\1\163\1\145\1\163\3\172\1\uffff\1\172\1\uffff\2\143\1\uffff\1\143\1\uffff\1\164\1\167\1\uffff\5\172\4\uffff\2\157\1\171\2\172\5\uffff\2\156\1\172\2\uffff\2\144\1\uffff\2\163\2\172\2\uffff";
    static final String DFA22_acceptS =
        "\26\uffff\1\63\1\64\1\66\1\67\1\uffff\1\72\1\73\1\77\1\100\1\101\6\uffff\1\112\2\uffff\1\114\1\115\5\uffff\1\112\33\uffff\1\50\1\62\1\51\1\52\1\65\1\53\1\70\2\uffff\1\105\1\54\1\74\1\55\1\75\1\56\1\76\1\61\1\63\1\64\1\66\1\67\1\uffff\1\71\1\72\1\73\1\77\1\100\1\101\1\102\1\uffff\1\106\4\uffff\1\110\1\113\1\114\15\uffff\1\57\12\uffff\1\60\20\uffff\1\103\1\uffff\1\104\10\uffff\1\46\4\uffff\1\44\1\45\4\uffff\1\43\32\uffff\1\47\2\uffff\1\111\4\uffff\1\32\1\uffff\1\33\5\uffff\1\30\2\uffff\1\27\1\uffff\1\31\11\uffff\1\40\1\37\2\uffff\1\41\1\107\1\34\1\35\1\36\1\42\4\uffff\1\24\5\uffff\1\22\2\uffff\1\23\6\uffff\1\25\1\uffff\1\26\2\uffff\1\15\1\uffff\1\14\2\uffff\1\13\5\uffff\1\20\1\21\1\17\1\16\5\uffff\1\6\1\7\1\10\1\11\1\12\3\uffff\1\4\1\5\2\uffff\1\3\4\uffff\1\1\1\2";
    static final String DFA22_specialS =
        "\1\0\46\uffff\1\5\1\10\105\uffff\1\1\61\uffff\1\6\1\3\1\7\1\2\54\uffff\1\4\144\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\16\1\47\1\44\2\52\1\17\1\50\1\26\1\27\1\20\1\30\1\31\1\21\1\32\1\33\1\40\11\41\1\34\1\52\1\22\1\23\1\24\1\35\1\52\5\46\1\43\15\46\1\42\6\46\1\36\1\52\1\37\1\45\1\46\1\52\1\3\1\4\1\5\1\46\1\6\1\2\2\46\1\7\3\46\1\1\2\46\1\13\1\46\1\11\1\10\1\12\1\46\1\15\1\14\3\46\1\52\1\25\uff83\52",
            "\1\57\3\uffff\1\54\3\uffff\1\53\5\uffff\1\55\1\uffff\1\56",
            "\1\63\7\uffff\1\62\10\uffff\1\61",
            "\1\64\20\uffff\1\65",
            "\1\71\15\uffff\1\70\2\uffff\1\67\6\uffff\1\66",
            "\1\72\6\uffff\1\73",
            "\1\74",
            "\1\76\11\uffff\1\75",
            "\1\100\3\uffff\1\77\15\uffff\1\102\1\101",
            "\1\103",
            "\1\104\2\uffff\1\106\6\uffff\1\105",
            "\1\107\7\uffff\1\110\5\uffff\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\116",
            "\1\117",
            "\1\125\1\uffff\1\123\11\124\4\uffff\1\121",
            "\1\126",
            "\1\130",
            "\1\132",
            "\1\134",
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
            "\1\151\26\uffff\1\152\37\uffff\1\152",
            "\1\151\1\uffff\12\153\13\uffff\1\152\37\uffff\1\152",
            "\1\154",
            "\1\155",
            "\1\156",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\0\160",
            "\0\160",
            "",
            "",
            "\1\162\10\uffff\1\163\1\uffff\1\164",
            "\1\166\2\uffff\1\165",
            "\1\167",
            "\1\170",
            "\1\171\7\uffff\1\172",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0080\34\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\7\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u008b\12\uffff\1\u008c\3\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f\12\uffff\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "\1\125\1\uffff\12\u009c",
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
            "\12\141\13\uffff\1\152\37\uffff\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\141",
            "",
            "\1\151\1\uffff\12\153\13\uffff\1\152\37\uffff\1\152",
            "\1\u009e",
            "\1\u009f",
            "\12\u00a3\1\u00a1\2\u00a3\1\u00a0\34\u00a3\1\u00a2\uffd5\u00a3",
            "",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00b0\6\60",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7\3\uffff\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\125\1\uffff\12\u009c",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\12\u00cf\1\u00a1\ufff5\u00cf",
            "\0\u00cf",
            "\12\u00a3\1\u00a1\2\u00a3\1\u00a0\25\u00a3\1\u00d0\6\u00a3\1\u00a2\uffd5\u00a3",
            "\12\u00a3\1\u00a1\2\u00a3\1\u00a0\34\u00a3\1\u00a2\uffd5\u00a3",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00dd",
            "\1\u00de",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e0",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ed",
            "\1\u00ee",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f5",
            "",
            "\12\u00a3\1\u00a1\2\u00a3\1\u00a0\34\u00a3\1\u00a2\uffd5\u00a3",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0100",
            "",
            "\1\u0101",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u010a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010c",
            "\1\u010d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u010f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0111",
            "\1\u0112",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "\1\u012c",
            "\1\u012d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
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
            return "1:1: Tokens : ( Microseconds | Milliseconds | Frequency | Abstract | ByWindow | Channel | Command | Extends | Include | Seconds | Broker | Filter | Median | Reduce | Sample | Sensor | Serial | Board | Count | Model | Stdev | Topic | Baud | Byte | Char | Mean | Mqtt | Pass | Pipe | Port | Ssid | Stop | Type | Wifi | Abs | Map | Max | Min | Vcc | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | As | Id | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_NINT | RULE_DBL | RULE_NDBL | RULE_SCI | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
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

                        else if ( (LA22_0=='r') ) {s = 9;}

                        else if ( (LA22_0=='t') ) {s = 10;}

                        else if ( (LA22_0=='p') ) {s = 11;}

                        else if ( (LA22_0=='w') ) {s = 12;}

                        else if ( (LA22_0=='v') ) {s = 13;}

                        else if ( (LA22_0=='!') ) {s = 14;}

                        else if ( (LA22_0=='&') ) {s = 15;}

                        else if ( (LA22_0=='*') ) {s = 16;}

                        else if ( (LA22_0=='-') ) {s = 17;}

                        else if ( (LA22_0=='<') ) {s = 18;}

                        else if ( (LA22_0=='=') ) {s = 19;}

                        else if ( (LA22_0=='>') ) {s = 20;}

                        else if ( (LA22_0=='|') ) {s = 21;}

                        else if ( (LA22_0=='(') ) {s = 22;}

                        else if ( (LA22_0==')') ) {s = 23;}

                        else if ( (LA22_0=='+') ) {s = 24;}

                        else if ( (LA22_0==',') ) {s = 25;}

                        else if ( (LA22_0=='.') ) {s = 26;}

                        else if ( (LA22_0=='/') ) {s = 27;}

                        else if ( (LA22_0==':') ) {s = 28;}

                        else if ( (LA22_0=='?') ) {s = 29;}

                        else if ( (LA22_0=='[') ) {s = 30;}

                        else if ( (LA22_0==']') ) {s = 31;}

                        else if ( (LA22_0=='0') ) {s = 32;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 33;}

                        else if ( (LA22_0=='T') ) {s = 34;}

                        else if ( (LA22_0=='F') ) {s = 35;}

                        else if ( (LA22_0=='#') ) {s = 36;}

                        else if ( (LA22_0=='^') ) {s = 37;}

                        else if ( ((LA22_0>='A' && LA22_0<='E')||(LA22_0>='G' && LA22_0<='S')||(LA22_0>='U' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='d'||(LA22_0>='g' && LA22_0<='h')||(LA22_0>='j' && LA22_0<='l')||(LA22_0>='n' && LA22_0<='o')||LA22_0=='q'||LA22_0=='u'||(LA22_0>='x' && LA22_0<='z')) ) {s = 38;}

                        else if ( (LA22_0=='\"') ) {s = 39;}

                        else if ( (LA22_0=='\'') ) {s = 40;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 41;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||(LA22_0>='$' && LA22_0<='%')||LA22_0==';'||LA22_0=='@'||LA22_0=='\\'||LA22_0=='`'||LA22_0=='{'||(LA22_0>='}' && LA22_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_110 = input.LA(1);

                        s = -1;
                        if ( (LA22_110=='\r') ) {s = 160;}

                        else if ( (LA22_110=='\n') ) {s = 161;}

                        else if ( (LA22_110=='*') ) {s = 162;}

                        else if ( ((LA22_110>='\u0000' && LA22_110<='\t')||(LA22_110>='\u000B' && LA22_110<='\f')||(LA22_110>='\u000E' && LA22_110<=')')||(LA22_110>='+' && LA22_110<='\uFFFF')) ) {s = 163;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_163 = input.LA(1);

                        s = -1;
                        if ( (LA22_163=='\r') ) {s = 160;}

                        else if ( (LA22_163=='\n') ) {s = 161;}

                        else if ( (LA22_163=='*') ) {s = 162;}

                        else if ( ((LA22_163>='\u0000' && LA22_163<='\t')||(LA22_163>='\u000B' && LA22_163<='\f')||(LA22_163>='\u000E' && LA22_163<=')')||(LA22_163>='+' && LA22_163<='\uFFFF')) ) {s = 163;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_161 = input.LA(1);

                        s = -1;
                        if ( ((LA22_161>='\u0000' && LA22_161<='\uFFFF')) ) {s = 207;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_208 = input.LA(1);

                        s = -1;
                        if ( (LA22_208=='\r') ) {s = 160;}

                        else if ( (LA22_208=='\n') ) {s = 161;}

                        else if ( (LA22_208=='*') ) {s = 162;}

                        else if ( ((LA22_208>='\u0000' && LA22_208<='\t')||(LA22_208>='\u000B' && LA22_208<='\f')||(LA22_208>='\u000E' && LA22_208<=')')||(LA22_208>='+' && LA22_208<='\uFFFF')) ) {s = 163;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_39 = input.LA(1);

                        s = -1;
                        if ( ((LA22_39>='\u0000' && LA22_39<='\uFFFF')) ) {s = 112;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_160 = input.LA(1);

                        s = -1;
                        if ( (LA22_160=='\n') ) {s = 161;}

                        else if ( ((LA22_160>='\u0000' && LA22_160<='\t')||(LA22_160>='\u000B' && LA22_160<='\uFFFF')) ) {s = 207;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_162 = input.LA(1);

                        s = -1;
                        if ( (LA22_162=='#') ) {s = 208;}

                        else if ( (LA22_162=='\r') ) {s = 160;}

                        else if ( (LA22_162=='\n') ) {s = 161;}

                        else if ( (LA22_162=='*') ) {s = 162;}

                        else if ( ((LA22_162>='\u0000' && LA22_162<='\t')||(LA22_162>='\u000B' && LA22_162<='\f')||(LA22_162>='\u000E' && LA22_162<='\"')||(LA22_162>='$' && LA22_162<=')')||(LA22_162>='+' && LA22_162<='\uFFFF')) ) {s = 163;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_40 = input.LA(1);

                        s = -1;
                        if ( ((LA22_40>='\u0000' && LA22_40<='\uFFFF')) ) {s = 112;}

                        else s = 42;

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