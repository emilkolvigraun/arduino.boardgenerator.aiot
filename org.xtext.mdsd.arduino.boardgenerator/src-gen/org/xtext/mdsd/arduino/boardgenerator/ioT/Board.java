/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Board#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Board#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getBoard_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Board#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensors</em>' containment reference list.
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getBoard_Sensors()
   * @model containment="true"
   * @generated
   */
  EList<Sensor> getSensors();

} // Board
