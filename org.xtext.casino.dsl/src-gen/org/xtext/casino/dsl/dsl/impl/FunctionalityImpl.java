/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.casino.dsl.dsl.Directory;
import org.xtext.casino.dsl.dsl.DslPackage;
import org.xtext.casino.dsl.dsl.Functionality;
import org.xtext.casino.dsl.dsl.RouterComponent;
import org.xtext.casino.dsl.dsl.ServiceFront;
import org.xtext.casino.dsl.dsl.State;
import org.xtext.casino.dsl.dsl.Visualizer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.FunctionalityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.FunctionalityImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.FunctionalityImpl#getWrap <em>Wrap</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.FunctionalityImpl#getRender <em>Render</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.FunctionalityImpl#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.FunctionalityImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.FunctionalityImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalityImpl extends AbstractFrontElementImpl implements Functionality
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoute()
   * @generated
   * @ordered
   */
  protected RouterComponent route;

  /**
   * The cached value of the '{@link #getWrap() <em>Wrap</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrap()
   * @generated
   * @ordered
   */
  protected org.xtext.casino.dsl.dsl.Container wrap;

  /**
   * The cached value of the '{@link #getRender() <em>Render</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRender()
   * @generated
   * @ordered
   */
  protected Visualizer render;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state;

  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected ServiceFront service;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Directory type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionalityImpl()
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
    return DslPackage.Literals.FUNCTIONALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FUNCTIONALITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RouterComponent getRoute()
  {
    if (route != null && route.eIsProxy())
    {
      InternalEObject oldRoute = (InternalEObject)route;
      route = (RouterComponent)eResolveProxy(oldRoute);
      if (route != oldRoute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.FUNCTIONALITY__ROUTE, oldRoute, route));
      }
    }
    return route;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouterComponent basicGetRoute()
  {
    return route;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRoute(RouterComponent newRoute)
  {
    RouterComponent oldRoute = route;
    route = newRoute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FUNCTIONALITY__ROUTE, oldRoute, route));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.casino.dsl.dsl.Container getWrap()
  {
    if (wrap != null && wrap.eIsProxy())
    {
      InternalEObject oldWrap = (InternalEObject)wrap;
      wrap = (org.xtext.casino.dsl.dsl.Container)eResolveProxy(oldWrap);
      if (wrap != oldWrap)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.FUNCTIONALITY__WRAP, oldWrap, wrap));
      }
    }
    return wrap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.casino.dsl.dsl.Container basicGetWrap()
  {
    return wrap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWrap(org.xtext.casino.dsl.dsl.Container newWrap)
  {
    org.xtext.casino.dsl.dsl.Container oldWrap = wrap;
    wrap = newWrap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FUNCTIONALITY__WRAP, oldWrap, wrap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Visualizer getRender()
  {
    if (render != null && render.eIsProxy())
    {
      InternalEObject oldRender = (InternalEObject)render;
      render = (Visualizer)eResolveProxy(oldRender);
      if (render != oldRender)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.FUNCTIONALITY__RENDER, oldRender, render));
      }
    }
    return render;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visualizer basicGetRender()
  {
    return render;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRender(Visualizer newRender)
  {
    Visualizer oldRender = render;
    render = newRender;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FUNCTIONALITY__RENDER, oldRender, render));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (State)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.FUNCTIONALITY__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setState(State newState)
  {
    State oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FUNCTIONALITY__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ServiceFront getService()
  {
    if (service != null && service.eIsProxy())
    {
      InternalEObject oldService = (InternalEObject)service;
      service = (ServiceFront)eResolveProxy(oldService);
      if (service != oldService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.FUNCTIONALITY__SERVICE, oldService, service));
      }
    }
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceFront basicGetService()
  {
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setService(ServiceFront newService)
  {
    ServiceFront oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FUNCTIONALITY__SERVICE, oldService, service));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Directory getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Directory)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.FUNCTIONALITY__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directory basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(Directory newType)
  {
    Directory oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FUNCTIONALITY__TYPE, oldType, type));
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
      case DslPackage.FUNCTIONALITY__NAME:
        return getName();
      case DslPackage.FUNCTIONALITY__ROUTE:
        if (resolve) return getRoute();
        return basicGetRoute();
      case DslPackage.FUNCTIONALITY__WRAP:
        if (resolve) return getWrap();
        return basicGetWrap();
      case DslPackage.FUNCTIONALITY__RENDER:
        if (resolve) return getRender();
        return basicGetRender();
      case DslPackage.FUNCTIONALITY__STATE:
        if (resolve) return getState();
        return basicGetState();
      case DslPackage.FUNCTIONALITY__SERVICE:
        if (resolve) return getService();
        return basicGetService();
      case DslPackage.FUNCTIONALITY__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case DslPackage.FUNCTIONALITY__NAME:
        setName((String)newValue);
        return;
      case DslPackage.FUNCTIONALITY__ROUTE:
        setRoute((RouterComponent)newValue);
        return;
      case DslPackage.FUNCTIONALITY__WRAP:
        setWrap((org.xtext.casino.dsl.dsl.Container)newValue);
        return;
      case DslPackage.FUNCTIONALITY__RENDER:
        setRender((Visualizer)newValue);
        return;
      case DslPackage.FUNCTIONALITY__STATE:
        setState((State)newValue);
        return;
      case DslPackage.FUNCTIONALITY__SERVICE:
        setService((ServiceFront)newValue);
        return;
      case DslPackage.FUNCTIONALITY__TYPE:
        setType((Directory)newValue);
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
      case DslPackage.FUNCTIONALITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.FUNCTIONALITY__ROUTE:
        setRoute((RouterComponent)null);
        return;
      case DslPackage.FUNCTIONALITY__WRAP:
        setWrap((org.xtext.casino.dsl.dsl.Container)null);
        return;
      case DslPackage.FUNCTIONALITY__RENDER:
        setRender((Visualizer)null);
        return;
      case DslPackage.FUNCTIONALITY__STATE:
        setState((State)null);
        return;
      case DslPackage.FUNCTIONALITY__SERVICE:
        setService((ServiceFront)null);
        return;
      case DslPackage.FUNCTIONALITY__TYPE:
        setType((Directory)null);
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
      case DslPackage.FUNCTIONALITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.FUNCTIONALITY__ROUTE:
        return route != null;
      case DslPackage.FUNCTIONALITY__WRAP:
        return wrap != null;
      case DslPackage.FUNCTIONALITY__RENDER:
        return render != null;
      case DslPackage.FUNCTIONALITY__STATE:
        return state != null;
      case DslPackage.FUNCTIONALITY__SERVICE:
        return service != null;
      case DslPackage.FUNCTIONALITY__TYPE:
        return type != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionalityImpl