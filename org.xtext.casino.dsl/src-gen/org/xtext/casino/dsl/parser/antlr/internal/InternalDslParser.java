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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Casino'", "'{'", "'}'", "'domain'", "'module'", "'submodule'", "'op'", "'type:'", "'operates_on:'", "'Read'", "'Create'", "'generalEntity'", "':'", "'dataType'", "'specialEntity'", "'trx'", "'exchange'", "'sale'", "'rel'", "'Composition'", "'source:'", "'target:'", "'arch'", "'component'", "'Back'", "'Front'", "'layer'", "'JavaScript'", "'Ejb'", "'War'", "'layerSegment'", "'Services'", "'Ui'", "'Store'", "'RestEntity'", "'Pojo'", "'Facade'", "'Dto'", "'Util'", "'Containers'", "'allowedToUse:'", "'sublayerSegment'", "'Actions'", "'Reducers'", "'relationArch'", "','", "'tech'", "'javaApp'", "'reactApp'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "System";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalDsl.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalDsl.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalDsl.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalDsl.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'Casino' otherlv_1= '{' ( (lv_dom_2_0= ruleDomain ) ) ( (lv_arch_3_0= ruleArchitecture ) ) ( (lv_tech_4_0= ruleTechnology ) ) otherlv_5= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_dom_2_0 = null;

        EObject lv_arch_3_0 = null;

        EObject lv_tech_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= 'Casino' otherlv_1= '{' ( (lv_dom_2_0= ruleDomain ) ) ( (lv_arch_3_0= ruleArchitecture ) ) ( (lv_tech_4_0= ruleTechnology ) ) otherlv_5= '}' ) )
            // InternalDsl.g:78:2: (otherlv_0= 'Casino' otherlv_1= '{' ( (lv_dom_2_0= ruleDomain ) ) ( (lv_arch_3_0= ruleArchitecture ) ) ( (lv_tech_4_0= ruleTechnology ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:78:2: (otherlv_0= 'Casino' otherlv_1= '{' ( (lv_dom_2_0= ruleDomain ) ) ( (lv_arch_3_0= ruleArchitecture ) ) ( (lv_tech_4_0= ruleTechnology ) ) otherlv_5= '}' )
            // InternalDsl.g:79:3: otherlv_0= 'Casino' otherlv_1= '{' ( (lv_dom_2_0= ruleDomain ) ) ( (lv_arch_3_0= ruleArchitecture ) ) ( (lv_tech_4_0= ruleTechnology ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getCasinoKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:87:3: ( (lv_dom_2_0= ruleDomain ) )
            // InternalDsl.g:88:4: (lv_dom_2_0= ruleDomain )
            {
            // InternalDsl.g:88:4: (lv_dom_2_0= ruleDomain )
            // InternalDsl.g:89:5: lv_dom_2_0= ruleDomain
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getDomDomainParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_dom_2_0=ruleDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"dom",
            						lv_dom_2_0,
            						"org.xtext.casino.dsl.Dsl.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:106:3: ( (lv_arch_3_0= ruleArchitecture ) )
            // InternalDsl.g:107:4: (lv_arch_3_0= ruleArchitecture )
            {
            // InternalDsl.g:107:4: (lv_arch_3_0= ruleArchitecture )
            // InternalDsl.g:108:5: lv_arch_3_0= ruleArchitecture
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getArchArchitectureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_arch_3_0=ruleArchitecture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"arch",
            						lv_arch_3_0,
            						"org.xtext.casino.dsl.Dsl.Architecture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:125:3: ( (lv_tech_4_0= ruleTechnology ) )
            // InternalDsl.g:126:4: (lv_tech_4_0= ruleTechnology )
            {
            // InternalDsl.g:126:4: (lv_tech_4_0= ruleTechnology )
            // InternalDsl.g:127:5: lv_tech_4_0= ruleTechnology
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getTechTechnologyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_tech_4_0=ruleTechnology();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"tech",
            						lv_tech_4_0,
            						"org.xtext.casino.dsl.Dsl.Technology");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleDomain"
    // InternalDsl.g:152:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalDsl.g:152:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalDsl.g:153:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalDsl.g:159:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'domain' otherlv_1= '{' ( (lv_types_2_0= ruleType ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_types_2_0 = null;

        EObject lv_modules_3_0 = null;

        EObject lv_relations_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:165:2: ( (otherlv_0= 'domain' otherlv_1= '{' ( (lv_types_2_0= ruleType ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}' ) )
            // InternalDsl.g:166:2: (otherlv_0= 'domain' otherlv_1= '{' ( (lv_types_2_0= ruleType ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}' )
            {
            // InternalDsl.g:166:2: (otherlv_0= 'domain' otherlv_1= '{' ( (lv_types_2_0= ruleType ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}' )
            // InternalDsl.g:167:3: otherlv_0= 'domain' otherlv_1= '{' ( (lv_types_2_0= ruleType ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:175:3: ( (lv_types_2_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:176:4: (lv_types_2_0= ruleType )
            	    {
            	    // InternalDsl.g:176:4: (lv_types_2_0= ruleType )
            	    // InternalDsl.g:177:5: lv_types_2_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getTypesTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_types_2_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_2_0,
            	    						"org.xtext.casino.dsl.Dsl.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:194:3: ( (lv_modules_3_0= ruleModule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:195:4: (lv_modules_3_0= ruleModule )
            	    {
            	    // InternalDsl.g:195:4: (lv_modules_3_0= ruleModule )
            	    // InternalDsl.g:196:5: lv_modules_3_0= ruleModule
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getModulesModuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_modules_3_0=ruleModule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Module");
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

            // InternalDsl.g:213:3: ( (lv_relations_4_0= ruleRelationDom ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:214:4: (lv_relations_4_0= ruleRelationDom )
            	    {
            	    // InternalDsl.g:214:4: (lv_relations_4_0= ruleRelationDom )
            	    // InternalDsl.g:215:5: lv_relations_4_0= ruleRelationDom
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getRelationsRelationDomParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_relations_4_0=ruleRelationDom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_4_0,
            	    						"org.xtext.casino.dsl.Dsl.RelationDom");
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

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalDsl.g:240:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalDsl.g:240:47: (iv_ruleModule= ruleModule EOF )
            // InternalDsl.g:241:2: iv_ruleModule= ruleModule EOF
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
    // InternalDsl.g:247:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_submodules_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:253:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:254:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:254:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' )
            // InternalDsl.g:255:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalDsl.g:259:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:260:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:260:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:261:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:281:3: ( (lv_submodules_3_0= ruleSubmodule ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:282:4: (lv_submodules_3_0= ruleSubmodule )
            	    {
            	    // InternalDsl.g:282:4: (lv_submodules_3_0= ruleSubmodule )
            	    // InternalDsl.g:283:5: lv_submodules_3_0= ruleSubmodule
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getSubmodulesSubmoduleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalDsl.g:308:1: entryRuleSubmodule returns [EObject current=null] : iv_ruleSubmodule= ruleSubmodule EOF ;
    public final EObject entryRuleSubmodule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodule = null;


        try {
            // InternalDsl.g:308:50: (iv_ruleSubmodule= ruleSubmodule EOF )
            // InternalDsl.g:309:2: iv_ruleSubmodule= ruleSubmodule EOF
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
    // InternalDsl.g:315:1: ruleSubmodule returns [EObject current=null] : (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity ) ) )+ otherlv_5= '}' ) ;
    public final EObject ruleSubmodule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_operations_3_0 = null;

        EObject lv_entities_4_1 = null;

        EObject lv_entities_4_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:321:2: ( (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity ) ) )+ otherlv_5= '}' ) )
            // InternalDsl.g:322:2: (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity ) ) )+ otherlv_5= '}' )
            {
            // InternalDsl.g:322:2: (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity ) ) )+ otherlv_5= '}' )
            // InternalDsl.g:323:3: otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( ( (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmoduleAccess().getSubmoduleKeyword_0());
            		
            // InternalDsl.g:327:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:328:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:328:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:329:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSubmoduleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:349:3: ( (lv_operations_3_0= ruleOperation ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:350:4: (lv_operations_3_0= ruleOperation )
            	    {
            	    // InternalDsl.g:350:4: (lv_operations_3_0= ruleOperation )
            	    // InternalDsl.g:351:5: lv_operations_3_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getSubmoduleAccess().getOperationsOperationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalDsl.g:368:3: ( ( (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22||LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:369:4: ( (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity ) )
            	    {
            	    // InternalDsl.g:369:4: ( (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity ) )
            	    // InternalDsl.g:370:5: (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity )
            	    {
            	    // InternalDsl.g:370:5: (lv_entities_4_1= ruleGeneralEntity | lv_entities_4_2= ruleSpecialEntity )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==22) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==25) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalDsl.g:371:6: lv_entities_4_1= ruleGeneralEntity
            	            {

            	            						newCompositeNode(grammarAccess.getSubmoduleAccess().getEntitiesGeneralEntityParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_entities_4_1=ruleGeneralEntity();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubmoduleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"entities",
            	            							lv_entities_4_1,
            	            							"org.xtext.casino.dsl.Dsl.GeneralEntity");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:387:6: lv_entities_4_2= ruleSpecialEntity
            	            {

            	            						newCompositeNode(grammarAccess.getSubmoduleAccess().getEntitiesSpecialEntityParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_entities_4_2=ruleSpecialEntity();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubmoduleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"entities",
            	            							lv_entities_4_2,
            	            							"org.xtext.casino.dsl.Dsl.SpecialEntity");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubmoduleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalDsl.g:413:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalDsl.g:413:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalDsl.g:414:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // InternalDsl.g:420:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntityName ) ) otherlv_6= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_target_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:426:2: ( (otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntityName ) ) otherlv_6= '}' ) )
            // InternalDsl.g:427:2: (otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntityName ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:427:2: (otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntityName ) ) otherlv_6= '}' )
            // InternalDsl.g:428:3: otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntityName ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOpKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getTypeKeyword_2());
            		

            			newCompositeNode(grammarAccess.getOperationAccess().getSubOperationParserRuleCall_3());
            		
            pushFollow(FOLLOW_19);
            ruleSubOperation();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getOperates_onKeyword_4());
            		
            // InternalDsl.g:451:3: ( (lv_target_5_0= ruleEntityName ) )
            // InternalDsl.g:452:4: (lv_target_5_0= ruleEntityName )
            {
            // InternalDsl.g:452:4: (lv_target_5_0= ruleEntityName )
            // InternalDsl.g:453:5: lv_target_5_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getTargetEntityNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_target_5_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					add(
            						current,
            						"target",
            						lv_target_5_0,
            						"org.xtext.casino.dsl.Dsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleEntityName"
    // InternalDsl.g:478:1: entryRuleEntityName returns [EObject current=null] : iv_ruleEntityName= ruleEntityName EOF ;
    public final EObject entryRuleEntityName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityName = null;


        try {
            // InternalDsl.g:478:51: (iv_ruleEntityName= ruleEntityName EOF )
            // InternalDsl.g:479:2: iv_ruleEntityName= ruleEntityName EOF
            {
             newCompositeNode(grammarAccess.getEntityNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityName=ruleEntityName();

            state._fsp--;

             current =iv_ruleEntityName; 
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
    // $ANTLR end "entryRuleEntityName"


    // $ANTLR start "ruleEntityName"
    // InternalDsl.g:485:1: ruleEntityName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEntityName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:491:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDsl.g:492:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDsl.g:492:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:493:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:493:3: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:494:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEntityName"


    // $ANTLR start "entryRuleSubOperation"
    // InternalDsl.g:513:1: entryRuleSubOperation returns [String current=null] : iv_ruleSubOperation= ruleSubOperation EOF ;
    public final String entryRuleSubOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubOperation = null;


        try {
            // InternalDsl.g:513:52: (iv_ruleSubOperation= ruleSubOperation EOF )
            // InternalDsl.g:514:2: iv_ruleSubOperation= ruleSubOperation EOF
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
    // InternalDsl.g:520:1: ruleSubOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Read' | kw= 'Create' ) ;
    public final AntlrDatatypeRuleToken ruleSubOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:526:2: ( (kw= 'Read' | kw= 'Create' ) )
            // InternalDsl.g:527:2: (kw= 'Read' | kw= 'Create' )
            {
            // InternalDsl.g:527:2: (kw= 'Read' | kw= 'Create' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:528:3: kw= 'Read'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubOperationAccess().getReadKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:534:3: kw= 'Create'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDsl.g:543:1: entryRuleGeneralEntity returns [EObject current=null] : iv_ruleGeneralEntity= ruleGeneralEntity EOF ;
    public final EObject entryRuleGeneralEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralEntity = null;


        try {
            // InternalDsl.g:543:54: (iv_ruleGeneralEntity= ruleGeneralEntity EOF )
            // InternalDsl.g:544:2: iv_ruleGeneralEntity= ruleGeneralEntity EOF
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
    // InternalDsl.g:550:1: ruleGeneralEntity returns [EObject current=null] : (otherlv_0= 'generalEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' ) ;
    public final EObject ruleGeneralEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_EntityName_1 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:556:2: ( (otherlv_0= 'generalEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:557:2: (otherlv_0= 'generalEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:557:2: (otherlv_0= 'generalEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' )
            // InternalDsl.g:558:3: otherlv_0= 'generalEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralEntityAccess().getGeneralEntityKeyword_0());
            		

            			newCompositeNode(grammarAccess.getGeneralEntityAccess().getEntityNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            this_EntityName_1=ruleEntityName();

            state._fsp--;


            			current = this_EntityName_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:574:3: ( (lv_properties_3_0= ruleProperty ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:575:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalDsl.g:575:4: (lv_properties_3_0= ruleProperty )
            	    // InternalDsl.g:576:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralEntityAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalDsl.g:601:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDsl.g:601:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalDsl.g:602:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalDsl.g:608:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDsl.g:614:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDsl.g:615:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDsl.g:615:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalDsl.g:616:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDsl.g:616:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:617:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:617:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:618:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
            		
            // InternalDsl.g:638:3: ( (otherlv_2= RULE_ID ) )
            // InternalDsl.g:639:4: (otherlv_2= RULE_ID )
            {
            // InternalDsl.g:639:4: (otherlv_2= RULE_ID )
            // InternalDsl.g:640:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0());
            				

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


    // $ANTLR start "entryRuleType"
    // InternalDsl.g:655:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDsl.g:655:45: (iv_ruleType= ruleType EOF )
            // InternalDsl.g:656:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDsl.g:662:1: ruleType returns [EObject current=null] : (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:668:2: ( (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDsl.g:669:2: (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDsl.g:669:2: (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDsl.g:670:3: otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getDataTypeKeyword_0());
            		
            // InternalDsl.g:674:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:675:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:675:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:676:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSpecialEntity"
    // InternalDsl.g:696:1: entryRuleSpecialEntity returns [EObject current=null] : iv_ruleSpecialEntity= ruleSpecialEntity EOF ;
    public final EObject entryRuleSpecialEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialEntity = null;


        try {
            // InternalDsl.g:696:54: (iv_ruleSpecialEntity= ruleSpecialEntity EOF )
            // InternalDsl.g:697:2: iv_ruleSpecialEntity= ruleSpecialEntity EOF
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
    // InternalDsl.g:703:1: ruleSpecialEntity returns [EObject current=null] : (otherlv_0= 'specialEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}' ) ;
    public final EObject ruleSpecialEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_EntityName_1 = null;

        EObject lv_properties_3_0 = null;

        EObject lv_transactions_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:709:2: ( (otherlv_0= 'specialEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}' ) )
            // InternalDsl.g:710:2: (otherlv_0= 'specialEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}' )
            {
            // InternalDsl.g:710:2: (otherlv_0= 'specialEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}' )
            // InternalDsl.g:711:3: otherlv_0= 'specialEntity' this_EntityName_1= ruleEntityName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecialEntityAccess().getSpecialEntityKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSpecialEntityAccess().getEntityNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            this_EntityName_1=ruleEntityName();

            state._fsp--;


            			current = this_EntityName_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecialEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:727:3: ( (lv_properties_3_0= ruleProperty ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:728:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalDsl.g:728:4: (lv_properties_3_0= ruleProperty )
            	    // InternalDsl.g:729:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getSpecialEntityAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalDsl.g:746:3: ( (lv_transactions_4_0= ruleTransaction ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:747:4: (lv_transactions_4_0= ruleTransaction )
            	    {
            	    // InternalDsl.g:747:4: (lv_transactions_4_0= ruleTransaction )
            	    // InternalDsl.g:748:5: lv_transactions_4_0= ruleTransaction
            	    {

            	    					newCompositeNode(grammarAccess.getSpecialEntityAccess().getTransactionsTransactionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_transactions_4_0=ruleTransaction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecialEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transactions",
            	    						lv_transactions_4_0,
            	    						"org.xtext.casino.dsl.Dsl.Transaction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSpecialEntityAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleTransaction"
    // InternalDsl.g:773:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // InternalDsl.g:773:52: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalDsl.g:774:2: iv_ruleTransaction= ruleTransaction EOF
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
    // InternalDsl.g:780:1: ruleTransaction returns [EObject current=null] : (otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_operateson_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:786:2: ( (otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}' ) )
            // InternalDsl.g:787:2: (otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}' )
            {
            // InternalDsl.g:787:2: (otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}' )
            // InternalDsl.g:788:3: otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getTrxKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getTransactionAccess().getTypeKeyword_2());
            		

            			newCompositeNode(grammarAccess.getTransactionAccess().getSubTransactionParserRuleCall_3());
            		
            pushFollow(FOLLOW_19);
            ruleSubTransaction();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:807:3: ( (lv_operateson_4_0= ruleOperateson ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:808:4: (lv_operateson_4_0= ruleOperateson )
            	    {
            	    // InternalDsl.g:808:4: (lv_operateson_4_0= ruleOperateson )
            	    // InternalDsl.g:809:5: lv_operateson_4_0= ruleOperateson
            	    {

            	    					newCompositeNode(grammarAccess.getTransactionAccess().getOperatesonOperatesonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_operateson_4_0=ruleOperateson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransactionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operateson",
            	    						lv_operateson_4_0,
            	    						"org.xtext.casino.dsl.Dsl.Operateson");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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
    // InternalDsl.g:834:1: entryRuleSubTransaction returns [String current=null] : iv_ruleSubTransaction= ruleSubTransaction EOF ;
    public final String entryRuleSubTransaction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubTransaction = null;


        try {
            // InternalDsl.g:834:54: (iv_ruleSubTransaction= ruleSubTransaction EOF )
            // InternalDsl.g:835:2: iv_ruleSubTransaction= ruleSubTransaction EOF
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
    // InternalDsl.g:841:1: ruleSubTransaction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'exchange' | kw= 'sale' ) ;
    public final AntlrDatatypeRuleToken ruleSubTransaction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:847:2: ( (kw= 'exchange' | kw= 'sale' ) )
            // InternalDsl.g:848:2: (kw= 'exchange' | kw= 'sale' )
            {
            // InternalDsl.g:848:2: (kw= 'exchange' | kw= 'sale' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:849:3: kw= 'exchange'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubTransactionAccess().getExchangeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:855:3: kw= 'sale'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOperateson"
    // InternalDsl.g:864:1: entryRuleOperateson returns [EObject current=null] : iv_ruleOperateson= ruleOperateson EOF ;
    public final EObject entryRuleOperateson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperateson = null;


        try {
            // InternalDsl.g:864:51: (iv_ruleOperateson= ruleOperateson EOF )
            // InternalDsl.g:865:2: iv_ruleOperateson= ruleOperateson EOF
            {
             newCompositeNode(grammarAccess.getOperatesonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperateson=ruleOperateson();

            state._fsp--;

             current =iv_ruleOperateson; 
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
    // $ANTLR end "entryRuleOperateson"


    // $ANTLR start "ruleOperateson"
    // InternalDsl.g:871:1: ruleOperateson returns [EObject current=null] : (otherlv_0= 'operates_on:' ( (lv_operateson_1_0= ruleEntityName ) ) ) ;
    public final EObject ruleOperateson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operateson_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:877:2: ( (otherlv_0= 'operates_on:' ( (lv_operateson_1_0= ruleEntityName ) ) ) )
            // InternalDsl.g:878:2: (otherlv_0= 'operates_on:' ( (lv_operateson_1_0= ruleEntityName ) ) )
            {
            // InternalDsl.g:878:2: (otherlv_0= 'operates_on:' ( (lv_operateson_1_0= ruleEntityName ) ) )
            // InternalDsl.g:879:3: otherlv_0= 'operates_on:' ( (lv_operateson_1_0= ruleEntityName ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getOperatesonAccess().getOperates_onKeyword_0());
            		
            // InternalDsl.g:883:3: ( (lv_operateson_1_0= ruleEntityName ) )
            // InternalDsl.g:884:4: (lv_operateson_1_0= ruleEntityName )
            {
            // InternalDsl.g:884:4: (lv_operateson_1_0= ruleEntityName )
            // InternalDsl.g:885:5: lv_operateson_1_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getOperatesonAccess().getOperatesonEntityNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operateson_1_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperatesonRule());
            					}
            					add(
            						current,
            						"operateson",
            						lv_operateson_1_0,
            						"org.xtext.casino.dsl.Dsl.EntityName");
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
    // $ANTLR end "ruleOperateson"


    // $ANTLR start "entryRuleRelationDom"
    // InternalDsl.g:906:1: entryRuleRelationDom returns [EObject current=null] : iv_ruleRelationDom= ruleRelationDom EOF ;
    public final EObject entryRuleRelationDom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDom = null;


        try {
            // InternalDsl.g:906:52: (iv_ruleRelationDom= ruleRelationDom EOF )
            // InternalDsl.g:907:2: iv_ruleRelationDom= ruleRelationDom EOF
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
    // InternalDsl.g:913:1: ruleRelationDom returns [EObject current=null] : (otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (lv_source_5_0= ruleEntityName ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntityName ) ) otherlv_8= '}' ) ;
    public final EObject ruleRelationDom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_source_5_0 = null;

        EObject lv_target_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:919:2: ( (otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (lv_source_5_0= ruleEntityName ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntityName ) ) otherlv_8= '}' ) )
            // InternalDsl.g:920:2: (otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (lv_source_5_0= ruleEntityName ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntityName ) ) otherlv_8= '}' )
            {
            // InternalDsl.g:920:2: (otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (lv_source_5_0= ruleEntityName ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntityName ) ) otherlv_8= '}' )
            // InternalDsl.g:921:3: otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (lv_source_5_0= ruleEntityName ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntityName ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationDomAccess().getRelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationDomAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationDomAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationDomAccess().getCompositionKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationDomAccess().getSourceKeyword_4());
            		
            // InternalDsl.g:941:3: ( (lv_source_5_0= ruleEntityName ) )
            // InternalDsl.g:942:4: (lv_source_5_0= ruleEntityName )
            {
            // InternalDsl.g:942:4: (lv_source_5_0= ruleEntityName )
            // InternalDsl.g:943:5: lv_source_5_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getRelationDomAccess().getSourceEntityNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_source_5_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationDomRule());
            					}
            					add(
            						current,
            						"source",
            						lv_source_5_0,
            						"org.xtext.casino.dsl.Dsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationDomAccess().getTargetKeyword_6());
            		
            // InternalDsl.g:964:3: ( (lv_target_7_0= ruleEntityName ) )
            // InternalDsl.g:965:4: (lv_target_7_0= ruleEntityName )
            {
            // InternalDsl.g:965:4: (lv_target_7_0= ruleEntityName )
            // InternalDsl.g:966:5: lv_target_7_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getRelationDomAccess().getTargetEntityNameParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_target_7_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationDomRule());
            					}
            					add(
            						current,
            						"target",
            						lv_target_7_0,
            						"org.xtext.casino.dsl.Dsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRelationDomAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleArchitecture"
    // InternalDsl.g:991:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalDsl.g:991:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalDsl.g:992:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalDsl.g:998:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'arch' otherlv_1= '{' ( (lv_componentes_2_0= ruleComponent ) )+ ( (lv_relationArch_3_0= ruleRelationArch ) )+ otherlv_4= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_componentes_2_0 = null;

        EObject lv_relationArch_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1004:2: ( (otherlv_0= 'arch' otherlv_1= '{' ( (lv_componentes_2_0= ruleComponent ) )+ ( (lv_relationArch_3_0= ruleRelationArch ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:1005:2: (otherlv_0= 'arch' otherlv_1= '{' ( (lv_componentes_2_0= ruleComponent ) )+ ( (lv_relationArch_3_0= ruleRelationArch ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:1005:2: (otherlv_0= 'arch' otherlv_1= '{' ( (lv_componentes_2_0= ruleComponent ) )+ ( (lv_relationArch_3_0= ruleRelationArch ) )+ otherlv_4= '}' )
            // InternalDsl.g:1006:3: otherlv_0= 'arch' otherlv_1= '{' ( (lv_componentes_2_0= ruleComponent ) )+ ( (lv_relationArch_3_0= ruleRelationArch ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1014:3: ( (lv_componentes_2_0= ruleComponent ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1015:4: (lv_componentes_2_0= ruleComponent )
            	    {
            	    // InternalDsl.g:1015:4: (lv_componentes_2_0= ruleComponent )
            	    // InternalDsl.g:1016:5: lv_componentes_2_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getComponentesComponentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_componentes_2_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentes",
            	    						lv_componentes_2_0,
            	    						"org.xtext.casino.dsl.Dsl.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalDsl.g:1033:3: ( (lv_relationArch_3_0= ruleRelationArch ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==55) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1034:4: (lv_relationArch_3_0= ruleRelationArch )
            	    {
            	    // InternalDsl.g:1034:4: (lv_relationArch_3_0= ruleRelationArch )
            	    // InternalDsl.g:1035:5: lv_relationArch_3_0= ruleRelationArch
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getRelationArchRelationArchParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_relationArch_3_0=ruleRelationArch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationArch",
            	    						lv_relationArch_3_0,
            	    						"org.xtext.casino.dsl.Dsl.RelationArch");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleComponent"
    // InternalDsl.g:1060:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDsl.g:1060:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDsl.g:1061:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDsl.g:1067:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ruleComponentName otherlv_2= '{' ( (lv_layer_3_0= ruleLayer ) )+ otherlv_4= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_layer_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1073:2: ( (otherlv_0= 'component' ruleComponentName otherlv_2= '{' ( (lv_layer_3_0= ruleLayer ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:1074:2: (otherlv_0= 'component' ruleComponentName otherlv_2= '{' ( (lv_layer_3_0= ruleLayer ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:1074:2: (otherlv_0= 'component' ruleComponentName otherlv_2= '{' ( (lv_layer_3_0= ruleLayer ) )+ otherlv_4= '}' )
            // InternalDsl.g:1075:3: otherlv_0= 'component' ruleComponentName otherlv_2= '{' ( (lv_layer_3_0= ruleLayer ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		

            			newCompositeNode(grammarAccess.getComponentAccess().getComponentNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            ruleComponentName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1090:3: ( (lv_layer_3_0= ruleLayer ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1091:4: (lv_layer_3_0= ruleLayer )
            	    {
            	    // InternalDsl.g:1091:4: (lv_layer_3_0= ruleLayer )
            	    // InternalDsl.g:1092:5: lv_layer_3_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getLayerLayerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_layer_3_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layer",
            	    						lv_layer_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentName"
    // InternalDsl.g:1117:1: entryRuleComponentName returns [String current=null] : iv_ruleComponentName= ruleComponentName EOF ;
    public final String entryRuleComponentName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentName = null;


        try {
            // InternalDsl.g:1117:53: (iv_ruleComponentName= ruleComponentName EOF )
            // InternalDsl.g:1118:2: iv_ruleComponentName= ruleComponentName EOF
            {
             newCompositeNode(grammarAccess.getComponentNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentName=ruleComponentName();

            state._fsp--;

             current =iv_ruleComponentName.getText(); 
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
    // $ANTLR end "entryRuleComponentName"


    // $ANTLR start "ruleComponentName"
    // InternalDsl.g:1124:1: ruleComponentName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Back' | kw= 'Front' ) ;
    public final AntlrDatatypeRuleToken ruleComponentName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1130:2: ( (kw= 'Back' | kw= 'Front' ) )
            // InternalDsl.g:1131:2: (kw= 'Back' | kw= 'Front' )
            {
            // InternalDsl.g:1131:2: (kw= 'Back' | kw= 'Front' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1132:3: kw= 'Back'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentNameAccess().getBackKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1138:3: kw= 'Front'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComponentNameAccess().getFrontKeyword_1());
                    		

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
    // $ANTLR end "ruleComponentName"


    // $ANTLR start "entryRuleLayer"
    // InternalDsl.g:1147:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalDsl.g:1147:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalDsl.g:1148:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalDsl.g:1154:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= ruleLayerName ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_layerSegments_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1160:2: ( (otherlv_0= 'layer' ( (lv_name_1_0= ruleLayerName ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}' ) )
            // InternalDsl.g:1161:2: (otherlv_0= 'layer' ( (lv_name_1_0= ruleLayerName ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}' )
            {
            // InternalDsl.g:1161:2: (otherlv_0= 'layer' ( (lv_name_1_0= ruleLayerName ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}' )
            // InternalDsl.g:1162:3: otherlv_0= 'layer' ( (lv_name_1_0= ruleLayerName ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getLayerKeyword_0());
            		
            // InternalDsl.g:1166:3: ( (lv_name_1_0= ruleLayerName ) )
            // InternalDsl.g:1167:4: (lv_name_1_0= ruleLayerName )
            {
            // InternalDsl.g:1167:4: (lv_name_1_0= ruleLayerName )
            // InternalDsl.g:1168:5: lv_name_1_0= ruleLayerName
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getNameLayerNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleLayerName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.casino.dsl.Dsl.LayerName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1189:3: ( (lv_layerSegments_3_0= ruleLayerSegment ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1190:4: (lv_layerSegments_3_0= ruleLayerSegment )
            	    {
            	    // InternalDsl.g:1190:4: (lv_layerSegments_3_0= ruleLayerSegment )
            	    // InternalDsl.g:1191:5: lv_layerSegments_3_0= ruleLayerSegment
            	    {

            	    					newCompositeNode(grammarAccess.getLayerAccess().getLayerSegmentsLayerSegmentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_layerSegments_3_0=ruleLayerSegment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layerSegments",
            	    						lv_layerSegments_3_0,
            	    						"org.xtext.casino.dsl.Dsl.LayerSegment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleLayerName"
    // InternalDsl.g:1216:1: entryRuleLayerName returns [String current=null] : iv_ruleLayerName= ruleLayerName EOF ;
    public final String entryRuleLayerName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLayerName = null;


        try {
            // InternalDsl.g:1216:49: (iv_ruleLayerName= ruleLayerName EOF )
            // InternalDsl.g:1217:2: iv_ruleLayerName= ruleLayerName EOF
            {
             newCompositeNode(grammarAccess.getLayerNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerName=ruleLayerName();

            state._fsp--;

             current =iv_ruleLayerName.getText(); 
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
    // $ANTLR end "entryRuleLayerName"


    // $ANTLR start "ruleLayerName"
    // InternalDsl.g:1223:1: ruleLayerName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'JavaScript' | kw= 'Ejb' | kw= 'War' ) ;
    public final AntlrDatatypeRuleToken ruleLayerName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1229:2: ( (kw= 'JavaScript' | kw= 'Ejb' | kw= 'War' ) )
            // InternalDsl.g:1230:2: (kw= 'JavaScript' | kw= 'Ejb' | kw= 'War' )
            {
            // InternalDsl.g:1230:2: (kw= 'JavaScript' | kw= 'Ejb' | kw= 'War' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1231:3: kw= 'JavaScript'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerNameAccess().getJavaScriptKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1237:3: kw= 'Ejb'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerNameAccess().getEjbKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1243:3: kw= 'War'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerNameAccess().getWarKeyword_2());
                    		

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
    // $ANTLR end "ruleLayerName"


    // $ANTLR start "entryRuleLayerSegment"
    // InternalDsl.g:1252:1: entryRuleLayerSegment returns [EObject current=null] : iv_ruleLayerSegment= ruleLayerSegment EOF ;
    public final EObject entryRuleLayerSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerSegment = null;


        try {
            // InternalDsl.g:1252:53: (iv_ruleLayerSegment= ruleLayerSegment EOF )
            // InternalDsl.g:1253:2: iv_ruleLayerSegment= ruleLayerSegment EOF
            {
             newCompositeNode(grammarAccess.getLayerSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerSegment=ruleLayerSegment();

            state._fsp--;

             current =iv_ruleLayerSegment; 
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
    // $ANTLR end "entryRuleLayerSegment"


    // $ANTLR start "ruleLayerSegment"
    // InternalDsl.g:1259:1: ruleLayerSegment returns [EObject current=null] : (otherlv_0= 'layerSegment' ( (lv_name_1_0= ruleLayerSegmentName ) ) otherlv_2= '{' (otherlv_3= '{' ( (lv_relations_4_0= ruleLayerSegmentRelation ) )* otherlv_5= '}' )? ( (lv_sublayerSegments_6_0= ruleSublayerSegment ) )* otherlv_7= '}' ) ;
    public final EObject ruleLayerSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_relations_4_0 = null;

        EObject lv_sublayerSegments_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1265:2: ( (otherlv_0= 'layerSegment' ( (lv_name_1_0= ruleLayerSegmentName ) ) otherlv_2= '{' (otherlv_3= '{' ( (lv_relations_4_0= ruleLayerSegmentRelation ) )* otherlv_5= '}' )? ( (lv_sublayerSegments_6_0= ruleSublayerSegment ) )* otherlv_7= '}' ) )
            // InternalDsl.g:1266:2: (otherlv_0= 'layerSegment' ( (lv_name_1_0= ruleLayerSegmentName ) ) otherlv_2= '{' (otherlv_3= '{' ( (lv_relations_4_0= ruleLayerSegmentRelation ) )* otherlv_5= '}' )? ( (lv_sublayerSegments_6_0= ruleSublayerSegment ) )* otherlv_7= '}' )
            {
            // InternalDsl.g:1266:2: (otherlv_0= 'layerSegment' ( (lv_name_1_0= ruleLayerSegmentName ) ) otherlv_2= '{' (otherlv_3= '{' ( (lv_relations_4_0= ruleLayerSegmentRelation ) )* otherlv_5= '}' )? ( (lv_sublayerSegments_6_0= ruleSublayerSegment ) )* otherlv_7= '}' )
            // InternalDsl.g:1267:3: otherlv_0= 'layerSegment' ( (lv_name_1_0= ruleLayerSegmentName ) ) otherlv_2= '{' (otherlv_3= '{' ( (lv_relations_4_0= ruleLayerSegmentRelation ) )* otherlv_5= '}' )? ( (lv_sublayerSegments_6_0= ruleSublayerSegment ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerSegmentAccess().getLayerSegmentKeyword_0());
            		
            // InternalDsl.g:1271:3: ( (lv_name_1_0= ruleLayerSegmentName ) )
            // InternalDsl.g:1272:4: (lv_name_1_0= ruleLayerSegmentName )
            {
            // InternalDsl.g:1272:4: (lv_name_1_0= ruleLayerSegmentName )
            // InternalDsl.g:1273:5: lv_name_1_0= ruleLayerSegmentName
            {

            					newCompositeNode(grammarAccess.getLayerSegmentAccess().getNameLayerSegmentNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleLayerSegmentName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerSegmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.casino.dsl.Dsl.LayerSegmentName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getLayerSegmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1294:3: (otherlv_3= '{' ( (lv_relations_4_0= ruleLayerSegmentRelation ) )* otherlv_5= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1295:4: otherlv_3= '{' ( (lv_relations_4_0= ruleLayerSegmentRelation ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getLayerSegmentAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalDsl.g:1299:4: ( (lv_relations_4_0= ruleLayerSegmentRelation ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==51) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDsl.g:1300:5: (lv_relations_4_0= ruleLayerSegmentRelation )
                    	    {
                    	    // InternalDsl.g:1300:5: (lv_relations_4_0= ruleLayerSegmentRelation )
                    	    // InternalDsl.g:1301:6: lv_relations_4_0= ruleLayerSegmentRelation
                    	    {

                    	    						newCompositeNode(grammarAccess.getLayerSegmentAccess().getRelationsLayerSegmentRelationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
                    	    lv_relations_4_0=ruleLayerSegmentRelation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLayerSegmentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"relations",
                    	    							lv_relations_4_0,
                    	    							"org.xtext.casino.dsl.Dsl.LayerSegmentRelation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getLayerSegmentAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1323:3: ( (lv_sublayerSegments_6_0= ruleSublayerSegment ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==52) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:1324:4: (lv_sublayerSegments_6_0= ruleSublayerSegment )
            	    {
            	    // InternalDsl.g:1324:4: (lv_sublayerSegments_6_0= ruleSublayerSegment )
            	    // InternalDsl.g:1325:5: lv_sublayerSegments_6_0= ruleSublayerSegment
            	    {

            	    					newCompositeNode(grammarAccess.getLayerSegmentAccess().getSublayerSegmentsSublayerSegmentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_sublayerSegments_6_0=ruleSublayerSegment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerSegmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sublayerSegments",
            	    						lv_sublayerSegments_6_0,
            	    						"org.xtext.casino.dsl.Dsl.SublayerSegment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLayerSegmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLayerSegment"


    // $ANTLR start "entryRuleLayerSegmentName"
    // InternalDsl.g:1350:1: entryRuleLayerSegmentName returns [String current=null] : iv_ruleLayerSegmentName= ruleLayerSegmentName EOF ;
    public final String entryRuleLayerSegmentName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLayerSegmentName = null;


        try {
            // InternalDsl.g:1350:56: (iv_ruleLayerSegmentName= ruleLayerSegmentName EOF )
            // InternalDsl.g:1351:2: iv_ruleLayerSegmentName= ruleLayerSegmentName EOF
            {
             newCompositeNode(grammarAccess.getLayerSegmentNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerSegmentName=ruleLayerSegmentName();

            state._fsp--;

             current =iv_ruleLayerSegmentName.getText(); 
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
    // $ANTLR end "entryRuleLayerSegmentName"


    // $ANTLR start "ruleLayerSegmentName"
    // InternalDsl.g:1357:1: ruleLayerSegmentName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Services' | kw= 'Ui' | kw= 'Store' | kw= 'RestEntity' | kw= 'Pojo' | kw= 'Facade' | kw= 'Dto' | kw= 'Util' | kw= 'Containers' ) ;
    public final AntlrDatatypeRuleToken ruleLayerSegmentName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1363:2: ( (kw= 'Services' | kw= 'Ui' | kw= 'Store' | kw= 'RestEntity' | kw= 'Pojo' | kw= 'Facade' | kw= 'Dto' | kw= 'Util' | kw= 'Containers' ) )
            // InternalDsl.g:1364:2: (kw= 'Services' | kw= 'Ui' | kw= 'Store' | kw= 'RestEntity' | kw= 'Pojo' | kw= 'Facade' | kw= 'Dto' | kw= 'Util' | kw= 'Containers' )
            {
            // InternalDsl.g:1364:2: (kw= 'Services' | kw= 'Ui' | kw= 'Store' | kw= 'RestEntity' | kw= 'Pojo' | kw= 'Facade' | kw= 'Dto' | kw= 'Util' | kw= 'Containers' )
            int alt23=9;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt23=1;
                }
                break;
            case 43:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            case 45:
                {
                alt23=4;
                }
                break;
            case 46:
                {
                alt23=5;
                }
                break;
            case 47:
                {
                alt23=6;
                }
                break;
            case 48:
                {
                alt23=7;
                }
                break;
            case 49:
                {
                alt23=8;
                }
                break;
            case 50:
                {
                alt23=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1365:3: kw= 'Services'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerSegmentNameAccess().getServicesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1371:3: kw= 'Ui'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerSegmentNameAccess().getUiKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1377:3: kw= 'Store'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerSegmentNameAccess().getStoreKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:1383:3: kw= 'RestEntity'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerSegmentNameAccess().getRestEntityKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:1389:3: kw= 'Pojo'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerSegmentNameAccess().getPojoKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:1395:3: kw= 'Facade'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerSegmentNameAccess().getFacadeKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDsl.g:1401:3: kw= 'Dto'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerSegmentNameAccess().getDtoKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDsl.g:1407:3: kw= 'Util'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerSegmentNameAccess().getUtilKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalDsl.g:1413:3: kw= 'Containers'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerSegmentNameAccess().getContainersKeyword_8());
                    		

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
    // $ANTLR end "ruleLayerSegmentName"


    // $ANTLR start "entryRuleLayerSegmentRelation"
    // InternalDsl.g:1422:1: entryRuleLayerSegmentRelation returns [String current=null] : iv_ruleLayerSegmentRelation= ruleLayerSegmentRelation EOF ;
    public final String entryRuleLayerSegmentRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLayerSegmentRelation = null;


        try {
            // InternalDsl.g:1422:60: (iv_ruleLayerSegmentRelation= ruleLayerSegmentRelation EOF )
            // InternalDsl.g:1423:2: iv_ruleLayerSegmentRelation= ruleLayerSegmentRelation EOF
            {
             newCompositeNode(grammarAccess.getLayerSegmentRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerSegmentRelation=ruleLayerSegmentRelation();

            state._fsp--;

             current =iv_ruleLayerSegmentRelation.getText(); 
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
    // $ANTLR end "entryRuleLayerSegmentRelation"


    // $ANTLR start "ruleLayerSegmentRelation"
    // InternalDsl.g:1429:1: ruleLayerSegmentRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'allowedToUse:' this_LayerSegmentName_1= ruleLayerSegmentName ) ;
    public final AntlrDatatypeRuleToken ruleLayerSegmentRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_LayerSegmentName_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:1435:2: ( (kw= 'allowedToUse:' this_LayerSegmentName_1= ruleLayerSegmentName ) )
            // InternalDsl.g:1436:2: (kw= 'allowedToUse:' this_LayerSegmentName_1= ruleLayerSegmentName )
            {
            // InternalDsl.g:1436:2: (kw= 'allowedToUse:' this_LayerSegmentName_1= ruleLayerSegmentName )
            // InternalDsl.g:1437:3: kw= 'allowedToUse:' this_LayerSegmentName_1= ruleLayerSegmentName
            {
            kw=(Token)match(input,51,FOLLOW_37); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLayerSegmentRelationAccess().getAllowedToUseKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLayerSegmentRelationAccess().getLayerSegmentNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_LayerSegmentName_1=ruleLayerSegmentName();

            state._fsp--;


            			current.merge(this_LayerSegmentName_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleLayerSegmentRelation"


    // $ANTLR start "entryRuleSublayerSegment"
    // InternalDsl.g:1456:1: entryRuleSublayerSegment returns [EObject current=null] : iv_ruleSublayerSegment= ruleSublayerSegment EOF ;
    public final EObject entryRuleSublayerSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSublayerSegment = null;


        try {
            // InternalDsl.g:1456:56: (iv_ruleSublayerSegment= ruleSublayerSegment EOF )
            // InternalDsl.g:1457:2: iv_ruleSublayerSegment= ruleSublayerSegment EOF
            {
             newCompositeNode(grammarAccess.getSublayerSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSublayerSegment=ruleSublayerSegment();

            state._fsp--;

             current =iv_ruleSublayerSegment; 
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
    // $ANTLR end "entryRuleSublayerSegment"


    // $ANTLR start "ruleSublayerSegment"
    // InternalDsl.g:1463:1: ruleSublayerSegment returns [EObject current=null] : (otherlv_0= 'sublayerSegment' ( (lv_name_1_0= ruleSublayerSegmentName ) ) ) ;
    public final EObject ruleSublayerSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1469:2: ( (otherlv_0= 'sublayerSegment' ( (lv_name_1_0= ruleSublayerSegmentName ) ) ) )
            // InternalDsl.g:1470:2: (otherlv_0= 'sublayerSegment' ( (lv_name_1_0= ruleSublayerSegmentName ) ) )
            {
            // InternalDsl.g:1470:2: (otherlv_0= 'sublayerSegment' ( (lv_name_1_0= ruleSublayerSegmentName ) ) )
            // InternalDsl.g:1471:3: otherlv_0= 'sublayerSegment' ( (lv_name_1_0= ruleSublayerSegmentName ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getSublayerSegmentAccess().getSublayerSegmentKeyword_0());
            		
            // InternalDsl.g:1475:3: ( (lv_name_1_0= ruleSublayerSegmentName ) )
            // InternalDsl.g:1476:4: (lv_name_1_0= ruleSublayerSegmentName )
            {
            // InternalDsl.g:1476:4: (lv_name_1_0= ruleSublayerSegmentName )
            // InternalDsl.g:1477:5: lv_name_1_0= ruleSublayerSegmentName
            {

            					newCompositeNode(grammarAccess.getSublayerSegmentAccess().getNameSublayerSegmentNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleSublayerSegmentName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSublayerSegmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.casino.dsl.Dsl.SublayerSegmentName");
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
    // $ANTLR end "ruleSublayerSegment"


    // $ANTLR start "entryRuleSublayerSegmentName"
    // InternalDsl.g:1498:1: entryRuleSublayerSegmentName returns [String current=null] : iv_ruleSublayerSegmentName= ruleSublayerSegmentName EOF ;
    public final String entryRuleSublayerSegmentName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSublayerSegmentName = null;


        try {
            // InternalDsl.g:1498:59: (iv_ruleSublayerSegmentName= ruleSublayerSegmentName EOF )
            // InternalDsl.g:1499:2: iv_ruleSublayerSegmentName= ruleSublayerSegmentName EOF
            {
             newCompositeNode(grammarAccess.getSublayerSegmentNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSublayerSegmentName=ruleSublayerSegmentName();

            state._fsp--;

             current =iv_ruleSublayerSegmentName.getText(); 
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
    // $ANTLR end "entryRuleSublayerSegmentName"


    // $ANTLR start "ruleSublayerSegmentName"
    // InternalDsl.g:1505:1: ruleSublayerSegmentName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Actions' | kw= 'Reducers' ) ;
    public final AntlrDatatypeRuleToken ruleSublayerSegmentName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1511:2: ( (kw= 'Actions' | kw= 'Reducers' ) )
            // InternalDsl.g:1512:2: (kw= 'Actions' | kw= 'Reducers' )
            {
            // InternalDsl.g:1512:2: (kw= 'Actions' | kw= 'Reducers' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==53) ) {
                alt24=1;
            }
            else if ( (LA24_0==54) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1513:3: kw= 'Actions'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSublayerSegmentNameAccess().getActionsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1519:3: kw= 'Reducers'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSublayerSegmentNameAccess().getReducersKeyword_1());
                    		

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
    // $ANTLR end "ruleSublayerSegmentName"


    // $ANTLR start "entryRuleRelationArch"
    // InternalDsl.g:1528:1: entryRuleRelationArch returns [EObject current=null] : iv_ruleRelationArch= ruleRelationArch EOF ;
    public final EObject entryRuleRelationArch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationArch = null;


        try {
            // InternalDsl.g:1528:53: (iv_ruleRelationArch= ruleRelationArch EOF )
            // InternalDsl.g:1529:2: iv_ruleRelationArch= ruleRelationArch EOF
            {
             newCompositeNode(grammarAccess.getRelationArchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationArch=ruleRelationArch();

            state._fsp--;

             current =iv_ruleRelationArch; 
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
    // $ANTLR end "entryRuleRelationArch"


    // $ANTLR start "ruleRelationArch"
    // InternalDsl.g:1535:1: ruleRelationArch returns [EObject current=null] : (otherlv_0= 'relationArch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source:' ruleLayerName otherlv_5= ',' otherlv_6= 'target:' ruleLayerName otherlv_8= '}' ) ;
    public final EObject ruleRelationArch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDsl.g:1541:2: ( (otherlv_0= 'relationArch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source:' ruleLayerName otherlv_5= ',' otherlv_6= 'target:' ruleLayerName otherlv_8= '}' ) )
            // InternalDsl.g:1542:2: (otherlv_0= 'relationArch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source:' ruleLayerName otherlv_5= ',' otherlv_6= 'target:' ruleLayerName otherlv_8= '}' )
            {
            // InternalDsl.g:1542:2: (otherlv_0= 'relationArch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source:' ruleLayerName otherlv_5= ',' otherlv_6= 'target:' ruleLayerName otherlv_8= '}' )
            // InternalDsl.g:1543:3: otherlv_0= 'relationArch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source:' ruleLayerName otherlv_5= ',' otherlv_6= 'target:' ruleLayerName otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationArchAccess().getRelationArchKeyword_0());
            		
            // InternalDsl.g:1547:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1548:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1548:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1549:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationArchAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationArchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationArchAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationArchAccess().getSourceKeyword_3());
            		

            			newCompositeNode(grammarAccess.getRelationArchAccess().getLayerNameParserRuleCall_4());
            		
            pushFollow(FOLLOW_42);
            ruleLayerName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,56,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationArchAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationArchAccess().getTargetKeyword_6());
            		

            			newCompositeNode(grammarAccess.getRelationArchAccess().getLayerNameParserRuleCall_7());
            		
            pushFollow(FOLLOW_7);
            ruleLayerName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRelationArchAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRelationArch"


    // $ANTLR start "entryRuleTechnology"
    // InternalDsl.g:1603:1: entryRuleTechnology returns [EObject current=null] : iv_ruleTechnology= ruleTechnology EOF ;
    public final EObject entryRuleTechnology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnology = null;


        try {
            // InternalDsl.g:1603:51: (iv_ruleTechnology= ruleTechnology EOF )
            // InternalDsl.g:1604:2: iv_ruleTechnology= ruleTechnology EOF
            {
             newCompositeNode(grammarAccess.getTechnologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnology=ruleTechnology();

            state._fsp--;

             current =iv_ruleTechnology; 
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
    // $ANTLR end "entryRuleTechnology"


    // $ANTLR start "ruleTechnology"
    // InternalDsl.g:1610:1: ruleTechnology returns [EObject current=null] : (otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}' ) ;
    public final EObject ruleTechnology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_java_2_0 = null;

        AntlrDatatypeRuleToken lv_react_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1616:2: ( (otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1617:2: (otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1617:2: (otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}' )
            // InternalDsl.g:1618:3: otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyAccess().getTechKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1626:3: ( (lv_java_2_0= ruleJavaApp ) )
            // InternalDsl.g:1627:4: (lv_java_2_0= ruleJavaApp )
            {
            // InternalDsl.g:1627:4: (lv_java_2_0= ruleJavaApp )
            // InternalDsl.g:1628:5: lv_java_2_0= ruleJavaApp
            {

            					newCompositeNode(grammarAccess.getTechnologyAccess().getJavaJavaAppParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
            lv_java_2_0=ruleJavaApp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologyRule());
            					}
            					set(
            						current,
            						"java",
            						lv_java_2_0,
            						"org.xtext.casino.dsl.Dsl.JavaApp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1645:3: ( (lv_react_3_0= ruleReactApp ) )
            // InternalDsl.g:1646:4: (lv_react_3_0= ruleReactApp )
            {
            // InternalDsl.g:1646:4: (lv_react_3_0= ruleReactApp )
            // InternalDsl.g:1647:5: lv_react_3_0= ruleReactApp
            {

            					newCompositeNode(grammarAccess.getTechnologyAccess().getReactReactAppParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_react_3_0=ruleReactApp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologyRule());
            					}
            					set(
            						current,
            						"react",
            						lv_react_3_0,
            						"org.xtext.casino.dsl.Dsl.ReactApp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTechnology"


    // $ANTLR start "entryRuleJavaApp"
    // InternalDsl.g:1672:1: entryRuleJavaApp returns [String current=null] : iv_ruleJavaApp= ruleJavaApp EOF ;
    public final String entryRuleJavaApp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJavaApp = null;


        try {
            // InternalDsl.g:1672:47: (iv_ruleJavaApp= ruleJavaApp EOF )
            // InternalDsl.g:1673:2: iv_ruleJavaApp= ruleJavaApp EOF
            {
             newCompositeNode(grammarAccess.getJavaAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaApp=ruleJavaApp();

            state._fsp--;

             current =iv_ruleJavaApp.getText(); 
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
    // $ANTLR end "entryRuleJavaApp"


    // $ANTLR start "ruleJavaApp"
    // InternalDsl.g:1679:1: ruleJavaApp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'javaApp' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleJavaApp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1685:2: ( (kw= 'javaApp' kw= '{' kw= '}' ) )
            // InternalDsl.g:1686:2: (kw= 'javaApp' kw= '{' kw= '}' )
            {
            // InternalDsl.g:1686:2: (kw= 'javaApp' kw= '{' kw= '}' )
            // InternalDsl.g:1687:3: kw= 'javaApp' kw= '{' kw= '}'
            {
            kw=(Token)match(input,58,FOLLOW_3); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getJavaAppAccess().getJavaAppKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getJavaAppAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getJavaAppAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleJavaApp"


    // $ANTLR start "entryRuleReactApp"
    // InternalDsl.g:1706:1: entryRuleReactApp returns [String current=null] : iv_ruleReactApp= ruleReactApp EOF ;
    public final String entryRuleReactApp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactApp = null;


        try {
            // InternalDsl.g:1706:48: (iv_ruleReactApp= ruleReactApp EOF )
            // InternalDsl.g:1707:2: iv_ruleReactApp= ruleReactApp EOF
            {
             newCompositeNode(grammarAccess.getReactAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactApp=ruleReactApp();

            state._fsp--;

             current =iv_ruleReactApp.getText(); 
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
    // $ANTLR end "entryRuleReactApp"


    // $ANTLR start "ruleReactApp"
    // InternalDsl.g:1713:1: ruleReactApp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'reactApp' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleReactApp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1719:2: ( (kw= 'reactApp' kw= '{' kw= '}' ) )
            // InternalDsl.g:1720:2: (kw= 'reactApp' kw= '{' kw= '}' )
            {
            // InternalDsl.g:1720:2: (kw= 'reactApp' kw= '{' kw= '}' )
            // InternalDsl.g:1721:3: kw= 'reactApp' kw= '{' kw= '}'
            {
            kw=(Token)match(input,59,FOLLOW_3); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReactAppAccess().getReactAppKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReactAppAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReactAppAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleReactApp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000021008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002420000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002402000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0007FC0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000003000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000000L});

}