package org.xtext.casino.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.casino.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'module'", "'submodule'", "'type:'", "'Read'", "'Create'", "'generalEntity'", "'property'", "'specialEntity'", "'Admin'", "'Aux'", "'operates_on:'", "'Exchange'", "'Sale'", "'Composition'", "'source:'", "'target:'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domain";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomain"
    // InternalDsl.g:64:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalDsl.g:64:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalDsl.g:65:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalDsl.g:71:1: ruleDomain returns [EObject current=null] : (otherlv_0= '{' ( (lv_modules_1_0= ruleModule ) )+ otherlv_2= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_modules_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= '{' ( (lv_modules_1_0= ruleModule ) )+ otherlv_2= '}' ) )
            // InternalDsl.g:78:2: (otherlv_0= '{' ( (lv_modules_1_0= ruleModule ) )+ otherlv_2= '}' )
            {
            // InternalDsl.g:78:2: (otherlv_0= '{' ( (lv_modules_1_0= ruleModule ) )+ otherlv_2= '}' )
            // InternalDsl.g:79:3: otherlv_0= '{' ( (lv_modules_1_0= ruleModule ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalDsl.g:83:3: ( (lv_modules_1_0= ruleModule ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:84:4: (lv_modules_1_0= ruleModule )
            	    {
            	    // InternalDsl.g:84:4: (lv_modules_1_0= ruleModule )
            	    // InternalDsl.g:85:5: lv_modules_1_0= ruleModule
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getModulesModuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_modules_1_0=ruleModule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_1_0,
            	    						"org.xtext.casino.dsl.Dsl.Module");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleModule"
    // InternalDsl.g:110:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalDsl.g:110:47: (iv_ruleModule= ruleModule EOF )
            // InternalDsl.g:111:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalDsl.g:117:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_submodules_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:123:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:124:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:124:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' )
            // InternalDsl.g:125:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalDsl.g:129:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:130:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:130:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:131:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:151:3: ( (lv_submodules_3_0= ruleSubmodule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:152:4: (lv_submodules_3_0= ruleSubmodule )
            	    {
            	    // InternalDsl.g:152:4: (lv_submodules_3_0= ruleSubmodule )
            	    // InternalDsl.g:153:5: lv_submodules_3_0= ruleSubmodule
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getSubmodulesSubmoduleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_submodules_3_0=ruleSubmodule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"submodules",
            	    						lv_submodules_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Submodule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleSubmodule"
    // InternalDsl.g:178:1: entryRuleSubmodule returns [EObject current=null] : iv_ruleSubmodule= ruleSubmodule EOF ;
    public final EObject entryRuleSubmodule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodule = null;


        try {
            // InternalDsl.g:178:50: (iv_ruleSubmodule= ruleSubmodule EOF )
            // InternalDsl.g:179:2: iv_ruleSubmodule= ruleSubmodule EOF
            {
             newCompositeNode(grammarAccess.getSubmoduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubmodule=ruleSubmodule();

            state._fsp--;

             current =iv_ruleSubmodule; 
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
    // $ANTLR end "entryRuleSubmodule"


    // $ANTLR start "ruleSubmodule"
    // InternalDsl.g:185:1: ruleSubmodule returns [EObject current=null] : (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity ) ) )+ ( (lv_relations_5_0= ruleRelationDom ) )+ otherlv_6= '}' ) ;
    public final EObject ruleSubmodule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_operations_3_0 = null;

        EObject lv_entities_4_1 = null;

        EObject lv_entities_4_2 = null;

        EObject lv_relations_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:191:2: ( (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity ) ) )+ ( (lv_relations_5_0= ruleRelationDom ) )+ otherlv_6= '}' ) )
            // InternalDsl.g:192:2: (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity ) ) )+ ( (lv_relations_5_0= ruleRelationDom ) )+ otherlv_6= '}' )
            {
            // InternalDsl.g:192:2: (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity ) ) )+ ( (lv_relations_5_0= ruleRelationDom ) )+ otherlv_6= '}' )
            // InternalDsl.g:193:3: otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity ) ) )+ ( (lv_relations_5_0= ruleRelationDom ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmoduleAccess().getSubmoduleKeyword_0());
            		
            // InternalDsl.g:197:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:198:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:198:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:199:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubmoduleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubmoduleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSubmoduleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:219:3: ( (lv_operations_3_0= ruleOperation ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:220:4: (lv_operations_3_0= ruleOperation )
            	    {
            	    // InternalDsl.g:220:4: (lv_operations_3_0= ruleOperation )
            	    // InternalDsl.g:221:5: lv_operations_3_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getSubmoduleAccess().getOperationsOperationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_operations_3_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubmoduleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalDsl.g:238:3: ( ( (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:239:4: ( (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity ) )
            	    {
            	    // InternalDsl.g:239:4: ( (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity ) )
            	    // InternalDsl.g:240:5: (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity )
            	    {
            	    // InternalDsl.g:240:5: (lv_entities_4_1= ruleSpecialEntity | lv_entities_4_2= ruleGeneralEntity )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==20) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==18) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalDsl.g:241:6: lv_entities_4_1= ruleSpecialEntity
            	            {

            	            						newCompositeNode(grammarAccess.getSubmoduleAccess().getEntitiesSpecialEntityParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_entities_4_1=ruleSpecialEntity();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubmoduleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"entities",
            	            							lv_entities_4_1,
            	            							"org.xtext.casino.dsl.Dsl.SpecialEntity");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:257:6: lv_entities_4_2= ruleGeneralEntity
            	            {

            	            						newCompositeNode(grammarAccess.getSubmoduleAccess().getEntitiesGeneralEntityParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_entities_4_2=ruleGeneralEntity();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubmoduleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"entities",
            	            							lv_entities_4_2,
            	            							"org.xtext.casino.dsl.Dsl.GeneralEntity");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalDsl.g:275:3: ( (lv_relations_5_0= ruleRelationDom ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:276:4: (lv_relations_5_0= ruleRelationDom )
            	    {
            	    // InternalDsl.g:276:4: (lv_relations_5_0= ruleRelationDom )
            	    // InternalDsl.g:277:5: lv_relations_5_0= ruleRelationDom
            	    {

            	    					newCompositeNode(grammarAccess.getSubmoduleAccess().getRelationsRelationDomParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_relations_5_0=ruleRelationDom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubmoduleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_5_0,
            	    						"org.xtext.casino.dsl.Dsl.RelationDom");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSubmoduleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSubmodule"


    // $ANTLR start "entryRuleOperation"
    // InternalDsl.g:302:1: entryRuleOperation returns [String current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final String entryRuleOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperation = null;


        try {
            // InternalDsl.g:302:49: (iv_ruleOperation= ruleOperation EOF )
            // InternalDsl.g:303:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation.getText(); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalDsl.g:309:1: ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' kw= 'type:' this_SubOperation_2= ruleSubOperation kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SubOperation_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:315:2: ( (kw= '{' kw= 'type:' this_SubOperation_2= ruleSubOperation kw= '}' ) )
            // InternalDsl.g:316:2: (kw= '{' kw= 'type:' this_SubOperation_2= ruleSubOperation kw= '}' )
            {
            // InternalDsl.g:316:2: (kw= '{' kw= 'type:' this_SubOperation_2= ruleSubOperation kw= '}' )
            // InternalDsl.g:317:3: kw= '{' kw= 'type:' this_SubOperation_2= ruleSubOperation kw= '}'
            {
            kw=(Token)match(input,11,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_0());
            		
            kw=(Token)match(input,15,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOperationAccess().getTypeKeyword_1());
            		

            			newCompositeNode(grammarAccess.getOperationAccess().getSubOperationParserRuleCall_2());
            		
            pushFollow(FOLLOW_14);
            this_SubOperation_2=ruleSubOperation();

            state._fsp--;


            			current.merge(this_SubOperation_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,12,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSubOperation"
    // InternalDsl.g:346:1: entryRuleSubOperation returns [String current=null] : iv_ruleSubOperation= ruleSubOperation EOF ;
    public final String entryRuleSubOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubOperation = null;


        try {
            // InternalDsl.g:346:52: (iv_ruleSubOperation= ruleSubOperation EOF )
            // InternalDsl.g:347:2: iv_ruleSubOperation= ruleSubOperation EOF
            {
             newCompositeNode(grammarAccess.getSubOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubOperation=ruleSubOperation();

            state._fsp--;

             current =iv_ruleSubOperation.getText(); 
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
    // $ANTLR end "entryRuleSubOperation"


    // $ANTLR start "ruleSubOperation"
    // InternalDsl.g:353:1: ruleSubOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Read' | kw= 'Create' ) ;
    public final AntlrDatatypeRuleToken ruleSubOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:359:2: ( (kw= 'Read' | kw= 'Create' ) )
            // InternalDsl.g:360:2: (kw= 'Read' | kw= 'Create' )
            {
            // InternalDsl.g:360:2: (kw= 'Read' | kw= 'Create' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:361:3: kw= 'Read'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubOperationAccess().getReadKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:367:3: kw= 'Create'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubOperationAccess().getCreateKeyword_1());
                    		

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
    // $ANTLR end "ruleSubOperation"


    // $ANTLR start "entryRuleGeneralEntity"
    // InternalDsl.g:376:1: entryRuleGeneralEntity returns [EObject current=null] : iv_ruleGeneralEntity= ruleGeneralEntity EOF ;
    public final EObject entryRuleGeneralEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralEntity = null;


        try {
            // InternalDsl.g:376:54: (iv_ruleGeneralEntity= ruleGeneralEntity EOF )
            // InternalDsl.g:377:2: iv_ruleGeneralEntity= ruleGeneralEntity EOF
            {
             newCompositeNode(grammarAccess.getGeneralEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralEntity=ruleGeneralEntity();

            state._fsp--;

             current =iv_ruleGeneralEntity; 
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
    // $ANTLR end "entryRuleGeneralEntity"


    // $ANTLR start "ruleGeneralEntity"
    // InternalDsl.g:383:1: ruleGeneralEntity returns [EObject current=null] : (otherlv_0= 'generalEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' ) ;
    public final EObject ruleGeneralEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:389:2: ( (otherlv_0= 'generalEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:390:2: (otherlv_0= 'generalEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:390:2: (otherlv_0= 'generalEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' )
            // InternalDsl.g:391:3: otherlv_0= 'generalEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralEntityAccess().getGeneralEntityKeyword_0());
            		
            // InternalDsl.g:395:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:396:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:396:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:397:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGeneralEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:417:3: ( (lv_properties_3_0= ruleProperty ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:418:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalDsl.g:418:4: (lv_properties_3_0= ruleProperty )
            	    // InternalDsl.g:419:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralEntityAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneralEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralEntityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGeneralEntity"


    // $ANTLR start "entryRuleProperty"
    // InternalDsl.g:444:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDsl.g:444:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalDsl.g:445:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDsl.g:451:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:457:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDsl.g:458:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDsl.g:458:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDsl.g:459:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
            		
            // InternalDsl.g:463:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:464:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:464:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:465:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleSpecialEntity"
    // InternalDsl.g:485:1: entryRuleSpecialEntity returns [EObject current=null] : iv_ruleSpecialEntity= ruleSpecialEntity EOF ;
    public final EObject entryRuleSpecialEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialEntity = null;


        try {
            // InternalDsl.g:485:54: (iv_ruleSpecialEntity= ruleSpecialEntity EOF )
            // InternalDsl.g:486:2: iv_ruleSpecialEntity= ruleSpecialEntity EOF
            {
             newCompositeNode(grammarAccess.getSpecialEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecialEntity=ruleSpecialEntity();

            state._fsp--;

             current =iv_ruleSpecialEntity; 
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
    // $ANTLR end "entryRuleSpecialEntity"


    // $ANTLR start "ruleSpecialEntity"
    // InternalDsl.g:492:1: ruleSpecialEntity returns [EObject current=null] : (otherlv_0= 'specialEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ruleRole ( (lv_transactions_5_0= ruleTransaction ) )+ otherlv_6= '}' ) ;
    public final EObject ruleSpecialEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_properties_3_0 = null;

        EObject lv_transactions_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:498:2: ( (otherlv_0= 'specialEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ruleRole ( (lv_transactions_5_0= ruleTransaction ) )+ otherlv_6= '}' ) )
            // InternalDsl.g:499:2: (otherlv_0= 'specialEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ruleRole ( (lv_transactions_5_0= ruleTransaction ) )+ otherlv_6= '}' )
            {
            // InternalDsl.g:499:2: (otherlv_0= 'specialEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ruleRole ( (lv_transactions_5_0= ruleTransaction ) )+ otherlv_6= '}' )
            // InternalDsl.g:500:3: otherlv_0= 'specialEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ruleRole ( (lv_transactions_5_0= ruleTransaction ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecialEntityAccess().getSpecialEntityKeyword_0());
            		
            // InternalDsl.g:504:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:505:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:505:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:506:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpecialEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecialEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecialEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:526:3: ( (lv_properties_3_0= ruleProperty ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:527:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalDsl.g:527:4: (lv_properties_3_0= ruleProperty )
            	    // InternalDsl.g:528:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getSpecialEntityAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecialEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            			newCompositeNode(grammarAccess.getSpecialEntityAccess().getRoleParserRuleCall_4());
            		
            pushFollow(FOLLOW_6);
            ruleRole();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:552:3: ( (lv_transactions_5_0= ruleTransaction ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:553:4: (lv_transactions_5_0= ruleTransaction )
            	    {
            	    // InternalDsl.g:553:4: (lv_transactions_5_0= ruleTransaction )
            	    // InternalDsl.g:554:5: lv_transactions_5_0= ruleTransaction
            	    {

            	    					newCompositeNode(grammarAccess.getSpecialEntityAccess().getTransactionsTransactionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_transactions_5_0=ruleTransaction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecialEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transactions",
            	    						lv_transactions_5_0,
            	    						"org.xtext.casino.dsl.Dsl.Transaction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSpecialEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSpecialEntity"


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:579:1: entryRuleRole returns [String current=null] : iv_ruleRole= ruleRole EOF ;
    public final String entryRuleRole() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRole = null;


        try {
            // InternalDsl.g:579:44: (iv_ruleRole= ruleRole EOF )
            // InternalDsl.g:580:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole.getText(); 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:586:1: ruleRole returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Admin' | kw= 'Aux' ) ;
    public final AntlrDatatypeRuleToken ruleRole() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:592:2: ( (kw= 'Admin' | kw= 'Aux' ) )
            // InternalDsl.g:593:2: (kw= 'Admin' | kw= 'Aux' )
            {
            // InternalDsl.g:593:2: (kw= 'Admin' | kw= 'Aux' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:594:3: kw= 'Admin'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRoleAccess().getAdminKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:600:3: kw= 'Aux'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRoleAccess().getAuxKeyword_1());
                    		

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleTransaction"
    // InternalDsl.g:609:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // InternalDsl.g:609:52: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalDsl.g:610:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
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
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalDsl.g:616:1: ruleTransaction returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'type:' ruleSubTransaction otherlv_3= 'operates_on:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= '}' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_GeneralEntity_4 = null;



        	enterRule();

        try {
            // InternalDsl.g:622:2: ( (otherlv_0= '{' otherlv_1= 'type:' ruleSubTransaction otherlv_3= 'operates_on:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= '}' ) )
            // InternalDsl.g:623:2: (otherlv_0= '{' otherlv_1= 'type:' ruleSubTransaction otherlv_3= 'operates_on:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= '}' )
            {
            // InternalDsl.g:623:2: (otherlv_0= '{' otherlv_1= 'type:' ruleSubTransaction otherlv_3= 'operates_on:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= '}' )
            // InternalDsl.g:624:3: otherlv_0= '{' otherlv_1= 'type:' ruleSubTransaction otherlv_3= 'operates_on:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getTypeKeyword_1());
            		

            			newCompositeNode(grammarAccess.getTransactionAccess().getSubTransactionParserRuleCall_2());
            		
            pushFollow(FOLLOW_20);
            ruleSubTransaction();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTransactionAccess().getOperates_onKeyword_3());
            		

            			newCompositeNode(grammarAccess.getTransactionAccess().getGeneralEntityParserRuleCall_4());
            		
            pushFollow(FOLLOW_14);
            this_GeneralEntity_4=ruleGeneralEntity();

            state._fsp--;


            			current = this_GeneralEntity_4;
            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleSubTransaction"
    // InternalDsl.g:659:1: entryRuleSubTransaction returns [String current=null] : iv_ruleSubTransaction= ruleSubTransaction EOF ;
    public final String entryRuleSubTransaction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubTransaction = null;


        try {
            // InternalDsl.g:659:54: (iv_ruleSubTransaction= ruleSubTransaction EOF )
            // InternalDsl.g:660:2: iv_ruleSubTransaction= ruleSubTransaction EOF
            {
             newCompositeNode(grammarAccess.getSubTransactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubTransaction=ruleSubTransaction();

            state._fsp--;

             current =iv_ruleSubTransaction.getText(); 
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
    // $ANTLR end "entryRuleSubTransaction"


    // $ANTLR start "ruleSubTransaction"
    // InternalDsl.g:666:1: ruleSubTransaction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Exchange' | kw= 'Sale' ) ;
    public final AntlrDatatypeRuleToken ruleSubTransaction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:672:2: ( (kw= 'Exchange' | kw= 'Sale' ) )
            // InternalDsl.g:673:2: (kw= 'Exchange' | kw= 'Sale' )
            {
            // InternalDsl.g:673:2: (kw= 'Exchange' | kw= 'Sale' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:674:3: kw= 'Exchange'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubTransactionAccess().getExchangeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:680:3: kw= 'Sale'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubTransactionAccess().getSaleKeyword_1());
                    		

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
    // $ANTLR end "ruleSubTransaction"


    // $ANTLR start "entryRuleRelationDom"
    // InternalDsl.g:689:1: entryRuleRelationDom returns [EObject current=null] : iv_ruleRelationDom= ruleRelationDom EOF ;
    public final EObject entryRuleRelationDom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDom = null;


        try {
            // InternalDsl.g:689:52: (iv_ruleRelationDom= ruleRelationDom EOF )
            // InternalDsl.g:690:2: iv_ruleRelationDom= ruleRelationDom EOF
            {
             newCompositeNode(grammarAccess.getRelationDomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationDom=ruleRelationDom();

            state._fsp--;

             current =iv_ruleRelationDom; 
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
    // $ANTLR end "entryRuleRelationDom"


    // $ANTLR start "ruleRelationDom"
    // InternalDsl.g:696:1: ruleRelationDom returns [EObject current=null] : ( (otherlv_0= '{' otherlv_1= 'type:' otherlv_2= 'Composition' otherlv_3= 'source:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= 'target:' ( (otherlv_6= RULE_ID ) ) ) | ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ) ;
    public final EObject ruleRelationDom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject this_GeneralEntity_4 = null;



        	enterRule();

        try {
            // InternalDsl.g:702:2: ( ( (otherlv_0= '{' otherlv_1= 'type:' otherlv_2= 'Composition' otherlv_3= 'source:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= 'target:' ( (otherlv_6= RULE_ID ) ) ) | ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ) )
            // InternalDsl.g:703:2: ( (otherlv_0= '{' otherlv_1= 'type:' otherlv_2= 'Composition' otherlv_3= 'source:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= 'target:' ( (otherlv_6= RULE_ID ) ) ) | ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            {
            // InternalDsl.g:703:2: ( (otherlv_0= '{' otherlv_1= 'type:' otherlv_2= 'Composition' otherlv_3= 'source:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= 'target:' ( (otherlv_6= RULE_ID ) ) ) | ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:704:3: (otherlv_0= '{' otherlv_1= 'type:' otherlv_2= 'Composition' otherlv_3= 'source:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= 'target:' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalDsl.g:704:3: (otherlv_0= '{' otherlv_1= 'type:' otherlv_2= 'Composition' otherlv_3= 'source:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= 'target:' ( (otherlv_6= RULE_ID ) ) )
                    // InternalDsl.g:705:4: otherlv_0= '{' otherlv_1= 'type:' otherlv_2= 'Composition' otherlv_3= 'source:' this_GeneralEntity_4= ruleGeneralEntity otherlv_5= 'target:' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelationDomAccess().getLeftCurlyBracketKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationDomAccess().getTypeKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationDomAccess().getCompositionKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationDomAccess().getSourceKeyword_0_3());
                    			

                    				newCompositeNode(grammarAccess.getRelationDomAccess().getGeneralEntityParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_24);
                    this_GeneralEntity_4=ruleGeneralEntity();

                    state._fsp--;


                    				current = this_GeneralEntity_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationDomAccess().getTargetKeyword_0_5());
                    			
                    // InternalDsl.g:733:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDsl.g:734:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDsl.g:734:5: (otherlv_6= RULE_ID )
                    // InternalDsl.g:735:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationDomRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getRelationDomAccess().getTypeSpecialEntityCrossReference_0_6_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:748:3: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
                    {
                    // InternalDsl.g:748:3: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
                    // InternalDsl.g:749:4: ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
                    {
                    // InternalDsl.g:749:4: ( (otherlv_7= RULE_ID ) )
                    // InternalDsl.g:750:5: (otherlv_7= RULE_ID )
                    {
                    // InternalDsl.g:750:5: (otherlv_7= RULE_ID )
                    // InternalDsl.g:751:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationDomRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_7, grammarAccess.getRelationDomAccess().getTypeGeneralEntityCrossReference_1_0_0());
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelationDomAccess().getRightCurlyBracketKeyword_1_1());
                    			

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
    // $ANTLR end "ruleRelationDom"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000140800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});

}