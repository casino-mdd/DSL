/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.casino.dsl.dsl.Domain;
import org.xtext.casino.dsl.dsl.DslPackage;
import org.xtext.casino.dsl.dsl.Technology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.SystemImpl#getDom <em>Dom</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.SystemImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.SystemImpl#getTech <em>Tech</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements org.xtext.casino.dsl.dsl.System
{
  /**
   * The cached value of the '{@link #getDom() <em>Dom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDom()
   * @generated
   * @ordered
   */
  protected Domain dom;

  /**
   * The default value of the '{@link #getArch() <em>Arch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArch()
   * @generated
   * @ordered
   */
  protected static final String ARCH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArch() <em>Arch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArch()
   * @generated
   * @ordered
   */
  protected String arch = ARCH_EDEFAULT;

  /**
   * The cached value of the '{@link #getTech() <em>Tech</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTech()
   * @generated
   * @ordered
   */
  protected Technology tech;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return DslPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Domain getDom()
  {
    return dom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDom(Domain newDom, NotificationChain msgs)
  {
    Domain oldDom = dom;
    dom = newDom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__DOM, oldDom, newDom);
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
  public void setDom(Domain newDom)
  {
    if (newDom != dom)
    {
      NotificationChain msgs = null;
      if (dom != null)
        msgs = ((InternalEObject)dom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SYSTEM__DOM, null, msgs);
      if (newDom != null)
        msgs = ((InternalEObject)newDom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SYSTEM__DOM, null, msgs);
      msgs = basicSetDom(newDom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__DOM, newDom, newDom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getArch()
  {
    return arch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArch(String newArch)
  {
    String oldArch = arch;
    arch = newArch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__ARCH, oldArch, arch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Technology getTech()
  {
    return tech;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTech(Technology newTech, NotificationChain msgs)
  {
    Technology oldTech = tech;
    tech = newTech;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__TECH, oldTech, newTech);
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
  public void setTech(Technology newTech)
  {
    if (newTech != tech)
    {
      NotificationChain msgs = null;
      if (tech != null)
        msgs = ((InternalEObject)tech).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SYSTEM__TECH, null, msgs);
      if (newTech != null)
        msgs = ((InternalEObject)newTech).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SYSTEM__TECH, null, msgs);
      msgs = basicSetTech(newTech, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__TECH, newTech, newTech));
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
      case DslPackage.SYSTEM__DOM:
        return basicSetDom(null, msgs);
      case DslPackage.SYSTEM__TECH:
        return basicSetTech(null, msgs);
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
      case DslPackage.SYSTEM__DOM:
        return getDom();
      case DslPackage.SYSTEM__ARCH:
        return getArch();
      case DslPackage.SYSTEM__TECH:
        return getTech();
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
      case DslPackage.SYSTEM__DOM:
        setDom((Domain)newValue);
        return;
      case DslPackage.SYSTEM__ARCH:
        setArch((String)newValue);
        return;
      case DslPackage.SYSTEM__TECH:
        setTech((Technology)newValue);
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
      case DslPackage.SYSTEM__DOM:
        setDom((Domain)null);
        return;
      case DslPackage.SYSTEM__ARCH:
        setArch(ARCH_EDEFAULT);
        return;
      case DslPackage.SYSTEM__TECH:
        setTech((Technology)null);
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
      case DslPackage.SYSTEM__DOM:
        return dom != null;
      case DslPackage.SYSTEM__ARCH:
        return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
      case DslPackage.SYSTEM__TECH:
        return tech != null;
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
    result.append(" (arch: ");
    result.append(arch);
    result.append(')');
    return result.toString();
  }

} //SystemImpl
