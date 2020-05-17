/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.mdsd.arduino.boardgenerator.ioT.Exponent;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression;
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ExponentImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ExponentImpl#getPower <em>Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExponentImpl extends ExpressionImpl implements Exponent
{
  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected Expression base;

  /**
   * The cached value of the '{@link #getPower() <em>Power</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPower()
   * @generated
   * @ordered
   */
  protected Expression power;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExponentImpl()
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
    return IoTPackage.Literals.EXPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBase(Expression newBase, NotificationChain msgs)
  {
    Expression oldBase = base;
    base = newBase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.EXPONENT__BASE, oldBase, newBase);
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
  public void setBase(Expression newBase)
  {
    if (newBase != base)
    {
      NotificationChain msgs = null;
      if (base != null)
        msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.EXPONENT__BASE, null, msgs);
      if (newBase != null)
        msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.EXPONENT__BASE, null, msgs);
      msgs = basicSetBase(newBase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.EXPONENT__BASE, newBase, newBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getPower()
  {
    return power;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPower(Expression newPower, NotificationChain msgs)
  {
    Expression oldPower = power;
    power = newPower;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.EXPONENT__POWER, oldPower, newPower);
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
  public void setPower(Expression newPower)
  {
    if (newPower != power)
    {
      NotificationChain msgs = null;
      if (power != null)
        msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.EXPONENT__POWER, null, msgs);
      if (newPower != null)
        msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.EXPONENT__POWER, null, msgs);
      msgs = basicSetPower(newPower, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.EXPONENT__POWER, newPower, newPower));
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
      case IoTPackage.EXPONENT__BASE:
        return basicSetBase(null, msgs);
      case IoTPackage.EXPONENT__POWER:
        return basicSetPower(null, msgs);
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
      case IoTPackage.EXPONENT__BASE:
        return getBase();
      case IoTPackage.EXPONENT__POWER:
        return getPower();
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
      case IoTPackage.EXPONENT__BASE:
        setBase((Expression)newValue);
        return;
      case IoTPackage.EXPONENT__POWER:
        setPower((Expression)newValue);
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
      case IoTPackage.EXPONENT__BASE:
        setBase((Expression)null);
        return;
      case IoTPackage.EXPONENT__POWER:
        setPower((Expression)null);
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
      case IoTPackage.EXPONENT__BASE:
        return base != null;
      case IoTPackage.EXPONENT__POWER:
        return power != null;
    }
    return super.eIsSet(featureID);
  }

} //ExponentImpl