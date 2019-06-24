/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.casino.dsl.dsl.Action;
import org.xtext.casino.dsl.dsl.ActionCreator;
import org.xtext.casino.dsl.dsl.ActionDispatcher;
import org.xtext.casino.dsl.dsl.Directory;
import org.xtext.casino.dsl.dsl.DslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ActionImpl#getActionCreator <em>Action Creator</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ActionImpl#getActionDispatcher <em>Action Dispatcher</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ActionImpl#getDir <em>Dir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends AbstractFrontElementImpl implements Action
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
   * The cached value of the '{@link #getActionCreator() <em>Action Creator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionCreator()
   * @generated
   * @ordered
   */
  protected ActionCreator actionCreator;

  /**
   * The cached value of the '{@link #getActionDispatcher() <em>Action Dispatcher</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionDispatcher()
   * @generated
   * @ordered
   */
  protected ActionDispatcher actionDispatcher;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return DslPackage.Literals.ACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionCreator getActionCreator()
  {
    if (actionCreator != null && actionCreator.eIsProxy())
    {
      InternalEObject oldActionCreator = (InternalEObject)actionCreator;
      actionCreator = (ActionCreator)eResolveProxy(oldActionCreator);
      if (actionCreator != oldActionCreator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.ACTION__ACTION_CREATOR, oldActionCreator, actionCreator));
      }
    }
    return actionCreator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionCreator basicGetActionCreator()
  {
    return actionCreator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActionCreator(ActionCreator newActionCreator)
  {
    ActionCreator oldActionCreator = actionCreator;
    actionCreator = newActionCreator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ACTION__ACTION_CREATOR, oldActionCreator, actionCreator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionDispatcher getActionDispatcher()
  {
    if (actionDispatcher != null && actionDispatcher.eIsProxy())
    {
      InternalEObject oldActionDispatcher = (InternalEObject)actionDispatcher;
      actionDispatcher = (ActionDispatcher)eResolveProxy(oldActionDispatcher);
      if (actionDispatcher != oldActionDispatcher)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.ACTION__ACTION_DISPATCHER, oldActionDispatcher, actionDispatcher));
      }
    }
    return actionDispatcher;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDispatcher basicGetActionDispatcher()
  {
    return actionDispatcher;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActionDispatcher(ActionDispatcher newActionDispatcher)
  {
    ActionDispatcher oldActionDispatcher = actionDispatcher;
    actionDispatcher = newActionDispatcher;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ACTION__ACTION_DISPATCHER, oldActionDispatcher, actionDispatcher));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.ACTION__DIR, oldDir, dir));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ACTION__DIR, oldDir, dir));
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
      case DslPackage.ACTION__NAME:
        return getName();
      case DslPackage.ACTION__ACTION_CREATOR:
        if (resolve) return getActionCreator();
        return basicGetActionCreator();
      case DslPackage.ACTION__ACTION_DISPATCHER:
        if (resolve) return getActionDispatcher();
        return basicGetActionDispatcher();
      case DslPackage.ACTION__DIR:
        if (resolve) return getDir();
        return basicGetDir();
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
      case DslPackage.ACTION__NAME:
        setName((String)newValue);
        return;
      case DslPackage.ACTION__ACTION_CREATOR:
        setActionCreator((ActionCreator)newValue);
        return;
      case DslPackage.ACTION__ACTION_DISPATCHER:
        setActionDispatcher((ActionDispatcher)newValue);
        return;
      case DslPackage.ACTION__DIR:
        setDir((Directory)newValue);
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
      case DslPackage.ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.ACTION__ACTION_CREATOR:
        setActionCreator((ActionCreator)null);
        return;
      case DslPackage.ACTION__ACTION_DISPATCHER:
        setActionDispatcher((ActionDispatcher)null);
        return;
      case DslPackage.ACTION__DIR:
        setDir((Directory)null);
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
      case DslPackage.ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.ACTION__ACTION_CREATOR:
        return actionCreator != null;
      case DslPackage.ACTION__ACTION_DISPATCHER:
        return actionDispatcher != null;
      case DslPackage.ACTION__DIR:
        return dir != null;
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

} //ActionImpl
