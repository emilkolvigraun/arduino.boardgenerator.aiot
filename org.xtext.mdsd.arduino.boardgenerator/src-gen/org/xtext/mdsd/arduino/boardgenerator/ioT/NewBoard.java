/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.NewBoard#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getNewBoard()
 * @model
 * @generated
 */
public interface NewBoard extends Board
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(BoardVersion)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getNewBoard_Version()
   * @model containment="true"
   * @generated
   */
  BoardVersion getVersion();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.NewBoard#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(BoardVersion value);

} // NewBoard
