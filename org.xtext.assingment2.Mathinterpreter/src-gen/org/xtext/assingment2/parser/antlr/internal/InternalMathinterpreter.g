/*
 * generated by Xtext 2.21.0
 */
grammar InternalMathinterpreter;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.assingment2.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getMathexpressionMathExpressionParserRuleCall_0());
			}
			lv_mathexpression_0_0=ruleMathExpression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"mathexpression",
					lv_mathexpression_0_0,
					"org.xtext.assingment2.Mathinterpreter.MathExpression");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleMathExpression
entryRuleMathExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMathExpressionRule()); }
	iv_ruleMathExpression=ruleMathExpression
	{ $current=$iv_ruleMathExpression.current; }
	EOF;

// Rule MathExpression
ruleMathExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMathExpressionAccess().getFunctionParserRuleCall_0());
		}
		this_Function_0=ruleFunction
		{
			$current = $this_Function_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMathExpressionAccess().getDefineExprParserRuleCall_1());
		}
		this_DefineExpr_1=ruleDefineExpr
		{
			$current = $this_DefineExpr_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='result'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getResultKeyword_0());
		}
		(
			(
				lv_description_1_0=RULE_STRING
				{
					newLeafNode(lv_description_1_0, grammarAccess.getFunctionAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getIsKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getExpressionPMExpressionParserRuleCall_3_0_0());
					}
					lv_expression_3_1=rulePMExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						set(
							$current,
							"expression",
							lv_expression_3_1,
							"org.xtext.assingment2.Mathinterpreter.PMExpression");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getExpressionExternalParserRuleCall_3_0_1());
					}
					lv_expression_3_2=ruleExternal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						set(
							$current,
							"expression",
							lv_expression_3_2,
							"org.xtext.assingment2.Mathinterpreter.External");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDefineExpr
entryRuleDefineExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefineExprRule()); }
	iv_ruleDefineExpr=ruleDefineExpr
	{ $current=$iv_ruleDefineExpr.current; }
	EOF;

// Rule DefineExpr
ruleDefineExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='let'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefineExprAccess().getLetKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_1_0());
				}
				lv_variables_1_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefineExprRule());
					}
					add(
						$current,
						"variables",
						lv_variables_1_0,
						"org.xtext.assingment2.Mathinterpreter.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='and'
			{
				newLeafNode(otherlv_2, grammarAccess.getDefineExprAccess().getAndKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_2_1_0());
					}
					lv_variables_3_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefineExprRule());
						}
						add(
							$current,
							"variables",
							lv_variables_3_0,
							"org.xtext.assingment2.Mathinterpreter.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4='in'
		{
			newLeafNode(otherlv_4, grammarAccess.getDefineExprAccess().getInKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDefineExprAccess().getExpressionPMExpressionParserRuleCall_4_0_0());
					}
					lv_expression_5_1=rulePMExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefineExprRule());
						}
						set(
							$current,
							"expression",
							lv_expression_5_1,
							"org.xtext.assingment2.Mathinterpreter.PMExpression");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getDefineExprAccess().getExpressionExternalParserRuleCall_4_0_1());
					}
					lv_expression_5_2=ruleExternal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefineExprRule());
						}
						set(
							$current,
							"expression",
							lv_expression_5_2,
							"org.xtext.assingment2.Mathinterpreter.External");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_6='end'
		{
			newLeafNode(otherlv_6, grammarAccess.getDefineExprAccess().getEndKeyword_5());
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAccess().getExpressionPMExpressionParserRuleCall_2_0_0());
					}
					lv_expression_2_1=rulePMExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableRule());
						}
						set(
							$current,
							"expression",
							lv_expression_2_1,
							"org.xtext.assingment2.Mathinterpreter.PMExpression");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getVariableAccess().getExpressionExternalParserRuleCall_2_0_1());
					}
					lv_expression_2_2=ruleExternal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableRule());
						}
						set(
							$current,
							"expression",
							lv_expression_2_2,
							"org.xtext.assingment2.Mathinterpreter.External");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleExternal
