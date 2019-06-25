/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Front</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.ServiceFront#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.ServiceFront#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getServiceFront()
 * @model
 * @generated
 */
public interface ServiceFront extends AbstractFrontElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getServiceFront_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.ServiceFront#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(JsModule)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getServiceFront_Type()
   * @model
   * @generated
   */
  JsModule getType();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.ServiceFront#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(JsModule value);

} // ServiceFront
