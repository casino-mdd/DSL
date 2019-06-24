/**
 * generated by Xtext 2.17.0
 */
package org.xtext.casino.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.Layer#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.Layer#getLayerSegments <em>Layer Segments</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getLayer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.Layer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Layer Segments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.casino.dsl.dsl.LayerSegment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer Segments</em>' containment reference list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getLayer_LayerSegments()
   * @model containment="true"
   * @generated
   */
  EList<LayerSegment> getLayerSegments();

} // Layer
