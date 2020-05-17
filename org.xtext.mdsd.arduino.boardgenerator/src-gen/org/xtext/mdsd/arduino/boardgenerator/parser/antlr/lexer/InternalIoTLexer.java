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
    public static final int RULE_BEGIN=67;
    public static final int Stop=34;
    public static final int Include=12;
    public static final int Median=17;
    public static final int RULE_BOOLEAN=72;
    public static final int Count=23;
    public static final int RULE_SCI=71;
    public static final int LessThanSign=61;
    public static final int Board=22;
    public static final int LeftParenthesis=52;
    public static final int Pass=31;
    public static final int ByWindow=8;
    public static final int Extends=11;
    public static final int Client=15;
    public static final int Wifi=36;
    public static final int RightSquareBracket=66;
    public static final int ExclamationMark=51;
    public static final int Sub=41;
    public static final int GreaterThanSign=63;
    public static final int RULE_ID=75;
    public static final int Channel=9;
    public static final int RightParenthesis=53;
    public static final int Reduce=18;
    public static final int GreaterThanSignEqualsSign=48;
    public static final int Baud=26;
    public static final int EqualsSignEqualsSign=47;
    public static final int Stdev=25;
    public static final int Min=40;
    public static final int PlusSign=55;
    public static final int RULE_INT=69;
    public static final int Byte=27;
    public static final int AsteriskAsterisk=44;
    public static final int RULE_ML_COMMENT=74;
    public static final int LeftSquareBracket=65;
    public static final int Ssid=33;
    public static final int Map=38;
    public static final int Sensor=20;
    public static final int Mean=29;
    public static final int RULE_END=68;
    public static final int Max=39;
    public static final int VerticalLineVerticalLine=50;
    public static final int RULE_STRING=76;
    public static final int RULE_SL_COMMENT=73;
    public static final int Comma=56;
    public static final int EqualsSign=62;
    public static final int As=49;
    public static final int HyphenMinus=57;
    public static final int Abs=37;
    public static final int AmpersandAmpersand=43;
    public static final int Char=28;
    public static final int LessThanSignEqualsSign=46;
    public static final int Solidus=59;
    public static final int Colon=60;
    public static final int EOF=-1;
    public static final int Asterisk=54;
    public static final int Mqtt=30;
    public static final int FullStop=58;
    public static final int Broker=14;
    public static final int RULE_WS=77;
    public static final int Abstract=7;
    public static final int Sample=19;
    public static final int Pipe=32;
    public static final int RULE_ANY_OTHER=78;
    public static final int Milliseconds=5;
    public static final int Microseconds=4;
    public static final int RULE_DBL=70;
    public static final int Serial=21;
    public static final int Type=35;
    public static final int Command=10;
    public static final int Filter=16;
    public static final int QuestionMark=64;
    public static final int Model=24;
    public static final int Frequency=6;
    public static final int Seconds=13;
    public static final int ExclamationMarkEqualsSign=42;
    public static final int HyphenMinusGreaterThanSign=45;

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

    // $ANTLR start "Client"
    public final void mClient() throws RecognitionException {
        try {
            int _type = Client;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:36:8: ( 'client' )
            // InternalIoTLexer.g:36:10: 'client'
            {
            match("client"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Client"

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

    // $ANTLR start "Serial"
    public final void mSerial() throws RecognitionException {
        try {
            int _type = Serial;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:48:8: ( 'serial' )
            // InternalIoTLexer.g:48:10: 'serial'
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
            // InternalIoTLexer.g:50:7: ( 'board' )
            // InternalIoTLexer.g:50:9: 'board'
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
            // InternalIoTLexer.g:52:7: ( 'count' )
            // InternalIoTLexer.g:52:9: 'count'
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
            // InternalIoTLexer.g:54:7: ( 'model' )
            // InternalIoTLexer.g:54:9: 'model'
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

    // $ANTLR start "Ssid"
    public final void mSsid() throws RecognitionException {
        try {
            int _type = Ssid;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:72:6: ( 'ssid' )
            // InternalIoTLexer.g:72:8: 'ssid'
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
            // InternalIoTLexer.g:74:6: ( 'stop' )
            // InternalIoTLexer.g:74:8: 'stop'
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
            // InternalIoTLexer.g:76:6: ( 'type' )
            // InternalIoTLexer.g:76:8: 'type'
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
            // InternalIoTLexer.g:78:6: ( 'wifi' )
            // InternalIoTLexer.g:78:8: 'wifi'
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
            // InternalIoTLexer.g:80:5: ( 'abs' )
            // InternalIoTLexer.g:80:7: 'abs'
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
            // InternalIoTLexer.g:82:5: ( 'map' )
            // InternalIoTLexer.g:82:7: 'map'
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
            // InternalIoTLexer.g:84:5: ( 'max' )
            // InternalIoTLexer.g:84:7: 'max'
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
            // InternalIoTLexer.g:86:5: ( 'min' )
            // InternalIoTLexer.g:86:7: 'min'
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

    // $ANTLR start "Sub"
    public final void mSub() throws RecognitionException {
        try {
            int _type = Sub;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:88:5: ( 'sub' )
            // InternalIoTLexer.g:88:7: 'sub'
            {
            match("sub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sub"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:90:27: ( '!=' )
            // InternalIoTLexer.g:90:29: '!='
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
            // InternalIoTLexer.g:92:20: ( '&&' )
            // InternalIoTLexer.g:92:22: '&&'
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
            // InternalIoTLexer.g:94:18: ( '**' )
            // InternalIoTLexer.g:94:20: '**'
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
            // InternalIoTLexer.g:96:28: ( '->' )
            // InternalIoTLexer.g:96:30: '->'
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
            // InternalIoTLexer.g:98:24: ( '<=' )
            // InternalIoTLexer.g:98:26: '<='
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
            // InternalIoTLexer.g:100:22: ( '==' )
            // InternalIoTLexer.g:100:24: '=='
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
            // InternalIoTLexer.g:102:27: ( '>=' )
            // InternalIoTLexer.g:102:29: '>='
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
            // InternalIoTLexer.g:104:4: ( 'as' )
            // InternalIoTLexer.g:104:6: 'as'
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

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:106:26: ( '||' )
            // InternalIoTLexer.g:106:28: '||'
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
            // InternalIoTLexer.g:108:17: ( '!' )
            // InternalIoTLexer.g:108:19: '!'
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
            // InternalIoTLexer.g:110:17: ( '(' )
            // InternalIoTLexer.g:110:19: '('
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
            // InternalIoTLexer.g:112:18: ( ')' )
            // InternalIoTLexer.g:112:20: ')'
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
            // InternalIoTLexer.g:114:10: ( '*' )
            // InternalIoTLexer.g:114:12: '*'
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
            // InternalIoTLexer.g:116:10: ( '+' )
            // InternalIoTLexer.g:116:12: '+'
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
            // InternalIoTLexer.g:118:7: ( ',' )
            // InternalIoTLexer.g:118:9: ','
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
            // InternalIoTLexer.g:120:13: ( '-' )
            // InternalIoTLexer.g:120:15: '-'
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
            // InternalIoTLexer.g:122:10: ( '.' )
            // InternalIoTLexer.g:122:12: '.'
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
            // InternalIoTLexer.g:124:9: ( '/' )
            // InternalIoTLexer.g:124:11: '/'
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
            // InternalIoTLexer.g:126:7: ( ':' )
            // InternalIoTLexer.g:126:9: ':'
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
            // InternalIoTLexer.g:128:14: ( '<' )
            // InternalIoTLexer.g:128:16: '<'
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
            // InternalIoTLexer.g:130:12: ( '=' )
            // InternalIoTLexer.g:130:14: '='
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
            // InternalIoTLexer.g:132:17: ( '>' )
            // InternalIoTLexer.g:132:19: '>'
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
            // InternalIoTLexer.g:134:14: ( '?' )
            // InternalIoTLexer.g:134:16: '?'
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
            // InternalIoTLexer.g:136:19: ( '[' )
            // InternalIoTLexer.g:136:21: '['
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
            // InternalIoTLexer.g:138:20: ( ']' )
            // InternalIoTLexer.g:138:22: ']'
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
            // InternalIoTLexer.g:140:21: ()
            // InternalIoTLexer.g:140:23: 
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
            // InternalIoTLexer.g:142:19: ()
            // InternalIoTLexer.g:142:21: 
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
            // InternalIoTLexer.g:144:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalIoTLexer.g:144:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalIoTLexer.g:144:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalIoTLexer.g:144:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:144:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalIoTLexer.g:144:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalIoTLexer.g:144:27: '0' .. '9'
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

    // $ANTLR start "RULE_DBL"
    public final void mRULE_DBL() throws RecognitionException {
        try {
            int _type = RULE_DBL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:146:10: ( ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalIoTLexer.g:146:12: ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            // InternalIoTLexer.g:146:12: ( RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIoTLexer.g:146:12: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalIoTLexer.g:146:26: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIoTLexer.g:146:27: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL"

    // $ANTLR start "RULE_SCI"
    public final void mRULE_SCI() throws RecognitionException {
        try {
            int _type = RULE_SCI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIoTLexer.g:148:10: ( ( RULE_INT | RULE_DBL ) ( 'e' | 'E' ) ( '-' )? RULE_INT )
            // InternalIoTLexer.g:148:12: ( RULE_INT | RULE_DBL ) ( 'e' | 'E' ) ( '-' )? RULE_INT
            {
            // InternalIoTLexer.g:148:12: ( RULE_INT | RULE_DBL )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalIoTLexer.g:148:13: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:148:22: RULE_DBL
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

            // InternalIoTLexer.g:148:42: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIoTLexer.g:148:42: '-'
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
            // InternalIoTLexer.g:150:14: ( ( 'true' | 'false' | 'True' | 'False' ) )
            // InternalIoTLexer.g:150:16: ( 'true' | 'false' | 'True' | 'False' )
            {
            // InternalIoTLexer.g:150:16: ( 'true' | 'false' | 'True' | 'False' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt7=1;
                }
                break;
            case 'f':
                {
                alt7=2;
                }
                break;
            case 'T':
                {
                alt7=3;
                }
                break;
            case 'F':
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIoTLexer.g:150:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:150:24: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // InternalIoTLexer.g:150:32: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 4 :
                    // InternalIoTLexer.g:150:39: 'False'
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
            // InternalIoTLexer.g:152:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIoTLexer.g:152:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalIoTLexer.g:152:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIoTLexer.g:152:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalIoTLexer.g:152:39: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoTLexer.g:152:40: ( '\\r' )? '\\n'
                    {
                    // InternalIoTLexer.g:152:40: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalIoTLexer.g:152:40: '\\r'
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
            // InternalIoTLexer.g:154:17: ( '#*' ( options {greedy=false; } : . )* '*#' )
            // InternalIoTLexer.g:154:19: '#*' ( options {greedy=false; } : . )* '*#'
            {
            match("#*"); 

            // InternalIoTLexer.g:154:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='#') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='\"')||(LA11_1>='$' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIoTLexer.g:154:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalIoTLexer.g:156:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIoTLexer.g:156:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIoTLexer.g:156:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoTLexer.g:156:11: '^'
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

            // InternalIoTLexer.g:156:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    break loop13;
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
            // InternalIoTLexer.g:158:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIoTLexer.g:158:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIoTLexer.g:158:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalIoTLexer.g:158:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIoTLexer.g:158:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalIoTLexer.g:158:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:158:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalIoTLexer.g:158:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIoTLexer.g:158:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalIoTLexer.g:158:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIoTLexer.g:158:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // InternalIoTLexer.g:160:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIoTLexer.g:160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIoTLexer.g:160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalIoTLexer.g:162:16: ( . )
            // InternalIoTLexer.g:162:18: .
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
        // InternalIoTLexer.g:1:8: ( Microseconds | Milliseconds | Frequency | Abstract | ByWindow | Channel | Command | Extends | Include | Seconds | Broker | Client | Filter | Median | Reduce | Sample | Sensor | Serial | Board | Count | Model | Stdev | Baud | Byte | Char | Mean | Mqtt | Pass | Pipe | Ssid | Stop | Type | Wifi | Abs | Map | Max | Min | Sub | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | As | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_DBL | RULE_SCI | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt18=73;
        alt18 = dfa18.predict(input);
        switch (alt18) {
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
                // InternalIoTLexer.g:1:111: Client
                {
                mClient(); 

                }
                break;
            case 13 :
                // InternalIoTLexer.g:1:118: Filter
                {
                mFilter(); 

                }
                break;
            case 14 :
                // InternalIoTLexer.g:1:125: Median
                {
                mMedian(); 

                }
                break;
            case 15 :
                // InternalIoTLexer.g:1:132: Reduce
                {
                mReduce(); 

                }
                break;
            case 16 :
                // InternalIoTLexer.g:1:139: Sample
                {
                mSample(); 

                }
                break;
            case 17 :
                // InternalIoTLexer.g:1:146: Sensor
                {
                mSensor(); 

                }
                break;
            case 18 :
                // InternalIoTLexer.g:1:153: Serial
                {
                mSerial(); 

                }
                break;
            case 19 :
                // InternalIoTLexer.g:1:160: Board
                {
                mBoard(); 

                }
                break;
            case 20 :
                // InternalIoTLexer.g:1:166: Count
                {
                mCount(); 

                }
                break;
            case 21 :
                // InternalIoTLexer.g:1:172: Model
                {
                mModel(); 

                }
                break;
            case 22 :
                // InternalIoTLexer.g:1:178: Stdev
                {
                mStdev(); 

                }
                break;
            case 23 :
                // InternalIoTLexer.g:1:184: Baud
                {
                mBaud(); 

                }
                break;
            case 24 :
                // InternalIoTLexer.g:1:189: Byte
                {
                mByte(); 

                }
                break;
            case 25 :
                // InternalIoTLexer.g:1:194: Char
                {
                mChar(); 

                }
                break;
            case 26 :
                // InternalIoTLexer.g:1:199: Mean
                {
                mMean(); 

                }
                break;
            case 27 :
                // InternalIoTLexer.g:1:204: Mqtt
                {
                mMqtt(); 

                }
                break;
            case 28 :
                // InternalIoTLexer.g:1:209: Pass
                {
                mPass(); 

                }
                break;
            case 29 :
                // InternalIoTLexer.g:1:214: Pipe
                {
                mPipe(); 

                }
                break;
            case 30 :
                // InternalIoTLexer.g:1:219: Ssid
                {
                mSsid(); 

                }
                break;
            case 31 :
                // InternalIoTLexer.g:1:224: Stop
                {
                mStop(); 

                }
                break;
            case 32 :
                // InternalIoTLexer.g:1:229: Type
                {
                mType(); 

                }
                break;
            case 33 :
                // InternalIoTLexer.g:1:234: Wifi
                {
                mWifi(); 

                }
                break;
            case 34 :
                // InternalIoTLexer.g:1:239: Abs
                {
                mAbs(); 

                }
                break;
            case 35 :
                // InternalIoTLexer.g:1:243: Map
                {
                mMap(); 

                }
                break;
            case 36 :
                // InternalIoTLexer.g:1:247: Max
                {
                mMax(); 

                }
                break;
            case 37 :
                // InternalIoTLexer.g:1:251: Min
                {
                mMin(); 

                }
                break;
            case 38 :
                // InternalIoTLexer.g:1:255: Sub
                {
                mSub(); 

                }
                break;
            case 39 :
                // InternalIoTLexer.g:1:259: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 40 :
                // InternalIoTLexer.g:1:285: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 41 :
                // InternalIoTLexer.g:1:304: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 42 :
                // InternalIoTLexer.g:1:321: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 43 :
                // InternalIoTLexer.g:1:348: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 44 :
                // InternalIoTLexer.g:1:371: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 45 :
                // InternalIoTLexer.g:1:392: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 46 :
                // InternalIoTLexer.g:1:418: As
                {
                mAs(); 

                }
                break;
            case 47 :
                // InternalIoTLexer.g:1:421: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 48 :
                // InternalIoTLexer.g:1:446: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 49 :
                // InternalIoTLexer.g:1:462: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 50 :
                // InternalIoTLexer.g:1:478: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 51 :
                // InternalIoTLexer.g:1:495: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 52 :
                // InternalIoTLexer.g:1:504: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 53 :
                // InternalIoTLexer.g:1:513: Comma
                {
                mComma(); 

                }
                break;
            case 54 :
                // InternalIoTLexer.g:1:519: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 55 :
                // InternalIoTLexer.g:1:531: FullStop
                {
                mFullStop(); 

                }
                break;
            case 56 :
                // InternalIoTLexer.g:1:540: Solidus
                {
                mSolidus(); 

                }
                break;
            case 57 :
                // InternalIoTLexer.g:1:548: Colon
                {
                mColon(); 

                }
                break;
            case 58 :
                // InternalIoTLexer.g:1:554: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 59 :
                // InternalIoTLexer.g:1:567: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 60 :
                // InternalIoTLexer.g:1:578: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 61 :
                // InternalIoTLexer.g:1:594: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 62 :
                // InternalIoTLexer.g:1:607: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 63 :
                // InternalIoTLexer.g:1:625: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 64 :
                // InternalIoTLexer.g:1:644: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 65 :
                // InternalIoTLexer.g:1:653: RULE_DBL
                {
                mRULE_DBL(); 

                }
                break;
            case 66 :
                // InternalIoTLexer.g:1:662: RULE_SCI
                {
                mRULE_SCI(); 

                }
                break;
            case 67 :
                // InternalIoTLexer.g:1:671: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 68 :
                // InternalIoTLexer.g:1:684: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 69 :
                // InternalIoTLexer.g:1:700: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 70 :
                // InternalIoTLexer.g:1:716: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // InternalIoTLexer.g:1:724: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // InternalIoTLexer.g:1:736: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalIoTLexer.g:1:744: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\3\56\2\uffff\1\56";
    static final String DFA5_maxS =
        "\1\71\2\145\2\uffff\1\145";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\3\26\uffff\1\4\37\uffff\1\4",
            "\1\3\1\uffff\12\5\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            "\1\3\1\uffff\12\5\13\uffff\1\4\37\uffff\1\4"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "148:12: ( RULE_INT | RULE_DBL )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\14\57\1\112\1\51\1\115\1\117\1\121\1\123\1\125\1\51\4\uffff\1\133\5\uffff\2\142\2\57\1\151\1\51\1\uffff\2\51\2\uffff\5\57\1\uffff\4\57\1\171\24\57\23\uffff\1\u0093\10\uffff\1\142\2\57\1\151\3\uffff\2\57\1\u009c\4\57\1\u00a1\1\u00a2\3\57\1\u00a7\1\uffff\22\57\1\u00bb\6\57\1\uffff\2\57\1\uffff\3\151\2\57\1\uffff\1\57\1\u00c9\1\57\1\u00cb\2\uffff\4\57\1\uffff\1\57\1\u00d1\2\57\1\u00d4\1\57\1\u00d6\12\57\1\u00e1\1\u00e2\1\uffff\1\57\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e7\1\57\1\uffff\1\151\3\57\1\uffff\1\u00ed\1\uffff\2\57\1\u00e7\2\57\1\uffff\1\57\1\u00f3\1\uffff\1\57\1\uffff\1\57\1\u00f6\7\57\1\u00fe\2\uffff\1\57\5\uffff\1\u00e7\2\57\1\u0102\1\uffff\1\57\1\u0104\2\57\1\u0107\1\uffff\2\57\1\uffff\1\u010a\3\57\1\u010e\1\u010f\1\u0110\1\uffff\1\u0111\2\57\1\uffff\1\57\1\uffff\2\57\1\uffff\1\u0117\1\u0118\1\uffff\1\u0119\1\u011a\1\u011b\4\uffff\3\57\1\u011f\1\u0120\5\uffff\2\57\1\u0123\2\uffff\2\57\1\uffff\2\57\1\u0128\1\u0129\2\uffff";
    static final String DFA18_eofS =
        "\u012a\uffff";
    static final String DFA18_minS =
        "\1\0\2\141\1\142\1\141\1\150\1\170\1\156\1\141\1\145\1\141\1\162\1\151\1\75\1\46\1\52\1\76\3\75\1\174\4\uffff\1\60\5\uffff\2\56\1\162\1\141\1\52\1\101\1\uffff\2\0\2\uffff\1\143\1\141\1\144\1\164\1\160\1\uffff\1\145\2\154\1\163\1\60\1\127\1\157\1\141\1\165\1\141\1\155\1\151\1\164\2\143\1\155\1\144\1\151\1\142\1\144\1\163\2\160\1\165\1\146\23\uffff\1\60\6\uffff\1\60\1\uffff\1\56\1\165\1\154\1\0\3\uffff\1\162\1\154\1\60\1\151\1\156\1\145\1\164\2\60\1\161\1\164\1\163\1\60\1\uffff\1\151\1\145\1\153\1\162\1\144\1\156\1\155\1\156\2\145\1\154\1\157\1\163\1\151\1\160\1\145\1\160\1\144\1\60\1\165\1\163\3\145\1\151\1\uffff\1\145\1\163\4\0\1\157\1\151\1\uffff\1\141\1\60\1\154\1\60\2\uffff\1\165\2\145\1\162\1\uffff\1\156\1\60\1\145\1\144\1\60\1\156\1\60\1\141\1\164\2\156\1\165\1\156\1\157\1\141\1\154\1\166\2\60\1\uffff\1\143\6\60\1\145\1\uffff\1\0\2\163\1\156\1\uffff\1\60\1\uffff\1\145\1\162\1\60\1\141\1\144\1\uffff\1\162\1\60\1\uffff\1\145\1\uffff\1\156\1\60\1\164\3\144\1\162\1\154\1\145\1\60\2\uffff\1\145\5\uffff\1\60\2\145\1\60\1\uffff\1\156\1\60\1\143\1\157\1\60\1\uffff\1\154\1\144\1\uffff\1\60\1\163\1\145\1\163\3\60\1\uffff\1\60\2\143\1\uffff\1\143\1\uffff\1\164\1\167\1\uffff\2\60\1\uffff\3\60\4\uffff\2\157\1\171\2\60\5\uffff\2\156\1\60\2\uffff\2\144\1\uffff\2\163\2\60\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\161\1\162\1\163\1\171\1\157\1\170\1\156\1\165\1\145\1\151\1\171\1\151\1\75\1\46\1\52\1\76\3\75\1\174\4\uffff\1\71\5\uffff\2\145\1\162\1\141\1\52\1\172\1\uffff\2\uffff\2\uffff\1\156\2\144\1\164\1\170\1\uffff\1\145\2\154\1\163\1\172\1\164\1\157\1\141\1\165\1\141\1\165\1\151\1\164\1\143\1\162\1\155\1\157\1\151\1\142\1\144\1\163\2\160\1\165\1\146\23\uffff\1\145\6\uffff\1\71\1\uffff\1\145\1\165\1\154\1\uffff\3\uffff\1\162\1\154\1\172\1\151\1\156\1\145\1\164\2\172\1\161\1\164\1\163\1\172\1\uffff\1\151\1\145\1\153\1\162\1\144\1\162\1\155\1\156\2\145\1\154\1\157\1\163\1\151\1\160\1\145\1\160\1\144\1\172\1\165\1\163\3\145\1\151\1\uffff\1\145\1\163\4\uffff\1\157\1\151\1\uffff\1\141\1\172\1\154\1\172\2\uffff\1\165\2\145\1\162\1\uffff\1\156\1\172\1\145\1\144\1\172\1\156\1\172\1\141\1\164\2\156\1\165\1\156\1\157\1\141\1\154\1\166\2\172\1\uffff\1\143\6\172\1\145\1\uffff\1\uffff\2\163\1\156\1\uffff\1\172\1\uffff\1\145\1\162\1\172\1\141\1\144\1\uffff\1\162\1\172\1\uffff\1\145\1\uffff\1\156\1\172\1\164\3\144\1\162\1\154\1\145\1\172\2\uffff\1\145\5\uffff\1\172\2\145\1\172\1\uffff\1\156\1\172\1\143\1\157\1\172\1\uffff\1\154\1\144\1\uffff\1\172\1\163\1\145\1\163\3\172\1\uffff\1\172\2\143\1\uffff\1\143\1\uffff\1\164\1\167\1\uffff\2\172\1\uffff\3\172\4\uffff\2\157\1\171\2\172\5\uffff\2\156\1\172\2\uffff\2\144\1\uffff\2\163\2\172\2\uffff";
    static final String DFA18_acceptS =
        "\25\uffff\1\61\1\62\1\64\1\65\1\uffff\1\70\1\71\1\75\1\76\1\77\6\uffff\1\106\2\uffff\1\110\1\111\5\uffff\1\106\31\uffff\1\47\1\60\1\50\1\51\1\63\1\52\1\66\1\53\1\72\1\54\1\73\1\55\1\74\1\57\1\61\1\62\1\64\1\65\1\67\1\uffff\1\70\1\71\1\75\1\76\1\77\1\100\1\uffff\1\102\4\uffff\1\104\1\107\1\110\15\uffff\1\56\31\uffff\1\101\10\uffff\1\45\4\uffff\1\43\1\44\4\uffff\1\42\23\uffff\1\46\10\uffff\1\105\4\uffff\1\32\1\uffff\1\33\5\uffff\1\30\2\uffff\1\27\1\uffff\1\31\12\uffff\1\37\1\36\1\uffff\1\34\1\35\1\40\1\103\1\41\4\uffff\1\25\5\uffff\1\23\2\uffff\1\24\7\uffff\1\26\3\uffff\1\16\1\uffff\1\15\2\uffff\1\13\2\uffff\1\14\3\uffff\1\21\1\22\1\20\1\17\5\uffff\1\6\1\7\1\10\1\11\1\12\3\uffff\1\4\1\5\2\uffff\1\3\4\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\1\0\45\uffff\1\4\1\7\100\uffff\1\2\55\uffff\1\1\1\6\1\10\1\5\53\uffff\1\3\144\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\15\1\46\1\43\2\51\1\16\1\47\1\25\1\26\1\17\1\27\1\30\1\20\1\31\1\32\1\37\11\40\1\33\1\51\1\21\1\22\1\23\1\34\1\51\5\45\1\42\15\45\1\41\6\45\1\35\1\51\1\36\1\44\1\45\1\51\1\3\1\4\1\5\1\45\1\6\1\2\2\45\1\7\3\45\1\1\2\45\1\12\1\45\1\11\1\10\1\13\2\45\1\14\3\45\1\51\1\24\uff83\51",
            "\1\56\3\uffff\1\53\3\uffff\1\52\5\uffff\1\54\1\uffff\1\55",
            "\1\62\7\uffff\1\61\10\uffff\1\60",
            "\1\63\20\uffff\1\64",
            "\1\70\15\uffff\1\67\2\uffff\1\66\6\uffff\1\65",
            "\1\71\3\uffff\1\73\2\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\77\3\uffff\1\76\15\uffff\1\101\1\100\1\102",
            "\1\103",
            "\1\104\7\uffff\1\105",
            "\1\107\6\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\113",
            "\1\114",
            "\1\116",
            "\1\120",
            "\1\122",
            "\1\124",
            "\1\126",
            "",
            "",
            "",
            "",
            "\12\134",
            "",
            "",
            "",
            "",
            "",
            "\1\143\26\uffff\1\144\37\uffff\1\144",
            "\1\143\1\uffff\12\145\13\uffff\1\144\37\uffff\1\144",
            "\1\146",
            "\1\147",
            "\1\150",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\0\152",
            "\0\152",
            "",
            "",
            "\1\154\10\uffff\1\155\1\uffff\1\156",
            "\1\160\2\uffff\1\157",
            "\1\161",
            "\1\162",
            "\1\163\7\uffff\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\172\34\uffff\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080\7\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\12\uffff\1\u0086\3\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089\12\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
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
            "\12\134\13\uffff\1\144\37\uffff\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\134",
            "",
            "\1\143\1\uffff\12\145\13\uffff\1\144\37\uffff\1\144",
            "\1\u0094",
            "\1\u0095",
            "\12\u0099\1\u0097\2\u0099\1\u0096\34\u0099\1\u0098\uffd5\u0099",
            "",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00a6\6\57",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\3\uffff\1\u00ae",
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
            "\1\u00ba",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\12\u00c4\1\u0097\ufff5\u00c4",
            "\0\u00c4",
            "\12\u0099\1\u0097\2\u0099\1\u0096\25\u0099\1\u00c5\6\u0099\1\u0098\uffd5\u0099",
            "\12\u0099\1\u0097\2\u0099\1\u0096\34\u0099\1\u0098\uffd5\u0099",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ca",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d2",
            "\1\u00d3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00e3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e9",
            "",
            "\12\u0099\1\u0097\2\u0099\1\u0096\34\u0099\1\u0098\uffd5\u0099",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00ff",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0100",
            "\1\u0101",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0103",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0105",
            "\1\u0106",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0108",
            "\1\u0109",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0112",
            "\1\u0113",
            "",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "\1\u0121",
            "\1\u0122",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0124",
            "\1\u0125",
            "",
            "\1\u0126",
            "\1\u0127",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Microseconds | Milliseconds | Frequency | Abstract | ByWindow | Channel | Command | Extends | Include | Seconds | Broker | Client | Filter | Median | Reduce | Sample | Sensor | Serial | Board | Count | Model | Stdev | Baud | Byte | Char | Mean | Mqtt | Pass | Pipe | Ssid | Stop | Type | Wifi | Abs | Map | Max | Min | Sub | ExclamationMarkEqualsSign | AmpersandAmpersand | AsteriskAsterisk | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | As | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | RULE_INT | RULE_DBL | RULE_SCI | RULE_BOOLEAN | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='m') ) {s = 1;}

                        else if ( (LA18_0=='f') ) {s = 2;}

                        else if ( (LA18_0=='a') ) {s = 3;}

                        else if ( (LA18_0=='b') ) {s = 4;}

                        else if ( (LA18_0=='c') ) {s = 5;}

                        else if ( (LA18_0=='e') ) {s = 6;}

                        else if ( (LA18_0=='i') ) {s = 7;}

                        else if ( (LA18_0=='s') ) {s = 8;}

                        else if ( (LA18_0=='r') ) {s = 9;}

                        else if ( (LA18_0=='p') ) {s = 10;}

                        else if ( (LA18_0=='t') ) {s = 11;}

                        else if ( (LA18_0=='w') ) {s = 12;}

                        else if ( (LA18_0=='!') ) {s = 13;}

                        else if ( (LA18_0=='&') ) {s = 14;}

                        else if ( (LA18_0=='*') ) {s = 15;}

                        else if ( (LA18_0=='-') ) {s = 16;}

                        else if ( (LA18_0=='<') ) {s = 17;}

                        else if ( (LA18_0=='=') ) {s = 18;}

                        else if ( (LA18_0=='>') ) {s = 19;}

                        else if ( (LA18_0=='|') ) {s = 20;}

                        else if ( (LA18_0=='(') ) {s = 21;}

                        else if ( (LA18_0==')') ) {s = 22;}

                        else if ( (LA18_0=='+') ) {s = 23;}

                        else if ( (LA18_0==',') ) {s = 24;}

                        else if ( (LA18_0=='.') ) {s = 25;}

                        else if ( (LA18_0=='/') ) {s = 26;}

                        else if ( (LA18_0==':') ) {s = 27;}

                        else if ( (LA18_0=='?') ) {s = 28;}

                        else if ( (LA18_0=='[') ) {s = 29;}

                        else if ( (LA18_0==']') ) {s = 30;}

                        else if ( (LA18_0=='0') ) {s = 31;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 32;}

                        else if ( (LA18_0=='T') ) {s = 33;}

                        else if ( (LA18_0=='F') ) {s = 34;}

                        else if ( (LA18_0=='#') ) {s = 35;}

                        else if ( (LA18_0=='^') ) {s = 36;}

                        else if ( ((LA18_0>='A' && LA18_0<='E')||(LA18_0>='G' && LA18_0<='S')||(LA18_0>='U' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='d'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='l')||(LA18_0>='n' && LA18_0<='o')||LA18_0=='q'||(LA18_0>='u' && LA18_0<='v')||(LA18_0>='x' && LA18_0<='z')) ) {s = 37;}

                        else if ( (LA18_0=='\"') ) {s = 38;}

                        else if ( (LA18_0=='\'') ) {s = 39;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 40;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='$' && LA18_0<='%')||LA18_0==';'||LA18_0=='@'||LA18_0=='\\'||LA18_0=='`'||LA18_0=='{'||(LA18_0>='}' && LA18_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_150 = input.LA(1);

                        s = -1;
                        if ( (LA18_150=='\n') ) {s = 151;}

                        else if ( ((LA18_150>='\u0000' && LA18_150<='\t')||(LA18_150>='\u000B' && LA18_150<='\uFFFF')) ) {s = 196;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_104 = input.LA(1);

                        s = -1;
                        if ( (LA18_104=='\r') ) {s = 150;}

                        else if ( (LA18_104=='\n') ) {s = 151;}

                        else if ( (LA18_104=='*') ) {s = 152;}

                        else if ( ((LA18_104>='\u0000' && LA18_104<='\t')||(LA18_104>='\u000B' && LA18_104<='\f')||(LA18_104>='\u000E' && LA18_104<=')')||(LA18_104>='+' && LA18_104<='\uFFFF')) ) {s = 153;}

                        else s = 105;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_197 = input.LA(1);

                        s = -1;
                        if ( (LA18_197=='*') ) {s = 152;}

                        else if ( (LA18_197=='\r') ) {s = 150;}

                        else if ( (LA18_197=='\n') ) {s = 151;}

                        else if ( ((LA18_197>='\u0000' && LA18_197<='\t')||(LA18_197>='\u000B' && LA18_197<='\f')||(LA18_197>='\u000E' && LA18_197<=')')||(LA18_197>='+' && LA18_197<='\uFFFF')) ) {s = 153;}

                        else s = 105;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_38 = input.LA(1);

                        s = -1;
                        if ( ((LA18_38>='\u0000' && LA18_38<='\uFFFF')) ) {s = 106;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_153 = input.LA(1);

                        s = -1;
                        if ( (LA18_153=='*') ) {s = 152;}

                        else if ( (LA18_153=='\r') ) {s = 150;}

                        else if ( (LA18_153=='\n') ) {s = 151;}

                        else if ( ((LA18_153>='\u0000' && LA18_153<='\t')||(LA18_153>='\u000B' && LA18_153<='\f')||(LA18_153>='\u000E' && LA18_153<=')')||(LA18_153>='+' && LA18_153<='\uFFFF')) ) {s = 153;}

                        else s = 105;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_151 = input.LA(1);

                        s = -1;
                        if ( ((LA18_151>='\u0000' && LA18_151<='\uFFFF')) ) {s = 196;}

                        else s = 105;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_39 = input.LA(1);

                        s = -1;
                        if ( ((LA18_39>='\u0000' && LA18_39<='\uFFFF')) ) {s = 106;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_152 = input.LA(1);

                        s = -1;
                        if ( (LA18_152=='#') ) {s = 197;}

                        else if ( (LA18_152=='*') ) {s = 152;}

                        else if ( (LA18_152=='\r') ) {s = 150;}

                        else if ( (LA18_152=='\n') ) {s = 151;}

                        else if ( ((LA18_152>='\u0000' && LA18_152<='\t')||(LA18_152>='\u000B' && LA18_152<='\f')||(LA18_152>='\u000E' && LA18_152<='\"')||(LA18_152>='$' && LA18_152<=')')||(LA18_152>='+' && LA18_152<='\uFFFF')) ) {s = 153;}

                        else s = 105;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}