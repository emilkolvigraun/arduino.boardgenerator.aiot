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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Microseconds", "Milliseconds", "Frequency", "Abstract", "ByWindow", "Function", "Channel", "Command", "Extends", "Include", "Seconds", "Broker", "Filter", "Median", "Number", "Reduce", "Sample", "Sensor", "Serial", "String", "Board", "Count", "Model", "Stdev", "Topic", "Baud", "Bool", "Byte", "Char", "Mean", "Mqtt", "Pass", "Pipe", "Port", "Ssid", "Stop", "Type", "Wifi", "Abs", "And", "Map", "Max", "Min", "Var", "Vcc", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "As", "Id", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_NINT", "RULE_DBL", "RULE_NDBL", "RULE_SCI", "RULE_BOOLEAN", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    // InternalIoTParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_function_2_0= ruleFunction ) )* ( (lv_abstractBoard_3_0= ruleAbstractBoard ) )* ( (lv_board_4_0= ruleBoard ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_channel_1_0 = null;

        EObject lv_function_2_0 = null;

        EObject lv_abstractBoard_3_0 = null;

        EObject lv_board_4_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:70:2: ( ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_function_2_0= ruleFunction ) )* ( (lv_abstractBoard_3_0= ruleAbstractBoard ) )* ( (lv_board_4_0= ruleBoard ) )* ) )
            // InternalIoTParser.g:71:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_function_2_0= ruleFunction ) )* ( (lv_abstractBoard_3_0= ruleAbstractBoard ) )* ( (lv_board_4_0= ruleBoard ) )* )
            {
            // InternalIoTParser.g:71:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_function_2_0= ruleFunction ) )* ( (lv_abstractBoard_3_0= ruleAbstractBoard ) )* ( (lv_board_4_0= ruleBoard ) )* )
            // InternalIoTParser.g:72:3: ( (lv_includes_0_0= ruleInclude ) )* ( (lv_channel_1_0= ruleChannel ) )* ( (lv_function_2_0= ruleFunction ) )* ( (lv_abstractBoard_3_0= ruleAbstractBoard ) )* ( (lv_board_4_0= ruleBoard ) )*
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

            // InternalIoTParser.g:110:3: ( (lv_function_2_0= ruleFunction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Function) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIoTParser.g:111:4: (lv_function_2_0= ruleFunction )
            	    {
            	    // InternalIoTParser.g:111:4: (lv_function_2_0= ruleFunction )
            	    // InternalIoTParser.g:112:5: lv_function_2_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFunctionFunctionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_function_2_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"function",
            	    						lv_function_2_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalIoTParser.g:129:3: ( (lv_abstractBoard_3_0= ruleAbstractBoard ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Abstract) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIoTParser.g:130:4: (lv_abstractBoard_3_0= ruleAbstractBoard )
            	    {
            	    // InternalIoTParser.g:130:4: (lv_abstractBoard_3_0= ruleAbstractBoard )
            	    // InternalIoTParser.g:131:5: lv_abstractBoard_3_0= ruleAbstractBoard
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAbstractBoardAbstractBoardParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_abstractBoard_3_0=ruleAbstractBoard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractBoard",
            	    						lv_abstractBoard_3_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.AbstractBoard");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalIoTParser.g:148:3: ( (lv_board_4_0= ruleBoard ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Board) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIoTParser.g:149:4: (lv_board_4_0= ruleBoard )
            	    {
            	    // InternalIoTParser.g:149:4: (lv_board_4_0= ruleBoard )
            	    // InternalIoTParser.g:150:5: lv_board_4_0= ruleBoard
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_board_4_0=ruleBoard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"board",
            	    						lv_board_4_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Board");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInclude"
    // InternalIoTParser.g:171:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalIoTParser.g:171:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalIoTParser.g:172:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalIoTParser.g:178:1: ruleInclude returns [EObject current=null] : (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_importURI_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:184:2: ( (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* ) )
            // InternalIoTParser.g:185:2: (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* )
            {
            // InternalIoTParser.g:185:2: (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* )
            // InternalIoTParser.g:186:3: otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Include,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalIoTParser.g:190:3: ( (lv_importURI_1_0= RULE_ID ) )
            // InternalIoTParser.g:191:4: (lv_importURI_1_0= RULE_ID )
            {
            // InternalIoTParser.g:191:4: (lv_importURI_1_0= RULE_ID )
            // InternalIoTParser.g:192:5: lv_importURI_1_0= RULE_ID
            {
            lv_importURI_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalIoTParser.g:208:3: (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==FullStop) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIoTParser.g:209:4: otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,FullStop,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalIoTParser.g:213:4: ( (lv_importURI_3_0= RULE_ID ) )
            	    // InternalIoTParser.g:214:5: (lv_importURI_3_0= RULE_ID )
            	    {
            	    // InternalIoTParser.g:214:5: (lv_importURI_3_0= RULE_ID )
            	    // InternalIoTParser.g:215:6: lv_importURI_3_0= RULE_ID
            	    {
            	    lv_importURI_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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
            	    break loop6;
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
    // InternalIoTParser.g:236:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalIoTParser.g:236:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalIoTParser.g:237:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalIoTParser.g:243:1: ruleChannel returns [EObject current=null] : (otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? ) ;
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
            // InternalIoTParser.g:249:2: ( (otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? ) )
            // InternalIoTParser.g:250:2: (otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? )
            {
            // InternalIoTParser.g:250:2: (otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? )
            // InternalIoTParser.g:251:3: otherlv_0= Channel ( (lv_channeltype_1_0= ruleChannelType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Channel,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
            		
            // InternalIoTParser.g:255:3: ( (lv_channeltype_1_0= ruleChannelType ) )
            // InternalIoTParser.g:256:4: (lv_channeltype_1_0= ruleChannelType )
            {
            // InternalIoTParser.g:256:4: (lv_channeltype_1_0= ruleChannelType )
            // InternalIoTParser.g:257:5: lv_channeltype_1_0= ruleChannelType
            {

            					newCompositeNode(grammarAccess.getChannelAccess().getChanneltypeChannelTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalIoTParser.g:274:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoTParser.g:275:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoTParser.g:275:4: (lv_name_2_0= RULE_ID )
            // InternalIoTParser.g:276:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalIoTParser.g:292:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Colon) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoTParser.g:293:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getChannelAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:301:4: ( (lv_config_5_0= ruleChannelConfig ) )
                    // InternalIoTParser.g:302:5: (lv_config_5_0= ruleChannelConfig )
                    {
                    // InternalIoTParser.g:302:5: (lv_config_5_0= ruleChannelConfig )
                    // InternalIoTParser.g:303:6: lv_config_5_0= ruleChannelConfig
                    {

                    						newCompositeNode(grammarAccess.getChannelAccess().getConfigChannelConfigParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
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
    // InternalIoTParser.g:329:1: entryRuleChannelType returns [EObject current=null] : iv_ruleChannelType= ruleChannelType EOF ;
    public final EObject entryRuleChannelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelType = null;


        try {
            // InternalIoTParser.g:329:52: (iv_ruleChannelType= ruleChannelType EOF )
            // InternalIoTParser.g:330:2: iv_ruleChannelType= ruleChannelType EOF
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
    // InternalIoTParser.g:336:1: ruleChannelType returns [EObject current=null] : ( ( () otherlv_1= Wifi ) | ( () otherlv_3= Serial ) | ( () otherlv_5= Mqtt ) ) ;
    public final EObject ruleChannelType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:342:2: ( ( ( () otherlv_1= Wifi ) | ( () otherlv_3= Serial ) | ( () otherlv_5= Mqtt ) ) )
            // InternalIoTParser.g:343:2: ( ( () otherlv_1= Wifi ) | ( () otherlv_3= Serial ) | ( () otherlv_5= Mqtt ) )
            {
            // InternalIoTParser.g:343:2: ( ( () otherlv_1= Wifi ) | ( () otherlv_3= Serial ) | ( () otherlv_5= Mqtt ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case Wifi:
                {
                alt8=1;
                }
                break;
            case Serial:
                {
                alt8=2;
                }
                break;
            case Mqtt:
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
                    // InternalIoTParser.g:344:3: ( () otherlv_1= Wifi )
                    {
                    // InternalIoTParser.g:344:3: ( () otherlv_1= Wifi )
                    // InternalIoTParser.g:345:4: () otherlv_1= Wifi
                    {
                    // InternalIoTParser.g:345:4: ()
                    // InternalIoTParser.g:346:5: 
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
                    // InternalIoTParser.g:358:3: ( () otherlv_3= Serial )
                    {
                    // InternalIoTParser.g:358:3: ( () otherlv_3= Serial )
                    // InternalIoTParser.g:359:4: () otherlv_3= Serial
                    {
                    // InternalIoTParser.g:359:4: ()
                    // InternalIoTParser.g:360:5: 
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
                    // InternalIoTParser.g:372:3: ( () otherlv_5= Mqtt )
                    {
                    // InternalIoTParser.g:372:3: ( () otherlv_5= Mqtt )
                    // InternalIoTParser.g:373:4: () otherlv_5= Mqtt
                    {
                    // InternalIoTParser.g:373:4: ()
                    // InternalIoTParser.g:374:5: 
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
    // InternalIoTParser.g:389:1: entryRuleChannelConfig returns [EObject current=null] : iv_ruleChannelConfig= ruleChannelConfig EOF ;
    public final EObject entryRuleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelConfig = null;


        try {
            // InternalIoTParser.g:389:54: (iv_ruleChannelConfig= ruleChannelConfig EOF )
            // InternalIoTParser.g:390:2: iv_ruleChannelConfig= ruleChannelConfig EOF
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
    // InternalIoTParser.g:396:1: ruleChannelConfig returns [EObject current=null] : (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) ;
    public final EObject ruleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject this_Wifi_0 = null;

        EObject this_Serial_1 = null;

        EObject this_MqttClient_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:402:2: ( (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) )
            // InternalIoTParser.g:403:2: (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            {
            // InternalIoTParser.g:403:2: (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            int alt9=3;
            switch ( input.LA(1) ) {
            case Ssid:
                {
                alt9=1;
                }
                break;
            case Baud:
                {
                alt9=2;
                }
                break;
            case Broker:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalIoTParser.g:404:3: this_Wifi_0= ruleWifi
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
                    // InternalIoTParser.g:413:3: this_Serial_1= ruleSerial
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
                    // InternalIoTParser.g:422:3: this_MqttClient_2= ruleMqttClient
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
    // InternalIoTParser.g:434:1: entryRuleWifi returns [EObject current=null] : iv_ruleWifi= ruleWifi EOF ;
    public final EObject entryRuleWifi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWifi = null;


        try {
            // InternalIoTParser.g:434:45: (iv_ruleWifi= ruleWifi EOF )
            // InternalIoTParser.g:435:2: iv_ruleWifi= ruleWifi EOF
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
    // InternalIoTParser.g:441:1: ruleWifi returns [EObject current=null] : (otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleWifi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ssid_1_0=null;
        Token otherlv_2=null;
        Token lv_pass_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:447:2: ( (otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:448:2: (otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:448:2: (otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) ) )
            // InternalIoTParser.g:449:3: otherlv_0= Ssid ( (lv_ssid_1_0= RULE_STRING ) ) otherlv_2= Pass ( (lv_pass_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Ssid,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getWifiAccess().getSsidKeyword_0());
            		
            // InternalIoTParser.g:453:3: ( (lv_ssid_1_0= RULE_STRING ) )
            // InternalIoTParser.g:454:4: (lv_ssid_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:454:4: (lv_ssid_1_0= RULE_STRING )
            // InternalIoTParser.g:455:5: lv_ssid_1_0= RULE_STRING
            {
            lv_ssid_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,Pass,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getWifiAccess().getPassKeyword_2());
            		
            // InternalIoTParser.g:475:3: ( (lv_pass_3_0= RULE_STRING ) )
            // InternalIoTParser.g:476:4: (lv_pass_3_0= RULE_STRING )
            {
            // InternalIoTParser.g:476:4: (lv_pass_3_0= RULE_STRING )
            // InternalIoTParser.g:477:5: lv_pass_3_0= RULE_STRING
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
    // InternalIoTParser.g:497:1: entryRuleSerial returns [EObject current=null] : iv_ruleSerial= ruleSerial EOF ;
    public final EObject entryRuleSerial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerial = null;


        try {
            // InternalIoTParser.g:497:47: (iv_ruleSerial= ruleSerial EOF )
            // InternalIoTParser.g:498:2: iv_ruleSerial= ruleSerial EOF
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
    // InternalIoTParser.g:504:1: ruleSerial returns [EObject current=null] : (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) ) ;
    public final EObject ruleSerial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_baud_1_0=null;
        Token otherlv_2=null;
        EObject lv_stop_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:510:2: ( (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) ) )
            // InternalIoTParser.g:511:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) )
            {
            // InternalIoTParser.g:511:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) )
            // InternalIoTParser.g:512:3: otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) )
            {
            otherlv_0=(Token)match(input,Baud,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSerialAccess().getBaudKeyword_0());
            		
            // InternalIoTParser.g:516:3: ( (lv_baud_1_0= RULE_INT ) )
            // InternalIoTParser.g:517:4: (lv_baud_1_0= RULE_INT )
            {
            // InternalIoTParser.g:517:4: (lv_baud_1_0= RULE_INT )
            // InternalIoTParser.g:518:5: lv_baud_1_0= RULE_INT
            {
            lv_baud_1_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            otherlv_2=(Token)match(input,Stop,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSerialAccess().getStopKeyword_2());
            		
            // InternalIoTParser.g:538:3: ( (lv_stop_3_0= rulestopChar ) )
            // InternalIoTParser.g:539:4: (lv_stop_3_0= rulestopChar )
            {
            // InternalIoTParser.g:539:4: (lv_stop_3_0= rulestopChar )
            // InternalIoTParser.g:540:5: lv_stop_3_0= rulestopChar
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
    // InternalIoTParser.g:561:1: entryRulestopChar returns [EObject current=null] : iv_rulestopChar= rulestopChar EOF ;
    public final EObject entryRulestopChar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestopChar = null;


        try {
            // InternalIoTParser.g:561:49: (iv_rulestopChar= rulestopChar EOF )
            // InternalIoTParser.g:562:2: iv_rulestopChar= rulestopChar EOF
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
    // InternalIoTParser.g:568:1: rulestopChar returns [EObject current=null] : ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) ) ;
    public final EObject rulestopChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:574:2: ( ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) ) )
            // InternalIoTParser.g:575:2: ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) )
            {
            // InternalIoTParser.g:575:2: ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Char) ) {
                alt10=1;
            }
            else if ( (LA10_0==Byte) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoTParser.g:576:3: ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) )
                    {
                    // InternalIoTParser.g:576:3: ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) )
                    // InternalIoTParser.g:577:4: () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) )
                    {
                    // InternalIoTParser.g:577:4: ()
                    // InternalIoTParser.g:578:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStopCharAccess().getCharAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Char,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getStopCharAccess().getCharKeyword_0_1());
                    			
                    // InternalIoTParser.g:588:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalIoTParser.g:589:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:589:5: (lv_name_2_0= RULE_STRING )
                    // InternalIoTParser.g:590:6: lv_name_2_0= RULE_STRING
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
                    // InternalIoTParser.g:608:3: ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) )
                    {
                    // InternalIoTParser.g:608:3: ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) )
                    // InternalIoTParser.g:609:4: () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) )
                    {
                    // InternalIoTParser.g:609:4: ()
                    // InternalIoTParser.g:610:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStopCharAccess().getByteAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Byte,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getStopCharAccess().getByteKeyword_1_1());
                    			
                    // InternalIoTParser.g:620:4: ( (lv_name_5_0= RULE_INT ) )
                    // InternalIoTParser.g:621:5: (lv_name_5_0= RULE_INT )
                    {
                    // InternalIoTParser.g:621:5: (lv_name_5_0= RULE_INT )
                    // InternalIoTParser.g:622:6: lv_name_5_0= RULE_INT
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
    // InternalIoTParser.g:643:1: entryRuleMqttClient returns [EObject current=null] : iv_ruleMqttClient= ruleMqttClient EOF ;
    public final EObject entryRuleMqttClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMqttClient = null;


        try {
            // InternalIoTParser.g:643:51: (iv_ruleMqttClient= ruleMqttClient EOF )
            // InternalIoTParser.g:644:2: iv_ruleMqttClient= ruleMqttClient EOF
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
    // InternalIoTParser.g:650:1: ruleMqttClient returns [EObject current=null] : (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleMqttClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_broker_1_0=null;
        Token otherlv_2=null;
        Token lv_port_3_0=null;
        Token otherlv_4=null;
        Token lv_client_5_0=null;
        Token otherlv_6=null;
        Token lv_pub_7_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:656:2: ( (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:657:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:657:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) )
            // InternalIoTParser.g:658:3: otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Broker,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMqttClientAccess().getBrokerKeyword_0());
            		
            // InternalIoTParser.g:662:3: ( (lv_broker_1_0= RULE_STRING ) )
            // InternalIoTParser.g:663:4: (lv_broker_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:663:4: (lv_broker_1_0= RULE_STRING )
            // InternalIoTParser.g:664:5: lv_broker_1_0= RULE_STRING
            {
            lv_broker_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            otherlv_2=(Token)match(input,Port,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMqttClientAccess().getPortKeyword_2());
            		
            // InternalIoTParser.g:684:3: ( (lv_port_3_0= RULE_INT ) )
            // InternalIoTParser.g:685:4: (lv_port_3_0= RULE_INT )
            {
            // InternalIoTParser.g:685:4: (lv_port_3_0= RULE_INT )
            // InternalIoTParser.g:686:5: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_port_3_0, grammarAccess.getMqttClientAccess().getPortINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMqttClientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,Id,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getMqttClientAccess().getIdKeyword_4());
            		
            // InternalIoTParser.g:706:3: ( (lv_client_5_0= RULE_STRING ) )
            // InternalIoTParser.g:707:4: (lv_client_5_0= RULE_STRING )
            {
            // InternalIoTParser.g:707:4: (lv_client_5_0= RULE_STRING )
            // InternalIoTParser.g:708:5: lv_client_5_0= RULE_STRING
            {
            lv_client_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_client_5_0, grammarAccess.getMqttClientAccess().getClientSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMqttClientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"client",
            						lv_client_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,Topic,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getMqttClientAccess().getTopicKeyword_6());
            		
            // InternalIoTParser.g:728:3: ( (lv_pub_7_0= RULE_STRING ) )
            // InternalIoTParser.g:729:4: (lv_pub_7_0= RULE_STRING )
            {
            // InternalIoTParser.g:729:4: (lv_pub_7_0= RULE_STRING )
            // InternalIoTParser.g:730:5: lv_pub_7_0= RULE_STRING
            {
            lv_pub_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_pub_7_0, grammarAccess.getMqttClientAccess().getPubSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMqttClientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pub",
            						lv_pub_7_0,
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
    // $ANTLR end "ruleMqttClient"


    // $ANTLR start "entryRuleFunction"
    // InternalIoTParser.g:750:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalIoTParser.g:750:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalIoTParser.g:751:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalIoTParser.g:757:1: ruleFunction returns [EObject current=null] : (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_output_9_0=null;
        Token otherlv_10=null;
        Token lv_output_11_0=null;
        Token otherlv_12=null;
        EObject lv_input_3_0 = null;

        EObject lv_input_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:763:2: ( (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis ) )
            // InternalIoTParser.g:764:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis )
            {
            // InternalIoTParser.g:764:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis )
            // InternalIoTParser.g:765:3: otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalIoTParser.g:769:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:770:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:770:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:771:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalIoTParser.g:791:3: ( (lv_input_3_0= ruleFunctionInputType ) )
            // InternalIoTParser.g:792:4: (lv_input_3_0= ruleFunctionInputType )
            {
            // InternalIoTParser.g:792:4: (lv_input_3_0= ruleFunctionInputType )
            // InternalIoTParser.g:793:5: lv_input_3_0= ruleFunctionInputType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getInputFunctionInputTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_input_3_0=ruleFunctionInputType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.FunctionInputType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoTParser.g:810:3: (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIoTParser.g:811:4: otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIoTParser.g:815:4: ( (lv_input_5_0= ruleFunctionInputType ) )
            	    // InternalIoTParser.g:816:5: (lv_input_5_0= ruleFunctionInputType )
            	    {
            	    // InternalIoTParser.g:816:5: (lv_input_5_0= ruleFunctionInputType )
            	    // InternalIoTParser.g:817:6: lv_input_5_0= ruleFunctionInputType
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionAccess().getInputFunctionInputTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_input_5_0=ruleFunctionInputType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_5_0,
            	    							"org.xtext.mdsd.arduino.boardgenerator.IoT.FunctionInputType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_7());
            		
            // InternalIoTParser.g:847:3: ( (lv_output_9_0= RULE_ID ) )
            // InternalIoTParser.g:848:4: (lv_output_9_0= RULE_ID )
            {
            // InternalIoTParser.g:848:4: (lv_output_9_0= RULE_ID )
            // InternalIoTParser.g:849:5: lv_output_9_0= RULE_ID
            {
            lv_output_9_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_output_9_0, grammarAccess.getFunctionAccess().getOutputIDTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"output",
            						lv_output_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIoTParser.g:865:3: (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIoTParser.g:866:4: otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,Comma,FOLLOW_8); 

            	    				newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIoTParser.g:870:4: ( (lv_output_11_0= RULE_ID ) )
            	    // InternalIoTParser.g:871:5: (lv_output_11_0= RULE_ID )
            	    {
            	    // InternalIoTParser.g:871:5: (lv_output_11_0= RULE_ID )
            	    // InternalIoTParser.g:872:6: lv_output_11_0= RULE_ID
            	    {
            	    lv_output_11_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(lv_output_11_0, grammarAccess.getFunctionAccess().getOutputIDTerminalRuleCall_9_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"output",
            	    							lv_output_11_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFunctionInputType"
    // InternalIoTParser.g:897:1: entryRuleFunctionInputType returns [EObject current=null] : iv_ruleFunctionInputType= ruleFunctionInputType EOF ;
    public final EObject entryRuleFunctionInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionInputType = null;


        try {
            // InternalIoTParser.g:897:58: (iv_ruleFunctionInputType= ruleFunctionInputType EOF )
            // InternalIoTParser.g:898:2: iv_ruleFunctionInputType= ruleFunctionInputType EOF
            {
             newCompositeNode(grammarAccess.getFunctionInputTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionInputType=ruleFunctionInputType();

            state._fsp--;

             current =iv_ruleFunctionInputType; 
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
    // $ANTLR end "entryRuleFunctionInputType"


    // $ANTLR start "ruleFunctionInputType"
    // InternalIoTParser.g:904:1: ruleFunctionInputType returns [EObject current=null] : ( ( () otherlv_1= Number ( (lv_value_2_0= RULE_ID ) ) ) | ( () otherlv_4= String ( (lv_value_5_0= RULE_ID ) ) ) | ( () otherlv_7= Bool ( (lv_value_8_0= RULE_ID ) ) ) ) ;
    public final EObject ruleFunctionInputType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:910:2: ( ( ( () otherlv_1= Number ( (lv_value_2_0= RULE_ID ) ) ) | ( () otherlv_4= String ( (lv_value_5_0= RULE_ID ) ) ) | ( () otherlv_7= Bool ( (lv_value_8_0= RULE_ID ) ) ) ) )
            // InternalIoTParser.g:911:2: ( ( () otherlv_1= Number ( (lv_value_2_0= RULE_ID ) ) ) | ( () otherlv_4= String ( (lv_value_5_0= RULE_ID ) ) ) | ( () otherlv_7= Bool ( (lv_value_8_0= RULE_ID ) ) ) )
            {
            // InternalIoTParser.g:911:2: ( ( () otherlv_1= Number ( (lv_value_2_0= RULE_ID ) ) ) | ( () otherlv_4= String ( (lv_value_5_0= RULE_ID ) ) ) | ( () otherlv_7= Bool ( (lv_value_8_0= RULE_ID ) ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case Number:
                {
                alt13=1;
                }
                break;
            case String:
                {
                alt13=2;
                }
                break;
            case Bool:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalIoTParser.g:912:3: ( () otherlv_1= Number ( (lv_value_2_0= RULE_ID ) ) )
                    {
                    // InternalIoTParser.g:912:3: ( () otherlv_1= Number ( (lv_value_2_0= RULE_ID ) ) )
                    // InternalIoTParser.g:913:4: () otherlv_1= Number ( (lv_value_2_0= RULE_ID ) )
                    {
                    // InternalIoTParser.g:913:4: ()
                    // InternalIoTParser.g:914:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFunctionInputTypeAccess().getNumberAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Number,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionInputTypeAccess().getNumberKeyword_0_1());
                    			
                    // InternalIoTParser.g:924:4: ( (lv_value_2_0= RULE_ID ) )
                    // InternalIoTParser.g:925:5: (lv_value_2_0= RULE_ID )
                    {
                    // InternalIoTParser.g:925:5: (lv_value_2_0= RULE_ID )
                    // InternalIoTParser.g:926:6: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getFunctionInputTypeAccess().getValueIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionInputTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:944:3: ( () otherlv_4= String ( (lv_value_5_0= RULE_ID ) ) )
                    {
                    // InternalIoTParser.g:944:3: ( () otherlv_4= String ( (lv_value_5_0= RULE_ID ) ) )
                    // InternalIoTParser.g:945:4: () otherlv_4= String ( (lv_value_5_0= RULE_ID ) )
                    {
                    // InternalIoTParser.g:945:4: ()
                    // InternalIoTParser.g:946:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFunctionInputTypeAccess().getStringAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,String,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionInputTypeAccess().getStringKeyword_1_1());
                    			
                    // InternalIoTParser.g:956:4: ( (lv_value_5_0= RULE_ID ) )
                    // InternalIoTParser.g:957:5: (lv_value_5_0= RULE_ID )
                    {
                    // InternalIoTParser.g:957:5: (lv_value_5_0= RULE_ID )
                    // InternalIoTParser.g:958:6: lv_value_5_0= RULE_ID
                    {
                    lv_value_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getFunctionInputTypeAccess().getValueIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionInputTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:976:3: ( () otherlv_7= Bool ( (lv_value_8_0= RULE_ID ) ) )
                    {
                    // InternalIoTParser.g:976:3: ( () otherlv_7= Bool ( (lv_value_8_0= RULE_ID ) ) )
                    // InternalIoTParser.g:977:4: () otherlv_7= Bool ( (lv_value_8_0= RULE_ID ) )
                    {
                    // InternalIoTParser.g:977:4: ()
                    // InternalIoTParser.g:978:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFunctionInputTypeAccess().getBoolAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,Bool,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionInputTypeAccess().getBoolKeyword_2_1());
                    			
                    // InternalIoTParser.g:988:4: ( (lv_value_8_0= RULE_ID ) )
                    // InternalIoTParser.g:989:5: (lv_value_8_0= RULE_ID )
                    {
                    // InternalIoTParser.g:989:5: (lv_value_8_0= RULE_ID )
                    // InternalIoTParser.g:990:6: lv_value_8_0= RULE_ID
                    {
                    lv_value_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_8_0, grammarAccess.getFunctionInputTypeAccess().getValueIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionInputTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    // $ANTLR end "ruleFunctionInputType"


    // $ANTLR start "entryRuleBoard"
    // InternalIoTParser.g:1011:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalIoTParser.g:1011:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalIoTParser.g:1012:2: iv_ruleBoard= ruleBoard EOF
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
    // InternalIoTParser.g:1018:1: ruleBoard returns [EObject current=null] : (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NewBoard_1 = null;

        EObject this_ExtendsBoard_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1024:2: ( (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) )
            // InternalIoTParser.g:1025:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            {
            // InternalIoTParser.g:1025:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            // InternalIoTParser.g:1026:3: otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            {
            otherlv_0=(Token)match(input,Board,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            // InternalIoTParser.g:1030:3: (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==Colon) ) {
                    alt14=1;
                }
                else if ( (LA14_1==Extends) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoTParser.g:1031:4: this_NewBoard_1= ruleNewBoard
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
                    // InternalIoTParser.g:1040:4: this_ExtendsBoard_2= ruleExtendsBoard
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
    // InternalIoTParser.g:1053:1: entryRuleNewBoard returns [EObject current=null] : iv_ruleNewBoard= ruleNewBoard EOF ;
    public final EObject entryRuleNewBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewBoard = null;


        try {
            // InternalIoTParser.g:1053:49: (iv_ruleNewBoard= ruleNewBoard EOF )
            // InternalIoTParser.g:1054:2: iv_ruleNewBoard= ruleNewBoard EOF
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
    // InternalIoTParser.g:1060:1: ruleNewBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END ) ;
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
            // InternalIoTParser.g:1066:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END ) )
            // InternalIoTParser.g:1067:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END )
            {
            // InternalIoTParser.g:1067:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END )
            // InternalIoTParser.g:1068:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) ( (lv_sensors_4_0= ruleSensor ) )+ this_END_5= RULE_END
            {
            // InternalIoTParser.g:1068:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1069:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1069:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1070:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getNewBoardAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getNewBoardAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIoTParser.g:1094:3: ( (lv_version_3_0= ruleBoardVersion ) )
            // InternalIoTParser.g:1095:4: (lv_version_3_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:1095:4: (lv_version_3_0= ruleBoardVersion )
            // InternalIoTParser.g:1096:5: lv_version_3_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getNewBoardAccess().getVersionBoardVersionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalIoTParser.g:1113:3: ( (lv_sensors_4_0= ruleSensor ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Sensor) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIoTParser.g:1114:4: (lv_sensors_4_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:1114:4: (lv_sensors_4_0= ruleSensor )
            	    // InternalIoTParser.g:1115:5: lv_sensors_4_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getNewBoardAccess().getSensorsSensorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // InternalIoTParser.g:1140:1: entryRuleBoardVersion returns [EObject current=null] : iv_ruleBoardVersion= ruleBoardVersion EOF ;
    public final EObject entryRuleBoardVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardVersion = null;


        try {
            // InternalIoTParser.g:1140:53: (iv_ruleBoardVersion= ruleBoardVersion EOF )
            // InternalIoTParser.g:1141:2: iv_ruleBoardVersion= ruleBoardVersion EOF
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
    // InternalIoTParser.g:1147:1: ruleBoardVersion returns [EObject current=null] : (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) ) ;
    public final EObject ruleBoardVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_model_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1153:2: ( (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) ) )
            // InternalIoTParser.g:1154:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) )
            {
            // InternalIoTParser.g:1154:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) )
            // InternalIoTParser.g:1155:3: otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardVersionAccess().getTypeKeyword_0());
            		
            // InternalIoTParser.g:1159:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalIoTParser.g:1160:4: (lv_type_1_0= RULE_ID )
            {
            // InternalIoTParser.g:1160:4: (lv_type_1_0= RULE_ID )
            // InternalIoTParser.g:1161:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_2=(Token)match(input,Model,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardVersionAccess().getModelKeyword_2());
            		
            // InternalIoTParser.g:1181:3: ( (lv_model_3_0= RULE_ID ) )
            // InternalIoTParser.g:1182:4: (lv_model_3_0= RULE_ID )
            {
            // InternalIoTParser.g:1182:4: (lv_model_3_0= RULE_ID )
            // InternalIoTParser.g:1183:5: lv_model_3_0= RULE_ID
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
    // InternalIoTParser.g:1203:1: entryRuleExtendsBoard returns [EObject current=null] : iv_ruleExtendsBoard= ruleExtendsBoard EOF ;
    public final EObject entryRuleExtendsBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsBoard = null;


        try {
            // InternalIoTParser.g:1203:53: (iv_ruleExtendsBoard= ruleExtendsBoard EOF )
            // InternalIoTParser.g:1204:2: iv_ruleExtendsBoard= ruleExtendsBoard EOF
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
    // InternalIoTParser.g:1210:1: ruleExtendsBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? ) ;
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
            // InternalIoTParser.g:1216:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? ) )
            // InternalIoTParser.g:1217:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? )
            {
            // InternalIoTParser.g:1217:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )? )
            // InternalIoTParser.g:1218:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )?
            {
            // InternalIoTParser.g:1218:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1219:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1219:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1220:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            otherlv_1=(Token)match(input,Extends,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendsBoardAccess().getExtendsKeyword_1());
            		
            // InternalIoTParser.g:1240:3: ( (otherlv_2= RULE_ID ) )
            // InternalIoTParser.g:1241:4: (otherlv_2= RULE_ID )
            {
            // InternalIoTParser.g:1241:4: (otherlv_2= RULE_ID )
            // InternalIoTParser.g:1242:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendsBoardRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getExtendsBoardAccess().getAbstractBoardAbstractBoardCrossReference_2_0());
            				

            }


            }

            // InternalIoTParser.g:1253:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Colon) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIoTParser.g:1254:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_sensors_5_0= ruleSensor ) )+ this_END_6= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtendsBoardAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getExtendsBoardAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:1262:4: ( (lv_sensors_5_0= ruleSensor ) )+
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
                    	    // InternalIoTParser.g:1263:5: (lv_sensors_5_0= ruleSensor )
                    	    {
                    	    // InternalIoTParser.g:1263:5: (lv_sensors_5_0= ruleSensor )
                    	    // InternalIoTParser.g:1264:6: lv_sensors_5_0= ruleSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getExtendsBoardAccess().getSensorsSensorParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
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
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
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
    // InternalIoTParser.g:1290:1: entryRuleAbstractBoard returns [EObject current=null] : iv_ruleAbstractBoard= ruleAbstractBoard EOF ;
    public final EObject entryRuleAbstractBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBoard = null;


        try {
            // InternalIoTParser.g:1290:54: (iv_ruleAbstractBoard= ruleAbstractBoard EOF )
            // InternalIoTParser.g:1291:2: iv_ruleAbstractBoard= ruleAbstractBoard EOF
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
    // InternalIoTParser.g:1297:1: ruleAbstractBoard returns [EObject current=null] : (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) ;
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
            // InternalIoTParser.g:1303:2: ( (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) )
            // InternalIoTParser.g:1304:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            {
            // InternalIoTParser.g:1304:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            // InternalIoTParser.g:1305:3: otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END
            {
            otherlv_0=(Token)match(input,Abstract,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractBoardAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,Board,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractBoardAccess().getBoardKeyword_1());
            		
            // InternalIoTParser.g:1313:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoTParser.g:1314:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoTParser.g:1314:4: (lv_name_2_0= RULE_ID )
            // InternalIoTParser.g:1315:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_3=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractBoardAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getAbstractBoardAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalIoTParser.g:1339:3: ( (lv_version_5_0= ruleBoardVersion ) )
            // InternalIoTParser.g:1340:4: (lv_version_5_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:1340:4: (lv_version_5_0= ruleBoardVersion )
            // InternalIoTParser.g:1341:5: lv_version_5_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getAbstractBoardAccess().getVersionBoardVersionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalIoTParser.g:1358:3: ( (lv_sensors_6_0= ruleSensor ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Sensor) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIoTParser.g:1359:4: (lv_sensors_6_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:1359:4: (lv_sensors_6_0= ruleSensor )
            	    // InternalIoTParser.g:1360:5: lv_sensors_6_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractBoardAccess().getSensorsSensorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // InternalIoTParser.g:1385:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoTParser.g:1385:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoTParser.g:1386:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalIoTParser.g:1392:1: ruleSensor returns [EObject current=null] : (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) ;
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
            // InternalIoTParser.g:1398:2: ( (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) )
            // InternalIoTParser.g:1399:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            {
            // InternalIoTParser.g:1399:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            // InternalIoTParser.g:1400:3: otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END
            {
            otherlv_0=(Token)match(input,Sensor,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalIoTParser.g:1404:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:1405:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:1405:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:1406:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getEqualsSignKeyword_2());
            		
            // InternalIoTParser.g:1426:3: ( (lv_sensortype_3_0= ruleSensorType ) )
            // InternalIoTParser.g:1427:4: (lv_sensortype_3_0= ruleSensorType )
            {
            // InternalIoTParser.g:1427:4: (lv_sensortype_3_0= ruleSensorType )
            // InternalIoTParser.g:1428:5: lv_sensortype_3_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensortypeSensorTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_4=(Token)match(input,As,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getAsKeyword_4());
            		
            // InternalIoTParser.g:1449:3: ( (lv_vars_5_0= ruleSensorVariables ) )
            // InternalIoTParser.g:1450:4: (lv_vars_5_0= ruleSensorVariables )
            {
            // InternalIoTParser.g:1450:4: (lv_vars_5_0= ruleSensorVariables )
            // InternalIoTParser.g:1451:5: lv_vars_5_0= ruleSensorVariables
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getVarsSensorVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_6=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getColonKeyword_6());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getSensorAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalIoTParser.g:1476:3: (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Sample) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIoTParser.g:1477:4: otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) )
                    {
                    otherlv_8=(Token)match(input,Sample,FOLLOW_37); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getSampleKeyword_8_0());
                    			
                    // InternalIoTParser.g:1481:4: ( (lv_sampler_9_0= ruleSampler ) )
                    // InternalIoTParser.g:1482:5: (lv_sampler_9_0= ruleSampler )
                    {
                    // InternalIoTParser.g:1482:5: (lv_sampler_9_0= ruleSampler )
                    // InternalIoTParser.g:1483:6: lv_sampler_9_0= ruleSampler
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getSamplerSamplerParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalIoTParser.g:1501:3: (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Vcc) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalIoTParser.g:1502:4: otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,Vcc,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getVccKeyword_9_0());
                    			
                    // InternalIoTParser.g:1506:4: ( (lv_vcc_11_0= RULE_INT ) )
                    // InternalIoTParser.g:1507:5: (lv_vcc_11_0= RULE_INT )
                    {
                    // InternalIoTParser.g:1507:5: (lv_vcc_11_0= RULE_INT )
                    // InternalIoTParser.g:1508:6: lv_vcc_11_0= RULE_INT
                    {
                    lv_vcc_11_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            // InternalIoTParser.g:1525:3: ( (lv_output_12_0= ruleSensorOutput ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Pipe) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIoTParser.g:1526:4: (lv_output_12_0= ruleSensorOutput )
            	    {
            	    // InternalIoTParser.g:1526:4: (lv_output_12_0= ruleSensorOutput )
            	    // InternalIoTParser.g:1527:5: lv_output_12_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputSensorOutputParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // InternalIoTParser.g:1552:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalIoTParser.g:1552:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalIoTParser.g:1553:2: iv_ruleSensorType= ruleSensorType EOF
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
    // InternalIoTParser.g:1559:1: ruleSensorType returns [EObject current=null] : (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalSensor_0 = null;

        EObject this_OnboardSensor_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1565:2: ( (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) )
            // InternalIoTParser.g:1566:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            {
            // InternalIoTParser.g:1566:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||LA22_1==As) ) {
                    alt22=2;
                }
                else if ( (LA22_1==LeftParenthesis) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalIoTParser.g:1567:3: this_ExternalSensor_0= ruleExternalSensor
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
                    // InternalIoTParser.g:1576:3: this_OnboardSensor_1= ruleOnboardSensor
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
    // InternalIoTParser.g:1588:1: entryRuleExternalSensor returns [EObject current=null] : iv_ruleExternalSensor= ruleExternalSensor EOF ;
    public final EObject entryRuleExternalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSensor = null;


        try {
            // InternalIoTParser.g:1588:55: (iv_ruleExternalSensor= ruleExternalSensor EOF )
            // InternalIoTParser.g:1589:2: iv_ruleExternalSensor= ruleExternalSensor EOF
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
    // InternalIoTParser.g:1595:1: ruleExternalSensor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) ;
    public final EObject ruleExternalSensor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_pins_2_0=null;
        Token otherlv_3=null;
        Token lv_pins_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1601:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1602:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1602:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1603:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1603:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1604:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1604:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1605:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExternalSensorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalSensorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoTParser.g:1625:3: ( (lv_pins_2_0= RULE_INT ) )
            // InternalIoTParser.g:1626:4: (lv_pins_2_0= RULE_INT )
            {
            // InternalIoTParser.g:1626:4: (lv_pins_2_0= RULE_INT )
            // InternalIoTParser.g:1627:5: lv_pins_2_0= RULE_INT
            {
            lv_pins_2_0=(Token)match(input,RULE_INT,FOLLOW_25); 

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

            // InternalIoTParser.g:1643:3: (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIoTParser.g:1644:4: otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_17); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalSensorAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1648:4: ( (lv_pins_4_0= RULE_INT ) )
            	    // InternalIoTParser.g:1649:5: (lv_pins_4_0= RULE_INT )
            	    {
            	    // InternalIoTParser.g:1649:5: (lv_pins_4_0= RULE_INT )
            	    // InternalIoTParser.g:1650:6: lv_pins_4_0= RULE_INT
            	    {
            	    lv_pins_4_0=(Token)match(input,RULE_INT,FOLLOW_25); 

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
            	    break loop23;
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
    // InternalIoTParser.g:1675:1: entryRuleOnboardSensor returns [EObject current=null] : iv_ruleOnboardSensor= ruleOnboardSensor EOF ;
    public final EObject entryRuleOnboardSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnboardSensor = null;


        try {
            // InternalIoTParser.g:1675:54: (iv_ruleOnboardSensor= ruleOnboardSensor EOF )
            // InternalIoTParser.g:1676:2: iv_ruleOnboardSensor= ruleOnboardSensor EOF
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
    // InternalIoTParser.g:1682:1: ruleOnboardSensor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleOnboardSensor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1688:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1689:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1689:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1690:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1690:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1691:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getOnboardSensorAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOnboardSensorRule());
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
    // $ANTLR end "ruleOnboardSensor"


    // $ANTLR start "entryRuleSensorVariables"
    // InternalIoTParser.g:1710:1: entryRuleSensorVariables returns [EObject current=null] : iv_ruleSensorVariables= ruleSensorVariables EOF ;
    public final EObject entryRuleSensorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorVariables = null;


        try {
            // InternalIoTParser.g:1710:56: (iv_ruleSensorVariables= ruleSensorVariables EOF )
            // InternalIoTParser.g:1711:2: iv_ruleSensorVariables= ruleSensorVariables EOF
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
    // InternalIoTParser.g:1717:1: ruleSensorVariables returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) ;
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
            // InternalIoTParser.g:1723:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1724:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1724:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1725:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1725:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1726:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1726:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1727:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorVariablesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoTParser.g:1747:3: ( (lv_ids_2_0= ruleVariable ) )
            // InternalIoTParser.g:1748:4: (lv_ids_2_0= ruleVariable )
            {
            // InternalIoTParser.g:1748:4: (lv_ids_2_0= ruleVariable )
            // InternalIoTParser.g:1749:5: lv_ids_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalIoTParser.g:1766:3: (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalIoTParser.g:1767:4: otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSensorVariablesAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1771:4: ( (lv_ids_4_0= ruleVariable ) )
            	    // InternalIoTParser.g:1772:5: (lv_ids_4_0= ruleVariable )
            	    {
            	    // InternalIoTParser.g:1772:5: (lv_ids_4_0= ruleVariable )
            	    // InternalIoTParser.g:1773:6: lv_ids_4_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop24;
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
    // InternalIoTParser.g:1799:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalIoTParser.g:1799:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalIoTParser.g:1800:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalIoTParser.g:1806:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1812:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1813:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1813:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1814:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1814:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1815:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:1834:1: entryRuleSampler returns [EObject current=null] : iv_ruleSampler= ruleSampler EOF ;
    public final EObject entryRuleSampler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampler = null;


        try {
            // InternalIoTParser.g:1834:48: (iv_ruleSampler= ruleSampler EOF )
            // InternalIoTParser.g:1835:2: iv_ruleSampler= ruleSampler EOF
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
    // InternalIoTParser.g:1841:1: ruleSampler returns [EObject current=null] : (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) ;
    public final EObject ruleSampler() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Frequency_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1847:2: ( (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) )
            // InternalIoTParser.g:1848:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            {
            // InternalIoTParser.g:1848:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Command) ) {
                alt25=1;
            }
            else if ( (LA25_0==Frequency) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalIoTParser.g:1849:3: this_Command_0= ruleCommand
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
                    // InternalIoTParser.g:1858:3: this_Frequency_1= ruleFrequency
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
    // InternalIoTParser.g:1870:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalIoTParser.g:1870:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalIoTParser.g:1871:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalIoTParser.g:1877:1: ruleCommand returns [EObject current=null] : (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;
        Token lv_topic_2_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1883:2: ( (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? ) )
            // InternalIoTParser.g:1884:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? )
            {
            // InternalIoTParser.g:1884:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? )
            // InternalIoTParser.g:1885:3: otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,Command,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalIoTParser.g:1889:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalIoTParser.g:1890:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:1890:4: (lv_command_1_0= RULE_STRING )
            // InternalIoTParser.g:1891:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalIoTParser.g:1907:3: ( (lv_topic_2_0= RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIoTParser.g:1908:4: (lv_topic_2_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:1908:4: (lv_topic_2_0= RULE_STRING )
                    // InternalIoTParser.g:1909:5: lv_topic_2_0= RULE_STRING
                    {
                    lv_topic_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_topic_2_0, grammarAccess.getCommandAccess().getTopicSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommandRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"topic",
                    						lv_topic_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleFrequency"
    // InternalIoTParser.g:1929:1: entryRuleFrequency returns [EObject current=null] : iv_ruleFrequency= ruleFrequency EOF ;
    public final EObject entryRuleFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequency = null;


        try {
            // InternalIoTParser.g:1929:50: (iv_ruleFrequency= ruleFrequency EOF )
            // InternalIoTParser.g:1930:2: iv_ruleFrequency= ruleFrequency EOF
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
    // InternalIoTParser.g:1936:1: ruleFrequency returns [EObject current=null] : (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) ;
    public final EObject ruleFrequency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_frequency_1_0=null;
        EObject lv_resolution_2_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1942:2: ( (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) )
            // InternalIoTParser.g:1943:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            {
            // InternalIoTParser.g:1943:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            // InternalIoTParser.g:1944:3: otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) )
            {
            otherlv_0=(Token)match(input,Frequency,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFrequencyAccess().getFrequencyKeyword_0());
            		
            // InternalIoTParser.g:1948:3: ( (lv_frequency_1_0= RULE_INT ) )
            // InternalIoTParser.g:1949:4: (lv_frequency_1_0= RULE_INT )
            {
            // InternalIoTParser.g:1949:4: (lv_frequency_1_0= RULE_INT )
            // InternalIoTParser.g:1950:5: lv_frequency_1_0= RULE_INT
            {
            lv_frequency_1_0=(Token)match(input,RULE_INT,FOLLOW_40); 

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

            // InternalIoTParser.g:1966:3: ( (lv_resolution_2_0= ruleResolution ) )
            // InternalIoTParser.g:1967:4: (lv_resolution_2_0= ruleResolution )
            {
            // InternalIoTParser.g:1967:4: (lv_resolution_2_0= ruleResolution )
            // InternalIoTParser.g:1968:5: lv_resolution_2_0= ruleResolution
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
    // InternalIoTParser.g:1989:1: entryRuleResolution returns [EObject current=null] : iv_ruleResolution= ruleResolution EOF ;
    public final EObject entryRuleResolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolution = null;


        try {
            // InternalIoTParser.g:1989:51: (iv_ruleResolution= ruleResolution EOF )
            // InternalIoTParser.g:1990:2: iv_ruleResolution= ruleResolution EOF
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
    // InternalIoTParser.g:1996:1: ruleResolution returns [EObject current=null] : ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) ;
    public final EObject ruleResolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:2002:2: ( ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) )
            // InternalIoTParser.g:2003:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            {
            // InternalIoTParser.g:2003:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case Seconds:
                {
                alt27=1;
                }
                break;
            case Milliseconds:
                {
                alt27=2;
                }
                break;
            case Microseconds:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalIoTParser.g:2004:3: ( () otherlv_1= Seconds )
                    {
                    // InternalIoTParser.g:2004:3: ( () otherlv_1= Seconds )
                    // InternalIoTParser.g:2005:4: () otherlv_1= Seconds
                    {
                    // InternalIoTParser.g:2005:4: ()
                    // InternalIoTParser.g:2006:5: 
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
                    // InternalIoTParser.g:2018:3: ( () otherlv_3= Milliseconds )
                    {
                    // InternalIoTParser.g:2018:3: ( () otherlv_3= Milliseconds )
                    // InternalIoTParser.g:2019:4: () otherlv_3= Milliseconds
                    {
                    // InternalIoTParser.g:2019:4: ()
                    // InternalIoTParser.g:2020:5: 
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
                    // InternalIoTParser.g:2032:3: ( () otherlv_5= Microseconds )
                    {
                    // InternalIoTParser.g:2032:3: ( () otherlv_5= Microseconds )
                    // InternalIoTParser.g:2033:4: () otherlv_5= Microseconds
                    {
                    // InternalIoTParser.g:2033:4: ()
                    // InternalIoTParser.g:2034:5: 
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
    // InternalIoTParser.g:2049:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalIoTParser.g:2049:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalIoTParser.g:2050:2: iv_ruleSensorOutput= ruleSensorOutput EOF
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
    // InternalIoTParser.g:2056:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleSensorOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_output_1_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2062:2: ( (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalIoTParser.g:2063:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalIoTParser.g:2063:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* )
            // InternalIoTParser.g:2064:3: otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Pipe,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getPipeKeyword_0());
            		
            // InternalIoTParser.g:2068:3: ( (lv_output_1_0= ruleDataOutput ) )
            // InternalIoTParser.g:2069:4: (lv_output_1_0= ruleDataOutput )
            {
            // InternalIoTParser.g:2069:4: (lv_output_1_0= ruleDataOutput )
            // InternalIoTParser.g:2070:5: lv_output_1_0= ruleDataOutput
            {

            					newCompositeNode(grammarAccess.getSensorOutputAccess().getOutputDataOutputParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorOutputAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalIoTParser.g:2091:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoTParser.g:2092:4: (otherlv_3= RULE_ID )
            {
            // InternalIoTParser.g:2092:4: (otherlv_3= RULE_ID )
            // InternalIoTParser.g:2093:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorOutputRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_3, grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_3_0());
            				

            }


            }

            // InternalIoTParser.g:2104:3: (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==And) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalIoTParser.g:2105:4: otherlv_4= And ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,And,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSensorOutputAccess().getAndKeyword_4_0());
            	    			
            	    // InternalIoTParser.g:2109:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalIoTParser.g:2110:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalIoTParser.g:2110:5: (otherlv_5= RULE_ID )
            	    // InternalIoTParser.g:2111:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensorOutputRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    						newLeafNode(otherlv_5, grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleSensorOutput"


    // $ANTLR start "entryRuleDataOutput"
    // InternalIoTParser.g:2127:1: entryRuleDataOutput returns [EObject current=null] : iv_ruleDataOutput= ruleDataOutput EOF ;
    public final EObject entryRuleDataOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOutput = null;


        try {
            // InternalIoTParser.g:2127:51: (iv_ruleDataOutput= ruleDataOutput EOF )
            // InternalIoTParser.g:2128:2: iv_ruleDataOutput= ruleDataOutput EOF
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
    // InternalIoTParser.g:2134:1: ruleDataOutput returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) ;
    public final EObject ruleDataOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pipeline_1_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2140:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:2141:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:2141:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            // InternalIoTParser.g:2142:3: ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )?
            {
            // InternalIoTParser.g:2142:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoTParser.g:2143:4: (otherlv_0= RULE_ID )
            {
            // InternalIoTParser.g:2143:4: (otherlv_0= RULE_ID )
            // InternalIoTParser.g:2144:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataOutputRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getDataOutputAccess().getSensorvarSensorVariablesCrossReference_0_0());
            				

            }


            }

            // InternalIoTParser.g:2155:3: ( (lv_pipeline_1_0= rulePipeline ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==FullStop) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalIoTParser.g:2156:4: (lv_pipeline_1_0= rulePipeline )
                    {
                    // InternalIoTParser.g:2156:4: (lv_pipeline_1_0= rulePipeline )
                    // InternalIoTParser.g:2157:5: lv_pipeline_1_0= rulePipeline
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
    // InternalIoTParser.g:2178:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalIoTParser.g:2178:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalIoTParser.g:2179:2: iv_rulePipeline= rulePipeline EOF
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
    // InternalIoTParser.g:2185:1: rulePipeline returns [EObject current=null] : (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TuplePipeline_1 = null;

        EObject this_MapPipeline_2 = null;

        EObject this_WindowPipeline_3 = null;

        EObject this_External_4 = null;

        EObject lv_next_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2191:2: ( (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:2192:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:2192:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? )
            // InternalIoTParser.g:2193:3: otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )?
            {
            otherlv_0=(Token)match(input,FullStop,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getFullStopKeyword_0());
            		
            // InternalIoTParser.g:2197:3: (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal )
            int alt30=4;
            switch ( input.LA(1) ) {
            case Filter:
            case Abs:
                {
                alt30=1;
                }
                break;
            case Map:
                {
                alt30=2;
                }
                break;
            case ByWindow:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalIoTParser.g:2198:4: this_TuplePipeline_1= ruleTuplePipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getTuplePipelineParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_TuplePipeline_1=ruleTuplePipeline();

                    state._fsp--;


                    				current = this_TuplePipeline_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:2207:4: this_MapPipeline_2= ruleMapPipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getMapPipelineParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_MapPipeline_2=ruleMapPipeline();

                    state._fsp--;


                    				current = this_MapPipeline_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:2216:4: this_WindowPipeline_3= ruleWindowPipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getWindowPipelineParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_9);
                    this_WindowPipeline_3=ruleWindowPipeline();

                    state._fsp--;


                    				current = this_WindowPipeline_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:2225:4: this_External_4= ruleExternal
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getExternalParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_9);
                    this_External_4=ruleExternal();

                    state._fsp--;


                    				current = this_External_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalIoTParser.g:2234:3: ( (lv_next_5_0= rulePipeline ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FullStop) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIoTParser.g:2235:4: (lv_next_5_0= rulePipeline )
                    {
                    // InternalIoTParser.g:2235:4: (lv_next_5_0= rulePipeline )
                    // InternalIoTParser.g:2236:5: lv_next_5_0= rulePipeline
                    {

                    					newCompositeNode(grammarAccess.getPipelineAccess().getNextPipelineParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_5_0=rulePipeline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPipelineRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_5_0,
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


    // $ANTLR start "entryRuleExternal"
    // InternalIoTParser.g:2257:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalIoTParser.g:2257:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalIoTParser.g:2258:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalIoTParser.g:2264:1: ruleExternal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_input_2_0 = null;

        EObject lv_input_4_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2270:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalIoTParser.g:2271:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalIoTParser.g:2271:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket )
            // InternalIoTParser.g:2272:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalIoTParser.g:2272:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoTParser.g:2273:4: (otherlv_0= RULE_ID )
            {
            // InternalIoTParser.g:2273:4: (otherlv_0= RULE_ID )
            // InternalIoTParser.g:2274:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getFunctionFunctionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalIoTParser.g:2289:3: ( (lv_input_2_0= ruleExpression ) )
            // InternalIoTParser.g:2290:4: (lv_input_2_0= ruleExpression )
            {
            // InternalIoTParser.g:2290:4: (lv_input_2_0= ruleExpression )
            // InternalIoTParser.g:2291:5: lv_input_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExternalAccess().getInputExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
            lv_input_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_2_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIoTParser.g:2308:3: (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalIoTParser.g:2309:4: otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_44); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:2313:4: ( (lv_input_4_0= ruleExpression ) )
            	    // InternalIoTParser.g:2314:5: (lv_input_4_0= ruleExpression )
            	    {
            	    // InternalIoTParser.g:2314:5: (lv_input_4_0= ruleExpression )
            	    // InternalIoTParser.g:2315:6: lv_input_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternalAccess().getInputExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_input_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_4_0,
            	    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleTuplePipeline"
    // InternalIoTParser.g:2341:1: entryRuleTuplePipeline returns [EObject current=null] : iv_ruleTuplePipeline= ruleTuplePipeline EOF ;
    public final EObject entryRuleTuplePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePipeline = null;


        try {
            // InternalIoTParser.g:2341:54: (iv_ruleTuplePipeline= ruleTuplePipeline EOF )
            // InternalIoTParser.g:2342:2: iv_ruleTuplePipeline= ruleTuplePipeline EOF
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
    // InternalIoTParser.g:2348:1: ruleTuplePipeline returns [EObject current=null] : ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) ;
    public final EObject ruleTuplePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2354:2: ( ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:2355:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:2355:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:2356:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:2356:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Filter) ) {
                alt33=1;
            }
            else if ( (LA33_0==Abs) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalIoTParser.g:2357:4: ( () otherlv_1= Filter )
                    {
                    // InternalIoTParser.g:2357:4: ( () otherlv_1= Filter )
                    // InternalIoTParser.g:2358:5: () otherlv_1= Filter
                    {
                    // InternalIoTParser.g:2358:5: ()
                    // InternalIoTParser.g:2359:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTuplePipelineAccess().getFilterAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,Filter,FOLLOW_43); 

                    					newLeafNode(otherlv_1, grammarAccess.getTuplePipelineAccess().getFilterKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:2371:4: ( () otherlv_3= Abs )
                    {
                    // InternalIoTParser.g:2371:4: ( () otherlv_3= Abs )
                    // InternalIoTParser.g:2372:5: () otherlv_3= Abs
                    {
                    // InternalIoTParser.g:2372:5: ()
                    // InternalIoTParser.g:2373:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTuplePipelineAccess().getAbsAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_3=(Token)match(input,Abs,FOLLOW_43); 

                    					newLeafNode(otherlv_3, grammarAccess.getTuplePipelineAccess().getAbsKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_44); 

            			newLeafNode(otherlv_4, grammarAccess.getTuplePipelineAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalIoTParser.g:2389:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalIoTParser.g:2390:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalIoTParser.g:2390:4: (lv_expression_5_0= ruleExpression )
            // InternalIoTParser.g:2391:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTuplePipelineAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
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
    // InternalIoTParser.g:2416:1: entryRuleMapPipeline returns [EObject current=null] : iv_ruleMapPipeline= ruleMapPipeline EOF ;
    public final EObject entryRuleMapPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapPipeline = null;


        try {
            // InternalIoTParser.g:2416:52: (iv_ruleMapPipeline= ruleMapPipeline EOF )
            // InternalIoTParser.g:2417:2: iv_ruleMapPipeline= ruleMapPipeline EOF
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
    // InternalIoTParser.g:2423:1: ruleMapPipeline returns [EObject current=null] : ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) ;
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
            // InternalIoTParser.g:2429:2: ( ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:2430:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:2430:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:2431:3: () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:2431:3: ()
            // InternalIoTParser.g:2432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapPipelineAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Map,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getMapPipelineAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getMapPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2446:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalIoTParser.g:2447:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalIoTParser.g:2447:4: (lv_expression_3_0= ruleExpression )
            // InternalIoTParser.g:2448:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_4=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMapPipelineAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalIoTParser.g:2469:3: ( (lv_output_5_0= ruleVariable ) )
            // InternalIoTParser.g:2470:4: (lv_output_5_0= ruleVariable )
            {
            // InternalIoTParser.g:2470:4: (lv_output_5_0= ruleVariable )
            // InternalIoTParser.g:2471:5: lv_output_5_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getOutputVariableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_46);
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
    // InternalIoTParser.g:2496:1: entryRuleWindowPipeline returns [EObject current=null] : iv_ruleWindowPipeline= ruleWindowPipeline EOF ;
    public final EObject entryRuleWindowPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowPipeline = null;


        try {
            // InternalIoTParser.g:2496:55: (iv_ruleWindowPipeline= ruleWindowPipeline EOF )
            // InternalIoTParser.g:2497:2: iv_ruleWindowPipeline= ruleWindowPipeline EOF
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
    // InternalIoTParser.g:2503:1: ruleWindowPipeline returns [EObject current=null] : ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) ;
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
            // InternalIoTParser.g:2509:2: ( ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) )
            // InternalIoTParser.g:2510:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            {
            // InternalIoTParser.g:2510:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            // InternalIoTParser.g:2511:3: () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) )
            {
            // InternalIoTParser.g:2511:3: ()
            // InternalIoTParser.g:2512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWindowPipelineAccess().getWindowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ByWindow,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getWindowPipelineAccess().getByWindowKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getWindowPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2526:3: ( (lv_width_3_0= RULE_INT ) )
            // InternalIoTParser.g:2527:4: (lv_width_3_0= RULE_INT )
            {
            // InternalIoTParser.g:2527:4: (lv_width_3_0= RULE_INT )
            // InternalIoTParser.g:2528:5: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_46); 

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

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getWindowPipelineAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,FullStop,FOLLOW_48); 

            			newLeafNode(otherlv_5, grammarAccess.getWindowPipelineAccess().getFullStopKeyword_5());
            		
            // InternalIoTParser.g:2552:3: ( (lv_execute_6_0= ruleExecutePipeline ) )
            // InternalIoTParser.g:2553:4: (lv_execute_6_0= ruleExecutePipeline )
            {
            // InternalIoTParser.g:2553:4: (lv_execute_6_0= ruleExecutePipeline )
            // InternalIoTParser.g:2554:5: lv_execute_6_0= ruleExecutePipeline
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
    // InternalIoTParser.g:2575:1: entryRuleExecutePipeline returns [EObject current=null] : iv_ruleExecutePipeline= ruleExecutePipeline EOF ;
    public final EObject entryRuleExecutePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutePipeline = null;


        try {
            // InternalIoTParser.g:2575:56: (iv_ruleExecutePipeline= ruleExecutePipeline EOF )
            // InternalIoTParser.g:2576:2: iv_ruleExecutePipeline= ruleExecutePipeline EOF
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
    // InternalIoTParser.g:2582:1: ruleExecutePipeline returns [EObject current=null] : ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) ) ;
    public final EObject ruleExecutePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalIoTParser.g:2588:2: ( ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) ) )
            // InternalIoTParser.g:2589:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) )
            {
            // InternalIoTParser.g:2589:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case Reduce:
                {
                alt34=1;
                }
                break;
            case Mean:
                {
                alt34=2;
                }
                break;
            case Median:
                {
                alt34=3;
                }
                break;
            case Stdev:
                {
                alt34=4;
                }
                break;
            case Min:
                {
                alt34=5;
                }
                break;
            case Max:
                {
                alt34=6;
                }
                break;
            case Count:
                {
                alt34=7;
                }
                break;
            case Var:
                {
                alt34=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalIoTParser.g:2590:3: ( () otherlv_1= Reduce )
                    {
                    // InternalIoTParser.g:2590:3: ( () otherlv_1= Reduce )
                    // InternalIoTParser.g:2591:4: () otherlv_1= Reduce
                    {
                    // InternalIoTParser.g:2591:4: ()
                    // InternalIoTParser.g:2592:5: 
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
                    // InternalIoTParser.g:2604:3: ( () otherlv_3= Mean )
                    {
                    // InternalIoTParser.g:2604:3: ( () otherlv_3= Mean )
                    // InternalIoTParser.g:2605:4: () otherlv_3= Mean
                    {
                    // InternalIoTParser.g:2605:4: ()
                    // InternalIoTParser.g:2606:5: 
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
                    // InternalIoTParser.g:2618:3: ( () otherlv_5= Median )
                    {
                    // InternalIoTParser.g:2618:3: ( () otherlv_5= Median )
                    // InternalIoTParser.g:2619:4: () otherlv_5= Median
                    {
                    // InternalIoTParser.g:2619:4: ()
                    // InternalIoTParser.g:2620:5: 
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
                    // InternalIoTParser.g:2632:3: ( () otherlv_7= Stdev )
                    {
                    // InternalIoTParser.g:2632:3: ( () otherlv_7= Stdev )
                    // InternalIoTParser.g:2633:4: () otherlv_7= Stdev
                    {
                    // InternalIoTParser.g:2633:4: ()
                    // InternalIoTParser.g:2634:5: 
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
                    // InternalIoTParser.g:2646:3: ( () otherlv_9= Min )
                    {
                    // InternalIoTParser.g:2646:3: ( () otherlv_9= Min )
                    // InternalIoTParser.g:2647:4: () otherlv_9= Min
                    {
                    // InternalIoTParser.g:2647:4: ()
                    // InternalIoTParser.g:2648:5: 
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
                    // InternalIoTParser.g:2660:3: ( () otherlv_11= Max )
                    {
                    // InternalIoTParser.g:2660:3: ( () otherlv_11= Max )
                    // InternalIoTParser.g:2661:4: () otherlv_11= Max
                    {
                    // InternalIoTParser.g:2661:4: ()
                    // InternalIoTParser.g:2662:5: 
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
                    // InternalIoTParser.g:2674:3: ( () otherlv_13= Count )
                    {
                    // InternalIoTParser.g:2674:3: ( () otherlv_13= Count )
                    // InternalIoTParser.g:2675:4: () otherlv_13= Count
                    {
                    // InternalIoTParser.g:2675:4: ()
                    // InternalIoTParser.g:2676:5: 
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
                case 8 :
                    // InternalIoTParser.g:2688:3: ( () otherlv_15= Var )
                    {
                    // InternalIoTParser.g:2688:3: ( () otherlv_15= Var )
                    // InternalIoTParser.g:2689:4: () otherlv_15= Var
                    {
                    // InternalIoTParser.g:2689:4: ()
                    // InternalIoTParser.g:2690:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getVarAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,Var,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getExecutePipelineAccess().getVarKeyword_7_1());
                    			

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
    // InternalIoTParser.g:2705:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalIoTParser.g:2705:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalIoTParser.g:2706:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalIoTParser.g:2712:1: ruleExpression returns [EObject current=null] : this_Conditional_0= ruleConditional ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Conditional_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2718:2: (this_Conditional_0= ruleConditional )
            // InternalIoTParser.g:2719:2: this_Conditional_0= ruleConditional
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
    // InternalIoTParser.g:2730:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalIoTParser.g:2730:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalIoTParser.g:2731:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalIoTParser.g:2737:1: ruleConditional returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Or_0 = null;

        EObject lv_correct_3_0 = null;

        EObject lv_incorrect_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2743:2: ( (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) )
            // InternalIoTParser.g:2744:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            {
            // InternalIoTParser.g:2744:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            // InternalIoTParser.g:2745:3: this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            {

            			newCompositeNode(grammarAccess.getConditionalAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2753:3: ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==QuestionMark) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalIoTParser.g:2754:4: () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) )
                    {
                    // InternalIoTParser.g:2754:4: ()
                    // InternalIoTParser.g:2755:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getConditionalAccess().getConditionalConditionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,QuestionMark,FOLLOW_44); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getQuestionMarkKeyword_1_1());
                    			
                    // InternalIoTParser.g:2765:4: ( (lv_correct_3_0= ruleConditional ) )
                    // InternalIoTParser.g:2766:5: (lv_correct_3_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2766:5: (lv_correct_3_0= ruleConditional )
                    // InternalIoTParser.g:2767:6: lv_correct_3_0= ruleConditional
                    {

                    						newCompositeNode(grammarAccess.getConditionalAccess().getCorrectConditionalParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    otherlv_4=(Token)match(input,Colon,FOLLOW_44); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getColonKeyword_1_3());
                    			
                    // InternalIoTParser.g:2788:4: ( (lv_incorrect_5_0= ruleConditional ) )
                    // InternalIoTParser.g:2789:5: (lv_incorrect_5_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2789:5: (lv_incorrect_5_0= ruleConditional )
                    // InternalIoTParser.g:2790:6: lv_incorrect_5_0= ruleConditional
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
    // InternalIoTParser.g:2812:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalIoTParser.g:2812:43: (iv_ruleOr= ruleOr EOF )
            // InternalIoTParser.g:2813:2: iv_ruleOr= ruleOr EOF
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
    // InternalIoTParser.g:2819:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2825:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) )
            // InternalIoTParser.g:2826:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            {
            // InternalIoTParser.g:2826:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            // InternalIoTParser.g:2827:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2835:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==VerticalLineVerticalLine) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalIoTParser.g:2836:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) )
                    {
                    // InternalIoTParser.g:2836:4: ()
                    // InternalIoTParser.g:2837:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_44); 

                    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
                    			
                    // InternalIoTParser.g:2847:4: ( (lv_right_3_0= ruleOr ) )
                    // InternalIoTParser.g:2848:5: (lv_right_3_0= ruleOr )
                    {
                    // InternalIoTParser.g:2848:5: (lv_right_3_0= ruleOr )
                    // InternalIoTParser.g:2849:6: lv_right_3_0= ruleOr
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
    // InternalIoTParser.g:2871:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalIoTParser.g:2871:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalIoTParser.g:2872:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalIoTParser.g:2878:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2884:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) )
            // InternalIoTParser.g:2885:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            {
            // InternalIoTParser.g:2885:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            // InternalIoTParser.g:2886:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2894:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==AmpersandAmpersand) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalIoTParser.g:2895:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) )
                    {
                    // InternalIoTParser.g:2895:4: ()
                    // InternalIoTParser.g:2896:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_44); 

                    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalIoTParser.g:2906:4: ( (lv_right_3_0= ruleAnd ) )
                    // InternalIoTParser.g:2907:5: (lv_right_3_0= ruleAnd )
                    {
                    // InternalIoTParser.g:2907:5: (lv_right_3_0= ruleAnd )
                    // InternalIoTParser.g:2908:6: lv_right_3_0= ruleAnd
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
    // InternalIoTParser.g:2930:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalIoTParser.g:2930:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalIoTParser.g:2931:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalIoTParser.g:2937:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2943:2: ( (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) )
            // InternalIoTParser.g:2944:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            {
            // InternalIoTParser.g:2944:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            // InternalIoTParser.g:2945:3: this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2953:3: ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==EqualsSignEqualsSign) ) {
                    alt38=1;
                }
                else if ( (LA38_0==ExclamationMarkEqualsSign) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalIoTParser.g:2954:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2954:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2955:5: () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2955:5: ()
            	    // InternalIoTParser.g:2956:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_44); 

            	    					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2966:5: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalIoTParser.g:2967:6: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:2967:6: (lv_right_3_0= ruleComparison )
            	    // InternalIoTParser.g:2968:7: lv_right_3_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_52);
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
            	    // InternalIoTParser.g:2987:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2987:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2988:5: () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2988:5: ()
            	    // InternalIoTParser.g:2989:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_44); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2999:5: ( (lv_right_6_0= ruleComparison ) )
            	    // InternalIoTParser.g:3000:6: (lv_right_6_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:3000:6: (lv_right_6_0= ruleComparison )
            	    // InternalIoTParser.g:3001:7: lv_right_6_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_52);
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
            	    break loop38;
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
    // InternalIoTParser.g:3024:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalIoTParser.g:3024:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalIoTParser.g:3025:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalIoTParser.g:3031:1: ruleComparison returns [EObject current=null] : (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) ;
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
            // InternalIoTParser.g:3037:2: ( (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) )
            // InternalIoTParser.g:3038:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            {
            // InternalIoTParser.g:3038:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            // InternalIoTParser.g:3039:3: this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getSubAddParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_SubAdd_0=ruleSubAdd();

            state._fsp--;


            			current = this_SubAdd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3047:3: ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            loop39:
            do {
                int alt39=5;
                switch ( input.LA(1) ) {
                case LessThanSign:
                    {
                    alt39=1;
                    }
                    break;
                case LessThanSignEqualsSign:
                    {
                    alt39=2;
                    }
                    break;
                case GreaterThanSign:
                    {
                    alt39=3;
                    }
                    break;
                case GreaterThanSignEqualsSign:
                    {
                    alt39=4;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // InternalIoTParser.g:3048:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3048:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3049:5: () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3049:5: ()
            	    // InternalIoTParser.g:3050:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,LessThanSign,FOLLOW_44); 

            	    					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3060:5: ( (lv_right_3_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3061:6: (lv_right_3_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3061:6: (lv_right_3_0= ruleSubAdd )
            	    // InternalIoTParser.g:3062:7: lv_right_3_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
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
            	    // InternalIoTParser.g:3081:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3081:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3082:5: () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3082:5: ()
            	    // InternalIoTParser.g:3083:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,LessThanSignEqualsSign,FOLLOW_44); 

            	    					newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3093:5: ( (lv_right_6_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3094:6: (lv_right_6_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3094:6: (lv_right_6_0= ruleSubAdd )
            	    // InternalIoTParser.g:3095:7: lv_right_6_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
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
            	    // InternalIoTParser.g:3114:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3114:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3115:5: () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3115:5: ()
            	    // InternalIoTParser.g:3116:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,GreaterThanSign,FOLLOW_44); 

            	    					newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_2_1());
            	    				
            	    // InternalIoTParser.g:3126:5: ( (lv_right_9_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3127:6: (lv_right_9_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3127:6: (lv_right_9_0= ruleSubAdd )
            	    // InternalIoTParser.g:3128:7: lv_right_9_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
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
            	    // InternalIoTParser.g:3147:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3147:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3148:5: () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3148:5: ()
            	    // InternalIoTParser.g:3149:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_44); 

            	    					newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalIoTParser.g:3159:5: ( (lv_right_12_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3160:6: (lv_right_12_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3160:6: (lv_right_12_0= ruleSubAdd )
            	    // InternalIoTParser.g:3161:7: lv_right_12_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
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
            	    break loop39;
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
    // InternalIoTParser.g:3184:1: entryRuleSubAdd returns [EObject current=null] : iv_ruleSubAdd= ruleSubAdd EOF ;
    public final EObject entryRuleSubAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAdd = null;


        try {
            // InternalIoTParser.g:3184:47: (iv_ruleSubAdd= ruleSubAdd EOF )
            // InternalIoTParser.g:3185:2: iv_ruleSubAdd= ruleSubAdd EOF
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
    // InternalIoTParser.g:3191:1: ruleSubAdd returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) ;
    public final EObject ruleSubAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3197:2: ( (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) )
            // InternalIoTParser.g:3198:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            {
            // InternalIoTParser.g:3198:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            // InternalIoTParser.g:3199:3: this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubAddAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3207:3: ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==PlusSign) ) {
                    alt40=1;
                }
                else if ( (LA40_0==HyphenMinus) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalIoTParser.g:3208:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:3208:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:3209:5: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:3209:5: ()
            	    // InternalIoTParser.g:3210:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_44); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSubAddAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3220:5: ( (lv_right_3_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:3221:6: (lv_right_3_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:3221:6: (lv_right_3_0= ruleMulDiv )
            	    // InternalIoTParser.g:3222:7: lv_right_3_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
            	    // InternalIoTParser.g:3241:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:3241:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:3242:5: () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:3242:5: ()
            	    // InternalIoTParser.g:3243:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,HyphenMinus,FOLLOW_44); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSubAddAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3253:5: ( (lv_right_6_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:3254:6: (lv_right_6_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:3254:6: (lv_right_6_0= ruleMulDiv )
            	    // InternalIoTParser.g:3255:7: lv_right_6_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
            	    break loop40;
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
    // InternalIoTParser.g:3278:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalIoTParser.g:3278:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalIoTParser.g:3279:2: iv_ruleMulDiv= ruleMulDiv EOF
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
    // InternalIoTParser.g:3285:1: ruleMulDiv returns [EObject current=null] : (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3291:2: ( (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) )
            // InternalIoTParser.g:3292:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            {
            // InternalIoTParser.g:3292:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            // InternalIoTParser.g:3293:3: this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3301:3: ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Asterisk) ) {
                    alt41=1;
                }
                else if ( (LA41_0==Solidus) ) {
                    alt41=2;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalIoTParser.g:3302:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:3302:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:3303:5: () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:3303:5: ()
            	    // InternalIoTParser.g:3304:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_44); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3314:5: ( (lv_right_3_0= ruleNegation ) )
            	    // InternalIoTParser.g:3315:6: (lv_right_3_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:3315:6: (lv_right_3_0= ruleNegation )
            	    // InternalIoTParser.g:3316:7: lv_right_3_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_55);
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
            	    // InternalIoTParser.g:3335:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:3335:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:3336:5: () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:3336:5: ()
            	    // InternalIoTParser.g:3337:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,Solidus,FOLLOW_44); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMulDivAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3347:5: ( (lv_right_6_0= ruleNegation ) )
            	    // InternalIoTParser.g:3348:6: (lv_right_6_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:3348:6: (lv_right_6_0= ruleNegation )
            	    // InternalIoTParser.g:3349:7: lv_right_6_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_55);
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
            	    break loop41;
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
    // InternalIoTParser.g:3372:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalIoTParser.g:3372:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalIoTParser.g:3373:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalIoTParser.g:3379:1: ruleNegation returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Exponent_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3385:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) )
            // InternalIoTParser.g:3386:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            {
            // InternalIoTParser.g:3386:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==HyphenMinus) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=ExclamationMark && LA42_0<=LeftParenthesis)||(LA42_0>=RULE_INT && LA42_0<=RULE_NDBL)||LA42_0==RULE_BOOLEAN||(LA42_0>=RULE_ID && LA42_0<=RULE_STRING)) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalIoTParser.g:3387:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    {
                    // InternalIoTParser.g:3387:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    // InternalIoTParser.g:3388:4: () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) )
                    {
                    // InternalIoTParser.g:3388:4: ()
                    // InternalIoTParser.g:3389:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getNegationAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalIoTParser.g:3399:4: ( (lv_value_2_0= ruleExponent ) )
                    // InternalIoTParser.g:3400:5: (lv_value_2_0= ruleExponent )
                    {
                    // InternalIoTParser.g:3400:5: (lv_value_2_0= ruleExponent )
                    // InternalIoTParser.g:3401:6: lv_value_2_0= ruleExponent
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
                    // InternalIoTParser.g:3420:3: this_Exponent_3= ruleExponent
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
    // InternalIoTParser.g:3432:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalIoTParser.g:3432:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalIoTParser.g:3433:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalIoTParser.g:3439:1: ruleExponent returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_power_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3445:2: ( (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) )
            // InternalIoTParser.g:3446:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            {
            // InternalIoTParser.g:3446:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            // InternalIoTParser.g:3447:3: this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            {

            			newCompositeNode(grammarAccess.getExponentAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_56);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3455:3: ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AsteriskAsterisk) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalIoTParser.g:3456:4: () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) )
                    {
                    // InternalIoTParser.g:3456:4: ()
                    // InternalIoTParser.g:3457:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExponentAccess().getExponentBaseAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AsteriskAsterisk,FOLLOW_44); 

                    				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
                    			
                    // InternalIoTParser.g:3467:4: ( (lv_power_3_0= ruleNegation ) )
                    // InternalIoTParser.g:3468:5: (lv_power_3_0= ruleNegation )
                    {
                    // InternalIoTParser.g:3468:5: (lv_power_3_0= ruleNegation )
                    // InternalIoTParser.g:3469:6: lv_power_3_0= ruleNegation
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
    // InternalIoTParser.g:3491:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalIoTParser.g:3491:44: (iv_ruleNot= ruleNot EOF )
            // InternalIoTParser.g:3492:2: iv_ruleNot= ruleNot EOF
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
    // InternalIoTParser.g:3498:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Primary_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3504:2: ( ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) )
            // InternalIoTParser.g:3505:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            {
            // InternalIoTParser.g:3505:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ExclamationMark) ) {
                alt44=1;
            }
            else if ( (LA44_0==LeftParenthesis||(LA44_0>=RULE_INT && LA44_0<=RULE_NDBL)||LA44_0==RULE_BOOLEAN||(LA44_0>=RULE_ID && LA44_0<=RULE_STRING)) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalIoTParser.g:3506:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    {
                    // InternalIoTParser.g:3506:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    // InternalIoTParser.g:3507:4: () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) )
                    {
                    // InternalIoTParser.g:3507:4: ()
                    // InternalIoTParser.g:3508:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_1());
                    			
                    // InternalIoTParser.g:3518:4: ( (lv_value_2_0= rulePrimary ) )
                    // InternalIoTParser.g:3519:5: (lv_value_2_0= rulePrimary )
                    {
                    // InternalIoTParser.g:3519:5: (lv_value_2_0= rulePrimary )
                    // InternalIoTParser.g:3520:6: lv_value_2_0= rulePrimary
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
                    // InternalIoTParser.g:3539:3: this_Primary_3= rulePrimary
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
    // InternalIoTParser.g:3551:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalIoTParser.g:3551:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalIoTParser.g:3552:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalIoTParser.g:3558:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) ;
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
            // InternalIoTParser.g:3564:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) )
            // InternalIoTParser.g:3565:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            {
            // InternalIoTParser.g:3565:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            int alt45=5;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt45=1;
                }
                break;
            case RULE_ID:
                {
                alt45=2;
                }
                break;
            case RULE_INT:
            case RULE_NINT:
            case RULE_DBL:
            case RULE_NDBL:
                {
                alt45=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt45=4;
                }
                break;
            case RULE_STRING:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalIoTParser.g:3566:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalIoTParser.g:3566:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalIoTParser.g:3567:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_44); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_57);
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
                    // InternalIoTParser.g:3585:3: this_Reference_3= ruleReference
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
                    // InternalIoTParser.g:3594:3: this_NumberLiteral_4= ruleNumberLiteral
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
                    // InternalIoTParser.g:3603:3: this_BooleanLiteral_5= ruleBooleanLiteral
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
                    // InternalIoTParser.g:3612:3: this_StringLiteral_6= ruleStringLiteral
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
    // InternalIoTParser.g:3624:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalIoTParser.g:3624:50: (iv_ruleReference= ruleReference EOF )
            // InternalIoTParser.g:3625:2: iv_ruleReference= ruleReference EOF
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
    // InternalIoTParser.g:3631:1: ruleReference returns [EObject current=null] : ( (lv_ref_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3637:2: ( ( (lv_ref_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:3638:2: ( (lv_ref_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:3638:2: ( (lv_ref_0_0= RULE_ID ) )
            // InternalIoTParser.g:3639:3: (lv_ref_0_0= RULE_ID )
            {
            // InternalIoTParser.g:3639:3: (lv_ref_0_0= RULE_ID )
            // InternalIoTParser.g:3640:4: lv_ref_0_0= RULE_ID
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
    // InternalIoTParser.g:3659:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalIoTParser.g:3659:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalIoTParser.g:3660:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalIoTParser.g:3666:1: ruleStringLiteral returns [EObject current=null] : ( (lv_str_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3672:2: ( ( (lv_str_0_0= RULE_STRING ) ) )
            // InternalIoTParser.g:3673:2: ( (lv_str_0_0= RULE_STRING ) )
            {
            // InternalIoTParser.g:3673:2: ( (lv_str_0_0= RULE_STRING ) )
            // InternalIoTParser.g:3674:3: (lv_str_0_0= RULE_STRING )
            {
            // InternalIoTParser.g:3674:3: (lv_str_0_0= RULE_STRING )
            // InternalIoTParser.g:3675:4: lv_str_0_0= RULE_STRING
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
    // InternalIoTParser.g:3694:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalIoTParser.g:3694:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalIoTParser.g:3695:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalIoTParser.g:3701:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_numb_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numb_0_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3707:2: ( ( (lv_numb_0_0= ruleNUMBER ) ) )
            // InternalIoTParser.g:3708:2: ( (lv_numb_0_0= ruleNUMBER ) )
            {
            // InternalIoTParser.g:3708:2: ( (lv_numb_0_0= ruleNUMBER ) )
            // InternalIoTParser.g:3709:3: (lv_numb_0_0= ruleNUMBER )
            {
            // InternalIoTParser.g:3709:3: (lv_numb_0_0= ruleNUMBER )
            // InternalIoTParser.g:3710:4: lv_numb_0_0= ruleNUMBER
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
    // InternalIoTParser.g:3730:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalIoTParser.g:3730:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalIoTParser.g:3731:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalIoTParser.g:3737:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_bool_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bool_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3743:2: ( ( (lv_bool_0_0= RULE_BOOLEAN ) ) )
            // InternalIoTParser.g:3744:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            {
            // InternalIoTParser.g:3744:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            // InternalIoTParser.g:3745:3: (lv_bool_0_0= RULE_BOOLEAN )
            {
            // InternalIoTParser.g:3745:3: (lv_bool_0_0= RULE_BOOLEAN )
            // InternalIoTParser.g:3746:4: lv_bool_0_0= RULE_BOOLEAN
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
    // InternalIoTParser.g:3765:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3767:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalIoTParser.g:3768:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalIoTParser.g:3777:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DBL_1=null;
        Token this_NINT_2=null;
        Token this_NDBL_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3784:2: ( (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL ) )
            // InternalIoTParser.g:3785:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL )
            {
            // InternalIoTParser.g:3785:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL )
            int alt46=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt46=1;
                }
                break;
            case RULE_DBL:
                {
                alt46=2;
                }
                break;
            case RULE_NINT:
                {
                alt46=3;
                }
                break;
            case RULE_NDBL:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalIoTParser.g:3786:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:3794:3: this_DBL_1= RULE_DBL
                    {
                    this_DBL_1=(Token)match(input,RULE_DBL,FOLLOW_2); 

                    			current.merge(this_DBL_1);
                    		

                    			newLeafNode(this_DBL_1, grammarAccess.getNUMBERAccess().getDBLTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:3802:3: this_NINT_2= RULE_NINT
                    {
                    this_NINT_2=(Token)match(input,RULE_NINT,FOLLOW_2); 

                    			current.merge(this_NINT_2);
                    		

                    			newLeafNode(this_NINT_2, grammarAccess.getNUMBERAccess().getNINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:3810:3: this_NDBL_3= RULE_NDBL
                    {
                    this_NDBL_3=(Token)match(input,RULE_NDBL,FOLLOW_2); 

                    			current.merge(this_NDBL_3);
                    		

                    			newLeafNode(this_NDBL_3, grammarAccess.getNUMBERAccess().getNDBLTerminalRuleCall_3());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001002682L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000682L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000282L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020400400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004020008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040840000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001001000100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001001000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000140000010100L,0x0000000000200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1800000000000000L,0x000000000065E002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000401L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000E0020A0A0000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0042000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00A0000000000002L,0x00000000000000A0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000000000L});

}