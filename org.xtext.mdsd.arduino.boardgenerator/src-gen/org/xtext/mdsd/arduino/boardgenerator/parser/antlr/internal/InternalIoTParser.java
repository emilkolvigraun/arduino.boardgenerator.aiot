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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Microseconds", "Milliseconds", "Frequency", "Abstract", "ByWindow", "Function", "Channel", "Command", "Extends", "Include", "Seconds", "Broker", "Filter", "Median", "Reduce", "Sample", "Sensor", "Board", "Count", "Model", "Route", "Stdev", "Topic", "Baud", "Byte", "Char", "Mean", "Pass", "Pipe", "Port", "Ssid", "Stop", "Type", "Wifi", "Abs", "And", "Map", "Max", "Min", "Url", "Var", "Vcc", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "As", "Id", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_NINT", "RULE_DBL", "RULE_NDBL", "RULE_BOOLEAN", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    // InternalIoTParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_wifiConfig_1_0= ruleWifiConfig ) )* ( (lv_channel_2_0= ruleChannel ) )* ( (lv_function_3_0= ruleFunction ) )* ( (lv_abstractBoard_4_0= ruleAbstractBoard ) )* ( (lv_board_5_0= ruleBoard ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_wifiConfig_1_0 = null;

        EObject lv_channel_2_0 = null;

        EObject lv_function_3_0 = null;

        EObject lv_abstractBoard_4_0 = null;

        EObject lv_board_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:70:2: ( ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_wifiConfig_1_0= ruleWifiConfig ) )* ( (lv_channel_2_0= ruleChannel ) )* ( (lv_function_3_0= ruleFunction ) )* ( (lv_abstractBoard_4_0= ruleAbstractBoard ) )* ( (lv_board_5_0= ruleBoard ) )* ) )
            // InternalIoTParser.g:71:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_wifiConfig_1_0= ruleWifiConfig ) )* ( (lv_channel_2_0= ruleChannel ) )* ( (lv_function_3_0= ruleFunction ) )* ( (lv_abstractBoard_4_0= ruleAbstractBoard ) )* ( (lv_board_5_0= ruleBoard ) )* )
            {
            // InternalIoTParser.g:71:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_wifiConfig_1_0= ruleWifiConfig ) )* ( (lv_channel_2_0= ruleChannel ) )* ( (lv_function_3_0= ruleFunction ) )* ( (lv_abstractBoard_4_0= ruleAbstractBoard ) )* ( (lv_board_5_0= ruleBoard ) )* )
            // InternalIoTParser.g:72:3: ( (lv_includes_0_0= ruleInclude ) )* ( (lv_wifiConfig_1_0= ruleWifiConfig ) )* ( (lv_channel_2_0= ruleChannel ) )* ( (lv_function_3_0= ruleFunction ) )* ( (lv_abstractBoard_4_0= ruleAbstractBoard ) )* ( (lv_board_5_0= ruleBoard ) )*
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

            // InternalIoTParser.g:91:3: ( (lv_wifiConfig_1_0= ruleWifiConfig ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Wifi) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIoTParser.g:92:4: (lv_wifiConfig_1_0= ruleWifiConfig )
            	    {
            	    // InternalIoTParser.g:92:4: (lv_wifiConfig_1_0= ruleWifiConfig )
            	    // InternalIoTParser.g:93:5: lv_wifiConfig_1_0= ruleWifiConfig
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getWifiConfigWifiConfigParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_wifiConfig_1_0=ruleWifiConfig();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"wifiConfig",
            	    						lv_wifiConfig_1_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.WifiConfig");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalIoTParser.g:110:3: ( (lv_channel_2_0= ruleChannel ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Channel) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIoTParser.g:111:4: (lv_channel_2_0= ruleChannel )
            	    {
            	    // InternalIoTParser.g:111:4: (lv_channel_2_0= ruleChannel )
            	    // InternalIoTParser.g:112:5: lv_channel_2_0= ruleChannel
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getChannelChannelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_channel_2_0=ruleChannel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"channel",
            	    						lv_channel_2_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Channel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalIoTParser.g:129:3: ( (lv_function_3_0= ruleFunction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Function) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIoTParser.g:130:4: (lv_function_3_0= ruleFunction )
            	    {
            	    // InternalIoTParser.g:130:4: (lv_function_3_0= ruleFunction )
            	    // InternalIoTParser.g:131:5: lv_function_3_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFunctionFunctionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_function_3_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"function",
            	    						lv_function_3_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalIoTParser.g:148:3: ( (lv_abstractBoard_4_0= ruleAbstractBoard ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Abstract) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIoTParser.g:149:4: (lv_abstractBoard_4_0= ruleAbstractBoard )
            	    {
            	    // InternalIoTParser.g:149:4: (lv_abstractBoard_4_0= ruleAbstractBoard )
            	    // InternalIoTParser.g:150:5: lv_abstractBoard_4_0= ruleAbstractBoard
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAbstractBoardAbstractBoardParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_abstractBoard_4_0=ruleAbstractBoard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractBoard",
            	    						lv_abstractBoard_4_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.AbstractBoard");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalIoTParser.g:167:3: ( (lv_board_5_0= ruleBoard ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Board) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIoTParser.g:168:4: (lv_board_5_0= ruleBoard )
            	    {
            	    // InternalIoTParser.g:168:4: (lv_board_5_0= ruleBoard )
            	    // InternalIoTParser.g:169:5: lv_board_5_0= ruleBoard
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_board_5_0=ruleBoard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"board",
            	    						lv_board_5_0,
            	    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Board");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInclude"
    // InternalIoTParser.g:190:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalIoTParser.g:190:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalIoTParser.g:191:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalIoTParser.g:197:1: ruleInclude returns [EObject current=null] : (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_importURI_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:203:2: ( (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* ) )
            // InternalIoTParser.g:204:2: (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* )
            {
            // InternalIoTParser.g:204:2: (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* )
            // InternalIoTParser.g:205:3: otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Include,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalIoTParser.g:209:3: ( (lv_importURI_1_0= RULE_ID ) )
            // InternalIoTParser.g:210:4: (lv_importURI_1_0= RULE_ID )
            {
            // InternalIoTParser.g:210:4: (lv_importURI_1_0= RULE_ID )
            // InternalIoTParser.g:211:5: lv_importURI_1_0= RULE_ID
            {
            lv_importURI_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalIoTParser.g:227:3: (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==FullStop) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIoTParser.g:228:4: otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,FullStop,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalIoTParser.g:232:4: ( (lv_importURI_3_0= RULE_ID ) )
            	    // InternalIoTParser.g:233:5: (lv_importURI_3_0= RULE_ID )
            	    {
            	    // InternalIoTParser.g:233:5: (lv_importURI_3_0= RULE_ID )
            	    // InternalIoTParser.g:234:6: lv_importURI_3_0= RULE_ID
            	    {
            	    lv_importURI_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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
            	    break loop7;
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


    // $ANTLR start "entryRuleWifiConfig"
    // InternalIoTParser.g:255:1: entryRuleWifiConfig returns [EObject current=null] : iv_ruleWifiConfig= ruleWifiConfig EOF ;
    public final EObject entryRuleWifiConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWifiConfig = null;


        try {
            // InternalIoTParser.g:255:51: (iv_ruleWifiConfig= ruleWifiConfig EOF )
            // InternalIoTParser.g:256:2: iv_ruleWifiConfig= ruleWifiConfig EOF
            {
             newCompositeNode(grammarAccess.getWifiConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWifiConfig=ruleWifiConfig();

            state._fsp--;

             current =iv_ruleWifiConfig; 
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
    // $ANTLR end "entryRuleWifiConfig"


    // $ANTLR start "ruleWifiConfig"
    // InternalIoTParser.g:262:1: ruleWifiConfig returns [EObject current=null] : (otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END ) ;
    public final EObject ruleWifiConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token lv_ssid_5_0=null;
        Token otherlv_6=null;
        Token lv_pass_7_0=null;
        Token this_END_8=null;


        	enterRule();

        try {
            // InternalIoTParser.g:268:2: ( (otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END ) )
            // InternalIoTParser.g:269:2: (otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END )
            {
            // InternalIoTParser.g:269:2: (otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END )
            // InternalIoTParser.g:270:3: otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END
            {
            otherlv_0=(Token)match(input,Wifi,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWifiConfigAccess().getWifiKeyword_0());
            		
            // InternalIoTParser.g:274:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:275:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:275:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:276:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWifiConfigAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getWifiConfigAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getWifiConfigAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Ssid,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getWifiConfigAccess().getSsidKeyword_4());
            		
            // InternalIoTParser.g:304:3: ( (lv_ssid_5_0= RULE_STRING ) )
            // InternalIoTParser.g:305:4: (lv_ssid_5_0= RULE_STRING )
            {
            // InternalIoTParser.g:305:4: (lv_ssid_5_0= RULE_STRING )
            // InternalIoTParser.g:306:5: lv_ssid_5_0= RULE_STRING
            {
            lv_ssid_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_ssid_5_0, grammarAccess.getWifiConfigAccess().getSsidSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ssid",
            						lv_ssid_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalIoTParser.g:322:3: (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Pass) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIoTParser.g:323:4: otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,Pass,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getWifiConfigAccess().getPassKeyword_6_0());
                    			
                    // InternalIoTParser.g:327:4: ( (lv_pass_7_0= RULE_STRING ) )
                    // InternalIoTParser.g:328:5: (lv_pass_7_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:328:5: (lv_pass_7_0= RULE_STRING )
                    // InternalIoTParser.g:329:6: lv_pass_7_0= RULE_STRING
                    {
                    lv_pass_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_pass_7_0, grammarAccess.getWifiConfigAccess().getPassSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWifiConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pass",
                    							lv_pass_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getWifiConfigAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleWifiConfig"


    // $ANTLR start "entryRuleChannel"
    // InternalIoTParser.g:354:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalIoTParser.g:354:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalIoTParser.g:355:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalIoTParser.g:361:1: ruleChannel returns [EObject current=null] : (otherlv_0= Channel ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleChannelConfig ) ) this_END_5= RULE_END )? ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_config_4_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:367:2: ( (otherlv_0= Channel ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleChannelConfig ) ) this_END_5= RULE_END )? ) )
            // InternalIoTParser.g:368:2: (otherlv_0= Channel ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleChannelConfig ) ) this_END_5= RULE_END )? )
            {
            // InternalIoTParser.g:368:2: (otherlv_0= Channel ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleChannelConfig ) ) this_END_5= RULE_END )? )
            // InternalIoTParser.g:369:3: otherlv_0= Channel ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleChannelConfig ) ) this_END_5= RULE_END )?
            {
            otherlv_0=(Token)match(input,Channel,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
            		
            // InternalIoTParser.g:373:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:374:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:374:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:375:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIoTParser.g:391:3: (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleChannelConfig ) ) this_END_5= RULE_END )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Colon) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoTParser.g:392:4: otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleChannelConfig ) ) this_END_5= RULE_END
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getColonKeyword_2_0());
                    			
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getChannelAccess().getBEGINTerminalRuleCall_2_1());
                    			
                    // InternalIoTParser.g:400:4: ( (lv_config_4_0= ruleChannelConfig ) )
                    // InternalIoTParser.g:401:5: (lv_config_4_0= ruleChannelConfig )
                    {
                    // InternalIoTParser.g:401:5: (lv_config_4_0= ruleChannelConfig )
                    // InternalIoTParser.g:402:6: lv_config_4_0= ruleChannelConfig
                    {

                    						newCompositeNode(grammarAccess.getChannelAccess().getConfigChannelConfigParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_config_4_0=ruleChannelConfig();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChannelRule());
                    						}
                    						set(
                    							current,
                    							"config",
                    							lv_config_4_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.ChannelConfig");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getChannelAccess().getENDTerminalRuleCall_2_3());
                    			

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


    // $ANTLR start "entryRuleChannelConfig"
    // InternalIoTParser.g:428:1: entryRuleChannelConfig returns [EObject current=null] : iv_ruleChannelConfig= ruleChannelConfig EOF ;
    public final EObject entryRuleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelConfig = null;


        try {
            // InternalIoTParser.g:428:54: (iv_ruleChannelConfig= ruleChannelConfig EOF )
            // InternalIoTParser.g:429:2: iv_ruleChannelConfig= ruleChannelConfig EOF
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
    // InternalIoTParser.g:435:1: ruleChannelConfig returns [EObject current=null] : (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) ;
    public final EObject ruleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject this_Wifi_0 = null;

        EObject this_Serial_1 = null;

        EObject this_MqttClient_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:441:2: ( (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) )
            // InternalIoTParser.g:442:2: (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            {
            // InternalIoTParser.g:442:2: (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            int alt10=3;
            switch ( input.LA(1) ) {
            case Url:
                {
                alt10=1;
                }
                break;
            case Baud:
                {
                alt10=2;
                }
                break;
            case Broker:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalIoTParser.g:443:3: this_Wifi_0= ruleWifi
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
                    // InternalIoTParser.g:452:3: this_Serial_1= ruleSerial
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
                    // InternalIoTParser.g:461:3: this_MqttClient_2= ruleMqttClient
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
    // InternalIoTParser.g:473:1: entryRuleWifi returns [EObject current=null] : iv_ruleWifi= ruleWifi EOF ;
    public final EObject entryRuleWifi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWifi = null;


        try {
            // InternalIoTParser.g:473:45: (iv_ruleWifi= ruleWifi EOF )
            // InternalIoTParser.g:474:2: iv_ruleWifi= ruleWifi EOF
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
    // InternalIoTParser.g:480:1: ruleWifi returns [EObject current=null] : (otherlv_0= Url ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Route ( (lv_route_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleWifi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_route_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:486:2: ( (otherlv_0= Url ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Route ( (lv_route_3_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:487:2: (otherlv_0= Url ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Route ( (lv_route_3_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:487:2: (otherlv_0= Url ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Route ( (lv_route_3_0= RULE_STRING ) ) )
            // InternalIoTParser.g:488:3: otherlv_0= Url ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Route ( (lv_route_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Url,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWifiAccess().getUrlKeyword_0());
            		
            // InternalIoTParser.g:492:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalIoTParser.g:493:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:493:4: (lv_url_1_0= RULE_STRING )
            // InternalIoTParser.g:494:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_url_1_0, grammarAccess.getWifiAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,Route,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getWifiAccess().getRouteKeyword_2());
            		
            // InternalIoTParser.g:514:3: ( (lv_route_3_0= RULE_STRING ) )
            // InternalIoTParser.g:515:4: (lv_route_3_0= RULE_STRING )
            {
            // InternalIoTParser.g:515:4: (lv_route_3_0= RULE_STRING )
            // InternalIoTParser.g:516:5: lv_route_3_0= RULE_STRING
            {
            lv_route_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_route_3_0, grammarAccess.getWifiAccess().getRouteSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"route",
            						lv_route_3_0,
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
    // InternalIoTParser.g:536:1: entryRuleSerial returns [EObject current=null] : iv_ruleSerial= ruleSerial EOF ;
    public final EObject entryRuleSerial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerial = null;


        try {
            // InternalIoTParser.g:536:47: (iv_ruleSerial= ruleSerial EOF )
            // InternalIoTParser.g:537:2: iv_ruleSerial= ruleSerial EOF
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
    // InternalIoTParser.g:543:1: ruleSerial returns [EObject current=null] : (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) ) ;
    public final EObject ruleSerial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_baud_1_0=null;
        Token otherlv_2=null;
        EObject lv_stop_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:549:2: ( (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) ) )
            // InternalIoTParser.g:550:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) )
            {
            // InternalIoTParser.g:550:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) ) )
            // InternalIoTParser.g:551:3: otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stop_3_0= rulestopChar ) )
            {
            otherlv_0=(Token)match(input,Baud,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSerialAccess().getBaudKeyword_0());
            		
            // InternalIoTParser.g:555:3: ( (lv_baud_1_0= RULE_INT ) )
            // InternalIoTParser.g:556:4: (lv_baud_1_0= RULE_INT )
            {
            // InternalIoTParser.g:556:4: (lv_baud_1_0= RULE_INT )
            // InternalIoTParser.g:557:5: lv_baud_1_0= RULE_INT
            {
            lv_baud_1_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,Stop,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSerialAccess().getStopKeyword_2());
            		
            // InternalIoTParser.g:577:3: ( (lv_stop_3_0= rulestopChar ) )
            // InternalIoTParser.g:578:4: (lv_stop_3_0= rulestopChar )
            {
            // InternalIoTParser.g:578:4: (lv_stop_3_0= rulestopChar )
            // InternalIoTParser.g:579:5: lv_stop_3_0= rulestopChar
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
    // InternalIoTParser.g:600:1: entryRulestopChar returns [EObject current=null] : iv_rulestopChar= rulestopChar EOF ;
    public final EObject entryRulestopChar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestopChar = null;


        try {
            // InternalIoTParser.g:600:49: (iv_rulestopChar= rulestopChar EOF )
            // InternalIoTParser.g:601:2: iv_rulestopChar= rulestopChar EOF
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
    // InternalIoTParser.g:607:1: rulestopChar returns [EObject current=null] : ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) ) ;
    public final EObject rulestopChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:613:2: ( ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) ) )
            // InternalIoTParser.g:614:2: ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) )
            {
            // InternalIoTParser.g:614:2: ( ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Char) ) {
                alt11=1;
            }
            else if ( (LA11_0==Byte) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIoTParser.g:615:3: ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) )
                    {
                    // InternalIoTParser.g:615:3: ( () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) ) )
                    // InternalIoTParser.g:616:4: () otherlv_1= Char ( (lv_name_2_0= RULE_STRING ) )
                    {
                    // InternalIoTParser.g:616:4: ()
                    // InternalIoTParser.g:617:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStopCharAccess().getCharAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Char,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getStopCharAccess().getCharKeyword_0_1());
                    			
                    // InternalIoTParser.g:627:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalIoTParser.g:628:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:628:5: (lv_name_2_0= RULE_STRING )
                    // InternalIoTParser.g:629:6: lv_name_2_0= RULE_STRING
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
                    // InternalIoTParser.g:647:3: ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) )
                    {
                    // InternalIoTParser.g:647:3: ( () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) ) )
                    // InternalIoTParser.g:648:4: () otherlv_4= Byte ( (lv_name_5_0= RULE_INT ) )
                    {
                    // InternalIoTParser.g:648:4: ()
                    // InternalIoTParser.g:649:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStopCharAccess().getByteAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Byte,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getStopCharAccess().getByteKeyword_1_1());
                    			
                    // InternalIoTParser.g:659:4: ( (lv_name_5_0= RULE_INT ) )
                    // InternalIoTParser.g:660:5: (lv_name_5_0= RULE_INT )
                    {
                    // InternalIoTParser.g:660:5: (lv_name_5_0= RULE_INT )
                    // InternalIoTParser.g:661:6: lv_name_5_0= RULE_INT
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
    // InternalIoTParser.g:682:1: entryRuleMqttClient returns [EObject current=null] : iv_ruleMqttClient= ruleMqttClient EOF ;
    public final EObject entryRuleMqttClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMqttClient = null;


        try {
            // InternalIoTParser.g:682:51: (iv_ruleMqttClient= ruleMqttClient EOF )
            // InternalIoTParser.g:683:2: iv_ruleMqttClient= ruleMqttClient EOF
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
    // InternalIoTParser.g:689:1: ruleMqttClient returns [EObject current=null] : (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) ) ;
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
            // InternalIoTParser.g:695:2: ( (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:696:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:696:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) )
            // InternalIoTParser.g:697:3: otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Broker,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMqttClientAccess().getBrokerKeyword_0());
            		
            // InternalIoTParser.g:701:3: ( (lv_broker_1_0= RULE_STRING ) )
            // InternalIoTParser.g:702:4: (lv_broker_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:702:4: (lv_broker_1_0= RULE_STRING )
            // InternalIoTParser.g:703:5: lv_broker_1_0= RULE_STRING
            {
            lv_broker_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,Port,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMqttClientAccess().getPortKeyword_2());
            		
            // InternalIoTParser.g:723:3: ( (lv_port_3_0= RULE_INT ) )
            // InternalIoTParser.g:724:4: (lv_port_3_0= RULE_INT )
            {
            // InternalIoTParser.g:724:4: (lv_port_3_0= RULE_INT )
            // InternalIoTParser.g:725:5: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_24); 

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

            otherlv_4=(Token)match(input,Id,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getMqttClientAccess().getIdKeyword_4());
            		
            // InternalIoTParser.g:745:3: ( (lv_client_5_0= RULE_STRING ) )
            // InternalIoTParser.g:746:4: (lv_client_5_0= RULE_STRING )
            {
            // InternalIoTParser.g:746:4: (lv_client_5_0= RULE_STRING )
            // InternalIoTParser.g:747:5: lv_client_5_0= RULE_STRING
            {
            lv_client_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_6=(Token)match(input,Topic,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getMqttClientAccess().getTopicKeyword_6());
            		
            // InternalIoTParser.g:767:3: ( (lv_pub_7_0= RULE_STRING ) )
            // InternalIoTParser.g:768:4: (lv_pub_7_0= RULE_STRING )
            {
            // InternalIoTParser.g:768:4: (lv_pub_7_0= RULE_STRING )
            // InternalIoTParser.g:769:5: lv_pub_7_0= RULE_STRING
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
    // InternalIoTParser.g:789:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalIoTParser.g:789:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalIoTParser.g:790:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalIoTParser.g:796:1: ruleFunction returns [EObject current=null] : (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis ) ;
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
            // InternalIoTParser.g:802:2: ( (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis ) )
            // InternalIoTParser.g:803:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis )
            {
            // InternalIoTParser.g:803:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis )
            // InternalIoTParser.g:804:3: otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalIoTParser.g:808:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:809:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:809:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:810:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalIoTParser.g:830:3: ( (lv_input_3_0= ruleFunctionInputType ) )
            // InternalIoTParser.g:831:4: (lv_input_3_0= ruleFunctionInputType )
            {
            // InternalIoTParser.g:831:4: (lv_input_3_0= ruleFunctionInputType )
            // InternalIoTParser.g:832:5: lv_input_3_0= ruleFunctionInputType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getInputFunctionInputTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalIoTParser.g:849:3: (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIoTParser.g:850:4: otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIoTParser.g:854:4: ( (lv_input_5_0= ruleFunctionInputType ) )
            	    // InternalIoTParser.g:855:5: (lv_input_5_0= ruleFunctionInputType )
            	    {
            	    // InternalIoTParser.g:855:5: (lv_input_5_0= ruleFunctionInputType )
            	    // InternalIoTParser.g:856:6: lv_input_5_0= ruleFunctionInputType
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionAccess().getInputFunctionInputTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_7());
            		
            // InternalIoTParser.g:886:3: ( (lv_output_9_0= RULE_ID ) )
            // InternalIoTParser.g:887:4: (lv_output_9_0= RULE_ID )
            {
            // InternalIoTParser.g:887:4: (lv_output_9_0= RULE_ID )
            // InternalIoTParser.g:888:5: lv_output_9_0= RULE_ID
            {
            lv_output_9_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            // InternalIoTParser.g:904:3: (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIoTParser.g:905:4: otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIoTParser.g:909:4: ( (lv_output_11_0= RULE_ID ) )
            	    // InternalIoTParser.g:910:5: (lv_output_11_0= RULE_ID )
            	    {
            	    // InternalIoTParser.g:910:5: (lv_output_11_0= RULE_ID )
            	    // InternalIoTParser.g:911:6: lv_output_11_0= RULE_ID
            	    {
            	    lv_output_11_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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
            	    break loop13;
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
    // InternalIoTParser.g:936:1: entryRuleFunctionInputType returns [EObject current=null] : iv_ruleFunctionInputType= ruleFunctionInputType EOF ;
    public final EObject entryRuleFunctionInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionInputType = null;


        try {
            // InternalIoTParser.g:936:58: (iv_ruleFunctionInputType= ruleFunctionInputType EOF )
            // InternalIoTParser.g:937:2: iv_ruleFunctionInputType= ruleFunctionInputType EOF
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
    // InternalIoTParser.g:943:1: ruleFunctionInputType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionInputType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:949:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:950:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:950:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:951:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:951:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:952:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFunctionInputTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFunctionInputTypeRule());
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
    // $ANTLR end "ruleFunctionInputType"


    // $ANTLR start "entryRuleBoard"
    // InternalIoTParser.g:971:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalIoTParser.g:971:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalIoTParser.g:972:2: iv_ruleBoard= ruleBoard EOF
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
    // InternalIoTParser.g:978:1: ruleBoard returns [EObject current=null] : (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NewBoard_1 = null;

        EObject this_ExtendsBoard_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:984:2: ( (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) )
            // InternalIoTParser.g:985:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            {
            // InternalIoTParser.g:985:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            // InternalIoTParser.g:986:3: otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            {
            otherlv_0=(Token)match(input,Board,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            // InternalIoTParser.g:990:3: (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==Extends) ) {
                    alt14=2;
                }
                else if ( (LA14_1==Colon) ) {
                    alt14=1;
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
                    // InternalIoTParser.g:991:4: this_NewBoard_1= ruleNewBoard
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
                    // InternalIoTParser.g:1000:4: this_ExtendsBoard_2= ruleExtendsBoard
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
    // InternalIoTParser.g:1013:1: entryRuleNewBoard returns [EObject current=null] : iv_ruleNewBoard= ruleNewBoard EOF ;
    public final EObject entryRuleNewBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewBoard = null;


        try {
            // InternalIoTParser.g:1013:49: (iv_ruleNewBoard= ruleNewBoard EOF )
            // InternalIoTParser.g:1014:2: iv_ruleNewBoard= ruleNewBoard EOF
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
    // InternalIoTParser.g:1020:1: ruleNewBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) ;
    public final EObject ruleNewBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_END_7=null;
        EObject lv_version_3_0 = null;

        EObject lv_sensors_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1026:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) )
            // InternalIoTParser.g:1027:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            {
            // InternalIoTParser.g:1027:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            // InternalIoTParser.g:1028:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END
            {
            // InternalIoTParser.g:1028:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1029:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1029:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1030:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getNewBoardAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIoTParser.g:1054:3: ( (lv_version_3_0= ruleBoardVersion ) )
            // InternalIoTParser.g:1055:4: (lv_version_3_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:1055:4: (lv_version_3_0= ruleBoardVersion )
            // InternalIoTParser.g:1056:5: lv_version_3_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getNewBoardAccess().getVersionBoardVersionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalIoTParser.g:1073:3: (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Wifi) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIoTParser.g:1074:4: otherlv_4= Wifi ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,Wifi,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getNewBoardAccess().getWifiKeyword_4_0());
                    			
                    // InternalIoTParser.g:1078:4: ( (otherlv_5= RULE_ID ) )
                    // InternalIoTParser.g:1079:5: (otherlv_5= RULE_ID )
                    {
                    // InternalIoTParser.g:1079:5: (otherlv_5= RULE_ID )
                    // InternalIoTParser.g:1080:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewBoardRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_5, grammarAccess.getNewBoardAccess().getWifiSelectWifiConfigCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIoTParser.g:1092:3: ( (lv_sensors_6_0= ruleSensor ) )+
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
            	    // InternalIoTParser.g:1093:4: (lv_sensors_6_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:1093:4: (lv_sensors_6_0= ruleSensor )
            	    // InternalIoTParser.g:1094:5: lv_sensors_6_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getNewBoardAccess().getSensorsSensorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_sensors_6_0=ruleSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNewBoardRule());
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

            			newLeafNode(this_END_7, grammarAccess.getNewBoardAccess().getENDTerminalRuleCall_6());
            		

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
    // InternalIoTParser.g:1119:1: entryRuleBoardVersion returns [EObject current=null] : iv_ruleBoardVersion= ruleBoardVersion EOF ;
    public final EObject entryRuleBoardVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardVersion = null;


        try {
            // InternalIoTParser.g:1119:53: (iv_ruleBoardVersion= ruleBoardVersion EOF )
            // InternalIoTParser.g:1120:2: iv_ruleBoardVersion= ruleBoardVersion EOF
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
    // InternalIoTParser.g:1126:1: ruleBoardVersion returns [EObject current=null] : (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) ) ;
    public final EObject ruleBoardVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_model_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1132:2: ( (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) ) )
            // InternalIoTParser.g:1133:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) )
            {
            // InternalIoTParser.g:1133:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) )
            // InternalIoTParser.g:1134:3: otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardVersionAccess().getTypeKeyword_0());
            		
            // InternalIoTParser.g:1138:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalIoTParser.g:1139:4: (lv_type_1_0= RULE_ID )
            {
            // InternalIoTParser.g:1139:4: (lv_type_1_0= RULE_ID )
            // InternalIoTParser.g:1140:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            otherlv_2=(Token)match(input,Model,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardVersionAccess().getModelKeyword_2());
            		
            // InternalIoTParser.g:1160:3: ( (lv_model_3_0= RULE_ID ) )
            // InternalIoTParser.g:1161:4: (lv_model_3_0= RULE_ID )
            {
            // InternalIoTParser.g:1161:4: (lv_model_3_0= RULE_ID )
            // InternalIoTParser.g:1162:5: lv_model_3_0= RULE_ID
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
    // InternalIoTParser.g:1182:1: entryRuleExtendsBoard returns [EObject current=null] : iv_ruleExtendsBoard= ruleExtendsBoard EOF ;
    public final EObject entryRuleExtendsBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsBoard = null;


        try {
            // InternalIoTParser.g:1182:53: (iv_ruleExtendsBoard= ruleExtendsBoard EOF )
            // InternalIoTParser.g:1183:2: iv_ruleExtendsBoard= ruleExtendsBoard EOF
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
    // InternalIoTParser.g:1189:1: ruleExtendsBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )+ this_END_8= RULE_END )? ) ;
    public final EObject ruleExtendsBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        EObject lv_sensors_7_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1195:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )+ this_END_8= RULE_END )? ) )
            // InternalIoTParser.g:1196:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )+ this_END_8= RULE_END )? )
            {
            // InternalIoTParser.g:1196:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )+ this_END_8= RULE_END )? )
            // InternalIoTParser.g:1197:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )+ this_END_8= RULE_END )?
            {
            // InternalIoTParser.g:1197:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1198:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1198:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1199:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

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

            otherlv_1=(Token)match(input,Extends,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendsBoardAccess().getExtendsKeyword_1());
            		
            // InternalIoTParser.g:1219:3: ( (otherlv_2= RULE_ID ) )
            // InternalIoTParser.g:1220:4: (otherlv_2= RULE_ID )
            {
            // InternalIoTParser.g:1220:4: (otherlv_2= RULE_ID )
            // InternalIoTParser.g:1221:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendsBoardRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_2, grammarAccess.getExtendsBoardAccess().getAbstractBoardAbstractBoardCrossReference_2_0());
            				

            }


            }

            // InternalIoTParser.g:1232:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )+ this_END_8= RULE_END )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Colon) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIoTParser.g:1233:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )+ this_END_8= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtendsBoardAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getExtendsBoardAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:1241:4: (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==Wifi) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalIoTParser.g:1242:5: otherlv_5= Wifi ( (otherlv_6= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,Wifi,FOLLOW_9); 

                            					newLeafNode(otherlv_5, grammarAccess.getExtendsBoardAccess().getWifiKeyword_3_2_0());
                            				
                            // InternalIoTParser.g:1246:5: ( (otherlv_6= RULE_ID ) )
                            // InternalIoTParser.g:1247:6: (otherlv_6= RULE_ID )
                            {
                            // InternalIoTParser.g:1247:6: (otherlv_6= RULE_ID )
                            // InternalIoTParser.g:1248:7: otherlv_6= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExtendsBoardRule());
                            							}
                            						
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_30); 

                            							newLeafNode(otherlv_6, grammarAccess.getExtendsBoardAccess().getWifiSelectWifiConfigCrossReference_3_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalIoTParser.g:1260:4: ( (lv_sensors_7_0= ruleSensor ) )+
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
                    	    // InternalIoTParser.g:1261:5: (lv_sensors_7_0= ruleSensor )
                    	    {
                    	    // InternalIoTParser.g:1261:5: (lv_sensors_7_0= ruleSensor )
                    	    // InternalIoTParser.g:1262:6: lv_sensors_7_0= ruleSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getExtendsBoardAccess().getSensorsSensorParserRuleCall_3_3_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_sensors_7_0=ruleSensor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExtendsBoardRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sensors",
                    	    							lv_sensors_7_0,
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

                    this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_8, grammarAccess.getExtendsBoardAccess().getENDTerminalRuleCall_3_4());
                    			

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
    // InternalIoTParser.g:1288:1: entryRuleAbstractBoard returns [EObject current=null] : iv_ruleAbstractBoard= ruleAbstractBoard EOF ;
    public final EObject entryRuleAbstractBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBoard = null;


        try {
            // InternalIoTParser.g:1288:54: (iv_ruleAbstractBoard= ruleAbstractBoard EOF )
            // InternalIoTParser.g:1289:2: iv_ruleAbstractBoard= ruleAbstractBoard EOF
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
    // InternalIoTParser.g:1295:1: ruleAbstractBoard returns [EObject current=null] : (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) ;
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
            // InternalIoTParser.g:1301:2: ( (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) )
            // InternalIoTParser.g:1302:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            {
            // InternalIoTParser.g:1302:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            // InternalIoTParser.g:1303:3: otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END
            {
            otherlv_0=(Token)match(input,Abstract,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractBoardAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,Board,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractBoardAccess().getBoardKeyword_1());
            		
            // InternalIoTParser.g:1311:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoTParser.g:1312:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoTParser.g:1312:4: (lv_name_2_0= RULE_ID )
            // InternalIoTParser.g:1313:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getAbstractBoardAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalIoTParser.g:1337:3: ( (lv_version_5_0= ruleBoardVersion ) )
            // InternalIoTParser.g:1338:4: (lv_version_5_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:1338:4: (lv_version_5_0= ruleBoardVersion )
            // InternalIoTParser.g:1339:5: lv_version_5_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getAbstractBoardAccess().getVersionBoardVersionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalIoTParser.g:1356:3: ( (lv_sensors_6_0= ruleSensor ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Sensor) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIoTParser.g:1357:4: (lv_sensors_6_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:1357:4: (lv_sensors_6_0= ruleSensor )
            	    // InternalIoTParser.g:1358:5: lv_sensors_6_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractBoardAccess().getSensorsSensorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // InternalIoTParser.g:1383:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoTParser.g:1383:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoTParser.g:1384:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalIoTParser.g:1390:1: ruleSensor returns [EObject current=null] : (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) ;
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
            // InternalIoTParser.g:1396:2: ( (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) )
            // InternalIoTParser.g:1397:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            {
            // InternalIoTParser.g:1397:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            // InternalIoTParser.g:1398:3: otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END
            {
            otherlv_0=(Token)match(input,Sensor,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalIoTParser.g:1402:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:1403:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:1403:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:1404:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getEqualsSignKeyword_2());
            		
            // InternalIoTParser.g:1424:3: ( (lv_sensortype_3_0= ruleSensorType ) )
            // InternalIoTParser.g:1425:4: (lv_sensortype_3_0= ruleSensorType )
            {
            // InternalIoTParser.g:1425:4: (lv_sensortype_3_0= ruleSensorType )
            // InternalIoTParser.g:1426:5: lv_sensortype_3_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensortypeSensorTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_4=(Token)match(input,As,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getAsKeyword_4());
            		
            // InternalIoTParser.g:1447:3: ( (lv_vars_5_0= ruleSensorVariables ) )
            // InternalIoTParser.g:1448:4: (lv_vars_5_0= ruleSensorVariables )
            {
            // InternalIoTParser.g:1448:4: (lv_vars_5_0= ruleSensorVariables )
            // InternalIoTParser.g:1449:5: lv_vars_5_0= ruleSensorVariables
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getVarsSensorVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
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
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getSensorAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalIoTParser.g:1474:3: (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Sample) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalIoTParser.g:1475:4: otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) )
                    {
                    otherlv_8=(Token)match(input,Sample,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getSampleKeyword_8_0());
                    			
                    // InternalIoTParser.g:1479:4: ( (lv_sampler_9_0= ruleSampler ) )
                    // InternalIoTParser.g:1480:5: (lv_sampler_9_0= ruleSampler )
                    {
                    // InternalIoTParser.g:1480:5: (lv_sampler_9_0= ruleSampler )
                    // InternalIoTParser.g:1481:6: lv_sampler_9_0= ruleSampler
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getSamplerSamplerParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            // InternalIoTParser.g:1499:3: (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Vcc) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIoTParser.g:1500:4: otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,Vcc,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getVccKeyword_9_0());
                    			
                    // InternalIoTParser.g:1504:4: ( (lv_vcc_11_0= RULE_INT ) )
                    // InternalIoTParser.g:1505:5: (lv_vcc_11_0= RULE_INT )
                    {
                    // InternalIoTParser.g:1505:5: (lv_vcc_11_0= RULE_INT )
                    // InternalIoTParser.g:1506:6: lv_vcc_11_0= RULE_INT
                    {
                    lv_vcc_11_0=(Token)match(input,RULE_INT,FOLLOW_37); 

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

            // InternalIoTParser.g:1523:3: ( (lv_output_12_0= ruleSensorOutput ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Pipe) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIoTParser.g:1524:4: (lv_output_12_0= ruleSensorOutput )
            	    {
            	    // InternalIoTParser.g:1524:4: (lv_output_12_0= ruleSensorOutput )
            	    // InternalIoTParser.g:1525:5: lv_output_12_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputSensorOutputParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // InternalIoTParser.g:1550:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalIoTParser.g:1550:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalIoTParser.g:1551:2: iv_ruleSensorType= ruleSensorType EOF
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
    // InternalIoTParser.g:1557:1: ruleSensorType returns [EObject current=null] : (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalSensor_0 = null;

        EObject this_OnboardSensor_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1563:2: ( (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) )
            // InternalIoTParser.g:1564:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            {
            // InternalIoTParser.g:1564:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==EOF||LA24_1==As) ) {
                    alt24=2;
                }
                else if ( (LA24_1==LeftParenthesis) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalIoTParser.g:1565:3: this_ExternalSensor_0= ruleExternalSensor
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
                    // InternalIoTParser.g:1574:3: this_OnboardSensor_1= ruleOnboardSensor
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
    // InternalIoTParser.g:1586:1: entryRuleExternalSensor returns [EObject current=null] : iv_ruleExternalSensor= ruleExternalSensor EOF ;
    public final EObject entryRuleExternalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSensor = null;


        try {
            // InternalIoTParser.g:1586:55: (iv_ruleExternalSensor= ruleExternalSensor EOF )
            // InternalIoTParser.g:1587:2: iv_ruleExternalSensor= ruleExternalSensor EOF
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
    // InternalIoTParser.g:1593:1: ruleExternalSensor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) ;
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
            // InternalIoTParser.g:1599:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1600:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1600:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1601:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1601:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1602:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1602:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1603:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalSensorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoTParser.g:1623:3: ( (lv_pins_2_0= RULE_INT ) )
            // InternalIoTParser.g:1624:4: (lv_pins_2_0= RULE_INT )
            {
            // InternalIoTParser.g:1624:4: (lv_pins_2_0= RULE_INT )
            // InternalIoTParser.g:1625:5: lv_pins_2_0= RULE_INT
            {
            lv_pins_2_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            // InternalIoTParser.g:1641:3: (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalIoTParser.g:1642:4: otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalSensorAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1646:4: ( (lv_pins_4_0= RULE_INT ) )
            	    // InternalIoTParser.g:1647:5: (lv_pins_4_0= RULE_INT )
            	    {
            	    // InternalIoTParser.g:1647:5: (lv_pins_4_0= RULE_INT )
            	    // InternalIoTParser.g:1648:6: lv_pins_4_0= RULE_INT
            	    {
            	    lv_pins_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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
            	    break loop25;
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
    // InternalIoTParser.g:1673:1: entryRuleOnboardSensor returns [EObject current=null] : iv_ruleOnboardSensor= ruleOnboardSensor EOF ;
    public final EObject entryRuleOnboardSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnboardSensor = null;


        try {
            // InternalIoTParser.g:1673:54: (iv_ruleOnboardSensor= ruleOnboardSensor EOF )
            // InternalIoTParser.g:1674:2: iv_ruleOnboardSensor= ruleOnboardSensor EOF
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
    // InternalIoTParser.g:1680:1: ruleOnboardSensor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleOnboardSensor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1686:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1687:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1687:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1688:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1688:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1689:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:1708:1: entryRuleSensorVariables returns [EObject current=null] : iv_ruleSensorVariables= ruleSensorVariables EOF ;
    public final EObject entryRuleSensorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorVariables = null;


        try {
            // InternalIoTParser.g:1708:56: (iv_ruleSensorVariables= ruleSensorVariables EOF )
            // InternalIoTParser.g:1709:2: iv_ruleSensorVariables= ruleSensorVariables EOF
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
    // InternalIoTParser.g:1715:1: ruleSensorVariables returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) ;
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
            // InternalIoTParser.g:1721:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1722:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1722:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1723:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1723:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1724:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1724:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1725:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorVariablesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoTParser.g:1745:3: ( (lv_ids_2_0= ruleVariable ) )
            // InternalIoTParser.g:1746:4: (lv_ids_2_0= ruleVariable )
            {
            // InternalIoTParser.g:1746:4: (lv_ids_2_0= ruleVariable )
            // InternalIoTParser.g:1747:5: lv_ids_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalIoTParser.g:1764:3: (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalIoTParser.g:1765:4: otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSensorVariablesAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1769:4: ( (lv_ids_4_0= ruleVariable ) )
            	    // InternalIoTParser.g:1770:5: (lv_ids_4_0= ruleVariable )
            	    {
            	    // InternalIoTParser.g:1770:5: (lv_ids_4_0= ruleVariable )
            	    // InternalIoTParser.g:1771:6: lv_ids_4_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop26;
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
    // InternalIoTParser.g:1797:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalIoTParser.g:1797:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalIoTParser.g:1798:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalIoTParser.g:1804:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1810:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1811:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1811:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1812:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1812:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1813:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:1832:1: entryRuleSampler returns [EObject current=null] : iv_ruleSampler= ruleSampler EOF ;
    public final EObject entryRuleSampler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampler = null;


        try {
            // InternalIoTParser.g:1832:48: (iv_ruleSampler= ruleSampler EOF )
            // InternalIoTParser.g:1833:2: iv_ruleSampler= ruleSampler EOF
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
    // InternalIoTParser.g:1839:1: ruleSampler returns [EObject current=null] : (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) ;
    public final EObject ruleSampler() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Frequency_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1845:2: ( (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) )
            // InternalIoTParser.g:1846:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            {
            // InternalIoTParser.g:1846:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Command) ) {
                alt27=1;
            }
            else if ( (LA27_0==Frequency) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalIoTParser.g:1847:3: this_Command_0= ruleCommand
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
                    // InternalIoTParser.g:1856:3: this_Frequency_1= ruleFrequency
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
    // InternalIoTParser.g:1868:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalIoTParser.g:1868:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalIoTParser.g:1869:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalIoTParser.g:1875:1: ruleCommand returns [EObject current=null] : (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;
        Token lv_topic_2_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1881:2: ( (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? ) )
            // InternalIoTParser.g:1882:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? )
            {
            // InternalIoTParser.g:1882:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? )
            // InternalIoTParser.g:1883:3: otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,Command,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalIoTParser.g:1887:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalIoTParser.g:1888:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:1888:4: (lv_command_1_0= RULE_STRING )
            // InternalIoTParser.g:1889:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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

            // InternalIoTParser.g:1905:3: ( (lv_topic_2_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalIoTParser.g:1906:4: (lv_topic_2_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:1906:4: (lv_topic_2_0= RULE_STRING )
                    // InternalIoTParser.g:1907:5: lv_topic_2_0= RULE_STRING
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
    // InternalIoTParser.g:1927:1: entryRuleFrequency returns [EObject current=null] : iv_ruleFrequency= ruleFrequency EOF ;
    public final EObject entryRuleFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequency = null;


        try {
            // InternalIoTParser.g:1927:50: (iv_ruleFrequency= ruleFrequency EOF )
            // InternalIoTParser.g:1928:2: iv_ruleFrequency= ruleFrequency EOF
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
    // InternalIoTParser.g:1934:1: ruleFrequency returns [EObject current=null] : (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) ;
    public final EObject ruleFrequency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_frequency_1_0=null;
        EObject lv_resolution_2_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1940:2: ( (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) )
            // InternalIoTParser.g:1941:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            {
            // InternalIoTParser.g:1941:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            // InternalIoTParser.g:1942:3: otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) )
            {
            otherlv_0=(Token)match(input,Frequency,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getFrequencyAccess().getFrequencyKeyword_0());
            		
            // InternalIoTParser.g:1946:3: ( (lv_frequency_1_0= RULE_INT ) )
            // InternalIoTParser.g:1947:4: (lv_frequency_1_0= RULE_INT )
            {
            // InternalIoTParser.g:1947:4: (lv_frequency_1_0= RULE_INT )
            // InternalIoTParser.g:1948:5: lv_frequency_1_0= RULE_INT
            {
            lv_frequency_1_0=(Token)match(input,RULE_INT,FOLLOW_41); 

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

            // InternalIoTParser.g:1964:3: ( (lv_resolution_2_0= ruleResolution ) )
            // InternalIoTParser.g:1965:4: (lv_resolution_2_0= ruleResolution )
            {
            // InternalIoTParser.g:1965:4: (lv_resolution_2_0= ruleResolution )
            // InternalIoTParser.g:1966:5: lv_resolution_2_0= ruleResolution
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
    // InternalIoTParser.g:1987:1: entryRuleResolution returns [EObject current=null] : iv_ruleResolution= ruleResolution EOF ;
    public final EObject entryRuleResolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolution = null;


        try {
            // InternalIoTParser.g:1987:51: (iv_ruleResolution= ruleResolution EOF )
            // InternalIoTParser.g:1988:2: iv_ruleResolution= ruleResolution EOF
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
    // InternalIoTParser.g:1994:1: ruleResolution returns [EObject current=null] : ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) ;
    public final EObject ruleResolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:2000:2: ( ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) )
            // InternalIoTParser.g:2001:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            {
            // InternalIoTParser.g:2001:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case Seconds:
                {
                alt29=1;
                }
                break;
            case Milliseconds:
                {
                alt29=2;
                }
                break;
            case Microseconds:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalIoTParser.g:2002:3: ( () otherlv_1= Seconds )
                    {
                    // InternalIoTParser.g:2002:3: ( () otherlv_1= Seconds )
                    // InternalIoTParser.g:2003:4: () otherlv_1= Seconds
                    {
                    // InternalIoTParser.g:2003:4: ()
                    // InternalIoTParser.g:2004:5: 
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
                    // InternalIoTParser.g:2016:3: ( () otherlv_3= Milliseconds )
                    {
                    // InternalIoTParser.g:2016:3: ( () otherlv_3= Milliseconds )
                    // InternalIoTParser.g:2017:4: () otherlv_3= Milliseconds
                    {
                    // InternalIoTParser.g:2017:4: ()
                    // InternalIoTParser.g:2018:5: 
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
                    // InternalIoTParser.g:2030:3: ( () otherlv_5= Microseconds )
                    {
                    // InternalIoTParser.g:2030:3: ( () otherlv_5= Microseconds )
                    // InternalIoTParser.g:2031:4: () otherlv_5= Microseconds
                    {
                    // InternalIoTParser.g:2031:4: ()
                    // InternalIoTParser.g:2032:5: 
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
    // InternalIoTParser.g:2047:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalIoTParser.g:2047:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalIoTParser.g:2048:2: iv_ruleSensorOutput= ruleSensorOutput EOF
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
    // InternalIoTParser.g:2054:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* ) ;
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
            // InternalIoTParser.g:2060:2: ( (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalIoTParser.g:2061:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalIoTParser.g:2061:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* )
            // InternalIoTParser.g:2062:3: otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Pipe,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getPipeKeyword_0());
            		
            // InternalIoTParser.g:2066:3: ( (lv_output_1_0= ruleDataOutput ) )
            // InternalIoTParser.g:2067:4: (lv_output_1_0= ruleDataOutput )
            {
            // InternalIoTParser.g:2067:4: (lv_output_1_0= ruleDataOutput )
            // InternalIoTParser.g:2068:5: lv_output_1_0= ruleDataOutput
            {

            					newCompositeNode(grammarAccess.getSensorOutputAccess().getOutputDataOutputParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorOutputAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalIoTParser.g:2089:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoTParser.g:2090:4: (otherlv_3= RULE_ID )
            {
            // InternalIoTParser.g:2090:4: (otherlv_3= RULE_ID )
            // InternalIoTParser.g:2091:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorOutputRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(otherlv_3, grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_3_0());
            				

            }


            }

            // InternalIoTParser.g:2102:3: (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==And) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalIoTParser.g:2103:4: otherlv_4= And ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,And,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSensorOutputAccess().getAndKeyword_4_0());
            	    			
            	    // InternalIoTParser.g:2107:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalIoTParser.g:2108:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalIoTParser.g:2108:5: (otherlv_5= RULE_ID )
            	    // InternalIoTParser.g:2109:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensorOutputRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_42); 

            	    						newLeafNode(otherlv_5, grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalIoTParser.g:2125:1: entryRuleDataOutput returns [EObject current=null] : iv_ruleDataOutput= ruleDataOutput EOF ;
    public final EObject entryRuleDataOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOutput = null;


        try {
            // InternalIoTParser.g:2125:51: (iv_ruleDataOutput= ruleDataOutput EOF )
            // InternalIoTParser.g:2126:2: iv_ruleDataOutput= ruleDataOutput EOF
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
    // InternalIoTParser.g:2132:1: ruleDataOutput returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) ;
    public final EObject ruleDataOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pipeline_1_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2138:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:2139:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:2139:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            // InternalIoTParser.g:2140:3: ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )?
            {
            // InternalIoTParser.g:2140:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoTParser.g:2141:4: (otherlv_0= RULE_ID )
            {
            // InternalIoTParser.g:2141:4: (otherlv_0= RULE_ID )
            // InternalIoTParser.g:2142:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataOutputRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getDataOutputAccess().getSensorvarSensorVariablesCrossReference_0_0());
            				

            }


            }

            // InternalIoTParser.g:2153:3: ( (lv_pipeline_1_0= rulePipeline ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FullStop) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIoTParser.g:2154:4: (lv_pipeline_1_0= rulePipeline )
                    {
                    // InternalIoTParser.g:2154:4: (lv_pipeline_1_0= rulePipeline )
                    // InternalIoTParser.g:2155:5: lv_pipeline_1_0= rulePipeline
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
    // InternalIoTParser.g:2176:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalIoTParser.g:2176:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalIoTParser.g:2177:2: iv_rulePipeline= rulePipeline EOF
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
    // InternalIoTParser.g:2183:1: rulePipeline returns [EObject current=null] : (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? ) ;
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
            // InternalIoTParser.g:2189:2: ( (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:2190:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:2190:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? )
            // InternalIoTParser.g:2191:3: otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )?
            {
            otherlv_0=(Token)match(input,FullStop,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getFullStopKeyword_0());
            		
            // InternalIoTParser.g:2195:3: (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal )
            int alt32=4;
            switch ( input.LA(1) ) {
            case Filter:
            case Abs:
                {
                alt32=1;
                }
                break;
            case Map:
                {
                alt32=2;
                }
                break;
            case ByWindow:
                {
                alt32=3;
                }
                break;
            case RULE_ID:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalIoTParser.g:2196:4: this_TuplePipeline_1= ruleTuplePipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getTuplePipelineParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_TuplePipeline_1=ruleTuplePipeline();

                    state._fsp--;


                    				current = this_TuplePipeline_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:2205:4: this_MapPipeline_2= ruleMapPipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getMapPipelineParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_MapPipeline_2=ruleMapPipeline();

                    state._fsp--;


                    				current = this_MapPipeline_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:2214:4: this_WindowPipeline_3= ruleWindowPipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getWindowPipelineParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_10);
                    this_WindowPipeline_3=ruleWindowPipeline();

                    state._fsp--;


                    				current = this_WindowPipeline_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:2223:4: this_External_4= ruleExternal
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getExternalParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_10);
                    this_External_4=ruleExternal();

                    state._fsp--;


                    				current = this_External_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalIoTParser.g:2232:3: ( (lv_next_5_0= rulePipeline ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FullStop) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalIoTParser.g:2233:4: (lv_next_5_0= rulePipeline )
                    {
                    // InternalIoTParser.g:2233:4: (lv_next_5_0= rulePipeline )
                    // InternalIoTParser.g:2234:5: lv_next_5_0= rulePipeline
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
    // InternalIoTParser.g:2255:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalIoTParser.g:2255:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalIoTParser.g:2256:2: iv_ruleExternal= ruleExternal EOF
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
    // InternalIoTParser.g:2262:1: ruleExternal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket ) ;
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
            // InternalIoTParser.g:2268:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalIoTParser.g:2269:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalIoTParser.g:2269:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket )
            // InternalIoTParser.g:2270:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalIoTParser.g:2270:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoTParser.g:2271:4: (otherlv_0= RULE_ID )
            {
            // InternalIoTParser.g:2271:4: (otherlv_0= RULE_ID )
            // InternalIoTParser.g:2272:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getFunctionFunctionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalIoTParser.g:2287:3: ( (lv_input_2_0= ruleExpression ) )
            // InternalIoTParser.g:2288:4: (lv_input_2_0= ruleExpression )
            {
            // InternalIoTParser.g:2288:4: (lv_input_2_0= ruleExpression )
            // InternalIoTParser.g:2289:5: lv_input_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExternalAccess().getInputExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalIoTParser.g:2306:3: (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalIoTParser.g:2307:4: otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_45); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:2311:4: ( (lv_input_4_0= ruleExpression ) )
            	    // InternalIoTParser.g:2312:5: (lv_input_4_0= ruleExpression )
            	    {
            	    // InternalIoTParser.g:2312:5: (lv_input_4_0= ruleExpression )
            	    // InternalIoTParser.g:2313:6: lv_input_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternalAccess().getInputExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
            	    break loop34;
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
    // InternalIoTParser.g:2339:1: entryRuleTuplePipeline returns [EObject current=null] : iv_ruleTuplePipeline= ruleTuplePipeline EOF ;
    public final EObject entryRuleTuplePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePipeline = null;


        try {
            // InternalIoTParser.g:2339:54: (iv_ruleTuplePipeline= ruleTuplePipeline EOF )
            // InternalIoTParser.g:2340:2: iv_ruleTuplePipeline= ruleTuplePipeline EOF
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
    // InternalIoTParser.g:2346:1: ruleTuplePipeline returns [EObject current=null] : ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) ;
    public final EObject ruleTuplePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2352:2: ( ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:2353:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:2353:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:2354:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:2354:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Filter) ) {
                alt35=1;
            }
            else if ( (LA35_0==Abs) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalIoTParser.g:2355:4: ( () otherlv_1= Filter )
                    {
                    // InternalIoTParser.g:2355:4: ( () otherlv_1= Filter )
                    // InternalIoTParser.g:2356:5: () otherlv_1= Filter
                    {
                    // InternalIoTParser.g:2356:5: ()
                    // InternalIoTParser.g:2357:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTuplePipelineAccess().getFilterAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,Filter,FOLLOW_44); 

                    					newLeafNode(otherlv_1, grammarAccess.getTuplePipelineAccess().getFilterKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:2369:4: ( () otherlv_3= Abs )
                    {
                    // InternalIoTParser.g:2369:4: ( () otherlv_3= Abs )
                    // InternalIoTParser.g:2370:5: () otherlv_3= Abs
                    {
                    // InternalIoTParser.g:2370:5: ()
                    // InternalIoTParser.g:2371:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTuplePipelineAccess().getAbsAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_3=(Token)match(input,Abs,FOLLOW_44); 

                    					newLeafNode(otherlv_3, grammarAccess.getTuplePipelineAccess().getAbsKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getTuplePipelineAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalIoTParser.g:2387:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalIoTParser.g:2388:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalIoTParser.g:2388:4: (lv_expression_5_0= ruleExpression )
            // InternalIoTParser.g:2389:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTuplePipelineAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
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
    // InternalIoTParser.g:2414:1: entryRuleMapPipeline returns [EObject current=null] : iv_ruleMapPipeline= ruleMapPipeline EOF ;
    public final EObject entryRuleMapPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapPipeline = null;


        try {
            // InternalIoTParser.g:2414:52: (iv_ruleMapPipeline= ruleMapPipeline EOF )
            // InternalIoTParser.g:2415:2: iv_ruleMapPipeline= ruleMapPipeline EOF
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
    // InternalIoTParser.g:2421:1: ruleMapPipeline returns [EObject current=null] : ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) ;
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
            // InternalIoTParser.g:2427:2: ( ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:2428:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:2428:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:2429:3: () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:2429:3: ()
            // InternalIoTParser.g:2430:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapPipelineAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Map,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getMapPipelineAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getMapPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2444:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalIoTParser.g:2445:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalIoTParser.g:2445:4: (lv_expression_3_0= ruleExpression )
            // InternalIoTParser.g:2446:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getMapPipelineAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalIoTParser.g:2467:3: ( (lv_output_5_0= ruleVariable ) )
            // InternalIoTParser.g:2468:4: (lv_output_5_0= ruleVariable )
            {
            // InternalIoTParser.g:2468:4: (lv_output_5_0= ruleVariable )
            // InternalIoTParser.g:2469:5: lv_output_5_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getOutputVariableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_47);
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
    // InternalIoTParser.g:2494:1: entryRuleWindowPipeline returns [EObject current=null] : iv_ruleWindowPipeline= ruleWindowPipeline EOF ;
    public final EObject entryRuleWindowPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowPipeline = null;


        try {
            // InternalIoTParser.g:2494:55: (iv_ruleWindowPipeline= ruleWindowPipeline EOF )
            // InternalIoTParser.g:2495:2: iv_ruleWindowPipeline= ruleWindowPipeline EOF
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
    // InternalIoTParser.g:2501:1: ruleWindowPipeline returns [EObject current=null] : ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) ;
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
            // InternalIoTParser.g:2507:2: ( ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) )
            // InternalIoTParser.g:2508:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            {
            // InternalIoTParser.g:2508:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            // InternalIoTParser.g:2509:3: () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) )
            {
            // InternalIoTParser.g:2509:3: ()
            // InternalIoTParser.g:2510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWindowPipelineAccess().getWindowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ByWindow,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getWindowPipelineAccess().getByWindowKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getWindowPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2524:3: ( (lv_width_3_0= RULE_INT ) )
            // InternalIoTParser.g:2525:4: (lv_width_3_0= RULE_INT )
            {
            // InternalIoTParser.g:2525:4: (lv_width_3_0= RULE_INT )
            // InternalIoTParser.g:2526:5: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_47); 

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

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_48); 

            			newLeafNode(otherlv_4, grammarAccess.getWindowPipelineAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,FullStop,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getWindowPipelineAccess().getFullStopKeyword_5());
            		
            // InternalIoTParser.g:2550:3: ( (lv_execute_6_0= ruleExecutePipeline ) )
            // InternalIoTParser.g:2551:4: (lv_execute_6_0= ruleExecutePipeline )
            {
            // InternalIoTParser.g:2551:4: (lv_execute_6_0= ruleExecutePipeline )
            // InternalIoTParser.g:2552:5: lv_execute_6_0= ruleExecutePipeline
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
    // InternalIoTParser.g:2573:1: entryRuleExecutePipeline returns [EObject current=null] : iv_ruleExecutePipeline= ruleExecutePipeline EOF ;
    public final EObject entryRuleExecutePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutePipeline = null;


        try {
            // InternalIoTParser.g:2573:56: (iv_ruleExecutePipeline= ruleExecutePipeline EOF )
            // InternalIoTParser.g:2574:2: iv_ruleExecutePipeline= ruleExecutePipeline EOF
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
    // InternalIoTParser.g:2580:1: ruleExecutePipeline returns [EObject current=null] : ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) ) ;
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
            // InternalIoTParser.g:2586:2: ( ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) ) )
            // InternalIoTParser.g:2587:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) )
            {
            // InternalIoTParser.g:2587:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) )
            int alt36=8;
            switch ( input.LA(1) ) {
            case Reduce:
                {
                alt36=1;
                }
                break;
            case Mean:
                {
                alt36=2;
                }
                break;
            case Median:
                {
                alt36=3;
                }
                break;
            case Stdev:
                {
                alt36=4;
                }
                break;
            case Min:
                {
                alt36=5;
                }
                break;
            case Max:
                {
                alt36=6;
                }
                break;
            case Count:
                {
                alt36=7;
                }
                break;
            case Var:
                {
                alt36=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalIoTParser.g:2588:3: ( () otherlv_1= Reduce )
                    {
                    // InternalIoTParser.g:2588:3: ( () otherlv_1= Reduce )
                    // InternalIoTParser.g:2589:4: () otherlv_1= Reduce
                    {
                    // InternalIoTParser.g:2589:4: ()
                    // InternalIoTParser.g:2590:5: 
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
                    // InternalIoTParser.g:2602:3: ( () otherlv_3= Mean )
                    {
                    // InternalIoTParser.g:2602:3: ( () otherlv_3= Mean )
                    // InternalIoTParser.g:2603:4: () otherlv_3= Mean
                    {
                    // InternalIoTParser.g:2603:4: ()
                    // InternalIoTParser.g:2604:5: 
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
                    // InternalIoTParser.g:2616:3: ( () otherlv_5= Median )
                    {
                    // InternalIoTParser.g:2616:3: ( () otherlv_5= Median )
                    // InternalIoTParser.g:2617:4: () otherlv_5= Median
                    {
                    // InternalIoTParser.g:2617:4: ()
                    // InternalIoTParser.g:2618:5: 
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
                    // InternalIoTParser.g:2630:3: ( () otherlv_7= Stdev )
                    {
                    // InternalIoTParser.g:2630:3: ( () otherlv_7= Stdev )
                    // InternalIoTParser.g:2631:4: () otherlv_7= Stdev
                    {
                    // InternalIoTParser.g:2631:4: ()
                    // InternalIoTParser.g:2632:5: 
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
                    // InternalIoTParser.g:2644:3: ( () otherlv_9= Min )
                    {
                    // InternalIoTParser.g:2644:3: ( () otherlv_9= Min )
                    // InternalIoTParser.g:2645:4: () otherlv_9= Min
                    {
                    // InternalIoTParser.g:2645:4: ()
                    // InternalIoTParser.g:2646:5: 
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
                    // InternalIoTParser.g:2658:3: ( () otherlv_11= Max )
                    {
                    // InternalIoTParser.g:2658:3: ( () otherlv_11= Max )
                    // InternalIoTParser.g:2659:4: () otherlv_11= Max
                    {
                    // InternalIoTParser.g:2659:4: ()
                    // InternalIoTParser.g:2660:5: 
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
                    // InternalIoTParser.g:2672:3: ( () otherlv_13= Count )
                    {
                    // InternalIoTParser.g:2672:3: ( () otherlv_13= Count )
                    // InternalIoTParser.g:2673:4: () otherlv_13= Count
                    {
                    // InternalIoTParser.g:2673:4: ()
                    // InternalIoTParser.g:2674:5: 
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
                    // InternalIoTParser.g:2686:3: ( () otherlv_15= Var )
                    {
                    // InternalIoTParser.g:2686:3: ( () otherlv_15= Var )
                    // InternalIoTParser.g:2687:4: () otherlv_15= Var
                    {
                    // InternalIoTParser.g:2687:4: ()
                    // InternalIoTParser.g:2688:5: 
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
    // InternalIoTParser.g:2703:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalIoTParser.g:2703:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalIoTParser.g:2704:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalIoTParser.g:2710:1: ruleExpression returns [EObject current=null] : this_Conditional_0= ruleConditional ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Conditional_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2716:2: (this_Conditional_0= ruleConditional )
            // InternalIoTParser.g:2717:2: this_Conditional_0= ruleConditional
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
    // InternalIoTParser.g:2728:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalIoTParser.g:2728:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalIoTParser.g:2729:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalIoTParser.g:2735:1: ruleConditional returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Or_0 = null;

        EObject lv_correct_3_0 = null;

        EObject lv_incorrect_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2741:2: ( (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) )
            // InternalIoTParser.g:2742:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            {
            // InternalIoTParser.g:2742:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            // InternalIoTParser.g:2743:3: this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            {

            			newCompositeNode(grammarAccess.getConditionalAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2751:3: ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==QuestionMark) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalIoTParser.g:2752:4: () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) )
                    {
                    // InternalIoTParser.g:2752:4: ()
                    // InternalIoTParser.g:2753:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getConditionalAccess().getConditionalConditionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,QuestionMark,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getQuestionMarkKeyword_1_1());
                    			
                    // InternalIoTParser.g:2763:4: ( (lv_correct_3_0= ruleConditional ) )
                    // InternalIoTParser.g:2764:5: (lv_correct_3_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2764:5: (lv_correct_3_0= ruleConditional )
                    // InternalIoTParser.g:2765:6: lv_correct_3_0= ruleConditional
                    {

                    						newCompositeNode(grammarAccess.getConditionalAccess().getCorrectConditionalParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_4=(Token)match(input,Colon,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getColonKeyword_1_3());
                    			
                    // InternalIoTParser.g:2786:4: ( (lv_incorrect_5_0= ruleConditional ) )
                    // InternalIoTParser.g:2787:5: (lv_incorrect_5_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2787:5: (lv_incorrect_5_0= ruleConditional )
                    // InternalIoTParser.g:2788:6: lv_incorrect_5_0= ruleConditional
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
    // InternalIoTParser.g:2810:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalIoTParser.g:2810:43: (iv_ruleOr= ruleOr EOF )
            // InternalIoTParser.g:2811:2: iv_ruleOr= ruleOr EOF
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
    // InternalIoTParser.g:2817:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2823:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) )
            // InternalIoTParser.g:2824:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            {
            // InternalIoTParser.g:2824:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            // InternalIoTParser.g:2825:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2833:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==VerticalLineVerticalLine) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIoTParser.g:2834:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) )
                    {
                    // InternalIoTParser.g:2834:4: ()
                    // InternalIoTParser.g:2835:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
                    			
                    // InternalIoTParser.g:2845:4: ( (lv_right_3_0= ruleOr ) )
                    // InternalIoTParser.g:2846:5: (lv_right_3_0= ruleOr )
                    {
                    // InternalIoTParser.g:2846:5: (lv_right_3_0= ruleOr )
                    // InternalIoTParser.g:2847:6: lv_right_3_0= ruleOr
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
    // InternalIoTParser.g:2869:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalIoTParser.g:2869:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalIoTParser.g:2870:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalIoTParser.g:2876:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2882:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) )
            // InternalIoTParser.g:2883:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            {
            // InternalIoTParser.g:2883:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            // InternalIoTParser.g:2884:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2892:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==AmpersandAmpersand) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalIoTParser.g:2893:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) )
                    {
                    // InternalIoTParser.g:2893:4: ()
                    // InternalIoTParser.g:2894:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalIoTParser.g:2904:4: ( (lv_right_3_0= ruleAnd ) )
                    // InternalIoTParser.g:2905:5: (lv_right_3_0= ruleAnd )
                    {
                    // InternalIoTParser.g:2905:5: (lv_right_3_0= ruleAnd )
                    // InternalIoTParser.g:2906:6: lv_right_3_0= ruleAnd
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
    // InternalIoTParser.g:2928:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalIoTParser.g:2928:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalIoTParser.g:2929:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalIoTParser.g:2935:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2941:2: ( (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) )
            // InternalIoTParser.g:2942:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            {
            // InternalIoTParser.g:2942:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            // InternalIoTParser.g:2943:3: this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2951:3: ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==EqualsSignEqualsSign) ) {
                    alt40=1;
                }
                else if ( (LA40_0==ExclamationMarkEqualsSign) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalIoTParser.g:2952:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2952:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2953:5: () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2953:5: ()
            	    // InternalIoTParser.g:2954:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_45); 

            	    					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2964:5: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalIoTParser.g:2965:6: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:2965:6: (lv_right_3_0= ruleComparison )
            	    // InternalIoTParser.g:2966:7: lv_right_3_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
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
            	    // InternalIoTParser.g:2985:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2985:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2986:5: () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2986:5: ()
            	    // InternalIoTParser.g:2987:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_45); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2997:5: ( (lv_right_6_0= ruleComparison ) )
            	    // InternalIoTParser.g:2998:6: (lv_right_6_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:2998:6: (lv_right_6_0= ruleComparison )
            	    // InternalIoTParser.g:2999:7: lv_right_6_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalIoTParser.g:3022:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalIoTParser.g:3022:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalIoTParser.g:3023:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalIoTParser.g:3029:1: ruleComparison returns [EObject current=null] : (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) ;
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
            // InternalIoTParser.g:3035:2: ( (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) )
            // InternalIoTParser.g:3036:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            {
            // InternalIoTParser.g:3036:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            // InternalIoTParser.g:3037:3: this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getSubAddParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
            this_SubAdd_0=ruleSubAdd();

            state._fsp--;


            			current = this_SubAdd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3045:3: ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            loop41:
            do {
                int alt41=5;
                switch ( input.LA(1) ) {
                case LessThanSign:
                    {
                    alt41=1;
                    }
                    break;
                case LessThanSignEqualsSign:
                    {
                    alt41=2;
                    }
                    break;
                case GreaterThanSign:
                    {
                    alt41=3;
                    }
                    break;
                case GreaterThanSignEqualsSign:
                    {
                    alt41=4;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // InternalIoTParser.g:3046:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3046:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3047:5: () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3047:5: ()
            	    // InternalIoTParser.g:3048:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,LessThanSign,FOLLOW_45); 

            	    					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3058:5: ( (lv_right_3_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3059:6: (lv_right_3_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3059:6: (lv_right_3_0= ruleSubAdd )
            	    // InternalIoTParser.g:3060:7: lv_right_3_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
            	    // InternalIoTParser.g:3079:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3079:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3080:5: () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3080:5: ()
            	    // InternalIoTParser.g:3081:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,LessThanSignEqualsSign,FOLLOW_45); 

            	    					newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3091:5: ( (lv_right_6_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3092:6: (lv_right_6_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3092:6: (lv_right_6_0= ruleSubAdd )
            	    // InternalIoTParser.g:3093:7: lv_right_6_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
            	    // InternalIoTParser.g:3112:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3112:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3113:5: () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3113:5: ()
            	    // InternalIoTParser.g:3114:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,GreaterThanSign,FOLLOW_45); 

            	    					newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_2_1());
            	    				
            	    // InternalIoTParser.g:3124:5: ( (lv_right_9_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3125:6: (lv_right_9_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3125:6: (lv_right_9_0= ruleSubAdd )
            	    // InternalIoTParser.g:3126:7: lv_right_9_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
            	    // InternalIoTParser.g:3145:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3145:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3146:5: () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3146:5: ()
            	    // InternalIoTParser.g:3147:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_45); 

            	    					newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalIoTParser.g:3157:5: ( (lv_right_12_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3158:6: (lv_right_12_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3158:6: (lv_right_12_0= ruleSubAdd )
            	    // InternalIoTParser.g:3159:7: lv_right_12_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleSubAdd"
    // InternalIoTParser.g:3182:1: entryRuleSubAdd returns [EObject current=null] : iv_ruleSubAdd= ruleSubAdd EOF ;
    public final EObject entryRuleSubAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAdd = null;


        try {
            // InternalIoTParser.g:3182:47: (iv_ruleSubAdd= ruleSubAdd EOF )
            // InternalIoTParser.g:3183:2: iv_ruleSubAdd= ruleSubAdd EOF
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
    // InternalIoTParser.g:3189:1: ruleSubAdd returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) ;
    public final EObject ruleSubAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3195:2: ( (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) )
            // InternalIoTParser.g:3196:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            {
            // InternalIoTParser.g:3196:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            // InternalIoTParser.g:3197:3: this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubAddAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3205:3: ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==PlusSign) ) {
                    alt42=1;
                }
                else if ( (LA42_0==HyphenMinus) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalIoTParser.g:3206:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:3206:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:3207:5: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:3207:5: ()
            	    // InternalIoTParser.g:3208:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_45); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSubAddAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3218:5: ( (lv_right_3_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:3219:6: (lv_right_3_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:3219:6: (lv_right_3_0= ruleMulDiv )
            	    // InternalIoTParser.g:3220:7: lv_right_3_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_55);
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
            	    // InternalIoTParser.g:3239:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:3239:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:3240:5: () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:3240:5: ()
            	    // InternalIoTParser.g:3241:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,HyphenMinus,FOLLOW_45); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSubAddAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3251:5: ( (lv_right_6_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:3252:6: (lv_right_6_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:3252:6: (lv_right_6_0= ruleMulDiv )
            	    // InternalIoTParser.g:3253:7: lv_right_6_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_55);
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
            	    break loop42;
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
    // InternalIoTParser.g:3276:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalIoTParser.g:3276:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalIoTParser.g:3277:2: iv_ruleMulDiv= ruleMulDiv EOF
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
    // InternalIoTParser.g:3283:1: ruleMulDiv returns [EObject current=null] : (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3289:2: ( (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) )
            // InternalIoTParser.g:3290:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            {
            // InternalIoTParser.g:3290:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            // InternalIoTParser.g:3291:3: this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_56);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3299:3: ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            loop43:
            do {
                int alt43=3;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==Asterisk) ) {
                    alt43=1;
                }
                else if ( (LA43_0==Solidus) ) {
                    alt43=2;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalIoTParser.g:3300:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:3300:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:3301:5: () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:3301:5: ()
            	    // InternalIoTParser.g:3302:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_45); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3312:5: ( (lv_right_3_0= ruleNegation ) )
            	    // InternalIoTParser.g:3313:6: (lv_right_3_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:3313:6: (lv_right_3_0= ruleNegation )
            	    // InternalIoTParser.g:3314:7: lv_right_3_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_56);
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
            	    // InternalIoTParser.g:3333:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:3333:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:3334:5: () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:3334:5: ()
            	    // InternalIoTParser.g:3335:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,Solidus,FOLLOW_45); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMulDivAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3345:5: ( (lv_right_6_0= ruleNegation ) )
            	    // InternalIoTParser.g:3346:6: (lv_right_6_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:3346:6: (lv_right_6_0= ruleNegation )
            	    // InternalIoTParser.g:3347:7: lv_right_6_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_56);
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
            	    break loop43;
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
    // InternalIoTParser.g:3370:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalIoTParser.g:3370:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalIoTParser.g:3371:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalIoTParser.g:3377:1: ruleNegation returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Exponent_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3383:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) )
            // InternalIoTParser.g:3384:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            {
            // InternalIoTParser.g:3384:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==HyphenMinus) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=ExclamationMark && LA44_0<=LeftParenthesis)||(LA44_0>=RULE_INT && LA44_0<=RULE_BOOLEAN)||(LA44_0>=RULE_ID && LA44_0<=RULE_STRING)) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalIoTParser.g:3385:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    {
                    // InternalIoTParser.g:3385:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    // InternalIoTParser.g:3386:4: () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) )
                    {
                    // InternalIoTParser.g:3386:4: ()
                    // InternalIoTParser.g:3387:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_45); 

                    				newLeafNode(otherlv_1, grammarAccess.getNegationAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalIoTParser.g:3397:4: ( (lv_value_2_0= ruleExponent ) )
                    // InternalIoTParser.g:3398:5: (lv_value_2_0= ruleExponent )
                    {
                    // InternalIoTParser.g:3398:5: (lv_value_2_0= ruleExponent )
                    // InternalIoTParser.g:3399:6: lv_value_2_0= ruleExponent
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
                    // InternalIoTParser.g:3418:3: this_Exponent_3= ruleExponent
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
    // InternalIoTParser.g:3430:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalIoTParser.g:3430:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalIoTParser.g:3431:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalIoTParser.g:3437:1: ruleExponent returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_power_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3443:2: ( (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) )
            // InternalIoTParser.g:3444:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            {
            // InternalIoTParser.g:3444:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            // InternalIoTParser.g:3445:3: this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            {

            			newCompositeNode(grammarAccess.getExponentAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_57);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3453:3: ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AsteriskAsterisk) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalIoTParser.g:3454:4: () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) )
                    {
                    // InternalIoTParser.g:3454:4: ()
                    // InternalIoTParser.g:3455:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExponentAccess().getExponentBaseAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AsteriskAsterisk,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
                    			
                    // InternalIoTParser.g:3465:4: ( (lv_power_3_0= ruleNegation ) )
                    // InternalIoTParser.g:3466:5: (lv_power_3_0= ruleNegation )
                    {
                    // InternalIoTParser.g:3466:5: (lv_power_3_0= ruleNegation )
                    // InternalIoTParser.g:3467:6: lv_power_3_0= ruleNegation
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
    // InternalIoTParser.g:3489:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalIoTParser.g:3489:44: (iv_ruleNot= ruleNot EOF )
            // InternalIoTParser.g:3490:2: iv_ruleNot= ruleNot EOF
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
    // InternalIoTParser.g:3496:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Primary_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3502:2: ( ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) )
            // InternalIoTParser.g:3503:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            {
            // InternalIoTParser.g:3503:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ExclamationMark) ) {
                alt46=1;
            }
            else if ( (LA46_0==LeftParenthesis||(LA46_0>=RULE_INT && LA46_0<=RULE_BOOLEAN)||(LA46_0>=RULE_ID && LA46_0<=RULE_STRING)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalIoTParser.g:3504:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    {
                    // InternalIoTParser.g:3504:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    // InternalIoTParser.g:3505:4: () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) )
                    {
                    // InternalIoTParser.g:3505:4: ()
                    // InternalIoTParser.g:3506:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_45); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_1());
                    			
                    // InternalIoTParser.g:3516:4: ( (lv_value_2_0= rulePrimary ) )
                    // InternalIoTParser.g:3517:5: (lv_value_2_0= rulePrimary )
                    {
                    // InternalIoTParser.g:3517:5: (lv_value_2_0= rulePrimary )
                    // InternalIoTParser.g:3518:6: lv_value_2_0= rulePrimary
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
                    // InternalIoTParser.g:3537:3: this_Primary_3= rulePrimary
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
    // InternalIoTParser.g:3549:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalIoTParser.g:3549:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalIoTParser.g:3550:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalIoTParser.g:3556:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) ;
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
            // InternalIoTParser.g:3562:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) )
            // InternalIoTParser.g:3563:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            {
            // InternalIoTParser.g:3563:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            int alt47=5;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt47=1;
                }
                break;
            case RULE_ID:
                {
                alt47=2;
                }
                break;
            case RULE_INT:
            case RULE_NINT:
            case RULE_DBL:
            case RULE_NDBL:
                {
                alt47=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt47=4;
                }
                break;
            case RULE_STRING:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalIoTParser.g:3564:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalIoTParser.g:3564:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalIoTParser.g:3565:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_45); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_58);
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
                    // InternalIoTParser.g:3583:3: this_Reference_3= ruleReference
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
                    // InternalIoTParser.g:3592:3: this_NumberLiteral_4= ruleNumberLiteral
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
                    // InternalIoTParser.g:3601:3: this_BooleanLiteral_5= ruleBooleanLiteral
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
                    // InternalIoTParser.g:3610:3: this_StringLiteral_6= ruleStringLiteral
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
    // InternalIoTParser.g:3622:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalIoTParser.g:3622:50: (iv_ruleReference= ruleReference EOF )
            // InternalIoTParser.g:3623:2: iv_ruleReference= ruleReference EOF
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
    // InternalIoTParser.g:3629:1: ruleReference returns [EObject current=null] : ( (lv_ref_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3635:2: ( ( (lv_ref_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:3636:2: ( (lv_ref_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:3636:2: ( (lv_ref_0_0= RULE_ID ) )
            // InternalIoTParser.g:3637:3: (lv_ref_0_0= RULE_ID )
            {
            // InternalIoTParser.g:3637:3: (lv_ref_0_0= RULE_ID )
            // InternalIoTParser.g:3638:4: lv_ref_0_0= RULE_ID
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
    // InternalIoTParser.g:3657:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalIoTParser.g:3657:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalIoTParser.g:3658:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalIoTParser.g:3664:1: ruleStringLiteral returns [EObject current=null] : ( (lv_str_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3670:2: ( ( (lv_str_0_0= RULE_STRING ) ) )
            // InternalIoTParser.g:3671:2: ( (lv_str_0_0= RULE_STRING ) )
            {
            // InternalIoTParser.g:3671:2: ( (lv_str_0_0= RULE_STRING ) )
            // InternalIoTParser.g:3672:3: (lv_str_0_0= RULE_STRING )
            {
            // InternalIoTParser.g:3672:3: (lv_str_0_0= RULE_STRING )
            // InternalIoTParser.g:3673:4: lv_str_0_0= RULE_STRING
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
    // InternalIoTParser.g:3692:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalIoTParser.g:3692:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalIoTParser.g:3693:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalIoTParser.g:3699:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_numb_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numb_0_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3705:2: ( ( (lv_numb_0_0= ruleNUMBER ) ) )
            // InternalIoTParser.g:3706:2: ( (lv_numb_0_0= ruleNUMBER ) )
            {
            // InternalIoTParser.g:3706:2: ( (lv_numb_0_0= ruleNUMBER ) )
            // InternalIoTParser.g:3707:3: (lv_numb_0_0= ruleNUMBER )
            {
            // InternalIoTParser.g:3707:3: (lv_numb_0_0= ruleNUMBER )
            // InternalIoTParser.g:3708:4: lv_numb_0_0= ruleNUMBER
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
    // InternalIoTParser.g:3728:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalIoTParser.g:3728:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalIoTParser.g:3729:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalIoTParser.g:3735:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_bool_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bool_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3741:2: ( ( (lv_bool_0_0= RULE_BOOLEAN ) ) )
            // InternalIoTParser.g:3742:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            {
            // InternalIoTParser.g:3742:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            // InternalIoTParser.g:3743:3: (lv_bool_0_0= RULE_BOOLEAN )
            {
            // InternalIoTParser.g:3743:3: (lv_bool_0_0= RULE_BOOLEAN )
            // InternalIoTParser.g:3744:4: lv_bool_0_0= RULE_BOOLEAN
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
    // InternalIoTParser.g:3763:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3765:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalIoTParser.g:3766:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalIoTParser.g:3775:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DBL_1=null;
        Token this_NINT_2=null;
        Token this_NDBL_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3782:2: ( (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL ) )
            // InternalIoTParser.g:3783:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL )
            {
            // InternalIoTParser.g:3783:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL )
            int alt48=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt48=1;
                }
                break;
            case RULE_DBL:
                {
                alt48=2;
                }
                break;
            case RULE_NINT:
                {
                alt48=3;
                }
                break;
            case RULE_NDBL:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalIoTParser.g:3784:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:3792:3: this_DBL_1= RULE_DBL
                    {
                    this_DBL_1=(Token)match(input,RULE_DBL,FOLLOW_2); 

                    			current.merge(this_DBL_1);
                    		

                    			newLeafNode(this_DBL_1, grammarAccess.getNUMBERAccess().getDBLTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:3800:3: this_NINT_2= RULE_NINT
                    {
                    this_NINT_2=(Token)match(input,RULE_NINT,FOLLOW_2); 

                    			current.merge(this_NINT_2);
                    		

                    			newLeafNode(this_NINT_2, grammarAccess.getNUMBERAccess().getNINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:3808:3: this_NDBL_3= RULE_NDBL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000202682L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000200682L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200682L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200282L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080008008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000100000L,0x0000000000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200100080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200100080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000014000010100L,0x0000000000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4300000000000000L,0x0000000000067C00L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000160042460000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008400000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0014000000000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x5000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000000000000L});

}