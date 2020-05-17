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
    // InternalIoTParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_include_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_include_0_0 = null;

        EObject lv_channel_1_0 = null;

        EObject lv_abstractBoard_2_0 = null;

        EObject lv_board_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:70:2: ( ( ( (lv_include_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )* ) )
            // InternalIoTParser.g:71:2: ( ( (lv_include_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )* )
            {
            // InternalIoTParser.g:71:2: ( ( (lv_include_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )* )
            // InternalIoTParser.g:72:3: ( (lv_include_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_abstractBoard_2_0= ruleAbstractBoard ) )* ( (lv_board_3_0= ruleBoard ) )*
            {
            // InternalIoTParser.g:72:3: ( (lv_include_0_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Include) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIoTParser.g:73:4: (lv_include_0_0= ruleInclude )
            	    {
            	    // InternalIoTParser.g:73:4: (lv_include_0_0= ruleInclude )
            	    // InternalIoTParser.g:74:5: lv_include_0_0= ruleInclude
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getIncludeIncludeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_include_0_0=ruleInclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"include",
            	    						lv_include_0_0,
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
    // InternalIoTParser.g:159:1: ruleInclude returns [EObject current=null] : (otherlv_0= Include ( (lv_path_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_path_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:165:2: ( (otherlv_0= Include ( (lv_path_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_path_3_0= RULE_ID ) ) )* ) )
            // InternalIoTParser.g:166:2: (otherlv_0= Include ( (lv_path_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_path_3_0= RULE_ID ) ) )* )
            {
            // InternalIoTParser.g:166:2: (otherlv_0= Include ( (lv_path_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_path_3_0= RULE_ID ) ) )* )
            // InternalIoTParser.g:167:3: otherlv_0= Include ( (lv_path_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_path_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Include,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalIoTParser.g:171:3: ( (lv_path_1_0= RULE_ID ) )
            // InternalIoTParser.g:172:4: (lv_path_1_0= RULE_ID )
            {
            // InternalIoTParser.g:172:4: (lv_path_1_0= RULE_ID )
            // InternalIoTParser.g:173:5: lv_path_1_0= RULE_ID
            {
            lv_path_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_path_1_0, grammarAccess.getIncludeAccess().getPathIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					addWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIoTParser.g:189:3: (otherlv_2= FullStop ( (lv_path_3_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==FullStop) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIoTParser.g:190:4: otherlv_2= FullStop ( (lv_path_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,FullStop,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalIoTParser.g:194:4: ( (lv_path_3_0= RULE_ID ) )
            	    // InternalIoTParser.g:195:5: (lv_path_3_0= RULE_ID )
            	    {
            	    // InternalIoTParser.g:195:5: (lv_path_3_0= RULE_ID )
            	    // InternalIoTParser.g:196:6: lv_path_3_0= RULE_ID
            	    {
            	    lv_path_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(lv_path_3_0, grammarAccess.getIncludeAccess().getPathIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIncludeRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"path",
            	    							lv_path_3_0,
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
    // InternalIoTParser.g:942:1: ruleExtendsBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (lv_abstractBoard_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? ) ;
    public final EObject ruleExtendsBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_abstractBoard_2_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_sensors_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:948:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (lv_abstractBoard_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? ) )
            // InternalIoTParser.g:949:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (lv_abstractBoard_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? )
            {
            // InternalIoTParser.g:949:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (lv_abstractBoard_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? )
            // InternalIoTParser.g:950:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (lv_abstractBoard_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )?
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
            		
            // InternalIoTParser.g:972:3: ( (lv_abstractBoard_2_0= RULE_ID ) )
            // InternalIoTParser.g:973:4: (lv_abstractBoard_2_0= RULE_ID )
            {
            // InternalIoTParser.g:973:4: (lv_abstractBoard_2_0= RULE_ID )
            // InternalIoTParser.g:974:5: lv_abstractBoard_2_0= RULE_ID
            {
            lv_abstractBoard_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_abstractBoard_2_0, grammarAccess.getExtendsBoardAccess().getAbstractBoardIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendsBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"abstractBoard",
            						lv_abstractBoard_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIoTParser.g:990:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Colon) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIoTParser.g:991:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtendsBoardAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getExtendsBoardAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:999:4: ( (lv_sensors_5_0= ruleSensor ) )+
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
                    	    // InternalIoTParser.g:1000:5: (lv_sensors_5_0= ruleSensor )
                    	    {
                    	    // InternalIoTParser.g:1000:5: (lv_sensors_5_0= ruleSensor )
                    	    // InternalIoTParser.g:1001:6: lv_sensors_5_0= ruleSensor
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
    // InternalIoTParser.g:1027:1: entryRuleAbstractBoard returns [EObject current=null] : iv_ruleAbstractBoard= ruleAbstractBoard EOF ;
    public final EObject entryRuleAbstractBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBoard = null;


        try {
            // InternalIoTParser.g:1027:54: (iv_ruleAbstractBoard= ruleAbstractBoard EOF )
            // InternalIoTParser.g:1028:2: iv_ruleAbstractBoard= ruleAbstractBoard EOF
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
    // InternalIoTParser.g:1034:1: ruleAbstractBoard returns [EObject current=null] : (otherlv_0= Abstract otherlv_1= Board ( (lv_board_2_0= ruleNewBoard ) ) ) ;
    public final EObject ruleAbstractBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_board_2_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1040:2: ( (otherlv_0= Abstract otherlv_1= Board ( (lv_board_2_0= ruleNewBoard ) ) ) )
            // InternalIoTParser.g:1041:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_board_2_0= ruleNewBoard ) ) )
            {
            // InternalIoTParser.g:1041:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_board_2_0= ruleNewBoard ) ) )
            // InternalIoTParser.g:1042:3: otherlv_0= Abstract otherlv_1= Board ( (lv_board_2_0= ruleNewBoard ) )
            {
            otherlv_0=(Token)match(input,Abstract,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractBoardAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,Board,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractBoardAccess().getBoardKeyword_1());
            		
            // InternalIoTParser.g:1050:3: ( (lv_board_2_0= ruleNewBoard ) )
            // InternalIoTParser.g:1051:4: (lv_board_2_0= ruleNewBoard )
            {
            // InternalIoTParser.g:1051:4: (lv_board_2_0= ruleNewBoard )
            // InternalIoTParser.g:1052:5: lv_board_2_0= ruleNewBoard
            {

            					newCompositeNode(grammarAccess.getAbstractBoardAccess().getBoardNewBoardParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_board_2_0=ruleNewBoard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractBoardRule());
            					}
            					set(
            						current,
            						"board",
            						lv_board_2_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.NewBoard");
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
    // $ANTLR end "ruleAbstractBoard"


    // $ANTLR start "entryRuleSensor"
    // InternalIoTParser.g:1073:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoTParser.g:1073:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoTParser.g:1074:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalIoTParser.g:1080:1: ruleSensor returns [EObject current=null] : (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? ( (lv_output_10_0= ruleSensorOutput ) )+ this_END_11= RULE_END ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token otherlv_8=null;
        Token this_END_11=null;
        EObject lv_sensortype_3_0 = null;

        EObject lv_vars_5_0 = null;

        EObject lv_sampler_9_0 = null;

        EObject lv_output_10_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1086:2: ( (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? ( (lv_output_10_0= ruleSensorOutput ) )+ this_END_11= RULE_END ) )
            // InternalIoTParser.g:1087:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? ( (lv_output_10_0= ruleSensorOutput ) )+ this_END_11= RULE_END )
            {
            // InternalIoTParser.g:1087:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? ( (lv_output_10_0= ruleSensorOutput ) )+ this_END_11= RULE_END )
            // InternalIoTParser.g:1088:3: otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? ( (lv_output_10_0= ruleSensorOutput ) )+ this_END_11= RULE_END
            {
            otherlv_0=(Token)match(input,Sensor,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalIoTParser.g:1092:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:1093:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:1093:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:1094:5: lv_name_1_0= RULE_ID
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
            		
            // InternalIoTParser.g:1114:3: ( (lv_sensortype_3_0= ruleSensorType ) )
            // InternalIoTParser.g:1115:4: (lv_sensortype_3_0= ruleSensorType )
            {
            // InternalIoTParser.g:1115:4: (lv_sensortype_3_0= ruleSensorType )
            // InternalIoTParser.g:1116:5: lv_sensortype_3_0= ruleSensorType
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
            		
            // InternalIoTParser.g:1137:3: ( (lv_vars_5_0= ruleSensorVariables ) )
            // InternalIoTParser.g:1138:4: (lv_vars_5_0= ruleSensorVariables )
            {
            // InternalIoTParser.g:1138:4: (lv_vars_5_0= ruleSensorVariables )
            // InternalIoTParser.g:1139:5: lv_vars_5_0= ruleSensorVariables
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
            		
            // InternalIoTParser.g:1164:3: (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Sample) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIoTParser.g:1165:4: otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) )
                    {
                    otherlv_8=(Token)match(input,Sample,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getSampleKeyword_8_0());
                    			
                    // InternalIoTParser.g:1169:4: ( (lv_sampler_9_0= ruleSampler ) )
                    // InternalIoTParser.g:1170:5: (lv_sampler_9_0= ruleSampler )
                    {
                    // InternalIoTParser.g:1170:5: (lv_sampler_9_0= ruleSampler )
                    // InternalIoTParser.g:1171:6: lv_sampler_9_0= ruleSampler
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

            // InternalIoTParser.g:1189:3: ( (lv_output_10_0= ruleSensorOutput ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Pipe) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIoTParser.g:1190:4: (lv_output_10_0= ruleSensorOutput )
            	    {
            	    // InternalIoTParser.g:1190:4: (lv_output_10_0= ruleSensorOutput )
            	    // InternalIoTParser.g:1191:5: lv_output_10_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputSensorOutputParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_output_10_0=ruleSensorOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"output",
            	    						lv_output_10_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.SensorOutput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_11, grammarAccess.getSensorAccess().getENDTerminalRuleCall_10());
            		

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
    // InternalIoTParser.g:1216:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalIoTParser.g:1216:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalIoTParser.g:1217:2: iv_ruleSensorType= ruleSensorType EOF
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
    // InternalIoTParser.g:1223:1: ruleSensorType returns [EObject current=null] : (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalSensor_0 = null;

        EObject this_OnboardSensor_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1229:2: ( (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) )
            // InternalIoTParser.g:1230:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            {
            // InternalIoTParser.g:1230:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==LeftParenthesis) ) {
                    alt18=1;
                }
                else if ( (LA18_1==EOF||LA18_1==As) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalIoTParser.g:1231:3: this_ExternalSensor_0= ruleExternalSensor
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
                    // InternalIoTParser.g:1240:3: this_OnboardSensor_1= ruleOnboardSensor
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
    // InternalIoTParser.g:1252:1: entryRuleExternalSensor returns [EObject current=null] : iv_ruleExternalSensor= ruleExternalSensor EOF ;
    public final EObject entryRuleExternalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSensor = null;


        try {
            // InternalIoTParser.g:1252:55: (iv_ruleExternalSensor= ruleExternalSensor EOF )
            // InternalIoTParser.g:1253:2: iv_ruleExternalSensor= ruleExternalSensor EOF
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
    // InternalIoTParser.g:1259:1: ruleExternalSensor returns [EObject current=null] : ( ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) ;
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
            // InternalIoTParser.g:1265:2: ( ( ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1266:2: ( ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1266:2: ( ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1267:3: ( (lv_sensor_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1267:3: ( (lv_sensor_0_0= RULE_ID ) )
            // InternalIoTParser.g:1268:4: (lv_sensor_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1268:4: (lv_sensor_0_0= RULE_ID )
            // InternalIoTParser.g:1269:5: lv_sensor_0_0= RULE_ID
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
            		
            // InternalIoTParser.g:1289:3: ( (lv_pins_2_0= RULE_INT ) )
            // InternalIoTParser.g:1290:4: (lv_pins_2_0= RULE_INT )
            {
            // InternalIoTParser.g:1290:4: (lv_pins_2_0= RULE_INT )
            // InternalIoTParser.g:1291:5: lv_pins_2_0= RULE_INT
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

            // InternalIoTParser.g:1307:3: (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Comma) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIoTParser.g:1308:4: otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_16); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalSensorAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1312:4: ( (lv_pins_4_0= RULE_INT ) )
            	    // InternalIoTParser.g:1313:5: (lv_pins_4_0= RULE_INT )
            	    {
            	    // InternalIoTParser.g:1313:5: (lv_pins_4_0= RULE_INT )
            	    // InternalIoTParser.g:1314:6: lv_pins_4_0= RULE_INT
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
            	    break loop19;
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
    // InternalIoTParser.g:1339:1: entryRuleOnboardSensor returns [EObject current=null] : iv_ruleOnboardSensor= ruleOnboardSensor EOF ;
    public final EObject entryRuleOnboardSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnboardSensor = null;


        try {
            // InternalIoTParser.g:1339:54: (iv_ruleOnboardSensor= ruleOnboardSensor EOF )
            // InternalIoTParser.g:1340:2: iv_ruleOnboardSensor= ruleOnboardSensor EOF
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
    // InternalIoTParser.g:1346:1: ruleOnboardSensor returns [EObject current=null] : ( (lv_sensor_0_0= RULE_ID ) ) ;
    public final EObject ruleOnboardSensor() throws RecognitionException {
        EObject current = null;

        Token lv_sensor_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1352:2: ( ( (lv_sensor_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1353:2: ( (lv_sensor_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1353:2: ( (lv_sensor_0_0= RULE_ID ) )
            // InternalIoTParser.g:1354:3: (lv_sensor_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1354:3: (lv_sensor_0_0= RULE_ID )
            // InternalIoTParser.g:1355:4: lv_sensor_0_0= RULE_ID
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
    // InternalIoTParser.g:1374:1: entryRuleSensorVariables returns [EObject current=null] : iv_ruleSensorVariables= ruleSensorVariables EOF ;
    public final EObject entryRuleSensorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorVariables = null;


        try {
            // InternalIoTParser.g:1374:56: (iv_ruleSensorVariables= ruleSensorVariables EOF )
            // InternalIoTParser.g:1375:2: iv_ruleSensorVariables= ruleSensorVariables EOF
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
    // InternalIoTParser.g:1381:1: ruleSensorVariables returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) ;
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
            // InternalIoTParser.g:1387:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1388:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1388:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1389:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1389:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1390:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1390:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1391:5: lv_name_0_0= RULE_ID
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
            		
            // InternalIoTParser.g:1411:3: ( (lv_ids_2_0= ruleVariable ) )
            // InternalIoTParser.g:1412:4: (lv_ids_2_0= ruleVariable )
            {
            // InternalIoTParser.g:1412:4: (lv_ids_2_0= ruleVariable )
            // InternalIoTParser.g:1413:5: lv_ids_2_0= ruleVariable
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

            // InternalIoTParser.g:1430:3: (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIoTParser.g:1431:4: otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSensorVariablesAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1435:4: ( (lv_ids_4_0= ruleVariable ) )
            	    // InternalIoTParser.g:1436:5: (lv_ids_4_0= ruleVariable )
            	    {
            	    // InternalIoTParser.g:1436:5: (lv_ids_4_0= ruleVariable )
            	    // InternalIoTParser.g:1437:6: lv_ids_4_0= ruleVariable
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
            	    break loop20;
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
    // InternalIoTParser.g:1463:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalIoTParser.g:1463:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalIoTParser.g:1464:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalIoTParser.g:1470:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1476:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1477:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1477:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1478:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1478:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1479:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:1498:1: entryRuleSampler returns [EObject current=null] : iv_ruleSampler= ruleSampler EOF ;
    public final EObject entryRuleSampler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampler = null;


        try {
            // InternalIoTParser.g:1498:48: (iv_ruleSampler= ruleSampler EOF )
            // InternalIoTParser.g:1499:2: iv_ruleSampler= ruleSampler EOF
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
    // InternalIoTParser.g:1505:1: ruleSampler returns [EObject current=null] : (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) ;
    public final EObject ruleSampler() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Frequency_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1511:2: ( (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) )
            // InternalIoTParser.g:1512:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            {
            // InternalIoTParser.g:1512:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Command) ) {
                alt21=1;
            }
            else if ( (LA21_0==Frequency) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalIoTParser.g:1513:3: this_Command_0= ruleCommand
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
                    // InternalIoTParser.g:1522:3: this_Frequency_1= ruleFrequency
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
    // InternalIoTParser.g:1534:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalIoTParser.g:1534:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalIoTParser.g:1535:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalIoTParser.g:1541:1: ruleCommand returns [EObject current=null] : (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1547:2: ( (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:1548:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:1548:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) )
            // InternalIoTParser.g:1549:3: otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Command,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalIoTParser.g:1553:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalIoTParser.g:1554:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:1554:4: (lv_command_1_0= RULE_STRING )
            // InternalIoTParser.g:1555:5: lv_command_1_0= RULE_STRING
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
    // InternalIoTParser.g:1575:1: entryRuleFrequency returns [EObject current=null] : iv_ruleFrequency= ruleFrequency EOF ;
    public final EObject entryRuleFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequency = null;


        try {
            // InternalIoTParser.g:1575:50: (iv_ruleFrequency= ruleFrequency EOF )
            // InternalIoTParser.g:1576:2: iv_ruleFrequency= ruleFrequency EOF
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
    // InternalIoTParser.g:1582:1: ruleFrequency returns [EObject current=null] : (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) ;
    public final EObject ruleFrequency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_frequency_1_0=null;
        EObject lv_resolution_2_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1588:2: ( (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) )
            // InternalIoTParser.g:1589:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            {
            // InternalIoTParser.g:1589:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            // InternalIoTParser.g:1590:3: otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) )
            {
            otherlv_0=(Token)match(input,Frequency,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFrequencyAccess().getFrequencyKeyword_0());
            		
            // InternalIoTParser.g:1594:3: ( (lv_frequency_1_0= RULE_INT ) )
            // InternalIoTParser.g:1595:4: (lv_frequency_1_0= RULE_INT )
            {
            // InternalIoTParser.g:1595:4: (lv_frequency_1_0= RULE_INT )
            // InternalIoTParser.g:1596:5: lv_frequency_1_0= RULE_INT
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

            // InternalIoTParser.g:1612:3: ( (lv_resolution_2_0= ruleResolution ) )
            // InternalIoTParser.g:1613:4: (lv_resolution_2_0= ruleResolution )
            {
            // InternalIoTParser.g:1613:4: (lv_resolution_2_0= ruleResolution )
            // InternalIoTParser.g:1614:5: lv_resolution_2_0= ruleResolution
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
    // InternalIoTParser.g:1635:1: entryRuleResolution returns [EObject current=null] : iv_ruleResolution= ruleResolution EOF ;
    public final EObject entryRuleResolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolution = null;


        try {
            // InternalIoTParser.g:1635:51: (iv_ruleResolution= ruleResolution EOF )
            // InternalIoTParser.g:1636:2: iv_ruleResolution= ruleResolution EOF
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
    // InternalIoTParser.g:1642:1: ruleResolution returns [EObject current=null] : ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) ;
    public final EObject ruleResolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1648:2: ( ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) )
            // InternalIoTParser.g:1649:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            {
            // InternalIoTParser.g:1649:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case Seconds:
                {
                alt22=1;
                }
                break;
            case Milliseconds:
                {
                alt22=2;
                }
                break;
            case Microseconds:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalIoTParser.g:1650:3: ( () otherlv_1= Seconds )
                    {
                    // InternalIoTParser.g:1650:3: ( () otherlv_1= Seconds )
                    // InternalIoTParser.g:1651:4: () otherlv_1= Seconds
                    {
                    // InternalIoTParser.g:1651:4: ()
                    // InternalIoTParser.g:1652:5: 
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
                    // InternalIoTParser.g:1664:3: ( () otherlv_3= Milliseconds )
                    {
                    // InternalIoTParser.g:1664:3: ( () otherlv_3= Milliseconds )
                    // InternalIoTParser.g:1665:4: () otherlv_3= Milliseconds
                    {
                    // InternalIoTParser.g:1665:4: ()
                    // InternalIoTParser.g:1666:5: 
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
                    // InternalIoTParser.g:1678:3: ( () otherlv_5= Microseconds )
                    {
                    // InternalIoTParser.g:1678:3: ( () otherlv_5= Microseconds )
                    // InternalIoTParser.g:1679:4: () otherlv_5= Microseconds
                    {
                    // InternalIoTParser.g:1679:4: ()
                    // InternalIoTParser.g:1680:5: 
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
    // InternalIoTParser.g:1695:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalIoTParser.g:1695:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalIoTParser.g:1696:2: iv_ruleSensorOutput= ruleSensorOutput EOF
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
    // InternalIoTParser.g:1702:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSensorOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_output_1_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1708:2: ( (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) ) )
            // InternalIoTParser.g:1709:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalIoTParser.g:1709:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )
            // InternalIoTParser.g:1710:3: otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Pipe,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getPipeKeyword_0());
            		
            // InternalIoTParser.g:1714:3: ( (lv_output_1_0= ruleDataOutput ) )
            // InternalIoTParser.g:1715:4: (lv_output_1_0= ruleDataOutput )
            {
            // InternalIoTParser.g:1715:4: (lv_output_1_0= ruleDataOutput )
            // InternalIoTParser.g:1716:5: lv_output_1_0= ruleDataOutput
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
            		
            // InternalIoTParser.g:1737:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoTParser.g:1738:4: (otherlv_3= RULE_ID )
            {
            // InternalIoTParser.g:1738:4: (otherlv_3= RULE_ID )
            // InternalIoTParser.g:1739:5: otherlv_3= RULE_ID
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
    // InternalIoTParser.g:1754:1: entryRuleDataOutput returns [EObject current=null] : iv_ruleDataOutput= ruleDataOutput EOF ;
    public final EObject entryRuleDataOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOutput = null;


        try {
            // InternalIoTParser.g:1754:51: (iv_ruleDataOutput= ruleDataOutput EOF )
            // InternalIoTParser.g:1755:2: iv_ruleDataOutput= ruleDataOutput EOF
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
    // InternalIoTParser.g:1761:1: ruleDataOutput returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) ;
    public final EObject ruleDataOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pipeline_1_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1767:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:1768:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:1768:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            // InternalIoTParser.g:1769:3: ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )?
            {
            // InternalIoTParser.g:1769:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoTParser.g:1770:4: (otherlv_0= RULE_ID )
            {
            // InternalIoTParser.g:1770:4: (otherlv_0= RULE_ID )
            // InternalIoTParser.g:1771:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataOutputRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getDataOutputAccess().getSensorvarSensorVariablesCrossReference_0_0());
            				

            }


            }

            // InternalIoTParser.g:1782:3: ( (lv_pipeline_1_0= rulePipeline ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==FullStop) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIoTParser.g:1783:4: (lv_pipeline_1_0= rulePipeline )
                    {
                    // InternalIoTParser.g:1783:4: (lv_pipeline_1_0= rulePipeline )
                    // InternalIoTParser.g:1784:5: lv_pipeline_1_0= rulePipeline
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
    // InternalIoTParser.g:1805:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalIoTParser.g:1805:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalIoTParser.g:1806:2: iv_rulePipeline= rulePipeline EOF
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
    // InternalIoTParser.g:1812:1: rulePipeline returns [EObject current=null] : (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TuplePipeline_1 = null;

        EObject this_MapPipeline_2 = null;

        EObject this_WindowPipeline_3 = null;

        EObject lv_next_4_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1818:2: ( (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:1819:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:1819:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )? )
            // InternalIoTParser.g:1820:3: otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline ) ( (lv_next_4_0= rulePipeline ) )?
            {
            otherlv_0=(Token)match(input,FullStop,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getFullStopKeyword_0());
            		
            // InternalIoTParser.g:1824:3: (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline )
            int alt24=3;
            switch ( input.LA(1) ) {
            case Filter:
            case Abs:
                {
                alt24=1;
                }
                break;
            case Map:
                {
                alt24=2;
                }
                break;
            case ByWindow:
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
                    // InternalIoTParser.g:1825:4: this_TuplePipeline_1= ruleTuplePipeline
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
                    // InternalIoTParser.g:1834:4: this_MapPipeline_2= ruleMapPipeline
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
                    // InternalIoTParser.g:1843:4: this_WindowPipeline_3= ruleWindowPipeline
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

            // InternalIoTParser.g:1852:3: ( (lv_next_4_0= rulePipeline ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==FullStop) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalIoTParser.g:1853:4: (lv_next_4_0= rulePipeline )
                    {
                    // InternalIoTParser.g:1853:4: (lv_next_4_0= rulePipeline )
                    // InternalIoTParser.g:1854:5: lv_next_4_0= rulePipeline
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
    // InternalIoTParser.g:1875:1: entryRuleTuplePipeline returns [EObject current=null] : iv_ruleTuplePipeline= ruleTuplePipeline EOF ;
    public final EObject entryRuleTuplePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePipeline = null;


        try {
            // InternalIoTParser.g:1875:54: (iv_ruleTuplePipeline= ruleTuplePipeline EOF )
            // InternalIoTParser.g:1876:2: iv_ruleTuplePipeline= ruleTuplePipeline EOF
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
    // InternalIoTParser.g:1882:1: ruleTuplePipeline returns [EObject current=null] : ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) ;
    public final EObject ruleTuplePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1888:2: ( ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:1889:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:1889:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:1890:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:1890:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Filter) ) {
                alt26=1;
            }
            else if ( (LA26_0==Abs) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalIoTParser.g:1891:4: ( () otherlv_1= Filter )
                    {
                    // InternalIoTParser.g:1891:4: ( () otherlv_1= Filter )
                    // InternalIoTParser.g:1892:5: () otherlv_1= Filter
                    {
                    // InternalIoTParser.g:1892:5: ()
                    // InternalIoTParser.g:1893:6: 
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
                    // InternalIoTParser.g:1905:4: ( () otherlv_3= Abs )
                    {
                    // InternalIoTParser.g:1905:4: ( () otherlv_3= Abs )
                    // InternalIoTParser.g:1906:5: () otherlv_3= Abs
                    {
                    // InternalIoTParser.g:1906:5: ()
                    // InternalIoTParser.g:1907:6: 
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
            		
            // InternalIoTParser.g:1923:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalIoTParser.g:1924:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalIoTParser.g:1924:4: (lv_expression_5_0= ruleExpression )
            // InternalIoTParser.g:1925:5: lv_expression_5_0= ruleExpression
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
    // InternalIoTParser.g:1950:1: entryRuleMapPipeline returns [EObject current=null] : iv_ruleMapPipeline= ruleMapPipeline EOF ;
    public final EObject entryRuleMapPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapPipeline = null;


        try {
            // InternalIoTParser.g:1950:52: (iv_ruleMapPipeline= ruleMapPipeline EOF )
            // InternalIoTParser.g:1951:2: iv_ruleMapPipeline= ruleMapPipeline EOF
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
    // InternalIoTParser.g:1957:1: ruleMapPipeline returns [EObject current=null] : ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) ;
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
            // InternalIoTParser.g:1963:2: ( ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:1964:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:1964:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:1965:3: () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:1965:3: ()
            // InternalIoTParser.g:1966:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapPipelineAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Map,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMapPipelineAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getMapPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:1980:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalIoTParser.g:1981:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalIoTParser.g:1981:4: (lv_expression_3_0= ruleExpression )
            // InternalIoTParser.g:1982:5: lv_expression_3_0= ruleExpression
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
            		
            // InternalIoTParser.g:2003:3: ( (lv_output_5_0= ruleVariable ) )
            // InternalIoTParser.g:2004:4: (lv_output_5_0= ruleVariable )
            {
            // InternalIoTParser.g:2004:4: (lv_output_5_0= ruleVariable )
            // InternalIoTParser.g:2005:5: lv_output_5_0= ruleVariable
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
    // InternalIoTParser.g:2030:1: entryRuleWindowPipeline returns [EObject current=null] : iv_ruleWindowPipeline= ruleWindowPipeline EOF ;
    public final EObject entryRuleWindowPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowPipeline = null;


        try {
            // InternalIoTParser.g:2030:55: (iv_ruleWindowPipeline= ruleWindowPipeline EOF )
            // InternalIoTParser.g:2031:2: iv_ruleWindowPipeline= ruleWindowPipeline EOF
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
    // InternalIoTParser.g:2037:1: ruleWindowPipeline returns [EObject current=null] : ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) ;
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
            // InternalIoTParser.g:2043:2: ( ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) )
            // InternalIoTParser.g:2044:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            {
            // InternalIoTParser.g:2044:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            // InternalIoTParser.g:2045:3: () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) )
            {
            // InternalIoTParser.g:2045:3: ()
            // InternalIoTParser.g:2046:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWindowPipelineAccess().getWindowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ByWindow,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getWindowPipelineAccess().getByWindowKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getWindowPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2060:3: ( (lv_width_3_0= RULE_INT ) )
            // InternalIoTParser.g:2061:4: (lv_width_3_0= RULE_INT )
            {
            // InternalIoTParser.g:2061:4: (lv_width_3_0= RULE_INT )
            // InternalIoTParser.g:2062:5: lv_width_3_0= RULE_INT
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
            		
            // InternalIoTParser.g:2086:3: ( (lv_execute_6_0= ruleExecutePipeline ) )
            // InternalIoTParser.g:2087:4: (lv_execute_6_0= ruleExecutePipeline )
            {
            // InternalIoTParser.g:2087:4: (lv_execute_6_0= ruleExecutePipeline )
            // InternalIoTParser.g:2088:5: lv_execute_6_0= ruleExecutePipeline
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
    // InternalIoTParser.g:2109:1: entryRuleExecutePipeline returns [EObject current=null] : iv_ruleExecutePipeline= ruleExecutePipeline EOF ;
    public final EObject entryRuleExecutePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutePipeline = null;


        try {
            // InternalIoTParser.g:2109:56: (iv_ruleExecutePipeline= ruleExecutePipeline EOF )
            // InternalIoTParser.g:2110:2: iv_ruleExecutePipeline= ruleExecutePipeline EOF
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
    // InternalIoTParser.g:2116:1: ruleExecutePipeline returns [EObject current=null] : ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) ) ;
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
            // InternalIoTParser.g:2122:2: ( ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) ) )
            // InternalIoTParser.g:2123:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) )
            {
            // InternalIoTParser.g:2123:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) )
            int alt27=7;
            switch ( input.LA(1) ) {
            case Reduce:
                {
                alt27=1;
                }
                break;
            case Mean:
                {
                alt27=2;
                }
                break;
            case Median:
                {
                alt27=3;
                }
                break;
            case Stdev:
                {
                alt27=4;
                }
                break;
            case Min:
                {
                alt27=5;
                }
                break;
            case Max:
                {
                alt27=6;
                }
                break;
            case Count:
                {
                alt27=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalIoTParser.g:2124:3: ( () otherlv_1= Reduce )
                    {
                    // InternalIoTParser.g:2124:3: ( () otherlv_1= Reduce )
                    // InternalIoTParser.g:2125:4: () otherlv_1= Reduce
                    {
                    // InternalIoTParser.g:2125:4: ()
                    // InternalIoTParser.g:2126:5: 
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
                    // InternalIoTParser.g:2138:3: ( () otherlv_3= Mean )
                    {
                    // InternalIoTParser.g:2138:3: ( () otherlv_3= Mean )
                    // InternalIoTParser.g:2139:4: () otherlv_3= Mean
                    {
                    // InternalIoTParser.g:2139:4: ()
                    // InternalIoTParser.g:2140:5: 
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
                    // InternalIoTParser.g:2152:3: ( () otherlv_5= Median )
                    {
                    // InternalIoTParser.g:2152:3: ( () otherlv_5= Median )
                    // InternalIoTParser.g:2153:4: () otherlv_5= Median
                    {
                    // InternalIoTParser.g:2153:4: ()
                    // InternalIoTParser.g:2154:5: 
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
                    // InternalIoTParser.g:2166:3: ( () otherlv_7= Stdev )
                    {
                    // InternalIoTParser.g:2166:3: ( () otherlv_7= Stdev )
                    // InternalIoTParser.g:2167:4: () otherlv_7= Stdev
                    {
                    // InternalIoTParser.g:2167:4: ()
                    // InternalIoTParser.g:2168:5: 
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
                    // InternalIoTParser.g:2180:3: ( () otherlv_9= Min )
                    {
                    // InternalIoTParser.g:2180:3: ( () otherlv_9= Min )
                    // InternalIoTParser.g:2181:4: () otherlv_9= Min
                    {
                    // InternalIoTParser.g:2181:4: ()
                    // InternalIoTParser.g:2182:5: 
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
                    // InternalIoTParser.g:2194:3: ( () otherlv_11= Max )
                    {
                    // InternalIoTParser.g:2194:3: ( () otherlv_11= Max )
                    // InternalIoTParser.g:2195:4: () otherlv_11= Max
                    {
                    // InternalIoTParser.g:2195:4: ()
                    // InternalIoTParser.g:2196:5: 
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
                    // InternalIoTParser.g:2208:3: ( () otherlv_13= Count )
                    {
                    // InternalIoTParser.g:2208:3: ( () otherlv_13= Count )
                    // InternalIoTParser.g:2209:4: () otherlv_13= Count
                    {
                    // InternalIoTParser.g:2209:4: ()
                    // InternalIoTParser.g:2210:5: 
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
    // InternalIoTParser.g:2225:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalIoTParser.g:2225:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalIoTParser.g:2226:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalIoTParser.g:2232:1: ruleExpression returns [EObject current=null] : this_Conditional_0= ruleConditional ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Conditional_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2238:2: (this_Conditional_0= ruleConditional )
            // InternalIoTParser.g:2239:2: this_Conditional_0= ruleConditional
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
    // InternalIoTParser.g:2250:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalIoTParser.g:2250:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalIoTParser.g:2251:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalIoTParser.g:2257:1: ruleConditional returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Or_0 = null;

        EObject lv_correct_3_0 = null;

        EObject lv_incorrect_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2263:2: ( (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) )
            // InternalIoTParser.g:2264:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            {
            // InternalIoTParser.g:2264:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            // InternalIoTParser.g:2265:3: this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            {

            			newCompositeNode(grammarAccess.getConditionalAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2273:3: ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==QuestionMark) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalIoTParser.g:2274:4: () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) )
                    {
                    // InternalIoTParser.g:2274:4: ()
                    // InternalIoTParser.g:2275:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getConditionalAccess().getConditionalConditionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,QuestionMark,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getQuestionMarkKeyword_1_1());
                    			
                    // InternalIoTParser.g:2285:4: ( (lv_correct_3_0= ruleConditional ) )
                    // InternalIoTParser.g:2286:5: (lv_correct_3_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2286:5: (lv_correct_3_0= ruleConditional )
                    // InternalIoTParser.g:2287:6: lv_correct_3_0= ruleConditional
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
                    			
                    // InternalIoTParser.g:2308:4: ( (lv_incorrect_5_0= ruleConditional ) )
                    // InternalIoTParser.g:2309:5: (lv_incorrect_5_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2309:5: (lv_incorrect_5_0= ruleConditional )
                    // InternalIoTParser.g:2310:6: lv_incorrect_5_0= ruleConditional
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
    // InternalIoTParser.g:2332:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalIoTParser.g:2332:43: (iv_ruleOr= ruleOr EOF )
            // InternalIoTParser.g:2333:2: iv_ruleOr= ruleOr EOF
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
    // InternalIoTParser.g:2339:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2345:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) )
            // InternalIoTParser.g:2346:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            {
            // InternalIoTParser.g:2346:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            // InternalIoTParser.g:2347:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2355:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==VerticalLineVerticalLine) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalIoTParser.g:2356:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) )
                    {
                    // InternalIoTParser.g:2356:4: ()
                    // InternalIoTParser.g:2357:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
                    			
                    // InternalIoTParser.g:2367:4: ( (lv_right_3_0= ruleOr ) )
                    // InternalIoTParser.g:2368:5: (lv_right_3_0= ruleOr )
                    {
                    // InternalIoTParser.g:2368:5: (lv_right_3_0= ruleOr )
                    // InternalIoTParser.g:2369:6: lv_right_3_0= ruleOr
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
    // InternalIoTParser.g:2391:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalIoTParser.g:2391:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalIoTParser.g:2392:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalIoTParser.g:2398:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2404:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) )
            // InternalIoTParser.g:2405:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            {
            // InternalIoTParser.g:2405:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            // InternalIoTParser.g:2406:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2414:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==AmpersandAmpersand) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIoTParser.g:2415:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) )
                    {
                    // InternalIoTParser.g:2415:4: ()
                    // InternalIoTParser.g:2416:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalIoTParser.g:2426:4: ( (lv_right_3_0= ruleAnd ) )
                    // InternalIoTParser.g:2427:5: (lv_right_3_0= ruleAnd )
                    {
                    // InternalIoTParser.g:2427:5: (lv_right_3_0= ruleAnd )
                    // InternalIoTParser.g:2428:6: lv_right_3_0= ruleAnd
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
    // InternalIoTParser.g:2450:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalIoTParser.g:2450:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalIoTParser.g:2451:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalIoTParser.g:2457:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2463:2: ( (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) )
            // InternalIoTParser.g:2464:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            {
            // InternalIoTParser.g:2464:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            // InternalIoTParser.g:2465:3: this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2473:3: ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==EqualsSignEqualsSign) ) {
                    alt31=1;
                }
                else if ( (LA31_0==ExclamationMarkEqualsSign) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalIoTParser.g:2474:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2474:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2475:5: () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2475:5: ()
            	    // InternalIoTParser.g:2476:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2486:5: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalIoTParser.g:2487:6: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:2487:6: (lv_right_3_0= ruleComparison )
            	    // InternalIoTParser.g:2488:7: lv_right_3_0= ruleComparison
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
            	    // InternalIoTParser.g:2507:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2507:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2508:5: () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2508:5: ()
            	    // InternalIoTParser.g:2509:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2519:5: ( (lv_right_6_0= ruleComparison ) )
            	    // InternalIoTParser.g:2520:6: (lv_right_6_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:2520:6: (lv_right_6_0= ruleComparison )
            	    // InternalIoTParser.g:2521:7: lv_right_6_0= ruleComparison
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
            	    break loop31;
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
    // InternalIoTParser.g:2544:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalIoTParser.g:2544:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalIoTParser.g:2545:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalIoTParser.g:2551:1: ruleComparison returns [EObject current=null] : (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) ;
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
            // InternalIoTParser.g:2557:2: ( (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) )
            // InternalIoTParser.g:2558:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            {
            // InternalIoTParser.g:2558:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            // InternalIoTParser.g:2559:3: this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getSubAddParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_SubAdd_0=ruleSubAdd();

            state._fsp--;


            			current = this_SubAdd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2567:3: ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            loop32:
            do {
                int alt32=5;
                switch ( input.LA(1) ) {
                case LessThanSign:
                    {
                    alt32=1;
                    }
                    break;
                case LessThanSignEqualsSign:
                    {
                    alt32=2;
                    }
                    break;
                case GreaterThanSign:
                    {
                    alt32=3;
                    }
                    break;
                case GreaterThanSignEqualsSign:
                    {
                    alt32=4;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // InternalIoTParser.g:2568:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2568:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2569:5: () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2569:5: ()
            	    // InternalIoTParser.g:2570:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,LessThanSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2580:5: ( (lv_right_3_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2581:6: (lv_right_3_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2581:6: (lv_right_3_0= ruleSubAdd )
            	    // InternalIoTParser.g:2582:7: lv_right_3_0= ruleSubAdd
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
            	    // InternalIoTParser.g:2601:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2601:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2602:5: () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2602:5: ()
            	    // InternalIoTParser.g:2603:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,LessThanSignEqualsSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2613:5: ( (lv_right_6_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2614:6: (lv_right_6_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2614:6: (lv_right_6_0= ruleSubAdd )
            	    // InternalIoTParser.g:2615:7: lv_right_6_0= ruleSubAdd
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
            	    // InternalIoTParser.g:2634:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2634:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2635:5: () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2635:5: ()
            	    // InternalIoTParser.g:2636:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,GreaterThanSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_2_1());
            	    				
            	    // InternalIoTParser.g:2646:5: ( (lv_right_9_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2647:6: (lv_right_9_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2647:6: (lv_right_9_0= ruleSubAdd )
            	    // InternalIoTParser.g:2648:7: lv_right_9_0= ruleSubAdd
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
            	    // InternalIoTParser.g:2667:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2667:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2668:5: () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2668:5: ()
            	    // InternalIoTParser.g:2669:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalIoTParser.g:2679:5: ( (lv_right_12_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2680:6: (lv_right_12_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2680:6: (lv_right_12_0= ruleSubAdd )
            	    // InternalIoTParser.g:2681:7: lv_right_12_0= ruleSubAdd
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
            	    break loop32;
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
    // InternalIoTParser.g:2704:1: entryRuleSubAdd returns [EObject current=null] : iv_ruleSubAdd= ruleSubAdd EOF ;
    public final EObject entryRuleSubAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAdd = null;


        try {
            // InternalIoTParser.g:2704:47: (iv_ruleSubAdd= ruleSubAdd EOF )
            // InternalIoTParser.g:2705:2: iv_ruleSubAdd= ruleSubAdd EOF
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
    // InternalIoTParser.g:2711:1: ruleSubAdd returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) ;
    public final EObject ruleSubAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2717:2: ( (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) )
            // InternalIoTParser.g:2718:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            {
            // InternalIoTParser.g:2718:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            // InternalIoTParser.g:2719:3: this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubAddAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2727:3: ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==PlusSign) ) {
                    alt33=1;
                }
                else if ( (LA33_0==HyphenMinus) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalIoTParser.g:2728:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:2728:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:2729:5: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:2729:5: ()
            	    // InternalIoTParser.g:2730:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_40); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSubAddAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2740:5: ( (lv_right_3_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:2741:6: (lv_right_3_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:2741:6: (lv_right_3_0= ruleMulDiv )
            	    // InternalIoTParser.g:2742:7: lv_right_3_0= ruleMulDiv
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
            	    // InternalIoTParser.g:2761:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:2761:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:2762:5: () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:2762:5: ()
            	    // InternalIoTParser.g:2763:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,HyphenMinus,FOLLOW_40); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSubAddAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2773:5: ( (lv_right_6_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:2774:6: (lv_right_6_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:2774:6: (lv_right_6_0= ruleMulDiv )
            	    // InternalIoTParser.g:2775:7: lv_right_6_0= ruleMulDiv
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
    // $ANTLR end "ruleSubAdd"


    // $ANTLR start "entryRuleMulDiv"
    // InternalIoTParser.g:2798:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalIoTParser.g:2798:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalIoTParser.g:2799:2: iv_ruleMulDiv= ruleMulDiv EOF
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
    // InternalIoTParser.g:2805:1: ruleMulDiv returns [EObject current=null] : (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2811:2: ( (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) )
            // InternalIoTParser.g:2812:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            {
            // InternalIoTParser.g:2812:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            // InternalIoTParser.g:2813:3: this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2821:3: ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Asterisk) ) {
                    alt34=1;
                }
                else if ( (LA34_0==Solidus) ) {
                    alt34=2;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalIoTParser.g:2822:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:2822:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:2823:5: () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:2823:5: ()
            	    // InternalIoTParser.g:2824:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_40); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2834:5: ( (lv_right_3_0= ruleNegation ) )
            	    // InternalIoTParser.g:2835:6: (lv_right_3_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:2835:6: (lv_right_3_0= ruleNegation )
            	    // InternalIoTParser.g:2836:7: lv_right_3_0= ruleNegation
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
            	    // InternalIoTParser.g:2855:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:2855:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:2856:5: () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:2856:5: ()
            	    // InternalIoTParser.g:2857:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,Solidus,FOLLOW_40); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMulDivAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2867:5: ( (lv_right_6_0= ruleNegation ) )
            	    // InternalIoTParser.g:2868:6: (lv_right_6_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:2868:6: (lv_right_6_0= ruleNegation )
            	    // InternalIoTParser.g:2869:7: lv_right_6_0= ruleNegation
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
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRuleNegation"
    // InternalIoTParser.g:2892:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalIoTParser.g:2892:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalIoTParser.g:2893:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalIoTParser.g:2899:1: ruleNegation returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Exponent_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2905:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) )
            // InternalIoTParser.g:2906:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            {
            // InternalIoTParser.g:2906:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==HyphenMinus) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=ExclamationMark && LA35_0<=LeftParenthesis)||(LA35_0>=RULE_INT && LA35_0<=RULE_BOOLEAN)||(LA35_0>=RULE_ID && LA35_0<=RULE_STRING)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalIoTParser.g:2907:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    {
                    // InternalIoTParser.g:2907:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    // InternalIoTParser.g:2908:4: () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) )
                    {
                    // InternalIoTParser.g:2908:4: ()
                    // InternalIoTParser.g:2909:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getNegationAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalIoTParser.g:2919:4: ( (lv_value_2_0= ruleExponent ) )
                    // InternalIoTParser.g:2920:5: (lv_value_2_0= ruleExponent )
                    {
                    // InternalIoTParser.g:2920:5: (lv_value_2_0= ruleExponent )
                    // InternalIoTParser.g:2921:6: lv_value_2_0= ruleExponent
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
                    // InternalIoTParser.g:2940:3: this_Exponent_3= ruleExponent
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
    // InternalIoTParser.g:2952:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalIoTParser.g:2952:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalIoTParser.g:2953:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalIoTParser.g:2959:1: ruleExponent returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_power_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2965:2: ( (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) )
            // InternalIoTParser.g:2966:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            {
            // InternalIoTParser.g:2966:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            // InternalIoTParser.g:2967:3: this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            {

            			newCompositeNode(grammarAccess.getExponentAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2975:3: ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==AsteriskAsterisk) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalIoTParser.g:2976:4: () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) )
                    {
                    // InternalIoTParser.g:2976:4: ()
                    // InternalIoTParser.g:2977:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExponentAccess().getExponentBaseAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AsteriskAsterisk,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
                    			
                    // InternalIoTParser.g:2987:4: ( (lv_power_3_0= ruleNegation ) )
                    // InternalIoTParser.g:2988:5: (lv_power_3_0= ruleNegation )
                    {
                    // InternalIoTParser.g:2988:5: (lv_power_3_0= ruleNegation )
                    // InternalIoTParser.g:2989:6: lv_power_3_0= ruleNegation
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
    // InternalIoTParser.g:3011:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalIoTParser.g:3011:44: (iv_ruleNot= ruleNot EOF )
            // InternalIoTParser.g:3012:2: iv_ruleNot= ruleNot EOF
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
    // InternalIoTParser.g:3018:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Primary_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3024:2: ( ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) )
            // InternalIoTParser.g:3025:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            {
            // InternalIoTParser.g:3025:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ExclamationMark) ) {
                alt37=1;
            }
            else if ( (LA37_0==LeftParenthesis||(LA37_0>=RULE_INT && LA37_0<=RULE_BOOLEAN)||(LA37_0>=RULE_ID && LA37_0<=RULE_STRING)) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalIoTParser.g:3026:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    {
                    // InternalIoTParser.g:3026:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    // InternalIoTParser.g:3027:4: () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) )
                    {
                    // InternalIoTParser.g:3027:4: ()
                    // InternalIoTParser.g:3028:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_1());
                    			
                    // InternalIoTParser.g:3038:4: ( (lv_value_2_0= rulePrimary ) )
                    // InternalIoTParser.g:3039:5: (lv_value_2_0= rulePrimary )
                    {
                    // InternalIoTParser.g:3039:5: (lv_value_2_0= rulePrimary )
                    // InternalIoTParser.g:3040:6: lv_value_2_0= rulePrimary
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
                    // InternalIoTParser.g:3059:3: this_Primary_3= rulePrimary
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
    // InternalIoTParser.g:3071:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalIoTParser.g:3071:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalIoTParser.g:3072:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalIoTParser.g:3078:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) ;
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
            // InternalIoTParser.g:3084:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) )
            // InternalIoTParser.g:3085:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            {
            // InternalIoTParser.g:3085:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            int alt38=5;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt38=1;
                }
                break;
            case RULE_ID:
                {
                alt38=2;
                }
                break;
            case RULE_INT:
            case RULE_DBL:
            case RULE_SCI:
                {
                alt38=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt38=4;
                }
                break;
            case RULE_STRING:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalIoTParser.g:3086:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalIoTParser.g:3086:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalIoTParser.g:3087:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
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
                    // InternalIoTParser.g:3105:3: this_Reference_3= ruleReference
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
                    // InternalIoTParser.g:3114:3: this_NumberLiteral_4= ruleNumberLiteral
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
                    // InternalIoTParser.g:3123:3: this_BooleanLiteral_5= ruleBooleanLiteral
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
                    // InternalIoTParser.g:3132:3: this_StringLiteral_6= ruleStringLiteral
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
    // InternalIoTParser.g:3144:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalIoTParser.g:3144:50: (iv_ruleReference= ruleReference EOF )
            // InternalIoTParser.g:3145:2: iv_ruleReference= ruleReference EOF
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
    // InternalIoTParser.g:3151:1: ruleReference returns [EObject current=null] : ( (lv_ref_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3157:2: ( ( (lv_ref_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:3158:2: ( (lv_ref_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:3158:2: ( (lv_ref_0_0= RULE_ID ) )
            // InternalIoTParser.g:3159:3: (lv_ref_0_0= RULE_ID )
            {
            // InternalIoTParser.g:3159:3: (lv_ref_0_0= RULE_ID )
            // InternalIoTParser.g:3160:4: lv_ref_0_0= RULE_ID
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
    // InternalIoTParser.g:3179:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalIoTParser.g:3179:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalIoTParser.g:3180:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalIoTParser.g:3186:1: ruleStringLiteral returns [EObject current=null] : ( (lv_str_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3192:2: ( ( (lv_str_0_0= RULE_STRING ) ) )
            // InternalIoTParser.g:3193:2: ( (lv_str_0_0= RULE_STRING ) )
            {
            // InternalIoTParser.g:3193:2: ( (lv_str_0_0= RULE_STRING ) )
            // InternalIoTParser.g:3194:3: (lv_str_0_0= RULE_STRING )
            {
            // InternalIoTParser.g:3194:3: (lv_str_0_0= RULE_STRING )
            // InternalIoTParser.g:3195:4: lv_str_0_0= RULE_STRING
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
    // InternalIoTParser.g:3214:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalIoTParser.g:3214:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalIoTParser.g:3215:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalIoTParser.g:3221:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_numb_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numb_0_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3227:2: ( ( (lv_numb_0_0= ruleNUMBER ) ) )
            // InternalIoTParser.g:3228:2: ( (lv_numb_0_0= ruleNUMBER ) )
            {
            // InternalIoTParser.g:3228:2: ( (lv_numb_0_0= ruleNUMBER ) )
            // InternalIoTParser.g:3229:3: (lv_numb_0_0= ruleNUMBER )
            {
            // InternalIoTParser.g:3229:3: (lv_numb_0_0= ruleNUMBER )
            // InternalIoTParser.g:3230:4: lv_numb_0_0= ruleNUMBER
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
    // InternalIoTParser.g:3250:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalIoTParser.g:3250:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalIoTParser.g:3251:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalIoTParser.g:3257:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_bool_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bool_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3263:2: ( ( (lv_bool_0_0= RULE_BOOLEAN ) ) )
            // InternalIoTParser.g:3264:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            {
            // InternalIoTParser.g:3264:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            // InternalIoTParser.g:3265:3: (lv_bool_0_0= RULE_BOOLEAN )
            {
            // InternalIoTParser.g:3265:3: (lv_bool_0_0= RULE_BOOLEAN )
            // InternalIoTParser.g:3266:4: lv_bool_0_0= RULE_BOOLEAN
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
    // InternalIoTParser.g:3285:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3287:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalIoTParser.g:3288:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalIoTParser.g:3297:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_SCI_2= RULE_SCI ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DBL_1=null;
        Token this_SCI_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3304:2: ( (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_SCI_2= RULE_SCI ) )
            // InternalIoTParser.g:3305:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_SCI_2= RULE_SCI )
            {
            // InternalIoTParser.g:3305:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_SCI_2= RULE_SCI )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt39=1;
                }
                break;
            case RULE_DBL:
                {
                alt39=2;
                }
                break;
            case RULE_SCI:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalIoTParser.g:3306:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:3314:3: this_DBL_1= RULE_DBL
                    {
                    this_DBL_1=(Token)match(input,RULE_DBL,FOLLOW_2); 

                    			current.merge(this_DBL_1);
                    		

                    			newLeafNode(this_DBL_1, grammarAccess.getNUMBERAccess().getDBLTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:3322:3: this_SCI_2= RULE_SCI
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001040200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000204004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000006000010100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0218000000000000L,0x00000000000019E0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000018022860000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000840000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xA001400000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0280000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0840000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});

}