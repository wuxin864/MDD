/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.UnaryOperation#getOp <em>Op</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.UnaryOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getUnaryOperation()
 * @model
 * @generated
 */
public interface UnaryOperation extends Expression
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getUnaryOperation_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link uk.kcl.pgt.mdd.cw.game.UnaryOperation#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getUnaryOperation_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link uk.kcl.pgt.mdd.cw.game.UnaryOperation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // UnaryOperation
