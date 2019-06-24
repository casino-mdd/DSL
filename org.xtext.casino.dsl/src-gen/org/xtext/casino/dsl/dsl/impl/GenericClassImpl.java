/**
 * generated by Xtext 2.17.0
 */
package org.xtext.casino.dsl.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.casino.dsl.dsl.AbstractClass;
import org.xtext.casino.dsl.dsl.Annotation;
import org.xtext.casino.dsl.dsl.Attribute;
import org.xtext.casino.dsl.dsl.DslPackage;
import org.xtext.casino.dsl.dsl.Einterface;
import org.xtext.casino.dsl.dsl.GenericClass;
import org.xtext.casino.dsl.dsl.MethodBack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.GenericClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.GenericClassImpl#getMethodClass <em>Method Class</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.GenericClassImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.GenericClassImpl#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.xtext.casino.dsl.dsl.impl.GenericClassImpl#getImp <em>Imp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericClassImpl extends EclassImpl implements GenericClass
{
  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attribute;

  /**
   * The cached value of the '{@link #getMethodClass() <em>Method Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodClass()
   * @generated
   * @ordered
   */
  protected EList<MethodBack> methodClass;

  /**
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected Annotation annotation;

  /**
   * The cached value of the '{@link #getAbs() <em>Abs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbs()
   * @generated
   * @ordered
   */
  protected AbstractClass abs;

  /**
   * The cached value of the '{@link #getImp() <em>Imp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImp()
   * @generated
   * @ordered
   */
  protected Einterface imp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericClassImpl()
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
    return DslPackage.Literals.GENERIC_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Attribute> getAttribute()
  {
    if (attribute == null)
    {
      attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, DslPackage.GENERIC_CLASS__ATTRIBUTE);
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MethodBack> getMethodClass()
  {
    if (methodClass == null)
    {
      methodClass = new EObjectContainmentEList<MethodBack>(MethodBack.class, this, DslPackage.GENERIC_CLASS__METHOD_CLASS);
    }
    return methodClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Annotation getAnnotation()
  {
    if (annotation != null && annotation.eIsProxy())
    {
      InternalEObject oldAnnotation = (InternalEObject)annotation;
      annotation = (Annotation)eResolveProxy(oldAnnotation);
      if (annotation != oldAnnotation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.GENERIC_CLASS__ANNOTATION, oldAnnotation, annotation));
      }
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation basicGetAnnotation()
  {
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAnnotation(Annotation newAnnotation)
  {
    Annotation oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.GENERIC_CLASS__ANNOTATION, oldAnnotation, annotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractClass getAbs()
  {
    if (abs != null && abs.eIsProxy())
    {
      InternalEObject oldAbs = (InternalEObject)abs;
      abs = (AbstractClass)eResolveProxy(oldAbs);
      if (abs != oldAbs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.GENERIC_CLASS__ABS, oldAbs, abs));
      }
    }
    return abs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractClass basicGetAbs()
  {
    return abs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAbs(AbstractClass newAbs)
  {
    AbstractClass oldAbs = abs;
    abs = newAbs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.GENERIC_CLASS__ABS, oldAbs, abs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Einterface getImp()
  {
    if (imp != null && imp.eIsProxy())
    {
      InternalEObject oldImp = (InternalEObject)imp;
      imp = (Einterface)eResolveProxy(oldImp);
      if (imp != oldImp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.GENERIC_CLASS__IMP, oldImp, imp));
      }
    }
    return imp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Einterface basicGetImp()
  {
    return imp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImp(Einterface newImp)
  {
    Einterface oldImp = imp;
    imp = newImp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.GENERIC_CLASS__IMP, oldImp, imp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslPackage.GENERIC_CLASS__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
      case DslPackage.GENERIC_CLASS__METHOD_CLASS:
        return ((InternalEList<?>)getMethodClass()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DslPackage.GENERIC_CLASS__ATTRIBUTE:
        return getAttribute();
      case DslPackage.GENERIC_CLASS__METHOD_CLASS:
        return getMethodClass();
      case DslPackage.GENERIC_CLASS__ANNOTATION:
        if (resolve) return getAnnotation();
        return basicGetAnnotation();
      case DslPackage.GENERIC_CLASS__ABS:
        if (resolve) return getAbs();
        return basicGetAbs();
      case DslPackage.GENERIC_CLASS__IMP:
        if (resolve) return getImp();
        return basicGetImp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.GENERIC_CLASS__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends Attribute>)newValue);
        return;
      case DslPackage.GENERIC_CLASS__METHOD_CLASS:
        getMethodClass().clear();
        getMethodClass().addAll((Collection<? extends MethodBack>)newValue);
        return;
      case DslPackage.GENERIC_CLASS__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case DslPackage.GENERIC_CLASS__ABS:
        setAbs((AbstractClass)newValue);
        return;
      case DslPackage.GENERIC_CLASS__IMP:
        setImp((Einterface)newValue);
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
      case DslPackage.GENERIC_CLASS__ATTRIBUTE:
        getAttribute().clear();
        return;
      case DslPackage.GENERIC_CLASS__METHOD_CLASS:
        getMethodClass().clear();
        return;
      case DslPackage.GENERIC_CLASS__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case DslPackage.GENERIC_CLASS__ABS:
        setAbs((AbstractClass)null);
        return;
      case DslPackage.GENERIC_CLASS__IMP:
        setImp((Einterface)null);
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
      case DslPackage.GENERIC_CLASS__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
      case DslPackage.GENERIC_CLASS__METHOD_CLASS:
        return methodClass != null && !methodClass.isEmpty();
      case DslPackage.GENERIC_CLASS__ANNOTATION:
        return annotation != null;
      case DslPackage.GENERIC_CLASS__ABS:
        return abs != null;
      case DslPackage.GENERIC_CLASS__IMP:
        return imp != null;
    }
    return super.eIsSet(featureID);
  }

} //GenericClassImpl
