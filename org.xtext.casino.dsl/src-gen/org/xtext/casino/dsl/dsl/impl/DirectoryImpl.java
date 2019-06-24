/**
 * generated by Xtext 2.17.0
 */
package org.xtext.casino.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.casino.dsl.dsl.Directory;
import org.xtext.casino.dsl.dsl.DslPackage;
import org.xtext.casino.dsl.dsl.File;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.DirectoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.DirectoryImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.DirectoryImpl#getSubdirectory <em>Subdirectory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectoryImpl extends AbstractFrontElementImpl implements Directory
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFile() <em>File</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected File file;

  /**
   * The cached value of the '{@link #getSubdirectory() <em>Subdirectory</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubdirectory()
   * @generated
   * @ordered
   */
  protected Directory subdirectory;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.DIRECTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DIRECTORY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public File getFile()
  {
    if (file != null && file.eIsProxy())
    {
      InternalEObject oldFile = (InternalEObject)file;
      file = (File)eResolveProxy(oldFile);
      if (file != oldFile)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.DIRECTORY__FILE, oldFile, file));
      }
    }
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File basicGetFile()
  {
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFile(File newFile)
  {
    File oldFile = file;
    file = newFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DIRECTORY__FILE, oldFile, file));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Directory getSubdirectory()
  {
    if (subdirectory != null && subdirectory.eIsProxy())
    {
      InternalEObject oldSubdirectory = (InternalEObject)subdirectory;
      subdirectory = (Directory)eResolveProxy(oldSubdirectory);
      if (subdirectory != oldSubdirectory)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.DIRECTORY__SUBDIRECTORY, oldSubdirectory, subdirectory));
      }
    }
    return subdirectory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directory basicGetSubdirectory()
  {
    return subdirectory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSubdirectory(Directory newSubdirectory)
  {
    Directory oldSubdirectory = subdirectory;
    subdirectory = newSubdirectory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DIRECTORY__SUBDIRECTORY, oldSubdirectory, subdirectory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.DIRECTORY__NAME:
        return getName();
      case DslPackage.DIRECTORY__FILE:
        if (resolve) return getFile();
        return basicGetFile();
      case DslPackage.DIRECTORY__SUBDIRECTORY:
        if (resolve) return getSubdirectory();
        return basicGetSubdirectory();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.DIRECTORY__NAME:
        setName((String)newValue);
        return;
      case DslPackage.DIRECTORY__FILE:
        setFile((File)newValue);
        return;
      case DslPackage.DIRECTORY__SUBDIRECTORY:
        setSubdirectory((Directory)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.DIRECTORY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.DIRECTORY__FILE:
        setFile((File)null);
        return;
      case DslPackage.DIRECTORY__SUBDIRECTORY:
        setSubdirectory((Directory)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.DIRECTORY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.DIRECTORY__FILE:
        return file != null;
      case DslPackage.DIRECTORY__SUBDIRECTORY:
        return subdirectory != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DirectoryImpl
