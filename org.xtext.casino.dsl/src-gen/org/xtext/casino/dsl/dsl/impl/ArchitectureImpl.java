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

import org.xtext.casino.dsl.dsl.Architecture;
import org.xtext.casino.dsl.dsl.Component;
import org.xtext.casino.dsl.dsl.DslPackage;
import org.xtext.casino.dsl.dsl.RelationArch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ArchitectureImpl#getComponentes <em>Componentes</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.ArchitectureImpl#getRelationArch <em>Relation Arch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureImpl extends MinimalEObjectImpl.Container implements Architecture
{
  /**
   * The cached value of the '{@link #getComponentes() <em>Componentes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentes()
   * @generated
   * @ordered
   */
  protected EList<Component> componentes;

  /**
   * The cached value of the '{@link #getRelationArch() <em>Relation Arch</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationArch()
   * @generated
   * @ordered
   */
  protected EList<RelationArch> relationArch;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchitectureImpl()
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
    return DslPackage.Literals.ARCHITECTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Component> getComponentes()
  {
    if (componentes == null)
    {
      componentes = new EObjectContainmentEList<Component>(Component.class, this, DslPackage.ARCHITECTURE__COMPONENTES);
    }
    return componentes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RelationArch> getRelationArch()
  {
    if (relationArch == null)
    {
      relationArch = new EObjectContainmentEList<RelationArch>(RelationArch.class, this, DslPackage.ARCHITECTURE__RELATION_ARCH);
    }
    return relationArch;
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
      case DslPackage.ARCHITECTURE__COMPONENTES:
        return ((InternalEList<?>)getComponentes()).basicRemove(otherEnd, msgs);
      case DslPackage.ARCHITECTURE__RELATION_ARCH:
        return ((InternalEList<?>)getRelationArch()).basicRemove(otherEnd, msgs);
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
      case DslPackage.ARCHITECTURE__COMPONENTES:
        return getComponentes();
      case DslPackage.ARCHITECTURE__RELATION_ARCH:
        return getRelationArch();
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
      case DslPackage.ARCHITECTURE__COMPONENTES:
        getComponentes().clear();
        getComponentes().addAll((Collection<? extends Component>)newValue);
        return;
      case DslPackage.ARCHITECTURE__RELATION_ARCH:
        getRelationArch().clear();
        getRelationArch().addAll((Collection<? extends RelationArch>)newValue);
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
      case DslPackage.ARCHITECTURE__COMPONENTES:
        getComponentes().clear();
        return;
      case DslPackage.ARCHITECTURE__RELATION_ARCH:
        getRelationArch().clear();
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
      case DslPackage.ARCHITECTURE__COMPONENTES:
        return componentes != null && !componentes.isEmpty();
      case DslPackage.ARCHITECTURE__RELATION_ARCH:
        return relationArch != null && !relationArch.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArchitectureImpl