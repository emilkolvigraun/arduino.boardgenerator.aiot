package org.xtext.mdsd.arduino.boardgenerator.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mdsd.arduino.boardgenerator.services.IoTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIoTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Microseconds", "Milliseconds", "Frequency", "Abstract", "ByWindow", "Channel", "Command", "Extends", "Include", "Seconds", "Broker", "Client", "Filter", "Median", "Reduce", "Sample", "Sensor", "Serial", "Board", "Count", "Model", "Stdev", "Baud", "Byte", "Char", "Mean", "Mqtt", "Pass", "Pipe", "Ssid", "Stop", "Type", "Wifi", "Abs", "Map", "Max", "Min", "Sub", "Vcc", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "As", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_DBL", "RULE_SCI", "RULE_BOOLEAN", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_BEGIN=68;
    public static final int Stop=34;
    public static final int Include=12;
    public static final int Median=17;
    public static final int RULE_BOOLEAN=73;
    public static final int Count=23;
    public static final int RULE_SCI=72;
    public static final int LessThanSign=62;
    public static final int Board=22;
    public static final int LeftParenthesis=53;
    public static final int Pass=31;
    public static final int ByWindow=8;
    public static final int Extends=11;
    public static final int Client=15;
    public static final int Wifi=36;
    public static final int RightSquareBracket=67;
    public static final int ExclamationMark=52;
    public static final int Sub=41;
    public static final int GreaterThanSign=64;
    public static final int RULE_ID=76;
    public static final int Channel=9;
    public static final int RightParenthesis=54;
    public static final int Reduce=18;
    public static final int GreaterThanSignEqualsSign=49;
    public static final int Baud=26;
    public static final int EqualsSignEqualsSign=48;
    public static final int Stdev=25;
    public static final int Min=40;
    public static final int PlusSign=56;
    public static final int RULE_INT=70;
    public static final int Byte=27;
    public static final int Vcc=42;
    public static final int AsteriskAsterisk=45;
    public static final int RULE_ML_COMMENT=75;
    public static final int LeftSquareBracket=66;
    public static final int Ssid=33;
    public static final int Map=38;
    public static final int Sensor=20;
    public static final int Mean=29;
    public static final int RULE_END=69;
    public static final int Max=39;
    public static final int VerticalLineVerticalLine=51;
    public static final int RULE_STRING=77;
    public static final int RULE_SL_COMMENT=74;
    public static final int Comma=57;
    public static final int EqualsSign=63;
    public static final int As=50;
    public static final int HyphenMinus=58;
    public static final int Abs=37;
    public static final int AmpersandAmpersand=44;
    public static final int Char=28;
    public static final int LessThanSignEqualsSign=47;
    public static final int Solidus=60;
    public static final int Colon=61;
    public static final int EOF=-1;
    public static final int Asterisk=55;
    public static final int Mqtt=30;
    public static final int FullStop=59;
    public static final int Broker=14;
    public static final int RULE_WS=78;
    public static final int Abstract=7;
    public static final int Sample=19;
    public static final int Pipe=32;
    public static final int RULE_ANY_OTHER=79;
    public static final int Milliseconds=5;
    public static final int Microseconds=4;
    public static final int RULE_DBL=71;
    public static final int Serial=21;
    public static final int Type=35;
    public static final int Command=10;
    public static final int Filter=16;
    public static final int QuestionMark=65;
    public static final int Model=24;
    public static final int Frequency=6;
    public static final int Seconds=13;
    public static final int ExclamationMarkEqualsSign=43;
    public static final int HyphenMinusGreaterThanSign=46;

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

        public InternalIoTParser(TokenStream input, IoTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected IoTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalIoTParser.g:57:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalIoTParser.g:57:46: (iv_ruleModel= ruleModel EOF )
            // InternalIoTParser.g:58:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalIoTParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_channel_1_0 = null;

        EObject lv_abstractBoard_2_0 = null;

        EObject lv_board_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:70:2: ( ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )* ) )
            // InternalIoTParser.g:71:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )* )
            {
            // InternalIoTParser.g:71:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )* )
            // InternalIoTParser.g:72:3: ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )*
            {
            // InternalIoTParser.g:72:3: ( (lv_includes_0_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Include) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIoTParser.g:73:4: (lv_includes_0_0= ruleInclude )
            	    {
            	    // InternalIoTParser.g:73:4: (lv_includes_0_0= ruleInclude )
            	    // InternalIoTParser.g:74:5: lv_includes_0_0= ruleInclude
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getIncludesIncludeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_includes_0_0=ruleInclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"includes",
            	    						lv_includes_0_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Include");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalIoTParser.g:91:3: ( (lv_channel_1_0= ruleChannel ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Channel) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIoTParser.g:92:4: (lv_channel_1_0= ruleChannel )
            	    {
            	    // InternalIoTParser.g:92:4: (lv_channel_1_0= ruleChannel )
            	    // InternalIoTParser.g:93:5: lv_channel_1_0= ruleChannel
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getChannelChannelParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_channel_1_0=ruleChannel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"channel",
            	    						lv_channel_1_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Channel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalIoTParser.g:110:3: ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Abstract) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIoTParser.g:111:4: (lv_abstractBoard_2_0= ruleAbstractBoard )
            	    {
            	    // InternalIoTParser.g:111:4: (lv_abstractBoard_2_0= ruleAbstractBoard )
            	    // InternalIoTParser.g:112:5: lv_abstractBoard_2_0= ruleAbstractBoard
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAbstractBoardAbstractBoardParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_abstractBoard_2_0=ruleAbstractBoard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractBoard",
            	    						lv_abstractBoard_2_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.AbstractBoard");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalIoTParser.g:129:3: ( (lv_board_3_0= ruleBoard ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Board) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIoTParser.g:130:4: (lv_board_3_0= ruleBoard )
            	    {
            	    // InternalIoTParser.g:130:4: (lv_board_3_0= ruleBoard )
            	    // InternalIoTParser.g:131:5: lv_board_3_0= ruleBoard
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_board_3_0=ruleBoard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"board",
            	    						lv_board_3_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Board");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInclude"
    // InternalIoTParser.g:152:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalIoTParser.g:152:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalIoTParser.g:153:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalIoTParser.g:159:1: ruleInclude returns [EObject current=null] : (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_importURI_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:165:2: ( (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* ) )
            // InternalIoTParser.g:166:2: (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* )
            {
            // InternalIoTParser.g:166:2: (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* )
            // InternalIoTParser.g:167:3: otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Include,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalIoTParser.g:171:3: ( (lv_importURI_1_0= RULE_ID ) )
            // InternalIoTParser.g:172:4: (lv_importURI_1_0= RULE_ID )
            {
            // InternalIoTParser.g:172:4: (lv_importURI_1_0= RULE_ID )
            // InternalIoTParser.g:173:5: lv_importURI_1_0= RULE_ID
            {
            lv_importURI_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeAccess().getImportURIIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					addWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIoTParser.g:189:3: (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==FullStop) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIoTParser.g:190:4: otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,FullStop,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalIoTParser.g:194:4: ( (lv_importURI_3_0= RULE_ID ) )
            	    // InternalIoTParser.g:195:5: (lv_importURI_3_0= RULE_ID )
            	    {
            	    // InternalIoTParser.g:195:5: (lv_importURI_3_0= RULE_ID )
            	    // InternalIoTParser.g:196:6: lv_importURI_3_0= RULE_ID
            	    {
            	    lv_importURI_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(lv_importURI_3_0, grammarAccess.getIncludeAccess().getImportURIIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIncludeRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"importURI",
            	    							lv_importURI_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleChannel"
    // InternalIoTParser.g:217:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalIoTParser.g:217:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalIoTParser.g:218:2: iv_ruleChannel= ruleChannel EOF
            {
             newCompositeNode(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;

             current =iv_ruleChannel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalIoTParser.g:224:1: ruleChannel returns [EObject current=null] : (otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_channeltype_1_0 = null;

        EObject lv_config_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:230:2: ( (otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? ) )
            // InternalIoTParser.g:231:2: (otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? )
            {
            // InternalIoTParser.g:231:2: (otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? )
            // InternalIoTParser.g:232:3: otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Channel,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
            		
            // InternalIoTParser.g:236:3: ( (lv_channeltype_1_0= ruleChannelType ) )
            // InternalIoTParser.g:237:4: (lv_channeltype_1_0= ruleChannelType )
            {
            // InternalIoTParser.g:237:4: (lv_channeltype_1_0= ruleChannelType )
            // InternalIoTParser.g:238:5: lv_channeltype_1_0= ruleChannelType
            {

            					newCompositeNode(grammarAccess.getChannelAccess().getChanneltypeChannelTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_channeltype_1_0=ruleChannelType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelRule());
            					}
            					set(
            						current,
            						"channeltype",
            						lv_channeltype_1_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.ChannelType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoTParser.g:255:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoTParser.g:256:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoTParser.g:256:4: (lv_name_2_0= RULE_ID )
            // InternalIoTParser.g:257:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIoTParser.g:273:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Colon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIoTParser.g:274:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_12); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getChannelAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:282:4: ( (lv_config_5_0= ruleChannelConfig ) )
                    // InternalIoTParser.g:283:5: (lv_config_5_0= ruleChannelConfig )
                    {
                    // InternalIoTParser.g:283:5: (lv_config_5_0= ruleChannelConfig )
                    // InternalIoTParser.g:284:6: lv_config_5_0= ruleChannelConfig
                    {

                    						newCompositeNode(grammarAccess.getChannelAccess().getConfigChannelConfigParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_config_5_0=ruleChannelConfig();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChannelRule());
                    						}
                    						set(
                    							current,
                    							"config",
                    							lv_config_5_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.ChannelConfig");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_6, grammarAccess.getChannelAccess().getENDTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleChannelType"
    // InternalIoTParser.g:310:1: entryRuleChannelType returns [EObject current=null] : iv_ruleChannelType= ruleChannelType EOF ;
    public final EObject entryRuleChannelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelType = null;


        try {
            // InternalIoTParser.g:310:52: (iv_ruleChannelType= ruleChannelType EOF )
            // InternalIoTParser.g:311:2: iv_ruleChannelType= ruleChannelType EOF
            {
             newCompositeNode(grammarAccess.getChannelTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelType=ruleChannelType();

            state._fsp--;

             current =iv_ruleChannelType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannelType"


    // $ANTLR start "ruleChannelType"
    // InternalIoTParser.g:317:1: ruleChannelType returns [EObject current=null] : ( ( () otherlv_1= Wifi ) | ( () otherlv_3= Serial ) | ( () otherlv_5= Mqtt ) ) ;
    public final EObject ruleChannelType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:323:2: ( ( ( () otherlv_1= Wifi ) | ( () otherlv_3= Serial ) | ( () otherlv_5= Mqtt ) ) )
            // InternalIoTParser.g:324:2: ( ( () otherlv_1= Wifi ) | ( () otherlv_3= Serial ) | ( () otherlv_5= Mqtt ) )
            {
            // InternalIoTParser.g:324:2: ( ( () otherlv_1= Wifi ) | ( () otherlv_3= Serial ) | ( () otherlv_5= Mqtt ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case Wifi:
                {
                alt7=1;
                }
                break;
            case Serial:
                {
                alt7=2;
                }
                break;
            case Mqtt:
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
                    // InternalIoTParser.g:325:3: ( () otherlv_1= Wifi )
                    {
                    // InternalIoTParser.g:325:3: ( () otherlv_1= Wifi )
                    // InternalIoTParser.g:326:4: () otherlv_1= Wifi
                    {
                    // InternalIoTParser.g:326:4: ()
                    // InternalIoTParser.g:327:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getChannelTypeAccess().getWifiConfigAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Wifi,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getChannelTypeAccess().getWifiKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:339:3: ( () otherlv_3= Serial )
                    {
                    // InternalIoTParser.g:339:3: ( () otherlv_3= Serial )
                    // InternalIoTParser.g:340:4: () otherlv_3= Serial
                    {
                    // InternalIoTParser.g:340:4: ()
                    // InternalIoTParser.g:341:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getChannelTypeAccess().getSerialConfigAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,Serial,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getChannelTypeAccess().getSerialKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:353:3: ( () otherlv_5= Mqtt )
                    {
                    // InternalIoTParser.g:353:3: ( () otherlv_5= Mqtt )
                    // InternalIoTParser.g:354:4: () otherlv_5= Mqtt
                    {
                    // InternalIoTParser.g:354:4: ()
                    // InternalIoTParser.g:355:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getChannelTypeAccess().getMQTTAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,Mqtt,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getChannelTypeAccess().getMqttKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannelType"


    // $ANTLR start "entryRuleChannelConfig"
    // InternalIoTParser.g:370:1: entryRuleChannelConfig returns [EObject current=null] : iv_ruleChannelConfig= ruleChannelConfig EOF ;
    public final EObject entryRuleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelConfig = null;


        try {
            // InternalIoTParser.g:370:54: (iv_ruleChannelConfig= ruleChannelConfig EOF )
            // InternalIoTParser.g:371:2: iv_ruleChannelConfig= ruleChannelConfig EOF
            {
             newCompositeNode(grammarAccess.getChannelConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelConfig=ruleChannelConfig();

            state._fsp--;

             current =iv_ruleChannelConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannelConfig"


    // $ANTLR start "ruleChannelConfig"
    // InternalIoTParser.g:377:1: ruleChannelConfig returns [EObject current=null] : (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) ;
    public final EObject ruleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject this_Wifi_0 = null;

        EObject this_Serial_1 = null;

        EObject this_MqttClient_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:383:2: ( (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) )
            // InternalIoTParser.g:384:2: (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            {
            // InternalIoTParser.g:384:2: (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            int alt8=3;
            switch ( input.LA(1) ) {
            case Ssid:
                {
                alt8=1;
                }
                break;
            case Baud:
                {
                alt8=2;
                }
                break;
            case Broker:
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
                    // InternalIoTParser.g:385:3: this_Wifi_0= ruleWifi
                    {

                    			newCompositeNode(grammarAccess.getChannelConfigAccess().getWifiParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wifi_0=ruleWifi();

                    state._fsp--;


                    			current = this_Wifi_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:394:3: this_Serial_1= ruleSerial
                    {

                    			newCompositeNode(grammarAccess.getChannelConfigAccess().getSerialParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Serial_1=ruleSerial();

                    state._fsp--;


                    			current = this_Serial_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:403:3: this_MqttClient_2= ruleMqttClient
                    {

                    			newCompositeNode(grammarAccess.getChannelConfigAccess().getMqttClientParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MqttClient_2=ruleMqttClient();

                    state._fsp--;


                    			current = this_MqttClient_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannelConfig"


    // $ANTLR start "entryRuleWifi"
    // InternalIoTParser.g:415:1: entryRuleWifi returns [EObject current=null] : iv_ruleWifi= ruleWifi EOF ;
    public final EObject entryRuleWifi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWifi = null;


        try {
            // InternalIoTParser.g:415:45: (iv_ruleWifi= ruleWifi EOF )
            // InternalIoTParser.g:416:2: iv_ruleWifi= ruleWifi EOF
            {
             newCompositeNode(grammarAccess.getWifiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWifi=ruleWifi();

            state._fsp--;

             current =iv_ruleWifi; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWifi"


    // $ANTLR start "ruleWifi"
    // InternalIoTParser.g:422:1: ruleWifi returns [EObject current=null] : (otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleWifi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ssid_1_0=null;
        Token otherlv_2=null;
        Token lv_pass_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:428:2: ( (otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:429:2: (otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:429:2: (otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) ) )
            // InternalIoTParser.g:430:3: otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Ssid,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWifiAccess().getSsidKeyword_0());
            		
            // InternalIoTParser.g:434:3: ( (lv_ssid_1_0= RULE_STRING ) )
            // InternalIoTParser.g:435:4: (lv_ssid_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:435:4: (lv_ssid_1_0= RULE_STRING )
            // InternalIoTParser.g:436:5: lv_ssid_1_0= RULE_STRING
            {
            lv_ssid_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_ssid_1_0, grammarAccess.getWifiAccess().getSsidSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ssid",
            						lv_ssid_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,Pass,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getWifiAccess().getPassKeyword_2());
            		
            // InternalIoTParser.g:456:3: ( (lv_pass_3_0= RULE_STRING ) )
            // InternalIoTParser.g:457:4: (lv_pass_3_0= RULE_STRING )
            {
            // InternalIoTParser.g:457:4: (lv_pass_3_0= RULE_STRING )
            // InternalIoTParser.g:458:5: lv_pass_3_0= RULE_STRING
            {
            lv_pass_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_pass_3_0, grammarAccess.getWifiAccess().getPassSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pass",
            						lv_pass_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWifi"


    // $ANTLR start "entryRuleSerial"
    // InternalIoTParser.g:478:1: entryRuleSerial returns [EObject current=null] : iv_ruleSerial= ruleSerial EOF ;
    public final EObject entryRuleSerial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerial = null;


        try {
            // InternalIoTParser.g:478:47: (iv_ruleSerial= ruleSerial EOF )
            // InternalIoTParser.g:479:2: iv_ruleSerial= ruleSerial EOF
            {
             newCompositeNode(grammarAccess.getSerialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSerial=ruleSerial();

            state._fsp--;

             current =iv_ruleSerial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSerial"


    // $ANTLR start "ruleSerial"
    // InternalIoTParser.g:485:1: ruleSerial returns [EObject current=null] : (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) ) ;
    public final EObject ruleSerial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_baud_1_0=null;
        Token otherlv_2=null;
        EObject lv_stop_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:491:2: ( (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) ) )
            // InternalIoTParser.g:492:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) )
            {
            // InternalIoTParser.g:492:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) )
            // InternalIoTParser.g:493:3: otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) )
            {
            otherlv_0=(Token)match(input,Baud,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSerialAccess().getBaudKeyword_0());
            		
            // InternalIoTParser.g:497:3: ( (lv_baud_1_0= RULE_INT ) )
            // InternalIoTParser.g:498:4: (lv_baud_1_0= RULE_INT )
            {
            // InternalIoTParser.g:498:4: (lv_baud_1_0= RULE_INT )
            // InternalIoTParser.g:499:5: lv_baud_1_0= RULE_INT
            {
            lv_baud_1_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_baud_1_0, grammarAccess.getSerialAccess().getBaudINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSerialRule());
            					}
            					setWithLastConsumed(
            						current,
            						"baud",
            						lv_baud_1_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,Stop,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSerialAccess().getStopKeyword_2());
            		
            // InternalIoTParser.g:519:3: ( (lv_stop_3_0= rulestopChar ) )
            // InternalIoTParser.g:520:4: (lv_stop_3_0= rulestopChar )
            {
            // InternalIoTParser.g:520:4: (lv_stop_3_0= rulestopChar )
            // InternalIoTParser.g:521:5: lv_stop_3_0= rulestopChar
            {

            					newCompositeNode(grammarAccess.getSerialAccess().getStopStopCharParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_stop_3_0=rulestopChar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSerialRule());
            					}
            					set(
            						current,
            						"stop",
            						lv_stop_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.stopChar");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSerial"


    // $ANTLR start "entryRulestopChar"
    // InternalIoTParser.g:542:1: entryRulestopChar returns [EObject current=null] : iv_rulestopChar= rulestopChar EOF ;
    public final EObject entryRulestopChar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestopChar = null;


        try {
            // InternalIoTParser.g:542:49: (iv_rulestopChar= rulestopChar EOF )
            // InternalIoTParser.g:543:2: iv_rulestopChar= rulestopChar EOF
            {
             newCompositeNode(grammarAccess.getStopCharRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestopChar=rulestopChar();

            state._fsp--;

             current =iv_rulestopChar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestopChar"


    // $ANTLR start "rulestopChar"
    // InternalIoTParser.g:549:1: rulestopChar returns [EObject current=null] : ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) ) ;
    public final EObject rulestopChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:555:2: ( ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) ) )
            // InternalIoTParser.g:556:2: ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) )
            {
            // InternalIoTParser.g:556:2: ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Char) ) {
                alt9=1;
            }
            else if ( (LA9_0==Byte) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoTParser.g:557:3: ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) )
                    {
                    // InternalIoTParser.g:557:3: ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) )
                    // InternalIoTParser.g:558:4: () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) )
                    {
                    // InternalIoTParser.g:558:4: ()
                    // InternalIoTParser.g:559:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStopCharAccess().getCharAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Char,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getStopCharAccess().getCharKeyword_0_1());
                    			
                    // InternalIoTParser.g:569:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalIoTParser.g:570:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:570:5: (lv_name_2_0= RULE_STRING )
                    // InternalIoTParser.g:571:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getStopCharAccess().getNameSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStopCharRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:589:3: ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) )
                    {
                    // InternalIoTParser.g:589:3: ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) )
                    // InternalIoTParser.g:590:4: () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) )
                    {
                    // InternalIoTParser.g:590:4: ()
                    // InternalIoTParser.g:591:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStopCharAccess().getByteAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Byte,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getStopCharAccess().getByteKeyword_1_1());
                    			
                    // InternalIoTParser.g:601:4: ( (lv_name_5_0= RULE_INT ) )
                    // InternalIoTParser.g:602:5: (lv_name_5_0= RULE_INT )
                    {
                    // InternalIoTParser.g:602:5: (lv_name_5_0= RULE_INT )
                    // InternalIoTParser.g:603:6: lv_name_5_0= RULE_INT
                    {
                    lv_name_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getStopCharAccess().getNameINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStopCharRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestopChar"


    // $ANTLR start "entryRuleMqttClient"
    // InternalIoTParser.g:624:1: entryRuleMqttClient returns [EObject current=null] : iv_ruleMqttClient= ruleMqttClient EOF ;
    public final EObject entryRuleMqttClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMqttClient = null;


        try {
            // InternalIoTParser.g:624:51: (iv_ruleMqttClient= ruleMqttClient EOF )
            // InternalIoTParser.g:625:2: iv_ruleMqttClient= ruleMqttClient EOF
            {
             newCompositeNode(grammarAccess.getMqttClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMqttClient=ruleMqttClient();

            state._fsp--;

             current =iv_ruleMqttClient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMqttClient"


    // $ANTLR start "ruleMqttClient"
    // InternalIoTParser.g:631:1: ruleMqttClient returns [EObject current=null] : (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Client ( (lv_client_3_0= RULE_STRING ) ) (otherlv_4= Sub otherlv_5= LeftSquareBracket ( (lv_sub_6_0= RULE_STRING ) ) (otherlv_7= Comma ( (lv_sub_8_0= RULE_STRING ) ) )* otherlv_9= RightSquareBracket )? ) ;
    public final EObject ruleMqttClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_broker_1_0=null;
        Token otherlv_2=null;
        Token lv_client_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_sub_6_0=null;
        Token otherlv_7=null;
        Token lv_sub_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalIoTParser.g:637:2: ( (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Client ( (lv_client_3_0= RULE_STRING ) ) (otherlv_4= Sub otherlv_5= LeftSquareBracket ( (lv_sub_6_0= RULE_STRING ) ) (otherlv_7= Comma ( (lv_sub_8_0= RULE_STRING ) ) )* otherlv_9= RightSquareBracket )? ) )
            // InternalIoTParser.g:638:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Client ( (lv_client_3_0= RULE_STRING ) ) (otherlv_4= Sub otherlv_5= LeftSquareBracket ( (lv_sub_6_0= RULE_STRING ) ) (otherlv_7= Comma ( (lv_sub_8_0= RULE_STRING ) ) )* otherlv_9= RightSquareBracket )? )
            {
            // InternalIoTParser.g:638:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Client ( (lv_client_3_0= RULE_STRING ) ) (otherlv_4= Sub otherlv_5= LeftSquareBracket ( (lv_sub_6_0= RULE_STRING ) ) (otherlv_7= Comma ( (lv_sub_8_0= RULE_STRING ) ) )* otherlv_9= RightSquareBracket )? )
            // InternalIoTParser.g:639:3: otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Client ( (lv_client_3_0= RULE_STRING ) ) (otherlv_4= Sub otherlv_5= LeftSquareBracket ( (lv_sub_6_0= RULE_STRING ) ) (otherlv_7= Comma ( (lv_sub_8_0= RULE_STRING ) ) )* otherlv_9= RightSquareBracket )?
            {
            otherlv_0=(Token)match(input,Broker,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMqttClientAccess().getBrokerKeyword_0());
            		
            // InternalIoTParser.g:643:3: ( (lv_broker_1_0= RULE_STRING ) )
            // InternalIoTParser.g:644:4: (lv_broker_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:644:4: (lv_broker_1_0= RULE_STRING )
            // InternalIoTParser.g:645:5: lv_broker_1_0= RULE_STRING
            {
            lv_broker_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_broker_1_0, grammarAccess.getMqttClientAccess().getBrokerSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMqttClientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"broker",
            						lv_broker_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,Client,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMqttClientAccess().getClientKeyword_2());
            		
            // InternalIoTParser.g:665:3: ( (lv_client_3_0= RULE_STRING ) )
            // InternalIoTParser.g:666:4: (lv_client_3_0= RULE_STRING )
            {
            // InternalIoTParser.g:666:4: (lv_client_3_0= RULE_STRING )
            // InternalIoTParser.g:667:5: lv_client_3_0= RULE_STRING
            {
            lv_client_3_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_client_3_0, grammarAccess.getMqttClientAccess().getClientSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMqttClientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"client",
            						lv_client_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalIoTParser.g:683:3: (otherlv_4= Sub otherlv_5= LeftSquareBracket ( (lv_sub_6_0= RULE_STRING ) ) (otherlv_7= Comma ( (lv_sub_8_0= RULE_STRING ) ) )* otherlv_9= RightSquareBracket )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Sub) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIoTParser.g:684:4: otherlv_4= Sub otherlv_5= LeftSquareBracket ( (lv_sub_6_0= RULE_STRING ) ) (otherlv_7= Comma ( (lv_sub_8_0= RULE_STRING ) ) )* otherlv_9= RightSquareBracket
                    {
                    otherlv_4=(Token)match(input,Sub,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getMqttClientAccess().getSubKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,LeftSquareBracket,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getMqttClientAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalIoTParser.g:692:4: ( (lv_sub_6_0= RULE_STRING ) )
                    // InternalIoTParser.g:693:5: (lv_sub_6_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:693:5: (lv_sub_6_0= RULE_STRING )
                    // InternalIoTParser.g:694:6: lv_sub_6_0= RULE_STRING
                    {
                    lv_sub_6_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_sub_6_0, grammarAccess.getMqttClientAccess().getSubSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMqttClientRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"sub",
                    							lv_sub_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalIoTParser.g:710:4: (otherlv_7= Comma ( (lv_sub_8_0= RULE_STRING ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalIoTParser.g:711:5: otherlv_7= Comma ( (lv_sub_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMqttClientAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalIoTParser.g:715:5: ( (lv_sub_8_0= RULE_STRING ) )
                    	    // InternalIoTParser.g:716:6: (lv_sub_8_0= RULE_STRING )
                    	    {
                    	    // InternalIoTParser.g:716:6: (lv_sub_8_0= RULE_STRING )
                    	    // InternalIoTParser.g:717:7: lv_sub_8_0= RULE_STRING
                    	    {
                    	    lv_sub_8_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(lv_sub_8_0, grammarAccess.getMqttClientAccess().getSubSTRINGTerminalRuleCall_4_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMqttClientRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"sub",
                    	    								lv_sub_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getMqttClientAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMqttClient"


    // $ANTLR start "entryRuleBoard"
    // InternalIoTParser.g:743:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalIoTParser.g:743:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalIoTParser.g:744:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalIoTParser.g:750:1: ruleBoard returns [EObject current=null] : (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NewBoard_1 = null;

        EObject this_ExtendsBoard_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:756:2: ( (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) )
            // InternalIoTParser.g:757:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            {
            // InternalIoTParser.g:757:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            // InternalIoTParser.g:758:3: otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            {
            otherlv_0=(Token)match(input,Board,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            // InternalIoTParser.g:762:3: (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==Extends) ) {
                    alt12=2;
                }
                else if ( (LA12_1==Colon) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoTParser.g:763:4: this_NewBoard_1= ruleNewBoard
                    {

                    				newCompositeNode(grammarAccess.getBoardAccess().getNewBoardParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_NewBoard_1=ruleNewBoard();

                    state._fsp--;


                    				current = this_NewBoard_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:772:4: this_ExtendsBoard_2= ruleExtendsBoard
                    {

                    				newCompositeNode(grammarAccess.getBoardAccess().getExtendsBoardParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ExtendsBoard_2=ruleExtendsBoard();

                    state._fsp--;


                    				current = this_ExtendsBoard_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleNewBoard"
    // InternalIoTParser.g:785:1: entryRuleNewBoard returns [EObject current=null] : iv_ruleNewBoard= ruleNewBoard EOF ;
    public final EObject entryRuleNewBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewBoard = null;


        try {
            // InternalIoTParser.g:785:49: (iv_ruleNewBoard= ruleNewBoard EOF )
            // InternalIoTParser.g:786:2: iv_ruleNewBoard= ruleNewBoard EOF
            {
             newCompositeNode(grammarAccess.getNewBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewBoard=ruleNewBoard();

            state._fsp--;

             current =iv_ruleNewBoard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewBoard"


    // $ANTLR start "ruleNewBoard"
    // InternalIoTParser.g:792:1: ruleNewBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleNewBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        EObject lv_version_3_0 = null;

        EObject lv_sensors_4_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:798:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END ) )
            // InternalIoTParser.g:799:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END )
            {
            // InternalIoTParser.g:799:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END )
            // InternalIoTParser.g:800:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END
            {
            // InternalIoTParser.g:800:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:801:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:801:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:802:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNewBoardAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getNewBoardAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getNewBoardAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIoTParser.g:826:3: ( (lv_version_3_0= ruleBoardVersion ) )
            // InternalIoTParser.g:827:4: (lv_version_3_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:827:4: (lv_version_3_0= ruleBoardVersion )
            // InternalIoTParser.g:828:5: lv_version_3_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getNewBoardAccess().getVersionBoardVersionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_version_3_0=ruleBoardVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNewBoardRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.BoardVersion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoTParser.g:845:3: ( (lv_sensors_4_0= ruleSensor ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Sensor) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIoTParser.g:846:4: (lv_sensors_4_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:846:4: (lv_sensors_4_0= ruleSensor )
            	    // InternalIoTParser.g:847:5: lv_sensors_4_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getNewBoardAccess().getSensorsSensorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_sensors_4_0=ruleSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNewBoardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensors",
            	    						lv_sensors_4_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Sensor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getNewBoardAccess().getENDTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewBoard"


    // $ANTLR start "entryRuleBoardVersion"
    // InternalIoTParser.g:872:1: entryRuleBoardVersion returns [EObject current=null] : iv_ruleBoardVersion= ruleBoardVersion EOF ;
    public final EObject entryRuleBoardVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardVersion = null;


        try {
            // InternalIoTParser.g:872:53: (iv_ruleBoardVersion= ruleBoardVersion EOF )
            // InternalIoTParser.g:873:2: iv_ruleBoardVersion= ruleBoardVersion EOF
            {
             newCompositeNode(grammarAccess.getBoardVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoardVersion=ruleBoardVersion();

            state._fsp--;

             current =iv_ruleBoardVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoardVersion"


    // $ANTLR start "ruleBoardVersion"
    // InternalIoTParser.g:879:1: ruleBoardVersion returns [EObject current=null] : (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) ) ;
    public final EObject ruleBoardVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_model_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:885:2: ( (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) ) )
            // InternalIoTParser.g:886:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) )
            {
            // InternalIoTParser.g:886:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) )
            // InternalIoTParser.g:887:3: otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardVersionAccess().getTypeKeyword_0());
            		
            // InternalIoTParser.g:891:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalIoTParser.g:892:4: (lv_type_1_0= RULE_ID )
            {
            // InternalIoTParser.g:892:4: (lv_type_1_0= RULE_ID )
            // InternalIoTParser.g:893:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_type_1_0, grammarAccess.getBoardVersionAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Model,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardVersionAccess().getModelKeyword_2());
            		
            // InternalIoTParser.g:913:3: ( (lv_model_3_0= RULE_ID ) )
            // InternalIoTParser.g:914:4: (lv_model_3_0= RULE_ID )
            {
            // InternalIoTParser.g:914:4: (lv_model_3_0= RULE_ID )
            // InternalIoTParser.g:915:5: lv_model_3_0= RULE_ID
            {
            lv_model_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_model_3_0, grammarAccess.getBoardVersionAccess().getModelIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"model",
            						lv_model_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoardVersion"


    // $ANTLR start "entryRuleExtendsBoard"
    // InternalIoTParser.g:935:1: entryRuleExtendsBoard returns [EObject current=null] : iv_ruleExtendsBoard= ruleExtendsBoard EOF ;
    public final EObject entryRuleExtendsBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsBoard = null;


        try {
            // InternalIoTParser.g:935:53: (iv_ruleExtendsBoard= ruleExtendsBoard EOF )
            // InternalIoTParser.g:936:2: iv_ruleExtendsBoard= ruleExtendsBoard EOF
            {
             newCompositeNode(grammarAccess.getExtendsBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtendsBoard=ruleExtendsBoard();

            state._fsp--;

             current =iv_ruleExtendsBoard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendsBoard"


    // $ANTLR start "ruleExtendsBoard"
    // InternalIoTParser.g:942:1: ruleExtendsBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? ) ;
    public final EObject ruleExtendsBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_sensors_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:948:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? ) )
            // InternalIoTParser.g:949:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? )
            {
            // InternalIoTParser.g:949:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? )
            // InternalIoTParser.g:950:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )?
            {
            // InternalIoTParser.g:950:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:951:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:951:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:952:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExtendsBoardAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendsBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Extends,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendsBoardAccess().getExtendsKeyword_1());
            		
            // InternalIoTParser.g:972:3: ( (otherlv_2= RULE_ID ) )
            // InternalIoTParser.g:973:4: (otherlv_2= RULE_ID )
            {
            // InternalIoTParser.g:973:4: (otherlv_2= RULE_ID )
            // InternalIoTParser.g:974:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendsBoardRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getExtendsBoardAccess().getAbstractBoardAbstractBoardCrossReference_2_0());
            				

            }


            }

            // InternalIoTParser.g:985:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Colon) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIoTParser.g:986:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtendsBoardAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getExtendsBoardAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:994:4: ( (lv_sensors_5_0= ruleSensor ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Sensor) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalIoTParser.g:995:5: (lv_sensors_5_0= ruleSensor )
                    	    {
                    	    // InternalIoTParser.g:995:5: (lv_sensors_5_0= ruleSensor )
                    	    // InternalIoTParser.g:996:6: lv_sensors_5_0= ruleSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getExtendsBoardAccess().getSensorsSensorParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_26);
                    	    lv_sensors_5_0=ruleSensor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExtendsBoardRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sensors",
                    	    							lv_sensors_5_0,
                    	    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Sensor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_6, grammarAccess.getExtendsBoardAccess().getENDTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtendsBoard"


    // $ANTLR start "entryRuleAbstractBoard"
    // InternalIoTParser.g:1022:1: entryRuleAbstractBoard returns [EObject current=null] : iv_ruleAbstractBoard= ruleAbstractBoard EOF ;
    public final EObject entryRuleAbstractBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBoard = null;


        try {
            // InternalIoTParser.g:1022:54: (iv_ruleAbstractBoard= ruleAbstractBoard EOF )
            // InternalIoTParser.g:1023:2: iv_ruleAbstractBoard= ruleAbstractBoard EOF
            {
             newCompositeNode(grammarAccess.getAbstractBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractBoard=ruleAbstractBoard();

            state._fsp--;

             current =iv_ruleAbstractBoard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractBoard"


    // $ANTLR start "ruleAbstractBoard"
    // InternalIoTParser.g:1029:1: ruleAbstractBoard returns [EObject current=null] : (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) ;
    public final EObject ruleAbstractBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_7=null;
        EObject lv_version_5_0 = null;

        EObject lv_sensors_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1035:2: ( (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) )
            // InternalIoTParser.g:1036:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            {
            // InternalIoTParser.g:1036:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            // InternalIoTParser.g:1037:3: otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END
            {
            otherlv_0=(Token)match(input,Abstract,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractBoardAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,Board,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractBoardAccess().getBoardKeyword_1());
            		
            // InternalIoTParser.g:1045:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoTParser.g:1046:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoTParser.g:1046:4: (lv_name_2_0= RULE_ID )
            // InternalIoTParser.g:1047:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAbstractBoardAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractBoardAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getAbstractBoardAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalIoTParser.g:1071:3: ( (lv_version_5_0= ruleBoardVersion ) )
            // InternalIoTParser.g:1072:4: (lv_version_5_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:1072:4: (lv_version_5_0= ruleBoardVersion )
            // InternalIoTParser.g:1073:5: lv_version_5_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getAbstractBoardAccess().getVersionBoardVersionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_version_5_0=ruleBoardVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractBoardRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_5_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.BoardVersion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoTParser.g:1090:3: ( (lv_sensors_6_0= ruleSensor ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Sensor) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIoTParser.g:1091:4: (lv_sensors_6_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:1091:4: (lv_sensors_6_0= ruleSensor )
            	    // InternalIoTParser.g:1092:5: lv_sensors_6_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractBoardAccess().getSensorsSensorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_sensors_6_0=ruleSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractBoardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensors",
            	    						lv_sensors_6_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Sensor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getAbstractBoardAccess().getENDTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractBoard"


    // $ANTLR start "entryRuleSensor"
    // InternalIoTParser.g:1117:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoTParser.g:1117:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoTParser.g:1118:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalIoTParser.g:1124:1: ruleSensor returns [EObject current=null] : (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_vcc_11_0=null;
        Token this_END_13=null;
        EObject lv_sensortype_3_0 = null;

        EObject lv_vars_5_0 = null;

        EObject lv_sampler_9_0 = null;

        EObject lv_output_12_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1130:2: ( (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) )
            // InternalIoTParser.g:1131:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            {
            // InternalIoTParser.g:1131:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            // InternalIoTParser.g:1132:3: otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END
            {
            otherlv_0=(Token)match(input,Sensor,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalIoTParser.g:1136:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:1137:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:1137:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:1138:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getEqualsSignKeyword_2());
            		
            // InternalIoTParser.g:1158:3: ( (lv_sensortype_3_0= ruleSensorType ) )
            // InternalIoTParser.g:1159:4: (lv_sensortype_3_0= ruleSensorType )
            {
            // InternalIoTParser.g:1159:4: (lv_sensortype_3_0= ruleSensorType )
            // InternalIoTParser.g:1160:5: lv_sensortype_3_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensortypeSensorTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_sensortype_3_0=ruleSensorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"sensortype",
            						lv_sensortype_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.SensorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,As,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getAsKeyword_4());
            		
            // InternalIoTParser.g:1181:3: ( (lv_vars_5_0= ruleSensorVariables ) )
            // InternalIoTParser.g:1182:4: (lv_vars_5_0= ruleSensorVariables )
            {
            // InternalIoTParser.g:1182:4: (lv_vars_5_0= ruleSensorVariables )
            // InternalIoTParser.g:1183:5: lv_vars_5_0= ruleSensorVariables
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getVarsSensorVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_vars_5_0=ruleSensorVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_5_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.SensorVariables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Colon,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getColonKeyword_6());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getSensorAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalIoTParser.g:1208:3: (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Sample) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIoTParser.g:1209:4: otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) )
                    {
                    otherlv_8=(Token)match(input,Sample,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getSampleKeyword_8_0());
                    			
                    // InternalIoTParser.g:1213:4: ( (lv_sampler_9_0= ruleSampler ) )
                    // InternalIoTParser.g:1214:5: (lv_sampler_9_0= ruleSampler )
                    {
                    // InternalIoTParser.g:1214:5: (lv_sampler_9_0= ruleSampler )
                    // InternalIoTParser.g:1215:6: lv_sampler_9_0= ruleSampler
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getSamplerSamplerParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_sampler_9_0=ruleSampler();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						add(
                    							current,
                    							"sampler",
                    							lv_sampler_9_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Sampler");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIoTParser.g:1233:3: (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Vcc) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIoTParser.g:1234:4: otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,Vcc,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getVccKeyword_9_0());
                    			
                    // InternalIoTParser.g:1238:4: ( (lv_vcc_11_0= RULE_INT ) )
                    // InternalIoTParser.g:1239:5: (lv_vcc_11_0= RULE_INT )
                    {
                    // InternalIoTParser.g:1239:5: (lv_vcc_11_0= RULE_INT )
                    // InternalIoTParser.g:1240:6: lv_vcc_11_0= RULE_INT
                    {
                    lv_vcc_11_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_vcc_11_0, grammarAccess.getSensorAccess().getVccINTTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"vcc",
                    							lv_vcc_11_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIoTParser.g:1257:3: ( (lv_output_12_0= ruleSensorOutput ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Pipe) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIoTParser.g:1258:4: (lv_output_12_0= ruleSensorOutput )
            	    {
            	    // InternalIoTParser.g:1258:4: (lv_output_12_0= ruleSensorOutput )
            	    // InternalIoTParser.g:1259:5: lv_output_12_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputSensorOutputParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_output_12_0=ruleSensorOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"output",
            	    						lv_output_12_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.SensorOutput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_13, grammarAccess.getSensorAccess().getENDTerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleSensorType"
    // InternalIoTParser.g:1284:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalIoTParser.g:1284:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalIoTParser.g:1285:2: iv_ruleSensorType= ruleSensorType EOF
            {
             newCompositeNode(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorType=ruleSensorType();

            state._fsp--;

             current =iv_ruleSensorType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalIoTParser.g:1291:1: ruleSensorType returns [EObject current=null] : (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalSensor_0 = null;

        EObject this_OnboardSensor_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1297:2: ( (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) )
            // InternalIoTParser.g:1298:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            {
            // InternalIoTParser.g:1298:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||LA20_1==As) ) {
                    alt20=2;
                }
                else if ( (LA20_1==LeftParenthesis) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalIoTParser.g:1299:3: this_ExternalSensor_0= ruleExternalSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getExternalSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalSensor_0=ruleExternalSensor();

                    state._fsp--;


                    			current = this_ExternalSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1308:3: this_OnboardSensor_1= ruleOnboardSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getOnboardSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnboardSensor_1=ruleOnboardSensor();

                    state._fsp--;


                    			current = this_OnboardSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleExternalSensor"
    // InternalIoTParser.g:1320:1: entryRuleExternalSensor returns [EObject current=null] : iv_ruleExternalSensor= ruleExternalSensor EOF ;
    public final EObject entryRuleExternalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSensor = null;


        try {
            // InternalIoTParser.g:1320:55: (iv_ruleExternalSensor= ruleExternalSensor EOF )
            // InternalIoTParser.g:1321:2: iv_ruleExternalSensor= ruleExternalSensor EOF
            {
             newCompositeNode(grammarAccess.getExternalSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalSensor=ruleExternalSensor();

            state._fsp--;

             current =iv_ruleExternalSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalSensor"


    // $ANTLR start "ruleExternalSensor"
    // InternalIoTParser.g:1327:1: ruleExternalSensor returns [EObject current=null] : ( ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) ;
    public final EObject ruleExternalSensor() throws RecognitionException {
        EObject current = null;

        Token lv_sensor_0_0=null;
        Token otherlv_1=null;
        Token lv_pins_2_0=null;
        Token otherlv_3=null;
        Token lv_pins_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1333:2: ( ( ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1334:2: ( ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1334:2: ( ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1335:3: ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1335:3: ( (lv_sensor_0_0= RULE_ID ) )
            // InternalIoTParser.g:1336:4: (lv_sensor_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1336:4: (lv_sensor_0_0= RULE_ID )
            // InternalIoTParser.g:1337:5: lv_sensor_0_0= RULE_ID
            {
            lv_sensor_0_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_sensor_0_0, grammarAccess.getExternalSensorAccess().getSensorIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sensor",
            						lv_sensor_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalSensorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoTParser.g:1357:3: ( (lv_pins_2_0= RULE_INT ) )
            // InternalIoTParser.g:1358:4: (lv_pins_2_0= RULE_INT )
            {
            // InternalIoTParser.g:1358:4: (lv_pins_2_0= RULE_INT )
            // InternalIoTParser.g:1359:5: lv_pins_2_0= RULE_INT
            {
            lv_pins_2_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            					newLeafNode(lv_pins_2_0, grammarAccess.getExternalSensorAccess().getPinsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalSensorRule());
            					}
            					addWithLastConsumed(
            						current,
            						"pins",
            						lv_pins_2_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            // InternalIoTParser.g:1375:3: (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIoTParser.g:1376:4: otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_16); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalSensorAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1380:4: ( (lv_pins_4_0= RULE_INT ) )
            	    // InternalIoTParser.g:1381:5: (lv_pins_4_0= RULE_INT )
            	    {
            	    // InternalIoTParser.g:1381:5: (lv_pins_4_0= RULE_INT )
            	    // InternalIoTParser.g:1382:6: lv_pins_4_0= RULE_INT
            	    {
            	    lv_pins_4_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    						newLeafNode(lv_pins_4_0, grammarAccess.getExternalSensorAccess().getPinsINTTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExternalSensorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"pins",
            	    							lv_pins_4_0,
            	    							"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalSensorAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalSensor"


    // $ANTLR start "entryRuleOnboardSensor"
    // InternalIoTParser.g:1407:1: entryRuleOnboardSensor returns [EObject current=null] : iv_ruleOnboardSensor= ruleOnboardSensor EOF ;
    public final EObject entryRuleOnboardSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnboardSensor = null;


        try {
            // InternalIoTParser.g:1407:54: (iv_ruleOnboardSensor= ruleOnboardSensor EOF )
            // InternalIoTParser.g:1408:2: iv_ruleOnboardSensor= ruleOnboardSensor EOF
            {
             newCompositeNode(grammarAccess.getOnboardSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnboardSensor=ruleOnboardSensor();

            state._fsp--;

             current =iv_ruleOnboardSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnboardSensor"


    // $ANTLR start "ruleOnboardSensor"
    // InternalIoTParser.g:1414:1: ruleOnboardSensor returns [EObject current=null] : ( (lv_sensor_0_0= RULE_ID ) ) ;
    public final EObject ruleOnboardSensor() throws RecognitionException {
        EObject current = null;

        Token lv_sensor_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1420:2: ( ( (lv_sensor_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1421:2: ( (lv_sensor_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1421:2: ( (lv_sensor_0_0= RULE_ID ) )
            // InternalIoTParser.g:1422:3: (lv_sensor_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1422:3: (lv_sensor_0_0= RULE_ID )
            // InternalIoTParser.g:1423:4: lv_sensor_0_0= RULE_ID
            {
            lv_sensor_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_sensor_0_0, grammarAccess.getOnboardSensorAccess().getSensorIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOnboardSensorRule());
            				}
            				setWithLastConsumed(
            					current,
            					"sensor",
            					lv_sensor_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnboardSensor"


    // $ANTLR start "entryRuleSensorVariables"
    // InternalIoTParser.g:1442:1: entryRuleSensorVariables returns [EObject current=null] : iv_ruleSensorVariables= ruleSensorVariables EOF ;
    public final EObject entryRuleSensorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorVariables = null;


        try {
            // InternalIoTParser.g:1442:56: (iv_ruleSensorVariables= ruleSensorVariables EOF )
            // InternalIoTParser.g:1443:2: iv_ruleSensorVariables= ruleSensorVariables EOF
            {
             newCompositeNode(grammarAccess.getSensorVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorVariables=ruleSensorVariables();

            state._fsp--;

             current =iv_ruleSensorVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorVariables"


    // $ANTLR start "ruleSensorVariables"
    // InternalIoTParser.g:1449:1: ruleSensorVariables returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) ;
    public final EObject ruleSensorVariables() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ids_2_0 = null;

        EObject lv_ids_4_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1455:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1456:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1456:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1457:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1457:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1458:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1458:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1459:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSensorVariablesAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorVariablesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorVariablesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoTParser.g:1479:3: ( (lv_ids_2_0= ruleVariable ) )
            // InternalIoTParser.g:1480:4: (lv_ids_2_0= ruleVariable )
            {
            // InternalIoTParser.g:1480:4: (lv_ids_2_0= ruleVariable )
            // InternalIoTParser.g:1481:5: lv_ids_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_ids_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorVariablesRule());
            					}
            					add(
            						current,
            						"ids",
            						lv_ids_2_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoTParser.g:1498:3: (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIoTParser.g:1499:4: otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSensorVariablesAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1503:4: ( (lv_ids_4_0= ruleVariable ) )
            	    // InternalIoTParser.g:1504:5: (lv_ids_4_0= ruleVariable )
            	    {
            	    // InternalIoTParser.g:1504:5: (lv_ids_4_0= ruleVariable )
            	    // InternalIoTParser.g:1505:6: lv_ids_4_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_ids_4_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSensorVariablesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ids",
            	    							lv_ids_4_0,
            	    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorVariablesAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorVariables"


    // $ANTLR start "entryRuleVariable"
    // InternalIoTParser.g:1531:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalIoTParser.g:1531:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalIoTParser.g:1532:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalIoTParser.g:1538:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1544:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1545:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1545:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1546:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1546:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1547:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleSampler"
    // InternalIoTParser.g:1566:1: entryRuleSampler returns [EObject current=null] : iv_ruleSampler= ruleSampler EOF ;
    public final EObject entryRuleSampler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampler = null;


        try {
            // InternalIoTParser.g:1566:48: (iv_ruleSampler= ruleSampler EOF )
            // InternalIoTParser.g:1567:2: iv_ruleSampler= ruleSampler EOF
            {
             newCompositeNode(grammarAccess.getSamplerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSampler=ruleSampler();

            state._fsp--;

             current =iv_ruleSampler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSampler"


    // $ANTLR start "ruleSampler"
    // InternalIoTParser.g:1573:1: ruleSampler returns [EObject current=null] : (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) ;
    public final EObject ruleSampler() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Frequency_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1579:2: ( (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) )
            // InternalIoTParser.g:1580:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            {
            // InternalIoTParser.g:1580:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Command) ) {
                alt23=1;
            }
            else if ( (LA23_0==Frequency) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalIoTParser.g:1581:3: this_Command_0= ruleCommand
                    {

                    			newCompositeNode(grammarAccess.getSamplerAccess().getCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Command_0=ruleCommand();

                    state._fsp--;


                    			current = this_Command_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1590:3: this_Frequency_1= ruleFrequency
                    {

                    			newCompositeNode(grammarAccess.getSamplerAccess().getFrequencyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Frequency_1=ruleFrequency();

                    state._fsp--;


                    			current = this_Frequency_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSampler"


    // $ANTLR start "entryRuleCommand"
    // InternalIoTParser.g:1602:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalIoTParser.g:1602:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalIoTParser.g:1603:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalIoTParser.g:1609:1: ruleCommand returns [EObject current=null] : (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1615:2: ( (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:1616:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:1616:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) )
            // InternalIoTParser.g:1617:3: otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Command,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalIoTParser.g:1621:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalIoTParser.g:1622:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:1622:4: (lv_command_1_0= RULE_STRING )
            // InternalIoTParser.g:1623:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_command_1_0, grammarAccess.getCommandAccess().getCommandSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleFrequency"
    // InternalIoTParser.g:1643:1: entryRuleFrequency returns [EObject current=null] : iv_ruleFrequency= ruleFrequency EOF ;
    public final EObject entryRuleFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequency = null;


        try {
            // InternalIoTParser.g:1643:50: (iv_ruleFrequency= ruleFrequency EOF )
            // InternalIoTParser.g:1644:2: iv_ruleFrequency= ruleFrequency EOF
            {
             newCompositeNode(grammarAccess.getFrequencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrequency=ruleFrequency();

            state._fsp--;

             current =iv_ruleFrequency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrequency"


    // $ANTLR start "ruleFrequency"
    // InternalIoTParser.g:1650:1: ruleFrequency returns [EObject current=null] : (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) ;
    public final EObject ruleFrequency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_frequency_1_0=null;
        EObject lv_resolution_2_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1656:2: ( (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) )
            // InternalIoTParser.g:1657:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            {
            // InternalIoTParser.g:1657:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            // InternalIoTParser.g:1658:3: otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) )
            {
            otherlv_0=(Token)match(input,Frequency,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFrequencyAccess().getFrequencyKeyword_0());
            		
            // InternalIoTParser.g:1662:3: ( (lv_frequency_1_0= RULE_INT ) )
            // InternalIoTParser.g:1663:4: (lv_frequency_1_0= RULE_INT )
            {
            // InternalIoTParser.g:1663:4: (lv_frequency_1_0= RULE_INT )
            // InternalIoTParser.g:1664:5: lv_frequency_1_0= RULE_INT
            {
            lv_frequency_1_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            					newLeafNode(lv_frequency_1_0, grammarAccess.getFrequencyAccess().getFrequencyINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrequencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_1_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            // InternalIoTParser.g:1680:3: ( (lv_resolution_2_0= ruleResolution ) )
            // InternalIoTParser.g:1681:4: (lv_resolution_2_0= ruleResolution )
            {
            // InternalIoTParser.g:1681:4: (lv_resolution_2_0= ruleResolution )
            // InternalIoTParser.g:1682:5: lv_resolution_2_0= ruleResolution
            {

            					newCompositeNode(grammarAccess.getFrequencyAccess().getResolutionResolutionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_resolution_2_0=ruleResolution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrequencyRule());
            					}
            					set(
            						current,
            						"resolution",
            						lv_resolution_2_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.Resolution");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrequency"


    // $ANTLR start "entryRuleResolution"
    // InternalIoTParser.g:1703:1: entryRuleResolution returns [EObject current=null] : iv_ruleResolution= ruleResolution EOF ;
    public final EObject entryRuleResolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolution = null;


        try {
            // InternalIoTParser.g:1703:51: (iv_ruleResolution= ruleResolution EOF )
            // InternalIoTParser.g:1704:2: iv_ruleResolution= ruleResolution EOF
            {
             newCompositeNode(grammarAccess.getResolutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResolution=ruleResolution();

            state._fsp--;

             current =iv_ruleResolution; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResolution"


    // $ANTLR start "ruleResolution"
    // InternalIoTParser.g:1710:1: ruleResolution returns [EObject current=null] : ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) ;
    public final EObject ruleResolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1716:2: ( ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) )
            // InternalIoTParser.g:1717:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            {
            // InternalIoTParser.g:1717:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case Seconds:
                {
                alt24=1;
                }
                break;
            case Milliseconds:
                {
                alt24=2;
                }
                break;
            case Microseconds:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalIoTParser.g:1718:3: ( () otherlv_1= Seconds )
                    {
                    // InternalIoTParser.g:1718:3: ( () otherlv_1= Seconds )
                    // InternalIoTParser.g:1719:4: () otherlv_1= Seconds
                    {
                    // InternalIoTParser.g:1719:4: ()
                    // InternalIoTParser.g:1720:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getResolutionAccess().getSecondsAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Seconds,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getResolutionAccess().getSecondsKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1732:3: ( () otherlv_3= Milliseconds )
                    {
                    // InternalIoTParser.g:1732:3: ( () otherlv_3= Milliseconds )
                    // InternalIoTParser.g:1733:4: () otherlv_3= Milliseconds
                    {
                    // InternalIoTParser.g:1733:4: ()
                    // InternalIoTParser.g:1734:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getResolutionAccess().getMillisAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,Milliseconds,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getResolutionAccess().getMillisecondsKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1746:3: ( () otherlv_5= Microseconds )
                    {
                    // InternalIoTParser.g:1746:3: ( () otherlv_5= Microseconds )
                    // InternalIoTParser.g:1747:4: () otherlv_5= Microseconds
                    {
                    // InternalIoTParser.g:1747:4: ()
                    // InternalIoTParser.g:1748:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getResolutionAccess().getMicrosAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,Microseconds,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getResolutionAccess().getMicrosecondsKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResolution"


    // $ANTLR start "entryRuleSensorOutput"
    // InternalIoTParser.g:1763:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalIoTParser.g:1763:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalIoTParser.g:1764:2: iv_ruleSensorOutput= ruleSensorOutput EOF
            {
             newCompositeNode(grammarAccess.getSensorOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorOutput=ruleSensorOutput();

            state._fsp--;

             current =iv_ruleSensorOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorOutput"


    // $ANTLR start "ruleSensorOutput"
    // InternalIoTParser.g:1770:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSensorOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_output_1_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1776:2: ( (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) ) )
            // InternalIoTParser.g:1777:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalIoTParser.g:1777:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )
            // InternalIoTParser.g:1778:3: otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Pipe,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getPipeKeyword_0());
            		
            // InternalIoTParser.g:1782:3: ( (lv_output_1_0= ruleDataOutput ) )
            // InternalIoTParser.g:1783:4: (lv_output_1_0= ruleDataOutput )
            {
            // InternalIoTParser.g:1783:4: (lv_output_1_0= ruleDataOutput )
            // InternalIoTParser.g:1784:5: lv_output_1_0= ruleDataOutput
            {

            					newCompositeNode(grammarAccess.getSensorOutputAccess().getOutputDataOutputParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_output_1_0=ruleDataOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorOutputRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_1_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.DataOutput");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorOutputAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalIoTParser.g:1805:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoTParser.g:1806:4: (otherlv_3= RULE_ID )
            {
            // InternalIoTParser.g:1806:4: (otherlv_3= RULE_ID )
            // InternalIoTParser.g:1807:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorOutputRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorOutput"


    // $ANTLR start "entryRuleDataOutput"
    // InternalIoTParser.g:1822:1: entryRuleDataOutput returns [EObject current=null] : iv_ruleDataOutput= ruleDataOutput EOF ;
    public final EObject entryRuleDataOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOutput = null;


        try {
            // InternalIoTParser.g:1822:51: (iv_ruleDataOutput= ruleDataOutput EOF )
            // InternalIoTParser.g:1823:2: iv_ruleDataOutput= ruleDataOutput EOF
            {
             newCompositeNode(grammarAccess.getDataOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataOutput=ruleDataOutput();

            state._fsp--;

             current =iv_ruleDataOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataOutput"


    // $ANTLR start "ruleDataOutput"
    // InternalIoTParser.g:1829:1: ruleDataOutput returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) ;
    public final EObject ruleDataOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pipeline_1_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1835:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:1836:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:1836:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            // InternalIoTParser.g:1837:3: ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )?
            {
            // InternalIoTParser.g:1837:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoTParser.g:1838:4: (otherlv_0= RULE_ID )
            {
            // InternalIoTParser.g:1838:4: (otherlv_0= RULE_ID )
            // InternalIoTParser.g:1839:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataOutputRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getDataOutputAccess().getSensorvarSensorVariablesCrossReference_0_0());
            				

            }


            }

            // InternalIoTParser.g:1850:3: ( (lv_pipeline_1_0= rulePipeline ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==FullStop) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalIoTParser.g:1851:4: (lv_pipeline_1_0= rulePipeline )
                    {
                    // InternalIoTParser.g:1851:4: (lv_pipeline_1_0= rulePipeline )
                    // InternalIoTParser.g:1852:5: lv_pipeline_1_0= rulePipeline
                    {

                    					newCompositeNode(grammarAccess.getDataOutputAccess().getPipelinePipelineParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pipeline_1_0=rulePipeline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataOutputRule());
                    					}
                    					set(
                    						current,
                    						"pipeline",
                    						lv_pipeline_1_0,
                    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Pipeline");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataOutput"


    // $ANTLR start "entryRulePipeline"
    // InternalIoTParser.g:1873:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalIoTParser.g:1873:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalIoTParser.g:1874:2: iv_rulePipeline= rulePipeline EOF
            {
             newCompositeNode(grammarAccess.getPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePipeline=rulePipeline();

            state._fsp--;

             current =iv_rulePipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePipeline"


    // $ANTLR start "rulePipeline"
    // InternalIoTParser.g:1880:1: rulePipeline returns [EObject current=null] : (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TuplePipeline_1 = null;

        EObject this_MapPipeline_2 = null;

        EObject this_WindowPipeline_3 = null;

        EObject lv_next_4_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1886:2: ( (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:1887:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:1887:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )? )
            // InternalIoTParser.g:1888:3: otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )?
            {
            otherlv_0=(Token)match(input,FullStop,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getFullStopKeyword_0());
            		
            // InternalIoTParser.g:1892:3: (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline )
            int alt26=3;
            switch ( input.LA(1) ) {
            case Filter:
            case Abs:
                {
                alt26=1;
                }
                break;
            case Map:
                {
                alt26=2;
                }
                break;
            case ByWindow:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalIoTParser.g:1893:4: this_TuplePipeline_1= ruleTuplePipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getTuplePipelineParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_TuplePipeline_1=ruleTuplePipeline();

                    state._fsp--;


                    				current = this_TuplePipeline_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1902:4: this_MapPipeline_2= ruleMapPipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getMapPipelineParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_MapPipeline_2=ruleMapPipeline();

                    state._fsp--;


                    				current = this_MapPipeline_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:1911:4: this_WindowPipeline_3= ruleWindowPipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getWindowPipelineParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_WindowPipeline_3=ruleWindowPipeline();

                    state._fsp--;


                    				current = this_WindowPipeline_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalIoTParser.g:1920:3: ( (lv_next_4_0= rulePipeline ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==FullStop) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalIoTParser.g:1921:4: (lv_next_4_0= rulePipeline )
                    {
                    // InternalIoTParser.g:1921:4: (lv_next_4_0= rulePipeline )
                    // InternalIoTParser.g:1922:5: lv_next_4_0= rulePipeline
                    {

                    					newCompositeNode(grammarAccess.getPipelineAccess().getNextPipelineParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_4_0=rulePipeline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPipelineRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_4_0,
                    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Pipeline");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleTuplePipeline"
    // InternalIoTParser.g:1943:1: entryRuleTuplePipeline returns [EObject current=null] : iv_ruleTuplePipeline= ruleTuplePipeline EOF ;
    public final EObject entryRuleTuplePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePipeline = null;


        try {
            // InternalIoTParser.g:1943:54: (iv_ruleTuplePipeline= ruleTuplePipeline EOF )
            // InternalIoTParser.g:1944:2: iv_ruleTuplePipeline= ruleTuplePipeline EOF
            {
             newCompositeNode(grammarAccess.getTuplePipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTuplePipeline=ruleTuplePipeline();

            state._fsp--;

             current =iv_ruleTuplePipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuplePipeline"


    // $ANTLR start "ruleTuplePipeline"
    // InternalIoTParser.g:1950:1: ruleTuplePipeline returns [EObject current=null] : ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) ;
    public final EObject ruleTuplePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1956:2: ( ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:1957:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:1957:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:1958:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:1958:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Filter) ) {
                alt28=1;
            }
            else if ( (LA28_0==Abs) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalIoTParser.g:1959:4: ( () otherlv_1= Filter )
                    {
                    // InternalIoTParser.g:1959:4: ( () otherlv_1= Filter )
                    // InternalIoTParser.g:1960:5: () otherlv_1= Filter
                    {
                    // InternalIoTParser.g:1960:5: ()
                    // InternalIoTParser.g:1961:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTuplePipelineAccess().getFilterAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,Filter,FOLLOW_21); 

                    					newLeafNode(otherlv_1, grammarAccess.getTuplePipelineAccess().getFilterKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:1973:4: ( () otherlv_3= Abs )
                    {
                    // InternalIoTParser.g:1973:4: ( () otherlv_3= Abs )
                    // InternalIoTParser.g:1974:5: () otherlv_3= Abs
                    {
                    // InternalIoTParser.g:1974:5: ()
                    // InternalIoTParser.g:1975:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTuplePipelineAccess().getAbsAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_3=(Token)match(input,Abs,FOLLOW_21); 

                    					newLeafNode(otherlv_3, grammarAccess.getTuplePipelineAccess().getAbsKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getTuplePipelineAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalIoTParser.g:1991:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalIoTParser.g:1992:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalIoTParser.g:1992:4: (lv_expression_5_0= ruleExpression )
            // InternalIoTParser.g:1993:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTuplePipelineAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_expression_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuplePipelineRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_5_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTuplePipelineAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuplePipeline"


    // $ANTLR start "entryRuleMapPipeline"
    // InternalIoTParser.g:2018:1: entryRuleMapPipeline returns [EObject current=null] : iv_ruleMapPipeline= ruleMapPipeline EOF ;
    public final EObject entryRuleMapPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapPipeline = null;


        try {
            // InternalIoTParser.g:2018:52: (iv_ruleMapPipeline= ruleMapPipeline EOF )
            // InternalIoTParser.g:2019:2: iv_ruleMapPipeline= ruleMapPipeline EOF
            {
             newCompositeNode(grammarAccess.getMapPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapPipeline=ruleMapPipeline();

            state._fsp--;

             current =iv_ruleMapPipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapPipeline"


    // $ANTLR start "ruleMapPipeline"
    // InternalIoTParser.g:2025:1: ruleMapPipeline returns [EObject current=null] : ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) ;
    public final EObject ruleMapPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_3_0 = null;

        EObject lv_output_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2031:2: ( ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:2032:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:2032:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:2033:3: () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:2033:3: ()
            // InternalIoTParser.g:2034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapPipelineAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Map,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMapPipelineAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getMapPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2048:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalIoTParser.g:2049:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalIoTParser.g:2049:4: (lv_expression_3_0= ruleExpression )
            // InternalIoTParser.g:2050:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapPipelineRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMapPipelineAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalIoTParser.g:2071:3: ( (lv_output_5_0= ruleVariable ) )
            // InternalIoTParser.g:2072:4: (lv_output_5_0= ruleVariable )
            {
            // InternalIoTParser.g:2072:4: (lv_output_5_0= ruleVariable )
            // InternalIoTParser.g:2073:5: lv_output_5_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getOutputVariableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_41);
            lv_output_5_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapPipelineRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_5_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMapPipelineAccess().getRightSquareBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapPipeline"


    // $ANTLR start "entryRuleWindowPipeline"
    // InternalIoTParser.g:2098:1: entryRuleWindowPipeline returns [EObject current=null] : iv_ruleWindowPipeline= ruleWindowPipeline EOF ;
    public final EObject entryRuleWindowPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowPipeline = null;


        try {
            // InternalIoTParser.g:2098:55: (iv_ruleWindowPipeline= ruleWindowPipeline EOF )
            // InternalIoTParser.g:2099:2: iv_ruleWindowPipeline= ruleWindowPipeline EOF
            {
             newCompositeNode(grammarAccess.getWindowPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindowPipeline=ruleWindowPipeline();

            state._fsp--;

             current =iv_ruleWindowPipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindowPipeline"


    // $ANTLR start "ruleWindowPipeline"
    // InternalIoTParser.g:2105:1: ruleWindowPipeline returns [EObject current=null] : ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) ;
    public final EObject ruleWindowPipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_width_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_execute_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2111:2: ( ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) )
            // InternalIoTParser.g:2112:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            {
            // InternalIoTParser.g:2112:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            // InternalIoTParser.g:2113:3: () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) )
            {
            // InternalIoTParser.g:2113:3: ()
            // InternalIoTParser.g:2114:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWindowPipelineAccess().getWindowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ByWindow,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getWindowPipelineAccess().getByWindowKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getWindowPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2128:3: ( (lv_width_3_0= RULE_INT ) )
            // InternalIoTParser.g:2129:4: (lv_width_3_0= RULE_INT )
            {
            // InternalIoTParser.g:2129:4: (lv_width_3_0= RULE_INT )
            // InternalIoTParser.g:2130:5: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            					newLeafNode(lv_width_3_0, grammarAccess.getWindowPipelineAccess().getWidthINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWindowPipelineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getWindowPipelineAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,FullStop,FOLLOW_43); 

            			newLeafNode(otherlv_5, grammarAccess.getWindowPipelineAccess().getFullStopKeyword_5());
            		
            // InternalIoTParser.g:2154:3: ( (lv_execute_6_0= ruleExecutePipeline ) )
            // InternalIoTParser.g:2155:4: (lv_execute_6_0= ruleExecutePipeline )
            {
            // InternalIoTParser.g:2155:4: (lv_execute_6_0= ruleExecutePipeline )
            // InternalIoTParser.g:2156:5: lv_execute_6_0= ruleExecutePipeline
            {

            					newCompositeNode(grammarAccess.getWindowPipelineAccess().getExecuteExecutePipelineParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_execute_6_0=ruleExecutePipeline();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowPipelineRule());
            					}
            					set(
            						current,
            						"execute",
            						lv_execute_6_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.ExecutePipeline");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindowPipeline"


    // $ANTLR start "entryRuleExecutePipeline"
    // InternalIoTParser.g:2177:1: entryRuleExecutePipeline returns [EObject current=null] : iv_ruleExecutePipeline= ruleExecutePipeline EOF ;
    public final EObject entryRuleExecutePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutePipeline = null;


        try {
            // InternalIoTParser.g:2177:56: (iv_ruleExecutePipeline= ruleExecutePipeline EOF )
            // InternalIoTParser.g:2178:2: iv_ruleExecutePipeline= ruleExecutePipeline EOF
            {
             newCompositeNode(grammarAccess.getExecutePipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutePipeline=ruleExecutePipeline();

            state._fsp--;

             current =iv_ruleExecutePipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExecutePipeline"


    // $ANTLR start "ruleExecutePipeline"
    // InternalIoTParser.g:2184:1: ruleExecutePipeline returns [EObject current=null] : ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) ) ;
    public final EObject ruleExecutePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalIoTParser.g:2190:2: ( ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) ) )
            // InternalIoTParser.g:2191:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) )
            {
            // InternalIoTParser.g:2191:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) )
            int alt29=7;
            switch ( input.LA(1) ) {
            case Reduce:
                {
                alt29=1;
                }
                break;
            case Mean:
                {
                alt29=2;
                }
                break;
            case Median:
                {
                alt29=3;
                }
                break;
            case Stdev:
                {
                alt29=4;
                }
                break;
            case Min:
                {
                alt29=5;
                }
                break;
            case Max:
                {
                alt29=6;
                }
                break;
            case Count:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalIoTParser.g:2192:3: ( () otherlv_1= Reduce )
                    {
                    // InternalIoTParser.g:2192:3: ( () otherlv_1= Reduce )
                    // InternalIoTParser.g:2193:4: () otherlv_1= Reduce
                    {
                    // InternalIoTParser.g:2193:4: ()
                    // InternalIoTParser.g:2194:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getReduceAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Reduce,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExecutePipelineAccess().getReduceKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:2206:3: ( () otherlv_3= Mean )
                    {
                    // InternalIoTParser.g:2206:3: ( () otherlv_3= Mean )
                    // InternalIoTParser.g:2207:4: () otherlv_3= Mean
                    {
                    // InternalIoTParser.g:2207:4: ()
                    // InternalIoTParser.g:2208:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getMeanAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,Mean,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExecutePipelineAccess().getMeanKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:2220:3: ( () otherlv_5= Median )
                    {
                    // InternalIoTParser.g:2220:3: ( () otherlv_5= Median )
                    // InternalIoTParser.g:2221:4: () otherlv_5= Median
                    {
                    // InternalIoTParser.g:2221:4: ()
                    // InternalIoTParser.g:2222:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getMedianAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,Median,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getExecutePipelineAccess().getMedianKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:2234:3: ( () otherlv_7= Stdev )
                    {
                    // InternalIoTParser.g:2234:3: ( () otherlv_7= Stdev )
                    // InternalIoTParser.g:2235:4: () otherlv_7= Stdev
                    {
                    // InternalIoTParser.g:2235:4: ()
                    // InternalIoTParser.g:2236:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getStDevAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,Stdev,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExecutePipelineAccess().getStdevKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalIoTParser.g:2248:3: ( () otherlv_9= Min )
                    {
                    // InternalIoTParser.g:2248:3: ( () otherlv_9= Min )
                    // InternalIoTParser.g:2249:4: () otherlv_9= Min
                    {
                    // InternalIoTParser.g:2249:4: ()
                    // InternalIoTParser.g:2250:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getMinAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,Min,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getExecutePipelineAccess().getMinKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalIoTParser.g:2262:3: ( () otherlv_11= Max )
                    {
                    // InternalIoTParser.g:2262:3: ( () otherlv_11= Max )
                    // InternalIoTParser.g:2263:4: () otherlv_11= Max
                    {
                    // InternalIoTParser.g:2263:4: ()
                    // InternalIoTParser.g:2264:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getMaxAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,Max,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getExecutePipelineAccess().getMaxKeyword_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalIoTParser.g:2276:3: ( () otherlv_13= Count )
                    {
                    // InternalIoTParser.g:2276:3: ( () otherlv_13= Count )
                    // InternalIoTParser.g:2277:4: () otherlv_13= Count
                    {
                    // InternalIoTParser.g:2277:4: ()
                    // InternalIoTParser.g:2278:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getCountAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,Count,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getExecutePipelineAccess().getCountKeyword_6_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecutePipeline"


    // $ANTLR start "entryRuleExpression"
    // InternalIoTParser.g:2293:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalIoTParser.g:2293:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalIoTParser.g:2294:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalIoTParser.g:2300:1: ruleExpression returns [EObject current=null] : this_Conditional_0= ruleConditional ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Conditional_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2306:2: (this_Conditional_0= ruleConditional )
            // InternalIoTParser.g:2307:2: this_Conditional_0= ruleConditional
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getConditionalParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Conditional_0=ruleConditional();

            state._fsp--;


            		current = this_Conditional_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConditional"
    // InternalIoTParser.g:2318:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalIoTParser.g:2318:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalIoTParser.g:2319:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalIoTParser.g:2325:1: ruleConditional returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Or_0 = null;

        EObject lv_correct_3_0 = null;

        EObject lv_incorrect_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2331:2: ( (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) )
            // InternalIoTParser.g:2332:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            {
            // InternalIoTParser.g:2332:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            // InternalIoTParser.g:2333:3: this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            {

            			newCompositeNode(grammarAccess.getConditionalAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2341:3: ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==QuestionMark) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIoTParser.g:2342:4: () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) )
                    {
                    // InternalIoTParser.g:2342:4: ()
                    // InternalIoTParser.g:2343:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getConditionalAccess().getConditionalConditionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,QuestionMark,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getQuestionMarkKeyword_1_1());
                    			
                    // InternalIoTParser.g:2353:4: ( (lv_correct_3_0= ruleConditional ) )
                    // InternalIoTParser.g:2354:5: (lv_correct_3_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2354:5: (lv_correct_3_0= ruleConditional )
                    // InternalIoTParser.g:2355:6: lv_correct_3_0= ruleConditional
                    {

                    						newCompositeNode(grammarAccess.getConditionalAccess().getCorrectConditionalParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_correct_3_0=ruleConditional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalRule());
                    						}
                    						set(
                    							current,
                    							"correct",
                    							lv_correct_3_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Conditional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,Colon,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getColonKeyword_1_3());
                    			
                    // InternalIoTParser.g:2376:4: ( (lv_incorrect_5_0= ruleConditional ) )
                    // InternalIoTParser.g:2377:5: (lv_incorrect_5_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2377:5: (lv_incorrect_5_0= ruleConditional )
                    // InternalIoTParser.g:2378:6: lv_incorrect_5_0= ruleConditional
                    {

                    						newCompositeNode(grammarAccess.getConditionalAccess().getIncorrectConditionalParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_incorrect_5_0=ruleConditional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalRule());
                    						}
                    						set(
                    							current,
                    							"incorrect",
                    							lv_incorrect_5_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Conditional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOr"
    // InternalIoTParser.g:2400:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalIoTParser.g:2400:43: (iv_ruleOr= ruleOr EOF )
            // InternalIoTParser.g:2401:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalIoTParser.g:2407:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2413:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) )
            // InternalIoTParser.g:2414:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            {
            // InternalIoTParser.g:2414:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            // InternalIoTParser.g:2415:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2423:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VerticalLineVerticalLine) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIoTParser.g:2424:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) )
                    {
                    // InternalIoTParser.g:2424:4: ()
                    // InternalIoTParser.g:2425:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
                    			
                    // InternalIoTParser.g:2435:4: ( (lv_right_3_0= ruleOr ) )
                    // InternalIoTParser.g:2436:5: (lv_right_3_0= ruleOr )
                    {
                    // InternalIoTParser.g:2436:5: (lv_right_3_0= ruleOr )
                    // InternalIoTParser.g:2437:6: lv_right_3_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getOrAccess().getRightOrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Or");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalIoTParser.g:2459:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalIoTParser.g:2459:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalIoTParser.g:2460:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalIoTParser.g:2466:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2472:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) )
            // InternalIoTParser.g:2473:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            {
            // InternalIoTParser.g:2473:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            // InternalIoTParser.g:2474:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2482:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==AmpersandAmpersand) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalIoTParser.g:2483:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) )
                    {
                    // InternalIoTParser.g:2483:4: ()
                    // InternalIoTParser.g:2484:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalIoTParser.g:2494:4: ( (lv_right_3_0= ruleAnd ) )
                    // InternalIoTParser.g:2495:5: (lv_right_3_0= ruleAnd )
                    {
                    // InternalIoTParser.g:2495:5: (lv_right_3_0= ruleAnd )
                    // InternalIoTParser.g:2496:6: lv_right_3_0= ruleAnd
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getRightAndParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.And");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalIoTParser.g:2518:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalIoTParser.g:2518:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalIoTParser.g:2519:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalIoTParser.g:2525:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2531:2: ( (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) )
            // InternalIoTParser.g:2532:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            {
            // InternalIoTParser.g:2532:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            // InternalIoTParser.g:2533:3: this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2541:3: ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==EqualsSignEqualsSign) ) {
                    alt33=1;
                }
                else if ( (LA33_0==ExclamationMarkEqualsSign) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalIoTParser.g:2542:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2542:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2543:5: () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2543:5: ()
            	    // InternalIoTParser.g:2544:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2554:5: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalIoTParser.g:2555:6: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:2555:6: (lv_right_3_0= ruleComparison )
            	    // InternalIoTParser.g:2556:7: lv_right_3_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_47);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.Comparison");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIoTParser.g:2575:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2575:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2576:5: () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2576:5: ()
            	    // InternalIoTParser.g:2577:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2587:5: ( (lv_right_6_0= ruleComparison ) )
            	    // InternalIoTParser.g:2588:6: (lv_right_6_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:2588:6: (lv_right_6_0= ruleComparison )
            	    // InternalIoTParser.g:2589:7: lv_right_6_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_47);
            	    lv_right_6_0=ruleComparison();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.Comparison");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalIoTParser.g:2612:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalIoTParser.g:2612:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalIoTParser.g:2613:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalIoTParser.g:2619:1: ruleComparison returns [EObject current=null] : (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_SubAdd_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2625:2: ( (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) )
            // InternalIoTParser.g:2626:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            {
            // InternalIoTParser.g:2626:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            // InternalIoTParser.g:2627:3: this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getSubAddParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_SubAdd_0=ruleSubAdd();

            state._fsp--;


            			current = this_SubAdd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2635:3: ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            loop34:
            do {
                int alt34=5;
                switch ( input.LA(1) ) {
                case LessThanSign:
                    {
                    alt34=1;
                    }
                    break;
                case LessThanSignEqualsSign:
                    {
                    alt34=2;
                    }
                    break;
                case GreaterThanSign:
                    {
                    alt34=3;
                    }
                    break;
                case GreaterThanSignEqualsSign:
                    {
                    alt34=4;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // InternalIoTParser.g:2636:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2636:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2637:5: () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2637:5: ()
            	    // InternalIoTParser.g:2638:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,LessThanSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2648:5: ( (lv_right_3_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2649:6: (lv_right_3_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2649:6: (lv_right_3_0= ruleSubAdd )
            	    // InternalIoTParser.g:2650:7: lv_right_3_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_48);
            	    lv_right_3_0=ruleSubAdd();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.SubAdd");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIoTParser.g:2669:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2669:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2670:5: () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2670:5: ()
            	    // InternalIoTParser.g:2671:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,LessThanSignEqualsSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2681:5: ( (lv_right_6_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2682:6: (lv_right_6_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2682:6: (lv_right_6_0= ruleSubAdd )
            	    // InternalIoTParser.g:2683:7: lv_right_6_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_48);
            	    lv_right_6_0=ruleSubAdd();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.SubAdd");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIoTParser.g:2702:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2702:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2703:5: () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2703:5: ()
            	    // InternalIoTParser.g:2704:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,GreaterThanSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_2_1());
            	    				
            	    // InternalIoTParser.g:2714:5: ( (lv_right_9_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2715:6: (lv_right_9_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2715:6: (lv_right_9_0= ruleSubAdd )
            	    // InternalIoTParser.g:2716:7: lv_right_9_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_48);
            	    lv_right_9_0=ruleSubAdd();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.SubAdd");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIoTParser.g:2735:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2735:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2736:5: () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2736:5: ()
            	    // InternalIoTParser.g:2737:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalIoTParser.g:2747:5: ( (lv_right_12_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2748:6: (lv_right_12_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2748:6: (lv_right_12_0= ruleSubAdd )
            	    // InternalIoTParser.g:2749:7: lv_right_12_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_48);
            	    lv_right_12_0=ruleSubAdd();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.SubAdd");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleSubAdd"
    // InternalIoTParser.g:2772:1: entryRuleSubAdd returns [EObject current=null] : iv_ruleSubAdd= ruleSubAdd EOF ;
    public final EObject entryRuleSubAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAdd = null;


        try {
            // InternalIoTParser.g:2772:47: (iv_ruleSubAdd= ruleSubAdd EOF )
            // InternalIoTParser.g:2773:2: iv_ruleSubAdd= ruleSubAdd EOF
            {
             newCompositeNode(grammarAccess.getSubAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubAdd=ruleSubAdd();

            state._fsp--;

             current =iv_ruleSubAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubAdd"


    // $ANTLR start "ruleSubAdd"
    // InternalIoTParser.g:2779:1: ruleSubAdd returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) ;
    public final EObject ruleSubAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2785:2: ( (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) )
            // InternalIoTParser.g:2786:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            {
            // InternalIoTParser.g:2786:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            // InternalIoTParser.g:2787:3: this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubAddAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2795:3: ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==PlusSign) ) {
                    alt35=1;
                }
                else if ( (LA35_0==HyphenMinus) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalIoTParser.g:2796:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:2796:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:2797:5: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:2797:5: ()
            	    // InternalIoTParser.g:2798:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSubAddAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2808:5: ( (lv_right_3_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:2809:6: (lv_right_3_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:2809:6: (lv_right_3_0= ruleMulDiv )
            	    // InternalIoTParser.g:2810:7: lv_right_3_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_49);
            	    lv_right_3_0=ruleMulDiv();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSubAddRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.MulDiv");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIoTParser.g:2829:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:2829:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:2830:5: () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:2830:5: ()
            	    // InternalIoTParser.g:2831:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,HyphenMinus,FOLLOW_40); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSubAddAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2841:5: ( (lv_right_6_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:2842:6: (lv_right_6_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:2842:6: (lv_right_6_0= ruleMulDiv )
            	    // InternalIoTParser.g:2843:7: lv_right_6_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_49);
            	    lv_right_6_0=ruleMulDiv();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSubAddRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.MulDiv");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubAdd"


    // $ANTLR start "entryRuleMulDiv"
    // InternalIoTParser.g:2866:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalIoTParser.g:2866:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalIoTParser.g:2867:2: iv_ruleMulDiv= ruleMulDiv EOF
            {
             newCompositeNode(grammarAccess.getMulDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulDiv=ruleMulDiv();

            state._fsp--;

             current =iv_ruleMulDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulDiv"


    // $ANTLR start "ruleMulDiv"
    // InternalIoTParser.g:2873:1: ruleMulDiv returns [EObject current=null] : (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2879:2: ( (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) )
            // InternalIoTParser.g:2880:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            {
            // InternalIoTParser.g:2880:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            // InternalIoTParser.g:2881:3: this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2889:3: ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Asterisk) ) {
                    alt36=1;
                }
                else if ( (LA36_0==Solidus) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalIoTParser.g:2890:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:2890:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:2891:5: () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:2891:5: ()
            	    // InternalIoTParser.g:2892:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_40); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2902:5: ( (lv_right_3_0= ruleNegation ) )
            	    // InternalIoTParser.g:2903:6: (lv_right_3_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:2903:6: (lv_right_3_0= ruleNegation )
            	    // InternalIoTParser.g:2904:7: lv_right_3_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_50);
            	    lv_right_3_0=ruleNegation();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMulDivRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.Negation");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIoTParser.g:2923:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:2923:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:2924:5: () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:2924:5: ()
            	    // InternalIoTParser.g:2925:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,Solidus,FOLLOW_40); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMulDivAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2935:5: ( (lv_right_6_0= ruleNegation ) )
            	    // InternalIoTParser.g:2936:6: (lv_right_6_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:2936:6: (lv_right_6_0= ruleNegation )
            	    // InternalIoTParser.g:2937:7: lv_right_6_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_50);
            	    lv_right_6_0=ruleNegation();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMulDivRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.xtext.mdsd.arduino.boardgenerator.IoT.Negation");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRuleNegation"
    // InternalIoTParser.g:2960:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalIoTParser.g:2960:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalIoTParser.g:2961:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalIoTParser.g:2967:1: ruleNegation returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Exponent_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2973:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) )
            // InternalIoTParser.g:2974:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            {
            // InternalIoTParser.g:2974:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==HyphenMinus) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=ExclamationMark && LA37_0<=LeftParenthesis)||(LA37_0>=RULE_INT && LA37_0<=RULE_BOOLEAN)||(LA37_0>=RULE_ID && LA37_0<=RULE_STRING)) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalIoTParser.g:2975:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    {
                    // InternalIoTParser.g:2975:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    // InternalIoTParser.g:2976:4: () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) )
                    {
                    // InternalIoTParser.g:2976:4: ()
                    // InternalIoTParser.g:2977:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getNegationAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalIoTParser.g:2987:4: ( (lv_value_2_0= ruleExponent ) )
                    // InternalIoTParser.g:2988:5: (lv_value_2_0= ruleExponent )
                    {
                    // InternalIoTParser.g:2988:5: (lv_value_2_0= ruleExponent )
                    // InternalIoTParser.g:2989:6: lv_value_2_0= ruleExponent
                    {

                    						newCompositeNode(grammarAccess.getNegationAccess().getValueExponentParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleExponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Exponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:3008:3: this_Exponent_3= ruleExponent
                    {

                    			newCompositeNode(grammarAccess.getNegationAccess().getExponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Exponent_3=ruleExponent();

                    state._fsp--;


                    			current = this_Exponent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleExponent"
    // InternalIoTParser.g:3020:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalIoTParser.g:3020:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalIoTParser.g:3021:2: iv_ruleExponent= ruleExponent EOF
            {
             newCompositeNode(grammarAccess.getExponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponent=ruleExponent();

            state._fsp--;

             current =iv_ruleExponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponent"


    // $ANTLR start "ruleExponent"
    // InternalIoTParser.g:3027:1: ruleExponent returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_power_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3033:2: ( (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) )
            // InternalIoTParser.g:3034:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            {
            // InternalIoTParser.g:3034:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            // InternalIoTParser.g:3035:3: this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            {

            			newCompositeNode(grammarAccess.getExponentAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3043:3: ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==AsteriskAsterisk) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIoTParser.g:3044:4: () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) )
                    {
                    // InternalIoTParser.g:3044:4: ()
                    // InternalIoTParser.g:3045:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExponentAccess().getExponentBaseAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AsteriskAsterisk,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
                    			
                    // InternalIoTParser.g:3055:4: ( (lv_power_3_0= ruleNegation ) )
                    // InternalIoTParser.g:3056:5: (lv_power_3_0= ruleNegation )
                    {
                    // InternalIoTParser.g:3056:5: (lv_power_3_0= ruleNegation )
                    // InternalIoTParser.g:3057:6: lv_power_3_0= ruleNegation
                    {

                    						newCompositeNode(grammarAccess.getExponentAccess().getPowerNegationParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_power_3_0=ruleNegation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentRule());
                    						}
                    						set(
                    							current,
                    							"power",
                    							lv_power_3_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Negation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponent"


    // $ANTLR start "entryRuleNot"
    // InternalIoTParser.g:3079:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalIoTParser.g:3079:44: (iv_ruleNot= ruleNot EOF )
            // InternalIoTParser.g:3080:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalIoTParser.g:3086:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Primary_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3092:2: ( ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) )
            // InternalIoTParser.g:3093:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            {
            // InternalIoTParser.g:3093:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ExclamationMark) ) {
                alt39=1;
            }
            else if ( (LA39_0==LeftParenthesis||(LA39_0>=RULE_INT && LA39_0<=RULE_BOOLEAN)||(LA39_0>=RULE_ID && LA39_0<=RULE_STRING)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalIoTParser.g:3094:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    {
                    // InternalIoTParser.g:3094:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    // InternalIoTParser.g:3095:4: () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) )
                    {
                    // InternalIoTParser.g:3095:4: ()
                    // InternalIoTParser.g:3096:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_1());
                    			
                    // InternalIoTParser.g:3106:4: ( (lv_value_2_0= rulePrimary ) )
                    // InternalIoTParser.g:3107:5: (lv_value_2_0= rulePrimary )
                    {
                    // InternalIoTParser.g:3107:5: (lv_value_2_0= rulePrimary )
                    // InternalIoTParser.g:3108:6: lv_value_2_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getNotAccess().getValuePrimaryParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:3127:3: this_Primary_3= rulePrimary
                    {

                    			newCompositeNode(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primary_3=rulePrimary();

                    state._fsp--;


                    			current = this_Primary_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRulePrimary"
    // InternalIoTParser.g:3139:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalIoTParser.g:3139:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalIoTParser.g:3140:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalIoTParser.g:3146:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Reference_3 = null;

        EObject this_NumberLiteral_4 = null;

        EObject this_BooleanLiteral_5 = null;

        EObject this_StringLiteral_6 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3152:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) )
            // InternalIoTParser.g:3153:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            {
            // InternalIoTParser.g:3153:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            int alt40=5;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt40=1;
                }
                break;
            case RULE_ID:
                {
                alt40=2;
                }
                break;
            case RULE_INT:
            case RULE_DBL:
            case RULE_SCI:
                {
                alt40=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt40=4;
                }
                break;
            case RULE_STRING:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalIoTParser.g:3154:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalIoTParser.g:3154:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalIoTParser.g:3155:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_40); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_52);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:3173:3: this_Reference_3= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_3=ruleReference();

                    state._fsp--;


                    			current = this_Reference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:3182:3: this_NumberLiteral_4= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_4=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:3191:3: this_BooleanLiteral_5= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_5=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalIoTParser.g:3200:3: this_StringLiteral_6= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_6=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleReference"
    // InternalIoTParser.g:3212:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalIoTParser.g:3212:50: (iv_ruleReference= ruleReference EOF )
            // InternalIoTParser.g:3213:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalIoTParser.g:3219:1: ruleReference returns [EObject current=null] : ( (lv_ref_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3225:2: ( ( (lv_ref_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:3226:2: ( (lv_ref_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:3226:2: ( (lv_ref_0_0= RULE_ID ) )
            // InternalIoTParser.g:3227:3: (lv_ref_0_0= RULE_ID )
            {
            // InternalIoTParser.g:3227:3: (lv_ref_0_0= RULE_ID )
            // InternalIoTParser.g:3228:4: lv_ref_0_0= RULE_ID
            {
            lv_ref_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_ref_0_0, grammarAccess.getReferenceAccess().getRefIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReferenceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"ref",
            					lv_ref_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalIoTParser.g:3247:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalIoTParser.g:3247:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalIoTParser.g:3248:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalIoTParser.g:3254:1: ruleStringLiteral returns [EObject current=null] : ( (lv_str_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3260:2: ( ( (lv_str_0_0= RULE_STRING ) ) )
            // InternalIoTParser.g:3261:2: ( (lv_str_0_0= RULE_STRING ) )
            {
            // InternalIoTParser.g:3261:2: ( (lv_str_0_0= RULE_STRING ) )
            // InternalIoTParser.g:3262:3: (lv_str_0_0= RULE_STRING )
            {
            // InternalIoTParser.g:3262:3: (lv_str_0_0= RULE_STRING )
            // InternalIoTParser.g:3263:4: lv_str_0_0= RULE_STRING
            {
            lv_str_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_str_0_0, grammarAccess.getStringLiteralAccess().getStrSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"str",
            					lv_str_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalIoTParser.g:3282:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalIoTParser.g:3282:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalIoTParser.g:3283:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalIoTParser.g:3289:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_numb_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numb_0_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3295:2: ( ( (lv_numb_0_0= ruleNUMBER ) ) )
            // InternalIoTParser.g:3296:2: ( (lv_numb_0_0= ruleNUMBER ) )
            {
            // InternalIoTParser.g:3296:2: ( (lv_numb_0_0= ruleNUMBER ) )
            // InternalIoTParser.g:3297:3: (lv_numb_0_0= ruleNUMBER )
            {
            // InternalIoTParser.g:3297:3: (lv_numb_0_0= ruleNUMBER )
            // InternalIoTParser.g:3298:4: lv_numb_0_0= ruleNUMBER
            {

            				newCompositeNode(grammarAccess.getNumberLiteralAccess().getNumbNUMBERParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_numb_0_0=ruleNUMBER();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            				}
            				set(
            					current,
            					"numb",
            					lv_numb_0_0,
            					"org.xtext.mdsd.arduino.boardgenerator.IoT.NUMBER");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalIoTParser.g:3318:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalIoTParser.g:3318:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalIoTParser.g:3319:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalIoTParser.g:3325:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_bool_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bool_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3331:2: ( ( (lv_bool_0_0= RULE_BOOLEAN ) ) )
            // InternalIoTParser.g:3332:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            {
            // InternalIoTParser.g:3332:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            // InternalIoTParser.g:3333:3: (lv_bool_0_0= RULE_BOOLEAN )
            {
            // InternalIoTParser.g:3333:3: (lv_bool_0_0= RULE_BOOLEAN )
            // InternalIoTParser.g:3334:4: lv_bool_0_0= RULE_BOOLEAN
            {
            lv_bool_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_bool_0_0, grammarAccess.getBooleanLiteralAccess().getBoolBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"bool",
            					lv_bool_0_0,
            					"org.xtext.mdsd.arduino.boardgenerator.IoT.BOOLEAN");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNUMBER"
    // InternalIoTParser.g:3353:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3355:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalIoTParser.g:3356:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalIoTParser.g:3365:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_SCI_2= RULE_SCI ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DBL_1=null;
        Token this_SCI_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3372:2: ( (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_SCI_2= RULE_SCI ) )
            // InternalIoTParser.g:3373:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_SCI_2= RULE_SCI )
            {
            // InternalIoTParser.g:3373:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_SCI_2= RULE_SCI )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt41=1;
                }
                break;
            case RULE_DBL:
                {
                alt41=2;
                }
                break;
            case RULE_SCI:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalIoTParser.g:3374:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:3382:3: this_DBL_1= RULE_DBL
                    {
                    this_DBL_1=(Token)match(input,RULE_DBL,FOLLOW_2); 

                    			current.merge(this_DBL_1);
                    		

                    			newLeafNode(this_DBL_1, grammarAccess.getNUMBERAccess().getDBLTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:3390:3: this_SCI_2= RULE_SCI
                    {
                    this_SCI_2=(Token)match(input,RULE_SCI,FOLLOW_2); 

                    			current.merge(this_SCI_2);
                    		

                    			newLeafNode(this_SCI_2, grammarAccess.getNUMBERAccess().getSCITerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000401282L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400282L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001040200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000204004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040100080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040100080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0240000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000006000010100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0430000000000000L,0x00000000000033C0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000018022860000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001080000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4002800000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0500000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1080000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040000000000000L});

}