/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getSensortype <em>Sensortype</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getSampler <em>Sampler</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getVcc <em>Vcc</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getSensor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sensortype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensortype</em>' containment reference.
   * @see #setSensortype(SensorType)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getSensor_Sensortype()
   * @model containment="true"
   * @generated
   */
  SensorType getSensortype();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getSensortype <em>Sensortype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensortype</em>' containment reference.
   * @see #getSensortype()
   * @generated
   */
  void setSensortype(SensorType value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(SensorVariables)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getSensor_Vars()
   * @model containment="true"
   * @generated
   */
  SensorVariables getVars();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(SensorVariables value);

  /**
   * Returns the value of the '<em><b>Sampler</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sampler}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler</em>' containment reference list.
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getSensor_Sampler()
   * @model containment="true"
   * @generated
   */
  EList<Sampler> getSampler();

  /**
   * Returns the value of the '<em><b>Vcc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vcc</em>' attribute.
   * @see #setVcc(int)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getSensor_Vcc()
   * @model
   * @generated
   */
  int getVcc();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor#getVcc <em>Vcc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vcc</em>' attribute.
   * @see #getVcc()
   * @generated
   */
  void setVcc(int value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mdsd.arduino.boardgenerator.ioT.SensorOutput}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference list.
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getSensor_Output()
   * @model containment="true"
   * @generated
   */
  EList<SensorOutput> getOutput();

} // Sensor
