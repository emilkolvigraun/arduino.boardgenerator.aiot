/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Function#getInput <em>Input</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Function#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mdsd.arduino.boardgenerator.ioT.FunctionInputType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getFunction_Input()
   * @model containment="true"
   * @generated
   */
  EList<FunctionInputType> getInput();

  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute list.
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getFunction_Output()
   * @model unique="false"
   * @generated
   */
  EList<String> getOutput();

} // Function
