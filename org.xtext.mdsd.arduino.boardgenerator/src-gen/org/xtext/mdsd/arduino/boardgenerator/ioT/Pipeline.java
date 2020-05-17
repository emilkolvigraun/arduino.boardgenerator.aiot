/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Pipeline#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject
{
  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(Pipeline)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getPipeline_Next()
   * @model containment="true"
   * @generated
   */
  Pipeline getNext();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Pipeline#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(Pipeline value);

} // Pipeline