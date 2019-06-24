/**
 * generated by Xtext 2.17.0
 */
package org.xtext.casino.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.LayerSegment#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.LayerSegment#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.LayerSegment#getSublayerSegments <em>Sublayer Segments</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getLayerSegment()
 * @model
 * @generated
 */
public interface LayerSegment extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getLayerSegment_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.LayerSegment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Relations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' attribute list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getLayerSegment_Relations()
   * @model unique="false"
   * @generated
   */
  EList<String> getRelations();

  /**
   * Returns the value of the '<em><b>Sublayer Segments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.casino.dsl.dsl.SublayerSegment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sublayer Segments</em>' containment reference list.
   * @see org.xtext.casino.dsl.dsl.DslPackage#getLayerSegment_SublayerSegments()
   * @model containment="true"
   * @generated
   */
  EList<SublayerSegment> getSublayerSegments();

} // LayerSegment
