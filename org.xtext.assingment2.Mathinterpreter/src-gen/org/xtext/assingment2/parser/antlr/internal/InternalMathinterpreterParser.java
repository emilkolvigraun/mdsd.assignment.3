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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'let'", "'and'", "'in'", "'end'", "'='", "'external.'", "'('", "','", "')'", "'**'", "'+'", "'-'", "'*'", "'/'"
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

                if ( (LA1_0==11||LA1_0==13) ) {
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
            else if ( (LA2_0==13) ) {
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
    // InternalMathinterpreter.g:143:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( ( (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal ) ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_1 = null;

        EObject lv_expression_3_2 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:149:2: ( (otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( ( (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal ) ) ) ) )
            // InternalMathinterpreter.g:150:2: (otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( ( (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal ) ) ) )
            {
            // InternalMathinterpreter.g:150:2: (otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( ( (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal ) ) ) )
            // InternalMathinterpreter.g:151:3: otherlv_0= 'result' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'is' ( ( (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal ) ) )
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
            		
            // InternalMathinterpreter.g:177:3: ( ( (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal ) ) )
            // InternalMathinterpreter.g:178:4: ( (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal ) )
            {
            // InternalMathinterpreter.g:178:4: ( (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal ) )
            // InternalMathinterpreter.g:179:5: (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal )
            {
            // InternalMathinterpreter.g:179:5: (lv_expression_3_1= rulePMExpression | lv_expression_3_2= ruleExternal )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==19||LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMathinterpreter.g:180:6: lv_expression_3_1= rulePMExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getExpressionPMExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_1=rulePMExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_1,
                    							"org.xtext.assingment2.Mathinterpreter.PMExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:196:6: lv_expression_3_2= ruleExternal
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getExpressionExternalParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_2=ruleExternal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_2,
                    							"org.xtext.assingment2.Mathinterpreter.External");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // InternalMathinterpreter.g:218:1: entryRuleDefineExpr returns [EObject current=null] : iv_ruleDefineExpr= ruleDefineExpr EOF ;
    public final EObject entryRuleDefineExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineExpr = null;


        try {
            // InternalMathinterpreter.g:218:51: (iv_ruleDefineExpr= ruleDefineExpr EOF )
            // InternalMathinterpreter.g:219:2: iv_ruleDefineExpr= ruleDefineExpr EOF
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
    // InternalMathinterpreter.g:225:1: ruleDefineExpr returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= 'and' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= 'in' ( ( (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal ) ) ) otherlv_6= 'end' ) ;
    public final EObject ruleDefineExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_expression_5_1 = null;

        EObject lv_expression_5_2 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:231:2: ( (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= 'and' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= 'in' ( ( (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal ) ) ) otherlv_6= 'end' ) )
            // InternalMathinterpreter.g:232:2: (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= 'and' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= 'in' ( ( (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal ) ) ) otherlv_6= 'end' )
            {
            // InternalMathinterpreter.g:232:2: (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= 'and' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= 'in' ( ( (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal ) ) ) otherlv_6= 'end' )
            // InternalMathinterpreter.g:233:3: otherlv_0= 'let' ( (lv_variables_1_0= ruleVariable ) ) (otherlv_2= 'and' ( (lv_variables_3_0= ruleVariable ) ) )* otherlv_4= 'in' ( ( (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal ) ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineExprAccess().getLetKeyword_0());
            		
            // InternalMathinterpreter.g:237:3: ( (lv_variables_1_0= ruleVariable ) )
            // InternalMathinterpreter.g:238:4: (lv_variables_1_0= ruleVariable )
            {
            // InternalMathinterpreter.g:238:4: (lv_variables_1_0= ruleVariable )
            // InternalMathinterpreter.g:239:5: lv_variables_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_variables_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineExprRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_1_0,
            						"org.xtext.assingment2.Mathinterpreter.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathinterpreter.g:256:3: (otherlv_2= 'and' ( (lv_variables_3_0= ruleVariable ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMathinterpreter.g:257:4: otherlv_2= 'and' ( (lv_variables_3_0= ruleVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDefineExprAccess().getAndKeyword_2_0());
            	    			
            	    // InternalMathinterpreter.g:261:4: ( (lv_variables_3_0= ruleVariable ) )
            	    // InternalMathinterpreter.g:262:5: (lv_variables_3_0= ruleVariable )
            	    {
            	    // InternalMathinterpreter.g:262:5: (lv_variables_3_0= ruleVariable )
            	    // InternalMathinterpreter.g:263:6: lv_variables_3_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDefineExprAccess().getInKeyword_3());
            		
            // InternalMathinterpreter.g:285:3: ( ( (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal ) ) )
            // InternalMathinterpreter.g:286:4: ( (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal ) )
            {
            // InternalMathinterpreter.g:286:4: ( (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal ) )
            // InternalMathinterpreter.g:287:5: (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal )
            {
            // InternalMathinterpreter.g:287:5: (lv_expression_5_1= rulePMExpression | lv_expression_5_2= ruleExternal )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==19||LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMathinterpreter.g:288:6: lv_expression_5_1= rulePMExpression
                    {

                    						newCompositeNode(grammarAccess.getDefineExprAccess().getExpressionPMExpressionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_expression_5_1=rulePMExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineExprRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_1,
                    							"org.xtext.assingment2.Mathinterpreter.PMExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:304:6: lv_expression_5_2= ruleExternal
                    {

                    						newCompositeNode(grammarAccess.getDefineExprAccess().getExpressionExternalParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_9);
                    lv_expression_5_2=ruleExternal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineExprRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_2,
                    							"org.xtext.assingment2.Mathinterpreter.External");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDefineExprAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalMathinterpreter.g:330:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMathinterpreter.g:330:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMathinterpreter.g:331:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMathinterpreter.g:337:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_1 = null;

        EObject lv_expression_2_2 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:343:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal ) ) ) ) )
            // InternalMathinterpreter.g:344:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal ) ) ) )
            {
            // InternalMathinterpreter.g:344:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal ) ) ) )
            // InternalMathinterpreter.g:345:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal ) ) )
            {
            // InternalMathinterpreter.g:345:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMathinterpreter.g:346:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMathinterpreter.g:346:4: (lv_name_0_0= RULE_ID )
            // InternalMathinterpreter.g:347:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalMathinterpreter.g:367:3: ( ( (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal ) ) )
            // InternalMathinterpreter.g:368:4: ( (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal ) )
            {
            // InternalMathinterpreter.g:368:4: ( (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal ) )
            // InternalMathinterpreter.g:369:5: (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal )
            {
            // InternalMathinterpreter.g:369:5: (lv_expression_2_1= rulePMExpression | lv_expression_2_2= ruleExternal )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||LA6_0==19||LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMathinterpreter.g:370:6: lv_expression_2_1= rulePMExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getExpressionPMExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_1=rulePMExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_1,
                    							"org.xtext.assingment2.Mathinterpreter.PMExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:386:6: lv_expression_2_2= ruleExternal
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getExpressionExternalParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_2=ruleExternal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_2,
                    							"org.xtext.assingment2.Mathinterpreter.External");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // InternalMathinterpreter.g:408:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalMathinterpreter.g:408:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalMathinterpreter.g:409:2: iv_ruleExternal= ruleExternal EOF
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
    // InternalMathinterpreter.g:415:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNumber ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:421:2: ( (otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNumber ) ) )* otherlv_6= ')' ) )
            // InternalMathinterpreter.g:422:2: (otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNumber ) ) )* otherlv_6= ')' )
            {
            // InternalMathinterpreter.g:422:2: (otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNumber ) ) )* otherlv_6= ')' )
            // InternalMathinterpreter.g:423:3: otherlv_0= 'external.' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNumber ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExternalKeyword_0());
            		
            // InternalMathinterpreter.g:427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathinterpreter.g:428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathinterpreter.g:428:4: (lv_name_1_0= RULE_ID )
            // InternalMathinterpreter.g:429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMathinterpreter.g:449:3: ( (lv_arguments_3_0= ruleNumber ) )
            // InternalMathinterpreter.g:450:4: (lv_arguments_3_0= ruleNumber )
            {
            // InternalMathinterpreter.g:450:4: (lv_arguments_3_0= ruleNumber )
            // InternalMathinterpreter.g:451:5: lv_arguments_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_arguments_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_3_0,
            						"org.xtext.assingment2.Mathinterpreter.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathinterpreter.g:468:3: (otherlv_4= ',' ( (lv_arguments_5_0= ruleNumber ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMathinterpreter.g:469:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleNumber ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_12); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMathinterpreter.g:473:4: ( (lv_arguments_5_0= ruleNumber ) )
            	    // InternalMathinterpreter.g:474:5: (lv_arguments_5_0= ruleNumber )
            	    {
            	    // InternalMathinterpreter.g:474:5: (lv_arguments_5_0= ruleNumber )
            	    // InternalMathinterpreter.g:475:6: lv_arguments_5_0= ruleNumber
            	    {

            	    						newCompositeNode(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_arguments_5_0=ruleNumber();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_5_0,
            	    							"org.xtext.assingment2.Mathinterpreter.Number");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMathinterpreter.g:501:1: entryRulePMExpression returns [EObject current=null] : iv_rulePMExpression= rulePMExpression EOF ;
    public final EObject entryRulePMExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePMExpression = null;


        try {
            // InternalMathinterpreter.g:501:53: (iv_rulePMExpression= rulePMExpression EOF )
            // InternalMathinterpreter.g:502:2: iv_rulePMExpression= rulePMExpression EOF
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
    // InternalMathinterpreter.g:508:1: rulePMExpression returns [EObject current=null] : (this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )* ) ;
    public final EObject rulePMExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MDExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:514:2: ( (this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )* ) )
            // InternalMathinterpreter.g:515:2: (this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )* )
            {
            // InternalMathinterpreter.g:515:2: (this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )* )
            // InternalMathinterpreter.g:516:3: this_MDExpression_0= ruleMDExpression ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getPMExpressionAccess().getMDExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_MDExpression_0=ruleMDExpression();

            state._fsp--;


            			current = this_MDExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathinterpreter.g:524:3: ( () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=23 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMathinterpreter.g:525:4: () ( (lv_operator_2_0= rulePlusMinus ) ) ( (lv_right_3_0= ruleMDExpression ) )
            	    {
            	    // InternalMathinterpreter.g:525:4: ()
            	    // InternalMathinterpreter.g:526:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPMExpressionAccess().getPMExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMathinterpreter.g:532:4: ( (lv_operator_2_0= rulePlusMinus ) )
            	    // InternalMathinterpreter.g:533:5: (lv_operator_2_0= rulePlusMinus )
            	    {
            	    // InternalMathinterpreter.g:533:5: (lv_operator_2_0= rulePlusMinus )
            	    // InternalMathinterpreter.g:534:6: lv_operator_2_0= rulePlusMinus
            	    {

            	    						newCompositeNode(grammarAccess.getPMExpressionAccess().getOperatorPlusMinusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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

            	    // InternalMathinterpreter.g:551:4: ( (lv_right_3_0= ruleMDExpression ) )
            	    // InternalMathinterpreter.g:552:5: (lv_right_3_0= ruleMDExpression )
            	    {
            	    // InternalMathinterpreter.g:552:5: (lv_right_3_0= ruleMDExpression )
            	    // InternalMathinterpreter.g:553:6: lv_right_3_0= ruleMDExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPMExpressionAccess().getRightMDExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
    // InternalMathinterpreter.g:575:1: entryRuleMDExpression returns [EObject current=null] : iv_ruleMDExpression= ruleMDExpression EOF ;
    public final EObject entryRuleMDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDExpression = null;


        try {
            // InternalMathinterpreter.g:575:53: (iv_ruleMDExpression= ruleMDExpression EOF )
            // InternalMathinterpreter.g:576:2: iv_ruleMDExpression= ruleMDExpression EOF
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
    // InternalMathinterpreter.g:582:1: ruleMDExpression returns [EObject current=null] : (this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )* ) ;
    public final EObject ruleMDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PowExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:588:2: ( (this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )* ) )
            // InternalMathinterpreter.g:589:2: (this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )* )
            {
            // InternalMathinterpreter.g:589:2: (this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )* )
            // InternalMathinterpreter.g:590:3: this_PowExpression_0= rulePowExpression ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMDExpressionAccess().getPowExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_PowExpression_0=rulePowExpression();

            state._fsp--;


            			current = this_PowExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathinterpreter.g:598:3: ( () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=25 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMathinterpreter.g:599:4: () ( (lv_operator_2_0= ruleMultiplyDivide ) ) ( (lv_right_3_0= rulePowExpression ) )
            	    {
            	    // InternalMathinterpreter.g:599:4: ()
            	    // InternalMathinterpreter.g:600:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMDExpressionAccess().getMDExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMathinterpreter.g:606:4: ( (lv_operator_2_0= ruleMultiplyDivide ) )
            	    // InternalMathinterpreter.g:607:5: (lv_operator_2_0= ruleMultiplyDivide )
            	    {
            	    // InternalMathinterpreter.g:607:5: (lv_operator_2_0= ruleMultiplyDivide )
            	    // InternalMathinterpreter.g:608:6: lv_operator_2_0= ruleMultiplyDivide
            	    {

            	    						newCompositeNode(grammarAccess.getMDExpressionAccess().getOperatorMultiplyDivideParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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

            	    // InternalMathinterpreter.g:625:4: ( (lv_right_3_0= rulePowExpression ) )
            	    // InternalMathinterpreter.g:626:5: (lv_right_3_0= rulePowExpression )
            	    {
            	    // InternalMathinterpreter.g:626:5: (lv_right_3_0= rulePowExpression )
            	    // InternalMathinterpreter.g:627:6: lv_right_3_0= rulePowExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMDExpressionAccess().getRightPowExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
    // InternalMathinterpreter.g:649:1: entryRulePowExpression returns [EObject current=null] : iv_rulePowExpression= rulePowExpression EOF ;
    public final EObject entryRulePowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowExpression = null;


        try {
            // InternalMathinterpreter.g:649:54: (iv_rulePowExpression= rulePowExpression EOF )
            // InternalMathinterpreter.g:650:2: iv_rulePowExpression= rulePowExpression EOF
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
    // InternalMathinterpreter.g:656:1: rulePowExpression returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject rulePowExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:662:2: ( (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMathinterpreter.g:663:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMathinterpreter.g:663:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMathinterpreter.g:664:3: this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getPowExpressionAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathinterpreter.g:672:3: ( () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMathinterpreter.g:673:4: () ( (lv_operator_2_0= rulePower ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMathinterpreter.g:673:4: ()
            	    // InternalMathinterpreter.g:674:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMathinterpreter.g:680:4: ( (lv_operator_2_0= rulePower ) )
            	    // InternalMathinterpreter.g:681:5: (lv_operator_2_0= rulePower )
            	    {
            	    // InternalMathinterpreter.g:681:5: (lv_operator_2_0= rulePower )
            	    // InternalMathinterpreter.g:682:6: lv_operator_2_0= rulePower
            	    {

            	    						newCompositeNode(grammarAccess.getPowExpressionAccess().getOperatorPowerParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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

            	    // InternalMathinterpreter.g:699:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMathinterpreter.g:700:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMathinterpreter.g:700:5: (lv_right_3_0= rulePrimary )
            	    // InternalMathinterpreter.g:701:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getPowExpressionAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
    // InternalMathinterpreter.g:723:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // InternalMathinterpreter.g:723:46: (iv_rulePower= rulePower EOF )
            // InternalMathinterpreter.g:724:2: iv_rulePower= rulePower EOF
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
    // InternalMathinterpreter.g:730:1: rulePower returns [EObject current=null] : ( () otherlv_1= '**' ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:736:2: ( ( () otherlv_1= '**' ) )
            // InternalMathinterpreter.g:737:2: ( () otherlv_1= '**' )
            {
            // InternalMathinterpreter.g:737:2: ( () otherlv_1= '**' )
            // InternalMathinterpreter.g:738:3: () otherlv_1= '**'
            {
            // InternalMathinterpreter.g:738:3: ()
            // InternalMathinterpreter.g:739:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPowerAccess().getPowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMathinterpreter.g:753:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMathinterpreter.g:753:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMathinterpreter.g:754:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalMathinterpreter.g:760:1: rulePlusMinus returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:766:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalMathinterpreter.g:767:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalMathinterpreter.g:767:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMathinterpreter.g:768:3: ( () otherlv_1= '+' )
                    {
                    // InternalMathinterpreter.g:768:3: ( () otherlv_1= '+' )
                    // InternalMathinterpreter.g:769:4: () otherlv_1= '+'
                    {
                    // InternalMathinterpreter.g:769:4: ()
                    // InternalMathinterpreter.g:770:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPlusMinusAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:782:3: ( () otherlv_3= '-' )
                    {
                    // InternalMathinterpreter.g:782:3: ( () otherlv_3= '-' )
                    // InternalMathinterpreter.g:783:4: () otherlv_3= '-'
                    {
                    // InternalMathinterpreter.g:783:4: ()
                    // InternalMathinterpreter.g:784:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPlusMinusAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMathinterpreter.g:799:1: entryRuleMultiplyDivide returns [EObject current=null] : iv_ruleMultiplyDivide= ruleMultiplyDivide EOF ;
    public final EObject entryRuleMultiplyDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplyDivide = null;


        try {
            // InternalMathinterpreter.g:799:55: (iv_ruleMultiplyDivide= ruleMultiplyDivide EOF )
            // InternalMathinterpreter.g:800:2: iv_ruleMultiplyDivide= ruleMultiplyDivide EOF
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
    // InternalMathinterpreter.g:806:1: ruleMultiplyDivide returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) ;
    public final EObject ruleMultiplyDivide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:812:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) )
            // InternalMathinterpreter.g:813:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            {
            // InternalMathinterpreter.g:813:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMathinterpreter.g:814:3: ( () otherlv_1= '*' )
                    {
                    // InternalMathinterpreter.g:814:3: ( () otherlv_1= '*' )
                    // InternalMathinterpreter.g:815:4: () otherlv_1= '*'
                    {
                    // InternalMathinterpreter.g:815:4: ()
                    // InternalMathinterpreter.g:816:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultiplyDivideAccess().getMultiplyAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultiplyDivideAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:828:3: ( () otherlv_3= '/' )
                    {
                    // InternalMathinterpreter.g:828:3: ( () otherlv_3= '/' )
                    // InternalMathinterpreter.g:829:4: () otherlv_3= '/'
                    {
                    // InternalMathinterpreter.g:829:4: ()
                    // InternalMathinterpreter.g:830:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultiplyDivideAccess().getDivideAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMathinterpreter.g:845:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathinterpreter.g:845:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathinterpreter.g:846:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMathinterpreter.g:852:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_VariableName_1= ruleVariableName | this_PMParenthesis_2= rulePMParenthesis | this_DefParenthesis_3= ruleDefParenthesis ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_VariableName_1 = null;

        EObject this_PMParenthesis_2 = null;

        EObject this_DefParenthesis_3 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:858:2: ( (this_Number_0= ruleNumber | this_VariableName_1= ruleVariableName | this_PMParenthesis_2= rulePMParenthesis | this_DefParenthesis_3= ruleDefParenthesis ) )
            // InternalMathinterpreter.g:859:2: (this_Number_0= ruleNumber | this_VariableName_1= ruleVariableName | this_PMParenthesis_2= rulePMParenthesis | this_DefParenthesis_3= ruleDefParenthesis )
            {
            // InternalMathinterpreter.g:859:2: (this_Number_0= ruleNumber | this_VariableName_1= ruleVariableName | this_PMParenthesis_2= rulePMParenthesis | this_DefParenthesis_3= ruleDefParenthesis )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 24:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 19:
                {
                int LA13_3 = input.LA(2);

                if ( ((LA13_3>=RULE_ID && LA13_3<=RULE_INT)||(LA13_3>=18 && LA13_3<=19)||LA13_3==24) ) {
                    alt13=3;
                }
                else if ( (LA13_3==13) ) {
                    alt13=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMathinterpreter.g:860:3: this_Number_0= ruleNumber
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
                    // InternalMathinterpreter.g:869:3: this_VariableName_1= ruleVariableName
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
                    // InternalMathinterpreter.g:878:3: this_PMParenthesis_2= rulePMParenthesis
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
                    // InternalMathinterpreter.g:887:3: this_DefParenthesis_3= ruleDefParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getDefParenthesisParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefParenthesis_3=ruleDefParenthesis();

                    state._fsp--;


                    			current = this_DefParenthesis_3;
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
    // InternalMathinterpreter.g:899:1: entryRuleVariableName returns [EObject current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final EObject entryRuleVariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableName = null;


        try {
            // InternalMathinterpreter.g:899:53: (iv_ruleVariableName= ruleVariableName EOF )
            // InternalMathinterpreter.g:900:2: iv_ruleVariableName= ruleVariableName EOF
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
    // InternalMathinterpreter.g:906:1: ruleVariableName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:912:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMathinterpreter.g:913:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMathinterpreter.g:913:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMathinterpreter.g:914:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMathinterpreter.g:914:3: (lv_name_0_0= RULE_ID )
            // InternalMathinterpreter.g:915:4: lv_name_0_0= RULE_ID
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
    // InternalMathinterpreter.g:934:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathinterpreter.g:934:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathinterpreter.g:935:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalMathinterpreter.g:941:1: ruleNumber returns [EObject current=null] : (this_Positive_0= rulePositive | this_Negative_1= ruleNegative ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_Positive_0 = null;

        EObject this_Negative_1 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:947:2: ( (this_Positive_0= rulePositive | this_Negative_1= ruleNegative ) )
            // InternalMathinterpreter.g:948:2: (this_Positive_0= rulePositive | this_Negative_1= ruleNegative )
            {
            // InternalMathinterpreter.g:948:2: (this_Positive_0= rulePositive | this_Negative_1= ruleNegative )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMathinterpreter.g:949:3: this_Positive_0= rulePositive
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
                    // InternalMathinterpreter.g:958:3: this_Negative_1= ruleNegative
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
    // InternalMathinterpreter.g:970:1: entryRulePositive returns [EObject current=null] : iv_rulePositive= rulePositive EOF ;
    public final EObject entryRulePositive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositive = null;


        try {
            // InternalMathinterpreter.g:970:49: (iv_rulePositive= rulePositive EOF )
            // InternalMathinterpreter.g:971:2: iv_rulePositive= rulePositive EOF
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
    // InternalMathinterpreter.g:977:1: rulePositive returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject rulePositive() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:983:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMathinterpreter.g:984:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMathinterpreter.g:984:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMathinterpreter.g:985:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMathinterpreter.g:985:3: (lv_value_0_0= RULE_INT )
            // InternalMathinterpreter.g:986:4: lv_value_0_0= RULE_INT
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
    // InternalMathinterpreter.g:1005:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalMathinterpreter.g:1005:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalMathinterpreter.g:1006:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalMathinterpreter.g:1012:1: ruleNegative returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMathinterpreter.g:1018:2: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMathinterpreter.g:1019:2: (otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMathinterpreter.g:1019:2: (otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMathinterpreter.g:1020:3: otherlv_0= '-' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_0());
            		
            // InternalMathinterpreter.g:1024:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMathinterpreter.g:1025:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMathinterpreter.g:1025:4: (lv_value_1_0= RULE_INT )
            // InternalMathinterpreter.g:1026:5: lv_value_1_0= RULE_INT
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
    // InternalMathinterpreter.g:1046:1: entryRulePMParenthesis returns [EObject current=null] : iv_rulePMParenthesis= rulePMParenthesis EOF ;
    public final EObject entryRulePMParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePMParenthesis = null;


        try {
            // InternalMathinterpreter.g:1046:54: (iv_rulePMParenthesis= rulePMParenthesis EOF )
            // InternalMathinterpreter.g:1047:2: iv_rulePMParenthesis= rulePMParenthesis EOF
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
    // InternalMathinterpreter.g:1053:1: rulePMParenthesis returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal ) ) ) otherlv_2= ')' ) ;
    public final EObject rulePMParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_1 = null;

        EObject lv_expression_1_2 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:1059:2: ( (otherlv_0= '(' ( ( (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal ) ) ) otherlv_2= ')' ) )
            // InternalMathinterpreter.g:1060:2: (otherlv_0= '(' ( ( (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal ) ) ) otherlv_2= ')' )
            {
            // InternalMathinterpreter.g:1060:2: (otherlv_0= '(' ( ( (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal ) ) ) otherlv_2= ')' )
            // InternalMathinterpreter.g:1061:3: otherlv_0= '(' ( ( (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal ) ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPMParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMathinterpreter.g:1065:3: ( ( (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal ) ) )
            // InternalMathinterpreter.g:1066:4: ( (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal ) )
            {
            // InternalMathinterpreter.g:1066:4: ( (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal ) )
            // InternalMathinterpreter.g:1067:5: (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal )
            {
            // InternalMathinterpreter.g:1067:5: (lv_expression_1_1= rulePMExpression | lv_expression_1_2= ruleExternal )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||LA15_0==19||LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==18) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMathinterpreter.g:1068:6: lv_expression_1_1= rulePMExpression
                    {

                    						newCompositeNode(grammarAccess.getPMParenthesisAccess().getExpressionPMExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_expression_1_1=rulePMExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPMParenthesisRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_1_1,
                    							"org.xtext.assingment2.Mathinterpreter.PMExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:1084:6: lv_expression_1_2= ruleExternal
                    {

                    						newCompositeNode(grammarAccess.getPMParenthesisAccess().getExpressionExternalParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_19);
                    lv_expression_1_2=ruleExternal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPMParenthesisRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_1_2,
                    							"org.xtext.assingment2.Mathinterpreter.External");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMathinterpreter.g:1110:1: entryRuleDefParenthesis returns [EObject current=null] : iv_ruleDefParenthesis= ruleDefParenthesis EOF ;
    public final EObject entryRuleDefParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefParenthesis = null;


        try {
            // InternalMathinterpreter.g:1110:55: (iv_ruleDefParenthesis= ruleDefParenthesis EOF )
            // InternalMathinterpreter.g:1111:2: iv_ruleDefParenthesis= ruleDefParenthesis EOF
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
    // InternalMathinterpreter.g:1117:1: ruleDefParenthesis returns [EObject current=null] : (otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')' ) ;
    public final EObject ruleDefParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DefineExpr_1 = null;



        	enterRule();

        try {
            // InternalMathinterpreter.g:1123:2: ( (otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')' ) )
            // InternalMathinterpreter.g:1124:2: (otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')' )
            {
            // InternalMathinterpreter.g:1124:2: (otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')' )
            // InternalMathinterpreter.g:1125:3: otherlv_0= '(' this_DefineExpr_1= ruleDefineExpr otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDefParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDefParenthesisAccess().getDefineExprParserRuleCall_1());
            		
            pushFollow(FOLLOW_19);
            this_DefineExpr_1=ruleDefineExpr();

            state._fsp--;


            			current = this_DefineExpr_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000010C0060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001080060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000202800L});

}