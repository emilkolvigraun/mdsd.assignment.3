package org.xtext.assingment2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.assingment2.services.MathinterpreterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathinterpreterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'as'", "'let'", "'and'", "'in'", "'end'", "'='", "'external.'", "'('", "','", "')'", "'**'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathinterpreterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathinterpreterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathinterpreterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathinterpreter.g"; }



     	private MathinterpreterGrammarAccess grammarAccess;

        public InternalMathinterpreterParser(TokenStream input, MathinterpreterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MathinterpreterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMathinterpreter.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMathinterpreter.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMathinterpreter.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMathinterpreter.g:71:1: ruleModel returns [EObject current=null] : ( (lv_mathexpression_0_0= ruleMathExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mathexpression_0_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:77:2: ( ( (lv_mathexpression_0_0= ruleMathExpression ) )* )
            // InternalMathinterpreter.g:78:2: ( (lv_mathexpression_0_0= ruleMathExpression ) )*
            {
            // InternalMathinterpreter.g:78:2: ( (lv_mathexpression_0_0= ruleMathExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathinterpreter.g:79:3: (lv_mathexpression_0_0= ruleMathExpression )
            	    {
            	    // InternalMathinterpreter.g:79:3: (lv_mathexpression_0_0= ruleMathExpression )
            	    // InternalMathinterpreter.g:80:4: lv_mathexpression_0_0= ruleMathExpression
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getMathexpressionMathExpressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_mathexpression_0_0=ruleMathExpression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"mathexpression",
            	    					lv_mathexpression_0_0,
            	    					"org.xtext.assingment2.Mathinterpreter.MathExpression");
            	    				afterParserOrEnumRuleCall();
            	    			

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


    // $ANTLR start "entryRuleMathExpression"
    // InternalMathinterpreter.g:100:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // InternalMathinterpreter.g:100:55: (iv_ruleMathExpression= ruleMathExpression EOF )
            // InternalMathinterpreter.g:101:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
             newCompositeNode(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExpression=ruleMathExpression();

            state._fsp--;

             current =iv_ruleMathExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // InternalMathinterpreter.g:107:1: ruleMathExpression returns [EObject current=null] : (this_Function_0= ruleFunction | this_DefineExpr_1= ruleDefineExpr ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_DefineExpr_1 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:113:2: ( (this_Function_0= ruleFunction | this_DefineExpr_1= ruleDefineExpr ) )
            // InternalMathinterpreter.g:114:2: (this_Function_0= ruleFunction | this_DefineExpr_1= ruleDefineExpr )
            {
            // InternalMathinterpreter.g:114:2: (this_Function_0= ruleFunction | this_DefineExpr_1= ruleDefineExpr )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING||LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMathinterpreter.g:115:3: this_Function_0= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getMathExpressionAccess().getFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_0=ruleFunction();

                    state._fsp--;


                    			current = this_Function_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:124:3: this_DefineExpr_1= ruleDefineExpr
                    {

                    			newCompositeNode(grammarAccess.getMathExpressionAccess().getDefineExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefineExpr_1=ruleDefineExpr();

                    state._fsp--;


                    			current = this_DefineExpr_1;
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
    // $ANTLR end "ruleMathExpression"


    // $ANTLR start "entryRuleFunction"
    // InternalMathinterpreter.g:136:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMathinterpreter.g:136:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMathinterpreter.g:137:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalMathinterpreter.g:143:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_expression_3_0= rulePMExpression ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:149:2: ( (otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_expression_3_0= rulePMExpression ) ) ) )
            // InternalMathinterpreter.g:150:2: (otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_expression_3_0= rulePMExpression ) ) )
            {
            // InternalMathinterpreter.g:150:2: (otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_expression_3_0= rulePMExpression ) ) )
            // InternalMathinterpreter.g:151:3: otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_expression_3_0= rulePMExpression ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getResultKeyword_0());
            		
            // InternalMathinterpreter.g:155:3: ( (lv_description_1_0= RULE_STRING ) )
            // InternalMathinterpreter.g:156:4: (lv_description_1_0= RULE_STRING )
            {
            // InternalMathinterpreter.g:156:4: (lv_description_1_0= RULE_STRING )
            // InternalMathinterpreter.g:157:5: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_description_1_0, grammarAccess.getFunctionAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getIsKeyword_2());
            		
            // InternalMathinterpreter.g:177:3: ( (lv_expression_3_0= rulePMExpression ) )
            // InternalMathinterpreter.g:178:4: (lv_expression_3_0= rulePMExpression )
            {
            // InternalMathinterpreter.g:178:4: (lv_expression_3_0= rulePMExpression )
            // InternalMathinterpreter.g:179:5: lv_expression_3_0= rulePMExpression
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getExpressionPMExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=rulePMExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.assingment2.Mathinterpreter.PMExpression");
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefineExpr"
    // InternalMathinterpreter.g:200:1: entryRuleDefineExpr returns [EObject current=null] : iv_ruleDefineExpr= ruleDefineExpr EOF ;
    public final EObject entryRuleDefineExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineExpr = null;


        try {
            // InternalMathinterpreter.g:200:51: (iv_ruleDefineExpr= ruleDefineExpr EOF )
            // InternalMathinterpreter.g:201:2: iv_ruleDefineExpr= ruleDefineExpr EOF
            {
             newCompositeNode(grammarAccess.getDefineExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefineExpr=ruleDefineExpr();

            state._fsp--;

             current =iv_ruleDefineExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineExpr"


    // $ANTLR start "ruleDefineExpr"
    // InternalMathinterpreter.g:207:1: ruleDefineExpr returns [EObject current=null] : ( ( ( (lv_description_0_0= RULE_STRING ) ) otherlv_1= 'as' )? otherlv_2= 'let' ( (lv_variables_3_0= ruleVariable ) ) (otherlv_4= 'and' ( (lv_variables_5_0= ruleVariable ) ) )* otherlv_6= 'in' ( (lv_expression_7_0= rulePMExpression ) ) otherlv_8= 'end' ) ;
    public final EObject ruleDefineExpr() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_expression_7_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:213:2: ( ( ( ( (lv_description_0_0= RULE_STRING ) ) otherlv_1= 'as' )? otherlv_2= 'let' ( (lv_variables_3_0= ruleVariable ) ) (otherlv_4= 'and' ( (lv_variables_5_0= ruleVariable ) ) )* otherlv_6= 'in' ( (lv_expression_7_0= rulePMExpression ) ) otherlv_8= 'end' ) )
            // InternalMathinterpreter.g:214:2: ( ( ( (lv_description_0_0= RULE_STRING ) ) otherlv_1= 'as' )? otherlv_2= 'let' ( (lv_variables_3_0= ruleVariable ) ) (otherlv_4= 'and' ( (lv_variables_5_0= ruleVariable ) ) )* otherlv_6= 'in' ( (lv_expression_7_0= rulePMExpression ) ) otherlv_8= 'end' )
            {
            // InternalMathinterpreter.g:214:2: ( ( ( (lv_description_0_0= RULE_STRING ) ) otherlv_1= 'as' )? otherlv_2= 'let' ( (lv_variables_3_0= ruleVariable ) ) (otherlv_4= 'and' ( (lv_variables_5_0= ruleVariable ) ) )* otherlv_6= 'in' ( (lv_expression_7_0= rulePMExpression ) ) otherlv_8= 'end' )
            // InternalMathinterpreter.g:215:3: ( ( (lv_description_0_0= RULE_STRING ) ) otherlv_1= 'as' )? otherlv_2= 'let' ( (lv_variables_3_0= ruleVariable ) ) (otherlv_4= 'and' ( (lv_variables_5_0= ruleVariable ) ) )* otherlv_6= 'in' ( (lv_expression_7_0= rulePMExpression ) ) otherlv_8= 'end'
            {
            // InternalMathinterpreter.g:215:3: ( ( (lv_description_0_0= RULE_STRING ) ) otherlv_1= 'as' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMathinterpreter.g:216:4: ( (lv_description_0_0= RULE_STRING ) ) otherlv_1= 'as'
                    {
                    // InternalMathinterpreter.g:216:4: ( (lv_description_0_0= RULE_STRING ) )
                    // InternalMathinterpreter.g:217:5: (lv_description_0_0= RULE_STRING )
                    {
                    // InternalMathinterpreter.g:217:5: (lv_description_0_0= RULE_STRING )
                    // InternalMathinterpreter.g:218:6: lv_description_0_0= RULE_STRING
                    {
                    lv_description_0_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_description_0_0, grammarAccess.getDefineExprAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefineExprRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_0_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefineExprAccess().getAsKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDefineExprAccess().getLetKeyword_1());
            		
            // InternalMathinterpreter.g:243:3: ( (lv_variables_3_0= ruleVariable ) )
            // InternalMathinterpreter.g:244:4: (lv_variables_3_0= ruleVariable )
            {
            // InternalMathinterpreter.g:244:4: (lv_variables_3_0= ruleVariable )
            // InternalMathinterpreter.g:245:5: lv_variables_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_variables_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineExprRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_3_0,
            						"org.xtext.assingment2.Mathinterpreter.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathinterpreter.g:262:3: (otherlv_4= 'and' ( (lv_variables_5_0= ruleVariable ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMathinterpreter.g:263:4: otherlv_4= 'and' ( (lv_variables_5_0= ruleVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDefineExprAccess().getAndKeyword_3_0());
            	    			
            	    // InternalMathinterpreter.g:267:4: ( (lv_variables_5_0= ruleVariable ) )
            	    // InternalMathinterpreter.g:268:5: (lv_variables_5_0= ruleVariable )
            	    {
            	    // InternalMathinterpreter.g:268:5: (lv_variables_5_0= ruleVariable )
            	    // InternalMathinterpreter.g:269:6: lv_variables_5_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_variables_5_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefineExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_5_0,
            	    							"org.xtext.assingment2.Mathinterpreter.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDefineExprAccess().getInKeyword_4());
            		
            // InternalMathinterpreter.g:291:3: ( (lv_expression_7_0= rulePMExpression ) )
            // InternalMathinterpreter.g:292:4: (lv_expression_7_0= rulePMExpression )
            {
            // InternalMathinterpreter.g:292:4: (lv_expression_7_0= rulePMExpression )
            // InternalMathinterpreter.g:293:5: lv_expression_7_0= rulePMExpression
            {

            					newCompositeNode(grammarAccess.getDefineExprAccess().getExpressionPMExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_7_0=rulePMExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineExprRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_7_0,
            						"org.xtext.assingment2.Mathinterpreter.PMExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDefineExprAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineExpr"


    // $ANTLR start "entryRuleVariable"
    // InternalMathinterpreter.g:318:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMathinterpreter.g:318:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMathinterpreter.g:319:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMathinterpreter.g:325:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= rulePMExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:331:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= rulePMExpression ) ) ) )
            // InternalMathinterpreter.g:332:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= rulePMExpression ) ) )
            {
            // InternalMathinterpreter.g:332:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= rulePMExpression ) ) )
            // InternalMathinterpreter.g:333:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= rulePMExpression ) )
            {
            // InternalMathinterpreter.g:333:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMathinterpreter.g:334:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMathinterpreter.g:334:4: (lv_name_0_0= RULE_ID )
            // InternalMathinterpreter.g:335:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalMathinterpreter.g:355:3: ( (lv_expression_2_0= rulePMExpression ) )
            // InternalMathinterpreter.g:356:4: (lv_expression_2_0= rulePMExpression )
            {
            // InternalMathinterpreter.g:356:4: (lv_expression_2_0= rulePMExpression )
            // InternalMathinterpreter.g:357:5: lv_expression_2_0= rulePMExpression
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getExpressionPMExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=rulePMExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.assingment2.Mathinterpreter.PMExpression");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExternal"
    // InternalMathinterpreter.g:378:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalMathinterpreter.g:378:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalMathinterpreter.g:379:2: iv_ruleExternal= ruleExternal EOF
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
    // InternalMathinterpreter.g:385:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber ) ) ) (otherlv_4= ',' ( ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_1 = null;

        EObject lv_arguments_3_2 = null;

        EObject lv_arguments_5_1 = null;

        EObject lv_arguments_5_2 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:391:2: ( (otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber ) ) ) (otherlv_4= ',' ( ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) ) ) )* otherlv_6= ')' ) )
            // InternalMathinterpreter.g:392:2: (otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber ) ) ) (otherlv_4= ',' ( ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) ) ) )* otherlv_6= ')' )
            {
            // InternalMathinterpreter.g:392:2: (otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber ) ) ) (otherlv_4= ',' ( ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) ) ) )* otherlv_6= ')' )
            // InternalMathinterpreter.g:393:3: otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber ) ) ) (otherlv_4= ',' ( ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExternalKeyword_0());
            		
            // InternalMathinterpreter.g:397:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathinterpreter.g:398:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathinterpreter.g:398:4: (lv_name_1_0= RULE_ID )
            // InternalMathinterpreter.g:399:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMathinterpreter.g:419:3: ( ( (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber ) ) )
            // InternalMathinterpreter.g:420:4: ( (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber ) )
            {
            // InternalMathinterpreter.g:420:4: ( (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber ) )
            // InternalMathinterpreter.g:421:5: (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber )
            {
            // InternalMathinterpreter.g:421:5: (lv_arguments_3_1= ruleVariableName | lv_arguments_3_2= ruleNumber )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT||LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMathinterpreter.g:422:6: lv_arguments_3_1= ruleVariableName
                    {

                    						newCompositeNode(grammarAccess.getExternalAccess().getArgumentsVariableNameParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_arguments_3_1=ruleVariableName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_1,
                    							"org.xtext.assingment2.Mathinterpreter.VariableName");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:438:6: lv_arguments_3_2= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_arguments_3_2=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_2,
                    							"org.xtext.assingment2.Mathinterpreter.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMathinterpreter.g:456:3: (otherlv_4= ',' ( ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMathinterpreter.g:457:4: otherlv_4= ',' ( ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMathinterpreter.g:461:4: ( ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) ) )
            	    // InternalMathinterpreter.g:462:5: ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) )
            	    {
            	    // InternalMathinterpreter.g:462:5: ( (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber ) )
            	    // InternalMathinterpreter.g:463:6: (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber )
            	    {
            	    // InternalMathinterpreter.g:463:6: (lv_arguments_5_1= ruleVariableName | lv_arguments_5_2= ruleNumber )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_ID) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==RULE_INT||LA6_0==25) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMathinterpreter.g:464:7: lv_arguments_5_1= ruleVariableName
            	            {

            	            							newCompositeNode(grammarAccess.getExternalAccess().getArgumentsVariableNameParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_15);
            	            lv_arguments_5_1=ruleVariableName();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getExternalRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_5_1,
            	            								"org.xtext.assingment2.Mathinterpreter.VariableName");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMathinterpreter.g:480:7: lv_arguments_5_2= ruleNumber
            	            {

            	            							newCompositeNode(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_15);
            	            lv_arguments_5_2=ruleNumber();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getExternalRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_5_2,
            	            								"org.xtext.assingment2.Mathinterpreter.Number");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePMExpression"
    // InternalMathinterpreter.g:507:1: entryRulePMExpression returns [EObject current=null] : iv_rulePMExpression= rulePMExpression EOF ;
    public final EObject entryRulePMExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePMExpression = null;


        try {
            // InternalMathinterpreter.g:507:53: (iv_rulePMExpression= rulePMExpression EOF )
            // InternalMathinterpreter.g:508:2: iv_rulePMExpression= rulePMExpression EOF
            {
             newCompositeNode(grammarAccess.getPMExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePMExpression=rulePMExpression();

            state._fsp--;

             current =iv_rulePMExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePMExpression"


    // $ANTLR start "rulePMExpression"
    // InternalMathinterpreter.g:514:1: rulePMExpression returns [EObject current=null] : (this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )* ) ;
    public final EObject rulePMExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MDExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:520:2: ( (this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )* ) )
            // InternalMathinterpreter.g:521:2: (this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )* )
            {
            // InternalMathinterpreter.g:521:2: (this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )* )
            // InternalMathinterpreter.g:522:3: this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getPMExpressionAccess().getMDExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_MDExpression_0=ruleMDExpression();

            state._fsp--;


            			current = this_MDExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathinterpreter.g:530:3: ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMathinterpreter.g:531:4: () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) )
            	    {
            	    // InternalMathinterpreter.g:531:4: ()
            	    // InternalMathinterpreter.g:532:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPMExpressionAccess().getPMExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMathinterpreter.g:538:4: ( (lv_operator_2_0= rulePlusMinus ) )
            	    // InternalMathinterpreter.g:539:5: (lv_operator_2_0= rulePlusMinus )
            	    {
            	    // InternalMathinterpreter.g:539:5: (lv_operator_2_0= rulePlusMinus )
            	    // InternalMathinterpreter.g:540:6: lv_operator_2_0= rulePlusMinus
            	    {

            	    						newCompositeNode(grammarAccess.getPMExpressionAccess().getOperatorPlusMinusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operator_2_0=rulePlusMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPMExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.xtext.assingment2.Mathinterpreter.PlusMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMathinterpreter.g:557:4: ( (lv_right_3_0= ruleMDExpression ) )
            	    // InternalMathinterpreter.g:558:5: (lv_right_3_0= ruleMDExpression )
            	    {
            	    // InternalMathinterpreter.g:558:5: (lv_right_3_0= ruleMDExpression )
            	    // InternalMathinterpreter.g:559:6: lv_right_3_0= ruleMDExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPMExpressionAccess().getRightMDExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleMDExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPMExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.assingment2.Mathinterpreter.MDExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "rulePMExpression"


    // $ANTLR start "entryRuleMDExpression"
    // InternalMathinterpreter.g:581:1: entryRuleMDExpression returns [EObject current=null] : iv_ruleMDExpression= ruleMDExpression EOF ;
    public final EObject entryRuleMDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDExpression = null;


        try {
            // InternalMathinterpreter.g:581:53: (iv_ruleMDExpression= ruleMDExpression EOF )
            // InternalMathinterpreter.g:582:2: iv_ruleMDExpression= ruleMDExpression EOF
            {
             newCompositeNode(grammarAccess.getMDExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMDExpression=ruleMDExpression();

            state._fsp--;

             current =iv_ruleMDExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMDExpression"


    // $ANTLR start "ruleMDExpression"
    // InternalMathinterpreter.g:588:1: ruleMDExpression returns [EObject current=null] : (this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )* ) ;
    public final EObject ruleMDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PowExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:594:2: ( (this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )* ) )
            // InternalMathinterpreter.g:595:2: (this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )* )
            {
            // InternalMathinterpreter.g:595:2: (this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )* )
            // InternalMathinterpreter.g:596:3: this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMDExpressionAccess().getPowExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_PowExpression_0=rulePowExpression();

            state._fsp--;


            			current = this_PowExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathinterpreter.g:604:3: ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=26 && LA9_0<=27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMathinterpreter.g:605:4: () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) )
            	    {
            	    // InternalMathinterpreter.g:605:4: ()
            	    // InternalMathinterpreter.g:606:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMDExpressionAccess().getMDExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMathinterpreter.g:612:4: ( (lv_operator_2_0= ruleMultiplyDivide ) )
            	    // InternalMathinterpreter.g:613:5: (lv_operator_2_0= ruleMultiplyDivide )
            	    {
            	    // InternalMathinterpreter.g:613:5: (lv_operator_2_0= ruleMultiplyDivide )
            	    // InternalMathinterpreter.g:614:6: lv_operator_2_0= ruleMultiplyDivide
            	    {

            	    						newCompositeNode(grammarAccess.getMDExpressionAccess().getOperatorMultiplyDivideParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operator_2_0=ruleMultiplyDivide();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMDExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.xtext.assingment2.Mathinterpreter.MultiplyDivide");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMathinterpreter.g:631:4: ( (lv_right_3_0= rulePowExpression ) )
            	    // InternalMathinterpreter.g:632:5: (lv_right_3_0= rulePowExpression )
            	    {
            	    // InternalMathinterpreter.g:632:5: (lv_right_3_0= rulePowExpression )
            	    // InternalMathinterpreter.g:633:6: lv_right_3_0= rulePowExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMDExpressionAccess().getRightPowExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=rulePowExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMDExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.assingment2.Mathinterpreter.PowExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleMDExpression"


    // $ANTLR start "entryRulePowExpression"
    // InternalMathinterpreter.g:655:1: entryRulePowExpression returns [EObject current=null] : iv_rulePowExpression= rulePowExpression EOF ;
    public final EObject entryRulePowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowExpression = null;


        try {
            // InternalMathinterpreter.g:655:54: (iv_rulePowExpression= rulePowExpression EOF )
            // InternalMathinterpreter.g:656:2: iv_rulePowExpression= rulePowExpression EOF
            {
             newCompositeNode(grammarAccess.getPowExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowExpression=rulePowExpression();

            state._fsp--;

             current =iv_rulePowExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePowExpression"


    // $ANTLR start "rulePowExpression"
    // InternalMathinterpreter.g:662:1: rulePowExpression returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject rulePowExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:668:2: ( (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMathinterpreter.g:669:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMathinterpreter.g:669:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMathinterpreter.g:670:3: this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getPowExpressionAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathinterpreter.g:678:3: ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMathinterpreter.g:679:4: () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMathinterpreter.g:679:4: ()
            	    // InternalMathinterpreter.g:680:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMathinterpreter.g:686:4: ( (lv_operator_2_0= rulePower ) )
            	    // InternalMathinterpreter.g:687:5: (lv_operator_2_0= rulePower )
            	    {
            	    // InternalMathinterpreter.g:687:5: (lv_operator_2_0= rulePower )
            	    // InternalMathinterpreter.g:688:6: lv_operator_2_0= rulePower
            	    {

            	    						newCompositeNode(grammarAccess.getPowExpressionAccess().getOperatorPowerParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operator_2_0=rulePower();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPowExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.xtext.assingment2.Mathinterpreter.Power");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMathinterpreter.g:705:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMathinterpreter.g:706:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMathinterpreter.g:706:5: (lv_right_3_0= rulePrimary )
            	    // InternalMathinterpreter.g:707:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getPowExpressionAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPowExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.assingment2.Mathinterpreter.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "rulePowExpression"


    // $ANTLR start "entryRulePower"
    // InternalMathinterpreter.g:729:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // InternalMathinterpreter.g:729:46: (iv_rulePower= rulePower EOF )
            // InternalMathinterpreter.g:730:2: iv_rulePower= rulePower EOF
            {
             newCompositeNode(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePower=rulePower();

            state._fsp--;

             current =iv_rulePower; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalMathinterpreter.g:736:1: rulePower returns [EObject current=null] : ( () otherlv_1= '**' ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:742:2: ( ( () otherlv_1= '**' ) )
            // InternalMathinterpreter.g:743:2: ( () otherlv_1= '**' )
            {
            // InternalMathinterpreter.g:743:2: ( () otherlv_1= '**' )
            // InternalMathinterpreter.g:744:3: () otherlv_1= '**'
            {
            // InternalMathinterpreter.g:744:3: ()
            // InternalMathinterpreter.g:745:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPowerAccess().getPowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPowerAccess().getAsteriskAsteriskKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMathinterpreter.g:759:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMathinterpreter.g:759:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMathinterpreter.g:760:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMathinterpreter.g:766:1: rulePlusMinus returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:772:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalMathinterpreter.g:773:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalMathinterpreter.g:773:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMathinterpreter.g:774:3: ( () otherlv_1= '+' )
                    {
                    // InternalMathinterpreter.g:774:3: ( () otherlv_1= '+' )
                    // InternalMathinterpreter.g:775:4: () otherlv_1= '+'
                    {
                    // InternalMathinterpreter.g:775:4: ()
                    // InternalMathinterpreter.g:776:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPlusMinusAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:788:3: ( () otherlv_3= '-' )
                    {
                    // InternalMathinterpreter.g:788:3: ( () otherlv_3= '-' )
                    // InternalMathinterpreter.g:789:4: () otherlv_3= '-'
                    {
                    // InternalMathinterpreter.g:789:4: ()
                    // InternalMathinterpreter.g:790:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPlusMinusAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1());
                    			

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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMultiplyDivide"
    // InternalMathinterpreter.g:805:1: entryRuleMultiplyDivide returns [EObject current=null] : iv_ruleMultiplyDivide= ruleMultiplyDivide EOF ;
    public final EObject entryRuleMultiplyDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplyDivide = null;


        try {
            // InternalMathinterpreter.g:805:55: (iv_ruleMultiplyDivide= ruleMultiplyDivide EOF )
            // InternalMathinterpreter.g:806:2: iv_ruleMultiplyDivide= ruleMultiplyDivide EOF
            {
             newCompositeNode(grammarAccess.getMultiplyDivideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplyDivide=ruleMultiplyDivide();

            state._fsp--;

             current =iv_ruleMultiplyDivide; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplyDivide"


    // $ANTLR start "ruleMultiplyDivide"
    // InternalMathinterpreter.g:812:1: ruleMultiplyDivide returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) ;
    public final EObject ruleMultiplyDivide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:818:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) )
            // InternalMathinterpreter.g:819:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            {
            // InternalMathinterpreter.g:819:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMathinterpreter.g:820:3: ( () otherlv_1= '*' )
                    {
                    // InternalMathinterpreter.g:820:3: ( () otherlv_1= '*' )
                    // InternalMathinterpreter.g:821:4: () otherlv_1= '*'
                    {
                    // InternalMathinterpreter.g:821:4: ()
                    // InternalMathinterpreter.g:822:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultiplyDivideAccess().getMultiplyAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultiplyDivideAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:834:3: ( () otherlv_3= '/' )
                    {
                    // InternalMathinterpreter.g:834:3: ( () otherlv_3= '/' )
                    // InternalMathinterpreter.g:835:4: () otherlv_3= '/'
                    {
                    // InternalMathinterpreter.g:835:4: ()
                    // InternalMathinterpreter.g:836:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultiplyDivideAccess().getDivideAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMultiplyDivideAccess().getSolidusKeyword_1_1());
                    			

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
    // $ANTLR end "ruleMultiplyDivide"


    // $ANTLR start "entryRulePrimary"
    // InternalMathinterpreter.g:851:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathinterpreter.g:851:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathinterpreter.g:852:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMathinterpreter.g:858:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_VariableName_1= ruleVariableName | this_PMParenthesis_2= rulePMParenthesis | this_DefParenthesis_3= ruleDefParenthesis | this_External_4= ruleExternal ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_VariableName_1 = null;

        EObject this_PMParenthesis_2 = null;

        EObject this_DefParenthesis_3 = null;

        EObject this_External_4 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:864:2: ( (this_Number_0= ruleNumber | this_VariableName_1= ruleVariableName | this_PMParenthesis_2= rulePMParenthesis | this_DefParenthesis_3= ruleDefParenthesis | this_External_4= ruleExternal ) )
            // InternalMathinterpreter.g:865:2: (this_Number_0= ruleNumber | this_VariableName_1= ruleVariableName | this_PMParenthesis_2= rulePMParenthesis | this_DefParenthesis_3= ruleDefParenthesis | this_External_4= ruleExternal )
            {
            // InternalMathinterpreter.g:865:2: (this_Number_0= ruleNumber | this_VariableName_1= ruleVariableName | this_PMParenthesis_2= rulePMParenthesis | this_DefParenthesis_3= ruleDefParenthesis | this_External_4= ruleExternal )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 25:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 20:
                {
                int LA13_3 = input.LA(2);

                if ( ((LA13_3>=RULE_ID && LA13_3<=RULE_INT)||(LA13_3>=19 && LA13_3<=20)||LA13_3==25) ) {
                    alt13=3;
                }
                else if ( (LA13_3==RULE_STRING||LA13_3==14) ) {
                    alt13=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMathinterpreter.g:866:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:875:3: this_VariableName_1= ruleVariableName
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableNameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableName_1=ruleVariableName();

                    state._fsp--;


                    			current = this_VariableName_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMathinterpreter.g:884:3: this_PMParenthesis_2= rulePMParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getPMParenthesisParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PMParenthesis_2=rulePMParenthesis();

                    state._fsp--;


                    			current = this_PMParenthesis_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMathinterpreter.g:893:3: this_DefParenthesis_3= ruleDefParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getDefParenthesisParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefParenthesis_3=ruleDefParenthesis();

                    state._fsp--;


                    			current = this_DefParenthesis_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMathinterpreter.g:902:3: this_External_4= ruleExternal
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_External_4=ruleExternal();

                    state._fsp--;


                    			current = this_External_4;
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


    // $ANTLR start "entryRuleVariableName"
    // InternalMathinterpreter.g:914:1: entryRuleVariableName returns [EObject current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final EObject entryRuleVariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableName = null;


        try {
            // InternalMathinterpreter.g:914:53: (iv_ruleVariableName= ruleVariableName EOF )
            // InternalMathinterpreter.g:915:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableName"


    // $ANTLR start "ruleVariableName"
    // InternalMathinterpreter.g:921:1: ruleVariableName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:927:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMathinterpreter.g:928:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMathinterpreter.g:928:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMathinterpreter.g:929:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMathinterpreter.g:929:3: (lv_name_0_0= RULE_ID )
            // InternalMathinterpreter.g:930:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableNameRule());
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
    // $ANTLR end "ruleVariableName"


    // $ANTLR start "entryRuleNumber"
    // InternalMathinterpreter.g:949:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathinterpreter.g:949:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathinterpreter.g:950:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathinterpreter.g:956:1: ruleNumber returns [EObject current=null] : (this_Positive_0= rulePositive | this_Negative_1= ruleNegative ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_Positive_0 = null;

        EObject this_Negative_1 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:962:2: ( (this_Positive_0= rulePositive | this_Negative_1= ruleNegative ) )
            // InternalMathinterpreter.g:963:2: (this_Positive_0= rulePositive | this_Negative_1= ruleNegative )
            {
            // InternalMathinterpreter.g:963:2: (this_Positive_0= rulePositive | this_Negative_1= ruleNegative )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==25) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMathinterpreter.g:964:3: this_Positive_0= rulePositive
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getPositiveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Positive_0=rulePositive();

                    state._fsp--;


                    			current = this_Positive_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:973:3: this_Negative_1= ruleNegative
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getNegativeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negative_1=ruleNegative();

                    state._fsp--;


                    			current = this_Negative_1;
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRulePositive"
    // InternalMathinterpreter.g:985:1: entryRulePositive returns [EObject current=null] : iv_rulePositive= rulePositive EOF ;
    public final EObject entryRulePositive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositive = null;


        try {
            // InternalMathinterpreter.g:985:49: (iv_rulePositive= rulePositive EOF )
            // InternalMathinterpreter.g:986:2: iv_rulePositive= rulePositive EOF
            {
             newCompositeNode(grammarAccess.getPositiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositive=rulePositive();

            state._fsp--;

             current =iv_rulePositive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositive"


    // $ANTLR start "rulePositive"
    // InternalMathinterpreter.g:992:1: rulePositive returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject rulePositive() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:998:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMathinterpreter.g:999:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMathinterpreter.g:999:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMathinterpreter.g:1000:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMathinterpreter.g:1000:3: (lv_value_0_0= RULE_INT )
            // InternalMathinterpreter.g:1001:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getPositiveAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPositiveRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "rulePositive"


    // $ANTLR start "entryRuleNegative"
    // InternalMathinterpreter.g:1020:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalMathinterpreter.g:1020:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalMathinterpreter.g:1021:2: iv_ruleNegative= ruleNegative EOF
            {
             newCompositeNode(grammarAccess.getNegativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegative=ruleNegative();

            state._fsp--;

             current =iv_ruleNegative; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegative"


    // $ANTLR start "ruleNegative"
    // InternalMathinterpreter.g:1027:1: ruleNegative returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:1033:2: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMathinterpreter.g:1034:2: (otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMathinterpreter.g:1034:2: (otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMathinterpreter.g:1035:3: otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_0());
            		
            // InternalMathinterpreter.g:1039:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMathinterpreter.g:1040:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMathinterpreter.g:1040:4: (lv_value_1_0= RULE_INT )
            // InternalMathinterpreter.g:1041:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNegativeAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNegativeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNegative"


    // $ANTLR start "entryRulePMParenthesis"
    // InternalMathinterpreter.g:1061:1: entryRulePMParenthesis returns [EObject current=null] : iv_rulePMParenthesis= rulePMParenthesis EOF ;
    public final EObject entryRulePMParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePMParenthesis = null;


        try {
            // InternalMathinterpreter.g:1061:54: (iv_rulePMParenthesis= rulePMParenthesis EOF )
            // InternalMathinterpreter.g:1062:2: iv_rulePMParenthesis= rulePMParenthesis EOF
            {
             newCompositeNode(grammarAccess.getPMParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePMParenthesis=rulePMParenthesis();

            state._fsp--;

             current =iv_rulePMParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePMParenthesis"


    // $ANTLR start "rulePMParenthesis"
    // InternalMathinterpreter.g:1068:1: rulePMParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= rulePMExpression ) ) otherlv_2= ')' ) ;
    public final EObject rulePMParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:1074:2: ( (otherlv_0= '(' ( (lv_expression_1_0= rulePMExpression ) ) otherlv_2= ')' ) )
            // InternalMathinterpreter.g:1075:2: (otherlv_0= '(' ( (lv_expression_1_0= rulePMExpression ) ) otherlv_2= ')' )
            {
            // InternalMathinterpreter.g:1075:2: (otherlv_0= '(' ( (lv_expression_1_0= rulePMExpression ) ) otherlv_2= ')' )
            // InternalMathinterpreter.g:1076:3: otherlv_0= '(' ( (lv_expression_1_0= rulePMExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPMParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMathinterpreter.g:1080:3: ( (lv_expression_1_0= rulePMExpression ) )
            // InternalMathinterpreter.g:1081:4: (lv_expression_1_0= rulePMExpression )
            {
            // InternalMathinterpreter.g:1081:4: (lv_expression_1_0= rulePMExpression )
            // InternalMathinterpreter.g:1082:5: lv_expression_1_0= rulePMExpression
            {

            					newCompositeNode(grammarAccess.getPMParenthesisAccess().getExpressionPMExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_expression_1_0=rulePMExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPMParenthesisRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.assingment2.Mathinterpreter.PMExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPMParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePMParenthesis"


    // $ANTLR start "entryRuleDefParenthesis"
    // InternalMathinterpreter.g:1107:1: entryRuleDefParenthesis returns [EObject current=null] : iv_ruleDefParenthesis= ruleDefParenthesis EOF ;
    public final EObject entryRuleDefParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefParenthesis = null;


        try {
            // InternalMathinterpreter.g:1107:55: (iv_ruleDefParenthesis= ruleDefParenthesis EOF )
            // InternalMathinterpreter.g:1108:2: iv_ruleDefParenthesis= ruleDefParenthesis EOF
            {
             newCompositeNode(grammarAccess.getDefParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefParenthesis=ruleDefParenthesis();

            state._fsp--;

             current =iv_ruleDefParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefParenthesis"


    // $ANTLR start "ruleDefParenthesis"
    // InternalMathinterpreter.g:1114:1: ruleDefParenthesis returns [EObject current=null] : (otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')' ) ;
    public final EObject ruleDefParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DefineExpr_1 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:1120:2: ( (otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')' ) )
            // InternalMathinterpreter.g:1121:2: (otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')' )
            {
            // InternalMathinterpreter.g:1121:2: (otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')' )
            // InternalMathinterpreter.g:1122:3: otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getDefParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDefParenthesisAccess().getDefineExprParserRuleCall_1());
            		
            pushFollow(FOLLOW_20);
            this_DefineExpr_1=ruleDefineExpr();

            state._fsp--;


            			current = this_DefineExpr_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDefParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefParenthesis"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002180060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000404810L});

}