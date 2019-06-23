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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Casino'", "'{'", "'}'", "'domain'", "'module'", "'submodule'", "'op'", "'type:'", "'operates_on:'", "'Read'", "'Create'", "'generalEntity'", "':'", "'dataType'", "'specialEntity'", "'trx'", "'exchange'", "'sale'", "'rel'", "'Composition'", "'source:'", "'target:'", "'arch'", "'tech'", "'javaApp'", "'reactApp'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

        AntlrDatatypeRuleToken lv_arch_3_0 = null;

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
    // InternalDsl.g:159:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'domain' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractElement ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_modules_3_0 = null;

        EObject lv_relations_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:165:2: ( (otherlv_0= 'domain' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractElement ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}' ) )
            // InternalDsl.g:166:2: (otherlv_0= 'domain' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractElement ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}' )
            {
            // InternalDsl.g:166:2: (otherlv_0= 'domain' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractElement ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}' )
            // InternalDsl.g:167:3: otherlv_0= 'domain' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractElement ) )* ( (lv_modules_3_0= ruleModule ) )+ ( (lv_relations_4_0= ruleRelationDom ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:175:3: ( (lv_elements_2_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||(LA1_0>=24 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:176:4: (lv_elements_2_0= ruleAbstractElement )
            	    {
            	    // InternalDsl.g:176:4: (lv_elements_2_0= ruleAbstractElement )
            	    // InternalDsl.g:177:5: lv_elements_2_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getElementsAbstractElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_elements_2_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.casino.dsl.Dsl.AbstractElement");
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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDsl.g:240:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDsl.g:240:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDsl.g:241:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDsl.g:247:1: ruleAbstractElement returns [EObject current=null] : (this_SpecialEntity_0= ruleSpecialEntity | this_GeneralEntity_1= ruleGeneralEntity | this_Type_2= ruleType ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_SpecialEntity_0 = null;

        EObject this_GeneralEntity_1 = null;

        EObject this_Type_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:253:2: ( (this_SpecialEntity_0= ruleSpecialEntity | this_GeneralEntity_1= ruleGeneralEntity | this_Type_2= ruleType ) )
            // InternalDsl.g:254:2: (this_SpecialEntity_0= ruleSpecialEntity | this_GeneralEntity_1= ruleGeneralEntity | this_Type_2= ruleType )
            {
            // InternalDsl.g:254:2: (this_SpecialEntity_0= ruleSpecialEntity | this_GeneralEntity_1= ruleGeneralEntity | this_Type_2= ruleType )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:255:3: this_SpecialEntity_0= ruleSpecialEntity
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getSpecialEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecialEntity_0=ruleSpecialEntity();

                    state._fsp--;


                    			current = this_SpecialEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:264:3: this_GeneralEntity_1= ruleGeneralEntity
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getGeneralEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralEntity_1=ruleGeneralEntity();

                    state._fsp--;


                    			current = this_GeneralEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:273:3: this_Type_2= ruleType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_2=ruleType();

                    state._fsp--;


                    			current = this_Type_2;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleModule"
    // InternalDsl.g:285:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalDsl.g:285:47: (iv_ruleModule= ruleModule EOF )
            // InternalDsl.g:286:2: iv_ruleModule= ruleModule EOF
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
    // InternalDsl.g:292:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_submodules_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:298:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:299:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:299:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}' )
            // InternalDsl.g:300:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_submodules_3_0= ruleSubmodule ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalDsl.g:304:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:305:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:305:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:306:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDsl.g:326:3: ( (lv_submodules_3_0= ruleSubmodule ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:327:4: (lv_submodules_3_0= ruleSubmodule )
            	    {
            	    // InternalDsl.g:327:4: (lv_submodules_3_0= ruleSubmodule )
            	    // InternalDsl.g:328:5: lv_submodules_3_0= ruleSubmodule
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalDsl.g:353:1: entryRuleSubmodule returns [EObject current=null] : iv_ruleSubmodule= ruleSubmodule EOF ;
    public final EObject entryRuleSubmodule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmodule = null;


        try {
            // InternalDsl.g:353:50: (iv_ruleSubmodule= ruleSubmodule EOF )
            // InternalDsl.g:354:2: iv_ruleSubmodule= ruleSubmodule EOF
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
    // InternalDsl.g:360:1: ruleSubmodule returns [EObject current=null] : (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( (lv_entities_4_0= ruleEntity ) )+ otherlv_5= '}' ) ;
    public final EObject ruleSubmodule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_operations_3_0 = null;

        EObject lv_entities_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:366:2: ( (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( (lv_entities_4_0= ruleEntity ) )+ otherlv_5= '}' ) )
            // InternalDsl.g:367:2: (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( (lv_entities_4_0= ruleEntity ) )+ otherlv_5= '}' )
            {
            // InternalDsl.g:367:2: (otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( (lv_entities_4_0= ruleEntity ) )+ otherlv_5= '}' )
            // InternalDsl.g:368:3: otherlv_0= 'submodule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ ( (lv_entities_4_0= ruleEntity ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSubmoduleAccess().getSubmoduleKeyword_0());
            		
            // InternalDsl.g:372:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:373:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:373:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:374:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDsl.g:394:3: ( (lv_operations_3_0= ruleOperation ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:395:4: (lv_operations_3_0= ruleOperation )
            	    {
            	    // InternalDsl.g:395:4: (lv_operations_3_0= ruleOperation )
            	    // InternalDsl.g:396:5: lv_operations_3_0= ruleOperation
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalDsl.g:413:3: ( (lv_entities_4_0= ruleEntity ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:414:4: (lv_entities_4_0= ruleEntity )
            	    {
            	    // InternalDsl.g:414:4: (lv_entities_4_0= ruleEntity )
            	    // InternalDsl.g:415:5: lv_entities_4_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getSubmoduleAccess().getEntitiesEntityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_entities_4_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubmoduleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_4_0,
            	    						"org.xtext.casino.dsl.Dsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

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


    // $ANTLR start "entryRuleEntity"
    // InternalDsl.g:440:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDsl.g:440:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDsl.g:441:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDsl.g:447:1: ruleEntity returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDsl.g:453:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDsl.g:454:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDsl.g:454:2: ( (otherlv_0= RULE_ID ) )
            // InternalDsl.g:455:3: (otherlv_0= RULE_ID )
            {
            // InternalDsl.g:455:3: (otherlv_0= RULE_ID )
            // InternalDsl.g:456:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getTypeQualifiedNameCrossReference_0());
            			

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDsl.g:470:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalDsl.g:470:54: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDsl.g:471:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDsl.g:477:1: ruleQualifiedName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:483:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDsl.g:484:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDsl.g:484:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:485:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:485:3: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:486:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getQualifiedNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQualifiedNameRule());
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleOperation"
    // InternalDsl.g:505:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalDsl.g:505:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalDsl.g:506:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalDsl.g:512:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntity ) ) otherlv_6= '}' ) ;
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
            // InternalDsl.g:518:2: ( (otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntity ) ) otherlv_6= '}' ) )
            // InternalDsl.g:519:2: (otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntity ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:519:2: (otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntity ) ) otherlv_6= '}' )
            // InternalDsl.g:520:3: otherlv_0= 'op' otherlv_1= '{' otherlv_2= 'type:' ruleSubOperation otherlv_4= 'operates_on:' ( (lv_target_5_0= ruleEntity ) ) otherlv_6= '}'
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
            		
            // InternalDsl.g:543:3: ( (lv_target_5_0= ruleEntity ) )
            // InternalDsl.g:544:4: (lv_target_5_0= ruleEntity )
            {
            // InternalDsl.g:544:4: (lv_target_5_0= ruleEntity )
            // InternalDsl.g:545:5: lv_target_5_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getTargetEntityParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_target_5_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					add(
            						current,
            						"target",
            						lv_target_5_0,
            						"org.xtext.casino.dsl.Dsl.Entity");
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


    // $ANTLR start "entryRuleSubOperation"
    // InternalDsl.g:570:1: entryRuleSubOperation returns [String current=null] : iv_ruleSubOperation= ruleSubOperation EOF ;
    public final String entryRuleSubOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubOperation = null;


        try {
            // InternalDsl.g:570:52: (iv_ruleSubOperation= ruleSubOperation EOF )
            // InternalDsl.g:571:2: iv_ruleSubOperation= ruleSubOperation EOF
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
    // InternalDsl.g:577:1: ruleSubOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Read' | kw= 'Create' ) ;
    public final AntlrDatatypeRuleToken ruleSubOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:583:2: ( (kw= 'Read' | kw= 'Create' ) )
            // InternalDsl.g:584:2: (kw= 'Read' | kw= 'Create' )
            {
            // InternalDsl.g:584:2: (kw= 'Read' | kw= 'Create' )
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
                    // InternalDsl.g:585:3: kw= 'Read'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubOperationAccess().getReadKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:591:3: kw= 'Create'
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
    // InternalDsl.g:600:1: entryRuleGeneralEntity returns [EObject current=null] : iv_ruleGeneralEntity= ruleGeneralEntity EOF ;
    public final EObject entryRuleGeneralEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralEntity = null;


        try {
            // InternalDsl.g:600:54: (iv_ruleGeneralEntity= ruleGeneralEntity EOF )
            // InternalDsl.g:601:2: iv_ruleGeneralEntity= ruleGeneralEntity EOF
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
    // InternalDsl.g:607:1: ruleGeneralEntity returns [EObject current=null] : (otherlv_0= 'generalEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' ) ;
    public final EObject ruleGeneralEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_QualifiedName_1 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:613:2: ( (otherlv_0= 'generalEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:614:2: (otherlv_0= 'generalEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:614:2: (otherlv_0= 'generalEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}' )
            // InternalDsl.g:615:3: otherlv_0= 'generalEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralEntityAccess().getGeneralEntityKeyword_0());
            		

            			newCompositeNode(grammarAccess.getGeneralEntityAccess().getQualifiedNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            this_QualifiedName_1=ruleQualifiedName();

            state._fsp--;


            			current = this_QualifiedName_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:631:3: ( (lv_properties_3_0= ruleProperty ) )+
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
            	    // InternalDsl.g:632:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalDsl.g:632:4: (lv_properties_3_0= ruleProperty )
            	    // InternalDsl.g:633:5: lv_properties_3_0= ruleProperty
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
    // InternalDsl.g:658:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDsl.g:658:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalDsl.g:659:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalDsl.g:665:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDsl.g:671:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDsl.g:672:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDsl.g:672:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalDsl.g:673:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDsl.g:673:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:674:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:674:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:675:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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
            		
            // InternalDsl.g:695:3: ( (otherlv_2= RULE_ID ) )
            // InternalDsl.g:696:4: (otherlv_2= RULE_ID )
            {
            // InternalDsl.g:696:4: (otherlv_2= RULE_ID )
            // InternalDsl.g:697:5: otherlv_2= RULE_ID
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
    // InternalDsl.g:712:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDsl.g:712:45: (iv_ruleType= ruleType EOF )
            // InternalDsl.g:713:2: iv_ruleType= ruleType EOF
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
    // InternalDsl.g:719:1: ruleType returns [EObject current=null] : (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:725:2: ( (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDsl.g:726:2: (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDsl.g:726:2: (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDsl.g:727:3: otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getDataTypeKeyword_0());
            		
            // InternalDsl.g:731:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:732:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:732:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:733:5: lv_name_1_0= RULE_ID
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
    // InternalDsl.g:753:1: entryRuleSpecialEntity returns [EObject current=null] : iv_ruleSpecialEntity= ruleSpecialEntity EOF ;
    public final EObject entryRuleSpecialEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialEntity = null;


        try {
            // InternalDsl.g:753:54: (iv_ruleSpecialEntity= ruleSpecialEntity EOF )
            // InternalDsl.g:754:2: iv_ruleSpecialEntity= ruleSpecialEntity EOF
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
    // InternalDsl.g:760:1: ruleSpecialEntity returns [EObject current=null] : (otherlv_0= 'specialEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}' ) ;
    public final EObject ruleSpecialEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_QualifiedName_1 = null;

        EObject lv_properties_3_0 = null;

        EObject lv_transactions_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:766:2: ( (otherlv_0= 'specialEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}' ) )
            // InternalDsl.g:767:2: (otherlv_0= 'specialEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}' )
            {
            // InternalDsl.g:767:2: (otherlv_0= 'specialEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}' )
            // InternalDsl.g:768:3: otherlv_0= 'specialEntity' this_QualifiedName_1= ruleQualifiedName otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )+ ( (lv_transactions_4_0= ruleTransaction ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecialEntityAccess().getSpecialEntityKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSpecialEntityAccess().getQualifiedNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            this_QualifiedName_1=ruleQualifiedName();

            state._fsp--;


            			current = this_QualifiedName_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecialEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:784:3: ( (lv_properties_3_0= ruleProperty ) )+
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
            	    // InternalDsl.g:785:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalDsl.g:785:4: (lv_properties_3_0= ruleProperty )
            	    // InternalDsl.g:786:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getSpecialEntityAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
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

            // InternalDsl.g:803:3: ( (lv_transactions_4_0= ruleTransaction ) )+
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
            	    // InternalDsl.g:804:4: (lv_transactions_4_0= ruleTransaction )
            	    {
            	    // InternalDsl.g:804:4: (lv_transactions_4_0= ruleTransaction )
            	    // InternalDsl.g:805:5: lv_transactions_4_0= ruleTransaction
            	    {

            	    					newCompositeNode(grammarAccess.getSpecialEntityAccess().getTransactionsTransactionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
    // InternalDsl.g:830:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // InternalDsl.g:830:52: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalDsl.g:831:2: iv_ruleTransaction= ruleTransaction EOF
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
    // InternalDsl.g:837:1: ruleTransaction returns [EObject current=null] : (otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_operateson_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:843:2: ( (otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}' ) )
            // InternalDsl.g:844:2: (otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}' )
            {
            // InternalDsl.g:844:2: (otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}' )
            // InternalDsl.g:845:3: otherlv_0= 'trx' otherlv_1= '{' otherlv_2= 'type:' ruleSubTransaction ( (lv_operateson_4_0= ruleOperateson ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getTrxKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getTransactionAccess().getTypeKeyword_2());
            		

            			newCompositeNode(grammarAccess.getTransactionAccess().getSubTransactionParserRuleCall_3());
            		
            pushFollow(FOLLOW_19);
            ruleSubTransaction();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:864:3: ( (lv_operateson_4_0= ruleOperateson ) )+
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
            	    // InternalDsl.g:865:4: (lv_operateson_4_0= ruleOperateson )
            	    {
            	    // InternalDsl.g:865:4: (lv_operateson_4_0= ruleOperateson )
            	    // InternalDsl.g:866:5: lv_operateson_4_0= ruleOperateson
            	    {

            	    					newCompositeNode(grammarAccess.getTransactionAccess().getOperatesonOperatesonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
    // InternalDsl.g:891:1: entryRuleSubTransaction returns [String current=null] : iv_ruleSubTransaction= ruleSubTransaction EOF ;
    public final String entryRuleSubTransaction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubTransaction = null;


        try {
            // InternalDsl.g:891:54: (iv_ruleSubTransaction= ruleSubTransaction EOF )
            // InternalDsl.g:892:2: iv_ruleSubTransaction= ruleSubTransaction EOF
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
    // InternalDsl.g:898:1: ruleSubTransaction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'exchange' | kw= 'sale' ) ;
    public final AntlrDatatypeRuleToken ruleSubTransaction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:904:2: ( (kw= 'exchange' | kw= 'sale' ) )
            // InternalDsl.g:905:2: (kw= 'exchange' | kw= 'sale' )
            {
            // InternalDsl.g:905:2: (kw= 'exchange' | kw= 'sale' )
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
                    // InternalDsl.g:906:3: kw= 'exchange'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubTransactionAccess().getExchangeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:912:3: kw= 'sale'
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
    // InternalDsl.g:921:1: entryRuleOperateson returns [EObject current=null] : iv_ruleOperateson= ruleOperateson EOF ;
    public final EObject entryRuleOperateson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperateson = null;


        try {
            // InternalDsl.g:921:51: (iv_ruleOperateson= ruleOperateson EOF )
            // InternalDsl.g:922:2: iv_ruleOperateson= ruleOperateson EOF
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
    // InternalDsl.g:928:1: ruleOperateson returns [EObject current=null] : (otherlv_0= 'operates_on:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOperateson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:934:2: ( (otherlv_0= 'operates_on:' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDsl.g:935:2: (otherlv_0= 'operates_on:' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDsl.g:935:2: (otherlv_0= 'operates_on:' ( (otherlv_1= RULE_ID ) ) )
            // InternalDsl.g:936:3: otherlv_0= 'operates_on:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getOperatesonAccess().getOperates_onKeyword_0());
            		
            // InternalDsl.g:940:3: ( (otherlv_1= RULE_ID ) )
            // InternalDsl.g:941:4: (otherlv_1= RULE_ID )
            {
            // InternalDsl.g:941:4: (otherlv_1= RULE_ID )
            // InternalDsl.g:942:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperatesonRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getOperatesonAccess().getTypeGeneralEntityCrossReference_1_0());
            				

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
    // InternalDsl.g:957:1: entryRuleRelationDom returns [EObject current=null] : iv_ruleRelationDom= ruleRelationDom EOF ;
    public final EObject entryRuleRelationDom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDom = null;


        try {
            // InternalDsl.g:957:52: (iv_ruleRelationDom= ruleRelationDom EOF )
            // InternalDsl.g:958:2: iv_ruleRelationDom= ruleRelationDom EOF
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
    // InternalDsl.g:964:1: ruleRelationDom returns [EObject current=null] : (otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntity ) ) otherlv_8= '}' ) ;
    public final EObject ruleRelationDom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_target_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:970:2: ( (otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntity ) ) otherlv_8= '}' ) )
            // InternalDsl.g:971:2: (otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntity ) ) otherlv_8= '}' )
            {
            // InternalDsl.g:971:2: (otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntity ) ) otherlv_8= '}' )
            // InternalDsl.g:972:3: otherlv_0= 'rel' otherlv_1= '{' otherlv_2= 'type:' otherlv_3= 'Composition' otherlv_4= 'source:' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target:' ( (lv_target_7_0= ruleEntity ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationDomAccess().getRelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationDomAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationDomAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationDomAccess().getCompositionKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationDomAccess().getSourceKeyword_4());
            		
            // InternalDsl.g:992:3: ( (otherlv_5= RULE_ID ) )
            // InternalDsl.g:993:4: (otherlv_5= RULE_ID )
            {
            // InternalDsl.g:993:4: (otherlv_5= RULE_ID )
            // InternalDsl.g:994:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationDomRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationDomAccess().getTypeGeneralEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationDomAccess().getTargetKeyword_6());
            		
            // InternalDsl.g:1009:3: ( (lv_target_7_0= ruleEntity ) )
            // InternalDsl.g:1010:4: (lv_target_7_0= ruleEntity )
            {
            // InternalDsl.g:1010:4: (lv_target_7_0= ruleEntity )
            // InternalDsl.g:1011:5: lv_target_7_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getRelationDomAccess().getTargetEntityParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_target_7_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationDomRule());
            					}
            					add(
            						current,
            						"target",
            						lv_target_7_0,
            						"org.xtext.casino.dsl.Dsl.Entity");
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
    // InternalDsl.g:1036:1: entryRuleArchitecture returns [String current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final String entryRuleArchitecture() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArchitecture = null;


        try {
            // InternalDsl.g:1036:52: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalDsl.g:1037:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture.getText(); 
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
    // InternalDsl.g:1043:1: ruleArchitecture returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'arch' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleArchitecture() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1049:2: ( (kw= 'arch' kw= '{' kw= '}' ) )
            // InternalDsl.g:1050:2: (kw= 'arch' kw= '{' kw= '}' )
            {
            // InternalDsl.g:1050:2: (kw= 'arch' kw= '{' kw= '}' )
            // InternalDsl.g:1051:3: kw= 'arch' kw= '{' kw= '}'
            {
            kw=(Token)match(input,33,FOLLOW_3); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArchitectureAccess().getArchKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_2());
            		

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


    // $ANTLR start "entryRuleTechnology"
    // InternalDsl.g:1070:1: entryRuleTechnology returns [EObject current=null] : iv_ruleTechnology= ruleTechnology EOF ;
    public final EObject entryRuleTechnology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnology = null;


        try {
            // InternalDsl.g:1070:51: (iv_ruleTechnology= ruleTechnology EOF )
            // InternalDsl.g:1071:2: iv_ruleTechnology= ruleTechnology EOF
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
    // InternalDsl.g:1077:1: ruleTechnology returns [EObject current=null] : (otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}' ) ;
    public final EObject ruleTechnology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_java_2_0 = null;

        AntlrDatatypeRuleToken lv_react_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1083:2: ( (otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}' ) )
            // InternalDsl.g:1084:2: (otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:1084:2: (otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}' )
            // InternalDsl.g:1085:3: otherlv_0= 'tech' otherlv_1= '{' ( (lv_java_2_0= ruleJavaApp ) ) ( (lv_react_3_0= ruleReactApp ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyAccess().getTechKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1093:3: ( (lv_java_2_0= ruleJavaApp ) )
            // InternalDsl.g:1094:4: (lv_java_2_0= ruleJavaApp )
            {
            // InternalDsl.g:1094:4: (lv_java_2_0= ruleJavaApp )
            // InternalDsl.g:1095:5: lv_java_2_0= ruleJavaApp
            {

            					newCompositeNode(grammarAccess.getTechnologyAccess().getJavaJavaAppParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalDsl.g:1112:3: ( (lv_react_3_0= ruleReactApp ) )
            // InternalDsl.g:1113:4: (lv_react_3_0= ruleReactApp )
            {
            // InternalDsl.g:1113:4: (lv_react_3_0= ruleReactApp )
            // InternalDsl.g:1114:5: lv_react_3_0= ruleReactApp
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
    // InternalDsl.g:1139:1: entryRuleJavaApp returns [String current=null] : iv_ruleJavaApp= ruleJavaApp EOF ;
    public final String entryRuleJavaApp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJavaApp = null;


        try {
            // InternalDsl.g:1139:47: (iv_ruleJavaApp= ruleJavaApp EOF )
            // InternalDsl.g:1140:2: iv_ruleJavaApp= ruleJavaApp EOF
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
    // InternalDsl.g:1146:1: ruleJavaApp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'javaApp' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleJavaApp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1152:2: ( (kw= 'javaApp' kw= '{' kw= '}' ) )
            // InternalDsl.g:1153:2: (kw= 'javaApp' kw= '{' kw= '}' )
            {
            // InternalDsl.g:1153:2: (kw= 'javaApp' kw= '{' kw= '}' )
            // InternalDsl.g:1154:3: kw= 'javaApp' kw= '{' kw= '}'
            {
            kw=(Token)match(input,35,FOLLOW_3); 

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
    // InternalDsl.g:1173:1: entryRuleReactApp returns [String current=null] : iv_ruleReactApp= ruleReactApp EOF ;
    public final String entryRuleReactApp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactApp = null;


        try {
            // InternalDsl.g:1173:48: (iv_ruleReactApp= ruleReactApp EOF )
            // InternalDsl.g:1174:2: iv_ruleReactApp= ruleReactApp EOF
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
    // InternalDsl.g:1180:1: ruleReactApp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'reactApp' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleReactApp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1186:2: ( (kw= 'reactApp' kw= '{' kw= '}' ) )
            // InternalDsl.g:1187:2: (kw= 'reactApp' kw= '{' kw= '}' )
            {
            // InternalDsl.g:1187:2: (kw= 'reactApp' kw= '{' kw= '}' )
            // InternalDsl.g:1188:3: kw= 'reactApp' kw= '{' kw= '}'
            {
            kw=(Token)match(input,36,FOLLOW_3); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003408000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000023408000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});

}