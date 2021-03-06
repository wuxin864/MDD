/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.game.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.kcl.pgt.mdd.cw.game.AnimBlock;
import uk.kcl.pgt.mdd.cw.game.GamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anim Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.impl.AnimBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.impl.AnimBlockImpl#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.impl.AnimBlockImpl#getObjName <em>Obj Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnimBlockImpl extends BlockImpl implements AnimBlock
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
   * The default value of the '{@link #getObjType() <em>Obj Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjType()
   * @generated
   * @ordered
   */
  protected static final String OBJ_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjType() <em>Obj Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjType()
   * @generated
   * @ordered
   */
  protected String objType = OBJ_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getObjName() <em>Obj Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjName()
   * @generated
   * @ordered
   */
  protected static final String OBJ_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjName() <em>Obj Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjName()
   * @generated
   * @ordered
   */
  protected String objName = OBJ_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnimBlockImpl()
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
    return GamePackage.Literals.ANIM_BLOCK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ANIM_BLOCK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getObjType()
  {
    return objType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjType(String newObjType)
  {
    String oldObjType = objType;
    objType = newObjType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ANIM_BLOCK__OBJ_TYPE, oldObjType, objType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getObjName()
  {
    return objName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjName(String newObjName)
  {
    String oldObjName = objName;
    objName = newObjName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ANIM_BLOCK__OBJ_NAME, oldObjName, objName));
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
      case GamePackage.ANIM_BLOCK__NAME:
        return getName();
      case GamePackage.ANIM_BLOCK__OBJ_TYPE:
        return getObjType();
      case GamePackage.ANIM_BLOCK__OBJ_NAME:
        return getObjName();
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
      case GamePackage.ANIM_BLOCK__NAME:
        setName((String)newValue);
        return;
      case GamePackage.ANIM_BLOCK__OBJ_TYPE:
        setObjType((String)newValue);
        return;
      case GamePackage.ANIM_BLOCK__OBJ_NAME:
        setObjName((String)newValue);
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
      case GamePackage.ANIM_BLOCK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GamePackage.ANIM_BLOCK__OBJ_TYPE:
        setObjType(OBJ_TYPE_EDEFAULT);
        return;
      case GamePackage.ANIM_BLOCK__OBJ_NAME:
        setObjName(OBJ_NAME_EDEFAULT);
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
      case GamePackage.ANIM_BLOCK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GamePackage.ANIM_BLOCK__OBJ_TYPE:
        return OBJ_TYPE_EDEFAULT == null ? objType != null : !OBJ_TYPE_EDEFAULT.equals(objType);
      case GamePackage.ANIM_BLOCK__OBJ_NAME:
        return OBJ_NAME_EDEFAULT == null ? objName != null : !OBJ_NAME_EDEFAULT.equals(objName);
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
    result.append(", objType: ");
    result.append(objType);
    result.append(", objName: ");
    result.append(objName);
    result.append(')');
    return result.toString();
  }

} //AnimBlockImpl
