/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.JavaApp#getJeeproject <em>Jeeproject</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getJavaApp()
 * @model
 * @generated
 */
public interface JavaApp extends EObject
{
  /**
   * Returns the value of the '<em><b>Jeeproject</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.casino.dsl.dsl.JeeProject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jeeproject</em>' containment reference list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getJavaApp_Jeeproject()
   * @model containment="true"
   * @generated
   */
  EList<JeeProject> getJeeproject();

} // JavaApp
