/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.mdsd.arduino.boardgenerator.ioT.Conditional;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression;
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ConditionalImpl#getCorrect <em>Correct</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ConditionalImpl#getIncorrect <em>Incorrect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalImpl extends ExpressionImpl implements Conditional
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getCorrect() <em>Correct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorrect()
   * @generated
   * @ordered
   */
  protected Expression correct;

  /**
   * The cached value of the '{@link #getIncorrect() <em>Incorrect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncorrect()
   * @generated
   * @ordered
   */
  protected Expression incorrect;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalImpl()
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
    return IoTPackage.Literals.CONDITIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.CONDITIONAL__CONDITION, oldCondition, newCondition);
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
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.CONDITIONAL__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.CONDITIONAL__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.CONDITIONAL__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCorrect()
  {
    return correct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCorrect(Expression newCorrect, NotificationChain msgs)
  {
    Expression oldCorrect = correct;
    correct = newCorrect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.CONDITIONAL__CORRECT, oldCorrect, newCorrect);
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
  public void setCorrect(Expression newCorrect)
  {
    if (newCorrect != correct)
    {
      NotificationChain msgs = null;
      if (correct != null)
        msgs = ((InternalEObject)correct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.CONDITIONAL__CORRECT, null, msgs);
      if (newCorrect != null)
        msgs = ((InternalEObject)newCorrect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.CONDITIONAL__CORRECT, null, msgs);
      msgs = basicSetCorrect(newCorrect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.CONDITIONAL__CORRECT, newCorrect, newCorrect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getIncorrect()
  {
    return incorrect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncorrect(Expression newIncorrect, NotificationChain msgs)
  {
    Expression oldIncorrect = incorrect;
    incorrect = newIncorrect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.CONDITIONAL__INCORRECT, oldIncorrect, newIncorrect);
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
  public void setIncorrect(Expression newIncorrect)
  {
    if (newIncorrect != incorrect)
    {
      NotificationChain msgs = null;
      if (incorrect != null)
        msgs = ((InternalEObject)incorrect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.CONDITIONAL__INCORRECT, null, msgs);
      if (newIncorrect != null)
        msgs = ((InternalEObject)newIncorrect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.CONDITIONAL__INCORRECT, null, msgs);
      msgs = basicSetIncorrect(newIncorrect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.CONDITIONAL__INCORRECT, newIncorrect, newIncorrect));
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
      case IoTPackage.CONDITIONAL__CONDITION:
        return basicSetCondition(null, msgs);
      case IoTPackage.CONDITIONAL__CORRECT:
        return basicSetCorrect(null, msgs);
      case IoTPackage.CONDITIONAL__INCORRECT:
        return basicSetIncorrect(null, msgs);
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
      case IoTPackage.CONDITIONAL__CONDITION:
        return getCondition();
      case IoTPackage.CONDITIONAL__CORRECT:
        return getCorrect();
      case IoTPackage.CONDITIONAL__INCORRECT:
        return getIncorrect();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IoTPackage.CONDITIONAL__CONDITION:
        setCondition((Expression)newValue);
        return;
      case IoTPackage.CONDITIONAL__CORRECT:
        setCorrect((Expression)newValue);
        return;
      case IoTPackage.CONDITIONAL__INCORRECT:
        setIncorrect((Expression)newValue);
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
      case IoTPackage.CONDITIONAL__CONDITION:
        setCondition((Expression)null);
        return;
      case IoTPackage.CONDITIONAL__CORRECT:
        setCorrect((Expression)null);
        return;
      case IoTPackage.CONDITIONAL__INCORRECT:
        setIncorrect((Expression)null);
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
      case IoTPackage.CONDITIONAL__CONDITION:
        return condition != null;
      case IoTPackage.CONDITIONAL__CORRECT:
        return correct != null;
      case IoTPackage.CONDITIONAL__INCORRECT:
        return incorrect != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalImpl
