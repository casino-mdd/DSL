/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.ReactApp#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.ReactApp#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.ReactApp#getDir <em>Dir</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.ReactApp#getMod <em>Mod</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getReactApp()
 * @model
 * @generated
 */
public interface ReactApp extends AbstractFrontElement
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.casino.dsl.dsl.AbstractFrontElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getReactApp_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractFrontElement> getElements();

  /**
   * Returns the value of the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' reference.
   * @see #setFunc(Functionality)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getReactApp_Func()
   * @model
   * @generated
   */
  Functionality getFunc();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.ReactApp#getFunc <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(Functionality value);

  /**
   * Returns the value of the '<em><b>Dir</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dir</em>' reference.
   * @see #setDir(Directory)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getReactApp_Dir()
   * @model
   * @generated
   */
  Directory getDir();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.ReactApp#getDir <em>Dir</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dir</em>' reference.
   * @see #getDir()
   * @generated
   */
  void setDir(Directory value);

  /**
   * Returns the value of the '<em><b>Mod</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' reference.
   * @see #setMod(JsModule)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getReactApp_Mod()
   * @model
   * @generated
   */
  JsModule getMod();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.ReactApp#getMod <em>Mod</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' reference.
   * @see #getMod()
   * @generated
   */
  void setMod(JsModule value);

} // ReactApp
