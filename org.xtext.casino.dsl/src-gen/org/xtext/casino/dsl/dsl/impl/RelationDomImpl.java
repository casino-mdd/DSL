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

import org.xtext.casino.dsl.dsl.DslPackage;
import org.xtext.casino.dsl.dsl.Entity;
import org.xtext.casino.dsl.dsl.GeneralEntity;
import org.xtext.casino.dsl.dsl.RelationDom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Dom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.RelationDomImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.RelationDomImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationDomImpl extends AbstractElementImpl implements RelationDom
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected GeneralEntity type;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EList<Entity> target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationDomImpl()
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
    return DslPackage.Literals.RELATION_DOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneralEntity getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (GeneralEntity)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.RELATION_DOM__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralEntity basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(GeneralEntity newType)
  {
    GeneralEntity oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.RELATION_DOM__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Entity> getTarget()
  {
    if (target == null)
    {
      target = new EObjectContainmentEList<Entity>(Entity.class, this, DslPackage.RELATION_DOM__TARGET);
    }
    return target;
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
      case DslPackage.RELATION_DOM__TARGET:
        return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
      case DslPackage.RELATION_DOM__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DslPackage.RELATION_DOM__TARGET:
        return getTarget();
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
      case DslPackage.RELATION_DOM__TYPE:
        setType((GeneralEntity)newValue);
        return;
      case DslPackage.RELATION_DOM__TARGET:
        getTarget().clear();
        getTarget().addAll((Collection<? extends Entity>)newValue);
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
      case DslPackage.RELATION_DOM__TYPE:
        setType((GeneralEntity)null);
        return;
      case DslPackage.RELATION_DOM__TARGET:
        getTarget().clear();
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
      case DslPackage.RELATION_DOM__TYPE:
        return type != null;
      case DslPackage.RELATION_DOM__TARGET:
        return target != null && !target.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RelationDomImpl
