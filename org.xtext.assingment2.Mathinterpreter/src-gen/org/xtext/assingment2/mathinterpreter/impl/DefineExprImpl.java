/**
 * generated by Xtext 2.21.0
 */
package org.xtext.assingment2.mathinterpreter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.assingment2.mathinterpreter.DefParenthesis;
import org.xtext.assingment2.mathinterpreter.DefineExpr;
import org.xtext.assingment2.mathinterpreter.MDExpression;
import org.xtext.assingment2.mathinterpreter.MathinterpreterPackage;
import org.xtext.assingment2.mathinterpreter.PMExpression;
import org.xtext.assingment2.mathinterpreter.PowExpression;
import org.xtext.assingment2.mathinterpreter.Primary;
import org.xtext.assingment2.mathinterpreter.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.assingment2.mathinterpreter.impl.DefineExprImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.assingment2.mathinterpreter.impl.DefineExprImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.assingment2.mathinterpreter.impl.DefineExprImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.assingment2.mathinterpreter.impl.DefineExprImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefineExprImpl extends MathExpressionImpl implements DefineExpr
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected PMExpression left;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected EObject operator;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected MDExpression right;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefineExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MathinterpreterPackage.Literals.DEFINE_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PMExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(PMExpression newLeft, NotificationChain msgs)
  {
    PMExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MathinterpreterPackage.DEFINE_EXPR__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeft(PMExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MathinterpreterPackage.DEFINE_EXPR__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MathinterpreterPackage.DEFINE_EXPR__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MathinterpreterPackage.DEFINE_EXPR__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(EObject newOperator, NotificationChain msgs)
  {
    EObject oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MathinterpreterPackage.DEFINE_EXPR__OPERATOR, oldOperator, newOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperator(EObject newOperator)
  {
    if (newOperator != operator)
    {
      NotificationChain msgs = null;
      if (operator != null)
        msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MathinterpreterPackage.DEFINE_EXPR__OPERATOR, null, msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MathinterpreterPackage.DEFINE_EXPR__OPERATOR, null, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MathinterpreterPackage.DEFINE_EXPR__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MDExpression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(MDExpression newRight, NotificationChain msgs)
  {
    MDExpression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MathinterpreterPackage.DEFINE_EXPR__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRight(MDExpression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MathinterpreterPackage.DEFINE_EXPR__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MathinterpreterPackage.DEFINE_EXPR__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MathinterpreterPackage.DEFINE_EXPR__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, MathinterpreterPackage.DEFINE_EXPR__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MathinterpreterPackage.DEFINE_EXPR__LEFT:
        return basicSetLeft(null, msgs);
      case MathinterpreterPackage.DEFINE_EXPR__OPERATOR:
        return basicSetOperator(null, msgs);
      case MathinterpreterPackage.DEFINE_EXPR__RIGHT:
        return basicSetRight(null, msgs);
      case MathinterpreterPackage.DEFINE_EXPR__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MathinterpreterPackage.DEFINE_EXPR__LEFT:
        return getLeft();
      case MathinterpreterPackage.DEFINE_EXPR__OPERATOR:
        return getOperator();
      case MathinterpreterPackage.DEFINE_EXPR__RIGHT:
        return getRight();
      case MathinterpreterPackage.DEFINE_EXPR__VARIABLES:
        return getVariables();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MathinterpreterPackage.DEFINE_EXPR__LEFT:
        setLeft((PMExpression)newValue);
        return;
      case MathinterpreterPackage.DEFINE_EXPR__OPERATOR:
        setOperator((EObject)newValue);
        return;
      case MathinterpreterPackage.DEFINE_EXPR__RIGHT:
        setRight((MDExpression)newValue);
        return;
      case MathinterpreterPackage.DEFINE_EXPR__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MathinterpreterPackage.DEFINE_EXPR__LEFT:
        setLeft((PMExpression)null);
        return;
      case MathinterpreterPackage.DEFINE_EXPR__OPERATOR:
        setOperator((EObject)null);
        return;
      case MathinterpreterPackage.DEFINE_EXPR__RIGHT:
        setRight((MDExpression)null);
        return;
      case MathinterpreterPackage.DEFINE_EXPR__VARIABLES:
        getVariables().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MathinterpreterPackage.DEFINE_EXPR__LEFT:
        return left != null;
      case MathinterpreterPackage.DEFINE_EXPR__OPERATOR:
        return operator != null;
      case MathinterpreterPackage.DEFINE_EXPR__RIGHT:
        return right != null;
      case MathinterpreterPackage.DEFINE_EXPR__VARIABLES:
        return variables != null && !variables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == PMExpression.class)
    {
      switch (derivedFeatureID)
      {
        case MathinterpreterPackage.DEFINE_EXPR__LEFT: return MathinterpreterPackage.PM_EXPRESSION__LEFT;
        case MathinterpreterPackage.DEFINE_EXPR__OPERATOR: return MathinterpreterPackage.PM_EXPRESSION__OPERATOR;
        case MathinterpreterPackage.DEFINE_EXPR__RIGHT: return MathinterpreterPackage.PM_EXPRESSION__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == MDExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PowExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Primary.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == DefParenthesis.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == PMExpression.class)
    {
      switch (baseFeatureID)
      {
        case MathinterpreterPackage.PM_EXPRESSION__LEFT: return MathinterpreterPackage.DEFINE_EXPR__LEFT;
        case MathinterpreterPackage.PM_EXPRESSION__OPERATOR: return MathinterpreterPackage.DEFINE_EXPR__OPERATOR;
        case MathinterpreterPackage.PM_EXPRESSION__RIGHT: return MathinterpreterPackage.DEFINE_EXPR__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == MDExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PowExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Primary.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == DefParenthesis.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //DefineExprImpl
