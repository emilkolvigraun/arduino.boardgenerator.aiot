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

import org.xtext.mdsd.arduino.boardgenerator.ioT.AbstractBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;
import org.xtext.mdsd.arduino.boardgenerator.ioT.NewBoard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.AbstractBoardImpl#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractBoardImpl extends MinimalEObjectImpl.Container implements AbstractBoard
{
  /**
   * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoard()
   * @generated
   * @ordered
   */
  protected NewBoard board;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractBoardImpl()
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
    return IoTPackage.Literals.ABSTRACT_BOARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NewBoard getBoard()
  {
    return board;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoard(NewBoard newBoard, NotificationChain msgs)
  {
    NewBoard oldBoard = board;
    board = newBoard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTPackage.ABSTRACT_BOARD__BOARD, oldBoard, newBoard);
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
  public void setBoard(NewBoard newBoard)
  {
    if (newBoard != board)
    {
      NotificationChain msgs = null;
      if (board != null)
        msgs = ((InternalEObject)board).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTPackage.ABSTRACT_BOARD__BOARD, null, msgs);
      if (newBoard != null)
        msgs = ((InternalEObject)newBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTPackage.ABSTRACT_BOARD__BOARD, null, msgs);
      msgs = basicSetBoard(newBoard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.ABSTRACT_BOARD__BOARD, newBoard, newBoard));
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
      case IoTPackage.ABSTRACT_BOARD__BOARD:
        return basicSetBoard(null, msgs);
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
      case IoTPackage.ABSTRACT_BOARD__BOARD:
        return getBoard();
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
      case IoTPackage.ABSTRACT_BOARD__BOARD:
        setBoard((NewBoard)newValue);
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
      case IoTPackage.ABSTRACT_BOARD__BOARD:
        setBoard((NewBoard)null);
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
      case IoTPackage.ABSTRACT_BOARD__BOARD:
        return board != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractBoardImpl
