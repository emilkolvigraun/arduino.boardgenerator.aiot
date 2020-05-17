/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.DataOutput;
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.SensorOutputImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.SensorOutputImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorOutputImpl extends MinimalEObjectImpl.Container implements SensorOutput
{
  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected DataOutput output;

  /**
   * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected Channel channel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensorOutputImpl()
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
    return IoTPackage.Literals.SENSOR_OUTPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataOutput getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(DataOutput newOutput, NotificationChain msgs)
  {
    DataOutput oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.SENSOR_OUTPUT__OUTPUT, oldOutput, newOutput);
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
  public void setOutput(DataOutput newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.SENSOR_OUTPUT__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.SENSOR_OUTPUT__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.SENSOR_OUTPUT__OUTPUT, newOutput, newOutput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Channel getChannel()
  {
    if (channel != null && channel.eIsProxy())
    {
      InternalEObject oldChannel = (InternalEObject)channel;
      channel = (Channel)eResolveProxy(oldChannel);
      if (channel != oldChannel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoTPackage.SENSOR_OUTPUT__CHANNEL, oldChannel, channel));
      }
    }
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Channel basicGetChannel()
  {
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setChannel(Channel newChannel)
  {
    Channel oldChannel = channel;
    channel = newChannel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.SENSOR_OUTPUT__CHANNEL, oldChannel, channel));
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
      case IoTPackage.SENSOR_OUTPUT__OUTPUT:
        return basicSetOutput(null, msgs);
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
      case IoTPackage.SENSOR_OUTPUT__OUTPUT:
        return getOutput();
      case IoTPackage.SENSOR_OUTPUT__CHANNEL:
        if (resolve) return getChannel();
        return basicGetChannel();
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
      case IoTPackage.SENSOR_OUTPUT__OUTPUT:
        setOutput((DataOutput)newValue);
        return;
      case IoTPackage.SENSOR_OUTPUT__CHANNEL:
        setChannel((Channel)newValue);
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
      case IoTPackage.SENSOR_OUTPUT__OUTPUT:
        setOutput((DataOutput)null);
        return;
      case IoTPackage.SENSOR_OUTPUT__CHANNEL:
        setChannel((Channel)null);
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
      case IoTPackage.SENSOR_OUTPUT__OUTPUT:
        return output != null;
      case IoTPackage.SENSOR_OUTPUT__CHANNEL:
        return channel != null;
    }
    return super.eIsSet(featureID);
  }

} //SensorOutputImpl