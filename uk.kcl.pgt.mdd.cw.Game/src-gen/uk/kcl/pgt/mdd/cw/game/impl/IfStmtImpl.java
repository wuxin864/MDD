/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.game.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.kcl.pgt.mdd.cw.game.Expression;
import uk.kcl.pgt.mdd.cw.game.GamePackage;
import uk.kcl.pgt.mdd.cw.game.IfStmt;
import uk.kcl.pgt.mdd.cw.game.StmtBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.impl.IfStmtImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.impl.IfStmtImpl#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.impl.IfStmtImpl#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStmtImpl extends StmtImpl implements IfStmt
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsequence()
   * @generated
   * @ordered
   */
  protected StmtBlock consequence;

  /**
   * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternative()
   * @generated
   * @ordered
   */
  protected StmtBlock alternative;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStmtImpl()
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
    return GamePackage.Literals.IF_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.IF_STMT__CONDITION, oldCondition, newCondition);
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
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.IF_STMT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.IF_STMT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IF_STMT__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StmtBlock getConsequence()
  {
    return consequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConsequence(StmtBlock newConsequence, NotificationChain msgs)
  {
    StmtBlock oldConsequence = consequence;
    consequence = newConsequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.IF_STMT__CONSEQUENCE, oldConsequence, newConsequence);
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
  public void setConsequence(StmtBlock newConsequence)
  {
    if (newConsequence != consequence)
    {
      NotificationChain msgs = null;
      if (consequence != null)
        msgs = ((InternalEObject)consequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.IF_STMT__CONSEQUENCE, null, msgs);
      if (newConsequence != null)
        msgs = ((InternalEObject)newConsequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.IF_STMT__CONSEQUENCE, null, msgs);
      msgs = basicSetConsequence(newConsequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IF_STMT__CONSEQUENCE, newConsequence, newConsequence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StmtBlock getAlternative()
  {
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlternative(StmtBlock newAlternative, NotificationChain msgs)
  {
    StmtBlock oldAlternative = alternative;
    alternative = newAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.IF_STMT__ALTERNATIVE, oldAlternative, newAlternative);
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
  public void setAlternative(StmtBlock newAlternative)
  {
    if (newAlternative != alternative)
    {
      NotificationChain msgs = null;
      if (alternative != null)
        msgs = ((InternalEObject)alternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.IF_STMT__ALTERNATIVE, null, msgs);
      if (newAlternative != null)
        msgs = ((InternalEObject)newAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.IF_STMT__ALTERNATIVE, null, msgs);
      msgs = basicSetAlternative(newAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IF_STMT__ALTERNATIVE, newAlternative, newAlternative));
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
      case GamePackage.IF_STMT__CONDITION:
        return basicSetCondition(null, msgs);
      case GamePackage.IF_STMT__CONSEQUENCE:
        return basicSetConsequence(null, msgs);
      case GamePackage.IF_STMT__ALTERNATIVE:
        return basicSetAlternative(null, msgs);
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
      case GamePackage.IF_STMT__CONDITION:
        return getCondition();
      case GamePackage.IF_STMT__CONSEQUENCE:
        return getConsequence();
      case GamePackage.IF_STMT__ALTERNATIVE:
        return getAlternative();
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
      case GamePackage.IF_STMT__CONDITION:
        setCondition((Expression)newValue);
        return;
      case GamePackage.IF_STMT__CONSEQUENCE:
        setConsequence((StmtBlock)newValue);
        return;
      case GamePackage.IF_STMT__ALTERNATIVE:
        setAlternative((StmtBlock)newValue);
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
      case GamePackage.IF_STMT__CONDITION:
        setCondition((Expression)null);
        return;
      case GamePackage.IF_STMT__CONSEQUENCE:
        setConsequence((StmtBlock)null);
        return;
      case GamePackage.IF_STMT__ALTERNATIVE:
        setAlternative((StmtBlock)null);
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
      case GamePackage.IF_STMT__CONDITION:
        return condition != null;
      case GamePackage.IF_STMT__CONSEQUENCE:
        return consequence != null;
      case GamePackage.IF_STMT__ALTERNATIVE:
        return alternative != null;
    }
    return super.eIsSet(featureID);
  }

} //IfStmtImpl
