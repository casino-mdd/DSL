/**
 * generated by Xtext 2.17.0
 */
package org.xtext.casino.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.casino.dsl.dsl.DslPackage;
import org.xtext.casino.dsl.dsl.JavaApp;
import org.xtext.casino.dsl.dsl.ReactApp;
import org.xtext.casino.dsl.dsl.Technology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.TechnologyImpl#getJava <em>Java</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.TechnologyImpl#getReact <em>React</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnologyImpl extends MinimalEObjectImpl.Container implements Technology
{
  /**
   * The cached value of the '{@link #getJava() <em>Java</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJava()
   * @generated
   * @ordered
   */
  protected JavaApp java;

  /**
   * The cached value of the '{@link #getReact() <em>React</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReact()
   * @generated
   * @ordered
   */
  protected ReactApp react;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TechnologyImpl()
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
    return DslPackage.Literals.TECHNOLOGY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JavaApp getJava()
  {
    return java;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJava(JavaApp newJava, NotificationChain msgs)
  {
    JavaApp oldJava = java;
    java = newJava;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TECHNOLOGY__JAVA, oldJava, newJava);
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
  public void setJava(JavaApp newJava)
  {
    if (newJava != java)
    {
      NotificationChain msgs = null;
      if (java != null)
        msgs = ((InternalEObject)java).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TECHNOLOGY__JAVA, null, msgs);
      if (newJava != null)
        msgs = ((InternalEObject)newJava).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TECHNOLOGY__JAVA, null, msgs);
      msgs = basicSetJava(newJava, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TECHNOLOGY__JAVA, newJava, newJava));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReactApp getReact()
  {
    return react;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReact(ReactApp newReact, NotificationChain msgs)
  {
    ReactApp oldReact = react;
    react = newReact;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TECHNOLOGY__REACT, oldReact, newReact);
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
  public void setReact(ReactApp newReact)
  {
    if (newReact != react)
    {
      NotificationChain msgs = null;
      if (react != null)
        msgs = ((InternalEObject)react).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TECHNOLOGY__REACT, null, msgs);
      if (newReact != null)
        msgs = ((InternalEObject)newReact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TECHNOLOGY__REACT, null, msgs);
      msgs = basicSetReact(newReact, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TECHNOLOGY__REACT, newReact, newReact));
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
      case DslPackage.TECHNOLOGY__JAVA:
        return basicSetJava(null, msgs);
      case DslPackage.TECHNOLOGY__REACT:
        return basicSetReact(null, msgs);
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
      case DslPackage.TECHNOLOGY__JAVA:
        return getJava();
      case DslPackage.TECHNOLOGY__REACT:
        return getReact();
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
      case DslPackage.TECHNOLOGY__JAVA:
        setJava((JavaApp)newValue);
        return;
      case DslPackage.TECHNOLOGY__REACT:
        setReact((ReactApp)newValue);
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
      case DslPackage.TECHNOLOGY__JAVA:
        setJava((JavaApp)null);
        return;
      case DslPackage.TECHNOLOGY__REACT:
        setReact((ReactApp)null);
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
      case DslPackage.TECHNOLOGY__JAVA:
        return java != null;
      case DslPackage.TECHNOLOGY__REACT:
        return react != null;
    }
    return super.eIsSet(featureID);
  }

} //TechnologyImpl
