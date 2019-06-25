/**
 * generated by Xtext 2.18.0
 */
package org.xtext.casino.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.Directory#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.Directory#getFile <em>File</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.Directory#getSubdirectory <em>Subdirectory</em>}</li>
 * </ul>
 *
 * @see org.xtext.casino.dsl.dsl.DslPackage#getDirectory()
 * @model
 * @generated
 */
public interface Directory extends AbstractFrontElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getDirectory_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.Directory#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>File</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' reference.
   * @see #setFile(File)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getDirectory_File()
   * @model
   * @generated
   */
  File getFile();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.Directory#getFile <em>File</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' reference.
   * @see #getFile()
   * @generated
   */
  void setFile(File value);

  /**
   * Returns the value of the '<em><b>Subdirectory</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subdirectory</em>' reference.
   * @see #setSubdirectory(Directory)
   * @see org.xtext.casino.dsl.dsl.DslPackage#getDirectory_Subdirectory()
   * @model
   * @generated
   */
  Directory getSubdirectory();

  /**
   * Sets the value of the '{@link org.xtext.casino.dsl.dsl.Directory#getSubdirectory <em>Subdirectory</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subdirectory</em>' reference.
   * @see #getSubdirectory()
   * @generated
   */
  void setSubdirectory(Directory value);

} // Directory
