package org.xtext.assingment2.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.assingment2.services.MathinterpreterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathinterpreterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'let'", "'in'", "'end'", "'as'", "'and'", "'='", "'external.'", "'('", "')'", "','", "'**'", "'+'", "'-'", "'*'", "'/'"
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

    	public void setGrammarAccess(MathinterpreterGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMathinterpreter.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:54:1: ( ruleModel EOF )
            // InternalMathinterpreter.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMathinterpreter.g:62:1: ruleModel : ( ( rule__Model__MathexpressionAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:66:2: ( ( ( rule__Model__MathexpressionAssignment )* ) )
            // InternalMathinterpreter.g:67:2: ( ( rule__Model__MathexpressionAssignment )* )
            {
            // InternalMathinterpreter.g:67:2: ( ( rule__Model__MathexpressionAssignment )* )
            // InternalMathinterpreter.g:68:3: ( rule__Model__MathexpressionAssignment )*
            {
             before(grammarAccess.getModelAccess().getMathexpressionAssignment()); 
            // InternalMathinterpreter.g:69:3: ( rule__Model__MathexpressionAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathinterpreter.g:69:4: rule__Model__MathexpressionAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__MathexpressionAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMathexpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMathExpression"
    // InternalMathinterpreter.g:78:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:79:1: ( ruleMathExpression EOF )
            // InternalMathinterpreter.g:80:1: ruleMathExpression EOF
            {
             before(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // InternalMathinterpreter.g:87:1: ruleMathExpression : ( ( rule__MathExpression__Alternatives ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:91:2: ( ( ( rule__MathExpression__Alternatives ) ) )
            // InternalMathinterpreter.g:92:2: ( ( rule__MathExpression__Alternatives ) )
            {
            // InternalMathinterpreter.g:92:2: ( ( rule__MathExpression__Alternatives ) )
            // InternalMathinterpreter.g:93:3: ( rule__MathExpression__Alternatives )
            {
             before(grammarAccess.getMathExpressionAccess().getAlternatives()); 
            // InternalMathinterpreter.g:94:3: ( rule__MathExpression__Alternatives )
            // InternalMathinterpreter.g:94:4: rule__MathExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MathExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExpression"


    // $ANTLR start "entryRuleFunction"
    // InternalMathinterpreter.g:103:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:104:1: ( ruleFunction EOF )
            // InternalMathinterpreter.g:105:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMathinterpreter.g:112:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:116:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalMathinterpreter.g:117:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalMathinterpreter.g:117:2: ( ( rule__Function__Group__0 ) )
            // InternalMathinterpreter.g:118:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalMathinterpreter.g:119:3: ( rule__Function__Group__0 )
            // InternalMathinterpreter.g:119:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefineExpr"
    // InternalMathinterpreter.g:128:1: entryRuleDefineExpr : ruleDefineExpr EOF ;
    public final void entryRuleDefineExpr() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:129:1: ( ruleDefineExpr EOF )
            // InternalMathinterpreter.g:130:1: ruleDefineExpr EOF
            {
             before(grammarAccess.getDefineExprRule()); 
            pushFollow(FOLLOW_1);
            ruleDefineExpr();

            state._fsp--;

             after(grammarAccess.getDefineExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefineExpr"


    // $ANTLR start "ruleDefineExpr"
    // InternalMathinterpreter.g:137:1: ruleDefineExpr : ( ( rule__DefineExpr__Group__0 ) ) ;
    public final void ruleDefineExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:141:2: ( ( ( rule__DefineExpr__Group__0 ) ) )
            // InternalMathinterpreter.g:142:2: ( ( rule__DefineExpr__Group__0 ) )
            {
            // InternalMathinterpreter.g:142:2: ( ( rule__DefineExpr__Group__0 ) )
            // InternalMathinterpreter.g:143:3: ( rule__DefineExpr__Group__0 )
            {
             before(grammarAccess.getDefineExprAccess().getGroup()); 
            // InternalMathinterpreter.g:144:3: ( rule__DefineExpr__Group__0 )
            // InternalMathinterpreter.g:144:4: rule__DefineExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefineExpr"


    // $ANTLR start "entryRuleVariable"
    // InternalMathinterpreter.g:153:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:154:1: ( ruleVariable EOF )
            // InternalMathinterpreter.g:155:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMathinterpreter.g:162:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:166:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMathinterpreter.g:167:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMathinterpreter.g:167:2: ( ( rule__Variable__Group__0 ) )
            // InternalMathinterpreter.g:168:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMathinterpreter.g:169:3: ( rule__Variable__Group__0 )
            // InternalMathinterpreter.g:169:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExternal"
    // InternalMathinterpreter.g:178:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:179:1: ( ruleExternal EOF )
            // InternalMathinterpreter.g:180:1: ruleExternal EOF
            {
             before(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getExternalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalMathinterpreter.g:187:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:191:2: ( ( ( rule__External__Group__0 ) ) )
            // InternalMathinterpreter.g:192:2: ( ( rule__External__Group__0 ) )
            {
            // InternalMathinterpreter.g:192:2: ( ( rule__External__Group__0 ) )
            // InternalMathinterpreter.g:193:3: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // InternalMathinterpreter.g:194:3: ( rule__External__Group__0 )
            // InternalMathinterpreter.g:194:4: rule__External__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRulePMExpression"
    // InternalMathinterpreter.g:203:1: entryRulePMExpression : rulePMExpression EOF ;
    public final void entryRulePMExpression() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:204:1: ( rulePMExpression EOF )
            // InternalMathinterpreter.g:205:1: rulePMExpression EOF
            {
             before(grammarAccess.getPMExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePMExpression();

            state._fsp--;

             after(grammarAccess.getPMExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePMExpression"


    // $ANTLR start "rulePMExpression"
    // InternalMathinterpreter.g:212:1: rulePMExpression : ( ( rule__PMExpression__Group__0 ) ) ;
    public final void rulePMExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:216:2: ( ( ( rule__PMExpression__Group__0 ) ) )
            // InternalMathinterpreter.g:217:2: ( ( rule__PMExpression__Group__0 ) )
            {
            // InternalMathinterpreter.g:217:2: ( ( rule__PMExpression__Group__0 ) )
            // InternalMathinterpreter.g:218:3: ( rule__PMExpression__Group__0 )
            {
             before(grammarAccess.getPMExpressionAccess().getGroup()); 
            // InternalMathinterpreter.g:219:3: ( rule__PMExpression__Group__0 )
            // InternalMathinterpreter.g:219:4: rule__PMExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PMExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPMExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePMExpression"


    // $ANTLR start "entryRuleMDExpression"
    // InternalMathinterpreter.g:228:1: entryRuleMDExpression : ruleMDExpression EOF ;
    public final void entryRuleMDExpression() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:229:1: ( ruleMDExpression EOF )
            // InternalMathinterpreter.g:230:1: ruleMDExpression EOF
            {
             before(grammarAccess.getMDExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMDExpression();

            state._fsp--;

             after(grammarAccess.getMDExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMDExpression"


    // $ANTLR start "ruleMDExpression"
    // InternalMathinterpreter.g:237:1: ruleMDExpression : ( ( rule__MDExpression__Group__0 ) ) ;
    public final void ruleMDExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:241:2: ( ( ( rule__MDExpression__Group__0 ) ) )
            // InternalMathinterpreter.g:242:2: ( ( rule__MDExpression__Group__0 ) )
            {
            // InternalMathinterpreter.g:242:2: ( ( rule__MDExpression__Group__0 ) )
            // InternalMathinterpreter.g:243:3: ( rule__MDExpression__Group__0 )
            {
             before(grammarAccess.getMDExpressionAccess().getGroup()); 
            // InternalMathinterpreter.g:244:3: ( rule__MDExpression__Group__0 )
            // InternalMathinterpreter.g:244:4: rule__MDExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MDExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMDExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMDExpression"


    // $ANTLR start "entryRulePowExpression"
    // InternalMathinterpreter.g:253:1: entryRulePowExpression : rulePowExpression EOF ;
    public final void entryRulePowExpression() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:254:1: ( rulePowExpression EOF )
            // InternalMathinterpreter.g:255:1: rulePowExpression EOF
            {
             before(grammarAccess.getPowExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePowExpression();

            state._fsp--;

             after(grammarAccess.getPowExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePowExpression"


    // $ANTLR start "rulePowExpression"
    // InternalMathinterpreter.g:262:1: rulePowExpression : ( ( rule__PowExpression__Group__0 ) ) ;
    public final void rulePowExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:266:2: ( ( ( rule__PowExpression__Group__0 ) ) )
            // InternalMathinterpreter.g:267:2: ( ( rule__PowExpression__Group__0 ) )
            {
            // InternalMathinterpreter.g:267:2: ( ( rule__PowExpression__Group__0 ) )
            // InternalMathinterpreter.g:268:3: ( rule__PowExpression__Group__0 )
            {
             before(grammarAccess.getPowExpressionAccess().getGroup()); 
            // InternalMathinterpreter.g:269:3: ( rule__PowExpression__Group__0 )
            // InternalMathinterpreter.g:269:4: rule__PowExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PowExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePowExpression"


    // $ANTLR start "entryRulePower"
    // InternalMathinterpreter.g:278:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:279:1: ( rulePower EOF )
            // InternalMathinterpreter.g:280:1: rulePower EOF
            {
             before(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            rulePower();

            state._fsp--;

             after(grammarAccess.getPowerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalMathinterpreter.g:287:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:291:2: ( ( ( rule__Power__Group__0 ) ) )
            // InternalMathinterpreter.g:292:2: ( ( rule__Power__Group__0 ) )
            {
            // InternalMathinterpreter.g:292:2: ( ( rule__Power__Group__0 ) )
            // InternalMathinterpreter.g:293:3: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // InternalMathinterpreter.g:294:3: ( rule__Power__Group__0 )
            // InternalMathinterpreter.g:294:4: rule__Power__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMathinterpreter.g:303:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:304:1: ( rulePlusMinus EOF )
            // InternalMathinterpreter.g:305:1: rulePlusMinus EOF
            {
             before(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getPlusMinusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMathinterpreter.g:312:1: rulePlusMinus : ( ( rule__PlusMinus__Alternatives ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:316:2: ( ( ( rule__PlusMinus__Alternatives ) ) )
            // InternalMathinterpreter.g:317:2: ( ( rule__PlusMinus__Alternatives ) )
            {
            // InternalMathinterpreter.g:317:2: ( ( rule__PlusMinus__Alternatives ) )
            // InternalMathinterpreter.g:318:3: ( rule__PlusMinus__Alternatives )
            {
             before(grammarAccess.getPlusMinusAccess().getAlternatives()); 
            // InternalMathinterpreter.g:319:3: ( rule__PlusMinus__Alternatives )
            // InternalMathinterpreter.g:319:4: rule__PlusMinus__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMultiplyDivide"
    // InternalMathinterpreter.g:328:1: entryRuleMultiplyDivide : ruleMultiplyDivide EOF ;
    public final void entryRuleMultiplyDivide() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:329:1: ( ruleMultiplyDivide EOF )
            // InternalMathinterpreter.g:330:1: ruleMultiplyDivide EOF
            {
             before(grammarAccess.getMultiplyDivideRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplyDivide();

            state._fsp--;

             after(grammarAccess.getMultiplyDivideRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplyDivide"


    // $ANTLR start "ruleMultiplyDivide"
    // InternalMathinterpreter.g:337:1: ruleMultiplyDivide : ( ( rule__MultiplyDivide__Alternatives ) ) ;
    public final void ruleMultiplyDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:341:2: ( ( ( rule__MultiplyDivide__Alternatives ) ) )
            // InternalMathinterpreter.g:342:2: ( ( rule__MultiplyDivide__Alternatives ) )
            {
            // InternalMathinterpreter.g:342:2: ( ( rule__MultiplyDivide__Alternatives ) )
            // InternalMathinterpreter.g:343:3: ( rule__MultiplyDivide__Alternatives )
            {
             before(grammarAccess.getMultiplyDivideAccess().getAlternatives()); 
            // InternalMathinterpreter.g:344:3: ( rule__MultiplyDivide__Alternatives )
            // InternalMathinterpreter.g:344:4: rule__MultiplyDivide__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyDivide__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyDivideAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplyDivide"


    // $ANTLR start "entryRulePrimary"
    // InternalMathinterpreter.g:353:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:354:1: ( rulePrimary EOF )
            // InternalMathinterpreter.g:355:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathinterpreter.g:362:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:366:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMathinterpreter.g:367:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMathinterpreter.g:367:2: ( ( rule__Primary__Alternatives ) )
            // InternalMathinterpreter.g:368:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMathinterpreter.g:369:3: ( rule__Primary__Alternatives )
            // InternalMathinterpreter.g:369:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVariableName"
    // InternalMathinterpreter.g:378:1: entryRuleVariableName : ruleVariableName EOF ;
    public final void entryRuleVariableName() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:379:1: ( ruleVariableName EOF )
            // InternalMathinterpreter.g:380:1: ruleVariableName EOF
            {
             before(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableName();

            state._fsp--;

             after(grammarAccess.getVariableNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableName"


    // $ANTLR start "ruleVariableName"
    // InternalMathinterpreter.g:387:1: ruleVariableName : ( ( rule__VariableName__NameAssignment ) ) ;
    public final void ruleVariableName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:391:2: ( ( ( rule__VariableName__NameAssignment ) ) )
            // InternalMathinterpreter.g:392:2: ( ( rule__VariableName__NameAssignment ) )
            {
            // InternalMathinterpreter.g:392:2: ( ( rule__VariableName__NameAssignment ) )
            // InternalMathinterpreter.g:393:3: ( rule__VariableName__NameAssignment )
            {
             before(grammarAccess.getVariableNameAccess().getNameAssignment()); 
            // InternalMathinterpreter.g:394:3: ( rule__VariableName__NameAssignment )
            // InternalMathinterpreter.g:394:4: rule__VariableName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableName"


    // $ANTLR start "entryRuleNumber"
    // InternalMathinterpreter.g:403:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:404:1: ( ruleNumber EOF )
            // InternalMathinterpreter.g:405:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathinterpreter.g:412:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:416:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalMathinterpreter.g:417:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalMathinterpreter.g:417:2: ( ( rule__Number__Alternatives ) )
            // InternalMathinterpreter.g:418:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalMathinterpreter.g:419:3: ( rule__Number__Alternatives )
            // InternalMathinterpreter.g:419:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRulePositive"
    // InternalMathinterpreter.g:428:1: entryRulePositive : rulePositive EOF ;
    public final void entryRulePositive() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:429:1: ( rulePositive EOF )
            // InternalMathinterpreter.g:430:1: rulePositive EOF
            {
             before(grammarAccess.getPositiveRule()); 
            pushFollow(FOLLOW_1);
            rulePositive();

            state._fsp--;

             after(grammarAccess.getPositiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePositive"


    // $ANTLR start "rulePositive"
    // InternalMathinterpreter.g:437:1: rulePositive : ( ( rule__Positive__ValueAssignment ) ) ;
    public final void rulePositive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:441:2: ( ( ( rule__Positive__ValueAssignment ) ) )
            // InternalMathinterpreter.g:442:2: ( ( rule__Positive__ValueAssignment ) )
            {
            // InternalMathinterpreter.g:442:2: ( ( rule__Positive__ValueAssignment ) )
            // InternalMathinterpreter.g:443:3: ( rule__Positive__ValueAssignment )
            {
             before(grammarAccess.getPositiveAccess().getValueAssignment()); 
            // InternalMathinterpreter.g:444:3: ( rule__Positive__ValueAssignment )
            // InternalMathinterpreter.g:444:4: rule__Positive__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Positive__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPositiveAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositive"


    // $ANTLR start "entryRuleNegative"
    // InternalMathinterpreter.g:453:1: entryRuleNegative : ruleNegative EOF ;
    public final void entryRuleNegative() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:454:1: ( ruleNegative EOF )
            // InternalMathinterpreter.g:455:1: ruleNegative EOF
            {
             before(grammarAccess.getNegativeRule()); 
            pushFollow(FOLLOW_1);
            ruleNegative();

            state._fsp--;

             after(grammarAccess.getNegativeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegative"


    // $ANTLR start "ruleNegative"
    // InternalMathinterpreter.g:462:1: ruleNegative : ( ( rule__Negative__Group__0 ) ) ;
    public final void ruleNegative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:466:2: ( ( ( rule__Negative__Group__0 ) ) )
            // InternalMathinterpreter.g:467:2: ( ( rule__Negative__Group__0 ) )
            {
            // InternalMathinterpreter.g:467:2: ( ( rule__Negative__Group__0 ) )
            // InternalMathinterpreter.g:468:3: ( rule__Negative__Group__0 )
            {
             before(grammarAccess.getNegativeAccess().getGroup()); 
            // InternalMathinterpreter.g:469:3: ( rule__Negative__Group__0 )
            // InternalMathinterpreter.g:469:4: rule__Negative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Negative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegative"


    // $ANTLR start "entryRulePMParenthesis"
    // InternalMathinterpreter.g:478:1: entryRulePMParenthesis : rulePMParenthesis EOF ;
    public final void entryRulePMParenthesis() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:479:1: ( rulePMParenthesis EOF )
            // InternalMathinterpreter.g:480:1: rulePMParenthesis EOF
            {
             before(grammarAccess.getPMParenthesisRule()); 
            pushFollow(FOLLOW_1);
            rulePMParenthesis();

            state._fsp--;

             after(grammarAccess.getPMParenthesisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePMParenthesis"


    // $ANTLR start "rulePMParenthesis"
    // InternalMathinterpreter.g:487:1: rulePMParenthesis : ( ( rule__PMParenthesis__Group__0 ) ) ;
    public final void rulePMParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:491:2: ( ( ( rule__PMParenthesis__Group__0 ) ) )
            // InternalMathinterpreter.g:492:2: ( ( rule__PMParenthesis__Group__0 ) )
            {
            // InternalMathinterpreter.g:492:2: ( ( rule__PMParenthesis__Group__0 ) )
            // InternalMathinterpreter.g:493:3: ( rule__PMParenthesis__Group__0 )
            {
             before(grammarAccess.getPMParenthesisAccess().getGroup()); 
            // InternalMathinterpreter.g:494:3: ( rule__PMParenthesis__Group__0 )
            // InternalMathinterpreter.g:494:4: rule__PMParenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PMParenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPMParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePMParenthesis"


    // $ANTLR start "entryRuleDefParenthesis"
    // InternalMathinterpreter.g:503:1: entryRuleDefParenthesis : ruleDefParenthesis EOF ;
    public final void entryRuleDefParenthesis() throws RecognitionException {
        try {
            // InternalMathinterpreter.g:504:1: ( ruleDefParenthesis EOF )
            // InternalMathinterpreter.g:505:1: ruleDefParenthesis EOF
            {
             before(grammarAccess.getDefParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleDefParenthesis();

            state._fsp--;

             after(grammarAccess.getDefParenthesisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefParenthesis"


    // $ANTLR start "ruleDefParenthesis"
    // InternalMathinterpreter.g:512:1: ruleDefParenthesis : ( ( rule__DefParenthesis__Group__0 ) ) ;
    public final void ruleDefParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:516:2: ( ( ( rule__DefParenthesis__Group__0 ) ) )
            // InternalMathinterpreter.g:517:2: ( ( rule__DefParenthesis__Group__0 ) )
            {
            // InternalMathinterpreter.g:517:2: ( ( rule__DefParenthesis__Group__0 ) )
            // InternalMathinterpreter.g:518:3: ( rule__DefParenthesis__Group__0 )
            {
             before(grammarAccess.getDefParenthesisAccess().getGroup()); 
            // InternalMathinterpreter.g:519:3: ( rule__DefParenthesis__Group__0 )
            // InternalMathinterpreter.g:519:4: rule__DefParenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefParenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefParenthesis"


    // $ANTLR start "rule__MathExpression__Alternatives"
    // InternalMathinterpreter.g:527:1: rule__MathExpression__Alternatives : ( ( ruleFunction ) | ( ruleDefineExpr ) );
    public final void rule__MathExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:531:1: ( ( ruleFunction ) | ( ruleDefineExpr ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING||LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMathinterpreter.g:532:2: ( ruleFunction )
                    {
                    // InternalMathinterpreter.g:532:2: ( ruleFunction )
                    // InternalMathinterpreter.g:533:3: ruleFunction
                    {
                     before(grammarAccess.getMathExpressionAccess().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getMathExpressionAccess().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:538:2: ( ruleDefineExpr )
                    {
                    // InternalMathinterpreter.g:538:2: ( ruleDefineExpr )
                    // InternalMathinterpreter.g:539:3: ruleDefineExpr
                    {
                     before(grammarAccess.getMathExpressionAccess().getDefineExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefineExpr();

                    state._fsp--;

                     after(grammarAccess.getMathExpressionAccess().getDefineExprParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExpression__Alternatives"


    // $ANTLR start "rule__External__ArgumentsAlternatives_3_0"
    // InternalMathinterpreter.g:548:1: rule__External__ArgumentsAlternatives_3_0 : ( ( ruleVariableName ) | ( ruleNumber ) );
    public final void rule__External__ArgumentsAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:552:1: ( ( ruleVariableName ) | ( ruleNumber ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT||LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMathinterpreter.g:553:2: ( ruleVariableName )
                    {
                    // InternalMathinterpreter.g:553:2: ( ruleVariableName )
                    // InternalMathinterpreter.g:554:3: ruleVariableName
                    {
                     before(grammarAccess.getExternalAccess().getArgumentsVariableNameParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableName();

                    state._fsp--;

                     after(grammarAccess.getExternalAccess().getArgumentsVariableNameParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:559:2: ( ruleNumber )
                    {
                    // InternalMathinterpreter.g:559:2: ( ruleNumber )
                    // InternalMathinterpreter.g:560:3: ruleNumber
                    {
                     before(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__ArgumentsAlternatives_3_0"


    // $ANTLR start "rule__External__ArgumentsAlternatives_4_1_0"
    // InternalMathinterpreter.g:569:1: rule__External__ArgumentsAlternatives_4_1_0 : ( ( ruleVariableName ) | ( ruleNumber ) );
    public final void rule__External__ArgumentsAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:573:1: ( ( ruleVariableName ) | ( ruleNumber ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT||LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMathinterpreter.g:574:2: ( ruleVariableName )
                    {
                    // InternalMathinterpreter.g:574:2: ( ruleVariableName )
                    // InternalMathinterpreter.g:575:3: ruleVariableName
                    {
                     before(grammarAccess.getExternalAccess().getArgumentsVariableNameParserRuleCall_4_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableName();

                    state._fsp--;

                     after(grammarAccess.getExternalAccess().getArgumentsVariableNameParserRuleCall_4_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:580:2: ( ruleNumber )
                    {
                    // InternalMathinterpreter.g:580:2: ( ruleNumber )
                    // InternalMathinterpreter.g:581:3: ruleNumber
                    {
                     before(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_4_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getExternalAccess().getArgumentsNumberParserRuleCall_4_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__ArgumentsAlternatives_4_1_0"


    // $ANTLR start "rule__PlusMinus__Alternatives"
    // InternalMathinterpreter.g:590:1: rule__PlusMinus__Alternatives : ( ( ( rule__PlusMinus__Group_0__0 ) ) | ( ( rule__PlusMinus__Group_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:594:1: ( ( ( rule__PlusMinus__Group_0__0 ) ) | ( ( rule__PlusMinus__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMathinterpreter.g:595:2: ( ( rule__PlusMinus__Group_0__0 ) )
                    {
                    // InternalMathinterpreter.g:595:2: ( ( rule__PlusMinus__Group_0__0 ) )
                    // InternalMathinterpreter.g:596:3: ( rule__PlusMinus__Group_0__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_0()); 
                    // InternalMathinterpreter.g:597:3: ( rule__PlusMinus__Group_0__0 )
                    // InternalMathinterpreter.g:597:4: rule__PlusMinus__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:601:2: ( ( rule__PlusMinus__Group_1__0 ) )
                    {
                    // InternalMathinterpreter.g:601:2: ( ( rule__PlusMinus__Group_1__0 ) )
                    // InternalMathinterpreter.g:602:3: ( rule__PlusMinus__Group_1__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1()); 
                    // InternalMathinterpreter.g:603:3: ( rule__PlusMinus__Group_1__0 )
                    // InternalMathinterpreter.g:603:4: rule__PlusMinus__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Alternatives"


    // $ANTLR start "rule__MultiplyDivide__Alternatives"
    // InternalMathinterpreter.g:611:1: rule__MultiplyDivide__Alternatives : ( ( ( rule__MultiplyDivide__Group_0__0 ) ) | ( ( rule__MultiplyDivide__Group_1__0 ) ) );
    public final void rule__MultiplyDivide__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:615:1: ( ( ( rule__MultiplyDivide__Group_0__0 ) ) | ( ( rule__MultiplyDivide__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMathinterpreter.g:616:2: ( ( rule__MultiplyDivide__Group_0__0 ) )
                    {
                    // InternalMathinterpreter.g:616:2: ( ( rule__MultiplyDivide__Group_0__0 ) )
                    // InternalMathinterpreter.g:617:3: ( rule__MultiplyDivide__Group_0__0 )
                    {
                     before(grammarAccess.getMultiplyDivideAccess().getGroup_0()); 
                    // InternalMathinterpreter.g:618:3: ( rule__MultiplyDivide__Group_0__0 )
                    // InternalMathinterpreter.g:618:4: rule__MultiplyDivide__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplyDivide__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyDivideAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:622:2: ( ( rule__MultiplyDivide__Group_1__0 ) )
                    {
                    // InternalMathinterpreter.g:622:2: ( ( rule__MultiplyDivide__Group_1__0 ) )
                    // InternalMathinterpreter.g:623:3: ( rule__MultiplyDivide__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplyDivideAccess().getGroup_1()); 
                    // InternalMathinterpreter.g:624:3: ( rule__MultiplyDivide__Group_1__0 )
                    // InternalMathinterpreter.g:624:4: rule__MultiplyDivide__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplyDivide__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyDivideAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivide__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMathinterpreter.g:632:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleVariableName ) | ( rulePMParenthesis ) | ( ruleDefParenthesis ) | ( ruleExternal ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:636:1: ( ( ruleNumber ) | ( ruleVariableName ) | ( rulePMParenthesis ) | ( ruleDefParenthesis ) | ( ruleExternal ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 25:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==RULE_STRING||LA7_3==13) ) {
                    alt7=4;
                }
                else if ( ((LA7_3>=RULE_ID && LA7_3<=RULE_INT)||(LA7_3>=19 && LA7_3<=20)||LA7_3==25) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMathinterpreter.g:637:2: ( ruleNumber )
                    {
                    // InternalMathinterpreter.g:637:2: ( ruleNumber )
                    // InternalMathinterpreter.g:638:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:643:2: ( ruleVariableName )
                    {
                    // InternalMathinterpreter.g:643:2: ( ruleVariableName )
                    // InternalMathinterpreter.g:644:3: ruleVariableName
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableName();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableNameParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMathinterpreter.g:649:2: ( rulePMParenthesis )
                    {
                    // InternalMathinterpreter.g:649:2: ( rulePMParenthesis )
                    // InternalMathinterpreter.g:650:3: rulePMParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getPMParenthesisParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePMParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getPMParenthesisParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMathinterpreter.g:655:2: ( ruleDefParenthesis )
                    {
                    // InternalMathinterpreter.g:655:2: ( ruleDefParenthesis )
                    // InternalMathinterpreter.g:656:3: ruleDefParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getDefParenthesisParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDefParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getDefParenthesisParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMathinterpreter.g:661:2: ( ruleExternal )
                    {
                    // InternalMathinterpreter.g:661:2: ( ruleExternal )
                    // InternalMathinterpreter.g:662:3: ruleExternal
                    {
                     before(grammarAccess.getPrimaryAccess().getExternalParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExternal();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getExternalParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalMathinterpreter.g:671:1: rule__Number__Alternatives : ( ( rulePositive ) | ( ruleNegative ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:675:1: ( ( rulePositive ) | ( ruleNegative ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMathinterpreter.g:676:2: ( rulePositive )
                    {
                    // InternalMathinterpreter.g:676:2: ( rulePositive )
                    // InternalMathinterpreter.g:677:3: rulePositive
                    {
                     before(grammarAccess.getNumberAccess().getPositiveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePositive();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getPositiveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathinterpreter.g:682:2: ( ruleNegative )
                    {
                    // InternalMathinterpreter.g:682:2: ( ruleNegative )
                    // InternalMathinterpreter.g:683:3: ruleNegative
                    {
                     before(grammarAccess.getNumberAccess().getNegativeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNegative();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getNegativeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Function__Group__0"
    // InternalMathinterpreter.g:692:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:696:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMathinterpreter.g:697:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalMathinterpreter.g:704:1: rule__Function__Group__0__Impl : ( 'result' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:708:1: ( ( 'result' ) )
            // InternalMathinterpreter.g:709:1: ( 'result' )
            {
            // InternalMathinterpreter.g:709:1: ( 'result' )
            // InternalMathinterpreter.g:710:2: 'result'
            {
             before(grammarAccess.getFunctionAccess().getResultKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getResultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalMathinterpreter.g:719:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:723:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMathinterpreter.g:724:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalMathinterpreter.g:731:1: rule__Function__Group__1__Impl : ( ( rule__Function__DescriptionAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:735:1: ( ( ( rule__Function__DescriptionAssignment_1 ) ) )
            // InternalMathinterpreter.g:736:1: ( ( rule__Function__DescriptionAssignment_1 ) )
            {
            // InternalMathinterpreter.g:736:1: ( ( rule__Function__DescriptionAssignment_1 ) )
            // InternalMathinterpreter.g:737:2: ( rule__Function__DescriptionAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getDescriptionAssignment_1()); 
            // InternalMathinterpreter.g:738:2: ( rule__Function__DescriptionAssignment_1 )
            // InternalMathinterpreter.g:738:3: rule__Function__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalMathinterpreter.g:746:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:750:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMathinterpreter.g:751:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalMathinterpreter.g:758:1: rule__Function__Group__2__Impl : ( 'is' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:762:1: ( ( 'is' ) )
            // InternalMathinterpreter.g:763:1: ( 'is' )
            {
            // InternalMathinterpreter.g:763:1: ( 'is' )
            // InternalMathinterpreter.g:764:2: 'is'
            {
             before(grammarAccess.getFunctionAccess().getIsKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalMathinterpreter.g:773:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:777:1: ( rule__Function__Group__3__Impl )
            // InternalMathinterpreter.g:778:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalMathinterpreter.g:784:1: rule__Function__Group__3__Impl : ( ( rule__Function__ExpressionAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:788:1: ( ( ( rule__Function__ExpressionAssignment_3 ) ) )
            // InternalMathinterpreter.g:789:1: ( ( rule__Function__ExpressionAssignment_3 ) )
            {
            // InternalMathinterpreter.g:789:1: ( ( rule__Function__ExpressionAssignment_3 ) )
            // InternalMathinterpreter.g:790:2: ( rule__Function__ExpressionAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getExpressionAssignment_3()); 
            // InternalMathinterpreter.g:791:2: ( rule__Function__ExpressionAssignment_3 )
            // InternalMathinterpreter.g:791:3: rule__Function__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__DefineExpr__Group__0"
    // InternalMathinterpreter.g:800:1: rule__DefineExpr__Group__0 : rule__DefineExpr__Group__0__Impl rule__DefineExpr__Group__1 ;
    public final void rule__DefineExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:804:1: ( rule__DefineExpr__Group__0__Impl rule__DefineExpr__Group__1 )
            // InternalMathinterpreter.g:805:2: rule__DefineExpr__Group__0__Impl rule__DefineExpr__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DefineExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__0"


    // $ANTLR start "rule__DefineExpr__Group__0__Impl"
    // InternalMathinterpreter.g:812:1: rule__DefineExpr__Group__0__Impl : ( ( rule__DefineExpr__Group_0__0 )? ) ;
    public final void rule__DefineExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:816:1: ( ( ( rule__DefineExpr__Group_0__0 )? ) )
            // InternalMathinterpreter.g:817:1: ( ( rule__DefineExpr__Group_0__0 )? )
            {
            // InternalMathinterpreter.g:817:1: ( ( rule__DefineExpr__Group_0__0 )? )
            // InternalMathinterpreter.g:818:2: ( rule__DefineExpr__Group_0__0 )?
            {
             before(grammarAccess.getDefineExprAccess().getGroup_0()); 
            // InternalMathinterpreter.g:819:2: ( rule__DefineExpr__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMathinterpreter.g:819:3: rule__DefineExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefineExpr__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefineExprAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__0__Impl"


    // $ANTLR start "rule__DefineExpr__Group__1"
    // InternalMathinterpreter.g:827:1: rule__DefineExpr__Group__1 : rule__DefineExpr__Group__1__Impl rule__DefineExpr__Group__2 ;
    public final void rule__DefineExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:831:1: ( rule__DefineExpr__Group__1__Impl rule__DefineExpr__Group__2 )
            // InternalMathinterpreter.g:832:2: rule__DefineExpr__Group__1__Impl rule__DefineExpr__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DefineExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__1"


    // $ANTLR start "rule__DefineExpr__Group__1__Impl"
    // InternalMathinterpreter.g:839:1: rule__DefineExpr__Group__1__Impl : ( 'let' ) ;
    public final void rule__DefineExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:843:1: ( ( 'let' ) )
            // InternalMathinterpreter.g:844:1: ( 'let' )
            {
            // InternalMathinterpreter.g:844:1: ( 'let' )
            // InternalMathinterpreter.g:845:2: 'let'
            {
             before(grammarAccess.getDefineExprAccess().getLetKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDefineExprAccess().getLetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__1__Impl"


    // $ANTLR start "rule__DefineExpr__Group__2"
    // InternalMathinterpreter.g:854:1: rule__DefineExpr__Group__2 : rule__DefineExpr__Group__2__Impl rule__DefineExpr__Group__3 ;
    public final void rule__DefineExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:858:1: ( rule__DefineExpr__Group__2__Impl rule__DefineExpr__Group__3 )
            // InternalMathinterpreter.g:859:2: rule__DefineExpr__Group__2__Impl rule__DefineExpr__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__DefineExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__2"


    // $ANTLR start "rule__DefineExpr__Group__2__Impl"
    // InternalMathinterpreter.g:866:1: rule__DefineExpr__Group__2__Impl : ( ( rule__DefineExpr__VariablesAssignment_2 ) ) ;
    public final void rule__DefineExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:870:1: ( ( ( rule__DefineExpr__VariablesAssignment_2 ) ) )
            // InternalMathinterpreter.g:871:1: ( ( rule__DefineExpr__VariablesAssignment_2 ) )
            {
            // InternalMathinterpreter.g:871:1: ( ( rule__DefineExpr__VariablesAssignment_2 ) )
            // InternalMathinterpreter.g:872:2: ( rule__DefineExpr__VariablesAssignment_2 )
            {
             before(grammarAccess.getDefineExprAccess().getVariablesAssignment_2()); 
            // InternalMathinterpreter.g:873:2: ( rule__DefineExpr__VariablesAssignment_2 )
            // InternalMathinterpreter.g:873:3: rule__DefineExpr__VariablesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefineExpr__VariablesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefineExprAccess().getVariablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__2__Impl"


    // $ANTLR start "rule__DefineExpr__Group__3"
    // InternalMathinterpreter.g:881:1: rule__DefineExpr__Group__3 : rule__DefineExpr__Group__3__Impl rule__DefineExpr__Group__4 ;
    public final void rule__DefineExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:885:1: ( rule__DefineExpr__Group__3__Impl rule__DefineExpr__Group__4 )
            // InternalMathinterpreter.g:886:2: rule__DefineExpr__Group__3__Impl rule__DefineExpr__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DefineExpr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__3"


    // $ANTLR start "rule__DefineExpr__Group__3__Impl"
    // InternalMathinterpreter.g:893:1: rule__DefineExpr__Group__3__Impl : ( ( rule__DefineExpr__Group_3__0 )* ) ;
    public final void rule__DefineExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:897:1: ( ( ( rule__DefineExpr__Group_3__0 )* ) )
            // InternalMathinterpreter.g:898:1: ( ( rule__DefineExpr__Group_3__0 )* )
            {
            // InternalMathinterpreter.g:898:1: ( ( rule__DefineExpr__Group_3__0 )* )
            // InternalMathinterpreter.g:899:2: ( rule__DefineExpr__Group_3__0 )*
            {
             before(grammarAccess.getDefineExprAccess().getGroup_3()); 
            // InternalMathinterpreter.g:900:2: ( rule__DefineExpr__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMathinterpreter.g:900:3: rule__DefineExpr__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DefineExpr__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDefineExprAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__3__Impl"


    // $ANTLR start "rule__DefineExpr__Group__4"
    // InternalMathinterpreter.g:908:1: rule__DefineExpr__Group__4 : rule__DefineExpr__Group__4__Impl rule__DefineExpr__Group__5 ;
    public final void rule__DefineExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:912:1: ( rule__DefineExpr__Group__4__Impl rule__DefineExpr__Group__5 )
            // InternalMathinterpreter.g:913:2: rule__DefineExpr__Group__4__Impl rule__DefineExpr__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DefineExpr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__4"


    // $ANTLR start "rule__DefineExpr__Group__4__Impl"
    // InternalMathinterpreter.g:920:1: rule__DefineExpr__Group__4__Impl : ( 'in' ) ;
    public final void rule__DefineExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:924:1: ( ( 'in' ) )
            // InternalMathinterpreter.g:925:1: ( 'in' )
            {
            // InternalMathinterpreter.g:925:1: ( 'in' )
            // InternalMathinterpreter.g:926:2: 'in'
            {
             before(grammarAccess.getDefineExprAccess().getInKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefineExprAccess().getInKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__4__Impl"


    // $ANTLR start "rule__DefineExpr__Group__5"
    // InternalMathinterpreter.g:935:1: rule__DefineExpr__Group__5 : rule__DefineExpr__Group__5__Impl rule__DefineExpr__Group__6 ;
    public final void rule__DefineExpr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:939:1: ( rule__DefineExpr__Group__5__Impl rule__DefineExpr__Group__6 )
            // InternalMathinterpreter.g:940:2: rule__DefineExpr__Group__5__Impl rule__DefineExpr__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__DefineExpr__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__5"


    // $ANTLR start "rule__DefineExpr__Group__5__Impl"
    // InternalMathinterpreter.g:947:1: rule__DefineExpr__Group__5__Impl : ( ( rule__DefineExpr__ExpressionAssignment_5 ) ) ;
    public final void rule__DefineExpr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:951:1: ( ( ( rule__DefineExpr__ExpressionAssignment_5 ) ) )
            // InternalMathinterpreter.g:952:1: ( ( rule__DefineExpr__ExpressionAssignment_5 ) )
            {
            // InternalMathinterpreter.g:952:1: ( ( rule__DefineExpr__ExpressionAssignment_5 ) )
            // InternalMathinterpreter.g:953:2: ( rule__DefineExpr__ExpressionAssignment_5 )
            {
             before(grammarAccess.getDefineExprAccess().getExpressionAssignment_5()); 
            // InternalMathinterpreter.g:954:2: ( rule__DefineExpr__ExpressionAssignment_5 )
            // InternalMathinterpreter.g:954:3: rule__DefineExpr__ExpressionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DefineExpr__ExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDefineExprAccess().getExpressionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__5__Impl"


    // $ANTLR start "rule__DefineExpr__Group__6"
    // InternalMathinterpreter.g:962:1: rule__DefineExpr__Group__6 : rule__DefineExpr__Group__6__Impl ;
    public final void rule__DefineExpr__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:966:1: ( rule__DefineExpr__Group__6__Impl )
            // InternalMathinterpreter.g:967:2: rule__DefineExpr__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__6"


    // $ANTLR start "rule__DefineExpr__Group__6__Impl"
    // InternalMathinterpreter.g:973:1: rule__DefineExpr__Group__6__Impl : ( 'end' ) ;
    public final void rule__DefineExpr__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:977:1: ( ( 'end' ) )
            // InternalMathinterpreter.g:978:1: ( 'end' )
            {
            // InternalMathinterpreter.g:978:1: ( 'end' )
            // InternalMathinterpreter.g:979:2: 'end'
            {
             before(grammarAccess.getDefineExprAccess().getEndKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefineExprAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group__6__Impl"


    // $ANTLR start "rule__DefineExpr__Group_0__0"
    // InternalMathinterpreter.g:989:1: rule__DefineExpr__Group_0__0 : rule__DefineExpr__Group_0__0__Impl rule__DefineExpr__Group_0__1 ;
    public final void rule__DefineExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:993:1: ( rule__DefineExpr__Group_0__0__Impl rule__DefineExpr__Group_0__1 )
            // InternalMathinterpreter.g:994:2: rule__DefineExpr__Group_0__0__Impl rule__DefineExpr__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__DefineExpr__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group_0__0"


    // $ANTLR start "rule__DefineExpr__Group_0__0__Impl"
    // InternalMathinterpreter.g:1001:1: rule__DefineExpr__Group_0__0__Impl : ( ( rule__DefineExpr__DescriptionAssignment_0_0 ) ) ;
    public final void rule__DefineExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1005:1: ( ( ( rule__DefineExpr__DescriptionAssignment_0_0 ) ) )
            // InternalMathinterpreter.g:1006:1: ( ( rule__DefineExpr__DescriptionAssignment_0_0 ) )
            {
            // InternalMathinterpreter.g:1006:1: ( ( rule__DefineExpr__DescriptionAssignment_0_0 ) )
            // InternalMathinterpreter.g:1007:2: ( rule__DefineExpr__DescriptionAssignment_0_0 )
            {
             before(grammarAccess.getDefineExprAccess().getDescriptionAssignment_0_0()); 
            // InternalMathinterpreter.g:1008:2: ( rule__DefineExpr__DescriptionAssignment_0_0 )
            // InternalMathinterpreter.g:1008:3: rule__DefineExpr__DescriptionAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DefineExpr__DescriptionAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDefineExprAccess().getDescriptionAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group_0__0__Impl"


    // $ANTLR start "rule__DefineExpr__Group_0__1"
    // InternalMathinterpreter.g:1016:1: rule__DefineExpr__Group_0__1 : rule__DefineExpr__Group_0__1__Impl ;
    public final void rule__DefineExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1020:1: ( rule__DefineExpr__Group_0__1__Impl )
            // InternalMathinterpreter.g:1021:2: rule__DefineExpr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group_0__1"


    // $ANTLR start "rule__DefineExpr__Group_0__1__Impl"
    // InternalMathinterpreter.g:1027:1: rule__DefineExpr__Group_0__1__Impl : ( 'as' ) ;
    public final void rule__DefineExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1031:1: ( ( 'as' ) )
            // InternalMathinterpreter.g:1032:1: ( 'as' )
            {
            // InternalMathinterpreter.g:1032:1: ( 'as' )
            // InternalMathinterpreter.g:1033:2: 'as'
            {
             before(grammarAccess.getDefineExprAccess().getAsKeyword_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDefineExprAccess().getAsKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group_0__1__Impl"


    // $ANTLR start "rule__DefineExpr__Group_3__0"
    // InternalMathinterpreter.g:1043:1: rule__DefineExpr__Group_3__0 : rule__DefineExpr__Group_3__0__Impl rule__DefineExpr__Group_3__1 ;
    public final void rule__DefineExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1047:1: ( rule__DefineExpr__Group_3__0__Impl rule__DefineExpr__Group_3__1 )
            // InternalMathinterpreter.g:1048:2: rule__DefineExpr__Group_3__0__Impl rule__DefineExpr__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__DefineExpr__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group_3__0"


    // $ANTLR start "rule__DefineExpr__Group_3__0__Impl"
    // InternalMathinterpreter.g:1055:1: rule__DefineExpr__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__DefineExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1059:1: ( ( 'and' ) )
            // InternalMathinterpreter.g:1060:1: ( 'and' )
            {
            // InternalMathinterpreter.g:1060:1: ( 'and' )
            // InternalMathinterpreter.g:1061:2: 'and'
            {
             before(grammarAccess.getDefineExprAccess().getAndKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDefineExprAccess().getAndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group_3__0__Impl"


    // $ANTLR start "rule__DefineExpr__Group_3__1"
    // InternalMathinterpreter.g:1070:1: rule__DefineExpr__Group_3__1 : rule__DefineExpr__Group_3__1__Impl ;
    public final void rule__DefineExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1074:1: ( rule__DefineExpr__Group_3__1__Impl )
            // InternalMathinterpreter.g:1075:2: rule__DefineExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefineExpr__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group_3__1"


    // $ANTLR start "rule__DefineExpr__Group_3__1__Impl"
    // InternalMathinterpreter.g:1081:1: rule__DefineExpr__Group_3__1__Impl : ( ( rule__DefineExpr__VariablesAssignment_3_1 ) ) ;
    public final void rule__DefineExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1085:1: ( ( ( rule__DefineExpr__VariablesAssignment_3_1 ) ) )
            // InternalMathinterpreter.g:1086:1: ( ( rule__DefineExpr__VariablesAssignment_3_1 ) )
            {
            // InternalMathinterpreter.g:1086:1: ( ( rule__DefineExpr__VariablesAssignment_3_1 ) )
            // InternalMathinterpreter.g:1087:2: ( rule__DefineExpr__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getDefineExprAccess().getVariablesAssignment_3_1()); 
            // InternalMathinterpreter.g:1088:2: ( rule__DefineExpr__VariablesAssignment_3_1 )
            // InternalMathinterpreter.g:1088:3: rule__DefineExpr__VariablesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DefineExpr__VariablesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDefineExprAccess().getVariablesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__Group_3__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMathinterpreter.g:1097:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1101:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMathinterpreter.g:1102:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMathinterpreter.g:1109:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1113:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalMathinterpreter.g:1114:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalMathinterpreter.g:1114:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalMathinterpreter.g:1115:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalMathinterpreter.g:1116:2: ( rule__Variable__NameAssignment_0 )
            // InternalMathinterpreter.g:1116:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMathinterpreter.g:1124:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1128:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMathinterpreter.g:1129:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMathinterpreter.g:1136:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1140:1: ( ( '=' ) )
            // InternalMathinterpreter.g:1141:1: ( '=' )
            {
            // InternalMathinterpreter.g:1141:1: ( '=' )
            // InternalMathinterpreter.g:1142:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMathinterpreter.g:1151:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1155:1: ( rule__Variable__Group__2__Impl )
            // InternalMathinterpreter.g:1156:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMathinterpreter.g:1162:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__ExpressionAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1166:1: ( ( ( rule__Variable__ExpressionAssignment_2 ) ) )
            // InternalMathinterpreter.g:1167:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            {
            // InternalMathinterpreter.g:1167:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            // InternalMathinterpreter.g:1168:2: ( rule__Variable__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 
            // InternalMathinterpreter.g:1169:2: ( rule__Variable__ExpressionAssignment_2 )
            // InternalMathinterpreter.g:1169:3: rule__Variable__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__External__Group__0"
    // InternalMathinterpreter.g:1178:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1182:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalMathinterpreter.g:1183:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__External__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0"


    // $ANTLR start "rule__External__Group__0__Impl"
    // InternalMathinterpreter.g:1190:1: rule__External__Group__0__Impl : ( 'external.' ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1194:1: ( ( 'external.' ) )
            // InternalMathinterpreter.g:1195:1: ( 'external.' )
            {
            // InternalMathinterpreter.g:1195:1: ( 'external.' )
            // InternalMathinterpreter.g:1196:2: 'external.'
            {
             before(grammarAccess.getExternalAccess().getExternalKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getExternalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0__Impl"


    // $ANTLR start "rule__External__Group__1"
    // InternalMathinterpreter.g:1205:1: rule__External__Group__1 : rule__External__Group__1__Impl rule__External__Group__2 ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1209:1: ( rule__External__Group__1__Impl rule__External__Group__2 )
            // InternalMathinterpreter.g:1210:2: rule__External__Group__1__Impl rule__External__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__External__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1"


    // $ANTLR start "rule__External__Group__1__Impl"
    // InternalMathinterpreter.g:1217:1: rule__External__Group__1__Impl : ( ( rule__External__NameAssignment_1 ) ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1221:1: ( ( ( rule__External__NameAssignment_1 ) ) )
            // InternalMathinterpreter.g:1222:1: ( ( rule__External__NameAssignment_1 ) )
            {
            // InternalMathinterpreter.g:1222:1: ( ( rule__External__NameAssignment_1 ) )
            // InternalMathinterpreter.g:1223:2: ( rule__External__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_1()); 
            // InternalMathinterpreter.g:1224:2: ( rule__External__NameAssignment_1 )
            // InternalMathinterpreter.g:1224:3: rule__External__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__External__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1__Impl"


    // $ANTLR start "rule__External__Group__2"
    // InternalMathinterpreter.g:1232:1: rule__External__Group__2 : rule__External__Group__2__Impl rule__External__Group__3 ;
    public final void rule__External__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1236:1: ( rule__External__Group__2__Impl rule__External__Group__3 )
            // InternalMathinterpreter.g:1237:2: rule__External__Group__2__Impl rule__External__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__External__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__2"


    // $ANTLR start "rule__External__Group__2__Impl"
    // InternalMathinterpreter.g:1244:1: rule__External__Group__2__Impl : ( '(' ) ;
    public final void rule__External__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1248:1: ( ( '(' ) )
            // InternalMathinterpreter.g:1249:1: ( '(' )
            {
            // InternalMathinterpreter.g:1249:1: ( '(' )
            // InternalMathinterpreter.g:1250:2: '('
            {
             before(grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__2__Impl"


    // $ANTLR start "rule__External__Group__3"
    // InternalMathinterpreter.g:1259:1: rule__External__Group__3 : rule__External__Group__3__Impl rule__External__Group__4 ;
    public final void rule__External__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1263:1: ( rule__External__Group__3__Impl rule__External__Group__4 )
            // InternalMathinterpreter.g:1264:2: rule__External__Group__3__Impl rule__External__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__External__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__3"


    // $ANTLR start "rule__External__Group__3__Impl"
    // InternalMathinterpreter.g:1271:1: rule__External__Group__3__Impl : ( ( rule__External__ArgumentsAssignment_3 ) ) ;
    public final void rule__External__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1275:1: ( ( ( rule__External__ArgumentsAssignment_3 ) ) )
            // InternalMathinterpreter.g:1276:1: ( ( rule__External__ArgumentsAssignment_3 ) )
            {
            // InternalMathinterpreter.g:1276:1: ( ( rule__External__ArgumentsAssignment_3 ) )
            // InternalMathinterpreter.g:1277:2: ( rule__External__ArgumentsAssignment_3 )
            {
             before(grammarAccess.getExternalAccess().getArgumentsAssignment_3()); 
            // InternalMathinterpreter.g:1278:2: ( rule__External__ArgumentsAssignment_3 )
            // InternalMathinterpreter.g:1278:3: rule__External__ArgumentsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__External__ArgumentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getArgumentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__3__Impl"


    // $ANTLR start "rule__External__Group__4"
    // InternalMathinterpreter.g:1286:1: rule__External__Group__4 : rule__External__Group__4__Impl rule__External__Group__5 ;
    public final void rule__External__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1290:1: ( rule__External__Group__4__Impl rule__External__Group__5 )
            // InternalMathinterpreter.g:1291:2: rule__External__Group__4__Impl rule__External__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__External__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__4"


    // $ANTLR start "rule__External__Group__4__Impl"
    // InternalMathinterpreter.g:1298:1: rule__External__Group__4__Impl : ( ( rule__External__Group_4__0 )* ) ;
    public final void rule__External__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1302:1: ( ( ( rule__External__Group_4__0 )* ) )
            // InternalMathinterpreter.g:1303:1: ( ( rule__External__Group_4__0 )* )
            {
            // InternalMathinterpreter.g:1303:1: ( ( rule__External__Group_4__0 )* )
            // InternalMathinterpreter.g:1304:2: ( rule__External__Group_4__0 )*
            {
             before(grammarAccess.getExternalAccess().getGroup_4()); 
            // InternalMathinterpreter.g:1305:2: ( rule__External__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMathinterpreter.g:1305:3: rule__External__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__External__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExternalAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__4__Impl"


    // $ANTLR start "rule__External__Group__5"
    // InternalMathinterpreter.g:1313:1: rule__External__Group__5 : rule__External__Group__5__Impl ;
    public final void rule__External__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1317:1: ( rule__External__Group__5__Impl )
            // InternalMathinterpreter.g:1318:2: rule__External__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__5"


    // $ANTLR start "rule__External__Group__5__Impl"
    // InternalMathinterpreter.g:1324:1: rule__External__Group__5__Impl : ( ')' ) ;
    public final void rule__External__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1328:1: ( ( ')' ) )
            // InternalMathinterpreter.g:1329:1: ( ')' )
            {
            // InternalMathinterpreter.g:1329:1: ( ')' )
            // InternalMathinterpreter.g:1330:2: ')'
            {
             before(grammarAccess.getExternalAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__5__Impl"


    // $ANTLR start "rule__External__Group_4__0"
    // InternalMathinterpreter.g:1340:1: rule__External__Group_4__0 : rule__External__Group_4__0__Impl rule__External__Group_4__1 ;
    public final void rule__External__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1344:1: ( rule__External__Group_4__0__Impl rule__External__Group_4__1 )
            // InternalMathinterpreter.g:1345:2: rule__External__Group_4__0__Impl rule__External__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__External__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group_4__0"


    // $ANTLR start "rule__External__Group_4__0__Impl"
    // InternalMathinterpreter.g:1352:1: rule__External__Group_4__0__Impl : ( ',' ) ;
    public final void rule__External__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1356:1: ( ( ',' ) )
            // InternalMathinterpreter.g:1357:1: ( ',' )
            {
            // InternalMathinterpreter.g:1357:1: ( ',' )
            // InternalMathinterpreter.g:1358:2: ','
            {
             before(grammarAccess.getExternalAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group_4__0__Impl"


    // $ANTLR start "rule__External__Group_4__1"
    // InternalMathinterpreter.g:1367:1: rule__External__Group_4__1 : rule__External__Group_4__1__Impl ;
    public final void rule__External__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1371:1: ( rule__External__Group_4__1__Impl )
            // InternalMathinterpreter.g:1372:2: rule__External__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__External__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group_4__1"


    // $ANTLR start "rule__External__Group_4__1__Impl"
    // InternalMathinterpreter.g:1378:1: rule__External__Group_4__1__Impl : ( ( rule__External__ArgumentsAssignment_4_1 ) ) ;
    public final void rule__External__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1382:1: ( ( ( rule__External__ArgumentsAssignment_4_1 ) ) )
            // InternalMathinterpreter.g:1383:1: ( ( rule__External__ArgumentsAssignment_4_1 ) )
            {
            // InternalMathinterpreter.g:1383:1: ( ( rule__External__ArgumentsAssignment_4_1 ) )
            // InternalMathinterpreter.g:1384:2: ( rule__External__ArgumentsAssignment_4_1 )
            {
             before(grammarAccess.getExternalAccess().getArgumentsAssignment_4_1()); 
            // InternalMathinterpreter.g:1385:2: ( rule__External__ArgumentsAssignment_4_1 )
            // InternalMathinterpreter.g:1385:3: rule__External__ArgumentsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__External__ArgumentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getArgumentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group_4__1__Impl"


    // $ANTLR start "rule__PMExpression__Group__0"
    // InternalMathinterpreter.g:1394:1: rule__PMExpression__Group__0 : rule__PMExpression__Group__0__Impl rule__PMExpression__Group__1 ;
    public final void rule__PMExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1398:1: ( rule__PMExpression__Group__0__Impl rule__PMExpression__Group__1 )
            // InternalMathinterpreter.g:1399:2: rule__PMExpression__Group__0__Impl rule__PMExpression__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__PMExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group__0"


    // $ANTLR start "rule__PMExpression__Group__0__Impl"
    // InternalMathinterpreter.g:1406:1: rule__PMExpression__Group__0__Impl : ( ruleMDExpression ) ;
    public final void rule__PMExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1410:1: ( ( ruleMDExpression ) )
            // InternalMathinterpreter.g:1411:1: ( ruleMDExpression )
            {
            // InternalMathinterpreter.g:1411:1: ( ruleMDExpression )
            // InternalMathinterpreter.g:1412:2: ruleMDExpression
            {
             before(grammarAccess.getPMExpressionAccess().getMDExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMDExpression();

            state._fsp--;

             after(grammarAccess.getPMExpressionAccess().getMDExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group__0__Impl"


    // $ANTLR start "rule__PMExpression__Group__1"
    // InternalMathinterpreter.g:1421:1: rule__PMExpression__Group__1 : rule__PMExpression__Group__1__Impl ;
    public final void rule__PMExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1425:1: ( rule__PMExpression__Group__1__Impl )
            // InternalMathinterpreter.g:1426:2: rule__PMExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PMExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group__1"


    // $ANTLR start "rule__PMExpression__Group__1__Impl"
    // InternalMathinterpreter.g:1432:1: rule__PMExpression__Group__1__Impl : ( ( rule__PMExpression__Group_1__0 )* ) ;
    public final void rule__PMExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1436:1: ( ( ( rule__PMExpression__Group_1__0 )* ) )
            // InternalMathinterpreter.g:1437:1: ( ( rule__PMExpression__Group_1__0 )* )
            {
            // InternalMathinterpreter.g:1437:1: ( ( rule__PMExpression__Group_1__0 )* )
            // InternalMathinterpreter.g:1438:2: ( rule__PMExpression__Group_1__0 )*
            {
             before(grammarAccess.getPMExpressionAccess().getGroup_1()); 
            // InternalMathinterpreter.g:1439:2: ( rule__PMExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=24 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMathinterpreter.g:1439:3: rule__PMExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__PMExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPMExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group__1__Impl"


    // $ANTLR start "rule__PMExpression__Group_1__0"
    // InternalMathinterpreter.g:1448:1: rule__PMExpression__Group_1__0 : rule__PMExpression__Group_1__0__Impl rule__PMExpression__Group_1__1 ;
    public final void rule__PMExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1452:1: ( rule__PMExpression__Group_1__0__Impl rule__PMExpression__Group_1__1 )
            // InternalMathinterpreter.g:1453:2: rule__PMExpression__Group_1__0__Impl rule__PMExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__PMExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group_1__0"


    // $ANTLR start "rule__PMExpression__Group_1__0__Impl"
    // InternalMathinterpreter.g:1460:1: rule__PMExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PMExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1464:1: ( ( () ) )
            // InternalMathinterpreter.g:1465:1: ( () )
            {
            // InternalMathinterpreter.g:1465:1: ( () )
            // InternalMathinterpreter.g:1466:2: ()
            {
             before(grammarAccess.getPMExpressionAccess().getPMExpressionLeftAction_1_0()); 
            // InternalMathinterpreter.g:1467:2: ()
            // InternalMathinterpreter.g:1467:3: 
            {
            }

             after(grammarAccess.getPMExpressionAccess().getPMExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PMExpression__Group_1__1"
    // InternalMathinterpreter.g:1475:1: rule__PMExpression__Group_1__1 : rule__PMExpression__Group_1__1__Impl rule__PMExpression__Group_1__2 ;
    public final void rule__PMExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1479:1: ( rule__PMExpression__Group_1__1__Impl rule__PMExpression__Group_1__2 )
            // InternalMathinterpreter.g:1480:2: rule__PMExpression__Group_1__1__Impl rule__PMExpression__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__PMExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group_1__1"


    // $ANTLR start "rule__PMExpression__Group_1__1__Impl"
    // InternalMathinterpreter.g:1487:1: rule__PMExpression__Group_1__1__Impl : ( ( rule__PMExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__PMExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1491:1: ( ( ( rule__PMExpression__OperatorAssignment_1_1 ) ) )
            // InternalMathinterpreter.g:1492:1: ( ( rule__PMExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMathinterpreter.g:1492:1: ( ( rule__PMExpression__OperatorAssignment_1_1 ) )
            // InternalMathinterpreter.g:1493:2: ( rule__PMExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getPMExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMathinterpreter.g:1494:2: ( rule__PMExpression__OperatorAssignment_1_1 )
            // InternalMathinterpreter.g:1494:3: rule__PMExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PMExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPMExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PMExpression__Group_1__2"
    // InternalMathinterpreter.g:1502:1: rule__PMExpression__Group_1__2 : rule__PMExpression__Group_1__2__Impl ;
    public final void rule__PMExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1506:1: ( rule__PMExpression__Group_1__2__Impl )
            // InternalMathinterpreter.g:1507:2: rule__PMExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PMExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group_1__2"


    // $ANTLR start "rule__PMExpression__Group_1__2__Impl"
    // InternalMathinterpreter.g:1513:1: rule__PMExpression__Group_1__2__Impl : ( ( rule__PMExpression__RightAssignment_1_2 ) ) ;
    public final void rule__PMExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1517:1: ( ( ( rule__PMExpression__RightAssignment_1_2 ) ) )
            // InternalMathinterpreter.g:1518:1: ( ( rule__PMExpression__RightAssignment_1_2 ) )
            {
            // InternalMathinterpreter.g:1518:1: ( ( rule__PMExpression__RightAssignment_1_2 ) )
            // InternalMathinterpreter.g:1519:2: ( rule__PMExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getPMExpressionAccess().getRightAssignment_1_2()); 
            // InternalMathinterpreter.g:1520:2: ( rule__PMExpression__RightAssignment_1_2 )
            // InternalMathinterpreter.g:1520:3: rule__PMExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PMExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPMExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MDExpression__Group__0"
    // InternalMathinterpreter.g:1529:1: rule__MDExpression__Group__0 : rule__MDExpression__Group__0__Impl rule__MDExpression__Group__1 ;
    public final void rule__MDExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1533:1: ( rule__MDExpression__Group__0__Impl rule__MDExpression__Group__1 )
            // InternalMathinterpreter.g:1534:2: rule__MDExpression__Group__0__Impl rule__MDExpression__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MDExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MDExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group__0"


    // $ANTLR start "rule__MDExpression__Group__0__Impl"
    // InternalMathinterpreter.g:1541:1: rule__MDExpression__Group__0__Impl : ( rulePowExpression ) ;
    public final void rule__MDExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1545:1: ( ( rulePowExpression ) )
            // InternalMathinterpreter.g:1546:1: ( rulePowExpression )
            {
            // InternalMathinterpreter.g:1546:1: ( rulePowExpression )
            // InternalMathinterpreter.g:1547:2: rulePowExpression
            {
             before(grammarAccess.getMDExpressionAccess().getPowExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePowExpression();

            state._fsp--;

             after(grammarAccess.getMDExpressionAccess().getPowExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group__0__Impl"


    // $ANTLR start "rule__MDExpression__Group__1"
    // InternalMathinterpreter.g:1556:1: rule__MDExpression__Group__1 : rule__MDExpression__Group__1__Impl ;
    public final void rule__MDExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1560:1: ( rule__MDExpression__Group__1__Impl )
            // InternalMathinterpreter.g:1561:2: rule__MDExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MDExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group__1"


    // $ANTLR start "rule__MDExpression__Group__1__Impl"
    // InternalMathinterpreter.g:1567:1: rule__MDExpression__Group__1__Impl : ( ( rule__MDExpression__Group_1__0 )* ) ;
    public final void rule__MDExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1571:1: ( ( ( rule__MDExpression__Group_1__0 )* ) )
            // InternalMathinterpreter.g:1572:1: ( ( rule__MDExpression__Group_1__0 )* )
            {
            // InternalMathinterpreter.g:1572:1: ( ( rule__MDExpression__Group_1__0 )* )
            // InternalMathinterpreter.g:1573:2: ( rule__MDExpression__Group_1__0 )*
            {
             before(grammarAccess.getMDExpressionAccess().getGroup_1()); 
            // InternalMathinterpreter.g:1574:2: ( rule__MDExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMathinterpreter.g:1574:3: rule__MDExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__MDExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMDExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group__1__Impl"


    // $ANTLR start "rule__MDExpression__Group_1__0"
    // InternalMathinterpreter.g:1583:1: rule__MDExpression__Group_1__0 : rule__MDExpression__Group_1__0__Impl rule__MDExpression__Group_1__1 ;
    public final void rule__MDExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1587:1: ( rule__MDExpression__Group_1__0__Impl rule__MDExpression__Group_1__1 )
            // InternalMathinterpreter.g:1588:2: rule__MDExpression__Group_1__0__Impl rule__MDExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__MDExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MDExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group_1__0"


    // $ANTLR start "rule__MDExpression__Group_1__0__Impl"
    // InternalMathinterpreter.g:1595:1: rule__MDExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MDExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1599:1: ( ( () ) )
            // InternalMathinterpreter.g:1600:1: ( () )
            {
            // InternalMathinterpreter.g:1600:1: ( () )
            // InternalMathinterpreter.g:1601:2: ()
            {
             before(grammarAccess.getMDExpressionAccess().getMDExpressionLeftAction_1_0()); 
            // InternalMathinterpreter.g:1602:2: ()
            // InternalMathinterpreter.g:1602:3: 
            {
            }

             after(grammarAccess.getMDExpressionAccess().getMDExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MDExpression__Group_1__1"
    // InternalMathinterpreter.g:1610:1: rule__MDExpression__Group_1__1 : rule__MDExpression__Group_1__1__Impl rule__MDExpression__Group_1__2 ;
    public final void rule__MDExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1614:1: ( rule__MDExpression__Group_1__1__Impl rule__MDExpression__Group_1__2 )
            // InternalMathinterpreter.g:1615:2: rule__MDExpression__Group_1__1__Impl rule__MDExpression__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__MDExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MDExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group_1__1"


    // $ANTLR start "rule__MDExpression__Group_1__1__Impl"
    // InternalMathinterpreter.g:1622:1: rule__MDExpression__Group_1__1__Impl : ( ( rule__MDExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MDExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1626:1: ( ( ( rule__MDExpression__OperatorAssignment_1_1 ) ) )
            // InternalMathinterpreter.g:1627:1: ( ( rule__MDExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMathinterpreter.g:1627:1: ( ( rule__MDExpression__OperatorAssignment_1_1 ) )
            // InternalMathinterpreter.g:1628:2: ( rule__MDExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMDExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMathinterpreter.g:1629:2: ( rule__MDExpression__OperatorAssignment_1_1 )
            // InternalMathinterpreter.g:1629:3: rule__MDExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MDExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMDExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MDExpression__Group_1__2"
    // InternalMathinterpreter.g:1637:1: rule__MDExpression__Group_1__2 : rule__MDExpression__Group_1__2__Impl ;
    public final void rule__MDExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1641:1: ( rule__MDExpression__Group_1__2__Impl )
            // InternalMathinterpreter.g:1642:2: rule__MDExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MDExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group_1__2"


    // $ANTLR start "rule__MDExpression__Group_1__2__Impl"
    // InternalMathinterpreter.g:1648:1: rule__MDExpression__Group_1__2__Impl : ( ( rule__MDExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MDExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1652:1: ( ( ( rule__MDExpression__RightAssignment_1_2 ) ) )
            // InternalMathinterpreter.g:1653:1: ( ( rule__MDExpression__RightAssignment_1_2 ) )
            {
            // InternalMathinterpreter.g:1653:1: ( ( rule__MDExpression__RightAssignment_1_2 ) )
            // InternalMathinterpreter.g:1654:2: ( rule__MDExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMDExpressionAccess().getRightAssignment_1_2()); 
            // InternalMathinterpreter.g:1655:2: ( rule__MDExpression__RightAssignment_1_2 )
            // InternalMathinterpreter.g:1655:3: rule__MDExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MDExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMDExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PowExpression__Group__0"
    // InternalMathinterpreter.g:1664:1: rule__PowExpression__Group__0 : rule__PowExpression__Group__0__Impl rule__PowExpression__Group__1 ;
    public final void rule__PowExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1668:1: ( rule__PowExpression__Group__0__Impl rule__PowExpression__Group__1 )
            // InternalMathinterpreter.g:1669:2: rule__PowExpression__Group__0__Impl rule__PowExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__PowExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group__0"


    // $ANTLR start "rule__PowExpression__Group__0__Impl"
    // InternalMathinterpreter.g:1676:1: rule__PowExpression__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__PowExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1680:1: ( ( rulePrimary ) )
            // InternalMathinterpreter.g:1681:1: ( rulePrimary )
            {
            // InternalMathinterpreter.g:1681:1: ( rulePrimary )
            // InternalMathinterpreter.g:1682:2: rulePrimary
            {
             before(grammarAccess.getPowExpressionAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPowExpressionAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group__0__Impl"


    // $ANTLR start "rule__PowExpression__Group__1"
    // InternalMathinterpreter.g:1691:1: rule__PowExpression__Group__1 : rule__PowExpression__Group__1__Impl ;
    public final void rule__PowExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1695:1: ( rule__PowExpression__Group__1__Impl )
            // InternalMathinterpreter.g:1696:2: rule__PowExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group__1"


    // $ANTLR start "rule__PowExpression__Group__1__Impl"
    // InternalMathinterpreter.g:1702:1: rule__PowExpression__Group__1__Impl : ( ( rule__PowExpression__Group_1__0 )* ) ;
    public final void rule__PowExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1706:1: ( ( ( rule__PowExpression__Group_1__0 )* ) )
            // InternalMathinterpreter.g:1707:1: ( ( rule__PowExpression__Group_1__0 )* )
            {
            // InternalMathinterpreter.g:1707:1: ( ( rule__PowExpression__Group_1__0 )* )
            // InternalMathinterpreter.g:1708:2: ( rule__PowExpression__Group_1__0 )*
            {
             before(grammarAccess.getPowExpressionAccess().getGroup_1()); 
            // InternalMathinterpreter.g:1709:2: ( rule__PowExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMathinterpreter.g:1709:3: rule__PowExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__PowExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPowExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group__1__Impl"


    // $ANTLR start "rule__PowExpression__Group_1__0"
    // InternalMathinterpreter.g:1718:1: rule__PowExpression__Group_1__0 : rule__PowExpression__Group_1__0__Impl rule__PowExpression__Group_1__1 ;
    public final void rule__PowExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1722:1: ( rule__PowExpression__Group_1__0__Impl rule__PowExpression__Group_1__1 )
            // InternalMathinterpreter.g:1723:2: rule__PowExpression__Group_1__0__Impl rule__PowExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__PowExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group_1__0"


    // $ANTLR start "rule__PowExpression__Group_1__0__Impl"
    // InternalMathinterpreter.g:1730:1: rule__PowExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PowExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1734:1: ( ( () ) )
            // InternalMathinterpreter.g:1735:1: ( () )
            {
            // InternalMathinterpreter.g:1735:1: ( () )
            // InternalMathinterpreter.g:1736:2: ()
            {
             before(grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1_0()); 
            // InternalMathinterpreter.g:1737:2: ()
            // InternalMathinterpreter.g:1737:3: 
            {
            }

             after(grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PowExpression__Group_1__1"
    // InternalMathinterpreter.g:1745:1: rule__PowExpression__Group_1__1 : rule__PowExpression__Group_1__1__Impl rule__PowExpression__Group_1__2 ;
    public final void rule__PowExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1749:1: ( rule__PowExpression__Group_1__1__Impl rule__PowExpression__Group_1__2 )
            // InternalMathinterpreter.g:1750:2: rule__PowExpression__Group_1__1__Impl rule__PowExpression__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__PowExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group_1__1"


    // $ANTLR start "rule__PowExpression__Group_1__1__Impl"
    // InternalMathinterpreter.g:1757:1: rule__PowExpression__Group_1__1__Impl : ( ( rule__PowExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__PowExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1761:1: ( ( ( rule__PowExpression__OperatorAssignment_1_1 ) ) )
            // InternalMathinterpreter.g:1762:1: ( ( rule__PowExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMathinterpreter.g:1762:1: ( ( rule__PowExpression__OperatorAssignment_1_1 ) )
            // InternalMathinterpreter.g:1763:2: ( rule__PowExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getPowExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMathinterpreter.g:1764:2: ( rule__PowExpression__OperatorAssignment_1_1 )
            // InternalMathinterpreter.g:1764:3: rule__PowExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PowExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPowExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PowExpression__Group_1__2"
    // InternalMathinterpreter.g:1772:1: rule__PowExpression__Group_1__2 : rule__PowExpression__Group_1__2__Impl ;
    public final void rule__PowExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1776:1: ( rule__PowExpression__Group_1__2__Impl )
            // InternalMathinterpreter.g:1777:2: rule__PowExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group_1__2"


    // $ANTLR start "rule__PowExpression__Group_1__2__Impl"
    // InternalMathinterpreter.g:1783:1: rule__PowExpression__Group_1__2__Impl : ( ( rule__PowExpression__RightAssignment_1_2 ) ) ;
    public final void rule__PowExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1787:1: ( ( ( rule__PowExpression__RightAssignment_1_2 ) ) )
            // InternalMathinterpreter.g:1788:1: ( ( rule__PowExpression__RightAssignment_1_2 ) )
            {
            // InternalMathinterpreter.g:1788:1: ( ( rule__PowExpression__RightAssignment_1_2 ) )
            // InternalMathinterpreter.g:1789:2: ( rule__PowExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getPowExpressionAccess().getRightAssignment_1_2()); 
            // InternalMathinterpreter.g:1790:2: ( rule__PowExpression__RightAssignment_1_2 )
            // InternalMathinterpreter.g:1790:3: rule__PowExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PowExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPowExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Power__Group__0"
    // InternalMathinterpreter.g:1799:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1803:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // InternalMathinterpreter.g:1804:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Power__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0"


    // $ANTLR start "rule__Power__Group__0__Impl"
    // InternalMathinterpreter.g:1811:1: rule__Power__Group__0__Impl : ( () ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1815:1: ( ( () ) )
            // InternalMathinterpreter.g:1816:1: ( () )
            {
            // InternalMathinterpreter.g:1816:1: ( () )
            // InternalMathinterpreter.g:1817:2: ()
            {
             before(grammarAccess.getPowerAccess().getPowAction_0()); 
            // InternalMathinterpreter.g:1818:2: ()
            // InternalMathinterpreter.g:1818:3: 
            {
            }

             after(grammarAccess.getPowerAccess().getPowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0__Impl"


    // $ANTLR start "rule__Power__Group__1"
    // InternalMathinterpreter.g:1826:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1830:1: ( rule__Power__Group__1__Impl )
            // InternalMathinterpreter.g:1831:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1"


    // $ANTLR start "rule__Power__Group__1__Impl"
    // InternalMathinterpreter.g:1837:1: rule__Power__Group__1__Impl : ( '**' ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1841:1: ( ( '**' ) )
            // InternalMathinterpreter.g:1842:1: ( '**' )
            {
            // InternalMathinterpreter.g:1842:1: ( '**' )
            // InternalMathinterpreter.g:1843:2: '**'
            {
             before(grammarAccess.getPowerAccess().getAsteriskAsteriskKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPowerAccess().getAsteriskAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_0__0"
    // InternalMathinterpreter.g:1853:1: rule__PlusMinus__Group_0__0 : rule__PlusMinus__Group_0__0__Impl rule__PlusMinus__Group_0__1 ;
    public final void rule__PlusMinus__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1857:1: ( rule__PlusMinus__Group_0__0__Impl rule__PlusMinus__Group_0__1 )
            // InternalMathinterpreter.g:1858:2: rule__PlusMinus__Group_0__0__Impl rule__PlusMinus__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__PlusMinus__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_0__0"


    // $ANTLR start "rule__PlusMinus__Group_0__0__Impl"
    // InternalMathinterpreter.g:1865:1: rule__PlusMinus__Group_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1869:1: ( ( () ) )
            // InternalMathinterpreter.g:1870:1: ( () )
            {
            // InternalMathinterpreter.g:1870:1: ( () )
            // InternalMathinterpreter.g:1871:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusAction_0_0()); 
            // InternalMathinterpreter.g:1872:2: ()
            // InternalMathinterpreter.g:1872:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_0__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_0__1"
    // InternalMathinterpreter.g:1880:1: rule__PlusMinus__Group_0__1 : rule__PlusMinus__Group_0__1__Impl ;
    public final void rule__PlusMinus__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1884:1: ( rule__PlusMinus__Group_0__1__Impl )
            // InternalMathinterpreter.g:1885:2: rule__PlusMinus__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_0__1"


    // $ANTLR start "rule__PlusMinus__Group_0__1__Impl"
    // InternalMathinterpreter.g:1891:1: rule__PlusMinus__Group_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1895:1: ( ( '+' ) )
            // InternalMathinterpreter.g:1896:1: ( '+' )
            {
            // InternalMathinterpreter.g:1896:1: ( '+' )
            // InternalMathinterpreter.g:1897:2: '+'
            {
             before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_0__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__0"
    // InternalMathinterpreter.g:1907:1: rule__PlusMinus__Group_1__0 : rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 ;
    public final void rule__PlusMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1911:1: ( rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 )
            // InternalMathinterpreter.g:1912:2: rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__PlusMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1__0__Impl"
    // InternalMathinterpreter.g:1919:1: rule__PlusMinus__Group_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1923:1: ( ( () ) )
            // InternalMathinterpreter.g:1924:1: ( () )
            {
            // InternalMathinterpreter.g:1924:1: ( () )
            // InternalMathinterpreter.g:1925:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getMinusAction_1_0()); 
            // InternalMathinterpreter.g:1926:2: ()
            // InternalMathinterpreter.g:1926:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__1"
    // InternalMathinterpreter.g:1934:1: rule__PlusMinus__Group_1__1 : rule__PlusMinus__Group_1__1__Impl ;
    public final void rule__PlusMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1938:1: ( rule__PlusMinus__Group_1__1__Impl )
            // InternalMathinterpreter.g:1939:2: rule__PlusMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1__1__Impl"
    // InternalMathinterpreter.g:1945:1: rule__PlusMinus__Group_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1949:1: ( ( '-' ) )
            // InternalMathinterpreter.g:1950:1: ( '-' )
            {
            // InternalMathinterpreter.g:1950:1: ( '-' )
            // InternalMathinterpreter.g:1951:2: '-'
            {
             before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplyDivide__Group_0__0"
    // InternalMathinterpreter.g:1961:1: rule__MultiplyDivide__Group_0__0 : rule__MultiplyDivide__Group_0__0__Impl rule__MultiplyDivide__Group_0__1 ;
    public final void rule__MultiplyDivide__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1965:1: ( rule__MultiplyDivide__Group_0__0__Impl rule__MultiplyDivide__Group_0__1 )
            // InternalMathinterpreter.g:1966:2: rule__MultiplyDivide__Group_0__0__Impl rule__MultiplyDivide__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__MultiplyDivide__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyDivide__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivide__Group_0__0"


    // $ANTLR start "rule__MultiplyDivide__Group_0__0__Impl"
    // InternalMathinterpreter.g:1973:1: rule__MultiplyDivide__Group_0__0__Impl : ( () ) ;
    public final void rule__MultiplyDivide__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1977:1: ( ( () ) )
            // InternalMathinterpreter.g:1978:1: ( () )
            {
            // InternalMathinterpreter.g:1978:1: ( () )
            // InternalMathinterpreter.g:1979:2: ()
            {
             before(grammarAccess.getMultiplyDivideAccess().getMultiplyAction_0_0()); 
            // InternalMathinterpreter.g:1980:2: ()
            // InternalMathinterpreter.g:1980:3: 
            {
            }

             after(grammarAccess.getMultiplyDivideAccess().getMultiplyAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivide__Group_0__0__Impl"


    // $ANTLR start "rule__MultiplyDivide__Group_0__1"
    // InternalMathinterpreter.g:1988:1: rule__MultiplyDivide__Group_0__1 : rule__MultiplyDivide__Group_0__1__Impl ;
    public final void rule__MultiplyDivide__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:1992:1: ( rule__MultiplyDivide__Group_0__1__Impl )
            // InternalMathinterpreter.g:1993:2: rule__MultiplyDivide__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyDivide__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivide__Group_0__1"


    // $ANTLR start "rule__MultiplyDivide__Group_0__1__Impl"
    // InternalMathinterpreter.g:1999:1: rule__MultiplyDivide__Group_0__1__Impl : ( '*' ) ;
    public final void rule__MultiplyDivide__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2003:1: ( ( '*' ) )
            // InternalMathinterpreter.g:2004:1: ( '*' )
            {
            // InternalMathinterpreter.g:2004:1: ( '*' )
            // InternalMathinterpreter.g:2005:2: '*'
            {
             before(grammarAccess.getMultiplyDivideAccess().getAsteriskKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMultiplyDivideAccess().getAsteriskKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivide__Group_0__1__Impl"


    // $ANTLR start "rule__MultiplyDivide__Group_1__0"
    // InternalMathinterpreter.g:2015:1: rule__MultiplyDivide__Group_1__0 : rule__MultiplyDivide__Group_1__0__Impl rule__MultiplyDivide__Group_1__1 ;
    public final void rule__MultiplyDivide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2019:1: ( rule__MultiplyDivide__Group_1__0__Impl rule__MultiplyDivide__Group_1__1 )
            // InternalMathinterpreter.g:2020:2: rule__MultiplyDivide__Group_1__0__Impl rule__MultiplyDivide__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__MultiplyDivide__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyDivide__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivide__Group_1__0"


    // $ANTLR start "rule__MultiplyDivide__Group_1__0__Impl"
    // InternalMathinterpreter.g:2027:1: rule__MultiplyDivide__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplyDivide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2031:1: ( ( () ) )
            // InternalMathinterpreter.g:2032:1: ( () )
            {
            // InternalMathinterpreter.g:2032:1: ( () )
            // InternalMathinterpreter.g:2033:2: ()
            {
             before(grammarAccess.getMultiplyDivideAccess().getDivideAction_1_0()); 
            // InternalMathinterpreter.g:2034:2: ()
            // InternalMathinterpreter.g:2034:3: 
            {
            }

             after(grammarAccess.getMultiplyDivideAccess().getDivideAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivide__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplyDivide__Group_1__1"
    // InternalMathinterpreter.g:2042:1: rule__MultiplyDivide__Group_1__1 : rule__MultiplyDivide__Group_1__1__Impl ;
    public final void rule__MultiplyDivide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2046:1: ( rule__MultiplyDivide__Group_1__1__Impl )
            // InternalMathinterpreter.g:2047:2: rule__MultiplyDivide__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyDivide__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivide__Group_1__1"


    // $ANTLR start "rule__MultiplyDivide__Group_1__1__Impl"
    // InternalMathinterpreter.g:2053:1: rule__MultiplyDivide__Group_1__1__Impl : ( '/' ) ;
    public final void rule__MultiplyDivide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2057:1: ( ( '/' ) )
            // InternalMathinterpreter.g:2058:1: ( '/' )
            {
            // InternalMathinterpreter.g:2058:1: ( '/' )
            // InternalMathinterpreter.g:2059:2: '/'
            {
             before(grammarAccess.getMultiplyDivideAccess().getSolidusKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMultiplyDivideAccess().getSolidusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivide__Group_1__1__Impl"


    // $ANTLR start "rule__Negative__Group__0"
    // InternalMathinterpreter.g:2069:1: rule__Negative__Group__0 : rule__Negative__Group__0__Impl rule__Negative__Group__1 ;
    public final void rule__Negative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2073:1: ( rule__Negative__Group__0__Impl rule__Negative__Group__1 )
            // InternalMathinterpreter.g:2074:2: rule__Negative__Group__0__Impl rule__Negative__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Negative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__0"


    // $ANTLR start "rule__Negative__Group__0__Impl"
    // InternalMathinterpreter.g:2081:1: rule__Negative__Group__0__Impl : ( '-' ) ;
    public final void rule__Negative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2085:1: ( ( '-' ) )
            // InternalMathinterpreter.g:2086:1: ( '-' )
            {
            // InternalMathinterpreter.g:2086:1: ( '-' )
            // InternalMathinterpreter.g:2087:2: '-'
            {
             before(grammarAccess.getNegativeAccess().getHyphenMinusKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__0__Impl"


    // $ANTLR start "rule__Negative__Group__1"
    // InternalMathinterpreter.g:2096:1: rule__Negative__Group__1 : rule__Negative__Group__1__Impl ;
    public final void rule__Negative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2100:1: ( rule__Negative__Group__1__Impl )
            // InternalMathinterpreter.g:2101:2: rule__Negative__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negative__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__1"


    // $ANTLR start "rule__Negative__Group__1__Impl"
    // InternalMathinterpreter.g:2107:1: rule__Negative__Group__1__Impl : ( ( rule__Negative__ValueAssignment_1 ) ) ;
    public final void rule__Negative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2111:1: ( ( ( rule__Negative__ValueAssignment_1 ) ) )
            // InternalMathinterpreter.g:2112:1: ( ( rule__Negative__ValueAssignment_1 ) )
            {
            // InternalMathinterpreter.g:2112:1: ( ( rule__Negative__ValueAssignment_1 ) )
            // InternalMathinterpreter.g:2113:2: ( rule__Negative__ValueAssignment_1 )
            {
             before(grammarAccess.getNegativeAccess().getValueAssignment_1()); 
            // InternalMathinterpreter.g:2114:2: ( rule__Negative__ValueAssignment_1 )
            // InternalMathinterpreter.g:2114:3: rule__Negative__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Negative__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegativeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__1__Impl"


    // $ANTLR start "rule__PMParenthesis__Group__0"
    // InternalMathinterpreter.g:2123:1: rule__PMParenthesis__Group__0 : rule__PMParenthesis__Group__0__Impl rule__PMParenthesis__Group__1 ;
    public final void rule__PMParenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2127:1: ( rule__PMParenthesis__Group__0__Impl rule__PMParenthesis__Group__1 )
            // InternalMathinterpreter.g:2128:2: rule__PMParenthesis__Group__0__Impl rule__PMParenthesis__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PMParenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMParenthesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMParenthesis__Group__0"


    // $ANTLR start "rule__PMParenthesis__Group__0__Impl"
    // InternalMathinterpreter.g:2135:1: rule__PMParenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__PMParenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2139:1: ( ( '(' ) )
            // InternalMathinterpreter.g:2140:1: ( '(' )
            {
            // InternalMathinterpreter.g:2140:1: ( '(' )
            // InternalMathinterpreter.g:2141:2: '('
            {
             before(grammarAccess.getPMParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPMParenthesisAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMParenthesis__Group__0__Impl"


    // $ANTLR start "rule__PMParenthesis__Group__1"
    // InternalMathinterpreter.g:2150:1: rule__PMParenthesis__Group__1 : rule__PMParenthesis__Group__1__Impl rule__PMParenthesis__Group__2 ;
    public final void rule__PMParenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2154:1: ( rule__PMParenthesis__Group__1__Impl rule__PMParenthesis__Group__2 )
            // InternalMathinterpreter.g:2155:2: rule__PMParenthesis__Group__1__Impl rule__PMParenthesis__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__PMParenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMParenthesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMParenthesis__Group__1"


    // $ANTLR start "rule__PMParenthesis__Group__1__Impl"
    // InternalMathinterpreter.g:2162:1: rule__PMParenthesis__Group__1__Impl : ( ( rule__PMParenthesis__ExpressionAssignment_1 ) ) ;
    public final void rule__PMParenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2166:1: ( ( ( rule__PMParenthesis__ExpressionAssignment_1 ) ) )
            // InternalMathinterpreter.g:2167:1: ( ( rule__PMParenthesis__ExpressionAssignment_1 ) )
            {
            // InternalMathinterpreter.g:2167:1: ( ( rule__PMParenthesis__ExpressionAssignment_1 ) )
            // InternalMathinterpreter.g:2168:2: ( rule__PMParenthesis__ExpressionAssignment_1 )
            {
             before(grammarAccess.getPMParenthesisAccess().getExpressionAssignment_1()); 
            // InternalMathinterpreter.g:2169:2: ( rule__PMParenthesis__ExpressionAssignment_1 )
            // InternalMathinterpreter.g:2169:3: rule__PMParenthesis__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PMParenthesis__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPMParenthesisAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMParenthesis__Group__1__Impl"


    // $ANTLR start "rule__PMParenthesis__Group__2"
    // InternalMathinterpreter.g:2177:1: rule__PMParenthesis__Group__2 : rule__PMParenthesis__Group__2__Impl ;
    public final void rule__PMParenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2181:1: ( rule__PMParenthesis__Group__2__Impl )
            // InternalMathinterpreter.g:2182:2: rule__PMParenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PMParenthesis__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMParenthesis__Group__2"


    // $ANTLR start "rule__PMParenthesis__Group__2__Impl"
    // InternalMathinterpreter.g:2188:1: rule__PMParenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__PMParenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2192:1: ( ( ')' ) )
            // InternalMathinterpreter.g:2193:1: ( ')' )
            {
            // InternalMathinterpreter.g:2193:1: ( ')' )
            // InternalMathinterpreter.g:2194:2: ')'
            {
             before(grammarAccess.getPMParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPMParenthesisAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMParenthesis__Group__2__Impl"


    // $ANTLR start "rule__DefParenthesis__Group__0"
    // InternalMathinterpreter.g:2204:1: rule__DefParenthesis__Group__0 : rule__DefParenthesis__Group__0__Impl rule__DefParenthesis__Group__1 ;
    public final void rule__DefParenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2208:1: ( rule__DefParenthesis__Group__0__Impl rule__DefParenthesis__Group__1 )
            // InternalMathinterpreter.g:2209:2: rule__DefParenthesis__Group__0__Impl rule__DefParenthesis__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DefParenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefParenthesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefParenthesis__Group__0"


    // $ANTLR start "rule__DefParenthesis__Group__0__Impl"
    // InternalMathinterpreter.g:2216:1: rule__DefParenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__DefParenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2220:1: ( ( '(' ) )
            // InternalMathinterpreter.g:2221:1: ( '(' )
            {
            // InternalMathinterpreter.g:2221:1: ( '(' )
            // InternalMathinterpreter.g:2222:2: '('
            {
             before(grammarAccess.getDefParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDefParenthesisAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefParenthesis__Group__0__Impl"


    // $ANTLR start "rule__DefParenthesis__Group__1"
    // InternalMathinterpreter.g:2231:1: rule__DefParenthesis__Group__1 : rule__DefParenthesis__Group__1__Impl rule__DefParenthesis__Group__2 ;
    public final void rule__DefParenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2235:1: ( rule__DefParenthesis__Group__1__Impl rule__DefParenthesis__Group__2 )
            // InternalMathinterpreter.g:2236:2: rule__DefParenthesis__Group__1__Impl rule__DefParenthesis__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__DefParenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefParenthesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefParenthesis__Group__1"


    // $ANTLR start "rule__DefParenthesis__Group__1__Impl"
    // InternalMathinterpreter.g:2243:1: rule__DefParenthesis__Group__1__Impl : ( ruleDefineExpr ) ;
    public final void rule__DefParenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2247:1: ( ( ruleDefineExpr ) )
            // InternalMathinterpreter.g:2248:1: ( ruleDefineExpr )
            {
            // InternalMathinterpreter.g:2248:1: ( ruleDefineExpr )
            // InternalMathinterpreter.g:2249:2: ruleDefineExpr
            {
             before(grammarAccess.getDefParenthesisAccess().getDefineExprParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleDefineExpr();

            state._fsp--;

             after(grammarAccess.getDefParenthesisAccess().getDefineExprParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefParenthesis__Group__1__Impl"


    // $ANTLR start "rule__DefParenthesis__Group__2"
    // InternalMathinterpreter.g:2258:1: rule__DefParenthesis__Group__2 : rule__DefParenthesis__Group__2__Impl ;
    public final void rule__DefParenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2262:1: ( rule__DefParenthesis__Group__2__Impl )
            // InternalMathinterpreter.g:2263:2: rule__DefParenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefParenthesis__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefParenthesis__Group__2"


    // $ANTLR start "rule__DefParenthesis__Group__2__Impl"
    // InternalMathinterpreter.g:2269:1: rule__DefParenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__DefParenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2273:1: ( ( ')' ) )
            // InternalMathinterpreter.g:2274:1: ( ')' )
            {
            // InternalMathinterpreter.g:2274:1: ( ')' )
            // InternalMathinterpreter.g:2275:2: ')'
            {
             before(grammarAccess.getDefParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDefParenthesisAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefParenthesis__Group__2__Impl"


    // $ANTLR start "rule__Model__MathexpressionAssignment"
    // InternalMathinterpreter.g:2285:1: rule__Model__MathexpressionAssignment : ( ruleMathExpression ) ;
    public final void rule__Model__MathexpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2289:1: ( ( ruleMathExpression ) )
            // InternalMathinterpreter.g:2290:2: ( ruleMathExpression )
            {
            // InternalMathinterpreter.g:2290:2: ( ruleMathExpression )
            // InternalMathinterpreter.g:2291:3: ruleMathExpression
            {
             before(grammarAccess.getModelAccess().getMathexpressionMathExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMathexpressionMathExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MathexpressionAssignment"


    // $ANTLR start "rule__Function__DescriptionAssignment_1"
    // InternalMathinterpreter.g:2300:1: rule__Function__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Function__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2304:1: ( ( RULE_STRING ) )
            // InternalMathinterpreter.g:2305:2: ( RULE_STRING )
            {
            // InternalMathinterpreter.g:2305:2: ( RULE_STRING )
            // InternalMathinterpreter.g:2306:3: RULE_STRING
            {
             before(grammarAccess.getFunctionAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__DescriptionAssignment_1"


    // $ANTLR start "rule__Function__ExpressionAssignment_3"
    // InternalMathinterpreter.g:2315:1: rule__Function__ExpressionAssignment_3 : ( rulePMExpression ) ;
    public final void rule__Function__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2319:1: ( ( rulePMExpression ) )
            // InternalMathinterpreter.g:2320:2: ( rulePMExpression )
            {
            // InternalMathinterpreter.g:2320:2: ( rulePMExpression )
            // InternalMathinterpreter.g:2321:3: rulePMExpression
            {
             before(grammarAccess.getFunctionAccess().getExpressionPMExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePMExpression();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getExpressionPMExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ExpressionAssignment_3"


    // $ANTLR start "rule__DefineExpr__DescriptionAssignment_0_0"
    // InternalMathinterpreter.g:2330:1: rule__DefineExpr__DescriptionAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__DefineExpr__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2334:1: ( ( RULE_STRING ) )
            // InternalMathinterpreter.g:2335:2: ( RULE_STRING )
            {
            // InternalMathinterpreter.g:2335:2: ( RULE_STRING )
            // InternalMathinterpreter.g:2336:3: RULE_STRING
            {
             before(grammarAccess.getDefineExprAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefineExprAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__DescriptionAssignment_0_0"


    // $ANTLR start "rule__DefineExpr__VariablesAssignment_2"
    // InternalMathinterpreter.g:2345:1: rule__DefineExpr__VariablesAssignment_2 : ( ruleVariable ) ;
    public final void rule__DefineExpr__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2349:1: ( ( ruleVariable ) )
            // InternalMathinterpreter.g:2350:2: ( ruleVariable )
            {
            // InternalMathinterpreter.g:2350:2: ( ruleVariable )
            // InternalMathinterpreter.g:2351:3: ruleVariable
            {
             before(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__VariablesAssignment_2"


    // $ANTLR start "rule__DefineExpr__VariablesAssignment_3_1"
    // InternalMathinterpreter.g:2360:1: rule__DefineExpr__VariablesAssignment_3_1 : ( ruleVariable ) ;
    public final void rule__DefineExpr__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2364:1: ( ( ruleVariable ) )
            // InternalMathinterpreter.g:2365:2: ( ruleVariable )
            {
            // InternalMathinterpreter.g:2365:2: ( ruleVariable )
            // InternalMathinterpreter.g:2366:3: ruleVariable
            {
             before(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDefineExprAccess().getVariablesVariableParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__VariablesAssignment_3_1"


    // $ANTLR start "rule__DefineExpr__ExpressionAssignment_5"
    // InternalMathinterpreter.g:2375:1: rule__DefineExpr__ExpressionAssignment_5 : ( rulePMExpression ) ;
    public final void rule__DefineExpr__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2379:1: ( ( rulePMExpression ) )
            // InternalMathinterpreter.g:2380:2: ( rulePMExpression )
            {
            // InternalMathinterpreter.g:2380:2: ( rulePMExpression )
            // InternalMathinterpreter.g:2381:3: rulePMExpression
            {
             before(grammarAccess.getDefineExprAccess().getExpressionPMExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePMExpression();

            state._fsp--;

             after(grammarAccess.getDefineExprAccess().getExpressionPMExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineExpr__ExpressionAssignment_5"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalMathinterpreter.g:2390:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2394:1: ( ( RULE_ID ) )
            // InternalMathinterpreter.g:2395:2: ( RULE_ID )
            {
            // InternalMathinterpreter.g:2395:2: ( RULE_ID )
            // InternalMathinterpreter.g:2396:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__ExpressionAssignment_2"
    // InternalMathinterpreter.g:2405:1: rule__Variable__ExpressionAssignment_2 : ( rulePMExpression ) ;
    public final void rule__Variable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2409:1: ( ( rulePMExpression ) )
            // InternalMathinterpreter.g:2410:2: ( rulePMExpression )
            {
            // InternalMathinterpreter.g:2410:2: ( rulePMExpression )
            // InternalMathinterpreter.g:2411:3: rulePMExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionPMExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePMExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionPMExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_2"


    // $ANTLR start "rule__External__NameAssignment_1"
    // InternalMathinterpreter.g:2420:1: rule__External__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2424:1: ( ( RULE_ID ) )
            // InternalMathinterpreter.g:2425:2: ( RULE_ID )
            {
            // InternalMathinterpreter.g:2425:2: ( RULE_ID )
            // InternalMathinterpreter.g:2426:3: RULE_ID
            {
             before(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__NameAssignment_1"


    // $ANTLR start "rule__External__ArgumentsAssignment_3"
    // InternalMathinterpreter.g:2435:1: rule__External__ArgumentsAssignment_3 : ( ( rule__External__ArgumentsAlternatives_3_0 ) ) ;
    public final void rule__External__ArgumentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2439:1: ( ( ( rule__External__ArgumentsAlternatives_3_0 ) ) )
            // InternalMathinterpreter.g:2440:2: ( ( rule__External__ArgumentsAlternatives_3_0 ) )
            {
            // InternalMathinterpreter.g:2440:2: ( ( rule__External__ArgumentsAlternatives_3_0 ) )
            // InternalMathinterpreter.g:2441:3: ( rule__External__ArgumentsAlternatives_3_0 )
            {
             before(grammarAccess.getExternalAccess().getArgumentsAlternatives_3_0()); 
            // InternalMathinterpreter.g:2442:3: ( rule__External__ArgumentsAlternatives_3_0 )
            // InternalMathinterpreter.g:2442:4: rule__External__ArgumentsAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__External__ArgumentsAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getArgumentsAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__ArgumentsAssignment_3"


    // $ANTLR start "rule__External__ArgumentsAssignment_4_1"
    // InternalMathinterpreter.g:2450:1: rule__External__ArgumentsAssignment_4_1 : ( ( rule__External__ArgumentsAlternatives_4_1_0 ) ) ;
    public final void rule__External__ArgumentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2454:1: ( ( ( rule__External__ArgumentsAlternatives_4_1_0 ) ) )
            // InternalMathinterpreter.g:2455:2: ( ( rule__External__ArgumentsAlternatives_4_1_0 ) )
            {
            // InternalMathinterpreter.g:2455:2: ( ( rule__External__ArgumentsAlternatives_4_1_0 ) )
            // InternalMathinterpreter.g:2456:3: ( rule__External__ArgumentsAlternatives_4_1_0 )
            {
             before(grammarAccess.getExternalAccess().getArgumentsAlternatives_4_1_0()); 
            // InternalMathinterpreter.g:2457:3: ( rule__External__ArgumentsAlternatives_4_1_0 )
            // InternalMathinterpreter.g:2457:4: rule__External__ArgumentsAlternatives_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__External__ArgumentsAlternatives_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getArgumentsAlternatives_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__ArgumentsAssignment_4_1"


    // $ANTLR start "rule__PMExpression__OperatorAssignment_1_1"
    // InternalMathinterpreter.g:2465:1: rule__PMExpression__OperatorAssignment_1_1 : ( rulePlusMinus ) ;
    public final void rule__PMExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2469:1: ( ( rulePlusMinus ) )
            // InternalMathinterpreter.g:2470:2: ( rulePlusMinus )
            {
            // InternalMathinterpreter.g:2470:2: ( rulePlusMinus )
            // InternalMathinterpreter.g:2471:3: rulePlusMinus
            {
             before(grammarAccess.getPMExpressionAccess().getOperatorPlusMinusParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getPMExpressionAccess().getOperatorPlusMinusParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__PMExpression__RightAssignment_1_2"
    // InternalMathinterpreter.g:2480:1: rule__PMExpression__RightAssignment_1_2 : ( ruleMDExpression ) ;
    public final void rule__PMExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2484:1: ( ( ruleMDExpression ) )
            // InternalMathinterpreter.g:2485:2: ( ruleMDExpression )
            {
            // InternalMathinterpreter.g:2485:2: ( ruleMDExpression )
            // InternalMathinterpreter.g:2486:3: ruleMDExpression
            {
             before(grammarAccess.getPMExpressionAccess().getRightMDExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMDExpression();

            state._fsp--;

             after(grammarAccess.getPMExpressionAccess().getRightMDExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMExpression__RightAssignment_1_2"


    // $ANTLR start "rule__MDExpression__OperatorAssignment_1_1"
    // InternalMathinterpreter.g:2495:1: rule__MDExpression__OperatorAssignment_1_1 : ( ruleMultiplyDivide ) ;
    public final void rule__MDExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2499:1: ( ( ruleMultiplyDivide ) )
            // InternalMathinterpreter.g:2500:2: ( ruleMultiplyDivide )
            {
            // InternalMathinterpreter.g:2500:2: ( ruleMultiplyDivide )
            // InternalMathinterpreter.g:2501:3: ruleMultiplyDivide
            {
             before(grammarAccess.getMDExpressionAccess().getOperatorMultiplyDivideParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplyDivide();

            state._fsp--;

             after(grammarAccess.getMDExpressionAccess().getOperatorMultiplyDivideParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MDExpression__RightAssignment_1_2"
    // InternalMathinterpreter.g:2510:1: rule__MDExpression__RightAssignment_1_2 : ( rulePowExpression ) ;
    public final void rule__MDExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2514:1: ( ( rulePowExpression ) )
            // InternalMathinterpreter.g:2515:2: ( rulePowExpression )
            {
            // InternalMathinterpreter.g:2515:2: ( rulePowExpression )
            // InternalMathinterpreter.g:2516:3: rulePowExpression
            {
             before(grammarAccess.getMDExpressionAccess().getRightPowExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePowExpression();

            state._fsp--;

             after(grammarAccess.getMDExpressionAccess().getRightPowExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDExpression__RightAssignment_1_2"


    // $ANTLR start "rule__PowExpression__OperatorAssignment_1_1"
    // InternalMathinterpreter.g:2525:1: rule__PowExpression__OperatorAssignment_1_1 : ( rulePower ) ;
    public final void rule__PowExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2529:1: ( ( rulePower ) )
            // InternalMathinterpreter.g:2530:2: ( rulePower )
            {
            // InternalMathinterpreter.g:2530:2: ( rulePower )
            // InternalMathinterpreter.g:2531:3: rulePower
            {
             before(grammarAccess.getPowExpressionAccess().getOperatorPowerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePower();

            state._fsp--;

             after(grammarAccess.getPowExpressionAccess().getOperatorPowerParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__PowExpression__RightAssignment_1_2"
    // InternalMathinterpreter.g:2540:1: rule__PowExpression__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__PowExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2544:1: ( ( rulePrimary ) )
            // InternalMathinterpreter.g:2545:2: ( rulePrimary )
            {
            // InternalMathinterpreter.g:2545:2: ( rulePrimary )
            // InternalMathinterpreter.g:2546:3: rulePrimary
            {
             before(grammarAccess.getPowExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPowExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__RightAssignment_1_2"


    // $ANTLR start "rule__VariableName__NameAssignment"
    // InternalMathinterpreter.g:2555:1: rule__VariableName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2559:1: ( ( RULE_ID ) )
            // InternalMathinterpreter.g:2560:2: ( RULE_ID )
            {
            // InternalMathinterpreter.g:2560:2: ( RULE_ID )
            // InternalMathinterpreter.g:2561:3: RULE_ID
            {
             before(grammarAccess.getVariableNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableName__NameAssignment"


    // $ANTLR start "rule__Positive__ValueAssignment"
    // InternalMathinterpreter.g:2570:1: rule__Positive__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Positive__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2574:1: ( ( RULE_INT ) )
            // InternalMathinterpreter.g:2575:2: ( RULE_INT )
            {
            // InternalMathinterpreter.g:2575:2: ( RULE_INT )
            // InternalMathinterpreter.g:2576:3: RULE_INT
            {
             before(grammarAccess.getPositiveAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositiveAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Positive__ValueAssignment"


    // $ANTLR start "rule__Negative__ValueAssignment_1"
    // InternalMathinterpreter.g:2585:1: rule__Negative__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Negative__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2589:1: ( ( RULE_INT ) )
            // InternalMathinterpreter.g:2590:2: ( RULE_INT )
            {
            // InternalMathinterpreter.g:2590:2: ( RULE_INT )
            // InternalMathinterpreter.g:2591:3: RULE_INT
            {
             before(grammarAccess.getNegativeAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__ValueAssignment_1"


    // $ANTLR start "rule__PMParenthesis__ExpressionAssignment_1"
    // InternalMathinterpreter.g:2600:1: rule__PMParenthesis__ExpressionAssignment_1 : ( rulePMExpression ) ;
    public final void rule__PMParenthesis__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathinterpreter.g:2604:1: ( ( rulePMExpression ) )
            // InternalMathinterpreter.g:2605:2: ( rulePMExpression )
            {
            // InternalMathinterpreter.g:2605:2: ( rulePMExpression )
            // InternalMathinterpreter.g:2606:3: rulePMExpression
            {
             before(grammarAccess.getPMParenthesisAccess().getExpressionPMExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePMExpression();

            state._fsp--;

             after(grammarAccess.getPMParenthesisAccess().getExpressionPMExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMParenthesis__ExpressionAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002180060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});

}