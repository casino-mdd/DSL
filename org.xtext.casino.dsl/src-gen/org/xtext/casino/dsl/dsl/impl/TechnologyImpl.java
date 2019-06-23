/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.casino.dsl.dsl.DslPackage;
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
   * The default value of the '{@link #getJava() <em>Java</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJava()
   * @generated
   * @ordered
   */
  protected static final String JAVA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJava() <em>Java</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJava()
   * @generated
   * @ordered
   */
  protected String java = JAVA_EDEFAULT;

  /**
   * The default value of the '{@link #getReact() <em>React</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReact()
   * @generated
   * @ordered
   */
  protected static final String REACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReact() <em>React</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReact()
   * @generated
   * @ordered
   */
  protected String react = REACT_EDEFAULT;

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
  public String getJava()
  {
    return java;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJava(String newJava)
  {
    String oldJava = java;
    java = newJava;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TECHNOLOGY__JAVA, oldJava, java));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReact()
  {
    return react;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReact(String newReact)
  {
    String oldReact = react;
    react = newReact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TECHNOLOGY__REACT, oldReact, react));
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
        setJava((String)newValue);
        return;
      case DslPackage.TECHNOLOGY__REACT:
        setReact((String)newValue);
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
        setJava(JAVA_EDEFAULT);
        return;
      case DslPackage.TECHNOLOGY__REACT:
        setReact(REACT_EDEFAULT);
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
        return JAVA_EDEFAULT == null ? java != null : !JAVA_EDEFAULT.equals(java);
      case DslPackage.TECHNOLOGY__REACT:
        return REACT_EDEFAULT == null ? react != null : !REACT_EDEFAULT.equals(react);
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
    result.append(" (java: ");
    result.append(java);
    result.append(", react: ");
    result.append(react);
    result.append(')');
    return result.toString();
  }

} //TechnologyImpl