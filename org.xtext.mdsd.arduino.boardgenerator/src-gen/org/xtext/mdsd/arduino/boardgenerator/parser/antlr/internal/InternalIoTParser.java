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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Microseconds", "Milliseconds", "Frequency", "Abstract", "ByWindow", "Function", "Channel", "Command", "Extends", "Include", "Seconds", "Broker", "Filter", "Median", "Reduce", "Sample", "Sensor", "Board", "Count", "Model", "Route", "Stdev", "Topic", "Baud", "Byte", "Char", "Mean", "Pass", "Pipe", "Port", "Ssid", "Stop", "Type", "Wifi", "Abs", "And", "Map", "Max", "Min", "Var", "Vcc", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "As", "Id", "Ip", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_NINT", "RULE_DBL", "RULE_NDBL", "RULE_BOOLEAN", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_NINT=75;
    public static final int RULE_BEGIN=72;
    public static final int Stop=35;
    public static final int Var=43;
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
    public static final int GreaterThanSignEqualsSign=51;
    public static final int Baud=27;
    public static final int EqualsSignEqualsSign=50;
    public static final int Stdev=25;
    public static final int Min=42;
    public static final int And=39;
    public static final int PlusSign=60;
    public static final int RULE_INT=74;
    public static final int Byte=28;
    public static final int Vcc=44;
    public static final int AsteriskAsterisk=47;
    public static final int RULE_ML_COMMENT=80;
    public static final int LeftSquareBracket=70;
    public static final int Id=53;
    public static final int Ssid=34;
    public static final int Map=40;
    public static final int Sensor=20;
    public static final int Mean=30;
    public static final int RULE_END=73;
    public static final int Max=41;
    public static final int RULE_NDBL=77;
    public static final int VerticalLineVerticalLine=55;
    public static final int Ip=54;
    public static final int RULE_STRING=82;
    public static final int RULE_SL_COMMENT=79;
    public static final int Function=9;
    public static final int Comma=61;
    public static final int EqualsSign=67;
    public static final int As=52;
    public static final int HyphenMinus=62;
    public static final int Abs=38;
    public static final int AmpersandAmpersand=46;
    public static final int Char=29;
    public static final int LessThanSignEqualsSign=49;
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
    public static final int ExclamationMarkEqualsSign=45;
    public static final int HyphenMinusGreaterThanSign=48;

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

                if ( (LA3_0==Channel||LA3_0==RULE_ID) ) {
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
    // InternalIoTParser.g:361:1: ruleChannel returns [EObject current=null] : ( ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_ctype_0_0 = null;

        EObject lv_config_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:367:2: ( ( ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? ) )
            // InternalIoTParser.g:368:2: ( ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? )
            {
            // InternalIoTParser.g:368:2: ( ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? )
            // InternalIoTParser.g:369:3: ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )?
            {
            // InternalIoTParser.g:369:3: ( (lv_ctype_0_0= ruleChannelType ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoTParser.g:370:4: (lv_ctype_0_0= ruleChannelType )
                    {
                    // InternalIoTParser.g:370:4: (lv_ctype_0_0= ruleChannelType )
                    // InternalIoTParser.g:371:5: lv_ctype_0_0= ruleChannelType
                    {

                    					newCompositeNode(grammarAccess.getChannelAccess().getCtypeChannelTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_ctype_0_0=ruleChannelType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChannelRule());
                    					}
                    					set(
                    						current,
                    						"ctype",
                    						lv_ctype_0_0,
                    						"org.xtext.mdsd.arduino.boardgenerator.IoT.ChannelType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Channel,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getChannelAccess().getChannelKeyword_1());
            		
            // InternalIoTParser.g:392:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoTParser.g:393:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoTParser.g:393:4: (lv_name_2_0= RULE_ID )
            // InternalIoTParser.g:394:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalIoTParser.g:410:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Colon) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoTParser.g:411:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_19); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getChannelAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:419:4: ( (lv_config_5_0= ruleChannelConfig ) )
                    // InternalIoTParser.g:420:5: (lv_config_5_0= ruleChannelConfig )
                    {
                    // InternalIoTParser.g:420:5: (lv_config_5_0= ruleChannelConfig )
                    // InternalIoTParser.g:421:6: lv_config_5_0= ruleChannelConfig
                    {

                    						newCompositeNode(grammarAccess.getChannelAccess().getConfigChannelConfigParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_16);
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
    // InternalIoTParser.g:447:1: entryRuleChannelType returns [EObject current=null] : iv_ruleChannelType= ruleChannelType EOF ;
    public final EObject entryRuleChannelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelType = null;


        try {
            // InternalIoTParser.g:447:52: (iv_ruleChannelType= ruleChannelType EOF )
            // InternalIoTParser.g:448:2: iv_ruleChannelType= ruleChannelType EOF
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
    // InternalIoTParser.g:454:1: ruleChannelType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleChannelType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:460:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:461:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:461:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:462:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:462:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:463:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getChannelTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getChannelTypeRule());
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
    // $ANTLR end "ruleChannelType"


    // $ANTLR start "entryRuleChannelConfig"
    // InternalIoTParser.g:482:1: entryRuleChannelConfig returns [EObject current=null] : iv_ruleChannelConfig= ruleChannelConfig EOF ;
    public final EObject entryRuleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelConfig = null;


        try {
            // InternalIoTParser.g:482:54: (iv_ruleChannelConfig= ruleChannelConfig EOF )
            // InternalIoTParser.g:483:2: iv_ruleChannelConfig= ruleChannelConfig EOF
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
    // InternalIoTParser.g:489:1: ruleChannelConfig returns [EObject current=null] : (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) ;
    public final EObject ruleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject this_Wifi_0 = null;

        EObject this_Serial_1 = null;

        EObject this_MqttClient_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:495:2: ( (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) )
            // InternalIoTParser.g:496:2: (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            {
            // InternalIoTParser.g:496:2: (this_Wifi_0= ruleWifi | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            int alt11=3;
            switch ( input.LA(1) ) {
            case Ip:
                {
                alt11=1;
                }
                break;
            case Baud:
                {
                alt11=2;
                }
                break;
            case Broker:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalIoTParser.g:497:3: this_Wifi_0= ruleWifi
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
                    // InternalIoTParser.g:506:3: this_Serial_1= ruleSerial
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
                    // InternalIoTParser.g:515:3: this_MqttClient_2= ruleMqttClient
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
    // InternalIoTParser.g:527:1: entryRuleWifi returns [EObject current=null] : iv_ruleWifi= ruleWifi EOF ;
    public final EObject entryRuleWifi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWifi = null;


        try {
            // InternalIoTParser.g:527:45: (iv_ruleWifi= ruleWifi EOF )
            // InternalIoTParser.g:528:2: iv_ruleWifi= ruleWifi EOF
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
    // InternalIoTParser.g:534:1: ruleWifi returns [EObject current=null] : (otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleWifi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_sport_3_0=null;
        Token otherlv_4=null;
        Token lv_route_5_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:540:2: ( (otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:541:2: (otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:541:2: (otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) ) )
            // InternalIoTParser.g:542:3: otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Ip,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWifiAccess().getIpKeyword_0());
            		
            // InternalIoTParser.g:546:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalIoTParser.g:547:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:547:4: (lv_url_1_0= RULE_STRING )
            // InternalIoTParser.g:548:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            otherlv_2=(Token)match(input,Port,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getWifiAccess().getPortKeyword_2());
            		
            // InternalIoTParser.g:568:3: ( (lv_sport_3_0= RULE_INT ) )
            // InternalIoTParser.g:569:4: (lv_sport_3_0= RULE_INT )
            {
            // InternalIoTParser.g:569:4: (lv_sport_3_0= RULE_INT )
            // InternalIoTParser.g:570:5: lv_sport_3_0= RULE_INT
            {
            lv_sport_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_sport_3_0, grammarAccess.getWifiAccess().getSportINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sport",
            						lv_sport_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,Route,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getWifiAccess().getRouteKeyword_4());
            		
            // InternalIoTParser.g:590:3: ( (lv_route_5_0= RULE_STRING ) )
            // InternalIoTParser.g:591:4: (lv_route_5_0= RULE_STRING )
            {
            // InternalIoTParser.g:591:4: (lv_route_5_0= RULE_STRING )
            // InternalIoTParser.g:592:5: lv_route_5_0= RULE_STRING
            {
            lv_route_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_route_5_0, grammarAccess.getWifiAccess().getRouteSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"route",
            						lv_route_5_0,
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
    // InternalIoTParser.g:612:1: entryRuleSerial returns [EObject current=null] : iv_ruleSerial= ruleSerial EOF ;
    public final EObject entryRuleSerial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerial = null;


        try {
            // InternalIoTParser.g:612:47: (iv_ruleSerial= ruleSerial EOF )
            // InternalIoTParser.g:613:2: iv_ruleSerial= ruleSerial EOF
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
    // InternalIoTParser.g:619:1: ruleSerial returns [EObject current=null] : (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stopType_3_0= ruleStopIdentifyer ) ) ) ;
    public final EObject ruleSerial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_baud_1_0=null;
        Token otherlv_2=null;
        EObject lv_stopType_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:625:2: ( (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stopType_3_0= ruleStopIdentifyer ) ) ) )
            // InternalIoTParser.g:626:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stopType_3_0= ruleStopIdentifyer ) ) )
            {
            // InternalIoTParser.g:626:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stopType_3_0= ruleStopIdentifyer ) ) )
            // InternalIoTParser.g:627:3: otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) otherlv_2= Stop ( (lv_stopType_3_0= ruleStopIdentifyer ) )
            {
            otherlv_0=(Token)match(input,Baud,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSerialAccess().getBaudKeyword_0());
            		
            // InternalIoTParser.g:631:3: ( (lv_baud_1_0= RULE_INT ) )
            // InternalIoTParser.g:632:4: (lv_baud_1_0= RULE_INT )
            {
            // InternalIoTParser.g:632:4: (lv_baud_1_0= RULE_INT )
            // InternalIoTParser.g:633:5: lv_baud_1_0= RULE_INT
            {
            lv_baud_1_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,Stop,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSerialAccess().getStopKeyword_2());
            		
            // InternalIoTParser.g:653:3: ( (lv_stopType_3_0= ruleStopIdentifyer ) )
            // InternalIoTParser.g:654:4: (lv_stopType_3_0= ruleStopIdentifyer )
            {
            // InternalIoTParser.g:654:4: (lv_stopType_3_0= ruleStopIdentifyer )
            // InternalIoTParser.g:655:5: lv_stopType_3_0= ruleStopIdentifyer
            {

            					newCompositeNode(grammarAccess.getSerialAccess().getStopTypeStopIdentifyerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_stopType_3_0=ruleStopIdentifyer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSerialRule());
            					}
            					set(
            						current,
            						"stopType",
            						lv_stopType_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.StopIdentifyer");
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


    // $ANTLR start "entryRuleStopIdentifyer"
    // InternalIoTParser.g:676:1: entryRuleStopIdentifyer returns [EObject current=null] : iv_ruleStopIdentifyer= ruleStopIdentifyer EOF ;
    public final EObject entryRuleStopIdentifyer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopIdentifyer = null;


        try {
            // InternalIoTParser.g:676:55: (iv_ruleStopIdentifyer= ruleStopIdentifyer EOF )
            // InternalIoTParser.g:677:2: iv_ruleStopIdentifyer= ruleStopIdentifyer EOF
            {
             newCompositeNode(grammarAccess.getStopIdentifyerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStopIdentifyer=ruleStopIdentifyer();

            state._fsp--;

             current =iv_ruleStopIdentifyer; 
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
    // $ANTLR end "entryRuleStopIdentifyer"


    // $ANTLR start "ruleStopIdentifyer"
    // InternalIoTParser.g:683:1: ruleStopIdentifyer returns [EObject current=null] : (this_StopChar_0= ruleStopChar | this_StopByte_1= ruleStopByte ) ;
    public final EObject ruleStopIdentifyer() throws RecognitionException {
        EObject current = null;

        EObject this_StopChar_0 = null;

        EObject this_StopByte_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:689:2: ( (this_StopChar_0= ruleStopChar | this_StopByte_1= ruleStopByte ) )
            // InternalIoTParser.g:690:2: (this_StopChar_0= ruleStopChar | this_StopByte_1= ruleStopByte )
            {
            // InternalIoTParser.g:690:2: (this_StopChar_0= ruleStopChar | this_StopByte_1= ruleStopByte )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Char) ) {
                alt12=1;
            }
            else if ( (LA12_0==Byte) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoTParser.g:691:3: this_StopChar_0= ruleStopChar
                    {

                    			newCompositeNode(grammarAccess.getStopIdentifyerAccess().getStopCharParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StopChar_0=ruleStopChar();

                    state._fsp--;


                    			current = this_StopChar_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:700:3: this_StopByte_1= ruleStopByte
                    {

                    			newCompositeNode(grammarAccess.getStopIdentifyerAccess().getStopByteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StopByte_1=ruleStopByte();

                    state._fsp--;


                    			current = this_StopByte_1;
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
    // $ANTLR end "ruleStopIdentifyer"


    // $ANTLR start "entryRuleStopChar"
    // InternalIoTParser.g:712:1: entryRuleStopChar returns [EObject current=null] : iv_ruleStopChar= ruleStopChar EOF ;
    public final EObject entryRuleStopChar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopChar = null;


        try {
            // InternalIoTParser.g:712:49: (iv_ruleStopChar= ruleStopChar EOF )
            // InternalIoTParser.g:713:2: iv_ruleStopChar= ruleStopChar EOF
            {
             newCompositeNode(grammarAccess.getStopCharRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStopChar=ruleStopChar();

            state._fsp--;

             current =iv_ruleStopChar; 
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
    // $ANTLR end "entryRuleStopChar"


    // $ANTLR start "ruleStopChar"
    // InternalIoTParser.g:719:1: ruleStopChar returns [EObject current=null] : (otherlv_0= Char ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStopChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:725:2: ( (otherlv_0= Char ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:726:2: (otherlv_0= Char ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:726:2: (otherlv_0= Char ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalIoTParser.g:727:3: otherlv_0= Char ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Char,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getStopCharAccess().getCharKeyword_0());
            		
            // InternalIoTParser.g:731:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalIoTParser.g:732:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:732:4: (lv_name_1_0= RULE_STRING )
            // InternalIoTParser.g:733:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStopCharAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopCharRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleStopChar"


    // $ANTLR start "entryRuleStopByte"
    // InternalIoTParser.g:753:1: entryRuleStopByte returns [EObject current=null] : iv_ruleStopByte= ruleStopByte EOF ;
    public final EObject entryRuleStopByte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopByte = null;


        try {
            // InternalIoTParser.g:753:49: (iv_ruleStopByte= ruleStopByte EOF )
            // InternalIoTParser.g:754:2: iv_ruleStopByte= ruleStopByte EOF
            {
             newCompositeNode(grammarAccess.getStopByteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStopByte=ruleStopByte();

            state._fsp--;

             current =iv_ruleStopByte; 
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
    // $ANTLR end "entryRuleStopByte"


    // $ANTLR start "ruleStopByte"
    // InternalIoTParser.g:760:1: ruleStopByte returns [EObject current=null] : (otherlv_0= Byte ( (lv_name_1_0= RULE_INT ) ) ) ;
    public final EObject ruleStopByte() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:766:2: ( (otherlv_0= Byte ( (lv_name_1_0= RULE_INT ) ) ) )
            // InternalIoTParser.g:767:2: (otherlv_0= Byte ( (lv_name_1_0= RULE_INT ) ) )
            {
            // InternalIoTParser.g:767:2: (otherlv_0= Byte ( (lv_name_1_0= RULE_INT ) ) )
            // InternalIoTParser.g:768:3: otherlv_0= Byte ( (lv_name_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,Byte,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getStopByteAccess().getByteKeyword_0());
            		
            // InternalIoTParser.g:772:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalIoTParser.g:773:4: (lv_name_1_0= RULE_INT )
            {
            // InternalIoTParser.g:773:4: (lv_name_1_0= RULE_INT )
            // InternalIoTParser.g:774:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStopByteAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopByteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

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
    // $ANTLR end "ruleStopByte"


    // $ANTLR start "entryRuleMqttClient"
    // InternalIoTParser.g:794:1: entryRuleMqttClient returns [EObject current=null] : iv_ruleMqttClient= ruleMqttClient EOF ;
    public final EObject entryRuleMqttClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMqttClient = null;


        try {
            // InternalIoTParser.g:794:51: (iv_ruleMqttClient= ruleMqttClient EOF )
            // InternalIoTParser.g:795:2: iv_ruleMqttClient= ruleMqttClient EOF
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
    // InternalIoTParser.g:801:1: ruleMqttClient returns [EObject current=null] : (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic otherlv_7= LeftSquareBracket ( (lv_pub_8_0= RULE_STRING ) ) (otherlv_9= Comma ( (lv_pub_10_0= RULE_STRING ) ) )? otherlv_11= RightSquareBracket ) ;
    public final EObject ruleMqttClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_broker_1_0=null;
        Token otherlv_2=null;
        Token lv_port_3_0=null;
        Token otherlv_4=null;
        Token lv_client_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_pub_8_0=null;
        Token otherlv_9=null;
        Token lv_pub_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalIoTParser.g:807:2: ( (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic otherlv_7= LeftSquareBracket ( (lv_pub_8_0= RULE_STRING ) ) (otherlv_9= Comma ( (lv_pub_10_0= RULE_STRING ) ) )? otherlv_11= RightSquareBracket ) )
            // InternalIoTParser.g:808:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic otherlv_7= LeftSquareBracket ( (lv_pub_8_0= RULE_STRING ) ) (otherlv_9= Comma ( (lv_pub_10_0= RULE_STRING ) ) )? otherlv_11= RightSquareBracket )
            {
            // InternalIoTParser.g:808:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic otherlv_7= LeftSquareBracket ( (lv_pub_8_0= RULE_STRING ) ) (otherlv_9= Comma ( (lv_pub_10_0= RULE_STRING ) ) )? otherlv_11= RightSquareBracket )
            // InternalIoTParser.g:809:3: otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic otherlv_7= LeftSquareBracket ( (lv_pub_8_0= RULE_STRING ) ) (otherlv_9= Comma ( (lv_pub_10_0= RULE_STRING ) ) )? otherlv_11= RightSquareBracket
            {
            otherlv_0=(Token)match(input,Broker,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMqttClientAccess().getBrokerKeyword_0());
            		
            // InternalIoTParser.g:813:3: ( (lv_broker_1_0= RULE_STRING ) )
            // InternalIoTParser.g:814:4: (lv_broker_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:814:4: (lv_broker_1_0= RULE_STRING )
            // InternalIoTParser.g:815:5: lv_broker_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,Port,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMqttClientAccess().getPortKeyword_2());
            		
            // InternalIoTParser.g:835:3: ( (lv_port_3_0= RULE_INT ) )
            // InternalIoTParser.g:836:4: (lv_port_3_0= RULE_INT )
            {
            // InternalIoTParser.g:836:4: (lv_port_3_0= RULE_INT )
            // InternalIoTParser.g:837:5: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

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
            		
            // InternalIoTParser.g:857:3: ( (lv_client_5_0= RULE_STRING ) )
            // InternalIoTParser.g:858:4: (lv_client_5_0= RULE_STRING )
            {
            // InternalIoTParser.g:858:4: (lv_client_5_0= RULE_STRING )
            // InternalIoTParser.g:859:5: lv_client_5_0= RULE_STRING
            {
            lv_client_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            otherlv_6=(Token)match(input,Topic,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getMqttClientAccess().getTopicKeyword_6());
            		
            otherlv_7=(Token)match(input,LeftSquareBracket,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getMqttClientAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalIoTParser.g:883:3: ( (lv_pub_8_0= RULE_STRING ) )
            // InternalIoTParser.g:884:4: (lv_pub_8_0= RULE_STRING )
            {
            // InternalIoTParser.g:884:4: (lv_pub_8_0= RULE_STRING )
            // InternalIoTParser.g:885:5: lv_pub_8_0= RULE_STRING
            {
            lv_pub_8_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_pub_8_0, grammarAccess.getMqttClientAccess().getPubSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMqttClientRule());
            					}
            					addWithLastConsumed(
            						current,
            						"pub",
            						lv_pub_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalIoTParser.g:901:3: (otherlv_9= Comma ( (lv_pub_10_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Comma) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIoTParser.g:902:4: otherlv_9= Comma ( (lv_pub_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,Comma,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getMqttClientAccess().getCommaKeyword_9_0());
                    			
                    // InternalIoTParser.g:906:4: ( (lv_pub_10_0= RULE_STRING ) )
                    // InternalIoTParser.g:907:5: (lv_pub_10_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:907:5: (lv_pub_10_0= RULE_STRING )
                    // InternalIoTParser.g:908:6: lv_pub_10_0= RULE_STRING
                    {
                    lv_pub_10_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    						newLeafNode(lv_pub_10_0, grammarAccess.getMqttClientAccess().getPubSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMqttClientRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"pub",
                    							lv_pub_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMqttClientAccess().getRightSquareBracketKeyword_10());
            		

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
    // InternalIoTParser.g:933:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalIoTParser.g:933:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalIoTParser.g:934:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalIoTParser.g:940:1: ruleFunction returns [EObject current=null] : (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis ) ;
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
            // InternalIoTParser.g:946:2: ( (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis ) )
            // InternalIoTParser.g:947:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis )
            {
            // InternalIoTParser.g:947:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis )
            // InternalIoTParser.g:948:3: otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalIoTParser.g:952:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:953:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:953:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:954:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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
            		
            // InternalIoTParser.g:974:3: ( (lv_input_3_0= ruleFunctionInputType ) )
            // InternalIoTParser.g:975:4: (lv_input_3_0= ruleFunctionInputType )
            {
            // InternalIoTParser.g:975:4: (lv_input_3_0= ruleFunctionInputType )
            // InternalIoTParser.g:976:5: lv_input_3_0= ruleFunctionInputType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getInputFunctionInputTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalIoTParser.g:993:3: (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIoTParser.g:994:4: otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIoTParser.g:998:4: ( (lv_input_5_0= ruleFunctionInputType ) )
            	    // InternalIoTParser.g:999:5: (lv_input_5_0= ruleFunctionInputType )
            	    {
            	    // InternalIoTParser.g:999:5: (lv_input_5_0= ruleFunctionInputType )
            	    // InternalIoTParser.g:1000:6: lv_input_5_0= ruleFunctionInputType
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionAccess().getInputFunctionInputTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_30); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_7());
            		
            // InternalIoTParser.g:1030:3: ( (lv_output_9_0= RULE_ID ) )
            // InternalIoTParser.g:1031:4: (lv_output_9_0= RULE_ID )
            {
            // InternalIoTParser.g:1031:4: (lv_output_9_0= RULE_ID )
            // InternalIoTParser.g:1032:5: lv_output_9_0= RULE_ID
            {
            lv_output_9_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            // InternalIoTParser.g:1048:3: (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIoTParser.g:1049:4: otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIoTParser.g:1053:4: ( (lv_output_11_0= RULE_ID ) )
            	    // InternalIoTParser.g:1054:5: (lv_output_11_0= RULE_ID )
            	    {
            	    // InternalIoTParser.g:1054:5: (lv_output_11_0= RULE_ID )
            	    // InternalIoTParser.g:1055:6: lv_output_11_0= RULE_ID
            	    {
            	    lv_output_11_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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
            	    break loop15;
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
    // InternalIoTParser.g:1080:1: entryRuleFunctionInputType returns [EObject current=null] : iv_ruleFunctionInputType= ruleFunctionInputType EOF ;
    public final EObject entryRuleFunctionInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionInputType = null;


        try {
            // InternalIoTParser.g:1080:58: (iv_ruleFunctionInputType= ruleFunctionInputType EOF )
            // InternalIoTParser.g:1081:2: iv_ruleFunctionInputType= ruleFunctionInputType EOF
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
    // InternalIoTParser.g:1087:1: ruleFunctionInputType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionInputType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1093:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1094:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1094:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1095:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1095:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1096:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:1115:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalIoTParser.g:1115:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalIoTParser.g:1116:2: iv_ruleBoard= ruleBoard EOF
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
    // InternalIoTParser.g:1122:1: ruleBoard returns [EObject current=null] : (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NewBoard_1 = null;

        EObject this_ExtendsBoard_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1128:2: ( (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) )
            // InternalIoTParser.g:1129:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            {
            // InternalIoTParser.g:1129:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            // InternalIoTParser.g:1130:3: otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            {
            otherlv_0=(Token)match(input,Board,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            // InternalIoTParser.g:1134:3: (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==Extends) ) {
                    alt16=2;
                }
                else if ( (LA16_1==Colon) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalIoTParser.g:1135:4: this_NewBoard_1= ruleNewBoard
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
                    // InternalIoTParser.g:1144:4: this_ExtendsBoard_2= ruleExtendsBoard
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
    // InternalIoTParser.g:1157:1: entryRuleNewBoard returns [EObject current=null] : iv_ruleNewBoard= ruleNewBoard EOF ;
    public final EObject entryRuleNewBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewBoard = null;


        try {
            // InternalIoTParser.g:1157:49: (iv_ruleNewBoard= ruleNewBoard EOF )
            // InternalIoTParser.g:1158:2: iv_ruleNewBoard= ruleNewBoard EOF
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
    // InternalIoTParser.g:1164:1: ruleNewBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) ;
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
            // InternalIoTParser.g:1170:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) )
            // InternalIoTParser.g:1171:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            {
            // InternalIoTParser.g:1171:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            // InternalIoTParser.g:1172:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END
            {
            // InternalIoTParser.g:1172:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1173:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1173:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1174:5: lv_name_0_0= RULE_ID
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
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getNewBoardAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIoTParser.g:1198:3: ( (lv_version_3_0= ruleBoardVersion ) )
            // InternalIoTParser.g:1199:4: (lv_version_3_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:1199:4: (lv_version_3_0= ruleBoardVersion )
            // InternalIoTParser.g:1200:5: lv_version_3_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getNewBoardAccess().getVersionBoardVersionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalIoTParser.g:1217:3: (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Wifi) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIoTParser.g:1218:4: otherlv_4= Wifi ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,Wifi,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getNewBoardAccess().getWifiKeyword_4_0());
                    			
                    // InternalIoTParser.g:1222:4: ( (otherlv_5= RULE_ID ) )
                    // InternalIoTParser.g:1223:5: (otherlv_5= RULE_ID )
                    {
                    // InternalIoTParser.g:1223:5: (otherlv_5= RULE_ID )
                    // InternalIoTParser.g:1224:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewBoardRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_5, grammarAccess.getNewBoardAccess().getWifiSelectWifiConfigCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIoTParser.g:1236:3: ( (lv_sensors_6_0= ruleSensor ) )+
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
            	    // InternalIoTParser.g:1237:4: (lv_sensors_6_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:1237:4: (lv_sensors_6_0= ruleSensor )
            	    // InternalIoTParser.g:1238:5: lv_sensors_6_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getNewBoardAccess().getSensorsSensorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // InternalIoTParser.g:1263:1: entryRuleBoardVersion returns [EObject current=null] : iv_ruleBoardVersion= ruleBoardVersion EOF ;
    public final EObject entryRuleBoardVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardVersion = null;


        try {
            // InternalIoTParser.g:1263:53: (iv_ruleBoardVersion= ruleBoardVersion EOF )
            // InternalIoTParser.g:1264:2: iv_ruleBoardVersion= ruleBoardVersion EOF
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
    // InternalIoTParser.g:1270:1: ruleBoardVersion returns [EObject current=null] : (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) ) ;
    public final EObject ruleBoardVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_model_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1276:2: ( (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) ) )
            // InternalIoTParser.g:1277:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) )
            {
            // InternalIoTParser.g:1277:2: (otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) ) )
            // InternalIoTParser.g:1278:3: otherlv_0= Type ( (lv_type_1_0= RULE_ID ) ) otherlv_2= Model ( (lv_model_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardVersionAccess().getTypeKeyword_0());
            		
            // InternalIoTParser.g:1282:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalIoTParser.g:1283:4: (lv_type_1_0= RULE_ID )
            {
            // InternalIoTParser.g:1283:4: (lv_type_1_0= RULE_ID )
            // InternalIoTParser.g:1284:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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
            		
            // InternalIoTParser.g:1304:3: ( (lv_model_3_0= RULE_ID ) )
            // InternalIoTParser.g:1305:4: (lv_model_3_0= RULE_ID )
            {
            // InternalIoTParser.g:1305:4: (lv_model_3_0= RULE_ID )
            // InternalIoTParser.g:1306:5: lv_model_3_0= RULE_ID
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
    // InternalIoTParser.g:1326:1: entryRuleExtendsBoard returns [EObject current=null] : iv_ruleExtendsBoard= ruleExtendsBoard EOF ;
    public final EObject entryRuleExtendsBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsBoard = null;


        try {
            // InternalIoTParser.g:1326:53: (iv_ruleExtendsBoard= ruleExtendsBoard EOF )
            // InternalIoTParser.g:1327:2: iv_ruleExtendsBoard= ruleExtendsBoard EOF
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
    // InternalIoTParser.g:1333:1: ruleExtendsBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )? ) ;
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
            // InternalIoTParser.g:1339:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )? ) )
            // InternalIoTParser.g:1340:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )? )
            {
            // InternalIoTParser.g:1340:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )? )
            // InternalIoTParser.g:1341:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )?
            {
            // InternalIoTParser.g:1341:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1342:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1342:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1343:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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
            		
            // InternalIoTParser.g:1363:3: ( (otherlv_2= RULE_ID ) )
            // InternalIoTParser.g:1364:4: (otherlv_2= RULE_ID )
            {
            // InternalIoTParser.g:1364:4: (otherlv_2= RULE_ID )
            // InternalIoTParser.g:1365:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendsBoardRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getExtendsBoardAccess().getAbstractBoardAbstractBoardCrossReference_2_0());
            				

            }


            }

            // InternalIoTParser.g:1376:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Colon) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalIoTParser.g:1377:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtendsBoardAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_35); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getExtendsBoardAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:1385:4: (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Wifi) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalIoTParser.g:1386:5: otherlv_5= Wifi ( (otherlv_6= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,Wifi,FOLLOW_9); 

                            					newLeafNode(otherlv_5, grammarAccess.getExtendsBoardAccess().getWifiKeyword_3_2_0());
                            				
                            // InternalIoTParser.g:1390:5: ( (otherlv_6= RULE_ID ) )
                            // InternalIoTParser.g:1391:6: (otherlv_6= RULE_ID )
                            {
                            // InternalIoTParser.g:1391:6: (otherlv_6= RULE_ID )
                            // InternalIoTParser.g:1392:7: otherlv_6= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExtendsBoardRule());
                            							}
                            						
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_35); 

                            							newLeafNode(otherlv_6, grammarAccess.getExtendsBoardAccess().getWifiSelectWifiConfigCrossReference_3_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalIoTParser.g:1404:4: ( (lv_sensors_7_0= ruleSensor ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Sensor) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalIoTParser.g:1405:5: (lv_sensors_7_0= ruleSensor )
                    	    {
                    	    // InternalIoTParser.g:1405:5: (lv_sensors_7_0= ruleSensor )
                    	    // InternalIoTParser.g:1406:6: lv_sensors_7_0= ruleSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getExtendsBoardAccess().getSensorsSensorParserRuleCall_3_3_0());
                    	    					
                    	    pushFollow(FOLLOW_35);
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
                    	    break loop20;
                        }
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
    // InternalIoTParser.g:1432:1: entryRuleAbstractBoard returns [EObject current=null] : iv_ruleAbstractBoard= ruleAbstractBoard EOF ;
    public final EObject entryRuleAbstractBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBoard = null;


        try {
            // InternalIoTParser.g:1432:54: (iv_ruleAbstractBoard= ruleAbstractBoard EOF )
            // InternalIoTParser.g:1433:2: iv_ruleAbstractBoard= ruleAbstractBoard EOF
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
    // InternalIoTParser.g:1439:1: ruleAbstractBoard returns [EObject current=null] : (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) ;
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
            // InternalIoTParser.g:1445:2: ( (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) )
            // InternalIoTParser.g:1446:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            {
            // InternalIoTParser.g:1446:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            // InternalIoTParser.g:1447:3: otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END
            {
            otherlv_0=(Token)match(input,Abstract,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractBoardAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,Board,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractBoardAccess().getBoardKeyword_1());
            		
            // InternalIoTParser.g:1455:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoTParser.g:1456:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoTParser.g:1456:4: (lv_name_2_0= RULE_ID )
            // InternalIoTParser.g:1457:5: lv_name_2_0= RULE_ID
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
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getAbstractBoardAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalIoTParser.g:1481:3: ( (lv_version_5_0= ruleBoardVersion ) )
            // InternalIoTParser.g:1482:4: (lv_version_5_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:1482:4: (lv_version_5_0= ruleBoardVersion )
            // InternalIoTParser.g:1483:5: lv_version_5_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getAbstractBoardAccess().getVersionBoardVersionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalIoTParser.g:1500:3: ( (lv_sensors_6_0= ruleSensor ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Sensor) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIoTParser.g:1501:4: (lv_sensors_6_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:1501:4: (lv_sensors_6_0= ruleSensor )
            	    // InternalIoTParser.g:1502:5: lv_sensors_6_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractBoardAccess().getSensorsSensorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalIoTParser.g:1527:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoTParser.g:1527:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoTParser.g:1528:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalIoTParser.g:1534:1: ruleSensor returns [EObject current=null] : (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) ;
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
            // InternalIoTParser.g:1540:2: ( (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) )
            // InternalIoTParser.g:1541:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            {
            // InternalIoTParser.g:1541:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            // InternalIoTParser.g:1542:3: otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END
            {
            otherlv_0=(Token)match(input,Sensor,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalIoTParser.g:1546:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:1547:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:1547:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:1548:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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
            		
            // InternalIoTParser.g:1568:3: ( (lv_sensortype_3_0= ruleSensorType ) )
            // InternalIoTParser.g:1569:4: (lv_sensortype_3_0= ruleSensorType )
            {
            // InternalIoTParser.g:1569:4: (lv_sensortype_3_0= ruleSensorType )
            // InternalIoTParser.g:1570:5: lv_sensortype_3_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensortypeSensorTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
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
            		
            // InternalIoTParser.g:1591:3: ( (lv_vars_5_0= ruleSensorVariables ) )
            // InternalIoTParser.g:1592:4: (lv_vars_5_0= ruleSensorVariables )
            {
            // InternalIoTParser.g:1592:4: (lv_vars_5_0= ruleSensorVariables )
            // InternalIoTParser.g:1593:5: lv_vars_5_0= ruleSensorVariables
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
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getSensorAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalIoTParser.g:1618:3: (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Sample) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIoTParser.g:1619:4: otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) )
                    {
                    otherlv_8=(Token)match(input,Sample,FOLLOW_42); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getSampleKeyword_8_0());
                    			
                    // InternalIoTParser.g:1623:4: ( (lv_sampler_9_0= ruleSampler ) )
                    // InternalIoTParser.g:1624:5: (lv_sampler_9_0= ruleSampler )
                    {
                    // InternalIoTParser.g:1624:5: (lv_sampler_9_0= ruleSampler )
                    // InternalIoTParser.g:1625:6: lv_sampler_9_0= ruleSampler
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getSamplerSamplerParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
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

            // InternalIoTParser.g:1643:3: (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Vcc) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIoTParser.g:1644:4: otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,Vcc,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getVccKeyword_9_0());
                    			
                    // InternalIoTParser.g:1648:4: ( (lv_vcc_11_0= RULE_INT ) )
                    // InternalIoTParser.g:1649:5: (lv_vcc_11_0= RULE_INT )
                    {
                    // InternalIoTParser.g:1649:5: (lv_vcc_11_0= RULE_INT )
                    // InternalIoTParser.g:1650:6: lv_vcc_11_0= RULE_INT
                    {
                    lv_vcc_11_0=(Token)match(input,RULE_INT,FOLLOW_41); 

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

            // InternalIoTParser.g:1667:3: ( (lv_output_12_0= ruleSensorOutput ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Pipe) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalIoTParser.g:1668:4: (lv_output_12_0= ruleSensorOutput )
            	    {
            	    // InternalIoTParser.g:1668:4: (lv_output_12_0= ruleSensorOutput )
            	    // InternalIoTParser.g:1669:5: lv_output_12_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputSensorOutputParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_43);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // InternalIoTParser.g:1694:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalIoTParser.g:1694:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalIoTParser.g:1695:2: iv_ruleSensorType= ruleSensorType EOF
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
    // InternalIoTParser.g:1701:1: ruleSensorType returns [EObject current=null] : (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalSensor_0 = null;

        EObject this_OnboardSensor_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1707:2: ( (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor ) )
            // InternalIoTParser.g:1708:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            {
            // InternalIoTParser.g:1708:2: (this_ExternalSensor_0= ruleExternalSensor | this_OnboardSensor_1= ruleOnboardSensor )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==LeftParenthesis) ) {
                    alt26=1;
                }
                else if ( (LA26_1==EOF||LA26_1==As) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalIoTParser.g:1709:3: this_ExternalSensor_0= ruleExternalSensor
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
                    // InternalIoTParser.g:1718:3: this_OnboardSensor_1= ruleOnboardSensor
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
    // InternalIoTParser.g:1730:1: entryRuleExternalSensor returns [EObject current=null] : iv_ruleExternalSensor= ruleExternalSensor EOF ;
    public final EObject entryRuleExternalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSensor = null;


        try {
            // InternalIoTParser.g:1730:55: (iv_ruleExternalSensor= ruleExternalSensor EOF )
            // InternalIoTParser.g:1731:2: iv_ruleExternalSensor= ruleExternalSensor EOF
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
    // InternalIoTParser.g:1737:1: ruleExternalSensor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) ;
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
            // InternalIoTParser.g:1743:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1744:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1744:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1745:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1745:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1746:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1746:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1747:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalSensorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoTParser.g:1767:3: ( (lv_pins_2_0= RULE_INT ) )
            // InternalIoTParser.g:1768:4: (lv_pins_2_0= RULE_INT )
            {
            // InternalIoTParser.g:1768:4: (lv_pins_2_0= RULE_INT )
            // InternalIoTParser.g:1769:5: lv_pins_2_0= RULE_INT
            {
            lv_pins_2_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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

            // InternalIoTParser.g:1785:3: (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalIoTParser.g:1786:4: otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_21); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalSensorAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1790:4: ( (lv_pins_4_0= RULE_INT ) )
            	    // InternalIoTParser.g:1791:5: (lv_pins_4_0= RULE_INT )
            	    {
            	    // InternalIoTParser.g:1791:5: (lv_pins_4_0= RULE_INT )
            	    // InternalIoTParser.g:1792:6: lv_pins_4_0= RULE_INT
            	    {
            	    lv_pins_4_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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
            	    break loop27;
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
    // InternalIoTParser.g:1817:1: entryRuleOnboardSensor returns [EObject current=null] : iv_ruleOnboardSensor= ruleOnboardSensor EOF ;
    public final EObject entryRuleOnboardSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnboardSensor = null;


        try {
            // InternalIoTParser.g:1817:54: (iv_ruleOnboardSensor= ruleOnboardSensor EOF )
            // InternalIoTParser.g:1818:2: iv_ruleOnboardSensor= ruleOnboardSensor EOF
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
    // InternalIoTParser.g:1824:1: ruleOnboardSensor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleOnboardSensor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1830:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1831:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1831:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1832:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1832:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1833:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:1852:1: entryRuleSensorVariables returns [EObject current=null] : iv_ruleSensorVariables= ruleSensorVariables EOF ;
    public final EObject entryRuleSensorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorVariables = null;


        try {
            // InternalIoTParser.g:1852:56: (iv_ruleSensorVariables= ruleSensorVariables EOF )
            // InternalIoTParser.g:1853:2: iv_ruleSensorVariables= ruleSensorVariables EOF
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
    // InternalIoTParser.g:1859:1: ruleSensorVariables returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) ;
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
            // InternalIoTParser.g:1865:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1866:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1866:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1867:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1867:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1868:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1868:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1869:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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
            		
            // InternalIoTParser.g:1889:3: ( (lv_ids_2_0= ruleVariable ) )
            // InternalIoTParser.g:1890:4: (lv_ids_2_0= ruleVariable )
            {
            // InternalIoTParser.g:1890:4: (lv_ids_2_0= ruleVariable )
            // InternalIoTParser.g:1891:5: lv_ids_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalIoTParser.g:1908:3: (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Comma) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalIoTParser.g:1909:4: otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSensorVariablesAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1913:4: ( (lv_ids_4_0= ruleVariable ) )
            	    // InternalIoTParser.g:1914:5: (lv_ids_4_0= ruleVariable )
            	    {
            	    // InternalIoTParser.g:1914:5: (lv_ids_4_0= ruleVariable )
            	    // InternalIoTParser.g:1915:6: lv_ids_4_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
            	    break loop28;
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
    // InternalIoTParser.g:1941:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalIoTParser.g:1941:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalIoTParser.g:1942:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalIoTParser.g:1948:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1954:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1955:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1955:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1956:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1956:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1957:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:1976:1: entryRuleSampler returns [EObject current=null] : iv_ruleSampler= ruleSampler EOF ;
    public final EObject entryRuleSampler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampler = null;


        try {
            // InternalIoTParser.g:1976:48: (iv_ruleSampler= ruleSampler EOF )
            // InternalIoTParser.g:1977:2: iv_ruleSampler= ruleSampler EOF
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
    // InternalIoTParser.g:1983:1: ruleSampler returns [EObject current=null] : (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) ;
    public final EObject ruleSampler() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Frequency_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1989:2: ( (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency ) )
            // InternalIoTParser.g:1990:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            {
            // InternalIoTParser.g:1990:2: (this_Command_0= ruleCommand | this_Frequency_1= ruleFrequency )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Command) ) {
                alt29=1;
            }
            else if ( (LA29_0==Frequency) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalIoTParser.g:1991:3: this_Command_0= ruleCommand
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
                    // InternalIoTParser.g:2000:3: this_Frequency_1= ruleFrequency
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
    // InternalIoTParser.g:2012:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalIoTParser.g:2012:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalIoTParser.g:2013:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalIoTParser.g:2019:1: ruleCommand returns [EObject current=null] : (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;
        Token lv_topic_2_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:2025:2: ( (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? ) )
            // InternalIoTParser.g:2026:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? )
            {
            // InternalIoTParser.g:2026:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )? )
            // InternalIoTParser.g:2027:3: otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ( (lv_topic_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,Command,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalIoTParser.g:2031:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalIoTParser.g:2032:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:2032:4: (lv_command_1_0= RULE_STRING )
            // InternalIoTParser.g:2033:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            // InternalIoTParser.g:2049:3: ( (lv_topic_2_0= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIoTParser.g:2050:4: (lv_topic_2_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:2050:4: (lv_topic_2_0= RULE_STRING )
                    // InternalIoTParser.g:2051:5: lv_topic_2_0= RULE_STRING
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
    // InternalIoTParser.g:2071:1: entryRuleFrequency returns [EObject current=null] : iv_ruleFrequency= ruleFrequency EOF ;
    public final EObject entryRuleFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequency = null;


        try {
            // InternalIoTParser.g:2071:50: (iv_ruleFrequency= ruleFrequency EOF )
            // InternalIoTParser.g:2072:2: iv_ruleFrequency= ruleFrequency EOF
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
    // InternalIoTParser.g:2078:1: ruleFrequency returns [EObject current=null] : (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) ;
    public final EObject ruleFrequency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_frequency_1_0=null;
        EObject lv_resolution_2_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2084:2: ( (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) ) )
            // InternalIoTParser.g:2085:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            {
            // InternalIoTParser.g:2085:2: (otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) ) )
            // InternalIoTParser.g:2086:3: otherlv_0= Frequency ( (lv_frequency_1_0= RULE_INT ) ) ( (lv_resolution_2_0= ruleResolution ) )
            {
            otherlv_0=(Token)match(input,Frequency,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getFrequencyAccess().getFrequencyKeyword_0());
            		
            // InternalIoTParser.g:2090:3: ( (lv_frequency_1_0= RULE_INT ) )
            // InternalIoTParser.g:2091:4: (lv_frequency_1_0= RULE_INT )
            {
            // InternalIoTParser.g:2091:4: (lv_frequency_1_0= RULE_INT )
            // InternalIoTParser.g:2092:5: lv_frequency_1_0= RULE_INT
            {
            lv_frequency_1_0=(Token)match(input,RULE_INT,FOLLOW_45); 

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

            // InternalIoTParser.g:2108:3: ( (lv_resolution_2_0= ruleResolution ) )
            // InternalIoTParser.g:2109:4: (lv_resolution_2_0= ruleResolution )
            {
            // InternalIoTParser.g:2109:4: (lv_resolution_2_0= ruleResolution )
            // InternalIoTParser.g:2110:5: lv_resolution_2_0= ruleResolution
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
    // InternalIoTParser.g:2131:1: entryRuleResolution returns [EObject current=null] : iv_ruleResolution= ruleResolution EOF ;
    public final EObject entryRuleResolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolution = null;


        try {
            // InternalIoTParser.g:2131:51: (iv_ruleResolution= ruleResolution EOF )
            // InternalIoTParser.g:2132:2: iv_ruleResolution= ruleResolution EOF
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
    // InternalIoTParser.g:2138:1: ruleResolution returns [EObject current=null] : ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) ;
    public final EObject ruleResolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:2144:2: ( ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) )
            // InternalIoTParser.g:2145:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            {
            // InternalIoTParser.g:2145:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case Seconds:
                {
                alt31=1;
                }
                break;
            case Milliseconds:
                {
                alt31=2;
                }
                break;
            case Microseconds:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalIoTParser.g:2146:3: ( () otherlv_1= Seconds )
                    {
                    // InternalIoTParser.g:2146:3: ( () otherlv_1= Seconds )
                    // InternalIoTParser.g:2147:4: () otherlv_1= Seconds
                    {
                    // InternalIoTParser.g:2147:4: ()
                    // InternalIoTParser.g:2148:5: 
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
                    // InternalIoTParser.g:2160:3: ( () otherlv_3= Milliseconds )
                    {
                    // InternalIoTParser.g:2160:3: ( () otherlv_3= Milliseconds )
                    // InternalIoTParser.g:2161:4: () otherlv_3= Milliseconds
                    {
                    // InternalIoTParser.g:2161:4: ()
                    // InternalIoTParser.g:2162:5: 
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
                    // InternalIoTParser.g:2174:3: ( () otherlv_5= Microseconds )
                    {
                    // InternalIoTParser.g:2174:3: ( () otherlv_5= Microseconds )
                    // InternalIoTParser.g:2175:4: () otherlv_5= Microseconds
                    {
                    // InternalIoTParser.g:2175:4: ()
                    // InternalIoTParser.g:2176:5: 
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
    // InternalIoTParser.g:2191:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalIoTParser.g:2191:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalIoTParser.g:2192:2: iv_ruleSensorOutput= ruleSensorOutput EOF
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
    // InternalIoTParser.g:2198:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* ) ;
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
            // InternalIoTParser.g:2204:2: ( (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalIoTParser.g:2205:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalIoTParser.g:2205:2: (otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )* )
            // InternalIoTParser.g:2206:3: otherlv_0= Pipe ( (lv_output_1_0= ruleDataOutput ) ) otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Pipe,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getPipeKeyword_0());
            		
            // InternalIoTParser.g:2210:3: ( (lv_output_1_0= ruleDataOutput ) )
            // InternalIoTParser.g:2211:4: (lv_output_1_0= ruleDataOutput )
            {
            // InternalIoTParser.g:2211:4: (lv_output_1_0= ruleDataOutput )
            // InternalIoTParser.g:2212:5: lv_output_1_0= ruleDataOutput
            {

            					newCompositeNode(grammarAccess.getSensorOutputAccess().getOutputDataOutputParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
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
            		
            // InternalIoTParser.g:2233:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoTParser.g:2234:4: (otherlv_3= RULE_ID )
            {
            // InternalIoTParser.g:2234:4: (otherlv_3= RULE_ID )
            // InternalIoTParser.g:2235:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorOutputRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(otherlv_3, grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_3_0());
            				

            }


            }

            // InternalIoTParser.g:2246:3: (otherlv_4= And ( (otherlv_5= RULE_ID ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==And) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalIoTParser.g:2247:4: otherlv_4= And ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,And,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSensorOutputAccess().getAndKeyword_4_0());
            	    			
            	    // InternalIoTParser.g:2251:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalIoTParser.g:2252:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalIoTParser.g:2252:5: (otherlv_5= RULE_ID )
            	    // InternalIoTParser.g:2253:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensorOutputRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_46); 

            	    						newLeafNode(otherlv_5, grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_4_1_0());
            	    					

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
    // $ANTLR end "ruleSensorOutput"


    // $ANTLR start "entryRuleDataOutput"
    // InternalIoTParser.g:2269:1: entryRuleDataOutput returns [EObject current=null] : iv_ruleDataOutput= ruleDataOutput EOF ;
    public final EObject entryRuleDataOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOutput = null;


        try {
            // InternalIoTParser.g:2269:51: (iv_ruleDataOutput= ruleDataOutput EOF )
            // InternalIoTParser.g:2270:2: iv_ruleDataOutput= ruleDataOutput EOF
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
    // InternalIoTParser.g:2276:1: ruleDataOutput returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) ;
    public final EObject ruleDataOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pipeline_1_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2282:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:2283:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:2283:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )? )
            // InternalIoTParser.g:2284:3: ( (otherlv_0= RULE_ID ) ) ( (lv_pipeline_1_0= rulePipeline ) )?
            {
            // InternalIoTParser.g:2284:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoTParser.g:2285:4: (otherlv_0= RULE_ID )
            {
            // InternalIoTParser.g:2285:4: (otherlv_0= RULE_ID )
            // InternalIoTParser.g:2286:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataOutputRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getDataOutputAccess().getSensorvarSensorVariablesCrossReference_0_0());
            				

            }


            }

            // InternalIoTParser.g:2297:3: ( (lv_pipeline_1_0= rulePipeline ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FullStop) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalIoTParser.g:2298:4: (lv_pipeline_1_0= rulePipeline )
                    {
                    // InternalIoTParser.g:2298:4: (lv_pipeline_1_0= rulePipeline )
                    // InternalIoTParser.g:2299:5: lv_pipeline_1_0= rulePipeline
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
    // InternalIoTParser.g:2320:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalIoTParser.g:2320:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalIoTParser.g:2321:2: iv_rulePipeline= rulePipeline EOF
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
    // InternalIoTParser.g:2327:1: rulePipeline returns [EObject current=null] : (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? ) ;
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
            // InternalIoTParser.g:2333:2: ( (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:2334:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:2334:2: (otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )? )
            // InternalIoTParser.g:2335:3: otherlv_0= FullStop (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal ) ( (lv_next_5_0= rulePipeline ) )?
            {
            otherlv_0=(Token)match(input,FullStop,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getFullStopKeyword_0());
            		
            // InternalIoTParser.g:2339:3: (this_TuplePipeline_1= ruleTuplePipeline | this_MapPipeline_2= ruleMapPipeline | this_WindowPipeline_3= ruleWindowPipeline | this_External_4= ruleExternal )
            int alt34=4;
            switch ( input.LA(1) ) {
            case Filter:
            case Abs:
                {
                alt34=1;
                }
                break;
            case Map:
                {
                alt34=2;
                }
                break;
            case ByWindow:
                {
                alt34=3;
                }
                break;
            case RULE_ID:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalIoTParser.g:2340:4: this_TuplePipeline_1= ruleTuplePipeline
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
                    // InternalIoTParser.g:2349:4: this_MapPipeline_2= ruleMapPipeline
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
                    // InternalIoTParser.g:2358:4: this_WindowPipeline_3= ruleWindowPipeline
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
                    // InternalIoTParser.g:2367:4: this_External_4= ruleExternal
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

            // InternalIoTParser.g:2376:3: ( (lv_next_5_0= rulePipeline ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==FullStop) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalIoTParser.g:2377:4: (lv_next_5_0= rulePipeline )
                    {
                    // InternalIoTParser.g:2377:4: (lv_next_5_0= rulePipeline )
                    // InternalIoTParser.g:2378:5: lv_next_5_0= rulePipeline
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
    // InternalIoTParser.g:2399:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalIoTParser.g:2399:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalIoTParser.g:2400:2: iv_ruleExternal= ruleExternal EOF
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
    // InternalIoTParser.g:2406:1: ruleExternal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket ) ;
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
            // InternalIoTParser.g:2412:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalIoTParser.g:2413:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalIoTParser.g:2413:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket )
            // InternalIoTParser.g:2414:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalIoTParser.g:2414:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoTParser.g:2415:4: (otherlv_0= RULE_ID )
            {
            // InternalIoTParser.g:2415:4: (otherlv_0= RULE_ID )
            // InternalIoTParser.g:2416:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getFunctionFunctionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalIoTParser.g:2431:3: ( (lv_input_2_0= ruleExpression ) )
            // InternalIoTParser.g:2432:4: (lv_input_2_0= ruleExpression )
            {
            // InternalIoTParser.g:2432:4: (lv_input_2_0= ruleExpression )
            // InternalIoTParser.g:2433:5: lv_input_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExternalAccess().getInputExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalIoTParser.g:2450:3: (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Comma) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalIoTParser.g:2451:4: otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_48); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:2455:4: ( (lv_input_4_0= ruleExpression ) )
            	    // InternalIoTParser.g:2456:5: (lv_input_4_0= ruleExpression )
            	    {
            	    // InternalIoTParser.g:2456:5: (lv_input_4_0= ruleExpression )
            	    // InternalIoTParser.g:2457:6: lv_input_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternalAccess().getInputExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
            	    break loop36;
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
    // InternalIoTParser.g:2483:1: entryRuleTuplePipeline returns [EObject current=null] : iv_ruleTuplePipeline= ruleTuplePipeline EOF ;
    public final EObject entryRuleTuplePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePipeline = null;


        try {
            // InternalIoTParser.g:2483:54: (iv_ruleTuplePipeline= ruleTuplePipeline EOF )
            // InternalIoTParser.g:2484:2: iv_ruleTuplePipeline= ruleTuplePipeline EOF
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
    // InternalIoTParser.g:2490:1: ruleTuplePipeline returns [EObject current=null] : ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) ;
    public final EObject ruleTuplePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2496:2: ( ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:2497:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:2497:2: ( ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:2498:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) ) otherlv_4= LeftSquareBracket ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:2498:3: ( ( () otherlv_1= Filter ) | ( () otherlv_3= Abs ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Filter) ) {
                alt37=1;
            }
            else if ( (LA37_0==Abs) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalIoTParser.g:2499:4: ( () otherlv_1= Filter )
                    {
                    // InternalIoTParser.g:2499:4: ( () otherlv_1= Filter )
                    // InternalIoTParser.g:2500:5: () otherlv_1= Filter
                    {
                    // InternalIoTParser.g:2500:5: ()
                    // InternalIoTParser.g:2501:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTuplePipelineAccess().getFilterAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,Filter,FOLLOW_27); 

                    					newLeafNode(otherlv_1, grammarAccess.getTuplePipelineAccess().getFilterKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:2513:4: ( () otherlv_3= Abs )
                    {
                    // InternalIoTParser.g:2513:4: ( () otherlv_3= Abs )
                    // InternalIoTParser.g:2514:5: () otherlv_3= Abs
                    {
                    // InternalIoTParser.g:2514:5: ()
                    // InternalIoTParser.g:2515:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTuplePipelineAccess().getAbsAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_3=(Token)match(input,Abs,FOLLOW_27); 

                    					newLeafNode(otherlv_3, grammarAccess.getTuplePipelineAccess().getAbsKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_48); 

            			newLeafNode(otherlv_4, grammarAccess.getTuplePipelineAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalIoTParser.g:2531:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalIoTParser.g:2532:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalIoTParser.g:2532:4: (lv_expression_5_0= ruleExpression )
            // InternalIoTParser.g:2533:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTuplePipelineAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
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
    // InternalIoTParser.g:2558:1: entryRuleMapPipeline returns [EObject current=null] : iv_ruleMapPipeline= ruleMapPipeline EOF ;
    public final EObject entryRuleMapPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapPipeline = null;


        try {
            // InternalIoTParser.g:2558:52: (iv_ruleMapPipeline= ruleMapPipeline EOF )
            // InternalIoTParser.g:2559:2: iv_ruleMapPipeline= ruleMapPipeline EOF
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
    // InternalIoTParser.g:2565:1: ruleMapPipeline returns [EObject current=null] : ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) ;
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
            // InternalIoTParser.g:2571:2: ( ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:2572:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:2572:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:2573:3: () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:2573:3: ()
            // InternalIoTParser.g:2574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapPipelineAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Map,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMapPipelineAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getMapPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2588:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalIoTParser.g:2589:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalIoTParser.g:2589:4: (lv_expression_3_0= ruleExpression )
            // InternalIoTParser.g:2590:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
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
            		
            // InternalIoTParser.g:2611:3: ( (lv_output_5_0= ruleVariable ) )
            // InternalIoTParser.g:2612:4: (lv_output_5_0= ruleVariable )
            {
            // InternalIoTParser.g:2612:4: (lv_output_5_0= ruleVariable )
            // InternalIoTParser.g:2613:5: lv_output_5_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getOutputVariableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
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
    // InternalIoTParser.g:2638:1: entryRuleWindowPipeline returns [EObject current=null] : iv_ruleWindowPipeline= ruleWindowPipeline EOF ;
    public final EObject entryRuleWindowPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowPipeline = null;


        try {
            // InternalIoTParser.g:2638:55: (iv_ruleWindowPipeline= ruleWindowPipeline EOF )
            // InternalIoTParser.g:2639:2: iv_ruleWindowPipeline= ruleWindowPipeline EOF
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
    // InternalIoTParser.g:2645:1: ruleWindowPipeline returns [EObject current=null] : ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) ;
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
            // InternalIoTParser.g:2651:2: ( ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) )
            // InternalIoTParser.g:2652:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            {
            // InternalIoTParser.g:2652:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            // InternalIoTParser.g:2653:3: () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) )
            {
            // InternalIoTParser.g:2653:3: ()
            // InternalIoTParser.g:2654:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWindowPipelineAccess().getWindowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ByWindow,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getWindowPipelineAccess().getByWindowKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getWindowPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2668:3: ( (lv_width_3_0= RULE_INT ) )
            // InternalIoTParser.g:2669:4: (lv_width_3_0= RULE_INT )
            {
            // InternalIoTParser.g:2669:4: (lv_width_3_0= RULE_INT )
            // InternalIoTParser.g:2670:5: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_29); 

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

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_49); 

            			newLeafNode(otherlv_4, grammarAccess.getWindowPipelineAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,FullStop,FOLLOW_50); 

            			newLeafNode(otherlv_5, grammarAccess.getWindowPipelineAccess().getFullStopKeyword_5());
            		
            // InternalIoTParser.g:2694:3: ( (lv_execute_6_0= ruleExecutePipeline ) )
            // InternalIoTParser.g:2695:4: (lv_execute_6_0= ruleExecutePipeline )
            {
            // InternalIoTParser.g:2695:4: (lv_execute_6_0= ruleExecutePipeline )
            // InternalIoTParser.g:2696:5: lv_execute_6_0= ruleExecutePipeline
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
    // InternalIoTParser.g:2717:1: entryRuleExecutePipeline returns [EObject current=null] : iv_ruleExecutePipeline= ruleExecutePipeline EOF ;
    public final EObject entryRuleExecutePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutePipeline = null;


        try {
            // InternalIoTParser.g:2717:56: (iv_ruleExecutePipeline= ruleExecutePipeline EOF )
            // InternalIoTParser.g:2718:2: iv_ruleExecutePipeline= ruleExecutePipeline EOF
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
    // InternalIoTParser.g:2724:1: ruleExecutePipeline returns [EObject current=null] : ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) ) ;
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
            // InternalIoTParser.g:2730:2: ( ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) ) )
            // InternalIoTParser.g:2731:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) )
            {
            // InternalIoTParser.g:2731:2: ( ( () otherlv_1= Reduce ) | ( () otherlv_3= Mean ) | ( () otherlv_5= Median ) | ( () otherlv_7= Stdev ) | ( () otherlv_9= Min ) | ( () otherlv_11= Max ) | ( () otherlv_13= Count ) | ( () otherlv_15= Var ) )
            int alt38=8;
            switch ( input.LA(1) ) {
            case Reduce:
                {
                alt38=1;
                }
                break;
            case Mean:
                {
                alt38=2;
                }
                break;
            case Median:
                {
                alt38=3;
                }
                break;
            case Stdev:
                {
                alt38=4;
                }
                break;
            case Min:
                {
                alt38=5;
                }
                break;
            case Max:
                {
                alt38=6;
                }
                break;
            case Count:
                {
                alt38=7;
                }
                break;
            case Var:
                {
                alt38=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalIoTParser.g:2732:3: ( () otherlv_1= Reduce )
                    {
                    // InternalIoTParser.g:2732:3: ( () otherlv_1= Reduce )
                    // InternalIoTParser.g:2733:4: () otherlv_1= Reduce
                    {
                    // InternalIoTParser.g:2733:4: ()
                    // InternalIoTParser.g:2734:5: 
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
                    // InternalIoTParser.g:2746:3: ( () otherlv_3= Mean )
                    {
                    // InternalIoTParser.g:2746:3: ( () otherlv_3= Mean )
                    // InternalIoTParser.g:2747:4: () otherlv_3= Mean
                    {
                    // InternalIoTParser.g:2747:4: ()
                    // InternalIoTParser.g:2748:5: 
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
                    // InternalIoTParser.g:2760:3: ( () otherlv_5= Median )
                    {
                    // InternalIoTParser.g:2760:3: ( () otherlv_5= Median )
                    // InternalIoTParser.g:2761:4: () otherlv_5= Median
                    {
                    // InternalIoTParser.g:2761:4: ()
                    // InternalIoTParser.g:2762:5: 
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
                    // InternalIoTParser.g:2774:3: ( () otherlv_7= Stdev )
                    {
                    // InternalIoTParser.g:2774:3: ( () otherlv_7= Stdev )
                    // InternalIoTParser.g:2775:4: () otherlv_7= Stdev
                    {
                    // InternalIoTParser.g:2775:4: ()
                    // InternalIoTParser.g:2776:5: 
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
                    // InternalIoTParser.g:2788:3: ( () otherlv_9= Min )
                    {
                    // InternalIoTParser.g:2788:3: ( () otherlv_9= Min )
                    // InternalIoTParser.g:2789:4: () otherlv_9= Min
                    {
                    // InternalIoTParser.g:2789:4: ()
                    // InternalIoTParser.g:2790:5: 
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
                    // InternalIoTParser.g:2802:3: ( () otherlv_11= Max )
                    {
                    // InternalIoTParser.g:2802:3: ( () otherlv_11= Max )
                    // InternalIoTParser.g:2803:4: () otherlv_11= Max
                    {
                    // InternalIoTParser.g:2803:4: ()
                    // InternalIoTParser.g:2804:5: 
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
                    // InternalIoTParser.g:2816:3: ( () otherlv_13= Count )
                    {
                    // InternalIoTParser.g:2816:3: ( () otherlv_13= Count )
                    // InternalIoTParser.g:2817:4: () otherlv_13= Count
                    {
                    // InternalIoTParser.g:2817:4: ()
                    // InternalIoTParser.g:2818:5: 
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
                    // InternalIoTParser.g:2830:3: ( () otherlv_15= Var )
                    {
                    // InternalIoTParser.g:2830:3: ( () otherlv_15= Var )
                    // InternalIoTParser.g:2831:4: () otherlv_15= Var
                    {
                    // InternalIoTParser.g:2831:4: ()
                    // InternalIoTParser.g:2832:5: 
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
    // InternalIoTParser.g:2847:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalIoTParser.g:2847:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalIoTParser.g:2848:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalIoTParser.g:2854:1: ruleExpression returns [EObject current=null] : this_Conditional_0= ruleConditional ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Conditional_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2860:2: (this_Conditional_0= ruleConditional )
            // InternalIoTParser.g:2861:2: this_Conditional_0= ruleConditional
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
    // InternalIoTParser.g:2872:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalIoTParser.g:2872:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalIoTParser.g:2873:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalIoTParser.g:2879:1: ruleConditional returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Or_0 = null;

        EObject lv_correct_3_0 = null;

        EObject lv_incorrect_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2885:2: ( (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) )
            // InternalIoTParser.g:2886:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            {
            // InternalIoTParser.g:2886:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            // InternalIoTParser.g:2887:3: this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            {

            			newCompositeNode(grammarAccess.getConditionalAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2895:3: ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==QuestionMark) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalIoTParser.g:2896:4: () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) )
                    {
                    // InternalIoTParser.g:2896:4: ()
                    // InternalIoTParser.g:2897:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getConditionalAccess().getConditionalConditionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,QuestionMark,FOLLOW_48); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getQuestionMarkKeyword_1_1());
                    			
                    // InternalIoTParser.g:2907:4: ( (lv_correct_3_0= ruleConditional ) )
                    // InternalIoTParser.g:2908:5: (lv_correct_3_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2908:5: (lv_correct_3_0= ruleConditional )
                    // InternalIoTParser.g:2909:6: lv_correct_3_0= ruleConditional
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

                    otherlv_4=(Token)match(input,Colon,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getColonKeyword_1_3());
                    			
                    // InternalIoTParser.g:2930:4: ( (lv_incorrect_5_0= ruleConditional ) )
                    // InternalIoTParser.g:2931:5: (lv_incorrect_5_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2931:5: (lv_incorrect_5_0= ruleConditional )
                    // InternalIoTParser.g:2932:6: lv_incorrect_5_0= ruleConditional
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
    // InternalIoTParser.g:2954:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalIoTParser.g:2954:43: (iv_ruleOr= ruleOr EOF )
            // InternalIoTParser.g:2955:2: iv_ruleOr= ruleOr EOF
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
    // InternalIoTParser.g:2961:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2967:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) )
            // InternalIoTParser.g:2968:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            {
            // InternalIoTParser.g:2968:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            // InternalIoTParser.g:2969:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2977:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==VerticalLineVerticalLine) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalIoTParser.g:2978:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) )
                    {
                    // InternalIoTParser.g:2978:4: ()
                    // InternalIoTParser.g:2979:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_48); 

                    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
                    			
                    // InternalIoTParser.g:2989:4: ( (lv_right_3_0= ruleOr ) )
                    // InternalIoTParser.g:2990:5: (lv_right_3_0= ruleOr )
                    {
                    // InternalIoTParser.g:2990:5: (lv_right_3_0= ruleOr )
                    // InternalIoTParser.g:2991:6: lv_right_3_0= ruleOr
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
    // InternalIoTParser.g:3013:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalIoTParser.g:3013:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalIoTParser.g:3014:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalIoTParser.g:3020:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3026:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) )
            // InternalIoTParser.g:3027:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            {
            // InternalIoTParser.g:3027:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            // InternalIoTParser.g:3028:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3036:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==AmpersandAmpersand) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalIoTParser.g:3037:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) )
                    {
                    // InternalIoTParser.g:3037:4: ()
                    // InternalIoTParser.g:3038:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_48); 

                    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalIoTParser.g:3048:4: ( (lv_right_3_0= ruleAnd ) )
                    // InternalIoTParser.g:3049:5: (lv_right_3_0= ruleAnd )
                    {
                    // InternalIoTParser.g:3049:5: (lv_right_3_0= ruleAnd )
                    // InternalIoTParser.g:3050:6: lv_right_3_0= ruleAnd
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
    // InternalIoTParser.g:3072:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalIoTParser.g:3072:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalIoTParser.g:3073:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalIoTParser.g:3079:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3085:2: ( (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) )
            // InternalIoTParser.g:3086:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            {
            // InternalIoTParser.g:3086:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            // InternalIoTParser.g:3087:3: this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3095:3: ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==EqualsSignEqualsSign) ) {
                    alt42=1;
                }
                else if ( (LA42_0==ExclamationMarkEqualsSign) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalIoTParser.g:3096:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:3096:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:3097:5: () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:3097:5: ()
            	    // InternalIoTParser.g:3098:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_48); 

            	    					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3108:5: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalIoTParser.g:3109:6: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:3109:6: (lv_right_3_0= ruleComparison )
            	    // InternalIoTParser.g:3110:7: lv_right_3_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
            	    // InternalIoTParser.g:3129:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:3129:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:3130:5: () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:3130:5: ()
            	    // InternalIoTParser.g:3131:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_48); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3141:5: ( (lv_right_6_0= ruleComparison ) )
            	    // InternalIoTParser.g:3142:6: (lv_right_6_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:3142:6: (lv_right_6_0= ruleComparison )
            	    // InternalIoTParser.g:3143:7: lv_right_6_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalIoTParser.g:3166:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalIoTParser.g:3166:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalIoTParser.g:3167:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalIoTParser.g:3173:1: ruleComparison returns [EObject current=null] : (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) ;
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
            // InternalIoTParser.g:3179:2: ( (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) )
            // InternalIoTParser.g:3180:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            {
            // InternalIoTParser.g:3180:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            // InternalIoTParser.g:3181:3: this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getSubAddParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
            this_SubAdd_0=ruleSubAdd();

            state._fsp--;


            			current = this_SubAdd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3189:3: ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            loop43:
            do {
                int alt43=5;
                switch ( input.LA(1) ) {
                case LessThanSign:
                    {
                    alt43=1;
                    }
                    break;
                case LessThanSignEqualsSign:
                    {
                    alt43=2;
                    }
                    break;
                case GreaterThanSign:
                    {
                    alt43=3;
                    }
                    break;
                case GreaterThanSignEqualsSign:
                    {
                    alt43=4;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // InternalIoTParser.g:3190:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3190:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3191:5: () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3191:5: ()
            	    // InternalIoTParser.g:3192:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,LessThanSign,FOLLOW_48); 

            	    					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3202:5: ( (lv_right_3_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3203:6: (lv_right_3_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3203:6: (lv_right_3_0= ruleSubAdd )
            	    // InternalIoTParser.g:3204:7: lv_right_3_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_55);
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
            	    // InternalIoTParser.g:3223:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3223:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3224:5: () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3224:5: ()
            	    // InternalIoTParser.g:3225:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,LessThanSignEqualsSign,FOLLOW_48); 

            	    					newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3235:5: ( (lv_right_6_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3236:6: (lv_right_6_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3236:6: (lv_right_6_0= ruleSubAdd )
            	    // InternalIoTParser.g:3237:7: lv_right_6_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_55);
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
            	    // InternalIoTParser.g:3256:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3256:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3257:5: () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3257:5: ()
            	    // InternalIoTParser.g:3258:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,GreaterThanSign,FOLLOW_48); 

            	    					newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_2_1());
            	    				
            	    // InternalIoTParser.g:3268:5: ( (lv_right_9_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3269:6: (lv_right_9_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3269:6: (lv_right_9_0= ruleSubAdd )
            	    // InternalIoTParser.g:3270:7: lv_right_9_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_55);
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
            	    // InternalIoTParser.g:3289:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3289:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3290:5: () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3290:5: ()
            	    // InternalIoTParser.g:3291:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_48); 

            	    					newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalIoTParser.g:3301:5: ( (lv_right_12_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3302:6: (lv_right_12_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3302:6: (lv_right_12_0= ruleSubAdd )
            	    // InternalIoTParser.g:3303:7: lv_right_12_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_55);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleSubAdd"
    // InternalIoTParser.g:3326:1: entryRuleSubAdd returns [EObject current=null] : iv_ruleSubAdd= ruleSubAdd EOF ;
    public final EObject entryRuleSubAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAdd = null;


        try {
            // InternalIoTParser.g:3326:47: (iv_ruleSubAdd= ruleSubAdd EOF )
            // InternalIoTParser.g:3327:2: iv_ruleSubAdd= ruleSubAdd EOF
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
    // InternalIoTParser.g:3333:1: ruleSubAdd returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) ;
    public final EObject ruleSubAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3339:2: ( (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) )
            // InternalIoTParser.g:3340:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            {
            // InternalIoTParser.g:3340:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            // InternalIoTParser.g:3341:3: this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubAddAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_56);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3349:3: ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==PlusSign) ) {
                    alt44=1;
                }
                else if ( (LA44_0==HyphenMinus) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalIoTParser.g:3350:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:3350:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:3351:5: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:3351:5: ()
            	    // InternalIoTParser.g:3352:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_48); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSubAddAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3362:5: ( (lv_right_3_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:3363:6: (lv_right_3_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:3363:6: (lv_right_3_0= ruleMulDiv )
            	    // InternalIoTParser.g:3364:7: lv_right_3_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_56);
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
            	    // InternalIoTParser.g:3383:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:3383:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:3384:5: () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:3384:5: ()
            	    // InternalIoTParser.g:3385:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,HyphenMinus,FOLLOW_48); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSubAddAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3395:5: ( (lv_right_6_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:3396:6: (lv_right_6_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:3396:6: (lv_right_6_0= ruleMulDiv )
            	    // InternalIoTParser.g:3397:7: lv_right_6_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_56);
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
            	    break loop44;
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
    // InternalIoTParser.g:3420:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalIoTParser.g:3420:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalIoTParser.g:3421:2: iv_ruleMulDiv= ruleMulDiv EOF
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
    // InternalIoTParser.g:3427:1: ruleMulDiv returns [EObject current=null] : (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3433:2: ( (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) )
            // InternalIoTParser.g:3434:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            {
            // InternalIoTParser.g:3434:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            // InternalIoTParser.g:3435:3: this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_57);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3443:3: ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Asterisk) ) {
                    alt45=1;
                }
                else if ( (LA45_0==Solidus) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalIoTParser.g:3444:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:3444:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:3445:5: () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:3445:5: ()
            	    // InternalIoTParser.g:3446:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_48); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3456:5: ( (lv_right_3_0= ruleNegation ) )
            	    // InternalIoTParser.g:3457:6: (lv_right_3_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:3457:6: (lv_right_3_0= ruleNegation )
            	    // InternalIoTParser.g:3458:7: lv_right_3_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_57);
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
            	    // InternalIoTParser.g:3477:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:3477:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:3478:5: () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:3478:5: ()
            	    // InternalIoTParser.g:3479:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,Solidus,FOLLOW_48); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMulDivAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3489:5: ( (lv_right_6_0= ruleNegation ) )
            	    // InternalIoTParser.g:3490:6: (lv_right_6_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:3490:6: (lv_right_6_0= ruleNegation )
            	    // InternalIoTParser.g:3491:7: lv_right_6_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_57);
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
            	    break loop45;
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
    // InternalIoTParser.g:3514:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalIoTParser.g:3514:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalIoTParser.g:3515:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalIoTParser.g:3521:1: ruleNegation returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Exponent_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3527:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) )
            // InternalIoTParser.g:3528:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            {
            // InternalIoTParser.g:3528:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==HyphenMinus) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=ExclamationMark && LA46_0<=LeftParenthesis)||(LA46_0>=RULE_INT && LA46_0<=RULE_BOOLEAN)||(LA46_0>=RULE_ID && LA46_0<=RULE_STRING)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalIoTParser.g:3529:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    {
                    // InternalIoTParser.g:3529:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    // InternalIoTParser.g:3530:4: () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) )
                    {
                    // InternalIoTParser.g:3530:4: ()
                    // InternalIoTParser.g:3531:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_48); 

                    				newLeafNode(otherlv_1, grammarAccess.getNegationAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalIoTParser.g:3541:4: ( (lv_value_2_0= ruleExponent ) )
                    // InternalIoTParser.g:3542:5: (lv_value_2_0= ruleExponent )
                    {
                    // InternalIoTParser.g:3542:5: (lv_value_2_0= ruleExponent )
                    // InternalIoTParser.g:3543:6: lv_value_2_0= ruleExponent
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
                    // InternalIoTParser.g:3562:3: this_Exponent_3= ruleExponent
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
    // InternalIoTParser.g:3574:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalIoTParser.g:3574:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalIoTParser.g:3575:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalIoTParser.g:3581:1: ruleExponent returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_power_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3587:2: ( (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) )
            // InternalIoTParser.g:3588:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            {
            // InternalIoTParser.g:3588:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            // InternalIoTParser.g:3589:3: this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            {

            			newCompositeNode(grammarAccess.getExponentAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_58);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3597:3: ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==AsteriskAsterisk) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalIoTParser.g:3598:4: () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) )
                    {
                    // InternalIoTParser.g:3598:4: ()
                    // InternalIoTParser.g:3599:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExponentAccess().getExponentBaseAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AsteriskAsterisk,FOLLOW_48); 

                    				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
                    			
                    // InternalIoTParser.g:3609:4: ( (lv_power_3_0= ruleNegation ) )
                    // InternalIoTParser.g:3610:5: (lv_power_3_0= ruleNegation )
                    {
                    // InternalIoTParser.g:3610:5: (lv_power_3_0= ruleNegation )
                    // InternalIoTParser.g:3611:6: lv_power_3_0= ruleNegation
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
    // InternalIoTParser.g:3633:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalIoTParser.g:3633:44: (iv_ruleNot= ruleNot EOF )
            // InternalIoTParser.g:3634:2: iv_ruleNot= ruleNot EOF
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
    // InternalIoTParser.g:3640:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Primary_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3646:2: ( ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) )
            // InternalIoTParser.g:3647:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            {
            // InternalIoTParser.g:3647:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ExclamationMark) ) {
                alt48=1;
            }
            else if ( (LA48_0==LeftParenthesis||(LA48_0>=RULE_INT && LA48_0<=RULE_BOOLEAN)||(LA48_0>=RULE_ID && LA48_0<=RULE_STRING)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalIoTParser.g:3648:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    {
                    // InternalIoTParser.g:3648:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    // InternalIoTParser.g:3649:4: () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) )
                    {
                    // InternalIoTParser.g:3649:4: ()
                    // InternalIoTParser.g:3650:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_48); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_1());
                    			
                    // InternalIoTParser.g:3660:4: ( (lv_value_2_0= rulePrimary ) )
                    // InternalIoTParser.g:3661:5: (lv_value_2_0= rulePrimary )
                    {
                    // InternalIoTParser.g:3661:5: (lv_value_2_0= rulePrimary )
                    // InternalIoTParser.g:3662:6: lv_value_2_0= rulePrimary
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
                    // InternalIoTParser.g:3681:3: this_Primary_3= rulePrimary
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
    // InternalIoTParser.g:3693:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalIoTParser.g:3693:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalIoTParser.g:3694:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalIoTParser.g:3700:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) ;
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
            // InternalIoTParser.g:3706:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) )
            // InternalIoTParser.g:3707:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            {
            // InternalIoTParser.g:3707:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            int alt49=5;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt49=1;
                }
                break;
            case RULE_ID:
                {
                alt49=2;
                }
                break;
            case RULE_INT:
            case RULE_NINT:
            case RULE_DBL:
            case RULE_NDBL:
                {
                alt49=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt49=4;
                }
                break;
            case RULE_STRING:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalIoTParser.g:3708:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalIoTParser.g:3708:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalIoTParser.g:3709:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_48); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_59);
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
                    // InternalIoTParser.g:3727:3: this_Reference_3= ruleReference
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
                    // InternalIoTParser.g:3736:3: this_NumberLiteral_4= ruleNumberLiteral
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
                    // InternalIoTParser.g:3745:3: this_BooleanLiteral_5= ruleBooleanLiteral
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
                    // InternalIoTParser.g:3754:3: this_StringLiteral_6= ruleStringLiteral
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
    // InternalIoTParser.g:3766:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalIoTParser.g:3766:50: (iv_ruleReference= ruleReference EOF )
            // InternalIoTParser.g:3767:2: iv_ruleReference= ruleReference EOF
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
    // InternalIoTParser.g:3773:1: ruleReference returns [EObject current=null] : ( (lv_ref_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3779:2: ( ( (lv_ref_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:3780:2: ( (lv_ref_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:3780:2: ( (lv_ref_0_0= RULE_ID ) )
            // InternalIoTParser.g:3781:3: (lv_ref_0_0= RULE_ID )
            {
            // InternalIoTParser.g:3781:3: (lv_ref_0_0= RULE_ID )
            // InternalIoTParser.g:3782:4: lv_ref_0_0= RULE_ID
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
    // InternalIoTParser.g:3801:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalIoTParser.g:3801:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalIoTParser.g:3802:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalIoTParser.g:3808:1: ruleStringLiteral returns [EObject current=null] : ( (lv_str_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3814:2: ( ( (lv_str_0_0= RULE_STRING ) ) )
            // InternalIoTParser.g:3815:2: ( (lv_str_0_0= RULE_STRING ) )
            {
            // InternalIoTParser.g:3815:2: ( (lv_str_0_0= RULE_STRING ) )
            // InternalIoTParser.g:3816:3: (lv_str_0_0= RULE_STRING )
            {
            // InternalIoTParser.g:3816:3: (lv_str_0_0= RULE_STRING )
            // InternalIoTParser.g:3817:4: lv_str_0_0= RULE_STRING
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
    // InternalIoTParser.g:3836:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalIoTParser.g:3836:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalIoTParser.g:3837:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalIoTParser.g:3843:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_numb_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numb_0_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3849:2: ( ( (lv_numb_0_0= ruleNUMBER ) ) )
            // InternalIoTParser.g:3850:2: ( (lv_numb_0_0= ruleNUMBER ) )
            {
            // InternalIoTParser.g:3850:2: ( (lv_numb_0_0= ruleNUMBER ) )
            // InternalIoTParser.g:3851:3: (lv_numb_0_0= ruleNUMBER )
            {
            // InternalIoTParser.g:3851:3: (lv_numb_0_0= ruleNUMBER )
            // InternalIoTParser.g:3852:4: lv_numb_0_0= ruleNUMBER
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
    // InternalIoTParser.g:3872:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalIoTParser.g:3872:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalIoTParser.g:3873:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalIoTParser.g:3879:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_bool_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bool_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3885:2: ( ( (lv_bool_0_0= RULE_BOOLEAN ) ) )
            // InternalIoTParser.g:3886:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            {
            // InternalIoTParser.g:3886:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            // InternalIoTParser.g:3887:3: (lv_bool_0_0= RULE_BOOLEAN )
            {
            // InternalIoTParser.g:3887:3: (lv_bool_0_0= RULE_BOOLEAN )
            // InternalIoTParser.g:3888:4: lv_bool_0_0= RULE_BOOLEAN
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
    // InternalIoTParser.g:3907:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3909:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalIoTParser.g:3910:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalIoTParser.g:3919:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DBL_1=null;
        Token this_NINT_2=null;
        Token this_NDBL_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3926:2: ( (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL ) )
            // InternalIoTParser.g:3927:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL )
            {
            // InternalIoTParser.g:3927:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL )
            int alt50=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt50=1;
                }
                break;
            case RULE_DBL:
                {
                alt50=2;
                }
                break;
            case RULE_NINT:
                {
                alt50=3;
                }
                break;
            case RULE_NDBL:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalIoTParser.g:3928:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:3936:3: this_DBL_1= RULE_DBL
                    {
                    this_DBL_1=(Token)match(input,RULE_DBL,FOLLOW_2); 

                    			current.merge(this_DBL_1);
                    		

                    			newLeafNode(this_DBL_1, grammarAccess.getNUMBERAccess().getDBLTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:3944:3: this_NINT_2= RULE_NINT
                    {
                    this_NINT_2=(Token)match(input,RULE_NINT,FOLLOW_2); 

                    			current.merge(this_NINT_2);
                    		

                    			newLeafNode(this_NINT_2, grammarAccess.getNUMBERAccess().getNINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:3952:3: this_NDBL_3= RULE_NDBL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000202682L,0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000200682L,0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200682L,0x0000000000020000L});
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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0040000008008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000100000L,0x0000000000000200L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100100080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100100080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000014000010100L,0x0000000000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4300000000000000L,0x0000000000067C00L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000E0042460000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004200000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000A000000000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x5000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});

}