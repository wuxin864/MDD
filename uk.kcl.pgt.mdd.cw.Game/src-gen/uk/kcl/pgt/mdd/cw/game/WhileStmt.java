/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.WhileStmt#getWhileCondition <em>While Condition</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.WhileStmt#getStmtBlock <em>Stmt Block</em>}</li>
 * </ul>
 *
 * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getWhileStmt()
 * @model
 * @generated
 */
public interface WhileStmt extends Stmt
{
  /**
   * Returns the value of the '<em><b>While Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Condition</em>' containment reference.
   * @see #setWhileCondition(Expression)
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getWhileStmt_WhileCondition()
   * @model containment="true"
   * @generated
   */
  Expression getWhileCondition();

  /**
   * Sets the value of the '{@link uk.kcl.pgt.mdd.cw.game.WhileStmt#getWhileCondition <em>While Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Condition</em>' containment reference.
   * @see #getWhileCondition()
   * @generated
   */
  void setWhileCondition(Expression value);

  /**
   * Returns the value of the '<em><b>Stmt Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt Block</em>' containment reference.
   * @see #setStmtBlock(StmtBlock)
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getWhileStmt_StmtBlock()
   * @model containment="true"
   * @generated
   */
  StmtBlock getStmtBlock();

  /**
   * Sets the value of the '{@link uk.kcl.pgt.mdd.cw.game.WhileStmt#getStmtBlock <em>Stmt Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt Block</em>' containment reference.
   * @see #getStmtBlock()
   * @generated
   */
  void setStmtBlock(StmtBlock value);

} // WhileStmt