/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.Transaction#getOperateson <em>Operateson</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Operateson</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.casino.dsl.dsl.Operateson}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operateson</em>' containment reference list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getTransaction_Operateson()
   * @model containment="true"
   * @generated
   */
  EList<Operateson> getOperateson();

} // Transaction
