/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.VarDecl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getVarDecl()
 * @model
 * @generated
 */
public interface VarDecl extends Decl
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getVarDecl_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link uk.kcl.pgt.mdd.cw.game.VarDecl#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // VarDecl
