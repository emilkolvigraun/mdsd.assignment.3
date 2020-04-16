/**
 * generated by Xtext 2.21.0
 */
package org.xtext.assingment2.mathinterpreter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.assingment2.mathinterpreter.DefParenthesis;
import org.xtext.assingment2.mathinterpreter.DefineExpr;
import org.xtext.assingment2.mathinterpreter.Divide;
import org.xtext.assingment2.mathinterpreter.External;
import org.xtext.assingment2.mathinterpreter.Function;
import org.xtext.assingment2.mathinterpreter.MDExpression;
import org.xtext.assingment2.mathinterpreter.MathExpression;
import org.xtext.assingment2.mathinterpreter.MathinterpreterFactory;
import org.xtext.assingment2.mathinterpreter.MathinterpreterPackage;
import org.xtext.assingment2.mathinterpreter.Minus;
import org.xtext.assingment2.mathinterpreter.Model;
import org.xtext.assingment2.mathinterpreter.Multiply;
import org.xtext.assingment2.mathinterpreter.MultiplyDivide;
import org.xtext.assingment2.mathinterpreter.Negative;
import org.xtext.assingment2.mathinterpreter.PMExpression;
import org.xtext.assingment2.mathinterpreter.PMParenthesis;
import org.xtext.assingment2.mathinterpreter.Plus;
import org.xtext.assingment2.mathinterpreter.PlusMinus;
import org.xtext.assingment2.mathinterpreter.Positive;
import org.xtext.assingment2.mathinterpreter.Pow;
import org.xtext.assingment2.mathinterpreter.PowExpression;
import org.xtext.assingment2.mathinterpreter.Power;
import org.xtext.assingment2.mathinterpreter.Primary;
import org.xtext.assingment2.mathinterpreter.Variable;
import org.xtext.assingment2.mathinterpreter.VariableName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathinterpreterFactoryImpl extends EFactoryImpl implements MathinterpreterFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MathinterpreterFactory init()
  {
    try
    {
      MathinterpreterFactory theMathinterpreterFactory = (MathinterpreterFactory)EPackage.Registry.INSTANCE.getEFactory(MathinterpreterPackage.eNS_URI);
      if (theMathinterpreterFactory != null)
      {
        return theMathinterpreterFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MathinterpreterFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathinterpreterFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MathinterpreterPackage.MODEL: return createModel();
      case MathinterpreterPackage.MATH_EXPRESSION: return createMathExpression();
      case MathinterpreterPackage.FUNCTION: return createFunction();
      case MathinterpreterPackage.DEFINE_EXPR: return createDefineExpr();
      case MathinterpreterPackage.VARIABLE: return createVariable();
      case MathinterpreterPackage.EXTERNAL: return createExternal();
      case MathinterpreterPackage.PM_EXPRESSION: return createPMExpression();
      case MathinterpreterPackage.MD_EXPRESSION: return createMDExpression();
      case MathinterpreterPackage.POW_EXPRESSION: return createPowExpression();
      case MathinterpreterPackage.POWER: return createPower();
      case MathinterpreterPackage.PLUS_MINUS: return createPlusMinus();
      case MathinterpreterPackage.MULTIPLY_DIVIDE: return createMultiplyDivide();
      case MathinterpreterPackage.PRIMARY: return createPrimary();
      case MathinterpreterPackage.VARIABLE_NAME: return createVariableName();
      case MathinterpreterPackage.NUMBER: return createNumber();
      case MathinterpreterPackage.POSITIVE: return createPositive();
      case MathinterpreterPackage.NEGATIVE: return createNegative();
      case MathinterpreterPackage.PM_PARENTHESIS: return createPMParenthesis();
      case MathinterpreterPackage.DEF_PARENTHESIS: return createDefParenthesis();
      case MathinterpreterPackage.POW: return createPow();
      case MathinterpreterPackage.PLUS: return createPlus();
      case MathinterpreterPackage.MINUS: return createMinus();
      case MathinterpreterPackage.MULTIPLY: return createMultiply();
      case MathinterpreterPackage.DIVIDE: return createDivide();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathExpression createMathExpression()
  {
    MathExpressionImpl mathExpression = new MathExpressionImpl();
    return mathExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefineExpr createDefineExpr()
  {
    DefineExprImpl defineExpr = new DefineExprImpl();
    return defineExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public External createExternal()
  {
    ExternalImpl external = new ExternalImpl();
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PMExpression createPMExpression()
  {
    PMExpressionImpl pmExpression = new PMExpressionImpl();
    return pmExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MDExpression createMDExpression()
  {
    MDExpressionImpl mdExpression = new MDExpressionImpl();
    return mdExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PowExpression createPowExpression()
  {
    PowExpressionImpl powExpression = new PowExpressionImpl();
    return powExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Power createPower()
  {
    PowerImpl power = new PowerImpl();
    return power;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlusMinus createPlusMinus()
  {
    PlusMinusImpl plusMinus = new PlusMinusImpl();
    return plusMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplyDivide createMultiplyDivide()
  {
    MultiplyDivideImpl multiplyDivide = new MultiplyDivideImpl();
    return multiplyDivide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableName createVariableName()
  {
    VariableNameImpl variableName = new VariableNameImpl();
    return variableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.assingment2.mathinterpreter.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Positive createPositive()
  {
    PositiveImpl positive = new PositiveImpl();
    return positive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Negative createNegative()
  {
    NegativeImpl negative = new NegativeImpl();
    return negative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PMParenthesis createPMParenthesis()
  {
    PMParenthesisImpl pmParenthesis = new PMParenthesisImpl();
    return pmParenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefParenthesis createDefParenthesis()
  {
    DefParenthesisImpl defParenthesis = new DefParenthesisImpl();
    return defParenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pow createPow()
  {
    PowImpl pow = new PowImpl();
    return pow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multiply createMultiply()
  {
    MultiplyImpl multiply = new MultiplyImpl();
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Divide createDivide()
  {
    DivideImpl divide = new DivideImpl();
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathinterpreterPackage getMathinterpreterPackage()
  {
    return (MathinterpreterPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MathinterpreterPackage getPackage()
  {
    return MathinterpreterPackage.eINSTANCE;
  }

} //MathinterpreterFactoryImpl
