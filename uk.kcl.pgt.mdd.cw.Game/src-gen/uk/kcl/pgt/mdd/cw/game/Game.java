/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.Game#getName <em>Name</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.Game#getAttrAssList <em>Attr Ass List</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.Game#getDecl <em>Decl</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.Game#getInitBlock <em>Init Block</em>}</li>
 *   <li>{@link uk.kcl.pgt.mdd.cw.game.Game#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getGame_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.kcl.pgt.mdd.cw.game.Game#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attr Ass List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Ass List</em>' containment reference.
   * @see #setAttrAssList(AttrAssList)
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getGame_AttrAssList()
   * @model containment="true"
   * @generated
   */
  AttrAssList getAttrAssList();

  /**
   * Sets the value of the '{@link uk.kcl.pgt.mdd.cw.game.Game#getAttrAssList <em>Attr Ass List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr Ass List</em>' containment reference.
   * @see #getAttrAssList()
   * @generated
   */
  void setAttrAssList(AttrAssList value);

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference list.
   * The list contents are of type {@link uk.kcl.pgt.mdd.cw.game.Decl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference list.
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getGame_Decl()
   * @model containment="true"
   * @generated
   */
  EList<Decl> getDecl();

  /**
   * Returns the value of the '<em><b>Init Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Block</em>' containment reference.
   * @see #setInitBlock(StmtBlock)
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getGame_InitBlock()
   * @model containment="true"
   * @generated
   */
  StmtBlock getInitBlock();

  /**
   * Sets the value of the '{@link uk.kcl.pgt.mdd.cw.game.Game#getInitBlock <em>Init Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Block</em>' containment reference.
   * @see #getInitBlock()
   * @generated
   */
  void setInitBlock(StmtBlock value);

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link uk.kcl.pgt.mdd.cw.game.Block}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see uk.kcl.pgt.mdd.cw.game.GamePackage#getGame_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Block> getFunctions();

} // Game
