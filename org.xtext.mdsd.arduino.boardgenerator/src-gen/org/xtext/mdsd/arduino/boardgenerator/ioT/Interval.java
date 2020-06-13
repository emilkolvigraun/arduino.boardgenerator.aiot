/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Interval#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Interval#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends Sampler
{
  /**
   * Returns the value of the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' attribute.
   * @see #setInterval(int)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getInterval_Interval()
   * @model
   * @generated
   */
  int getInterval();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Interval#getInterval <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' attribute.
   * @see #getInterval()
   * @generated
   */
  void setInterval(int value);

  /**
   * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolution</em>' containment reference.
   * @see #setResolution(Resolution)
   * @see org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage#getInterval_Resolution()
   * @model containment="true"
   * @generated
   */
  Resolution getResolution();

  /**
   * Sets the value of the '{@link org.xtext.mdsd.arduino.boardgenerator.ioT.Interval#getResolution <em>Resolution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolution</em>' containment reference.
   * @see #getResolution()
   * @generated
   */
  void setResolution(Resolution value);

} // Interval