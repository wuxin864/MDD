/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.game.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.kcl.pgt.mdd.cw.game.Expression;
import uk.kcl.pgt.mdd.cw.game.GamePackage;
import uk.kcl.pgt.mdd.cw.game.VarArray;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.impl.VarArrayImpl#getIndexExpr <em>Index Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarArrayImpl extends MinimalEObjectImpl.Container implements VarArray
{
  /**
   * The cached value of the '{@link #getIndexExpr() <em>Index Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexExpr()
   * @generated
   * @ordered
   */
  protected Expression indexExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarArrayImpl()
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
    return GamePackage.Literals.VAR_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getIndexExpr()
  {
    return indexExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexExpr(Expression newIndexExpr, NotificationChain msgs)
  {
    Expression oldIndexExpr = indexExpr;
    indexExpr = newIndexExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.VAR_ARRAY__INDEX_EXPR, oldIndexExpr, newIndexExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIndexExpr(Expression newIndexExpr)
  {
    if (newIndexExpr != indexExpr)
    {
      NotificationChain msgs = null;
      if (indexExpr != null)
        msgs = ((InternalEObject)indexExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.VAR_ARRAY__INDEX_EXPR, null, msgs);
      if (newIndexExpr != null)
        msgs = ((InternalEObject)newIndexExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.VAR_ARRAY__INDEX_EXPR, null, msgs);
      msgs = basicSetIndexExpr(newIndexExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.VAR_ARRAY__INDEX_EXPR, newIndexExpr, newIndexExpr));
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
      case GamePackage.VAR_ARRAY__INDEX_EXPR:
        return basicSetIndexExpr(null, msgs);
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
      case GamePackage.VAR_ARRAY__INDEX_EXPR:
        return getIndexExpr();
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
      case GamePackage.VAR_ARRAY__INDEX_EXPR:
        setIndexExpr((Expression)newValue);
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
      case GamePackage.VAR_ARRAY__INDEX_EXPR:
        setIndexExpr((Expression)null);
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
      case GamePackage.VAR_ARRAY__INDEX_EXPR:
        return indexExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //VarArrayImpl
