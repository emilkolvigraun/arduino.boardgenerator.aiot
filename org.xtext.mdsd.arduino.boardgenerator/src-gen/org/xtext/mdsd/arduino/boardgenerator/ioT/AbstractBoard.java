/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.AbstractBoard#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getAbstractBoard()
 * @model
 * @generated
 */
public interface AbstractBoard extends EObject
{
  /**
   * Returns the value of the '<em><b>Board</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Board</em>' containment reference.
   * @see #setBoard(NewBoard)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getAbstractBoard_Board()
   * @model containment="true"
   * @generated
   */
  NewBoard getBoard();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.AbstractBoard#getBoard <em>Board</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Board</em>' containment reference.
   * @see #getBoard()
   * @generated
   */
  void setBoard(NewBoard value);

} // AbstractBoard
