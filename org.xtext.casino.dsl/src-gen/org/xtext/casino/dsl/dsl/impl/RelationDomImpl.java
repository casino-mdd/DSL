/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.casino.dsl.dsl.DslPackage;
import org.xtext.casino.dsl.dsl.EntityName;
import org.xtext.casino.dsl.dsl.RelationDom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Dom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.RelationDomImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.RelationDomImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationDomImpl extends MinimalEObjectImpl.Container implements RelationDom
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EList<EntityName> source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EList<EntityName> target;

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
  public EList<EntityName> getSource()
  {
    if (source == null)
    {
      source = new EObjectContainmentEList<EntityName>(EntityName.class, this, DslPackage.RELATION_DOM__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EntityName> getTarget()
  {
    if (target == null)
    {
      target = new EObjectContainmentEList<EntityName>(EntityName.class, this, DslPackage.RELATION_DOM__TARGET);
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
      case DslPackage.RELATION_DOM__SOURCE:
        return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
      case DslPackage.RELATION_DOM__SOURCE:
        return getSource();
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
      case DslPackage.RELATION_DOM__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends EntityName>)newValue);
        return;
      case DslPackage.RELATION_DOM__TARGET:
        getTarget().clear();
        getTarget().addAll((Collection<? extends EntityName>)newValue);
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
      case DslPackage.RELATION_DOM__SOURCE:
        getSource().clear();
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
      case DslPackage.RELATION_DOM__SOURCE:
        return source != null && !source.isEmpty();
      case DslPackage.RELATION_DOM__TARGET:
        return target != null && !target.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RelationDomImpl
