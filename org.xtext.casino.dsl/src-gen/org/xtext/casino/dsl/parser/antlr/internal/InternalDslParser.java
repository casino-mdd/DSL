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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Casino'", "'{'", "'}'", "'domain'", "'module'", "'submodule'", "'op'", "'type:'", "'operates_on:'", "'Read'", "'Create'", "'generalEntity'", "':'", "'dataType'", "'specialEntity'", "'trx'", "'exchange'", "'sale'", "'rel'", "'Composition'", "'source:'", "'target:'", "'arch'", "'component'", "'Back'", "'Front'", "'layer'", "'JavaScript'", "'Ejb'", "'War'", "'layerSegment'", "'Services'", "'Ui'", "'Store'", "'RestEntity'", "'Pojo'", "'Facade'", "'Dto'", "'Util'", "'Containers'", "'allowedToUse:'", "'sublayerSegment'", "'Actions'", "'Reducers'", "'relationArch'", "','", "'tech'", "'javaApp'", "'reactApp'", "'performs:'", "'holds:'", "'use:'", "'functionality'", "'uses:'", "'wraps:'", "'render:'", "'state:'", "'calls:'", "'organizedBy:'", "'router'", "'inWithin:'", "'route:'", "'container'", "'dispatch:'", "'map:'", "'visualizer'", "'service'", "'method:'", "'directory'", "'has:'", "'contains:'", "'purpose:'", "'md'", "'js'", "'json'", "'css'", "'state'", "'handleAction:'", "'handleReducer:'", "'action'", "'create:'", "'actionDirectory:'", "'actionCreator'", "'actionDispatcher'", "'reducer'", "'catch:'", "'reducerDirectory:'", "'presentIn:'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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

        EObject lv_react_3_0 = null;



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


    // $ANTLR start "entryRuleAbstractFrontElement"
    // InternalDsl.g:1706:1: entryRuleAbstractFrontElement returns [EObject current=null] : iv_ruleAbstractFrontElement= ruleAbstractFrontElement EOF ;
    public final EObject entryRuleAbstractFrontElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFrontElement = null;


        try {
            // InternalDsl.g:1706:61: (iv_ruleAbstractFrontElement= ruleAbstractFrontElement EOF )
            // InternalDsl.g:1707:2: iv_ruleAbstractFrontElement= ruleAbstractFrontElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractFrontElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractFrontElement=ruleAbstractFrontElement();

            state._fsp--;

             current =iv_ruleAbstractFrontElement; 
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
    // $ANTLR end "entryRuleAbstractFrontElement"


    // $ANTLR start "ruleAbstractFrontElement"
    // InternalDsl.g:1713:1: ruleAbstractFrontElement returns [EObject current=null] : (this_ReactApp_0= ruleReactApp | this_Functionality_1= ruleFunctionality | this_Directory_2= ruleDirectory | this_JsModule_3= ruleJsModule | this_Type_4= ruleType | this_RouterComponent_5= ruleRouterComponent | this_Container_6= ruleContainer | this_Visualizer_7= ruleVisualizer | this_ServiceFront_8= ruleServiceFront | this_File_9= ruleFile | this_State_10= ruleState | this_Action_11= ruleAction | this_ActionCreator_12= ruleActionCreator | this_ActionDispatcher_13= ruleActionDispatcher | this_Reducer_14= ruleReducer ) ;
    public final EObject ruleAbstractFrontElement() throws RecognitionException {
        EObject current = null;

        EObject this_ReactApp_0 = null;

        EObject this_Functionality_1 = null;

        EObject this_Directory_2 = null;

        EObject this_JsModule_3 = null;

        EObject this_Type_4 = null;

        EObject this_RouterComponent_5 = null;

        EObject this_Container_6 = null;

        EObject this_Visualizer_7 = null;

        EObject this_ServiceFront_8 = null;

        EObject this_File_9 = null;

        EObject this_State_10 = null;

        EObject this_Action_11 = null;

        EObject this_ActionCreator_12 = null;

        EObject this_ActionDispatcher_13 = null;

        EObject this_Reducer_14 = null;



        	enterRule();

        try {
            // InternalDsl.g:1719:2: ( (this_ReactApp_0= ruleReactApp | this_Functionality_1= ruleFunctionality | this_Directory_2= ruleDirectory | this_JsModule_3= ruleJsModule | this_Type_4= ruleType | this_RouterComponent_5= ruleRouterComponent | this_Container_6= ruleContainer | this_Visualizer_7= ruleVisualizer | this_ServiceFront_8= ruleServiceFront | this_File_9= ruleFile | this_State_10= ruleState | this_Action_11= ruleAction | this_ActionCreator_12= ruleActionCreator | this_ActionDispatcher_13= ruleActionDispatcher | this_Reducer_14= ruleReducer ) )
            // InternalDsl.g:1720:2: (this_ReactApp_0= ruleReactApp | this_Functionality_1= ruleFunctionality | this_Directory_2= ruleDirectory | this_JsModule_3= ruleJsModule | this_Type_4= ruleType | this_RouterComponent_5= ruleRouterComponent | this_Container_6= ruleContainer | this_Visualizer_7= ruleVisualizer | this_ServiceFront_8= ruleServiceFront | this_File_9= ruleFile | this_State_10= ruleState | this_Action_11= ruleAction | this_ActionCreator_12= ruleActionCreator | this_ActionDispatcher_13= ruleActionDispatcher | this_Reducer_14= ruleReducer )
            {
            // InternalDsl.g:1720:2: (this_ReactApp_0= ruleReactApp | this_Functionality_1= ruleFunctionality | this_Directory_2= ruleDirectory | this_JsModule_3= ruleJsModule | this_Type_4= ruleType | this_RouterComponent_5= ruleRouterComponent | this_Container_6= ruleContainer | this_Visualizer_7= ruleVisualizer | this_ServiceFront_8= ruleServiceFront | this_File_9= ruleFile | this_State_10= ruleState | this_Action_11= ruleAction | this_ActionCreator_12= ruleActionCreator | this_ActionDispatcher_13= ruleActionDispatcher | this_Reducer_14= ruleReducer )
            int alt25=15;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt25=1;
                }
                break;
            case 63:
                {
                alt25=2;
                }
                break;
            case 79:
                {
                alt25=3;
                }
                break;
            case 15:
                {
                alt25=4;
                }
                break;
            case 24:
                {
                alt25=5;
                }
                break;
            case 70:
                {
                alt25=6;
                }
                break;
            case 73:
                {
                alt25=7;
                }
                break;
            case 76:
                {
                alt25=8;
                }
                break;
            case 77:
                {
                alt25=9;
                }
                break;
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt25=10;
                }
                break;
            case 87:
                {
                alt25=11;
                }
                break;
            case 90:
                {
                alt25=12;
                }
                break;
            case 93:
                {
                alt25=13;
                }
                break;
            case 94:
                {
                alt25=14;
                }
                break;
            case 95:
                {
                alt25=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1721:3: this_ReactApp_0= ruleReactApp
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getReactAppParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReactApp_0=ruleReactApp();

                    state._fsp--;


                    			current = this_ReactApp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1730:3: this_Functionality_1= ruleFunctionality
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getFunctionalityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Functionality_1=ruleFunctionality();

                    state._fsp--;


                    			current = this_Functionality_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1739:3: this_Directory_2= ruleDirectory
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getDirectoryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Directory_2=ruleDirectory();

                    state._fsp--;


                    			current = this_Directory_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:1748:3: this_JsModule_3= ruleJsModule
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getJsModuleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsModule_3=ruleJsModule();

                    state._fsp--;


                    			current = this_JsModule_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:1757:3: this_Type_4= ruleType
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_4=ruleType();

                    state._fsp--;


                    			current = this_Type_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:1766:3: this_RouterComponent_5= ruleRouterComponent
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getRouterComponentParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RouterComponent_5=ruleRouterComponent();

                    state._fsp--;


                    			current = this_RouterComponent_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDsl.g:1775:3: this_Container_6= ruleContainer
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getContainerParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Container_6=ruleContainer();

                    state._fsp--;


                    			current = this_Container_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDsl.g:1784:3: this_Visualizer_7= ruleVisualizer
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getVisualizerParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visualizer_7=ruleVisualizer();

                    state._fsp--;


                    			current = this_Visualizer_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDsl.g:1793:3: this_ServiceFront_8= ruleServiceFront
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getServiceFrontParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServiceFront_8=ruleServiceFront();

                    state._fsp--;


                    			current = this_ServiceFront_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDsl.g:1802:3: this_File_9= ruleFile
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getFileParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_File_9=ruleFile();

                    state._fsp--;


                    			current = this_File_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDsl.g:1811:3: this_State_10= ruleState
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getStateParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_10=ruleState();

                    state._fsp--;


                    			current = this_State_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDsl.g:1820:3: this_Action_11= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getActionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_11=ruleAction();

                    state._fsp--;


                    			current = this_Action_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDsl.g:1829:3: this_ActionCreator_12= ruleActionCreator
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getActionCreatorParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionCreator_12=ruleActionCreator();

                    state._fsp--;


                    			current = this_ActionCreator_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalDsl.g:1838:3: this_ActionDispatcher_13= ruleActionDispatcher
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getActionDispatcherParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionDispatcher_13=ruleActionDispatcher();

                    state._fsp--;


                    			current = this_ActionDispatcher_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalDsl.g:1847:3: this_Reducer_14= ruleReducer
                    {

                    			newCompositeNode(grammarAccess.getAbstractFrontElementAccess().getReducerParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reducer_14=ruleReducer();

                    state._fsp--;


                    			current = this_Reducer_14;
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
    // $ANTLR end "ruleAbstractFrontElement"


    // $ANTLR start "entryRuleReactApp"
    // InternalDsl.g:1859:1: entryRuleReactApp returns [EObject current=null] : iv_ruleReactApp= ruleReactApp EOF ;
    public final EObject entryRuleReactApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactApp = null;


        try {
            // InternalDsl.g:1859:49: (iv_ruleReactApp= ruleReactApp EOF )
            // InternalDsl.g:1860:2: iv_ruleReactApp= ruleReactApp EOF
            {
             newCompositeNode(grammarAccess.getReactAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactApp=ruleReactApp();

            state._fsp--;

             current =iv_ruleReactApp; 
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
    // InternalDsl.g:1866:1: ruleReactApp returns [EObject current=null] : (otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) ;
    public final EObject ruleReactApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1872:2: ( (otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) )
            // InternalDsl.g:1873:2: (otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            {
            // InternalDsl.g:1873:2: (otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            // InternalDsl.g:1874:3: otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactAppAccess().getReactAppKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getReactAppAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1882:3: ( (lv_elements_2_0= ruleAbstractFrontElement ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15||LA26_0==24||LA26_0==59||LA26_0==63||LA26_0==70||LA26_0==73||(LA26_0>=76 && LA26_0<=77)||LA26_0==79||(LA26_0>=83 && LA26_0<=87)||LA26_0==90||(LA26_0>=93 && LA26_0<=95)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:1883:4: (lv_elements_2_0= ruleAbstractFrontElement )
            	    {
            	    // InternalDsl.g:1883:4: (lv_elements_2_0= ruleAbstractFrontElement )
            	    // InternalDsl.g:1884:5: lv_elements_2_0= ruleAbstractFrontElement
            	    {

            	    					newCompositeNode(grammarAccess.getReactAppAccess().getElementsAbstractFrontElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_46);
            	    lv_elements_2_0=ruleAbstractFrontElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.casino.dsl.Dsl.AbstractFrontElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalDsl.g:1901:3: (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==60) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:1902:4: otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,60,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getReactAppAccess().getPerformsKeyword_3_0());
            	    			
            	    // InternalDsl.g:1906:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:1907:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:1907:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:1908:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReactAppRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    						newLeafNode(otherlv_4, grammarAccess.getReactAppAccess().getFuncFunctionalityCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // InternalDsl.g:1920:3: (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==61) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDsl.g:1921:4: otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,61,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getReactAppAccess().getHoldsKeyword_4_0());
            	    			
            	    // InternalDsl.g:1925:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:1926:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:1926:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:1927:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReactAppRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    						newLeafNode(otherlv_6, grammarAccess.getReactAppAccess().getDirDirectoryCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            // InternalDsl.g:1939:3: (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==62) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDsl.g:1940:4: otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,62,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getReactAppAccess().getUseKeyword_5_0());
            	    			
            	    // InternalDsl.g:1944:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalDsl.g:1945:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDsl.g:1945:5: (otherlv_8= RULE_ID )
            	    // InternalDsl.g:1946:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReactAppRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_49); 

            	    						newLeafNode(otherlv_8, grammarAccess.getReactAppAccess().getModJsModuleCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getReactAppAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleFunctionality"
    // InternalDsl.g:1966:1: entryRuleFunctionality returns [EObject current=null] : iv_ruleFunctionality= ruleFunctionality EOF ;
    public final EObject entryRuleFunctionality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionality = null;


        try {
            // InternalDsl.g:1966:54: (iv_ruleFunctionality= ruleFunctionality EOF )
            // InternalDsl.g:1967:2: iv_ruleFunctionality= ruleFunctionality EOF
            {
             newCompositeNode(grammarAccess.getFunctionalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionality=ruleFunctionality();

            state._fsp--;

             current =iv_ruleFunctionality; 
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
    // $ANTLR end "entryRuleFunctionality"


    // $ANTLR start "ruleFunctionality"
    // InternalDsl.g:1973:1: ruleFunctionality returns [EObject current=null] : (otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) ;
    public final EObject ruleFunctionality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalDsl.g:1979:2: ( (otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) )
            // InternalDsl.g:1980:2: (otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            {
            // InternalDsl.g:1980:2: (otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            // InternalDsl.g:1981:3: otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalityAccess().getFunctionalityKeyword_0());
            		
            // InternalDsl.g:1985:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1986:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1986:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1987:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionalityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2007:3: (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==64) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDsl.g:2008:4: otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,64,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionalityAccess().getUsesKeyword_3_0());
            	    			
            	    // InternalDsl.g:2012:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:2013:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:2013:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:2014:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    						newLeafNode(otherlv_4, grammarAccess.getFunctionalityAccess().getRouteRouterComponentCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalDsl.g:2026:3: (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==65) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDsl.g:2027:4: otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,65,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFunctionalityAccess().getWrapsKeyword_4_0());
            	    			
            	    // InternalDsl.g:2031:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:2032:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:2032:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:2033:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_51); 

            	    						newLeafNode(otherlv_6, grammarAccess.getFunctionalityAccess().getWrapContainerCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalDsl.g:2045:3: (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==66) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDsl.g:2046:4: otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,66,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getFunctionalityAccess().getRenderKeyword_5_0());
            	    			
            	    // InternalDsl.g:2050:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalDsl.g:2051:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDsl.g:2051:5: (otherlv_8= RULE_ID )
            	    // InternalDsl.g:2052:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    						newLeafNode(otherlv_8, grammarAccess.getFunctionalityAccess().getRenderVisualizerCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            // InternalDsl.g:2064:3: (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==67) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDsl.g:2065:4: otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,67,FOLLOW_11); 

            	    				newLeafNode(otherlv_9, grammarAccess.getFunctionalityAccess().getStateKeyword_6_0());
            	    			
            	    // InternalDsl.g:2069:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalDsl.g:2070:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalDsl.g:2070:5: (otherlv_10= RULE_ID )
            	    // InternalDsl.g:2071:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_53); 

            	    						newLeafNode(otherlv_10, grammarAccess.getFunctionalityAccess().getStateStateCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalDsl.g:2083:3: (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==68) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDsl.g:2084:4: otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,68,FOLLOW_11); 

            	    				newLeafNode(otherlv_11, grammarAccess.getFunctionalityAccess().getCallsKeyword_7_0());
            	    			
            	    // InternalDsl.g:2088:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalDsl.g:2089:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalDsl.g:2089:5: (otherlv_12= RULE_ID )
            	    // InternalDsl.g:2090:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_54); 

            	    						newLeafNode(otherlv_12, grammarAccess.getFunctionalityAccess().getServiceServiceFrontCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_13=(Token)match(input,69,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getFunctionalityAccess().getOrganizedByKeyword_8());
            		
            // InternalDsl.g:2106:3: ( (otherlv_14= RULE_ID ) )
            // InternalDsl.g:2107:4: (otherlv_14= RULE_ID )
            {
            // InternalDsl.g:2107:4: (otherlv_14= RULE_ID )
            // InternalDsl.g:2108:5: otherlv_14= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionalityRule());
            					}
            				
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_14, grammarAccess.getFunctionalityAccess().getTypeDirectoryCrossReference_9_0());
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleFunctionality"


    // $ANTLR start "entryRuleRouterComponent"
    // InternalDsl.g:2127:1: entryRuleRouterComponent returns [EObject current=null] : iv_ruleRouterComponent= ruleRouterComponent EOF ;
    public final EObject entryRuleRouterComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRouterComponent = null;


        try {
            // InternalDsl.g:2127:56: (iv_ruleRouterComponent= ruleRouterComponent EOF )
            // InternalDsl.g:2128:2: iv_ruleRouterComponent= ruleRouterComponent EOF
            {
             newCompositeNode(grammarAccess.getRouterComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRouterComponent=ruleRouterComponent();

            state._fsp--;

             current =iv_ruleRouterComponent; 
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
    // $ANTLR end "entryRuleRouterComponent"


    // $ANTLR start "ruleRouterComponent"
    // InternalDsl.g:2134:1: ruleRouterComponent returns [EObject current=null] : (otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleRouterComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalDsl.g:2140:2: ( (otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalDsl.g:2141:2: (otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalDsl.g:2141:2: (otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalDsl.g:2142:3: otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRouterComponentAccess().getRouterKeyword_0());
            		
            // InternalDsl.g:2146:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2147:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2147:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2148:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRouterComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouterComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getRouterComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,71,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRouterComponentAccess().getInWithinKeyword_3());
            		
            // InternalDsl.g:2172:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:2173:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:2173:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:2174:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouterComponentRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(otherlv_4, grammarAccess.getRouterComponentAccess().getTypeDirectoryCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,62,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getRouterComponentAccess().getUseKeyword_5());
            		
            // InternalDsl.g:2189:3: ( (otherlv_6= RULE_ID ) )
            // InternalDsl.g:2190:4: (otherlv_6= RULE_ID )
            {
            // InternalDsl.g:2190:4: (otherlv_6= RULE_ID )
            // InternalDsl.g:2191:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouterComponentRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_57); 

            					newLeafNode(otherlv_6, grammarAccess.getRouterComponentAccess().getTypeJsModuleCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,72,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getRouterComponentAccess().getRouteKeyword_7());
            		
            // InternalDsl.g:2206:3: ( (otherlv_8= RULE_ID ) )
            // InternalDsl.g:2207:4: (otherlv_8= RULE_ID )
            {
            // InternalDsl.g:2207:4: (otherlv_8= RULE_ID )
            // InternalDsl.g:2208:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouterComponentRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_8, grammarAccess.getRouterComponentAccess().getRouteUIComponentCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRouterComponentAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleRouterComponent"


    // $ANTLR start "entryRuleContainer"
    // InternalDsl.g:2227:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDsl.g:2227:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDsl.g:2228:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalDsl.g:2234:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDsl.g:2240:2: ( (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) )
            // InternalDsl.g:2241:2: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            {
            // InternalDsl.g:2241:2: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            // InternalDsl.g:2242:3: otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
            		
            // InternalDsl.g:2246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2247:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,71,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getInWithinKeyword_3());
            		
            // InternalDsl.g:2272:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:2273:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:2273:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:2274:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getTypeDirectoryCrossReference_4_0());
            				

            }


            }

            // InternalDsl.g:2285:3: (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==74) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:2286:4: otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getDispatchKeyword_5_0());
                    			
                    // InternalDsl.g:2290:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDsl.g:2291:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDsl.g:2291:5: (otherlv_6= RULE_ID )
                    // InternalDsl.g:2292:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainerRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_59); 

                    						newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getTypeActionDispatcherCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2304:3: (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==75) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDsl.g:2305:4: otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,75,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getMapKeyword_6_0());
            	    			
            	    // InternalDsl.g:2309:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalDsl.g:2310:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDsl.g:2310:5: (otherlv_8= RULE_ID )
            	    // InternalDsl.g:2311:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContainerRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_59); 

            	    						newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getTypeReducerCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_9=(Token)match(input,62,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getUseKeyword_7());
            		
            // InternalDsl.g:2327:3: ( (otherlv_10= RULE_ID ) )
            // InternalDsl.g:2328:4: (otherlv_10= RULE_ID )
            {
            // InternalDsl.g:2328:4: (otherlv_10= RULE_ID )
            // InternalDsl.g:2329:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getTypeJsModuleCrossReference_8_0());
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleVisualizer"
    // InternalDsl.g:2348:1: entryRuleVisualizer returns [EObject current=null] : iv_ruleVisualizer= ruleVisualizer EOF ;
    public final EObject entryRuleVisualizer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualizer = null;


        try {
            // InternalDsl.g:2348:51: (iv_ruleVisualizer= ruleVisualizer EOF )
            // InternalDsl.g:2349:2: iv_ruleVisualizer= ruleVisualizer EOF
            {
             newCompositeNode(grammarAccess.getVisualizerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisualizer=ruleVisualizer();

            state._fsp--;

             current =iv_ruleVisualizer; 
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
    // $ANTLR end "entryRuleVisualizer"


    // $ANTLR start "ruleVisualizer"
    // InternalDsl.g:2355:1: ruleVisualizer returns [EObject current=null] : (otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' ) ;
    public final EObject ruleVisualizer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDsl.g:2361:2: ( (otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' ) )
            // InternalDsl.g:2362:2: (otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' )
            {
            // InternalDsl.g:2362:2: (otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' )
            // InternalDsl.g:2363:3: otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualizerAccess().getVisualizerKeyword_0());
            		
            // InternalDsl.g:2367:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2368:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2368:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2369:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVisualizerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVisualizerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getVisualizerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,71,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getVisualizerAccess().getInWithinKeyword_3());
            		
            // InternalDsl.g:2393:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:2394:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:2394:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:2395:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVisualizerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(otherlv_4, grammarAccess.getVisualizerAccess().getTypeDirectoryCrossReference_4_0());
            				

            }


            }

            // InternalDsl.g:2406:3: (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==62) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDsl.g:2407:4: otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,62,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getVisualizerAccess().getUseKeyword_5_0());
            	    			
            	    // InternalDsl.g:2411:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:2412:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:2412:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:2413:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVisualizerRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_49); 

            	    						newLeafNode(otherlv_6, grammarAccess.getVisualizerAccess().getTypeJsModuleCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVisualizerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleVisualizer"


    // $ANTLR start "entryRuleServiceFront"
    // InternalDsl.g:2433:1: entryRuleServiceFront returns [EObject current=null] : iv_ruleServiceFront= ruleServiceFront EOF ;
    public final EObject entryRuleServiceFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceFront = null;


        try {
            // InternalDsl.g:2433:53: (iv_ruleServiceFront= ruleServiceFront EOF )
            // InternalDsl.g:2434:2: iv_ruleServiceFront= ruleServiceFront EOF
            {
             newCompositeNode(grammarAccess.getServiceFrontRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceFront=ruleServiceFront();

            state._fsp--;

             current =iv_ruleServiceFront; 
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
    // $ANTLR end "entryRuleServiceFront"


    // $ANTLR start "ruleServiceFront"
    // InternalDsl.g:2440:1: ruleServiceFront returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}' ) ;
    public final EObject ruleServiceFront() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_STRING_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDsl.g:2446:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}' ) )
            // InternalDsl.g:2447:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}' )
            {
            // InternalDsl.g:2447:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}' )
            // InternalDsl.g:2448:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceFrontAccess().getServiceKeyword_0());
            		
            // InternalDsl.g:2452:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2453:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2453:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2454:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceFrontAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceFrontRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceFrontAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceFrontAccess().getUseKeyword_3());
            		
            // InternalDsl.g:2478:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:2479:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:2479:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:2480:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceFrontRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(otherlv_4, grammarAccess.getServiceFrontAccess().getTypeJsModuleCrossReference_4_0());
            				

            }


            }

            // InternalDsl.g:2491:3: (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==78) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDsl.g:2492:4: otherlv_5= 'method:' this_STRING_6= RULE_STRING
            	    {
            	    otherlv_5=(Token)match(input,78,FOLLOW_61); 

            	    				newLeafNode(otherlv_5, grammarAccess.getServiceFrontAccess().getMethodKeyword_5_0());
            	    			
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_62); 

            	    				newLeafNode(this_STRING_6, grammarAccess.getServiceFrontAccess().getSTRINGTerminalRuleCall_5_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceFrontAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleServiceFront"


    // $ANTLR start "entryRuleDirectory"
    // InternalDsl.g:2509:1: entryRuleDirectory returns [EObject current=null] : iv_ruleDirectory= ruleDirectory EOF ;
    public final EObject entryRuleDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectory = null;


        try {
            // InternalDsl.g:2509:50: (iv_ruleDirectory= ruleDirectory EOF )
            // InternalDsl.g:2510:2: iv_ruleDirectory= ruleDirectory EOF
            {
             newCompositeNode(grammarAccess.getDirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectory=ruleDirectory();

            state._fsp--;

             current =iv_ruleDirectory; 
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
    // $ANTLR end "entryRuleDirectory"


    // $ANTLR start "ruleDirectory"
    // InternalDsl.g:2516:1: ruleDirectory returns [EObject current=null] : (otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}' ) ;
    public final EObject ruleDirectory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalDsl.g:2522:2: ( (otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}' ) )
            // InternalDsl.g:2523:2: (otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}' )
            {
            // InternalDsl.g:2523:2: (otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}' )
            // InternalDsl.g:2524:3: otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectoryAccess().getDirectoryKeyword_0());
            		
            // InternalDsl.g:2528:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2529:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2529:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2530:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDirectoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getDirectoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2550:3: ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==80) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDsl.g:2551:4: (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) )
            	    {
            	    // InternalDsl.g:2551:4: (otherlv_3= 'has:' )+
            	    int cnt39=0;
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==80) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // InternalDsl.g:2552:5: otherlv_3= 'has:'
            	    	    {
            	    	    otherlv_3=(Token)match(input,80,FOLLOW_64); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getDirectoryAccess().getHasKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt39 >= 1 ) break loop39;
            	                EarlyExitException eee =
            	                    new EarlyExitException(39, input);
            	                throw eee;
            	        }
            	        cnt39++;
            	    } while (true);

            	    // InternalDsl.g:2557:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:2558:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:2558:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:2559:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDirectoryRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_63); 

            	    						newLeafNode(otherlv_4, grammarAccess.getDirectoryAccess().getFileFileCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalDsl.g:2571:3: (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==81) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDsl.g:2572:4: otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,81,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDirectoryAccess().getContainsKeyword_4_0());
            	    			
            	    // InternalDsl.g:2576:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:2577:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:2577:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:2578:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDirectoryRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_65); 

            	    						newLeafNode(otherlv_6, grammarAccess.getDirectoryAccess().getSubdirectoryDirectoryCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_7=(Token)match(input,82,FOLLOW_61); 

            			newLeafNode(otherlv_7, grammarAccess.getDirectoryAccess().getPurposeKeyword_5());
            		
            this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(this_STRING_8, grammarAccess.getDirectoryAccess().getSTRINGTerminalRuleCall_6());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDirectoryAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDirectory"


    // $ANTLR start "entryRuleFile"
    // InternalDsl.g:2606:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalDsl.g:2606:45: (iv_ruleFile= ruleFile EOF )
            // InternalDsl.g:2607:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalDsl.g:2613:1: ruleFile returns [EObject current=null] : (this_Md_0= ruleMd | this_Js_1= ruleJs | this_Json_2= ruleJson | this_Css_3= ruleCss ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject this_Md_0 = null;

        EObject this_Js_1 = null;

        EObject this_Json_2 = null;

        EObject this_Css_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:2619:2: ( (this_Md_0= ruleMd | this_Js_1= ruleJs | this_Json_2= ruleJson | this_Css_3= ruleCss ) )
            // InternalDsl.g:2620:2: (this_Md_0= ruleMd | this_Js_1= ruleJs | this_Json_2= ruleJson | this_Css_3= ruleCss )
            {
            // InternalDsl.g:2620:2: (this_Md_0= ruleMd | this_Js_1= ruleJs | this_Json_2= ruleJson | this_Css_3= ruleCss )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt42=1;
                }
                break;
            case 84:
                {
                alt42=2;
                }
                break;
            case 85:
                {
                alt42=3;
                }
                break;
            case 86:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalDsl.g:2621:3: this_Md_0= ruleMd
                    {

                    			newCompositeNode(grammarAccess.getFileAccess().getMdParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Md_0=ruleMd();

                    state._fsp--;


                    			current = this_Md_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2630:3: this_Js_1= ruleJs
                    {

                    			newCompositeNode(grammarAccess.getFileAccess().getJsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Js_1=ruleJs();

                    state._fsp--;


                    			current = this_Js_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:2639:3: this_Json_2= ruleJson
                    {

                    			newCompositeNode(grammarAccess.getFileAccess().getJsonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Json_2=ruleJson();

                    state._fsp--;


                    			current = this_Json_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:2648:3: this_Css_3= ruleCss
                    {

                    			newCompositeNode(grammarAccess.getFileAccess().getCssParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Css_3=ruleCss();

                    state._fsp--;


                    			current = this_Css_3;
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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleMd"
    // InternalDsl.g:2660:1: entryRuleMd returns [EObject current=null] : iv_ruleMd= ruleMd EOF ;
    public final EObject entryRuleMd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMd = null;


        try {
            // InternalDsl.g:2660:43: (iv_ruleMd= ruleMd EOF )
            // InternalDsl.g:2661:2: iv_ruleMd= ruleMd EOF
            {
             newCompositeNode(grammarAccess.getMdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMd=ruleMd();

            state._fsp--;

             current =iv_ruleMd; 
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
    // $ANTLR end "entryRuleMd"


    // $ANTLR start "ruleMd"
    // InternalDsl.g:2667:1: ruleMd returns [EObject current=null] : (otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
    public final EObject ruleMd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:2673:2: ( (otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:2674:2: (otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:2674:2: (otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:2675:3: otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMdAccess().getMdKeyword_0());
            		
            // InternalDsl.g:2679:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2680:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2680:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2681:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMdAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMdAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getMdAccess().getTypeKeyword_3());
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(this_STRING_4, grammarAccess.getMdAccess().getSTRINGTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMdAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMd"


    // $ANTLR start "entryRuleJs"
    // InternalDsl.g:2717:1: entryRuleJs returns [EObject current=null] : iv_ruleJs= ruleJs EOF ;
    public final EObject entryRuleJs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJs = null;


        try {
            // InternalDsl.g:2717:43: (iv_ruleJs= ruleJs EOF )
            // InternalDsl.g:2718:2: iv_ruleJs= ruleJs EOF
            {
             newCompositeNode(grammarAccess.getJsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJs=ruleJs();

            state._fsp--;

             current =iv_ruleJs; 
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
    // $ANTLR end "entryRuleJs"


    // $ANTLR start "ruleJs"
    // InternalDsl.g:2724:1: ruleJs returns [EObject current=null] : (otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
    public final EObject ruleJs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:2730:2: ( (otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:2731:2: (otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:2731:2: (otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:2732:3: otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJsAccess().getJsKeyword_0());
            		
            // InternalDsl.g:2736:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2737:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2737:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2738:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getJsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getJsAccess().getTypeKeyword_3());
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(this_STRING_4, grammarAccess.getJsAccess().getSTRINGTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleJs"


    // $ANTLR start "entryRuleJson"
    // InternalDsl.g:2774:1: entryRuleJson returns [EObject current=null] : iv_ruleJson= ruleJson EOF ;
    public final EObject entryRuleJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJson = null;


        try {
            // InternalDsl.g:2774:45: (iv_ruleJson= ruleJson EOF )
            // InternalDsl.g:2775:2: iv_ruleJson= ruleJson EOF
            {
             newCompositeNode(grammarAccess.getJsonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJson=ruleJson();

            state._fsp--;

             current =iv_ruleJson; 
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
    // $ANTLR end "entryRuleJson"


    // $ANTLR start "ruleJson"
    // InternalDsl.g:2781:1: ruleJson returns [EObject current=null] : (otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
    public final EObject ruleJson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:2787:2: ( (otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:2788:2: (otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:2788:2: (otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:2789:3: otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonAccess().getJsonKeyword_0());
            		
            // InternalDsl.g:2793:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2794:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2794:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2795:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJsonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getJsonAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getJsonAccess().getTypeKeyword_3());
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(this_STRING_4, grammarAccess.getJsonAccess().getSTRINGTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJsonAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleJson"


    // $ANTLR start "entryRuleCss"
    // InternalDsl.g:2831:1: entryRuleCss returns [EObject current=null] : iv_ruleCss= ruleCss EOF ;
    public final EObject entryRuleCss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCss = null;


        try {
            // InternalDsl.g:2831:44: (iv_ruleCss= ruleCss EOF )
            // InternalDsl.g:2832:2: iv_ruleCss= ruleCss EOF
            {
             newCompositeNode(grammarAccess.getCssRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCss=ruleCss();

            state._fsp--;

             current =iv_ruleCss; 
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
    // $ANTLR end "entryRuleCss"


    // $ANTLR start "ruleCss"
    // InternalDsl.g:2838:1: ruleCss returns [EObject current=null] : (otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
    public final EObject ruleCss() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:2844:2: ( (otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:2845:2: (otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:2845:2: (otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:2846:3: otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCssAccess().getCssKeyword_0());
            		
            // InternalDsl.g:2850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2851:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2852:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCssAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCssRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCssAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getCssAccess().getTypeKeyword_3());
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(this_STRING_4, grammarAccess.getCssAccess().getSTRINGTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCssAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCss"


    // $ANTLR start "entryRuleState"
    // InternalDsl.g:2888:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalDsl.g:2888:46: (iv_ruleState= ruleState EOF )
            // InternalDsl.g:2889:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalDsl.g:2895:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDsl.g:2901:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // InternalDsl.g:2902:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // InternalDsl.g:2902:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // InternalDsl.g:2903:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalDsl.g:2907:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2908:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2908:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2909:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2929:3: (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==88) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDsl.g:2930:4: otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,88,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getHandleActionKeyword_3_0());
            	    			
            	    // InternalDsl.g:2934:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:2935:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:2935:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:2936:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStateRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_66); 

            	    						newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionActionCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalDsl.g:2948:3: (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==89) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDsl.g:2949:4: otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,89,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getHandleReducerKeyword_4_0());
            	    			
            	    // InternalDsl.g:2953:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:2954:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:2954:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:2955:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStateRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_67); 

            	    						newLeafNode(otherlv_6, grammarAccess.getStateAccess().getReducerReducerCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:2975:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDsl.g:2975:47: (iv_ruleAction= ruleAction EOF )
            // InternalDsl.g:2976:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDsl.g:2982:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalDsl.g:2988:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalDsl.g:2989:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalDsl.g:2989:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalDsl.g:2990:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalDsl.g:2994:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2995:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2995:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2996:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:3016:3: (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==91) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDsl.g:3017:4: otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,91,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getCreateKeyword_3_0());
            	    			
            	    // InternalDsl.g:3021:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:3022:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:3022:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:3023:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActionRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_68); 

            	    						newLeafNode(otherlv_4, grammarAccess.getActionAccess().getActionCreatorActionCreatorCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalDsl.g:3035:3: (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==74) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDsl.g:3036:4: otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,74,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getDispatchKeyword_4_0());
            	    			
            	    // InternalDsl.g:3040:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:3041:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:3041:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:3042:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActionRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_69); 

            	    						newLeafNode(otherlv_6, grammarAccess.getActionAccess().getActionDispatcherActionDispatcherCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_7=(Token)match(input,92,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getActionDirectoryKeyword_5());
            		
            // InternalDsl.g:3058:3: ( (otherlv_8= RULE_ID ) )
            // InternalDsl.g:3059:4: (otherlv_8= RULE_ID )
            {
            // InternalDsl.g:3059:4: (otherlv_8= RULE_ID )
            // InternalDsl.g:3060:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_8, grammarAccess.getActionAccess().getDirDirectoryCrossReference_6_0());
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionCreator"
    // InternalDsl.g:3079:1: entryRuleActionCreator returns [EObject current=null] : iv_ruleActionCreator= ruleActionCreator EOF ;
    public final EObject entryRuleActionCreator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionCreator = null;


        try {
            // InternalDsl.g:3079:54: (iv_ruleActionCreator= ruleActionCreator EOF )
            // InternalDsl.g:3080:2: iv_ruleActionCreator= ruleActionCreator EOF
            {
             newCompositeNode(grammarAccess.getActionCreatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionCreator=ruleActionCreator();

            state._fsp--;

             current =iv_ruleActionCreator; 
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
    // $ANTLR end "entryRuleActionCreator"


    // $ANTLR start "ruleActionCreator"
    // InternalDsl.g:3086:1: ruleActionCreator returns [EObject current=null] : (otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
    public final EObject ruleActionCreator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:3092:2: ( (otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:3093:2: (otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:3093:2: (otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:3094:3: otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getActionCreatorAccess().getActionCreatorKeyword_0());
            		
            // InternalDsl.g:3098:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3099:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3099:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3100:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionCreatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionCreatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getActionCreatorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getActionCreatorAccess().getTypeKeyword_3());
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(this_STRING_4, grammarAccess.getActionCreatorAccess().getSTRINGTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActionCreatorAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleActionCreator"


    // $ANTLR start "entryRuleActionDispatcher"
    // InternalDsl.g:3136:1: entryRuleActionDispatcher returns [EObject current=null] : iv_ruleActionDispatcher= ruleActionDispatcher EOF ;
    public final EObject entryRuleActionDispatcher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDispatcher = null;


        try {
            // InternalDsl.g:3136:57: (iv_ruleActionDispatcher= ruleActionDispatcher EOF )
            // InternalDsl.g:3137:2: iv_ruleActionDispatcher= ruleActionDispatcher EOF
            {
             newCompositeNode(grammarAccess.getActionDispatcherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDispatcher=ruleActionDispatcher();

            state._fsp--;

             current =iv_ruleActionDispatcher; 
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
    // $ANTLR end "entryRuleActionDispatcher"


    // $ANTLR start "ruleActionDispatcher"
    // InternalDsl.g:3143:1: ruleActionDispatcher returns [EObject current=null] : (otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleActionDispatcher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:3149:2: ( (otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:3150:2: (otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:3150:2: (otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            // InternalDsl.g:3151:3: otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getActionDispatcherAccess().getActionDispatcherKeyword_0());
            		
            // InternalDsl.g:3155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3156:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionDispatcherAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDispatcherRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getActionDispatcherAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:3177:3: (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==62) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDsl.g:3178:4: otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,62,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getActionDispatcherAccess().getUseKeyword_3_0());
            	    			
            	    // InternalDsl.g:3182:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:3183:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:3183:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:3184:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActionDispatcherRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_49); 

            	    						newLeafNode(otherlv_4, grammarAccess.getActionDispatcherAccess().getTypeActionCreatorCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActionDispatcherAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleActionDispatcher"


    // $ANTLR start "entryRuleReducer"
    // InternalDsl.g:3204:1: entryRuleReducer returns [EObject current=null] : iv_ruleReducer= ruleReducer EOF ;
    public final EObject entryRuleReducer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReducer = null;


        try {
            // InternalDsl.g:3204:48: (iv_ruleReducer= ruleReducer EOF )
            // InternalDsl.g:3205:2: iv_ruleReducer= ruleReducer EOF
            {
             newCompositeNode(grammarAccess.getReducerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReducer=ruleReducer();

            state._fsp--;

             current =iv_ruleReducer; 
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
    // $ANTLR end "entryRuleReducer"


    // $ANTLR start "ruleReducer"
    // InternalDsl.g:3211:1: ruleReducer returns [EObject current=null] : (otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
    public final EObject ruleReducer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDsl.g:3217:2: ( (otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // InternalDsl.g:3218:2: (otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // InternalDsl.g:3218:2: (otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // InternalDsl.g:3219:3: otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReducerAccess().getReducerKeyword_0());
            		
            // InternalDsl.g:3223:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3224:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3224:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3225:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReducerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReducerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getReducerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:3245:3: (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==96) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDsl.g:3246:4: otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,96,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getReducerAccess().getCatchKeyword_3_0());
            	    			
            	    // InternalDsl.g:3250:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:3251:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:3251:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:3252:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReducerRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_71); 

            	    						newLeafNode(otherlv_4, grammarAccess.getReducerAccess().getTypeActionCreatorCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            otherlv_5=(Token)match(input,97,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getReducerAccess().getReducerDirectoryKeyword_4());
            		
            // InternalDsl.g:3268:3: ( (otherlv_6= RULE_ID ) )
            // InternalDsl.g:3269:4: (otherlv_6= RULE_ID )
            {
            // InternalDsl.g:3269:4: (otherlv_6= RULE_ID )
            // InternalDsl.g:3270:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReducerRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_6, grammarAccess.getReducerAccess().getTypeDirectoryCrossReference_5_0());
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getReducerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleReducer"


    // $ANTLR start "entryRuleJsModule"
    // InternalDsl.g:3289:1: entryRuleJsModule returns [EObject current=null] : iv_ruleJsModule= ruleJsModule EOF ;
    public final EObject entryRuleJsModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsModule = null;


        try {
            // InternalDsl.g:3289:49: (iv_ruleJsModule= ruleJsModule EOF )
            // InternalDsl.g:3290:2: iv_ruleJsModule= ruleJsModule EOF
            {
             newCompositeNode(grammarAccess.getJsModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsModule=ruleJsModule();

            state._fsp--;

             current =iv_ruleJsModule; 
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
    // $ANTLR end "entryRuleJsModule"


    // $ANTLR start "ruleJsModule"
    // InternalDsl.g:3296:1: ruleJsModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' ) ;
    public final EObject ruleJsModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:3302:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' ) )
            // InternalDsl.g:3303:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:3303:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' )
            // InternalDsl.g:3304:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJsModuleAccess().getModuleKeyword_0());
            		
            // InternalDsl.g:3308:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3309:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3309:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3310:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJsModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getJsModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,98,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getJsModuleAccess().getPresentInKeyword_3());
            		
            // InternalDsl.g:3334:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:3335:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:3335:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:3336:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsModuleRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_4, grammarAccess.getJsModuleAccess().getTypeDirectoryCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJsModuleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleJsModule"

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
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8800000001008000L,0x00000000E4F8B240L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x9800000001008000L,0x00000000E4F8B240L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000002000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003CL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000002000L,0x0000000003000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000002000L,0x0000000002000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000400L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000400L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});

}