entryRuleExternal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalRule()); }
	iv_ruleExternal=ruleExternal
	{ $current=$iv_ruleExternal.current; }
	EOF;

// Rule External
ruleExternal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='external.'
		{
			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExternalKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_3_0());
				}
				lv_arguments_3_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalRule());
					}
					add(
						$current,
						"arguments",
						lv_arguments_3_0,
						"org.xtext.assingment2.Mathinterpreter.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_4_1_0());
					}
					lv_arguments_5_0=ruleNumber
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExternalRule());
						}
						add(
							$current,
							"arguments",
							lv_arguments_5_0,
							"org.xtext.assingment2.Mathinterpreter.Number");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getExternalAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRulePMExpression
entryRulePMExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPMExpressionRule()); }
	iv_rulePMExpression=rulePMExpression
	{ $current=$iv_rulePMExpression.current; }
	EOF;

// Rule PMExpression
rulePMExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPMExpressionAccess().getMDExpressionParserRuleCall_0());
		}
		this_MDExpression_0=ruleMDExpression
		{
			$current = $this_MDExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPMExpressionAccess().getPMExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPMExpressionAccess().getOperatorPlusMinusParserRuleCall_1_1_0());
					}
					lv_operator_2_0=rulePlusMinus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPMExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"org.xtext.assingment2.Mathinterpreter.PlusMinus");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPMExpressionAccess().getRightMDExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMDExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPMExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.assingment2.Mathinterpreter.MDExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMDExpression
entryRuleMDExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMDExpressionRule()); }
	iv_ruleMDExpression=ruleMDExpression
	{ $current=$iv_ruleMDExpression.current; }
	EOF;

// Rule MDExpression
ruleMDExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMDExpressionAccess().getPowExpressionParserRuleCall_0());
		}
		this_PowExpression_0=rulePowExpression
		{
			$current = $this_PowExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMDExpressionAccess().getMDExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMDExpressionAccess().getOperatorMultiplyDivideParserRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleMultiplyDivide
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMDExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"org.xtext.assingment2.Mathinterpreter.MultiplyDivide");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMDExpressionAccess().getRightPowExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePowExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMDExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.assingment2.Mathinterpreter.PowExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePowExpression
entryRulePowExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPowExpressionRule()); }
	iv_rulePowExpression=rulePowExpression
	{ $current=$iv_rulePowExpression.current; }
	EOF;

// Rule PowExpression
rulePowExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPowExpressionAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPowExpressionAccess().getOperatorPowerParserRuleCall_1_1_0());
					}
					lv_operator_2_0=rulePower
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPowExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"org.xtext.assingment2.Mathinterpreter.Power");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPowExpressionAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPowExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.assingment2.Mathinterpreter.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePower
entryRulePower returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPowerRule()); }
	iv_rulePower=rulePower
	{ $current=$iv_rulePower.current; }
	EOF;

// Rule Power
rulePower returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPowerAccess().getPowAction_0(),
					$current);
			}
		)
		otherlv_1='**'
		{
			newLeafNode(otherlv_1, grammarAccess.getPowerAccess().getAsteriskAsteriskKeyword_1());
		}
	)
;

// Entry rule entryRulePlusMinus
entryRulePlusMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusMinusRule()); }
	iv_rulePlusMinus=rulePlusMinus
	{ $current=$iv_rulePlusMinus.current; }
	EOF;

// Rule PlusMinus
rulePlusMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPlusMinusAccess().getPlusAction_0_0(),
						$current);
				}
			)
			otherlv_1='+'
			{
				newLeafNode(otherlv_1, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPlusMinusAccess().getMinusAction_1_0(),
						$current);
				}
			)
			otherlv_3='-'
			{
				newLeafNode(otherlv_3, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleMultiplyDivide
entryRuleMultiplyDivide returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplyDivideRule()); }
	iv_ruleMultiplyDivide=ruleMultiplyDivide
	{ $current=$iv_ruleMultiplyDivide.current; }
	EOF;

