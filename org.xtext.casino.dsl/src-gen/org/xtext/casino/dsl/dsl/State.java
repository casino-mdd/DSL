/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.State#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.State#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.State#getReducer <em>Reducer</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getState()
 * @model
 * @generated
 */
public interface State extends AbstractFrontElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getState_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.State#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Reducer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reducer</em>' reference.
   * @see #setReducer(Reducer)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getState_Reducer()
   * @model
   * @generated
   */
  Reducer getReducer();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.State#getReducer <em>Reducer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reducer</em>' reference.
   * @see #getReducer()
   * @generated
   */
  void setReducer(Reducer value);

} // State
