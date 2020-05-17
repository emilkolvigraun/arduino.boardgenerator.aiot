package org.xtext.mdsd.arduino.boardgenerator.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.mdsd.arduino.boardgenerator.services.IoTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIoTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Microseconds", "Milliseconds", "Frequency", "Abstract", "ByWindow", "Channel", "Command", "Extends", "Include", "Seconds", "Broker", "Client", "Filter", "Median", "Reduce", "Sample", "Sensor", "Serial", "Board", "Count", "Model", "Stdev", "Baud", "Byte", "Char", "Mean", "Mqtt", "Pass", "Pipe", "Ssid", "Stop", "Type", "Wifi", "Abs", "Map", "Max", "Min", "Sub", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "As", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_DBL", "RULE_SCI", "RULE_BOOLEAN", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalIoTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIoTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIoTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIoTParser.g"; }


    	private IoTGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("QuestionMark", "'?'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("AmpersandAmpersand", "'&&'");
    		tokenNameToValue.put("AsteriskAsterisk", "'**'");
    		tokenNameToValue.put("HyphenMinusGreaterThanSign", "'->'");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("EqualsSignEqualsSign", "'=='");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("As", "'as'");
    		tokenNameToValue.put("VerticalLineVerticalLine", "'||'");
    		tokenNameToValue.put("Abs", "'abs'");
    		tokenNameToValue.put("Map", "'map'");
    		tokenNameToValue.put("Max", "'max'");
    		tokenNameToValue.put("Min", "'min'");
    		tokenNameToValue.put("Sub", "'sub'");
    		tokenNameToValue.put("Baud", "'baud'");
    		tokenNameToValue.put("Byte", "'byte'");
    		tokenNameToValue.put("Char", "'char'");
    		tokenNameToValue.put("Mean", "'mean'");
    		tokenNameToValue.put("Mqtt", "'mqtt'");
    		tokenNameToValue.put("Pass", "'pass'");
    		tokenNameToValue.put("Pipe", "'pipe'");
    		tokenNameToValue.put("Ssid", "'ssid'");
    		tokenNameToValue.put("Stop", "'stop'");
    		tokenNameToValue.put("Type", "'type'");
    		tokenNameToValue.put("Wifi", "'wifi'");
    		tokenNameToValue.put("Board", "'board'");
    		tokenNameToValue.put("Count", "'count'");
    		tokenNameToValue.put("Model", "'model'");
    		tokenNameToValue.put("Stdev", "'stdev'");
    		tokenNameToValue.put("Broker", "'broker'");
    		tokenNameToValue.put("Client", "'client'");
    		tokenNameToValue.put("Filter", "'filter'");
    		tokenNameToValue.put("Median", "'median'");
    		tokenNameToValue.put("Reduce", "'reduce'");
    		tokenNameToValue.put("Sample", "'sample'");
    		tokenNameToValue.put("Sensor", "'sensor'");
    		tokenNameToValue.put("Serial", "'serial'");
    		tokenNameToValue.put("Channel", "'channel'");
    		tokenNameToValue.put("Command", "'command'");
    		tokenNameToValue.put("Extends", "'extends'");
    		tokenNameToValue.put("Include", "'include'");
    		tokenNameToValue.put("Seconds", "'seconds'");
    		tokenNameToValue.put("Abstract", "'abstract'");
    		tokenNameToValue.put("ByWindow", "'byWindow'");
    		tokenNameToValue.put("Frequency", "'frequency'");
    		tokenNameToValue.put("Microseconds", "'microseconds'");
    		tokenNameToValue.put("Milliseconds", "'milliseconds'");
    	}

    	public void setGrammarAccess(IoTGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalIoTParser.g:118:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalIoTParser.g:119:1: ( ruleModel EOF )
            // InternalIoTParser.g:120:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalIoTParser.g:127:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:131:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalIoTParser.g:132:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalIoTParser.g:132:2: ( ( rule__Model__Group__0 ) )
            // InternalIoTParser.g:133:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalIoTParser.g:134:3: ( rule__Model__Group__0 )
            // InternalIoTParser.g:134:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInclude"
    // InternalIoTParser.g:143:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalIoTParser.g:144:1: ( ruleInclude EOF )
            // InternalIoTParser.g:145:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalIoTParser.g:152:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:156:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalIoTParser.g:157:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalIoTParser.g:157:2: ( ( rule__Include__Group__0 ) )
            // InternalIoTParser.g:158:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalIoTParser.g:159:3: ( rule__Include__Group__0 )
            // InternalIoTParser.g:159:4: rule__Include__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleChannel"
    // InternalIoTParser.g:168:1: entryRuleChannel : ruleChannel EOF ;
    public final void entryRuleChannel() throws RecognitionException {
        try {
            // InternalIoTParser.g:169:1: ( ruleChannel EOF )
            // InternalIoTParser.g:170:1: ruleChannel EOF
            {
             before(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getChannelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalIoTParser.g:177:1: ruleChannel : ( ( rule__Channel__Group__0 ) ) ;
    public final void ruleChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:181:2: ( ( ( rule__Channel__Group__0 ) ) )
            // InternalIoTParser.g:182:2: ( ( rule__Channel__Group__0 ) )
            {
            // InternalIoTParser.g:182:2: ( ( rule__Channel__Group__0 ) )
            // InternalIoTParser.g:183:3: ( rule__Channel__Group__0 )
            {
             before(grammarAccess.getChannelAccess().getGroup()); 
            // InternalIoTParser.g:184:3: ( rule__Channel__Group__0 )
            // InternalIoTParser.g:184:4: rule__Channel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleChannelType"
    // InternalIoTParser.g:193:1: entryRuleChannelType : ruleChannelType EOF ;
    public final void entryRuleChannelType() throws RecognitionException {
        try {
            // InternalIoTParser.g:194:1: ( ruleChannelType EOF )
            // InternalIoTParser.g:195:1: ruleChannelType EOF
            {
             before(grammarAccess.getChannelTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleChannelType();

            state._fsp--;

             after(grammarAccess.getChannelTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChannelType"


    // $ANTLR start "ruleChannelType"
    // InternalIoTParser.g:202:1: ruleChannelType : ( ( rule__ChannelType__Alternatives ) ) ;
    public final void ruleChannelType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:206:2: ( ( ( rule__ChannelType__Alternatives ) ) )
            // InternalIoTParser.g:207:2: ( ( rule__ChannelType__Alternatives ) )
            {
            // InternalIoTParser.g:207:2: ( ( rule__ChannelType__Alternatives ) )
            // InternalIoTParser.g:208:3: ( rule__ChannelType__Alternatives )
            {
             before(grammarAccess.getChannelTypeAccess().getAlternatives()); 
            // InternalIoTParser.g:209:3: ( rule__ChannelType__Alternatives )
            // InternalIoTParser.g:209:4: rule__ChannelType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChannelType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChannelTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannelType"


    // $ANTLR start "entryRuleChannelConfig"
    // InternalIoTParser.g:218:1: entryRuleChannelConfig : ruleChannelConfig EOF ;
    public final void entryRuleChannelConfig() throws RecognitionException {
        try {
            // InternalIoTParser.g:219:1: ( ruleChannelConfig EOF )
            // InternalIoTParser.g:220:1: ruleChannelConfig EOF
            {
             before(grammarAccess.getChannelConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleChannelConfig();

            state._fsp--;

             after(grammarAccess.getChannelConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChannelConfig"


    // $ANTLR start "ruleChannelConfig"
    // InternalIoTParser.g:227:1: ruleChannelConfig : ( ( rule__ChannelConfig__Alternatives ) ) ;
    public final void ruleChannelConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:231:2: ( ( ( rule__ChannelConfig__Alternatives ) ) )
            // InternalIoTParser.g:232:2: ( ( rule__ChannelConfig__Alternatives ) )
            {
            // InternalIoTParser.g:232:2: ( ( rule__ChannelConfig__Alternatives ) )
            // InternalIoTParser.g:233:3: ( rule__ChannelConfig__Alternatives )
            {
             before(grammarAccess.getChannelConfigAccess().getAlternatives()); 
            // InternalIoTParser.g:234:3: ( rule__ChannelConfig__Alternatives )
            // InternalIoTParser.g:234:4: rule__ChannelConfig__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChannelConfig__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChannelConfigAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannelConfig"


    // $ANTLR start "entryRuleWifi"
    // InternalIoTParser.g:243:1: entryRuleWifi : ruleWifi EOF ;
    public final void entryRuleWifi() throws RecognitionException {
        try {
            // InternalIoTParser.g:244:1: ( ruleWifi EOF )
            // InternalIoTParser.g:245:1: ruleWifi EOF
            {
             before(grammarAccess.getWifiRule()); 
            pushFollow(FOLLOW_1);
            ruleWifi();

            state._fsp--;

             after(grammarAccess.getWifiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWifi"


    // $ANTLR start "ruleWifi"
    // InternalIoTParser.g:252:1: ruleWifi : ( ( rule__Wifi__Group__0 ) ) ;
    public final void ruleWifi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:256:2: ( ( ( rule__Wifi__Group__0 ) ) )
            // InternalIoTParser.g:257:2: ( ( rule__Wifi__Group__0 ) )
            {
            // InternalIoTParser.g:257:2: ( ( rule__Wifi__Group__0 ) )
            // InternalIoTParser.g:258:3: ( rule__Wifi__Group__0 )
            {
             before(grammarAccess.getWifiAccess().getGroup()); 
            // InternalIoTParser.g:259:3: ( rule__Wifi__Group__0 )
            // InternalIoTParser.g:259:4: rule__Wifi__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wifi__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWifiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWifi"


    // $ANTLR start "entryRuleSerial"
    // InternalIoTParser.g:268:1: entryRuleSerial : ruleSerial EOF ;
    public final void entryRuleSerial() throws RecognitionException {
        try {
            // InternalIoTParser.g:269:1: ( ruleSerial EOF )
            // InternalIoTParser.g:270:1: ruleSerial EOF
            {
             before(grammarAccess.getSerialRule()); 
            pushFollow(FOLLOW_1);
            ruleSerial();

            state._fsp--;

             after(grammarAccess.getSerialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSerial"


    // $ANTLR start "ruleSerial"
    // InternalIoTParser.g:277:1: ruleSerial : ( ( rule__Serial__Group__0 ) ) ;
    public final void ruleSerial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:281:2: ( ( ( rule__Serial__Group__0 ) ) )
            // InternalIoTParser.g:282:2: ( ( rule__Serial__Group__0 ) )
            {
            // InternalIoTParser.g:282:2: ( ( rule__Serial__Group__0 ) )
            // InternalIoTParser.g:283:3: ( rule__Serial__Group__0 )
            {
             before(grammarAccess.getSerialAccess().getGroup()); 
            // InternalIoTParser.g:284:3: ( rule__Serial__Group__0 )
            // InternalIoTParser.g:284:4: rule__Serial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Serial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSerialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSerial"


    // $ANTLR start "entryRulestopChar"
    // InternalIoTParser.g:293:1: entryRulestopChar : rulestopChar EOF ;
    public final void entryRulestopChar() throws RecognitionException {
        try {
            // InternalIoTParser.g:294:1: ( rulestopChar EOF )
            // InternalIoTParser.g:295:1: rulestopChar EOF
            {
             before(grammarAccess.getStopCharRule()); 
            pushFollow(FOLLOW_1);
            rulestopChar();

            state._fsp--;

             after(grammarAccess.getStopCharRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestopChar"


    // $ANTLR start "rulestopChar"
    // InternalIoTParser.g:302:1: rulestopChar : ( ( rule__StopChar__Alternatives ) ) ;
    public final void rulestopChar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:306:2: ( ( ( rule__StopChar__Alternatives ) ) )
            // InternalIoTParser.g:307:2: ( ( rule__StopChar__Alternatives ) )
            {
            // InternalIoTParser.g:307:2: ( ( rule__StopChar__Alternatives ) )
            // InternalIoTParser.g:308:3: ( rule__StopChar__Alternatives )
            {
             before(grammarAccess.getStopCharAccess().getAlternatives()); 
            // InternalIoTParser.g:309:3: ( rule__StopChar__Alternatives )
            // InternalIoTParser.g:309:4: rule__StopChar__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StopChar__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStopCharAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestopChar"


    // $ANTLR start "entryRuleMqttClient"
    // InternalIoTParser.g:318:1: entryRuleMqttClient : ruleMqttClient EOF ;
    public final void entryRuleMqttClient() throws RecognitionException {
        try {
            // InternalIoTParser.g:319:1: ( ruleMqttClient EOF )
            // InternalIoTParser.g:320:1: ruleMqttClient EOF
            {
             before(grammarAccess.getMqttClientRule()); 
            pushFollow(FOLLOW_1);
            ruleMqttClient();

            state._fsp--;

             after(grammarAccess.getMqttClientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMqttClient"


    // $ANTLR start "ruleMqttClient"
    // InternalIoTParser.g:327:1: ruleMqttClient : ( ( rule__MqttClient__Group__0 ) ) ;
    public final void ruleMqttClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:331:2: ( ( ( rule__MqttClient__Group__0 ) ) )
            // InternalIoTParser.g:332:2: ( ( rule__MqttClient__Group__0 ) )
            {
            // InternalIoTParser.g:332:2: ( ( rule__MqttClient__Group__0 ) )
            // InternalIoTParser.g:333:3: ( rule__MqttClient__Group__0 )
            {
             before(grammarAccess.getMqttClientAccess().getGroup()); 
            // InternalIoTParser.g:334:3: ( rule__MqttClient__Group__0 )
            // InternalIoTParser.g:334:4: rule__MqttClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MqttClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMqttClientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMqttClient"


    // $ANTLR start "entryRuleBoard"
    // InternalIoTParser.g:343:1: entryRuleBoard : ruleBoard EOF ;
    public final void entryRuleBoard() throws RecognitionException {
        try {
            // InternalIoTParser.g:344:1: ( ruleBoard EOF )
            // InternalIoTParser.g:345:1: ruleBoard EOF
            {
             before(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getBoardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalIoTParser.g:352:1: ruleBoard : ( ( rule__Board__Group__0 ) ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:356:2: ( ( ( rule__Board__Group__0 ) ) )
            // InternalIoTParser.g:357:2: ( ( rule__Board__Group__0 ) )
            {
            // InternalIoTParser.g:357:2: ( ( rule__Board__Group__0 ) )
            // InternalIoTParser.g:358:3: ( rule__Board__Group__0 )
            {
             before(grammarAccess.getBoardAccess().getGroup()); 
            // InternalIoTParser.g:359:3: ( rule__Board__Group__0 )
            // InternalIoTParser.g:359:4: rule__Board__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleNewBoard"
    // InternalIoTParser.g:368:1: entryRuleNewBoard : ruleNewBoard EOF ;
    public final void entryRuleNewBoard() throws RecognitionException {
        try {
            // InternalIoTParser.g:369:1: ( ruleNewBoard EOF )
            // InternalIoTParser.g:370:1: ruleNewBoard EOF
            {
             before(grammarAccess.getNewBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleNewBoard();

            state._fsp--;

             after(grammarAccess.getNewBoardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNewBoard"


    // $ANTLR start "ruleNewBoard"
    // InternalIoTParser.g:377:1: ruleNewBoard : ( ( rule__NewBoard__Group__0 ) ) ;
    public final void ruleNewBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:381:2: ( ( ( rule__NewBoard__Group__0 ) ) )
            // InternalIoTParser.g:382:2: ( ( rule__NewBoard__Group__0 ) )
            {
            // InternalIoTParser.g:382:2: ( ( rule__NewBoard__Group__0 ) )
            // InternalIoTParser.g:383:3: ( rule__NewBoard__Group__0 )
            {
             before(grammarAccess.getNewBoardAccess().getGroup()); 
            // InternalIoTParser.g:384:3: ( rule__NewBoard__Group__0 )
            // InternalIoTParser.g:384:4: rule__NewBoard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NewBoard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNewBoard"


    // $ANTLR start "entryRuleBoardVersion"
    // InternalIoTParser.g:393:1: entryRuleBoardVersion : ruleBoardVersion EOF ;
    public final void entryRuleBoardVersion() throws RecognitionException {
        try {
            // InternalIoTParser.g:394:1: ( ruleBoardVersion EOF )
            // InternalIoTParser.g:395:1: ruleBoardVersion EOF
            {
             before(grammarAccess.getBoardVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleBoardVersion();

            state._fsp--;

             after(grammarAccess.getBoardVersionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoardVersion"


    // $ANTLR start "ruleBoardVersion"
    // InternalIoTParser.g:402:1: ruleBoardVersion : ( ( rule__BoardVersion__Group__0 ) ) ;
    public final void ruleBoardVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:406:2: ( ( ( rule__BoardVersion__Group__0 ) ) )
            // InternalIoTParser.g:407:2: ( ( rule__BoardVersion__Group__0 ) )
            {
            // InternalIoTParser.g:407:2: ( ( rule__BoardVersion__Group__0 ) )
            // InternalIoTParser.g:408:3: ( rule__BoardVersion__Group__0 )
            {
             before(grammarAccess.getBoardVersionAccess().getGroup()); 
            // InternalIoTParser.g:409:3: ( rule__BoardVersion__Group__0 )
            // InternalIoTParser.g:409:4: rule__BoardVersion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoardVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoardVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoardVersion"


    // $ANTLR start "entryRuleExtendsBoard"
    // InternalIoTParser.g:418:1: entryRuleExtendsBoard : ruleExtendsBoard EOF ;
    public final void entryRuleExtendsBoard() throws RecognitionException {
        try {
            // InternalIoTParser.g:419:1: ( ruleExtendsBoard EOF )
            // InternalIoTParser.g:420:1: ruleExtendsBoard EOF
            {
             before(grammarAccess.getExtendsBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleExtendsBoard();

            state._fsp--;

             after(grammarAccess.getExtendsBoardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtendsBoard"


    // $ANTLR start "ruleExtendsBoard"
    // InternalIoTParser.g:427:1: ruleExtendsBoard : ( ( rule__ExtendsBoard__Group__0 ) ) ;
    public final void ruleExtendsBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:431:2: ( ( ( rule__ExtendsBoard__Group__0 ) ) )
            // InternalIoTParser.g:432:2: ( ( rule__ExtendsBoard__Group__0 ) )
            {
            // InternalIoTParser.g:432:2: ( ( rule__ExtendsBoard__Group__0 ) )
            // InternalIoTParser.g:433:3: ( rule__ExtendsBoard__Group__0 )
            {
             before(grammarAccess.getExtendsBoardAccess().getGroup()); 
            // InternalIoTParser.g:434:3: ( rule__ExtendsBoard__Group__0 )
            // InternalIoTParser.g:434:4: rule__ExtendsBoard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendsBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtendsBoard"


    // $ANTLR start "entryRuleAbstractBoard"
    // InternalIoTParser.g:443:1: entryRuleAbstractBoard : ruleAbstractBoard EOF ;
    public final void entryRuleAbstractBoard() throws RecognitionException {
        try {
            // InternalIoTParser.g:444:1: ( ruleAbstractBoard EOF )
            // InternalIoTParser.g:445:1: ruleAbstractBoard EOF
            {
             before(grammarAccess.getAbstractBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractBoard();

            state._fsp--;

             after(grammarAccess.getAbstractBoardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractBoard"


    // $ANTLR start "ruleAbstractBoard"
    // InternalIoTParser.g:452:1: ruleAbstractBoard : ( ( rule__AbstractBoard__Group__0 ) ) ;
    public final void ruleAbstractBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:456:2: ( ( ( rule__AbstractBoard__Group__0 ) ) )
            // InternalIoTParser.g:457:2: ( ( rule__AbstractBoard__Group__0 ) )
            {
            // InternalIoTParser.g:457:2: ( ( rule__AbstractBoard__Group__0 ) )
            // InternalIoTParser.g:458:3: ( rule__AbstractBoard__Group__0 )
            {
             before(grammarAccess.getAbstractBoardAccess().getGroup()); 
            // InternalIoTParser.g:459:3: ( rule__AbstractBoard__Group__0 )
            // InternalIoTParser.g:459:4: rule__AbstractBoard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBoard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractBoard"


    // $ANTLR start "entryRuleSensor"
    // InternalIoTParser.g:468:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalIoTParser.g:469:1: ( ruleSensor EOF )
            // InternalIoTParser.g:470:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalIoTParser.g:477:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:481:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalIoTParser.g:482:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalIoTParser.g:482:2: ( ( rule__Sensor__Group__0 ) )
            // InternalIoTParser.g:483:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalIoTParser.g:484:3: ( rule__Sensor__Group__0 )
            // InternalIoTParser.g:484:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleSensorType"
    // InternalIoTParser.g:493:1: entryRuleSensorType : ruleSensorType EOF ;
    public final void entryRuleSensorType() throws RecognitionException {
        try {
            // InternalIoTParser.g:494:1: ( ruleSensorType EOF )
            // InternalIoTParser.g:495:1: ruleSensorType EOF
            {
             before(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalIoTParser.g:502:1: ruleSensorType : ( ( rule__SensorType__Alternatives ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:506:2: ( ( ( rule__SensorType__Alternatives ) ) )
            // InternalIoTParser.g:507:2: ( ( rule__SensorType__Alternatives ) )
            {
            // InternalIoTParser.g:507:2: ( ( rule__SensorType__Alternatives ) )
            // InternalIoTParser.g:508:3: ( rule__SensorType__Alternatives )
            {
             before(grammarAccess.getSensorTypeAccess().getAlternatives()); 
            // InternalIoTParser.g:509:3: ( rule__SensorType__Alternatives )
            // InternalIoTParser.g:509:4: rule__SensorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleExternalSensor"
    // InternalIoTParser.g:518:1: entryRuleExternalSensor : ruleExternalSensor EOF ;
    public final void entryRuleExternalSensor() throws RecognitionException {
        try {
            // InternalIoTParser.g:519:1: ( ruleExternalSensor EOF )
            // InternalIoTParser.g:520:1: ruleExternalSensor EOF
            {
             before(grammarAccess.getExternalSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalSensor();

            state._fsp--;

             after(grammarAccess.getExternalSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalSensor"


    // $ANTLR start "ruleExternalSensor"
    // InternalIoTParser.g:527:1: ruleExternalSensor : ( ( rule__ExternalSensor__Group__0 ) ) ;
    public final void ruleExternalSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:531:2: ( ( ( rule__ExternalSensor__Group__0 ) ) )
            // InternalIoTParser.g:532:2: ( ( rule__ExternalSensor__Group__0 ) )
            {
            // InternalIoTParser.g:532:2: ( ( rule__ExternalSensor__Group__0 ) )
            // InternalIoTParser.g:533:3: ( rule__ExternalSensor__Group__0 )
            {
             before(grammarAccess.getExternalSensorAccess().getGroup()); 
            // InternalIoTParser.g:534:3: ( rule__ExternalSensor__Group__0 )
            // InternalIoTParser.g:534:4: rule__ExternalSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalSensor"


    // $ANTLR start "entryRuleOnboardSensor"
    // InternalIoTParser.g:543:1: entryRuleOnboardSensor : ruleOnboardSensor EOF ;
    public final void entryRuleOnboardSensor() throws RecognitionException {
        try {
            // InternalIoTParser.g:544:1: ( ruleOnboardSensor EOF )
            // InternalIoTParser.g:545:1: ruleOnboardSensor EOF
            {
             before(grammarAccess.getOnboardSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleOnboardSensor();

            state._fsp--;

             after(grammarAccess.getOnboardSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnboardSensor"


    // $ANTLR start "ruleOnboardSensor"
    // InternalIoTParser.g:552:1: ruleOnboardSensor : ( ( rule__OnboardSensor__SensorAssignment ) ) ;
    public final void ruleOnboardSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:556:2: ( ( ( rule__OnboardSensor__SensorAssignment ) ) )
            // InternalIoTParser.g:557:2: ( ( rule__OnboardSensor__SensorAssignment ) )
            {
            // InternalIoTParser.g:557:2: ( ( rule__OnboardSensor__SensorAssignment ) )
            // InternalIoTParser.g:558:3: ( rule__OnboardSensor__SensorAssignment )
            {
             before(grammarAccess.getOnboardSensorAccess().getSensorAssignment()); 
            // InternalIoTParser.g:559:3: ( rule__OnboardSensor__SensorAssignment )
            // InternalIoTParser.g:559:4: rule__OnboardSensor__SensorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OnboardSensor__SensorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOnboardSensorAccess().getSensorAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnboardSensor"


    // $ANTLR start "entryRuleSensorVariables"
    // InternalIoTParser.g:568:1: entryRuleSensorVariables : ruleSensorVariables EOF ;
    public final void entryRuleSensorVariables() throws RecognitionException {
        try {
            // InternalIoTParser.g:569:1: ( ruleSensorVariables EOF )
            // InternalIoTParser.g:570:1: ruleSensorVariables EOF
            {
             before(grammarAccess.getSensorVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorVariables();

            state._fsp--;

             after(grammarAccess.getSensorVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorVariables"


    // $ANTLR start "ruleSensorVariables"
    // InternalIoTParser.g:577:1: ruleSensorVariables : ( ( rule__SensorVariables__Group__0 ) ) ;
    public final void ruleSensorVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:581:2: ( ( ( rule__SensorVariables__Group__0 ) ) )
            // InternalIoTParser.g:582:2: ( ( rule__SensorVariables__Group__0 ) )
            {
            // InternalIoTParser.g:582:2: ( ( rule__SensorVariables__Group__0 ) )
            // InternalIoTParser.g:583:3: ( rule__SensorVariables__Group__0 )
            {
             before(grammarAccess.getSensorVariablesAccess().getGroup()); 
            // InternalIoTParser.g:584:3: ( rule__SensorVariables__Group__0 )
            // InternalIoTParser.g:584:4: rule__SensorVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorVariables"


    // $ANTLR start "entryRuleVariable"
    // InternalIoTParser.g:593:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalIoTParser.g:594:1: ( ruleVariable EOF )
            // InternalIoTParser.g:595:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalIoTParser.g:602:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:606:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalIoTParser.g:607:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalIoTParser.g:607:2: ( ( rule__Variable__NameAssignment ) )
            // InternalIoTParser.g:608:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalIoTParser.g:609:3: ( rule__Variable__NameAssignment )
            // InternalIoTParser.g:609:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleSampler"
    // InternalIoTParser.g:618:1: entryRuleSampler : ruleSampler EOF ;
    public final void entryRuleSampler() throws RecognitionException {
        try {
            // InternalIoTParser.g:619:1: ( ruleSampler EOF )
            // InternalIoTParser.g:620:1: ruleSampler EOF
            {
             before(grammarAccess.getSamplerRule()); 
            pushFollow(FOLLOW_1);
            ruleSampler();

            state._fsp--;

             after(grammarAccess.getSamplerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSampler"


    // $ANTLR start "ruleSampler"
    // InternalIoTParser.g:627:1: ruleSampler : ( ( rule__Sampler__Alternatives ) ) ;
    public final void ruleSampler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:631:2: ( ( ( rule__Sampler__Alternatives ) ) )
            // InternalIoTParser.g:632:2: ( ( rule__Sampler__Alternatives ) )
            {
            // InternalIoTParser.g:632:2: ( ( rule__Sampler__Alternatives ) )
            // InternalIoTParser.g:633:3: ( rule__Sampler__Alternatives )
            {
             before(grammarAccess.getSamplerAccess().getAlternatives()); 
            // InternalIoTParser.g:634:3: ( rule__Sampler__Alternatives )
            // InternalIoTParser.g:634:4: rule__Sampler__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sampler__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSamplerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSampler"


    // $ANTLR start "entryRuleCommand"
    // InternalIoTParser.g:643:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalIoTParser.g:644:1: ( ruleCommand EOF )
            // InternalIoTParser.g:645:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalIoTParser.g:652:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:656:2: ( ( ( rule__Command__Group__0 ) ) )
            // InternalIoTParser.g:657:2: ( ( rule__Command__Group__0 ) )
            {
            // InternalIoTParser.g:657:2: ( ( rule__Command__Group__0 ) )
            // InternalIoTParser.g:658:3: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // InternalIoTParser.g:659:3: ( rule__Command__Group__0 )
            // InternalIoTParser.g:659:4: rule__Command__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleFrequency"
    // InternalIoTParser.g:668:1: entryRuleFrequency : ruleFrequency EOF ;
    public final void entryRuleFrequency() throws RecognitionException {
        try {
            // InternalIoTParser.g:669:1: ( ruleFrequency EOF )
            // InternalIoTParser.g:670:1: ruleFrequency EOF
            {
             before(grammarAccess.getFrequencyRule()); 
            pushFollow(FOLLOW_1);
            ruleFrequency();

            state._fsp--;

             after(grammarAccess.getFrequencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrequency"


    // $ANTLR start "ruleFrequency"
    // InternalIoTParser.g:677:1: ruleFrequency : ( ( rule__Frequency__Group__0 ) ) ;
    public final void ruleFrequency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:681:2: ( ( ( rule__Frequency__Group__0 ) ) )
            // InternalIoTParser.g:682:2: ( ( rule__Frequency__Group__0 ) )
            {
            // InternalIoTParser.g:682:2: ( ( rule__Frequency__Group__0 ) )
            // InternalIoTParser.g:683:3: ( rule__Frequency__Group__0 )
            {
             before(grammarAccess.getFrequencyAccess().getGroup()); 
            // InternalIoTParser.g:684:3: ( rule__Frequency__Group__0 )
            // InternalIoTParser.g:684:4: rule__Frequency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrequency"


    // $ANTLR start "entryRuleResolution"
    // InternalIoTParser.g:693:1: entryRuleResolution : ruleResolution EOF ;
    public final void entryRuleResolution() throws RecognitionException {
        try {
            // InternalIoTParser.g:694:1: ( ruleResolution EOF )
            // InternalIoTParser.g:695:1: ruleResolution EOF
            {
             before(grammarAccess.getResolutionRule()); 
            pushFollow(FOLLOW_1);
            ruleResolution();

            state._fsp--;

             after(grammarAccess.getResolutionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResolution"


    // $ANTLR start "ruleResolution"
    // InternalIoTParser.g:702:1: ruleResolution : ( ( rule__Resolution__Alternatives ) ) ;
    public final void ruleResolution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:706:2: ( ( ( rule__Resolution__Alternatives ) ) )
            // InternalIoTParser.g:707:2: ( ( rule__Resolution__Alternatives ) )
            {
            // InternalIoTParser.g:707:2: ( ( rule__Resolution__Alternatives ) )
            // InternalIoTParser.g:708:3: ( rule__Resolution__Alternatives )
            {
             before(grammarAccess.getResolutionAccess().getAlternatives()); 
            // InternalIoTParser.g:709:3: ( rule__Resolution__Alternatives )
            // InternalIoTParser.g:709:4: rule__Resolution__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Resolution__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResolutionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResolution"


    // $ANTLR start "entryRuleSensorOutput"
    // InternalIoTParser.g:718:1: entryRuleSensorOutput : ruleSensorOutput EOF ;
    public final void entryRuleSensorOutput() throws RecognitionException {
        try {
            // InternalIoTParser.g:719:1: ( ruleSensorOutput EOF )
            // InternalIoTParser.g:720:1: ruleSensorOutput EOF
            {
             before(grammarAccess.getSensorOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorOutput();

            state._fsp--;

             after(grammarAccess.getSensorOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorOutput"


    // $ANTLR start "ruleSensorOutput"
    // InternalIoTParser.g:727:1: ruleSensorOutput : ( ( rule__SensorOutput__Group__0 ) ) ;
    public final void ruleSensorOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:731:2: ( ( ( rule__SensorOutput__Group__0 ) ) )
            // InternalIoTParser.g:732:2: ( ( rule__SensorOutput__Group__0 ) )
            {
            // InternalIoTParser.g:732:2: ( ( rule__SensorOutput__Group__0 ) )
            // InternalIoTParser.g:733:3: ( rule__SensorOutput__Group__0 )
            {
             before(grammarAccess.getSensorOutputAccess().getGroup()); 
            // InternalIoTParser.g:734:3: ( rule__SensorOutput__Group__0 )
            // InternalIoTParser.g:734:4: rule__SensorOutput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorOutput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorOutput"


    // $ANTLR start "entryRuleDataOutput"
    // InternalIoTParser.g:743:1: entryRuleDataOutput : ruleDataOutput EOF ;
    public final void entryRuleDataOutput() throws RecognitionException {
        try {
            // InternalIoTParser.g:744:1: ( ruleDataOutput EOF )
            // InternalIoTParser.g:745:1: ruleDataOutput EOF
            {
             before(grammarAccess.getDataOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleDataOutput();

            state._fsp--;

             after(grammarAccess.getDataOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataOutput"


    // $ANTLR start "ruleDataOutput"
    // InternalIoTParser.g:752:1: ruleDataOutput : ( ( rule__DataOutput__Group__0 ) ) ;
    public final void ruleDataOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:756:2: ( ( ( rule__DataOutput__Group__0 ) ) )
            // InternalIoTParser.g:757:2: ( ( rule__DataOutput__Group__0 ) )
            {
            // InternalIoTParser.g:757:2: ( ( rule__DataOutput__Group__0 ) )
            // InternalIoTParser.g:758:3: ( rule__DataOutput__Group__0 )
            {
             before(grammarAccess.getDataOutputAccess().getGroup()); 
            // InternalIoTParser.g:759:3: ( rule__DataOutput__Group__0 )
            // InternalIoTParser.g:759:4: rule__DataOutput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataOutput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataOutput"


    // $ANTLR start "entryRulePipeline"
    // InternalIoTParser.g:768:1: entryRulePipeline : rulePipeline EOF ;
    public final void entryRulePipeline() throws RecognitionException {
        try {
            // InternalIoTParser.g:769:1: ( rulePipeline EOF )
            // InternalIoTParser.g:770:1: rulePipeline EOF
            {
             before(grammarAccess.getPipelineRule()); 
            pushFollow(FOLLOW_1);
            rulePipeline();

            state._fsp--;

             after(grammarAccess.getPipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePipeline"


    // $ANTLR start "rulePipeline"
    // InternalIoTParser.g:777:1: rulePipeline : ( ( rule__Pipeline__Group__0 ) ) ;
    public final void rulePipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:781:2: ( ( ( rule__Pipeline__Group__0 ) ) )
            // InternalIoTParser.g:782:2: ( ( rule__Pipeline__Group__0 ) )
            {
            // InternalIoTParser.g:782:2: ( ( rule__Pipeline__Group__0 ) )
            // InternalIoTParser.g:783:3: ( rule__Pipeline__Group__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup()); 
            // InternalIoTParser.g:784:3: ( rule__Pipeline__Group__0 )
            // InternalIoTParser.g:784:4: rule__Pipeline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleTuplePipeline"
    // InternalIoTParser.g:793:1: entryRuleTuplePipeline : ruleTuplePipeline EOF ;
    public final void entryRuleTuplePipeline() throws RecognitionException {
        try {
            // InternalIoTParser.g:794:1: ( ruleTuplePipeline EOF )
            // InternalIoTParser.g:795:1: ruleTuplePipeline EOF
            {
             before(grammarAccess.getTuplePipelineRule()); 
            pushFollow(FOLLOW_1);
            ruleTuplePipeline();

            state._fsp--;

             after(grammarAccess.getTuplePipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTuplePipeline"


    // $ANTLR start "ruleTuplePipeline"
    // InternalIoTParser.g:802:1: ruleTuplePipeline : ( ( rule__TuplePipeline__Group__0 ) ) ;
    public final void ruleTuplePipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:806:2: ( ( ( rule__TuplePipeline__Group__0 ) ) )
            // InternalIoTParser.g:807:2: ( ( rule__TuplePipeline__Group__0 ) )
            {
            // InternalIoTParser.g:807:2: ( ( rule__TuplePipeline__Group__0 ) )
            // InternalIoTParser.g:808:3: ( rule__TuplePipeline__Group__0 )
            {
             before(grammarAccess.getTuplePipelineAccess().getGroup()); 
            // InternalIoTParser.g:809:3: ( rule__TuplePipeline__Group__0 )
            // InternalIoTParser.g:809:4: rule__TuplePipeline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTuplePipelineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTuplePipeline"


    // $ANTLR start "entryRuleMapPipeline"
    // InternalIoTParser.g:818:1: entryRuleMapPipeline : ruleMapPipeline EOF ;
    public final void entryRuleMapPipeline() throws RecognitionException {
        try {
            // InternalIoTParser.g:819:1: ( ruleMapPipeline EOF )
            // InternalIoTParser.g:820:1: ruleMapPipeline EOF
            {
             before(grammarAccess.getMapPipelineRule()); 
            pushFollow(FOLLOW_1);
            ruleMapPipeline();

            state._fsp--;

             after(grammarAccess.getMapPipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapPipeline"


    // $ANTLR start "ruleMapPipeline"
    // InternalIoTParser.g:827:1: ruleMapPipeline : ( ( rule__MapPipeline__Group__0 ) ) ;
    public final void ruleMapPipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:831:2: ( ( ( rule__MapPipeline__Group__0 ) ) )
            // InternalIoTParser.g:832:2: ( ( rule__MapPipeline__Group__0 ) )
            {
            // InternalIoTParser.g:832:2: ( ( rule__MapPipeline__Group__0 ) )
            // InternalIoTParser.g:833:3: ( rule__MapPipeline__Group__0 )
            {
             before(grammarAccess.getMapPipelineAccess().getGroup()); 
            // InternalIoTParser.g:834:3: ( rule__MapPipeline__Group__0 )
            // InternalIoTParser.g:834:4: rule__MapPipeline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapPipeline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapPipelineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapPipeline"


    // $ANTLR start "entryRuleWindowPipeline"
    // InternalIoTParser.g:843:1: entryRuleWindowPipeline : ruleWindowPipeline EOF ;
    public final void entryRuleWindowPipeline() throws RecognitionException {
        try {
            // InternalIoTParser.g:844:1: ( ruleWindowPipeline EOF )
            // InternalIoTParser.g:845:1: ruleWindowPipeline EOF
            {
             before(grammarAccess.getWindowPipelineRule()); 
            pushFollow(FOLLOW_1);
            ruleWindowPipeline();

            state._fsp--;

             after(grammarAccess.getWindowPipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWindowPipeline"


    // $ANTLR start "ruleWindowPipeline"
    // InternalIoTParser.g:852:1: ruleWindowPipeline : ( ( rule__WindowPipeline__Group__0 ) ) ;
    public final void ruleWindowPipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:856:2: ( ( ( rule__WindowPipeline__Group__0 ) ) )
            // InternalIoTParser.g:857:2: ( ( rule__WindowPipeline__Group__0 ) )
            {
            // InternalIoTParser.g:857:2: ( ( rule__WindowPipeline__Group__0 ) )
            // InternalIoTParser.g:858:3: ( rule__WindowPipeline__Group__0 )
            {
             before(grammarAccess.getWindowPipelineAccess().getGroup()); 
            // InternalIoTParser.g:859:3: ( rule__WindowPipeline__Group__0 )
            // InternalIoTParser.g:859:4: rule__WindowPipeline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WindowPipeline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWindowPipelineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindowPipeline"


    // $ANTLR start "entryRuleExecutePipeline"
    // InternalIoTParser.g:868:1: entryRuleExecutePipeline : ruleExecutePipeline EOF ;
    public final void entryRuleExecutePipeline() throws RecognitionException {
        try {
            // InternalIoTParser.g:869:1: ( ruleExecutePipeline EOF )
            // InternalIoTParser.g:870:1: ruleExecutePipeline EOF
            {
             before(grammarAccess.getExecutePipelineRule()); 
            pushFollow(FOLLOW_1);
            ruleExecutePipeline();

            state._fsp--;

             after(grammarAccess.getExecutePipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExecutePipeline"


    // $ANTLR start "ruleExecutePipeline"
    // InternalIoTParser.g:877:1: ruleExecutePipeline : ( ( rule__ExecutePipeline__Alternatives ) ) ;
    public final void ruleExecutePipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:881:2: ( ( ( rule__ExecutePipeline__Alternatives ) ) )
            // InternalIoTParser.g:882:2: ( ( rule__ExecutePipeline__Alternatives ) )
            {
            // InternalIoTParser.g:882:2: ( ( rule__ExecutePipeline__Alternatives ) )
            // InternalIoTParser.g:883:3: ( rule__ExecutePipeline__Alternatives )
            {
             before(grammarAccess.getExecutePipelineAccess().getAlternatives()); 
            // InternalIoTParser.g:884:3: ( rule__ExecutePipeline__Alternatives )
            // InternalIoTParser.g:884:4: rule__ExecutePipeline__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExecutePipelineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExecutePipeline"


    // $ANTLR start "entryRuleExpression"
    // InternalIoTParser.g:893:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalIoTParser.g:894:1: ( ruleExpression EOF )
            // InternalIoTParser.g:895:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalIoTParser.g:902:1: ruleExpression : ( ruleConditional ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:906:2: ( ( ruleConditional ) )
            // InternalIoTParser.g:907:2: ( ruleConditional )
            {
            // InternalIoTParser.g:907:2: ( ruleConditional )
            // InternalIoTParser.g:908:3: ruleConditional
            {
             before(grammarAccess.getExpressionAccess().getConditionalParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getConditionalParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConditional"
    // InternalIoTParser.g:918:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalIoTParser.g:919:1: ( ruleConditional EOF )
            // InternalIoTParser.g:920:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalIoTParser.g:927:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:931:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalIoTParser.g:932:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalIoTParser.g:932:2: ( ( rule__Conditional__Group__0 ) )
            // InternalIoTParser.g:933:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalIoTParser.g:934:3: ( rule__Conditional__Group__0 )
            // InternalIoTParser.g:934:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOr"
    // InternalIoTParser.g:943:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalIoTParser.g:944:1: ( ruleOr EOF )
            // InternalIoTParser.g:945:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalIoTParser.g:952:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:956:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalIoTParser.g:957:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalIoTParser.g:957:2: ( ( rule__Or__Group__0 ) )
            // InternalIoTParser.g:958:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalIoTParser.g:959:3: ( rule__Or__Group__0 )
            // InternalIoTParser.g:959:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalIoTParser.g:968:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalIoTParser.g:969:1: ( ruleAnd EOF )
            // InternalIoTParser.g:970:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalIoTParser.g:977:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:981:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalIoTParser.g:982:2: ( ( rule__And__Group__0 ) )
            {
            // InternalIoTParser.g:982:2: ( ( rule__And__Group__0 ) )
            // InternalIoTParser.g:983:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalIoTParser.g:984:3: ( rule__And__Group__0 )
            // InternalIoTParser.g:984:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalIoTParser.g:993:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalIoTParser.g:994:1: ( ruleEquality EOF )
            // InternalIoTParser.g:995:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalIoTParser.g:1002:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1006:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalIoTParser.g:1007:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalIoTParser.g:1007:2: ( ( rule__Equality__Group__0 ) )
            // InternalIoTParser.g:1008:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalIoTParser.g:1009:3: ( rule__Equality__Group__0 )
            // InternalIoTParser.g:1009:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalIoTParser.g:1018:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalIoTParser.g:1019:1: ( ruleComparison EOF )
            // InternalIoTParser.g:1020:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalIoTParser.g:1027:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1031:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalIoTParser.g:1032:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalIoTParser.g:1032:2: ( ( rule__Comparison__Group__0 ) )
            // InternalIoTParser.g:1033:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalIoTParser.g:1034:3: ( rule__Comparison__Group__0 )
            // InternalIoTParser.g:1034:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleSubAdd"
    // InternalIoTParser.g:1043:1: entryRuleSubAdd : ruleSubAdd EOF ;
    public final void entryRuleSubAdd() throws RecognitionException {
        try {
            // InternalIoTParser.g:1044:1: ( ruleSubAdd EOF )
            // InternalIoTParser.g:1045:1: ruleSubAdd EOF
            {
             before(grammarAccess.getSubAddRule()); 
            pushFollow(FOLLOW_1);
            ruleSubAdd();

            state._fsp--;

             after(grammarAccess.getSubAddRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubAdd"


    // $ANTLR start "ruleSubAdd"
    // InternalIoTParser.g:1052:1: ruleSubAdd : ( ( rule__SubAdd__Group__0 ) ) ;
    public final void ruleSubAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1056:2: ( ( ( rule__SubAdd__Group__0 ) ) )
            // InternalIoTParser.g:1057:2: ( ( rule__SubAdd__Group__0 ) )
            {
            // InternalIoTParser.g:1057:2: ( ( rule__SubAdd__Group__0 ) )
            // InternalIoTParser.g:1058:3: ( rule__SubAdd__Group__0 )
            {
             before(grammarAccess.getSubAddAccess().getGroup()); 
            // InternalIoTParser.g:1059:3: ( rule__SubAdd__Group__0 )
            // InternalIoTParser.g:1059:4: rule__SubAdd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubAdd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubAddAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubAdd"


    // $ANTLR start "entryRuleMulDiv"
    // InternalIoTParser.g:1068:1: entryRuleMulDiv : ruleMulDiv EOF ;
    public final void entryRuleMulDiv() throws RecognitionException {
        try {
            // InternalIoTParser.g:1069:1: ( ruleMulDiv EOF )
            // InternalIoTParser.g:1070:1: ruleMulDiv EOF
            {
             before(grammarAccess.getMulDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getMulDivRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulDiv"


    // $ANTLR start "ruleMulDiv"
    // InternalIoTParser.g:1077:1: ruleMulDiv : ( ( rule__MulDiv__Group__0 ) ) ;
    public final void ruleMulDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1081:2: ( ( ( rule__MulDiv__Group__0 ) ) )
            // InternalIoTParser.g:1082:2: ( ( rule__MulDiv__Group__0 ) )
            {
            // InternalIoTParser.g:1082:2: ( ( rule__MulDiv__Group__0 ) )
            // InternalIoTParser.g:1083:3: ( rule__MulDiv__Group__0 )
            {
             before(grammarAccess.getMulDivAccess().getGroup()); 
            // InternalIoTParser.g:1084:3: ( rule__MulDiv__Group__0 )
            // InternalIoTParser.g:1084:4: rule__MulDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRuleNegation"
    // InternalIoTParser.g:1093:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalIoTParser.g:1094:1: ( ruleNegation EOF )
            // InternalIoTParser.g:1095:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalIoTParser.g:1102:1: ruleNegation : ( ( rule__Negation__Alternatives ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1106:2: ( ( ( rule__Negation__Alternatives ) ) )
            // InternalIoTParser.g:1107:2: ( ( rule__Negation__Alternatives ) )
            {
            // InternalIoTParser.g:1107:2: ( ( rule__Negation__Alternatives ) )
            // InternalIoTParser.g:1108:3: ( rule__Negation__Alternatives )
            {
             before(grammarAccess.getNegationAccess().getAlternatives()); 
            // InternalIoTParser.g:1109:3: ( rule__Negation__Alternatives )
            // InternalIoTParser.g:1109:4: rule__Negation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleExponent"
    // InternalIoTParser.g:1118:1: entryRuleExponent : ruleExponent EOF ;
    public final void entryRuleExponent() throws RecognitionException {
        try {
            // InternalIoTParser.g:1119:1: ( ruleExponent EOF )
            // InternalIoTParser.g:1120:1: ruleExponent EOF
            {
             before(grammarAccess.getExponentRule()); 
            pushFollow(FOLLOW_1);
            ruleExponent();

            state._fsp--;

             after(grammarAccess.getExponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExponent"


    // $ANTLR start "ruleExponent"
    // InternalIoTParser.g:1127:1: ruleExponent : ( ( rule__Exponent__Group__0 ) ) ;
    public final void ruleExponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1131:2: ( ( ( rule__Exponent__Group__0 ) ) )
            // InternalIoTParser.g:1132:2: ( ( rule__Exponent__Group__0 ) )
            {
            // InternalIoTParser.g:1132:2: ( ( rule__Exponent__Group__0 ) )
            // InternalIoTParser.g:1133:3: ( rule__Exponent__Group__0 )
            {
             before(grammarAccess.getExponentAccess().getGroup()); 
            // InternalIoTParser.g:1134:3: ( rule__Exponent__Group__0 )
            // InternalIoTParser.g:1134:4: rule__Exponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExponent"


    // $ANTLR start "entryRuleNot"
    // InternalIoTParser.g:1143:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalIoTParser.g:1144:1: ( ruleNot EOF )
            // InternalIoTParser.g:1145:1: ruleNot EOF
            {
             before(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalIoTParser.g:1152:1: ruleNot : ( ( rule__Not__Alternatives ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1156:2: ( ( ( rule__Not__Alternatives ) ) )
            // InternalIoTParser.g:1157:2: ( ( rule__Not__Alternatives ) )
            {
            // InternalIoTParser.g:1157:2: ( ( rule__Not__Alternatives ) )
            // InternalIoTParser.g:1158:3: ( rule__Not__Alternatives )
            {
             before(grammarAccess.getNotAccess().getAlternatives()); 
            // InternalIoTParser.g:1159:3: ( rule__Not__Alternatives )
            // InternalIoTParser.g:1159:4: rule__Not__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Not__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRulePrimary"
    // InternalIoTParser.g:1168:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalIoTParser.g:1169:1: ( rulePrimary EOF )
            // InternalIoTParser.g:1170:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalIoTParser.g:1177:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1181:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalIoTParser.g:1182:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalIoTParser.g:1182:2: ( ( rule__Primary__Alternatives ) )
            // InternalIoTParser.g:1183:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalIoTParser.g:1184:3: ( rule__Primary__Alternatives )
            // InternalIoTParser.g:1184:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleReference"
    // InternalIoTParser.g:1193:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalIoTParser.g:1194:1: ( ruleReference EOF )
            // InternalIoTParser.g:1195:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalIoTParser.g:1202:1: ruleReference : ( ( rule__Reference__RefAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1206:2: ( ( ( rule__Reference__RefAssignment ) ) )
            // InternalIoTParser.g:1207:2: ( ( rule__Reference__RefAssignment ) )
            {
            // InternalIoTParser.g:1207:2: ( ( rule__Reference__RefAssignment ) )
            // InternalIoTParser.g:1208:3: ( rule__Reference__RefAssignment )
            {
             before(grammarAccess.getReferenceAccess().getRefAssignment()); 
            // InternalIoTParser.g:1209:3: ( rule__Reference__RefAssignment )
            // InternalIoTParser.g:1209:4: rule__Reference__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Reference__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalIoTParser.g:1218:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalIoTParser.g:1219:1: ( ruleStringLiteral EOF )
            // InternalIoTParser.g:1220:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalIoTParser.g:1227:1: ruleStringLiteral : ( ( rule__StringLiteral__StrAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1231:2: ( ( ( rule__StringLiteral__StrAssignment ) ) )
            // InternalIoTParser.g:1232:2: ( ( rule__StringLiteral__StrAssignment ) )
            {
            // InternalIoTParser.g:1232:2: ( ( rule__StringLiteral__StrAssignment ) )
            // InternalIoTParser.g:1233:3: ( rule__StringLiteral__StrAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getStrAssignment()); 
            // InternalIoTParser.g:1234:3: ( rule__StringLiteral__StrAssignment )
            // InternalIoTParser.g:1234:4: rule__StringLiteral__StrAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__StrAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getStrAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalIoTParser.g:1243:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalIoTParser.g:1244:1: ( ruleNumberLiteral EOF )
            // InternalIoTParser.g:1245:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalIoTParser.g:1252:1: ruleNumberLiteral : ( ( rule__NumberLiteral__NumbAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1256:2: ( ( ( rule__NumberLiteral__NumbAssignment ) ) )
            // InternalIoTParser.g:1257:2: ( ( rule__NumberLiteral__NumbAssignment ) )
            {
            // InternalIoTParser.g:1257:2: ( ( rule__NumberLiteral__NumbAssignment ) )
            // InternalIoTParser.g:1258:3: ( rule__NumberLiteral__NumbAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getNumbAssignment()); 
            // InternalIoTParser.g:1259:3: ( rule__NumberLiteral__NumbAssignment )
            // InternalIoTParser.g:1259:4: rule__NumberLiteral__NumbAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__NumbAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getNumbAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalIoTParser.g:1268:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalIoTParser.g:1269:1: ( ruleBooleanLiteral EOF )
            // InternalIoTParser.g:1270:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalIoTParser.g:1277:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__BoolAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1281:2: ( ( ( rule__BooleanLiteral__BoolAssignment ) ) )
            // InternalIoTParser.g:1282:2: ( ( rule__BooleanLiteral__BoolAssignment ) )
            {
            // InternalIoTParser.g:1282:2: ( ( rule__BooleanLiteral__BoolAssignment ) )
            // InternalIoTParser.g:1283:3: ( rule__BooleanLiteral__BoolAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getBoolAssignment()); 
            // InternalIoTParser.g:1284:3: ( rule__BooleanLiteral__BoolAssignment )
            // InternalIoTParser.g:1284:4: rule__BooleanLiteral__BoolAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__BoolAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getBoolAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNUMBER"
    // InternalIoTParser.g:1293:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:1297:1: ( ruleNUMBER EOF )
            // InternalIoTParser.g:1298:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalIoTParser.g:1308:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1313:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // InternalIoTParser.g:1314:2: ( ( rule__NUMBER__Alternatives ) )
            {
            // InternalIoTParser.g:1314:2: ( ( rule__NUMBER__Alternatives ) )
            // InternalIoTParser.g:1315:3: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // InternalIoTParser.g:1316:3: ( rule__NUMBER__Alternatives )
            // InternalIoTParser.g:1316:4: rule__NUMBER__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "rule__ChannelType__Alternatives"
    // InternalIoTParser.g:1325:1: rule__ChannelType__Alternatives : ( ( ( rule__ChannelType__Group_0__0 ) ) | ( ( rule__ChannelType__Group_1__0 ) ) | ( ( rule__ChannelType__Group_2__0 ) ) );
    public final void rule__ChannelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1329:1: ( ( ( rule__ChannelType__Group_0__0 ) ) | ( ( rule__ChannelType__Group_1__0 ) ) | ( ( rule__ChannelType__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case Wifi:
                {
                alt1=1;
                }
                break;
            case Serial:
                {
                alt1=2;
                }
                break;
            case Mqtt:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalIoTParser.g:1330:2: ( ( rule__ChannelType__Group_0__0 ) )
                    {
                    // InternalIoTParser.g:1330:2: ( ( rule__ChannelType__Group_0__0 ) )
                    // InternalIoTParser.g:1331:3: ( rule__ChannelType__Group_0__0 )
                    {
                     before(grammarAccess.getChannelTypeAccess().getGroup_0()); 
                    // InternalIoTParser.g:1332:3: ( rule__ChannelType__Group_0__0 )
                    // InternalIoTParser.g:1332:4: rule__ChannelType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChannelType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChannelTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1336:2: ( ( rule__ChannelType__Group_1__0 ) )
                    {
                    // InternalIoTParser.g:1336:2: ( ( rule__ChannelType__Group_1__0 ) )
                    // InternalIoTParser.g:1337:3: ( rule__ChannelType__Group_1__0 )
                    {
                     before(grammarAccess.getChannelTypeAccess().getGroup_1()); 
                    // InternalIoTParser.g:1338:3: ( rule__ChannelType__Group_1__0 )
                    // InternalIoTParser.g:1338:4: rule__ChannelType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChannelType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChannelTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1342:2: ( ( rule__ChannelType__Group_2__0 ) )
                    {
                    // InternalIoTParser.g:1342:2: ( ( rule__ChannelType__Group_2__0 ) )
                    // InternalIoTParser.g:1343:3: ( rule__ChannelType__Group_2__0 )
                    {
                     before(grammarAccess.getChannelTypeAccess().getGroup_2()); 
                    // InternalIoTParser.g:1344:3: ( rule__ChannelType__Group_2__0 )
                    // InternalIoTParser.g:1344:4: rule__ChannelType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChannelType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChannelTypeAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Alternatives"


    // $ANTLR start "rule__ChannelConfig__Alternatives"
    // InternalIoTParser.g:1352:1: rule__ChannelConfig__Alternatives : ( ( ruleWifi ) | ( ruleSerial ) | ( ruleMqttClient ) );
    public final void rule__ChannelConfig__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1356:1: ( ( ruleWifi ) | ( ruleSerial ) | ( ruleMqttClient ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case Ssid:
                {
                alt2=1;
                }
                break;
            case Baud:
                {
                alt2=2;
                }
                break;
            case Broker:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalIoTParser.g:1357:2: ( ruleWifi )
                    {
                    // InternalIoTParser.g:1357:2: ( ruleWifi )
                    // InternalIoTParser.g:1358:3: ruleWifi
                    {
                     before(grammarAccess.getChannelConfigAccess().getWifiParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWifi();

                    state._fsp--;

                     after(grammarAccess.getChannelConfigAccess().getWifiParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1363:2: ( ruleSerial )
                    {
                    // InternalIoTParser.g:1363:2: ( ruleSerial )
                    // InternalIoTParser.g:1364:3: ruleSerial
                    {
                     before(grammarAccess.getChannelConfigAccess().getSerialParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSerial();

                    state._fsp--;

                     after(grammarAccess.getChannelConfigAccess().getSerialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1369:2: ( ruleMqttClient )
                    {
                    // InternalIoTParser.g:1369:2: ( ruleMqttClient )
                    // InternalIoTParser.g:1370:3: ruleMqttClient
                    {
                     before(grammarAccess.getChannelConfigAccess().getMqttClientParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMqttClient();

                    state._fsp--;

                     after(grammarAccess.getChannelConfigAccess().getMqttClientParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelConfig__Alternatives"


    // $ANTLR start "rule__StopChar__Alternatives"
    // InternalIoTParser.g:1379:1: rule__StopChar__Alternatives : ( ( ( rule__StopChar__Group_0__0 ) ) | ( ( rule__StopChar__Group_1__0 ) ) );
    public final void rule__StopChar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1383:1: ( ( ( rule__StopChar__Group_0__0 ) ) | ( ( rule__StopChar__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Char) ) {
                alt3=1;
            }
            else if ( (LA3_0==Byte) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIoTParser.g:1384:2: ( ( rule__StopChar__Group_0__0 ) )
                    {
                    // InternalIoTParser.g:1384:2: ( ( rule__StopChar__Group_0__0 ) )
                    // InternalIoTParser.g:1385:3: ( rule__StopChar__Group_0__0 )
                    {
                     before(grammarAccess.getStopCharAccess().getGroup_0()); 
                    // InternalIoTParser.g:1386:3: ( rule__StopChar__Group_0__0 )
                    // InternalIoTParser.g:1386:4: rule__StopChar__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StopChar__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStopCharAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1390:2: ( ( rule__StopChar__Group_1__0 ) )
                    {
                    // InternalIoTParser.g:1390:2: ( ( rule__StopChar__Group_1__0 ) )
                    // InternalIoTParser.g:1391:3: ( rule__StopChar__Group_1__0 )
                    {
                     before(grammarAccess.getStopCharAccess().getGroup_1()); 
                    // InternalIoTParser.g:1392:3: ( rule__StopChar__Group_1__0 )
                    // InternalIoTParser.g:1392:4: rule__StopChar__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StopChar__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStopCharAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Alternatives"


    // $ANTLR start "rule__Board__Alternatives_1"
    // InternalIoTParser.g:1400:1: rule__Board__Alternatives_1 : ( ( ruleNewBoard ) | ( ruleExtendsBoard ) );
    public final void rule__Board__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1404:1: ( ( ruleNewBoard ) | ( ruleExtendsBoard ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==Extends) ) {
                    alt4=2;
                }
                else if ( (LA4_1==Colon) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIoTParser.g:1405:2: ( ruleNewBoard )
                    {
                    // InternalIoTParser.g:1405:2: ( ruleNewBoard )
                    // InternalIoTParser.g:1406:3: ruleNewBoard
                    {
                     before(grammarAccess.getBoardAccess().getNewBoardParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNewBoard();

                    state._fsp--;

                     after(grammarAccess.getBoardAccess().getNewBoardParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1411:2: ( ruleExtendsBoard )
                    {
                    // InternalIoTParser.g:1411:2: ( ruleExtendsBoard )
                    // InternalIoTParser.g:1412:3: ruleExtendsBoard
                    {
                     before(grammarAccess.getBoardAccess().getExtendsBoardParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExtendsBoard();

                    state._fsp--;

                     after(grammarAccess.getBoardAccess().getExtendsBoardParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Alternatives_1"


    // $ANTLR start "rule__SensorType__Alternatives"
    // InternalIoTParser.g:1421:1: rule__SensorType__Alternatives : ( ( ruleExternalSensor ) | ( ruleOnboardSensor ) );
    public final void rule__SensorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1425:1: ( ( ruleExternalSensor ) | ( ruleOnboardSensor ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==As) ) {
                    alt5=2;
                }
                else if ( (LA5_1==LeftParenthesis) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoTParser.g:1426:2: ( ruleExternalSensor )
                    {
                    // InternalIoTParser.g:1426:2: ( ruleExternalSensor )
                    // InternalIoTParser.g:1427:3: ruleExternalSensor
                    {
                     before(grammarAccess.getSensorTypeAccess().getExternalSensorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorTypeAccess().getExternalSensorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1432:2: ( ruleOnboardSensor )
                    {
                    // InternalIoTParser.g:1432:2: ( ruleOnboardSensor )
                    // InternalIoTParser.g:1433:3: ruleOnboardSensor
                    {
                     before(grammarAccess.getSensorTypeAccess().getOnboardSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOnboardSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorTypeAccess().getOnboardSensorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorType__Alternatives"


    // $ANTLR start "rule__Sampler__Alternatives"
    // InternalIoTParser.g:1442:1: rule__Sampler__Alternatives : ( ( ruleCommand ) | ( ruleFrequency ) );
    public final void rule__Sampler__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1446:1: ( ( ruleCommand ) | ( ruleFrequency ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Command) ) {
                alt6=1;
            }
            else if ( (LA6_0==Frequency) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIoTParser.g:1447:2: ( ruleCommand )
                    {
                    // InternalIoTParser.g:1447:2: ( ruleCommand )
                    // InternalIoTParser.g:1448:3: ruleCommand
                    {
                     before(grammarAccess.getSamplerAccess().getCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommand();

                    state._fsp--;

                     after(grammarAccess.getSamplerAccess().getCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1453:2: ( ruleFrequency )
                    {
                    // InternalIoTParser.g:1453:2: ( ruleFrequency )
                    // InternalIoTParser.g:1454:3: ruleFrequency
                    {
                     before(grammarAccess.getSamplerAccess().getFrequencyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFrequency();

                    state._fsp--;

                     after(grammarAccess.getSamplerAccess().getFrequencyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sampler__Alternatives"


    // $ANTLR start "rule__Resolution__Alternatives"
    // InternalIoTParser.g:1463:1: rule__Resolution__Alternatives : ( ( ( rule__Resolution__Group_0__0 ) ) | ( ( rule__Resolution__Group_1__0 ) ) | ( ( rule__Resolution__Group_2__0 ) ) );
    public final void rule__Resolution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1467:1: ( ( ( rule__Resolution__Group_0__0 ) ) | ( ( rule__Resolution__Group_1__0 ) ) | ( ( rule__Resolution__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case Seconds:
                {
                alt7=1;
                }
                break;
            case Milliseconds:
                {
                alt7=2;
                }
                break;
            case Microseconds:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIoTParser.g:1468:2: ( ( rule__Resolution__Group_0__0 ) )
                    {
                    // InternalIoTParser.g:1468:2: ( ( rule__Resolution__Group_0__0 ) )
                    // InternalIoTParser.g:1469:3: ( rule__Resolution__Group_0__0 )
                    {
                     before(grammarAccess.getResolutionAccess().getGroup_0()); 
                    // InternalIoTParser.g:1470:3: ( rule__Resolution__Group_0__0 )
                    // InternalIoTParser.g:1470:4: rule__Resolution__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resolution__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResolutionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1474:2: ( ( rule__Resolution__Group_1__0 ) )
                    {
                    // InternalIoTParser.g:1474:2: ( ( rule__Resolution__Group_1__0 ) )
                    // InternalIoTParser.g:1475:3: ( rule__Resolution__Group_1__0 )
                    {
                     before(grammarAccess.getResolutionAccess().getGroup_1()); 
                    // InternalIoTParser.g:1476:3: ( rule__Resolution__Group_1__0 )
                    // InternalIoTParser.g:1476:4: rule__Resolution__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resolution__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResolutionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1480:2: ( ( rule__Resolution__Group_2__0 ) )
                    {
                    // InternalIoTParser.g:1480:2: ( ( rule__Resolution__Group_2__0 ) )
                    // InternalIoTParser.g:1481:3: ( rule__Resolution__Group_2__0 )
                    {
                     before(grammarAccess.getResolutionAccess().getGroup_2()); 
                    // InternalIoTParser.g:1482:3: ( rule__Resolution__Group_2__0 )
                    // InternalIoTParser.g:1482:4: rule__Resolution__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resolution__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResolutionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Alternatives"


    // $ANTLR start "rule__Pipeline__Alternatives_1"
    // InternalIoTParser.g:1490:1: rule__Pipeline__Alternatives_1 : ( ( ruleTuplePipeline ) | ( ruleMapPipeline ) | ( ruleWindowPipeline ) );
    public final void rule__Pipeline__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1494:1: ( ( ruleTuplePipeline ) | ( ruleMapPipeline ) | ( ruleWindowPipeline ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case Filter:
            case Abs:
                {
                alt8=1;
                }
                break;
            case Map:
                {
                alt8=2;
                }
                break;
            case ByWindow:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalIoTParser.g:1495:2: ( ruleTuplePipeline )
                    {
                    // InternalIoTParser.g:1495:2: ( ruleTuplePipeline )
                    // InternalIoTParser.g:1496:3: ruleTuplePipeline
                    {
                     before(grammarAccess.getPipelineAccess().getTuplePipelineParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTuplePipeline();

                    state._fsp--;

                     after(grammarAccess.getPipelineAccess().getTuplePipelineParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1501:2: ( ruleMapPipeline )
                    {
                    // InternalIoTParser.g:1501:2: ( ruleMapPipeline )
                    // InternalIoTParser.g:1502:3: ruleMapPipeline
                    {
                     before(grammarAccess.getPipelineAccess().getMapPipelineParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMapPipeline();

                    state._fsp--;

                     after(grammarAccess.getPipelineAccess().getMapPipelineParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1507:2: ( ruleWindowPipeline )
                    {
                    // InternalIoTParser.g:1507:2: ( ruleWindowPipeline )
                    // InternalIoTParser.g:1508:3: ruleWindowPipeline
                    {
                     before(grammarAccess.getPipelineAccess().getWindowPipelineParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWindowPipeline();

                    state._fsp--;

                     after(grammarAccess.getPipelineAccess().getWindowPipelineParserRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Alternatives_1"


    // $ANTLR start "rule__TuplePipeline__Alternatives_0"
    // InternalIoTParser.g:1517:1: rule__TuplePipeline__Alternatives_0 : ( ( ( rule__TuplePipeline__Group_0_0__0 ) ) | ( ( rule__TuplePipeline__Group_0_1__0 ) ) );
    public final void rule__TuplePipeline__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1521:1: ( ( ( rule__TuplePipeline__Group_0_0__0 ) ) | ( ( rule__TuplePipeline__Group_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Filter) ) {
                alt9=1;
            }
            else if ( (LA9_0==Abs) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoTParser.g:1522:2: ( ( rule__TuplePipeline__Group_0_0__0 ) )
                    {
                    // InternalIoTParser.g:1522:2: ( ( rule__TuplePipeline__Group_0_0__0 ) )
                    // InternalIoTParser.g:1523:3: ( rule__TuplePipeline__Group_0_0__0 )
                    {
                     before(grammarAccess.getTuplePipelineAccess().getGroup_0_0()); 
                    // InternalIoTParser.g:1524:3: ( rule__TuplePipeline__Group_0_0__0 )
                    // InternalIoTParser.g:1524:4: rule__TuplePipeline__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TuplePipeline__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTuplePipelineAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1528:2: ( ( rule__TuplePipeline__Group_0_1__0 ) )
                    {
                    // InternalIoTParser.g:1528:2: ( ( rule__TuplePipeline__Group_0_1__0 ) )
                    // InternalIoTParser.g:1529:3: ( rule__TuplePipeline__Group_0_1__0 )
                    {
                     before(grammarAccess.getTuplePipelineAccess().getGroup_0_1()); 
                    // InternalIoTParser.g:1530:3: ( rule__TuplePipeline__Group_0_1__0 )
                    // InternalIoTParser.g:1530:4: rule__TuplePipeline__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TuplePipeline__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTuplePipelineAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Alternatives_0"


    // $ANTLR start "rule__ExecutePipeline__Alternatives"
    // InternalIoTParser.g:1538:1: rule__ExecutePipeline__Alternatives : ( ( ( rule__ExecutePipeline__Group_0__0 ) ) | ( ( rule__ExecutePipeline__Group_1__0 ) ) | ( ( rule__ExecutePipeline__Group_2__0 ) ) | ( ( rule__ExecutePipeline__Group_3__0 ) ) | ( ( rule__ExecutePipeline__Group_4__0 ) ) | ( ( rule__ExecutePipeline__Group_5__0 ) ) | ( ( rule__ExecutePipeline__Group_6__0 ) ) );
    public final void rule__ExecutePipeline__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1542:1: ( ( ( rule__ExecutePipeline__Group_0__0 ) ) | ( ( rule__ExecutePipeline__Group_1__0 ) ) | ( ( rule__ExecutePipeline__Group_2__0 ) ) | ( ( rule__ExecutePipeline__Group_3__0 ) ) | ( ( rule__ExecutePipeline__Group_4__0 ) ) | ( ( rule__ExecutePipeline__Group_5__0 ) ) | ( ( rule__ExecutePipeline__Group_6__0 ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case Reduce:
                {
                alt10=1;
                }
                break;
            case Mean:
                {
                alt10=2;
                }
                break;
            case Median:
                {
                alt10=3;
                }
                break;
            case Stdev:
                {
                alt10=4;
                }
                break;
            case Min:
                {
                alt10=5;
                }
                break;
            case Max:
                {
                alt10=6;
                }
                break;
            case Count:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalIoTParser.g:1543:2: ( ( rule__ExecutePipeline__Group_0__0 ) )
                    {
                    // InternalIoTParser.g:1543:2: ( ( rule__ExecutePipeline__Group_0__0 ) )
                    // InternalIoTParser.g:1544:3: ( rule__ExecutePipeline__Group_0__0 )
                    {
                     before(grammarAccess.getExecutePipelineAccess().getGroup_0()); 
                    // InternalIoTParser.g:1545:3: ( rule__ExecutePipeline__Group_0__0 )
                    // InternalIoTParser.g:1545:4: rule__ExecutePipeline__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutePipeline__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecutePipelineAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1549:2: ( ( rule__ExecutePipeline__Group_1__0 ) )
                    {
                    // InternalIoTParser.g:1549:2: ( ( rule__ExecutePipeline__Group_1__0 ) )
                    // InternalIoTParser.g:1550:3: ( rule__ExecutePipeline__Group_1__0 )
                    {
                     before(grammarAccess.getExecutePipelineAccess().getGroup_1()); 
                    // InternalIoTParser.g:1551:3: ( rule__ExecutePipeline__Group_1__0 )
                    // InternalIoTParser.g:1551:4: rule__ExecutePipeline__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutePipeline__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecutePipelineAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1555:2: ( ( rule__ExecutePipeline__Group_2__0 ) )
                    {
                    // InternalIoTParser.g:1555:2: ( ( rule__ExecutePipeline__Group_2__0 ) )
                    // InternalIoTParser.g:1556:3: ( rule__ExecutePipeline__Group_2__0 )
                    {
                     before(grammarAccess.getExecutePipelineAccess().getGroup_2()); 
                    // InternalIoTParser.g:1557:3: ( rule__ExecutePipeline__Group_2__0 )
                    // InternalIoTParser.g:1557:4: rule__ExecutePipeline__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutePipeline__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecutePipelineAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:1561:2: ( ( rule__ExecutePipeline__Group_3__0 ) )
                    {
                    // InternalIoTParser.g:1561:2: ( ( rule__ExecutePipeline__Group_3__0 ) )
                    // InternalIoTParser.g:1562:3: ( rule__ExecutePipeline__Group_3__0 )
                    {
                     before(grammarAccess.getExecutePipelineAccess().getGroup_3()); 
                    // InternalIoTParser.g:1563:3: ( rule__ExecutePipeline__Group_3__0 )
                    // InternalIoTParser.g:1563:4: rule__ExecutePipeline__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutePipeline__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecutePipelineAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIoTParser.g:1567:2: ( ( rule__ExecutePipeline__Group_4__0 ) )
                    {
                    // InternalIoTParser.g:1567:2: ( ( rule__ExecutePipeline__Group_4__0 ) )
                    // InternalIoTParser.g:1568:3: ( rule__ExecutePipeline__Group_4__0 )
                    {
                     before(grammarAccess.getExecutePipelineAccess().getGroup_4()); 
                    // InternalIoTParser.g:1569:3: ( rule__ExecutePipeline__Group_4__0 )
                    // InternalIoTParser.g:1569:4: rule__ExecutePipeline__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutePipeline__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecutePipelineAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIoTParser.g:1573:2: ( ( rule__ExecutePipeline__Group_5__0 ) )
                    {
                    // InternalIoTParser.g:1573:2: ( ( rule__ExecutePipeline__Group_5__0 ) )
                    // InternalIoTParser.g:1574:3: ( rule__ExecutePipeline__Group_5__0 )
                    {
                     before(grammarAccess.getExecutePipelineAccess().getGroup_5()); 
                    // InternalIoTParser.g:1575:3: ( rule__ExecutePipeline__Group_5__0 )
                    // InternalIoTParser.g:1575:4: rule__ExecutePipeline__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutePipeline__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecutePipelineAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalIoTParser.g:1579:2: ( ( rule__ExecutePipeline__Group_6__0 ) )
                    {
                    // InternalIoTParser.g:1579:2: ( ( rule__ExecutePipeline__Group_6__0 ) )
                    // InternalIoTParser.g:1580:3: ( rule__ExecutePipeline__Group_6__0 )
                    {
                     before(grammarAccess.getExecutePipelineAccess().getGroup_6()); 
                    // InternalIoTParser.g:1581:3: ( rule__ExecutePipeline__Group_6__0 )
                    // InternalIoTParser.g:1581:4: rule__ExecutePipeline__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutePipeline__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecutePipelineAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Alternatives"


    // $ANTLR start "rule__Equality__Alternatives_1"
    // InternalIoTParser.g:1589:1: rule__Equality__Alternatives_1 : ( ( ( rule__Equality__Group_1_0__0 ) ) | ( ( rule__Equality__Group_1_1__0 ) ) );
    public final void rule__Equality__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1593:1: ( ( ( rule__Equality__Group_1_0__0 ) ) | ( ( rule__Equality__Group_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EqualsSignEqualsSign) ) {
                alt11=1;
            }
            else if ( (LA11_0==ExclamationMarkEqualsSign) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIoTParser.g:1594:2: ( ( rule__Equality__Group_1_0__0 ) )
                    {
                    // InternalIoTParser.g:1594:2: ( ( rule__Equality__Group_1_0__0 ) )
                    // InternalIoTParser.g:1595:3: ( rule__Equality__Group_1_0__0 )
                    {
                     before(grammarAccess.getEqualityAccess().getGroup_1_0()); 
                    // InternalIoTParser.g:1596:3: ( rule__Equality__Group_1_0__0 )
                    // InternalIoTParser.g:1596:4: rule__Equality__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEqualityAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1600:2: ( ( rule__Equality__Group_1_1__0 ) )
                    {
                    // InternalIoTParser.g:1600:2: ( ( rule__Equality__Group_1_1__0 ) )
                    // InternalIoTParser.g:1601:3: ( rule__Equality__Group_1_1__0 )
                    {
                     before(grammarAccess.getEqualityAccess().getGroup_1_1()); 
                    // InternalIoTParser.g:1602:3: ( rule__Equality__Group_1_1__0 )
                    // InternalIoTParser.g:1602:4: rule__Equality__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEqualityAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Alternatives_1"


    // $ANTLR start "rule__Comparison__Alternatives_1"
    // InternalIoTParser.g:1610:1: rule__Comparison__Alternatives_1 : ( ( ( rule__Comparison__Group_1_0__0 ) ) | ( ( rule__Comparison__Group_1_1__0 ) ) | ( ( rule__Comparison__Group_1_2__0 ) ) | ( ( rule__Comparison__Group_1_3__0 ) ) );
    public final void rule__Comparison__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1614:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) | ( ( rule__Comparison__Group_1_1__0 ) ) | ( ( rule__Comparison__Group_1_2__0 ) ) | ( ( rule__Comparison__Group_1_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt12=1;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt12=2;
                }
                break;
            case GreaterThanSign:
                {
                alt12=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalIoTParser.g:1615:2: ( ( rule__Comparison__Group_1_0__0 ) )
                    {
                    // InternalIoTParser.g:1615:2: ( ( rule__Comparison__Group_1_0__0 ) )
                    // InternalIoTParser.g:1616:3: ( rule__Comparison__Group_1_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
                    // InternalIoTParser.g:1617:3: ( rule__Comparison__Group_1_0__0 )
                    // InternalIoTParser.g:1617:4: rule__Comparison__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1621:2: ( ( rule__Comparison__Group_1_1__0 ) )
                    {
                    // InternalIoTParser.g:1621:2: ( ( rule__Comparison__Group_1_1__0 ) )
                    // InternalIoTParser.g:1622:3: ( rule__Comparison__Group_1_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_1()); 
                    // InternalIoTParser.g:1623:3: ( rule__Comparison__Group_1_1__0 )
                    // InternalIoTParser.g:1623:4: rule__Comparison__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1627:2: ( ( rule__Comparison__Group_1_2__0 ) )
                    {
                    // InternalIoTParser.g:1627:2: ( ( rule__Comparison__Group_1_2__0 ) )
                    // InternalIoTParser.g:1628:3: ( rule__Comparison__Group_1_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_2()); 
                    // InternalIoTParser.g:1629:3: ( rule__Comparison__Group_1_2__0 )
                    // InternalIoTParser.g:1629:4: rule__Comparison__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:1633:2: ( ( rule__Comparison__Group_1_3__0 ) )
                    {
                    // InternalIoTParser.g:1633:2: ( ( rule__Comparison__Group_1_3__0 ) )
                    // InternalIoTParser.g:1634:3: ( rule__Comparison__Group_1_3__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_3()); 
                    // InternalIoTParser.g:1635:3: ( rule__Comparison__Group_1_3__0 )
                    // InternalIoTParser.g:1635:4: rule__Comparison__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives_1"


    // $ANTLR start "rule__SubAdd__Alternatives_1"
    // InternalIoTParser.g:1643:1: rule__SubAdd__Alternatives_1 : ( ( ( rule__SubAdd__Group_1_0__0 ) ) | ( ( rule__SubAdd__Group_1_1__0 ) ) );
    public final void rule__SubAdd__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1647:1: ( ( ( rule__SubAdd__Group_1_0__0 ) ) | ( ( rule__SubAdd__Group_1_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==PlusSign) ) {
                alt13=1;
            }
            else if ( (LA13_0==HyphenMinus) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalIoTParser.g:1648:2: ( ( rule__SubAdd__Group_1_0__0 ) )
                    {
                    // InternalIoTParser.g:1648:2: ( ( rule__SubAdd__Group_1_0__0 ) )
                    // InternalIoTParser.g:1649:3: ( rule__SubAdd__Group_1_0__0 )
                    {
                     before(grammarAccess.getSubAddAccess().getGroup_1_0()); 
                    // InternalIoTParser.g:1650:3: ( rule__SubAdd__Group_1_0__0 )
                    // InternalIoTParser.g:1650:4: rule__SubAdd__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubAdd__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubAddAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1654:2: ( ( rule__SubAdd__Group_1_1__0 ) )
                    {
                    // InternalIoTParser.g:1654:2: ( ( rule__SubAdd__Group_1_1__0 ) )
                    // InternalIoTParser.g:1655:3: ( rule__SubAdd__Group_1_1__0 )
                    {
                     before(grammarAccess.getSubAddAccess().getGroup_1_1()); 
                    // InternalIoTParser.g:1656:3: ( rule__SubAdd__Group_1_1__0 )
                    // InternalIoTParser.g:1656:4: rule__SubAdd__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubAdd__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubAddAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Alternatives_1"


    // $ANTLR start "rule__MulDiv__Alternatives_1"
    // InternalIoTParser.g:1664:1: rule__MulDiv__Alternatives_1 : ( ( ( rule__MulDiv__Group_1_0__0 ) ) | ( ( rule__MulDiv__Group_1_1__0 ) ) );
    public final void rule__MulDiv__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1668:1: ( ( ( rule__MulDiv__Group_1_0__0 ) ) | ( ( rule__MulDiv__Group_1_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Asterisk) ) {
                alt14=1;
            }
            else if ( (LA14_0==Solidus) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoTParser.g:1669:2: ( ( rule__MulDiv__Group_1_0__0 ) )
                    {
                    // InternalIoTParser.g:1669:2: ( ( rule__MulDiv__Group_1_0__0 ) )
                    // InternalIoTParser.g:1670:3: ( rule__MulDiv__Group_1_0__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_0()); 
                    // InternalIoTParser.g:1671:3: ( rule__MulDiv__Group_1_0__0 )
                    // InternalIoTParser.g:1671:4: rule__MulDiv__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulDiv__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMulDivAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1675:2: ( ( rule__MulDiv__Group_1_1__0 ) )
                    {
                    // InternalIoTParser.g:1675:2: ( ( rule__MulDiv__Group_1_1__0 ) )
                    // InternalIoTParser.g:1676:3: ( rule__MulDiv__Group_1_1__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_1()); 
                    // InternalIoTParser.g:1677:3: ( rule__MulDiv__Group_1_1__0 )
                    // InternalIoTParser.g:1677:4: rule__MulDiv__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulDiv__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMulDivAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Alternatives_1"


    // $ANTLR start "rule__Negation__Alternatives"
    // InternalIoTParser.g:1685:1: rule__Negation__Alternatives : ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleExponent ) );
    public final void rule__Negation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1689:1: ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleExponent ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==HyphenMinus) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=ExclamationMark && LA15_0<=LeftParenthesis)||(LA15_0>=RULE_INT && LA15_0<=RULE_BOOLEAN)||(LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalIoTParser.g:1690:2: ( ( rule__Negation__Group_0__0 ) )
                    {
                    // InternalIoTParser.g:1690:2: ( ( rule__Negation__Group_0__0 ) )
                    // InternalIoTParser.g:1691:3: ( rule__Negation__Group_0__0 )
                    {
                     before(grammarAccess.getNegationAccess().getGroup_0()); 
                    // InternalIoTParser.g:1692:3: ( rule__Negation__Group_0__0 )
                    // InternalIoTParser.g:1692:4: rule__Negation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Negation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNegationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1696:2: ( ruleExponent )
                    {
                    // InternalIoTParser.g:1696:2: ( ruleExponent )
                    // InternalIoTParser.g:1697:3: ruleExponent
                    {
                     before(grammarAccess.getNegationAccess().getExponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExponent();

                    state._fsp--;

                     after(grammarAccess.getNegationAccess().getExponentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Alternatives"


    // $ANTLR start "rule__Not__Alternatives"
    // InternalIoTParser.g:1706:1: rule__Not__Alternatives : ( ( ( rule__Not__Group_0__0 ) ) | ( rulePrimary ) );
    public final void rule__Not__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1710:1: ( ( ( rule__Not__Group_0__0 ) ) | ( rulePrimary ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ExclamationMark) ) {
                alt16=1;
            }
            else if ( (LA16_0==LeftParenthesis||(LA16_0>=RULE_INT && LA16_0<=RULE_BOOLEAN)||(LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalIoTParser.g:1711:2: ( ( rule__Not__Group_0__0 ) )
                    {
                    // InternalIoTParser.g:1711:2: ( ( rule__Not__Group_0__0 ) )
                    // InternalIoTParser.g:1712:3: ( rule__Not__Group_0__0 )
                    {
                     before(grammarAccess.getNotAccess().getGroup_0()); 
                    // InternalIoTParser.g:1713:3: ( rule__Not__Group_0__0 )
                    // InternalIoTParser.g:1713:4: rule__Not__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Not__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1717:2: ( rulePrimary )
                    {
                    // InternalIoTParser.g:1717:2: ( rulePrimary )
                    // InternalIoTParser.g:1718:3: rulePrimary
                    {
                     before(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimary();

                    state._fsp--;

                     after(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalIoTParser.g:1727:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleReference ) | ( ruleNumberLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1731:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleReference ) | ( ruleNumberLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case RULE_INT:
            case RULE_DBL:
            case RULE_SCI:
                {
                alt17=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt17=4;
                }
                break;
            case RULE_STRING:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalIoTParser.g:1732:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalIoTParser.g:1732:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalIoTParser.g:1733:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalIoTParser.g:1734:3: ( rule__Primary__Group_0__0 )
                    // InternalIoTParser.g:1734:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1738:2: ( ruleReference )
                    {
                    // InternalIoTParser.g:1738:2: ( ruleReference )
                    // InternalIoTParser.g:1739:3: ruleReference
                    {
                     before(grammarAccess.getPrimaryAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1744:2: ( ruleNumberLiteral )
                    {
                    // InternalIoTParser.g:1744:2: ( ruleNumberLiteral )
                    // InternalIoTParser.g:1745:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:1750:2: ( ruleBooleanLiteral )
                    {
                    // InternalIoTParser.g:1750:2: ( ruleBooleanLiteral )
                    // InternalIoTParser.g:1751:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIoTParser.g:1756:2: ( ruleStringLiteral )
                    {
                    // InternalIoTParser.g:1756:2: ( ruleStringLiteral )
                    // InternalIoTParser.g:1757:3: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives"
    // InternalIoTParser.g:1766:1: rule__NUMBER__Alternatives : ( ( RULE_INT ) | ( RULE_DBL ) | ( RULE_SCI ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1770:1: ( ( RULE_INT ) | ( RULE_DBL ) | ( RULE_SCI ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt18=1;
                }
                break;
            case RULE_DBL:
                {
                alt18=2;
                }
                break;
            case RULE_SCI:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalIoTParser.g:1771:2: ( RULE_INT )
                    {
                    // InternalIoTParser.g:1771:2: ( RULE_INT )
                    // InternalIoTParser.g:1772:3: RULE_INT
                    {
                     before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1777:2: ( RULE_DBL )
                    {
                    // InternalIoTParser.g:1777:2: ( RULE_DBL )
                    // InternalIoTParser.g:1778:3: RULE_DBL
                    {
                     before(grammarAccess.getNUMBERAccess().getDBLTerminalRuleCall_1()); 
                    match(input,RULE_DBL,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getDBLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1783:2: ( RULE_SCI )
                    {
                    // InternalIoTParser.g:1783:2: ( RULE_SCI )
                    // InternalIoTParser.g:1784:3: RULE_SCI
                    {
                     before(grammarAccess.getNUMBERAccess().getSCITerminalRuleCall_2()); 
                    match(input,RULE_SCI,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getSCITerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalIoTParser.g:1793:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1797:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalIoTParser.g:1798:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalIoTParser.g:1805:1: rule__Model__Group__0__Impl : ( ( rule__Model__IncludeAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1809:1: ( ( ( rule__Model__IncludeAssignment_0 )* ) )
            // InternalIoTParser.g:1810:1: ( ( rule__Model__IncludeAssignment_0 )* )
            {
            // InternalIoTParser.g:1810:1: ( ( rule__Model__IncludeAssignment_0 )* )
            // InternalIoTParser.g:1811:2: ( rule__Model__IncludeAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getIncludeAssignment_0()); 
            // InternalIoTParser.g:1812:2: ( rule__Model__IncludeAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Include) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIoTParser.g:1812:3: rule__Model__IncludeAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__IncludeAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getIncludeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalIoTParser.g:1820:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1824:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalIoTParser.g:1825:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalIoTParser.g:1832:1: rule__Model__Group__1__Impl : ( ( rule__Model__ChannelAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1836:1: ( ( ( rule__Model__ChannelAssignment_1 )* ) )
            // InternalIoTParser.g:1837:1: ( ( rule__Model__ChannelAssignment_1 )* )
            {
            // InternalIoTParser.g:1837:1: ( ( rule__Model__ChannelAssignment_1 )* )
            // InternalIoTParser.g:1838:2: ( rule__Model__ChannelAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getChannelAssignment_1()); 
            // InternalIoTParser.g:1839:2: ( rule__Model__ChannelAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Channel) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIoTParser.g:1839:3: rule__Model__ChannelAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ChannelAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getChannelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalIoTParser.g:1847:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1851:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalIoTParser.g:1852:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalIoTParser.g:1859:1: rule__Model__Group__2__Impl : ( ( rule__Model__AbstractBoardAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1863:1: ( ( ( rule__Model__AbstractBoardAssignment_2 )* ) )
            // InternalIoTParser.g:1864:1: ( ( rule__Model__AbstractBoardAssignment_2 )* )
            {
            // InternalIoTParser.g:1864:1: ( ( rule__Model__AbstractBoardAssignment_2 )* )
            // InternalIoTParser.g:1865:2: ( rule__Model__AbstractBoardAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getAbstractBoardAssignment_2()); 
            // InternalIoTParser.g:1866:2: ( rule__Model__AbstractBoardAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Abstract) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIoTParser.g:1866:3: rule__Model__AbstractBoardAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__AbstractBoardAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAbstractBoardAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalIoTParser.g:1874:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1878:1: ( rule__Model__Group__3__Impl )
            // InternalIoTParser.g:1879:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalIoTParser.g:1885:1: rule__Model__Group__3__Impl : ( ( rule__Model__BoardAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1889:1: ( ( ( rule__Model__BoardAssignment_3 )* ) )
            // InternalIoTParser.g:1890:1: ( ( rule__Model__BoardAssignment_3 )* )
            {
            // InternalIoTParser.g:1890:1: ( ( rule__Model__BoardAssignment_3 )* )
            // InternalIoTParser.g:1891:2: ( rule__Model__BoardAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getBoardAssignment_3()); 
            // InternalIoTParser.g:1892:2: ( rule__Model__BoardAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Board) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIoTParser.g:1892:3: rule__Model__BoardAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__BoardAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getBoardAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // InternalIoTParser.g:1901:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1905:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalIoTParser.g:1906:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // InternalIoTParser.g:1913:1: rule__Include__Group__0__Impl : ( Include ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1917:1: ( ( Include ) )
            // InternalIoTParser.g:1918:1: ( Include )
            {
            // InternalIoTParser.g:1918:1: ( Include )
            // InternalIoTParser.g:1919:2: Include
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,Include,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // InternalIoTParser.g:1928:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1932:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // InternalIoTParser.g:1933:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // InternalIoTParser.g:1940:1: rule__Include__Group__1__Impl : ( ( rule__Include__PathAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1944:1: ( ( ( rule__Include__PathAssignment_1 ) ) )
            // InternalIoTParser.g:1945:1: ( ( rule__Include__PathAssignment_1 ) )
            {
            // InternalIoTParser.g:1945:1: ( ( rule__Include__PathAssignment_1 ) )
            // InternalIoTParser.g:1946:2: ( rule__Include__PathAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getPathAssignment_1()); 
            // InternalIoTParser.g:1947:2: ( rule__Include__PathAssignment_1 )
            // InternalIoTParser.g:1947:3: rule__Include__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Include__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // InternalIoTParser.g:1955:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1959:1: ( rule__Include__Group__2__Impl )
            // InternalIoTParser.g:1960:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // InternalIoTParser.g:1966:1: rule__Include__Group__2__Impl : ( ( rule__Include__Group_2__0 )* ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1970:1: ( ( ( rule__Include__Group_2__0 )* ) )
            // InternalIoTParser.g:1971:1: ( ( rule__Include__Group_2__0 )* )
            {
            // InternalIoTParser.g:1971:1: ( ( rule__Include__Group_2__0 )* )
            // InternalIoTParser.g:1972:2: ( rule__Include__Group_2__0 )*
            {
             before(grammarAccess.getIncludeAccess().getGroup_2()); 
            // InternalIoTParser.g:1973:2: ( rule__Include__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==FullStop) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIoTParser.g:1973:3: rule__Include__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Include__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getIncludeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Include__Group_2__0"
    // InternalIoTParser.g:1982:1: rule__Include__Group_2__0 : rule__Include__Group_2__0__Impl rule__Include__Group_2__1 ;
    public final void rule__Include__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1986:1: ( rule__Include__Group_2__0__Impl rule__Include__Group_2__1 )
            // InternalIoTParser.g:1987:2: rule__Include__Group_2__0__Impl rule__Include__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Include__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2__0"


    // $ANTLR start "rule__Include__Group_2__0__Impl"
    // InternalIoTParser.g:1994:1: rule__Include__Group_2__0__Impl : ( FullStop ) ;
    public final void rule__Include__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:1998:1: ( ( FullStop ) )
            // InternalIoTParser.g:1999:1: ( FullStop )
            {
            // InternalIoTParser.g:1999:1: ( FullStop )
            // InternalIoTParser.g:2000:2: FullStop
            {
             before(grammarAccess.getIncludeAccess().getFullStopKeyword_2_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2__0__Impl"


    // $ANTLR start "rule__Include__Group_2__1"
    // InternalIoTParser.g:2009:1: rule__Include__Group_2__1 : rule__Include__Group_2__1__Impl ;
    public final void rule__Include__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2013:1: ( rule__Include__Group_2__1__Impl )
            // InternalIoTParser.g:2014:2: rule__Include__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2__1"


    // $ANTLR start "rule__Include__Group_2__1__Impl"
    // InternalIoTParser.g:2020:1: rule__Include__Group_2__1__Impl : ( ( rule__Include__PathAssignment_2_1 ) ) ;
    public final void rule__Include__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2024:1: ( ( ( rule__Include__PathAssignment_2_1 ) ) )
            // InternalIoTParser.g:2025:1: ( ( rule__Include__PathAssignment_2_1 ) )
            {
            // InternalIoTParser.g:2025:1: ( ( rule__Include__PathAssignment_2_1 ) )
            // InternalIoTParser.g:2026:2: ( rule__Include__PathAssignment_2_1 )
            {
             before(grammarAccess.getIncludeAccess().getPathAssignment_2_1()); 
            // InternalIoTParser.g:2027:2: ( rule__Include__PathAssignment_2_1 )
            // InternalIoTParser.g:2027:3: rule__Include__PathAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Include__PathAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getPathAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2__1__Impl"


    // $ANTLR start "rule__Channel__Group__0"
    // InternalIoTParser.g:2036:1: rule__Channel__Group__0 : rule__Channel__Group__0__Impl rule__Channel__Group__1 ;
    public final void rule__Channel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2040:1: ( rule__Channel__Group__0__Impl rule__Channel__Group__1 )
            // InternalIoTParser.g:2041:2: rule__Channel__Group__0__Impl rule__Channel__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Channel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__0"


    // $ANTLR start "rule__Channel__Group__0__Impl"
    // InternalIoTParser.g:2048:1: rule__Channel__Group__0__Impl : ( Channel ) ;
    public final void rule__Channel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2052:1: ( ( Channel ) )
            // InternalIoTParser.g:2053:1: ( Channel )
            {
            // InternalIoTParser.g:2053:1: ( Channel )
            // InternalIoTParser.g:2054:2: Channel
            {
             before(grammarAccess.getChannelAccess().getChannelKeyword_0()); 
            match(input,Channel,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getChannelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__0__Impl"


    // $ANTLR start "rule__Channel__Group__1"
    // InternalIoTParser.g:2063:1: rule__Channel__Group__1 : rule__Channel__Group__1__Impl rule__Channel__Group__2 ;
    public final void rule__Channel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2067:1: ( rule__Channel__Group__1__Impl rule__Channel__Group__2 )
            // InternalIoTParser.g:2068:2: rule__Channel__Group__1__Impl rule__Channel__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Channel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__1"


    // $ANTLR start "rule__Channel__Group__1__Impl"
    // InternalIoTParser.g:2075:1: rule__Channel__Group__1__Impl : ( ( rule__Channel__ChanneltypeAssignment_1 ) ) ;
    public final void rule__Channel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2079:1: ( ( ( rule__Channel__ChanneltypeAssignment_1 ) ) )
            // InternalIoTParser.g:2080:1: ( ( rule__Channel__ChanneltypeAssignment_1 ) )
            {
            // InternalIoTParser.g:2080:1: ( ( rule__Channel__ChanneltypeAssignment_1 ) )
            // InternalIoTParser.g:2081:2: ( rule__Channel__ChanneltypeAssignment_1 )
            {
             before(grammarAccess.getChannelAccess().getChanneltypeAssignment_1()); 
            // InternalIoTParser.g:2082:2: ( rule__Channel__ChanneltypeAssignment_1 )
            // InternalIoTParser.g:2082:3: rule__Channel__ChanneltypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Channel__ChanneltypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getChanneltypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__1__Impl"


    // $ANTLR start "rule__Channel__Group__2"
    // InternalIoTParser.g:2090:1: rule__Channel__Group__2 : rule__Channel__Group__2__Impl rule__Channel__Group__3 ;
    public final void rule__Channel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2094:1: ( rule__Channel__Group__2__Impl rule__Channel__Group__3 )
            // InternalIoTParser.g:2095:2: rule__Channel__Group__2__Impl rule__Channel__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Channel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__2"


    // $ANTLR start "rule__Channel__Group__2__Impl"
    // InternalIoTParser.g:2102:1: rule__Channel__Group__2__Impl : ( ( rule__Channel__NameAssignment_2 ) ) ;
    public final void rule__Channel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2106:1: ( ( ( rule__Channel__NameAssignment_2 ) ) )
            // InternalIoTParser.g:2107:1: ( ( rule__Channel__NameAssignment_2 ) )
            {
            // InternalIoTParser.g:2107:1: ( ( rule__Channel__NameAssignment_2 ) )
            // InternalIoTParser.g:2108:2: ( rule__Channel__NameAssignment_2 )
            {
             before(grammarAccess.getChannelAccess().getNameAssignment_2()); 
            // InternalIoTParser.g:2109:2: ( rule__Channel__NameAssignment_2 )
            // InternalIoTParser.g:2109:3: rule__Channel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Channel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__2__Impl"


    // $ANTLR start "rule__Channel__Group__3"
    // InternalIoTParser.g:2117:1: rule__Channel__Group__3 : rule__Channel__Group__3__Impl ;
    public final void rule__Channel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2121:1: ( rule__Channel__Group__3__Impl )
            // InternalIoTParser.g:2122:2: rule__Channel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__3"


    // $ANTLR start "rule__Channel__Group__3__Impl"
    // InternalIoTParser.g:2128:1: rule__Channel__Group__3__Impl : ( ( rule__Channel__Group_3__0 )? ) ;
    public final void rule__Channel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2132:1: ( ( ( rule__Channel__Group_3__0 )? ) )
            // InternalIoTParser.g:2133:1: ( ( rule__Channel__Group_3__0 )? )
            {
            // InternalIoTParser.g:2133:1: ( ( rule__Channel__Group_3__0 )? )
            // InternalIoTParser.g:2134:2: ( rule__Channel__Group_3__0 )?
            {
             before(grammarAccess.getChannelAccess().getGroup_3()); 
            // InternalIoTParser.g:2135:2: ( rule__Channel__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Colon) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIoTParser.g:2135:3: rule__Channel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Channel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChannelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__3__Impl"


    // $ANTLR start "rule__Channel__Group_3__0"
    // InternalIoTParser.g:2144:1: rule__Channel__Group_3__0 : rule__Channel__Group_3__0__Impl rule__Channel__Group_3__1 ;
    public final void rule__Channel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2148:1: ( rule__Channel__Group_3__0__Impl rule__Channel__Group_3__1 )
            // InternalIoTParser.g:2149:2: rule__Channel__Group_3__0__Impl rule__Channel__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Channel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_3__0"


    // $ANTLR start "rule__Channel__Group_3__0__Impl"
    // InternalIoTParser.g:2156:1: rule__Channel__Group_3__0__Impl : ( Colon ) ;
    public final void rule__Channel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2160:1: ( ( Colon ) )
            // InternalIoTParser.g:2161:1: ( Colon )
            {
            // InternalIoTParser.g:2161:1: ( Colon )
            // InternalIoTParser.g:2162:2: Colon
            {
             before(grammarAccess.getChannelAccess().getColonKeyword_3_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_3__0__Impl"


    // $ANTLR start "rule__Channel__Group_3__1"
    // InternalIoTParser.g:2171:1: rule__Channel__Group_3__1 : rule__Channel__Group_3__1__Impl rule__Channel__Group_3__2 ;
    public final void rule__Channel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2175:1: ( rule__Channel__Group_3__1__Impl rule__Channel__Group_3__2 )
            // InternalIoTParser.g:2176:2: rule__Channel__Group_3__1__Impl rule__Channel__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__Channel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_3__1"


    // $ANTLR start "rule__Channel__Group_3__1__Impl"
    // InternalIoTParser.g:2183:1: rule__Channel__Group_3__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Channel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2187:1: ( ( RULE_BEGIN ) )
            // InternalIoTParser.g:2188:1: ( RULE_BEGIN )
            {
            // InternalIoTParser.g:2188:1: ( RULE_BEGIN )
            // InternalIoTParser.g:2189:2: RULE_BEGIN
            {
             before(grammarAccess.getChannelAccess().getBEGINTerminalRuleCall_3_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getBEGINTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_3__1__Impl"


    // $ANTLR start "rule__Channel__Group_3__2"
    // InternalIoTParser.g:2198:1: rule__Channel__Group_3__2 : rule__Channel__Group_3__2__Impl rule__Channel__Group_3__3 ;
    public final void rule__Channel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2202:1: ( rule__Channel__Group_3__2__Impl rule__Channel__Group_3__3 )
            // InternalIoTParser.g:2203:2: rule__Channel__Group_3__2__Impl rule__Channel__Group_3__3
            {
            pushFollow(FOLLOW_15);
            rule__Channel__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_3__2"


    // $ANTLR start "rule__Channel__Group_3__2__Impl"
    // InternalIoTParser.g:2210:1: rule__Channel__Group_3__2__Impl : ( ( rule__Channel__ConfigAssignment_3_2 ) ) ;
    public final void rule__Channel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2214:1: ( ( ( rule__Channel__ConfigAssignment_3_2 ) ) )
            // InternalIoTParser.g:2215:1: ( ( rule__Channel__ConfigAssignment_3_2 ) )
            {
            // InternalIoTParser.g:2215:1: ( ( rule__Channel__ConfigAssignment_3_2 ) )
            // InternalIoTParser.g:2216:2: ( rule__Channel__ConfigAssignment_3_2 )
            {
             before(grammarAccess.getChannelAccess().getConfigAssignment_3_2()); 
            // InternalIoTParser.g:2217:2: ( rule__Channel__ConfigAssignment_3_2 )
            // InternalIoTParser.g:2217:3: rule__Channel__ConfigAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Channel__ConfigAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getConfigAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_3__2__Impl"


    // $ANTLR start "rule__Channel__Group_3__3"
    // InternalIoTParser.g:2225:1: rule__Channel__Group_3__3 : rule__Channel__Group_3__3__Impl ;
    public final void rule__Channel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2229:1: ( rule__Channel__Group_3__3__Impl )
            // InternalIoTParser.g:2230:2: rule__Channel__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_3__3"


    // $ANTLR start "rule__Channel__Group_3__3__Impl"
    // InternalIoTParser.g:2236:1: rule__Channel__Group_3__3__Impl : ( RULE_END ) ;
    public final void rule__Channel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2240:1: ( ( RULE_END ) )
            // InternalIoTParser.g:2241:1: ( RULE_END )
            {
            // InternalIoTParser.g:2241:1: ( RULE_END )
            // InternalIoTParser.g:2242:2: RULE_END
            {
             before(grammarAccess.getChannelAccess().getENDTerminalRuleCall_3_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getENDTerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_3__3__Impl"


    // $ANTLR start "rule__ChannelType__Group_0__0"
    // InternalIoTParser.g:2252:1: rule__ChannelType__Group_0__0 : rule__ChannelType__Group_0__0__Impl rule__ChannelType__Group_0__1 ;
    public final void rule__ChannelType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2256:1: ( rule__ChannelType__Group_0__0__Impl rule__ChannelType__Group_0__1 )
            // InternalIoTParser.g:2257:2: rule__ChannelType__Group_0__0__Impl rule__ChannelType__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__ChannelType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_0__0"


    // $ANTLR start "rule__ChannelType__Group_0__0__Impl"
    // InternalIoTParser.g:2264:1: rule__ChannelType__Group_0__0__Impl : ( () ) ;
    public final void rule__ChannelType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2268:1: ( ( () ) )
            // InternalIoTParser.g:2269:1: ( () )
            {
            // InternalIoTParser.g:2269:1: ( () )
            // InternalIoTParser.g:2270:2: ()
            {
             before(grammarAccess.getChannelTypeAccess().getWifiConfigAction_0_0()); 
            // InternalIoTParser.g:2271:2: ()
            // InternalIoTParser.g:2271:3: 
            {
            }

             after(grammarAccess.getChannelTypeAccess().getWifiConfigAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_0__0__Impl"


    // $ANTLR start "rule__ChannelType__Group_0__1"
    // InternalIoTParser.g:2279:1: rule__ChannelType__Group_0__1 : rule__ChannelType__Group_0__1__Impl ;
    public final void rule__ChannelType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2283:1: ( rule__ChannelType__Group_0__1__Impl )
            // InternalIoTParser.g:2284:2: rule__ChannelType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChannelType__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_0__1"


    // $ANTLR start "rule__ChannelType__Group_0__1__Impl"
    // InternalIoTParser.g:2290:1: rule__ChannelType__Group_0__1__Impl : ( Wifi ) ;
    public final void rule__ChannelType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2294:1: ( ( Wifi ) )
            // InternalIoTParser.g:2295:1: ( Wifi )
            {
            // InternalIoTParser.g:2295:1: ( Wifi )
            // InternalIoTParser.g:2296:2: Wifi
            {
             before(grammarAccess.getChannelTypeAccess().getWifiKeyword_0_1()); 
            match(input,Wifi,FOLLOW_2); 
             after(grammarAccess.getChannelTypeAccess().getWifiKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_0__1__Impl"


    // $ANTLR start "rule__ChannelType__Group_1__0"
    // InternalIoTParser.g:2306:1: rule__ChannelType__Group_1__0 : rule__ChannelType__Group_1__0__Impl rule__ChannelType__Group_1__1 ;
    public final void rule__ChannelType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2310:1: ( rule__ChannelType__Group_1__0__Impl rule__ChannelType__Group_1__1 )
            // InternalIoTParser.g:2311:2: rule__ChannelType__Group_1__0__Impl rule__ChannelType__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ChannelType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_1__0"


    // $ANTLR start "rule__ChannelType__Group_1__0__Impl"
    // InternalIoTParser.g:2318:1: rule__ChannelType__Group_1__0__Impl : ( () ) ;
    public final void rule__ChannelType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2322:1: ( ( () ) )
            // InternalIoTParser.g:2323:1: ( () )
            {
            // InternalIoTParser.g:2323:1: ( () )
            // InternalIoTParser.g:2324:2: ()
            {
             before(grammarAccess.getChannelTypeAccess().getSerialConfigAction_1_0()); 
            // InternalIoTParser.g:2325:2: ()
            // InternalIoTParser.g:2325:3: 
            {
            }

             after(grammarAccess.getChannelTypeAccess().getSerialConfigAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_1__0__Impl"


    // $ANTLR start "rule__ChannelType__Group_1__1"
    // InternalIoTParser.g:2333:1: rule__ChannelType__Group_1__1 : rule__ChannelType__Group_1__1__Impl ;
    public final void rule__ChannelType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2337:1: ( rule__ChannelType__Group_1__1__Impl )
            // InternalIoTParser.g:2338:2: rule__ChannelType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChannelType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_1__1"


    // $ANTLR start "rule__ChannelType__Group_1__1__Impl"
    // InternalIoTParser.g:2344:1: rule__ChannelType__Group_1__1__Impl : ( Serial ) ;
    public final void rule__ChannelType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2348:1: ( ( Serial ) )
            // InternalIoTParser.g:2349:1: ( Serial )
            {
            // InternalIoTParser.g:2349:1: ( Serial )
            // InternalIoTParser.g:2350:2: Serial
            {
             before(grammarAccess.getChannelTypeAccess().getSerialKeyword_1_1()); 
            match(input,Serial,FOLLOW_2); 
             after(grammarAccess.getChannelTypeAccess().getSerialKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_1__1__Impl"


    // $ANTLR start "rule__ChannelType__Group_2__0"
    // InternalIoTParser.g:2360:1: rule__ChannelType__Group_2__0 : rule__ChannelType__Group_2__0__Impl rule__ChannelType__Group_2__1 ;
    public final void rule__ChannelType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2364:1: ( rule__ChannelType__Group_2__0__Impl rule__ChannelType__Group_2__1 )
            // InternalIoTParser.g:2365:2: rule__ChannelType__Group_2__0__Impl rule__ChannelType__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ChannelType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_2__0"


    // $ANTLR start "rule__ChannelType__Group_2__0__Impl"
    // InternalIoTParser.g:2372:1: rule__ChannelType__Group_2__0__Impl : ( () ) ;
    public final void rule__ChannelType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2376:1: ( ( () ) )
            // InternalIoTParser.g:2377:1: ( () )
            {
            // InternalIoTParser.g:2377:1: ( () )
            // InternalIoTParser.g:2378:2: ()
            {
             before(grammarAccess.getChannelTypeAccess().getMQTTAction_2_0()); 
            // InternalIoTParser.g:2379:2: ()
            // InternalIoTParser.g:2379:3: 
            {
            }

             after(grammarAccess.getChannelTypeAccess().getMQTTAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_2__0__Impl"


    // $ANTLR start "rule__ChannelType__Group_2__1"
    // InternalIoTParser.g:2387:1: rule__ChannelType__Group_2__1 : rule__ChannelType__Group_2__1__Impl ;
    public final void rule__ChannelType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2391:1: ( rule__ChannelType__Group_2__1__Impl )
            // InternalIoTParser.g:2392:2: rule__ChannelType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChannelType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_2__1"


    // $ANTLR start "rule__ChannelType__Group_2__1__Impl"
    // InternalIoTParser.g:2398:1: rule__ChannelType__Group_2__1__Impl : ( Mqtt ) ;
    public final void rule__ChannelType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2402:1: ( ( Mqtt ) )
            // InternalIoTParser.g:2403:1: ( Mqtt )
            {
            // InternalIoTParser.g:2403:1: ( Mqtt )
            // InternalIoTParser.g:2404:2: Mqtt
            {
             before(grammarAccess.getChannelTypeAccess().getMqttKeyword_2_1()); 
            match(input,Mqtt,FOLLOW_2); 
             after(grammarAccess.getChannelTypeAccess().getMqttKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelType__Group_2__1__Impl"


    // $ANTLR start "rule__Wifi__Group__0"
    // InternalIoTParser.g:2414:1: rule__Wifi__Group__0 : rule__Wifi__Group__0__Impl rule__Wifi__Group__1 ;
    public final void rule__Wifi__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2418:1: ( rule__Wifi__Group__0__Impl rule__Wifi__Group__1 )
            // InternalIoTParser.g:2419:2: rule__Wifi__Group__0__Impl rule__Wifi__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Wifi__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wifi__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__Group__0"


    // $ANTLR start "rule__Wifi__Group__0__Impl"
    // InternalIoTParser.g:2426:1: rule__Wifi__Group__0__Impl : ( Ssid ) ;
    public final void rule__Wifi__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2430:1: ( ( Ssid ) )
            // InternalIoTParser.g:2431:1: ( Ssid )
            {
            // InternalIoTParser.g:2431:1: ( Ssid )
            // InternalIoTParser.g:2432:2: Ssid
            {
             before(grammarAccess.getWifiAccess().getSsidKeyword_0()); 
            match(input,Ssid,FOLLOW_2); 
             after(grammarAccess.getWifiAccess().getSsidKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__Group__0__Impl"


    // $ANTLR start "rule__Wifi__Group__1"
    // InternalIoTParser.g:2441:1: rule__Wifi__Group__1 : rule__Wifi__Group__1__Impl rule__Wifi__Group__2 ;
    public final void rule__Wifi__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2445:1: ( rule__Wifi__Group__1__Impl rule__Wifi__Group__2 )
            // InternalIoTParser.g:2446:2: rule__Wifi__Group__1__Impl rule__Wifi__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Wifi__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wifi__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__Group__1"


    // $ANTLR start "rule__Wifi__Group__1__Impl"
    // InternalIoTParser.g:2453:1: rule__Wifi__Group__1__Impl : ( ( rule__Wifi__SsidAssignment_1 ) ) ;
    public final void rule__Wifi__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2457:1: ( ( ( rule__Wifi__SsidAssignment_1 ) ) )
            // InternalIoTParser.g:2458:1: ( ( rule__Wifi__SsidAssignment_1 ) )
            {
            // InternalIoTParser.g:2458:1: ( ( rule__Wifi__SsidAssignment_1 ) )
            // InternalIoTParser.g:2459:2: ( rule__Wifi__SsidAssignment_1 )
            {
             before(grammarAccess.getWifiAccess().getSsidAssignment_1()); 
            // InternalIoTParser.g:2460:2: ( rule__Wifi__SsidAssignment_1 )
            // InternalIoTParser.g:2460:3: rule__Wifi__SsidAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Wifi__SsidAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWifiAccess().getSsidAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__Group__1__Impl"


    // $ANTLR start "rule__Wifi__Group__2"
    // InternalIoTParser.g:2468:1: rule__Wifi__Group__2 : rule__Wifi__Group__2__Impl rule__Wifi__Group__3 ;
    public final void rule__Wifi__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2472:1: ( rule__Wifi__Group__2__Impl rule__Wifi__Group__3 )
            // InternalIoTParser.g:2473:2: rule__Wifi__Group__2__Impl rule__Wifi__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Wifi__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wifi__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__Group__2"


    // $ANTLR start "rule__Wifi__Group__2__Impl"
    // InternalIoTParser.g:2480:1: rule__Wifi__Group__2__Impl : ( Pass ) ;
    public final void rule__Wifi__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2484:1: ( ( Pass ) )
            // InternalIoTParser.g:2485:1: ( Pass )
            {
            // InternalIoTParser.g:2485:1: ( Pass )
            // InternalIoTParser.g:2486:2: Pass
            {
             before(grammarAccess.getWifiAccess().getPassKeyword_2()); 
            match(input,Pass,FOLLOW_2); 
             after(grammarAccess.getWifiAccess().getPassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__Group__2__Impl"


    // $ANTLR start "rule__Wifi__Group__3"
    // InternalIoTParser.g:2495:1: rule__Wifi__Group__3 : rule__Wifi__Group__3__Impl ;
    public final void rule__Wifi__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2499:1: ( rule__Wifi__Group__3__Impl )
            // InternalIoTParser.g:2500:2: rule__Wifi__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wifi__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__Group__3"


    // $ANTLR start "rule__Wifi__Group__3__Impl"
    // InternalIoTParser.g:2506:1: rule__Wifi__Group__3__Impl : ( ( rule__Wifi__PassAssignment_3 ) ) ;
    public final void rule__Wifi__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2510:1: ( ( ( rule__Wifi__PassAssignment_3 ) ) )
            // InternalIoTParser.g:2511:1: ( ( rule__Wifi__PassAssignment_3 ) )
            {
            // InternalIoTParser.g:2511:1: ( ( rule__Wifi__PassAssignment_3 ) )
            // InternalIoTParser.g:2512:2: ( rule__Wifi__PassAssignment_3 )
            {
             before(grammarAccess.getWifiAccess().getPassAssignment_3()); 
            // InternalIoTParser.g:2513:2: ( rule__Wifi__PassAssignment_3 )
            // InternalIoTParser.g:2513:3: rule__Wifi__PassAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Wifi__PassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWifiAccess().getPassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__Group__3__Impl"


    // $ANTLR start "rule__Serial__Group__0"
    // InternalIoTParser.g:2522:1: rule__Serial__Group__0 : rule__Serial__Group__0__Impl rule__Serial__Group__1 ;
    public final void rule__Serial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2526:1: ( rule__Serial__Group__0__Impl rule__Serial__Group__1 )
            // InternalIoTParser.g:2527:2: rule__Serial__Group__0__Impl rule__Serial__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Serial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Serial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__Group__0"


    // $ANTLR start "rule__Serial__Group__0__Impl"
    // InternalIoTParser.g:2534:1: rule__Serial__Group__0__Impl : ( Baud ) ;
    public final void rule__Serial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2538:1: ( ( Baud ) )
            // InternalIoTParser.g:2539:1: ( Baud )
            {
            // InternalIoTParser.g:2539:1: ( Baud )
            // InternalIoTParser.g:2540:2: Baud
            {
             before(grammarAccess.getSerialAccess().getBaudKeyword_0()); 
            match(input,Baud,FOLLOW_2); 
             after(grammarAccess.getSerialAccess().getBaudKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__Group__0__Impl"


    // $ANTLR start "rule__Serial__Group__1"
    // InternalIoTParser.g:2549:1: rule__Serial__Group__1 : rule__Serial__Group__1__Impl rule__Serial__Group__2 ;
    public final void rule__Serial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2553:1: ( rule__Serial__Group__1__Impl rule__Serial__Group__2 )
            // InternalIoTParser.g:2554:2: rule__Serial__Group__1__Impl rule__Serial__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Serial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Serial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__Group__1"


    // $ANTLR start "rule__Serial__Group__1__Impl"
    // InternalIoTParser.g:2561:1: rule__Serial__Group__1__Impl : ( ( rule__Serial__BaudAssignment_1 ) ) ;
    public final void rule__Serial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2565:1: ( ( ( rule__Serial__BaudAssignment_1 ) ) )
            // InternalIoTParser.g:2566:1: ( ( rule__Serial__BaudAssignment_1 ) )
            {
            // InternalIoTParser.g:2566:1: ( ( rule__Serial__BaudAssignment_1 ) )
            // InternalIoTParser.g:2567:2: ( rule__Serial__BaudAssignment_1 )
            {
             before(grammarAccess.getSerialAccess().getBaudAssignment_1()); 
            // InternalIoTParser.g:2568:2: ( rule__Serial__BaudAssignment_1 )
            // InternalIoTParser.g:2568:3: rule__Serial__BaudAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Serial__BaudAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSerialAccess().getBaudAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__Group__1__Impl"


    // $ANTLR start "rule__Serial__Group__2"
    // InternalIoTParser.g:2576:1: rule__Serial__Group__2 : rule__Serial__Group__2__Impl rule__Serial__Group__3 ;
    public final void rule__Serial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2580:1: ( rule__Serial__Group__2__Impl rule__Serial__Group__3 )
            // InternalIoTParser.g:2581:2: rule__Serial__Group__2__Impl rule__Serial__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Serial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Serial__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__Group__2"


    // $ANTLR start "rule__Serial__Group__2__Impl"
    // InternalIoTParser.g:2588:1: rule__Serial__Group__2__Impl : ( Stop ) ;
    public final void rule__Serial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2592:1: ( ( Stop ) )
            // InternalIoTParser.g:2593:1: ( Stop )
            {
            // InternalIoTParser.g:2593:1: ( Stop )
            // InternalIoTParser.g:2594:2: Stop
            {
             before(grammarAccess.getSerialAccess().getStopKeyword_2()); 
            match(input,Stop,FOLLOW_2); 
             after(grammarAccess.getSerialAccess().getStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__Group__2__Impl"


    // $ANTLR start "rule__Serial__Group__3"
    // InternalIoTParser.g:2603:1: rule__Serial__Group__3 : rule__Serial__Group__3__Impl ;
    public final void rule__Serial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2607:1: ( rule__Serial__Group__3__Impl )
            // InternalIoTParser.g:2608:2: rule__Serial__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Serial__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__Group__3"


    // $ANTLR start "rule__Serial__Group__3__Impl"
    // InternalIoTParser.g:2614:1: rule__Serial__Group__3__Impl : ( ( rule__Serial__StopAssignment_3 ) ) ;
    public final void rule__Serial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2618:1: ( ( ( rule__Serial__StopAssignment_3 ) ) )
            // InternalIoTParser.g:2619:1: ( ( rule__Serial__StopAssignment_3 ) )
            {
            // InternalIoTParser.g:2619:1: ( ( rule__Serial__StopAssignment_3 ) )
            // InternalIoTParser.g:2620:2: ( rule__Serial__StopAssignment_3 )
            {
             before(grammarAccess.getSerialAccess().getStopAssignment_3()); 
            // InternalIoTParser.g:2621:2: ( rule__Serial__StopAssignment_3 )
            // InternalIoTParser.g:2621:3: rule__Serial__StopAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Serial__StopAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSerialAccess().getStopAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__Group__3__Impl"


    // $ANTLR start "rule__StopChar__Group_0__0"
    // InternalIoTParser.g:2630:1: rule__StopChar__Group_0__0 : rule__StopChar__Group_0__0__Impl rule__StopChar__Group_0__1 ;
    public final void rule__StopChar__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2634:1: ( rule__StopChar__Group_0__0__Impl rule__StopChar__Group_0__1 )
            // InternalIoTParser.g:2635:2: rule__StopChar__Group_0__0__Impl rule__StopChar__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__StopChar__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopChar__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_0__0"


    // $ANTLR start "rule__StopChar__Group_0__0__Impl"
    // InternalIoTParser.g:2642:1: rule__StopChar__Group_0__0__Impl : ( () ) ;
    public final void rule__StopChar__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2646:1: ( ( () ) )
            // InternalIoTParser.g:2647:1: ( () )
            {
            // InternalIoTParser.g:2647:1: ( () )
            // InternalIoTParser.g:2648:2: ()
            {
             before(grammarAccess.getStopCharAccess().getCharAction_0_0()); 
            // InternalIoTParser.g:2649:2: ()
            // InternalIoTParser.g:2649:3: 
            {
            }

             after(grammarAccess.getStopCharAccess().getCharAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_0__0__Impl"


    // $ANTLR start "rule__StopChar__Group_0__1"
    // InternalIoTParser.g:2657:1: rule__StopChar__Group_0__1 : rule__StopChar__Group_0__1__Impl rule__StopChar__Group_0__2 ;
    public final void rule__StopChar__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2661:1: ( rule__StopChar__Group_0__1__Impl rule__StopChar__Group_0__2 )
            // InternalIoTParser.g:2662:2: rule__StopChar__Group_0__1__Impl rule__StopChar__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__StopChar__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopChar__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_0__1"


    // $ANTLR start "rule__StopChar__Group_0__1__Impl"
    // InternalIoTParser.g:2669:1: rule__StopChar__Group_0__1__Impl : ( Char ) ;
    public final void rule__StopChar__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2673:1: ( ( Char ) )
            // InternalIoTParser.g:2674:1: ( Char )
            {
            // InternalIoTParser.g:2674:1: ( Char )
            // InternalIoTParser.g:2675:2: Char
            {
             before(grammarAccess.getStopCharAccess().getCharKeyword_0_1()); 
            match(input,Char,FOLLOW_2); 
             after(grammarAccess.getStopCharAccess().getCharKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_0__1__Impl"


    // $ANTLR start "rule__StopChar__Group_0__2"
    // InternalIoTParser.g:2684:1: rule__StopChar__Group_0__2 : rule__StopChar__Group_0__2__Impl ;
    public final void rule__StopChar__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2688:1: ( rule__StopChar__Group_0__2__Impl )
            // InternalIoTParser.g:2689:2: rule__StopChar__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StopChar__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_0__2"


    // $ANTLR start "rule__StopChar__Group_0__2__Impl"
    // InternalIoTParser.g:2695:1: rule__StopChar__Group_0__2__Impl : ( ( rule__StopChar__NameAssignment_0_2 ) ) ;
    public final void rule__StopChar__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2699:1: ( ( ( rule__StopChar__NameAssignment_0_2 ) ) )
            // InternalIoTParser.g:2700:1: ( ( rule__StopChar__NameAssignment_0_2 ) )
            {
            // InternalIoTParser.g:2700:1: ( ( rule__StopChar__NameAssignment_0_2 ) )
            // InternalIoTParser.g:2701:2: ( rule__StopChar__NameAssignment_0_2 )
            {
             before(grammarAccess.getStopCharAccess().getNameAssignment_0_2()); 
            // InternalIoTParser.g:2702:2: ( rule__StopChar__NameAssignment_0_2 )
            // InternalIoTParser.g:2702:3: rule__StopChar__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__StopChar__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStopCharAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_0__2__Impl"


    // $ANTLR start "rule__StopChar__Group_1__0"
    // InternalIoTParser.g:2711:1: rule__StopChar__Group_1__0 : rule__StopChar__Group_1__0__Impl rule__StopChar__Group_1__1 ;
    public final void rule__StopChar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2715:1: ( rule__StopChar__Group_1__0__Impl rule__StopChar__Group_1__1 )
            // InternalIoTParser.g:2716:2: rule__StopChar__Group_1__0__Impl rule__StopChar__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__StopChar__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopChar__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_1__0"


    // $ANTLR start "rule__StopChar__Group_1__0__Impl"
    // InternalIoTParser.g:2723:1: rule__StopChar__Group_1__0__Impl : ( () ) ;
    public final void rule__StopChar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2727:1: ( ( () ) )
            // InternalIoTParser.g:2728:1: ( () )
            {
            // InternalIoTParser.g:2728:1: ( () )
            // InternalIoTParser.g:2729:2: ()
            {
             before(grammarAccess.getStopCharAccess().getByteAction_1_0()); 
            // InternalIoTParser.g:2730:2: ()
            // InternalIoTParser.g:2730:3: 
            {
            }

             after(grammarAccess.getStopCharAccess().getByteAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_1__0__Impl"


    // $ANTLR start "rule__StopChar__Group_1__1"
    // InternalIoTParser.g:2738:1: rule__StopChar__Group_1__1 : rule__StopChar__Group_1__1__Impl rule__StopChar__Group_1__2 ;
    public final void rule__StopChar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2742:1: ( rule__StopChar__Group_1__1__Impl rule__StopChar__Group_1__2 )
            // InternalIoTParser.g:2743:2: rule__StopChar__Group_1__1__Impl rule__StopChar__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__StopChar__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopChar__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_1__1"


    // $ANTLR start "rule__StopChar__Group_1__1__Impl"
    // InternalIoTParser.g:2750:1: rule__StopChar__Group_1__1__Impl : ( Byte ) ;
    public final void rule__StopChar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2754:1: ( ( Byte ) )
            // InternalIoTParser.g:2755:1: ( Byte )
            {
            // InternalIoTParser.g:2755:1: ( Byte )
            // InternalIoTParser.g:2756:2: Byte
            {
             before(grammarAccess.getStopCharAccess().getByteKeyword_1_1()); 
            match(input,Byte,FOLLOW_2); 
             after(grammarAccess.getStopCharAccess().getByteKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_1__1__Impl"


    // $ANTLR start "rule__StopChar__Group_1__2"
    // InternalIoTParser.g:2765:1: rule__StopChar__Group_1__2 : rule__StopChar__Group_1__2__Impl ;
    public final void rule__StopChar__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2769:1: ( rule__StopChar__Group_1__2__Impl )
            // InternalIoTParser.g:2770:2: rule__StopChar__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StopChar__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_1__2"


    // $ANTLR start "rule__StopChar__Group_1__2__Impl"
    // InternalIoTParser.g:2776:1: rule__StopChar__Group_1__2__Impl : ( ( rule__StopChar__NameAssignment_1_2 ) ) ;
    public final void rule__StopChar__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2780:1: ( ( ( rule__StopChar__NameAssignment_1_2 ) ) )
            // InternalIoTParser.g:2781:1: ( ( rule__StopChar__NameAssignment_1_2 ) )
            {
            // InternalIoTParser.g:2781:1: ( ( rule__StopChar__NameAssignment_1_2 ) )
            // InternalIoTParser.g:2782:2: ( rule__StopChar__NameAssignment_1_2 )
            {
             before(grammarAccess.getStopCharAccess().getNameAssignment_1_2()); 
            // InternalIoTParser.g:2783:2: ( rule__StopChar__NameAssignment_1_2 )
            // InternalIoTParser.g:2783:3: rule__StopChar__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__StopChar__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getStopCharAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__Group_1__2__Impl"


    // $ANTLR start "rule__MqttClient__Group__0"
    // InternalIoTParser.g:2792:1: rule__MqttClient__Group__0 : rule__MqttClient__Group__0__Impl rule__MqttClient__Group__1 ;
    public final void rule__MqttClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2796:1: ( rule__MqttClient__Group__0__Impl rule__MqttClient__Group__1 )
            // InternalIoTParser.g:2797:2: rule__MqttClient__Group__0__Impl rule__MqttClient__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__MqttClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MqttClient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__0"


    // $ANTLR start "rule__MqttClient__Group__0__Impl"
    // InternalIoTParser.g:2804:1: rule__MqttClient__Group__0__Impl : ( Broker ) ;
    public final void rule__MqttClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2808:1: ( ( Broker ) )
            // InternalIoTParser.g:2809:1: ( Broker )
            {
            // InternalIoTParser.g:2809:1: ( Broker )
            // InternalIoTParser.g:2810:2: Broker
            {
             before(grammarAccess.getMqttClientAccess().getBrokerKeyword_0()); 
            match(input,Broker,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getBrokerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__0__Impl"


    // $ANTLR start "rule__MqttClient__Group__1"
    // InternalIoTParser.g:2819:1: rule__MqttClient__Group__1 : rule__MqttClient__Group__1__Impl rule__MqttClient__Group__2 ;
    public final void rule__MqttClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2823:1: ( rule__MqttClient__Group__1__Impl rule__MqttClient__Group__2 )
            // InternalIoTParser.g:2824:2: rule__MqttClient__Group__1__Impl rule__MqttClient__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__MqttClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MqttClient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__1"


    // $ANTLR start "rule__MqttClient__Group__1__Impl"
    // InternalIoTParser.g:2831:1: rule__MqttClient__Group__1__Impl : ( ( rule__MqttClient__BrokerAssignment_1 ) ) ;
    public final void rule__MqttClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2835:1: ( ( ( rule__MqttClient__BrokerAssignment_1 ) ) )
            // InternalIoTParser.g:2836:1: ( ( rule__MqttClient__BrokerAssignment_1 ) )
            {
            // InternalIoTParser.g:2836:1: ( ( rule__MqttClient__BrokerAssignment_1 ) )
            // InternalIoTParser.g:2837:2: ( rule__MqttClient__BrokerAssignment_1 )
            {
             before(grammarAccess.getMqttClientAccess().getBrokerAssignment_1()); 
            // InternalIoTParser.g:2838:2: ( rule__MqttClient__BrokerAssignment_1 )
            // InternalIoTParser.g:2838:3: rule__MqttClient__BrokerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MqttClient__BrokerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMqttClientAccess().getBrokerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__1__Impl"


    // $ANTLR start "rule__MqttClient__Group__2"
    // InternalIoTParser.g:2846:1: rule__MqttClient__Group__2 : rule__MqttClient__Group__2__Impl rule__MqttClient__Group__3 ;
    public final void rule__MqttClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2850:1: ( rule__MqttClient__Group__2__Impl rule__MqttClient__Group__3 )
            // InternalIoTParser.g:2851:2: rule__MqttClient__Group__2__Impl rule__MqttClient__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__MqttClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MqttClient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__2"


    // $ANTLR start "rule__MqttClient__Group__2__Impl"
    // InternalIoTParser.g:2858:1: rule__MqttClient__Group__2__Impl : ( Client ) ;
    public final void rule__MqttClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2862:1: ( ( Client ) )
            // InternalIoTParser.g:2863:1: ( Client )
            {
            // InternalIoTParser.g:2863:1: ( Client )
            // InternalIoTParser.g:2864:2: Client
            {
             before(grammarAccess.getMqttClientAccess().getClientKeyword_2()); 
            match(input,Client,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getClientKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__2__Impl"


    // $ANTLR start "rule__MqttClient__Group__3"
    // InternalIoTParser.g:2873:1: rule__MqttClient__Group__3 : rule__MqttClient__Group__3__Impl rule__MqttClient__Group__4 ;
    public final void rule__MqttClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2877:1: ( rule__MqttClient__Group__3__Impl rule__MqttClient__Group__4 )
            // InternalIoTParser.g:2878:2: rule__MqttClient__Group__3__Impl rule__MqttClient__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__MqttClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MqttClient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__3"


    // $ANTLR start "rule__MqttClient__Group__3__Impl"
    // InternalIoTParser.g:2885:1: rule__MqttClient__Group__3__Impl : ( ( rule__MqttClient__ClientAssignment_3 ) ) ;
    public final void rule__MqttClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2889:1: ( ( ( rule__MqttClient__ClientAssignment_3 ) ) )
            // InternalIoTParser.g:2890:1: ( ( rule__MqttClient__ClientAssignment_3 ) )
            {
            // InternalIoTParser.g:2890:1: ( ( rule__MqttClient__ClientAssignment_3 ) )
            // InternalIoTParser.g:2891:2: ( rule__MqttClient__ClientAssignment_3 )
            {
             before(grammarAccess.getMqttClientAccess().getClientAssignment_3()); 
            // InternalIoTParser.g:2892:2: ( rule__MqttClient__ClientAssignment_3 )
            // InternalIoTParser.g:2892:3: rule__MqttClient__ClientAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MqttClient__ClientAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMqttClientAccess().getClientAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__3__Impl"


    // $ANTLR start "rule__MqttClient__Group__4"
    // InternalIoTParser.g:2900:1: rule__MqttClient__Group__4 : rule__MqttClient__Group__4__Impl ;
    public final void rule__MqttClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2904:1: ( rule__MqttClient__Group__4__Impl )
            // InternalIoTParser.g:2905:2: rule__MqttClient__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MqttClient__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__4"


    // $ANTLR start "rule__MqttClient__Group__4__Impl"
    // InternalIoTParser.g:2911:1: rule__MqttClient__Group__4__Impl : ( ( rule__MqttClient__Group_4__0 )? ) ;
    public final void rule__MqttClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2915:1: ( ( ( rule__MqttClient__Group_4__0 )? ) )
            // InternalIoTParser.g:2916:1: ( ( rule__MqttClient__Group_4__0 )? )
            {
            // InternalIoTParser.g:2916:1: ( ( rule__MqttClient__Group_4__0 )? )
            // InternalIoTParser.g:2917:2: ( rule__MqttClient__Group_4__0 )?
            {
             before(grammarAccess.getMqttClientAccess().getGroup_4()); 
            // InternalIoTParser.g:2918:2: ( rule__MqttClient__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Sub) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalIoTParser.g:2918:3: rule__MqttClient__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MqttClient__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMqttClientAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group__4__Impl"


    // $ANTLR start "rule__MqttClient__Group_4__0"
    // InternalIoTParser.g:2927:1: rule__MqttClient__Group_4__0 : rule__MqttClient__Group_4__0__Impl rule__MqttClient__Group_4__1 ;
    public final void rule__MqttClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2931:1: ( rule__MqttClient__Group_4__0__Impl rule__MqttClient__Group_4__1 )
            // InternalIoTParser.g:2932:2: rule__MqttClient__Group_4__0__Impl rule__MqttClient__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__MqttClient__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MqttClient__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__0"


    // $ANTLR start "rule__MqttClient__Group_4__0__Impl"
    // InternalIoTParser.g:2939:1: rule__MqttClient__Group_4__0__Impl : ( Sub ) ;
    public final void rule__MqttClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2943:1: ( ( Sub ) )
            // InternalIoTParser.g:2944:1: ( Sub )
            {
            // InternalIoTParser.g:2944:1: ( Sub )
            // InternalIoTParser.g:2945:2: Sub
            {
             before(grammarAccess.getMqttClientAccess().getSubKeyword_4_0()); 
            match(input,Sub,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getSubKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__0__Impl"


    // $ANTLR start "rule__MqttClient__Group_4__1"
    // InternalIoTParser.g:2954:1: rule__MqttClient__Group_4__1 : rule__MqttClient__Group_4__1__Impl rule__MqttClient__Group_4__2 ;
    public final void rule__MqttClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2958:1: ( rule__MqttClient__Group_4__1__Impl rule__MqttClient__Group_4__2 )
            // InternalIoTParser.g:2959:2: rule__MqttClient__Group_4__1__Impl rule__MqttClient__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__MqttClient__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MqttClient__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__1"


    // $ANTLR start "rule__MqttClient__Group_4__1__Impl"
    // InternalIoTParser.g:2966:1: rule__MqttClient__Group_4__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__MqttClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2970:1: ( ( LeftSquareBracket ) )
            // InternalIoTParser.g:2971:1: ( LeftSquareBracket )
            {
            // InternalIoTParser.g:2971:1: ( LeftSquareBracket )
            // InternalIoTParser.g:2972:2: LeftSquareBracket
            {
             before(grammarAccess.getMqttClientAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__1__Impl"


    // $ANTLR start "rule__MqttClient__Group_4__2"
    // InternalIoTParser.g:2981:1: rule__MqttClient__Group_4__2 : rule__MqttClient__Group_4__2__Impl rule__MqttClient__Group_4__3 ;
    public final void rule__MqttClient__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2985:1: ( rule__MqttClient__Group_4__2__Impl rule__MqttClient__Group_4__3 )
            // InternalIoTParser.g:2986:2: rule__MqttClient__Group_4__2__Impl rule__MqttClient__Group_4__3
            {
            pushFollow(FOLLOW_27);
            rule__MqttClient__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MqttClient__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__2"


    // $ANTLR start "rule__MqttClient__Group_4__2__Impl"
    // InternalIoTParser.g:2993:1: rule__MqttClient__Group_4__2__Impl : ( ( rule__MqttClient__SubAssignment_4_2 ) ) ;
    public final void rule__MqttClient__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:2997:1: ( ( ( rule__MqttClient__SubAssignment_4_2 ) ) )
            // InternalIoTParser.g:2998:1: ( ( rule__MqttClient__SubAssignment_4_2 ) )
            {
            // InternalIoTParser.g:2998:1: ( ( rule__MqttClient__SubAssignment_4_2 ) )
            // InternalIoTParser.g:2999:2: ( rule__MqttClient__SubAssignment_4_2 )
            {
             before(grammarAccess.getMqttClientAccess().getSubAssignment_4_2()); 
            // InternalIoTParser.g:3000:2: ( rule__MqttClient__SubAssignment_4_2 )
            // InternalIoTParser.g:3000:3: rule__MqttClient__SubAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MqttClient__SubAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMqttClientAccess().getSubAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__2__Impl"


    // $ANTLR start "rule__MqttClient__Group_4__3"
    // InternalIoTParser.g:3008:1: rule__MqttClient__Group_4__3 : rule__MqttClient__Group_4__3__Impl rule__MqttClient__Group_4__4 ;
    public final void rule__MqttClient__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3012:1: ( rule__MqttClient__Group_4__3__Impl rule__MqttClient__Group_4__4 )
            // InternalIoTParser.g:3013:2: rule__MqttClient__Group_4__3__Impl rule__MqttClient__Group_4__4
            {
            pushFollow(FOLLOW_27);
            rule__MqttClient__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MqttClient__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__3"


    // $ANTLR start "rule__MqttClient__Group_4__3__Impl"
    // InternalIoTParser.g:3020:1: rule__MqttClient__Group_4__3__Impl : ( ( rule__MqttClient__Group_4_3__0 )* ) ;
    public final void rule__MqttClient__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3024:1: ( ( ( rule__MqttClient__Group_4_3__0 )* ) )
            // InternalIoTParser.g:3025:1: ( ( rule__MqttClient__Group_4_3__0 )* )
            {
            // InternalIoTParser.g:3025:1: ( ( rule__MqttClient__Group_4_3__0 )* )
            // InternalIoTParser.g:3026:2: ( rule__MqttClient__Group_4_3__0 )*
            {
             before(grammarAccess.getMqttClientAccess().getGroup_4_3()); 
            // InternalIoTParser.g:3027:2: ( rule__MqttClient__Group_4_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalIoTParser.g:3027:3: rule__MqttClient__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__MqttClient__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMqttClientAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__3__Impl"


    // $ANTLR start "rule__MqttClient__Group_4__4"
    // InternalIoTParser.g:3035:1: rule__MqttClient__Group_4__4 : rule__MqttClient__Group_4__4__Impl ;
    public final void rule__MqttClient__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3039:1: ( rule__MqttClient__Group_4__4__Impl )
            // InternalIoTParser.g:3040:2: rule__MqttClient__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MqttClient__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__4"


    // $ANTLR start "rule__MqttClient__Group_4__4__Impl"
    // InternalIoTParser.g:3046:1: rule__MqttClient__Group_4__4__Impl : ( RightSquareBracket ) ;
    public final void rule__MqttClient__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3050:1: ( ( RightSquareBracket ) )
            // InternalIoTParser.g:3051:1: ( RightSquareBracket )
            {
            // InternalIoTParser.g:3051:1: ( RightSquareBracket )
            // InternalIoTParser.g:3052:2: RightSquareBracket
            {
             before(grammarAccess.getMqttClientAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getRightSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4__4__Impl"


    // $ANTLR start "rule__MqttClient__Group_4_3__0"
    // InternalIoTParser.g:3062:1: rule__MqttClient__Group_4_3__0 : rule__MqttClient__Group_4_3__0__Impl rule__MqttClient__Group_4_3__1 ;
    public final void rule__MqttClient__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3066:1: ( rule__MqttClient__Group_4_3__0__Impl rule__MqttClient__Group_4_3__1 )
            // InternalIoTParser.g:3067:2: rule__MqttClient__Group_4_3__0__Impl rule__MqttClient__Group_4_3__1
            {
            pushFollow(FOLLOW_18);
            rule__MqttClient__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MqttClient__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4_3__0"


    // $ANTLR start "rule__MqttClient__Group_4_3__0__Impl"
    // InternalIoTParser.g:3074:1: rule__MqttClient__Group_4_3__0__Impl : ( Comma ) ;
    public final void rule__MqttClient__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3078:1: ( ( Comma ) )
            // InternalIoTParser.g:3079:1: ( Comma )
            {
            // InternalIoTParser.g:3079:1: ( Comma )
            // InternalIoTParser.g:3080:2: Comma
            {
             before(grammarAccess.getMqttClientAccess().getCommaKeyword_4_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4_3__0__Impl"


    // $ANTLR start "rule__MqttClient__Group_4_3__1"
    // InternalIoTParser.g:3089:1: rule__MqttClient__Group_4_3__1 : rule__MqttClient__Group_4_3__1__Impl ;
    public final void rule__MqttClient__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3093:1: ( rule__MqttClient__Group_4_3__1__Impl )
            // InternalIoTParser.g:3094:2: rule__MqttClient__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MqttClient__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4_3__1"


    // $ANTLR start "rule__MqttClient__Group_4_3__1__Impl"
    // InternalIoTParser.g:3100:1: rule__MqttClient__Group_4_3__1__Impl : ( ( rule__MqttClient__SubAssignment_4_3_1 ) ) ;
    public final void rule__MqttClient__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3104:1: ( ( ( rule__MqttClient__SubAssignment_4_3_1 ) ) )
            // InternalIoTParser.g:3105:1: ( ( rule__MqttClient__SubAssignment_4_3_1 ) )
            {
            // InternalIoTParser.g:3105:1: ( ( rule__MqttClient__SubAssignment_4_3_1 ) )
            // InternalIoTParser.g:3106:2: ( rule__MqttClient__SubAssignment_4_3_1 )
            {
             before(grammarAccess.getMqttClientAccess().getSubAssignment_4_3_1()); 
            // InternalIoTParser.g:3107:2: ( rule__MqttClient__SubAssignment_4_3_1 )
            // InternalIoTParser.g:3107:3: rule__MqttClient__SubAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MqttClient__SubAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMqttClientAccess().getSubAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__Group_4_3__1__Impl"


    // $ANTLR start "rule__Board__Group__0"
    // InternalIoTParser.g:3116:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3120:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalIoTParser.g:3121:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Board__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0"


    // $ANTLR start "rule__Board__Group__0__Impl"
    // InternalIoTParser.g:3128:1: rule__Board__Group__0__Impl : ( Board ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3132:1: ( ( Board ) )
            // InternalIoTParser.g:3133:1: ( Board )
            {
            // InternalIoTParser.g:3133:1: ( Board )
            // InternalIoTParser.g:3134:2: Board
            {
             before(grammarAccess.getBoardAccess().getBoardKeyword_0()); 
            match(input,Board,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getBoardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0__Impl"


    // $ANTLR start "rule__Board__Group__1"
    // InternalIoTParser.g:3143:1: rule__Board__Group__1 : rule__Board__Group__1__Impl ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3147:1: ( rule__Board__Group__1__Impl )
            // InternalIoTParser.g:3148:2: rule__Board__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1"


    // $ANTLR start "rule__Board__Group__1__Impl"
    // InternalIoTParser.g:3154:1: rule__Board__Group__1__Impl : ( ( rule__Board__Alternatives_1 ) ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3158:1: ( ( ( rule__Board__Alternatives_1 ) ) )
            // InternalIoTParser.g:3159:1: ( ( rule__Board__Alternatives_1 ) )
            {
            // InternalIoTParser.g:3159:1: ( ( rule__Board__Alternatives_1 ) )
            // InternalIoTParser.g:3160:2: ( rule__Board__Alternatives_1 )
            {
             before(grammarAccess.getBoardAccess().getAlternatives_1()); 
            // InternalIoTParser.g:3161:2: ( rule__Board__Alternatives_1 )
            // InternalIoTParser.g:3161:3: rule__Board__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1__Impl"


    // $ANTLR start "rule__NewBoard__Group__0"
    // InternalIoTParser.g:3170:1: rule__NewBoard__Group__0 : rule__NewBoard__Group__0__Impl rule__NewBoard__Group__1 ;
    public final void rule__NewBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3174:1: ( rule__NewBoard__Group__0__Impl rule__NewBoard__Group__1 )
            // InternalIoTParser.g:3175:2: rule__NewBoard__Group__0__Impl rule__NewBoard__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__NewBoard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewBoard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__0"


    // $ANTLR start "rule__NewBoard__Group__0__Impl"
    // InternalIoTParser.g:3182:1: rule__NewBoard__Group__0__Impl : ( ( rule__NewBoard__NameAssignment_0 ) ) ;
    public final void rule__NewBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3186:1: ( ( ( rule__NewBoard__NameAssignment_0 ) ) )
            // InternalIoTParser.g:3187:1: ( ( rule__NewBoard__NameAssignment_0 ) )
            {
            // InternalIoTParser.g:3187:1: ( ( rule__NewBoard__NameAssignment_0 ) )
            // InternalIoTParser.g:3188:2: ( rule__NewBoard__NameAssignment_0 )
            {
             before(grammarAccess.getNewBoardAccess().getNameAssignment_0()); 
            // InternalIoTParser.g:3189:2: ( rule__NewBoard__NameAssignment_0 )
            // InternalIoTParser.g:3189:3: rule__NewBoard__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NewBoard__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNewBoardAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__0__Impl"


    // $ANTLR start "rule__NewBoard__Group__1"
    // InternalIoTParser.g:3197:1: rule__NewBoard__Group__1 : rule__NewBoard__Group__1__Impl rule__NewBoard__Group__2 ;
    public final void rule__NewBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3201:1: ( rule__NewBoard__Group__1__Impl rule__NewBoard__Group__2 )
            // InternalIoTParser.g:3202:2: rule__NewBoard__Group__1__Impl rule__NewBoard__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__NewBoard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewBoard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__1"


    // $ANTLR start "rule__NewBoard__Group__1__Impl"
    // InternalIoTParser.g:3209:1: rule__NewBoard__Group__1__Impl : ( Colon ) ;
    public final void rule__NewBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3213:1: ( ( Colon ) )
            // InternalIoTParser.g:3214:1: ( Colon )
            {
            // InternalIoTParser.g:3214:1: ( Colon )
            // InternalIoTParser.g:3215:2: Colon
            {
             before(grammarAccess.getNewBoardAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getNewBoardAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__1__Impl"


    // $ANTLR start "rule__NewBoard__Group__2"
    // InternalIoTParser.g:3224:1: rule__NewBoard__Group__2 : rule__NewBoard__Group__2__Impl rule__NewBoard__Group__3 ;
    public final void rule__NewBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3228:1: ( rule__NewBoard__Group__2__Impl rule__NewBoard__Group__3 )
            // InternalIoTParser.g:3229:2: rule__NewBoard__Group__2__Impl rule__NewBoard__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__NewBoard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewBoard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__2"


    // $ANTLR start "rule__NewBoard__Group__2__Impl"
    // InternalIoTParser.g:3236:1: rule__NewBoard__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__NewBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3240:1: ( ( RULE_BEGIN ) )
            // InternalIoTParser.g:3241:1: ( RULE_BEGIN )
            {
            // InternalIoTParser.g:3241:1: ( RULE_BEGIN )
            // InternalIoTParser.g:3242:2: RULE_BEGIN
            {
             before(grammarAccess.getNewBoardAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getNewBoardAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__2__Impl"


    // $ANTLR start "rule__NewBoard__Group__3"
    // InternalIoTParser.g:3251:1: rule__NewBoard__Group__3 : rule__NewBoard__Group__3__Impl rule__NewBoard__Group__4 ;
    public final void rule__NewBoard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3255:1: ( rule__NewBoard__Group__3__Impl rule__NewBoard__Group__4 )
            // InternalIoTParser.g:3256:2: rule__NewBoard__Group__3__Impl rule__NewBoard__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__NewBoard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewBoard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__3"


    // $ANTLR start "rule__NewBoard__Group__3__Impl"
    // InternalIoTParser.g:3263:1: rule__NewBoard__Group__3__Impl : ( ( rule__NewBoard__VersionAssignment_3 ) ) ;
    public final void rule__NewBoard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3267:1: ( ( ( rule__NewBoard__VersionAssignment_3 ) ) )
            // InternalIoTParser.g:3268:1: ( ( rule__NewBoard__VersionAssignment_3 ) )
            {
            // InternalIoTParser.g:3268:1: ( ( rule__NewBoard__VersionAssignment_3 ) )
            // InternalIoTParser.g:3269:2: ( rule__NewBoard__VersionAssignment_3 )
            {
             before(grammarAccess.getNewBoardAccess().getVersionAssignment_3()); 
            // InternalIoTParser.g:3270:2: ( rule__NewBoard__VersionAssignment_3 )
            // InternalIoTParser.g:3270:3: rule__NewBoard__VersionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NewBoard__VersionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNewBoardAccess().getVersionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__3__Impl"


    // $ANTLR start "rule__NewBoard__Group__4"
    // InternalIoTParser.g:3278:1: rule__NewBoard__Group__4 : rule__NewBoard__Group__4__Impl rule__NewBoard__Group__5 ;
    public final void rule__NewBoard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3282:1: ( rule__NewBoard__Group__4__Impl rule__NewBoard__Group__5 )
            // InternalIoTParser.g:3283:2: rule__NewBoard__Group__4__Impl rule__NewBoard__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__NewBoard__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewBoard__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__4"


    // $ANTLR start "rule__NewBoard__Group__4__Impl"
    // InternalIoTParser.g:3290:1: rule__NewBoard__Group__4__Impl : ( ( ( rule__NewBoard__SensorsAssignment_4 ) ) ( ( rule__NewBoard__SensorsAssignment_4 )* ) ) ;
    public final void rule__NewBoard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3294:1: ( ( ( ( rule__NewBoard__SensorsAssignment_4 ) ) ( ( rule__NewBoard__SensorsAssignment_4 )* ) ) )
            // InternalIoTParser.g:3295:1: ( ( ( rule__NewBoard__SensorsAssignment_4 ) ) ( ( rule__NewBoard__SensorsAssignment_4 )* ) )
            {
            // InternalIoTParser.g:3295:1: ( ( ( rule__NewBoard__SensorsAssignment_4 ) ) ( ( rule__NewBoard__SensorsAssignment_4 )* ) )
            // InternalIoTParser.g:3296:2: ( ( rule__NewBoard__SensorsAssignment_4 ) ) ( ( rule__NewBoard__SensorsAssignment_4 )* )
            {
            // InternalIoTParser.g:3296:2: ( ( rule__NewBoard__SensorsAssignment_4 ) )
            // InternalIoTParser.g:3297:3: ( rule__NewBoard__SensorsAssignment_4 )
            {
             before(grammarAccess.getNewBoardAccess().getSensorsAssignment_4()); 
            // InternalIoTParser.g:3298:3: ( rule__NewBoard__SensorsAssignment_4 )
            // InternalIoTParser.g:3298:4: rule__NewBoard__SensorsAssignment_4
            {
            pushFollow(FOLLOW_31);
            rule__NewBoard__SensorsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNewBoardAccess().getSensorsAssignment_4()); 

            }

            // InternalIoTParser.g:3301:2: ( ( rule__NewBoard__SensorsAssignment_4 )* )
            // InternalIoTParser.g:3302:3: ( rule__NewBoard__SensorsAssignment_4 )*
            {
             before(grammarAccess.getNewBoardAccess().getSensorsAssignment_4()); 
            // InternalIoTParser.g:3303:3: ( rule__NewBoard__SensorsAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Sensor) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalIoTParser.g:3303:4: rule__NewBoard__SensorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__NewBoard__SensorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getNewBoardAccess().getSensorsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__4__Impl"


    // $ANTLR start "rule__NewBoard__Group__5"
    // InternalIoTParser.g:3312:1: rule__NewBoard__Group__5 : rule__NewBoard__Group__5__Impl ;
    public final void rule__NewBoard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3316:1: ( rule__NewBoard__Group__5__Impl )
            // InternalIoTParser.g:3317:2: rule__NewBoard__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewBoard__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__5"


    // $ANTLR start "rule__NewBoard__Group__5__Impl"
    // InternalIoTParser.g:3323:1: rule__NewBoard__Group__5__Impl : ( RULE_END ) ;
    public final void rule__NewBoard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3327:1: ( ( RULE_END ) )
            // InternalIoTParser.g:3328:1: ( RULE_END )
            {
            // InternalIoTParser.g:3328:1: ( RULE_END )
            // InternalIoTParser.g:3329:2: RULE_END
            {
             before(grammarAccess.getNewBoardAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getNewBoardAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__Group__5__Impl"


    // $ANTLR start "rule__BoardVersion__Group__0"
    // InternalIoTParser.g:3339:1: rule__BoardVersion__Group__0 : rule__BoardVersion__Group__0__Impl rule__BoardVersion__Group__1 ;
    public final void rule__BoardVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3343:1: ( rule__BoardVersion__Group__0__Impl rule__BoardVersion__Group__1 )
            // InternalIoTParser.g:3344:2: rule__BoardVersion__Group__0__Impl rule__BoardVersion__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BoardVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardVersion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__Group__0"


    // $ANTLR start "rule__BoardVersion__Group__0__Impl"
    // InternalIoTParser.g:3351:1: rule__BoardVersion__Group__0__Impl : ( Type ) ;
    public final void rule__BoardVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3355:1: ( ( Type ) )
            // InternalIoTParser.g:3356:1: ( Type )
            {
            // InternalIoTParser.g:3356:1: ( Type )
            // InternalIoTParser.g:3357:2: Type
            {
             before(grammarAccess.getBoardVersionAccess().getTypeKeyword_0()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getBoardVersionAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__Group__0__Impl"


    // $ANTLR start "rule__BoardVersion__Group__1"
    // InternalIoTParser.g:3366:1: rule__BoardVersion__Group__1 : rule__BoardVersion__Group__1__Impl rule__BoardVersion__Group__2 ;
    public final void rule__BoardVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3370:1: ( rule__BoardVersion__Group__1__Impl rule__BoardVersion__Group__2 )
            // InternalIoTParser.g:3371:2: rule__BoardVersion__Group__1__Impl rule__BoardVersion__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__BoardVersion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardVersion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__Group__1"


    // $ANTLR start "rule__BoardVersion__Group__1__Impl"
    // InternalIoTParser.g:3378:1: rule__BoardVersion__Group__1__Impl : ( ( rule__BoardVersion__TypeAssignment_1 ) ) ;
    public final void rule__BoardVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3382:1: ( ( ( rule__BoardVersion__TypeAssignment_1 ) ) )
            // InternalIoTParser.g:3383:1: ( ( rule__BoardVersion__TypeAssignment_1 ) )
            {
            // InternalIoTParser.g:3383:1: ( ( rule__BoardVersion__TypeAssignment_1 ) )
            // InternalIoTParser.g:3384:2: ( rule__BoardVersion__TypeAssignment_1 )
            {
             before(grammarAccess.getBoardVersionAccess().getTypeAssignment_1()); 
            // InternalIoTParser.g:3385:2: ( rule__BoardVersion__TypeAssignment_1 )
            // InternalIoTParser.g:3385:3: rule__BoardVersion__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BoardVersion__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardVersionAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__Group__1__Impl"


    // $ANTLR start "rule__BoardVersion__Group__2"
    // InternalIoTParser.g:3393:1: rule__BoardVersion__Group__2 : rule__BoardVersion__Group__2__Impl rule__BoardVersion__Group__3 ;
    public final void rule__BoardVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3397:1: ( rule__BoardVersion__Group__2__Impl rule__BoardVersion__Group__3 )
            // InternalIoTParser.g:3398:2: rule__BoardVersion__Group__2__Impl rule__BoardVersion__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__BoardVersion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoardVersion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__Group__2"


    // $ANTLR start "rule__BoardVersion__Group__2__Impl"
    // InternalIoTParser.g:3405:1: rule__BoardVersion__Group__2__Impl : ( Model ) ;
    public final void rule__BoardVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3409:1: ( ( Model ) )
            // InternalIoTParser.g:3410:1: ( Model )
            {
            // InternalIoTParser.g:3410:1: ( Model )
            // InternalIoTParser.g:3411:2: Model
            {
             before(grammarAccess.getBoardVersionAccess().getModelKeyword_2()); 
            match(input,Model,FOLLOW_2); 
             after(grammarAccess.getBoardVersionAccess().getModelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__Group__2__Impl"


    // $ANTLR start "rule__BoardVersion__Group__3"
    // InternalIoTParser.g:3420:1: rule__BoardVersion__Group__3 : rule__BoardVersion__Group__3__Impl ;
    public final void rule__BoardVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3424:1: ( rule__BoardVersion__Group__3__Impl )
            // InternalIoTParser.g:3425:2: rule__BoardVersion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoardVersion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__Group__3"


    // $ANTLR start "rule__BoardVersion__Group__3__Impl"
    // InternalIoTParser.g:3431:1: rule__BoardVersion__Group__3__Impl : ( ( rule__BoardVersion__ModelAssignment_3 ) ) ;
    public final void rule__BoardVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3435:1: ( ( ( rule__BoardVersion__ModelAssignment_3 ) ) )
            // InternalIoTParser.g:3436:1: ( ( rule__BoardVersion__ModelAssignment_3 ) )
            {
            // InternalIoTParser.g:3436:1: ( ( rule__BoardVersion__ModelAssignment_3 ) )
            // InternalIoTParser.g:3437:2: ( rule__BoardVersion__ModelAssignment_3 )
            {
             before(grammarAccess.getBoardVersionAccess().getModelAssignment_3()); 
            // InternalIoTParser.g:3438:2: ( rule__BoardVersion__ModelAssignment_3 )
            // InternalIoTParser.g:3438:3: rule__BoardVersion__ModelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BoardVersion__ModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoardVersionAccess().getModelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__Group__3__Impl"


    // $ANTLR start "rule__ExtendsBoard__Group__0"
    // InternalIoTParser.g:3447:1: rule__ExtendsBoard__Group__0 : rule__ExtendsBoard__Group__0__Impl rule__ExtendsBoard__Group__1 ;
    public final void rule__ExtendsBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3451:1: ( rule__ExtendsBoard__Group__0__Impl rule__ExtendsBoard__Group__1 )
            // InternalIoTParser.g:3452:2: rule__ExtendsBoard__Group__0__Impl rule__ExtendsBoard__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ExtendsBoard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group__0"


    // $ANTLR start "rule__ExtendsBoard__Group__0__Impl"
    // InternalIoTParser.g:3459:1: rule__ExtendsBoard__Group__0__Impl : ( ( rule__ExtendsBoard__NameAssignment_0 ) ) ;
    public final void rule__ExtendsBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3463:1: ( ( ( rule__ExtendsBoard__NameAssignment_0 ) ) )
            // InternalIoTParser.g:3464:1: ( ( rule__ExtendsBoard__NameAssignment_0 ) )
            {
            // InternalIoTParser.g:3464:1: ( ( rule__ExtendsBoard__NameAssignment_0 ) )
            // InternalIoTParser.g:3465:2: ( rule__ExtendsBoard__NameAssignment_0 )
            {
             before(grammarAccess.getExtendsBoardAccess().getNameAssignment_0()); 
            // InternalIoTParser.g:3466:2: ( rule__ExtendsBoard__NameAssignment_0 )
            // InternalIoTParser.g:3466:3: rule__ExtendsBoard__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtendsBoardAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group__0__Impl"


    // $ANTLR start "rule__ExtendsBoard__Group__1"
    // InternalIoTParser.g:3474:1: rule__ExtendsBoard__Group__1 : rule__ExtendsBoard__Group__1__Impl rule__ExtendsBoard__Group__2 ;
    public final void rule__ExtendsBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3478:1: ( rule__ExtendsBoard__Group__1__Impl rule__ExtendsBoard__Group__2 )
            // InternalIoTParser.g:3479:2: rule__ExtendsBoard__Group__1__Impl rule__ExtendsBoard__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExtendsBoard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group__1"


    // $ANTLR start "rule__ExtendsBoard__Group__1__Impl"
    // InternalIoTParser.g:3486:1: rule__ExtendsBoard__Group__1__Impl : ( Extends ) ;
    public final void rule__ExtendsBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3490:1: ( ( Extends ) )
            // InternalIoTParser.g:3491:1: ( Extends )
            {
            // InternalIoTParser.g:3491:1: ( Extends )
            // InternalIoTParser.g:3492:2: Extends
            {
             before(grammarAccess.getExtendsBoardAccess().getExtendsKeyword_1()); 
            match(input,Extends,FOLLOW_2); 
             after(grammarAccess.getExtendsBoardAccess().getExtendsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group__1__Impl"


    // $ANTLR start "rule__ExtendsBoard__Group__2"
    // InternalIoTParser.g:3501:1: rule__ExtendsBoard__Group__2 : rule__ExtendsBoard__Group__2__Impl rule__ExtendsBoard__Group__3 ;
    public final void rule__ExtendsBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3505:1: ( rule__ExtendsBoard__Group__2__Impl rule__ExtendsBoard__Group__3 )
            // InternalIoTParser.g:3506:2: rule__ExtendsBoard__Group__2__Impl rule__ExtendsBoard__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ExtendsBoard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group__2"


    // $ANTLR start "rule__ExtendsBoard__Group__2__Impl"
    // InternalIoTParser.g:3513:1: rule__ExtendsBoard__Group__2__Impl : ( ( rule__ExtendsBoard__AbstractBoardAssignment_2 ) ) ;
    public final void rule__ExtendsBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3517:1: ( ( ( rule__ExtendsBoard__AbstractBoardAssignment_2 ) ) )
            // InternalIoTParser.g:3518:1: ( ( rule__ExtendsBoard__AbstractBoardAssignment_2 ) )
            {
            // InternalIoTParser.g:3518:1: ( ( rule__ExtendsBoard__AbstractBoardAssignment_2 ) )
            // InternalIoTParser.g:3519:2: ( rule__ExtendsBoard__AbstractBoardAssignment_2 )
            {
             before(grammarAccess.getExtendsBoardAccess().getAbstractBoardAssignment_2()); 
            // InternalIoTParser.g:3520:2: ( rule__ExtendsBoard__AbstractBoardAssignment_2 )
            // InternalIoTParser.g:3520:3: rule__ExtendsBoard__AbstractBoardAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__AbstractBoardAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExtendsBoardAccess().getAbstractBoardAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group__2__Impl"


    // $ANTLR start "rule__ExtendsBoard__Group__3"
    // InternalIoTParser.g:3528:1: rule__ExtendsBoard__Group__3 : rule__ExtendsBoard__Group__3__Impl ;
    public final void rule__ExtendsBoard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3532:1: ( rule__ExtendsBoard__Group__3__Impl )
            // InternalIoTParser.g:3533:2: rule__ExtendsBoard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group__3"


    // $ANTLR start "rule__ExtendsBoard__Group__3__Impl"
    // InternalIoTParser.g:3539:1: rule__ExtendsBoard__Group__3__Impl : ( ( rule__ExtendsBoard__Group_3__0 )? ) ;
    public final void rule__ExtendsBoard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3543:1: ( ( ( rule__ExtendsBoard__Group_3__0 )? ) )
            // InternalIoTParser.g:3544:1: ( ( rule__ExtendsBoard__Group_3__0 )? )
            {
            // InternalIoTParser.g:3544:1: ( ( rule__ExtendsBoard__Group_3__0 )? )
            // InternalIoTParser.g:3545:2: ( rule__ExtendsBoard__Group_3__0 )?
            {
             before(grammarAccess.getExtendsBoardAccess().getGroup_3()); 
            // InternalIoTParser.g:3546:2: ( rule__ExtendsBoard__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Colon) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalIoTParser.g:3546:3: rule__ExtendsBoard__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendsBoard__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendsBoardAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group__3__Impl"


    // $ANTLR start "rule__ExtendsBoard__Group_3__0"
    // InternalIoTParser.g:3555:1: rule__ExtendsBoard__Group_3__0 : rule__ExtendsBoard__Group_3__0__Impl rule__ExtendsBoard__Group_3__1 ;
    public final void rule__ExtendsBoard__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3559:1: ( rule__ExtendsBoard__Group_3__0__Impl rule__ExtendsBoard__Group_3__1 )
            // InternalIoTParser.g:3560:2: rule__ExtendsBoard__Group_3__0__Impl rule__ExtendsBoard__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ExtendsBoard__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group_3__0"


    // $ANTLR start "rule__ExtendsBoard__Group_3__0__Impl"
    // InternalIoTParser.g:3567:1: rule__ExtendsBoard__Group_3__0__Impl : ( Colon ) ;
    public final void rule__ExtendsBoard__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3571:1: ( ( Colon ) )
            // InternalIoTParser.g:3572:1: ( Colon )
            {
            // InternalIoTParser.g:3572:1: ( Colon )
            // InternalIoTParser.g:3573:2: Colon
            {
             before(grammarAccess.getExtendsBoardAccess().getColonKeyword_3_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExtendsBoardAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group_3__0__Impl"


    // $ANTLR start "rule__ExtendsBoard__Group_3__1"
    // InternalIoTParser.g:3582:1: rule__ExtendsBoard__Group_3__1 : rule__ExtendsBoard__Group_3__1__Impl rule__ExtendsBoard__Group_3__2 ;
    public final void rule__ExtendsBoard__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3586:1: ( rule__ExtendsBoard__Group_3__1__Impl rule__ExtendsBoard__Group_3__2 )
            // InternalIoTParser.g:3587:2: rule__ExtendsBoard__Group_3__1__Impl rule__ExtendsBoard__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__ExtendsBoard__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group_3__1"


    // $ANTLR start "rule__ExtendsBoard__Group_3__1__Impl"
    // InternalIoTParser.g:3594:1: rule__ExtendsBoard__Group_3__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__ExtendsBoard__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3598:1: ( ( RULE_BEGIN ) )
            // InternalIoTParser.g:3599:1: ( RULE_BEGIN )
            {
            // InternalIoTParser.g:3599:1: ( RULE_BEGIN )
            // InternalIoTParser.g:3600:2: RULE_BEGIN
            {
             before(grammarAccess.getExtendsBoardAccess().getBEGINTerminalRuleCall_3_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getExtendsBoardAccess().getBEGINTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group_3__1__Impl"


    // $ANTLR start "rule__ExtendsBoard__Group_3__2"
    // InternalIoTParser.g:3609:1: rule__ExtendsBoard__Group_3__2 : rule__ExtendsBoard__Group_3__2__Impl rule__ExtendsBoard__Group_3__3 ;
    public final void rule__ExtendsBoard__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3613:1: ( rule__ExtendsBoard__Group_3__2__Impl rule__ExtendsBoard__Group_3__3 )
            // InternalIoTParser.g:3614:2: rule__ExtendsBoard__Group_3__2__Impl rule__ExtendsBoard__Group_3__3
            {
            pushFollow(FOLLOW_15);
            rule__ExtendsBoard__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group_3__2"


    // $ANTLR start "rule__ExtendsBoard__Group_3__2__Impl"
    // InternalIoTParser.g:3621:1: rule__ExtendsBoard__Group_3__2__Impl : ( ( ( rule__ExtendsBoard__SensorsAssignment_3_2 ) ) ( ( rule__ExtendsBoard__SensorsAssignment_3_2 )* ) ) ;
    public final void rule__ExtendsBoard__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3625:1: ( ( ( ( rule__ExtendsBoard__SensorsAssignment_3_2 ) ) ( ( rule__ExtendsBoard__SensorsAssignment_3_2 )* ) ) )
            // InternalIoTParser.g:3626:1: ( ( ( rule__ExtendsBoard__SensorsAssignment_3_2 ) ) ( ( rule__ExtendsBoard__SensorsAssignment_3_2 )* ) )
            {
            // InternalIoTParser.g:3626:1: ( ( ( rule__ExtendsBoard__SensorsAssignment_3_2 ) ) ( ( rule__ExtendsBoard__SensorsAssignment_3_2 )* ) )
            // InternalIoTParser.g:3627:2: ( ( rule__ExtendsBoard__SensorsAssignment_3_2 ) ) ( ( rule__ExtendsBoard__SensorsAssignment_3_2 )* )
            {
            // InternalIoTParser.g:3627:2: ( ( rule__ExtendsBoard__SensorsAssignment_3_2 ) )
            // InternalIoTParser.g:3628:3: ( rule__ExtendsBoard__SensorsAssignment_3_2 )
            {
             before(grammarAccess.getExtendsBoardAccess().getSensorsAssignment_3_2()); 
            // InternalIoTParser.g:3629:3: ( rule__ExtendsBoard__SensorsAssignment_3_2 )
            // InternalIoTParser.g:3629:4: rule__ExtendsBoard__SensorsAssignment_3_2
            {
            pushFollow(FOLLOW_31);
            rule__ExtendsBoard__SensorsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExtendsBoardAccess().getSensorsAssignment_3_2()); 

            }

            // InternalIoTParser.g:3632:2: ( ( rule__ExtendsBoard__SensorsAssignment_3_2 )* )
            // InternalIoTParser.g:3633:3: ( rule__ExtendsBoard__SensorsAssignment_3_2 )*
            {
             before(grammarAccess.getExtendsBoardAccess().getSensorsAssignment_3_2()); 
            // InternalIoTParser.g:3634:3: ( rule__ExtendsBoard__SensorsAssignment_3_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Sensor) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalIoTParser.g:3634:4: rule__ExtendsBoard__SensorsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ExtendsBoard__SensorsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getExtendsBoardAccess().getSensorsAssignment_3_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group_3__2__Impl"


    // $ANTLR start "rule__ExtendsBoard__Group_3__3"
    // InternalIoTParser.g:3643:1: rule__ExtendsBoard__Group_3__3 : rule__ExtendsBoard__Group_3__3__Impl ;
    public final void rule__ExtendsBoard__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3647:1: ( rule__ExtendsBoard__Group_3__3__Impl )
            // InternalIoTParser.g:3648:2: rule__ExtendsBoard__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendsBoard__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group_3__3"


    // $ANTLR start "rule__ExtendsBoard__Group_3__3__Impl"
    // InternalIoTParser.g:3654:1: rule__ExtendsBoard__Group_3__3__Impl : ( RULE_END ) ;
    public final void rule__ExtendsBoard__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3658:1: ( ( RULE_END ) )
            // InternalIoTParser.g:3659:1: ( RULE_END )
            {
            // InternalIoTParser.g:3659:1: ( RULE_END )
            // InternalIoTParser.g:3660:2: RULE_END
            {
             before(grammarAccess.getExtendsBoardAccess().getENDTerminalRuleCall_3_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getExtendsBoardAccess().getENDTerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__Group_3__3__Impl"


    // $ANTLR start "rule__AbstractBoard__Group__0"
    // InternalIoTParser.g:3670:1: rule__AbstractBoard__Group__0 : rule__AbstractBoard__Group__0__Impl rule__AbstractBoard__Group__1 ;
    public final void rule__AbstractBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3674:1: ( rule__AbstractBoard__Group__0__Impl rule__AbstractBoard__Group__1 )
            // InternalIoTParser.g:3675:2: rule__AbstractBoard__Group__0__Impl rule__AbstractBoard__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__AbstractBoard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBoard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBoard__Group__0"


    // $ANTLR start "rule__AbstractBoard__Group__0__Impl"
    // InternalIoTParser.g:3682:1: rule__AbstractBoard__Group__0__Impl : ( Abstract ) ;
    public final void rule__AbstractBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3686:1: ( ( Abstract ) )
            // InternalIoTParser.g:3687:1: ( Abstract )
            {
            // InternalIoTParser.g:3687:1: ( Abstract )
            // InternalIoTParser.g:3688:2: Abstract
            {
             before(grammarAccess.getAbstractBoardAccess().getAbstractKeyword_0()); 
            match(input,Abstract,FOLLOW_2); 
             after(grammarAccess.getAbstractBoardAccess().getAbstractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBoard__Group__0__Impl"


    // $ANTLR start "rule__AbstractBoard__Group__1"
    // InternalIoTParser.g:3697:1: rule__AbstractBoard__Group__1 : rule__AbstractBoard__Group__1__Impl rule__AbstractBoard__Group__2 ;
    public final void rule__AbstractBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3701:1: ( rule__AbstractBoard__Group__1__Impl rule__AbstractBoard__Group__2 )
            // InternalIoTParser.g:3702:2: rule__AbstractBoard__Group__1__Impl rule__AbstractBoard__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AbstractBoard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBoard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBoard__Group__1"


    // $ANTLR start "rule__AbstractBoard__Group__1__Impl"
    // InternalIoTParser.g:3709:1: rule__AbstractBoard__Group__1__Impl : ( Board ) ;
    public final void rule__AbstractBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3713:1: ( ( Board ) )
            // InternalIoTParser.g:3714:1: ( Board )
            {
            // InternalIoTParser.g:3714:1: ( Board )
            // InternalIoTParser.g:3715:2: Board
            {
             before(grammarAccess.getAbstractBoardAccess().getBoardKeyword_1()); 
            match(input,Board,FOLLOW_2); 
             after(grammarAccess.getAbstractBoardAccess().getBoardKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBoard__Group__1__Impl"


    // $ANTLR start "rule__AbstractBoard__Group__2"
    // InternalIoTParser.g:3724:1: rule__AbstractBoard__Group__2 : rule__AbstractBoard__Group__2__Impl ;
    public final void rule__AbstractBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3728:1: ( rule__AbstractBoard__Group__2__Impl )
            // InternalIoTParser.g:3729:2: rule__AbstractBoard__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBoard__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBoard__Group__2"


    // $ANTLR start "rule__AbstractBoard__Group__2__Impl"
    // InternalIoTParser.g:3735:1: rule__AbstractBoard__Group__2__Impl : ( ( rule__AbstractBoard__BoardAssignment_2 ) ) ;
    public final void rule__AbstractBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3739:1: ( ( ( rule__AbstractBoard__BoardAssignment_2 ) ) )
            // InternalIoTParser.g:3740:1: ( ( rule__AbstractBoard__BoardAssignment_2 ) )
            {
            // InternalIoTParser.g:3740:1: ( ( rule__AbstractBoard__BoardAssignment_2 ) )
            // InternalIoTParser.g:3741:2: ( rule__AbstractBoard__BoardAssignment_2 )
            {
             before(grammarAccess.getAbstractBoardAccess().getBoardAssignment_2()); 
            // InternalIoTParser.g:3742:2: ( rule__AbstractBoard__BoardAssignment_2 )
            // InternalIoTParser.g:3742:3: rule__AbstractBoard__BoardAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBoard__BoardAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAbstractBoardAccess().getBoardAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBoard__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalIoTParser.g:3751:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3755:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalIoTParser.g:3756:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalIoTParser.g:3763:1: rule__Sensor__Group__0__Impl : ( Sensor ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3767:1: ( ( Sensor ) )
            // InternalIoTParser.g:3768:1: ( Sensor )
            {
            // InternalIoTParser.g:3768:1: ( Sensor )
            // InternalIoTParser.g:3769:2: Sensor
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,Sensor,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalIoTParser.g:3778:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3782:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalIoTParser.g:3783:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalIoTParser.g:3790:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3794:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalIoTParser.g:3795:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalIoTParser.g:3795:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalIoTParser.g:3796:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalIoTParser.g:3797:2: ( rule__Sensor__NameAssignment_1 )
            // InternalIoTParser.g:3797:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalIoTParser.g:3805:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3809:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalIoTParser.g:3810:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalIoTParser.g:3817:1: rule__Sensor__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3821:1: ( ( EqualsSign ) )
            // InternalIoTParser.g:3822:1: ( EqualsSign )
            {
            // InternalIoTParser.g:3822:1: ( EqualsSign )
            // InternalIoTParser.g:3823:2: EqualsSign
            {
             before(grammarAccess.getSensorAccess().getEqualsSignKeyword_2()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalIoTParser.g:3832:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3836:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalIoTParser.g:3837:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalIoTParser.g:3844:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__SensortypeAssignment_3 ) ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3848:1: ( ( ( rule__Sensor__SensortypeAssignment_3 ) ) )
            // InternalIoTParser.g:3849:1: ( ( rule__Sensor__SensortypeAssignment_3 ) )
            {
            // InternalIoTParser.g:3849:1: ( ( rule__Sensor__SensortypeAssignment_3 ) )
            // InternalIoTParser.g:3850:2: ( rule__Sensor__SensortypeAssignment_3 )
            {
             before(grammarAccess.getSensorAccess().getSensortypeAssignment_3()); 
            // InternalIoTParser.g:3851:2: ( rule__Sensor__SensortypeAssignment_3 )
            // InternalIoTParser.g:3851:3: rule__Sensor__SensortypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensortypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensortypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalIoTParser.g:3859:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3863:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalIoTParser.g:3864:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalIoTParser.g:3871:1: rule__Sensor__Group__4__Impl : ( As ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3875:1: ( ( As ) )
            // InternalIoTParser.g:3876:1: ( As )
            {
            // InternalIoTParser.g:3876:1: ( As )
            // InternalIoTParser.g:3877:2: As
            {
             before(grammarAccess.getSensorAccess().getAsKeyword_4()); 
            match(input,As,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getAsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalIoTParser.g:3886:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3890:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalIoTParser.g:3891:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Sensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalIoTParser.g:3898:1: rule__Sensor__Group__5__Impl : ( ( rule__Sensor__VarsAssignment_5 ) ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3902:1: ( ( ( rule__Sensor__VarsAssignment_5 ) ) )
            // InternalIoTParser.g:3903:1: ( ( rule__Sensor__VarsAssignment_5 ) )
            {
            // InternalIoTParser.g:3903:1: ( ( rule__Sensor__VarsAssignment_5 ) )
            // InternalIoTParser.g:3904:2: ( rule__Sensor__VarsAssignment_5 )
            {
             before(grammarAccess.getSensorAccess().getVarsAssignment_5()); 
            // InternalIoTParser.g:3905:2: ( rule__Sensor__VarsAssignment_5 )
            // InternalIoTParser.g:3905:3: rule__Sensor__VarsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__VarsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getVarsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__6"
    // InternalIoTParser.g:3913:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl rule__Sensor__Group__7 ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3917:1: ( rule__Sensor__Group__6__Impl rule__Sensor__Group__7 )
            // InternalIoTParser.g:3918:2: rule__Sensor__Group__6__Impl rule__Sensor__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6"


    // $ANTLR start "rule__Sensor__Group__6__Impl"
    // InternalIoTParser.g:3925:1: rule__Sensor__Group__6__Impl : ( Colon ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3929:1: ( ( Colon ) )
            // InternalIoTParser.g:3930:1: ( Colon )
            {
            // InternalIoTParser.g:3930:1: ( Colon )
            // InternalIoTParser.g:3931:2: Colon
            {
             before(grammarAccess.getSensorAccess().getColonKeyword_6()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6__Impl"


    // $ANTLR start "rule__Sensor__Group__7"
    // InternalIoTParser.g:3940:1: rule__Sensor__Group__7 : rule__Sensor__Group__7__Impl rule__Sensor__Group__8 ;
    public final void rule__Sensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3944:1: ( rule__Sensor__Group__7__Impl rule__Sensor__Group__8 )
            // InternalIoTParser.g:3945:2: rule__Sensor__Group__7__Impl rule__Sensor__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__Sensor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7"


    // $ANTLR start "rule__Sensor__Group__7__Impl"
    // InternalIoTParser.g:3952:1: rule__Sensor__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__Sensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3956:1: ( ( RULE_BEGIN ) )
            // InternalIoTParser.g:3957:1: ( RULE_BEGIN )
            {
            // InternalIoTParser.g:3957:1: ( RULE_BEGIN )
            // InternalIoTParser.g:3958:2: RULE_BEGIN
            {
             before(grammarAccess.getSensorAccess().getBEGINTerminalRuleCall_7()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getBEGINTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7__Impl"


    // $ANTLR start "rule__Sensor__Group__8"
    // InternalIoTParser.g:3967:1: rule__Sensor__Group__8 : rule__Sensor__Group__8__Impl rule__Sensor__Group__9 ;
    public final void rule__Sensor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3971:1: ( rule__Sensor__Group__8__Impl rule__Sensor__Group__9 )
            // InternalIoTParser.g:3972:2: rule__Sensor__Group__8__Impl rule__Sensor__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__Sensor__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__8"


    // $ANTLR start "rule__Sensor__Group__8__Impl"
    // InternalIoTParser.g:3979:1: rule__Sensor__Group__8__Impl : ( ( rule__Sensor__Group_8__0 )? ) ;
    public final void rule__Sensor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3983:1: ( ( ( rule__Sensor__Group_8__0 )? ) )
            // InternalIoTParser.g:3984:1: ( ( rule__Sensor__Group_8__0 )? )
            {
            // InternalIoTParser.g:3984:1: ( ( rule__Sensor__Group_8__0 )? )
            // InternalIoTParser.g:3985:2: ( rule__Sensor__Group_8__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_8()); 
            // InternalIoTParser.g:3986:2: ( rule__Sensor__Group_8__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Sample) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIoTParser.g:3986:3: rule__Sensor__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__8__Impl"


    // $ANTLR start "rule__Sensor__Group__9"
    // InternalIoTParser.g:3994:1: rule__Sensor__Group__9 : rule__Sensor__Group__9__Impl rule__Sensor__Group__10 ;
    public final void rule__Sensor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:3998:1: ( rule__Sensor__Group__9__Impl rule__Sensor__Group__10 )
            // InternalIoTParser.g:3999:2: rule__Sensor__Group__9__Impl rule__Sensor__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Sensor__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__9"


    // $ANTLR start "rule__Sensor__Group__9__Impl"
    // InternalIoTParser.g:4006:1: rule__Sensor__Group__9__Impl : ( ( ( rule__Sensor__OutputAssignment_9 ) ) ( ( rule__Sensor__OutputAssignment_9 )* ) ) ;
    public final void rule__Sensor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4010:1: ( ( ( ( rule__Sensor__OutputAssignment_9 ) ) ( ( rule__Sensor__OutputAssignment_9 )* ) ) )
            // InternalIoTParser.g:4011:1: ( ( ( rule__Sensor__OutputAssignment_9 ) ) ( ( rule__Sensor__OutputAssignment_9 )* ) )
            {
            // InternalIoTParser.g:4011:1: ( ( ( rule__Sensor__OutputAssignment_9 ) ) ( ( rule__Sensor__OutputAssignment_9 )* ) )
            // InternalIoTParser.g:4012:2: ( ( rule__Sensor__OutputAssignment_9 ) ) ( ( rule__Sensor__OutputAssignment_9 )* )
            {
            // InternalIoTParser.g:4012:2: ( ( rule__Sensor__OutputAssignment_9 ) )
            // InternalIoTParser.g:4013:3: ( rule__Sensor__OutputAssignment_9 )
            {
             before(grammarAccess.getSensorAccess().getOutputAssignment_9()); 
            // InternalIoTParser.g:4014:3: ( rule__Sensor__OutputAssignment_9 )
            // InternalIoTParser.g:4014:4: rule__Sensor__OutputAssignment_9
            {
            pushFollow(FOLLOW_38);
            rule__Sensor__OutputAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getOutputAssignment_9()); 

            }

            // InternalIoTParser.g:4017:2: ( ( rule__Sensor__OutputAssignment_9 )* )
            // InternalIoTParser.g:4018:3: ( rule__Sensor__OutputAssignment_9 )*
            {
             before(grammarAccess.getSensorAccess().getOutputAssignment_9()); 
            // InternalIoTParser.g:4019:3: ( rule__Sensor__OutputAssignment_9 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Pipe) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalIoTParser.g:4019:4: rule__Sensor__OutputAssignment_9
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Sensor__OutputAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSensorAccess().getOutputAssignment_9()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__9__Impl"


    // $ANTLR start "rule__Sensor__Group__10"
    // InternalIoTParser.g:4028:1: rule__Sensor__Group__10 : rule__Sensor__Group__10__Impl ;
    public final void rule__Sensor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4032:1: ( rule__Sensor__Group__10__Impl )
            // InternalIoTParser.g:4033:2: rule__Sensor__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__10"


    // $ANTLR start "rule__Sensor__Group__10__Impl"
    // InternalIoTParser.g:4039:1: rule__Sensor__Group__10__Impl : ( RULE_END ) ;
    public final void rule__Sensor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4043:1: ( ( RULE_END ) )
            // InternalIoTParser.g:4044:1: ( RULE_END )
            {
            // InternalIoTParser.g:4044:1: ( RULE_END )
            // InternalIoTParser.g:4045:2: RULE_END
            {
             before(grammarAccess.getSensorAccess().getENDTerminalRuleCall_10()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getENDTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__10__Impl"


    // $ANTLR start "rule__Sensor__Group_8__0"
    // InternalIoTParser.g:4055:1: rule__Sensor__Group_8__0 : rule__Sensor__Group_8__0__Impl rule__Sensor__Group_8__1 ;
    public final void rule__Sensor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4059:1: ( rule__Sensor__Group_8__0__Impl rule__Sensor__Group_8__1 )
            // InternalIoTParser.g:4060:2: rule__Sensor__Group_8__0__Impl rule__Sensor__Group_8__1
            {
            pushFollow(FOLLOW_39);
            rule__Sensor__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_8__0"


    // $ANTLR start "rule__Sensor__Group_8__0__Impl"
    // InternalIoTParser.g:4067:1: rule__Sensor__Group_8__0__Impl : ( Sample ) ;
    public final void rule__Sensor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4071:1: ( ( Sample ) )
            // InternalIoTParser.g:4072:1: ( Sample )
            {
            // InternalIoTParser.g:4072:1: ( Sample )
            // InternalIoTParser.g:4073:2: Sample
            {
             before(grammarAccess.getSensorAccess().getSampleKeyword_8_0()); 
            match(input,Sample,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSampleKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_8__0__Impl"


    // $ANTLR start "rule__Sensor__Group_8__1"
    // InternalIoTParser.g:4082:1: rule__Sensor__Group_8__1 : rule__Sensor__Group_8__1__Impl ;
    public final void rule__Sensor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4086:1: ( rule__Sensor__Group_8__1__Impl )
            // InternalIoTParser.g:4087:2: rule__Sensor__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_8__1"


    // $ANTLR start "rule__Sensor__Group_8__1__Impl"
    // InternalIoTParser.g:4093:1: rule__Sensor__Group_8__1__Impl : ( ( rule__Sensor__SamplerAssignment_8_1 ) ) ;
    public final void rule__Sensor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4097:1: ( ( ( rule__Sensor__SamplerAssignment_8_1 ) ) )
            // InternalIoTParser.g:4098:1: ( ( rule__Sensor__SamplerAssignment_8_1 ) )
            {
            // InternalIoTParser.g:4098:1: ( ( rule__Sensor__SamplerAssignment_8_1 ) )
            // InternalIoTParser.g:4099:2: ( rule__Sensor__SamplerAssignment_8_1 )
            {
             before(grammarAccess.getSensorAccess().getSamplerAssignment_8_1()); 
            // InternalIoTParser.g:4100:2: ( rule__Sensor__SamplerAssignment_8_1 )
            // InternalIoTParser.g:4100:3: rule__Sensor__SamplerAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SamplerAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSamplerAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_8__1__Impl"


    // $ANTLR start "rule__ExternalSensor__Group__0"
    // InternalIoTParser.g:4109:1: rule__ExternalSensor__Group__0 : rule__ExternalSensor__Group__0__Impl rule__ExternalSensor__Group__1 ;
    public final void rule__ExternalSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4113:1: ( rule__ExternalSensor__Group__0__Impl rule__ExternalSensor__Group__1 )
            // InternalIoTParser.g:4114:2: rule__ExternalSensor__Group__0__Impl rule__ExternalSensor__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ExternalSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__0"


    // $ANTLR start "rule__ExternalSensor__Group__0__Impl"
    // InternalIoTParser.g:4121:1: rule__ExternalSensor__Group__0__Impl : ( ( rule__ExternalSensor__SensorAssignment_0 ) ) ;
    public final void rule__ExternalSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4125:1: ( ( ( rule__ExternalSensor__SensorAssignment_0 ) ) )
            // InternalIoTParser.g:4126:1: ( ( rule__ExternalSensor__SensorAssignment_0 ) )
            {
            // InternalIoTParser.g:4126:1: ( ( rule__ExternalSensor__SensorAssignment_0 ) )
            // InternalIoTParser.g:4127:2: ( rule__ExternalSensor__SensorAssignment_0 )
            {
             before(grammarAccess.getExternalSensorAccess().getSensorAssignment_0()); 
            // InternalIoTParser.g:4128:2: ( rule__ExternalSensor__SensorAssignment_0 )
            // InternalIoTParser.g:4128:3: rule__ExternalSensor__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSensor__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalSensorAccess().getSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__0__Impl"


    // $ANTLR start "rule__ExternalSensor__Group__1"
    // InternalIoTParser.g:4136:1: rule__ExternalSensor__Group__1 : rule__ExternalSensor__Group__1__Impl rule__ExternalSensor__Group__2 ;
    public final void rule__ExternalSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4140:1: ( rule__ExternalSensor__Group__1__Impl rule__ExternalSensor__Group__2 )
            // InternalIoTParser.g:4141:2: rule__ExternalSensor__Group__1__Impl rule__ExternalSensor__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ExternalSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__1"


    // $ANTLR start "rule__ExternalSensor__Group__1__Impl"
    // InternalIoTParser.g:4148:1: rule__ExternalSensor__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__ExternalSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4152:1: ( ( LeftParenthesis ) )
            // InternalIoTParser.g:4153:1: ( LeftParenthesis )
            {
            // InternalIoTParser.g:4153:1: ( LeftParenthesis )
            // InternalIoTParser.g:4154:2: LeftParenthesis
            {
             before(grammarAccess.getExternalSensorAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getExternalSensorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__1__Impl"


    // $ANTLR start "rule__ExternalSensor__Group__2"
    // InternalIoTParser.g:4163:1: rule__ExternalSensor__Group__2 : rule__ExternalSensor__Group__2__Impl rule__ExternalSensor__Group__3 ;
    public final void rule__ExternalSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4167:1: ( rule__ExternalSensor__Group__2__Impl rule__ExternalSensor__Group__3 )
            // InternalIoTParser.g:4168:2: rule__ExternalSensor__Group__2__Impl rule__ExternalSensor__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__ExternalSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__2"


    // $ANTLR start "rule__ExternalSensor__Group__2__Impl"
    // InternalIoTParser.g:4175:1: rule__ExternalSensor__Group__2__Impl : ( ( rule__ExternalSensor__PinsAssignment_2 ) ) ;
    public final void rule__ExternalSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4179:1: ( ( ( rule__ExternalSensor__PinsAssignment_2 ) ) )
            // InternalIoTParser.g:4180:1: ( ( rule__ExternalSensor__PinsAssignment_2 ) )
            {
            // InternalIoTParser.g:4180:1: ( ( rule__ExternalSensor__PinsAssignment_2 ) )
            // InternalIoTParser.g:4181:2: ( rule__ExternalSensor__PinsAssignment_2 )
            {
             before(grammarAccess.getExternalSensorAccess().getPinsAssignment_2()); 
            // InternalIoTParser.g:4182:2: ( rule__ExternalSensor__PinsAssignment_2 )
            // InternalIoTParser.g:4182:3: rule__ExternalSensor__PinsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSensor__PinsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalSensorAccess().getPinsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__2__Impl"


    // $ANTLR start "rule__ExternalSensor__Group__3"
    // InternalIoTParser.g:4190:1: rule__ExternalSensor__Group__3 : rule__ExternalSensor__Group__3__Impl rule__ExternalSensor__Group__4 ;
    public final void rule__ExternalSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4194:1: ( rule__ExternalSensor__Group__3__Impl rule__ExternalSensor__Group__4 )
            // InternalIoTParser.g:4195:2: rule__ExternalSensor__Group__3__Impl rule__ExternalSensor__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__ExternalSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__3"


    // $ANTLR start "rule__ExternalSensor__Group__3__Impl"
    // InternalIoTParser.g:4202:1: rule__ExternalSensor__Group__3__Impl : ( ( rule__ExternalSensor__Group_3__0 )* ) ;
    public final void rule__ExternalSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4206:1: ( ( ( rule__ExternalSensor__Group_3__0 )* ) )
            // InternalIoTParser.g:4207:1: ( ( rule__ExternalSensor__Group_3__0 )* )
            {
            // InternalIoTParser.g:4207:1: ( ( rule__ExternalSensor__Group_3__0 )* )
            // InternalIoTParser.g:4208:2: ( rule__ExternalSensor__Group_3__0 )*
            {
             before(grammarAccess.getExternalSensorAccess().getGroup_3()); 
            // InternalIoTParser.g:4209:2: ( rule__ExternalSensor__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalIoTParser.g:4209:3: rule__ExternalSensor__Group_3__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__ExternalSensor__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getExternalSensorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__3__Impl"


    // $ANTLR start "rule__ExternalSensor__Group__4"
    // InternalIoTParser.g:4217:1: rule__ExternalSensor__Group__4 : rule__ExternalSensor__Group__4__Impl ;
    public final void rule__ExternalSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4221:1: ( rule__ExternalSensor__Group__4__Impl )
            // InternalIoTParser.g:4222:2: rule__ExternalSensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSensor__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__4"


    // $ANTLR start "rule__ExternalSensor__Group__4__Impl"
    // InternalIoTParser.g:4228:1: rule__ExternalSensor__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__ExternalSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4232:1: ( ( RightParenthesis ) )
            // InternalIoTParser.g:4233:1: ( RightParenthesis )
            {
            // InternalIoTParser.g:4233:1: ( RightParenthesis )
            // InternalIoTParser.g:4234:2: RightParenthesis
            {
             before(grammarAccess.getExternalSensorAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getExternalSensorAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group__4__Impl"


    // $ANTLR start "rule__ExternalSensor__Group_3__0"
    // InternalIoTParser.g:4244:1: rule__ExternalSensor__Group_3__0 : rule__ExternalSensor__Group_3__0__Impl rule__ExternalSensor__Group_3__1 ;
    public final void rule__ExternalSensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4248:1: ( rule__ExternalSensor__Group_3__0__Impl rule__ExternalSensor__Group_3__1 )
            // InternalIoTParser.g:4249:2: rule__ExternalSensor__Group_3__0__Impl rule__ExternalSensor__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__ExternalSensor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSensor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group_3__0"


    // $ANTLR start "rule__ExternalSensor__Group_3__0__Impl"
    // InternalIoTParser.g:4256:1: rule__ExternalSensor__Group_3__0__Impl : ( Comma ) ;
    public final void rule__ExternalSensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4260:1: ( ( Comma ) )
            // InternalIoTParser.g:4261:1: ( Comma )
            {
            // InternalIoTParser.g:4261:1: ( Comma )
            // InternalIoTParser.g:4262:2: Comma
            {
             before(grammarAccess.getExternalSensorAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalSensorAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group_3__0__Impl"


    // $ANTLR start "rule__ExternalSensor__Group_3__1"
    // InternalIoTParser.g:4271:1: rule__ExternalSensor__Group_3__1 : rule__ExternalSensor__Group_3__1__Impl ;
    public final void rule__ExternalSensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4275:1: ( rule__ExternalSensor__Group_3__1__Impl )
            // InternalIoTParser.g:4276:2: rule__ExternalSensor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSensor__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group_3__1"


    // $ANTLR start "rule__ExternalSensor__Group_3__1__Impl"
    // InternalIoTParser.g:4282:1: rule__ExternalSensor__Group_3__1__Impl : ( ( rule__ExternalSensor__PinsAssignment_3_1 ) ) ;
    public final void rule__ExternalSensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4286:1: ( ( ( rule__ExternalSensor__PinsAssignment_3_1 ) ) )
            // InternalIoTParser.g:4287:1: ( ( rule__ExternalSensor__PinsAssignment_3_1 ) )
            {
            // InternalIoTParser.g:4287:1: ( ( rule__ExternalSensor__PinsAssignment_3_1 ) )
            // InternalIoTParser.g:4288:2: ( rule__ExternalSensor__PinsAssignment_3_1 )
            {
             before(grammarAccess.getExternalSensorAccess().getPinsAssignment_3_1()); 
            // InternalIoTParser.g:4289:2: ( rule__ExternalSensor__PinsAssignment_3_1 )
            // InternalIoTParser.g:4289:3: rule__ExternalSensor__PinsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSensor__PinsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSensorAccess().getPinsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__Group_3__1__Impl"


    // $ANTLR start "rule__SensorVariables__Group__0"
    // InternalIoTParser.g:4298:1: rule__SensorVariables__Group__0 : rule__SensorVariables__Group__0__Impl rule__SensorVariables__Group__1 ;
    public final void rule__SensorVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4302:1: ( rule__SensorVariables__Group__0__Impl rule__SensorVariables__Group__1 )
            // InternalIoTParser.g:4303:2: rule__SensorVariables__Group__0__Impl rule__SensorVariables__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__SensorVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorVariables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__0"


    // $ANTLR start "rule__SensorVariables__Group__0__Impl"
    // InternalIoTParser.g:4310:1: rule__SensorVariables__Group__0__Impl : ( ( rule__SensorVariables__NameAssignment_0 ) ) ;
    public final void rule__SensorVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4314:1: ( ( ( rule__SensorVariables__NameAssignment_0 ) ) )
            // InternalIoTParser.g:4315:1: ( ( rule__SensorVariables__NameAssignment_0 ) )
            {
            // InternalIoTParser.g:4315:1: ( ( rule__SensorVariables__NameAssignment_0 ) )
            // InternalIoTParser.g:4316:2: ( rule__SensorVariables__NameAssignment_0 )
            {
             before(grammarAccess.getSensorVariablesAccess().getNameAssignment_0()); 
            // InternalIoTParser.g:4317:2: ( rule__SensorVariables__NameAssignment_0 )
            // InternalIoTParser.g:4317:3: rule__SensorVariables__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SensorVariables__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorVariablesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__0__Impl"


    // $ANTLR start "rule__SensorVariables__Group__1"
    // InternalIoTParser.g:4325:1: rule__SensorVariables__Group__1 : rule__SensorVariables__Group__1__Impl rule__SensorVariables__Group__2 ;
    public final void rule__SensorVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4329:1: ( rule__SensorVariables__Group__1__Impl rule__SensorVariables__Group__2 )
            // InternalIoTParser.g:4330:2: rule__SensorVariables__Group__1__Impl rule__SensorVariables__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SensorVariables__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorVariables__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__1"


    // $ANTLR start "rule__SensorVariables__Group__1__Impl"
    // InternalIoTParser.g:4337:1: rule__SensorVariables__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__SensorVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4341:1: ( ( LeftParenthesis ) )
            // InternalIoTParser.g:4342:1: ( LeftParenthesis )
            {
            // InternalIoTParser.g:4342:1: ( LeftParenthesis )
            // InternalIoTParser.g:4343:2: LeftParenthesis
            {
             before(grammarAccess.getSensorVariablesAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getSensorVariablesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__1__Impl"


    // $ANTLR start "rule__SensorVariables__Group__2"
    // InternalIoTParser.g:4352:1: rule__SensorVariables__Group__2 : rule__SensorVariables__Group__2__Impl rule__SensorVariables__Group__3 ;
    public final void rule__SensorVariables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4356:1: ( rule__SensorVariables__Group__2__Impl rule__SensorVariables__Group__3 )
            // InternalIoTParser.g:4357:2: rule__SensorVariables__Group__2__Impl rule__SensorVariables__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__SensorVariables__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorVariables__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__2"


    // $ANTLR start "rule__SensorVariables__Group__2__Impl"
    // InternalIoTParser.g:4364:1: rule__SensorVariables__Group__2__Impl : ( ( rule__SensorVariables__IdsAssignment_2 ) ) ;
    public final void rule__SensorVariables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4368:1: ( ( ( rule__SensorVariables__IdsAssignment_2 ) ) )
            // InternalIoTParser.g:4369:1: ( ( rule__SensorVariables__IdsAssignment_2 ) )
            {
            // InternalIoTParser.g:4369:1: ( ( rule__SensorVariables__IdsAssignment_2 ) )
            // InternalIoTParser.g:4370:2: ( rule__SensorVariables__IdsAssignment_2 )
            {
             before(grammarAccess.getSensorVariablesAccess().getIdsAssignment_2()); 
            // InternalIoTParser.g:4371:2: ( rule__SensorVariables__IdsAssignment_2 )
            // InternalIoTParser.g:4371:3: rule__SensorVariables__IdsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SensorVariables__IdsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorVariablesAccess().getIdsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__2__Impl"


    // $ANTLR start "rule__SensorVariables__Group__3"
    // InternalIoTParser.g:4379:1: rule__SensorVariables__Group__3 : rule__SensorVariables__Group__3__Impl rule__SensorVariables__Group__4 ;
    public final void rule__SensorVariables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4383:1: ( rule__SensorVariables__Group__3__Impl rule__SensorVariables__Group__4 )
            // InternalIoTParser.g:4384:2: rule__SensorVariables__Group__3__Impl rule__SensorVariables__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__SensorVariables__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorVariables__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__3"


    // $ANTLR start "rule__SensorVariables__Group__3__Impl"
    // InternalIoTParser.g:4391:1: rule__SensorVariables__Group__3__Impl : ( ( rule__SensorVariables__Group_3__0 )* ) ;
    public final void rule__SensorVariables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4395:1: ( ( ( rule__SensorVariables__Group_3__0 )* ) )
            // InternalIoTParser.g:4396:1: ( ( rule__SensorVariables__Group_3__0 )* )
            {
            // InternalIoTParser.g:4396:1: ( ( rule__SensorVariables__Group_3__0 )* )
            // InternalIoTParser.g:4397:2: ( rule__SensorVariables__Group_3__0 )*
            {
             before(grammarAccess.getSensorVariablesAccess().getGroup_3()); 
            // InternalIoTParser.g:4398:2: ( rule__SensorVariables__Group_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Comma) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalIoTParser.g:4398:3: rule__SensorVariables__Group_3__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__SensorVariables__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSensorVariablesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__3__Impl"


    // $ANTLR start "rule__SensorVariables__Group__4"
    // InternalIoTParser.g:4406:1: rule__SensorVariables__Group__4 : rule__SensorVariables__Group__4__Impl ;
    public final void rule__SensorVariables__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4410:1: ( rule__SensorVariables__Group__4__Impl )
            // InternalIoTParser.g:4411:2: rule__SensorVariables__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorVariables__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__4"


    // $ANTLR start "rule__SensorVariables__Group__4__Impl"
    // InternalIoTParser.g:4417:1: rule__SensorVariables__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__SensorVariables__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4421:1: ( ( RightParenthesis ) )
            // InternalIoTParser.g:4422:1: ( RightParenthesis )
            {
            // InternalIoTParser.g:4422:1: ( RightParenthesis )
            // InternalIoTParser.g:4423:2: RightParenthesis
            {
             before(grammarAccess.getSensorVariablesAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getSensorVariablesAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group__4__Impl"


    // $ANTLR start "rule__SensorVariables__Group_3__0"
    // InternalIoTParser.g:4433:1: rule__SensorVariables__Group_3__0 : rule__SensorVariables__Group_3__0__Impl rule__SensorVariables__Group_3__1 ;
    public final void rule__SensorVariables__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4437:1: ( rule__SensorVariables__Group_3__0__Impl rule__SensorVariables__Group_3__1 )
            // InternalIoTParser.g:4438:2: rule__SensorVariables__Group_3__0__Impl rule__SensorVariables__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__SensorVariables__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorVariables__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group_3__0"


    // $ANTLR start "rule__SensorVariables__Group_3__0__Impl"
    // InternalIoTParser.g:4445:1: rule__SensorVariables__Group_3__0__Impl : ( Comma ) ;
    public final void rule__SensorVariables__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4449:1: ( ( Comma ) )
            // InternalIoTParser.g:4450:1: ( Comma )
            {
            // InternalIoTParser.g:4450:1: ( Comma )
            // InternalIoTParser.g:4451:2: Comma
            {
             before(grammarAccess.getSensorVariablesAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getSensorVariablesAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group_3__0__Impl"


    // $ANTLR start "rule__SensorVariables__Group_3__1"
    // InternalIoTParser.g:4460:1: rule__SensorVariables__Group_3__1 : rule__SensorVariables__Group_3__1__Impl ;
    public final void rule__SensorVariables__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4464:1: ( rule__SensorVariables__Group_3__1__Impl )
            // InternalIoTParser.g:4465:2: rule__SensorVariables__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorVariables__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group_3__1"


    // $ANTLR start "rule__SensorVariables__Group_3__1__Impl"
    // InternalIoTParser.g:4471:1: rule__SensorVariables__Group_3__1__Impl : ( ( rule__SensorVariables__IdsAssignment_3_1 ) ) ;
    public final void rule__SensorVariables__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4475:1: ( ( ( rule__SensorVariables__IdsAssignment_3_1 ) ) )
            // InternalIoTParser.g:4476:1: ( ( rule__SensorVariables__IdsAssignment_3_1 ) )
            {
            // InternalIoTParser.g:4476:1: ( ( rule__SensorVariables__IdsAssignment_3_1 ) )
            // InternalIoTParser.g:4477:2: ( rule__SensorVariables__IdsAssignment_3_1 )
            {
             before(grammarAccess.getSensorVariablesAccess().getIdsAssignment_3_1()); 
            // InternalIoTParser.g:4478:2: ( rule__SensorVariables__IdsAssignment_3_1 )
            // InternalIoTParser.g:4478:3: rule__SensorVariables__IdsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorVariables__IdsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorVariablesAccess().getIdsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__Group_3__1__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // InternalIoTParser.g:4487:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4491:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalIoTParser.g:4492:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // InternalIoTParser.g:4499:1: rule__Command__Group__0__Impl : ( Command ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4503:1: ( ( Command ) )
            // InternalIoTParser.g:4504:1: ( Command )
            {
            // InternalIoTParser.g:4504:1: ( Command )
            // InternalIoTParser.g:4505:2: Command
            {
             before(grammarAccess.getCommandAccess().getCommandKeyword_0()); 
            match(input,Command,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCommandKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // InternalIoTParser.g:4514:1: rule__Command__Group__1 : rule__Command__Group__1__Impl ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4518:1: ( rule__Command__Group__1__Impl )
            // InternalIoTParser.g:4519:2: rule__Command__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // InternalIoTParser.g:4525:1: rule__Command__Group__1__Impl : ( ( rule__Command__CommandAssignment_1 ) ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4529:1: ( ( ( rule__Command__CommandAssignment_1 ) ) )
            // InternalIoTParser.g:4530:1: ( ( rule__Command__CommandAssignment_1 ) )
            {
            // InternalIoTParser.g:4530:1: ( ( rule__Command__CommandAssignment_1 ) )
            // InternalIoTParser.g:4531:2: ( rule__Command__CommandAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getCommandAssignment_1()); 
            // InternalIoTParser.g:4532:2: ( rule__Command__CommandAssignment_1 )
            // InternalIoTParser.g:4532:3: rule__Command__CommandAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__CommandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getCommandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Frequency__Group__0"
    // InternalIoTParser.g:4541:1: rule__Frequency__Group__0 : rule__Frequency__Group__0__Impl rule__Frequency__Group__1 ;
    public final void rule__Frequency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4545:1: ( rule__Frequency__Group__0__Impl rule__Frequency__Group__1 )
            // InternalIoTParser.g:4546:2: rule__Frequency__Group__0__Impl rule__Frequency__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Frequency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frequency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group__0"


    // $ANTLR start "rule__Frequency__Group__0__Impl"
    // InternalIoTParser.g:4553:1: rule__Frequency__Group__0__Impl : ( Frequency ) ;
    public final void rule__Frequency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4557:1: ( ( Frequency ) )
            // InternalIoTParser.g:4558:1: ( Frequency )
            {
            // InternalIoTParser.g:4558:1: ( Frequency )
            // InternalIoTParser.g:4559:2: Frequency
            {
             before(grammarAccess.getFrequencyAccess().getFrequencyKeyword_0()); 
            match(input,Frequency,FOLLOW_2); 
             after(grammarAccess.getFrequencyAccess().getFrequencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group__0__Impl"


    // $ANTLR start "rule__Frequency__Group__1"
    // InternalIoTParser.g:4568:1: rule__Frequency__Group__1 : rule__Frequency__Group__1__Impl rule__Frequency__Group__2 ;
    public final void rule__Frequency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4572:1: ( rule__Frequency__Group__1__Impl rule__Frequency__Group__2 )
            // InternalIoTParser.g:4573:2: rule__Frequency__Group__1__Impl rule__Frequency__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Frequency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frequency__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group__1"


    // $ANTLR start "rule__Frequency__Group__1__Impl"
    // InternalIoTParser.g:4580:1: rule__Frequency__Group__1__Impl : ( ( rule__Frequency__FrequencyAssignment_1 ) ) ;
    public final void rule__Frequency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4584:1: ( ( ( rule__Frequency__FrequencyAssignment_1 ) ) )
            // InternalIoTParser.g:4585:1: ( ( rule__Frequency__FrequencyAssignment_1 ) )
            {
            // InternalIoTParser.g:4585:1: ( ( rule__Frequency__FrequencyAssignment_1 ) )
            // InternalIoTParser.g:4586:2: ( rule__Frequency__FrequencyAssignment_1 )
            {
             before(grammarAccess.getFrequencyAccess().getFrequencyAssignment_1()); 
            // InternalIoTParser.g:4587:2: ( rule__Frequency__FrequencyAssignment_1 )
            // InternalIoTParser.g:4587:3: rule__Frequency__FrequencyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__FrequencyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getFrequencyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group__1__Impl"


    // $ANTLR start "rule__Frequency__Group__2"
    // InternalIoTParser.g:4595:1: rule__Frequency__Group__2 : rule__Frequency__Group__2__Impl ;
    public final void rule__Frequency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4599:1: ( rule__Frequency__Group__2__Impl )
            // InternalIoTParser.g:4600:2: rule__Frequency__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group__2"


    // $ANTLR start "rule__Frequency__Group__2__Impl"
    // InternalIoTParser.g:4606:1: rule__Frequency__Group__2__Impl : ( ( rule__Frequency__ResolutionAssignment_2 ) ) ;
    public final void rule__Frequency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4610:1: ( ( ( rule__Frequency__ResolutionAssignment_2 ) ) )
            // InternalIoTParser.g:4611:1: ( ( rule__Frequency__ResolutionAssignment_2 ) )
            {
            // InternalIoTParser.g:4611:1: ( ( rule__Frequency__ResolutionAssignment_2 ) )
            // InternalIoTParser.g:4612:2: ( rule__Frequency__ResolutionAssignment_2 )
            {
             before(grammarAccess.getFrequencyAccess().getResolutionAssignment_2()); 
            // InternalIoTParser.g:4613:2: ( rule__Frequency__ResolutionAssignment_2 )
            // InternalIoTParser.g:4613:3: rule__Frequency__ResolutionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__ResolutionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getResolutionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group__2__Impl"


    // $ANTLR start "rule__Resolution__Group_0__0"
    // InternalIoTParser.g:4622:1: rule__Resolution__Group_0__0 : rule__Resolution__Group_0__0__Impl rule__Resolution__Group_0__1 ;
    public final void rule__Resolution__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4626:1: ( rule__Resolution__Group_0__0__Impl rule__Resolution__Group_0__1 )
            // InternalIoTParser.g:4627:2: rule__Resolution__Group_0__0__Impl rule__Resolution__Group_0__1
            {
            pushFollow(FOLLOW_43);
            rule__Resolution__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resolution__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_0__0"


    // $ANTLR start "rule__Resolution__Group_0__0__Impl"
    // InternalIoTParser.g:4634:1: rule__Resolution__Group_0__0__Impl : ( () ) ;
    public final void rule__Resolution__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4638:1: ( ( () ) )
            // InternalIoTParser.g:4639:1: ( () )
            {
            // InternalIoTParser.g:4639:1: ( () )
            // InternalIoTParser.g:4640:2: ()
            {
             before(grammarAccess.getResolutionAccess().getSecondsAction_0_0()); 
            // InternalIoTParser.g:4641:2: ()
            // InternalIoTParser.g:4641:3: 
            {
            }

             after(grammarAccess.getResolutionAccess().getSecondsAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_0__0__Impl"


    // $ANTLR start "rule__Resolution__Group_0__1"
    // InternalIoTParser.g:4649:1: rule__Resolution__Group_0__1 : rule__Resolution__Group_0__1__Impl ;
    public final void rule__Resolution__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4653:1: ( rule__Resolution__Group_0__1__Impl )
            // InternalIoTParser.g:4654:2: rule__Resolution__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resolution__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_0__1"


    // $ANTLR start "rule__Resolution__Group_0__1__Impl"
    // InternalIoTParser.g:4660:1: rule__Resolution__Group_0__1__Impl : ( Seconds ) ;
    public final void rule__Resolution__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4664:1: ( ( Seconds ) )
            // InternalIoTParser.g:4665:1: ( Seconds )
            {
            // InternalIoTParser.g:4665:1: ( Seconds )
            // InternalIoTParser.g:4666:2: Seconds
            {
             before(grammarAccess.getResolutionAccess().getSecondsKeyword_0_1()); 
            match(input,Seconds,FOLLOW_2); 
             after(grammarAccess.getResolutionAccess().getSecondsKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_0__1__Impl"


    // $ANTLR start "rule__Resolution__Group_1__0"
    // InternalIoTParser.g:4676:1: rule__Resolution__Group_1__0 : rule__Resolution__Group_1__0__Impl rule__Resolution__Group_1__1 ;
    public final void rule__Resolution__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4680:1: ( rule__Resolution__Group_1__0__Impl rule__Resolution__Group_1__1 )
            // InternalIoTParser.g:4681:2: rule__Resolution__Group_1__0__Impl rule__Resolution__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__Resolution__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resolution__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_1__0"


    // $ANTLR start "rule__Resolution__Group_1__0__Impl"
    // InternalIoTParser.g:4688:1: rule__Resolution__Group_1__0__Impl : ( () ) ;
    public final void rule__Resolution__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4692:1: ( ( () ) )
            // InternalIoTParser.g:4693:1: ( () )
            {
            // InternalIoTParser.g:4693:1: ( () )
            // InternalIoTParser.g:4694:2: ()
            {
             before(grammarAccess.getResolutionAccess().getMillisAction_1_0()); 
            // InternalIoTParser.g:4695:2: ()
            // InternalIoTParser.g:4695:3: 
            {
            }

             after(grammarAccess.getResolutionAccess().getMillisAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_1__0__Impl"


    // $ANTLR start "rule__Resolution__Group_1__1"
    // InternalIoTParser.g:4703:1: rule__Resolution__Group_1__1 : rule__Resolution__Group_1__1__Impl ;
    public final void rule__Resolution__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4707:1: ( rule__Resolution__Group_1__1__Impl )
            // InternalIoTParser.g:4708:2: rule__Resolution__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resolution__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_1__1"


    // $ANTLR start "rule__Resolution__Group_1__1__Impl"
    // InternalIoTParser.g:4714:1: rule__Resolution__Group_1__1__Impl : ( Milliseconds ) ;
    public final void rule__Resolution__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4718:1: ( ( Milliseconds ) )
            // InternalIoTParser.g:4719:1: ( Milliseconds )
            {
            // InternalIoTParser.g:4719:1: ( Milliseconds )
            // InternalIoTParser.g:4720:2: Milliseconds
            {
             before(grammarAccess.getResolutionAccess().getMillisecondsKeyword_1_1()); 
            match(input,Milliseconds,FOLLOW_2); 
             after(grammarAccess.getResolutionAccess().getMillisecondsKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_1__1__Impl"


    // $ANTLR start "rule__Resolution__Group_2__0"
    // InternalIoTParser.g:4730:1: rule__Resolution__Group_2__0 : rule__Resolution__Group_2__0__Impl rule__Resolution__Group_2__1 ;
    public final void rule__Resolution__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4734:1: ( rule__Resolution__Group_2__0__Impl rule__Resolution__Group_2__1 )
            // InternalIoTParser.g:4735:2: rule__Resolution__Group_2__0__Impl rule__Resolution__Group_2__1
            {
            pushFollow(FOLLOW_42);
            rule__Resolution__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resolution__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_2__0"


    // $ANTLR start "rule__Resolution__Group_2__0__Impl"
    // InternalIoTParser.g:4742:1: rule__Resolution__Group_2__0__Impl : ( () ) ;
    public final void rule__Resolution__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4746:1: ( ( () ) )
            // InternalIoTParser.g:4747:1: ( () )
            {
            // InternalIoTParser.g:4747:1: ( () )
            // InternalIoTParser.g:4748:2: ()
            {
             before(grammarAccess.getResolutionAccess().getMicrosAction_2_0()); 
            // InternalIoTParser.g:4749:2: ()
            // InternalIoTParser.g:4749:3: 
            {
            }

             after(grammarAccess.getResolutionAccess().getMicrosAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_2__0__Impl"


    // $ANTLR start "rule__Resolution__Group_2__1"
    // InternalIoTParser.g:4757:1: rule__Resolution__Group_2__1 : rule__Resolution__Group_2__1__Impl ;
    public final void rule__Resolution__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4761:1: ( rule__Resolution__Group_2__1__Impl )
            // InternalIoTParser.g:4762:2: rule__Resolution__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resolution__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_2__1"


    // $ANTLR start "rule__Resolution__Group_2__1__Impl"
    // InternalIoTParser.g:4768:1: rule__Resolution__Group_2__1__Impl : ( Microseconds ) ;
    public final void rule__Resolution__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4772:1: ( ( Microseconds ) )
            // InternalIoTParser.g:4773:1: ( Microseconds )
            {
            // InternalIoTParser.g:4773:1: ( Microseconds )
            // InternalIoTParser.g:4774:2: Microseconds
            {
             before(grammarAccess.getResolutionAccess().getMicrosecondsKeyword_2_1()); 
            match(input,Microseconds,FOLLOW_2); 
             after(grammarAccess.getResolutionAccess().getMicrosecondsKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resolution__Group_2__1__Impl"


    // $ANTLR start "rule__SensorOutput__Group__0"
    // InternalIoTParser.g:4784:1: rule__SensorOutput__Group__0 : rule__SensorOutput__Group__0__Impl rule__SensorOutput__Group__1 ;
    public final void rule__SensorOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4788:1: ( rule__SensorOutput__Group__0__Impl rule__SensorOutput__Group__1 )
            // InternalIoTParser.g:4789:2: rule__SensorOutput__Group__0__Impl rule__SensorOutput__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SensorOutput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorOutput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__Group__0"


    // $ANTLR start "rule__SensorOutput__Group__0__Impl"
    // InternalIoTParser.g:4796:1: rule__SensorOutput__Group__0__Impl : ( Pipe ) ;
    public final void rule__SensorOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4800:1: ( ( Pipe ) )
            // InternalIoTParser.g:4801:1: ( Pipe )
            {
            // InternalIoTParser.g:4801:1: ( Pipe )
            // InternalIoTParser.g:4802:2: Pipe
            {
             before(grammarAccess.getSensorOutputAccess().getPipeKeyword_0()); 
            match(input,Pipe,FOLLOW_2); 
             after(grammarAccess.getSensorOutputAccess().getPipeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__Group__0__Impl"


    // $ANTLR start "rule__SensorOutput__Group__1"
    // InternalIoTParser.g:4811:1: rule__SensorOutput__Group__1 : rule__SensorOutput__Group__1__Impl rule__SensorOutput__Group__2 ;
    public final void rule__SensorOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4815:1: ( rule__SensorOutput__Group__1__Impl rule__SensorOutput__Group__2 )
            // InternalIoTParser.g:4816:2: rule__SensorOutput__Group__1__Impl rule__SensorOutput__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__SensorOutput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorOutput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__Group__1"


    // $ANTLR start "rule__SensorOutput__Group__1__Impl"
    // InternalIoTParser.g:4823:1: rule__SensorOutput__Group__1__Impl : ( ( rule__SensorOutput__OutputAssignment_1 ) ) ;
    public final void rule__SensorOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4827:1: ( ( ( rule__SensorOutput__OutputAssignment_1 ) ) )
            // InternalIoTParser.g:4828:1: ( ( rule__SensorOutput__OutputAssignment_1 ) )
            {
            // InternalIoTParser.g:4828:1: ( ( rule__SensorOutput__OutputAssignment_1 ) )
            // InternalIoTParser.g:4829:2: ( rule__SensorOutput__OutputAssignment_1 )
            {
             before(grammarAccess.getSensorOutputAccess().getOutputAssignment_1()); 
            // InternalIoTParser.g:4830:2: ( rule__SensorOutput__OutputAssignment_1 )
            // InternalIoTParser.g:4830:3: rule__SensorOutput__OutputAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorOutput__OutputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorOutputAccess().getOutputAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__Group__1__Impl"


    // $ANTLR start "rule__SensorOutput__Group__2"
    // InternalIoTParser.g:4838:1: rule__SensorOutput__Group__2 : rule__SensorOutput__Group__2__Impl rule__SensorOutput__Group__3 ;
    public final void rule__SensorOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4842:1: ( rule__SensorOutput__Group__2__Impl rule__SensorOutput__Group__3 )
            // InternalIoTParser.g:4843:2: rule__SensorOutput__Group__2__Impl rule__SensorOutput__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SensorOutput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorOutput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__Group__2"


    // $ANTLR start "rule__SensorOutput__Group__2__Impl"
    // InternalIoTParser.g:4850:1: rule__SensorOutput__Group__2__Impl : ( HyphenMinusGreaterThanSign ) ;
    public final void rule__SensorOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4854:1: ( ( HyphenMinusGreaterThanSign ) )
            // InternalIoTParser.g:4855:1: ( HyphenMinusGreaterThanSign )
            {
            // InternalIoTParser.g:4855:1: ( HyphenMinusGreaterThanSign )
            // InternalIoTParser.g:4856:2: HyphenMinusGreaterThanSign
            {
             before(grammarAccess.getSensorOutputAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
             after(grammarAccess.getSensorOutputAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__Group__2__Impl"


    // $ANTLR start "rule__SensorOutput__Group__3"
    // InternalIoTParser.g:4865:1: rule__SensorOutput__Group__3 : rule__SensorOutput__Group__3__Impl ;
    public final void rule__SensorOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4869:1: ( rule__SensorOutput__Group__3__Impl )
            // InternalIoTParser.g:4870:2: rule__SensorOutput__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorOutput__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__Group__3"


    // $ANTLR start "rule__SensorOutput__Group__3__Impl"
    // InternalIoTParser.g:4876:1: rule__SensorOutput__Group__3__Impl : ( ( rule__SensorOutput__ChannelAssignment_3 ) ) ;
    public final void rule__SensorOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4880:1: ( ( ( rule__SensorOutput__ChannelAssignment_3 ) ) )
            // InternalIoTParser.g:4881:1: ( ( rule__SensorOutput__ChannelAssignment_3 ) )
            {
            // InternalIoTParser.g:4881:1: ( ( rule__SensorOutput__ChannelAssignment_3 ) )
            // InternalIoTParser.g:4882:2: ( rule__SensorOutput__ChannelAssignment_3 )
            {
             before(grammarAccess.getSensorOutputAccess().getChannelAssignment_3()); 
            // InternalIoTParser.g:4883:2: ( rule__SensorOutput__ChannelAssignment_3 )
            // InternalIoTParser.g:4883:3: rule__SensorOutput__ChannelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SensorOutput__ChannelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorOutputAccess().getChannelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__Group__3__Impl"


    // $ANTLR start "rule__DataOutput__Group__0"
    // InternalIoTParser.g:4892:1: rule__DataOutput__Group__0 : rule__DataOutput__Group__0__Impl rule__DataOutput__Group__1 ;
    public final void rule__DataOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4896:1: ( rule__DataOutput__Group__0__Impl rule__DataOutput__Group__1 )
            // InternalIoTParser.g:4897:2: rule__DataOutput__Group__0__Impl rule__DataOutput__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DataOutput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOutput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOutput__Group__0"


    // $ANTLR start "rule__DataOutput__Group__0__Impl"
    // InternalIoTParser.g:4904:1: rule__DataOutput__Group__0__Impl : ( ( rule__DataOutput__SensorvarAssignment_0 ) ) ;
    public final void rule__DataOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4908:1: ( ( ( rule__DataOutput__SensorvarAssignment_0 ) ) )
            // InternalIoTParser.g:4909:1: ( ( rule__DataOutput__SensorvarAssignment_0 ) )
            {
            // InternalIoTParser.g:4909:1: ( ( rule__DataOutput__SensorvarAssignment_0 ) )
            // InternalIoTParser.g:4910:2: ( rule__DataOutput__SensorvarAssignment_0 )
            {
             before(grammarAccess.getDataOutputAccess().getSensorvarAssignment_0()); 
            // InternalIoTParser.g:4911:2: ( rule__DataOutput__SensorvarAssignment_0 )
            // InternalIoTParser.g:4911:3: rule__DataOutput__SensorvarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataOutput__SensorvarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataOutputAccess().getSensorvarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOutput__Group__0__Impl"


    // $ANTLR start "rule__DataOutput__Group__1"
    // InternalIoTParser.g:4919:1: rule__DataOutput__Group__1 : rule__DataOutput__Group__1__Impl ;
    public final void rule__DataOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4923:1: ( rule__DataOutput__Group__1__Impl )
            // InternalIoTParser.g:4924:2: rule__DataOutput__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOutput__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOutput__Group__1"


    // $ANTLR start "rule__DataOutput__Group__1__Impl"
    // InternalIoTParser.g:4930:1: rule__DataOutput__Group__1__Impl : ( ( rule__DataOutput__PipelineAssignment_1 )? ) ;
    public final void rule__DataOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4934:1: ( ( ( rule__DataOutput__PipelineAssignment_1 )? ) )
            // InternalIoTParser.g:4935:1: ( ( rule__DataOutput__PipelineAssignment_1 )? )
            {
            // InternalIoTParser.g:4935:1: ( ( rule__DataOutput__PipelineAssignment_1 )? )
            // InternalIoTParser.g:4936:2: ( rule__DataOutput__PipelineAssignment_1 )?
            {
             before(grammarAccess.getDataOutputAccess().getPipelineAssignment_1()); 
            // InternalIoTParser.g:4937:2: ( rule__DataOutput__PipelineAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==FullStop) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalIoTParser.g:4937:3: rule__DataOutput__PipelineAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOutput__PipelineAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataOutputAccess().getPipelineAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOutput__Group__1__Impl"


    // $ANTLR start "rule__Pipeline__Group__0"
    // InternalIoTParser.g:4946:1: rule__Pipeline__Group__0 : rule__Pipeline__Group__0__Impl rule__Pipeline__Group__1 ;
    public final void rule__Pipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4950:1: ( rule__Pipeline__Group__0__Impl rule__Pipeline__Group__1 )
            // InternalIoTParser.g:4951:2: rule__Pipeline__Group__0__Impl rule__Pipeline__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Pipeline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__0"


    // $ANTLR start "rule__Pipeline__Group__0__Impl"
    // InternalIoTParser.g:4958:1: rule__Pipeline__Group__0__Impl : ( FullStop ) ;
    public final void rule__Pipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4962:1: ( ( FullStop ) )
            // InternalIoTParser.g:4963:1: ( FullStop )
            {
            // InternalIoTParser.g:4963:1: ( FullStop )
            // InternalIoTParser.g:4964:2: FullStop
            {
             before(grammarAccess.getPipelineAccess().getFullStopKeyword_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__0__Impl"


    // $ANTLR start "rule__Pipeline__Group__1"
    // InternalIoTParser.g:4973:1: rule__Pipeline__Group__1 : rule__Pipeline__Group__1__Impl rule__Pipeline__Group__2 ;
    public final void rule__Pipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4977:1: ( rule__Pipeline__Group__1__Impl rule__Pipeline__Group__2 )
            // InternalIoTParser.g:4978:2: rule__Pipeline__Group__1__Impl rule__Pipeline__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Pipeline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__1"


    // $ANTLR start "rule__Pipeline__Group__1__Impl"
    // InternalIoTParser.g:4985:1: rule__Pipeline__Group__1__Impl : ( ( rule__Pipeline__Alternatives_1 ) ) ;
    public final void rule__Pipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:4989:1: ( ( ( rule__Pipeline__Alternatives_1 ) ) )
            // InternalIoTParser.g:4990:1: ( ( rule__Pipeline__Alternatives_1 ) )
            {
            // InternalIoTParser.g:4990:1: ( ( rule__Pipeline__Alternatives_1 ) )
            // InternalIoTParser.g:4991:2: ( rule__Pipeline__Alternatives_1 )
            {
             before(grammarAccess.getPipelineAccess().getAlternatives_1()); 
            // InternalIoTParser.g:4992:2: ( rule__Pipeline__Alternatives_1 )
            // InternalIoTParser.g:4992:3: rule__Pipeline__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__1__Impl"


    // $ANTLR start "rule__Pipeline__Group__2"
    // InternalIoTParser.g:5000:1: rule__Pipeline__Group__2 : rule__Pipeline__Group__2__Impl ;
    public final void rule__Pipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5004:1: ( rule__Pipeline__Group__2__Impl )
            // InternalIoTParser.g:5005:2: rule__Pipeline__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__2"


    // $ANTLR start "rule__Pipeline__Group__2__Impl"
    // InternalIoTParser.g:5011:1: rule__Pipeline__Group__2__Impl : ( ( rule__Pipeline__NextAssignment_2 )? ) ;
    public final void rule__Pipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5015:1: ( ( ( rule__Pipeline__NextAssignment_2 )? ) )
            // InternalIoTParser.g:5016:1: ( ( rule__Pipeline__NextAssignment_2 )? )
            {
            // InternalIoTParser.g:5016:1: ( ( rule__Pipeline__NextAssignment_2 )? )
            // InternalIoTParser.g:5017:2: ( rule__Pipeline__NextAssignment_2 )?
            {
             before(grammarAccess.getPipelineAccess().getNextAssignment_2()); 
            // InternalIoTParser.g:5018:2: ( rule__Pipeline__NextAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==FullStop) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalIoTParser.g:5018:3: rule__Pipeline__NextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pipeline__NextAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPipelineAccess().getNextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__2__Impl"


    // $ANTLR start "rule__TuplePipeline__Group__0"
    // InternalIoTParser.g:5027:1: rule__TuplePipeline__Group__0 : rule__TuplePipeline__Group__0__Impl rule__TuplePipeline__Group__1 ;
    public final void rule__TuplePipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5031:1: ( rule__TuplePipeline__Group__0__Impl rule__TuplePipeline__Group__1 )
            // InternalIoTParser.g:5032:2: rule__TuplePipeline__Group__0__Impl rule__TuplePipeline__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TuplePipeline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group__0"


    // $ANTLR start "rule__TuplePipeline__Group__0__Impl"
    // InternalIoTParser.g:5039:1: rule__TuplePipeline__Group__0__Impl : ( ( rule__TuplePipeline__Alternatives_0 ) ) ;
    public final void rule__TuplePipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5043:1: ( ( ( rule__TuplePipeline__Alternatives_0 ) ) )
            // InternalIoTParser.g:5044:1: ( ( rule__TuplePipeline__Alternatives_0 ) )
            {
            // InternalIoTParser.g:5044:1: ( ( rule__TuplePipeline__Alternatives_0 ) )
            // InternalIoTParser.g:5045:2: ( rule__TuplePipeline__Alternatives_0 )
            {
             before(grammarAccess.getTuplePipelineAccess().getAlternatives_0()); 
            // InternalIoTParser.g:5046:2: ( rule__TuplePipeline__Alternatives_0 )
            // InternalIoTParser.g:5046:3: rule__TuplePipeline__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTuplePipelineAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group__0__Impl"


    // $ANTLR start "rule__TuplePipeline__Group__1"
    // InternalIoTParser.g:5054:1: rule__TuplePipeline__Group__1 : rule__TuplePipeline__Group__1__Impl rule__TuplePipeline__Group__2 ;
    public final void rule__TuplePipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5058:1: ( rule__TuplePipeline__Group__1__Impl rule__TuplePipeline__Group__2 )
            // InternalIoTParser.g:5059:2: rule__TuplePipeline__Group__1__Impl rule__TuplePipeline__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__TuplePipeline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group__1"


    // $ANTLR start "rule__TuplePipeline__Group__1__Impl"
    // InternalIoTParser.g:5066:1: rule__TuplePipeline__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__TuplePipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5070:1: ( ( LeftSquareBracket ) )
            // InternalIoTParser.g:5071:1: ( LeftSquareBracket )
            {
            // InternalIoTParser.g:5071:1: ( LeftSquareBracket )
            // InternalIoTParser.g:5072:2: LeftSquareBracket
            {
             before(grammarAccess.getTuplePipelineAccess().getLeftSquareBracketKeyword_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getTuplePipelineAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group__1__Impl"


    // $ANTLR start "rule__TuplePipeline__Group__2"
    // InternalIoTParser.g:5081:1: rule__TuplePipeline__Group__2 : rule__TuplePipeline__Group__2__Impl rule__TuplePipeline__Group__3 ;
    public final void rule__TuplePipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5085:1: ( rule__TuplePipeline__Group__2__Impl rule__TuplePipeline__Group__3 )
            // InternalIoTParser.g:5086:2: rule__TuplePipeline__Group__2__Impl rule__TuplePipeline__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__TuplePipeline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group__2"


    // $ANTLR start "rule__TuplePipeline__Group__2__Impl"
    // InternalIoTParser.g:5093:1: rule__TuplePipeline__Group__2__Impl : ( ( rule__TuplePipeline__ExpressionAssignment_2 ) ) ;
    public final void rule__TuplePipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5097:1: ( ( ( rule__TuplePipeline__ExpressionAssignment_2 ) ) )
            // InternalIoTParser.g:5098:1: ( ( rule__TuplePipeline__ExpressionAssignment_2 ) )
            {
            // InternalIoTParser.g:5098:1: ( ( rule__TuplePipeline__ExpressionAssignment_2 ) )
            // InternalIoTParser.g:5099:2: ( rule__TuplePipeline__ExpressionAssignment_2 )
            {
             before(grammarAccess.getTuplePipelineAccess().getExpressionAssignment_2()); 
            // InternalIoTParser.g:5100:2: ( rule__TuplePipeline__ExpressionAssignment_2 )
            // InternalIoTParser.g:5100:3: rule__TuplePipeline__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TuplePipeline__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTuplePipelineAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group__2__Impl"


    // $ANTLR start "rule__TuplePipeline__Group__3"
    // InternalIoTParser.g:5108:1: rule__TuplePipeline__Group__3 : rule__TuplePipeline__Group__3__Impl ;
    public final void rule__TuplePipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5112:1: ( rule__TuplePipeline__Group__3__Impl )
            // InternalIoTParser.g:5113:2: rule__TuplePipeline__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group__3"


    // $ANTLR start "rule__TuplePipeline__Group__3__Impl"
    // InternalIoTParser.g:5119:1: rule__TuplePipeline__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__TuplePipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5123:1: ( ( RightSquareBracket ) )
            // InternalIoTParser.g:5124:1: ( RightSquareBracket )
            {
            // InternalIoTParser.g:5124:1: ( RightSquareBracket )
            // InternalIoTParser.g:5125:2: RightSquareBracket
            {
             before(grammarAccess.getTuplePipelineAccess().getRightSquareBracketKeyword_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getTuplePipelineAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group__3__Impl"


    // $ANTLR start "rule__TuplePipeline__Group_0_0__0"
    // InternalIoTParser.g:5135:1: rule__TuplePipeline__Group_0_0__0 : rule__TuplePipeline__Group_0_0__0__Impl rule__TuplePipeline__Group_0_0__1 ;
    public final void rule__TuplePipeline__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5139:1: ( rule__TuplePipeline__Group_0_0__0__Impl rule__TuplePipeline__Group_0_0__1 )
            // InternalIoTParser.g:5140:2: rule__TuplePipeline__Group_0_0__0__Impl rule__TuplePipeline__Group_0_0__1
            {
            pushFollow(FOLLOW_49);
            rule__TuplePipeline__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group_0_0__0"


    // $ANTLR start "rule__TuplePipeline__Group_0_0__0__Impl"
    // InternalIoTParser.g:5147:1: rule__TuplePipeline__Group_0_0__0__Impl : ( () ) ;
    public final void rule__TuplePipeline__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5151:1: ( ( () ) )
            // InternalIoTParser.g:5152:1: ( () )
            {
            // InternalIoTParser.g:5152:1: ( () )
            // InternalIoTParser.g:5153:2: ()
            {
             before(grammarAccess.getTuplePipelineAccess().getFilterAction_0_0_0()); 
            // InternalIoTParser.g:5154:2: ()
            // InternalIoTParser.g:5154:3: 
            {
            }

             after(grammarAccess.getTuplePipelineAccess().getFilterAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group_0_0__0__Impl"


    // $ANTLR start "rule__TuplePipeline__Group_0_0__1"
    // InternalIoTParser.g:5162:1: rule__TuplePipeline__Group_0_0__1 : rule__TuplePipeline__Group_0_0__1__Impl ;
    public final void rule__TuplePipeline__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5166:1: ( rule__TuplePipeline__Group_0_0__1__Impl )
            // InternalIoTParser.g:5167:2: rule__TuplePipeline__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group_0_0__1"


    // $ANTLR start "rule__TuplePipeline__Group_0_0__1__Impl"
    // InternalIoTParser.g:5173:1: rule__TuplePipeline__Group_0_0__1__Impl : ( Filter ) ;
    public final void rule__TuplePipeline__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5177:1: ( ( Filter ) )
            // InternalIoTParser.g:5178:1: ( Filter )
            {
            // InternalIoTParser.g:5178:1: ( Filter )
            // InternalIoTParser.g:5179:2: Filter
            {
             before(grammarAccess.getTuplePipelineAccess().getFilterKeyword_0_0_1()); 
            match(input,Filter,FOLLOW_2); 
             after(grammarAccess.getTuplePipelineAccess().getFilterKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group_0_0__1__Impl"


    // $ANTLR start "rule__TuplePipeline__Group_0_1__0"
    // InternalIoTParser.g:5189:1: rule__TuplePipeline__Group_0_1__0 : rule__TuplePipeline__Group_0_1__0__Impl rule__TuplePipeline__Group_0_1__1 ;
    public final void rule__TuplePipeline__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5193:1: ( rule__TuplePipeline__Group_0_1__0__Impl rule__TuplePipeline__Group_0_1__1 )
            // InternalIoTParser.g:5194:2: rule__TuplePipeline__Group_0_1__0__Impl rule__TuplePipeline__Group_0_1__1
            {
            pushFollow(FOLLOW_50);
            rule__TuplePipeline__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group_0_1__0"


    // $ANTLR start "rule__TuplePipeline__Group_0_1__0__Impl"
    // InternalIoTParser.g:5201:1: rule__TuplePipeline__Group_0_1__0__Impl : ( () ) ;
    public final void rule__TuplePipeline__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5205:1: ( ( () ) )
            // InternalIoTParser.g:5206:1: ( () )
            {
            // InternalIoTParser.g:5206:1: ( () )
            // InternalIoTParser.g:5207:2: ()
            {
             before(grammarAccess.getTuplePipelineAccess().getAbsAction_0_1_0()); 
            // InternalIoTParser.g:5208:2: ()
            // InternalIoTParser.g:5208:3: 
            {
            }

             after(grammarAccess.getTuplePipelineAccess().getAbsAction_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group_0_1__0__Impl"


    // $ANTLR start "rule__TuplePipeline__Group_0_1__1"
    // InternalIoTParser.g:5216:1: rule__TuplePipeline__Group_0_1__1 : rule__TuplePipeline__Group_0_1__1__Impl ;
    public final void rule__TuplePipeline__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5220:1: ( rule__TuplePipeline__Group_0_1__1__Impl )
            // InternalIoTParser.g:5221:2: rule__TuplePipeline__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TuplePipeline__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group_0_1__1"


    // $ANTLR start "rule__TuplePipeline__Group_0_1__1__Impl"
    // InternalIoTParser.g:5227:1: rule__TuplePipeline__Group_0_1__1__Impl : ( Abs ) ;
    public final void rule__TuplePipeline__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5231:1: ( ( Abs ) )
            // InternalIoTParser.g:5232:1: ( Abs )
            {
            // InternalIoTParser.g:5232:1: ( Abs )
            // InternalIoTParser.g:5233:2: Abs
            {
             before(grammarAccess.getTuplePipelineAccess().getAbsKeyword_0_1_1()); 
            match(input,Abs,FOLLOW_2); 
             after(grammarAccess.getTuplePipelineAccess().getAbsKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__Group_0_1__1__Impl"


    // $ANTLR start "rule__MapPipeline__Group__0"
    // InternalIoTParser.g:5243:1: rule__MapPipeline__Group__0 : rule__MapPipeline__Group__0__Impl rule__MapPipeline__Group__1 ;
    public final void rule__MapPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5247:1: ( rule__MapPipeline__Group__0__Impl rule__MapPipeline__Group__1 )
            // InternalIoTParser.g:5248:2: rule__MapPipeline__Group__0__Impl rule__MapPipeline__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__MapPipeline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapPipeline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__0"


    // $ANTLR start "rule__MapPipeline__Group__0__Impl"
    // InternalIoTParser.g:5255:1: rule__MapPipeline__Group__0__Impl : ( () ) ;
    public final void rule__MapPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5259:1: ( ( () ) )
            // InternalIoTParser.g:5260:1: ( () )
            {
            // InternalIoTParser.g:5260:1: ( () )
            // InternalIoTParser.g:5261:2: ()
            {
             before(grammarAccess.getMapPipelineAccess().getMapAction_0()); 
            // InternalIoTParser.g:5262:2: ()
            // InternalIoTParser.g:5262:3: 
            {
            }

             after(grammarAccess.getMapPipelineAccess().getMapAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__0__Impl"


    // $ANTLR start "rule__MapPipeline__Group__1"
    // InternalIoTParser.g:5270:1: rule__MapPipeline__Group__1 : rule__MapPipeline__Group__1__Impl rule__MapPipeline__Group__2 ;
    public final void rule__MapPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5274:1: ( rule__MapPipeline__Group__1__Impl rule__MapPipeline__Group__2 )
            // InternalIoTParser.g:5275:2: rule__MapPipeline__Group__1__Impl rule__MapPipeline__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MapPipeline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapPipeline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__1"


    // $ANTLR start "rule__MapPipeline__Group__1__Impl"
    // InternalIoTParser.g:5282:1: rule__MapPipeline__Group__1__Impl : ( Map ) ;
    public final void rule__MapPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5286:1: ( ( Map ) )
            // InternalIoTParser.g:5287:1: ( Map )
            {
            // InternalIoTParser.g:5287:1: ( Map )
            // InternalIoTParser.g:5288:2: Map
            {
             before(grammarAccess.getMapPipelineAccess().getMapKeyword_1()); 
            match(input,Map,FOLLOW_2); 
             after(grammarAccess.getMapPipelineAccess().getMapKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__1__Impl"


    // $ANTLR start "rule__MapPipeline__Group__2"
    // InternalIoTParser.g:5297:1: rule__MapPipeline__Group__2 : rule__MapPipeline__Group__2__Impl rule__MapPipeline__Group__3 ;
    public final void rule__MapPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5301:1: ( rule__MapPipeline__Group__2__Impl rule__MapPipeline__Group__3 )
            // InternalIoTParser.g:5302:2: rule__MapPipeline__Group__2__Impl rule__MapPipeline__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__MapPipeline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapPipeline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__2"


    // $ANTLR start "rule__MapPipeline__Group__2__Impl"
    // InternalIoTParser.g:5309:1: rule__MapPipeline__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__MapPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5313:1: ( ( LeftSquareBracket ) )
            // InternalIoTParser.g:5314:1: ( LeftSquareBracket )
            {
            // InternalIoTParser.g:5314:1: ( LeftSquareBracket )
            // InternalIoTParser.g:5315:2: LeftSquareBracket
            {
             before(grammarAccess.getMapPipelineAccess().getLeftSquareBracketKeyword_2()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getMapPipelineAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__2__Impl"


    // $ANTLR start "rule__MapPipeline__Group__3"
    // InternalIoTParser.g:5324:1: rule__MapPipeline__Group__3 : rule__MapPipeline__Group__3__Impl rule__MapPipeline__Group__4 ;
    public final void rule__MapPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5328:1: ( rule__MapPipeline__Group__3__Impl rule__MapPipeline__Group__4 )
            // InternalIoTParser.g:5329:2: rule__MapPipeline__Group__3__Impl rule__MapPipeline__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__MapPipeline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapPipeline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__3"


    // $ANTLR start "rule__MapPipeline__Group__3__Impl"
    // InternalIoTParser.g:5336:1: rule__MapPipeline__Group__3__Impl : ( ( rule__MapPipeline__ExpressionAssignment_3 ) ) ;
    public final void rule__MapPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5340:1: ( ( ( rule__MapPipeline__ExpressionAssignment_3 ) ) )
            // InternalIoTParser.g:5341:1: ( ( rule__MapPipeline__ExpressionAssignment_3 ) )
            {
            // InternalIoTParser.g:5341:1: ( ( rule__MapPipeline__ExpressionAssignment_3 ) )
            // InternalIoTParser.g:5342:2: ( rule__MapPipeline__ExpressionAssignment_3 )
            {
             before(grammarAccess.getMapPipelineAccess().getExpressionAssignment_3()); 
            // InternalIoTParser.g:5343:2: ( rule__MapPipeline__ExpressionAssignment_3 )
            // InternalIoTParser.g:5343:3: rule__MapPipeline__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MapPipeline__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMapPipelineAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__3__Impl"


    // $ANTLR start "rule__MapPipeline__Group__4"
    // InternalIoTParser.g:5351:1: rule__MapPipeline__Group__4 : rule__MapPipeline__Group__4__Impl rule__MapPipeline__Group__5 ;
    public final void rule__MapPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5355:1: ( rule__MapPipeline__Group__4__Impl rule__MapPipeline__Group__5 )
            // InternalIoTParser.g:5356:2: rule__MapPipeline__Group__4__Impl rule__MapPipeline__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__MapPipeline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapPipeline__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__4"


    // $ANTLR start "rule__MapPipeline__Group__4__Impl"
    // InternalIoTParser.g:5363:1: rule__MapPipeline__Group__4__Impl : ( HyphenMinusGreaterThanSign ) ;
    public final void rule__MapPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5367:1: ( ( HyphenMinusGreaterThanSign ) )
            // InternalIoTParser.g:5368:1: ( HyphenMinusGreaterThanSign )
            {
            // InternalIoTParser.g:5368:1: ( HyphenMinusGreaterThanSign )
            // InternalIoTParser.g:5369:2: HyphenMinusGreaterThanSign
            {
             before(grammarAccess.getMapPipelineAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
             after(grammarAccess.getMapPipelineAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__4__Impl"


    // $ANTLR start "rule__MapPipeline__Group__5"
    // InternalIoTParser.g:5378:1: rule__MapPipeline__Group__5 : rule__MapPipeline__Group__5__Impl rule__MapPipeline__Group__6 ;
    public final void rule__MapPipeline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5382:1: ( rule__MapPipeline__Group__5__Impl rule__MapPipeline__Group__6 )
            // InternalIoTParser.g:5383:2: rule__MapPipeline__Group__5__Impl rule__MapPipeline__Group__6
            {
            pushFollow(FOLLOW_48);
            rule__MapPipeline__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapPipeline__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__5"


    // $ANTLR start "rule__MapPipeline__Group__5__Impl"
    // InternalIoTParser.g:5390:1: rule__MapPipeline__Group__5__Impl : ( ( rule__MapPipeline__OutputAssignment_5 ) ) ;
    public final void rule__MapPipeline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5394:1: ( ( ( rule__MapPipeline__OutputAssignment_5 ) ) )
            // InternalIoTParser.g:5395:1: ( ( rule__MapPipeline__OutputAssignment_5 ) )
            {
            // InternalIoTParser.g:5395:1: ( ( rule__MapPipeline__OutputAssignment_5 ) )
            // InternalIoTParser.g:5396:2: ( rule__MapPipeline__OutputAssignment_5 )
            {
             before(grammarAccess.getMapPipelineAccess().getOutputAssignment_5()); 
            // InternalIoTParser.g:5397:2: ( rule__MapPipeline__OutputAssignment_5 )
            // InternalIoTParser.g:5397:3: rule__MapPipeline__OutputAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MapPipeline__OutputAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMapPipelineAccess().getOutputAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__5__Impl"


    // $ANTLR start "rule__MapPipeline__Group__6"
    // InternalIoTParser.g:5405:1: rule__MapPipeline__Group__6 : rule__MapPipeline__Group__6__Impl ;
    public final void rule__MapPipeline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5409:1: ( rule__MapPipeline__Group__6__Impl )
            // InternalIoTParser.g:5410:2: rule__MapPipeline__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapPipeline__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__6"


    // $ANTLR start "rule__MapPipeline__Group__6__Impl"
    // InternalIoTParser.g:5416:1: rule__MapPipeline__Group__6__Impl : ( RightSquareBracket ) ;
    public final void rule__MapPipeline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5420:1: ( ( RightSquareBracket ) )
            // InternalIoTParser.g:5421:1: ( RightSquareBracket )
            {
            // InternalIoTParser.g:5421:1: ( RightSquareBracket )
            // InternalIoTParser.g:5422:2: RightSquareBracket
            {
             before(grammarAccess.getMapPipelineAccess().getRightSquareBracketKeyword_6()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getMapPipelineAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__Group__6__Impl"


    // $ANTLR start "rule__WindowPipeline__Group__0"
    // InternalIoTParser.g:5432:1: rule__WindowPipeline__Group__0 : rule__WindowPipeline__Group__0__Impl rule__WindowPipeline__Group__1 ;
    public final void rule__WindowPipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5436:1: ( rule__WindowPipeline__Group__0__Impl rule__WindowPipeline__Group__1 )
            // InternalIoTParser.g:5437:2: rule__WindowPipeline__Group__0__Impl rule__WindowPipeline__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__WindowPipeline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WindowPipeline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__0"


    // $ANTLR start "rule__WindowPipeline__Group__0__Impl"
    // InternalIoTParser.g:5444:1: rule__WindowPipeline__Group__0__Impl : ( () ) ;
    public final void rule__WindowPipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5448:1: ( ( () ) )
            // InternalIoTParser.g:5449:1: ( () )
            {
            // InternalIoTParser.g:5449:1: ( () )
            // InternalIoTParser.g:5450:2: ()
            {
             before(grammarAccess.getWindowPipelineAccess().getWindowAction_0()); 
            // InternalIoTParser.g:5451:2: ()
            // InternalIoTParser.g:5451:3: 
            {
            }

             after(grammarAccess.getWindowPipelineAccess().getWindowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__0__Impl"


    // $ANTLR start "rule__WindowPipeline__Group__1"
    // InternalIoTParser.g:5459:1: rule__WindowPipeline__Group__1 : rule__WindowPipeline__Group__1__Impl rule__WindowPipeline__Group__2 ;
    public final void rule__WindowPipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5463:1: ( rule__WindowPipeline__Group__1__Impl rule__WindowPipeline__Group__2 )
            // InternalIoTParser.g:5464:2: rule__WindowPipeline__Group__1__Impl rule__WindowPipeline__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__WindowPipeline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WindowPipeline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__1"


    // $ANTLR start "rule__WindowPipeline__Group__1__Impl"
    // InternalIoTParser.g:5471:1: rule__WindowPipeline__Group__1__Impl : ( ByWindow ) ;
    public final void rule__WindowPipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5475:1: ( ( ByWindow ) )
            // InternalIoTParser.g:5476:1: ( ByWindow )
            {
            // InternalIoTParser.g:5476:1: ( ByWindow )
            // InternalIoTParser.g:5477:2: ByWindow
            {
             before(grammarAccess.getWindowPipelineAccess().getByWindowKeyword_1()); 
            match(input,ByWindow,FOLLOW_2); 
             after(grammarAccess.getWindowPipelineAccess().getByWindowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__1__Impl"


    // $ANTLR start "rule__WindowPipeline__Group__2"
    // InternalIoTParser.g:5486:1: rule__WindowPipeline__Group__2 : rule__WindowPipeline__Group__2__Impl rule__WindowPipeline__Group__3 ;
    public final void rule__WindowPipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5490:1: ( rule__WindowPipeline__Group__2__Impl rule__WindowPipeline__Group__3 )
            // InternalIoTParser.g:5491:2: rule__WindowPipeline__Group__2__Impl rule__WindowPipeline__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__WindowPipeline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WindowPipeline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__2"


    // $ANTLR start "rule__WindowPipeline__Group__2__Impl"
    // InternalIoTParser.g:5498:1: rule__WindowPipeline__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__WindowPipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5502:1: ( ( LeftSquareBracket ) )
            // InternalIoTParser.g:5503:1: ( LeftSquareBracket )
            {
            // InternalIoTParser.g:5503:1: ( LeftSquareBracket )
            // InternalIoTParser.g:5504:2: LeftSquareBracket
            {
             before(grammarAccess.getWindowPipelineAccess().getLeftSquareBracketKeyword_2()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getWindowPipelineAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__2__Impl"


    // $ANTLR start "rule__WindowPipeline__Group__3"
    // InternalIoTParser.g:5513:1: rule__WindowPipeline__Group__3 : rule__WindowPipeline__Group__3__Impl rule__WindowPipeline__Group__4 ;
    public final void rule__WindowPipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5517:1: ( rule__WindowPipeline__Group__3__Impl rule__WindowPipeline__Group__4 )
            // InternalIoTParser.g:5518:2: rule__WindowPipeline__Group__3__Impl rule__WindowPipeline__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__WindowPipeline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WindowPipeline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__3"


    // $ANTLR start "rule__WindowPipeline__Group__3__Impl"
    // InternalIoTParser.g:5525:1: rule__WindowPipeline__Group__3__Impl : ( ( rule__WindowPipeline__WidthAssignment_3 ) ) ;
    public final void rule__WindowPipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5529:1: ( ( ( rule__WindowPipeline__WidthAssignment_3 ) ) )
            // InternalIoTParser.g:5530:1: ( ( rule__WindowPipeline__WidthAssignment_3 ) )
            {
            // InternalIoTParser.g:5530:1: ( ( rule__WindowPipeline__WidthAssignment_3 ) )
            // InternalIoTParser.g:5531:2: ( rule__WindowPipeline__WidthAssignment_3 )
            {
             before(grammarAccess.getWindowPipelineAccess().getWidthAssignment_3()); 
            // InternalIoTParser.g:5532:2: ( rule__WindowPipeline__WidthAssignment_3 )
            // InternalIoTParser.g:5532:3: rule__WindowPipeline__WidthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WindowPipeline__WidthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWindowPipelineAccess().getWidthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__3__Impl"


    // $ANTLR start "rule__WindowPipeline__Group__4"
    // InternalIoTParser.g:5540:1: rule__WindowPipeline__Group__4 : rule__WindowPipeline__Group__4__Impl rule__WindowPipeline__Group__5 ;
    public final void rule__WindowPipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5544:1: ( rule__WindowPipeline__Group__4__Impl rule__WindowPipeline__Group__5 )
            // InternalIoTParser.g:5545:2: rule__WindowPipeline__Group__4__Impl rule__WindowPipeline__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__WindowPipeline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WindowPipeline__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__4"


    // $ANTLR start "rule__WindowPipeline__Group__4__Impl"
    // InternalIoTParser.g:5552:1: rule__WindowPipeline__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__WindowPipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5556:1: ( ( RightSquareBracket ) )
            // InternalIoTParser.g:5557:1: ( RightSquareBracket )
            {
            // InternalIoTParser.g:5557:1: ( RightSquareBracket )
            // InternalIoTParser.g:5558:2: RightSquareBracket
            {
             before(grammarAccess.getWindowPipelineAccess().getRightSquareBracketKeyword_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getWindowPipelineAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__4__Impl"


    // $ANTLR start "rule__WindowPipeline__Group__5"
    // InternalIoTParser.g:5567:1: rule__WindowPipeline__Group__5 : rule__WindowPipeline__Group__5__Impl rule__WindowPipeline__Group__6 ;
    public final void rule__WindowPipeline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5571:1: ( rule__WindowPipeline__Group__5__Impl rule__WindowPipeline__Group__6 )
            // InternalIoTParser.g:5572:2: rule__WindowPipeline__Group__5__Impl rule__WindowPipeline__Group__6
            {
            pushFollow(FOLLOW_52);
            rule__WindowPipeline__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WindowPipeline__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__5"


    // $ANTLR start "rule__WindowPipeline__Group__5__Impl"
    // InternalIoTParser.g:5579:1: rule__WindowPipeline__Group__5__Impl : ( FullStop ) ;
    public final void rule__WindowPipeline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5583:1: ( ( FullStop ) )
            // InternalIoTParser.g:5584:1: ( FullStop )
            {
            // InternalIoTParser.g:5584:1: ( FullStop )
            // InternalIoTParser.g:5585:2: FullStop
            {
             before(grammarAccess.getWindowPipelineAccess().getFullStopKeyword_5()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getWindowPipelineAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__5__Impl"


    // $ANTLR start "rule__WindowPipeline__Group__6"
    // InternalIoTParser.g:5594:1: rule__WindowPipeline__Group__6 : rule__WindowPipeline__Group__6__Impl ;
    public final void rule__WindowPipeline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5598:1: ( rule__WindowPipeline__Group__6__Impl )
            // InternalIoTParser.g:5599:2: rule__WindowPipeline__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WindowPipeline__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__6"


    // $ANTLR start "rule__WindowPipeline__Group__6__Impl"
    // InternalIoTParser.g:5605:1: rule__WindowPipeline__Group__6__Impl : ( ( rule__WindowPipeline__ExecuteAssignment_6 ) ) ;
    public final void rule__WindowPipeline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5609:1: ( ( ( rule__WindowPipeline__ExecuteAssignment_6 ) ) )
            // InternalIoTParser.g:5610:1: ( ( rule__WindowPipeline__ExecuteAssignment_6 ) )
            {
            // InternalIoTParser.g:5610:1: ( ( rule__WindowPipeline__ExecuteAssignment_6 ) )
            // InternalIoTParser.g:5611:2: ( rule__WindowPipeline__ExecuteAssignment_6 )
            {
             before(grammarAccess.getWindowPipelineAccess().getExecuteAssignment_6()); 
            // InternalIoTParser.g:5612:2: ( rule__WindowPipeline__ExecuteAssignment_6 )
            // InternalIoTParser.g:5612:3: rule__WindowPipeline__ExecuteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__WindowPipeline__ExecuteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWindowPipelineAccess().getExecuteAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__Group__6__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_0__0"
    // InternalIoTParser.g:5621:1: rule__ExecutePipeline__Group_0__0 : rule__ExecutePipeline__Group_0__0__Impl rule__ExecutePipeline__Group_0__1 ;
    public final void rule__ExecutePipeline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5625:1: ( rule__ExecutePipeline__Group_0__0__Impl rule__ExecutePipeline__Group_0__1 )
            // InternalIoTParser.g:5626:2: rule__ExecutePipeline__Group_0__0__Impl rule__ExecutePipeline__Group_0__1
            {
            pushFollow(FOLLOW_53);
            rule__ExecutePipeline__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_0__0"


    // $ANTLR start "rule__ExecutePipeline__Group_0__0__Impl"
    // InternalIoTParser.g:5633:1: rule__ExecutePipeline__Group_0__0__Impl : ( () ) ;
    public final void rule__ExecutePipeline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5637:1: ( ( () ) )
            // InternalIoTParser.g:5638:1: ( () )
            {
            // InternalIoTParser.g:5638:1: ( () )
            // InternalIoTParser.g:5639:2: ()
            {
             before(grammarAccess.getExecutePipelineAccess().getReduceAction_0_0()); 
            // InternalIoTParser.g:5640:2: ()
            // InternalIoTParser.g:5640:3: 
            {
            }

             after(grammarAccess.getExecutePipelineAccess().getReduceAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_0__0__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_0__1"
    // InternalIoTParser.g:5648:1: rule__ExecutePipeline__Group_0__1 : rule__ExecutePipeline__Group_0__1__Impl ;
    public final void rule__ExecutePipeline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5652:1: ( rule__ExecutePipeline__Group_0__1__Impl )
            // InternalIoTParser.g:5653:2: rule__ExecutePipeline__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_0__1"


    // $ANTLR start "rule__ExecutePipeline__Group_0__1__Impl"
    // InternalIoTParser.g:5659:1: rule__ExecutePipeline__Group_0__1__Impl : ( Reduce ) ;
    public final void rule__ExecutePipeline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5663:1: ( ( Reduce ) )
            // InternalIoTParser.g:5664:1: ( Reduce )
            {
            // InternalIoTParser.g:5664:1: ( Reduce )
            // InternalIoTParser.g:5665:2: Reduce
            {
             before(grammarAccess.getExecutePipelineAccess().getReduceKeyword_0_1()); 
            match(input,Reduce,FOLLOW_2); 
             after(grammarAccess.getExecutePipelineAccess().getReduceKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_0__1__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_1__0"
    // InternalIoTParser.g:5675:1: rule__ExecutePipeline__Group_1__0 : rule__ExecutePipeline__Group_1__0__Impl rule__ExecutePipeline__Group_1__1 ;
    public final void rule__ExecutePipeline__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5679:1: ( rule__ExecutePipeline__Group_1__0__Impl rule__ExecutePipeline__Group_1__1 )
            // InternalIoTParser.g:5680:2: rule__ExecutePipeline__Group_1__0__Impl rule__ExecutePipeline__Group_1__1
            {
            pushFollow(FOLLOW_54);
            rule__ExecutePipeline__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_1__0"


    // $ANTLR start "rule__ExecutePipeline__Group_1__0__Impl"
    // InternalIoTParser.g:5687:1: rule__ExecutePipeline__Group_1__0__Impl : ( () ) ;
    public final void rule__ExecutePipeline__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5691:1: ( ( () ) )
            // InternalIoTParser.g:5692:1: ( () )
            {
            // InternalIoTParser.g:5692:1: ( () )
            // InternalIoTParser.g:5693:2: ()
            {
             before(grammarAccess.getExecutePipelineAccess().getMeanAction_1_0()); 
            // InternalIoTParser.g:5694:2: ()
            // InternalIoTParser.g:5694:3: 
            {
            }

             after(grammarAccess.getExecutePipelineAccess().getMeanAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_1__0__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_1__1"
    // InternalIoTParser.g:5702:1: rule__ExecutePipeline__Group_1__1 : rule__ExecutePipeline__Group_1__1__Impl ;
    public final void rule__ExecutePipeline__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5706:1: ( rule__ExecutePipeline__Group_1__1__Impl )
            // InternalIoTParser.g:5707:2: rule__ExecutePipeline__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_1__1"


    // $ANTLR start "rule__ExecutePipeline__Group_1__1__Impl"
    // InternalIoTParser.g:5713:1: rule__ExecutePipeline__Group_1__1__Impl : ( Mean ) ;
    public final void rule__ExecutePipeline__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5717:1: ( ( Mean ) )
            // InternalIoTParser.g:5718:1: ( Mean )
            {
            // InternalIoTParser.g:5718:1: ( Mean )
            // InternalIoTParser.g:5719:2: Mean
            {
             before(grammarAccess.getExecutePipelineAccess().getMeanKeyword_1_1()); 
            match(input,Mean,FOLLOW_2); 
             after(grammarAccess.getExecutePipelineAccess().getMeanKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_1__1__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_2__0"
    // InternalIoTParser.g:5729:1: rule__ExecutePipeline__Group_2__0 : rule__ExecutePipeline__Group_2__0__Impl rule__ExecutePipeline__Group_2__1 ;
    public final void rule__ExecutePipeline__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5733:1: ( rule__ExecutePipeline__Group_2__0__Impl rule__ExecutePipeline__Group_2__1 )
            // InternalIoTParser.g:5734:2: rule__ExecutePipeline__Group_2__0__Impl rule__ExecutePipeline__Group_2__1
            {
            pushFollow(FOLLOW_55);
            rule__ExecutePipeline__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_2__0"


    // $ANTLR start "rule__ExecutePipeline__Group_2__0__Impl"
    // InternalIoTParser.g:5741:1: rule__ExecutePipeline__Group_2__0__Impl : ( () ) ;
    public final void rule__ExecutePipeline__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5745:1: ( ( () ) )
            // InternalIoTParser.g:5746:1: ( () )
            {
            // InternalIoTParser.g:5746:1: ( () )
            // InternalIoTParser.g:5747:2: ()
            {
             before(grammarAccess.getExecutePipelineAccess().getMedianAction_2_0()); 
            // InternalIoTParser.g:5748:2: ()
            // InternalIoTParser.g:5748:3: 
            {
            }

             after(grammarAccess.getExecutePipelineAccess().getMedianAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_2__0__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_2__1"
    // InternalIoTParser.g:5756:1: rule__ExecutePipeline__Group_2__1 : rule__ExecutePipeline__Group_2__1__Impl ;
    public final void rule__ExecutePipeline__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5760:1: ( rule__ExecutePipeline__Group_2__1__Impl )
            // InternalIoTParser.g:5761:2: rule__ExecutePipeline__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_2__1"


    // $ANTLR start "rule__ExecutePipeline__Group_2__1__Impl"
    // InternalIoTParser.g:5767:1: rule__ExecutePipeline__Group_2__1__Impl : ( Median ) ;
    public final void rule__ExecutePipeline__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5771:1: ( ( Median ) )
            // InternalIoTParser.g:5772:1: ( Median )
            {
            // InternalIoTParser.g:5772:1: ( Median )
            // InternalIoTParser.g:5773:2: Median
            {
             before(grammarAccess.getExecutePipelineAccess().getMedianKeyword_2_1()); 
            match(input,Median,FOLLOW_2); 
             after(grammarAccess.getExecutePipelineAccess().getMedianKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_2__1__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_3__0"
    // InternalIoTParser.g:5783:1: rule__ExecutePipeline__Group_3__0 : rule__ExecutePipeline__Group_3__0__Impl rule__ExecutePipeline__Group_3__1 ;
    public final void rule__ExecutePipeline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5787:1: ( rule__ExecutePipeline__Group_3__0__Impl rule__ExecutePipeline__Group_3__1 )
            // InternalIoTParser.g:5788:2: rule__ExecutePipeline__Group_3__0__Impl rule__ExecutePipeline__Group_3__1
            {
            pushFollow(FOLLOW_56);
            rule__ExecutePipeline__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_3__0"


    // $ANTLR start "rule__ExecutePipeline__Group_3__0__Impl"
    // InternalIoTParser.g:5795:1: rule__ExecutePipeline__Group_3__0__Impl : ( () ) ;
    public final void rule__ExecutePipeline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5799:1: ( ( () ) )
            // InternalIoTParser.g:5800:1: ( () )
            {
            // InternalIoTParser.g:5800:1: ( () )
            // InternalIoTParser.g:5801:2: ()
            {
             before(grammarAccess.getExecutePipelineAccess().getStDevAction_3_0()); 
            // InternalIoTParser.g:5802:2: ()
            // InternalIoTParser.g:5802:3: 
            {
            }

             after(grammarAccess.getExecutePipelineAccess().getStDevAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_3__0__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_3__1"
    // InternalIoTParser.g:5810:1: rule__ExecutePipeline__Group_3__1 : rule__ExecutePipeline__Group_3__1__Impl ;
    public final void rule__ExecutePipeline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5814:1: ( rule__ExecutePipeline__Group_3__1__Impl )
            // InternalIoTParser.g:5815:2: rule__ExecutePipeline__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_3__1"


    // $ANTLR start "rule__ExecutePipeline__Group_3__1__Impl"
    // InternalIoTParser.g:5821:1: rule__ExecutePipeline__Group_3__1__Impl : ( Stdev ) ;
    public final void rule__ExecutePipeline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5825:1: ( ( Stdev ) )
            // InternalIoTParser.g:5826:1: ( Stdev )
            {
            // InternalIoTParser.g:5826:1: ( Stdev )
            // InternalIoTParser.g:5827:2: Stdev
            {
             before(grammarAccess.getExecutePipelineAccess().getStdevKeyword_3_1()); 
            match(input,Stdev,FOLLOW_2); 
             after(grammarAccess.getExecutePipelineAccess().getStdevKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_3__1__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_4__0"
    // InternalIoTParser.g:5837:1: rule__ExecutePipeline__Group_4__0 : rule__ExecutePipeline__Group_4__0__Impl rule__ExecutePipeline__Group_4__1 ;
    public final void rule__ExecutePipeline__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5841:1: ( rule__ExecutePipeline__Group_4__0__Impl rule__ExecutePipeline__Group_4__1 )
            // InternalIoTParser.g:5842:2: rule__ExecutePipeline__Group_4__0__Impl rule__ExecutePipeline__Group_4__1
            {
            pushFollow(FOLLOW_57);
            rule__ExecutePipeline__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_4__0"


    // $ANTLR start "rule__ExecutePipeline__Group_4__0__Impl"
    // InternalIoTParser.g:5849:1: rule__ExecutePipeline__Group_4__0__Impl : ( () ) ;
    public final void rule__ExecutePipeline__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5853:1: ( ( () ) )
            // InternalIoTParser.g:5854:1: ( () )
            {
            // InternalIoTParser.g:5854:1: ( () )
            // InternalIoTParser.g:5855:2: ()
            {
             before(grammarAccess.getExecutePipelineAccess().getMinAction_4_0()); 
            // InternalIoTParser.g:5856:2: ()
            // InternalIoTParser.g:5856:3: 
            {
            }

             after(grammarAccess.getExecutePipelineAccess().getMinAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_4__0__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_4__1"
    // InternalIoTParser.g:5864:1: rule__ExecutePipeline__Group_4__1 : rule__ExecutePipeline__Group_4__1__Impl ;
    public final void rule__ExecutePipeline__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5868:1: ( rule__ExecutePipeline__Group_4__1__Impl )
            // InternalIoTParser.g:5869:2: rule__ExecutePipeline__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_4__1"


    // $ANTLR start "rule__ExecutePipeline__Group_4__1__Impl"
    // InternalIoTParser.g:5875:1: rule__ExecutePipeline__Group_4__1__Impl : ( Min ) ;
    public final void rule__ExecutePipeline__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5879:1: ( ( Min ) )
            // InternalIoTParser.g:5880:1: ( Min )
            {
            // InternalIoTParser.g:5880:1: ( Min )
            // InternalIoTParser.g:5881:2: Min
            {
             before(grammarAccess.getExecutePipelineAccess().getMinKeyword_4_1()); 
            match(input,Min,FOLLOW_2); 
             after(grammarAccess.getExecutePipelineAccess().getMinKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_4__1__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_5__0"
    // InternalIoTParser.g:5891:1: rule__ExecutePipeline__Group_5__0 : rule__ExecutePipeline__Group_5__0__Impl rule__ExecutePipeline__Group_5__1 ;
    public final void rule__ExecutePipeline__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5895:1: ( rule__ExecutePipeline__Group_5__0__Impl rule__ExecutePipeline__Group_5__1 )
            // InternalIoTParser.g:5896:2: rule__ExecutePipeline__Group_5__0__Impl rule__ExecutePipeline__Group_5__1
            {
            pushFollow(FOLLOW_58);
            rule__ExecutePipeline__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_5__0"


    // $ANTLR start "rule__ExecutePipeline__Group_5__0__Impl"
    // InternalIoTParser.g:5903:1: rule__ExecutePipeline__Group_5__0__Impl : ( () ) ;
    public final void rule__ExecutePipeline__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5907:1: ( ( () ) )
            // InternalIoTParser.g:5908:1: ( () )
            {
            // InternalIoTParser.g:5908:1: ( () )
            // InternalIoTParser.g:5909:2: ()
            {
             before(grammarAccess.getExecutePipelineAccess().getMaxAction_5_0()); 
            // InternalIoTParser.g:5910:2: ()
            // InternalIoTParser.g:5910:3: 
            {
            }

             after(grammarAccess.getExecutePipelineAccess().getMaxAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_5__0__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_5__1"
    // InternalIoTParser.g:5918:1: rule__ExecutePipeline__Group_5__1 : rule__ExecutePipeline__Group_5__1__Impl ;
    public final void rule__ExecutePipeline__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5922:1: ( rule__ExecutePipeline__Group_5__1__Impl )
            // InternalIoTParser.g:5923:2: rule__ExecutePipeline__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_5__1"


    // $ANTLR start "rule__ExecutePipeline__Group_5__1__Impl"
    // InternalIoTParser.g:5929:1: rule__ExecutePipeline__Group_5__1__Impl : ( Max ) ;
    public final void rule__ExecutePipeline__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5933:1: ( ( Max ) )
            // InternalIoTParser.g:5934:1: ( Max )
            {
            // InternalIoTParser.g:5934:1: ( Max )
            // InternalIoTParser.g:5935:2: Max
            {
             before(grammarAccess.getExecutePipelineAccess().getMaxKeyword_5_1()); 
            match(input,Max,FOLLOW_2); 
             after(grammarAccess.getExecutePipelineAccess().getMaxKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_5__1__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_6__0"
    // InternalIoTParser.g:5945:1: rule__ExecutePipeline__Group_6__0 : rule__ExecutePipeline__Group_6__0__Impl rule__ExecutePipeline__Group_6__1 ;
    public final void rule__ExecutePipeline__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5949:1: ( rule__ExecutePipeline__Group_6__0__Impl rule__ExecutePipeline__Group_6__1 )
            // InternalIoTParser.g:5950:2: rule__ExecutePipeline__Group_6__0__Impl rule__ExecutePipeline__Group_6__1
            {
            pushFollow(FOLLOW_52);
            rule__ExecutePipeline__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_6__0"


    // $ANTLR start "rule__ExecutePipeline__Group_6__0__Impl"
    // InternalIoTParser.g:5957:1: rule__ExecutePipeline__Group_6__0__Impl : ( () ) ;
    public final void rule__ExecutePipeline__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5961:1: ( ( () ) )
            // InternalIoTParser.g:5962:1: ( () )
            {
            // InternalIoTParser.g:5962:1: ( () )
            // InternalIoTParser.g:5963:2: ()
            {
             before(grammarAccess.getExecutePipelineAccess().getCountAction_6_0()); 
            // InternalIoTParser.g:5964:2: ()
            // InternalIoTParser.g:5964:3: 
            {
            }

             after(grammarAccess.getExecutePipelineAccess().getCountAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_6__0__Impl"


    // $ANTLR start "rule__ExecutePipeline__Group_6__1"
    // InternalIoTParser.g:5972:1: rule__ExecutePipeline__Group_6__1 : rule__ExecutePipeline__Group_6__1__Impl ;
    public final void rule__ExecutePipeline__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5976:1: ( rule__ExecutePipeline__Group_6__1__Impl )
            // InternalIoTParser.g:5977:2: rule__ExecutePipeline__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutePipeline__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_6__1"


    // $ANTLR start "rule__ExecutePipeline__Group_6__1__Impl"
    // InternalIoTParser.g:5983:1: rule__ExecutePipeline__Group_6__1__Impl : ( Count ) ;
    public final void rule__ExecutePipeline__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:5987:1: ( ( Count ) )
            // InternalIoTParser.g:5988:1: ( Count )
            {
            // InternalIoTParser.g:5988:1: ( Count )
            // InternalIoTParser.g:5989:2: Count
            {
             before(grammarAccess.getExecutePipelineAccess().getCountKeyword_6_1()); 
            match(input,Count,FOLLOW_2); 
             after(grammarAccess.getExecutePipelineAccess().getCountKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutePipeline__Group_6__1__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalIoTParser.g:5999:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6003:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalIoTParser.g:6004:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalIoTParser.g:6011:1: rule__Conditional__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6015:1: ( ( ruleOr ) )
            // InternalIoTParser.g:6016:1: ( ruleOr )
            {
            // InternalIoTParser.g:6016:1: ( ruleOr )
            // InternalIoTParser.g:6017:2: ruleOr
            {
             before(grammarAccess.getConditionalAccess().getOrParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getOrParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalIoTParser.g:6026:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6030:1: ( rule__Conditional__Group__1__Impl )
            // InternalIoTParser.g:6031:2: rule__Conditional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalIoTParser.g:6037:1: rule__Conditional__Group__1__Impl : ( ( rule__Conditional__Group_1__0 )? ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6041:1: ( ( ( rule__Conditional__Group_1__0 )? ) )
            // InternalIoTParser.g:6042:1: ( ( rule__Conditional__Group_1__0 )? )
            {
            // InternalIoTParser.g:6042:1: ( ( rule__Conditional__Group_1__0 )? )
            // InternalIoTParser.g:6043:2: ( rule__Conditional__Group_1__0 )?
            {
             before(grammarAccess.getConditionalAccess().getGroup_1()); 
            // InternalIoTParser.g:6044:2: ( rule__Conditional__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==QuestionMark) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalIoTParser.g:6044:3: rule__Conditional__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group_1__0"
    // InternalIoTParser.g:6053:1: rule__Conditional__Group_1__0 : rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 ;
    public final void rule__Conditional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6057:1: ( rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 )
            // InternalIoTParser.g:6058:2: rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1
            {
            pushFollow(FOLLOW_59);
            rule__Conditional__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__0"


    // $ANTLR start "rule__Conditional__Group_1__0__Impl"
    // InternalIoTParser.g:6065:1: rule__Conditional__Group_1__0__Impl : ( () ) ;
    public final void rule__Conditional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6069:1: ( ( () ) )
            // InternalIoTParser.g:6070:1: ( () )
            {
            // InternalIoTParser.g:6070:1: ( () )
            // InternalIoTParser.g:6071:2: ()
            {
             before(grammarAccess.getConditionalAccess().getConditionalConditionAction_1_0()); 
            // InternalIoTParser.g:6072:2: ()
            // InternalIoTParser.g:6072:3: 
            {
            }

             after(grammarAccess.getConditionalAccess().getConditionalConditionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__0__Impl"


    // $ANTLR start "rule__Conditional__Group_1__1"
    // InternalIoTParser.g:6080:1: rule__Conditional__Group_1__1 : rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 ;
    public final void rule__Conditional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6084:1: ( rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 )
            // InternalIoTParser.g:6085:2: rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2
            {
            pushFollow(FOLLOW_47);
            rule__Conditional__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__1"


    // $ANTLR start "rule__Conditional__Group_1__1__Impl"
    // InternalIoTParser.g:6092:1: rule__Conditional__Group_1__1__Impl : ( QuestionMark ) ;
    public final void rule__Conditional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6096:1: ( ( QuestionMark ) )
            // InternalIoTParser.g:6097:1: ( QuestionMark )
            {
            // InternalIoTParser.g:6097:1: ( QuestionMark )
            // InternalIoTParser.g:6098:2: QuestionMark
            {
             before(grammarAccess.getConditionalAccess().getQuestionMarkKeyword_1_1()); 
            match(input,QuestionMark,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getQuestionMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__1__Impl"


    // $ANTLR start "rule__Conditional__Group_1__2"
    // InternalIoTParser.g:6107:1: rule__Conditional__Group_1__2 : rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 ;
    public final void rule__Conditional__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6111:1: ( rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 )
            // InternalIoTParser.g:6112:2: rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__Conditional__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__2"


    // $ANTLR start "rule__Conditional__Group_1__2__Impl"
    // InternalIoTParser.g:6119:1: rule__Conditional__Group_1__2__Impl : ( ( rule__Conditional__CorrectAssignment_1_2 ) ) ;
    public final void rule__Conditional__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6123:1: ( ( ( rule__Conditional__CorrectAssignment_1_2 ) ) )
            // InternalIoTParser.g:6124:1: ( ( rule__Conditional__CorrectAssignment_1_2 ) )
            {
            // InternalIoTParser.g:6124:1: ( ( rule__Conditional__CorrectAssignment_1_2 ) )
            // InternalIoTParser.g:6125:2: ( rule__Conditional__CorrectAssignment_1_2 )
            {
             before(grammarAccess.getConditionalAccess().getCorrectAssignment_1_2()); 
            // InternalIoTParser.g:6126:2: ( rule__Conditional__CorrectAssignment_1_2 )
            // InternalIoTParser.g:6126:3: rule__Conditional__CorrectAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__CorrectAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getCorrectAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__2__Impl"


    // $ANTLR start "rule__Conditional__Group_1__3"
    // InternalIoTParser.g:6134:1: rule__Conditional__Group_1__3 : rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 ;
    public final void rule__Conditional__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6138:1: ( rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 )
            // InternalIoTParser.g:6139:2: rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4
            {
            pushFollow(FOLLOW_47);
            rule__Conditional__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__3"


    // $ANTLR start "rule__Conditional__Group_1__3__Impl"
    // InternalIoTParser.g:6146:1: rule__Conditional__Group_1__3__Impl : ( Colon ) ;
    public final void rule__Conditional__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6150:1: ( ( Colon ) )
            // InternalIoTParser.g:6151:1: ( Colon )
            {
            // InternalIoTParser.g:6151:1: ( Colon )
            // InternalIoTParser.g:6152:2: Colon
            {
             before(grammarAccess.getConditionalAccess().getColonKeyword_1_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getColonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__3__Impl"


    // $ANTLR start "rule__Conditional__Group_1__4"
    // InternalIoTParser.g:6161:1: rule__Conditional__Group_1__4 : rule__Conditional__Group_1__4__Impl ;
    public final void rule__Conditional__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6165:1: ( rule__Conditional__Group_1__4__Impl )
            // InternalIoTParser.g:6166:2: rule__Conditional__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__4"


    // $ANTLR start "rule__Conditional__Group_1__4__Impl"
    // InternalIoTParser.g:6172:1: rule__Conditional__Group_1__4__Impl : ( ( rule__Conditional__IncorrectAssignment_1_4 ) ) ;
    public final void rule__Conditional__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6176:1: ( ( ( rule__Conditional__IncorrectAssignment_1_4 ) ) )
            // InternalIoTParser.g:6177:1: ( ( rule__Conditional__IncorrectAssignment_1_4 ) )
            {
            // InternalIoTParser.g:6177:1: ( ( rule__Conditional__IncorrectAssignment_1_4 ) )
            // InternalIoTParser.g:6178:2: ( rule__Conditional__IncorrectAssignment_1_4 )
            {
             before(grammarAccess.getConditionalAccess().getIncorrectAssignment_1_4()); 
            // InternalIoTParser.g:6179:2: ( rule__Conditional__IncorrectAssignment_1_4 )
            // InternalIoTParser.g:6179:3: rule__Conditional__IncorrectAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__IncorrectAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getIncorrectAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__4__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalIoTParser.g:6188:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6192:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalIoTParser.g:6193:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_60);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalIoTParser.g:6200:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6204:1: ( ( ruleAnd ) )
            // InternalIoTParser.g:6205:1: ( ruleAnd )
            {
            // InternalIoTParser.g:6205:1: ( ruleAnd )
            // InternalIoTParser.g:6206:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalIoTParser.g:6215:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6219:1: ( rule__Or__Group__1__Impl )
            // InternalIoTParser.g:6220:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalIoTParser.g:6226:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )? ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6230:1: ( ( ( rule__Or__Group_1__0 )? ) )
            // InternalIoTParser.g:6231:1: ( ( rule__Or__Group_1__0 )? )
            {
            // InternalIoTParser.g:6231:1: ( ( rule__Or__Group_1__0 )? )
            // InternalIoTParser.g:6232:2: ( rule__Or__Group_1__0 )?
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalIoTParser.g:6233:2: ( rule__Or__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==VerticalLineVerticalLine) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalIoTParser.g:6233:3: rule__Or__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Or__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalIoTParser.g:6242:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6246:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalIoTParser.g:6247:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_60);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalIoTParser.g:6254:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6258:1: ( ( () ) )
            // InternalIoTParser.g:6259:1: ( () )
            {
            // InternalIoTParser.g:6259:1: ( () )
            // InternalIoTParser.g:6260:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalIoTParser.g:6261:2: ()
            // InternalIoTParser.g:6261:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalIoTParser.g:6269:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6273:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalIoTParser.g:6274:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_47);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalIoTParser.g:6281:1: rule__Or__Group_1__1__Impl : ( VerticalLineVerticalLine ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6285:1: ( ( VerticalLineVerticalLine ) )
            // InternalIoTParser.g:6286:1: ( VerticalLineVerticalLine )
            {
            // InternalIoTParser.g:6286:1: ( VerticalLineVerticalLine )
            // InternalIoTParser.g:6287:2: VerticalLineVerticalLine
            {
             before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,VerticalLineVerticalLine,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalIoTParser.g:6296:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6300:1: ( rule__Or__Group_1__2__Impl )
            // InternalIoTParser.g:6301:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalIoTParser.g:6307:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6311:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalIoTParser.g:6312:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalIoTParser.g:6312:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalIoTParser.g:6313:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalIoTParser.g:6314:2: ( rule__Or__RightAssignment_1_2 )
            // InternalIoTParser.g:6314:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalIoTParser.g:6323:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6327:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalIoTParser.g:6328:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalIoTParser.g:6335:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6339:1: ( ( ruleEquality ) )
            // InternalIoTParser.g:6340:1: ( ruleEquality )
            {
            // InternalIoTParser.g:6340:1: ( ruleEquality )
            // InternalIoTParser.g:6341:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalIoTParser.g:6350:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6354:1: ( rule__And__Group__1__Impl )
            // InternalIoTParser.g:6355:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalIoTParser.g:6361:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )? ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6365:1: ( ( ( rule__And__Group_1__0 )? ) )
            // InternalIoTParser.g:6366:1: ( ( rule__And__Group_1__0 )? )
            {
            // InternalIoTParser.g:6366:1: ( ( rule__And__Group_1__0 )? )
            // InternalIoTParser.g:6367:2: ( rule__And__Group_1__0 )?
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalIoTParser.g:6368:2: ( rule__And__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==AmpersandAmpersand) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIoTParser.g:6368:3: rule__And__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalIoTParser.g:6377:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6381:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalIoTParser.g:6382:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_61);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalIoTParser.g:6389:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6393:1: ( ( () ) )
            // InternalIoTParser.g:6394:1: ( () )
            {
            // InternalIoTParser.g:6394:1: ( () )
            // InternalIoTParser.g:6395:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalIoTParser.g:6396:2: ()
            // InternalIoTParser.g:6396:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalIoTParser.g:6404:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6408:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalIoTParser.g:6409:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_47);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalIoTParser.g:6416:1: rule__And__Group_1__1__Impl : ( AmpersandAmpersand ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6420:1: ( ( AmpersandAmpersand ) )
            // InternalIoTParser.g:6421:1: ( AmpersandAmpersand )
            {
            // InternalIoTParser.g:6421:1: ( AmpersandAmpersand )
            // InternalIoTParser.g:6422:2: AmpersandAmpersand
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,AmpersandAmpersand,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalIoTParser.g:6431:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6435:1: ( rule__And__Group_1__2__Impl )
            // InternalIoTParser.g:6436:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalIoTParser.g:6442:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6446:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalIoTParser.g:6447:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalIoTParser.g:6447:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalIoTParser.g:6448:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalIoTParser.g:6449:2: ( rule__And__RightAssignment_1_2 )
            // InternalIoTParser.g:6449:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalIoTParser.g:6458:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6462:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalIoTParser.g:6463:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_62);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalIoTParser.g:6470:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6474:1: ( ( ruleComparison ) )
            // InternalIoTParser.g:6475:1: ( ruleComparison )
            {
            // InternalIoTParser.g:6475:1: ( ruleComparison )
            // InternalIoTParser.g:6476:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalIoTParser.g:6485:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6489:1: ( rule__Equality__Group__1__Impl )
            // InternalIoTParser.g:6490:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalIoTParser.g:6496:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Alternatives_1 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6500:1: ( ( ( rule__Equality__Alternatives_1 )* ) )
            // InternalIoTParser.g:6501:1: ( ( rule__Equality__Alternatives_1 )* )
            {
            // InternalIoTParser.g:6501:1: ( ( rule__Equality__Alternatives_1 )* )
            // InternalIoTParser.g:6502:2: ( rule__Equality__Alternatives_1 )*
            {
             before(grammarAccess.getEqualityAccess().getAlternatives_1()); 
            // InternalIoTParser.g:6503:2: ( rule__Equality__Alternatives_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ExclamationMarkEqualsSign||LA39_0==EqualsSignEqualsSign) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalIoTParser.g:6503:3: rule__Equality__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_63);
            	    rule__Equality__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0__0"
    // InternalIoTParser.g:6512:1: rule__Equality__Group_1_0__0 : rule__Equality__Group_1_0__0__Impl rule__Equality__Group_1_0__1 ;
    public final void rule__Equality__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6516:1: ( rule__Equality__Group_1_0__0__Impl rule__Equality__Group_1_0__1 )
            // InternalIoTParser.g:6517:2: rule__Equality__Group_1_0__0__Impl rule__Equality__Group_1_0__1
            {
            pushFollow(FOLLOW_64);
            rule__Equality__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0__0"


    // $ANTLR start "rule__Equality__Group_1_0__0__Impl"
    // InternalIoTParser.g:6524:1: rule__Equality__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6528:1: ( ( () ) )
            // InternalIoTParser.g:6529:1: ( () )
            {
            // InternalIoTParser.g:6529:1: ( () )
            // InternalIoTParser.g:6530:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0()); 
            // InternalIoTParser.g:6531:2: ()
            // InternalIoTParser.g:6531:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0__1"
    // InternalIoTParser.g:6539:1: rule__Equality__Group_1_0__1 : rule__Equality__Group_1_0__1__Impl rule__Equality__Group_1_0__2 ;
    public final void rule__Equality__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6543:1: ( rule__Equality__Group_1_0__1__Impl rule__Equality__Group_1_0__2 )
            // InternalIoTParser.g:6544:2: rule__Equality__Group_1_0__1__Impl rule__Equality__Group_1_0__2
            {
            pushFollow(FOLLOW_47);
            rule__Equality__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0__1"


    // $ANTLR start "rule__Equality__Group_1_0__1__Impl"
    // InternalIoTParser.g:6551:1: rule__Equality__Group_1_0__1__Impl : ( EqualsSignEqualsSign ) ;
    public final void rule__Equality__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6555:1: ( ( EqualsSignEqualsSign ) )
            // InternalIoTParser.g:6556:1: ( EqualsSignEqualsSign )
            {
            // InternalIoTParser.g:6556:1: ( EqualsSignEqualsSign )
            // InternalIoTParser.g:6557:2: EqualsSignEqualsSign
            {
             before(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1()); 
            match(input,EqualsSignEqualsSign,FOLLOW_2); 
             after(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0__2"
    // InternalIoTParser.g:6566:1: rule__Equality__Group_1_0__2 : rule__Equality__Group_1_0__2__Impl ;
    public final void rule__Equality__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6570:1: ( rule__Equality__Group_1_0__2__Impl )
            // InternalIoTParser.g:6571:2: rule__Equality__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0__2"


    // $ANTLR start "rule__Equality__Group_1_0__2__Impl"
    // InternalIoTParser.g:6577:1: rule__Equality__Group_1_0__2__Impl : ( ( rule__Equality__RightAssignment_1_0_2 ) ) ;
    public final void rule__Equality__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6581:1: ( ( ( rule__Equality__RightAssignment_1_0_2 ) ) )
            // InternalIoTParser.g:6582:1: ( ( rule__Equality__RightAssignment_1_0_2 ) )
            {
            // InternalIoTParser.g:6582:1: ( ( rule__Equality__RightAssignment_1_0_2 ) )
            // InternalIoTParser.g:6583:2: ( rule__Equality__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_0_2()); 
            // InternalIoTParser.g:6584:2: ( rule__Equality__RightAssignment_1_0_2 )
            // InternalIoTParser.g:6584:3: rule__Equality__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0__2__Impl"


    // $ANTLR start "rule__Equality__Group_1_1__0"
    // InternalIoTParser.g:6593:1: rule__Equality__Group_1_1__0 : rule__Equality__Group_1_1__0__Impl rule__Equality__Group_1_1__1 ;
    public final void rule__Equality__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6597:1: ( rule__Equality__Group_1_1__0__Impl rule__Equality__Group_1_1__1 )
            // InternalIoTParser.g:6598:2: rule__Equality__Group_1_1__0__Impl rule__Equality__Group_1_1__1
            {
            pushFollow(FOLLOW_62);
            rule__Equality__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__0"


    // $ANTLR start "rule__Equality__Group_1_1__0__Impl"
    // InternalIoTParser.g:6605:1: rule__Equality__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6609:1: ( ( () ) )
            // InternalIoTParser.g:6610:1: ( () )
            {
            // InternalIoTParser.g:6610:1: ( () )
            // InternalIoTParser.g:6611:2: ()
            {
             before(grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0()); 
            // InternalIoTParser.g:6612:2: ()
            // InternalIoTParser.g:6612:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_1__1"
    // InternalIoTParser.g:6620:1: rule__Equality__Group_1_1__1 : rule__Equality__Group_1_1__1__Impl rule__Equality__Group_1_1__2 ;
    public final void rule__Equality__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6624:1: ( rule__Equality__Group_1_1__1__Impl rule__Equality__Group_1_1__2 )
            // InternalIoTParser.g:6625:2: rule__Equality__Group_1_1__1__Impl rule__Equality__Group_1_1__2
            {
            pushFollow(FOLLOW_47);
            rule__Equality__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__1"


    // $ANTLR start "rule__Equality__Group_1_1__1__Impl"
    // InternalIoTParser.g:6632:1: rule__Equality__Group_1_1__1__Impl : ( ExclamationMarkEqualsSign ) ;
    public final void rule__Equality__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6636:1: ( ( ExclamationMarkEqualsSign ) )
            // InternalIoTParser.g:6637:1: ( ExclamationMarkEqualsSign )
            {
            // InternalIoTParser.g:6637:1: ( ExclamationMarkEqualsSign )
            // InternalIoTParser.g:6638:2: ExclamationMarkEqualsSign
            {
             before(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1()); 
            match(input,ExclamationMarkEqualsSign,FOLLOW_2); 
             after(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_1__2"
    // InternalIoTParser.g:6647:1: rule__Equality__Group_1_1__2 : rule__Equality__Group_1_1__2__Impl ;
    public final void rule__Equality__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6651:1: ( rule__Equality__Group_1_1__2__Impl )
            // InternalIoTParser.g:6652:2: rule__Equality__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__2"


    // $ANTLR start "rule__Equality__Group_1_1__2__Impl"
    // InternalIoTParser.g:6658:1: rule__Equality__Group_1_1__2__Impl : ( ( rule__Equality__RightAssignment_1_1_2 ) ) ;
    public final void rule__Equality__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6662:1: ( ( ( rule__Equality__RightAssignment_1_1_2 ) ) )
            // InternalIoTParser.g:6663:1: ( ( rule__Equality__RightAssignment_1_1_2 ) )
            {
            // InternalIoTParser.g:6663:1: ( ( rule__Equality__RightAssignment_1_1_2 ) )
            // InternalIoTParser.g:6664:2: ( rule__Equality__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_1_2()); 
            // InternalIoTParser.g:6665:2: ( rule__Equality__RightAssignment_1_1_2 )
            // InternalIoTParser.g:6665:3: rule__Equality__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalIoTParser.g:6674:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6678:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalIoTParser.g:6679:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_65);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalIoTParser.g:6686:1: rule__Comparison__Group__0__Impl : ( ruleSubAdd ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6690:1: ( ( ruleSubAdd ) )
            // InternalIoTParser.g:6691:1: ( ruleSubAdd )
            {
            // InternalIoTParser.g:6691:1: ( ruleSubAdd )
            // InternalIoTParser.g:6692:2: ruleSubAdd
            {
             before(grammarAccess.getComparisonAccess().getSubAddParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSubAdd();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getSubAddParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalIoTParser.g:6701:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6705:1: ( rule__Comparison__Group__1__Impl )
            // InternalIoTParser.g:6706:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalIoTParser.g:6712:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Alternatives_1 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6716:1: ( ( ( rule__Comparison__Alternatives_1 )* ) )
            // InternalIoTParser.g:6717:1: ( ( rule__Comparison__Alternatives_1 )* )
            {
            // InternalIoTParser.g:6717:1: ( ( rule__Comparison__Alternatives_1 )* )
            // InternalIoTParser.g:6718:2: ( rule__Comparison__Alternatives_1 )*
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1()); 
            // InternalIoTParser.g:6719:2: ( rule__Comparison__Alternatives_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LessThanSignEqualsSign||LA40_0==GreaterThanSignEqualsSign||LA40_0==LessThanSign||LA40_0==GreaterThanSign) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalIoTParser.g:6719:3: rule__Comparison__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_66);
            	    rule__Comparison__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__0"
    // InternalIoTParser.g:6728:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6732:1: ( rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 )
            // InternalIoTParser.g:6733:2: rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1
            {
            pushFollow(FOLLOW_67);
            rule__Comparison__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0__0__Impl"
    // InternalIoTParser.g:6740:1: rule__Comparison__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6744:1: ( ( () ) )
            // InternalIoTParser.g:6745:1: ( () )
            {
            // InternalIoTParser.g:6745:1: ( () )
            // InternalIoTParser.g:6746:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0()); 
            // InternalIoTParser.g:6747:2: ()
            // InternalIoTParser.g:6747:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__1"
    // InternalIoTParser.g:6755:1: rule__Comparison__Group_1_0__1 : rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2 ;
    public final void rule__Comparison__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6759:1: ( rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2 )
            // InternalIoTParser.g:6760:2: rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2
            {
            pushFollow(FOLLOW_47);
            rule__Comparison__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0__1__Impl"
    // InternalIoTParser.g:6767:1: rule__Comparison__Group_1_0__1__Impl : ( LessThanSign ) ;
    public final void rule__Comparison__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6771:1: ( ( LessThanSign ) )
            // InternalIoTParser.g:6772:1: ( LessThanSign )
            {
            // InternalIoTParser.g:6772:1: ( LessThanSign )
            // InternalIoTParser.g:6773:2: LessThanSign
            {
             before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1()); 
            match(input,LessThanSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__2"
    // InternalIoTParser.g:6782:1: rule__Comparison__Group_1_0__2 : rule__Comparison__Group_1_0__2__Impl ;
    public final void rule__Comparison__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6786:1: ( rule__Comparison__Group_1_0__2__Impl )
            // InternalIoTParser.g:6787:2: rule__Comparison__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__2"


    // $ANTLR start "rule__Comparison__Group_1_0__2__Impl"
    // InternalIoTParser.g:6793:1: rule__Comparison__Group_1_0__2__Impl : ( ( rule__Comparison__RightAssignment_1_0_2 ) ) ;
    public final void rule__Comparison__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6797:1: ( ( ( rule__Comparison__RightAssignment_1_0_2 ) ) )
            // InternalIoTParser.g:6798:1: ( ( rule__Comparison__RightAssignment_1_0_2 ) )
            {
            // InternalIoTParser.g:6798:1: ( ( rule__Comparison__RightAssignment_1_0_2 ) )
            // InternalIoTParser.g:6799:2: ( rule__Comparison__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_0_2()); 
            // InternalIoTParser.g:6800:2: ( rule__Comparison__RightAssignment_1_0_2 )
            // InternalIoTParser.g:6800:3: rule__Comparison__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__2__Impl"


    // $ANTLR start "rule__Comparison__Group_1_1__0"
    // InternalIoTParser.g:6809:1: rule__Comparison__Group_1_1__0 : rule__Comparison__Group_1_1__0__Impl rule__Comparison__Group_1_1__1 ;
    public final void rule__Comparison__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6813:1: ( rule__Comparison__Group_1_1__0__Impl rule__Comparison__Group_1_1__1 )
            // InternalIoTParser.g:6814:2: rule__Comparison__Group_1_1__0__Impl rule__Comparison__Group_1_1__1
            {
            pushFollow(FOLLOW_68);
            rule__Comparison__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_1__0"


    // $ANTLR start "rule__Comparison__Group_1_1__0__Impl"
    // InternalIoTParser.g:6821:1: rule__Comparison__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6825:1: ( ( () ) )
            // InternalIoTParser.g:6826:1: ( () )
            {
            // InternalIoTParser.g:6826:1: ( () )
            // InternalIoTParser.g:6827:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0()); 
            // InternalIoTParser.g:6828:2: ()
            // InternalIoTParser.g:6828:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_1__1"
    // InternalIoTParser.g:6836:1: rule__Comparison__Group_1_1__1 : rule__Comparison__Group_1_1__1__Impl rule__Comparison__Group_1_1__2 ;
    public final void rule__Comparison__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6840:1: ( rule__Comparison__Group_1_1__1__Impl rule__Comparison__Group_1_1__2 )
            // InternalIoTParser.g:6841:2: rule__Comparison__Group_1_1__1__Impl rule__Comparison__Group_1_1__2
            {
            pushFollow(FOLLOW_47);
            rule__Comparison__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_1__1"


    // $ANTLR start "rule__Comparison__Group_1_1__1__Impl"
    // InternalIoTParser.g:6848:1: rule__Comparison__Group_1_1__1__Impl : ( LessThanSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6852:1: ( ( LessThanSignEqualsSign ) )
            // InternalIoTParser.g:6853:1: ( LessThanSignEqualsSign )
            {
            // InternalIoTParser.g:6853:1: ( LessThanSignEqualsSign )
            // InternalIoTParser.g:6854:2: LessThanSignEqualsSign
            {
             before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1_1()); 
            match(input,LessThanSignEqualsSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_1__2"
    // InternalIoTParser.g:6863:1: rule__Comparison__Group_1_1__2 : rule__Comparison__Group_1_1__2__Impl ;
    public final void rule__Comparison__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6867:1: ( rule__Comparison__Group_1_1__2__Impl )
            // InternalIoTParser.g:6868:2: rule__Comparison__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_1__2"


    // $ANTLR start "rule__Comparison__Group_1_1__2__Impl"
    // InternalIoTParser.g:6874:1: rule__Comparison__Group_1_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_1_2 ) ) ;
    public final void rule__Comparison__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6878:1: ( ( ( rule__Comparison__RightAssignment_1_1_2 ) ) )
            // InternalIoTParser.g:6879:1: ( ( rule__Comparison__RightAssignment_1_1_2 ) )
            {
            // InternalIoTParser.g:6879:1: ( ( rule__Comparison__RightAssignment_1_1_2 ) )
            // InternalIoTParser.g:6880:2: ( rule__Comparison__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1_2()); 
            // InternalIoTParser.g:6881:2: ( rule__Comparison__RightAssignment_1_1_2 )
            // InternalIoTParser.g:6881:3: rule__Comparison__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2__0"
    // InternalIoTParser.g:6890:1: rule__Comparison__Group_1_2__0 : rule__Comparison__Group_1_2__0__Impl rule__Comparison__Group_1_2__1 ;
    public final void rule__Comparison__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6894:1: ( rule__Comparison__Group_1_2__0__Impl rule__Comparison__Group_1_2__1 )
            // InternalIoTParser.g:6895:2: rule__Comparison__Group_1_2__0__Impl rule__Comparison__Group_1_2__1
            {
            pushFollow(FOLLOW_69);
            rule__Comparison__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_2__0"


    // $ANTLR start "rule__Comparison__Group_1_2__0__Impl"
    // InternalIoTParser.g:6902:1: rule__Comparison__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6906:1: ( ( () ) )
            // InternalIoTParser.g:6907:1: ( () )
            {
            // InternalIoTParser.g:6907:1: ( () )
            // InternalIoTParser.g:6908:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0()); 
            // InternalIoTParser.g:6909:2: ()
            // InternalIoTParser.g:6909:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2__1"
    // InternalIoTParser.g:6917:1: rule__Comparison__Group_1_2__1 : rule__Comparison__Group_1_2__1__Impl rule__Comparison__Group_1_2__2 ;
    public final void rule__Comparison__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6921:1: ( rule__Comparison__Group_1_2__1__Impl rule__Comparison__Group_1_2__2 )
            // InternalIoTParser.g:6922:2: rule__Comparison__Group_1_2__1__Impl rule__Comparison__Group_1_2__2
            {
            pushFollow(FOLLOW_47);
            rule__Comparison__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_2__1"


    // $ANTLR start "rule__Comparison__Group_1_2__1__Impl"
    // InternalIoTParser.g:6929:1: rule__Comparison__Group_1_2__1__Impl : ( GreaterThanSign ) ;
    public final void rule__Comparison__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6933:1: ( ( GreaterThanSign ) )
            // InternalIoTParser.g:6934:1: ( GreaterThanSign )
            {
            // InternalIoTParser.g:6934:1: ( GreaterThanSign )
            // InternalIoTParser.g:6935:2: GreaterThanSign
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_2_1()); 
            match(input,GreaterThanSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_2__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_2__2"
    // InternalIoTParser.g:6944:1: rule__Comparison__Group_1_2__2 : rule__Comparison__Group_1_2__2__Impl ;
    public final void rule__Comparison__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6948:1: ( rule__Comparison__Group_1_2__2__Impl )
            // InternalIoTParser.g:6949:2: rule__Comparison__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_2__2"


    // $ANTLR start "rule__Comparison__Group_1_2__2__Impl"
    // InternalIoTParser.g:6955:1: rule__Comparison__Group_1_2__2__Impl : ( ( rule__Comparison__RightAssignment_1_2_2 ) ) ;
    public final void rule__Comparison__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6959:1: ( ( ( rule__Comparison__RightAssignment_1_2_2 ) ) )
            // InternalIoTParser.g:6960:1: ( ( rule__Comparison__RightAssignment_1_2_2 ) )
            {
            // InternalIoTParser.g:6960:1: ( ( rule__Comparison__RightAssignment_1_2_2 ) )
            // InternalIoTParser.g:6961:2: ( rule__Comparison__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2_2()); 
            // InternalIoTParser.g:6962:2: ( rule__Comparison__RightAssignment_1_2_2 )
            // InternalIoTParser.g:6962:3: rule__Comparison__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_2__2__Impl"


    // $ANTLR start "rule__Comparison__Group_1_3__0"
    // InternalIoTParser.g:6971:1: rule__Comparison__Group_1_3__0 : rule__Comparison__Group_1_3__0__Impl rule__Comparison__Group_1_3__1 ;
    public final void rule__Comparison__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6975:1: ( rule__Comparison__Group_1_3__0__Impl rule__Comparison__Group_1_3__1 )
            // InternalIoTParser.g:6976:2: rule__Comparison__Group_1_3__0__Impl rule__Comparison__Group_1_3__1
            {
            pushFollow(FOLLOW_65);
            rule__Comparison__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_3__0"


    // $ANTLR start "rule__Comparison__Group_1_3__0__Impl"
    // InternalIoTParser.g:6983:1: rule__Comparison__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:6987:1: ( ( () ) )
            // InternalIoTParser.g:6988:1: ( () )
            {
            // InternalIoTParser.g:6988:1: ( () )
            // InternalIoTParser.g:6989:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0()); 
            // InternalIoTParser.g:6990:2: ()
            // InternalIoTParser.g:6990:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_3__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_3__1"
    // InternalIoTParser.g:6998:1: rule__Comparison__Group_1_3__1 : rule__Comparison__Group_1_3__1__Impl rule__Comparison__Group_1_3__2 ;
    public final void rule__Comparison__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7002:1: ( rule__Comparison__Group_1_3__1__Impl rule__Comparison__Group_1_3__2 )
            // InternalIoTParser.g:7003:2: rule__Comparison__Group_1_3__1__Impl rule__Comparison__Group_1_3__2
            {
            pushFollow(FOLLOW_47);
            rule__Comparison__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_3__1"


    // $ANTLR start "rule__Comparison__Group_1_3__1__Impl"
    // InternalIoTParser.g:7010:1: rule__Comparison__Group_1_3__1__Impl : ( GreaterThanSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7014:1: ( ( GreaterThanSignEqualsSign ) )
            // InternalIoTParser.g:7015:1: ( GreaterThanSignEqualsSign )
            {
            // InternalIoTParser.g:7015:1: ( GreaterThanSignEqualsSign )
            // InternalIoTParser.g:7016:2: GreaterThanSignEqualsSign
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3_1()); 
            match(input,GreaterThanSignEqualsSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_3__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_3__2"
    // InternalIoTParser.g:7025:1: rule__Comparison__Group_1_3__2 : rule__Comparison__Group_1_3__2__Impl ;
    public final void rule__Comparison__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7029:1: ( rule__Comparison__Group_1_3__2__Impl )
            // InternalIoTParser.g:7030:2: rule__Comparison__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_3__2"


    // $ANTLR start "rule__Comparison__Group_1_3__2__Impl"
    // InternalIoTParser.g:7036:1: rule__Comparison__Group_1_3__2__Impl : ( ( rule__Comparison__RightAssignment_1_3_2 ) ) ;
    public final void rule__Comparison__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7040:1: ( ( ( rule__Comparison__RightAssignment_1_3_2 ) ) )
            // InternalIoTParser.g:7041:1: ( ( rule__Comparison__RightAssignment_1_3_2 ) )
            {
            // InternalIoTParser.g:7041:1: ( ( rule__Comparison__RightAssignment_1_3_2 ) )
            // InternalIoTParser.g:7042:2: ( rule__Comparison__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_3_2()); 
            // InternalIoTParser.g:7043:2: ( rule__Comparison__RightAssignment_1_3_2 )
            // InternalIoTParser.g:7043:3: rule__Comparison__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_3__2__Impl"


    // $ANTLR start "rule__SubAdd__Group__0"
    // InternalIoTParser.g:7052:1: rule__SubAdd__Group__0 : rule__SubAdd__Group__0__Impl rule__SubAdd__Group__1 ;
    public final void rule__SubAdd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7056:1: ( rule__SubAdd__Group__0__Impl rule__SubAdd__Group__1 )
            // InternalIoTParser.g:7057:2: rule__SubAdd__Group__0__Impl rule__SubAdd__Group__1
            {
            pushFollow(FOLLOW_70);
            rule__SubAdd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubAdd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group__0"


    // $ANTLR start "rule__SubAdd__Group__0__Impl"
    // InternalIoTParser.g:7064:1: rule__SubAdd__Group__0__Impl : ( ruleMulDiv ) ;
    public final void rule__SubAdd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7068:1: ( ( ruleMulDiv ) )
            // InternalIoTParser.g:7069:1: ( ruleMulDiv )
            {
            // InternalIoTParser.g:7069:1: ( ruleMulDiv )
            // InternalIoTParser.g:7070:2: ruleMulDiv
            {
             before(grammarAccess.getSubAddAccess().getMulDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getSubAddAccess().getMulDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group__0__Impl"


    // $ANTLR start "rule__SubAdd__Group__1"
    // InternalIoTParser.g:7079:1: rule__SubAdd__Group__1 : rule__SubAdd__Group__1__Impl ;
    public final void rule__SubAdd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7083:1: ( rule__SubAdd__Group__1__Impl )
            // InternalIoTParser.g:7084:2: rule__SubAdd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubAdd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group__1"


    // $ANTLR start "rule__SubAdd__Group__1__Impl"
    // InternalIoTParser.g:7090:1: rule__SubAdd__Group__1__Impl : ( ( rule__SubAdd__Alternatives_1 )* ) ;
    public final void rule__SubAdd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7094:1: ( ( ( rule__SubAdd__Alternatives_1 )* ) )
            // InternalIoTParser.g:7095:1: ( ( rule__SubAdd__Alternatives_1 )* )
            {
            // InternalIoTParser.g:7095:1: ( ( rule__SubAdd__Alternatives_1 )* )
            // InternalIoTParser.g:7096:2: ( rule__SubAdd__Alternatives_1 )*
            {
             before(grammarAccess.getSubAddAccess().getAlternatives_1()); 
            // InternalIoTParser.g:7097:2: ( rule__SubAdd__Alternatives_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==PlusSign||LA41_0==HyphenMinus) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalIoTParser.g:7097:3: rule__SubAdd__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_71);
            	    rule__SubAdd__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getSubAddAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group__1__Impl"


    // $ANTLR start "rule__SubAdd__Group_1_0__0"
    // InternalIoTParser.g:7106:1: rule__SubAdd__Group_1_0__0 : rule__SubAdd__Group_1_0__0__Impl rule__SubAdd__Group_1_0__1 ;
    public final void rule__SubAdd__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7110:1: ( rule__SubAdd__Group_1_0__0__Impl rule__SubAdd__Group_1_0__1 )
            // InternalIoTParser.g:7111:2: rule__SubAdd__Group_1_0__0__Impl rule__SubAdd__Group_1_0__1
            {
            pushFollow(FOLLOW_72);
            rule__SubAdd__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubAdd__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_0__0"


    // $ANTLR start "rule__SubAdd__Group_1_0__0__Impl"
    // InternalIoTParser.g:7118:1: rule__SubAdd__Group_1_0__0__Impl : ( () ) ;
    public final void rule__SubAdd__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7122:1: ( ( () ) )
            // InternalIoTParser.g:7123:1: ( () )
            {
            // InternalIoTParser.g:7123:1: ( () )
            // InternalIoTParser.g:7124:2: ()
            {
             before(grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0()); 
            // InternalIoTParser.g:7125:2: ()
            // InternalIoTParser.g:7125:3: 
            {
            }

             after(grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_0__0__Impl"


    // $ANTLR start "rule__SubAdd__Group_1_0__1"
    // InternalIoTParser.g:7133:1: rule__SubAdd__Group_1_0__1 : rule__SubAdd__Group_1_0__1__Impl rule__SubAdd__Group_1_0__2 ;
    public final void rule__SubAdd__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7137:1: ( rule__SubAdd__Group_1_0__1__Impl rule__SubAdd__Group_1_0__2 )
            // InternalIoTParser.g:7138:2: rule__SubAdd__Group_1_0__1__Impl rule__SubAdd__Group_1_0__2
            {
            pushFollow(FOLLOW_47);
            rule__SubAdd__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubAdd__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_0__1"


    // $ANTLR start "rule__SubAdd__Group_1_0__1__Impl"
    // InternalIoTParser.g:7145:1: rule__SubAdd__Group_1_0__1__Impl : ( PlusSign ) ;
    public final void rule__SubAdd__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7149:1: ( ( PlusSign ) )
            // InternalIoTParser.g:7150:1: ( PlusSign )
            {
            // InternalIoTParser.g:7150:1: ( PlusSign )
            // InternalIoTParser.g:7151:2: PlusSign
            {
             before(grammarAccess.getSubAddAccess().getPlusSignKeyword_1_0_1()); 
            match(input,PlusSign,FOLLOW_2); 
             after(grammarAccess.getSubAddAccess().getPlusSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_0__1__Impl"


    // $ANTLR start "rule__SubAdd__Group_1_0__2"
    // InternalIoTParser.g:7160:1: rule__SubAdd__Group_1_0__2 : rule__SubAdd__Group_1_0__2__Impl ;
    public final void rule__SubAdd__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7164:1: ( rule__SubAdd__Group_1_0__2__Impl )
            // InternalIoTParser.g:7165:2: rule__SubAdd__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubAdd__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_0__2"


    // $ANTLR start "rule__SubAdd__Group_1_0__2__Impl"
    // InternalIoTParser.g:7171:1: rule__SubAdd__Group_1_0__2__Impl : ( ( rule__SubAdd__RightAssignment_1_0_2 ) ) ;
    public final void rule__SubAdd__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7175:1: ( ( ( rule__SubAdd__RightAssignment_1_0_2 ) ) )
            // InternalIoTParser.g:7176:1: ( ( rule__SubAdd__RightAssignment_1_0_2 ) )
            {
            // InternalIoTParser.g:7176:1: ( ( rule__SubAdd__RightAssignment_1_0_2 ) )
            // InternalIoTParser.g:7177:2: ( rule__SubAdd__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getSubAddAccess().getRightAssignment_1_0_2()); 
            // InternalIoTParser.g:7178:2: ( rule__SubAdd__RightAssignment_1_0_2 )
            // InternalIoTParser.g:7178:3: rule__SubAdd__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SubAdd__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSubAddAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_0__2__Impl"


    // $ANTLR start "rule__SubAdd__Group_1_1__0"
    // InternalIoTParser.g:7187:1: rule__SubAdd__Group_1_1__0 : rule__SubAdd__Group_1_1__0__Impl rule__SubAdd__Group_1_1__1 ;
    public final void rule__SubAdd__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7191:1: ( rule__SubAdd__Group_1_1__0__Impl rule__SubAdd__Group_1_1__1 )
            // InternalIoTParser.g:7192:2: rule__SubAdd__Group_1_1__0__Impl rule__SubAdd__Group_1_1__1
            {
            pushFollow(FOLLOW_70);
            rule__SubAdd__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubAdd__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_1__0"


    // $ANTLR start "rule__SubAdd__Group_1_1__0__Impl"
    // InternalIoTParser.g:7199:1: rule__SubAdd__Group_1_1__0__Impl : ( () ) ;
    public final void rule__SubAdd__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7203:1: ( ( () ) )
            // InternalIoTParser.g:7204:1: ( () )
            {
            // InternalIoTParser.g:7204:1: ( () )
            // InternalIoTParser.g:7205:2: ()
            {
             before(grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0()); 
            // InternalIoTParser.g:7206:2: ()
            // InternalIoTParser.g:7206:3: 
            {
            }

             after(grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_1__0__Impl"


    // $ANTLR start "rule__SubAdd__Group_1_1__1"
    // InternalIoTParser.g:7214:1: rule__SubAdd__Group_1_1__1 : rule__SubAdd__Group_1_1__1__Impl rule__SubAdd__Group_1_1__2 ;
    public final void rule__SubAdd__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7218:1: ( rule__SubAdd__Group_1_1__1__Impl rule__SubAdd__Group_1_1__2 )
            // InternalIoTParser.g:7219:2: rule__SubAdd__Group_1_1__1__Impl rule__SubAdd__Group_1_1__2
            {
            pushFollow(FOLLOW_47);
            rule__SubAdd__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubAdd__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_1__1"


    // $ANTLR start "rule__SubAdd__Group_1_1__1__Impl"
    // InternalIoTParser.g:7226:1: rule__SubAdd__Group_1_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__SubAdd__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7230:1: ( ( HyphenMinus ) )
            // InternalIoTParser.g:7231:1: ( HyphenMinus )
            {
            // InternalIoTParser.g:7231:1: ( HyphenMinus )
            // InternalIoTParser.g:7232:2: HyphenMinus
            {
             before(grammarAccess.getSubAddAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getSubAddAccess().getHyphenMinusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_1__1__Impl"


    // $ANTLR start "rule__SubAdd__Group_1_1__2"
    // InternalIoTParser.g:7241:1: rule__SubAdd__Group_1_1__2 : rule__SubAdd__Group_1_1__2__Impl ;
    public final void rule__SubAdd__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7245:1: ( rule__SubAdd__Group_1_1__2__Impl )
            // InternalIoTParser.g:7246:2: rule__SubAdd__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubAdd__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_1__2"


    // $ANTLR start "rule__SubAdd__Group_1_1__2__Impl"
    // InternalIoTParser.g:7252:1: rule__SubAdd__Group_1_1__2__Impl : ( ( rule__SubAdd__RightAssignment_1_1_2 ) ) ;
    public final void rule__SubAdd__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7256:1: ( ( ( rule__SubAdd__RightAssignment_1_1_2 ) ) )
            // InternalIoTParser.g:7257:1: ( ( rule__SubAdd__RightAssignment_1_1_2 ) )
            {
            // InternalIoTParser.g:7257:1: ( ( rule__SubAdd__RightAssignment_1_1_2 ) )
            // InternalIoTParser.g:7258:2: ( rule__SubAdd__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getSubAddAccess().getRightAssignment_1_1_2()); 
            // InternalIoTParser.g:7259:2: ( rule__SubAdd__RightAssignment_1_1_2 )
            // InternalIoTParser.g:7259:3: rule__SubAdd__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SubAdd__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSubAddAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__Group_1_1__2__Impl"


    // $ANTLR start "rule__MulDiv__Group__0"
    // InternalIoTParser.g:7268:1: rule__MulDiv__Group__0 : rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 ;
    public final void rule__MulDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7272:1: ( rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 )
            // InternalIoTParser.g:7273:2: rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1
            {
            pushFollow(FOLLOW_73);
            rule__MulDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group__0"


    // $ANTLR start "rule__MulDiv__Group__0__Impl"
    // InternalIoTParser.g:7280:1: rule__MulDiv__Group__0__Impl : ( ruleNegation ) ;
    public final void rule__MulDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7284:1: ( ( ruleNegation ) )
            // InternalIoTParser.g:7285:1: ( ruleNegation )
            {
            // InternalIoTParser.g:7285:1: ( ruleNegation )
            // InternalIoTParser.g:7286:2: ruleNegation
            {
             before(grammarAccess.getMulDivAccess().getNegationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getMulDivAccess().getNegationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group__0__Impl"


    // $ANTLR start "rule__MulDiv__Group__1"
    // InternalIoTParser.g:7295:1: rule__MulDiv__Group__1 : rule__MulDiv__Group__1__Impl ;
    public final void rule__MulDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7299:1: ( rule__MulDiv__Group__1__Impl )
            // InternalIoTParser.g:7300:2: rule__MulDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group__1"


    // $ANTLR start "rule__MulDiv__Group__1__Impl"
    // InternalIoTParser.g:7306:1: rule__MulDiv__Group__1__Impl : ( ( rule__MulDiv__Alternatives_1 )* ) ;
    public final void rule__MulDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7310:1: ( ( ( rule__MulDiv__Alternatives_1 )* ) )
            // InternalIoTParser.g:7311:1: ( ( rule__MulDiv__Alternatives_1 )* )
            {
            // InternalIoTParser.g:7311:1: ( ( rule__MulDiv__Alternatives_1 )* )
            // InternalIoTParser.g:7312:2: ( rule__MulDiv__Alternatives_1 )*
            {
             before(grammarAccess.getMulDivAccess().getAlternatives_1()); 
            // InternalIoTParser.g:7313:2: ( rule__MulDiv__Alternatives_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Asterisk||LA42_0==Solidus) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalIoTParser.g:7313:3: rule__MulDiv__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_74);
            	    rule__MulDiv__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getMulDivAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group__1__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0__0"
    // InternalIoTParser.g:7322:1: rule__MulDiv__Group_1_0__0 : rule__MulDiv__Group_1_0__0__Impl rule__MulDiv__Group_1_0__1 ;
    public final void rule__MulDiv__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7326:1: ( rule__MulDiv__Group_1_0__0__Impl rule__MulDiv__Group_1_0__1 )
            // InternalIoTParser.g:7327:2: rule__MulDiv__Group_1_0__0__Impl rule__MulDiv__Group_1_0__1
            {
            pushFollow(FOLLOW_75);
            rule__MulDiv__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0__0"


    // $ANTLR start "rule__MulDiv__Group_1_0__0__Impl"
    // InternalIoTParser.g:7334:1: rule__MulDiv__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7338:1: ( ( () ) )
            // InternalIoTParser.g:7339:1: ( () )
            {
            // InternalIoTParser.g:7339:1: ( () )
            // InternalIoTParser.g:7340:2: ()
            {
             before(grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0()); 
            // InternalIoTParser.g:7341:2: ()
            // InternalIoTParser.g:7341:3: 
            {
            }

             after(grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0__0__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0__1"
    // InternalIoTParser.g:7349:1: rule__MulDiv__Group_1_0__1 : rule__MulDiv__Group_1_0__1__Impl rule__MulDiv__Group_1_0__2 ;
    public final void rule__MulDiv__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7353:1: ( rule__MulDiv__Group_1_0__1__Impl rule__MulDiv__Group_1_0__2 )
            // InternalIoTParser.g:7354:2: rule__MulDiv__Group_1_0__1__Impl rule__MulDiv__Group_1_0__2
            {
            pushFollow(FOLLOW_47);
            rule__MulDiv__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0__1"


    // $ANTLR start "rule__MulDiv__Group_1_0__1__Impl"
    // InternalIoTParser.g:7361:1: rule__MulDiv__Group_1_0__1__Impl : ( Asterisk ) ;
    public final void rule__MulDiv__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7365:1: ( ( Asterisk ) )
            // InternalIoTParser.g:7366:1: ( Asterisk )
            {
            // InternalIoTParser.g:7366:1: ( Asterisk )
            // InternalIoTParser.g:7367:2: Asterisk
            {
             before(grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_1()); 
            match(input,Asterisk,FOLLOW_2); 
             after(grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0__1__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0__2"
    // InternalIoTParser.g:7376:1: rule__MulDiv__Group_1_0__2 : rule__MulDiv__Group_1_0__2__Impl ;
    public final void rule__MulDiv__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7380:1: ( rule__MulDiv__Group_1_0__2__Impl )
            // InternalIoTParser.g:7381:2: rule__MulDiv__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0__2"


    // $ANTLR start "rule__MulDiv__Group_1_0__2__Impl"
    // InternalIoTParser.g:7387:1: rule__MulDiv__Group_1_0__2__Impl : ( ( rule__MulDiv__RightAssignment_1_0_2 ) ) ;
    public final void rule__MulDiv__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7391:1: ( ( ( rule__MulDiv__RightAssignment_1_0_2 ) ) )
            // InternalIoTParser.g:7392:1: ( ( rule__MulDiv__RightAssignment_1_0_2 ) )
            {
            // InternalIoTParser.g:7392:1: ( ( rule__MulDiv__RightAssignment_1_0_2 ) )
            // InternalIoTParser.g:7393:2: ( rule__MulDiv__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMulDivAccess().getRightAssignment_1_0_2()); 
            // InternalIoTParser.g:7394:2: ( rule__MulDiv__RightAssignment_1_0_2 )
            // InternalIoTParser.g:7394:3: rule__MulDiv__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMulDivAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0__2__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_1__0"
    // InternalIoTParser.g:7403:1: rule__MulDiv__Group_1_1__0 : rule__MulDiv__Group_1_1__0__Impl rule__MulDiv__Group_1_1__1 ;
    public final void rule__MulDiv__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7407:1: ( rule__MulDiv__Group_1_1__0__Impl rule__MulDiv__Group_1_1__1 )
            // InternalIoTParser.g:7408:2: rule__MulDiv__Group_1_1__0__Impl rule__MulDiv__Group_1_1__1
            {
            pushFollow(FOLLOW_73);
            rule__MulDiv__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_1__0"


    // $ANTLR start "rule__MulDiv__Group_1_1__0__Impl"
    // InternalIoTParser.g:7415:1: rule__MulDiv__Group_1_1__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7419:1: ( ( () ) )
            // InternalIoTParser.g:7420:1: ( () )
            {
            // InternalIoTParser.g:7420:1: ( () )
            // InternalIoTParser.g:7421:2: ()
            {
             before(grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0()); 
            // InternalIoTParser.g:7422:2: ()
            // InternalIoTParser.g:7422:3: 
            {
            }

             after(grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_1__0__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_1__1"
    // InternalIoTParser.g:7430:1: rule__MulDiv__Group_1_1__1 : rule__MulDiv__Group_1_1__1__Impl rule__MulDiv__Group_1_1__2 ;
    public final void rule__MulDiv__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7434:1: ( rule__MulDiv__Group_1_1__1__Impl rule__MulDiv__Group_1_1__2 )
            // InternalIoTParser.g:7435:2: rule__MulDiv__Group_1_1__1__Impl rule__MulDiv__Group_1_1__2
            {
            pushFollow(FOLLOW_47);
            rule__MulDiv__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_1__1"


    // $ANTLR start "rule__MulDiv__Group_1_1__1__Impl"
    // InternalIoTParser.g:7442:1: rule__MulDiv__Group_1_1__1__Impl : ( Solidus ) ;
    public final void rule__MulDiv__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7446:1: ( ( Solidus ) )
            // InternalIoTParser.g:7447:1: ( Solidus )
            {
            // InternalIoTParser.g:7447:1: ( Solidus )
            // InternalIoTParser.g:7448:2: Solidus
            {
             before(grammarAccess.getMulDivAccess().getSolidusKeyword_1_1_1()); 
            match(input,Solidus,FOLLOW_2); 
             after(grammarAccess.getMulDivAccess().getSolidusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_1__1__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_1__2"
    // InternalIoTParser.g:7457:1: rule__MulDiv__Group_1_1__2 : rule__MulDiv__Group_1_1__2__Impl ;
    public final void rule__MulDiv__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7461:1: ( rule__MulDiv__Group_1_1__2__Impl )
            // InternalIoTParser.g:7462:2: rule__MulDiv__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_1__2"


    // $ANTLR start "rule__MulDiv__Group_1_1__2__Impl"
    // InternalIoTParser.g:7468:1: rule__MulDiv__Group_1_1__2__Impl : ( ( rule__MulDiv__RightAssignment_1_1_2 ) ) ;
    public final void rule__MulDiv__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7472:1: ( ( ( rule__MulDiv__RightAssignment_1_1_2 ) ) )
            // InternalIoTParser.g:7473:1: ( ( rule__MulDiv__RightAssignment_1_1_2 ) )
            {
            // InternalIoTParser.g:7473:1: ( ( rule__MulDiv__RightAssignment_1_1_2 ) )
            // InternalIoTParser.g:7474:2: ( rule__MulDiv__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMulDivAccess().getRightAssignment_1_1_2()); 
            // InternalIoTParser.g:7475:2: ( rule__MulDiv__RightAssignment_1_1_2 )
            // InternalIoTParser.g:7475:3: rule__MulDiv__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulDivAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_1__2__Impl"


    // $ANTLR start "rule__Negation__Group_0__0"
    // InternalIoTParser.g:7484:1: rule__Negation__Group_0__0 : rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 ;
    public final void rule__Negation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7488:1: ( rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 )
            // InternalIoTParser.g:7489:2: rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1
            {
            pushFollow(FOLLOW_76);
            rule__Negation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__0"


    // $ANTLR start "rule__Negation__Group_0__0__Impl"
    // InternalIoTParser.g:7496:1: rule__Negation__Group_0__0__Impl : ( () ) ;
    public final void rule__Negation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7500:1: ( ( () ) )
            // InternalIoTParser.g:7501:1: ( () )
            {
            // InternalIoTParser.g:7501:1: ( () )
            // InternalIoTParser.g:7502:2: ()
            {
             before(grammarAccess.getNegationAccess().getNegationAction_0_0()); 
            // InternalIoTParser.g:7503:2: ()
            // InternalIoTParser.g:7503:3: 
            {
            }

             after(grammarAccess.getNegationAccess().getNegationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__0__Impl"


    // $ANTLR start "rule__Negation__Group_0__1"
    // InternalIoTParser.g:7511:1: rule__Negation__Group_0__1 : rule__Negation__Group_0__1__Impl rule__Negation__Group_0__2 ;
    public final void rule__Negation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7515:1: ( rule__Negation__Group_0__1__Impl rule__Negation__Group_0__2 )
            // InternalIoTParser.g:7516:2: rule__Negation__Group_0__1__Impl rule__Negation__Group_0__2
            {
            pushFollow(FOLLOW_47);
            rule__Negation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__1"


    // $ANTLR start "rule__Negation__Group_0__1__Impl"
    // InternalIoTParser.g:7523:1: rule__Negation__Group_0__1__Impl : ( HyphenMinus ) ;
    public final void rule__Negation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7527:1: ( ( HyphenMinus ) )
            // InternalIoTParser.g:7528:1: ( HyphenMinus )
            {
            // InternalIoTParser.g:7528:1: ( HyphenMinus )
            // InternalIoTParser.g:7529:2: HyphenMinus
            {
             before(grammarAccess.getNegationAccess().getHyphenMinusKeyword_0_1()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getHyphenMinusKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__1__Impl"


    // $ANTLR start "rule__Negation__Group_0__2"
    // InternalIoTParser.g:7538:1: rule__Negation__Group_0__2 : rule__Negation__Group_0__2__Impl ;
    public final void rule__Negation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7542:1: ( rule__Negation__Group_0__2__Impl )
            // InternalIoTParser.g:7543:2: rule__Negation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__2"


    // $ANTLR start "rule__Negation__Group_0__2__Impl"
    // InternalIoTParser.g:7549:1: rule__Negation__Group_0__2__Impl : ( ( rule__Negation__ValueAssignment_0_2 ) ) ;
    public final void rule__Negation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7553:1: ( ( ( rule__Negation__ValueAssignment_0_2 ) ) )
            // InternalIoTParser.g:7554:1: ( ( rule__Negation__ValueAssignment_0_2 ) )
            {
            // InternalIoTParser.g:7554:1: ( ( rule__Negation__ValueAssignment_0_2 ) )
            // InternalIoTParser.g:7555:2: ( rule__Negation__ValueAssignment_0_2 )
            {
             before(grammarAccess.getNegationAccess().getValueAssignment_0_2()); 
            // InternalIoTParser.g:7556:2: ( rule__Negation__ValueAssignment_0_2 )
            // InternalIoTParser.g:7556:3: rule__Negation__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Negation__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__2__Impl"


    // $ANTLR start "rule__Exponent__Group__0"
    // InternalIoTParser.g:7565:1: rule__Exponent__Group__0 : rule__Exponent__Group__0__Impl rule__Exponent__Group__1 ;
    public final void rule__Exponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7569:1: ( rule__Exponent__Group__0__Impl rule__Exponent__Group__1 )
            // InternalIoTParser.g:7570:2: rule__Exponent__Group__0__Impl rule__Exponent__Group__1
            {
            pushFollow(FOLLOW_77);
            rule__Exponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__0"


    // $ANTLR start "rule__Exponent__Group__0__Impl"
    // InternalIoTParser.g:7577:1: rule__Exponent__Group__0__Impl : ( ruleNot ) ;
    public final void rule__Exponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7581:1: ( ( ruleNot ) )
            // InternalIoTParser.g:7582:1: ( ruleNot )
            {
            // InternalIoTParser.g:7582:1: ( ruleNot )
            // InternalIoTParser.g:7583:2: ruleNot
            {
             before(grammarAccess.getExponentAccess().getNotParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getExponentAccess().getNotParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__0__Impl"


    // $ANTLR start "rule__Exponent__Group__1"
    // InternalIoTParser.g:7592:1: rule__Exponent__Group__1 : rule__Exponent__Group__1__Impl ;
    public final void rule__Exponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7596:1: ( rule__Exponent__Group__1__Impl )
            // InternalIoTParser.g:7597:2: rule__Exponent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__1"


    // $ANTLR start "rule__Exponent__Group__1__Impl"
    // InternalIoTParser.g:7603:1: rule__Exponent__Group__1__Impl : ( ( rule__Exponent__Group_1__0 )? ) ;
    public final void rule__Exponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7607:1: ( ( ( rule__Exponent__Group_1__0 )? ) )
            // InternalIoTParser.g:7608:1: ( ( rule__Exponent__Group_1__0 )? )
            {
            // InternalIoTParser.g:7608:1: ( ( rule__Exponent__Group_1__0 )? )
            // InternalIoTParser.g:7609:2: ( rule__Exponent__Group_1__0 )?
            {
             before(grammarAccess.getExponentAccess().getGroup_1()); 
            // InternalIoTParser.g:7610:2: ( rule__Exponent__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AsteriskAsterisk) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalIoTParser.g:7610:3: rule__Exponent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exponent__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExponentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group__1__Impl"


    // $ANTLR start "rule__Exponent__Group_1__0"
    // InternalIoTParser.g:7619:1: rule__Exponent__Group_1__0 : rule__Exponent__Group_1__0__Impl rule__Exponent__Group_1__1 ;
    public final void rule__Exponent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7623:1: ( rule__Exponent__Group_1__0__Impl rule__Exponent__Group_1__1 )
            // InternalIoTParser.g:7624:2: rule__Exponent__Group_1__0__Impl rule__Exponent__Group_1__1
            {
            pushFollow(FOLLOW_77);
            rule__Exponent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exponent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group_1__0"


    // $ANTLR start "rule__Exponent__Group_1__0__Impl"
    // InternalIoTParser.g:7631:1: rule__Exponent__Group_1__0__Impl : ( () ) ;
    public final void rule__Exponent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7635:1: ( ( () ) )
            // InternalIoTParser.g:7636:1: ( () )
            {
            // InternalIoTParser.g:7636:1: ( () )
            // InternalIoTParser.g:7637:2: ()
            {
             before(grammarAccess.getExponentAccess().getExponentBaseAction_1_0()); 
            // InternalIoTParser.g:7638:2: ()
            // InternalIoTParser.g:7638:3: 
            {
            }

             after(grammarAccess.getExponentAccess().getExponentBaseAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group_1__0__Impl"


    // $ANTLR start "rule__Exponent__Group_1__1"
    // InternalIoTParser.g:7646:1: rule__Exponent__Group_1__1 : rule__Exponent__Group_1__1__Impl rule__Exponent__Group_1__2 ;
    public final void rule__Exponent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7650:1: ( rule__Exponent__Group_1__1__Impl rule__Exponent__Group_1__2 )
            // InternalIoTParser.g:7651:2: rule__Exponent__Group_1__1__Impl rule__Exponent__Group_1__2
            {
            pushFollow(FOLLOW_47);
            rule__Exponent__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exponent__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group_1__1"


    // $ANTLR start "rule__Exponent__Group_1__1__Impl"
    // InternalIoTParser.g:7658:1: rule__Exponent__Group_1__1__Impl : ( AsteriskAsterisk ) ;
    public final void rule__Exponent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7662:1: ( ( AsteriskAsterisk ) )
            // InternalIoTParser.g:7663:1: ( AsteriskAsterisk )
            {
            // InternalIoTParser.g:7663:1: ( AsteriskAsterisk )
            // InternalIoTParser.g:7664:2: AsteriskAsterisk
            {
             before(grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1()); 
            match(input,AsteriskAsterisk,FOLLOW_2); 
             after(grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group_1__1__Impl"


    // $ANTLR start "rule__Exponent__Group_1__2"
    // InternalIoTParser.g:7673:1: rule__Exponent__Group_1__2 : rule__Exponent__Group_1__2__Impl ;
    public final void rule__Exponent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7677:1: ( rule__Exponent__Group_1__2__Impl )
            // InternalIoTParser.g:7678:2: rule__Exponent__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group_1__2"


    // $ANTLR start "rule__Exponent__Group_1__2__Impl"
    // InternalIoTParser.g:7684:1: rule__Exponent__Group_1__2__Impl : ( ( rule__Exponent__PowerAssignment_1_2 ) ) ;
    public final void rule__Exponent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7688:1: ( ( ( rule__Exponent__PowerAssignment_1_2 ) ) )
            // InternalIoTParser.g:7689:1: ( ( rule__Exponent__PowerAssignment_1_2 ) )
            {
            // InternalIoTParser.g:7689:1: ( ( rule__Exponent__PowerAssignment_1_2 ) )
            // InternalIoTParser.g:7690:2: ( rule__Exponent__PowerAssignment_1_2 )
            {
             before(grammarAccess.getExponentAccess().getPowerAssignment_1_2()); 
            // InternalIoTParser.g:7691:2: ( rule__Exponent__PowerAssignment_1_2 )
            // InternalIoTParser.g:7691:3: rule__Exponent__PowerAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Exponent__PowerAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExponentAccess().getPowerAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__Group_1__2__Impl"


    // $ANTLR start "rule__Not__Group_0__0"
    // InternalIoTParser.g:7700:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7704:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // InternalIoTParser.g:7705:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_78);
            rule__Not__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__0"


    // $ANTLR start "rule__Not__Group_0__0__Impl"
    // InternalIoTParser.g:7712:1: rule__Not__Group_0__0__Impl : ( () ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7716:1: ( ( () ) )
            // InternalIoTParser.g:7717:1: ( () )
            {
            // InternalIoTParser.g:7717:1: ( () )
            // InternalIoTParser.g:7718:2: ()
            {
             before(grammarAccess.getNotAccess().getNotAction_0_0()); 
            // InternalIoTParser.g:7719:2: ()
            // InternalIoTParser.g:7719:3: 
            {
            }

             after(grammarAccess.getNotAccess().getNotAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__0__Impl"


    // $ANTLR start "rule__Not__Group_0__1"
    // InternalIoTParser.g:7727:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl rule__Not__Group_0__2 ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7731:1: ( rule__Not__Group_0__1__Impl rule__Not__Group_0__2 )
            // InternalIoTParser.g:7732:2: rule__Not__Group_0__1__Impl rule__Not__Group_0__2
            {
            pushFollow(FOLLOW_47);
            rule__Not__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__1"


    // $ANTLR start "rule__Not__Group_0__1__Impl"
    // InternalIoTParser.g:7739:1: rule__Not__Group_0__1__Impl : ( ExclamationMark ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7743:1: ( ( ExclamationMark ) )
            // InternalIoTParser.g:7744:1: ( ExclamationMark )
            {
            // InternalIoTParser.g:7744:1: ( ExclamationMark )
            // InternalIoTParser.g:7745:2: ExclamationMark
            {
             before(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_1()); 
            match(input,ExclamationMark,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__1__Impl"


    // $ANTLR start "rule__Not__Group_0__2"
    // InternalIoTParser.g:7754:1: rule__Not__Group_0__2 : rule__Not__Group_0__2__Impl ;
    public final void rule__Not__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7758:1: ( rule__Not__Group_0__2__Impl )
            // InternalIoTParser.g:7759:2: rule__Not__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__2"


    // $ANTLR start "rule__Not__Group_0__2__Impl"
    // InternalIoTParser.g:7765:1: rule__Not__Group_0__2__Impl : ( ( rule__Not__ValueAssignment_0_2 ) ) ;
    public final void rule__Not__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7769:1: ( ( ( rule__Not__ValueAssignment_0_2 ) ) )
            // InternalIoTParser.g:7770:1: ( ( rule__Not__ValueAssignment_0_2 ) )
            {
            // InternalIoTParser.g:7770:1: ( ( rule__Not__ValueAssignment_0_2 ) )
            // InternalIoTParser.g:7771:2: ( rule__Not__ValueAssignment_0_2 )
            {
             before(grammarAccess.getNotAccess().getValueAssignment_0_2()); 
            // InternalIoTParser.g:7772:2: ( rule__Not__ValueAssignment_0_2 )
            // InternalIoTParser.g:7772:3: rule__Not__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Not__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalIoTParser.g:7781:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7785:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalIoTParser.g:7786:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_47);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalIoTParser.g:7793:1: rule__Primary__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7797:1: ( ( LeftParenthesis ) )
            // InternalIoTParser.g:7798:1: ( LeftParenthesis )
            {
            // InternalIoTParser.g:7798:1: ( LeftParenthesis )
            // InternalIoTParser.g:7799:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalIoTParser.g:7808:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7812:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalIoTParser.g:7813:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_79);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalIoTParser.g:7820:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7824:1: ( ( ruleExpression ) )
            // InternalIoTParser.g:7825:1: ( ruleExpression )
            {
            // InternalIoTParser.g:7825:1: ( ruleExpression )
            // InternalIoTParser.g:7826:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalIoTParser.g:7835:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7839:1: ( rule__Primary__Group_0__2__Impl )
            // InternalIoTParser.g:7840:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalIoTParser.g:7846:1: rule__Primary__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7850:1: ( ( RightParenthesis ) )
            // InternalIoTParser.g:7851:1: ( RightParenthesis )
            {
            // InternalIoTParser.g:7851:1: ( RightParenthesis )
            // InternalIoTParser.g:7852:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Model__IncludeAssignment_0"
    // InternalIoTParser.g:7862:1: rule__Model__IncludeAssignment_0 : ( ruleInclude ) ;
    public final void rule__Model__IncludeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7866:1: ( ( ruleInclude ) )
            // InternalIoTParser.g:7867:2: ( ruleInclude )
            {
            // InternalIoTParser.g:7867:2: ( ruleInclude )
            // InternalIoTParser.g:7868:3: ruleInclude
            {
             before(grammarAccess.getModelAccess().getIncludeIncludeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getModelAccess().getIncludeIncludeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__IncludeAssignment_0"


    // $ANTLR start "rule__Model__ChannelAssignment_1"
    // InternalIoTParser.g:7877:1: rule__Model__ChannelAssignment_1 : ( ruleChannel ) ;
    public final void rule__Model__ChannelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7881:1: ( ( ruleChannel ) )
            // InternalIoTParser.g:7882:2: ( ruleChannel )
            {
            // InternalIoTParser.g:7882:2: ( ruleChannel )
            // InternalIoTParser.g:7883:3: ruleChannel
            {
             before(grammarAccess.getModelAccess().getChannelChannelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getChannelChannelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ChannelAssignment_1"


    // $ANTLR start "rule__Model__AbstractBoardAssignment_2"
    // InternalIoTParser.g:7892:1: rule__Model__AbstractBoardAssignment_2 : ( ruleAbstractBoard ) ;
    public final void rule__Model__AbstractBoardAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7896:1: ( ( ruleAbstractBoard ) )
            // InternalIoTParser.g:7897:2: ( ruleAbstractBoard )
            {
            // InternalIoTParser.g:7897:2: ( ruleAbstractBoard )
            // InternalIoTParser.g:7898:3: ruleAbstractBoard
            {
             before(grammarAccess.getModelAccess().getAbstractBoardAbstractBoardParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractBoard();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAbstractBoardAbstractBoardParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AbstractBoardAssignment_2"


    // $ANTLR start "rule__Model__BoardAssignment_3"
    // InternalIoTParser.g:7907:1: rule__Model__BoardAssignment_3 : ( ruleBoard ) ;
    public final void rule__Model__BoardAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7911:1: ( ( ruleBoard ) )
            // InternalIoTParser.g:7912:2: ( ruleBoard )
            {
            // InternalIoTParser.g:7912:2: ( ruleBoard )
            // InternalIoTParser.g:7913:3: ruleBoard
            {
             before(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BoardAssignment_3"


    // $ANTLR start "rule__Include__PathAssignment_1"
    // InternalIoTParser.g:7922:1: rule__Include__PathAssignment_1 : ( RULE_ID ) ;
    public final void rule__Include__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7926:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:7927:2: ( RULE_ID )
            {
            // InternalIoTParser.g:7927:2: ( RULE_ID )
            // InternalIoTParser.g:7928:3: RULE_ID
            {
             before(grammarAccess.getIncludeAccess().getPathIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getPathIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__PathAssignment_1"


    // $ANTLR start "rule__Include__PathAssignment_2_1"
    // InternalIoTParser.g:7937:1: rule__Include__PathAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Include__PathAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7941:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:7942:2: ( RULE_ID )
            {
            // InternalIoTParser.g:7942:2: ( RULE_ID )
            // InternalIoTParser.g:7943:3: RULE_ID
            {
             before(grammarAccess.getIncludeAccess().getPathIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getPathIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__PathAssignment_2_1"


    // $ANTLR start "rule__Channel__ChanneltypeAssignment_1"
    // InternalIoTParser.g:7952:1: rule__Channel__ChanneltypeAssignment_1 : ( ruleChannelType ) ;
    public final void rule__Channel__ChanneltypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7956:1: ( ( ruleChannelType ) )
            // InternalIoTParser.g:7957:2: ( ruleChannelType )
            {
            // InternalIoTParser.g:7957:2: ( ruleChannelType )
            // InternalIoTParser.g:7958:3: ruleChannelType
            {
             before(grammarAccess.getChannelAccess().getChanneltypeChannelTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChannelType();

            state._fsp--;

             after(grammarAccess.getChannelAccess().getChanneltypeChannelTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__ChanneltypeAssignment_1"


    // $ANTLR start "rule__Channel__NameAssignment_2"
    // InternalIoTParser.g:7967:1: rule__Channel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Channel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7971:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:7972:2: ( RULE_ID )
            {
            // InternalIoTParser.g:7972:2: ( RULE_ID )
            // InternalIoTParser.g:7973:3: RULE_ID
            {
             before(grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__NameAssignment_2"


    // $ANTLR start "rule__Channel__ConfigAssignment_3_2"
    // InternalIoTParser.g:7982:1: rule__Channel__ConfigAssignment_3_2 : ( ruleChannelConfig ) ;
    public final void rule__Channel__ConfigAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:7986:1: ( ( ruleChannelConfig ) )
            // InternalIoTParser.g:7987:2: ( ruleChannelConfig )
            {
            // InternalIoTParser.g:7987:2: ( ruleChannelConfig )
            // InternalIoTParser.g:7988:3: ruleChannelConfig
            {
             before(grammarAccess.getChannelAccess().getConfigChannelConfigParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChannelConfig();

            state._fsp--;

             after(grammarAccess.getChannelAccess().getConfigChannelConfigParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__ConfigAssignment_3_2"


    // $ANTLR start "rule__Wifi__SsidAssignment_1"
    // InternalIoTParser.g:7997:1: rule__Wifi__SsidAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Wifi__SsidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8001:1: ( ( RULE_STRING ) )
            // InternalIoTParser.g:8002:2: ( RULE_STRING )
            {
            // InternalIoTParser.g:8002:2: ( RULE_STRING )
            // InternalIoTParser.g:8003:3: RULE_STRING
            {
             before(grammarAccess.getWifiAccess().getSsidSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWifiAccess().getSsidSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__SsidAssignment_1"


    // $ANTLR start "rule__Wifi__PassAssignment_3"
    // InternalIoTParser.g:8012:1: rule__Wifi__PassAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Wifi__PassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8016:1: ( ( RULE_STRING ) )
            // InternalIoTParser.g:8017:2: ( RULE_STRING )
            {
            // InternalIoTParser.g:8017:2: ( RULE_STRING )
            // InternalIoTParser.g:8018:3: RULE_STRING
            {
             before(grammarAccess.getWifiAccess().getPassSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWifiAccess().getPassSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wifi__PassAssignment_3"


    // $ANTLR start "rule__Serial__BaudAssignment_1"
    // InternalIoTParser.g:8027:1: rule__Serial__BaudAssignment_1 : ( RULE_INT ) ;
    public final void rule__Serial__BaudAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8031:1: ( ( RULE_INT ) )
            // InternalIoTParser.g:8032:2: ( RULE_INT )
            {
            // InternalIoTParser.g:8032:2: ( RULE_INT )
            // InternalIoTParser.g:8033:3: RULE_INT
            {
             before(grammarAccess.getSerialAccess().getBaudINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSerialAccess().getBaudINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__BaudAssignment_1"


    // $ANTLR start "rule__Serial__StopAssignment_3"
    // InternalIoTParser.g:8042:1: rule__Serial__StopAssignment_3 : ( rulestopChar ) ;
    public final void rule__Serial__StopAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8046:1: ( ( rulestopChar ) )
            // InternalIoTParser.g:8047:2: ( rulestopChar )
            {
            // InternalIoTParser.g:8047:2: ( rulestopChar )
            // InternalIoTParser.g:8048:3: rulestopChar
            {
             before(grammarAccess.getSerialAccess().getStopStopCharParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulestopChar();

            state._fsp--;

             after(grammarAccess.getSerialAccess().getStopStopCharParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Serial__StopAssignment_3"


    // $ANTLR start "rule__StopChar__NameAssignment_0_2"
    // InternalIoTParser.g:8057:1: rule__StopChar__NameAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__StopChar__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8061:1: ( ( RULE_STRING ) )
            // InternalIoTParser.g:8062:2: ( RULE_STRING )
            {
            // InternalIoTParser.g:8062:2: ( RULE_STRING )
            // InternalIoTParser.g:8063:3: RULE_STRING
            {
             before(grammarAccess.getStopCharAccess().getNameSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStopCharAccess().getNameSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__NameAssignment_0_2"


    // $ANTLR start "rule__StopChar__NameAssignment_1_2"
    // InternalIoTParser.g:8072:1: rule__StopChar__NameAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__StopChar__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8076:1: ( ( RULE_INT ) )
            // InternalIoTParser.g:8077:2: ( RULE_INT )
            {
            // InternalIoTParser.g:8077:2: ( RULE_INT )
            // InternalIoTParser.g:8078:3: RULE_INT
            {
             before(grammarAccess.getStopCharAccess().getNameINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStopCharAccess().getNameINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopChar__NameAssignment_1_2"


    // $ANTLR start "rule__MqttClient__BrokerAssignment_1"
    // InternalIoTParser.g:8087:1: rule__MqttClient__BrokerAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MqttClient__BrokerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8091:1: ( ( RULE_STRING ) )
            // InternalIoTParser.g:8092:2: ( RULE_STRING )
            {
            // InternalIoTParser.g:8092:2: ( RULE_STRING )
            // InternalIoTParser.g:8093:3: RULE_STRING
            {
             before(grammarAccess.getMqttClientAccess().getBrokerSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getBrokerSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__BrokerAssignment_1"


    // $ANTLR start "rule__MqttClient__ClientAssignment_3"
    // InternalIoTParser.g:8102:1: rule__MqttClient__ClientAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MqttClient__ClientAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8106:1: ( ( RULE_STRING ) )
            // InternalIoTParser.g:8107:2: ( RULE_STRING )
            {
            // InternalIoTParser.g:8107:2: ( RULE_STRING )
            // InternalIoTParser.g:8108:3: RULE_STRING
            {
             before(grammarAccess.getMqttClientAccess().getClientSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getClientSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__ClientAssignment_3"


    // $ANTLR start "rule__MqttClient__SubAssignment_4_2"
    // InternalIoTParser.g:8117:1: rule__MqttClient__SubAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__MqttClient__SubAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8121:1: ( ( RULE_STRING ) )
            // InternalIoTParser.g:8122:2: ( RULE_STRING )
            {
            // InternalIoTParser.g:8122:2: ( RULE_STRING )
            // InternalIoTParser.g:8123:3: RULE_STRING
            {
             before(grammarAccess.getMqttClientAccess().getSubSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getSubSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__SubAssignment_4_2"


    // $ANTLR start "rule__MqttClient__SubAssignment_4_3_1"
    // InternalIoTParser.g:8132:1: rule__MqttClient__SubAssignment_4_3_1 : ( RULE_STRING ) ;
    public final void rule__MqttClient__SubAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8136:1: ( ( RULE_STRING ) )
            // InternalIoTParser.g:8137:2: ( RULE_STRING )
            {
            // InternalIoTParser.g:8137:2: ( RULE_STRING )
            // InternalIoTParser.g:8138:3: RULE_STRING
            {
             before(grammarAccess.getMqttClientAccess().getSubSTRINGTerminalRuleCall_4_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqttClientAccess().getSubSTRINGTerminalRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MqttClient__SubAssignment_4_3_1"


    // $ANTLR start "rule__NewBoard__NameAssignment_0"
    // InternalIoTParser.g:8147:1: rule__NewBoard__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NewBoard__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8151:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8152:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8152:2: ( RULE_ID )
            // InternalIoTParser.g:8153:3: RULE_ID
            {
             before(grammarAccess.getNewBoardAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewBoardAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__NameAssignment_0"


    // $ANTLR start "rule__NewBoard__VersionAssignment_3"
    // InternalIoTParser.g:8162:1: rule__NewBoard__VersionAssignment_3 : ( ruleBoardVersion ) ;
    public final void rule__NewBoard__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8166:1: ( ( ruleBoardVersion ) )
            // InternalIoTParser.g:8167:2: ( ruleBoardVersion )
            {
            // InternalIoTParser.g:8167:2: ( ruleBoardVersion )
            // InternalIoTParser.g:8168:3: ruleBoardVersion
            {
             before(grammarAccess.getNewBoardAccess().getVersionBoardVersionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBoardVersion();

            state._fsp--;

             after(grammarAccess.getNewBoardAccess().getVersionBoardVersionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__VersionAssignment_3"


    // $ANTLR start "rule__NewBoard__SensorsAssignment_4"
    // InternalIoTParser.g:8177:1: rule__NewBoard__SensorsAssignment_4 : ( ruleSensor ) ;
    public final void rule__NewBoard__SensorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8181:1: ( ( ruleSensor ) )
            // InternalIoTParser.g:8182:2: ( ruleSensor )
            {
            // InternalIoTParser.g:8182:2: ( ruleSensor )
            // InternalIoTParser.g:8183:3: ruleSensor
            {
             before(grammarAccess.getNewBoardAccess().getSensorsSensorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getNewBoardAccess().getSensorsSensorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewBoard__SensorsAssignment_4"


    // $ANTLR start "rule__BoardVersion__TypeAssignment_1"
    // InternalIoTParser.g:8192:1: rule__BoardVersion__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__BoardVersion__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8196:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8197:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8197:2: ( RULE_ID )
            // InternalIoTParser.g:8198:3: RULE_ID
            {
             before(grammarAccess.getBoardVersionAccess().getTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoardVersionAccess().getTypeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__TypeAssignment_1"


    // $ANTLR start "rule__BoardVersion__ModelAssignment_3"
    // InternalIoTParser.g:8207:1: rule__BoardVersion__ModelAssignment_3 : ( RULE_ID ) ;
    public final void rule__BoardVersion__ModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8211:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8212:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8212:2: ( RULE_ID )
            // InternalIoTParser.g:8213:3: RULE_ID
            {
             before(grammarAccess.getBoardVersionAccess().getModelIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoardVersionAccess().getModelIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoardVersion__ModelAssignment_3"


    // $ANTLR start "rule__ExtendsBoard__NameAssignment_0"
    // InternalIoTParser.g:8222:1: rule__ExtendsBoard__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ExtendsBoard__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8226:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8227:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8227:2: ( RULE_ID )
            // InternalIoTParser.g:8228:3: RULE_ID
            {
             before(grammarAccess.getExtendsBoardAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendsBoardAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__NameAssignment_0"


    // $ANTLR start "rule__ExtendsBoard__AbstractBoardAssignment_2"
    // InternalIoTParser.g:8237:1: rule__ExtendsBoard__AbstractBoardAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExtendsBoard__AbstractBoardAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8241:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8242:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8242:2: ( RULE_ID )
            // InternalIoTParser.g:8243:3: RULE_ID
            {
             before(grammarAccess.getExtendsBoardAccess().getAbstractBoardIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendsBoardAccess().getAbstractBoardIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__AbstractBoardAssignment_2"


    // $ANTLR start "rule__ExtendsBoard__SensorsAssignment_3_2"
    // InternalIoTParser.g:8252:1: rule__ExtendsBoard__SensorsAssignment_3_2 : ( ruleSensor ) ;
    public final void rule__ExtendsBoard__SensorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8256:1: ( ( ruleSensor ) )
            // InternalIoTParser.g:8257:2: ( ruleSensor )
            {
            // InternalIoTParser.g:8257:2: ( ruleSensor )
            // InternalIoTParser.g:8258:3: ruleSensor
            {
             before(grammarAccess.getExtendsBoardAccess().getSensorsSensorParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getExtendsBoardAccess().getSensorsSensorParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendsBoard__SensorsAssignment_3_2"


    // $ANTLR start "rule__AbstractBoard__BoardAssignment_2"
    // InternalIoTParser.g:8267:1: rule__AbstractBoard__BoardAssignment_2 : ( ruleNewBoard ) ;
    public final void rule__AbstractBoard__BoardAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8271:1: ( ( ruleNewBoard ) )
            // InternalIoTParser.g:8272:2: ( ruleNewBoard )
            {
            // InternalIoTParser.g:8272:2: ( ruleNewBoard )
            // InternalIoTParser.g:8273:3: ruleNewBoard
            {
             before(grammarAccess.getAbstractBoardAccess().getBoardNewBoardParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNewBoard();

            state._fsp--;

             after(grammarAccess.getAbstractBoardAccess().getBoardNewBoardParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBoard__BoardAssignment_2"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalIoTParser.g:8282:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8286:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8287:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8287:2: ( RULE_ID )
            // InternalIoTParser.g:8288:3: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__SensortypeAssignment_3"
    // InternalIoTParser.g:8297:1: rule__Sensor__SensortypeAssignment_3 : ( ruleSensorType ) ;
    public final void rule__Sensor__SensortypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8301:1: ( ( ruleSensorType ) )
            // InternalIoTParser.g:8302:2: ( ruleSensorType )
            {
            // InternalIoTParser.g:8302:2: ( ruleSensorType )
            // InternalIoTParser.g:8303:3: ruleSensorType
            {
             before(grammarAccess.getSensorAccess().getSensortypeSensorTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensortypeSensorTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SensortypeAssignment_3"


    // $ANTLR start "rule__Sensor__VarsAssignment_5"
    // InternalIoTParser.g:8312:1: rule__Sensor__VarsAssignment_5 : ( ruleSensorVariables ) ;
    public final void rule__Sensor__VarsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8316:1: ( ( ruleSensorVariables ) )
            // InternalIoTParser.g:8317:2: ( ruleSensorVariables )
            {
            // InternalIoTParser.g:8317:2: ( ruleSensorVariables )
            // InternalIoTParser.g:8318:3: ruleSensorVariables
            {
             before(grammarAccess.getSensorAccess().getVarsSensorVariablesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorVariables();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getVarsSensorVariablesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__VarsAssignment_5"


    // $ANTLR start "rule__Sensor__SamplerAssignment_8_1"
    // InternalIoTParser.g:8327:1: rule__Sensor__SamplerAssignment_8_1 : ( ruleSampler ) ;
    public final void rule__Sensor__SamplerAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8331:1: ( ( ruleSampler ) )
            // InternalIoTParser.g:8332:2: ( ruleSampler )
            {
            // InternalIoTParser.g:8332:2: ( ruleSampler )
            // InternalIoTParser.g:8333:3: ruleSampler
            {
             before(grammarAccess.getSensorAccess().getSamplerSamplerParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSampler();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSamplerSamplerParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SamplerAssignment_8_1"


    // $ANTLR start "rule__Sensor__OutputAssignment_9"
    // InternalIoTParser.g:8342:1: rule__Sensor__OutputAssignment_9 : ( ruleSensorOutput ) ;
    public final void rule__Sensor__OutputAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8346:1: ( ( ruleSensorOutput ) )
            // InternalIoTParser.g:8347:2: ( ruleSensorOutput )
            {
            // InternalIoTParser.g:8347:2: ( ruleSensorOutput )
            // InternalIoTParser.g:8348:3: ruleSensorOutput
            {
             before(grammarAccess.getSensorAccess().getOutputSensorOutputParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorOutput();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getOutputSensorOutputParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__OutputAssignment_9"


    // $ANTLR start "rule__ExternalSensor__SensorAssignment_0"
    // InternalIoTParser.g:8357:1: rule__ExternalSensor__SensorAssignment_0 : ( RULE_ID ) ;
    public final void rule__ExternalSensor__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8361:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8362:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8362:2: ( RULE_ID )
            // InternalIoTParser.g:8363:3: RULE_ID
            {
             before(grammarAccess.getExternalSensorAccess().getSensorIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalSensorAccess().getSensorIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__SensorAssignment_0"


    // $ANTLR start "rule__ExternalSensor__PinsAssignment_2"
    // InternalIoTParser.g:8372:1: rule__ExternalSensor__PinsAssignment_2 : ( RULE_INT ) ;
    public final void rule__ExternalSensor__PinsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8376:1: ( ( RULE_INT ) )
            // InternalIoTParser.g:8377:2: ( RULE_INT )
            {
            // InternalIoTParser.g:8377:2: ( RULE_INT )
            // InternalIoTParser.g:8378:3: RULE_INT
            {
             before(grammarAccess.getExternalSensorAccess().getPinsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExternalSensorAccess().getPinsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__PinsAssignment_2"


    // $ANTLR start "rule__ExternalSensor__PinsAssignment_3_1"
    // InternalIoTParser.g:8387:1: rule__ExternalSensor__PinsAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__ExternalSensor__PinsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8391:1: ( ( RULE_INT ) )
            // InternalIoTParser.g:8392:2: ( RULE_INT )
            {
            // InternalIoTParser.g:8392:2: ( RULE_INT )
            // InternalIoTParser.g:8393:3: RULE_INT
            {
             before(grammarAccess.getExternalSensorAccess().getPinsINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExternalSensorAccess().getPinsINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSensor__PinsAssignment_3_1"


    // $ANTLR start "rule__OnboardSensor__SensorAssignment"
    // InternalIoTParser.g:8402:1: rule__OnboardSensor__SensorAssignment : ( RULE_ID ) ;
    public final void rule__OnboardSensor__SensorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8406:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8407:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8407:2: ( RULE_ID )
            // InternalIoTParser.g:8408:3: RULE_ID
            {
             before(grammarAccess.getOnboardSensorAccess().getSensorIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnboardSensorAccess().getSensorIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnboardSensor__SensorAssignment"


    // $ANTLR start "rule__SensorVariables__NameAssignment_0"
    // InternalIoTParser.g:8417:1: rule__SensorVariables__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SensorVariables__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8421:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8422:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8422:2: ( RULE_ID )
            // InternalIoTParser.g:8423:3: RULE_ID
            {
             before(grammarAccess.getSensorVariablesAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorVariablesAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__NameAssignment_0"


    // $ANTLR start "rule__SensorVariables__IdsAssignment_2"
    // InternalIoTParser.g:8432:1: rule__SensorVariables__IdsAssignment_2 : ( ruleVariable ) ;
    public final void rule__SensorVariables__IdsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8436:1: ( ( ruleVariable ) )
            // InternalIoTParser.g:8437:2: ( ruleVariable )
            {
            // InternalIoTParser.g:8437:2: ( ruleVariable )
            // InternalIoTParser.g:8438:3: ruleVariable
            {
             before(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__IdsAssignment_2"


    // $ANTLR start "rule__SensorVariables__IdsAssignment_3_1"
    // InternalIoTParser.g:8447:1: rule__SensorVariables__IdsAssignment_3_1 : ( ruleVariable ) ;
    public final void rule__SensorVariables__IdsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8451:1: ( ( ruleVariable ) )
            // InternalIoTParser.g:8452:2: ( ruleVariable )
            {
            // InternalIoTParser.g:8452:2: ( ruleVariable )
            // InternalIoTParser.g:8453:3: ruleVariable
            {
             before(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorVariables__IdsAssignment_3_1"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalIoTParser.g:8462:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8466:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8467:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8467:2: ( RULE_ID )
            // InternalIoTParser.g:8468:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__Command__CommandAssignment_1"
    // InternalIoTParser.g:8477:1: rule__Command__CommandAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Command__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8481:1: ( ( RULE_STRING ) )
            // InternalIoTParser.g:8482:2: ( RULE_STRING )
            {
            // InternalIoTParser.g:8482:2: ( RULE_STRING )
            // InternalIoTParser.g:8483:3: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getCommandSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCommandSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CommandAssignment_1"


    // $ANTLR start "rule__Frequency__FrequencyAssignment_1"
    // InternalIoTParser.g:8492:1: rule__Frequency__FrequencyAssignment_1 : ( RULE_INT ) ;
    public final void rule__Frequency__FrequencyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8496:1: ( ( RULE_INT ) )
            // InternalIoTParser.g:8497:2: ( RULE_INT )
            {
            // InternalIoTParser.g:8497:2: ( RULE_INT )
            // InternalIoTParser.g:8498:3: RULE_INT
            {
             before(grammarAccess.getFrequencyAccess().getFrequencyINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFrequencyAccess().getFrequencyINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__FrequencyAssignment_1"


    // $ANTLR start "rule__Frequency__ResolutionAssignment_2"
    // InternalIoTParser.g:8507:1: rule__Frequency__ResolutionAssignment_2 : ( ruleResolution ) ;
    public final void rule__Frequency__ResolutionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8511:1: ( ( ruleResolution ) )
            // InternalIoTParser.g:8512:2: ( ruleResolution )
            {
            // InternalIoTParser.g:8512:2: ( ruleResolution )
            // InternalIoTParser.g:8513:3: ruleResolution
            {
             before(grammarAccess.getFrequencyAccess().getResolutionResolutionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResolution();

            state._fsp--;

             after(grammarAccess.getFrequencyAccess().getResolutionResolutionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__ResolutionAssignment_2"


    // $ANTLR start "rule__SensorOutput__OutputAssignment_1"
    // InternalIoTParser.g:8522:1: rule__SensorOutput__OutputAssignment_1 : ( ruleDataOutput ) ;
    public final void rule__SensorOutput__OutputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8526:1: ( ( ruleDataOutput ) )
            // InternalIoTParser.g:8527:2: ( ruleDataOutput )
            {
            // InternalIoTParser.g:8527:2: ( ruleDataOutput )
            // InternalIoTParser.g:8528:3: ruleDataOutput
            {
             before(grammarAccess.getSensorOutputAccess().getOutputDataOutputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOutput();

            state._fsp--;

             after(grammarAccess.getSensorOutputAccess().getOutputDataOutputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__OutputAssignment_1"


    // $ANTLR start "rule__SensorOutput__ChannelAssignment_3"
    // InternalIoTParser.g:8537:1: rule__SensorOutput__ChannelAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SensorOutput__ChannelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8541:1: ( ( ( RULE_ID ) ) )
            // InternalIoTParser.g:8542:2: ( ( RULE_ID ) )
            {
            // InternalIoTParser.g:8542:2: ( ( RULE_ID ) )
            // InternalIoTParser.g:8543:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_3_0()); 
            // InternalIoTParser.g:8544:3: ( RULE_ID )
            // InternalIoTParser.g:8545:4: RULE_ID
            {
             before(grammarAccess.getSensorOutputAccess().getChannelChannelIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorOutputAccess().getChannelChannelIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorOutput__ChannelAssignment_3"


    // $ANTLR start "rule__DataOutput__SensorvarAssignment_0"
    // InternalIoTParser.g:8556:1: rule__DataOutput__SensorvarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DataOutput__SensorvarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8560:1: ( ( ( RULE_ID ) ) )
            // InternalIoTParser.g:8561:2: ( ( RULE_ID ) )
            {
            // InternalIoTParser.g:8561:2: ( ( RULE_ID ) )
            // InternalIoTParser.g:8562:3: ( RULE_ID )
            {
             before(grammarAccess.getDataOutputAccess().getSensorvarSensorVariablesCrossReference_0_0()); 
            // InternalIoTParser.g:8563:3: ( RULE_ID )
            // InternalIoTParser.g:8564:4: RULE_ID
            {
             before(grammarAccess.getDataOutputAccess().getSensorvarSensorVariablesIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataOutputAccess().getSensorvarSensorVariablesIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDataOutputAccess().getSensorvarSensorVariablesCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOutput__SensorvarAssignment_0"


    // $ANTLR start "rule__DataOutput__PipelineAssignment_1"
    // InternalIoTParser.g:8575:1: rule__DataOutput__PipelineAssignment_1 : ( rulePipeline ) ;
    public final void rule__DataOutput__PipelineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8579:1: ( ( rulePipeline ) )
            // InternalIoTParser.g:8580:2: ( rulePipeline )
            {
            // InternalIoTParser.g:8580:2: ( rulePipeline )
            // InternalIoTParser.g:8581:3: rulePipeline
            {
             before(grammarAccess.getDataOutputAccess().getPipelinePipelineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePipeline();

            state._fsp--;

             after(grammarAccess.getDataOutputAccess().getPipelinePipelineParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOutput__PipelineAssignment_1"


    // $ANTLR start "rule__Pipeline__NextAssignment_2"
    // InternalIoTParser.g:8590:1: rule__Pipeline__NextAssignment_2 : ( rulePipeline ) ;
    public final void rule__Pipeline__NextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8594:1: ( ( rulePipeline ) )
            // InternalIoTParser.g:8595:2: ( rulePipeline )
            {
            // InternalIoTParser.g:8595:2: ( rulePipeline )
            // InternalIoTParser.g:8596:3: rulePipeline
            {
             before(grammarAccess.getPipelineAccess().getNextPipelineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePipeline();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getNextPipelineParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__NextAssignment_2"


    // $ANTLR start "rule__TuplePipeline__ExpressionAssignment_2"
    // InternalIoTParser.g:8605:1: rule__TuplePipeline__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__TuplePipeline__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8609:1: ( ( ruleExpression ) )
            // InternalIoTParser.g:8610:2: ( ruleExpression )
            {
            // InternalIoTParser.g:8610:2: ( ruleExpression )
            // InternalIoTParser.g:8611:3: ruleExpression
            {
             before(grammarAccess.getTuplePipelineAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTuplePipelineAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TuplePipeline__ExpressionAssignment_2"


    // $ANTLR start "rule__MapPipeline__ExpressionAssignment_3"
    // InternalIoTParser.g:8620:1: rule__MapPipeline__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__MapPipeline__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8624:1: ( ( ruleExpression ) )
            // InternalIoTParser.g:8625:2: ( ruleExpression )
            {
            // InternalIoTParser.g:8625:2: ( ruleExpression )
            // InternalIoTParser.g:8626:3: ruleExpression
            {
             before(grammarAccess.getMapPipelineAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMapPipelineAccess().getExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__ExpressionAssignment_3"


    // $ANTLR start "rule__MapPipeline__OutputAssignment_5"
    // InternalIoTParser.g:8635:1: rule__MapPipeline__OutputAssignment_5 : ( ruleVariable ) ;
    public final void rule__MapPipeline__OutputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8639:1: ( ( ruleVariable ) )
            // InternalIoTParser.g:8640:2: ( ruleVariable )
            {
            // InternalIoTParser.g:8640:2: ( ruleVariable )
            // InternalIoTParser.g:8641:3: ruleVariable
            {
             before(grammarAccess.getMapPipelineAccess().getOutputVariableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMapPipelineAccess().getOutputVariableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapPipeline__OutputAssignment_5"


    // $ANTLR start "rule__WindowPipeline__WidthAssignment_3"
    // InternalIoTParser.g:8650:1: rule__WindowPipeline__WidthAssignment_3 : ( RULE_INT ) ;
    public final void rule__WindowPipeline__WidthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8654:1: ( ( RULE_INT ) )
            // InternalIoTParser.g:8655:2: ( RULE_INT )
            {
            // InternalIoTParser.g:8655:2: ( RULE_INT )
            // InternalIoTParser.g:8656:3: RULE_INT
            {
             before(grammarAccess.getWindowPipelineAccess().getWidthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWindowPipelineAccess().getWidthINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__WidthAssignment_3"


    // $ANTLR start "rule__WindowPipeline__ExecuteAssignment_6"
    // InternalIoTParser.g:8665:1: rule__WindowPipeline__ExecuteAssignment_6 : ( ruleExecutePipeline ) ;
    public final void rule__WindowPipeline__ExecuteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8669:1: ( ( ruleExecutePipeline ) )
            // InternalIoTParser.g:8670:2: ( ruleExecutePipeline )
            {
            // InternalIoTParser.g:8670:2: ( ruleExecutePipeline )
            // InternalIoTParser.g:8671:3: ruleExecutePipeline
            {
             before(grammarAccess.getWindowPipelineAccess().getExecuteExecutePipelineParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExecutePipeline();

            state._fsp--;

             after(grammarAccess.getWindowPipelineAccess().getExecuteExecutePipelineParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowPipeline__ExecuteAssignment_6"


    // $ANTLR start "rule__Conditional__CorrectAssignment_1_2"
    // InternalIoTParser.g:8680:1: rule__Conditional__CorrectAssignment_1_2 : ( ruleConditional ) ;
    public final void rule__Conditional__CorrectAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8684:1: ( ( ruleConditional ) )
            // InternalIoTParser.g:8685:2: ( ruleConditional )
            {
            // InternalIoTParser.g:8685:2: ( ruleConditional )
            // InternalIoTParser.g:8686:3: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getCorrectConditionalParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getCorrectConditionalParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__CorrectAssignment_1_2"


    // $ANTLR start "rule__Conditional__IncorrectAssignment_1_4"
    // InternalIoTParser.g:8695:1: rule__Conditional__IncorrectAssignment_1_4 : ( ruleConditional ) ;
    public final void rule__Conditional__IncorrectAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8699:1: ( ( ruleConditional ) )
            // InternalIoTParser.g:8700:2: ( ruleConditional )
            {
            // InternalIoTParser.g:8700:2: ( ruleConditional )
            // InternalIoTParser.g:8701:3: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getIncorrectConditionalParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getIncorrectConditionalParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__IncorrectAssignment_1_4"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalIoTParser.g:8710:1: rule__Or__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8714:1: ( ( ruleOr ) )
            // InternalIoTParser.g:8715:2: ( ruleOr )
            {
            // InternalIoTParser.g:8715:2: ( ruleOr )
            // InternalIoTParser.g:8716:3: ruleOr
            {
             before(grammarAccess.getOrAccess().getRightOrParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightOrParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalIoTParser.g:8725:1: rule__And__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8729:1: ( ( ruleAnd ) )
            // InternalIoTParser.g:8730:2: ( ruleAnd )
            {
            // InternalIoTParser.g:8730:2: ( ruleAnd )
            // InternalIoTParser.g:8731:3: ruleAnd
            {
             before(grammarAccess.getAndAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__RightAssignment_1_0_2"
    // InternalIoTParser.g:8740:1: rule__Equality__RightAssignment_1_0_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8744:1: ( ( ruleComparison ) )
            // InternalIoTParser.g:8745:2: ( ruleComparison )
            {
            // InternalIoTParser.g:8745:2: ( ruleComparison )
            // InternalIoTParser.g:8746:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_0_2"


    // $ANTLR start "rule__Equality__RightAssignment_1_1_2"
    // InternalIoTParser.g:8755:1: rule__Equality__RightAssignment_1_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8759:1: ( ( ruleComparison ) )
            // InternalIoTParser.g:8760:2: ( ruleComparison )
            {
            // InternalIoTParser.g:8760:2: ( ruleComparison )
            // InternalIoTParser.g:8761:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_1_2"


    // $ANTLR start "rule__Comparison__RightAssignment_1_0_2"
    // InternalIoTParser.g:8770:1: rule__Comparison__RightAssignment_1_0_2 : ( ruleSubAdd ) ;
    public final void rule__Comparison__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8774:1: ( ( ruleSubAdd ) )
            // InternalIoTParser.g:8775:2: ( ruleSubAdd )
            {
            // InternalIoTParser.g:8775:2: ( ruleSubAdd )
            // InternalIoTParser.g:8776:3: ruleSubAdd
            {
             before(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubAdd();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_0_2"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1_2"
    // InternalIoTParser.g:8785:1: rule__Comparison__RightAssignment_1_1_2 : ( ruleSubAdd ) ;
    public final void rule__Comparison__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8789:1: ( ( ruleSubAdd ) )
            // InternalIoTParser.g:8790:2: ( ruleSubAdd )
            {
            // InternalIoTParser.g:8790:2: ( ruleSubAdd )
            // InternalIoTParser.g:8791:3: ruleSubAdd
            {
             before(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubAdd();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_1_2"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2_2"
    // InternalIoTParser.g:8800:1: rule__Comparison__RightAssignment_1_2_2 : ( ruleSubAdd ) ;
    public final void rule__Comparison__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8804:1: ( ( ruleSubAdd ) )
            // InternalIoTParser.g:8805:2: ( ruleSubAdd )
            {
            // InternalIoTParser.g:8805:2: ( ruleSubAdd )
            // InternalIoTParser.g:8806:3: ruleSubAdd
            {
             before(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubAdd();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2_2"


    // $ANTLR start "rule__Comparison__RightAssignment_1_3_2"
    // InternalIoTParser.g:8815:1: rule__Comparison__RightAssignment_1_3_2 : ( ruleSubAdd ) ;
    public final void rule__Comparison__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8819:1: ( ( ruleSubAdd ) )
            // InternalIoTParser.g:8820:2: ( ruleSubAdd )
            {
            // InternalIoTParser.g:8820:2: ( ruleSubAdd )
            // InternalIoTParser.g:8821:3: ruleSubAdd
            {
             before(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubAdd();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_3_2"


    // $ANTLR start "rule__SubAdd__RightAssignment_1_0_2"
    // InternalIoTParser.g:8830:1: rule__SubAdd__RightAssignment_1_0_2 : ( ruleMulDiv ) ;
    public final void rule__SubAdd__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8834:1: ( ( ruleMulDiv ) )
            // InternalIoTParser.g:8835:2: ( ruleMulDiv )
            {
            // InternalIoTParser.g:8835:2: ( ruleMulDiv )
            // InternalIoTParser.g:8836:3: ruleMulDiv
            {
             before(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__RightAssignment_1_0_2"


    // $ANTLR start "rule__SubAdd__RightAssignment_1_1_2"
    // InternalIoTParser.g:8845:1: rule__SubAdd__RightAssignment_1_1_2 : ( ruleMulDiv ) ;
    public final void rule__SubAdd__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8849:1: ( ( ruleMulDiv ) )
            // InternalIoTParser.g:8850:2: ( ruleMulDiv )
            {
            // InternalIoTParser.g:8850:2: ( ruleMulDiv )
            // InternalIoTParser.g:8851:3: ruleMulDiv
            {
             before(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAdd__RightAssignment_1_1_2"


    // $ANTLR start "rule__MulDiv__RightAssignment_1_0_2"
    // InternalIoTParser.g:8860:1: rule__MulDiv__RightAssignment_1_0_2 : ( ruleNegation ) ;
    public final void rule__MulDiv__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8864:1: ( ( ruleNegation ) )
            // InternalIoTParser.g:8865:2: ( ruleNegation )
            {
            // InternalIoTParser.g:8865:2: ( ruleNegation )
            // InternalIoTParser.g:8866:3: ruleNegation
            {
             before(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__RightAssignment_1_0_2"


    // $ANTLR start "rule__MulDiv__RightAssignment_1_1_2"
    // InternalIoTParser.g:8875:1: rule__MulDiv__RightAssignment_1_1_2 : ( ruleNegation ) ;
    public final void rule__MulDiv__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8879:1: ( ( ruleNegation ) )
            // InternalIoTParser.g:8880:2: ( ruleNegation )
            {
            // InternalIoTParser.g:8880:2: ( ruleNegation )
            // InternalIoTParser.g:8881:3: ruleNegation
            {
             before(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__RightAssignment_1_1_2"


    // $ANTLR start "rule__Negation__ValueAssignment_0_2"
    // InternalIoTParser.g:8890:1: rule__Negation__ValueAssignment_0_2 : ( ruleExponent ) ;
    public final void rule__Negation__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8894:1: ( ( ruleExponent ) )
            // InternalIoTParser.g:8895:2: ( ruleExponent )
            {
            // InternalIoTParser.g:8895:2: ( ruleExponent )
            // InternalIoTParser.g:8896:3: ruleExponent
            {
             before(grammarAccess.getNegationAccess().getValueExponentParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExponent();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getValueExponentParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__ValueAssignment_0_2"


    // $ANTLR start "rule__Exponent__PowerAssignment_1_2"
    // InternalIoTParser.g:8905:1: rule__Exponent__PowerAssignment_1_2 : ( ruleNegation ) ;
    public final void rule__Exponent__PowerAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8909:1: ( ( ruleNegation ) )
            // InternalIoTParser.g:8910:2: ( ruleNegation )
            {
            // InternalIoTParser.g:8910:2: ( ruleNegation )
            // InternalIoTParser.g:8911:3: ruleNegation
            {
             before(grammarAccess.getExponentAccess().getPowerNegationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getExponentAccess().getPowerNegationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exponent__PowerAssignment_1_2"


    // $ANTLR start "rule__Not__ValueAssignment_0_2"
    // InternalIoTParser.g:8920:1: rule__Not__ValueAssignment_0_2 : ( rulePrimary ) ;
    public final void rule__Not__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8924:1: ( ( rulePrimary ) )
            // InternalIoTParser.g:8925:2: ( rulePrimary )
            {
            // InternalIoTParser.g:8925:2: ( rulePrimary )
            // InternalIoTParser.g:8926:3: rulePrimary
            {
             before(grammarAccess.getNotAccess().getValuePrimaryParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getNotAccess().getValuePrimaryParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__ValueAssignment_0_2"


    // $ANTLR start "rule__Reference__RefAssignment"
    // InternalIoTParser.g:8935:1: rule__Reference__RefAssignment : ( RULE_ID ) ;
    public final void rule__Reference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8939:1: ( ( RULE_ID ) )
            // InternalIoTParser.g:8940:2: ( RULE_ID )
            {
            // InternalIoTParser.g:8940:2: ( RULE_ID )
            // InternalIoTParser.g:8941:3: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getRefIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__RefAssignment"


    // $ANTLR start "rule__StringLiteral__StrAssignment"
    // InternalIoTParser.g:8950:1: rule__StringLiteral__StrAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__StrAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8954:1: ( ( RULE_STRING ) )
            // InternalIoTParser.g:8955:2: ( RULE_STRING )
            {
            // InternalIoTParser.g:8955:2: ( RULE_STRING )
            // InternalIoTParser.g:8956:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getStrSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getStrSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__StrAssignment"


    // $ANTLR start "rule__NumberLiteral__NumbAssignment"
    // InternalIoTParser.g:8965:1: rule__NumberLiteral__NumbAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberLiteral__NumbAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8969:1: ( ( ruleNUMBER ) )
            // InternalIoTParser.g:8970:2: ( ruleNUMBER )
            {
            // InternalIoTParser.g:8970:2: ( ruleNUMBER )
            // InternalIoTParser.g:8971:3: ruleNUMBER
            {
             before(grammarAccess.getNumberLiteralAccess().getNumbNUMBERParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getNumbNUMBERParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__NumbAssignment"


    // $ANTLR start "rule__BooleanLiteral__BoolAssignment"
    // InternalIoTParser.g:8980:1: rule__BooleanLiteral__BoolAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTParser.g:8984:1: ( ( RULE_BOOLEAN ) )
            // InternalIoTParser.g:8985:2: ( RULE_BOOLEAN )
            {
            // InternalIoTParser.g:8985:2: ( RULE_BOOLEAN )
            // InternalIoTParser.g:8986:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanLiteralAccess().getBoolBOOLEANTerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBooleanLiteralAccess().getBoolBOOLEANTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__BoolAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400280L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001040200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000204004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100080002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000006000010100L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0218000000000000L,0x00000000000019E0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000018022860000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000840000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xA001400000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xA001400000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0280000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0840000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0840000000000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0020000000000000L});

}