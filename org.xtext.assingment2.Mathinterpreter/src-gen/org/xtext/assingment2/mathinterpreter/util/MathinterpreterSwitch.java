/**
 * generated by Xtext 2.21.0
 */
package org.xtext.assingment2.mathinterpreter.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.assingment2.mathinterpreter.DefParenthesis;
import org.xtext.assingment2.mathinterpreter.DefineExpr;
import org.xtext.assingment2.mathinterpreter.Divide;
import org.xtext.assingment2.mathinterpreter.External;
import org.xtext.assingment2.mathinterpreter.Function;
import org.xtext.assingment2.mathinterpreter.MDExpression;
import org.xtext.assingment2.mathinterpreter.MathExpression;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.assingment2.mathinterpreter.MathinterpreterPackage
 * @generated
 */
public class MathinterpreterSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MathinterpreterPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathinterpreterSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MathinterpreterPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MathinterpreterPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.MATH_EXPRESSION:
      {
        MathExpression mathExpression = (MathExpression)theEObject;
        T result = caseMathExpression(mathExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseMathExpression(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.DEFINE_EXPR:
      {
        DefineExpr defineExpr = (DefineExpr)theEObject;
        T result = caseDefineExpr(defineExpr);
        if (result == null) result = caseMathExpression(defineExpr);
        if (result == null) result = caseDefParenthesis(defineExpr);
        if (result == null) result = casePrimary(defineExpr);
        if (result == null) result = casePowExpression(defineExpr);
        if (result == null) result = caseMDExpression(defineExpr);
        if (result == null) result = casePMExpression(defineExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.EXTERNAL:
      {
        External external = (External)theEObject;
        T result = caseExternal(external);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.PM_EXPRESSION:
      {
        PMExpression pmExpression = (PMExpression)theEObject;
        T result = casePMExpression(pmExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.MD_EXPRESSION:
      {
        MDExpression mdExpression = (MDExpression)theEObject;
        T result = caseMDExpression(mdExpression);
        if (result == null) result = casePMExpression(mdExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.POW_EXPRESSION:
      {
        PowExpression powExpression = (PowExpression)theEObject;
        T result = casePowExpression(powExpression);
        if (result == null) result = caseMDExpression(powExpression);
        if (result == null) result = casePMExpression(powExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.POWER:
      {
        Power power = (Power)theEObject;
        T result = casePower(power);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.PLUS_MINUS:
      {
        PlusMinus plusMinus = (PlusMinus)theEObject;
        T result = casePlusMinus(plusMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.MULTIPLY_DIVIDE:
      {
        MultiplyDivide multiplyDivide = (MultiplyDivide)theEObject;
        T result = caseMultiplyDivide(multiplyDivide);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.PRIMARY:
      {
        Primary primary = (Primary)theEObject;
        T result = casePrimary(primary);
        if (result == null) result = casePowExpression(primary);
        if (result == null) result = caseMDExpression(primary);
        if (result == null) result = casePMExpression(primary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.VARIABLE_NAME:
      {
        VariableName variableName = (VariableName)theEObject;
        T result = caseVariableName(variableName);
        if (result == null) result = casePrimary(variableName);
        if (result == null) result = casePowExpression(variableName);
        if (result == null) result = caseMDExpression(variableName);
        if (result == null) result = casePMExpression(variableName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.NUMBER:
      {
        org.xtext.assingment2.mathinterpreter.Number number = (org.xtext.assingment2.mathinterpreter.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = casePrimary(number);
        if (result == null) result = casePowExpression(number);
        if (result == null) result = caseMDExpression(number);
        if (result == null) result = casePMExpression(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.POSITIVE:
      {
        Positive positive = (Positive)theEObject;
        T result = casePositive(positive);
        if (result == null) result = caseNumber(positive);
        if (result == null) result = casePrimary(positive);
        if (result == null) result = casePowExpression(positive);
        if (result == null) result = caseMDExpression(positive);
        if (result == null) result = casePMExpression(positive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.NEGATIVE:
      {
        Negative negative = (Negative)theEObject;
        T result = caseNegative(negative);
        if (result == null) result = caseNumber(negative);
        if (result == null) result = casePrimary(negative);
        if (result == null) result = casePowExpression(negative);
        if (result == null) result = caseMDExpression(negative);
        if (result == null) result = casePMExpression(negative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.PM_PARENTHESIS:
      {
        PMParenthesis pmParenthesis = (PMParenthesis)theEObject;
        T result = casePMParenthesis(pmParenthesis);
        if (result == null) result = casePrimary(pmParenthesis);
        if (result == null) result = casePowExpression(pmParenthesis);
        if (result == null) result = caseMDExpression(pmParenthesis);
        if (result == null) result = casePMExpression(pmParenthesis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.DEF_PARENTHESIS:
      {
        DefParenthesis defParenthesis = (DefParenthesis)theEObject;
        T result = caseDefParenthesis(defParenthesis);
        if (result == null) result = casePrimary(defParenthesis);
        if (result == null) result = casePowExpression(defParenthesis);
        if (result == null) result = caseMDExpression(defParenthesis);
        if (result == null) result = casePMExpression(defParenthesis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.POW:
      {
        Pow pow = (Pow)theEObject;
        T result = casePow(pow);
        if (result == null) result = casePower(pow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = casePlusMinus(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = casePlusMinus(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.MULTIPLY:
      {
        Multiply multiply = (Multiply)theEObject;
        T result = caseMultiply(multiply);
        if (result == null) result = caseMultiplyDivide(multiply);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MathinterpreterPackage.DIVIDE:
      {
        Divide divide = (Divide)theEObject;
        T result = caseDivide(divide);
        if (result == null) result = caseMultiplyDivide(divide);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathExpression(MathExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Define Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Define Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefineExpr(DefineExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternal(External object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PM Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PM Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePMExpression(PMExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MD Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MD Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMDExpression(MDExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePowExpression(PowExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Power</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Power</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePower(Power object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusMinus(PlusMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiply Divide</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiply Divide</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplyDivide(MultiplyDivide object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimary(Primary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableName(VariableName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(org.xtext.assingment2.mathinterpreter.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Positive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Positive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositive(Positive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegative(Negative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PM Parenthesis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PM Parenthesis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePMParenthesis(PMParenthesis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Parenthesis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Parenthesis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefParenthesis(DefParenthesis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePow(Pow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiply(Multiply object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivide(Divide object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MathinterpreterSwitch
