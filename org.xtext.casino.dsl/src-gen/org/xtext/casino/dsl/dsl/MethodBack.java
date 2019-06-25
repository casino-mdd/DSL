/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Back</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.MethodBack#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.MethodBack#getArg <em>Arg</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.MethodBack#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getMethodBack()
 * @model
 * @generated
 */
public interface MethodBack extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getMethodBack_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.MethodBack#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' reference.
   * @see #setArg(Eclass)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getMethodBack_Arg()
   * @model
   * @generated
   */
  Eclass getArg();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.MethodBack#getArg <em>Arg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' reference.
   * @see #getArg()
   * @generated
   */
  void setArg(Eclass value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Eclass)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getMethodBack_Type()
   * @model
   * @generated
   */
  Eclass getType();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.MethodBack#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Eclass value);

} // MethodBack
