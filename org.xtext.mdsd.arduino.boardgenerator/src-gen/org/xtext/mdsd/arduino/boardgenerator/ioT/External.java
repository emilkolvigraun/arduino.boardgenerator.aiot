/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.External#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.External#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getExternal()
 * @model
 * @generated
 */
public interface External extends Pipeline
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' reference.
   * @see #setFunction(Function)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getExternal_Function()
   * @model
   * @generated
   */
  Function getFunction();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.External#getFunction <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Function value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mdsd.arduino.boardgenerator.ioT.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getExternal_Input()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getInput();

} // External