// Rule MultiplyDivide
ruleMultiplyDivide returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getMultiplyDivideAccess().getMultiplyAction_0_0(),
						$current);
				}
			)
			otherlv_1='*'
			{
				newLeafNode(otherlv_1, grammarAccess.getMultiplyDivideAccess().getAsteriskKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getMultiplyDivideAccess().getDivideAction_1_0(),
						$current);
				}
			)
			otherlv_3='/'
			{
				newLeafNode(otherlv_3, grammarAccess.getMultiplyDivideAccess().getSolidusKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
		}
		this_Number_0=ruleNumber
		{
			$current = $this_Number_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableNameParserRuleCall_1());
		}
		this_VariableName_1=ruleVariableName
		{
			$current = $this_VariableName_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getPMParenthesisParserRuleCall_2());
		}
		this_PMParenthesis_2=rulePMParenthesis
		{
			$current = $this_PMParenthesis_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getDefParenthesisParserRuleCall_3());
		}
		this_DefParenthesis_3=ruleDefParenthesis
		{
			$current = $this_DefParenthesis_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVariableName
entryRuleVariableName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableNameRule()); }
	iv_ruleVariableName=ruleVariableName
	{ $current=$iv_ruleVariableName.current; }
	EOF;

// Rule VariableName
ruleVariableName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getVariableNameAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVariableNameRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current; }
	EOF;

// Rule Number
ruleNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNumberAccess().getPositiveParserRuleCall_0());
		}
		this_Positive_0=rulePositive
		{
			$current = $this_Positive_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNumberAccess().getNegativeParserRuleCall_1());
		}
		this_Negative_1=ruleNegative
		{
			$current = $this_Negative_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePositive
entryRulePositive returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPositiveRule()); }
	iv_rulePositive=rulePositive
	{ $current=$iv_rulePositive.current; }
	EOF;

// Rule Positive
rulePositive returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getPositiveAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPositiveRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleNegative
entryRuleNegative returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNegativeRule()); }
	iv_ruleNegative=ruleNegative
	{ $current=$iv_ruleNegative.current; }
	EOF;

// Rule Negative
ruleNegative returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='-'
		{
			newLeafNode(otherlv_0, grammarAccess.getNegativeAccess().getHyphenMinusKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getNegativeAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNegativeRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRulePMParenthesis
entryRulePMParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPMParenthesisRule()); }
	iv_rulePMParenthesis=rulePMParenthesis
	{ $current=$iv_rulePMParenthesis.current; }
	EOF;

// Rule PMParenthesis
rulePMParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getPMParenthesisAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPMParenthesisAccess().getExpressionPMExpressionParserRuleCall_1_0_0());
					}
					lv_expression_1_1=rulePMExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPMParenthesisRule());
						}
						set(
							$current,
							"expression",
							lv_expression_1_1,
							"org.xtext.assingment2.Mathinterpreter.PMExpression");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getPMParenthesisAccess().getExpressionExternalParserRuleCall_1_0_1());
					}
					lv_expression_1_2=ruleExternal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPMParenthesisRule());
						}
						set(
							$current,
							"expression",
							lv_expression_1_2,
							"org.xtext.assingment2.Mathinterpreter.External");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getPMParenthesisAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleDefParenthesis
entryRuleDefParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefParenthesisRule()); }
	iv_ruleDefParenthesis=ruleDefParenthesis
	{ $current=$iv_ruleDefParenthesis.current; }
	EOF;

// Rule DefParenthesis
ruleDefParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getDefParenthesisAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getDefParenthesisAccess().getDefineExprParserRuleCall_1());
		}
		this_DefineExpr_1=ruleDefineExpr
		{
			$current = $this_DefineExpr_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefParenthesisAccess().getRightParenthesisKeyword_2());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;