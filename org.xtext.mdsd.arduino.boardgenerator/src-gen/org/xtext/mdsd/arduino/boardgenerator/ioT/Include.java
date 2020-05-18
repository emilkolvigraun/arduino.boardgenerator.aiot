/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Include#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends EObject
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute list.
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getInclude_ImportURI()
   * @model unique="false"
   * @generated
   */
  EList<String> getImportURI();

} // Include
