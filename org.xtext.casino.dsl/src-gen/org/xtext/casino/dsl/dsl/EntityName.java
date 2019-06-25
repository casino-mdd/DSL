/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.EntityName#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.EntityName#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.EntityName#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getEntityName()
 * @model
 * @generated
 */
public interface EntityName extends GeneralEntity, SpecialEntity
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getEntityName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.EntityName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.casino.dsl.dsl.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getEntityName_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.casino.dsl.dsl.Transaction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transactions</em>' containment reference list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getEntityName_Transactions()
   * @model containment="true"
   * @generated
   */
  EList<Transaction> getTransactions();

} // EntityName
