/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Wifi;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wifi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.WifiImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.WifiImpl#getSport <em>Sport</em>}</li>
 *   <li>{@link org.xtext.mdsd.arduino.boardgenerator.ioT.impl.WifiImpl#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WifiImpl extends ChannelConfigImpl implements Wifi
{
  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getSport() <em>Sport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSport()
   * @generated
   * @ordered
   */
  protected static final int SPORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSport() <em>Sport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSport()
   * @generated
   * @ordered
   */
  protected int sport = SPORT_EDEFAULT;

  /**
   * The default value of the '{@link #getRoute() <em>Route</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoute()
   * @generated
   * @ordered
   */
  protected static final String ROUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRoute() <em>Route</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoute()
   * @generated
   * @ordered
   */
  protected String route = ROUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WifiImpl()
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
    return IoTPackage.Literals.WIFI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.WIFI__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSport()
  {
    return sport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSport(int newSport)
  {
    int oldSport = sport;
    sport = newSport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.WIFI__SPORT, oldSport, sport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRoute()
  {
    return route;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRoute(String newRoute)
  {
    String oldRoute = route;
    route = newRoute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IoTPackage.WIFI__ROUTE, oldRoute, route));
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
      case IoTPackage.WIFI__URL:
        return getUrl();
      case IoTPackage.WIFI__SPORT:
        return getSport();
      case IoTPackage.WIFI__ROUTE:
        return getRoute();
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
      case IoTPackage.WIFI__URL:
        setUrl((String)newValue);
        return;
      case IoTPackage.WIFI__SPORT:
        setSport((Integer)newValue);
        return;
      case IoTPackage.WIFI__ROUTE:
        setRoute((String)newValue);
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
      case IoTPackage.WIFI__URL:
        setUrl(URL_EDEFAULT);
        return;
      case IoTPackage.WIFI__SPORT:
        setSport(SPORT_EDEFAULT);
        return;
      case IoTPackage.WIFI__ROUTE:
        setRoute(ROUTE_EDEFAULT);
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
      case IoTPackage.WIFI__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case IoTPackage.WIFI__SPORT:
        return sport != SPORT_EDEFAULT;
      case IoTPackage.WIFI__ROUTE:
        return ROUTE_EDEFAULT == null ? route != null : !ROUTE_EDEFAULT.equals(route);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (url: ");
    result.append(url);
    result.append(", sport: ");
    result.append(sport);
    result.append(", route: ");
    result.append(route);
    result.append(')');
    return result.toString();
  }

} //WifiImpl
