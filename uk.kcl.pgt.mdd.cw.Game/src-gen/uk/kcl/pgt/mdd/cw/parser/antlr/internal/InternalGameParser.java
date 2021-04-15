package uk.kcl.pgt.mdd.cw.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.kcl.pgt.mdd.cw.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_OBJTYPE", "RULE_KEYSTROKE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'('", "')'", "';'", "'int'", "'='", "'['", "']'", "','", "'{'", "'}'", "'if'", "'else'", "'while'", "'for'", "'exit'", "'.'", "'animation'", "'on'", "'||'", "'&&'", "'=='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'touches'", "'!'"
    };
    public static final int RULE_OBJTYPE=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_KEYSTROKE=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGame.g"; }



     	private GameGrammarAccess grammarAccess;

        public InternalGameParser(TokenStream input, GameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected GameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalGame.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalGame.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalGame.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGame.g:71:1: ruleGame returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )* ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attrAssList_3_0 = null;

        EObject lv_decl_5_0 = null;

        EObject lv_initBlock_6_0 = null;

        EObject lv_functions_7_0 = null;



        	enterRule();

        try {
            // InternalGame.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )* ) )
            // InternalGame.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )* )
            {
            // InternalGame.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )* )
            // InternalGame.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalGame.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftParenthesisKeyword_2());
            		
            // InternalGame.g:105:3: ( (lv_attrAssList_3_0= ruleAttrAssList ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGame.g:106:4: (lv_attrAssList_3_0= ruleAttrAssList )
                    {
                    // InternalGame.g:106:4: (lv_attrAssList_3_0= ruleAttrAssList )
                    // InternalGame.g:107:5: lv_attrAssList_3_0= ruleAttrAssList
                    {

                    					newCompositeNode(grammarAccess.getGameAccess().getAttrAssListAttrAssListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_attrAssList_3_0=ruleAttrAssList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGameRule());
                    					}
                    					set(
                    						current,
                    						"attrAssList",
                    						lv_attrAssList_3_0,
                    						"uk.kcl.pgt.mdd.cw.Game.AttrAssList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getGameAccess().getRightParenthesisKeyword_4());
            		
            // InternalGame.g:128:3: ( (lv_decl_5_0= ruleDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_OBJTYPE||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:129:4: (lv_decl_5_0= ruleDecl )
            	    {
            	    // InternalGame.g:129:4: (lv_decl_5_0= ruleDecl )
            	    // InternalGame.g:130:5: lv_decl_5_0= ruleDecl
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getDeclDeclParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_decl_5_0=ruleDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"decl",
            	    						lv_decl_5_0,
            	    						"uk.kcl.pgt.mdd.cw.Game.Decl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGame.g:147:3: ( (lv_initBlock_6_0= ruleStmtBlock ) )
            // InternalGame.g:148:4: (lv_initBlock_6_0= ruleStmtBlock )
            {
            // InternalGame.g:148:4: (lv_initBlock_6_0= ruleStmtBlock )
            // InternalGame.g:149:5: lv_initBlock_6_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getGameAccess().getInitBlockStmtBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_initBlock_6_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"initBlock",
            						lv_initBlock_6_0,
            						"uk.kcl.pgt.mdd.cw.Game.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:166:3: ( (lv_functions_7_0= ruleBlock ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=30 && LA3_0<=31)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:167:4: (lv_functions_7_0= ruleBlock )
            	    {
            	    // InternalGame.g:167:4: (lv_functions_7_0= ruleBlock )
            	    // InternalGame.g:168:5: lv_functions_7_0= ruleBlock
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getFunctionsBlockParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_functions_7_0=ruleBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_7_0,
            	    						"uk.kcl.pgt.mdd.cw.Game.Block");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleDecl"
    // InternalGame.g:189:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalGame.g:189:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalGame.g:190:2: iv_ruleDecl= ruleDecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalGame.g:196:1: ruleDecl returns [EObject current=null] : ( (this_VarDecl_0= ruleVarDecl otherlv_1= ';' ) | (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_VarDecl_0 = null;

        EObject this_ObjDecl_2 = null;



        	enterRule();

        try {
            // InternalGame.g:202:2: ( ( (this_VarDecl_0= ruleVarDecl otherlv_1= ';' ) | (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' ) ) )
            // InternalGame.g:203:2: ( (this_VarDecl_0= ruleVarDecl otherlv_1= ';' ) | (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' ) )
            {
            // InternalGame.g:203:2: ( (this_VarDecl_0= ruleVarDecl otherlv_1= ';' ) | (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_OBJTYPE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:204:3: (this_VarDecl_0= ruleVarDecl otherlv_1= ';' )
                    {
                    // InternalGame.g:204:3: (this_VarDecl_0= ruleVarDecl otherlv_1= ';' )
                    // InternalGame.g:205:4: this_VarDecl_0= ruleVarDecl otherlv_1= ';'
                    {

                    				newCompositeNode(grammarAccess.getDeclAccess().getVarDeclParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_VarDecl_0=ruleVarDecl();

                    state._fsp--;


                    				current = this_VarDecl_0;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_1=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeclAccess().getSemicolonKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:219:3: (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' )
                    {
                    // InternalGame.g:219:3: (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' )
                    // InternalGame.g:220:4: this_ObjDecl_2= ruleObjDecl otherlv_3= ';'
                    {

                    				newCompositeNode(grammarAccess.getDeclAccess().getObjDeclParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_ObjDecl_2=ruleObjDecl();

                    state._fsp--;


                    				current = this_ObjDecl_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeclAccess().getSemicolonKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalGame.g:237:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalGame.g:237:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalGame.g:238:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalGame.g:244:1: ruleVarDecl returns [EObject current=null] : ( ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) ) | ( ( (lv_type_4_0= 'int' ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '[' ( (lv_arrSize_7_0= RULE_INT ) ) otherlv_8= ']' ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_arrSize_7_0=null;
        Token otherlv_8=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:250:2: ( ( ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) ) | ( ( (lv_type_4_0= 'int' ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '[' ( (lv_arrSize_7_0= RULE_INT ) ) otherlv_8= ']' ) ) )
            // InternalGame.g:251:2: ( ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) ) | ( ( (lv_type_4_0= 'int' ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '[' ( (lv_arrSize_7_0= RULE_INT ) ) otherlv_8= ']' ) )
            {
            // InternalGame.g:251:2: ( ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) ) | ( ( (lv_type_4_0= 'int' ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '[' ( (lv_arrSize_7_0= RULE_INT ) ) otherlv_8= ']' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==19) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==18) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:252:3: ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )
                    {
                    // InternalGame.g:252:3: ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )
                    // InternalGame.g:253:4: ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) )
                    {
                    // InternalGame.g:253:4: ( (lv_type_0_0= 'int' ) )
                    // InternalGame.g:254:5: (lv_type_0_0= 'int' )
                    {
                    // InternalGame.g:254:5: (lv_type_0_0= 'int' )
                    // InternalGame.g:255:6: lv_type_0_0= 'int'
                    {
                    lv_type_0_0=(Token)match(input,17,FOLLOW_3); 

                    						newLeafNode(lv_type_0_0, grammarAccess.getVarDeclAccess().getTypeIntKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_0, "int");
                    					

                    }


                    }

                    // InternalGame.g:267:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalGame.g:268:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalGame.g:268:5: (lv_name_1_0= RULE_ID )
                    // InternalGame.g:269:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getEqualsSignKeyword_0_2());
                    			
                    // InternalGame.g:289:4: ( (lv_expr_3_0= ruleExpr ) )
                    // InternalGame.g:290:5: (lv_expr_3_0= ruleExpr )
                    {
                    // InternalGame.g:290:5: (lv_expr_3_0= ruleExpr )
                    // InternalGame.g:291:6: lv_expr_3_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getVarDeclAccess().getExprExprParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_3_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_3_0,
                    							"uk.kcl.pgt.mdd.cw.Game.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:310:3: ( ( (lv_type_4_0= 'int' ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '[' ( (lv_arrSize_7_0= RULE_INT ) ) otherlv_8= ']' )
                    {
                    // InternalGame.g:310:3: ( ( (lv_type_4_0= 'int' ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '[' ( (lv_arrSize_7_0= RULE_INT ) ) otherlv_8= ']' )
                    // InternalGame.g:311:4: ( (lv_type_4_0= 'int' ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '[' ( (lv_arrSize_7_0= RULE_INT ) ) otherlv_8= ']'
                    {
                    // InternalGame.g:311:4: ( (lv_type_4_0= 'int' ) )
                    // InternalGame.g:312:5: (lv_type_4_0= 'int' )
                    {
                    // InternalGame.g:312:5: (lv_type_4_0= 'int' )
                    // InternalGame.g:313:6: lv_type_4_0= 'int'
                    {
                    lv_type_4_0=(Token)match(input,17,FOLLOW_3); 

                    						newLeafNode(lv_type_4_0, grammarAccess.getVarDeclAccess().getTypeIntKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_4_0, "int");
                    					

                    }


                    }

                    // InternalGame.g:325:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalGame.g:326:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalGame.g:326:5: (lv_name_5_0= RULE_ID )
                    // InternalGame.g:327:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalGame.g:347:4: ( (lv_arrSize_7_0= RULE_INT ) )
                    // InternalGame.g:348:5: (lv_arrSize_7_0= RULE_INT )
                    {
                    // InternalGame.g:348:5: (lv_arrSize_7_0= RULE_INT )
                    // InternalGame.g:349:6: lv_arrSize_7_0= RULE_INT
                    {
                    lv_arrSize_7_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    						newLeafNode(lv_arrSize_7_0, grammarAccess.getVarDeclAccess().getArrSizeINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"arrSize",
                    							lv_arrSize_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleObjDecl"
    // InternalGame.g:374:1: entryRuleObjDecl returns [EObject current=null] : iv_ruleObjDecl= ruleObjDecl EOF ;
    public final EObject entryRuleObjDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjDecl = null;


        try {
            // InternalGame.g:374:48: (iv_ruleObjDecl= ruleObjDecl EOF )
            // InternalGame.g:375:2: iv_ruleObjDecl= ruleObjDecl EOF
            {
             newCompositeNode(grammarAccess.getObjDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjDecl=ruleObjDecl();

            state._fsp--;

             current =iv_ruleObjDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjDecl"


    // $ANTLR start "ruleObjDecl"
    // InternalGame.g:381:1: ruleObjDecl returns [EObject current=null] : ( ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) | ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' ) ) ;
    public final EObject ruleObjDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_arrSize_8_0=null;
        Token otherlv_9=null;
        EObject lv_attrAssList_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:387:2: ( ( ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) | ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' ) ) )
            // InternalGame.g:388:2: ( ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) | ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' ) )
            {
            // InternalGame.g:388:2: ( ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) | ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_OBJTYPE) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==19) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==14) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:389:3: ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' )
                    {
                    // InternalGame.g:389:3: ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' )
                    // InternalGame.g:390:4: ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')'
                    {
                    // InternalGame.g:390:4: ( (lv_type_0_0= RULE_OBJTYPE ) )
                    // InternalGame.g:391:5: (lv_type_0_0= RULE_OBJTYPE )
                    {
                    // InternalGame.g:391:5: (lv_type_0_0= RULE_OBJTYPE )
                    // InternalGame.g:392:6: lv_type_0_0= RULE_OBJTYPE
                    {
                    lv_type_0_0=(Token)match(input,RULE_OBJTYPE,FOLLOW_3); 

                    						newLeafNode(lv_type_0_0, grammarAccess.getObjDeclAccess().getTypeOBJTYPETerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_0_0,
                    							"uk.kcl.pgt.mdd.cw.Game.OBJTYPE");
                    					

                    }


                    }

                    // InternalGame.g:408:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalGame.g:409:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalGame.g:409:5: (lv_name_1_0= RULE_ID )
                    // InternalGame.g:410:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getObjDeclAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalGame.g:430:4: ( (lv_attrAssList_3_0= ruleAttrAssList ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalGame.g:431:5: (lv_attrAssList_3_0= ruleAttrAssList )
                            {
                            // InternalGame.g:431:5: (lv_attrAssList_3_0= ruleAttrAssList )
                            // InternalGame.g:432:6: lv_attrAssList_3_0= ruleAttrAssList
                            {

                            						newCompositeNode(grammarAccess.getObjDeclAccess().getAttrAssListAttrAssListParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_6);
                            lv_attrAssList_3_0=ruleAttrAssList();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjDeclRule());
                            						}
                            						set(
                            							current,
                            							"attrAssList",
                            							lv_attrAssList_3_0,
                            							"uk.kcl.pgt.mdd.cw.Game.AttrAssList");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:455:3: ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' )
                    {
                    // InternalGame.g:455:3: ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' )
                    // InternalGame.g:456:4: ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']'
                    {
                    // InternalGame.g:456:4: ( (lv_type_5_0= RULE_OBJTYPE ) )
                    // InternalGame.g:457:5: (lv_type_5_0= RULE_OBJTYPE )
                    {
                    // InternalGame.g:457:5: (lv_type_5_0= RULE_OBJTYPE )
                    // InternalGame.g:458:6: lv_type_5_0= RULE_OBJTYPE
                    {
                    lv_type_5_0=(Token)match(input,RULE_OBJTYPE,FOLLOW_3); 

                    						newLeafNode(lv_type_5_0, grammarAccess.getObjDeclAccess().getTypeOBJTYPETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"uk.kcl.pgt.mdd.cw.Game.OBJTYPE");
                    					

                    }


                    }

                    // InternalGame.g:474:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalGame.g:475:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalGame.g:475:5: (lv_name_6_0= RULE_ID )
                    // InternalGame.g:476:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getObjDeclAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjDeclAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalGame.g:496:4: ( (lv_arrSize_8_0= RULE_INT ) )
                    // InternalGame.g:497:5: (lv_arrSize_8_0= RULE_INT )
                    {
                    // InternalGame.g:497:5: (lv_arrSize_8_0= RULE_INT )
                    // InternalGame.g:498:6: lv_arrSize_8_0= RULE_INT
                    {
                    lv_arrSize_8_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    						newLeafNode(lv_arrSize_8_0, grammarAccess.getObjDeclAccess().getArrSizeINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"arrSize",
                    							lv_arrSize_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjDeclAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjDecl"


    // $ANTLR start "entryRuleAttrAssList"
    // InternalGame.g:523:1: entryRuleAttrAssList returns [EObject current=null] : iv_ruleAttrAssList= ruleAttrAssList EOF ;
    public final EObject entryRuleAttrAssList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrAssList = null;


        try {
            // InternalGame.g:523:52: (iv_ruleAttrAssList= ruleAttrAssList EOF )
            // InternalGame.g:524:2: iv_ruleAttrAssList= ruleAttrAssList EOF
            {
             newCompositeNode(grammarAccess.getAttrAssListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttrAssList=ruleAttrAssList();

            state._fsp--;

             current =iv_ruleAttrAssList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttrAssList"


    // $ANTLR start "ruleAttrAssList"
    // InternalGame.g:530:1: ruleAttrAssList returns [EObject current=null] : ( ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )* ) ;
    public final EObject ruleAttrAssList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attrAss_0_0 = null;

        EObject lv_attrAss_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:536:2: ( ( ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )* ) )
            // InternalGame.g:537:2: ( ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )* )
            {
            // InternalGame.g:537:2: ( ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )* )
            // InternalGame.g:538:3: ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )*
            {
            // InternalGame.g:538:3: ( (lv_attrAss_0_0= ruleAttrAss ) )
            // InternalGame.g:539:4: (lv_attrAss_0_0= ruleAttrAss )
            {
            // InternalGame.g:539:4: (lv_attrAss_0_0= ruleAttrAss )
            // InternalGame.g:540:5: lv_attrAss_0_0= ruleAttrAss
            {

            					newCompositeNode(grammarAccess.getAttrAssListAccess().getAttrAssAttrAssParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_attrAss_0_0=ruleAttrAss();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttrAssListRule());
            					}
            					add(
            						current,
            						"attrAss",
            						lv_attrAss_0_0,
            						"uk.kcl.pgt.mdd.cw.Game.AttrAss");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:557:3: (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:558:4: otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAttrAssListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalGame.g:562:4: ( (lv_attrAss_2_0= ruleAttrAss ) )
            	    // InternalGame.g:563:5: (lv_attrAss_2_0= ruleAttrAss )
            	    {
            	    // InternalGame.g:563:5: (lv_attrAss_2_0= ruleAttrAss )
            	    // InternalGame.g:564:6: lv_attrAss_2_0= ruleAttrAss
            	    {

            	    						newCompositeNode(grammarAccess.getAttrAssListAccess().getAttrAssAttrAssParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_attrAss_2_0=ruleAttrAss();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAttrAssListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attrAss",
            	    							lv_attrAss_2_0,
            	    							"uk.kcl.pgt.mdd.cw.Game.AttrAss");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttrAssList"


    // $ANTLR start "entryRuleAttrAss"
    // InternalGame.g:586:1: entryRuleAttrAss returns [EObject current=null] : iv_ruleAttrAss= ruleAttrAss EOF ;
    public final EObject entryRuleAttrAss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrAss = null;


        try {
            // InternalGame.g:586:48: (iv_ruleAttrAss= ruleAttrAss EOF )
            // InternalGame.g:587:2: iv_ruleAttrAss= ruleAttrAss EOF
            {
             newCompositeNode(grammarAccess.getAttrAssRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttrAss=ruleAttrAss();

            state._fsp--;

             current =iv_ruleAttrAss; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttrAss"


    // $ANTLR start "ruleAttrAss"
    // InternalGame.g:593:1: ruleAttrAss returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAttrAss() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:599:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // InternalGame.g:600:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // InternalGame.g:600:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            // InternalGame.g:601:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) )
            {
            // InternalGame.g:601:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:602:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:602:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:603:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttrAssAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttrAssRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1());
            		
            // InternalGame.g:623:3: ( (lv_expr_2_0= ruleExpr ) )
            // InternalGame.g:624:4: (lv_expr_2_0= ruleExpr )
            {
            // InternalGame.g:624:4: (lv_expr_2_0= ruleExpr )
            // InternalGame.g:625:5: lv_expr_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getAttrAssAccess().getExprExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttrAssRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"uk.kcl.pgt.mdd.cw.Game.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttrAss"


    // $ANTLR start "entryRuleStmtBlock"
    // InternalGame.g:646:1: entryRuleStmtBlock returns [EObject current=null] : iv_ruleStmtBlock= ruleStmtBlock EOF ;
    public final EObject entryRuleStmtBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtBlock = null;


        try {
            // InternalGame.g:646:50: (iv_ruleStmtBlock= ruleStmtBlock EOF )
            // InternalGame.g:647:2: iv_ruleStmtBlock= ruleStmtBlock EOF
            {
             newCompositeNode(grammarAccess.getStmtBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmtBlock=ruleStmtBlock();

            state._fsp--;

             current =iv_ruleStmtBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtBlock"


    // $ANTLR start "ruleStmtBlock"
    // InternalGame.g:653:1: ruleStmtBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}' ) ;
    public final EObject ruleStmtBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalGame.g:659:2: ( (otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}' ) )
            // InternalGame.g:660:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}' )
            {
            // InternalGame.g:660:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}' )
            // InternalGame.g:661:3: otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getStmtBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGame.g:665:3: ( (lv_statements_1_0= ruleStmt ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==24||(LA9_0>=26 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:666:4: (lv_statements_1_0= ruleStmt )
            	    {
            	    // InternalGame.g:666:4: (lv_statements_1_0= ruleStmt )
            	    // InternalGame.g:667:5: lv_statements_1_0= ruleStmt
            	    {

            	    					newCompositeNode(grammarAccess.getStmtBlockAccess().getStatementsStmtParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_statements_1_0=ruleStmt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStmtBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"uk.kcl.pgt.mdd.cw.Game.Stmt");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStmtBlockAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtBlock"


    // $ANTLR start "entryRuleStmt"
    // InternalGame.g:692:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalGame.g:692:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalGame.g:693:2: iv_ruleStmt= ruleStmt EOF
            {
             newCompositeNode(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;

             current =iv_ruleStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalGame.g:699:1: ruleStmt returns [EObject current=null] : (this_IfStmt_0= ruleIfStmt | this_WhileStmt_1= ruleWhileStmt | this_ForStmt_2= ruleForStmt | this_EndStmt_3= ruleEndStmt | (this_AssStmt_4= ruleAssStmt otherlv_5= ';' ) ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_IfStmt_0 = null;

        EObject this_WhileStmt_1 = null;

        EObject this_ForStmt_2 = null;

        EObject this_EndStmt_3 = null;

        EObject this_AssStmt_4 = null;



        	enterRule();

        try {
            // InternalGame.g:705:2: ( (this_IfStmt_0= ruleIfStmt | this_WhileStmt_1= ruleWhileStmt | this_ForStmt_2= ruleForStmt | this_EndStmt_3= ruleEndStmt | (this_AssStmt_4= ruleAssStmt otherlv_5= ';' ) ) )
            // InternalGame.g:706:2: (this_IfStmt_0= ruleIfStmt | this_WhileStmt_1= ruleWhileStmt | this_ForStmt_2= ruleForStmt | this_EndStmt_3= ruleEndStmt | (this_AssStmt_4= ruleAssStmt otherlv_5= ';' ) )
            {
            // InternalGame.g:706:2: (this_IfStmt_0= ruleIfStmt | this_WhileStmt_1= ruleWhileStmt | this_ForStmt_2= ruleForStmt | this_EndStmt_3= ruleEndStmt | (this_AssStmt_4= ruleAssStmt otherlv_5= ';' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGame.g:707:3: this_IfStmt_0= ruleIfStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStmt_0=ruleIfStmt();

                    state._fsp--;


                    			current = this_IfStmt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:716:3: this_WhileStmt_1= ruleWhileStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getWhileStmtParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStmt_1=ruleWhileStmt();

                    state._fsp--;


                    			current = this_WhileStmt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGame.g:725:3: this_ForStmt_2= ruleForStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getForStmtParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForStmt_2=ruleForStmt();

                    state._fsp--;


                    			current = this_ForStmt_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGame.g:734:3: this_EndStmt_3= ruleEndStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getEndStmtParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndStmt_3=ruleEndStmt();

                    state._fsp--;


                    			current = this_EndStmt_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGame.g:743:3: (this_AssStmt_4= ruleAssStmt otherlv_5= ';' )
                    {
                    // InternalGame.g:743:3: (this_AssStmt_4= ruleAssStmt otherlv_5= ';' )
                    // InternalGame.g:744:4: this_AssStmt_4= ruleAssStmt otherlv_5= ';'
                    {

                    				newCompositeNode(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_AssStmt_4=ruleAssStmt();

                    state._fsp--;


                    				current = this_AssStmt_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getStmtAccess().getSemicolonKeyword_4_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleIfStmt"
    // InternalGame.g:761:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalGame.g:761:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalGame.g:762:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
             newCompositeNode(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;

             current =iv_ruleIfStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalGame.g:768:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )? ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_consequence_4_0 = null;

        EObject lv_alternative_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:774:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )? ) )
            // InternalGame.g:775:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )? )
            {
            // InternalGame.g:775:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )? )
            // InternalGame.g:776:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGame.g:784:3: ( (lv_condition_2_0= ruleExpr ) )
            // InternalGame.g:785:4: (lv_condition_2_0= ruleExpr )
            {
            // InternalGame.g:785:4: (lv_condition_2_0= ruleExpr )
            // InternalGame.g:786:5: lv_condition_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getConditionExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_condition_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"uk.kcl.pgt.mdd.cw.Game.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3());
            		
            // InternalGame.g:807:3: ( (lv_consequence_4_0= ruleStmtBlock ) )
            // InternalGame.g:808:4: (lv_consequence_4_0= ruleStmtBlock )
            {
            // InternalGame.g:808:4: (lv_consequence_4_0= ruleStmtBlock )
            // InternalGame.g:809:5: lv_consequence_4_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getConsequenceStmtBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_consequence_4_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"consequence",
            						lv_consequence_4_0,
            						"uk.kcl.pgt.mdd.cw.Game.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:826:3: (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGame.g:827:4: otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStmtAccess().getElseKeyword_5_0());
                    			
                    // InternalGame.g:831:4: ( (lv_alternative_6_0= ruleStmtBlock ) )
                    // InternalGame.g:832:5: (lv_alternative_6_0= ruleStmtBlock )
                    {
                    // InternalGame.g:832:5: (lv_alternative_6_0= ruleStmtBlock )
                    // InternalGame.g:833:6: lv_alternative_6_0= ruleStmtBlock
                    {

                    						newCompositeNode(grammarAccess.getIfStmtAccess().getAlternativeStmtBlockParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alternative_6_0=ruleStmtBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStmtRule());
                    						}
                    						set(
                    							current,
                    							"alternative",
                    							lv_alternative_6_0,
                    							"uk.kcl.pgt.mdd.cw.Game.StmtBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleWhileStmt"
    // InternalGame.g:855:1: entryRuleWhileStmt returns [EObject current=null] : iv_ruleWhileStmt= ruleWhileStmt EOF ;
    public final EObject entryRuleWhileStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStmt = null;


        try {
            // InternalGame.g:855:50: (iv_ruleWhileStmt= ruleWhileStmt EOF )
            // InternalGame.g:856:2: iv_ruleWhileStmt= ruleWhileStmt EOF
            {
             newCompositeNode(grammarAccess.getWhileStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStmt=ruleWhileStmt();

            state._fsp--;

             current =iv_ruleWhileStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStmt"


    // $ANTLR start "ruleWhileStmt"
    // InternalGame.g:862:1: ruleWhileStmt returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_whileCondition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmtBlock_4_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleWhileStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_whileCondition_2_0 = null;

        EObject lv_stmtBlock_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:868:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_whileCondition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmtBlock_4_0= ruleStmtBlock ) ) ) )
            // InternalGame.g:869:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_whileCondition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmtBlock_4_0= ruleStmtBlock ) ) )
            {
            // InternalGame.g:869:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_whileCondition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmtBlock_4_0= ruleStmtBlock ) ) )
            // InternalGame.g:870:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_whileCondition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmtBlock_4_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStmtAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileStmtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGame.g:878:3: ( (lv_whileCondition_2_0= ruleExpr ) )
            // InternalGame.g:879:4: (lv_whileCondition_2_0= ruleExpr )
            {
            // InternalGame.g:879:4: (lv_whileCondition_2_0= ruleExpr )
            // InternalGame.g:880:5: lv_whileCondition_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getWhileStmtAccess().getWhileConditionExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_whileCondition_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStmtRule());
            					}
            					set(
            						current,
            						"whileCondition",
            						lv_whileCondition_2_0,
            						"uk.kcl.pgt.mdd.cw.Game.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileStmtAccess().getRightParenthesisKeyword_3());
            		
            // InternalGame.g:901:3: ( (lv_stmtBlock_4_0= ruleStmtBlock ) )
            // InternalGame.g:902:4: (lv_stmtBlock_4_0= ruleStmtBlock )
            {
            // InternalGame.g:902:4: (lv_stmtBlock_4_0= ruleStmtBlock )
            // InternalGame.g:903:5: lv_stmtBlock_4_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getWhileStmtAccess().getStmtBlockStmtBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_4_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStmtRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_4_0,
            						"uk.kcl.pgt.mdd.cw.Game.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStmt"


    // $ANTLR start "entryRuleForStmt"
    // InternalGame.g:924:1: entryRuleForStmt returns [EObject current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final EObject entryRuleForStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStmt = null;


        try {
            // InternalGame.g:924:48: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalGame.g:925:2: iv_ruleForStmt= ruleForStmt EOF
            {
             newCompositeNode(grammarAccess.getForStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForStmt=ruleForStmt();

            state._fsp--;

             current =iv_ruleForStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStmt"


    // $ANTLR start "ruleForStmt"
    // InternalGame.g:931:1: ruleForStmt returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleForStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initStmt_2_0 = null;

        EObject lv_endCondition_4_0 = null;

        EObject lv_loopStmt_6_0 = null;

        EObject lv_stmtBlock_8_0 = null;



        	enterRule();

        try {
            // InternalGame.g:937:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) ) )
            // InternalGame.g:938:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) )
            {
            // InternalGame.g:938:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) )
            // InternalGame.g:939:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getForStmtAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGame.g:947:3: ( (lv_initStmt_2_0= ruleAssStmt ) )
            // InternalGame.g:948:4: (lv_initStmt_2_0= ruleAssStmt )
            {
            // InternalGame.g:948:4: (lv_initStmt_2_0= ruleAssStmt )
            // InternalGame.g:949:5: lv_initStmt_2_0= ruleAssStmt
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getInitStmtAssStmtParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_initStmt_2_0=ruleAssStmt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"initStmt",
            						lv_initStmt_2_0,
            						"uk.kcl.pgt.mdd.cw.Game.AssStmt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getForStmtAccess().getSemicolonKeyword_3());
            		
            // InternalGame.g:970:3: ( (lv_endCondition_4_0= ruleExpr ) )
            // InternalGame.g:971:4: (lv_endCondition_4_0= ruleExpr )
            {
            // InternalGame.g:971:4: (lv_endCondition_4_0= ruleExpr )
            // InternalGame.g:972:5: lv_endCondition_4_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getEndConditionExprParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_endCondition_4_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"endCondition",
            						lv_endCondition_4_0,
            						"uk.kcl.pgt.mdd.cw.Game.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getForStmtAccess().getSemicolonKeyword_5());
            		
            // InternalGame.g:993:3: ( (lv_loopStmt_6_0= ruleAssStmt ) )
            // InternalGame.g:994:4: (lv_loopStmt_6_0= ruleAssStmt )
            {
            // InternalGame.g:994:4: (lv_loopStmt_6_0= ruleAssStmt )
            // InternalGame.g:995:5: lv_loopStmt_6_0= ruleAssStmt
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getLoopStmtAssStmtParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_loopStmt_6_0=ruleAssStmt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"loopStmt",
            						lv_loopStmt_6_0,
            						"uk.kcl.pgt.mdd.cw.Game.AssStmt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getForStmtAccess().getRightParenthesisKeyword_7());
            		
            // InternalGame.g:1016:3: ( (lv_stmtBlock_8_0= ruleStmtBlock ) )
            // InternalGame.g:1017:4: (lv_stmtBlock_8_0= ruleStmtBlock )
            {
            // InternalGame.g:1017:4: (lv_stmtBlock_8_0= ruleStmtBlock )
            // InternalGame.g:1018:5: lv_stmtBlock_8_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getStmtBlockStmtBlockParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_8_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_8_0,
            						"uk.kcl.pgt.mdd.cw.Game.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStmt"


    // $ANTLR start "entryRuleEndStmt"
    // InternalGame.g:1039:1: entryRuleEndStmt returns [EObject current=null] : iv_ruleEndStmt= ruleEndStmt EOF ;
    public final EObject entryRuleEndStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndStmt = null;


        try {
            // InternalGame.g:1039:48: (iv_ruleEndStmt= ruleEndStmt EOF )
            // InternalGame.g:1040:2: iv_ruleEndStmt= ruleEndStmt EOF
            {
             newCompositeNode(grammarAccess.getEndStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndStmt=ruleEndStmt();

            state._fsp--;

             current =iv_ruleEndStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndStmt"


    // $ANTLR start "ruleEndStmt"
    // InternalGame.g:1046:1: ruleEndStmt returns [EObject current=null] : (otherlv_0= 'exit' otherlv_1= '(' this_IntLiteral_2= ruleIntLiteral otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleEndStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_IntLiteral_2 = null;



        	enterRule();

        try {
            // InternalGame.g:1052:2: ( (otherlv_0= 'exit' otherlv_1= '(' this_IntLiteral_2= ruleIntLiteral otherlv_3= ')' otherlv_4= ';' ) )
            // InternalGame.g:1053:2: (otherlv_0= 'exit' otherlv_1= '(' this_IntLiteral_2= ruleIntLiteral otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalGame.g:1053:2: (otherlv_0= 'exit' otherlv_1= '(' this_IntLiteral_2= ruleIntLiteral otherlv_3= ')' otherlv_4= ';' )
            // InternalGame.g:1054:3: otherlv_0= 'exit' otherlv_1= '(' this_IntLiteral_2= ruleIntLiteral otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEndStmtAccess().getExitKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEndStmtAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getEndStmtAccess().getIntLiteralParserRuleCall_2());
            		
            pushFollow(FOLLOW_6);
            this_IntLiteral_2=ruleIntLiteral();

            state._fsp--;


            			current = this_IntLiteral_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getEndStmtAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEndStmtAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndStmt"


    // $ANTLR start "entryRuleAssStmt"
    // InternalGame.g:1082:1: entryRuleAssStmt returns [EObject current=null] : iv_ruleAssStmt= ruleAssStmt EOF ;
    public final EObject entryRuleAssStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssStmt = null;


        try {
            // InternalGame.g:1082:48: (iv_ruleAssStmt= ruleAssStmt EOF )
            // InternalGame.g:1083:2: iv_ruleAssStmt= ruleAssStmt EOF
            {
             newCompositeNode(grammarAccess.getAssStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssStmt=ruleAssStmt();

            state._fsp--;

             current =iv_ruleAssStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssStmt"


    // $ANTLR start "ruleAssStmt"
    // InternalGame.g:1089:1: ruleAssStmt returns [EObject current=null] : ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAssStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_assignment_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1095:2: ( ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) ) ) )
            // InternalGame.g:1096:2: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) ) )
            {
            // InternalGame.g:1096:2: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) ) )
            // InternalGame.g:1097:3: ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) )
            {
            // InternalGame.g:1097:3: ( (lv_var_0_0= ruleVar ) )
            // InternalGame.g:1098:4: (lv_var_0_0= ruleVar )
            {
            // InternalGame.g:1098:4: (lv_var_0_0= ruleVar )
            // InternalGame.g:1099:5: lv_var_0_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getAssStmtAccess().getVarVarParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_var_0_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssStmtRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"uk.kcl.pgt.mdd.cw.Game.Var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAssStmtAccess().getEqualsSignKeyword_1());
            		
            // InternalGame.g:1120:3: ( (lv_assignment_2_0= ruleExpr ) )
            // InternalGame.g:1121:4: (lv_assignment_2_0= ruleExpr )
            {
            // InternalGame.g:1121:4: (lv_assignment_2_0= ruleExpr )
            // InternalGame.g:1122:5: lv_assignment_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getAssStmtAccess().getAssignmentExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_assignment_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssStmtRule());
            					}
            					set(
            						current,
            						"assignment",
            						lv_assignment_2_0,
            						"uk.kcl.pgt.mdd.cw.Game.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssStmt"


    // $ANTLR start "entryRuleVar"
    // InternalGame.g:1143:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalGame.g:1143:44: (iv_ruleVar= ruleVar EOF )
            // InternalGame.g:1144:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalGame.g:1150:1: ruleVar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_varArray_1_0 = null;

        EObject lv_varProp_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1156:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )? ) )
            // InternalGame.g:1157:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )? )
            {
            // InternalGame.g:1157:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )? )
            // InternalGame.g:1158:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )?
            {
            // InternalGame.g:1158:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1159:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1159:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1160:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:1176:3: ( (lv_varArray_1_0= ruleVarArray ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGame.g:1177:4: (lv_varArray_1_0= ruleVarArray )
                    {
                    // InternalGame.g:1177:4: (lv_varArray_1_0= ruleVarArray )
                    // InternalGame.g:1178:5: lv_varArray_1_0= ruleVarArray
                    {

                    					newCompositeNode(grammarAccess.getVarAccess().getVarArrayVarArrayParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_varArray_1_0=ruleVarArray();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarRule());
                    					}
                    					set(
                    						current,
                    						"varArray",
                    						lv_varArray_1_0,
                    						"uk.kcl.pgt.mdd.cw.Game.VarArray");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:1195:3: ( (lv_varProp_2_0= ruleVarProp ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:1196:4: (lv_varProp_2_0= ruleVarProp )
                    {
                    // InternalGame.g:1196:4: (lv_varProp_2_0= ruleVarProp )
                    // InternalGame.g:1197:5: lv_varProp_2_0= ruleVarProp
                    {

                    					newCompositeNode(grammarAccess.getVarAccess().getVarPropVarPropParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_varProp_2_0=ruleVarProp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarRule());
                    					}
                    					set(
                    						current,
                    						"varProp",
                    						lv_varProp_2_0,
                    						"uk.kcl.pgt.mdd.cw.Game.VarProp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleVarArray"
    // InternalGame.g:1218:1: entryRuleVarArray returns [EObject current=null] : iv_ruleVarArray= ruleVarArray EOF ;
    public final EObject entryRuleVarArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarArray = null;


        try {
            // InternalGame.g:1218:49: (iv_ruleVarArray= ruleVarArray EOF )
            // InternalGame.g:1219:2: iv_ruleVarArray= ruleVarArray EOF
            {
             newCompositeNode(grammarAccess.getVarArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarArray=ruleVarArray();

            state._fsp--;

             current =iv_ruleVarArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarArray"


    // $ANTLR start "ruleVarArray"
    // InternalGame.g:1225:1: ruleVarArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']' ) ;
    public final EObject ruleVarArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_indexExpr_1_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1231:2: ( (otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']' ) )
            // InternalGame.g:1232:2: (otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']' )
            {
            // InternalGame.g:1232:2: (otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']' )
            // InternalGame.g:1233:3: otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVarArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGame.g:1237:3: ( (lv_indexExpr_1_0= ruleExpr ) )
            // InternalGame.g:1238:4: (lv_indexExpr_1_0= ruleExpr )
            {
            // InternalGame.g:1238:4: (lv_indexExpr_1_0= ruleExpr )
            // InternalGame.g:1239:5: lv_indexExpr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getVarArrayAccess().getIndexExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_indexExpr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarArrayRule());
            					}
            					set(
            						current,
            						"indexExpr",
            						lv_indexExpr_1_0,
            						"uk.kcl.pgt.mdd.cw.Game.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVarArrayAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarArray"


    // $ANTLR start "entryRuleVarProp"
    // InternalGame.g:1264:1: entryRuleVarProp returns [EObject current=null] : iv_ruleVarProp= ruleVarProp EOF ;
    public final EObject entryRuleVarProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarProp = null;


        try {
            // InternalGame.g:1264:48: (iv_ruleVarProp= ruleVarProp EOF )
            // InternalGame.g:1265:2: iv_ruleVarProp= ruleVarProp EOF
            {
             newCompositeNode(grammarAccess.getVarPropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarProp=ruleVarProp();

            state._fsp--;

             current =iv_ruleVarProp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarProp"


    // $ANTLR start "ruleVarProp"
    // InternalGame.g:1271:1: ruleVarProp returns [EObject current=null] : (otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVarProp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_extId_1_0=null;


        	enterRule();

        try {
            // InternalGame.g:1277:2: ( (otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) ) ) )
            // InternalGame.g:1278:2: (otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) ) )
            {
            // InternalGame.g:1278:2: (otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) ) )
            // InternalGame.g:1279:3: otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarPropAccess().getFullStopKeyword_0());
            		
            // InternalGame.g:1283:3: ( (lv_extId_1_0= RULE_ID ) )
            // InternalGame.g:1284:4: (lv_extId_1_0= RULE_ID )
            {
            // InternalGame.g:1284:4: (lv_extId_1_0= RULE_ID )
            // InternalGame.g:1285:5: lv_extId_1_0= RULE_ID
            {
            lv_extId_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_extId_1_0, grammarAccess.getVarPropAccess().getExtIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarPropRule());
            					}
            					setWithLastConsumed(
            						current,
            						"extId",
            						lv_extId_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarProp"


    // $ANTLR start "entryRuleBlock"
    // InternalGame.g:1305:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalGame.g:1305:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalGame.g:1306:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalGame.g:1312:1: ruleBlock returns [EObject current=null] : (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_AnimBlock_0 = null;

        EObject this_EventBlock_1 = null;



        	enterRule();

        try {
            // InternalGame.g:1318:2: ( (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) )
            // InternalGame.g:1319:2: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            {
            // InternalGame.g:1319:2: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:1320:3: this_AnimBlock_0= ruleAnimBlock
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnimBlock_0=ruleAnimBlock();

                    state._fsp--;


                    			current = this_AnimBlock_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:1329:3: this_EventBlock_1= ruleEventBlock
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventBlock_1=ruleEventBlock();

                    state._fsp--;


                    			current = this_EventBlock_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAnimBlock"
    // InternalGame.g:1341:1: entryRuleAnimBlock returns [EObject current=null] : iv_ruleAnimBlock= ruleAnimBlock EOF ;
    public final EObject entryRuleAnimBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimBlock = null;


        try {
            // InternalGame.g:1341:50: (iv_ruleAnimBlock= ruleAnimBlock EOF )
            // InternalGame.g:1342:2: iv_ruleAnimBlock= ruleAnimBlock EOF
            {
             newCompositeNode(grammarAccess.getAnimBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimBlock=ruleAnimBlock();

            state._fsp--;

             current =iv_ruleAnimBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimBlock"


    // $ANTLR start "ruleAnimBlock"
    // InternalGame.g:1348:1: ruleAnimBlock returns [EObject current=null] : (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleAnimBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_objType_3_0=null;
        Token lv_objName_4_0=null;
        Token otherlv_5=null;
        EObject lv_stmtBlock_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1354:2: ( (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) ) ) )
            // InternalGame.g:1355:2: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) ) )
            {
            // InternalGame.g:1355:2: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) ) )
            // InternalGame.g:1356:3: otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnimBlockAccess().getAnimationKeyword_0());
            		
            // InternalGame.g:1360:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1361:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1361:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1362:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnimBlockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2());
            		
            // InternalGame.g:1382:3: ( (lv_objType_3_0= RULE_OBJTYPE ) )
            // InternalGame.g:1383:4: (lv_objType_3_0= RULE_OBJTYPE )
            {
            // InternalGame.g:1383:4: (lv_objType_3_0= RULE_OBJTYPE )
            // InternalGame.g:1384:5: lv_objType_3_0= RULE_OBJTYPE
            {
            lv_objType_3_0=(Token)match(input,RULE_OBJTYPE,FOLLOW_3); 

            					newLeafNode(lv_objType_3_0, grammarAccess.getAnimBlockAccess().getObjTypeOBJTYPETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objType",
            						lv_objType_3_0,
            						"uk.kcl.pgt.mdd.cw.Game.OBJTYPE");
            				

            }


            }

            // InternalGame.g:1400:3: ( (lv_objName_4_0= RULE_ID ) )
            // InternalGame.g:1401:4: (lv_objName_4_0= RULE_ID )
            {
            // InternalGame.g:1401:4: (lv_objName_4_0= RULE_ID )
            // InternalGame.g:1402:5: lv_objName_4_0= RULE_ID
            {
            lv_objName_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_objName_4_0, grammarAccess.getAnimBlockAccess().getObjNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_5());
            		
            // InternalGame.g:1422:3: ( (lv_stmtBlock_6_0= ruleStmtBlock ) )
            // InternalGame.g:1423:4: (lv_stmtBlock_6_0= ruleStmtBlock )
            {
            // InternalGame.g:1423:4: (lv_stmtBlock_6_0= ruleStmtBlock )
            // InternalGame.g:1424:5: lv_stmtBlock_6_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getAnimBlockAccess().getStmtBlockStmtBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_6_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimBlockRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_6_0,
            						"uk.kcl.pgt.mdd.cw.Game.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimBlock"


    // $ANTLR start "entryRuleEventBlock"
    // InternalGame.g:1445:1: entryRuleEventBlock returns [EObject current=null] : iv_ruleEventBlock= ruleEventBlock EOF ;
    public final EObject entryRuleEventBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventBlock = null;


        try {
            // InternalGame.g:1445:51: (iv_ruleEventBlock= ruleEventBlock EOF )
            // InternalGame.g:1446:2: iv_ruleEventBlock= ruleEventBlock EOF
            {
             newCompositeNode(grammarAccess.getEventBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventBlock=ruleEventBlock();

            state._fsp--;

             current =iv_ruleEventBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventBlock"


    // $ANTLR start "ruleEventBlock"
    // InternalGame.g:1452:1: ruleEventBlock returns [EObject current=null] : (otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleEventBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        EObject lv_stmtBlock_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1458:2: ( (otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) ) )
            // InternalGame.g:1459:2: (otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) )
            {
            // InternalGame.g:1459:2: (otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) )
            // InternalGame.g:1460:3: otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEventBlockAccess().getOnKeyword_0());
            		
            // InternalGame.g:1464:3: ( (lv_key_1_0= RULE_KEYSTROKE ) )
            // InternalGame.g:1465:4: (lv_key_1_0= RULE_KEYSTROKE )
            {
            // InternalGame.g:1465:4: (lv_key_1_0= RULE_KEYSTROKE )
            // InternalGame.g:1466:5: lv_key_1_0= RULE_KEYSTROKE
            {
            lv_key_1_0=(Token)match(input,RULE_KEYSTROKE,FOLLOW_7); 

            					newLeafNode(lv_key_1_0, grammarAccess.getEventBlockAccess().getKeyKEYSTROKETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"uk.kcl.pgt.mdd.cw.Game.KEYSTROKE");
            				

            }


            }

            // InternalGame.g:1482:3: ( (lv_stmtBlock_2_0= ruleStmtBlock ) )
            // InternalGame.g:1483:4: (lv_stmtBlock_2_0= ruleStmtBlock )
            {
            // InternalGame.g:1483:4: (lv_stmtBlock_2_0= ruleStmtBlock )
            // InternalGame.g:1484:5: lv_stmtBlock_2_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getEventBlockAccess().getStmtBlockStmtBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_2_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventBlockRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_2_0,
            						"uk.kcl.pgt.mdd.cw.Game.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventBlock"


    // $ANTLR start "entryRuleExpr"
    // InternalGame.g:1505:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalGame.g:1505:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalGame.g:1506:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalGame.g:1512:1: ruleExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1518:2: ( (this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalGame.g:1519:2: (this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalGame.g:1519:2: (this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalGame.g:1520:3: this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getExprAccess().getAndExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;


            			current = this_AndExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGame.g:1528:3: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGame.g:1529:4: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalGame.g:1529:4: ()
            	    // InternalGame.g:1530:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGame.g:1536:4: ( (lv_op_2_0= '||' ) )
            	    // InternalGame.g:1537:5: (lv_op_2_0= '||' )
            	    {
            	    // InternalGame.g:1537:5: (lv_op_2_0= '||' )
            	    // InternalGame.g:1538:6: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,32,FOLLOW_11); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getExprAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExprRule());
            	    						}
            	    						setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	    					

            	    }


            	    }

            	    // InternalGame.g:1550:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalGame.g:1551:5: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalGame.g:1551:5: (lv_right_3_0= ruleAndExpr )
            	    // InternalGame.g:1552:6: lv_right_3_0= ruleAndExpr
            	    {

            	    						newCompositeNode(grammarAccess.getExprAccess().getRightAndExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.kcl.pgt.mdd.cw.Game.AndExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalGame.g:1574:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalGame.g:1574:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalGame.g:1575:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalGame.g:1581:1: ruleAndExpr returns [EObject current=null] : (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1587:2: ( (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* ) )
            // InternalGame.g:1588:2: (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* )
            {
            // InternalGame.g:1588:2: (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* )
            // InternalGame.g:1589:3: this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExprAccess().getRelExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_RelExpr_0=ruleRelExpr();

            state._fsp--;


            			current = this_RelExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGame.g:1597:3: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGame.g:1598:4: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelExpr ) )
            	    {
            	    // InternalGame.g:1598:4: ()
            	    // InternalGame.g:1599:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGame.g:1605:4: ( (lv_op_2_0= '&&' ) )
            	    // InternalGame.g:1606:5: (lv_op_2_0= '&&' )
            	    {
            	    // InternalGame.g:1606:5: (lv_op_2_0= '&&' )
            	    // InternalGame.g:1607:6: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,33,FOLLOW_11); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAndExprRule());
            	    						}
            	    						setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	    					

            	    }


            	    }

            	    // InternalGame.g:1619:4: ( (lv_right_3_0= ruleRelExpr ) )
            	    // InternalGame.g:1620:5: (lv_right_3_0= ruleRelExpr )
            	    {
            	    // InternalGame.g:1620:5: (lv_right_3_0= ruleRelExpr )
            	    // InternalGame.g:1621:6: lv_right_3_0= ruleRelExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAndExprAccess().getRightRelExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleRelExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.kcl.pgt.mdd.cw.Game.RelExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleRelExpr"
    // InternalGame.g:1643:1: entryRuleRelExpr returns [EObject current=null] : iv_ruleRelExpr= ruleRelExpr EOF ;
    public final EObject entryRuleRelExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelExpr = null;


        try {
            // InternalGame.g:1643:48: (iv_ruleRelExpr= ruleRelExpr EOF )
            // InternalGame.g:1644:2: iv_ruleRelExpr= ruleRelExpr EOF
            {
             newCompositeNode(grammarAccess.getRelExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelExpr=ruleRelExpr();

            state._fsp--;

             current =iv_ruleRelExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelExpr"


    // $ANTLR start "ruleRelExpr"
    // InternalGame.g:1650:1: ruleRelExpr returns [EObject current=null] : (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* ) ;
    public final EObject ruleRelExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_AddExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1656:2: ( (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* ) )
            // InternalGame.g:1657:2: (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* )
            {
            // InternalGame.g:1657:2: (this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* )
            // InternalGame.g:1658:3: this_AddExpr_0= ruleAddExpr ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_AddExpr_0=ruleAddExpr();

            state._fsp--;


            			current = this_AddExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGame.g:1666:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=36)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGame.g:1667:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) ) ( (lv_right_3_0= ruleAddExpr ) )
            	    {
            	    // InternalGame.g:1667:4: ()
            	    // InternalGame.g:1668:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGame.g:1674:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) ) )
            	    // InternalGame.g:1675:5: ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) )
            	    {
            	    // InternalGame.g:1675:5: ( (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' ) )
            	    // InternalGame.g:1676:6: (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' )
            	    {
            	    // InternalGame.g:1676:6: (lv_op_2_1= '==' | lv_op_2_2= '<' | lv_op_2_3= '<=' )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // InternalGame.g:1677:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_11); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getRelExprAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelExprRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGame.g:1688:7: lv_op_2_2= '<'
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_11); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getRelExprAccess().getOpLessThanSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelExprRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalGame.g:1699:7: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_11); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getRelExprAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelExprRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGame.g:1712:4: ( (lv_right_3_0= ruleAddExpr ) )
            	    // InternalGame.g:1713:5: (lv_right_3_0= ruleAddExpr )
            	    {
            	    // InternalGame.g:1713:5: (lv_right_3_0= ruleAddExpr )
            	    // InternalGame.g:1714:6: lv_right_3_0= ruleAddExpr
            	    {

            	    						newCompositeNode(grammarAccess.getRelExprAccess().getRightAddExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleAddExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.kcl.pgt.mdd.cw.Game.AddExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelExpr"


    // $ANTLR start "entryRuleAddExpr"
    // InternalGame.g:1736:1: entryRuleAddExpr returns [EObject current=null] : iv_ruleAddExpr= ruleAddExpr EOF ;
    public final EObject entryRuleAddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpr = null;


        try {
            // InternalGame.g:1736:48: (iv_ruleAddExpr= ruleAddExpr EOF )
            // InternalGame.g:1737:2: iv_ruleAddExpr= ruleAddExpr EOF
            {
             newCompositeNode(grammarAccess.getAddExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExpr=ruleAddExpr();

            state._fsp--;

             current =iv_ruleAddExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpr"


    // $ANTLR start "ruleAddExpr"
    // InternalGame.g:1743:1: ruleAddExpr returns [EObject current=null] : (this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )* ) ;
    public final EObject ruleAddExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1749:2: ( (this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )* ) )
            // InternalGame.g:1750:2: (this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )* )
            {
            // InternalGame.g:1750:2: (this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )* )
            // InternalGame.g:1751:3: this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddExprAccess().getMultExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_MultExpr_0=ruleMultExpr();

            state._fsp--;


            			current = this_MultExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGame.g:1759:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=37 && LA20_0<=38)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGame.g:1760:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExpr ) )
            	    {
            	    // InternalGame.g:1760:4: ()
            	    // InternalGame.g:1761:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGame.g:1767:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalGame.g:1768:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalGame.g:1768:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalGame.g:1769:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalGame.g:1769:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==37) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==38) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalGame.g:1770:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,37,FOLLOW_11); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getAddExprAccess().getOpPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAddExprRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGame.g:1781:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,38,FOLLOW_11); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getAddExprAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAddExprRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGame.g:1794:4: ( (lv_right_3_0= ruleMultExpr ) )
            	    // InternalGame.g:1795:5: (lv_right_3_0= ruleMultExpr )
            	    {
            	    // InternalGame.g:1795:5: (lv_right_3_0= ruleMultExpr )
            	    // InternalGame.g:1796:6: lv_right_3_0= ruleMultExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAddExprAccess().getRightMultExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleMultExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.kcl.pgt.mdd.cw.Game.MultExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpr"


    // $ANTLR start "entryRuleMultExpr"
    // InternalGame.g:1818:1: entryRuleMultExpr returns [EObject current=null] : iv_ruleMultExpr= ruleMultExpr EOF ;
    public final EObject entryRuleMultExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpr = null;


        try {
            // InternalGame.g:1818:49: (iv_ruleMultExpr= ruleMultExpr EOF )
            // InternalGame.g:1819:2: iv_ruleMultExpr= ruleMultExpr EOF
            {
             newCompositeNode(grammarAccess.getMultExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultExpr=ruleMultExpr();

            state._fsp--;

             current =iv_ruleMultExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpr"


    // $ANTLR start "ruleMultExpr"
    // InternalGame.g:1825:1: ruleMultExpr returns [EObject current=null] : ( (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )* ) ;
    public final EObject ruleMultExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        EObject this_UnaryExpr_0 = null;

        EObject this_Atom_1 = null;

        EObject lv_right_4_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1831:2: ( ( (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )* ) )
            // InternalGame.g:1832:2: ( (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )* )
            {
            // InternalGame.g:1832:2: ( (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )* )
            // InternalGame.g:1833:3: (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )*
            {
            // InternalGame.g:1833:3: (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38||LA21_0==42) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==14) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:1834:4: this_UnaryExpr_0= ruleUnaryExpr
                    {

                    				newCompositeNode(grammarAccess.getMultExprAccess().getUnaryExprParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_27);
                    this_UnaryExpr_0=ruleUnaryExpr();

                    state._fsp--;


                    				current = this_UnaryExpr_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalGame.g:1843:4: this_Atom_1= ruleAtom
                    {

                    				newCompositeNode(grammarAccess.getMultExprAccess().getAtomParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_27);
                    this_Atom_1=ruleAtom();

                    state._fsp--;


                    				current = this_Atom_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalGame.g:1852:3: ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=39 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGame.g:1853:4: () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) )
            	    {
            	    // InternalGame.g:1853:4: ()
            	    // InternalGame.g:1854:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGame.g:1860:4: ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) )
            	    // InternalGame.g:1861:5: ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) )
            	    {
            	    // InternalGame.g:1861:5: ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) )
            	    // InternalGame.g:1862:6: (lv_op_3_1= '*' | lv_op_3_2= '/' )
            	    {
            	    // InternalGame.g:1862:6: (lv_op_3_1= '*' | lv_op_3_2= '/' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==39) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==40) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalGame.g:1863:7: lv_op_3_1= '*'
            	            {
            	            lv_op_3_1=(Token)match(input,39,FOLLOW_11); 

            	            							newLeafNode(lv_op_3_1, grammarAccess.getMultExprAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultExprRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_3_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGame.g:1874:7: lv_op_3_2= '/'
            	            {
            	            lv_op_3_2=(Token)match(input,40,FOLLOW_11); 

            	            							newLeafNode(lv_op_3_2, grammarAccess.getMultExprAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultExprRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_3_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGame.g:1887:4: ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==38||LA23_0==42) ) {
            	        alt23=1;
            	    }
            	    else if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==14) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalGame.g:1888:5: ( (lv_right_4_0= ruleUnaryExpr ) )
            	            {
            	            // InternalGame.g:1888:5: ( (lv_right_4_0= ruleUnaryExpr ) )
            	            // InternalGame.g:1889:6: (lv_right_4_0= ruleUnaryExpr )
            	            {
            	            // InternalGame.g:1889:6: (lv_right_4_0= ruleUnaryExpr )
            	            // InternalGame.g:1890:7: lv_right_4_0= ruleUnaryExpr
            	            {

            	            							newCompositeNode(grammarAccess.getMultExprAccess().getRightUnaryExprParserRuleCall_1_2_0_0());
            	            						
            	            pushFollow(FOLLOW_27);
            	            lv_right_4_0=ruleUnaryExpr();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMultExprRule());
            	            							}
            	            							set(
            	            								current,
            	            								"right",
            	            								lv_right_4_0,
            	            								"uk.kcl.pgt.mdd.cw.Game.UnaryExpr");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGame.g:1908:5: ( (lv_right_5_0= ruleAtom ) )
            	            {
            	            // InternalGame.g:1908:5: ( (lv_right_5_0= ruleAtom ) )
            	            // InternalGame.g:1909:6: (lv_right_5_0= ruleAtom )
            	            {
            	            // InternalGame.g:1909:6: (lv_right_5_0= ruleAtom )
            	            // InternalGame.g:1910:7: lv_right_5_0= ruleAtom
            	            {

            	            							newCompositeNode(grammarAccess.getMultExprAccess().getRightAtomParserRuleCall_1_2_1_0());
            	            						
            	            pushFollow(FOLLOW_27);
            	            lv_right_5_0=ruleAtom();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMultExprRule());
            	            							}
            	            							set(
            	            								current,
            	            								"right",
            	            								lv_right_5_0,
            	            								"uk.kcl.pgt.mdd.cw.Game.Atom");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalGame.g:1933:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalGame.g:1933:50: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalGame.g:1934:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalGame.g:1940:1: ruleUnaryExpr returns [EObject current=null] : this_UnaryOperation_0= ruleUnaryOperation ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOperation_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1946:2: (this_UnaryOperation_0= ruleUnaryOperation )
            // InternalGame.g:1947:2: this_UnaryOperation_0= ruleUnaryOperation
            {

            		newCompositeNode(grammarAccess.getUnaryExprAccess().getUnaryOperationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;


            		current = this_UnaryOperation_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleAtom"
    // InternalGame.g:1958:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalGame.g:1958:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalGame.g:1959:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalGame.g:1965:1: ruleAtom returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | (this_Var_1= ruleVar ( () ( (lv_op_3_0= 'touches' ) ) ( (lv_right_4_0= ruleVar ) ) )? ) | this_ExprVar_5= ruleExprVar ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_0=null;
        EObject this_IntLiteral_0 = null;

        EObject this_Var_1 = null;

        EObject lv_right_4_0 = null;

        EObject this_ExprVar_5 = null;



        	enterRule();

        try {
            // InternalGame.g:1971:2: ( (this_IntLiteral_0= ruleIntLiteral | (this_Var_1= ruleVar ( () ( (lv_op_3_0= 'touches' ) ) ( (lv_right_4_0= ruleVar ) ) )? ) | this_ExprVar_5= ruleExprVar ) )
            // InternalGame.g:1972:2: (this_IntLiteral_0= ruleIntLiteral | (this_Var_1= ruleVar ( () ( (lv_op_3_0= 'touches' ) ) ( (lv_right_4_0= ruleVar ) ) )? ) | this_ExprVar_5= ruleExprVar )
            {
            // InternalGame.g:1972:2: (this_IntLiteral_0= ruleIntLiteral | (this_Var_1= ruleVar ( () ( (lv_op_3_0= 'touches' ) ) ( (lv_right_4_0= ruleVar ) ) )? ) | this_ExprVar_5= ruleExprVar )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                alt26=2;
                }
                break;
            case 14:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalGame.g:1973:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:1982:3: (this_Var_1= ruleVar ( () ( (lv_op_3_0= 'touches' ) ) ( (lv_right_4_0= ruleVar ) ) )? )
                    {
                    // InternalGame.g:1982:3: (this_Var_1= ruleVar ( () ( (lv_op_3_0= 'touches' ) ) ( (lv_right_4_0= ruleVar ) ) )? )
                    // InternalGame.g:1983:4: this_Var_1= ruleVar ( () ( (lv_op_3_0= 'touches' ) ) ( (lv_right_4_0= ruleVar ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getAtomAccess().getVarParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_28);
                    this_Var_1=ruleVar();

                    state._fsp--;


                    				current = this_Var_1;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalGame.g:1991:4: ( () ( (lv_op_3_0= 'touches' ) ) ( (lv_right_4_0= ruleVar ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==41) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalGame.g:1992:5: () ( (lv_op_3_0= 'touches' ) ) ( (lv_right_4_0= ruleVar ) )
                            {
                            // InternalGame.g:1992:5: ()
                            // InternalGame.g:1993:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getAtomAccess().getOperationLeftAction_1_1_0(),
                            							current);
                            					

                            }

                            // InternalGame.g:1999:5: ( (lv_op_3_0= 'touches' ) )
                            // InternalGame.g:2000:6: (lv_op_3_0= 'touches' )
                            {
                            // InternalGame.g:2000:6: (lv_op_3_0= 'touches' )
                            // InternalGame.g:2001:7: lv_op_3_0= 'touches'
                            {
                            lv_op_3_0=(Token)match(input,41,FOLLOW_3); 

                            							newLeafNode(lv_op_3_0, grammarAccess.getAtomAccess().getOpTouchesKeyword_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_3_0, "touches");
                            						

                            }


                            }

                            // InternalGame.g:2013:5: ( (lv_right_4_0= ruleVar ) )
                            // InternalGame.g:2014:6: (lv_right_4_0= ruleVar )
                            {
                            // InternalGame.g:2014:6: (lv_right_4_0= ruleVar )
                            // InternalGame.g:2015:7: lv_right_4_0= ruleVar
                            {

                            							newCompositeNode(grammarAccess.getAtomAccess().getRightVarParserRuleCall_1_1_2_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_right_4_0=ruleVar();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAtomRule());
                            							}
                            							set(
                            								current,
                            								"right",
                            								lv_right_4_0,
                            								"uk.kcl.pgt.mdd.cw.Game.Var");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:2035:3: this_ExprVar_5= ruleExprVar
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getExprVarParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExprVar_5=ruleExprVar();

                    state._fsp--;


                    			current = this_ExprVar_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalGame.g:2047:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // InternalGame.g:2047:55: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // InternalGame.g:2048:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;

             current =iv_ruleUnaryOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // InternalGame.g:2054:1: ruleUnaryOperation returns [EObject current=null] : ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' ) ) ) ( (lv_right_1_0= ruleAtom ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2060:2: ( ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' ) ) ) ( (lv_right_1_0= ruleAtom ) ) ) )
            // InternalGame.g:2061:2: ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' ) ) ) ( (lv_right_1_0= ruleAtom ) ) )
            {
            // InternalGame.g:2061:2: ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' ) ) ) ( (lv_right_1_0= ruleAtom ) ) )
            // InternalGame.g:2062:3: ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' ) ) ) ( (lv_right_1_0= ruleAtom ) )
            {
            // InternalGame.g:2062:3: ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' ) ) )
            // InternalGame.g:2063:4: ( (lv_op_0_1= '!' | lv_op_0_2= '-' ) )
            {
            // InternalGame.g:2063:4: ( (lv_op_0_1= '!' | lv_op_0_2= '-' ) )
            // InternalGame.g:2064:5: (lv_op_0_1= '!' | lv_op_0_2= '-' )
            {
            // InternalGame.g:2064:5: (lv_op_0_1= '!' | lv_op_0_2= '-' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            else if ( (LA27_0==38) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGame.g:2065:6: lv_op_0_1= '!'
                    {
                    lv_op_0_1=(Token)match(input,42,FOLLOW_11); 

                    						newLeafNode(lv_op_0_1, grammarAccess.getUnaryOperationAccess().getOpExclamationMarkKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryOperationRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGame.g:2076:6: lv_op_0_2= '-'
                    {
                    lv_op_0_2=(Token)match(input,38,FOLLOW_11); 

                    						newLeafNode(lv_op_0_2, grammarAccess.getUnaryOperationAccess().getOpHyphenMinusKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryOperationRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalGame.g:2089:3: ( (lv_right_1_0= ruleAtom ) )
            // InternalGame.g:2090:4: (lv_right_1_0= ruleAtom )
            {
            // InternalGame.g:2090:4: (lv_right_1_0= ruleAtom )
            // InternalGame.g:2091:5: lv_right_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getUnaryOperationAccess().getRightAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"uk.kcl.pgt.mdd.cw.Game.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalGame.g:2112:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalGame.g:2112:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalGame.g:2113:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalGame.g:2119:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGame.g:2125:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalGame.g:2126:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalGame.g:2126:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalGame.g:2127:3: (lv_value_0_0= RULE_INT )
            {
            // InternalGame.g:2127:3: (lv_value_0_0= RULE_INT )
            // InternalGame.g:2128:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleExprVar"
    // InternalGame.g:2147:1: entryRuleExprVar returns [EObject current=null] : iv_ruleExprVar= ruleExprVar EOF ;
    public final EObject entryRuleExprVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprVar = null;


        try {
            // InternalGame.g:2147:48: (iv_ruleExprVar= ruleExprVar EOF )
            // InternalGame.g:2148:2: iv_ruleExprVar= ruleExprVar EOF
            {
             newCompositeNode(grammarAccess.getExprVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprVar=ruleExprVar();

            state._fsp--;

             current =iv_ruleExprVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprVar"


    // $ANTLR start "ruleExprVar"
    // InternalGame.g:2154:1: ruleExprVar returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) ;
    public final EObject ruleExprVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2160:2: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) )
            // InternalGame.g:2161:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' )
            {
            // InternalGame.g:2161:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' )
            // InternalGame.g:2162:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getExprVarAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGame.g:2166:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGame.g:2167:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGame.g:2167:4: (lv_expr_1_0= ruleExpr )
            // InternalGame.g:2168:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getExprVarAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprVarRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"uk.kcl.pgt.mdd.cw.Game.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExprVarAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprVar"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000420040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000044000004030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001D800010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001D000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000002L});

}