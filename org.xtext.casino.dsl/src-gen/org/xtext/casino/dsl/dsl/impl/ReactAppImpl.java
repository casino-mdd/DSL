/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.casino.dsl.dsl.AbstractFrontElement;
import org.xtext.casino.dsl.dsl.Directory;
import org.xtext.casino.dsl.dsl.DslPackage;
import org.xtext.casino.dsl.dsl.Functionality;
import org.xtext.casino.dsl.dsl.JsModule;
import org.xtext.casino.dsl.dsl.ReactApp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>React App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ReactAppImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ReactAppImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ReactAppImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ReactAppImpl#getMod <em>Mod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactAppImpl extends AbstractFrontElementImpl implements ReactApp
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractFrontElement> elements;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected Functionality func;

  /**
   * The cached value of the '{@link #getDir() <em>Dir</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDir()
   * @generated
   * @ordered
   */
  protected Directory dir;

  /**
   * The cached value of the '{@link #getMod() <em>Mod</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected JsModule mod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactAppImpl()
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
    return DslPackage.Literals.REACT_APP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractFrontElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<AbstractFrontElement>(AbstractFrontElement.class, this, DslPackage.REACT_APP__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Functionality getFunc()
  {
    if (func != null && func.eIsProxy())
    {
      InternalEObject oldFunc = (InternalEObject)func;
      func = (Functionality)eResolveProxy(oldFunc);
      if (func != oldFunc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.REACT_APP__FUNC, oldFunc, func));
      }
    }
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functionality basicGetFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunc(Functionality newFunc)
  {
    Functionality oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.REACT_APP__FUNC, oldFunc, func));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Directory getDir()
  {
    if (dir != null && dir.eIsProxy())
    {
      InternalEObject oldDir = (InternalEObject)dir;
      dir = (Directory)eResolveProxy(oldDir);
      if (dir != oldDir)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.REACT_APP__DIR, oldDir, dir));
      }
    }
    return dir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directory basicGetDir()
  {
    return dir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDir(Directory newDir)
  {
    Directory oldDir = dir;
    dir = newDir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.REACT_APP__DIR, oldDir, dir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsModule getMod()
  {
    if (mod != null && mod.eIsProxy())
    {
      InternalEObject oldMod = (InternalEObject)mod;
      mod = (JsModule)eResolveProxy(oldMod);
      if (mod != oldMod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.REACT_APP__MOD, oldMod, mod));
      }
    }
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsModule basicGetMod()
  {
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMod(JsModule newMod)
  {
    JsModule oldMod = mod;
    mod = newMod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.REACT_APP__MOD, oldMod, mod));
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
      case DslPackage.REACT_APP__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case DslPackage.REACT_APP__ELEMENTS:
        return getElements();
      case DslPackage.REACT_APP__FUNC:
        if (resolve) return getFunc();
        return basicGetFunc();
      case DslPackage.REACT_APP__DIR:
        if (resolve) return getDir();
        return basicGetDir();
      case DslPackage.REACT_APP__MOD:
        if (resolve) return getMod();
        return basicGetMod();
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
      case DslPackage.REACT_APP__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends AbstractFrontElement>)newValue);
        return;
      case DslPackage.REACT_APP__FUNC:
        setFunc((Functionality)newValue);
        return;
      case DslPackage.REACT_APP__DIR:
        setDir((Directory)newValue);
        return;
      case DslPackage.REACT_APP__MOD:
        setMod((JsModule)newValue);
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
      case DslPackage.REACT_APP__ELEMENTS:
        getElements().clear();
        return;
      case DslPackage.REACT_APP__FUNC:
        setFunc((Functionality)null);
        return;
      case DslPackage.REACT_APP__DIR:
        setDir((Directory)null);
        return;
      case DslPackage.REACT_APP__MOD:
        setMod((JsModule)null);
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
      case DslPackage.REACT_APP__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case DslPackage.REACT_APP__FUNC:
        return func != null;
      case DslPackage.REACT_APP__DIR:
        return dir != null;
      case DslPackage.REACT_APP__MOD:
        return mod != null;
    }
    return super.eIsSet(featureID);
  }

} //ReactAppImpl
