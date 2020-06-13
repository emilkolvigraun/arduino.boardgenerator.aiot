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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Microseconds", "Milliseconds", "Abstract", "ByWindow", "Function", "Interval", "Channel", "Command", "Extends", "Include", "Seconds", "Broker", "Median", "Sample", "Sensor", "Board", "Model", "Route", "Topic", "Baud", "Mean", "Pass", "Pipe", "Port", "Ssid", "Type", "Wifi", "And", "Map", "Max", "Min", "Vcc", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "SD", "As", "Id", "Ip", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_NINT", "RULE_DBL", "RULE_NDBL", "RULE_BOOLEAN", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    // InternalIoTParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) ) | ( (lv_wifiConfig_1_0= ruleWifiConfig ) ) | ( (lv_channel_2_0= ruleChannel ) ) | ( (lv_function_3_0= ruleFunction ) ) | ( (lv_abstractBoard_4_0= ruleAbstractBoard ) ) | ( (lv_board_5_0= ruleBoard ) ) )* ;
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
            // InternalIoTParser.g:70:2: ( ( ( (lv_includes_0_0= ruleInclude ) ) | ( (lv_wifiConfig_1_0= ruleWifiConfig ) ) | ( (lv_channel_2_0= ruleChannel ) ) | ( (lv_function_3_0= ruleFunction ) ) | ( (lv_abstractBoard_4_0= ruleAbstractBoard ) ) | ( (lv_board_5_0= ruleBoard ) ) )* )
            // InternalIoTParser.g:71:2: ( ( (lv_includes_0_0= ruleInclude ) ) | ( (lv_wifiConfig_1_0= ruleWifiConfig ) ) | ( (lv_channel_2_0= ruleChannel ) ) | ( (lv_function_3_0= ruleFunction ) ) | ( (lv_abstractBoard_4_0= ruleAbstractBoard ) ) | ( (lv_board_5_0= ruleBoard ) ) )*
            {
            // InternalIoTParser.g:71:2: ( ( (lv_includes_0_0= ruleInclude ) ) | ( (lv_wifiConfig_1_0= ruleWifiConfig ) ) | ( (lv_channel_2_0= ruleChannel ) ) | ( (lv_function_3_0= ruleFunction ) ) | ( (lv_abstractBoard_4_0= ruleAbstractBoard ) ) | ( (lv_board_5_0= ruleBoard ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case Include:
                    {
                    alt1=1;
                    }
                    break;
                case Wifi:
                    {
                    alt1=2;
                    }
                    break;
                case Channel:
                case RULE_ID:
                    {
                    alt1=3;
                    }
                    break;
                case Function:
                    {
                    alt1=4;
                    }
                    break;
                case Abstract:
                    {
                    alt1=5;
                    }
                    break;
                case Board:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalIoTParser.g:72:3: ( (lv_includes_0_0= ruleInclude ) )
            	    {
            	    // InternalIoTParser.g:72:3: ( (lv_includes_0_0= ruleInclude ) )
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


            	    }
            	    break;
            	case 2 :
            	    // InternalIoTParser.g:92:3: ( (lv_wifiConfig_1_0= ruleWifiConfig ) )
            	    {
            	    // InternalIoTParser.g:92:3: ( (lv_wifiConfig_1_0= ruleWifiConfig ) )
            	    // InternalIoTParser.g:93:4: (lv_wifiConfig_1_0= ruleWifiConfig )
            	    {
            	    // InternalIoTParser.g:93:4: (lv_wifiConfig_1_0= ruleWifiConfig )
            	    // InternalIoTParser.g:94:5: lv_wifiConfig_1_0= ruleWifiConfig
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getWifiConfigWifiConfigParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
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


            	    }
            	    break;
            	case 3 :
            	    // InternalIoTParser.g:112:3: ( (lv_channel_2_0= ruleChannel ) )
            	    {
            	    // InternalIoTParser.g:112:3: ( (lv_channel_2_0= ruleChannel ) )
            	    // InternalIoTParser.g:113:4: (lv_channel_2_0= ruleChannel )
            	    {
            	    // InternalIoTParser.g:113:4: (lv_channel_2_0= ruleChannel )
            	    // InternalIoTParser.g:114:5: lv_channel_2_0= ruleChannel
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getChannelChannelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
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


            	    }
            	    break;
            	case 4 :
            	    // InternalIoTParser.g:132:3: ( (lv_function_3_0= ruleFunction ) )
            	    {
            	    // InternalIoTParser.g:132:3: ( (lv_function_3_0= ruleFunction ) )
            	    // InternalIoTParser.g:133:4: (lv_function_3_0= ruleFunction )
            	    {
            	    // InternalIoTParser.g:133:4: (lv_function_3_0= ruleFunction )
            	    // InternalIoTParser.g:134:5: lv_function_3_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFunctionFunctionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
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


            	    }
            	    break;
            	case 5 :
            	    // InternalIoTParser.g:152:3: ( (lv_abstractBoard_4_0= ruleAbstractBoard ) )
            	    {
            	    // InternalIoTParser.g:152:3: ( (lv_abstractBoard_4_0= ruleAbstractBoard ) )
            	    // InternalIoTParser.g:153:4: (lv_abstractBoard_4_0= ruleAbstractBoard )
            	    {
            	    // InternalIoTParser.g:153:4: (lv_abstractBoard_4_0= ruleAbstractBoard )
            	    // InternalIoTParser.g:154:5: lv_abstractBoard_4_0= ruleAbstractBoard
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAbstractBoardAbstractBoardParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
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


            	    }
            	    break;
            	case 6 :
            	    // InternalIoTParser.g:172:3: ( (lv_board_5_0= ruleBoard ) )
            	    {
            	    // InternalIoTParser.g:172:3: ( (lv_board_5_0= ruleBoard ) )
            	    // InternalIoTParser.g:173:4: (lv_board_5_0= ruleBoard )
            	    {
            	    // InternalIoTParser.g:173:4: (lv_board_5_0= ruleBoard )
            	    // InternalIoTParser.g:174:5: lv_board_5_0= ruleBoard
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalIoTParser.g:195:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalIoTParser.g:195:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalIoTParser.g:196:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalIoTParser.g:202:1: ruleInclude returns [EObject current=null] : (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_importURI_3_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:208:2: ( (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* ) )
            // InternalIoTParser.g:209:2: (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* )
            {
            // InternalIoTParser.g:209:2: (otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )* )
            // InternalIoTParser.g:210:3: otherlv_0= Include ( (lv_importURI_1_0= RULE_ID ) ) (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Include,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalIoTParser.g:214:3: ( (lv_importURI_1_0= RULE_ID ) )
            // InternalIoTParser.g:215:4: (lv_importURI_1_0= RULE_ID )
            {
            // InternalIoTParser.g:215:4: (lv_importURI_1_0= RULE_ID )
            // InternalIoTParser.g:216:5: lv_importURI_1_0= RULE_ID
            {
            lv_importURI_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalIoTParser.g:232:3: (otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FullStop) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIoTParser.g:233:4: otherlv_2= FullStop ( (lv_importURI_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,FullStop,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalIoTParser.g:237:4: ( (lv_importURI_3_0= RULE_ID ) )
            	    // InternalIoTParser.g:238:5: (lv_importURI_3_0= RULE_ID )
            	    {
            	    // InternalIoTParser.g:238:5: (lv_importURI_3_0= RULE_ID )
            	    // InternalIoTParser.g:239:6: lv_importURI_3_0= RULE_ID
            	    {
            	    lv_importURI_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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
            	    break loop2;
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
    // InternalIoTParser.g:260:1: entryRuleWifiConfig returns [EObject current=null] : iv_ruleWifiConfig= ruleWifiConfig EOF ;
    public final EObject entryRuleWifiConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWifiConfig = null;


        try {
            // InternalIoTParser.g:260:51: (iv_ruleWifiConfig= ruleWifiConfig EOF )
            // InternalIoTParser.g:261:2: iv_ruleWifiConfig= ruleWifiConfig EOF
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
    // InternalIoTParser.g:267:1: ruleWifiConfig returns [EObject current=null] : (otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END ) ;
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
            // InternalIoTParser.g:273:2: ( (otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END ) )
            // InternalIoTParser.g:274:2: (otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END )
            {
            // InternalIoTParser.g:274:2: (otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END )
            // InternalIoTParser.g:275:3: otherlv_0= Wifi ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Ssid ( (lv_ssid_5_0= RULE_STRING ) ) (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )? this_END_8= RULE_END
            {
            otherlv_0=(Token)match(input,Wifi,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWifiConfigAccess().getWifiKeyword_0());
            		
            // InternalIoTParser.g:279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:280:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWifiConfigAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getWifiConfigAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Ssid,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getWifiConfigAccess().getSsidKeyword_4());
            		
            // InternalIoTParser.g:309:3: ( (lv_ssid_5_0= RULE_STRING ) )
            // InternalIoTParser.g:310:4: (lv_ssid_5_0= RULE_STRING )
            {
            // InternalIoTParser.g:310:4: (lv_ssid_5_0= RULE_STRING )
            // InternalIoTParser.g:311:5: lv_ssid_5_0= RULE_STRING
            {
            lv_ssid_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            // InternalIoTParser.g:327:3: (otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Pass) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIoTParser.g:328:4: otherlv_6= Pass ( (lv_pass_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,Pass,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getWifiConfigAccess().getPassKeyword_6_0());
                    			
                    // InternalIoTParser.g:332:4: ( (lv_pass_7_0= RULE_STRING ) )
                    // InternalIoTParser.g:333:5: (lv_pass_7_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:333:5: (lv_pass_7_0= RULE_STRING )
                    // InternalIoTParser.g:334:6: lv_pass_7_0= RULE_STRING
                    {
                    lv_pass_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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
    // InternalIoTParser.g:359:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalIoTParser.g:359:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalIoTParser.g:360:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalIoTParser.g:366:1: ruleChannel returns [EObject current=null] : ( ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? ) ;
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
            // InternalIoTParser.g:372:2: ( ( ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? ) )
            // InternalIoTParser.g:373:2: ( ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? )
            {
            // InternalIoTParser.g:373:2: ( ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )? )
            // InternalIoTParser.g:374:3: ( (lv_ctype_0_0= ruleChannelType ) )? otherlv_1= Channel ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )?
            {
            // InternalIoTParser.g:374:3: ( (lv_ctype_0_0= ruleChannelType ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIoTParser.g:375:4: (lv_ctype_0_0= ruleChannelType )
                    {
                    // InternalIoTParser.g:375:4: (lv_ctype_0_0= ruleChannelType )
                    // InternalIoTParser.g:376:5: lv_ctype_0_0= ruleChannelType
                    {

                    					newCompositeNode(grammarAccess.getChannelAccess().getCtypeChannelTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_12);
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

            otherlv_1=(Token)match(input,Channel,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChannelAccess().getChannelKeyword_1());
            		
            // InternalIoTParser.g:397:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoTParser.g:398:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoTParser.g:398:4: (lv_name_2_0= RULE_ID )
            // InternalIoTParser.g:399:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalIoTParser.g:415:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Colon) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoTParser.g:416:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_config_5_0= ruleChannelConfig ) ) this_END_6= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getChannelAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:424:4: ( (lv_config_5_0= ruleChannelConfig ) )
                    // InternalIoTParser.g:425:5: (lv_config_5_0= ruleChannelConfig )
                    {
                    // InternalIoTParser.g:425:5: (lv_config_5_0= ruleChannelConfig )
                    // InternalIoTParser.g:426:6: lv_config_5_0= ruleChannelConfig
                    {

                    						newCompositeNode(grammarAccess.getChannelAccess().getConfigChannelConfigParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
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
    // InternalIoTParser.g:452:1: entryRuleChannelType returns [EObject current=null] : iv_ruleChannelType= ruleChannelType EOF ;
    public final EObject entryRuleChannelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelType = null;


        try {
            // InternalIoTParser.g:452:52: (iv_ruleChannelType= ruleChannelType EOF )
            // InternalIoTParser.g:453:2: iv_ruleChannelType= ruleChannelType EOF
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
    // InternalIoTParser.g:459:1: ruleChannelType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleChannelType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:465:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:466:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:466:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:467:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:467:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:468:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:487:1: entryRuleChannelConfig returns [EObject current=null] : iv_ruleChannelConfig= ruleChannelConfig EOF ;
    public final EObject entryRuleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelConfig = null;


        try {
            // InternalIoTParser.g:487:54: (iv_ruleChannelConfig= ruleChannelConfig EOF )
            // InternalIoTParser.g:488:2: iv_ruleChannelConfig= ruleChannelConfig EOF
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
    // InternalIoTParser.g:494:1: ruleChannelConfig returns [EObject current=null] : (this_Cloud_0= ruleCloud | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) ;
    public final EObject ruleChannelConfig() throws RecognitionException {
        EObject current = null;

        EObject this_Cloud_0 = null;

        EObject this_Serial_1 = null;

        EObject this_MqttClient_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:500:2: ( (this_Cloud_0= ruleCloud | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient ) )
            // InternalIoTParser.g:501:2: (this_Cloud_0= ruleCloud | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            {
            // InternalIoTParser.g:501:2: (this_Cloud_0= ruleCloud | this_Serial_1= ruleSerial | this_MqttClient_2= ruleMqttClient )
            int alt6=3;
            switch ( input.LA(1) ) {
            case Ip:
                {
                alt6=1;
                }
                break;
            case Baud:
                {
                alt6=2;
                }
                break;
            case Broker:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalIoTParser.g:502:3: this_Cloud_0= ruleCloud
                    {

                    			newCompositeNode(grammarAccess.getChannelConfigAccess().getCloudParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cloud_0=ruleCloud();

                    state._fsp--;


                    			current = this_Cloud_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:511:3: this_Serial_1= ruleSerial
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
                    // InternalIoTParser.g:520:3: this_MqttClient_2= ruleMqttClient
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


    // $ANTLR start "entryRuleCloud"
    // InternalIoTParser.g:532:1: entryRuleCloud returns [EObject current=null] : iv_ruleCloud= ruleCloud EOF ;
    public final EObject entryRuleCloud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloud = null;


        try {
            // InternalIoTParser.g:532:46: (iv_ruleCloud= ruleCloud EOF )
            // InternalIoTParser.g:533:2: iv_ruleCloud= ruleCloud EOF
            {
             newCompositeNode(grammarAccess.getCloudRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCloud=ruleCloud();

            state._fsp--;

             current =iv_ruleCloud; 
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
    // $ANTLR end "entryRuleCloud"


    // $ANTLR start "ruleCloud"
    // InternalIoTParser.g:539:1: ruleCloud returns [EObject current=null] : (otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleCloud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_sport_3_0=null;
        Token otherlv_4=null;
        Token lv_route_5_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:545:2: ( (otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:546:2: (otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:546:2: (otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) ) )
            // InternalIoTParser.g:547:3: otherlv_0= Ip ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_sport_3_0= RULE_INT ) ) otherlv_4= Route ( (lv_route_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Ip,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCloudAccess().getIpKeyword_0());
            		
            // InternalIoTParser.g:551:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalIoTParser.g:552:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:552:4: (lv_url_1_0= RULE_STRING )
            // InternalIoTParser.g:553:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_url_1_0, grammarAccess.getCloudAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,Port,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCloudAccess().getPortKeyword_2());
            		
            // InternalIoTParser.g:573:3: ( (lv_sport_3_0= RULE_INT ) )
            // InternalIoTParser.g:574:4: (lv_sport_3_0= RULE_INT )
            {
            // InternalIoTParser.g:574:4: (lv_sport_3_0= RULE_INT )
            // InternalIoTParser.g:575:5: lv_sport_3_0= RULE_INT
            {
            lv_sport_3_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_sport_3_0, grammarAccess.getCloudAccess().getSportINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sport",
            						lv_sport_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,Route,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getCloudAccess().getRouteKeyword_4());
            		
            // InternalIoTParser.g:595:3: ( (lv_route_5_0= RULE_STRING ) )
            // InternalIoTParser.g:596:4: (lv_route_5_0= RULE_STRING )
            {
            // InternalIoTParser.g:596:4: (lv_route_5_0= RULE_STRING )
            // InternalIoTParser.g:597:5: lv_route_5_0= RULE_STRING
            {
            lv_route_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_route_5_0, grammarAccess.getCloudAccess().getRouteSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloudRule());
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
    // $ANTLR end "ruleCloud"


    // $ANTLR start "entryRuleSerial"
    // InternalIoTParser.g:617:1: entryRuleSerial returns [EObject current=null] : iv_ruleSerial= ruleSerial EOF ;
    public final EObject entryRuleSerial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerial = null;


        try {
            // InternalIoTParser.g:617:47: (iv_ruleSerial= ruleSerial EOF )
            // InternalIoTParser.g:618:2: iv_ruleSerial= ruleSerial EOF
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
    // InternalIoTParser.g:624:1: ruleSerial returns [EObject current=null] : (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSerial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_baud_1_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:630:2: ( (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) ) )
            // InternalIoTParser.g:631:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) )
            {
            // InternalIoTParser.g:631:2: (otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) ) )
            // InternalIoTParser.g:632:3: otherlv_0= Baud ( (lv_baud_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,Baud,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSerialAccess().getBaudKeyword_0());
            		
            // InternalIoTParser.g:636:3: ( (lv_baud_1_0= RULE_INT ) )
            // InternalIoTParser.g:637:4: (lv_baud_1_0= RULE_INT )
            {
            // InternalIoTParser.g:637:4: (lv_baud_1_0= RULE_INT )
            // InternalIoTParser.g:638:5: lv_baud_1_0= RULE_INT
            {
            lv_baud_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMqttClient"
    // InternalIoTParser.g:658:1: entryRuleMqttClient returns [EObject current=null] : iv_ruleMqttClient= ruleMqttClient EOF ;
    public final EObject entryRuleMqttClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMqttClient = null;


        try {
            // InternalIoTParser.g:658:51: (iv_ruleMqttClient= ruleMqttClient EOF )
            // InternalIoTParser.g:659:2: iv_ruleMqttClient= ruleMqttClient EOF
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
    // InternalIoTParser.g:665:1: ruleMqttClient returns [EObject current=null] : (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) ) ;
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
            // InternalIoTParser.g:671:2: ( (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) ) )
            // InternalIoTParser.g:672:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) )
            {
            // InternalIoTParser.g:672:2: (otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) ) )
            // InternalIoTParser.g:673:3: otherlv_0= Broker ( (lv_broker_1_0= RULE_STRING ) ) otherlv_2= Port ( (lv_port_3_0= RULE_INT ) ) otherlv_4= Id ( (lv_client_5_0= RULE_STRING ) ) otherlv_6= Topic ( (lv_pub_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Broker,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMqttClientAccess().getBrokerKeyword_0());
            		
            // InternalIoTParser.g:677:3: ( (lv_broker_1_0= RULE_STRING ) )
            // InternalIoTParser.g:678:4: (lv_broker_1_0= RULE_STRING )
            {
            // InternalIoTParser.g:678:4: (lv_broker_1_0= RULE_STRING )
            // InternalIoTParser.g:679:5: lv_broker_1_0= RULE_STRING
            {
            lv_broker_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,Port,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMqttClientAccess().getPortKeyword_2());
            		
            // InternalIoTParser.g:699:3: ( (lv_port_3_0= RULE_INT ) )
            // InternalIoTParser.g:700:4: (lv_port_3_0= RULE_INT )
            {
            // InternalIoTParser.g:700:4: (lv_port_3_0= RULE_INT )
            // InternalIoTParser.g:701:5: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            otherlv_4=(Token)match(input,Id,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getMqttClientAccess().getIdKeyword_4());
            		
            // InternalIoTParser.g:721:3: ( (lv_client_5_0= RULE_STRING ) )
            // InternalIoTParser.g:722:4: (lv_client_5_0= RULE_STRING )
            {
            // InternalIoTParser.g:722:4: (lv_client_5_0= RULE_STRING )
            // InternalIoTParser.g:723:5: lv_client_5_0= RULE_STRING
            {
            lv_client_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            otherlv_6=(Token)match(input,Topic,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getMqttClientAccess().getTopicKeyword_6());
            		
            // InternalIoTParser.g:743:3: ( (lv_pub_7_0= RULE_STRING ) )
            // InternalIoTParser.g:744:4: (lv_pub_7_0= RULE_STRING )
            {
            // InternalIoTParser.g:744:4: (lv_pub_7_0= RULE_STRING )
            // InternalIoTParser.g:745:5: lv_pub_7_0= RULE_STRING
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
    // InternalIoTParser.g:765:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalIoTParser.g:765:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalIoTParser.g:766:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalIoTParser.g:772:1: ruleFunction returns [EObject current=null] : (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis ) ;
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
            // InternalIoTParser.g:778:2: ( (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis ) )
            // InternalIoTParser.g:779:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis )
            {
            // InternalIoTParser.g:779:2: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis )
            // InternalIoTParser.g:780:3: otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_input_3_0= ruleFunctionInputType ) ) (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )* otherlv_6= RightParenthesis otherlv_7= HyphenMinusGreaterThanSign otherlv_8= LeftParenthesis ( (lv_output_9_0= RULE_ID ) ) (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )* otherlv_12= RightParenthesis
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalIoTParser.g:784:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:785:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:785:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:786:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalIoTParser.g:806:3: ( (lv_input_3_0= ruleFunctionInputType ) )
            // InternalIoTParser.g:807:4: (lv_input_3_0= ruleFunctionInputType )
            {
            // InternalIoTParser.g:807:4: (lv_input_3_0= ruleFunctionInputType )
            // InternalIoTParser.g:808:5: lv_input_3_0= ruleFunctionInputType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getInputFunctionInputTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalIoTParser.g:825:3: (otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIoTParser.g:826:4: otherlv_4= Comma ( (lv_input_5_0= ruleFunctionInputType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIoTParser.g:830:4: ( (lv_input_5_0= ruleFunctionInputType ) )
            	    // InternalIoTParser.g:831:5: (lv_input_5_0= ruleFunctionInputType )
            	    {
            	    // InternalIoTParser.g:831:5: (lv_input_5_0= ruleFunctionInputType )
            	    // InternalIoTParser.g:832:6: lv_input_5_0= ruleFunctionInputType
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionAccess().getInputFunctionInputTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_7());
            		
            // InternalIoTParser.g:862:3: ( (lv_output_9_0= RULE_ID ) )
            // InternalIoTParser.g:863:4: (lv_output_9_0= RULE_ID )
            {
            // InternalIoTParser.g:863:4: (lv_output_9_0= RULE_ID )
            // InternalIoTParser.g:864:5: lv_output_9_0= RULE_ID
            {
            lv_output_9_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            // InternalIoTParser.g:880:3: (otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIoTParser.g:881:4: otherlv_10= Comma ( (lv_output_11_0= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,Comma,FOLLOW_4); 

            	    				newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalIoTParser.g:885:4: ( (lv_output_11_0= RULE_ID ) )
            	    // InternalIoTParser.g:886:5: (lv_output_11_0= RULE_ID )
            	    {
            	    // InternalIoTParser.g:886:5: (lv_output_11_0= RULE_ID )
            	    // InternalIoTParser.g:887:6: lv_output_11_0= RULE_ID
            	    {
            	    lv_output_11_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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
            	    break loop8;
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
    // InternalIoTParser.g:912:1: entryRuleFunctionInputType returns [EObject current=null] : iv_ruleFunctionInputType= ruleFunctionInputType EOF ;
    public final EObject entryRuleFunctionInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionInputType = null;


        try {
            // InternalIoTParser.g:912:58: (iv_ruleFunctionInputType= ruleFunctionInputType EOF )
            // InternalIoTParser.g:913:2: iv_ruleFunctionInputType= ruleFunctionInputType EOF
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
    // InternalIoTParser.g:919:1: ruleFunctionInputType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionInputType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:925:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:926:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:926:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:927:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:927:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:928:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:947:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalIoTParser.g:947:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalIoTParser.g:948:2: iv_ruleBoard= ruleBoard EOF
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
    // InternalIoTParser.g:954:1: ruleBoard returns [EObject current=null] : (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NewBoard_1 = null;

        EObject this_ExtendsBoard_2 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:960:2: ( (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) ) )
            // InternalIoTParser.g:961:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            {
            // InternalIoTParser.g:961:2: (otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard ) )
            // InternalIoTParser.g:962:3: otherlv_0= Board (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            {
            otherlv_0=(Token)match(input,Board,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            // InternalIoTParser.g:966:3: (this_NewBoard_1= ruleNewBoard | this_ExtendsBoard_2= ruleExtendsBoard )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==Colon) ) {
                    alt9=1;
                }
                else if ( (LA9_1==Extends) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoTParser.g:967:4: this_NewBoard_1= ruleNewBoard
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
                    // InternalIoTParser.g:976:4: this_ExtendsBoard_2= ruleExtendsBoard
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
    // InternalIoTParser.g:989:1: entryRuleNewBoard returns [EObject current=null] : iv_ruleNewBoard= ruleNewBoard EOF ;
    public final EObject entryRuleNewBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewBoard = null;


        try {
            // InternalIoTParser.g:989:49: (iv_ruleNewBoard= ruleNewBoard EOF )
            // InternalIoTParser.g:990:2: iv_ruleNewBoard= ruleNewBoard EOF
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
    // InternalIoTParser.g:996:1: ruleNewBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) ;
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
            // InternalIoTParser.g:1002:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) )
            // InternalIoTParser.g:1003:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            {
            // InternalIoTParser.g:1003:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            // InternalIoTParser.g:1004:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_version_3_0= ruleBoardVersion ) ) (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )? ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END
            {
            // InternalIoTParser.g:1004:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1005:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1005:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1006:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNewBoardAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getNewBoardAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIoTParser.g:1030:3: ( (lv_version_3_0= ruleBoardVersion ) )
            // InternalIoTParser.g:1031:4: (lv_version_3_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:1031:4: (lv_version_3_0= ruleBoardVersion )
            // InternalIoTParser.g:1032:5: lv_version_3_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getNewBoardAccess().getVersionBoardVersionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalIoTParser.g:1049:3: (otherlv_4= Wifi ( (otherlv_5= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Wifi) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoTParser.g:1050:4: otherlv_4= Wifi ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,Wifi,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getNewBoardAccess().getWifiKeyword_4_0());
                    			
                    // InternalIoTParser.g:1054:4: ( (otherlv_5= RULE_ID ) )
                    // InternalIoTParser.g:1055:5: (otherlv_5= RULE_ID )
                    {
                    // InternalIoTParser.g:1055:5: (otherlv_5= RULE_ID )
                    // InternalIoTParser.g:1056:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewBoardRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_5, grammarAccess.getNewBoardAccess().getWifiSelectWifiConfigCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIoTParser.g:1068:3: ( (lv_sensors_6_0= ruleSensor ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Sensor) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIoTParser.g:1069:4: (lv_sensors_6_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:1069:4: (lv_sensors_6_0= ruleSensor )
            	    // InternalIoTParser.g:1070:5: lv_sensors_6_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getNewBoardAccess().getSensorsSensorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalIoTParser.g:1095:1: entryRuleBoardVersion returns [EObject current=null] : iv_ruleBoardVersion= ruleBoardVersion EOF ;
    public final EObject entryRuleBoardVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardVersion = null;


        try {
            // InternalIoTParser.g:1095:53: (iv_ruleBoardVersion= ruleBoardVersion EOF )
            // InternalIoTParser.g:1096:2: iv_ruleBoardVersion= ruleBoardVersion EOF
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
    // InternalIoTParser.g:1102:1: ruleBoardVersion returns [EObject current=null] : ( (otherlv_0= SD ( (lv_sdconfig_1_0= ruleSDConfig ) ) )? otherlv_2= Type ( (lv_type_3_0= RULE_ID ) ) otherlv_4= Model ( (lv_model_5_0= RULE_ID ) ) ) ;
    public final EObject ruleBoardVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token lv_model_5_0=null;
        EObject lv_sdconfig_1_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1108:2: ( ( (otherlv_0= SD ( (lv_sdconfig_1_0= ruleSDConfig ) ) )? otherlv_2= Type ( (lv_type_3_0= RULE_ID ) ) otherlv_4= Model ( (lv_model_5_0= RULE_ID ) ) ) )
            // InternalIoTParser.g:1109:2: ( (otherlv_0= SD ( (lv_sdconfig_1_0= ruleSDConfig ) ) )? otherlv_2= Type ( (lv_type_3_0= RULE_ID ) ) otherlv_4= Model ( (lv_model_5_0= RULE_ID ) ) )
            {
            // InternalIoTParser.g:1109:2: ( (otherlv_0= SD ( (lv_sdconfig_1_0= ruleSDConfig ) ) )? otherlv_2= Type ( (lv_type_3_0= RULE_ID ) ) otherlv_4= Model ( (lv_model_5_0= RULE_ID ) ) )
            // InternalIoTParser.g:1110:3: (otherlv_0= SD ( (lv_sdconfig_1_0= ruleSDConfig ) ) )? otherlv_2= Type ( (lv_type_3_0= RULE_ID ) ) otherlv_4= Model ( (lv_model_5_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1110:3: (otherlv_0= SD ( (lv_sdconfig_1_0= ruleSDConfig ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==SD) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoTParser.g:1111:4: otherlv_0= SD ( (lv_sdconfig_1_0= ruleSDConfig ) )
                    {
                    otherlv_0=(Token)match(input,SD,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getBoardVersionAccess().getSDKeyword_0_0());
                    			
                    // InternalIoTParser.g:1115:4: ( (lv_sdconfig_1_0= ruleSDConfig ) )
                    // InternalIoTParser.g:1116:5: (lv_sdconfig_1_0= ruleSDConfig )
                    {
                    // InternalIoTParser.g:1116:5: (lv_sdconfig_1_0= ruleSDConfig )
                    // InternalIoTParser.g:1117:6: lv_sdconfig_1_0= ruleSDConfig
                    {

                    						newCompositeNode(grammarAccess.getBoardVersionAccess().getSdconfigSDConfigParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_sdconfig_1_0=ruleSDConfig();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoardVersionRule());
                    						}
                    						set(
                    							current,
                    							"sdconfig",
                    							lv_sdconfig_1_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.SDConfig");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,Type,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardVersionAccess().getTypeKeyword_1());
            		
            // InternalIoTParser.g:1139:3: ( (lv_type_3_0= RULE_ID ) )
            // InternalIoTParser.g:1140:4: (lv_type_3_0= RULE_ID )
            {
            // InternalIoTParser.g:1140:4: (lv_type_3_0= RULE_ID )
            // InternalIoTParser.g:1141:5: lv_type_3_0= RULE_ID
            {
            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_type_3_0, grammarAccess.getBoardVersionAccess().getTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,Model,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getBoardVersionAccess().getModelKeyword_3());
            		
            // InternalIoTParser.g:1161:3: ( (lv_model_5_0= RULE_ID ) )
            // InternalIoTParser.g:1162:4: (lv_model_5_0= RULE_ID )
            {
            // InternalIoTParser.g:1162:4: (lv_model_5_0= RULE_ID )
            // InternalIoTParser.g:1163:5: lv_model_5_0= RULE_ID
            {
            lv_model_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_model_5_0, grammarAccess.getBoardVersionAccess().getModelIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"model",
            						lv_model_5_0,
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


    // $ANTLR start "entryRuleSDConfig"
    // InternalIoTParser.g:1183:1: entryRuleSDConfig returns [EObject current=null] : iv_ruleSDConfig= ruleSDConfig EOF ;
    public final EObject entryRuleSDConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDConfig = null;


        try {
            // InternalIoTParser.g:1183:49: (iv_ruleSDConfig= ruleSDConfig EOF )
            // InternalIoTParser.g:1184:2: iv_ruleSDConfig= ruleSDConfig EOF
            {
             newCompositeNode(grammarAccess.getSDConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDConfig=ruleSDConfig();

            state._fsp--;

             current =iv_ruleSDConfig; 
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
    // $ANTLR end "entryRuleSDConfig"


    // $ANTLR start "ruleSDConfig"
    // InternalIoTParser.g:1190:1: ruleSDConfig returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_clk_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_sdo_3_0= RULE_INT ) ) otherlv_4= Comma ( (lv_di_5_0= RULE_INT ) ) otherlv_6= Comma ( (lv_cs_7_0= RULE_INT ) ) otherlv_8= RightParenthesis ) ;
    public final EObject ruleSDConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_clk_1_0=null;
        Token otherlv_2=null;
        Token lv_sdo_3_0=null;
        Token otherlv_4=null;
        Token lv_di_5_0=null;
        Token otherlv_6=null;
        Token lv_cs_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1196:2: ( (otherlv_0= LeftParenthesis ( (lv_clk_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_sdo_3_0= RULE_INT ) ) otherlv_4= Comma ( (lv_di_5_0= RULE_INT ) ) otherlv_6= Comma ( (lv_cs_7_0= RULE_INT ) ) otherlv_8= RightParenthesis ) )
            // InternalIoTParser.g:1197:2: (otherlv_0= LeftParenthesis ( (lv_clk_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_sdo_3_0= RULE_INT ) ) otherlv_4= Comma ( (lv_di_5_0= RULE_INT ) ) otherlv_6= Comma ( (lv_cs_7_0= RULE_INT ) ) otherlv_8= RightParenthesis )
            {
            // InternalIoTParser.g:1197:2: (otherlv_0= LeftParenthesis ( (lv_clk_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_sdo_3_0= RULE_INT ) ) otherlv_4= Comma ( (lv_di_5_0= RULE_INT ) ) otherlv_6= Comma ( (lv_cs_7_0= RULE_INT ) ) otherlv_8= RightParenthesis )
            // InternalIoTParser.g:1198:3: otherlv_0= LeftParenthesis ( (lv_clk_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_sdo_3_0= RULE_INT ) ) otherlv_4= Comma ( (lv_di_5_0= RULE_INT ) ) otherlv_6= Comma ( (lv_cs_7_0= RULE_INT ) ) otherlv_8= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSDConfigAccess().getLeftParenthesisKeyword_0());
            		
            // InternalIoTParser.g:1202:3: ( (lv_clk_1_0= RULE_INT ) )
            // InternalIoTParser.g:1203:4: (lv_clk_1_0= RULE_INT )
            {
            // InternalIoTParser.g:1203:4: (lv_clk_1_0= RULE_INT )
            // InternalIoTParser.g:1204:5: lv_clk_1_0= RULE_INT
            {
            lv_clk_1_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_clk_1_0, grammarAccess.getSDConfigAccess().getClkINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSDConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"clk",
            						lv_clk_1_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,Comma,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSDConfigAccess().getCommaKeyword_2());
            		
            // InternalIoTParser.g:1224:3: ( (lv_sdo_3_0= RULE_INT ) )
            // InternalIoTParser.g:1225:4: (lv_sdo_3_0= RULE_INT )
            {
            // InternalIoTParser.g:1225:4: (lv_sdo_3_0= RULE_INT )
            // InternalIoTParser.g:1226:5: lv_sdo_3_0= RULE_INT
            {
            lv_sdo_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_sdo_3_0, grammarAccess.getSDConfigAccess().getSdoINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSDConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sdo",
            						lv_sdo_3_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,Comma,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getSDConfigAccess().getCommaKeyword_4());
            		
            // InternalIoTParser.g:1246:3: ( (lv_di_5_0= RULE_INT ) )
            // InternalIoTParser.g:1247:4: (lv_di_5_0= RULE_INT )
            {
            // InternalIoTParser.g:1247:4: (lv_di_5_0= RULE_INT )
            // InternalIoTParser.g:1248:5: lv_di_5_0= RULE_INT
            {
            lv_di_5_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_di_5_0, grammarAccess.getSDConfigAccess().getDiINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSDConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"di",
            						lv_di_5_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,Comma,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getSDConfigAccess().getCommaKeyword_6());
            		
            // InternalIoTParser.g:1268:3: ( (lv_cs_7_0= RULE_INT ) )
            // InternalIoTParser.g:1269:4: (lv_cs_7_0= RULE_INT )
            {
            // InternalIoTParser.g:1269:4: (lv_cs_7_0= RULE_INT )
            // InternalIoTParser.g:1270:5: lv_cs_7_0= RULE_INT
            {
            lv_cs_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_cs_7_0, grammarAccess.getSDConfigAccess().getCsINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSDConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cs",
            						lv_cs_7_0,
            						"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSDConfigAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleSDConfig"


    // $ANTLR start "entryRuleExtendsBoard"
    // InternalIoTParser.g:1294:1: entryRuleExtendsBoard returns [EObject current=null] : iv_ruleExtendsBoard= ruleExtendsBoard EOF ;
    public final EObject entryRuleExtendsBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsBoard = null;


        try {
            // InternalIoTParser.g:1294:53: (iv_ruleExtendsBoard= ruleExtendsBoard EOF )
            // InternalIoTParser.g:1295:2: iv_ruleExtendsBoard= ruleExtendsBoard EOF
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
    // InternalIoTParser.g:1301:1: ruleExtendsBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )? ) ;
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
            // InternalIoTParser.g:1307:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )? ) )
            // InternalIoTParser.g:1308:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )? )
            {
            // InternalIoTParser.g:1308:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )? )
            // InternalIoTParser.g:1309:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Extends ( (otherlv_2= RULE_ID ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )?
            {
            // InternalIoTParser.g:1309:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1310:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1310:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1311:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,Extends,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendsBoardAccess().getExtendsKeyword_1());
            		
            // InternalIoTParser.g:1331:3: ( (otherlv_2= RULE_ID ) )
            // InternalIoTParser.g:1332:4: (otherlv_2= RULE_ID )
            {
            // InternalIoTParser.g:1332:4: (otherlv_2= RULE_ID )
            // InternalIoTParser.g:1333:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendsBoardRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getExtendsBoardAccess().getAbstractBoardAbstractBoardCrossReference_2_0());
            				

            }


            }

            // InternalIoTParser.g:1344:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Colon) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIoTParser.g:1345:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )? ( (lv_sensors_7_0= ruleSensor ) )* this_END_8= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtendsBoardAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getExtendsBoardAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalIoTParser.g:1353:4: (otherlv_5= Wifi ( (otherlv_6= RULE_ID ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Wifi) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalIoTParser.g:1354:5: otherlv_5= Wifi ( (otherlv_6= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,Wifi,FOLLOW_4); 

                            					newLeafNode(otherlv_5, grammarAccess.getExtendsBoardAccess().getWifiKeyword_3_2_0());
                            				
                            // InternalIoTParser.g:1358:5: ( (otherlv_6= RULE_ID ) )
                            // InternalIoTParser.g:1359:6: (otherlv_6= RULE_ID )
                            {
                            // InternalIoTParser.g:1359:6: (otherlv_6= RULE_ID )
                            // InternalIoTParser.g:1360:7: otherlv_6= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExtendsBoardRule());
                            							}
                            						
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); 

                            							newLeafNode(otherlv_6, grammarAccess.getExtendsBoardAccess().getWifiSelectWifiConfigCrossReference_3_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalIoTParser.g:1372:4: ( (lv_sensors_7_0= ruleSensor ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Sensor) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalIoTParser.g:1373:5: (lv_sensors_7_0= ruleSensor )
                    	    {
                    	    // InternalIoTParser.g:1373:5: (lv_sensors_7_0= ruleSensor )
                    	    // InternalIoTParser.g:1374:6: lv_sensors_7_0= ruleSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getExtendsBoardAccess().getSensorsSensorParserRuleCall_3_3_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop14;
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
    // InternalIoTParser.g:1400:1: entryRuleAbstractBoard returns [EObject current=null] : iv_ruleAbstractBoard= ruleAbstractBoard EOF ;
    public final EObject entryRuleAbstractBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBoard = null;


        try {
            // InternalIoTParser.g:1400:54: (iv_ruleAbstractBoard= ruleAbstractBoard EOF )
            // InternalIoTParser.g:1401:2: iv_ruleAbstractBoard= ruleAbstractBoard EOF
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
    // InternalIoTParser.g:1407:1: ruleAbstractBoard returns [EObject current=null] : (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) ;
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
            // InternalIoTParser.g:1413:2: ( (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END ) )
            // InternalIoTParser.g:1414:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            {
            // InternalIoTParser.g:1414:2: (otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END )
            // InternalIoTParser.g:1415:3: otherlv_0= Abstract otherlv_1= Board ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_version_5_0= ruleBoardVersion ) ) ( (lv_sensors_6_0= ruleSensor ) )+ this_END_7= RULE_END
            {
            otherlv_0=(Token)match(input,Abstract,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractBoardAccess().getAbstractKeyword_0());
            		
            otherlv_1=(Token)match(input,Board,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractBoardAccess().getBoardKeyword_1());
            		
            // InternalIoTParser.g:1423:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoTParser.g:1424:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoTParser.g:1424:4: (lv_name_2_0= RULE_ID )
            // InternalIoTParser.g:1425:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractBoardAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getAbstractBoardAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalIoTParser.g:1449:3: ( (lv_version_5_0= ruleBoardVersion ) )
            // InternalIoTParser.g:1450:4: (lv_version_5_0= ruleBoardVersion )
            {
            // InternalIoTParser.g:1450:4: (lv_version_5_0= ruleBoardVersion )
            // InternalIoTParser.g:1451:5: lv_version_5_0= ruleBoardVersion
            {

            					newCompositeNode(grammarAccess.getAbstractBoardAccess().getVersionBoardVersionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalIoTParser.g:1468:3: ( (lv_sensors_6_0= ruleSensor ) )+
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
            	    // InternalIoTParser.g:1469:4: (lv_sensors_6_0= ruleSensor )
            	    {
            	    // InternalIoTParser.g:1469:4: (lv_sensors_6_0= ruleSensor )
            	    // InternalIoTParser.g:1470:5: lv_sensors_6_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractBoardAccess().getSensorsSensorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
    // InternalIoTParser.g:1495:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoTParser.g:1495:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoTParser.g:1496:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalIoTParser.g:1502:1: ruleSensor returns [EObject current=null] : (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) ;
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
            // InternalIoTParser.g:1508:2: ( (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END ) )
            // InternalIoTParser.g:1509:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            {
            // InternalIoTParser.g:1509:2: (otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END )
            // InternalIoTParser.g:1510:3: otherlv_0= Sensor ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_sensortype_3_0= ruleSensorType ) ) otherlv_4= As ( (lv_vars_5_0= ruleSensorVariables ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )? (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )? ( (lv_output_12_0= ruleSensorOutput ) )+ this_END_13= RULE_END
            {
            otherlv_0=(Token)match(input,Sensor,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalIoTParser.g:1514:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoTParser.g:1515:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoTParser.g:1515:4: (lv_name_1_0= RULE_ID )
            // InternalIoTParser.g:1516:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getEqualsSignKeyword_2());
            		
            // InternalIoTParser.g:1536:3: ( (lv_sensortype_3_0= ruleSensorType ) )
            // InternalIoTParser.g:1537:4: (lv_sensortype_3_0= ruleSensorType )
            {
            // InternalIoTParser.g:1537:4: (lv_sensortype_3_0= ruleSensorType )
            // InternalIoTParser.g:1538:5: lv_sensortype_3_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensortypeSensorTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_4=(Token)match(input,As,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getAsKeyword_4());
            		
            // InternalIoTParser.g:1559:3: ( (lv_vars_5_0= ruleSensorVariables ) )
            // InternalIoTParser.g:1560:4: (lv_vars_5_0= ruleSensorVariables )
            {
            // InternalIoTParser.g:1560:4: (lv_vars_5_0= ruleSensorVariables )
            // InternalIoTParser.g:1561:5: lv_vars_5_0= ruleSensorVariables
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getVarsSensorVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_6=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getColonKeyword_6());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getSensorAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalIoTParser.g:1586:3: (otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Sample) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIoTParser.g:1587:4: otherlv_8= Sample ( (lv_sampler_9_0= ruleSampler ) )
                    {
                    otherlv_8=(Token)match(input,Sample,FOLLOW_35); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getSampleKeyword_8_0());
                    			
                    // InternalIoTParser.g:1591:4: ( (lv_sampler_9_0= ruleSampler ) )
                    // InternalIoTParser.g:1592:5: (lv_sampler_9_0= ruleSampler )
                    {
                    // InternalIoTParser.g:1592:5: (lv_sampler_9_0= ruleSampler )
                    // InternalIoTParser.g:1593:6: lv_sampler_9_0= ruleSampler
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getSamplerSamplerParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_sampler_9_0=ruleSampler();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
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

            // InternalIoTParser.g:1611:3: (otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Vcc) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIoTParser.g:1612:4: otherlv_10= Vcc ( (lv_vcc_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,Vcc,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getVccKeyword_9_0());
                    			
                    // InternalIoTParser.g:1616:4: ( (lv_vcc_11_0= RULE_INT ) )
                    // InternalIoTParser.g:1617:5: (lv_vcc_11_0= RULE_INT )
                    {
                    // InternalIoTParser.g:1617:5: (lv_vcc_11_0= RULE_INT )
                    // InternalIoTParser.g:1618:6: lv_vcc_11_0= RULE_INT
                    {
                    lv_vcc_11_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            // InternalIoTParser.g:1635:3: ( (lv_output_12_0= ruleSensorOutput ) )+
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
            	    // InternalIoTParser.g:1636:4: (lv_output_12_0= ruleSensorOutput )
            	    {
            	    // InternalIoTParser.g:1636:4: (lv_output_12_0= ruleSensorOutput )
            	    // InternalIoTParser.g:1637:5: lv_output_12_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputSensorOutputParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_36);
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
    // InternalIoTParser.g:1662:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalIoTParser.g:1662:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalIoTParser.g:1663:2: iv_ruleSensorType= ruleSensorType EOF
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
    // InternalIoTParser.g:1669:1: ruleSensorType returns [EObject current=null] : (this_ExternalSensor_0= ruleExternalSensor | this_EmbeddedSensor_1= ruleEmbeddedSensor ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalSensor_0 = null;

        EObject this_EmbeddedSensor_1 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1675:2: ( (this_ExternalSensor_0= ruleExternalSensor | this_EmbeddedSensor_1= ruleEmbeddedSensor ) )
            // InternalIoTParser.g:1676:2: (this_ExternalSensor_0= ruleExternalSensor | this_EmbeddedSensor_1= ruleEmbeddedSensor )
            {
            // InternalIoTParser.g:1676:2: (this_ExternalSensor_0= ruleExternalSensor | this_EmbeddedSensor_1= ruleEmbeddedSensor )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==LeftParenthesis) ) {
                    alt20=1;
                }
                else if ( (LA20_1==EOF||LA20_1==As) ) {
                    alt20=2;
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
                    // InternalIoTParser.g:1677:3: this_ExternalSensor_0= ruleExternalSensor
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
                    // InternalIoTParser.g:1686:3: this_EmbeddedSensor_1= ruleEmbeddedSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getEmbeddedSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmbeddedSensor_1=ruleEmbeddedSensor();

                    state._fsp--;


                    			current = this_EmbeddedSensor_1;
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
    // InternalIoTParser.g:1698:1: entryRuleExternalSensor returns [EObject current=null] : iv_ruleExternalSensor= ruleExternalSensor EOF ;
    public final EObject entryRuleExternalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSensor = null;


        try {
            // InternalIoTParser.g:1698:55: (iv_ruleExternalSensor= ruleExternalSensor EOF )
            // InternalIoTParser.g:1699:2: iv_ruleExternalSensor= ruleExternalSensor EOF
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
    // InternalIoTParser.g:1705:1: ruleExternalSensor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) ;
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
            // InternalIoTParser.g:1711:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1712:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1712:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1713:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_pins_2_0= RULE_INT ) ) (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1713:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1714:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1714:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1715:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalSensorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoTParser.g:1735:3: ( (lv_pins_2_0= RULE_INT ) )
            // InternalIoTParser.g:1736:4: (lv_pins_2_0= RULE_INT )
            {
            // InternalIoTParser.g:1736:4: (lv_pins_2_0= RULE_INT )
            // InternalIoTParser.g:1737:5: lv_pins_2_0= RULE_INT
            {
            lv_pins_2_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            // InternalIoTParser.g:1753:3: (otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIoTParser.g:1754:4: otherlv_3= Comma ( (lv_pins_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_16); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalSensorAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1758:4: ( (lv_pins_4_0= RULE_INT ) )
            	    // InternalIoTParser.g:1759:5: (lv_pins_4_0= RULE_INT )
            	    {
            	    // InternalIoTParser.g:1759:5: (lv_pins_4_0= RULE_INT )
            	    // InternalIoTParser.g:1760:6: lv_pins_4_0= RULE_INT
            	    {
            	    lv_pins_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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


    // $ANTLR start "entryRuleEmbeddedSensor"
    // InternalIoTParser.g:1785:1: entryRuleEmbeddedSensor returns [EObject current=null] : iv_ruleEmbeddedSensor= ruleEmbeddedSensor EOF ;
    public final EObject entryRuleEmbeddedSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbeddedSensor = null;


        try {
            // InternalIoTParser.g:1785:55: (iv_ruleEmbeddedSensor= ruleEmbeddedSensor EOF )
            // InternalIoTParser.g:1786:2: iv_ruleEmbeddedSensor= ruleEmbeddedSensor EOF
            {
             newCompositeNode(grammarAccess.getEmbeddedSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmbeddedSensor=ruleEmbeddedSensor();

            state._fsp--;

             current =iv_ruleEmbeddedSensor; 
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
    // $ANTLR end "entryRuleEmbeddedSensor"


    // $ANTLR start "ruleEmbeddedSensor"
    // InternalIoTParser.g:1792:1: ruleEmbeddedSensor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEmbeddedSensor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1798:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1799:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1799:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1800:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1800:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1801:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEmbeddedSensorAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEmbeddedSensorRule());
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
    // $ANTLR end "ruleEmbeddedSensor"


    // $ANTLR start "entryRuleSensorVariables"
    // InternalIoTParser.g:1820:1: entryRuleSensorVariables returns [EObject current=null] : iv_ruleSensorVariables= ruleSensorVariables EOF ;
    public final EObject entryRuleSensorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorVariables = null;


        try {
            // InternalIoTParser.g:1820:56: (iv_ruleSensorVariables= ruleSensorVariables EOF )
            // InternalIoTParser.g:1821:2: iv_ruleSensorVariables= ruleSensorVariables EOF
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
    // InternalIoTParser.g:1827:1: ruleSensorVariables returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) ;
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
            // InternalIoTParser.g:1833:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis ) )
            // InternalIoTParser.g:1834:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalIoTParser.g:1834:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis )
            // InternalIoTParser.g:1835:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_ids_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )* otherlv_5= RightParenthesis
            {
            // InternalIoTParser.g:1835:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1836:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1836:4: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1837:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorVariablesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIoTParser.g:1857:3: ( (lv_ids_2_0= ruleVariable ) )
            // InternalIoTParser.g:1858:4: (lv_ids_2_0= ruleVariable )
            {
            // InternalIoTParser.g:1858:4: (lv_ids_2_0= ruleVariable )
            // InternalIoTParser.g:1859:5: lv_ids_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalIoTParser.g:1876:3: (otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIoTParser.g:1877:4: otherlv_3= Comma ( (lv_ids_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSensorVariablesAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:1881:4: ( (lv_ids_4_0= ruleVariable ) )
            	    // InternalIoTParser.g:1882:5: (lv_ids_4_0= ruleVariable )
            	    {
            	    // InternalIoTParser.g:1882:5: (lv_ids_4_0= ruleVariable )
            	    // InternalIoTParser.g:1883:6: lv_ids_4_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getSensorVariablesAccess().getIdsVariableParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
    // InternalIoTParser.g:1909:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalIoTParser.g:1909:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalIoTParser.g:1910:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalIoTParser.g:1916:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:1922:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:1923:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:1923:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoTParser.g:1924:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoTParser.g:1924:3: (lv_name_0_0= RULE_ID )
            // InternalIoTParser.g:1925:4: lv_name_0_0= RULE_ID
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
    // InternalIoTParser.g:1944:1: entryRuleSampler returns [EObject current=null] : iv_ruleSampler= ruleSampler EOF ;
    public final EObject entryRuleSampler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampler = null;


        try {
            // InternalIoTParser.g:1944:48: (iv_ruleSampler= ruleSampler EOF )
            // InternalIoTParser.g:1945:2: iv_ruleSampler= ruleSampler EOF
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
    // InternalIoTParser.g:1951:1: ruleSampler returns [EObject current=null] : ( ( () otherlv_1= Command ( (lv_command_2_0= RULE_STRING ) ) (otherlv_3= Baud ( (lv_baud_4_0= RULE_INT ) ) )? ) | ( () otherlv_6= Interval ( (lv_interval_7_0= RULE_INT ) ) ( (lv_resolution_8_0= ruleResolution ) ) ) ) ;
    public final EObject ruleSampler() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_command_2_0=null;
        Token otherlv_3=null;
        Token lv_baud_4_0=null;
        Token otherlv_6=null;
        Token lv_interval_7_0=null;
        EObject lv_resolution_8_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:1957:2: ( ( ( () otherlv_1= Command ( (lv_command_2_0= RULE_STRING ) ) (otherlv_3= Baud ( (lv_baud_4_0= RULE_INT ) ) )? ) | ( () otherlv_6= Interval ( (lv_interval_7_0= RULE_INT ) ) ( (lv_resolution_8_0= ruleResolution ) ) ) ) )
            // InternalIoTParser.g:1958:2: ( ( () otherlv_1= Command ( (lv_command_2_0= RULE_STRING ) ) (otherlv_3= Baud ( (lv_baud_4_0= RULE_INT ) ) )? ) | ( () otherlv_6= Interval ( (lv_interval_7_0= RULE_INT ) ) ( (lv_resolution_8_0= ruleResolution ) ) ) )
            {
            // InternalIoTParser.g:1958:2: ( ( () otherlv_1= Command ( (lv_command_2_0= RULE_STRING ) ) (otherlv_3= Baud ( (lv_baud_4_0= RULE_INT ) ) )? ) | ( () otherlv_6= Interval ( (lv_interval_7_0= RULE_INT ) ) ( (lv_resolution_8_0= ruleResolution ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Command) ) {
                alt24=1;
            }
            else if ( (LA24_0==Interval) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalIoTParser.g:1959:3: ( () otherlv_1= Command ( (lv_command_2_0= RULE_STRING ) ) (otherlv_3= Baud ( (lv_baud_4_0= RULE_INT ) ) )? )
                    {
                    // InternalIoTParser.g:1959:3: ( () otherlv_1= Command ( (lv_command_2_0= RULE_STRING ) ) (otherlv_3= Baud ( (lv_baud_4_0= RULE_INT ) ) )? )
                    // InternalIoTParser.g:1960:4: () otherlv_1= Command ( (lv_command_2_0= RULE_STRING ) ) (otherlv_3= Baud ( (lv_baud_4_0= RULE_INT ) ) )?
                    {
                    // InternalIoTParser.g:1960:4: ()
                    // InternalIoTParser.g:1961:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSamplerAccess().getCommandAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Command,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getSamplerAccess().getCommandKeyword_0_1());
                    			
                    // InternalIoTParser.g:1971:4: ( (lv_command_2_0= RULE_STRING ) )
                    // InternalIoTParser.g:1972:5: (lv_command_2_0= RULE_STRING )
                    {
                    // InternalIoTParser.g:1972:5: (lv_command_2_0= RULE_STRING )
                    // InternalIoTParser.g:1973:6: lv_command_2_0= RULE_STRING
                    {
                    lv_command_2_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

                    						newLeafNode(lv_command_2_0, grammarAccess.getSamplerAccess().getCommandSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSamplerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"command",
                    							lv_command_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalIoTParser.g:1989:4: (otherlv_3= Baud ( (lv_baud_4_0= RULE_INT ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==Baud) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalIoTParser.g:1990:5: otherlv_3= Baud ( (lv_baud_4_0= RULE_INT ) )
                            {
                            otherlv_3=(Token)match(input,Baud,FOLLOW_16); 

                            					newLeafNode(otherlv_3, grammarAccess.getSamplerAccess().getBaudKeyword_0_3_0());
                            				
                            // InternalIoTParser.g:1994:5: ( (lv_baud_4_0= RULE_INT ) )
                            // InternalIoTParser.g:1995:6: (lv_baud_4_0= RULE_INT )
                            {
                            // InternalIoTParser.g:1995:6: (lv_baud_4_0= RULE_INT )
                            // InternalIoTParser.g:1996:7: lv_baud_4_0= RULE_INT
                            {
                            lv_baud_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_baud_4_0, grammarAccess.getSamplerAccess().getBaudINTTerminalRuleCall_0_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSamplerRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"baud",
                            								lv_baud_4_0,
                            								"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:2015:3: ( () otherlv_6= Interval ( (lv_interval_7_0= RULE_INT ) ) ( (lv_resolution_8_0= ruleResolution ) ) )
                    {
                    // InternalIoTParser.g:2015:3: ( () otherlv_6= Interval ( (lv_interval_7_0= RULE_INT ) ) ( (lv_resolution_8_0= ruleResolution ) ) )
                    // InternalIoTParser.g:2016:4: () otherlv_6= Interval ( (lv_interval_7_0= RULE_INT ) ) ( (lv_resolution_8_0= ruleResolution ) )
                    {
                    // InternalIoTParser.g:2016:4: ()
                    // InternalIoTParser.g:2017:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSamplerAccess().getIntervalAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,Interval,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getSamplerAccess().getIntervalKeyword_1_1());
                    			
                    // InternalIoTParser.g:2027:4: ( (lv_interval_7_0= RULE_INT ) )
                    // InternalIoTParser.g:2028:5: (lv_interval_7_0= RULE_INT )
                    {
                    // InternalIoTParser.g:2028:5: (lv_interval_7_0= RULE_INT )
                    // InternalIoTParser.g:2029:6: lv_interval_7_0= RULE_INT
                    {
                    lv_interval_7_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    						newLeafNode(lv_interval_7_0, grammarAccess.getSamplerAccess().getIntervalINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSamplerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"interval",
                    							lv_interval_7_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.INT");
                    					

                    }


                    }

                    // InternalIoTParser.g:2045:4: ( (lv_resolution_8_0= ruleResolution ) )
                    // InternalIoTParser.g:2046:5: (lv_resolution_8_0= ruleResolution )
                    {
                    // InternalIoTParser.g:2046:5: (lv_resolution_8_0= ruleResolution )
                    // InternalIoTParser.g:2047:6: lv_resolution_8_0= ruleResolution
                    {

                    						newCompositeNode(grammarAccess.getSamplerAccess().getResolutionResolutionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_resolution_8_0=ruleResolution();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSamplerRule());
                    						}
                    						set(
                    							current,
                    							"resolution",
                    							lv_resolution_8_0,
                    							"org.xtext.mdsd.arduino.boardgenerator.IoT.Resolution");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleSampler"


    // $ANTLR start "entryRuleResolution"
    // InternalIoTParser.g:2069:1: entryRuleResolution returns [EObject current=null] : iv_ruleResolution= ruleResolution EOF ;
    public final EObject entryRuleResolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolution = null;


        try {
            // InternalIoTParser.g:2069:51: (iv_ruleResolution= ruleResolution EOF )
            // InternalIoTParser.g:2070:2: iv_ruleResolution= ruleResolution EOF
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
    // InternalIoTParser.g:2076:1: ruleResolution returns [EObject current=null] : ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) ;
    public final EObject ruleResolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoTParser.g:2082:2: ( ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) ) )
            // InternalIoTParser.g:2083:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            {
            // InternalIoTParser.g:2083:2: ( ( () otherlv_1= Seconds ) | ( () otherlv_3= Milliseconds ) | ( () otherlv_5= Microseconds ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case Seconds:
                {
                alt25=1;
                }
                break;
            case Milliseconds:
                {
                alt25=2;
                }
                break;
            case Microseconds:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalIoTParser.g:2084:3: ( () otherlv_1= Seconds )
                    {
                    // InternalIoTParser.g:2084:3: ( () otherlv_1= Seconds )
                    // InternalIoTParser.g:2085:4: () otherlv_1= Seconds
                    {
                    // InternalIoTParser.g:2085:4: ()
                    // InternalIoTParser.g:2086:5: 
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
                    // InternalIoTParser.g:2098:3: ( () otherlv_3= Milliseconds )
                    {
                    // InternalIoTParser.g:2098:3: ( () otherlv_3= Milliseconds )
                    // InternalIoTParser.g:2099:4: () otherlv_3= Milliseconds
                    {
                    // InternalIoTParser.g:2099:4: ()
                    // InternalIoTParser.g:2100:5: 
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
                    // InternalIoTParser.g:2112:3: ( () otherlv_5= Microseconds )
                    {
                    // InternalIoTParser.g:2112:3: ( () otherlv_5= Microseconds )
                    // InternalIoTParser.g:2113:4: () otherlv_5= Microseconds
                    {
                    // InternalIoTParser.g:2113:4: ()
                    // InternalIoTParser.g:2114:5: 
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
    // InternalIoTParser.g:2129:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalIoTParser.g:2129:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalIoTParser.g:2130:2: iv_ruleSensorOutput= ruleSensorOutput EOF
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
    // InternalIoTParser.g:2136:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= Pipe ( (otherlv_1= RULE_ID ) ) ( (lv_pipeline_2_0= rulePipeline ) )? otherlv_3= HyphenMinusGreaterThanSign ( (otherlv_4= RULE_ID ) ) (otherlv_5= And ( (otherlv_6= RULE_ID ) ) )* ) ;
    public final EObject ruleSensorOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_pipeline_2_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2142:2: ( (otherlv_0= Pipe ( (otherlv_1= RULE_ID ) ) ( (lv_pipeline_2_0= rulePipeline ) )? otherlv_3= HyphenMinusGreaterThanSign ( (otherlv_4= RULE_ID ) ) (otherlv_5= And ( (otherlv_6= RULE_ID ) ) )* ) )
            // InternalIoTParser.g:2143:2: (otherlv_0= Pipe ( (otherlv_1= RULE_ID ) ) ( (lv_pipeline_2_0= rulePipeline ) )? otherlv_3= HyphenMinusGreaterThanSign ( (otherlv_4= RULE_ID ) ) (otherlv_5= And ( (otherlv_6= RULE_ID ) ) )* )
            {
            // InternalIoTParser.g:2143:2: (otherlv_0= Pipe ( (otherlv_1= RULE_ID ) ) ( (lv_pipeline_2_0= rulePipeline ) )? otherlv_3= HyphenMinusGreaterThanSign ( (otherlv_4= RULE_ID ) ) (otherlv_5= And ( (otherlv_6= RULE_ID ) ) )* )
            // InternalIoTParser.g:2144:3: otherlv_0= Pipe ( (otherlv_1= RULE_ID ) ) ( (lv_pipeline_2_0= rulePipeline ) )? otherlv_3= HyphenMinusGreaterThanSign ( (otherlv_4= RULE_ID ) ) (otherlv_5= And ( (otherlv_6= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,Pipe,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getPipeKeyword_0());
            		
            // InternalIoTParser.g:2148:3: ( (otherlv_1= RULE_ID ) )
            // InternalIoTParser.g:2149:4: (otherlv_1= RULE_ID )
            {
            // InternalIoTParser.g:2149:4: (otherlv_1= RULE_ID )
            // InternalIoTParser.g:2150:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorOutputRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_1, grammarAccess.getSensorOutputAccess().getSensorvarSensorVariablesCrossReference_1_0());
            				

            }


            }

            // InternalIoTParser.g:2161:3: ( (lv_pipeline_2_0= rulePipeline ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FullStop) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIoTParser.g:2162:4: (lv_pipeline_2_0= rulePipeline )
                    {
                    // InternalIoTParser.g:2162:4: (lv_pipeline_2_0= rulePipeline )
                    // InternalIoTParser.g:2163:5: lv_pipeline_2_0= rulePipeline
                    {

                    					newCompositeNode(grammarAccess.getSensorOutputAccess().getPipelinePipelineParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_pipeline_2_0=rulePipeline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSensorOutputRule());
                    					}
                    					set(
                    						current,
                    						"pipeline",
                    						lv_pipeline_2_0,
                    						"org.xtext.mdsd.arduino.boardgenerator.IoT.Pipeline");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorOutputAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalIoTParser.g:2184:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoTParser.g:2185:4: (otherlv_4= RULE_ID )
            {
            // InternalIoTParser.g:2185:4: (otherlv_4= RULE_ID )
            // InternalIoTParser.g:2186:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorOutputRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_4, grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_4_0());
            				

            }


            }

            // InternalIoTParser.g:2197:3: (otherlv_5= And ( (otherlv_6= RULE_ID ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==And) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalIoTParser.g:2198:4: otherlv_5= And ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,And,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSensorOutputAccess().getAndKeyword_5_0());
            	    			
            	    // InternalIoTParser.g:2202:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalIoTParser.g:2203:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalIoTParser.g:2203:5: (otherlv_6= RULE_ID )
            	    // InternalIoTParser.g:2204:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensorOutputRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_40); 

            	    						newLeafNode(otherlv_6, grammarAccess.getSensorOutputAccess().getChannelChannelCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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


    // $ANTLR start "entryRulePipeline"
    // InternalIoTParser.g:2220:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalIoTParser.g:2220:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalIoTParser.g:2221:2: iv_rulePipeline= rulePipeline EOF
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
    // InternalIoTParser.g:2227:1: rulePipeline returns [EObject current=null] : (otherlv_0= FullStop (this_MapPipeline_1= ruleMapPipeline | this_WindowPipeline_2= ruleWindowPipeline | this_External_3= ruleExternal ) ( (lv_next_4_0= rulePipeline ) )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MapPipeline_1 = null;

        EObject this_WindowPipeline_2 = null;

        EObject this_External_3 = null;

        EObject lv_next_4_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2233:2: ( (otherlv_0= FullStop (this_MapPipeline_1= ruleMapPipeline | this_WindowPipeline_2= ruleWindowPipeline | this_External_3= ruleExternal ) ( (lv_next_4_0= rulePipeline ) )? ) )
            // InternalIoTParser.g:2234:2: (otherlv_0= FullStop (this_MapPipeline_1= ruleMapPipeline | this_WindowPipeline_2= ruleWindowPipeline | this_External_3= ruleExternal ) ( (lv_next_4_0= rulePipeline ) )? )
            {
            // InternalIoTParser.g:2234:2: (otherlv_0= FullStop (this_MapPipeline_1= ruleMapPipeline | this_WindowPipeline_2= ruleWindowPipeline | this_External_3= ruleExternal ) ( (lv_next_4_0= rulePipeline ) )? )
            // InternalIoTParser.g:2235:3: otherlv_0= FullStop (this_MapPipeline_1= ruleMapPipeline | this_WindowPipeline_2= ruleWindowPipeline | this_External_3= ruleExternal ) ( (lv_next_4_0= rulePipeline ) )?
            {
            otherlv_0=(Token)match(input,FullStop,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getFullStopKeyword_0());
            		
            // InternalIoTParser.g:2239:3: (this_MapPipeline_1= ruleMapPipeline | this_WindowPipeline_2= ruleWindowPipeline | this_External_3= ruleExternal )
            int alt28=3;
            switch ( input.LA(1) ) {
            case Map:
                {
                alt28=1;
                }
                break;
            case ByWindow:
                {
                alt28=2;
                }
                break;
            case RULE_ID:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalIoTParser.g:2240:4: this_MapPipeline_1= ruleMapPipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getMapPipelineParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_MapPipeline_1=ruleMapPipeline();

                    state._fsp--;


                    				current = this_MapPipeline_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:2249:4: this_WindowPipeline_2= ruleWindowPipeline
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getWindowPipelineParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_WindowPipeline_2=ruleWindowPipeline();

                    state._fsp--;


                    				current = this_WindowPipeline_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:2258:4: this_External_3= ruleExternal
                    {

                    				newCompositeNode(grammarAccess.getPipelineAccess().getExternalParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_5);
                    this_External_3=ruleExternal();

                    state._fsp--;


                    				current = this_External_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalIoTParser.g:2267:3: ( (lv_next_4_0= rulePipeline ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==FullStop) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalIoTParser.g:2268:4: (lv_next_4_0= rulePipeline )
                    {
                    // InternalIoTParser.g:2268:4: (lv_next_4_0= rulePipeline )
                    // InternalIoTParser.g:2269:5: lv_next_4_0= rulePipeline
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


    // $ANTLR start "entryRuleExternal"
    // InternalIoTParser.g:2290:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalIoTParser.g:2290:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalIoTParser.g:2291:2: iv_ruleExternal= ruleExternal EOF
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
    // InternalIoTParser.g:2297:1: ruleExternal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket ) ;
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
            // InternalIoTParser.g:2303:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalIoTParser.g:2304:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalIoTParser.g:2304:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket )
            // InternalIoTParser.g:2305:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftSquareBracket ( (lv_input_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalIoTParser.g:2305:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoTParser.g:2306:4: (otherlv_0= RULE_ID )
            {
            // InternalIoTParser.g:2306:4: (otherlv_0= RULE_ID )
            // InternalIoTParser.g:2307:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getFunctionFunctionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalIoTParser.g:2322:3: ( (lv_input_2_0= ruleExpression ) )
            // InternalIoTParser.g:2323:4: (lv_input_2_0= ruleExpression )
            {
            // InternalIoTParser.g:2323:4: (lv_input_2_0= ruleExpression )
            // InternalIoTParser.g:2324:5: lv_input_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExternalAccess().getInputExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalIoTParser.g:2341:3: (otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalIoTParser.g:2342:4: otherlv_3= Comma ( (lv_input_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_43); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalIoTParser.g:2346:4: ( (lv_input_4_0= ruleExpression ) )
            	    // InternalIoTParser.g:2347:5: (lv_input_4_0= ruleExpression )
            	    {
            	    // InternalIoTParser.g:2347:5: (lv_input_4_0= ruleExpression )
            	    // InternalIoTParser.g:2348:6: lv_input_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternalAccess().getInputExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
            	    break loop30;
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


    // $ANTLR start "entryRuleMapPipeline"
    // InternalIoTParser.g:2374:1: entryRuleMapPipeline returns [EObject current=null] : iv_ruleMapPipeline= ruleMapPipeline EOF ;
    public final EObject entryRuleMapPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapPipeline = null;


        try {
            // InternalIoTParser.g:2374:52: (iv_ruleMapPipeline= ruleMapPipeline EOF )
            // InternalIoTParser.g:2375:2: iv_ruleMapPipeline= ruleMapPipeline EOF
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
    // InternalIoTParser.g:2381:1: ruleMapPipeline returns [EObject current=null] : ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) ;
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
            // InternalIoTParser.g:2387:2: ( ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket ) )
            // InternalIoTParser.g:2388:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            {
            // InternalIoTParser.g:2388:2: ( () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket )
            // InternalIoTParser.g:2389:3: () otherlv_1= Map otherlv_2= LeftSquareBracket ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= HyphenMinusGreaterThanSign ( (lv_output_5_0= ruleVariable ) ) otherlv_6= RightSquareBracket
            {
            // InternalIoTParser.g:2389:3: ()
            // InternalIoTParser.g:2390:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapPipelineAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Map,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getMapPipelineAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getMapPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2404:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalIoTParser.g:2405:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalIoTParser.g:2405:4: (lv_expression_3_0= ruleExpression )
            // InternalIoTParser.g:2406:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_4=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMapPipelineAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalIoTParser.g:2427:3: ( (lv_output_5_0= ruleVariable ) )
            // InternalIoTParser.g:2428:4: (lv_output_5_0= ruleVariable )
            {
            // InternalIoTParser.g:2428:4: (lv_output_5_0= ruleVariable )
            // InternalIoTParser.g:2429:5: lv_output_5_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getMapPipelineAccess().getOutputVariableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_45);
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
    // InternalIoTParser.g:2454:1: entryRuleWindowPipeline returns [EObject current=null] : iv_ruleWindowPipeline= ruleWindowPipeline EOF ;
    public final EObject entryRuleWindowPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowPipeline = null;


        try {
            // InternalIoTParser.g:2454:55: (iv_ruleWindowPipeline= ruleWindowPipeline EOF )
            // InternalIoTParser.g:2455:2: iv_ruleWindowPipeline= ruleWindowPipeline EOF
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
    // InternalIoTParser.g:2461:1: ruleWindowPipeline returns [EObject current=null] : ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) ;
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
            // InternalIoTParser.g:2467:2: ( ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) ) )
            // InternalIoTParser.g:2468:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            {
            // InternalIoTParser.g:2468:2: ( () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) ) )
            // InternalIoTParser.g:2469:3: () otherlv_1= ByWindow otherlv_2= LeftSquareBracket ( (lv_width_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket otherlv_5= FullStop ( (lv_execute_6_0= ruleExecutePipeline ) )
            {
            // InternalIoTParser.g:2469:3: ()
            // InternalIoTParser.g:2470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWindowPipelineAccess().getWindowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ByWindow,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getWindowPipelineAccess().getByWindowKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getWindowPipelineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalIoTParser.g:2484:3: ( (lv_width_3_0= RULE_INT ) )
            // InternalIoTParser.g:2485:4: (lv_width_3_0= RULE_INT )
            {
            // InternalIoTParser.g:2485:4: (lv_width_3_0= RULE_INT )
            // InternalIoTParser.g:2486:5: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_45); 

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

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getWindowPipelineAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,FullStop,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getWindowPipelineAccess().getFullStopKeyword_5());
            		
            // InternalIoTParser.g:2510:3: ( (lv_execute_6_0= ruleExecutePipeline ) )
            // InternalIoTParser.g:2511:4: (lv_execute_6_0= ruleExecutePipeline )
            {
            // InternalIoTParser.g:2511:4: (lv_execute_6_0= ruleExecutePipeline )
            // InternalIoTParser.g:2512:5: lv_execute_6_0= ruleExecutePipeline
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
    // InternalIoTParser.g:2533:1: entryRuleExecutePipeline returns [EObject current=null] : iv_ruleExecutePipeline= ruleExecutePipeline EOF ;
    public final EObject entryRuleExecutePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutePipeline = null;


        try {
            // InternalIoTParser.g:2533:56: (iv_ruleExecutePipeline= ruleExecutePipeline EOF )
            // InternalIoTParser.g:2534:2: iv_ruleExecutePipeline= ruleExecutePipeline EOF
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
    // InternalIoTParser.g:2540:1: ruleExecutePipeline returns [EObject current=null] : ( ( () otherlv_1= Mean ) | ( () otherlv_3= Median ) | ( () otherlv_5= Min ) | ( () otherlv_7= Max ) ) ;
    public final EObject ruleExecutePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalIoTParser.g:2546:2: ( ( ( () otherlv_1= Mean ) | ( () otherlv_3= Median ) | ( () otherlv_5= Min ) | ( () otherlv_7= Max ) ) )
            // InternalIoTParser.g:2547:2: ( ( () otherlv_1= Mean ) | ( () otherlv_3= Median ) | ( () otherlv_5= Min ) | ( () otherlv_7= Max ) )
            {
            // InternalIoTParser.g:2547:2: ( ( () otherlv_1= Mean ) | ( () otherlv_3= Median ) | ( () otherlv_5= Min ) | ( () otherlv_7= Max ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case Mean:
                {
                alt31=1;
                }
                break;
            case Median:
                {
                alt31=2;
                }
                break;
            case Min:
                {
                alt31=3;
                }
                break;
            case Max:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalIoTParser.g:2548:3: ( () otherlv_1= Mean )
                    {
                    // InternalIoTParser.g:2548:3: ( () otherlv_1= Mean )
                    // InternalIoTParser.g:2549:4: () otherlv_1= Mean
                    {
                    // InternalIoTParser.g:2549:4: ()
                    // InternalIoTParser.g:2550:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getMeanAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Mean,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExecutePipelineAccess().getMeanKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:2562:3: ( () otherlv_3= Median )
                    {
                    // InternalIoTParser.g:2562:3: ( () otherlv_3= Median )
                    // InternalIoTParser.g:2563:4: () otherlv_3= Median
                    {
                    // InternalIoTParser.g:2563:4: ()
                    // InternalIoTParser.g:2564:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getMedianAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,Median,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExecutePipelineAccess().getMedianKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:2576:3: ( () otherlv_5= Min )
                    {
                    // InternalIoTParser.g:2576:3: ( () otherlv_5= Min )
                    // InternalIoTParser.g:2577:4: () otherlv_5= Min
                    {
                    // InternalIoTParser.g:2577:4: ()
                    // InternalIoTParser.g:2578:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getMinAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,Min,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getExecutePipelineAccess().getMinKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:2590:3: ( () otherlv_7= Max )
                    {
                    // InternalIoTParser.g:2590:3: ( () otherlv_7= Max )
                    // InternalIoTParser.g:2591:4: () otherlv_7= Max
                    {
                    // InternalIoTParser.g:2591:4: ()
                    // InternalIoTParser.g:2592:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecutePipelineAccess().getMaxAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,Max,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExecutePipelineAccess().getMaxKeyword_3_1());
                    			

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
    // InternalIoTParser.g:2607:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalIoTParser.g:2607:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalIoTParser.g:2608:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalIoTParser.g:2614:1: ruleExpression returns [EObject current=null] : this_Conditional_0= ruleConditional ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Conditional_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2620:2: (this_Conditional_0= ruleConditional )
            // InternalIoTParser.g:2621:2: this_Conditional_0= ruleConditional
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
    // InternalIoTParser.g:2632:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalIoTParser.g:2632:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalIoTParser.g:2633:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalIoTParser.g:2639:1: ruleConditional returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Or_0 = null;

        EObject lv_correct_3_0 = null;

        EObject lv_incorrect_5_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2645:2: ( (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? ) )
            // InternalIoTParser.g:2646:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            {
            // InternalIoTParser.g:2646:2: (this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )? )
            // InternalIoTParser.g:2647:3: this_Or_0= ruleOr ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            {

            			newCompositeNode(grammarAccess.getConditionalAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2655:3: ( () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==QuestionMark) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalIoTParser.g:2656:4: () otherlv_2= QuestionMark ( (lv_correct_3_0= ruleConditional ) ) otherlv_4= Colon ( (lv_incorrect_5_0= ruleConditional ) )
                    {
                    // InternalIoTParser.g:2656:4: ()
                    // InternalIoTParser.g:2657:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getConditionalAccess().getConditionalConditionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,QuestionMark,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getQuestionMarkKeyword_1_1());
                    			
                    // InternalIoTParser.g:2667:4: ( (lv_correct_3_0= ruleConditional ) )
                    // InternalIoTParser.g:2668:5: (lv_correct_3_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2668:5: (lv_correct_3_0= ruleConditional )
                    // InternalIoTParser.g:2669:6: lv_correct_3_0= ruleConditional
                    {

                    						newCompositeNode(grammarAccess.getConditionalAccess().getCorrectConditionalParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    otherlv_4=(Token)match(input,Colon,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getColonKeyword_1_3());
                    			
                    // InternalIoTParser.g:2690:4: ( (lv_incorrect_5_0= ruleConditional ) )
                    // InternalIoTParser.g:2691:5: (lv_incorrect_5_0= ruleConditional )
                    {
                    // InternalIoTParser.g:2691:5: (lv_incorrect_5_0= ruleConditional )
                    // InternalIoTParser.g:2692:6: lv_incorrect_5_0= ruleConditional
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
    // InternalIoTParser.g:2714:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalIoTParser.g:2714:43: (iv_ruleOr= ruleOr EOF )
            // InternalIoTParser.g:2715:2: iv_ruleOr= ruleOr EOF
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
    // InternalIoTParser.g:2721:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2727:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? ) )
            // InternalIoTParser.g:2728:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            {
            // InternalIoTParser.g:2728:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )? )
            // InternalIoTParser.g:2729:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2737:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==VerticalLineVerticalLine) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalIoTParser.g:2738:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleOr ) )
                    {
                    // InternalIoTParser.g:2738:4: ()
                    // InternalIoTParser.g:2739:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
                    			
                    // InternalIoTParser.g:2749:4: ( (lv_right_3_0= ruleOr ) )
                    // InternalIoTParser.g:2750:5: (lv_right_3_0= ruleOr )
                    {
                    // InternalIoTParser.g:2750:5: (lv_right_3_0= ruleOr )
                    // InternalIoTParser.g:2751:6: lv_right_3_0= ruleOr
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
    // InternalIoTParser.g:2773:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalIoTParser.g:2773:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalIoTParser.g:2774:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalIoTParser.g:2780:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2786:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? ) )
            // InternalIoTParser.g:2787:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            {
            // InternalIoTParser.g:2787:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )? )
            // InternalIoTParser.g:2788:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2796:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==AmpersandAmpersand) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalIoTParser.g:2797:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleAnd ) )
                    {
                    // InternalIoTParser.g:2797:4: ()
                    // InternalIoTParser.g:2798:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalIoTParser.g:2808:4: ( (lv_right_3_0= ruleAnd ) )
                    // InternalIoTParser.g:2809:5: (lv_right_3_0= ruleAnd )
                    {
                    // InternalIoTParser.g:2809:5: (lv_right_3_0= ruleAnd )
                    // InternalIoTParser.g:2810:6: lv_right_3_0= ruleAnd
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
    // InternalIoTParser.g:2832:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalIoTParser.g:2832:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalIoTParser.g:2833:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalIoTParser.g:2839:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:2845:2: ( (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) )
            // InternalIoTParser.g:2846:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            {
            // InternalIoTParser.g:2846:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            // InternalIoTParser.g:2847:3: this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2855:3: ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==EqualsSignEqualsSign) ) {
                    alt35=1;
                }
                else if ( (LA35_0==ExclamationMarkEqualsSign) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalIoTParser.g:2856:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2856:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2857:5: () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2857:5: ()
            	    // InternalIoTParser.g:2858:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_43); 

            	    					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2868:5: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalIoTParser.g:2869:6: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:2869:6: (lv_right_3_0= ruleComparison )
            	    // InternalIoTParser.g:2870:7: lv_right_3_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_51);
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
            	    // InternalIoTParser.g:2889:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    {
            	    // InternalIoTParser.g:2889:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    // InternalIoTParser.g:2890:5: () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) )
            	    {
            	    // InternalIoTParser.g:2890:5: ()
            	    // InternalIoTParser.g:2891:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_43); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2901:5: ( (lv_right_6_0= ruleComparison ) )
            	    // InternalIoTParser.g:2902:6: (lv_right_6_0= ruleComparison )
            	    {
            	    // InternalIoTParser.g:2902:6: (lv_right_6_0= ruleComparison )
            	    // InternalIoTParser.g:2903:7: lv_right_6_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_51);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalIoTParser.g:2926:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalIoTParser.g:2926:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalIoTParser.g:2927:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalIoTParser.g:2933:1: ruleComparison returns [EObject current=null] : (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) ;
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
            // InternalIoTParser.g:2939:2: ( (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) )
            // InternalIoTParser.g:2940:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            {
            // InternalIoTParser.g:2940:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            // InternalIoTParser.g:2941:3: this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getSubAddParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_SubAdd_0=ruleSubAdd();

            state._fsp--;


            			current = this_SubAdd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:2949:3: ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            loop36:
            do {
                int alt36=5;
                switch ( input.LA(1) ) {
                case LessThanSign:
                    {
                    alt36=1;
                    }
                    break;
                case LessThanSignEqualsSign:
                    {
                    alt36=2;
                    }
                    break;
                case GreaterThanSign:
                    {
                    alt36=3;
                    }
                    break;
                case GreaterThanSignEqualsSign:
                    {
                    alt36=4;
                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // InternalIoTParser.g:2950:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2950:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2951:5: () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2951:5: ()
            	    // InternalIoTParser.g:2952:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,LessThanSign,FOLLOW_43); 

            	    					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:2962:5: ( (lv_right_3_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2963:6: (lv_right_3_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2963:6: (lv_right_3_0= ruleSubAdd )
            	    // InternalIoTParser.g:2964:7: lv_right_3_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_52);
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
            	    // InternalIoTParser.g:2983:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:2983:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:2984:5: () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:2984:5: ()
            	    // InternalIoTParser.g:2985:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,LessThanSignEqualsSign,FOLLOW_43); 

            	    					newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:2995:5: ( (lv_right_6_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:2996:6: (lv_right_6_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:2996:6: (lv_right_6_0= ruleSubAdd )
            	    // InternalIoTParser.g:2997:7: lv_right_6_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_52);
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
            	    // InternalIoTParser.g:3016:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3016:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3017:5: () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3017:5: ()
            	    // InternalIoTParser.g:3018:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,GreaterThanSign,FOLLOW_43); 

            	    					newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_2_1());
            	    				
            	    // InternalIoTParser.g:3028:5: ( (lv_right_9_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3029:6: (lv_right_9_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3029:6: (lv_right_9_0= ruleSubAdd )
            	    // InternalIoTParser.g:3030:7: lv_right_9_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_52);
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
            	    // InternalIoTParser.g:3049:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    {
            	    // InternalIoTParser.g:3049:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    // InternalIoTParser.g:3050:5: () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) )
            	    {
            	    // InternalIoTParser.g:3050:5: ()
            	    // InternalIoTParser.g:3051:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_43); 

            	    					newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalIoTParser.g:3061:5: ( (lv_right_12_0= ruleSubAdd ) )
            	    // InternalIoTParser.g:3062:6: (lv_right_12_0= ruleSubAdd )
            	    {
            	    // InternalIoTParser.g:3062:6: (lv_right_12_0= ruleSubAdd )
            	    // InternalIoTParser.g:3063:7: lv_right_12_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_52);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleSubAdd"
    // InternalIoTParser.g:3086:1: entryRuleSubAdd returns [EObject current=null] : iv_ruleSubAdd= ruleSubAdd EOF ;
    public final EObject entryRuleSubAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAdd = null;


        try {
            // InternalIoTParser.g:3086:47: (iv_ruleSubAdd= ruleSubAdd EOF )
            // InternalIoTParser.g:3087:2: iv_ruleSubAdd= ruleSubAdd EOF
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
    // InternalIoTParser.g:3093:1: ruleSubAdd returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) ;
    public final EObject ruleSubAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3099:2: ( (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) )
            // InternalIoTParser.g:3100:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            {
            // InternalIoTParser.g:3100:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            // InternalIoTParser.g:3101:3: this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubAddAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3109:3: ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==PlusSign) ) {
                    alt37=1;
                }
                else if ( (LA37_0==HyphenMinus) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalIoTParser.g:3110:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:3110:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:3111:5: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:3111:5: ()
            	    // InternalIoTParser.g:3112:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_43); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSubAddAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3122:5: ( (lv_right_3_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:3123:6: (lv_right_3_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:3123:6: (lv_right_3_0= ruleMulDiv )
            	    // InternalIoTParser.g:3124:7: lv_right_3_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
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
            	    // InternalIoTParser.g:3143:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    {
            	    // InternalIoTParser.g:3143:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    // InternalIoTParser.g:3144:5: () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) )
            	    {
            	    // InternalIoTParser.g:3144:5: ()
            	    // InternalIoTParser.g:3145:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,HyphenMinus,FOLLOW_43); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSubAddAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3155:5: ( (lv_right_6_0= ruleMulDiv ) )
            	    // InternalIoTParser.g:3156:6: (lv_right_6_0= ruleMulDiv )
            	    {
            	    // InternalIoTParser.g:3156:6: (lv_right_6_0= ruleMulDiv )
            	    // InternalIoTParser.g:3157:7: lv_right_6_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
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
            	    break loop37;
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
    // InternalIoTParser.g:3180:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalIoTParser.g:3180:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalIoTParser.g:3181:2: iv_ruleMulDiv= ruleMulDiv EOF
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
    // InternalIoTParser.g:3187:1: ruleMulDiv returns [EObject current=null] : (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3193:2: ( (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* ) )
            // InternalIoTParser.g:3194:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            {
            // InternalIoTParser.g:3194:2: (this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )* )
            // InternalIoTParser.g:3195:3: this_Negation_0= ruleNegation ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3203:3: ( ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Asterisk) ) {
                    alt38=1;
                }
                else if ( (LA38_0==Solidus) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalIoTParser.g:3204:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:3204:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:3205:5: () otherlv_2= Asterisk ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:3205:5: ()
            	    // InternalIoTParser.g:3206:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_43); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalIoTParser.g:3216:5: ( (lv_right_3_0= ruleNegation ) )
            	    // InternalIoTParser.g:3217:6: (lv_right_3_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:3217:6: (lv_right_3_0= ruleNegation )
            	    // InternalIoTParser.g:3218:7: lv_right_3_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
            	    // InternalIoTParser.g:3237:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    {
            	    // InternalIoTParser.g:3237:4: ( () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) ) )
            	    // InternalIoTParser.g:3238:5: () otherlv_5= Solidus ( (lv_right_6_0= ruleNegation ) )
            	    {
            	    // InternalIoTParser.g:3238:5: ()
            	    // InternalIoTParser.g:3239:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,Solidus,FOLLOW_43); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMulDivAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalIoTParser.g:3249:5: ( (lv_right_6_0= ruleNegation ) )
            	    // InternalIoTParser.g:3250:6: (lv_right_6_0= ruleNegation )
            	    {
            	    // InternalIoTParser.g:3250:6: (lv_right_6_0= ruleNegation )
            	    // InternalIoTParser.g:3251:7: lv_right_6_0= ruleNegation
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightNegationParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRuleNegation"
    // InternalIoTParser.g:3274:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalIoTParser.g:3274:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalIoTParser.g:3275:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalIoTParser.g:3281:1: ruleNegation returns [EObject current=null] : ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Exponent_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3287:2: ( ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent ) )
            // InternalIoTParser.g:3288:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            {
            // InternalIoTParser.g:3288:2: ( ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) ) | this_Exponent_3= ruleExponent )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==HyphenMinus) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=ExclamationMark && LA39_0<=LeftParenthesis)||(LA39_0>=RULE_INT && LA39_0<=RULE_BOOLEAN)||(LA39_0>=RULE_ID && LA39_0<=RULE_STRING)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalIoTParser.g:3289:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    {
                    // InternalIoTParser.g:3289:3: ( () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) ) )
                    // InternalIoTParser.g:3290:4: () otherlv_1= HyphenMinus ( (lv_value_2_0= ruleExponent ) )
                    {
                    // InternalIoTParser.g:3290:4: ()
                    // InternalIoTParser.g:3291:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_43); 

                    				newLeafNode(otherlv_1, grammarAccess.getNegationAccess().getHyphenMinusKeyword_0_1());
                    			
                    // InternalIoTParser.g:3301:4: ( (lv_value_2_0= ruleExponent ) )
                    // InternalIoTParser.g:3302:5: (lv_value_2_0= ruleExponent )
                    {
                    // InternalIoTParser.g:3302:5: (lv_value_2_0= ruleExponent )
                    // InternalIoTParser.g:3303:6: lv_value_2_0= ruleExponent
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
                    // InternalIoTParser.g:3322:3: this_Exponent_3= ruleExponent
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
    // InternalIoTParser.g:3334:1: entryRuleExponent returns [EObject current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final EObject entryRuleExponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponent = null;


        try {
            // InternalIoTParser.g:3334:49: (iv_ruleExponent= ruleExponent EOF )
            // InternalIoTParser.g:3335:2: iv_ruleExponent= ruleExponent EOF
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
    // InternalIoTParser.g:3341:1: ruleExponent returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) ;
    public final EObject ruleExponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_power_3_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3347:2: ( (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? ) )
            // InternalIoTParser.g:3348:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            {
            // InternalIoTParser.g:3348:2: (this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )? )
            // InternalIoTParser.g:3349:3: this_Not_0= ruleNot ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            {

            			newCompositeNode(grammarAccess.getExponentAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIoTParser.g:3357:3: ( () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==AsteriskAsterisk) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalIoTParser.g:3358:4: () otherlv_2= AsteriskAsterisk ( (lv_power_3_0= ruleNegation ) )
                    {
                    // InternalIoTParser.g:3358:4: ()
                    // InternalIoTParser.g:3359:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExponentAccess().getExponentBaseAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,AsteriskAsterisk,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getExponentAccess().getAsteriskAsteriskKeyword_1_1());
                    			
                    // InternalIoTParser.g:3369:4: ( (lv_power_3_0= ruleNegation ) )
                    // InternalIoTParser.g:3370:5: (lv_power_3_0= ruleNegation )
                    {
                    // InternalIoTParser.g:3370:5: (lv_power_3_0= ruleNegation )
                    // InternalIoTParser.g:3371:6: lv_power_3_0= ruleNegation
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
    // InternalIoTParser.g:3393:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalIoTParser.g:3393:44: (iv_ruleNot= ruleNot EOF )
            // InternalIoTParser.g:3394:2: iv_ruleNot= ruleNot EOF
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
    // InternalIoTParser.g:3400:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject this_Primary_3 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3406:2: ( ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) )
            // InternalIoTParser.g:3407:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            {
            // InternalIoTParser.g:3407:2: ( ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ExclamationMark) ) {
                alt41=1;
            }
            else if ( (LA41_0==LeftParenthesis||(LA41_0>=RULE_INT && LA41_0<=RULE_BOOLEAN)||(LA41_0>=RULE_ID && LA41_0<=RULE_STRING)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalIoTParser.g:3408:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    {
                    // InternalIoTParser.g:3408:3: ( () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) ) )
                    // InternalIoTParser.g:3409:4: () otherlv_1= ExclamationMark ( (lv_value_2_0= rulePrimary ) )
                    {
                    // InternalIoTParser.g:3409:4: ()
                    // InternalIoTParser.g:3410:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_43); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getExclamationMarkKeyword_0_1());
                    			
                    // InternalIoTParser.g:3420:4: ( (lv_value_2_0= rulePrimary ) )
                    // InternalIoTParser.g:3421:5: (lv_value_2_0= rulePrimary )
                    {
                    // InternalIoTParser.g:3421:5: (lv_value_2_0= rulePrimary )
                    // InternalIoTParser.g:3422:6: lv_value_2_0= rulePrimary
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
                    // InternalIoTParser.g:3441:3: this_Primary_3= rulePrimary
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
    // InternalIoTParser.g:3453:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalIoTParser.g:3453:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalIoTParser.g:3454:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalIoTParser.g:3460:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) ;
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
            // InternalIoTParser.g:3466:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral ) )
            // InternalIoTParser.g:3467:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            {
            // InternalIoTParser.g:3467:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Reference_3= ruleReference | this_NumberLiteral_4= ruleNumberLiteral | this_BooleanLiteral_5= ruleBooleanLiteral | this_StringLiteral_6= ruleStringLiteral )
            int alt42=5;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt42=1;
                }
                break;
            case RULE_ID:
                {
                alt42=2;
                }
                break;
            case RULE_INT:
            case RULE_NINT:
            case RULE_DBL:
            case RULE_NDBL:
                {
                alt42=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt42=4;
                }
                break;
            case RULE_STRING:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalIoTParser.g:3468:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalIoTParser.g:3468:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalIoTParser.g:3469:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_43); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_29);
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
                    // InternalIoTParser.g:3487:3: this_Reference_3= ruleReference
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
                    // InternalIoTParser.g:3496:3: this_NumberLiteral_4= ruleNumberLiteral
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
                    // InternalIoTParser.g:3505:3: this_BooleanLiteral_5= ruleBooleanLiteral
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
                    // InternalIoTParser.g:3514:3: this_StringLiteral_6= ruleStringLiteral
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
    // InternalIoTParser.g:3526:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalIoTParser.g:3526:50: (iv_ruleReference= ruleReference EOF )
            // InternalIoTParser.g:3527:2: iv_ruleReference= ruleReference EOF
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
    // InternalIoTParser.g:3533:1: ruleReference returns [EObject current=null] : ( (lv_ref_0_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3539:2: ( ( (lv_ref_0_0= RULE_ID ) ) )
            // InternalIoTParser.g:3540:2: ( (lv_ref_0_0= RULE_ID ) )
            {
            // InternalIoTParser.g:3540:2: ( (lv_ref_0_0= RULE_ID ) )
            // InternalIoTParser.g:3541:3: (lv_ref_0_0= RULE_ID )
            {
            // InternalIoTParser.g:3541:3: (lv_ref_0_0= RULE_ID )
            // InternalIoTParser.g:3542:4: lv_ref_0_0= RULE_ID
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
    // InternalIoTParser.g:3561:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalIoTParser.g:3561:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalIoTParser.g:3562:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalIoTParser.g:3568:1: ruleStringLiteral returns [EObject current=null] : ( (lv_str_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3574:2: ( ( (lv_str_0_0= RULE_STRING ) ) )
            // InternalIoTParser.g:3575:2: ( (lv_str_0_0= RULE_STRING ) )
            {
            // InternalIoTParser.g:3575:2: ( (lv_str_0_0= RULE_STRING ) )
            // InternalIoTParser.g:3576:3: (lv_str_0_0= RULE_STRING )
            {
            // InternalIoTParser.g:3576:3: (lv_str_0_0= RULE_STRING )
            // InternalIoTParser.g:3577:4: lv_str_0_0= RULE_STRING
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
    // InternalIoTParser.g:3596:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalIoTParser.g:3596:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalIoTParser.g:3597:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalIoTParser.g:3603:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_numb_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numb_0_0 = null;



        	enterRule();

        try {
            // InternalIoTParser.g:3609:2: ( ( (lv_numb_0_0= ruleNUMBER ) ) )
            // InternalIoTParser.g:3610:2: ( (lv_numb_0_0= ruleNUMBER ) )
            {
            // InternalIoTParser.g:3610:2: ( (lv_numb_0_0= ruleNUMBER ) )
            // InternalIoTParser.g:3611:3: (lv_numb_0_0= ruleNUMBER )
            {
            // InternalIoTParser.g:3611:3: (lv_numb_0_0= ruleNUMBER )
            // InternalIoTParser.g:3612:4: lv_numb_0_0= ruleNUMBER
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
    // InternalIoTParser.g:3632:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalIoTParser.g:3632:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalIoTParser.g:3633:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalIoTParser.g:3639:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_bool_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_bool_0_0=null;


        	enterRule();

        try {
            // InternalIoTParser.g:3645:2: ( ( (lv_bool_0_0= RULE_BOOLEAN ) ) )
            // InternalIoTParser.g:3646:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            {
            // InternalIoTParser.g:3646:2: ( (lv_bool_0_0= RULE_BOOLEAN ) )
            // InternalIoTParser.g:3647:3: (lv_bool_0_0= RULE_BOOLEAN )
            {
            // InternalIoTParser.g:3647:3: (lv_bool_0_0= RULE_BOOLEAN )
            // InternalIoTParser.g:3648:4: lv_bool_0_0= RULE_BOOLEAN
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
    // InternalIoTParser.g:3667:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3669:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalIoTParser.g:3670:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalIoTParser.g:3679:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DBL_1=null;
        Token this_NINT_2=null;
        Token this_NDBL_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalIoTParser.g:3686:2: ( (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL ) )
            // InternalIoTParser.g:3687:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL )
            {
            // InternalIoTParser.g:3687:2: (this_INT_0= RULE_INT | this_DBL_1= RULE_DBL | this_NINT_2= RULE_NINT | this_NDBL_3= RULE_NDBL )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt43=1;
                }
                break;
            case RULE_DBL:
                {
                alt43=2;
                }
                break;
            case RULE_NINT:
                {
                alt43=3;
                }
                break;
            case RULE_NDBL:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalIoTParser.g:3688:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIoTParser.g:3696:3: this_DBL_1= RULE_DBL
                    {
                    this_DBL_1=(Token)match(input,RULE_DBL,FOLLOW_2); 

                    			current.merge(this_DBL_1);
                    		

                    			newLeafNode(this_DBL_1, grammarAccess.getNUMBERAccess().getDBLTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIoTParser.g:3704:3: this_NINT_2= RULE_NINT
                    {
                    this_NINT_2=(Token)match(input,RULE_NINT,FOLLOW_2); 

                    			current.merge(this_NINT_2);
                    		

                    			newLeafNode(this_NINT_2, grammarAccess.getNUMBERAccess().getNINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalIoTParser.g:3712:3: this_NDBL_3= RULE_NDBL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040082542L,0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000808000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040040000L,0x0000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000804020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000804020000L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000080L,0x0000000000000200L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0043000000000000L,0x000000000000067CL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8020000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000601010000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000021000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1400050000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0050000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0108000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000004000000002L});

}