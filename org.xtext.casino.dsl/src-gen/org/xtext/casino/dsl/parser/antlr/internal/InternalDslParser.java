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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Casino'", "'{'", "'}'", "'domain'", "'module'", "'submodule'", "'op'", "'type:'", "'operates_on:'", "'Read'", "'Create'", "'generalEntity'", "':'", "'dataType'", "'specialEntity'", "'trx'", "'exchange'", "'sale'", "'rel'", "'Composition'", "'source:'", "'target:'", "'arch'", "'component'", "'Back'", "'Front'", "'layer'", "'JavaScript'", "'Ejb'", "'War'", "'layerSegment'", "'Services'", "'Ui'", "'Store'", "'RestEntity'", "'Pojo'", "'Facade'", "'Dto'", "'Util'", "'Containers'", "'allowedToUse:'", "'sublayerSegment'", "'Actions'", "'Reducers'", "'relationArch'", "','", "'tech'", "'javaApp'", "'jeeProject'", "'subproject'", "'abstractClass'", "'use :'", "'genericClass'", "'extends :'", "'implements :'", "'nativeClass'", "'attribute'", "'epackage'", "'methodBack'", "'argument'", "'return'", "'descriptor'", "'path'", "'annotation'", "'propertie'", "'library'", "'isNative'", "'true'", "'false'", "'reactApp'", "'performs:'", "'holds:'", "'use:'", "'functionality'", "'uses:'", "'wraps:'", "'render:'", "'state:'", "'calls:'", "'organizedBy:'", "'router'", "'inWithin:'", "'route:'", "'container'", "'dispatch:'", "'map:'", "'visualizer'", "'service'", "'method:'", "'directory'", "'has:'", "'contains:'", "'purpose:'", "'md'", "'js'", "'json'", "'css'", "'state'", "'handleAction:'", "'handleReducer:'", "'action'", "'create:'", "'actionDirectory:'", "'actionCreator'", "'actionDispatcher'", "'reducer'", "'catch:'", "'reducerDirectory:'", "'presentIn:'"
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
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
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
        EObject lv_java_2_0 = null;

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
    // InternalDsl.g:1672:1: entryRuleJavaApp returns [EObject current=null] : iv_ruleJavaApp= ruleJavaApp EOF ;
    public final EObject entryRuleJavaApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaApp = null;


        try {
            // InternalDsl.g:1672:48: (iv_ruleJavaApp= ruleJavaApp EOF )
            // InternalDsl.g:1673:2: iv_ruleJavaApp= ruleJavaApp EOF
            {
             newCompositeNode(grammarAccess.getJavaAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaApp=ruleJavaApp();

            state._fsp--;

             current =iv_ruleJavaApp; 
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
    // InternalDsl.g:1679:1: ruleJavaApp returns [EObject current=null] : (otherlv_0= 'javaApp' otherlv_1= '{' ( (lv_jeeproject_2_0= ruleJeeProject ) ) otherlv_3= '}' ) ;
    public final EObject ruleJavaApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_jeeproject_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1685:2: ( (otherlv_0= 'javaApp' otherlv_1= '{' ( (lv_jeeproject_2_0= ruleJeeProject ) ) otherlv_3= '}' ) )
            // InternalDsl.g:1686:2: (otherlv_0= 'javaApp' otherlv_1= '{' ( (lv_jeeproject_2_0= ruleJeeProject ) ) otherlv_3= '}' )
            {
            // InternalDsl.g:1686:2: (otherlv_0= 'javaApp' otherlv_1= '{' ( (lv_jeeproject_2_0= ruleJeeProject ) ) otherlv_3= '}' )
            // InternalDsl.g:1687:3: otherlv_0= 'javaApp' otherlv_1= '{' ( (lv_jeeproject_2_0= ruleJeeProject ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJavaAppAccess().getJavaAppKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaAppAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:1695:3: ( (lv_jeeproject_2_0= ruleJeeProject ) )
            // InternalDsl.g:1696:4: (lv_jeeproject_2_0= ruleJeeProject )
            {
            // InternalDsl.g:1696:4: (lv_jeeproject_2_0= ruleJeeProject )
            // InternalDsl.g:1697:5: lv_jeeproject_2_0= ruleJeeProject
            {

            					newCompositeNode(grammarAccess.getJavaAppAccess().getJeeprojectJeeProjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_jeeproject_2_0=ruleJeeProject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJavaAppRule());
            					}
            					add(
            						current,
            						"jeeproject",
            						lv_jeeproject_2_0,
            						"org.xtext.casino.dsl.Dsl.JeeProject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getJavaAppAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleJeeProject"
    // InternalDsl.g:1722:1: entryRuleJeeProject returns [EObject current=null] : iv_ruleJeeProject= ruleJeeProject EOF ;
    public final EObject entryRuleJeeProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeeProject = null;


        try {
            // InternalDsl.g:1722:51: (iv_ruleJeeProject= ruleJeeProject EOF )
            // InternalDsl.g:1723:2: iv_ruleJeeProject= ruleJeeProject EOF
            {
             newCompositeNode(grammarAccess.getJeeProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJeeProject=ruleJeeProject();

            state._fsp--;

             current =iv_ruleJeeProject; 
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
    // $ANTLR end "entryRuleJeeProject"


    // $ANTLR start "ruleJeeProject"
    // InternalDsl.g:1729:1: ruleJeeProject returns [EObject current=null] : (otherlv_0= 'jeeProject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subproject_3_0= ruleSubproject ) )+ otherlv_4= '}' ) ;
    public final EObject ruleJeeProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_subproject_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1735:2: ( (otherlv_0= 'jeeProject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subproject_3_0= ruleSubproject ) )+ otherlv_4= '}' ) )
            // InternalDsl.g:1736:2: (otherlv_0= 'jeeProject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subproject_3_0= ruleSubproject ) )+ otherlv_4= '}' )
            {
            // InternalDsl.g:1736:2: (otherlv_0= 'jeeProject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subproject_3_0= ruleSubproject ) )+ otherlv_4= '}' )
            // InternalDsl.g:1737:3: otherlv_0= 'jeeProject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subproject_3_0= ruleSubproject ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJeeProjectAccess().getJeeProjectKeyword_0());
            		
            // InternalDsl.g:1741:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1742:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1742:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1743:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJeeProjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeeProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getJeeProjectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1763:3: ( (lv_subproject_3_0= ruleSubproject ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==60) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDsl.g:1764:4: (lv_subproject_3_0= ruleSubproject )
            	    {
            	    // InternalDsl.g:1764:4: (lv_subproject_3_0= ruleSubproject )
            	    // InternalDsl.g:1765:5: lv_subproject_3_0= ruleSubproject
            	    {

            	    					newCompositeNode(grammarAccess.getJeeProjectAccess().getSubprojectSubprojectParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_subproject_3_0=ruleSubproject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeeProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subproject",
            	    						lv_subproject_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Subproject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJeeProjectAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleJeeProject"


    // $ANTLR start "entryRuleSubproject"
    // InternalDsl.g:1790:1: entryRuleSubproject returns [EObject current=null] : iv_ruleSubproject= ruleSubproject EOF ;
    public final EObject entryRuleSubproject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproject = null;


        try {
            // InternalDsl.g:1790:51: (iv_ruleSubproject= ruleSubproject EOF )
            // InternalDsl.g:1791:2: iv_ruleSubproject= ruleSubproject EOF
            {
             newCompositeNode(grammarAccess.getSubprojectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubproject=ruleSubproject();

            state._fsp--;

             current =iv_ruleSubproject; 
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
    // $ANTLR end "entryRuleSubproject"


    // $ANTLR start "ruleSubproject"
    // InternalDsl.g:1797:1: ruleSubproject returns [EObject current=null] : (otherlv_0= 'subproject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_epackage_3_0= ruleEpackage ) )+ otherlv_4= ',' ( (lv_library_5_0= ruleLibrary ) )+ otherlv_6= ',' ( (lv_descriptor_7_0= ruleDescriptor ) )+ otherlv_8= '}' ) ;
    public final EObject ruleSubproject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_epackage_3_0 = null;

        EObject lv_library_5_0 = null;

        EObject lv_descriptor_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1803:2: ( (otherlv_0= 'subproject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_epackage_3_0= ruleEpackage ) )+ otherlv_4= ',' ( (lv_library_5_0= ruleLibrary ) )+ otherlv_6= ',' ( (lv_descriptor_7_0= ruleDescriptor ) )+ otherlv_8= '}' ) )
            // InternalDsl.g:1804:2: (otherlv_0= 'subproject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_epackage_3_0= ruleEpackage ) )+ otherlv_4= ',' ( (lv_library_5_0= ruleLibrary ) )+ otherlv_6= ',' ( (lv_descriptor_7_0= ruleDescriptor ) )+ otherlv_8= '}' )
            {
            // InternalDsl.g:1804:2: (otherlv_0= 'subproject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_epackage_3_0= ruleEpackage ) )+ otherlv_4= ',' ( (lv_library_5_0= ruleLibrary ) )+ otherlv_6= ',' ( (lv_descriptor_7_0= ruleDescriptor ) )+ otherlv_8= '}' )
            // InternalDsl.g:1805:3: otherlv_0= 'subproject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_epackage_3_0= ruleEpackage ) )+ otherlv_4= ',' ( (lv_library_5_0= ruleLibrary ) )+ otherlv_6= ',' ( (lv_descriptor_7_0= ruleDescriptor ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSubprojectAccess().getSubprojectKeyword_0());
            		
            // InternalDsl.g:1809:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1810:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1810:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1811:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubprojectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubprojectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getSubprojectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1831:3: ( (lv_epackage_3_0= ruleEpackage ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==68) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:1832:4: (lv_epackage_3_0= ruleEpackage )
            	    {
            	    // InternalDsl.g:1832:4: (lv_epackage_3_0= ruleEpackage )
            	    // InternalDsl.g:1833:5: lv_epackage_3_0= ruleEpackage
            	    {

            	    					newCompositeNode(grammarAccess.getSubprojectAccess().getEpackageEpackageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_epackage_3_0=ruleEpackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubprojectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"epackage",
            	    						lv_epackage_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Epackage");
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

            otherlv_4=(Token)match(input,56,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getSubprojectAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:1854:3: ( (lv_library_5_0= ruleLibrary ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==76) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:1855:4: (lv_library_5_0= ruleLibrary )
            	    {
            	    // InternalDsl.g:1855:4: (lv_library_5_0= ruleLibrary )
            	    // InternalDsl.g:1856:5: lv_library_5_0= ruleLibrary
            	    {

            	    					newCompositeNode(grammarAccess.getSubprojectAccess().getLibraryLibraryParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_51);
            	    lv_library_5_0=ruleLibrary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubprojectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"library",
            	    						lv_library_5_0,
            	    						"org.xtext.casino.dsl.Dsl.Library");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_6=(Token)match(input,56,FOLLOW_52); 

            			newLeafNode(otherlv_6, grammarAccess.getSubprojectAccess().getCommaKeyword_6());
            		
            // InternalDsl.g:1877:3: ( (lv_descriptor_7_0= ruleDescriptor ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==72) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDsl.g:1878:4: (lv_descriptor_7_0= ruleDescriptor )
            	    {
            	    // InternalDsl.g:1878:4: (lv_descriptor_7_0= ruleDescriptor )
            	    // InternalDsl.g:1879:5: lv_descriptor_7_0= ruleDescriptor
            	    {

            	    					newCompositeNode(grammarAccess.getSubprojectAccess().getDescriptorDescriptorParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_53);
            	    lv_descriptor_7_0=ruleDescriptor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubprojectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"descriptor",
            	    						lv_descriptor_7_0,
            	    						"org.xtext.casino.dsl.Dsl.Descriptor");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSubprojectAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSubproject"


    // $ANTLR start "entryRuleAbstractClass"
    // InternalDsl.g:1904:1: entryRuleAbstractClass returns [EObject current=null] : iv_ruleAbstractClass= ruleAbstractClass EOF ;
    public final EObject entryRuleAbstractClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClass = null;


        try {
            // InternalDsl.g:1904:54: (iv_ruleAbstractClass= ruleAbstractClass EOF )
            // InternalDsl.g:1905:2: iv_ruleAbstractClass= ruleAbstractClass EOF
            {
             newCompositeNode(grammarAccess.getAbstractClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractClass=ruleAbstractClass();

            state._fsp--;

             current =iv_ruleAbstractClass; 
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
    // $ANTLR end "entryRuleAbstractClass"


    // $ANTLR start "ruleAbstractClass"
    // InternalDsl.g:1911:1: ruleAbstractClass returns [EObject current=null] : (otherlv_0= 'abstractClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* ( (lv_abstractMethod_7_0= ruleAbstractMethod ) )* otherlv_8= '}' ) ;
    public final EObject ruleAbstractClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_attribute_3_0 = null;

        EObject lv_methodClass_4_0 = null;

        EObject lv_abstractMethod_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1917:2: ( (otherlv_0= 'abstractClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* ( (lv_abstractMethod_7_0= ruleAbstractMethod ) )* otherlv_8= '}' ) )
            // InternalDsl.g:1918:2: (otherlv_0= 'abstractClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* ( (lv_abstractMethod_7_0= ruleAbstractMethod ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:1918:2: (otherlv_0= 'abstractClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* ( (lv_abstractMethod_7_0= ruleAbstractMethod ) )* otherlv_8= '}' )
            // InternalDsl.g:1919:3: otherlv_0= 'abstractClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* ( (lv_abstractMethod_7_0= ruleAbstractMethod ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractClassAccess().getAbstractClassKeyword_0());
            		
            // InternalDsl.g:1923:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1924:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1924:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1925:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbstractClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1945:3: ( (lv_attribute_3_0= ruleAttribute ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==67) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDsl.g:1946:4: (lv_attribute_3_0= ruleAttribute )
            	    {
            	    // InternalDsl.g:1946:4: (lv_attribute_3_0= ruleAttribute )
            	    // InternalDsl.g:1947:5: lv_attribute_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractClassAccess().getAttributeAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_attribute_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalDsl.g:1964:3: ( (lv_methodClass_4_0= ruleMethodBack ) )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // InternalDsl.g:1965:4: (lv_methodClass_4_0= ruleMethodBack )
            	    {
            	    // InternalDsl.g:1965:4: (lv_methodClass_4_0= ruleMethodBack )
            	    // InternalDsl.g:1966:5: lv_methodClass_4_0= ruleMethodBack
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractClassAccess().getMethodClassMethodBackParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_55);
            	    lv_methodClass_4_0=ruleMethodBack();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methodClass",
            	    						lv_methodClass_4_0,
            	    						"org.xtext.casino.dsl.Dsl.MethodBack");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalDsl.g:1983:3: (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==62) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDsl.g:1984:4: otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,62,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAbstractClassAccess().getUseKeyword_5_0());
            	    			
            	    // InternalDsl.g:1988:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:1989:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:1989:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:1990:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAbstractClassRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_55); 

            	    						newLeafNode(otherlv_6, grammarAccess.getAbstractClassAccess().getAnnotationAnnotationCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalDsl.g:2002:3: ( (lv_abstractMethod_7_0= ruleAbstractMethod ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==69) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDsl.g:2003:4: (lv_abstractMethod_7_0= ruleAbstractMethod )
            	    {
            	    // InternalDsl.g:2003:4: (lv_abstractMethod_7_0= ruleAbstractMethod )
            	    // InternalDsl.g:2004:5: lv_abstractMethod_7_0= ruleAbstractMethod
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractClassAccess().getAbstractMethodAbstractMethodParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_56);
            	    lv_abstractMethod_7_0=ruleAbstractMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractMethod",
            	    						lv_abstractMethod_7_0,
            	    						"org.xtext.casino.dsl.Dsl.AbstractMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAbstractClassAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAbstractClass"


    // $ANTLR start "entryRuleGenericClass"
    // InternalDsl.g:2029:1: entryRuleGenericClass returns [EObject current=null] : iv_ruleGenericClass= ruleGenericClass EOF ;
    public final EObject entryRuleGenericClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericClass = null;


        try {
            // InternalDsl.g:2029:53: (iv_ruleGenericClass= ruleGenericClass EOF )
            // InternalDsl.g:2030:2: iv_ruleGenericClass= ruleGenericClass EOF
            {
             newCompositeNode(grammarAccess.getGenericClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericClass=ruleGenericClass();

            state._fsp--;

             current =iv_ruleGenericClass; 
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
    // $ANTLR end "entryRuleGenericClass"


    // $ANTLR start "ruleGenericClass"
    // InternalDsl.g:2036:1: ruleGenericClass returns [EObject current=null] : (otherlv_0= 'genericClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'extends :' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'implements :' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleGenericClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_attribute_3_0 = null;

        EObject lv_methodClass_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2042:2: ( (otherlv_0= 'genericClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'extends :' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'implements :' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) )
            // InternalDsl.g:2043:2: (otherlv_0= 'genericClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'extends :' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'implements :' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            {
            // InternalDsl.g:2043:2: (otherlv_0= 'genericClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'extends :' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'implements :' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            // InternalDsl.g:2044:3: otherlv_0= 'genericClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'extends :' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'implements :' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGenericClassAccess().getGenericClassKeyword_0());
            		
            // InternalDsl.g:2048:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2049:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2049:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2050:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGenericClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGenericClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getGenericClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2070:3: ( (lv_attribute_3_0= ruleAttribute ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==67) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDsl.g:2071:4: (lv_attribute_3_0= ruleAttribute )
            	    {
            	    // InternalDsl.g:2071:4: (lv_attribute_3_0= ruleAttribute )
            	    // InternalDsl.g:2072:5: lv_attribute_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getGenericClassAccess().getAttributeAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_57);
            	    lv_attribute_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGenericClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalDsl.g:2089:3: ( (lv_methodClass_4_0= ruleMethodBack ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==69) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDsl.g:2090:4: (lv_methodClass_4_0= ruleMethodBack )
            	    {
            	    // InternalDsl.g:2090:4: (lv_methodClass_4_0= ruleMethodBack )
            	    // InternalDsl.g:2091:5: lv_methodClass_4_0= ruleMethodBack
            	    {

            	    					newCompositeNode(grammarAccess.getGenericClassAccess().getMethodClassMethodBackParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_58);
            	    lv_methodClass_4_0=ruleMethodBack();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGenericClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methodClass",
            	    						lv_methodClass_4_0,
            	    						"org.xtext.casino.dsl.Dsl.MethodBack");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalDsl.g:2108:3: (otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==62) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDsl.g:2109:4: otherlv_5= 'use :' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,62,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGenericClassAccess().getUseKeyword_5_0());
            	    			
            	    // InternalDsl.g:2113:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:2114:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:2114:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:2115:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGenericClassRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_59); 

            	    						newLeafNode(otherlv_6, grammarAccess.getGenericClassAccess().getAnnotationAnnotationCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalDsl.g:2127:3: (otherlv_7= 'extends :' ( (otherlv_8= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==64) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:2128:4: otherlv_7= 'extends :' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getGenericClassAccess().getExtendsKeyword_6_0());
                    			
                    // InternalDsl.g:2132:4: ( (otherlv_8= RULE_ID ) )
                    // InternalDsl.g:2133:5: (otherlv_8= RULE_ID )
                    {
                    // InternalDsl.g:2133:5: (otherlv_8= RULE_ID )
                    // InternalDsl.g:2134:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGenericClassRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_60); 

                    						newLeafNode(otherlv_8, grammarAccess.getGenericClassAccess().getAbsAbstractClassCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2146:3: (otherlv_9= 'implements :' ( (otherlv_10= RULE_ID ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==65) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDsl.g:2147:4: otherlv_9= 'implements :' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,65,FOLLOW_11); 

            	    				newLeafNode(otherlv_9, grammarAccess.getGenericClassAccess().getImplementsKeyword_7_0());
            	    			
            	    // InternalDsl.g:2151:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalDsl.g:2152:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalDsl.g:2152:5: (otherlv_10= RULE_ID )
            	    // InternalDsl.g:2153:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGenericClassRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_60); 

            	    						newLeafNode(otherlv_10, grammarAccess.getGenericClassAccess().getImpEinterfaceCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGenericClassAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleGenericClass"


    // $ANTLR start "entryRuleNativeClass"
    // InternalDsl.g:2173:1: entryRuleNativeClass returns [EObject current=null] : iv_ruleNativeClass= ruleNativeClass EOF ;
    public final EObject entryRuleNativeClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeClass = null;


        try {
            // InternalDsl.g:2173:52: (iv_ruleNativeClass= ruleNativeClass EOF )
            // InternalDsl.g:2174:2: iv_ruleNativeClass= ruleNativeClass EOF
            {
             newCompositeNode(grammarAccess.getNativeClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNativeClass=ruleNativeClass();

            state._fsp--;

             current =iv_ruleNativeClass; 
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
    // $ANTLR end "entryRuleNativeClass"


    // $ANTLR start "ruleNativeClass"
    // InternalDsl.g:2180:1: ruleNativeClass returns [EObject current=null] : (otherlv_0= 'nativeClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* otherlv_5= '}' ) ;
    public final EObject ruleNativeClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attribute_3_0 = null;

        EObject lv_methodClass_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2186:2: ( (otherlv_0= 'nativeClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* otherlv_5= '}' ) )
            // InternalDsl.g:2187:2: (otherlv_0= 'nativeClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:2187:2: (otherlv_0= 'nativeClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* otherlv_5= '}' )
            // InternalDsl.g:2188:3: otherlv_0= 'nativeClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_methodClass_4_0= ruleMethodBack ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNativeClassAccess().getNativeClassKeyword_0());
            		
            // InternalDsl.g:2192:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2193:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2193:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2194:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNativeClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNativeClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getNativeClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2214:3: ( (lv_attribute_3_0= ruleAttribute ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==67) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDsl.g:2215:4: (lv_attribute_3_0= ruleAttribute )
            	    {
            	    // InternalDsl.g:2215:4: (lv_attribute_3_0= ruleAttribute )
            	    // InternalDsl.g:2216:5: lv_attribute_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getNativeClassAccess().getAttributeAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_attribute_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNativeClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalDsl.g:2233:3: ( (lv_methodClass_4_0= ruleMethodBack ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==69) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDsl.g:2234:4: (lv_methodClass_4_0= ruleMethodBack )
            	    {
            	    // InternalDsl.g:2234:4: (lv_methodClass_4_0= ruleMethodBack )
            	    // InternalDsl.g:2235:5: lv_methodClass_4_0= ruleMethodBack
            	    {

            	    					newCompositeNode(grammarAccess.getNativeClassAccess().getMethodClassMethodBackParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_56);
            	    lv_methodClass_4_0=ruleMethodBack();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNativeClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methodClass",
            	    						lv_methodClass_4_0,
            	    						"org.xtext.casino.dsl.Dsl.MethodBack");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNativeClassAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNativeClass"


    // $ANTLR start "entryRuleEclass"
    // InternalDsl.g:2260:1: entryRuleEclass returns [EObject current=null] : iv_ruleEclass= ruleEclass EOF ;
    public final EObject entryRuleEclass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclass = null;


        try {
            // InternalDsl.g:2260:47: (iv_ruleEclass= ruleEclass EOF )
            // InternalDsl.g:2261:2: iv_ruleEclass= ruleEclass EOF
            {
             newCompositeNode(grammarAccess.getEclassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEclass=ruleEclass();

            state._fsp--;

             current =iv_ruleEclass; 
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
    // $ANTLR end "entryRuleEclass"


    // $ANTLR start "ruleEclass"
    // InternalDsl.g:2267:1: ruleEclass returns [EObject current=null] : (this_AbstractClass_0= ruleAbstractClass | this_GenericClass_1= ruleGenericClass | this_NativeClass_2= ruleNativeClass | this_Annotation_3= ruleAnnotation ) ;
    public final EObject ruleEclass() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractClass_0 = null;

        EObject this_GenericClass_1 = null;

        EObject this_NativeClass_2 = null;

        EObject this_Annotation_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:2273:2: ( (this_AbstractClass_0= ruleAbstractClass | this_GenericClass_1= ruleGenericClass | this_NativeClass_2= ruleNativeClass | this_Annotation_3= ruleAnnotation ) )
            // InternalDsl.g:2274:2: (this_AbstractClass_0= ruleAbstractClass | this_GenericClass_1= ruleGenericClass | this_NativeClass_2= ruleNativeClass | this_Annotation_3= ruleAnnotation )
            {
            // InternalDsl.g:2274:2: (this_AbstractClass_0= ruleAbstractClass | this_GenericClass_1= ruleGenericClass | this_NativeClass_2= ruleNativeClass | this_Annotation_3= ruleAnnotation )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt40=1;
                }
                break;
            case 63:
                {
                alt40=2;
                }
                break;
            case 66:
                {
                alt40=3;
                }
                break;
            case 74:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalDsl.g:2275:3: this_AbstractClass_0= ruleAbstractClass
                    {

                    			newCompositeNode(grammarAccess.getEclassAccess().getAbstractClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractClass_0=ruleAbstractClass();

                    state._fsp--;


                    			current = this_AbstractClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2284:3: this_GenericClass_1= ruleGenericClass
                    {

                    			newCompositeNode(grammarAccess.getEclassAccess().getGenericClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GenericClass_1=ruleGenericClass();

                    state._fsp--;


                    			current = this_GenericClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:2293:3: this_NativeClass_2= ruleNativeClass
                    {

                    			newCompositeNode(grammarAccess.getEclassAccess().getNativeClassParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NativeClass_2=ruleNativeClass();

                    state._fsp--;


                    			current = this_NativeClass_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:2302:3: this_Annotation_3= ruleAnnotation
                    {

                    			newCompositeNode(grammarAccess.getEclassAccess().getAnnotationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Annotation_3=ruleAnnotation();

                    state._fsp--;


                    			current = this_Annotation_3;
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
    // $ANTLR end "ruleEclass"


    // $ANTLR start "entryRuleAttribute"
    // InternalDsl.g:2314:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDsl.g:2314:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDsl.g:2315:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDsl.g:2321:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDsl.g:2327:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDsl.g:2328:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDsl.g:2328:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalDsl.g:2329:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalDsl.g:2333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2334:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalDsl.g:2355:3: ( (otherlv_3= RULE_ID ) )
            // InternalDsl.g:2356:4: (otherlv_3= RULE_ID )
            {
            // InternalDsl.g:2356:4: (otherlv_3= RULE_ID )
            // InternalDsl.g:2357:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeEclassCrossReference_3_0());
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEpackage"
    // InternalDsl.g:2372:1: entryRuleEpackage returns [EObject current=null] : iv_ruleEpackage= ruleEpackage EOF ;
    public final EObject entryRuleEpackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEpackage = null;


        try {
            // InternalDsl.g:2372:49: (iv_ruleEpackage= ruleEpackage EOF )
            // InternalDsl.g:2373:2: iv_ruleEpackage= ruleEpackage EOF
            {
             newCompositeNode(grammarAccess.getEpackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEpackage=ruleEpackage();

            state._fsp--;

             current =iv_ruleEpackage; 
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
    // $ANTLR end "entryRuleEpackage"


    // $ANTLR start "ruleEpackage"
    // InternalDsl.g:2379:1: ruleEpackage returns [EObject current=null] : (otherlv_0= 'epackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_eclass_3_0= ruleEclass ) )* otherlv_4= '}' ) ;
    public final EObject ruleEpackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_eclass_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2385:2: ( (otherlv_0= 'epackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_eclass_3_0= ruleEclass ) )* otherlv_4= '}' ) )
            // InternalDsl.g:2386:2: (otherlv_0= 'epackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_eclass_3_0= ruleEclass ) )* otherlv_4= '}' )
            {
            // InternalDsl.g:2386:2: (otherlv_0= 'epackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_eclass_3_0= ruleEclass ) )* otherlv_4= '}' )
            // InternalDsl.g:2387:3: otherlv_0= 'epackage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_eclass_3_0= ruleEclass ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEpackageAccess().getEpackageKeyword_0());
            		
            // InternalDsl.g:2391:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2392:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2392:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2393:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEpackageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEpackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getEpackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2413:3: ( (lv_eclass_3_0= ruleEclass ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==61||LA41_0==63||LA41_0==66||LA41_0==74) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDsl.g:2414:4: (lv_eclass_3_0= ruleEclass )
            	    {
            	    // InternalDsl.g:2414:4: (lv_eclass_3_0= ruleEclass )
            	    // InternalDsl.g:2415:5: lv_eclass_3_0= ruleEclass
            	    {

            	    					newCompositeNode(grammarAccess.getEpackageAccess().getEclassEclassParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_eclass_3_0=ruleEclass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEpackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eclass",
            	    						lv_eclass_3_0,
            	    						"org.xtext.casino.dsl.Dsl.Eclass");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEpackageAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEpackage"


    // $ANTLR start "entryRuleMethodBack"
    // InternalDsl.g:2440:1: entryRuleMethodBack returns [EObject current=null] : iv_ruleMethodBack= ruleMethodBack EOF ;
    public final EObject entryRuleMethodBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodBack = null;


        try {
            // InternalDsl.g:2440:51: (iv_ruleMethodBack= ruleMethodBack EOF )
            // InternalDsl.g:2441:2: iv_ruleMethodBack= ruleMethodBack EOF
            {
             newCompositeNode(grammarAccess.getMethodBackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodBack=ruleMethodBack();

            state._fsp--;

             current =iv_ruleMethodBack; 
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
    // $ANTLR end "entryRuleMethodBack"


    // $ANTLR start "ruleMethodBack"
    // InternalDsl.g:2447:1: ruleMethodBack returns [EObject current=null] : (otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleMethodBack() throws RecognitionException {
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
            // InternalDsl.g:2453:2: ( (otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) )
            // InternalDsl.g:2454:2: (otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            {
            // InternalDsl.g:2454:2: (otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            // InternalDsl.g:2455:3: otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodBackAccess().getMethodBackKeyword_0());
            		
            // InternalDsl.g:2459:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2460:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2460:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2461:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodBackAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodBackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodBackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2481:3: (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==70) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDsl.g:2482:4: otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,70,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMethodBackAccess().getArgumentKeyword_3_0());
            	    			
            	    // InternalDsl.g:2486:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:2487:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:2487:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:2488:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMethodBackRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_63); 

            	    						newLeafNode(otherlv_4, grammarAccess.getMethodBackAccess().getArgEclassCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalDsl.g:2500:3: (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==71) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:2501:4: otherlv_5= 'return' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,71,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getMethodBackAccess().getReturnKeyword_4_0());
                    			
                    // InternalDsl.g:2505:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDsl.g:2506:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDsl.g:2506:5: (otherlv_6= RULE_ID )
                    // InternalDsl.g:2507:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodBackRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_6, grammarAccess.getMethodBackAccess().getTypeEclassCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodBackAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMethodBack"


    // $ANTLR start "entryRuleAbstractMethod"
    // InternalDsl.g:2527:1: entryRuleAbstractMethod returns [EObject current=null] : iv_ruleAbstractMethod= ruleAbstractMethod EOF ;
    public final EObject entryRuleAbstractMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMethod = null;


        try {
            // InternalDsl.g:2527:55: (iv_ruleAbstractMethod= ruleAbstractMethod EOF )
            // InternalDsl.g:2528:2: iv_ruleAbstractMethod= ruleAbstractMethod EOF
            {
             newCompositeNode(grammarAccess.getAbstractMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMethod=ruleAbstractMethod();

            state._fsp--;

             current =iv_ruleAbstractMethod; 
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
    // $ANTLR end "entryRuleAbstractMethod"


    // $ANTLR start "ruleAbstractMethod"
    // InternalDsl.g:2534:1: ruleAbstractMethod returns [EObject current=null] : (otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAbstractMethod() throws RecognitionException {
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
            // InternalDsl.g:2540:2: ( (otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) )
            // InternalDsl.g:2541:2: (otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            {
            // InternalDsl.g:2541:2: (otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            // InternalDsl.g:2542:3: otherlv_0= 'methodBack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractMethodAccess().getMethodBackKeyword_0());
            		
            // InternalDsl.g:2546:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2547:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2547:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2548:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbstractMethodAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractMethodAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2568:3: (otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==70) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDsl.g:2569:4: otherlv_3= 'argument' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,70,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAbstractMethodAccess().getArgumentKeyword_3_0());
            	    			
            	    // InternalDsl.g:2573:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:2574:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:2574:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:2575:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAbstractMethodRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_63); 

            	    						newLeafNode(otherlv_4, grammarAccess.getAbstractMethodAccess().getArgEclassCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalDsl.g:2587:3: (otherlv_5= 'return' ( (otherlv_6= RULE_ID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==71) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2588:4: otherlv_5= 'return' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,71,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getAbstractMethodAccess().getReturnKeyword_4_0());
                    			
                    // InternalDsl.g:2592:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDsl.g:2593:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDsl.g:2593:5: (otherlv_6= RULE_ID )
                    // InternalDsl.g:2594:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractMethodRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_6, grammarAccess.getAbstractMethodAccess().getTypeEclassCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAbstractMethodAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAbstractMethod"


    // $ANTLR start "entryRuleDescriptor"
    // InternalDsl.g:2614:1: entryRuleDescriptor returns [EObject current=null] : iv_ruleDescriptor= ruleDescriptor EOF ;
    public final EObject entryRuleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptor = null;


        try {
            // InternalDsl.g:2614:51: (iv_ruleDescriptor= ruleDescriptor EOF )
            // InternalDsl.g:2615:2: iv_ruleDescriptor= ruleDescriptor EOF
            {
             newCompositeNode(grammarAccess.getDescriptorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptor=ruleDescriptor();

            state._fsp--;

             current =iv_ruleDescriptor; 
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
    // $ANTLR end "entryRuleDescriptor"


    // $ANTLR start "ruleDescriptor"
    // InternalDsl.g:2621:1: ruleDescriptor returns [EObject current=null] : (otherlv_0= 'descriptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:2627:2: ( (otherlv_0= 'descriptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalDsl.g:2628:2: (otherlv_0= 'descriptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:2628:2: (otherlv_0= 'descriptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalDsl.g:2629:3: otherlv_0= 'descriptor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptorAccess().getDescriptorKeyword_0());
            		
            // InternalDsl.g:2633:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2634:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2634:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2635:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDescriptorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,73,FOLLOW_65); 

            			newLeafNode(otherlv_3, grammarAccess.getDescriptorAccess().getPathKeyword_3());
            		
            // InternalDsl.g:2659:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:2660:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:2660:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:2661:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDescriptorAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDescriptorAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDescriptor"


    // $ANTLR start "entryRuleAnnotation"
    // InternalDsl.g:2685:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalDsl.g:2685:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalDsl.g:2686:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalDsl.g:2692:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'propertie' ( (lv_name_4_0= RULE_STRING ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:2698:2: ( (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'propertie' ( (lv_name_4_0= RULE_STRING ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:2699:2: (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'propertie' ( (lv_name_4_0= RULE_STRING ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:2699:2: (otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'propertie' ( (lv_name_4_0= RULE_STRING ) ) )* otherlv_5= '}' )
            // InternalDsl.g:2700:3: otherlv_0= 'annotation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'propertie' ( (lv_name_4_0= RULE_STRING ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getAnnotationKeyword_0());
            		
            // InternalDsl.g:2704:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2705:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2705:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2706:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2726:3: (otherlv_3= 'propertie' ( (lv_name_4_0= RULE_STRING ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==75) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDsl.g:2727:4: otherlv_3= 'propertie' ( (lv_name_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,75,FOLLOW_65); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getPropertieKeyword_3_0());
            	    			
            	    // InternalDsl.g:2731:4: ( (lv_name_4_0= RULE_STRING ) )
            	    // InternalDsl.g:2732:5: (lv_name_4_0= RULE_STRING )
            	    {
            	    // InternalDsl.g:2732:5: (lv_name_4_0= RULE_STRING )
            	    // InternalDsl.g:2733:6: lv_name_4_0= RULE_STRING
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

            	    						newLeafNode(lv_name_4_0, grammarAccess.getAnnotationAccess().getNameSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAnnotationRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleLibrary"
    // InternalDsl.g:2758:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalDsl.g:2758:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalDsl.g:2759:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalDsl.g:2765:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isNative' ruleBoolean ( (lv_annotation_5_0= ruleAnnotation ) )* otherlv_6= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_annotation_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2771:2: ( (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isNative' ruleBoolean ( (lv_annotation_5_0= ruleAnnotation ) )* otherlv_6= '}' ) )
            // InternalDsl.g:2772:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isNative' ruleBoolean ( (lv_annotation_5_0= ruleAnnotation ) )* otherlv_6= '}' )
            {
            // InternalDsl.g:2772:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isNative' ruleBoolean ( (lv_annotation_5_0= ruleAnnotation ) )* otherlv_6= '}' )
            // InternalDsl.g:2773:3: otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isNative' ruleBoolean ( (lv_annotation_5_0= ruleAnnotation ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
            		
            // InternalDsl.g:2777:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:2778:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:2778:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:2779:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,77,FOLLOW_68); 

            			newLeafNode(otherlv_3, grammarAccess.getLibraryAccess().getIsNativeKeyword_3());
            		

            			newCompositeNode(grammarAccess.getLibraryAccess().getBooleanParserRuleCall_4());
            		
            pushFollow(FOLLOW_62);
            ruleBoolean();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:2810:3: ( (lv_annotation_5_0= ruleAnnotation ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==74) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDsl.g:2811:4: (lv_annotation_5_0= ruleAnnotation )
            	    {
            	    // InternalDsl.g:2811:4: (lv_annotation_5_0= ruleAnnotation )
            	    // InternalDsl.g:2812:5: lv_annotation_5_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getLibraryAccess().getAnnotationAnnotationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_annotation_5_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotation",
            	    						lv_annotation_5_0,
            	    						"org.xtext.casino.dsl.Dsl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleBoolean"
    // InternalDsl.g:2837:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalDsl.g:2837:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalDsl.g:2838:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalDsl.g:2844:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:2850:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDsl.g:2851:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDsl.g:2851:2: (kw= 'true' | kw= 'false' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==78) ) {
                alt48=1;
            }
            else if ( (LA48_0==79) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:2852:3: kw= 'true'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2858:3: kw= 'false'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleAbstractFrontElement"
    // InternalDsl.g:2867:1: entryRuleAbstractFrontElement returns [EObject current=null] : iv_ruleAbstractFrontElement= ruleAbstractFrontElement EOF ;
    public final EObject entryRuleAbstractFrontElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFrontElement = null;


        try {
            // InternalDsl.g:2867:61: (iv_ruleAbstractFrontElement= ruleAbstractFrontElement EOF )
            // InternalDsl.g:2868:2: iv_ruleAbstractFrontElement= ruleAbstractFrontElement EOF
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
    // InternalDsl.g:2874:1: ruleAbstractFrontElement returns [EObject current=null] : (this_ReactApp_0= ruleReactApp | this_Functionality_1= ruleFunctionality | this_Directory_2= ruleDirectory | this_JsModule_3= ruleJsModule | this_Type_4= ruleType | this_RouterComponent_5= ruleRouterComponent | this_Container_6= ruleContainer | this_Visualizer_7= ruleVisualizer | this_ServiceFront_8= ruleServiceFront | this_File_9= ruleFile | this_State_10= ruleState | this_Action_11= ruleAction | this_ActionCreator_12= ruleActionCreator | this_ActionDispatcher_13= ruleActionDispatcher | this_Reducer_14= ruleReducer ) ;
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
            // InternalDsl.g:2880:2: ( (this_ReactApp_0= ruleReactApp | this_Functionality_1= ruleFunctionality | this_Directory_2= ruleDirectory | this_JsModule_3= ruleJsModule | this_Type_4= ruleType | this_RouterComponent_5= ruleRouterComponent | this_Container_6= ruleContainer | this_Visualizer_7= ruleVisualizer | this_ServiceFront_8= ruleServiceFront | this_File_9= ruleFile | this_State_10= ruleState | this_Action_11= ruleAction | this_ActionCreator_12= ruleActionCreator | this_ActionDispatcher_13= ruleActionDispatcher | this_Reducer_14= ruleReducer ) )
            // InternalDsl.g:2881:2: (this_ReactApp_0= ruleReactApp | this_Functionality_1= ruleFunctionality | this_Directory_2= ruleDirectory | this_JsModule_3= ruleJsModule | this_Type_4= ruleType | this_RouterComponent_5= ruleRouterComponent | this_Container_6= ruleContainer | this_Visualizer_7= ruleVisualizer | this_ServiceFront_8= ruleServiceFront | this_File_9= ruleFile | this_State_10= ruleState | this_Action_11= ruleAction | this_ActionCreator_12= ruleActionCreator | this_ActionDispatcher_13= ruleActionDispatcher | this_Reducer_14= ruleReducer )
            {
            // InternalDsl.g:2881:2: (this_ReactApp_0= ruleReactApp | this_Functionality_1= ruleFunctionality | this_Directory_2= ruleDirectory | this_JsModule_3= ruleJsModule | this_Type_4= ruleType | this_RouterComponent_5= ruleRouterComponent | this_Container_6= ruleContainer | this_Visualizer_7= ruleVisualizer | this_ServiceFront_8= ruleServiceFront | this_File_9= ruleFile | this_State_10= ruleState | this_Action_11= ruleAction | this_ActionCreator_12= ruleActionCreator | this_ActionDispatcher_13= ruleActionDispatcher | this_Reducer_14= ruleReducer )
            int alt49=15;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt49=1;
                }
                break;
            case 84:
                {
                alt49=2;
                }
                break;
            case 100:
                {
                alt49=3;
                }
                break;
            case 15:
                {
                alt49=4;
                }
                break;
            case 24:
                {
                alt49=5;
                }
                break;
            case 91:
                {
                alt49=6;
                }
                break;
            case 94:
                {
                alt49=7;
                }
                break;
            case 97:
                {
                alt49=8;
                }
                break;
            case 98:
                {
                alt49=9;
                }
                break;
            case 104:
            case 105:
            case 106:
            case 107:
                {
                alt49=10;
                }
                break;
            case 108:
                {
                alt49=11;
                }
                break;
            case 111:
                {
                alt49=12;
                }
                break;
            case 114:
                {
                alt49=13;
                }
                break;
            case 115:
                {
                alt49=14;
                }
                break;
            case 116:
                {
                alt49=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2882:3: this_ReactApp_0= ruleReactApp
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
                    // InternalDsl.g:2891:3: this_Functionality_1= ruleFunctionality
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
                    // InternalDsl.g:2900:3: this_Directory_2= ruleDirectory
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
                    // InternalDsl.g:2909:3: this_JsModule_3= ruleJsModule
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
                    // InternalDsl.g:2918:3: this_Type_4= ruleType
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
                    // InternalDsl.g:2927:3: this_RouterComponent_5= ruleRouterComponent
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
                    // InternalDsl.g:2936:3: this_Container_6= ruleContainer
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
                    // InternalDsl.g:2945:3: this_Visualizer_7= ruleVisualizer
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
                    // InternalDsl.g:2954:3: this_ServiceFront_8= ruleServiceFront
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
                    // InternalDsl.g:2963:3: this_File_9= ruleFile
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
                    // InternalDsl.g:2972:3: this_State_10= ruleState
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
                    // InternalDsl.g:2981:3: this_Action_11= ruleAction
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
                    // InternalDsl.g:2990:3: this_ActionCreator_12= ruleActionCreator
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
                    // InternalDsl.g:2999:3: this_ActionDispatcher_13= ruleActionDispatcher
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
                    // InternalDsl.g:3008:3: this_Reducer_14= ruleReducer
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
    // InternalDsl.g:3020:1: entryRuleReactApp returns [EObject current=null] : iv_ruleReactApp= ruleReactApp EOF ;
    public final EObject entryRuleReactApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactApp = null;


        try {
            // InternalDsl.g:3020:49: (iv_ruleReactApp= ruleReactApp EOF )
            // InternalDsl.g:3021:2: iv_ruleReactApp= ruleReactApp EOF
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
    // InternalDsl.g:3027:1: ruleReactApp returns [EObject current=null] : (otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) ;
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
            // InternalDsl.g:3033:2: ( (otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) )
            // InternalDsl.g:3034:2: (otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            {
            // InternalDsl.g:3034:2: (otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            // InternalDsl.g:3035:3: otherlv_0= 'reactApp' otherlv_1= '{' ( (lv_elements_2_0= ruleAbstractFrontElement ) )+ (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+ (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+ (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactAppAccess().getReactAppKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getReactAppAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:3043:3: ( (lv_elements_2_0= ruleAbstractFrontElement ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==15||LA50_0==24||LA50_0==80||LA50_0==84||LA50_0==91||LA50_0==94||(LA50_0>=97 && LA50_0<=98)||LA50_0==100||(LA50_0>=104 && LA50_0<=108)||LA50_0==111||(LA50_0>=114 && LA50_0<=116)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDsl.g:3044:4: (lv_elements_2_0= ruleAbstractFrontElement )
            	    {
            	    // InternalDsl.g:3044:4: (lv_elements_2_0= ruleAbstractFrontElement )
            	    // InternalDsl.g:3045:5: lv_elements_2_0= ruleAbstractFrontElement
            	    {

            	    					newCompositeNode(grammarAccess.getReactAppAccess().getElementsAbstractFrontElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_70);
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
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // InternalDsl.g:3062:3: (otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==81) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalDsl.g:3063:4: otherlv_3= 'performs:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,81,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getReactAppAccess().getPerformsKeyword_3_0());
            	    			
            	    // InternalDsl.g:3067:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:3068:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:3068:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:3069:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReactAppRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_71); 

            	    						newLeafNode(otherlv_4, grammarAccess.getReactAppAccess().getFuncFunctionalityCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            // InternalDsl.g:3081:3: (otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==82) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalDsl.g:3082:4: otherlv_5= 'holds:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,82,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getReactAppAccess().getHoldsKeyword_4_0());
            	    			
            	    // InternalDsl.g:3086:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:3087:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:3087:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:3088:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReactAppRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_72); 

            	    						newLeafNode(otherlv_6, grammarAccess.getReactAppAccess().getDirDirectoryCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

            // InternalDsl.g:3100:3: (otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==83) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalDsl.g:3101:4: otherlv_7= 'use:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,83,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getReactAppAccess().getUseKeyword_5_0());
            	    			
            	    // InternalDsl.g:3105:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalDsl.g:3106:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDsl.g:3106:5: (otherlv_8= RULE_ID )
            	    // InternalDsl.g:3107:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReactAppRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_73); 

            	    						newLeafNode(otherlv_8, grammarAccess.getReactAppAccess().getModJsModuleCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
    // InternalDsl.g:3127:1: entryRuleFunctionality returns [EObject current=null] : iv_ruleFunctionality= ruleFunctionality EOF ;
    public final EObject entryRuleFunctionality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionality = null;


        try {
            // InternalDsl.g:3127:54: (iv_ruleFunctionality= ruleFunctionality EOF )
            // InternalDsl.g:3128:2: iv_ruleFunctionality= ruleFunctionality EOF
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
    // InternalDsl.g:3134:1: ruleFunctionality returns [EObject current=null] : (otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) ;
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
            // InternalDsl.g:3140:2: ( (otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) )
            // InternalDsl.g:3141:2: (otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            {
            // InternalDsl.g:3141:2: (otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            // InternalDsl.g:3142:3: otherlv_0= 'functionality' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+ (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'organizedBy:' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalityAccess().getFunctionalityKeyword_0());
            		
            // InternalDsl.g:3146:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3147:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3147:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3148:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:3168:3: (otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==85) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalDsl.g:3169:4: otherlv_3= 'uses:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,85,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionalityAccess().getUsesKeyword_3_0());
            	    			
            	    // InternalDsl.g:3173:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:3174:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:3174:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:3175:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_74); 

            	    						newLeafNode(otherlv_4, grammarAccess.getFunctionalityAccess().getRouteRouterComponentCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalDsl.g:3187:3: (otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==86) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalDsl.g:3188:4: otherlv_5= 'wraps:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,86,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFunctionalityAccess().getWrapsKeyword_4_0());
            	    			
            	    // InternalDsl.g:3192:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:3193:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:3193:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:3194:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_75); 

            	    						newLeafNode(otherlv_6, grammarAccess.getFunctionalityAccess().getWrapContainerCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // InternalDsl.g:3206:3: (otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==87) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalDsl.g:3207:4: otherlv_7= 'render:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,87,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getFunctionalityAccess().getRenderKeyword_5_0());
            	    			
            	    // InternalDsl.g:3211:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalDsl.g:3212:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDsl.g:3212:5: (otherlv_8= RULE_ID )
            	    // InternalDsl.g:3213:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_76); 

            	    						newLeafNode(otherlv_8, grammarAccess.getFunctionalityAccess().getRenderVisualizerCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

            // InternalDsl.g:3225:3: (otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==88) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalDsl.g:3226:4: otherlv_9= 'state:' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,88,FOLLOW_11); 

            	    				newLeafNode(otherlv_9, grammarAccess.getFunctionalityAccess().getStateKeyword_6_0());
            	    			
            	    // InternalDsl.g:3230:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalDsl.g:3231:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalDsl.g:3231:5: (otherlv_10= RULE_ID )
            	    // InternalDsl.g:3232:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_77); 

            	    						newLeafNode(otherlv_10, grammarAccess.getFunctionalityAccess().getStateStateCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // InternalDsl.g:3244:3: (otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==89) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDsl.g:3245:4: otherlv_11= 'calls:' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,89,FOLLOW_11); 

            	    				newLeafNode(otherlv_11, grammarAccess.getFunctionalityAccess().getCallsKeyword_7_0());
            	    			
            	    // InternalDsl.g:3249:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalDsl.g:3250:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalDsl.g:3250:5: (otherlv_12= RULE_ID )
            	    // InternalDsl.g:3251:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionalityRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_78); 

            	    						newLeafNode(otherlv_12, grammarAccess.getFunctionalityAccess().getServiceServiceFrontCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_13=(Token)match(input,90,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getFunctionalityAccess().getOrganizedByKeyword_8());
            		
            // InternalDsl.g:3267:3: ( (otherlv_14= RULE_ID ) )
            // InternalDsl.g:3268:4: (otherlv_14= RULE_ID )
            {
            // InternalDsl.g:3268:4: (otherlv_14= RULE_ID )
            // InternalDsl.g:3269:5: otherlv_14= RULE_ID
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
    // InternalDsl.g:3288:1: entryRuleRouterComponent returns [EObject current=null] : iv_ruleRouterComponent= ruleRouterComponent EOF ;
    public final EObject entryRuleRouterComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRouterComponent = null;


        try {
            // InternalDsl.g:3288:56: (iv_ruleRouterComponent= ruleRouterComponent EOF )
            // InternalDsl.g:3289:2: iv_ruleRouterComponent= ruleRouterComponent EOF
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
    // InternalDsl.g:3295:1: ruleRouterComponent returns [EObject current=null] : (otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
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
            // InternalDsl.g:3301:2: ( (otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalDsl.g:3302:2: (otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalDsl.g:3302:2: (otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalDsl.g:3303:3: otherlv_0= 'router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'route:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRouterComponentAccess().getRouterKeyword_0());
            		
            // InternalDsl.g:3307:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3308:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3308:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3309:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getRouterComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,92,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRouterComponentAccess().getInWithinKeyword_3());
            		
            // InternalDsl.g:3333:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:3334:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:3334:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:3335:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouterComponentRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_80); 

            					newLeafNode(otherlv_4, grammarAccess.getRouterComponentAccess().getTypeDirectoryCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,83,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getRouterComponentAccess().getUseKeyword_5());
            		
            // InternalDsl.g:3350:3: ( (otherlv_6= RULE_ID ) )
            // InternalDsl.g:3351:4: (otherlv_6= RULE_ID )
            {
            // InternalDsl.g:3351:4: (otherlv_6= RULE_ID )
            // InternalDsl.g:3352:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouterComponentRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_81); 

            					newLeafNode(otherlv_6, grammarAccess.getRouterComponentAccess().getTypeJsModuleCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,93,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getRouterComponentAccess().getRouteKeyword_7());
            		
            // InternalDsl.g:3367:3: ( (otherlv_8= RULE_ID ) )
            // InternalDsl.g:3368:4: (otherlv_8= RULE_ID )
            {
            // InternalDsl.g:3368:4: (otherlv_8= RULE_ID )
            // InternalDsl.g:3369:5: otherlv_8= RULE_ID
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
    // InternalDsl.g:3388:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDsl.g:3388:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDsl.g:3389:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalDsl.g:3395:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) ;
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
            // InternalDsl.g:3401:2: ( (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) )
            // InternalDsl.g:3402:2: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            {
            // InternalDsl.g:3402:2: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            // InternalDsl.g:3403:3: otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'use:' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
            		
            // InternalDsl.g:3407:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3408:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3408:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3409:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,92,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getInWithinKeyword_3());
            		
            // InternalDsl.g:3433:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:3434:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:3434:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:3435:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_82); 

            					newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getTypeDirectoryCrossReference_4_0());
            				

            }


            }

            // InternalDsl.g:3446:3: (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==95) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDsl.g:3447:4: otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,95,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getDispatchKeyword_5_0());
                    			
                    // InternalDsl.g:3451:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDsl.g:3452:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDsl.g:3452:5: (otherlv_6= RULE_ID )
                    // InternalDsl.g:3453:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainerRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_83); 

                    						newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getTypeActionDispatcherCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:3465:3: (otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==96) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalDsl.g:3466:4: otherlv_7= 'map:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,96,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getMapKeyword_6_0());
            	    			
            	    // InternalDsl.g:3470:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalDsl.g:3471:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDsl.g:3471:5: (otherlv_8= RULE_ID )
            	    // InternalDsl.g:3472:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContainerRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_83); 

            	    						newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getTypeReducerCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_9=(Token)match(input,83,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getUseKeyword_7());
            		
            // InternalDsl.g:3488:3: ( (otherlv_10= RULE_ID ) )
            // InternalDsl.g:3489:4: (otherlv_10= RULE_ID )
            {
            // InternalDsl.g:3489:4: (otherlv_10= RULE_ID )
            // InternalDsl.g:3490:5: otherlv_10= RULE_ID
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
    // InternalDsl.g:3509:1: entryRuleVisualizer returns [EObject current=null] : iv_ruleVisualizer= ruleVisualizer EOF ;
    public final EObject entryRuleVisualizer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualizer = null;


        try {
            // InternalDsl.g:3509:51: (iv_ruleVisualizer= ruleVisualizer EOF )
            // InternalDsl.g:3510:2: iv_ruleVisualizer= ruleVisualizer EOF
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
    // InternalDsl.g:3516:1: ruleVisualizer returns [EObject current=null] : (otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' ) ;
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
            // InternalDsl.g:3522:2: ( (otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' ) )
            // InternalDsl.g:3523:2: (otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' )
            {
            // InternalDsl.g:3523:2: (otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' )
            // InternalDsl.g:3524:3: otherlv_0= 'visualizer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'inWithin:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualizerAccess().getVisualizerKeyword_0());
            		
            // InternalDsl.g:3528:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3529:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3529:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3530:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getVisualizerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,92,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getVisualizerAccess().getInWithinKeyword_3());
            		
            // InternalDsl.g:3554:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:3555:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:3555:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:3556:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVisualizerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_80); 

            					newLeafNode(otherlv_4, grammarAccess.getVisualizerAccess().getTypeDirectoryCrossReference_4_0());
            				

            }


            }

            // InternalDsl.g:3567:3: (otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==83) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalDsl.g:3568:4: otherlv_5= 'use:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,83,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getVisualizerAccess().getUseKeyword_5_0());
            	    			
            	    // InternalDsl.g:3572:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:3573:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:3573:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:3574:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVisualizerRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_73); 

            	    						newLeafNode(otherlv_6, grammarAccess.getVisualizerAccess().getTypeJsModuleCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
    // InternalDsl.g:3594:1: entryRuleServiceFront returns [EObject current=null] : iv_ruleServiceFront= ruleServiceFront EOF ;
    public final EObject entryRuleServiceFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceFront = null;


        try {
            // InternalDsl.g:3594:53: (iv_ruleServiceFront= ruleServiceFront EOF )
            // InternalDsl.g:3595:2: iv_ruleServiceFront= ruleServiceFront EOF
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
    // InternalDsl.g:3601:1: ruleServiceFront returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}' ) ;
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
            // InternalDsl.g:3607:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}' ) )
            // InternalDsl.g:3608:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}' )
            {
            // InternalDsl.g:3608:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}' )
            // InternalDsl.g:3609:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceFrontAccess().getServiceKeyword_0());
            		
            // InternalDsl.g:3613:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3614:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3614:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3615:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceFrontAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,83,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceFrontAccess().getUseKeyword_3());
            		
            // InternalDsl.g:3639:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:3640:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:3640:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:3641:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceFrontRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_84); 

            					newLeafNode(otherlv_4, grammarAccess.getServiceFrontAccess().getTypeJsModuleCrossReference_4_0());
            				

            }


            }

            // InternalDsl.g:3652:3: (otherlv_5= 'method:' this_STRING_6= RULE_STRING )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==99) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalDsl.g:3653:4: otherlv_5= 'method:' this_STRING_6= RULE_STRING
            	    {
            	    otherlv_5=(Token)match(input,99,FOLLOW_65); 

            	    				newLeafNode(otherlv_5, grammarAccess.getServiceFrontAccess().getMethodKeyword_5_0());
            	    			
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_85); 

            	    				newLeafNode(this_STRING_6, grammarAccess.getServiceFrontAccess().getSTRINGTerminalRuleCall_5_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // InternalDsl.g:3670:1: entryRuleDirectory returns [EObject current=null] : iv_ruleDirectory= ruleDirectory EOF ;
    public final EObject entryRuleDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectory = null;


        try {
            // InternalDsl.g:3670:50: (iv_ruleDirectory= ruleDirectory EOF )
            // InternalDsl.g:3671:2: iv_ruleDirectory= ruleDirectory EOF
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
    // InternalDsl.g:3677:1: ruleDirectory returns [EObject current=null] : (otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}' ) ;
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
            // InternalDsl.g:3683:2: ( (otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}' ) )
            // InternalDsl.g:3684:2: (otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}' )
            {
            // InternalDsl.g:3684:2: (otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}' )
            // InternalDsl.g:3685:3: otherlv_0= 'directory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'purpose:' this_STRING_8= RULE_STRING otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectoryAccess().getDirectoryKeyword_0());
            		
            // InternalDsl.g:3689:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3690:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3690:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3691:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getDirectoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:3711:3: ( (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==101) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalDsl.g:3712:4: (otherlv_3= 'has:' )+ ( (otherlv_4= RULE_ID ) )
            	    {
            	    // InternalDsl.g:3712:4: (otherlv_3= 'has:' )+
            	    int cnt63=0;
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==101) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // InternalDsl.g:3713:5: otherlv_3= 'has:'
            	    	    {
            	    	    otherlv_3=(Token)match(input,101,FOLLOW_87); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getDirectoryAccess().getHasKeyword_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt63 >= 1 ) break loop63;
            	                EarlyExitException eee =
            	                    new EarlyExitException(63, input);
            	                throw eee;
            	        }
            	        cnt63++;
            	    } while (true);

            	    // InternalDsl.g:3718:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:3719:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:3719:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:3720:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDirectoryRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_86); 

            	    						newLeafNode(otherlv_4, grammarAccess.getDirectoryAccess().getFileFileCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalDsl.g:3732:3: (otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==102) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalDsl.g:3733:4: otherlv_5= 'contains:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,102,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDirectoryAccess().getContainsKeyword_4_0());
            	    			
            	    // InternalDsl.g:3737:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:3738:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:3738:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:3739:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDirectoryRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_88); 

            	    						newLeafNode(otherlv_6, grammarAccess.getDirectoryAccess().getSubdirectoryDirectoryCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_7=(Token)match(input,103,FOLLOW_65); 

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
    // InternalDsl.g:3767:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalDsl.g:3767:45: (iv_ruleFile= ruleFile EOF )
            // InternalDsl.g:3768:2: iv_ruleFile= ruleFile EOF
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
    // InternalDsl.g:3774:1: ruleFile returns [EObject current=null] : (this_Md_0= ruleMd | this_Js_1= ruleJs | this_Json_2= ruleJson | this_Css_3= ruleCss ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject this_Md_0 = null;

        EObject this_Js_1 = null;

        EObject this_Json_2 = null;

        EObject this_Css_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:3780:2: ( (this_Md_0= ruleMd | this_Js_1= ruleJs | this_Json_2= ruleJson | this_Css_3= ruleCss ) )
            // InternalDsl.g:3781:2: (this_Md_0= ruleMd | this_Js_1= ruleJs | this_Json_2= ruleJson | this_Css_3= ruleCss )
            {
            // InternalDsl.g:3781:2: (this_Md_0= ruleMd | this_Js_1= ruleJs | this_Json_2= ruleJson | this_Css_3= ruleCss )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt66=1;
                }
                break;
            case 105:
                {
                alt66=2;
                }
                break;
            case 106:
                {
                alt66=3;
                }
                break;
            case 107:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalDsl.g:3782:3: this_Md_0= ruleMd
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
                    // InternalDsl.g:3791:3: this_Js_1= ruleJs
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
                    // InternalDsl.g:3800:3: this_Json_2= ruleJson
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
                    // InternalDsl.g:3809:3: this_Css_3= ruleCss
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
    // InternalDsl.g:3821:1: entryRuleMd returns [EObject current=null] : iv_ruleMd= ruleMd EOF ;
    public final EObject entryRuleMd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMd = null;


        try {
            // InternalDsl.g:3821:43: (iv_ruleMd= ruleMd EOF )
            // InternalDsl.g:3822:2: iv_ruleMd= ruleMd EOF
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
    // InternalDsl.g:3828:1: ruleMd returns [EObject current=null] : (otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
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
            // InternalDsl.g:3834:2: ( (otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:3835:2: (otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:3835:2: (otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:3836:3: otherlv_0= 'md' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMdAccess().getMdKeyword_0());
            		
            // InternalDsl.g:3840:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3841:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3841:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3842:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,18,FOLLOW_65); 

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
    // InternalDsl.g:3878:1: entryRuleJs returns [EObject current=null] : iv_ruleJs= ruleJs EOF ;
    public final EObject entryRuleJs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJs = null;


        try {
            // InternalDsl.g:3878:43: (iv_ruleJs= ruleJs EOF )
            // InternalDsl.g:3879:2: iv_ruleJs= ruleJs EOF
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
    // InternalDsl.g:3885:1: ruleJs returns [EObject current=null] : (otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
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
            // InternalDsl.g:3891:2: ( (otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:3892:2: (otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:3892:2: (otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:3893:3: otherlv_0= 'js' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJsAccess().getJsKeyword_0());
            		
            // InternalDsl.g:3897:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3898:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3898:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3899:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,18,FOLLOW_65); 

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
    // InternalDsl.g:3935:1: entryRuleJson returns [EObject current=null] : iv_ruleJson= ruleJson EOF ;
    public final EObject entryRuleJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJson = null;


        try {
            // InternalDsl.g:3935:45: (iv_ruleJson= ruleJson EOF )
            // InternalDsl.g:3936:2: iv_ruleJson= ruleJson EOF
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
    // InternalDsl.g:3942:1: ruleJson returns [EObject current=null] : (otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
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
            // InternalDsl.g:3948:2: ( (otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:3949:2: (otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:3949:2: (otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:3950:3: otherlv_0= 'json' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonAccess().getJsonKeyword_0());
            		
            // InternalDsl.g:3954:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:3955:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:3955:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:3956:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,18,FOLLOW_65); 

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
    // InternalDsl.g:3992:1: entryRuleCss returns [EObject current=null] : iv_ruleCss= ruleCss EOF ;
    public final EObject entryRuleCss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCss = null;


        try {
            // InternalDsl.g:3992:44: (iv_ruleCss= ruleCss EOF )
            // InternalDsl.g:3993:2: iv_ruleCss= ruleCss EOF
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
    // InternalDsl.g:3999:1: ruleCss returns [EObject current=null] : (otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
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
            // InternalDsl.g:4005:2: ( (otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:4006:2: (otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:4006:2: (otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:4007:3: otherlv_0= 'css' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,107,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCssAccess().getCssKeyword_0());
            		
            // InternalDsl.g:4011:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:4012:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:4012:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:4013:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,18,FOLLOW_65); 

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
    // InternalDsl.g:4049:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalDsl.g:4049:46: (iv_ruleState= ruleState EOF )
            // InternalDsl.g:4050:2: iv_ruleState= ruleState EOF
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
    // InternalDsl.g:4056:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
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
            // InternalDsl.g:4062:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // InternalDsl.g:4063:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // InternalDsl.g:4063:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // InternalDsl.g:4064:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalDsl.g:4068:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:4069:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:4069:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:4070:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_89); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:4090:3: (otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==109) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalDsl.g:4091:4: otherlv_3= 'handleAction:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,109,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getHandleActionKeyword_3_0());
            	    			
            	    // InternalDsl.g:4095:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:4096:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:4096:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:4097:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStateRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_89); 

            	    						newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionActionCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // InternalDsl.g:4109:3: (otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==110) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalDsl.g:4110:4: otherlv_5= 'handleReducer:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,110,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getHandleReducerKeyword_4_0());
            	    			
            	    // InternalDsl.g:4114:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:4115:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:4115:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:4116:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStateRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_90); 

            	    						newLeafNode(otherlv_6, grammarAccess.getStateAccess().getReducerReducerCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
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
    // InternalDsl.g:4136:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDsl.g:4136:47: (iv_ruleAction= ruleAction EOF )
            // InternalDsl.g:4137:2: iv_ruleAction= ruleAction EOF
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
    // InternalDsl.g:4143:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
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
            // InternalDsl.g:4149:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalDsl.g:4150:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalDsl.g:4150:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalDsl.g:4151:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= 'actionDirectory:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalDsl.g:4155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:4156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:4156:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:4157:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_91); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:4177:3: (otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==112) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalDsl.g:4178:4: otherlv_3= 'create:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,112,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getCreateKeyword_3_0());
            	    			
            	    // InternalDsl.g:4182:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:4183:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:4183:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:4184:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActionRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_91); 

            	    						newLeafNode(otherlv_4, grammarAccess.getActionAccess().getActionCreatorActionCreatorCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // InternalDsl.g:4196:3: (otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==95) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalDsl.g:4197:4: otherlv_5= 'dispatch:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,95,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getDispatchKeyword_4_0());
            	    			
            	    // InternalDsl.g:4201:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDsl.g:4202:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDsl.g:4202:5: (otherlv_6= RULE_ID )
            	    // InternalDsl.g:4203:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActionRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_92); 

            	    						newLeafNode(otherlv_6, grammarAccess.getActionAccess().getActionDispatcherActionDispatcherCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_7=(Token)match(input,113,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getActionDirectoryKeyword_5());
            		
            // InternalDsl.g:4219:3: ( (otherlv_8= RULE_ID ) )
            // InternalDsl.g:4220:4: (otherlv_8= RULE_ID )
            {
            // InternalDsl.g:4220:4: (otherlv_8= RULE_ID )
            // InternalDsl.g:4221:5: otherlv_8= RULE_ID
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
    // InternalDsl.g:4240:1: entryRuleActionCreator returns [EObject current=null] : iv_ruleActionCreator= ruleActionCreator EOF ;
    public final EObject entryRuleActionCreator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionCreator = null;


        try {
            // InternalDsl.g:4240:54: (iv_ruleActionCreator= ruleActionCreator EOF )
            // InternalDsl.g:4241:2: iv_ruleActionCreator= ruleActionCreator EOF
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
    // InternalDsl.g:4247:1: ruleActionCreator returns [EObject current=null] : (otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) ;
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
            // InternalDsl.g:4253:2: ( (otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' ) )
            // InternalDsl.g:4254:2: (otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            {
            // InternalDsl.g:4254:2: (otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}' )
            // InternalDsl.g:4255:3: otherlv_0= 'actionCreator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' this_STRING_4= RULE_STRING otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getActionCreatorAccess().getActionCreatorKeyword_0());
            		
            // InternalDsl.g:4259:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:4260:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:4260:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:4261:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,18,FOLLOW_65); 

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
    // InternalDsl.g:4297:1: entryRuleActionDispatcher returns [EObject current=null] : iv_ruleActionDispatcher= ruleActionDispatcher EOF ;
    public final EObject entryRuleActionDispatcher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDispatcher = null;


        try {
            // InternalDsl.g:4297:57: (iv_ruleActionDispatcher= ruleActionDispatcher EOF )
            // InternalDsl.g:4298:2: iv_ruleActionDispatcher= ruleActionDispatcher EOF
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
    // InternalDsl.g:4304:1: ruleActionDispatcher returns [EObject current=null] : (otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) ;
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
            // InternalDsl.g:4310:2: ( (otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) )
            // InternalDsl.g:4311:2: (otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            {
            // InternalDsl.g:4311:2: (otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            // InternalDsl.g:4312:3: otherlv_0= 'actionDispatcher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getActionDispatcherAccess().getActionDispatcherKeyword_0());
            		
            // InternalDsl.g:4316:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:4317:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:4317:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:4318:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_73); 

            			newLeafNode(otherlv_2, grammarAccess.getActionDispatcherAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:4338:3: (otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==83) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalDsl.g:4339:4: otherlv_3= 'use:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,83,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getActionDispatcherAccess().getUseKeyword_3_0());
            	    			
            	    // InternalDsl.g:4343:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:4344:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:4344:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:4345:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActionDispatcherRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_73); 

            	    						newLeafNode(otherlv_4, grammarAccess.getActionDispatcherAccess().getTypeActionCreatorCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // InternalDsl.g:4365:1: entryRuleReducer returns [EObject current=null] : iv_ruleReducer= ruleReducer EOF ;
    public final EObject entryRuleReducer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReducer = null;


        try {
            // InternalDsl.g:4365:48: (iv_ruleReducer= ruleReducer EOF )
            // InternalDsl.g:4366:2: iv_ruleReducer= ruleReducer EOF
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
    // InternalDsl.g:4372:1: ruleReducer returns [EObject current=null] : (otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
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
            // InternalDsl.g:4378:2: ( (otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // InternalDsl.g:4379:2: (otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // InternalDsl.g:4379:2: (otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // InternalDsl.g:4380:3: otherlv_0= 'reducer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'reducerDirectory:' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,116,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReducerAccess().getReducerKeyword_0());
            		
            // InternalDsl.g:4384:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:4385:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:4385:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:4386:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getReducerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:4406:3: (otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==117) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalDsl.g:4407:4: otherlv_3= 'catch:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,117,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getReducerAccess().getCatchKeyword_3_0());
            	    			
            	    // InternalDsl.g:4411:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDsl.g:4412:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDsl.g:4412:5: (otherlv_4= RULE_ID )
            	    // InternalDsl.g:4413:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReducerRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_94); 

            	    						newLeafNode(otherlv_4, grammarAccess.getReducerAccess().getTypeActionCreatorCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);

            otherlv_5=(Token)match(input,118,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getReducerAccess().getReducerDirectoryKeyword_4());
            		
            // InternalDsl.g:4429:3: ( (otherlv_6= RULE_ID ) )
            // InternalDsl.g:4430:4: (otherlv_6= RULE_ID )
            {
            // InternalDsl.g:4430:4: (otherlv_6= RULE_ID )
            // InternalDsl.g:4431:5: otherlv_6= RULE_ID
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
    // InternalDsl.g:4450:1: entryRuleJsModule returns [EObject current=null] : iv_ruleJsModule= ruleJsModule EOF ;
    public final EObject entryRuleJsModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsModule = null;


        try {
            // InternalDsl.g:4450:49: (iv_ruleJsModule= ruleJsModule EOF )
            // InternalDsl.g:4451:2: iv_ruleJsModule= ruleJsModule EOF
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
    // InternalDsl.g:4457:1: ruleJsModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' ) ;
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
            // InternalDsl.g:4463:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' ) )
            // InternalDsl.g:4464:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:4464:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' )
            // InternalDsl.g:4465:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'presentIn:' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJsModuleAccess().getModuleKeyword_0());
            		
            // InternalDsl.g:4469:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:4470:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:4470:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:4471:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_95); 

            			newLeafNode(otherlv_2, grammarAccess.getJsModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,119,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getJsModuleAccess().getPresentInKeyword_3());
            		
            // InternalDsl.g:4495:3: ( (otherlv_4= RULE_ID ) )
            // InternalDsl.g:4496:4: (otherlv_4= RULE_ID )
            {
            // InternalDsl.g:4496:4: (otherlv_4= RULE_ID )
            // InternalDsl.g:4497:5: otherlv_4= RULE_ID
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


    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\15\1\uffff\1\4\1\14\1\15\2\4\1\uffff\2\15";
    static final String dfa_3s = "\1\105\1\uffff\1\4\1\14\1\107\2\4\1\uffff\1\107\1\15";
    static final String dfa_4s = "\1\uffff\1\2\5\uffff\1\1\2\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\60\uffff\1\1\6\uffff\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\7\70\uffff\1\5\1\6",
            "\1\10",
            "\1\11",
            "",
            "\1\7\70\uffff\1\5\1\6",
            "\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1964:3: ( (lv_methodClass_4_0= ruleMethodBack ) )*";
        }
    }
 

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
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4000000000002000L,0x0000000000000028L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000002000L,0x000000000000002BL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000002000L,0x0000000000000023L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000002000L,0x0000000000000003L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000028L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xA000000000002000L,0x0000000000000404L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000001008000L,0x001C9F1648110000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000001008000L,0x001C9F1648130000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000180080000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000100080000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000002000L,0x0000000800000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000010L,0x0000002000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000002000L,0x0000600000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000002000L,0x0000400000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0003000080000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0002000080000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});

}