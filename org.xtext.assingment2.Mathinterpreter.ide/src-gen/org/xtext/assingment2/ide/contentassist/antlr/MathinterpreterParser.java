/*
 * generated by Xtext 2.21.0
 */
package org.xtext.assingment2.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.assingment2.ide.contentassist.antlr.internal.InternalMathinterpreterParser;
import org.xtext.assingment2.services.MathinterpreterGrammarAccess;

public class MathinterpreterParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MathinterpreterGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MathinterpreterGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMathExpressionAccess().getAlternatives(), "rule__MathExpression__Alternatives");
			builder.put(grammarAccess.getFunctionAccess().getExpressionAlternatives_3_0(), "rule__Function__ExpressionAlternatives_3_0");
			builder.put(grammarAccess.getDefineExprAccess().getExpressionAlternatives_4_0(), "rule__DefineExpr__ExpressionAlternatives_4_0");
			builder.put(grammarAccess.getVariableAccess().getExpressionAlternatives_2_0(), "rule__Variable__ExpressionAlternatives_2_0");
			builder.put(grammarAccess.getPlusMinusAccess().getAlternatives(), "rule__PlusMinus__Alternatives");
			builder.put(grammarAccess.getMultiplyDivideAccess().getAlternatives(), "rule__MultiplyDivide__Alternatives");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
			builder.put(grammarAccess.getPMParenthesisAccess().getExpressionAlternatives_1_0(), "rule__PMParenthesis__ExpressionAlternatives_1_0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getDefineExprAccess().getGroup(), "rule__DefineExpr__Group__0");
			builder.put(grammarAccess.getDefineExprAccess().getGroup_2(), "rule__DefineExpr__Group_2__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getExternalAccess().getGroup(), "rule__External__Group__0");
			builder.put(grammarAccess.getExternalAccess().getGroup_4(), "rule__External__Group_4__0");
			builder.put(grammarAccess.getPMExpressionAccess().getGroup(), "rule__PMExpression__Group__0");
			builder.put(grammarAccess.getPMExpressionAccess().getGroup_1(), "rule__PMExpression__Group_1__0");
			builder.put(grammarAccess.getMDExpressionAccess().getGroup(), "rule__MDExpression__Group__0");
			builder.put(grammarAccess.getMDExpressionAccess().getGroup_1(), "rule__MDExpression__Group_1__0");
			builder.put(grammarAccess.getPowExpressionAccess().getGroup(), "rule__PowExpression__Group__0");
			builder.put(grammarAccess.getPowExpressionAccess().getGroup_1(), "rule__PowExpression__Group_1__0");
			builder.put(grammarAccess.getPowerAccess().getGroup(), "rule__Power__Group__0");
			builder.put(grammarAccess.getPlusMinusAccess().getGroup_0(), "rule__PlusMinus__Group_0__0");
			builder.put(grammarAccess.getPlusMinusAccess().getGroup_1(), "rule__PlusMinus__Group_1__0");
			builder.put(grammarAccess.getMultiplyDivideAccess().getGroup_0(), "rule__MultiplyDivide__Group_0__0");
			builder.put(grammarAccess.getMultiplyDivideAccess().getGroup_1(), "rule__MultiplyDivide__Group_1__0");
			builder.put(grammarAccess.getNegativeAccess().getGroup(), "rule__Negative__Group__0");
			builder.put(grammarAccess.getPMParenthesisAccess().getGroup(), "rule__PMParenthesis__Group__0");
			builder.put(grammarAccess.getDefParenthesisAccess().getGroup(), "rule__DefParenthesis__Group__0");
			builder.put(grammarAccess.getModelAccess().getMathexpressionAssignment(), "rule__Model__MathexpressionAssignment");
			builder.put(grammarAccess.getFunctionAccess().getDescriptionAssignment_1(), "rule__Function__DescriptionAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getExpressionAssignment_3(), "rule__Function__ExpressionAssignment_3");
			builder.put(grammarAccess.getDefineExprAccess().getVariablesAssignment_1(), "rule__DefineExpr__VariablesAssignment_1");
			builder.put(grammarAccess.getDefineExprAccess().getVariablesAssignment_2_1(), "rule__DefineExpr__VariablesAssignment_2_1");
			builder.put(grammarAccess.getDefineExprAccess().getExpressionAssignment_4(), "rule__DefineExpr__ExpressionAssignment_4");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getExpressionAssignment_2(), "rule__Variable__ExpressionAssignment_2");
			builder.put(grammarAccess.getExternalAccess().getNameAssignment_1(), "rule__External__NameAssignment_1");
			builder.put(grammarAccess.getExternalAccess().getArgumentsAssignment_3(), "rule__External__ArgumentsAssignment_3");
			builder.put(grammarAccess.getExternalAccess().getArgumentsAssignment_4_1(), "rule__External__ArgumentsAssignment_4_1");
			builder.put(grammarAccess.getPMExpressionAccess().getOperatorAssignment_1_1(), "rule__PMExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getPMExpressionAccess().getRightAssignment_1_2(), "rule__PMExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getMDExpressionAccess().getOperatorAssignment_1_1(), "rule__MDExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getMDExpressionAccess().getRightAssignment_1_2(), "rule__MDExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getPowExpressionAccess().getOperatorAssignment_1_1(), "rule__PowExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getPowExpressionAccess().getRightAssignment_1_2(), "rule__PowExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getVariableNameAccess().getNameAssignment(), "rule__VariableName__NameAssignment");
			builder.put(grammarAccess.getPositiveAccess().getValueAssignment(), "rule__Positive__ValueAssignment");
			builder.put(grammarAccess.getNegativeAccess().getValueAssignment_1(), "rule__Negative__ValueAssignment_1");
			builder.put(grammarAccess.getPMParenthesisAccess().getExpressionAssignment_1(), "rule__PMParenthesis__ExpressionAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MathinterpreterGrammarAccess grammarAccess;

	@Override
	protected InternalMathinterpreterParser createParser() {
		InternalMathinterpreterParser result = new InternalMathinterpreterParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MathinterpreterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathinterpreterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
