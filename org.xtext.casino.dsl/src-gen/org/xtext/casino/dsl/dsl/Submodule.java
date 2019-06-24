/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.Submodule#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.Submodule#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.Submodule#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getSubmodule()
 * @model
 * @generated
 */
public interface Submodule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getSubmodule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.Submodule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.casino.dsl.dsl.Operation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getSubmodule_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getSubmodule_Entities()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getEntities();

} // Submodule
