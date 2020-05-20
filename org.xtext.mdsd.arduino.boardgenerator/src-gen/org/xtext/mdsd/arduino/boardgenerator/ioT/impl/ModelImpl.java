/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.mdsd.arduino.boardgenerator.ioT.AbstractBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Board;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Function;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Include;
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Model;
import org.xtext.mdsd.arduino.boardgenerator.ioT.WifiConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ModelImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ModelImpl#getWifiConfig <em>Wifi Config</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ModelImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ModelImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ModelImpl#getAbstractBoard <em>Abstract Board</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.ModelImpl#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<Include> includes;

  /**
   * The cached value of the '{@link #getWifiConfig() <em>Wifi Config</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWifiConfig()
   * @generated
   * @ordered
   */
  protected EList<WifiConfig> wifiConfig;

  /**
   * The cached value of the '{@link #getChannel() <em>Channel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected EList<Channel> channel;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected EList<Function> function;

  /**
   * The cached value of the '{@link #getAbstractBoard() <em>Abstract Board</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractBoard()
   * @generated
   * @ordered
   */
  protected EList<AbstractBoard> abstractBoard;

  /**
   * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoard()
   * @generated
   * @ordered
   */
  protected EList<Board> board;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return IoTPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Include> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<Include>(Include.class, this, IoTPackage.MODEL__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<WifiConfig> getWifiConfig()
  {
    if (wifiConfig == null)
    {
      wifiConfig = new EObjectContainmentEList<WifiConfig>(WifiConfig.class, this, IoTPackage.MODEL__WIFI_CONFIG);
    }
    return wifiConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Channel> getChannel()
  {
    if (channel == null)
    {
      channel = new EObjectContainmentEList<Channel>(Channel.class, this, IoTPackage.MODEL__CHANNEL);
    }
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Function> getFunction()
  {
    if (function == null)
    {
      function = new EObjectContainmentEList<Function>(Function.class, this, IoTPackage.MODEL__FUNCTION);
    }
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractBoard> getAbstractBoard()
  {
    if (abstractBoard == null)
    {
      abstractBoard = new EObjectContainmentEList<AbstractBoard>(AbstractBoard.class, this, IoTPackage.MODEL__ABSTRACT_BOARD);
    }
    return abstractBoard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Board> getBoard()
  {
    if (board == null)
    {
      board = new EObjectContainmentEList<Board>(Board.class, this, IoTPackage.MODEL__BOARD);
    }
    return board;
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
      case IoTPackage.MODEL__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case IoTPackage.MODEL__WIFI_CONFIG:
        return ((InternalEList<?>)getWifiConfig()).basicRemove(otherEnd, msgs);
      case IoTPackage.MODEL__CHANNEL:
        return ((InternalEList<?>)getChannel()).basicRemove(otherEnd, msgs);
      case IoTPackage.MODEL__FUNCTION:
        return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
      case IoTPackage.MODEL__ABSTRACT_BOARD:
        return ((InternalEList<?>)getAbstractBoard()).basicRemove(otherEnd, msgs);
      case IoTPackage.MODEL__BOARD:
        return ((InternalEList<?>)getBoard()).basicRemove(otherEnd, msgs);
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
      case IoTPackage.MODEL__INCLUDES:
        return getIncludes();
      case IoTPackage.MODEL__WIFI_CONFIG:
        return getWifiConfig();
      case IoTPackage.MODEL__CHANNEL:
        return getChannel();
      case IoTPackage.MODEL__FUNCTION:
        return getFunction();
      case IoTPackage.MODEL__ABSTRACT_BOARD:
        return getAbstractBoard();
      case IoTPackage.MODEL__BOARD:
        return getBoard();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IoTPackage.MODEL__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends Include>)newValue);
        return;
      case IoTPackage.MODEL__WIFI_CONFIG:
        getWifiConfig().clear();
        getWifiConfig().addAll((Collection<? extends WifiConfig>)newValue);
        return;
      case IoTPackage.MODEL__CHANNEL:
        getChannel().clear();
        getChannel().addAll((Collection<? extends Channel>)newValue);
        return;
      case IoTPackage.MODEL__FUNCTION:
        getFunction().clear();
        getFunction().addAll((Collection<? extends Function>)newValue);
        return;
      case IoTPackage.MODEL__ABSTRACT_BOARD:
        getAbstractBoard().clear();
        getAbstractBoard().addAll((Collection<? extends AbstractBoard>)newValue);
        return;
      case IoTPackage.MODEL__BOARD:
        getBoard().clear();
        getBoard().addAll((Collection<? extends Board>)newValue);
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
      case IoTPackage.MODEL__INCLUDES:
        getIncludes().clear();
        return;
      case IoTPackage.MODEL__WIFI_CONFIG:
        getWifiConfig().clear();
        return;
      case IoTPackage.MODEL__CHANNEL:
        getChannel().clear();
        return;
      case IoTPackage.MODEL__FUNCTION:
        getFunction().clear();
        return;
      case IoTPackage.MODEL__ABSTRACT_BOARD:
        getAbstractBoard().clear();
        return;
      case IoTPackage.MODEL__BOARD:
        getBoard().clear();
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
      case IoTPackage.MODEL__INCLUDES:
        return includes != null && !includes.isEmpty();
      case IoTPackage.MODEL__WIFI_CONFIG:
        return wifiConfig != null && !wifiConfig.isEmpty();
      case IoTPackage.MODEL__CHANNEL:
        return channel != null && !channel.isEmpty();
      case IoTPackage.MODEL__FUNCTION:
        return function != null && !function.isEmpty();
      case IoTPackage.MODEL__ABSTRACT_BOARD:
        return abstractBoard != null && !abstractBoard.isEmpty();
      case IoTPackage.MODEL__BOARD:
        return board != null && !board.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
