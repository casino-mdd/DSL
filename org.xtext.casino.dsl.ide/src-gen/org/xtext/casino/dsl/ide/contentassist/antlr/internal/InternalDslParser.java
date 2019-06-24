package org.xtext.casino.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.casino.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Read'", "'Create'", "'exchange'", "'sale'", "'Back'", "'Front'", "'JavaScript'", "'Ejb'", "'War'", "'Services'", "'Ui'", "'Store'", "'RestEntity'", "'Pojo'", "'Facade'", "'Dto'", "'Util'", "'Containers'", "'Actions'", "'Reducers'", "'Casino'", "'{'", "'}'", "'domain'", "'module'", "'submodule'", "'op'", "'type:'", "'operates_on:'", "'generalEntity'", "':'", "'dataType'", "'specialEntity'", "'trx'", "'rel'", "'Composition'", "'source:'", "'target:'", "'arch'", "'component'", "'layer'", "'layerSegment'", "'allowedToUse:'", "'sublayerSegment'", "'relationArch'", "','", "'tech'", "'javaApp'", "'reactApp'", "'performs:'", "'holds:'", "'use:'", "'functionality'", "'organizedBy:'", "'uses:'", "'wraps:'", "'render:'", "'state:'", "'calls:'", "'router'", "'inWithin:'", "'route:'", "'container'", "'dispatch:'", "'map:'", "'visualizer'", "'service'", "'method:'", "'directory'", "'purpose:'", "'has:'", "'contains:'", "'md'", "'js'", "'json'", "'css'", "'state'", "'handleAction:'", "'handleReducer:'", "'action'", "'actionDirectory:'", "'create:'", "'actionCreator'", "'actionDispatcher'", "'reducer'", "'reducerDirectory:'", "'catch:'", "'presentIn:'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSystem"
    // InternalDsl.g:53:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleSystem EOF )
            // InternalDsl.g:55:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalDsl.g:62:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__System__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__System__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__System__Group__0 )
            // InternalDsl.g:69:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleDomain"
    // InternalDsl.g:78:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleDomain EOF )
            // InternalDsl.g:80:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalDsl.g:87:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Domain__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Domain__Group__0 )
            // InternalDsl.g:94:4: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleModule"
    // InternalDsl.g:103:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleModule EOF )
            // InternalDsl.g:105:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalDsl.g:112:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Module__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Module__Group__0 )
            // InternalDsl.g:119:4: rule__Module__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleSubmodule"
    // InternalDsl.g:128:1: entryRuleSubmodule : ruleSubmodule EOF ;
    public final void entryRuleSubmodule() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleSubmodule EOF )
            // InternalDsl.g:130:1: ruleSubmodule EOF
            {
             before(grammarAccess.getSubmoduleRule()); 
            pushFollow(FOLLOW_1);
            ruleSubmodule();

            state._fsp--;

             after(grammarAccess.getSubmoduleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmodule"


    // $ANTLR start "ruleSubmodule"
    // InternalDsl.g:137:1: ruleSubmodule : ( ( rule__Submodule__Group__0 ) ) ;
    public final void ruleSubmodule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Submodule__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Submodule__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Submodule__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Submodule__Group__0 )
            {
             before(grammarAccess.getSubmoduleAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Submodule__Group__0 )
            // InternalDsl.g:144:4: rule__Submodule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Submodule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmodule"


    // $ANTLR start "entryRuleOperation"
    // InternalDsl.g:153:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleOperation EOF )
            // InternalDsl.g:155:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalDsl.g:162:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Operation__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Operation__Group__0 )
            // InternalDsl.g:169:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEntityName"
    // InternalDsl.g:178:1: entryRuleEntityName : ruleEntityName EOF ;
    public final void entryRuleEntityName() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleEntityName EOF )
            // InternalDsl.g:180:1: ruleEntityName EOF
            {
             before(grammarAccess.getEntityNameRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getEntityNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityName"


    // $ANTLR start "ruleEntityName"
    // InternalDsl.g:187:1: ruleEntityName : ( ( rule__EntityName__NameAssignment ) ) ;
    public final void ruleEntityName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__EntityName__NameAssignment ) ) )
            // InternalDsl.g:192:2: ( ( rule__EntityName__NameAssignment ) )
            {
            // InternalDsl.g:192:2: ( ( rule__EntityName__NameAssignment ) )
            // InternalDsl.g:193:3: ( rule__EntityName__NameAssignment )
            {
             before(grammarAccess.getEntityNameAccess().getNameAssignment()); 
            // InternalDsl.g:194:3: ( rule__EntityName__NameAssignment )
            // InternalDsl.g:194:4: rule__EntityName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EntityName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityName"


    // $ANTLR start "entryRuleSubOperation"
    // InternalDsl.g:203:1: entryRuleSubOperation : ruleSubOperation EOF ;
    public final void entryRuleSubOperation() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleSubOperation EOF )
            // InternalDsl.g:205:1: ruleSubOperation EOF
            {
             before(grammarAccess.getSubOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSubOperation();

            state._fsp--;

             after(grammarAccess.getSubOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubOperation"


    // $ANTLR start "ruleSubOperation"
    // InternalDsl.g:212:1: ruleSubOperation : ( ( rule__SubOperation__Alternatives ) ) ;
    public final void ruleSubOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__SubOperation__Alternatives ) ) )
            // InternalDsl.g:217:2: ( ( rule__SubOperation__Alternatives ) )
            {
            // InternalDsl.g:217:2: ( ( rule__SubOperation__Alternatives ) )
            // InternalDsl.g:218:3: ( rule__SubOperation__Alternatives )
            {
             before(grammarAccess.getSubOperationAccess().getAlternatives()); 
            // InternalDsl.g:219:3: ( rule__SubOperation__Alternatives )
            // InternalDsl.g:219:4: rule__SubOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubOperation"


    // $ANTLR start "entryRuleGeneralEntity"
    // InternalDsl.g:228:1: entryRuleGeneralEntity : ruleGeneralEntity EOF ;
    public final void entryRuleGeneralEntity() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleGeneralEntity EOF )
            // InternalDsl.g:230:1: ruleGeneralEntity EOF
            {
             before(grammarAccess.getGeneralEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralEntity();

            state._fsp--;

             after(grammarAccess.getGeneralEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralEntity"


    // $ANTLR start "ruleGeneralEntity"
    // InternalDsl.g:237:1: ruleGeneralEntity : ( ( rule__GeneralEntity__Group__0 ) ) ;
    public final void ruleGeneralEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__GeneralEntity__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__GeneralEntity__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__GeneralEntity__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__GeneralEntity__Group__0 )
            {
             before(grammarAccess.getGeneralEntityAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__GeneralEntity__Group__0 )
            // InternalDsl.g:244:4: rule__GeneralEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralEntity"


    // $ANTLR start "entryRuleProperty"
    // InternalDsl.g:253:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleProperty EOF )
            // InternalDsl.g:255:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDsl.g:262:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Property__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Property__Group__0 )
            // InternalDsl.g:269:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleType"
    // InternalDsl.g:278:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleType EOF )
            // InternalDsl.g:280:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDsl.g:287:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Type__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Type__Group__0 )
            // InternalDsl.g:294:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSpecialEntity"
    // InternalDsl.g:303:1: entryRuleSpecialEntity : ruleSpecialEntity EOF ;
    public final void entryRuleSpecialEntity() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleSpecialEntity EOF )
            // InternalDsl.g:305:1: ruleSpecialEntity EOF
            {
             before(grammarAccess.getSpecialEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecialEntity();

            state._fsp--;

             after(grammarAccess.getSpecialEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecialEntity"


    // $ANTLR start "ruleSpecialEntity"
    // InternalDsl.g:312:1: ruleSpecialEntity : ( ( rule__SpecialEntity__Group__0 ) ) ;
    public final void ruleSpecialEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__SpecialEntity__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__SpecialEntity__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__SpecialEntity__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__SpecialEntity__Group__0 )
            {
             before(grammarAccess.getSpecialEntityAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__SpecialEntity__Group__0 )
            // InternalDsl.g:319:4: rule__SpecialEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpecialEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecialEntity"


    // $ANTLR start "entryRuleTransaction"
    // InternalDsl.g:328:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleTransaction EOF )
            // InternalDsl.g:330:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalDsl.g:337:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Transaction__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Transaction__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Transaction__Group__0 )
            // InternalDsl.g:344:4: rule__Transaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleSubTransaction"
    // InternalDsl.g:353:1: entryRuleSubTransaction : ruleSubTransaction EOF ;
    public final void entryRuleSubTransaction() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleSubTransaction EOF )
            // InternalDsl.g:355:1: ruleSubTransaction EOF
            {
             before(grammarAccess.getSubTransactionRule()); 
            pushFollow(FOLLOW_1);
            ruleSubTransaction();

            state._fsp--;

             after(grammarAccess.getSubTransactionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubTransaction"


    // $ANTLR start "ruleSubTransaction"
    // InternalDsl.g:362:1: ruleSubTransaction : ( ( rule__SubTransaction__Alternatives ) ) ;
    public final void ruleSubTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__SubTransaction__Alternatives ) ) )
            // InternalDsl.g:367:2: ( ( rule__SubTransaction__Alternatives ) )
            {
            // InternalDsl.g:367:2: ( ( rule__SubTransaction__Alternatives ) )
            // InternalDsl.g:368:3: ( rule__SubTransaction__Alternatives )
            {
             before(grammarAccess.getSubTransactionAccess().getAlternatives()); 
            // InternalDsl.g:369:3: ( rule__SubTransaction__Alternatives )
            // InternalDsl.g:369:4: rule__SubTransaction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubTransaction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubTransactionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubTransaction"


    // $ANTLR start "entryRuleOperateson"
    // InternalDsl.g:378:1: entryRuleOperateson : ruleOperateson EOF ;
    public final void entryRuleOperateson() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleOperateson EOF )
            // InternalDsl.g:380:1: ruleOperateson EOF
            {
             before(grammarAccess.getOperatesonRule()); 
            pushFollow(FOLLOW_1);
            ruleOperateson();

            state._fsp--;

             after(grammarAccess.getOperatesonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperateson"


    // $ANTLR start "ruleOperateson"
    // InternalDsl.g:387:1: ruleOperateson : ( ( rule__Operateson__Group__0 ) ) ;
    public final void ruleOperateson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Operateson__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__Operateson__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Operateson__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__Operateson__Group__0 )
            {
             before(grammarAccess.getOperatesonAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__Operateson__Group__0 )
            // InternalDsl.g:394:4: rule__Operateson__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operateson__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperatesonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperateson"


    // $ANTLR start "entryRuleRelationDom"
    // InternalDsl.g:403:1: entryRuleRelationDom : ruleRelationDom EOF ;
    public final void entryRuleRelationDom() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleRelationDom EOF )
            // InternalDsl.g:405:1: ruleRelationDom EOF
            {
             before(grammarAccess.getRelationDomRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationDom();

            state._fsp--;

             after(grammarAccess.getRelationDomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationDom"


    // $ANTLR start "ruleRelationDom"
    // InternalDsl.g:412:1: ruleRelationDom : ( ( rule__RelationDom__Group__0 ) ) ;
    public final void ruleRelationDom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__RelationDom__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__RelationDom__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__RelationDom__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__RelationDom__Group__0 )
            {
             before(grammarAccess.getRelationDomAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__RelationDom__Group__0 )
            // InternalDsl.g:419:4: rule__RelationDom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationDomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationDom"


    // $ANTLR start "entryRuleArchitecture"
    // InternalDsl.g:428:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleArchitecture EOF )
            // InternalDsl.g:430:1: ruleArchitecture EOF
            {
             before(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getArchitectureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalDsl.g:437:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__Architecture__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__Architecture__Group__0 )
            // InternalDsl.g:444:4: rule__Architecture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleComponent"
    // InternalDsl.g:453:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleComponent EOF )
            // InternalDsl.g:455:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDsl.g:462:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__Component__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__Component__Group__0 )
            // InternalDsl.g:469:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentName"
    // InternalDsl.g:478:1: entryRuleComponentName : ruleComponentName EOF ;
    public final void entryRuleComponentName() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleComponentName EOF )
            // InternalDsl.g:480:1: ruleComponentName EOF
            {
             before(grammarAccess.getComponentNameRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentName();

            state._fsp--;

             after(grammarAccess.getComponentNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentName"


    // $ANTLR start "ruleComponentName"
    // InternalDsl.g:487:1: ruleComponentName : ( ( rule__ComponentName__Alternatives ) ) ;
    public final void ruleComponentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__ComponentName__Alternatives ) ) )
            // InternalDsl.g:492:2: ( ( rule__ComponentName__Alternatives ) )
            {
            // InternalDsl.g:492:2: ( ( rule__ComponentName__Alternatives ) )
            // InternalDsl.g:493:3: ( rule__ComponentName__Alternatives )
            {
             before(grammarAccess.getComponentNameAccess().getAlternatives()); 
            // InternalDsl.g:494:3: ( rule__ComponentName__Alternatives )
            // InternalDsl.g:494:4: rule__ComponentName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentName"


    // $ANTLR start "entryRuleLayer"
    // InternalDsl.g:503:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleLayer EOF )
            // InternalDsl.g:505:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalDsl.g:512:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__Layer__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__Layer__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__Layer__Group__0 )
            // InternalDsl.g:519:4: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleLayerName"
    // InternalDsl.g:528:1: entryRuleLayerName : ruleLayerName EOF ;
    public final void entryRuleLayerName() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleLayerName EOF )
            // InternalDsl.g:530:1: ruleLayerName EOF
            {
             before(grammarAccess.getLayerNameRule()); 
            pushFollow(FOLLOW_1);
            ruleLayerName();

            state._fsp--;

             after(grammarAccess.getLayerNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayerName"


    // $ANTLR start "ruleLayerName"
    // InternalDsl.g:537:1: ruleLayerName : ( ( rule__LayerName__Alternatives ) ) ;
    public final void ruleLayerName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__LayerName__Alternatives ) ) )
            // InternalDsl.g:542:2: ( ( rule__LayerName__Alternatives ) )
            {
            // InternalDsl.g:542:2: ( ( rule__LayerName__Alternatives ) )
            // InternalDsl.g:543:3: ( rule__LayerName__Alternatives )
            {
             before(grammarAccess.getLayerNameAccess().getAlternatives()); 
            // InternalDsl.g:544:3: ( rule__LayerName__Alternatives )
            // InternalDsl.g:544:4: rule__LayerName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayerName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayerNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerName"


    // $ANTLR start "entryRuleLayerSegment"
    // InternalDsl.g:553:1: entryRuleLayerSegment : ruleLayerSegment EOF ;
    public final void entryRuleLayerSegment() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleLayerSegment EOF )
            // InternalDsl.g:555:1: ruleLayerSegment EOF
            {
             before(grammarAccess.getLayerSegmentRule()); 
            pushFollow(FOLLOW_1);
            ruleLayerSegment();

            state._fsp--;

             after(grammarAccess.getLayerSegmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayerSegment"


    // $ANTLR start "ruleLayerSegment"
    // InternalDsl.g:562:1: ruleLayerSegment : ( ( rule__LayerSegment__Group__0 ) ) ;
    public final void ruleLayerSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__LayerSegment__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__LayerSegment__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__LayerSegment__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__LayerSegment__Group__0 )
            {
             before(grammarAccess.getLayerSegmentAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__LayerSegment__Group__0 )
            // InternalDsl.g:569:4: rule__LayerSegment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerSegmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerSegment"


    // $ANTLR start "entryRuleLayerSegmentName"
    // InternalDsl.g:578:1: entryRuleLayerSegmentName : ruleLayerSegmentName EOF ;
    public final void entryRuleLayerSegmentName() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleLayerSegmentName EOF )
            // InternalDsl.g:580:1: ruleLayerSegmentName EOF
            {
             before(grammarAccess.getLayerSegmentNameRule()); 
            pushFollow(FOLLOW_1);
            ruleLayerSegmentName();

            state._fsp--;

             after(grammarAccess.getLayerSegmentNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayerSegmentName"


    // $ANTLR start "ruleLayerSegmentName"
    // InternalDsl.g:587:1: ruleLayerSegmentName : ( ( rule__LayerSegmentName__Alternatives ) ) ;
    public final void ruleLayerSegmentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__LayerSegmentName__Alternatives ) ) )
            // InternalDsl.g:592:2: ( ( rule__LayerSegmentName__Alternatives ) )
            {
            // InternalDsl.g:592:2: ( ( rule__LayerSegmentName__Alternatives ) )
            // InternalDsl.g:593:3: ( rule__LayerSegmentName__Alternatives )
            {
             before(grammarAccess.getLayerSegmentNameAccess().getAlternatives()); 
            // InternalDsl.g:594:3: ( rule__LayerSegmentName__Alternatives )
            // InternalDsl.g:594:4: rule__LayerSegmentName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegmentName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayerSegmentNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerSegmentName"


    // $ANTLR start "entryRuleLayerSegmentRelation"
    // InternalDsl.g:603:1: entryRuleLayerSegmentRelation : ruleLayerSegmentRelation EOF ;
    public final void entryRuleLayerSegmentRelation() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleLayerSegmentRelation EOF )
            // InternalDsl.g:605:1: ruleLayerSegmentRelation EOF
            {
             before(grammarAccess.getLayerSegmentRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleLayerSegmentRelation();

            state._fsp--;

             after(grammarAccess.getLayerSegmentRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayerSegmentRelation"


    // $ANTLR start "ruleLayerSegmentRelation"
    // InternalDsl.g:612:1: ruleLayerSegmentRelation : ( ( rule__LayerSegmentRelation__Group__0 ) ) ;
    public final void ruleLayerSegmentRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__LayerSegmentRelation__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__LayerSegmentRelation__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__LayerSegmentRelation__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__LayerSegmentRelation__Group__0 )
            {
             before(grammarAccess.getLayerSegmentRelationAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__LayerSegmentRelation__Group__0 )
            // InternalDsl.g:619:4: rule__LayerSegmentRelation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegmentRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerSegmentRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerSegmentRelation"


    // $ANTLR start "entryRuleSublayerSegment"
    // InternalDsl.g:628:1: entryRuleSublayerSegment : ruleSublayerSegment EOF ;
    public final void entryRuleSublayerSegment() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleSublayerSegment EOF )
            // InternalDsl.g:630:1: ruleSublayerSegment EOF
            {
             before(grammarAccess.getSublayerSegmentRule()); 
            pushFollow(FOLLOW_1);
            ruleSublayerSegment();

            state._fsp--;

             after(grammarAccess.getSublayerSegmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSublayerSegment"


    // $ANTLR start "ruleSublayerSegment"
    // InternalDsl.g:637:1: ruleSublayerSegment : ( ( rule__SublayerSegment__Group__0 ) ) ;
    public final void ruleSublayerSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__SublayerSegment__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__SublayerSegment__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__SublayerSegment__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__SublayerSegment__Group__0 )
            {
             before(grammarAccess.getSublayerSegmentAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__SublayerSegment__Group__0 )
            // InternalDsl.g:644:4: rule__SublayerSegment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SublayerSegment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSublayerSegmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSublayerSegment"


    // $ANTLR start "entryRuleSublayerSegmentName"
    // InternalDsl.g:653:1: entryRuleSublayerSegmentName : ruleSublayerSegmentName EOF ;
    public final void entryRuleSublayerSegmentName() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleSublayerSegmentName EOF )
            // InternalDsl.g:655:1: ruleSublayerSegmentName EOF
            {
             before(grammarAccess.getSublayerSegmentNameRule()); 
            pushFollow(FOLLOW_1);
            ruleSublayerSegmentName();

            state._fsp--;

             after(grammarAccess.getSublayerSegmentNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSublayerSegmentName"


    // $ANTLR start "ruleSublayerSegmentName"
    // InternalDsl.g:662:1: ruleSublayerSegmentName : ( ( rule__SublayerSegmentName__Alternatives ) ) ;
    public final void ruleSublayerSegmentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__SublayerSegmentName__Alternatives ) ) )
            // InternalDsl.g:667:2: ( ( rule__SublayerSegmentName__Alternatives ) )
            {
            // InternalDsl.g:667:2: ( ( rule__SublayerSegmentName__Alternatives ) )
            // InternalDsl.g:668:3: ( rule__SublayerSegmentName__Alternatives )
            {
             before(grammarAccess.getSublayerSegmentNameAccess().getAlternatives()); 
            // InternalDsl.g:669:3: ( rule__SublayerSegmentName__Alternatives )
            // InternalDsl.g:669:4: rule__SublayerSegmentName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SublayerSegmentName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSublayerSegmentNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSublayerSegmentName"


    // $ANTLR start "entryRuleRelationArch"
    // InternalDsl.g:678:1: entryRuleRelationArch : ruleRelationArch EOF ;
    public final void entryRuleRelationArch() throws RecognitionException {
        try {
            // InternalDsl.g:679:1: ( ruleRelationArch EOF )
            // InternalDsl.g:680:1: ruleRelationArch EOF
            {
             before(grammarAccess.getRelationArchRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationArch();

            state._fsp--;

             after(grammarAccess.getRelationArchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationArch"


    // $ANTLR start "ruleRelationArch"
    // InternalDsl.g:687:1: ruleRelationArch : ( ( rule__RelationArch__Group__0 ) ) ;
    public final void ruleRelationArch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:2: ( ( ( rule__RelationArch__Group__0 ) ) )
            // InternalDsl.g:692:2: ( ( rule__RelationArch__Group__0 ) )
            {
            // InternalDsl.g:692:2: ( ( rule__RelationArch__Group__0 ) )
            // InternalDsl.g:693:3: ( rule__RelationArch__Group__0 )
            {
             before(grammarAccess.getRelationArchAccess().getGroup()); 
            // InternalDsl.g:694:3: ( rule__RelationArch__Group__0 )
            // InternalDsl.g:694:4: rule__RelationArch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationArchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationArch"


    // $ANTLR start "entryRuleTechnology"
    // InternalDsl.g:703:1: entryRuleTechnology : ruleTechnology EOF ;
    public final void entryRuleTechnology() throws RecognitionException {
        try {
            // InternalDsl.g:704:1: ( ruleTechnology EOF )
            // InternalDsl.g:705:1: ruleTechnology EOF
            {
             before(grammarAccess.getTechnologyRule()); 
            pushFollow(FOLLOW_1);
            ruleTechnology();

            state._fsp--;

             after(grammarAccess.getTechnologyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTechnology"


    // $ANTLR start "ruleTechnology"
    // InternalDsl.g:712:1: ruleTechnology : ( ( rule__Technology__Group__0 ) ) ;
    public final void ruleTechnology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:2: ( ( ( rule__Technology__Group__0 ) ) )
            // InternalDsl.g:717:2: ( ( rule__Technology__Group__0 ) )
            {
            // InternalDsl.g:717:2: ( ( rule__Technology__Group__0 ) )
            // InternalDsl.g:718:3: ( rule__Technology__Group__0 )
            {
             before(grammarAccess.getTechnologyAccess().getGroup()); 
            // InternalDsl.g:719:3: ( rule__Technology__Group__0 )
            // InternalDsl.g:719:4: rule__Technology__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTechnology"


    // $ANTLR start "entryRuleJavaApp"
    // InternalDsl.g:728:1: entryRuleJavaApp : ruleJavaApp EOF ;
    public final void entryRuleJavaApp() throws RecognitionException {
        try {
            // InternalDsl.g:729:1: ( ruleJavaApp EOF )
            // InternalDsl.g:730:1: ruleJavaApp EOF
            {
             before(grammarAccess.getJavaAppRule()); 
            pushFollow(FOLLOW_1);
            ruleJavaApp();

            state._fsp--;

             after(grammarAccess.getJavaAppRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJavaApp"


    // $ANTLR start "ruleJavaApp"
    // InternalDsl.g:737:1: ruleJavaApp : ( ( rule__JavaApp__Group__0 ) ) ;
    public final void ruleJavaApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:741:2: ( ( ( rule__JavaApp__Group__0 ) ) )
            // InternalDsl.g:742:2: ( ( rule__JavaApp__Group__0 ) )
            {
            // InternalDsl.g:742:2: ( ( rule__JavaApp__Group__0 ) )
            // InternalDsl.g:743:3: ( rule__JavaApp__Group__0 )
            {
             before(grammarAccess.getJavaAppAccess().getGroup()); 
            // InternalDsl.g:744:3: ( rule__JavaApp__Group__0 )
            // InternalDsl.g:744:4: rule__JavaApp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JavaApp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJavaAppAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJavaApp"


    // $ANTLR start "entryRuleAbstractFrontElement"
    // InternalDsl.g:753:1: entryRuleAbstractFrontElement : ruleAbstractFrontElement EOF ;
    public final void entryRuleAbstractFrontElement() throws RecognitionException {
        try {
            // InternalDsl.g:754:1: ( ruleAbstractFrontElement EOF )
            // InternalDsl.g:755:1: ruleAbstractFrontElement EOF
            {
             before(grammarAccess.getAbstractFrontElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractFrontElement();

            state._fsp--;

             after(grammarAccess.getAbstractFrontElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractFrontElement"


    // $ANTLR start "ruleAbstractFrontElement"
    // InternalDsl.g:762:1: ruleAbstractFrontElement : ( ( rule__AbstractFrontElement__Alternatives ) ) ;
    public final void ruleAbstractFrontElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:766:2: ( ( ( rule__AbstractFrontElement__Alternatives ) ) )
            // InternalDsl.g:767:2: ( ( rule__AbstractFrontElement__Alternatives ) )
            {
            // InternalDsl.g:767:2: ( ( rule__AbstractFrontElement__Alternatives ) )
            // InternalDsl.g:768:3: ( rule__AbstractFrontElement__Alternatives )
            {
             before(grammarAccess.getAbstractFrontElementAccess().getAlternatives()); 
            // InternalDsl.g:769:3: ( rule__AbstractFrontElement__Alternatives )
            // InternalDsl.g:769:4: rule__AbstractFrontElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractFrontElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractFrontElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractFrontElement"


    // $ANTLR start "entryRuleReactApp"
    // InternalDsl.g:778:1: entryRuleReactApp : ruleReactApp EOF ;
    public final void entryRuleReactApp() throws RecognitionException {
        try {
            // InternalDsl.g:779:1: ( ruleReactApp EOF )
            // InternalDsl.g:780:1: ruleReactApp EOF
            {
             before(grammarAccess.getReactAppRule()); 
            pushFollow(FOLLOW_1);
            ruleReactApp();

            state._fsp--;

             after(grammarAccess.getReactAppRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReactApp"


    // $ANTLR start "ruleReactApp"
    // InternalDsl.g:787:1: ruleReactApp : ( ( rule__ReactApp__Group__0 ) ) ;
    public final void ruleReactApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:791:2: ( ( ( rule__ReactApp__Group__0 ) ) )
            // InternalDsl.g:792:2: ( ( rule__ReactApp__Group__0 ) )
            {
            // InternalDsl.g:792:2: ( ( rule__ReactApp__Group__0 ) )
            // InternalDsl.g:793:3: ( rule__ReactApp__Group__0 )
            {
             before(grammarAccess.getReactAppAccess().getGroup()); 
            // InternalDsl.g:794:3: ( rule__ReactApp__Group__0 )
            // InternalDsl.g:794:4: rule__ReactApp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactApp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactAppAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactApp"


    // $ANTLR start "entryRuleFunctionality"
    // InternalDsl.g:803:1: entryRuleFunctionality : ruleFunctionality EOF ;
    public final void entryRuleFunctionality() throws RecognitionException {
        try {
            // InternalDsl.g:804:1: ( ruleFunctionality EOF )
            // InternalDsl.g:805:1: ruleFunctionality EOF
            {
             before(grammarAccess.getFunctionalityRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionality();

            state._fsp--;

             after(grammarAccess.getFunctionalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionality"


    // $ANTLR start "ruleFunctionality"
    // InternalDsl.g:812:1: ruleFunctionality : ( ( rule__Functionality__Group__0 ) ) ;
    public final void ruleFunctionality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:816:2: ( ( ( rule__Functionality__Group__0 ) ) )
            // InternalDsl.g:817:2: ( ( rule__Functionality__Group__0 ) )
            {
            // InternalDsl.g:817:2: ( ( rule__Functionality__Group__0 ) )
            // InternalDsl.g:818:3: ( rule__Functionality__Group__0 )
            {
             before(grammarAccess.getFunctionalityAccess().getGroup()); 
            // InternalDsl.g:819:3: ( rule__Functionality__Group__0 )
            // InternalDsl.g:819:4: rule__Functionality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionality"


    // $ANTLR start "entryRuleRouterComponent"
    // InternalDsl.g:828:1: entryRuleRouterComponent : ruleRouterComponent EOF ;
    public final void entryRuleRouterComponent() throws RecognitionException {
        try {
            // InternalDsl.g:829:1: ( ruleRouterComponent EOF )
            // InternalDsl.g:830:1: ruleRouterComponent EOF
            {
             before(grammarAccess.getRouterComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleRouterComponent();

            state._fsp--;

             after(grammarAccess.getRouterComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRouterComponent"


    // $ANTLR start "ruleRouterComponent"
    // InternalDsl.g:837:1: ruleRouterComponent : ( ( rule__RouterComponent__Group__0 ) ) ;
    public final void ruleRouterComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:841:2: ( ( ( rule__RouterComponent__Group__0 ) ) )
            // InternalDsl.g:842:2: ( ( rule__RouterComponent__Group__0 ) )
            {
            // InternalDsl.g:842:2: ( ( rule__RouterComponent__Group__0 ) )
            // InternalDsl.g:843:3: ( rule__RouterComponent__Group__0 )
            {
             before(grammarAccess.getRouterComponentAccess().getGroup()); 
            // InternalDsl.g:844:3: ( rule__RouterComponent__Group__0 )
            // InternalDsl.g:844:4: rule__RouterComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouterComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRouterComponent"


    // $ANTLR start "entryRuleContainer"
    // InternalDsl.g:853:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalDsl.g:854:1: ( ruleContainer EOF )
            // InternalDsl.g:855:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalDsl.g:862:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:866:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalDsl.g:867:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalDsl.g:867:2: ( ( rule__Container__Group__0 ) )
            // InternalDsl.g:868:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalDsl.g:869:3: ( rule__Container__Group__0 )
            // InternalDsl.g:869:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleVisualizer"
    // InternalDsl.g:878:1: entryRuleVisualizer : ruleVisualizer EOF ;
    public final void entryRuleVisualizer() throws RecognitionException {
        try {
            // InternalDsl.g:879:1: ( ruleVisualizer EOF )
            // InternalDsl.g:880:1: ruleVisualizer EOF
            {
             before(grammarAccess.getVisualizerRule()); 
            pushFollow(FOLLOW_1);
            ruleVisualizer();

            state._fsp--;

             after(grammarAccess.getVisualizerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisualizer"


    // $ANTLR start "ruleVisualizer"
    // InternalDsl.g:887:1: ruleVisualizer : ( ( rule__Visualizer__Group__0 ) ) ;
    public final void ruleVisualizer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:891:2: ( ( ( rule__Visualizer__Group__0 ) ) )
            // InternalDsl.g:892:2: ( ( rule__Visualizer__Group__0 ) )
            {
            // InternalDsl.g:892:2: ( ( rule__Visualizer__Group__0 ) )
            // InternalDsl.g:893:3: ( rule__Visualizer__Group__0 )
            {
             before(grammarAccess.getVisualizerAccess().getGroup()); 
            // InternalDsl.g:894:3: ( rule__Visualizer__Group__0 )
            // InternalDsl.g:894:4: rule__Visualizer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualizerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisualizer"


    // $ANTLR start "entryRuleServiceFront"
    // InternalDsl.g:903:1: entryRuleServiceFront : ruleServiceFront EOF ;
    public final void entryRuleServiceFront() throws RecognitionException {
        try {
            // InternalDsl.g:904:1: ( ruleServiceFront EOF )
            // InternalDsl.g:905:1: ruleServiceFront EOF
            {
             before(grammarAccess.getServiceFrontRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceFront();

            state._fsp--;

             after(grammarAccess.getServiceFrontRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceFront"


    // $ANTLR start "ruleServiceFront"
    // InternalDsl.g:912:1: ruleServiceFront : ( ( rule__ServiceFront__Group__0 ) ) ;
    public final void ruleServiceFront() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:916:2: ( ( ( rule__ServiceFront__Group__0 ) ) )
            // InternalDsl.g:917:2: ( ( rule__ServiceFront__Group__0 ) )
            {
            // InternalDsl.g:917:2: ( ( rule__ServiceFront__Group__0 ) )
            // InternalDsl.g:918:3: ( rule__ServiceFront__Group__0 )
            {
             before(grammarAccess.getServiceFrontAccess().getGroup()); 
            // InternalDsl.g:919:3: ( rule__ServiceFront__Group__0 )
            // InternalDsl.g:919:4: rule__ServiceFront__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceFrontAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceFront"


    // $ANTLR start "entryRuleDirectory"
    // InternalDsl.g:928:1: entryRuleDirectory : ruleDirectory EOF ;
    public final void entryRuleDirectory() throws RecognitionException {
        try {
            // InternalDsl.g:929:1: ( ruleDirectory EOF )
            // InternalDsl.g:930:1: ruleDirectory EOF
            {
             before(grammarAccess.getDirectoryRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectory();

            state._fsp--;

             after(grammarAccess.getDirectoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectory"


    // $ANTLR start "ruleDirectory"
    // InternalDsl.g:937:1: ruleDirectory : ( ( rule__Directory__Group__0 ) ) ;
    public final void ruleDirectory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:941:2: ( ( ( rule__Directory__Group__0 ) ) )
            // InternalDsl.g:942:2: ( ( rule__Directory__Group__0 ) )
            {
            // InternalDsl.g:942:2: ( ( rule__Directory__Group__0 ) )
            // InternalDsl.g:943:3: ( rule__Directory__Group__0 )
            {
             before(grammarAccess.getDirectoryAccess().getGroup()); 
            // InternalDsl.g:944:3: ( rule__Directory__Group__0 )
            // InternalDsl.g:944:4: rule__Directory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Directory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectory"


    // $ANTLR start "entryRuleFile"
    // InternalDsl.g:953:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalDsl.g:954:1: ( ruleFile EOF )
            // InternalDsl.g:955:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalDsl.g:962:1: ruleFile : ( ( rule__File__Alternatives ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:966:2: ( ( ( rule__File__Alternatives ) ) )
            // InternalDsl.g:967:2: ( ( rule__File__Alternatives ) )
            {
            // InternalDsl.g:967:2: ( ( rule__File__Alternatives ) )
            // InternalDsl.g:968:3: ( rule__File__Alternatives )
            {
             before(grammarAccess.getFileAccess().getAlternatives()); 
            // InternalDsl.g:969:3: ( rule__File__Alternatives )
            // InternalDsl.g:969:4: rule__File__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__File__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleMd"
    // InternalDsl.g:978:1: entryRuleMd : ruleMd EOF ;
    public final void entryRuleMd() throws RecognitionException {
        try {
            // InternalDsl.g:979:1: ( ruleMd EOF )
            // InternalDsl.g:980:1: ruleMd EOF
            {
             before(grammarAccess.getMdRule()); 
            pushFollow(FOLLOW_1);
            ruleMd();

            state._fsp--;

             after(grammarAccess.getMdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMd"


    // $ANTLR start "ruleMd"
    // InternalDsl.g:987:1: ruleMd : ( ( rule__Md__Group__0 ) ) ;
    public final void ruleMd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:991:2: ( ( ( rule__Md__Group__0 ) ) )
            // InternalDsl.g:992:2: ( ( rule__Md__Group__0 ) )
            {
            // InternalDsl.g:992:2: ( ( rule__Md__Group__0 ) )
            // InternalDsl.g:993:3: ( rule__Md__Group__0 )
            {
             before(grammarAccess.getMdAccess().getGroup()); 
            // InternalDsl.g:994:3: ( rule__Md__Group__0 )
            // InternalDsl.g:994:4: rule__Md__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Md__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMd"


    // $ANTLR start "entryRuleJs"
    // InternalDsl.g:1003:1: entryRuleJs : ruleJs EOF ;
    public final void entryRuleJs() throws RecognitionException {
        try {
            // InternalDsl.g:1004:1: ( ruleJs EOF )
            // InternalDsl.g:1005:1: ruleJs EOF
            {
             before(grammarAccess.getJsRule()); 
            pushFollow(FOLLOW_1);
            ruleJs();

            state._fsp--;

             after(grammarAccess.getJsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJs"


    // $ANTLR start "ruleJs"
    // InternalDsl.g:1012:1: ruleJs : ( ( rule__Js__Group__0 ) ) ;
    public final void ruleJs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1016:2: ( ( ( rule__Js__Group__0 ) ) )
            // InternalDsl.g:1017:2: ( ( rule__Js__Group__0 ) )
            {
            // InternalDsl.g:1017:2: ( ( rule__Js__Group__0 ) )
            // InternalDsl.g:1018:3: ( rule__Js__Group__0 )
            {
             before(grammarAccess.getJsAccess().getGroup()); 
            // InternalDsl.g:1019:3: ( rule__Js__Group__0 )
            // InternalDsl.g:1019:4: rule__Js__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Js__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJs"


    // $ANTLR start "entryRuleJson"
    // InternalDsl.g:1028:1: entryRuleJson : ruleJson EOF ;
    public final void entryRuleJson() throws RecognitionException {
        try {
            // InternalDsl.g:1029:1: ( ruleJson EOF )
            // InternalDsl.g:1030:1: ruleJson EOF
            {
             before(grammarAccess.getJsonRule()); 
            pushFollow(FOLLOW_1);
            ruleJson();

            state._fsp--;

             after(grammarAccess.getJsonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJson"


    // $ANTLR start "ruleJson"
    // InternalDsl.g:1037:1: ruleJson : ( ( rule__Json__Group__0 ) ) ;
    public final void ruleJson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1041:2: ( ( ( rule__Json__Group__0 ) ) )
            // InternalDsl.g:1042:2: ( ( rule__Json__Group__0 ) )
            {
            // InternalDsl.g:1042:2: ( ( rule__Json__Group__0 ) )
            // InternalDsl.g:1043:3: ( rule__Json__Group__0 )
            {
             before(grammarAccess.getJsonAccess().getGroup()); 
            // InternalDsl.g:1044:3: ( rule__Json__Group__0 )
            // InternalDsl.g:1044:4: rule__Json__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Json__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJson"


    // $ANTLR start "entryRuleCss"
    // InternalDsl.g:1053:1: entryRuleCss : ruleCss EOF ;
    public final void entryRuleCss() throws RecognitionException {
        try {
            // InternalDsl.g:1054:1: ( ruleCss EOF )
            // InternalDsl.g:1055:1: ruleCss EOF
            {
             before(grammarAccess.getCssRule()); 
            pushFollow(FOLLOW_1);
            ruleCss();

            state._fsp--;

             after(grammarAccess.getCssRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCss"


    // $ANTLR start "ruleCss"
    // InternalDsl.g:1062:1: ruleCss : ( ( rule__Css__Group__0 ) ) ;
    public final void ruleCss() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1066:2: ( ( ( rule__Css__Group__0 ) ) )
            // InternalDsl.g:1067:2: ( ( rule__Css__Group__0 ) )
            {
            // InternalDsl.g:1067:2: ( ( rule__Css__Group__0 ) )
            // InternalDsl.g:1068:3: ( rule__Css__Group__0 )
            {
             before(grammarAccess.getCssAccess().getGroup()); 
            // InternalDsl.g:1069:3: ( rule__Css__Group__0 )
            // InternalDsl.g:1069:4: rule__Css__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Css__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCssAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCss"


    // $ANTLR start "entryRuleState"
    // InternalDsl.g:1078:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalDsl.g:1079:1: ( ruleState EOF )
            // InternalDsl.g:1080:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalDsl.g:1087:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1091:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalDsl.g:1092:2: ( ( rule__State__Group__0 ) )
            {
            // InternalDsl.g:1092:2: ( ( rule__State__Group__0 ) )
            // InternalDsl.g:1093:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalDsl.g:1094:3: ( rule__State__Group__0 )
            // InternalDsl.g:1094:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:1103:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalDsl.g:1104:1: ( ruleAction EOF )
            // InternalDsl.g:1105:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDsl.g:1112:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1116:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalDsl.g:1117:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalDsl.g:1117:2: ( ( rule__Action__Group__0 ) )
            // InternalDsl.g:1118:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalDsl.g:1119:3: ( rule__Action__Group__0 )
            // InternalDsl.g:1119:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionCreator"
    // InternalDsl.g:1128:1: entryRuleActionCreator : ruleActionCreator EOF ;
    public final void entryRuleActionCreator() throws RecognitionException {
        try {
            // InternalDsl.g:1129:1: ( ruleActionCreator EOF )
            // InternalDsl.g:1130:1: ruleActionCreator EOF
            {
             before(grammarAccess.getActionCreatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActionCreator();

            state._fsp--;

             after(grammarAccess.getActionCreatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionCreator"


    // $ANTLR start "ruleActionCreator"
    // InternalDsl.g:1137:1: ruleActionCreator : ( ( rule__ActionCreator__Group__0 ) ) ;
    public final void ruleActionCreator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1141:2: ( ( ( rule__ActionCreator__Group__0 ) ) )
            // InternalDsl.g:1142:2: ( ( rule__ActionCreator__Group__0 ) )
            {
            // InternalDsl.g:1142:2: ( ( rule__ActionCreator__Group__0 ) )
            // InternalDsl.g:1143:3: ( rule__ActionCreator__Group__0 )
            {
             before(grammarAccess.getActionCreatorAccess().getGroup()); 
            // InternalDsl.g:1144:3: ( rule__ActionCreator__Group__0 )
            // InternalDsl.g:1144:4: rule__ActionCreator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionCreator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionCreatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionCreator"


    // $ANTLR start "entryRuleActionDispatcher"
    // InternalDsl.g:1153:1: entryRuleActionDispatcher : ruleActionDispatcher EOF ;
    public final void entryRuleActionDispatcher() throws RecognitionException {
        try {
            // InternalDsl.g:1154:1: ( ruleActionDispatcher EOF )
            // InternalDsl.g:1155:1: ruleActionDispatcher EOF
            {
             before(grammarAccess.getActionDispatcherRule()); 
            pushFollow(FOLLOW_1);
            ruleActionDispatcher();

            state._fsp--;

             after(grammarAccess.getActionDispatcherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionDispatcher"


    // $ANTLR start "ruleActionDispatcher"
    // InternalDsl.g:1162:1: ruleActionDispatcher : ( ( rule__ActionDispatcher__Group__0 ) ) ;
    public final void ruleActionDispatcher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1166:2: ( ( ( rule__ActionDispatcher__Group__0 ) ) )
            // InternalDsl.g:1167:2: ( ( rule__ActionDispatcher__Group__0 ) )
            {
            // InternalDsl.g:1167:2: ( ( rule__ActionDispatcher__Group__0 ) )
            // InternalDsl.g:1168:3: ( rule__ActionDispatcher__Group__0 )
            {
             before(grammarAccess.getActionDispatcherAccess().getGroup()); 
            // InternalDsl.g:1169:3: ( rule__ActionDispatcher__Group__0 )
            // InternalDsl.g:1169:4: rule__ActionDispatcher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionDispatcherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionDispatcher"


    // $ANTLR start "entryRuleReducer"
    // InternalDsl.g:1178:1: entryRuleReducer : ruleReducer EOF ;
    public final void entryRuleReducer() throws RecognitionException {
        try {
            // InternalDsl.g:1179:1: ( ruleReducer EOF )
            // InternalDsl.g:1180:1: ruleReducer EOF
            {
             before(grammarAccess.getReducerRule()); 
            pushFollow(FOLLOW_1);
            ruleReducer();

            state._fsp--;

             after(grammarAccess.getReducerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReducer"


    // $ANTLR start "ruleReducer"
    // InternalDsl.g:1187:1: ruleReducer : ( ( rule__Reducer__Group__0 ) ) ;
    public final void ruleReducer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1191:2: ( ( ( rule__Reducer__Group__0 ) ) )
            // InternalDsl.g:1192:2: ( ( rule__Reducer__Group__0 ) )
            {
            // InternalDsl.g:1192:2: ( ( rule__Reducer__Group__0 ) )
            // InternalDsl.g:1193:3: ( rule__Reducer__Group__0 )
            {
             before(grammarAccess.getReducerAccess().getGroup()); 
            // InternalDsl.g:1194:3: ( rule__Reducer__Group__0 )
            // InternalDsl.g:1194:4: rule__Reducer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reducer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReducerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReducer"


    // $ANTLR start "entryRuleJsModule"
    // InternalDsl.g:1203:1: entryRuleJsModule : ruleJsModule EOF ;
    public final void entryRuleJsModule() throws RecognitionException {
        try {
            // InternalDsl.g:1204:1: ( ruleJsModule EOF )
            // InternalDsl.g:1205:1: ruleJsModule EOF
            {
             before(grammarAccess.getJsModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleJsModule();

            state._fsp--;

             after(grammarAccess.getJsModuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsModule"


    // $ANTLR start "ruleJsModule"
    // InternalDsl.g:1212:1: ruleJsModule : ( ( rule__JsModule__Group__0 ) ) ;
    public final void ruleJsModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1216:2: ( ( ( rule__JsModule__Group__0 ) ) )
            // InternalDsl.g:1217:2: ( ( rule__JsModule__Group__0 ) )
            {
            // InternalDsl.g:1217:2: ( ( rule__JsModule__Group__0 ) )
            // InternalDsl.g:1218:3: ( rule__JsModule__Group__0 )
            {
             before(grammarAccess.getJsModuleAccess().getGroup()); 
            // InternalDsl.g:1219:3: ( rule__JsModule__Group__0 )
            // InternalDsl.g:1219:4: rule__JsModule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsModule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsModule"


    // $ANTLR start "rule__Submodule__EntitiesAlternatives_4_0"
    // InternalDsl.g:1227:1: rule__Submodule__EntitiesAlternatives_4_0 : ( ( ruleGeneralEntity ) | ( ruleSpecialEntity ) );
    public final void rule__Submodule__EntitiesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1231:1: ( ( ruleGeneralEntity ) | ( ruleSpecialEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==40) ) {
                alt1=1;
            }
            else if ( (LA1_0==43) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:1232:2: ( ruleGeneralEntity )
                    {
                    // InternalDsl.g:1232:2: ( ruleGeneralEntity )
                    // InternalDsl.g:1233:3: ruleGeneralEntity
                    {
                     before(grammarAccess.getSubmoduleAccess().getEntitiesGeneralEntityParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralEntity();

                    state._fsp--;

                     after(grammarAccess.getSubmoduleAccess().getEntitiesGeneralEntityParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1238:2: ( ruleSpecialEntity )
                    {
                    // InternalDsl.g:1238:2: ( ruleSpecialEntity )
                    // InternalDsl.g:1239:3: ruleSpecialEntity
                    {
                     before(grammarAccess.getSubmoduleAccess().getEntitiesSpecialEntityParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpecialEntity();

                    state._fsp--;

                     after(grammarAccess.getSubmoduleAccess().getEntitiesSpecialEntityParserRuleCall_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__EntitiesAlternatives_4_0"


    // $ANTLR start "rule__SubOperation__Alternatives"
    // InternalDsl.g:1248:1: rule__SubOperation__Alternatives : ( ( 'Read' ) | ( 'Create' ) );
    public final void rule__SubOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1252:1: ( ( 'Read' ) | ( 'Create' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:1253:2: ( 'Read' )
                    {
                    // InternalDsl.g:1253:2: ( 'Read' )
                    // InternalDsl.g:1254:3: 'Read'
                    {
                     before(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1259:2: ( 'Create' )
                    {
                    // InternalDsl.g:1259:2: ( 'Create' )
                    // InternalDsl.g:1260:3: 'Create'
                    {
                     before(grammarAccess.getSubOperationAccess().getCreateKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSubOperationAccess().getCreateKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubOperation__Alternatives"


    // $ANTLR start "rule__SubTransaction__Alternatives"
    // InternalDsl.g:1269:1: rule__SubTransaction__Alternatives : ( ( 'exchange' ) | ( 'sale' ) );
    public final void rule__SubTransaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1273:1: ( ( 'exchange' ) | ( 'sale' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:1274:2: ( 'exchange' )
                    {
                    // InternalDsl.g:1274:2: ( 'exchange' )
                    // InternalDsl.g:1275:3: 'exchange'
                    {
                     before(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1280:2: ( 'sale' )
                    {
                    // InternalDsl.g:1280:2: ( 'sale' )
                    // InternalDsl.g:1281:3: 'sale'
                    {
                     before(grammarAccess.getSubTransactionAccess().getSaleKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSubTransactionAccess().getSaleKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubTransaction__Alternatives"


    // $ANTLR start "rule__ComponentName__Alternatives"
    // InternalDsl.g:1290:1: rule__ComponentName__Alternatives : ( ( 'Back' ) | ( 'Front' ) );
    public final void rule__ComponentName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1294:1: ( ( 'Back' ) | ( 'Front' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:1295:2: ( 'Back' )
                    {
                    // InternalDsl.g:1295:2: ( 'Back' )
                    // InternalDsl.g:1296:3: 'Back'
                    {
                     before(grammarAccess.getComponentNameAccess().getBackKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComponentNameAccess().getBackKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1301:2: ( 'Front' )
                    {
                    // InternalDsl.g:1301:2: ( 'Front' )
                    // InternalDsl.g:1302:3: 'Front'
                    {
                     before(grammarAccess.getComponentNameAccess().getFrontKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComponentNameAccess().getFrontKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentName__Alternatives"


    // $ANTLR start "rule__LayerName__Alternatives"
    // InternalDsl.g:1311:1: rule__LayerName__Alternatives : ( ( 'JavaScript' ) | ( 'Ejb' ) | ( 'War' ) );
    public final void rule__LayerName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1315:1: ( ( 'JavaScript' ) | ( 'Ejb' ) | ( 'War' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:1316:2: ( 'JavaScript' )
                    {
                    // InternalDsl.g:1316:2: ( 'JavaScript' )
                    // InternalDsl.g:1317:3: 'JavaScript'
                    {
                     before(grammarAccess.getLayerNameAccess().getJavaScriptKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLayerNameAccess().getJavaScriptKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1322:2: ( 'Ejb' )
                    {
                    // InternalDsl.g:1322:2: ( 'Ejb' )
                    // InternalDsl.g:1323:3: 'Ejb'
                    {
                     before(grammarAccess.getLayerNameAccess().getEjbKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLayerNameAccess().getEjbKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1328:2: ( 'War' )
                    {
                    // InternalDsl.g:1328:2: ( 'War' )
                    // InternalDsl.g:1329:3: 'War'
                    {
                     before(grammarAccess.getLayerNameAccess().getWarKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLayerNameAccess().getWarKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerName__Alternatives"


    // $ANTLR start "rule__LayerSegmentName__Alternatives"
    // InternalDsl.g:1338:1: rule__LayerSegmentName__Alternatives : ( ( 'Services' ) | ( 'Ui' ) | ( 'Store' ) | ( 'RestEntity' ) | ( 'Pojo' ) | ( 'Facade' ) | ( 'Dto' ) | ( 'Util' ) | ( 'Containers' ) );
    public final void rule__LayerSegmentName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1342:1: ( ( 'Services' ) | ( 'Ui' ) | ( 'Store' ) | ( 'RestEntity' ) | ( 'Pojo' ) | ( 'Facade' ) | ( 'Dto' ) | ( 'Util' ) | ( 'Containers' ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            case 25:
                {
                alt6=6;
                }
                break;
            case 26:
                {
                alt6=7;
                }
                break;
            case 27:
                {
                alt6=8;
                }
                break;
            case 28:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:1343:2: ( 'Services' )
                    {
                    // InternalDsl.g:1343:2: ( 'Services' )
                    // InternalDsl.g:1344:3: 'Services'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getServicesKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getServicesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1349:2: ( 'Ui' )
                    {
                    // InternalDsl.g:1349:2: ( 'Ui' )
                    // InternalDsl.g:1350:3: 'Ui'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getUiKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getUiKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1355:2: ( 'Store' )
                    {
                    // InternalDsl.g:1355:2: ( 'Store' )
                    // InternalDsl.g:1356:3: 'Store'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getStoreKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getStoreKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1361:2: ( 'RestEntity' )
                    {
                    // InternalDsl.g:1361:2: ( 'RestEntity' )
                    // InternalDsl.g:1362:3: 'RestEntity'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getRestEntityKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getRestEntityKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1367:2: ( 'Pojo' )
                    {
                    // InternalDsl.g:1367:2: ( 'Pojo' )
                    // InternalDsl.g:1368:3: 'Pojo'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getPojoKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getPojoKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1373:2: ( 'Facade' )
                    {
                    // InternalDsl.g:1373:2: ( 'Facade' )
                    // InternalDsl.g:1374:3: 'Facade'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getFacadeKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getFacadeKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1379:2: ( 'Dto' )
                    {
                    // InternalDsl.g:1379:2: ( 'Dto' )
                    // InternalDsl.g:1380:3: 'Dto'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getDtoKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getDtoKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1385:2: ( 'Util' )
                    {
                    // InternalDsl.g:1385:2: ( 'Util' )
                    // InternalDsl.g:1386:3: 'Util'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getUtilKeyword_7()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getUtilKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1391:2: ( 'Containers' )
                    {
                    // InternalDsl.g:1391:2: ( 'Containers' )
                    // InternalDsl.g:1392:3: 'Containers'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getContainersKeyword_8()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getContainersKeyword_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegmentName__Alternatives"


    // $ANTLR start "rule__SublayerSegmentName__Alternatives"
    // InternalDsl.g:1401:1: rule__SublayerSegmentName__Alternatives : ( ( 'Actions' ) | ( 'Reducers' ) );
    public final void rule__SublayerSegmentName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1405:1: ( ( 'Actions' ) | ( 'Reducers' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:1406:2: ( 'Actions' )
                    {
                    // InternalDsl.g:1406:2: ( 'Actions' )
                    // InternalDsl.g:1407:3: 'Actions'
                    {
                     before(grammarAccess.getSublayerSegmentNameAccess().getActionsKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSublayerSegmentNameAccess().getActionsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1412:2: ( 'Reducers' )
                    {
                    // InternalDsl.g:1412:2: ( 'Reducers' )
                    // InternalDsl.g:1413:3: 'Reducers'
                    {
                     before(grammarAccess.getSublayerSegmentNameAccess().getReducersKeyword_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSublayerSegmentNameAccess().getReducersKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SublayerSegmentName__Alternatives"


    // $ANTLR start "rule__AbstractFrontElement__Alternatives"
    // InternalDsl.g:1422:1: rule__AbstractFrontElement__Alternatives : ( ( ruleReactApp ) | ( ruleFunctionality ) | ( ruleDirectory ) | ( ruleJsModule ) | ( ruleType ) | ( ruleRouterComponent ) | ( ruleContainer ) | ( ruleVisualizer ) | ( ruleServiceFront ) | ( ruleFile ) | ( ruleState ) | ( ruleAction ) | ( ruleActionCreator ) | ( ruleActionDispatcher ) | ( ruleReducer ) );
    public final void rule__AbstractFrontElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1426:1: ( ( ruleReactApp ) | ( ruleFunctionality ) | ( ruleDirectory ) | ( ruleJsModule ) | ( ruleType ) | ( ruleRouterComponent ) | ( ruleContainer ) | ( ruleVisualizer ) | ( ruleServiceFront ) | ( ruleFile ) | ( ruleState ) | ( ruleAction ) | ( ruleActionCreator ) | ( ruleActionDispatcher ) | ( ruleReducer ) )
            int alt8=15;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt8=1;
                }
                break;
            case 63:
                {
                alt8=2;
                }
                break;
            case 79:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            case 42:
                {
                alt8=5;
                }
                break;
            case 70:
                {
                alt8=6;
                }
                break;
            case 73:
                {
                alt8=7;
                }
                break;
            case 76:
                {
                alt8=8;
                }
                break;
            case 77:
                {
                alt8=9;
                }
                break;
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt8=10;
                }
                break;
            case 87:
                {
                alt8=11;
                }
                break;
            case 90:
                {
                alt8=12;
                }
                break;
            case 93:
                {
                alt8=13;
                }
                break;
            case 94:
                {
                alt8=14;
                }
                break;
            case 95:
                {
                alt8=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1427:2: ( ruleReactApp )
                    {
                    // InternalDsl.g:1427:2: ( ruleReactApp )
                    // InternalDsl.g:1428:3: ruleReactApp
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getReactAppParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleReactApp();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getReactAppParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1433:2: ( ruleFunctionality )
                    {
                    // InternalDsl.g:1433:2: ( ruleFunctionality )
                    // InternalDsl.g:1434:3: ruleFunctionality
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getFunctionalityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionality();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getFunctionalityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1439:2: ( ruleDirectory )
                    {
                    // InternalDsl.g:1439:2: ( ruleDirectory )
                    // InternalDsl.g:1440:3: ruleDirectory
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getDirectoryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectory();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getDirectoryParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1445:2: ( ruleJsModule )
                    {
                    // InternalDsl.g:1445:2: ( ruleJsModule )
                    // InternalDsl.g:1446:3: ruleJsModule
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getJsModuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleJsModule();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getJsModuleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1451:2: ( ruleType )
                    {
                    // InternalDsl.g:1451:2: ( ruleType )
                    // InternalDsl.g:1452:3: ruleType
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1457:2: ( ruleRouterComponent )
                    {
                    // InternalDsl.g:1457:2: ( ruleRouterComponent )
                    // InternalDsl.g:1458:3: ruleRouterComponent
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getRouterComponentParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleRouterComponent();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getRouterComponentParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1463:2: ( ruleContainer )
                    {
                    // InternalDsl.g:1463:2: ( ruleContainer )
                    // InternalDsl.g:1464:3: ruleContainer
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getContainerParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getContainerParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1469:2: ( ruleVisualizer )
                    {
                    // InternalDsl.g:1469:2: ( ruleVisualizer )
                    // InternalDsl.g:1470:3: ruleVisualizer
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getVisualizerParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleVisualizer();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getVisualizerParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1475:2: ( ruleServiceFront )
                    {
                    // InternalDsl.g:1475:2: ( ruleServiceFront )
                    // InternalDsl.g:1476:3: ruleServiceFront
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getServiceFrontParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleServiceFront();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getServiceFrontParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:1481:2: ( ruleFile )
                    {
                    // InternalDsl.g:1481:2: ( ruleFile )
                    // InternalDsl.g:1482:3: ruleFile
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getFileParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleFile();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getFileParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:1487:2: ( ruleState )
                    {
                    // InternalDsl.g:1487:2: ( ruleState )
                    // InternalDsl.g:1488:3: ruleState
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getStateParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getStateParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:1493:2: ( ruleAction )
                    {
                    // InternalDsl.g:1493:2: ( ruleAction )
                    // InternalDsl.g:1494:3: ruleAction
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getActionParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getActionParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:1499:2: ( ruleActionCreator )
                    {
                    // InternalDsl.g:1499:2: ( ruleActionCreator )
                    // InternalDsl.g:1500:3: ruleActionCreator
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getActionCreatorParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleActionCreator();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getActionCreatorParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDsl.g:1505:2: ( ruleActionDispatcher )
                    {
                    // InternalDsl.g:1505:2: ( ruleActionDispatcher )
                    // InternalDsl.g:1506:3: ruleActionDispatcher
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getActionDispatcherParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleActionDispatcher();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getActionDispatcherParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDsl.g:1511:2: ( ruleReducer )
                    {
                    // InternalDsl.g:1511:2: ( ruleReducer )
                    // InternalDsl.g:1512:3: ruleReducer
                    {
                     before(grammarAccess.getAbstractFrontElementAccess().getReducerParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleReducer();

                    state._fsp--;

                     after(grammarAccess.getAbstractFrontElementAccess().getReducerParserRuleCall_14()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFrontElement__Alternatives"


    // $ANTLR start "rule__File__Alternatives"
    // InternalDsl.g:1521:1: rule__File__Alternatives : ( ( ruleMd ) | ( ruleJs ) | ( ruleJson ) | ( ruleCss ) );
    public final void rule__File__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1525:1: ( ( ruleMd ) | ( ruleJs ) | ( ruleJson ) | ( ruleCss ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt9=1;
                }
                break;
            case 84:
                {
                alt9=2;
                }
                break;
            case 85:
                {
                alt9=3;
                }
                break;
            case 86:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1526:2: ( ruleMd )
                    {
                    // InternalDsl.g:1526:2: ( ruleMd )
                    // InternalDsl.g:1527:3: ruleMd
                    {
                     before(grammarAccess.getFileAccess().getMdParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMd();

                    state._fsp--;

                     after(grammarAccess.getFileAccess().getMdParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1532:2: ( ruleJs )
                    {
                    // InternalDsl.g:1532:2: ( ruleJs )
                    // InternalDsl.g:1533:3: ruleJs
                    {
                     before(grammarAccess.getFileAccess().getJsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJs();

                    state._fsp--;

                     after(grammarAccess.getFileAccess().getJsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1538:2: ( ruleJson )
                    {
                    // InternalDsl.g:1538:2: ( ruleJson )
                    // InternalDsl.g:1539:3: ruleJson
                    {
                     before(grammarAccess.getFileAccess().getJsonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleJson();

                    state._fsp--;

                     after(grammarAccess.getFileAccess().getJsonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1544:2: ( ruleCss )
                    {
                    // InternalDsl.g:1544:2: ( ruleCss )
                    // InternalDsl.g:1545:3: ruleCss
                    {
                     before(grammarAccess.getFileAccess().getCssParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCss();

                    state._fsp--;

                     after(grammarAccess.getFileAccess().getCssParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // InternalDsl.g:1554:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1558:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalDsl.g:1559:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalDsl.g:1566:1: rule__System__Group__0__Impl : ( 'Casino' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1570:1: ( ( 'Casino' ) )
            // InternalDsl.g:1571:1: ( 'Casino' )
            {
            // InternalDsl.g:1571:1: ( 'Casino' )
            // InternalDsl.g:1572:2: 'Casino'
            {
             before(grammarAccess.getSystemAccess().getCasinoKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCasinoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalDsl.g:1581:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1585:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalDsl.g:1586:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalDsl.g:1593:1: rule__System__Group__1__Impl : ( '{' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1597:1: ( ( '{' ) )
            // InternalDsl.g:1598:1: ( '{' )
            {
            // InternalDsl.g:1598:1: ( '{' )
            // InternalDsl.g:1599:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalDsl.g:1608:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1612:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalDsl.g:1613:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalDsl.g:1620:1: rule__System__Group__2__Impl : ( ( rule__System__DomAssignment_2 ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1624:1: ( ( ( rule__System__DomAssignment_2 ) ) )
            // InternalDsl.g:1625:1: ( ( rule__System__DomAssignment_2 ) )
            {
            // InternalDsl.g:1625:1: ( ( rule__System__DomAssignment_2 ) )
            // InternalDsl.g:1626:2: ( rule__System__DomAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getDomAssignment_2()); 
            // InternalDsl.g:1627:2: ( rule__System__DomAssignment_2 )
            // InternalDsl.g:1627:3: rule__System__DomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__System__DomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalDsl.g:1635:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1639:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalDsl.g:1640:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalDsl.g:1647:1: rule__System__Group__3__Impl : ( ( rule__System__ArchAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1651:1: ( ( ( rule__System__ArchAssignment_3 ) ) )
            // InternalDsl.g:1652:1: ( ( rule__System__ArchAssignment_3 ) )
            {
            // InternalDsl.g:1652:1: ( ( rule__System__ArchAssignment_3 ) )
            // InternalDsl.g:1653:2: ( rule__System__ArchAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getArchAssignment_3()); 
            // InternalDsl.g:1654:2: ( rule__System__ArchAssignment_3 )
            // InternalDsl.g:1654:3: rule__System__ArchAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__System__ArchAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getArchAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalDsl.g:1662:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1666:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalDsl.g:1667:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalDsl.g:1674:1: rule__System__Group__4__Impl : ( ( rule__System__TechAssignment_4 ) ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1678:1: ( ( ( rule__System__TechAssignment_4 ) ) )
            // InternalDsl.g:1679:1: ( ( rule__System__TechAssignment_4 ) )
            {
            // InternalDsl.g:1679:1: ( ( rule__System__TechAssignment_4 ) )
            // InternalDsl.g:1680:2: ( rule__System__TechAssignment_4 )
            {
             before(grammarAccess.getSystemAccess().getTechAssignment_4()); 
            // InternalDsl.g:1681:2: ( rule__System__TechAssignment_4 )
            // InternalDsl.g:1681:3: rule__System__TechAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__System__TechAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getTechAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalDsl.g:1689:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1693:1: ( rule__System__Group__5__Impl )
            // InternalDsl.g:1694:2: rule__System__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalDsl.g:1700:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1704:1: ( ( '}' ) )
            // InternalDsl.g:1705:1: ( '}' )
            {
            // InternalDsl.g:1705:1: ( '}' )
            // InternalDsl.g:1706:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalDsl.g:1716:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1720:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalDsl.g:1721:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalDsl.g:1728:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1732:1: ( ( 'domain' ) )
            // InternalDsl.g:1733:1: ( 'domain' )
            {
            // InternalDsl.g:1733:1: ( 'domain' )
            // InternalDsl.g:1734:2: 'domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalDsl.g:1743:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1747:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalDsl.g:1748:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalDsl.g:1755:1: rule__Domain__Group__1__Impl : ( '{' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1759:1: ( ( '{' ) )
            // InternalDsl.g:1760:1: ( '{' )
            {
            // InternalDsl.g:1760:1: ( '{' )
            // InternalDsl.g:1761:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // InternalDsl.g:1770:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1774:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalDsl.g:1775:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // InternalDsl.g:1782:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__TypesAssignment_2 )* ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1786:1: ( ( ( rule__Domain__TypesAssignment_2 )* ) )
            // InternalDsl.g:1787:1: ( ( rule__Domain__TypesAssignment_2 )* )
            {
            // InternalDsl.g:1787:1: ( ( rule__Domain__TypesAssignment_2 )* )
            // InternalDsl.g:1788:2: ( rule__Domain__TypesAssignment_2 )*
            {
             before(grammarAccess.getDomainAccess().getTypesAssignment_2()); 
            // InternalDsl.g:1789:2: ( rule__Domain__TypesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==42) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1789:3: rule__Domain__TypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Domain__TypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getTypesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // InternalDsl.g:1797:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1801:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalDsl.g:1802:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // InternalDsl.g:1809:1: rule__Domain__Group__3__Impl : ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1813:1: ( ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) ) )
            // InternalDsl.g:1814:1: ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) )
            {
            // InternalDsl.g:1814:1: ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) )
            // InternalDsl.g:1815:2: ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* )
            {
            // InternalDsl.g:1815:2: ( ( rule__Domain__ModulesAssignment_3 ) )
            // InternalDsl.g:1816:3: ( rule__Domain__ModulesAssignment_3 )
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_3()); 
            // InternalDsl.g:1817:3: ( rule__Domain__ModulesAssignment_3 )
            // InternalDsl.g:1817:4: rule__Domain__ModulesAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Domain__ModulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModulesAssignment_3()); 

            }

            // InternalDsl.g:1820:2: ( ( rule__Domain__ModulesAssignment_3 )* )
            // InternalDsl.g:1821:3: ( rule__Domain__ModulesAssignment_3 )*
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_3()); 
            // InternalDsl.g:1822:3: ( rule__Domain__ModulesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1822:4: rule__Domain__ModulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Domain__ModulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getModulesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // InternalDsl.g:1831:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1835:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalDsl.g:1836:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Domain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4"


    // $ANTLR start "rule__Domain__Group__4__Impl"
    // InternalDsl.g:1843:1: rule__Domain__Group__4__Impl : ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1847:1: ( ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) ) )
            // InternalDsl.g:1848:1: ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) )
            {
            // InternalDsl.g:1848:1: ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) )
            // InternalDsl.g:1849:2: ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* )
            {
            // InternalDsl.g:1849:2: ( ( rule__Domain__RelationsAssignment_4 ) )
            // InternalDsl.g:1850:3: ( rule__Domain__RelationsAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 
            // InternalDsl.g:1851:3: ( rule__Domain__RelationsAssignment_4 )
            // InternalDsl.g:1851:4: rule__Domain__RelationsAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__Domain__RelationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 

            }

            // InternalDsl.g:1854:2: ( ( rule__Domain__RelationsAssignment_4 )* )
            // InternalDsl.g:1855:3: ( rule__Domain__RelationsAssignment_4 )*
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 
            // InternalDsl.g:1856:3: ( rule__Domain__RelationsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1856:4: rule__Domain__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Domain__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__5"
    // InternalDsl.g:1865:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1869:1: ( rule__Domain__Group__5__Impl )
            // InternalDsl.g:1870:2: rule__Domain__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__5"


    // $ANTLR start "rule__Domain__Group__5__Impl"
    // InternalDsl.g:1876:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1880:1: ( ( '}' ) )
            // InternalDsl.g:1881:1: ( '}' )
            {
            // InternalDsl.g:1881:1: ( '}' )
            // InternalDsl.g:1882:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // InternalDsl.g:1892:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1896:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalDsl.g:1897:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // InternalDsl.g:1904:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1908:1: ( ( 'module' ) )
            // InternalDsl.g:1909:1: ( 'module' )
            {
            // InternalDsl.g:1909:1: ( 'module' )
            // InternalDsl.g:1910:2: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // InternalDsl.g:1919:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1923:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalDsl.g:1924:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // InternalDsl.g:1931:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1935:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalDsl.g:1936:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalDsl.g:1936:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalDsl.g:1937:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalDsl.g:1938:2: ( rule__Module__NameAssignment_1 )
            // InternalDsl.g:1938:3: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // InternalDsl.g:1946:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1950:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalDsl.g:1951:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // InternalDsl.g:1958:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1962:1: ( ( '{' ) )
            // InternalDsl.g:1963:1: ( '{' )
            {
            // InternalDsl.g:1963:1: ( '{' )
            // InternalDsl.g:1964:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // InternalDsl.g:1973:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1977:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalDsl.g:1978:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // InternalDsl.g:1985:1: rule__Module__Group__3__Impl : ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1989:1: ( ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) )
            // InternalDsl.g:1990:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            {
            // InternalDsl.g:1990:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            // InternalDsl.g:1991:2: ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* )
            {
            // InternalDsl.g:1991:2: ( ( rule__Module__SubmodulesAssignment_3 ) )
            // InternalDsl.g:1992:3: ( rule__Module__SubmodulesAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:1993:3: ( rule__Module__SubmodulesAssignment_3 )
            // InternalDsl.g:1993:4: rule__Module__SubmodulesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__Module__SubmodulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 

            }

            // InternalDsl.g:1996:2: ( ( rule__Module__SubmodulesAssignment_3 )* )
            // InternalDsl.g:1997:3: ( rule__Module__SubmodulesAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:1998:3: ( rule__Module__SubmodulesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1998:4: rule__Module__SubmodulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Module__SubmodulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // InternalDsl.g:2007:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2011:1: ( rule__Module__Group__4__Impl )
            // InternalDsl.g:2012:2: rule__Module__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // InternalDsl.g:2018:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2022:1: ( ( '}' ) )
            // InternalDsl.g:2023:1: ( '}' )
            {
            // InternalDsl.g:2023:1: ( '}' )
            // InternalDsl.g:2024:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Submodule__Group__0"
    // InternalDsl.g:2034:1: rule__Submodule__Group__0 : rule__Submodule__Group__0__Impl rule__Submodule__Group__1 ;
    public final void rule__Submodule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2038:1: ( rule__Submodule__Group__0__Impl rule__Submodule__Group__1 )
            // InternalDsl.g:2039:2: rule__Submodule__Group__0__Impl rule__Submodule__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Submodule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Submodule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__0"


    // $ANTLR start "rule__Submodule__Group__0__Impl"
    // InternalDsl.g:2046:1: rule__Submodule__Group__0__Impl : ( 'submodule' ) ;
    public final void rule__Submodule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2050:1: ( ( 'submodule' ) )
            // InternalDsl.g:2051:1: ( 'submodule' )
            {
            // InternalDsl.g:2051:1: ( 'submodule' )
            // InternalDsl.g:2052:2: 'submodule'
            {
             before(grammarAccess.getSubmoduleAccess().getSubmoduleKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSubmoduleAccess().getSubmoduleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__0__Impl"


    // $ANTLR start "rule__Submodule__Group__1"
    // InternalDsl.g:2061:1: rule__Submodule__Group__1 : rule__Submodule__Group__1__Impl rule__Submodule__Group__2 ;
    public final void rule__Submodule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2065:1: ( rule__Submodule__Group__1__Impl rule__Submodule__Group__2 )
            // InternalDsl.g:2066:2: rule__Submodule__Group__1__Impl rule__Submodule__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Submodule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Submodule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__1"


    // $ANTLR start "rule__Submodule__Group__1__Impl"
    // InternalDsl.g:2073:1: rule__Submodule__Group__1__Impl : ( ( rule__Submodule__NameAssignment_1 ) ) ;
    public final void rule__Submodule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2077:1: ( ( ( rule__Submodule__NameAssignment_1 ) ) )
            // InternalDsl.g:2078:1: ( ( rule__Submodule__NameAssignment_1 ) )
            {
            // InternalDsl.g:2078:1: ( ( rule__Submodule__NameAssignment_1 ) )
            // InternalDsl.g:2079:2: ( rule__Submodule__NameAssignment_1 )
            {
             before(grammarAccess.getSubmoduleAccess().getNameAssignment_1()); 
            // InternalDsl.g:2080:2: ( rule__Submodule__NameAssignment_1 )
            // InternalDsl.g:2080:3: rule__Submodule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Submodule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__1__Impl"


    // $ANTLR start "rule__Submodule__Group__2"
    // InternalDsl.g:2088:1: rule__Submodule__Group__2 : rule__Submodule__Group__2__Impl rule__Submodule__Group__3 ;
    public final void rule__Submodule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2092:1: ( rule__Submodule__Group__2__Impl rule__Submodule__Group__3 )
            // InternalDsl.g:2093:2: rule__Submodule__Group__2__Impl rule__Submodule__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Submodule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Submodule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__2"


    // $ANTLR start "rule__Submodule__Group__2__Impl"
    // InternalDsl.g:2100:1: rule__Submodule__Group__2__Impl : ( '{' ) ;
    public final void rule__Submodule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2104:1: ( ( '{' ) )
            // InternalDsl.g:2105:1: ( '{' )
            {
            // InternalDsl.g:2105:1: ( '{' )
            // InternalDsl.g:2106:2: '{'
            {
             before(grammarAccess.getSubmoduleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSubmoduleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__2__Impl"


    // $ANTLR start "rule__Submodule__Group__3"
    // InternalDsl.g:2115:1: rule__Submodule__Group__3 : rule__Submodule__Group__3__Impl rule__Submodule__Group__4 ;
    public final void rule__Submodule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2119:1: ( rule__Submodule__Group__3__Impl rule__Submodule__Group__4 )
            // InternalDsl.g:2120:2: rule__Submodule__Group__3__Impl rule__Submodule__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Submodule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Submodule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__3"


    // $ANTLR start "rule__Submodule__Group__3__Impl"
    // InternalDsl.g:2127:1: rule__Submodule__Group__3__Impl : ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) ;
    public final void rule__Submodule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2131:1: ( ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) )
            // InternalDsl.g:2132:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            {
            // InternalDsl.g:2132:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            // InternalDsl.g:2133:2: ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* )
            {
            // InternalDsl.g:2133:2: ( ( rule__Submodule__OperationsAssignment_3 ) )
            // InternalDsl.g:2134:3: ( rule__Submodule__OperationsAssignment_3 )
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:2135:3: ( rule__Submodule__OperationsAssignment_3 )
            // InternalDsl.g:2135:4: rule__Submodule__OperationsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__Submodule__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 

            }

            // InternalDsl.g:2138:2: ( ( rule__Submodule__OperationsAssignment_3 )* )
            // InternalDsl.g:2139:3: ( rule__Submodule__OperationsAssignment_3 )*
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:2140:3: ( rule__Submodule__OperationsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:2140:4: rule__Submodule__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Submodule__OperationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__3__Impl"


    // $ANTLR start "rule__Submodule__Group__4"
    // InternalDsl.g:2149:1: rule__Submodule__Group__4 : rule__Submodule__Group__4__Impl rule__Submodule__Group__5 ;
    public final void rule__Submodule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2153:1: ( rule__Submodule__Group__4__Impl rule__Submodule__Group__5 )
            // InternalDsl.g:2154:2: rule__Submodule__Group__4__Impl rule__Submodule__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Submodule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Submodule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__4"


    // $ANTLR start "rule__Submodule__Group__4__Impl"
    // InternalDsl.g:2161:1: rule__Submodule__Group__4__Impl : ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) ;
    public final void rule__Submodule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2165:1: ( ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) )
            // InternalDsl.g:2166:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            {
            // InternalDsl.g:2166:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            // InternalDsl.g:2167:2: ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* )
            {
            // InternalDsl.g:2167:2: ( ( rule__Submodule__EntitiesAssignment_4 ) )
            // InternalDsl.g:2168:3: ( rule__Submodule__EntitiesAssignment_4 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:2169:3: ( rule__Submodule__EntitiesAssignment_4 )
            // InternalDsl.g:2169:4: rule__Submodule__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_19);
            rule__Submodule__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 

            }

            // InternalDsl.g:2172:2: ( ( rule__Submodule__EntitiesAssignment_4 )* )
            // InternalDsl.g:2173:3: ( rule__Submodule__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:2174:3: ( rule__Submodule__EntitiesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40||LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:2174:4: rule__Submodule__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Submodule__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__4__Impl"


    // $ANTLR start "rule__Submodule__Group__5"
    // InternalDsl.g:2183:1: rule__Submodule__Group__5 : rule__Submodule__Group__5__Impl ;
    public final void rule__Submodule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2187:1: ( rule__Submodule__Group__5__Impl )
            // InternalDsl.g:2188:2: rule__Submodule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Submodule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__5"


    // $ANTLR start "rule__Submodule__Group__5__Impl"
    // InternalDsl.g:2194:1: rule__Submodule__Group__5__Impl : ( '}' ) ;
    public final void rule__Submodule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2198:1: ( ( '}' ) )
            // InternalDsl.g:2199:1: ( '}' )
            {
            // InternalDsl.g:2199:1: ( '}' )
            // InternalDsl.g:2200:2: '}'
            {
             before(grammarAccess.getSubmoduleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSubmoduleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalDsl.g:2210:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2214:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalDsl.g:2215:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalDsl.g:2222:1: rule__Operation__Group__0__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2226:1: ( ( 'op' ) )
            // InternalDsl.g:2227:1: ( 'op' )
            {
            // InternalDsl.g:2227:1: ( 'op' )
            // InternalDsl.g:2228:2: 'op'
            {
             before(grammarAccess.getOperationAccess().getOpKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalDsl.g:2237:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2241:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalDsl.g:2242:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalDsl.g:2249:1: rule__Operation__Group__1__Impl : ( '{' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2253:1: ( ( '{' ) )
            // InternalDsl.g:2254:1: ( '{' )
            {
            // InternalDsl.g:2254:1: ( '{' )
            // InternalDsl.g:2255:2: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalDsl.g:2264:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2268:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalDsl.g:2269:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalDsl.g:2276:1: rule__Operation__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2280:1: ( ( 'type:' ) )
            // InternalDsl.g:2281:1: ( 'type:' )
            {
            // InternalDsl.g:2281:1: ( 'type:' )
            // InternalDsl.g:2282:2: 'type:'
            {
             before(grammarAccess.getOperationAccess().getTypeKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalDsl.g:2291:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2295:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalDsl.g:2296:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalDsl.g:2303:1: rule__Operation__Group__3__Impl : ( ruleSubOperation ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2307:1: ( ( ruleSubOperation ) )
            // InternalDsl.g:2308:1: ( ruleSubOperation )
            {
            // InternalDsl.g:2308:1: ( ruleSubOperation )
            // InternalDsl.g:2309:2: ruleSubOperation
            {
             before(grammarAccess.getOperationAccess().getSubOperationParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSubOperation();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getSubOperationParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalDsl.g:2318:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2322:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalDsl.g:2323:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalDsl.g:2330:1: rule__Operation__Group__4__Impl : ( 'operates_on:' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2334:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:2335:1: ( 'operates_on:' )
            {
            // InternalDsl.g:2335:1: ( 'operates_on:' )
            // InternalDsl.g:2336:2: 'operates_on:'
            {
             before(grammarAccess.getOperationAccess().getOperates_onKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOperates_onKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // InternalDsl.g:2345:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2349:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalDsl.g:2350:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalDsl.g:2357:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__TargetAssignment_5 ) ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2361:1: ( ( ( rule__Operation__TargetAssignment_5 ) ) )
            // InternalDsl.g:2362:1: ( ( rule__Operation__TargetAssignment_5 ) )
            {
            // InternalDsl.g:2362:1: ( ( rule__Operation__TargetAssignment_5 ) )
            // InternalDsl.g:2363:2: ( rule__Operation__TargetAssignment_5 )
            {
             before(grammarAccess.getOperationAccess().getTargetAssignment_5()); 
            // InternalDsl.g:2364:2: ( rule__Operation__TargetAssignment_5 )
            // InternalDsl.g:2364:3: rule__Operation__TargetAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Operation__TargetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getTargetAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalDsl.g:2372:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2376:1: ( rule__Operation__Group__6__Impl )
            // InternalDsl.g:2377:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalDsl.g:2383:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2387:1: ( ( '}' ) )
            // InternalDsl.g:2388:1: ( '}' )
            {
            // InternalDsl.g:2388:1: ( '}' )
            // InternalDsl.g:2389:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__GeneralEntity__Group__0"
    // InternalDsl.g:2399:1: rule__GeneralEntity__Group__0 : rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 ;
    public final void rule__GeneralEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2403:1: ( rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 )
            // InternalDsl.g:2404:2: rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__GeneralEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__0"


    // $ANTLR start "rule__GeneralEntity__Group__0__Impl"
    // InternalDsl.g:2411:1: rule__GeneralEntity__Group__0__Impl : ( 'generalEntity' ) ;
    public final void rule__GeneralEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2415:1: ( ( 'generalEntity' ) )
            // InternalDsl.g:2416:1: ( 'generalEntity' )
            {
            // InternalDsl.g:2416:1: ( 'generalEntity' )
            // InternalDsl.g:2417:2: 'generalEntity'
            {
             before(grammarAccess.getGeneralEntityAccess().getGeneralEntityKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGeneralEntityAccess().getGeneralEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__0__Impl"


    // $ANTLR start "rule__GeneralEntity__Group__1"
    // InternalDsl.g:2426:1: rule__GeneralEntity__Group__1 : rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 ;
    public final void rule__GeneralEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2430:1: ( rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 )
            // InternalDsl.g:2431:2: rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__GeneralEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__1"


    // $ANTLR start "rule__GeneralEntity__Group__1__Impl"
    // InternalDsl.g:2438:1: rule__GeneralEntity__Group__1__Impl : ( ruleEntityName ) ;
    public final void rule__GeneralEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2442:1: ( ( ruleEntityName ) )
            // InternalDsl.g:2443:1: ( ruleEntityName )
            {
            // InternalDsl.g:2443:1: ( ruleEntityName )
            // InternalDsl.g:2444:2: ruleEntityName
            {
             before(grammarAccess.getGeneralEntityAccess().getEntityNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getGeneralEntityAccess().getEntityNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__1__Impl"


    // $ANTLR start "rule__GeneralEntity__Group__2"
    // InternalDsl.g:2453:1: rule__GeneralEntity__Group__2 : rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 ;
    public final void rule__GeneralEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2457:1: ( rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 )
            // InternalDsl.g:2458:2: rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__GeneralEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__2"


    // $ANTLR start "rule__GeneralEntity__Group__2__Impl"
    // InternalDsl.g:2465:1: rule__GeneralEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2469:1: ( ( '{' ) )
            // InternalDsl.g:2470:1: ( '{' )
            {
            // InternalDsl.g:2470:1: ( '{' )
            // InternalDsl.g:2471:2: '{'
            {
             before(grammarAccess.getGeneralEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGeneralEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__2__Impl"


    // $ANTLR start "rule__GeneralEntity__Group__3"
    // InternalDsl.g:2480:1: rule__GeneralEntity__Group__3 : rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 ;
    public final void rule__GeneralEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2484:1: ( rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 )
            // InternalDsl.g:2485:2: rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__GeneralEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__3"


    // $ANTLR start "rule__GeneralEntity__Group__3__Impl"
    // InternalDsl.g:2492:1: rule__GeneralEntity__Group__3__Impl : ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__GeneralEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2496:1: ( ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:2497:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:2497:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:2498:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:2498:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:2499:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:2500:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            // InternalDsl.g:2500:4: rule__GeneralEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_23);
            rule__GeneralEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:2503:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:2504:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:2505:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:2505:4: rule__GeneralEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__GeneralEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__3__Impl"


    // $ANTLR start "rule__GeneralEntity__Group__4"
    // InternalDsl.g:2514:1: rule__GeneralEntity__Group__4 : rule__GeneralEntity__Group__4__Impl ;
    public final void rule__GeneralEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2518:1: ( rule__GeneralEntity__Group__4__Impl )
            // InternalDsl.g:2519:2: rule__GeneralEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralEntity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__4"


    // $ANTLR start "rule__GeneralEntity__Group__4__Impl"
    // InternalDsl.g:2525:1: rule__GeneralEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2529:1: ( ( '}' ) )
            // InternalDsl.g:2530:1: ( '}' )
            {
            // InternalDsl.g:2530:1: ( '}' )
            // InternalDsl.g:2531:2: '}'
            {
             before(grammarAccess.getGeneralEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGeneralEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalDsl.g:2541:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2545:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDsl.g:2546:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalDsl.g:2553:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2557:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalDsl.g:2558:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalDsl.g:2558:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalDsl.g:2559:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalDsl.g:2560:2: ( rule__Property__NameAssignment_0 )
            // InternalDsl.g:2560:3: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalDsl.g:2568:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2572:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalDsl.g:2573:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalDsl.g:2580:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2584:1: ( ( ':' ) )
            // InternalDsl.g:2585:1: ( ':' )
            {
            // InternalDsl.g:2585:1: ( ':' )
            // InternalDsl.g:2586:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalDsl.g:2595:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2599:1: ( rule__Property__Group__2__Impl )
            // InternalDsl.g:2600:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalDsl.g:2606:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2610:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalDsl.g:2611:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalDsl.g:2611:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalDsl.g:2612:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalDsl.g:2613:2: ( rule__Property__TypeAssignment_2 )
            // InternalDsl.g:2613:3: rule__Property__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalDsl.g:2622:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2626:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDsl.g:2627:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalDsl.g:2634:1: rule__Type__Group__0__Impl : ( 'dataType' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2638:1: ( ( 'dataType' ) )
            // InternalDsl.g:2639:1: ( 'dataType' )
            {
            // InternalDsl.g:2639:1: ( 'dataType' )
            // InternalDsl.g:2640:2: 'dataType'
            {
             before(grammarAccess.getTypeAccess().getDataTypeKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDataTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalDsl.g:2649:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2653:1: ( rule__Type__Group__1__Impl )
            // InternalDsl.g:2654:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalDsl.g:2660:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2664:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalDsl.g:2665:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalDsl.g:2665:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalDsl.g:2666:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalDsl.g:2667:2: ( rule__Type__NameAssignment_1 )
            // InternalDsl.g:2667:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__SpecialEntity__Group__0"
    // InternalDsl.g:2676:1: rule__SpecialEntity__Group__0 : rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 ;
    public final void rule__SpecialEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2680:1: ( rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 )
            // InternalDsl.g:2681:2: rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SpecialEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__0"


    // $ANTLR start "rule__SpecialEntity__Group__0__Impl"
    // InternalDsl.g:2688:1: rule__SpecialEntity__Group__0__Impl : ( 'specialEntity' ) ;
    public final void rule__SpecialEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2692:1: ( ( 'specialEntity' ) )
            // InternalDsl.g:2693:1: ( 'specialEntity' )
            {
            // InternalDsl.g:2693:1: ( 'specialEntity' )
            // InternalDsl.g:2694:2: 'specialEntity'
            {
             before(grammarAccess.getSpecialEntityAccess().getSpecialEntityKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSpecialEntityAccess().getSpecialEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__0__Impl"


    // $ANTLR start "rule__SpecialEntity__Group__1"
    // InternalDsl.g:2703:1: rule__SpecialEntity__Group__1 : rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 ;
    public final void rule__SpecialEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2707:1: ( rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 )
            // InternalDsl.g:2708:2: rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SpecialEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__1"


    // $ANTLR start "rule__SpecialEntity__Group__1__Impl"
    // InternalDsl.g:2715:1: rule__SpecialEntity__Group__1__Impl : ( ruleEntityName ) ;
    public final void rule__SpecialEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2719:1: ( ( ruleEntityName ) )
            // InternalDsl.g:2720:1: ( ruleEntityName )
            {
            // InternalDsl.g:2720:1: ( ruleEntityName )
            // InternalDsl.g:2721:2: ruleEntityName
            {
             before(grammarAccess.getSpecialEntityAccess().getEntityNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getSpecialEntityAccess().getEntityNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__1__Impl"


    // $ANTLR start "rule__SpecialEntity__Group__2"
    // InternalDsl.g:2730:1: rule__SpecialEntity__Group__2 : rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 ;
    public final void rule__SpecialEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2734:1: ( rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 )
            // InternalDsl.g:2735:2: rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__SpecialEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__2"


    // $ANTLR start "rule__SpecialEntity__Group__2__Impl"
    // InternalDsl.g:2742:1: rule__SpecialEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SpecialEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2746:1: ( ( '{' ) )
            // InternalDsl.g:2747:1: ( '{' )
            {
            // InternalDsl.g:2747:1: ( '{' )
            // InternalDsl.g:2748:2: '{'
            {
             before(grammarAccess.getSpecialEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSpecialEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__2__Impl"


    // $ANTLR start "rule__SpecialEntity__Group__3"
    // InternalDsl.g:2757:1: rule__SpecialEntity__Group__3 : rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 ;
    public final void rule__SpecialEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2761:1: ( rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 )
            // InternalDsl.g:2762:2: rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__SpecialEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__3"


    // $ANTLR start "rule__SpecialEntity__Group__3__Impl"
    // InternalDsl.g:2769:1: rule__SpecialEntity__Group__3__Impl : ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__SpecialEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2773:1: ( ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:2774:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:2774:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:2775:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:2775:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:2776:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:2777:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            // InternalDsl.g:2777:4: rule__SpecialEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_23);
            rule__SpecialEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:2780:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:2781:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:2782:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:2782:4: rule__SpecialEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SpecialEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__3__Impl"


    // $ANTLR start "rule__SpecialEntity__Group__4"
    // InternalDsl.g:2791:1: rule__SpecialEntity__Group__4 : rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 ;
    public final void rule__SpecialEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2795:1: ( rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 )
            // InternalDsl.g:2796:2: rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SpecialEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialEntity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__4"


    // $ANTLR start "rule__SpecialEntity__Group__4__Impl"
    // InternalDsl.g:2803:1: rule__SpecialEntity__Group__4__Impl : ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) ;
    public final void rule__SpecialEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2807:1: ( ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) )
            // InternalDsl.g:2808:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            {
            // InternalDsl.g:2808:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            // InternalDsl.g:2809:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            {
            // InternalDsl.g:2809:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) )
            // InternalDsl.g:2810:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:2811:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            // InternalDsl.g:2811:4: rule__SpecialEntity__TransactionsAssignment_4
            {
            pushFollow(FOLLOW_26);
            rule__SpecialEntity__TransactionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 

            }

            // InternalDsl.g:2814:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            // InternalDsl.g:2815:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:2816:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==44) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:2816:4: rule__SpecialEntity__TransactionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__SpecialEntity__TransactionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__4__Impl"


    // $ANTLR start "rule__SpecialEntity__Group__5"
    // InternalDsl.g:2825:1: rule__SpecialEntity__Group__5 : rule__SpecialEntity__Group__5__Impl ;
    public final void rule__SpecialEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2829:1: ( rule__SpecialEntity__Group__5__Impl )
            // InternalDsl.g:2830:2: rule__SpecialEntity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecialEntity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__5"


    // $ANTLR start "rule__SpecialEntity__Group__5__Impl"
    // InternalDsl.g:2836:1: rule__SpecialEntity__Group__5__Impl : ( '}' ) ;
    public final void rule__SpecialEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2840:1: ( ( '}' ) )
            // InternalDsl.g:2841:1: ( '}' )
            {
            // InternalDsl.g:2841:1: ( '}' )
            // InternalDsl.g:2842:2: '}'
            {
             before(grammarAccess.getSpecialEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSpecialEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__5__Impl"


    // $ANTLR start "rule__Transaction__Group__0"
    // InternalDsl.g:2852:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2856:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalDsl.g:2857:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Transaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0"


    // $ANTLR start "rule__Transaction__Group__0__Impl"
    // InternalDsl.g:2864:1: rule__Transaction__Group__0__Impl : ( 'trx' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2868:1: ( ( 'trx' ) )
            // InternalDsl.g:2869:1: ( 'trx' )
            {
            // InternalDsl.g:2869:1: ( 'trx' )
            // InternalDsl.g:2870:2: 'trx'
            {
             before(grammarAccess.getTransactionAccess().getTrxKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getTrxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0__Impl"


    // $ANTLR start "rule__Transaction__Group__1"
    // InternalDsl.g:2879:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2883:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalDsl.g:2884:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Transaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1"


    // $ANTLR start "rule__Transaction__Group__1__Impl"
    // InternalDsl.g:2891:1: rule__Transaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2895:1: ( ( '{' ) )
            // InternalDsl.g:2896:1: ( '{' )
            {
            // InternalDsl.g:2896:1: ( '{' )
            // InternalDsl.g:2897:2: '{'
            {
             before(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1__Impl"


    // $ANTLR start "rule__Transaction__Group__2"
    // InternalDsl.g:2906:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2910:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalDsl.g:2911:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Transaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2"


    // $ANTLR start "rule__Transaction__Group__2__Impl"
    // InternalDsl.g:2918:1: rule__Transaction__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2922:1: ( ( 'type:' ) )
            // InternalDsl.g:2923:1: ( 'type:' )
            {
            // InternalDsl.g:2923:1: ( 'type:' )
            // InternalDsl.g:2924:2: 'type:'
            {
             before(grammarAccess.getTransactionAccess().getTypeKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2__Impl"


    // $ANTLR start "rule__Transaction__Group__3"
    // InternalDsl.g:2933:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2937:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalDsl.g:2938:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Transaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3"


    // $ANTLR start "rule__Transaction__Group__3__Impl"
    // InternalDsl.g:2945:1: rule__Transaction__Group__3__Impl : ( ruleSubTransaction ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2949:1: ( ( ruleSubTransaction ) )
            // InternalDsl.g:2950:1: ( ruleSubTransaction )
            {
            // InternalDsl.g:2950:1: ( ruleSubTransaction )
            // InternalDsl.g:2951:2: ruleSubTransaction
            {
             before(grammarAccess.getTransactionAccess().getSubTransactionParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSubTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getSubTransactionParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3__Impl"


    // $ANTLR start "rule__Transaction__Group__4"
    // InternalDsl.g:2960:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2964:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalDsl.g:2965:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Transaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4"


    // $ANTLR start "rule__Transaction__Group__4__Impl"
    // InternalDsl.g:2972:1: rule__Transaction__Group__4__Impl : ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2976:1: ( ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) )
            // InternalDsl.g:2977:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            {
            // InternalDsl.g:2977:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            // InternalDsl.g:2978:2: ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* )
            {
            // InternalDsl.g:2978:2: ( ( rule__Transaction__OperatesonAssignment_4 ) )
            // InternalDsl.g:2979:3: ( rule__Transaction__OperatesonAssignment_4 )
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:2980:3: ( rule__Transaction__OperatesonAssignment_4 )
            // InternalDsl.g:2980:4: rule__Transaction__OperatesonAssignment_4
            {
            pushFollow(FOLLOW_28);
            rule__Transaction__OperatesonAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 

            }

            // InternalDsl.g:2983:2: ( ( rule__Transaction__OperatesonAssignment_4 )* )
            // InternalDsl.g:2984:3: ( rule__Transaction__OperatesonAssignment_4 )*
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:2985:3: ( rule__Transaction__OperatesonAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:2985:4: rule__Transaction__OperatesonAssignment_4
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Transaction__OperatesonAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4__Impl"


    // $ANTLR start "rule__Transaction__Group__5"
    // InternalDsl.g:2994:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2998:1: ( rule__Transaction__Group__5__Impl )
            // InternalDsl.g:2999:2: rule__Transaction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5"


    // $ANTLR start "rule__Transaction__Group__5__Impl"
    // InternalDsl.g:3005:1: rule__Transaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3009:1: ( ( '}' ) )
            // InternalDsl.g:3010:1: ( '}' )
            {
            // InternalDsl.g:3010:1: ( '}' )
            // InternalDsl.g:3011:2: '}'
            {
             before(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5__Impl"


    // $ANTLR start "rule__Operateson__Group__0"
    // InternalDsl.g:3021:1: rule__Operateson__Group__0 : rule__Operateson__Group__0__Impl rule__Operateson__Group__1 ;
    public final void rule__Operateson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3025:1: ( rule__Operateson__Group__0__Impl rule__Operateson__Group__1 )
            // InternalDsl.g:3026:2: rule__Operateson__Group__0__Impl rule__Operateson__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Operateson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operateson__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateson__Group__0"


    // $ANTLR start "rule__Operateson__Group__0__Impl"
    // InternalDsl.g:3033:1: rule__Operateson__Group__0__Impl : ( 'operates_on:' ) ;
    public final void rule__Operateson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3037:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:3038:1: ( 'operates_on:' )
            {
            // InternalDsl.g:3038:1: ( 'operates_on:' )
            // InternalDsl.g:3039:2: 'operates_on:'
            {
             before(grammarAccess.getOperatesonAccess().getOperates_onKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOperatesonAccess().getOperates_onKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateson__Group__0__Impl"


    // $ANTLR start "rule__Operateson__Group__1"
    // InternalDsl.g:3048:1: rule__Operateson__Group__1 : rule__Operateson__Group__1__Impl ;
    public final void rule__Operateson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3052:1: ( rule__Operateson__Group__1__Impl )
            // InternalDsl.g:3053:2: rule__Operateson__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operateson__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateson__Group__1"


    // $ANTLR start "rule__Operateson__Group__1__Impl"
    // InternalDsl.g:3059:1: rule__Operateson__Group__1__Impl : ( ( rule__Operateson__OperatesonAssignment_1 ) ) ;
    public final void rule__Operateson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3063:1: ( ( ( rule__Operateson__OperatesonAssignment_1 ) ) )
            // InternalDsl.g:3064:1: ( ( rule__Operateson__OperatesonAssignment_1 ) )
            {
            // InternalDsl.g:3064:1: ( ( rule__Operateson__OperatesonAssignment_1 ) )
            // InternalDsl.g:3065:2: ( rule__Operateson__OperatesonAssignment_1 )
            {
             before(grammarAccess.getOperatesonAccess().getOperatesonAssignment_1()); 
            // InternalDsl.g:3066:2: ( rule__Operateson__OperatesonAssignment_1 )
            // InternalDsl.g:3066:3: rule__Operateson__OperatesonAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operateson__OperatesonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatesonAccess().getOperatesonAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateson__Group__1__Impl"


    // $ANTLR start "rule__RelationDom__Group__0"
    // InternalDsl.g:3075:1: rule__RelationDom__Group__0 : rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 ;
    public final void rule__RelationDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3079:1: ( rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 )
            // InternalDsl.g:3080:2: rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RelationDom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__0"


    // $ANTLR start "rule__RelationDom__Group__0__Impl"
    // InternalDsl.g:3087:1: rule__RelationDom__Group__0__Impl : ( 'rel' ) ;
    public final void rule__RelationDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3091:1: ( ( 'rel' ) )
            // InternalDsl.g:3092:1: ( 'rel' )
            {
            // InternalDsl.g:3092:1: ( 'rel' )
            // InternalDsl.g:3093:2: 'rel'
            {
             before(grammarAccess.getRelationDomAccess().getRelKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getRelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__0__Impl"


    // $ANTLR start "rule__RelationDom__Group__1"
    // InternalDsl.g:3102:1: rule__RelationDom__Group__1 : rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 ;
    public final void rule__RelationDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3106:1: ( rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 )
            // InternalDsl.g:3107:2: rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__RelationDom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__1"


    // $ANTLR start "rule__RelationDom__Group__1__Impl"
    // InternalDsl.g:3114:1: rule__RelationDom__Group__1__Impl : ( '{' ) ;
    public final void rule__RelationDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3118:1: ( ( '{' ) )
            // InternalDsl.g:3119:1: ( '{' )
            {
            // InternalDsl.g:3119:1: ( '{' )
            // InternalDsl.g:3120:2: '{'
            {
             before(grammarAccess.getRelationDomAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__1__Impl"


    // $ANTLR start "rule__RelationDom__Group__2"
    // InternalDsl.g:3129:1: rule__RelationDom__Group__2 : rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 ;
    public final void rule__RelationDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3133:1: ( rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 )
            // InternalDsl.g:3134:2: rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__RelationDom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__2"


    // $ANTLR start "rule__RelationDom__Group__2__Impl"
    // InternalDsl.g:3141:1: rule__RelationDom__Group__2__Impl : ( 'type:' ) ;
    public final void rule__RelationDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3145:1: ( ( 'type:' ) )
            // InternalDsl.g:3146:1: ( 'type:' )
            {
            // InternalDsl.g:3146:1: ( 'type:' )
            // InternalDsl.g:3147:2: 'type:'
            {
             before(grammarAccess.getRelationDomAccess().getTypeKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__2__Impl"


    // $ANTLR start "rule__RelationDom__Group__3"
    // InternalDsl.g:3156:1: rule__RelationDom__Group__3 : rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 ;
    public final void rule__RelationDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3160:1: ( rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 )
            // InternalDsl.g:3161:2: rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__RelationDom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__3"


    // $ANTLR start "rule__RelationDom__Group__3__Impl"
    // InternalDsl.g:3168:1: rule__RelationDom__Group__3__Impl : ( 'Composition' ) ;
    public final void rule__RelationDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3172:1: ( ( 'Composition' ) )
            // InternalDsl.g:3173:1: ( 'Composition' )
            {
            // InternalDsl.g:3173:1: ( 'Composition' )
            // InternalDsl.g:3174:2: 'Composition'
            {
             before(grammarAccess.getRelationDomAccess().getCompositionKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getCompositionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__3__Impl"


    // $ANTLR start "rule__RelationDom__Group__4"
    // InternalDsl.g:3183:1: rule__RelationDom__Group__4 : rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 ;
    public final void rule__RelationDom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3187:1: ( rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 )
            // InternalDsl.g:3188:2: rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__RelationDom__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__4"


    // $ANTLR start "rule__RelationDom__Group__4__Impl"
    // InternalDsl.g:3195:1: rule__RelationDom__Group__4__Impl : ( 'source:' ) ;
    public final void rule__RelationDom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3199:1: ( ( 'source:' ) )
            // InternalDsl.g:3200:1: ( 'source:' )
            {
            // InternalDsl.g:3200:1: ( 'source:' )
            // InternalDsl.g:3201:2: 'source:'
            {
             before(grammarAccess.getRelationDomAccess().getSourceKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getSourceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__4__Impl"


    // $ANTLR start "rule__RelationDom__Group__5"
    // InternalDsl.g:3210:1: rule__RelationDom__Group__5 : rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 ;
    public final void rule__RelationDom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3214:1: ( rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 )
            // InternalDsl.g:3215:2: rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__RelationDom__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__5"


    // $ANTLR start "rule__RelationDom__Group__5__Impl"
    // InternalDsl.g:3222:1: rule__RelationDom__Group__5__Impl : ( ( rule__RelationDom__SourceAssignment_5 ) ) ;
    public final void rule__RelationDom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3226:1: ( ( ( rule__RelationDom__SourceAssignment_5 ) ) )
            // InternalDsl.g:3227:1: ( ( rule__RelationDom__SourceAssignment_5 ) )
            {
            // InternalDsl.g:3227:1: ( ( rule__RelationDom__SourceAssignment_5 ) )
            // InternalDsl.g:3228:2: ( rule__RelationDom__SourceAssignment_5 )
            {
             before(grammarAccess.getRelationDomAccess().getSourceAssignment_5()); 
            // InternalDsl.g:3229:2: ( rule__RelationDom__SourceAssignment_5 )
            // InternalDsl.g:3229:3: rule__RelationDom__SourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__SourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationDomAccess().getSourceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__5__Impl"


    // $ANTLR start "rule__RelationDom__Group__6"
    // InternalDsl.g:3237:1: rule__RelationDom__Group__6 : rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 ;
    public final void rule__RelationDom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3241:1: ( rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 )
            // InternalDsl.g:3242:2: rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__RelationDom__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__6"


    // $ANTLR start "rule__RelationDom__Group__6__Impl"
    // InternalDsl.g:3249:1: rule__RelationDom__Group__6__Impl : ( 'target:' ) ;
    public final void rule__RelationDom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3253:1: ( ( 'target:' ) )
            // InternalDsl.g:3254:1: ( 'target:' )
            {
            // InternalDsl.g:3254:1: ( 'target:' )
            // InternalDsl.g:3255:2: 'target:'
            {
             before(grammarAccess.getRelationDomAccess().getTargetKeyword_6()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getTargetKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__6__Impl"


    // $ANTLR start "rule__RelationDom__Group__7"
    // InternalDsl.g:3264:1: rule__RelationDom__Group__7 : rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 ;
    public final void rule__RelationDom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3268:1: ( rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 )
            // InternalDsl.g:3269:2: rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__RelationDom__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__7"


    // $ANTLR start "rule__RelationDom__Group__7__Impl"
    // InternalDsl.g:3276:1: rule__RelationDom__Group__7__Impl : ( ( rule__RelationDom__TargetAssignment_7 ) ) ;
    public final void rule__RelationDom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3280:1: ( ( ( rule__RelationDom__TargetAssignment_7 ) ) )
            // InternalDsl.g:3281:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            {
            // InternalDsl.g:3281:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            // InternalDsl.g:3282:2: ( rule__RelationDom__TargetAssignment_7 )
            {
             before(grammarAccess.getRelationDomAccess().getTargetAssignment_7()); 
            // InternalDsl.g:3283:2: ( rule__RelationDom__TargetAssignment_7 )
            // InternalDsl.g:3283:3: rule__RelationDom__TargetAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__TargetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRelationDomAccess().getTargetAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__7__Impl"


    // $ANTLR start "rule__RelationDom__Group__8"
    // InternalDsl.g:3291:1: rule__RelationDom__Group__8 : rule__RelationDom__Group__8__Impl ;
    public final void rule__RelationDom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3295:1: ( rule__RelationDom__Group__8__Impl )
            // InternalDsl.g:3296:2: rule__RelationDom__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__8"


    // $ANTLR start "rule__RelationDom__Group__8__Impl"
    // InternalDsl.g:3302:1: rule__RelationDom__Group__8__Impl : ( '}' ) ;
    public final void rule__RelationDom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3306:1: ( ( '}' ) )
            // InternalDsl.g:3307:1: ( '}' )
            {
            // InternalDsl.g:3307:1: ( '}' )
            // InternalDsl.g:3308:2: '}'
            {
             before(grammarAccess.getRelationDomAccess().getRightCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group__8__Impl"


    // $ANTLR start "rule__Architecture__Group__0"
    // InternalDsl.g:3318:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3322:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalDsl.g:3323:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__0"


    // $ANTLR start "rule__Architecture__Group__0__Impl"
    // InternalDsl.g:3330:1: rule__Architecture__Group__0__Impl : ( 'arch' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3334:1: ( ( 'arch' ) )
            // InternalDsl.g:3335:1: ( 'arch' )
            {
            // InternalDsl.g:3335:1: ( 'arch' )
            // InternalDsl.g:3336:2: 'arch'
            {
             before(grammarAccess.getArchitectureAccess().getArchKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getArchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__0__Impl"


    // $ANTLR start "rule__Architecture__Group__1"
    // InternalDsl.g:3345:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3349:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalDsl.g:3350:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__1"


    // $ANTLR start "rule__Architecture__Group__1__Impl"
    // InternalDsl.g:3357:1: rule__Architecture__Group__1__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3361:1: ( ( '{' ) )
            // InternalDsl.g:3362:1: ( '{' )
            {
            // InternalDsl.g:3362:1: ( '{' )
            // InternalDsl.g:3363:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__1__Impl"


    // $ANTLR start "rule__Architecture__Group__2"
    // InternalDsl.g:3372:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3376:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalDsl.g:3377:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__2"


    // $ANTLR start "rule__Architecture__Group__2__Impl"
    // InternalDsl.g:3384:1: rule__Architecture__Group__2__Impl : ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3388:1: ( ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) ) )
            // InternalDsl.g:3389:1: ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) )
            {
            // InternalDsl.g:3389:1: ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) )
            // InternalDsl.g:3390:2: ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* )
            {
            // InternalDsl.g:3390:2: ( ( rule__Architecture__ComponentesAssignment_2 ) )
            // InternalDsl.g:3391:3: ( rule__Architecture__ComponentesAssignment_2 )
            {
             before(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 
            // InternalDsl.g:3392:3: ( rule__Architecture__ComponentesAssignment_2 )
            // InternalDsl.g:3392:4: rule__Architecture__ComponentesAssignment_2
            {
            pushFollow(FOLLOW_34);
            rule__Architecture__ComponentesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 

            }

            // InternalDsl.g:3395:2: ( ( rule__Architecture__ComponentesAssignment_2 )* )
            // InternalDsl.g:3396:3: ( rule__Architecture__ComponentesAssignment_2 )*
            {
             before(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 
            // InternalDsl.g:3397:3: ( rule__Architecture__ComponentesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==50) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:3397:4: rule__Architecture__ComponentesAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Architecture__ComponentesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__2__Impl"


    // $ANTLR start "rule__Architecture__Group__3"
    // InternalDsl.g:3406:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3410:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalDsl.g:3411:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Architecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__3"


    // $ANTLR start "rule__Architecture__Group__3__Impl"
    // InternalDsl.g:3418:1: rule__Architecture__Group__3__Impl : ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3422:1: ( ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) ) )
            // InternalDsl.g:3423:1: ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) )
            {
            // InternalDsl.g:3423:1: ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) )
            // InternalDsl.g:3424:2: ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* )
            {
            // InternalDsl.g:3424:2: ( ( rule__Architecture__RelationArchAssignment_3 ) )
            // InternalDsl.g:3425:3: ( rule__Architecture__RelationArchAssignment_3 )
            {
             before(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 
            // InternalDsl.g:3426:3: ( rule__Architecture__RelationArchAssignment_3 )
            // InternalDsl.g:3426:4: rule__Architecture__RelationArchAssignment_3
            {
            pushFollow(FOLLOW_35);
            rule__Architecture__RelationArchAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 

            }

            // InternalDsl.g:3429:2: ( ( rule__Architecture__RelationArchAssignment_3 )* )
            // InternalDsl.g:3430:3: ( rule__Architecture__RelationArchAssignment_3 )*
            {
             before(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 
            // InternalDsl.g:3431:3: ( rule__Architecture__RelationArchAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==55) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:3431:4: rule__Architecture__RelationArchAssignment_3
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Architecture__RelationArchAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__3__Impl"


    // $ANTLR start "rule__Architecture__Group__4"
    // InternalDsl.g:3440:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3444:1: ( rule__Architecture__Group__4__Impl )
            // InternalDsl.g:3445:2: rule__Architecture__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__4"


    // $ANTLR start "rule__Architecture__Group__4__Impl"
    // InternalDsl.g:3451:1: rule__Architecture__Group__4__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3455:1: ( ( '}' ) )
            // InternalDsl.g:3456:1: ( '}' )
            {
            // InternalDsl.g:3456:1: ( '}' )
            // InternalDsl.g:3457:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalDsl.g:3467:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3471:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalDsl.g:3472:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalDsl.g:3479:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3483:1: ( ( 'component' ) )
            // InternalDsl.g:3484:1: ( 'component' )
            {
            // InternalDsl.g:3484:1: ( 'component' )
            // InternalDsl.g:3485:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalDsl.g:3494:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3498:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalDsl.g:3499:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalDsl.g:3506:1: rule__Component__Group__1__Impl : ( ruleComponentName ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3510:1: ( ( ruleComponentName ) )
            // InternalDsl.g:3511:1: ( ruleComponentName )
            {
            // InternalDsl.g:3511:1: ( ruleComponentName )
            // InternalDsl.g:3512:2: ruleComponentName
            {
             before(grammarAccess.getComponentAccess().getComponentNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleComponentName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getComponentNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalDsl.g:3521:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3525:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalDsl.g:3526:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalDsl.g:3533:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3537:1: ( ( '{' ) )
            // InternalDsl.g:3538:1: ( '{' )
            {
            // InternalDsl.g:3538:1: ( '{' )
            // InternalDsl.g:3539:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalDsl.g:3548:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3552:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalDsl.g:3553:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalDsl.g:3560:1: rule__Component__Group__3__Impl : ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3564:1: ( ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) ) )
            // InternalDsl.g:3565:1: ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) )
            {
            // InternalDsl.g:3565:1: ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) )
            // InternalDsl.g:3566:2: ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* )
            {
            // InternalDsl.g:3566:2: ( ( rule__Component__LayerAssignment_3 ) )
            // InternalDsl.g:3567:3: ( rule__Component__LayerAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getLayerAssignment_3()); 
            // InternalDsl.g:3568:3: ( rule__Component__LayerAssignment_3 )
            // InternalDsl.g:3568:4: rule__Component__LayerAssignment_3
            {
            pushFollow(FOLLOW_38);
            rule__Component__LayerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getLayerAssignment_3()); 

            }

            // InternalDsl.g:3571:2: ( ( rule__Component__LayerAssignment_3 )* )
            // InternalDsl.g:3572:3: ( rule__Component__LayerAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getLayerAssignment_3()); 
            // InternalDsl.g:3573:3: ( rule__Component__LayerAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:3573:4: rule__Component__LayerAssignment_3
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Component__LayerAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getLayerAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalDsl.g:3582:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3586:1: ( rule__Component__Group__4__Impl )
            // InternalDsl.g:3587:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalDsl.g:3593:1: rule__Component__Group__4__Impl : ( '}' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3597:1: ( ( '}' ) )
            // InternalDsl.g:3598:1: ( '}' )
            {
            // InternalDsl.g:3598:1: ( '}' )
            // InternalDsl.g:3599:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalDsl.g:3609:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3613:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalDsl.g:3614:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // InternalDsl.g:3621:1: rule__Layer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3625:1: ( ( 'layer' ) )
            // InternalDsl.g:3626:1: ( 'layer' )
            {
            // InternalDsl.g:3626:1: ( 'layer' )
            // InternalDsl.g:3627:2: 'layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // InternalDsl.g:3636:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3640:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalDsl.g:3641:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // InternalDsl.g:3648:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3652:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // InternalDsl.g:3653:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // InternalDsl.g:3653:1: ( ( rule__Layer__NameAssignment_1 ) )
            // InternalDsl.g:3654:2: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // InternalDsl.g:3655:2: ( rule__Layer__NameAssignment_1 )
            // InternalDsl.g:3655:3: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // InternalDsl.g:3663:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3667:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalDsl.g:3668:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__Layer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // InternalDsl.g:3675:1: rule__Layer__Group__2__Impl : ( '{' ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3679:1: ( ( '{' ) )
            // InternalDsl.g:3680:1: ( '{' )
            {
            // InternalDsl.g:3680:1: ( '{' )
            // InternalDsl.g:3681:2: '{'
            {
             before(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__3"
    // InternalDsl.g:3690:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3694:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalDsl.g:3695:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Layer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3"


    // $ANTLR start "rule__Layer__Group__3__Impl"
    // InternalDsl.g:3702:1: rule__Layer__Group__3__Impl : ( ( rule__Layer__LayerSegmentsAssignment_3 )* ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3706:1: ( ( ( rule__Layer__LayerSegmentsAssignment_3 )* ) )
            // InternalDsl.g:3707:1: ( ( rule__Layer__LayerSegmentsAssignment_3 )* )
            {
            // InternalDsl.g:3707:1: ( ( rule__Layer__LayerSegmentsAssignment_3 )* )
            // InternalDsl.g:3708:2: ( rule__Layer__LayerSegmentsAssignment_3 )*
            {
             before(grammarAccess.getLayerAccess().getLayerSegmentsAssignment_3()); 
            // InternalDsl.g:3709:2: ( rule__Layer__LayerSegmentsAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==52) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:3709:3: rule__Layer__LayerSegmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Layer__LayerSegmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getLayerSegmentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3__Impl"


    // $ANTLR start "rule__Layer__Group__4"
    // InternalDsl.g:3717:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3721:1: ( rule__Layer__Group__4__Impl )
            // InternalDsl.g:3722:2: rule__Layer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4"


    // $ANTLR start "rule__Layer__Group__4__Impl"
    // InternalDsl.g:3728:1: rule__Layer__Group__4__Impl : ( '}' ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3732:1: ( ( '}' ) )
            // InternalDsl.g:3733:1: ( '}' )
            {
            // InternalDsl.g:3733:1: ( '}' )
            // InternalDsl.g:3734:2: '}'
            {
             before(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4__Impl"


    // $ANTLR start "rule__LayerSegment__Group__0"
    // InternalDsl.g:3744:1: rule__LayerSegment__Group__0 : rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1 ;
    public final void rule__LayerSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3748:1: ( rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1 )
            // InternalDsl.g:3749:2: rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__LayerSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__0"


    // $ANTLR start "rule__LayerSegment__Group__0__Impl"
    // InternalDsl.g:3756:1: rule__LayerSegment__Group__0__Impl : ( 'layerSegment' ) ;
    public final void rule__LayerSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3760:1: ( ( 'layerSegment' ) )
            // InternalDsl.g:3761:1: ( 'layerSegment' )
            {
            // InternalDsl.g:3761:1: ( 'layerSegment' )
            // InternalDsl.g:3762:2: 'layerSegment'
            {
             before(grammarAccess.getLayerSegmentAccess().getLayerSegmentKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLayerSegmentAccess().getLayerSegmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__0__Impl"


    // $ANTLR start "rule__LayerSegment__Group__1"
    // InternalDsl.g:3771:1: rule__LayerSegment__Group__1 : rule__LayerSegment__Group__1__Impl rule__LayerSegment__Group__2 ;
    public final void rule__LayerSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3775:1: ( rule__LayerSegment__Group__1__Impl rule__LayerSegment__Group__2 )
            // InternalDsl.g:3776:2: rule__LayerSegment__Group__1__Impl rule__LayerSegment__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LayerSegment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__1"


    // $ANTLR start "rule__LayerSegment__Group__1__Impl"
    // InternalDsl.g:3783:1: rule__LayerSegment__Group__1__Impl : ( ( rule__LayerSegment__NameAssignment_1 ) ) ;
    public final void rule__LayerSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3787:1: ( ( ( rule__LayerSegment__NameAssignment_1 ) ) )
            // InternalDsl.g:3788:1: ( ( rule__LayerSegment__NameAssignment_1 ) )
            {
            // InternalDsl.g:3788:1: ( ( rule__LayerSegment__NameAssignment_1 ) )
            // InternalDsl.g:3789:2: ( rule__LayerSegment__NameAssignment_1 )
            {
             before(grammarAccess.getLayerSegmentAccess().getNameAssignment_1()); 
            // InternalDsl.g:3790:2: ( rule__LayerSegment__NameAssignment_1 )
            // InternalDsl.g:3790:3: rule__LayerSegment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerSegmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__1__Impl"


    // $ANTLR start "rule__LayerSegment__Group__2"
    // InternalDsl.g:3798:1: rule__LayerSegment__Group__2 : rule__LayerSegment__Group__2__Impl rule__LayerSegment__Group__3 ;
    public final void rule__LayerSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3802:1: ( rule__LayerSegment__Group__2__Impl rule__LayerSegment__Group__3 )
            // InternalDsl.g:3803:2: rule__LayerSegment__Group__2__Impl rule__LayerSegment__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__LayerSegment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__2"


    // $ANTLR start "rule__LayerSegment__Group__2__Impl"
    // InternalDsl.g:3810:1: rule__LayerSegment__Group__2__Impl : ( '{' ) ;
    public final void rule__LayerSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3814:1: ( ( '{' ) )
            // InternalDsl.g:3815:1: ( '{' )
            {
            // InternalDsl.g:3815:1: ( '{' )
            // InternalDsl.g:3816:2: '{'
            {
             before(grammarAccess.getLayerSegmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLayerSegmentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__2__Impl"


    // $ANTLR start "rule__LayerSegment__Group__3"
    // InternalDsl.g:3825:1: rule__LayerSegment__Group__3 : rule__LayerSegment__Group__3__Impl rule__LayerSegment__Group__4 ;
    public final void rule__LayerSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3829:1: ( rule__LayerSegment__Group__3__Impl rule__LayerSegment__Group__4 )
            // InternalDsl.g:3830:2: rule__LayerSegment__Group__3__Impl rule__LayerSegment__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__LayerSegment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__3"


    // $ANTLR start "rule__LayerSegment__Group__3__Impl"
    // InternalDsl.g:3837:1: rule__LayerSegment__Group__3__Impl : ( ( rule__LayerSegment__Group_3__0 )? ) ;
    public final void rule__LayerSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3841:1: ( ( ( rule__LayerSegment__Group_3__0 )? ) )
            // InternalDsl.g:3842:1: ( ( rule__LayerSegment__Group_3__0 )? )
            {
            // InternalDsl.g:3842:1: ( ( rule__LayerSegment__Group_3__0 )? )
            // InternalDsl.g:3843:2: ( rule__LayerSegment__Group_3__0 )?
            {
             before(grammarAccess.getLayerSegmentAccess().getGroup_3()); 
            // InternalDsl.g:3844:2: ( rule__LayerSegment__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:3844:3: rule__LayerSegment__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerSegment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerSegmentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__3__Impl"


    // $ANTLR start "rule__LayerSegment__Group__4"
    // InternalDsl.g:3852:1: rule__LayerSegment__Group__4 : rule__LayerSegment__Group__4__Impl rule__LayerSegment__Group__5 ;
    public final void rule__LayerSegment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3856:1: ( rule__LayerSegment__Group__4__Impl rule__LayerSegment__Group__5 )
            // InternalDsl.g:3857:2: rule__LayerSegment__Group__4__Impl rule__LayerSegment__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__LayerSegment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__4"


    // $ANTLR start "rule__LayerSegment__Group__4__Impl"
    // InternalDsl.g:3864:1: rule__LayerSegment__Group__4__Impl : ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* ) ;
    public final void rule__LayerSegment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3868:1: ( ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* ) )
            // InternalDsl.g:3869:1: ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* )
            {
            // InternalDsl.g:3869:1: ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* )
            // InternalDsl.g:3870:2: ( rule__LayerSegment__SublayerSegmentsAssignment_4 )*
            {
             before(grammarAccess.getLayerSegmentAccess().getSublayerSegmentsAssignment_4()); 
            // InternalDsl.g:3871:2: ( rule__LayerSegment__SublayerSegmentsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDsl.g:3871:3: rule__LayerSegment__SublayerSegmentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__LayerSegment__SublayerSegmentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getLayerSegmentAccess().getSublayerSegmentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__4__Impl"


    // $ANTLR start "rule__LayerSegment__Group__5"
    // InternalDsl.g:3879:1: rule__LayerSegment__Group__5 : rule__LayerSegment__Group__5__Impl ;
    public final void rule__LayerSegment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3883:1: ( rule__LayerSegment__Group__5__Impl )
            // InternalDsl.g:3884:2: rule__LayerSegment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__5"


    // $ANTLR start "rule__LayerSegment__Group__5__Impl"
    // InternalDsl.g:3890:1: rule__LayerSegment__Group__5__Impl : ( '}' ) ;
    public final void rule__LayerSegment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3894:1: ( ( '}' ) )
            // InternalDsl.g:3895:1: ( '}' )
            {
            // InternalDsl.g:3895:1: ( '}' )
            // InternalDsl.g:3896:2: '}'
            {
             before(grammarAccess.getLayerSegmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLayerSegmentAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__5__Impl"


    // $ANTLR start "rule__LayerSegment__Group_3__0"
    // InternalDsl.g:3906:1: rule__LayerSegment__Group_3__0 : rule__LayerSegment__Group_3__0__Impl rule__LayerSegment__Group_3__1 ;
    public final void rule__LayerSegment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3910:1: ( rule__LayerSegment__Group_3__0__Impl rule__LayerSegment__Group_3__1 )
            // InternalDsl.g:3911:2: rule__LayerSegment__Group_3__0__Impl rule__LayerSegment__Group_3__1
            {
            pushFollow(FOLLOW_45);
            rule__LayerSegment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group_3__0"


    // $ANTLR start "rule__LayerSegment__Group_3__0__Impl"
    // InternalDsl.g:3918:1: rule__LayerSegment__Group_3__0__Impl : ( '{' ) ;
    public final void rule__LayerSegment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3922:1: ( ( '{' ) )
            // InternalDsl.g:3923:1: ( '{' )
            {
            // InternalDsl.g:3923:1: ( '{' )
            // InternalDsl.g:3924:2: '{'
            {
             before(grammarAccess.getLayerSegmentAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLayerSegmentAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group_3__0__Impl"


    // $ANTLR start "rule__LayerSegment__Group_3__1"
    // InternalDsl.g:3933:1: rule__LayerSegment__Group_3__1 : rule__LayerSegment__Group_3__1__Impl rule__LayerSegment__Group_3__2 ;
    public final void rule__LayerSegment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3937:1: ( rule__LayerSegment__Group_3__1__Impl rule__LayerSegment__Group_3__2 )
            // InternalDsl.g:3938:2: rule__LayerSegment__Group_3__1__Impl rule__LayerSegment__Group_3__2
            {
            pushFollow(FOLLOW_45);
            rule__LayerSegment__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group_3__1"


    // $ANTLR start "rule__LayerSegment__Group_3__1__Impl"
    // InternalDsl.g:3945:1: rule__LayerSegment__Group_3__1__Impl : ( ( rule__LayerSegment__RelationsAssignment_3_1 )* ) ;
    public final void rule__LayerSegment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3949:1: ( ( ( rule__LayerSegment__RelationsAssignment_3_1 )* ) )
            // InternalDsl.g:3950:1: ( ( rule__LayerSegment__RelationsAssignment_3_1 )* )
            {
            // InternalDsl.g:3950:1: ( ( rule__LayerSegment__RelationsAssignment_3_1 )* )
            // InternalDsl.g:3951:2: ( rule__LayerSegment__RelationsAssignment_3_1 )*
            {
             before(grammarAccess.getLayerSegmentAccess().getRelationsAssignment_3_1()); 
            // InternalDsl.g:3952:2: ( rule__LayerSegment__RelationsAssignment_3_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==53) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:3952:3: rule__LayerSegment__RelationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__LayerSegment__RelationsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getLayerSegmentAccess().getRelationsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group_3__1__Impl"


    // $ANTLR start "rule__LayerSegment__Group_3__2"
    // InternalDsl.g:3960:1: rule__LayerSegment__Group_3__2 : rule__LayerSegment__Group_3__2__Impl ;
    public final void rule__LayerSegment__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3964:1: ( rule__LayerSegment__Group_3__2__Impl )
            // InternalDsl.g:3965:2: rule__LayerSegment__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group_3__2"


    // $ANTLR start "rule__LayerSegment__Group_3__2__Impl"
    // InternalDsl.g:3971:1: rule__LayerSegment__Group_3__2__Impl : ( '}' ) ;
    public final void rule__LayerSegment__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3975:1: ( ( '}' ) )
            // InternalDsl.g:3976:1: ( '}' )
            {
            // InternalDsl.g:3976:1: ( '}' )
            // InternalDsl.g:3977:2: '}'
            {
             before(grammarAccess.getLayerSegmentAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLayerSegmentAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group_3__2__Impl"


    // $ANTLR start "rule__LayerSegmentRelation__Group__0"
    // InternalDsl.g:3987:1: rule__LayerSegmentRelation__Group__0 : rule__LayerSegmentRelation__Group__0__Impl rule__LayerSegmentRelation__Group__1 ;
    public final void rule__LayerSegmentRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3991:1: ( rule__LayerSegmentRelation__Group__0__Impl rule__LayerSegmentRelation__Group__1 )
            // InternalDsl.g:3992:2: rule__LayerSegmentRelation__Group__0__Impl rule__LayerSegmentRelation__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__LayerSegmentRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerSegmentRelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegmentRelation__Group__0"


    // $ANTLR start "rule__LayerSegmentRelation__Group__0__Impl"
    // InternalDsl.g:3999:1: rule__LayerSegmentRelation__Group__0__Impl : ( 'allowedToUse:' ) ;
    public final void rule__LayerSegmentRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4003:1: ( ( 'allowedToUse:' ) )
            // InternalDsl.g:4004:1: ( 'allowedToUse:' )
            {
            // InternalDsl.g:4004:1: ( 'allowedToUse:' )
            // InternalDsl.g:4005:2: 'allowedToUse:'
            {
             before(grammarAccess.getLayerSegmentRelationAccess().getAllowedToUseKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLayerSegmentRelationAccess().getAllowedToUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegmentRelation__Group__0__Impl"


    // $ANTLR start "rule__LayerSegmentRelation__Group__1"
    // InternalDsl.g:4014:1: rule__LayerSegmentRelation__Group__1 : rule__LayerSegmentRelation__Group__1__Impl ;
    public final void rule__LayerSegmentRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4018:1: ( rule__LayerSegmentRelation__Group__1__Impl )
            // InternalDsl.g:4019:2: rule__LayerSegmentRelation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegmentRelation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegmentRelation__Group__1"


    // $ANTLR start "rule__LayerSegmentRelation__Group__1__Impl"
    // InternalDsl.g:4025:1: rule__LayerSegmentRelation__Group__1__Impl : ( ruleLayerSegmentName ) ;
    public final void rule__LayerSegmentRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4029:1: ( ( ruleLayerSegmentName ) )
            // InternalDsl.g:4030:1: ( ruleLayerSegmentName )
            {
            // InternalDsl.g:4030:1: ( ruleLayerSegmentName )
            // InternalDsl.g:4031:2: ruleLayerSegmentName
            {
             before(grammarAccess.getLayerSegmentRelationAccess().getLayerSegmentNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleLayerSegmentName();

            state._fsp--;

             after(grammarAccess.getLayerSegmentRelationAccess().getLayerSegmentNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegmentRelation__Group__1__Impl"


    // $ANTLR start "rule__SublayerSegment__Group__0"
    // InternalDsl.g:4041:1: rule__SublayerSegment__Group__0 : rule__SublayerSegment__Group__0__Impl rule__SublayerSegment__Group__1 ;
    public final void rule__SublayerSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4045:1: ( rule__SublayerSegment__Group__0__Impl rule__SublayerSegment__Group__1 )
            // InternalDsl.g:4046:2: rule__SublayerSegment__Group__0__Impl rule__SublayerSegment__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__SublayerSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SublayerSegment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SublayerSegment__Group__0"


    // $ANTLR start "rule__SublayerSegment__Group__0__Impl"
    // InternalDsl.g:4053:1: rule__SublayerSegment__Group__0__Impl : ( 'sublayerSegment' ) ;
    public final void rule__SublayerSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4057:1: ( ( 'sublayerSegment' ) )
            // InternalDsl.g:4058:1: ( 'sublayerSegment' )
            {
            // InternalDsl.g:4058:1: ( 'sublayerSegment' )
            // InternalDsl.g:4059:2: 'sublayerSegment'
            {
             before(grammarAccess.getSublayerSegmentAccess().getSublayerSegmentKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSublayerSegmentAccess().getSublayerSegmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SublayerSegment__Group__0__Impl"


    // $ANTLR start "rule__SublayerSegment__Group__1"
    // InternalDsl.g:4068:1: rule__SublayerSegment__Group__1 : rule__SublayerSegment__Group__1__Impl ;
    public final void rule__SublayerSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4072:1: ( rule__SublayerSegment__Group__1__Impl )
            // InternalDsl.g:4073:2: rule__SublayerSegment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SublayerSegment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SublayerSegment__Group__1"


    // $ANTLR start "rule__SublayerSegment__Group__1__Impl"
    // InternalDsl.g:4079:1: rule__SublayerSegment__Group__1__Impl : ( ( rule__SublayerSegment__NameAssignment_1 ) ) ;
    public final void rule__SublayerSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4083:1: ( ( ( rule__SublayerSegment__NameAssignment_1 ) ) )
            // InternalDsl.g:4084:1: ( ( rule__SublayerSegment__NameAssignment_1 ) )
            {
            // InternalDsl.g:4084:1: ( ( rule__SublayerSegment__NameAssignment_1 ) )
            // InternalDsl.g:4085:2: ( rule__SublayerSegment__NameAssignment_1 )
            {
             before(grammarAccess.getSublayerSegmentAccess().getNameAssignment_1()); 
            // InternalDsl.g:4086:2: ( rule__SublayerSegment__NameAssignment_1 )
            // InternalDsl.g:4086:3: rule__SublayerSegment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SublayerSegment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSublayerSegmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SublayerSegment__Group__1__Impl"


    // $ANTLR start "rule__RelationArch__Group__0"
    // InternalDsl.g:4095:1: rule__RelationArch__Group__0 : rule__RelationArch__Group__0__Impl rule__RelationArch__Group__1 ;
    public final void rule__RelationArch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4099:1: ( rule__RelationArch__Group__0__Impl rule__RelationArch__Group__1 )
            // InternalDsl.g:4100:2: rule__RelationArch__Group__0__Impl rule__RelationArch__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RelationArch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__0"


    // $ANTLR start "rule__RelationArch__Group__0__Impl"
    // InternalDsl.g:4107:1: rule__RelationArch__Group__0__Impl : ( 'relationArch' ) ;
    public final void rule__RelationArch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4111:1: ( ( 'relationArch' ) )
            // InternalDsl.g:4112:1: ( 'relationArch' )
            {
            // InternalDsl.g:4112:1: ( 'relationArch' )
            // InternalDsl.g:4113:2: 'relationArch'
            {
             before(grammarAccess.getRelationArchAccess().getRelationArchKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRelationArchAccess().getRelationArchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__0__Impl"


    // $ANTLR start "rule__RelationArch__Group__1"
    // InternalDsl.g:4122:1: rule__RelationArch__Group__1 : rule__RelationArch__Group__1__Impl rule__RelationArch__Group__2 ;
    public final void rule__RelationArch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4126:1: ( rule__RelationArch__Group__1__Impl rule__RelationArch__Group__2 )
            // InternalDsl.g:4127:2: rule__RelationArch__Group__1__Impl rule__RelationArch__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RelationArch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__1"


    // $ANTLR start "rule__RelationArch__Group__1__Impl"
    // InternalDsl.g:4134:1: rule__RelationArch__Group__1__Impl : ( ( rule__RelationArch__NameAssignment_1 ) ) ;
    public final void rule__RelationArch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4138:1: ( ( ( rule__RelationArch__NameAssignment_1 ) ) )
            // InternalDsl.g:4139:1: ( ( rule__RelationArch__NameAssignment_1 ) )
            {
            // InternalDsl.g:4139:1: ( ( rule__RelationArch__NameAssignment_1 ) )
            // InternalDsl.g:4140:2: ( rule__RelationArch__NameAssignment_1 )
            {
             before(grammarAccess.getRelationArchAccess().getNameAssignment_1()); 
            // InternalDsl.g:4141:2: ( rule__RelationArch__NameAssignment_1 )
            // InternalDsl.g:4141:3: rule__RelationArch__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationArch__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationArchAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__1__Impl"


    // $ANTLR start "rule__RelationArch__Group__2"
    // InternalDsl.g:4149:1: rule__RelationArch__Group__2 : rule__RelationArch__Group__2__Impl rule__RelationArch__Group__3 ;
    public final void rule__RelationArch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4153:1: ( rule__RelationArch__Group__2__Impl rule__RelationArch__Group__3 )
            // InternalDsl.g:4154:2: rule__RelationArch__Group__2__Impl rule__RelationArch__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__RelationArch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__2"


    // $ANTLR start "rule__RelationArch__Group__2__Impl"
    // InternalDsl.g:4161:1: rule__RelationArch__Group__2__Impl : ( '{' ) ;
    public final void rule__RelationArch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4165:1: ( ( '{' ) )
            // InternalDsl.g:4166:1: ( '{' )
            {
            // InternalDsl.g:4166:1: ( '{' )
            // InternalDsl.g:4167:2: '{'
            {
             before(grammarAccess.getRelationArchAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRelationArchAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__2__Impl"


    // $ANTLR start "rule__RelationArch__Group__3"
    // InternalDsl.g:4176:1: rule__RelationArch__Group__3 : rule__RelationArch__Group__3__Impl rule__RelationArch__Group__4 ;
    public final void rule__RelationArch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4180:1: ( rule__RelationArch__Group__3__Impl rule__RelationArch__Group__4 )
            // InternalDsl.g:4181:2: rule__RelationArch__Group__3__Impl rule__RelationArch__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__RelationArch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__3"


    // $ANTLR start "rule__RelationArch__Group__3__Impl"
    // InternalDsl.g:4188:1: rule__RelationArch__Group__3__Impl : ( 'source:' ) ;
    public final void rule__RelationArch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4192:1: ( ( 'source:' ) )
            // InternalDsl.g:4193:1: ( 'source:' )
            {
            // InternalDsl.g:4193:1: ( 'source:' )
            // InternalDsl.g:4194:2: 'source:'
            {
             before(grammarAccess.getRelationArchAccess().getSourceKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRelationArchAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__3__Impl"


    // $ANTLR start "rule__RelationArch__Group__4"
    // InternalDsl.g:4203:1: rule__RelationArch__Group__4 : rule__RelationArch__Group__4__Impl rule__RelationArch__Group__5 ;
    public final void rule__RelationArch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4207:1: ( rule__RelationArch__Group__4__Impl rule__RelationArch__Group__5 )
            // InternalDsl.g:4208:2: rule__RelationArch__Group__4__Impl rule__RelationArch__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__RelationArch__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__4"


    // $ANTLR start "rule__RelationArch__Group__4__Impl"
    // InternalDsl.g:4215:1: rule__RelationArch__Group__4__Impl : ( ruleLayerName ) ;
    public final void rule__RelationArch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4219:1: ( ( ruleLayerName ) )
            // InternalDsl.g:4220:1: ( ruleLayerName )
            {
            // InternalDsl.g:4220:1: ( ruleLayerName )
            // InternalDsl.g:4221:2: ruleLayerName
            {
             before(grammarAccess.getRelationArchAccess().getLayerNameParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleLayerName();

            state._fsp--;

             after(grammarAccess.getRelationArchAccess().getLayerNameParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__4__Impl"


    // $ANTLR start "rule__RelationArch__Group__5"
    // InternalDsl.g:4230:1: rule__RelationArch__Group__5 : rule__RelationArch__Group__5__Impl rule__RelationArch__Group__6 ;
    public final void rule__RelationArch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4234:1: ( rule__RelationArch__Group__5__Impl rule__RelationArch__Group__6 )
            // InternalDsl.g:4235:2: rule__RelationArch__Group__5__Impl rule__RelationArch__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__RelationArch__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__5"


    // $ANTLR start "rule__RelationArch__Group__5__Impl"
    // InternalDsl.g:4242:1: rule__RelationArch__Group__5__Impl : ( ',' ) ;
    public final void rule__RelationArch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4246:1: ( ( ',' ) )
            // InternalDsl.g:4247:1: ( ',' )
            {
            // InternalDsl.g:4247:1: ( ',' )
            // InternalDsl.g:4248:2: ','
            {
             before(grammarAccess.getRelationArchAccess().getCommaKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRelationArchAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__5__Impl"


    // $ANTLR start "rule__RelationArch__Group__6"
    // InternalDsl.g:4257:1: rule__RelationArch__Group__6 : rule__RelationArch__Group__6__Impl rule__RelationArch__Group__7 ;
    public final void rule__RelationArch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4261:1: ( rule__RelationArch__Group__6__Impl rule__RelationArch__Group__7 )
            // InternalDsl.g:4262:2: rule__RelationArch__Group__6__Impl rule__RelationArch__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__RelationArch__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__6"


    // $ANTLR start "rule__RelationArch__Group__6__Impl"
    // InternalDsl.g:4269:1: rule__RelationArch__Group__6__Impl : ( 'target:' ) ;
    public final void rule__RelationArch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4273:1: ( ( 'target:' ) )
            // InternalDsl.g:4274:1: ( 'target:' )
            {
            // InternalDsl.g:4274:1: ( 'target:' )
            // InternalDsl.g:4275:2: 'target:'
            {
             before(grammarAccess.getRelationArchAccess().getTargetKeyword_6()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRelationArchAccess().getTargetKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__6__Impl"


    // $ANTLR start "rule__RelationArch__Group__7"
    // InternalDsl.g:4284:1: rule__RelationArch__Group__7 : rule__RelationArch__Group__7__Impl rule__RelationArch__Group__8 ;
    public final void rule__RelationArch__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4288:1: ( rule__RelationArch__Group__7__Impl rule__RelationArch__Group__8 )
            // InternalDsl.g:4289:2: rule__RelationArch__Group__7__Impl rule__RelationArch__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__RelationArch__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__7"


    // $ANTLR start "rule__RelationArch__Group__7__Impl"
    // InternalDsl.g:4296:1: rule__RelationArch__Group__7__Impl : ( ruleLayerName ) ;
    public final void rule__RelationArch__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4300:1: ( ( ruleLayerName ) )
            // InternalDsl.g:4301:1: ( ruleLayerName )
            {
            // InternalDsl.g:4301:1: ( ruleLayerName )
            // InternalDsl.g:4302:2: ruleLayerName
            {
             before(grammarAccess.getRelationArchAccess().getLayerNameParserRuleCall_7()); 
            pushFollow(FOLLOW_2);
            ruleLayerName();

            state._fsp--;

             after(grammarAccess.getRelationArchAccess().getLayerNameParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__7__Impl"


    // $ANTLR start "rule__RelationArch__Group__8"
    // InternalDsl.g:4311:1: rule__RelationArch__Group__8 : rule__RelationArch__Group__8__Impl ;
    public final void rule__RelationArch__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4315:1: ( rule__RelationArch__Group__8__Impl )
            // InternalDsl.g:4316:2: rule__RelationArch__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationArch__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__8"


    // $ANTLR start "rule__RelationArch__Group__8__Impl"
    // InternalDsl.g:4322:1: rule__RelationArch__Group__8__Impl : ( '}' ) ;
    public final void rule__RelationArch__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4326:1: ( ( '}' ) )
            // InternalDsl.g:4327:1: ( '}' )
            {
            // InternalDsl.g:4327:1: ( '}' )
            // InternalDsl.g:4328:2: '}'
            {
             before(grammarAccess.getRelationArchAccess().getRightCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRelationArchAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__Group__8__Impl"


    // $ANTLR start "rule__Technology__Group__0"
    // InternalDsl.g:4338:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4342:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalDsl.g:4343:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Technology__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__0"


    // $ANTLR start "rule__Technology__Group__0__Impl"
    // InternalDsl.g:4350:1: rule__Technology__Group__0__Impl : ( 'tech' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4354:1: ( ( 'tech' ) )
            // InternalDsl.g:4355:1: ( 'tech' )
            {
            // InternalDsl.g:4355:1: ( 'tech' )
            // InternalDsl.g:4356:2: 'tech'
            {
             before(grammarAccess.getTechnologyAccess().getTechKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getTechKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__0__Impl"


    // $ANTLR start "rule__Technology__Group__1"
    // InternalDsl.g:4365:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4369:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalDsl.g:4370:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__Technology__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__1"


    // $ANTLR start "rule__Technology__Group__1__Impl"
    // InternalDsl.g:4377:1: rule__Technology__Group__1__Impl : ( '{' ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4381:1: ( ( '{' ) )
            // InternalDsl.g:4382:1: ( '{' )
            {
            // InternalDsl.g:4382:1: ( '{' )
            // InternalDsl.g:4383:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__1__Impl"


    // $ANTLR start "rule__Technology__Group__2"
    // InternalDsl.g:4392:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4396:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalDsl.g:4397:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__Technology__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__2"


    // $ANTLR start "rule__Technology__Group__2__Impl"
    // InternalDsl.g:4404:1: rule__Technology__Group__2__Impl : ( ( rule__Technology__JavaAssignment_2 ) ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4408:1: ( ( ( rule__Technology__JavaAssignment_2 ) ) )
            // InternalDsl.g:4409:1: ( ( rule__Technology__JavaAssignment_2 ) )
            {
            // InternalDsl.g:4409:1: ( ( rule__Technology__JavaAssignment_2 ) )
            // InternalDsl.g:4410:2: ( rule__Technology__JavaAssignment_2 )
            {
             before(grammarAccess.getTechnologyAccess().getJavaAssignment_2()); 
            // InternalDsl.g:4411:2: ( rule__Technology__JavaAssignment_2 )
            // InternalDsl.g:4411:3: rule__Technology__JavaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Technology__JavaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getJavaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__2__Impl"


    // $ANTLR start "rule__Technology__Group__3"
    // InternalDsl.g:4419:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl rule__Technology__Group__4 ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4423:1: ( rule__Technology__Group__3__Impl rule__Technology__Group__4 )
            // InternalDsl.g:4424:2: rule__Technology__Group__3__Impl rule__Technology__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Technology__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__3"


    // $ANTLR start "rule__Technology__Group__3__Impl"
    // InternalDsl.g:4431:1: rule__Technology__Group__3__Impl : ( ( rule__Technology__ReactAssignment_3 ) ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4435:1: ( ( ( rule__Technology__ReactAssignment_3 ) ) )
            // InternalDsl.g:4436:1: ( ( rule__Technology__ReactAssignment_3 ) )
            {
            // InternalDsl.g:4436:1: ( ( rule__Technology__ReactAssignment_3 ) )
            // InternalDsl.g:4437:2: ( rule__Technology__ReactAssignment_3 )
            {
             before(grammarAccess.getTechnologyAccess().getReactAssignment_3()); 
            // InternalDsl.g:4438:2: ( rule__Technology__ReactAssignment_3 )
            // InternalDsl.g:4438:3: rule__Technology__ReactAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Technology__ReactAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getReactAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__3__Impl"


    // $ANTLR start "rule__Technology__Group__4"
    // InternalDsl.g:4446:1: rule__Technology__Group__4 : rule__Technology__Group__4__Impl ;
    public final void rule__Technology__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4450:1: ( rule__Technology__Group__4__Impl )
            // InternalDsl.g:4451:2: rule__Technology__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__4"


    // $ANTLR start "rule__Technology__Group__4__Impl"
    // InternalDsl.g:4457:1: rule__Technology__Group__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4461:1: ( ( '}' ) )
            // InternalDsl.g:4462:1: ( '}' )
            {
            // InternalDsl.g:4462:1: ( '}' )
            // InternalDsl.g:4463:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__4__Impl"


    // $ANTLR start "rule__JavaApp__Group__0"
    // InternalDsl.g:4473:1: rule__JavaApp__Group__0 : rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1 ;
    public final void rule__JavaApp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4477:1: ( rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1 )
            // InternalDsl.g:4478:2: rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JavaApp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaApp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaApp__Group__0"


    // $ANTLR start "rule__JavaApp__Group__0__Impl"
    // InternalDsl.g:4485:1: rule__JavaApp__Group__0__Impl : ( 'javaApp' ) ;
    public final void rule__JavaApp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4489:1: ( ( 'javaApp' ) )
            // InternalDsl.g:4490:1: ( 'javaApp' )
            {
            // InternalDsl.g:4490:1: ( 'javaApp' )
            // InternalDsl.g:4491:2: 'javaApp'
            {
             before(grammarAccess.getJavaAppAccess().getJavaAppKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getJavaAppAccess().getJavaAppKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaApp__Group__0__Impl"


    // $ANTLR start "rule__JavaApp__Group__1"
    // InternalDsl.g:4500:1: rule__JavaApp__Group__1 : rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2 ;
    public final void rule__JavaApp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4504:1: ( rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2 )
            // InternalDsl.g:4505:2: rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__JavaApp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaApp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaApp__Group__1"


    // $ANTLR start "rule__JavaApp__Group__1__Impl"
    // InternalDsl.g:4512:1: rule__JavaApp__Group__1__Impl : ( '{' ) ;
    public final void rule__JavaApp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4516:1: ( ( '{' ) )
            // InternalDsl.g:4517:1: ( '{' )
            {
            // InternalDsl.g:4517:1: ( '{' )
            // InternalDsl.g:4518:2: '{'
            {
             before(grammarAccess.getJavaAppAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJavaAppAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaApp__Group__1__Impl"


    // $ANTLR start "rule__JavaApp__Group__2"
    // InternalDsl.g:4527:1: rule__JavaApp__Group__2 : rule__JavaApp__Group__2__Impl ;
    public final void rule__JavaApp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4531:1: ( rule__JavaApp__Group__2__Impl )
            // InternalDsl.g:4532:2: rule__JavaApp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JavaApp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaApp__Group__2"


    // $ANTLR start "rule__JavaApp__Group__2__Impl"
    // InternalDsl.g:4538:1: rule__JavaApp__Group__2__Impl : ( '}' ) ;
    public final void rule__JavaApp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4542:1: ( ( '}' ) )
            // InternalDsl.g:4543:1: ( '}' )
            {
            // InternalDsl.g:4543:1: ( '}' )
            // InternalDsl.g:4544:2: '}'
            {
             before(grammarAccess.getJavaAppAccess().getRightCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getJavaAppAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaApp__Group__2__Impl"


    // $ANTLR start "rule__ReactApp__Group__0"
    // InternalDsl.g:4554:1: rule__ReactApp__Group__0 : rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1 ;
    public final void rule__ReactApp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4558:1: ( rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1 )
            // InternalDsl.g:4559:2: rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ReactApp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactApp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__0"


    // $ANTLR start "rule__ReactApp__Group__0__Impl"
    // InternalDsl.g:4566:1: rule__ReactApp__Group__0__Impl : ( 'reactApp' ) ;
    public final void rule__ReactApp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4570:1: ( ( 'reactApp' ) )
            // InternalDsl.g:4571:1: ( 'reactApp' )
            {
            // InternalDsl.g:4571:1: ( 'reactApp' )
            // InternalDsl.g:4572:2: 'reactApp'
            {
             before(grammarAccess.getReactAppAccess().getReactAppKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getReactAppKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__0__Impl"


    // $ANTLR start "rule__ReactApp__Group__1"
    // InternalDsl.g:4581:1: rule__ReactApp__Group__1 : rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2 ;
    public final void rule__ReactApp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4585:1: ( rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2 )
            // InternalDsl.g:4586:2: rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2
            {
            pushFollow(FOLLOW_51);
            rule__ReactApp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactApp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__1"


    // $ANTLR start "rule__ReactApp__Group__1__Impl"
    // InternalDsl.g:4593:1: rule__ReactApp__Group__1__Impl : ( '{' ) ;
    public final void rule__ReactApp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4597:1: ( ( '{' ) )
            // InternalDsl.g:4598:1: ( '{' )
            {
            // InternalDsl.g:4598:1: ( '{' )
            // InternalDsl.g:4599:2: '{'
            {
             before(grammarAccess.getReactAppAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__1__Impl"


    // $ANTLR start "rule__ReactApp__Group__2"
    // InternalDsl.g:4608:1: rule__ReactApp__Group__2 : rule__ReactApp__Group__2__Impl rule__ReactApp__Group__3 ;
    public final void rule__ReactApp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4612:1: ( rule__ReactApp__Group__2__Impl rule__ReactApp__Group__3 )
            // InternalDsl.g:4613:2: rule__ReactApp__Group__2__Impl rule__ReactApp__Group__3
            {
            pushFollow(FOLLOW_52);
            rule__ReactApp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactApp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__2"


    // $ANTLR start "rule__ReactApp__Group__2__Impl"
    // InternalDsl.g:4620:1: rule__ReactApp__Group__2__Impl : ( ( ( rule__ReactApp__ElementsAssignment_2 ) ) ( ( rule__ReactApp__ElementsAssignment_2 )* ) ) ;
    public final void rule__ReactApp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4624:1: ( ( ( ( rule__ReactApp__ElementsAssignment_2 ) ) ( ( rule__ReactApp__ElementsAssignment_2 )* ) ) )
            // InternalDsl.g:4625:1: ( ( ( rule__ReactApp__ElementsAssignment_2 ) ) ( ( rule__ReactApp__ElementsAssignment_2 )* ) )
            {
            // InternalDsl.g:4625:1: ( ( ( rule__ReactApp__ElementsAssignment_2 ) ) ( ( rule__ReactApp__ElementsAssignment_2 )* ) )
            // InternalDsl.g:4626:2: ( ( rule__ReactApp__ElementsAssignment_2 ) ) ( ( rule__ReactApp__ElementsAssignment_2 )* )
            {
            // InternalDsl.g:4626:2: ( ( rule__ReactApp__ElementsAssignment_2 ) )
            // InternalDsl.g:4627:3: ( rule__ReactApp__ElementsAssignment_2 )
            {
             before(grammarAccess.getReactAppAccess().getElementsAssignment_2()); 
            // InternalDsl.g:4628:3: ( rule__ReactApp__ElementsAssignment_2 )
            // InternalDsl.g:4628:4: rule__ReactApp__ElementsAssignment_2
            {
            pushFollow(FOLLOW_53);
            rule__ReactApp__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReactAppAccess().getElementsAssignment_2()); 

            }

            // InternalDsl.g:4631:2: ( ( rule__ReactApp__ElementsAssignment_2 )* )
            // InternalDsl.g:4632:3: ( rule__ReactApp__ElementsAssignment_2 )*
            {
             before(grammarAccess.getReactAppAccess().getElementsAssignment_2()); 
            // InternalDsl.g:4633:3: ( rule__ReactApp__ElementsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35||LA27_0==42||LA27_0==59||LA27_0==63||LA27_0==70||LA27_0==73||(LA27_0>=76 && LA27_0<=77)||LA27_0==79||(LA27_0>=83 && LA27_0<=87)||LA27_0==90||(LA27_0>=93 && LA27_0<=95)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:4633:4: rule__ReactApp__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__ReactApp__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getReactAppAccess().getElementsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__2__Impl"


    // $ANTLR start "rule__ReactApp__Group__3"
    // InternalDsl.g:4642:1: rule__ReactApp__Group__3 : rule__ReactApp__Group__3__Impl rule__ReactApp__Group__4 ;
    public final void rule__ReactApp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4646:1: ( rule__ReactApp__Group__3__Impl rule__ReactApp__Group__4 )
            // InternalDsl.g:4647:2: rule__ReactApp__Group__3__Impl rule__ReactApp__Group__4
            {
            pushFollow(FOLLOW_54);
            rule__ReactApp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactApp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__3"


    // $ANTLR start "rule__ReactApp__Group__3__Impl"
    // InternalDsl.g:4654:1: rule__ReactApp__Group__3__Impl : ( ( ( rule__ReactApp__Group_3__0 ) ) ( ( rule__ReactApp__Group_3__0 )* ) ) ;
    public final void rule__ReactApp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4658:1: ( ( ( ( rule__ReactApp__Group_3__0 ) ) ( ( rule__ReactApp__Group_3__0 )* ) ) )
            // InternalDsl.g:4659:1: ( ( ( rule__ReactApp__Group_3__0 ) ) ( ( rule__ReactApp__Group_3__0 )* ) )
            {
            // InternalDsl.g:4659:1: ( ( ( rule__ReactApp__Group_3__0 ) ) ( ( rule__ReactApp__Group_3__0 )* ) )
            // InternalDsl.g:4660:2: ( ( rule__ReactApp__Group_3__0 ) ) ( ( rule__ReactApp__Group_3__0 )* )
            {
            // InternalDsl.g:4660:2: ( ( rule__ReactApp__Group_3__0 ) )
            // InternalDsl.g:4661:3: ( rule__ReactApp__Group_3__0 )
            {
             before(grammarAccess.getReactAppAccess().getGroup_3()); 
            // InternalDsl.g:4662:3: ( rule__ReactApp__Group_3__0 )
            // InternalDsl.g:4662:4: rule__ReactApp__Group_3__0
            {
            pushFollow(FOLLOW_55);
            rule__ReactApp__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getReactAppAccess().getGroup_3()); 

            }

            // InternalDsl.g:4665:2: ( ( rule__ReactApp__Group_3__0 )* )
            // InternalDsl.g:4666:3: ( rule__ReactApp__Group_3__0 )*
            {
             before(grammarAccess.getReactAppAccess().getGroup_3()); 
            // InternalDsl.g:4667:3: ( rule__ReactApp__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==60) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDsl.g:4667:4: rule__ReactApp__Group_3__0
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__ReactApp__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getReactAppAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__3__Impl"


    // $ANTLR start "rule__ReactApp__Group__4"
    // InternalDsl.g:4676:1: rule__ReactApp__Group__4 : rule__ReactApp__Group__4__Impl rule__ReactApp__Group__5 ;
    public final void rule__ReactApp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4680:1: ( rule__ReactApp__Group__4__Impl rule__ReactApp__Group__5 )
            // InternalDsl.g:4681:2: rule__ReactApp__Group__4__Impl rule__ReactApp__Group__5
            {
            pushFollow(FOLLOW_56);
            rule__ReactApp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactApp__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__4"


    // $ANTLR start "rule__ReactApp__Group__4__Impl"
    // InternalDsl.g:4688:1: rule__ReactApp__Group__4__Impl : ( ( ( rule__ReactApp__Group_4__0 ) ) ( ( rule__ReactApp__Group_4__0 )* ) ) ;
    public final void rule__ReactApp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4692:1: ( ( ( ( rule__ReactApp__Group_4__0 ) ) ( ( rule__ReactApp__Group_4__0 )* ) ) )
            // InternalDsl.g:4693:1: ( ( ( rule__ReactApp__Group_4__0 ) ) ( ( rule__ReactApp__Group_4__0 )* ) )
            {
            // InternalDsl.g:4693:1: ( ( ( rule__ReactApp__Group_4__0 ) ) ( ( rule__ReactApp__Group_4__0 )* ) )
            // InternalDsl.g:4694:2: ( ( rule__ReactApp__Group_4__0 ) ) ( ( rule__ReactApp__Group_4__0 )* )
            {
            // InternalDsl.g:4694:2: ( ( rule__ReactApp__Group_4__0 ) )
            // InternalDsl.g:4695:3: ( rule__ReactApp__Group_4__0 )
            {
             before(grammarAccess.getReactAppAccess().getGroup_4()); 
            // InternalDsl.g:4696:3: ( rule__ReactApp__Group_4__0 )
            // InternalDsl.g:4696:4: rule__ReactApp__Group_4__0
            {
            pushFollow(FOLLOW_57);
            rule__ReactApp__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getReactAppAccess().getGroup_4()); 

            }

            // InternalDsl.g:4699:2: ( ( rule__ReactApp__Group_4__0 )* )
            // InternalDsl.g:4700:3: ( rule__ReactApp__Group_4__0 )*
            {
             before(grammarAccess.getReactAppAccess().getGroup_4()); 
            // InternalDsl.g:4701:3: ( rule__ReactApp__Group_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==61) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDsl.g:4701:4: rule__ReactApp__Group_4__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__ReactApp__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getReactAppAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__4__Impl"


    // $ANTLR start "rule__ReactApp__Group__5"
    // InternalDsl.g:4710:1: rule__ReactApp__Group__5 : rule__ReactApp__Group__5__Impl rule__ReactApp__Group__6 ;
    public final void rule__ReactApp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4714:1: ( rule__ReactApp__Group__5__Impl rule__ReactApp__Group__6 )
            // InternalDsl.g:4715:2: rule__ReactApp__Group__5__Impl rule__ReactApp__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ReactApp__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactApp__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__5"


    // $ANTLR start "rule__ReactApp__Group__5__Impl"
    // InternalDsl.g:4722:1: rule__ReactApp__Group__5__Impl : ( ( ( rule__ReactApp__Group_5__0 ) ) ( ( rule__ReactApp__Group_5__0 )* ) ) ;
    public final void rule__ReactApp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4726:1: ( ( ( ( rule__ReactApp__Group_5__0 ) ) ( ( rule__ReactApp__Group_5__0 )* ) ) )
            // InternalDsl.g:4727:1: ( ( ( rule__ReactApp__Group_5__0 ) ) ( ( rule__ReactApp__Group_5__0 )* ) )
            {
            // InternalDsl.g:4727:1: ( ( ( rule__ReactApp__Group_5__0 ) ) ( ( rule__ReactApp__Group_5__0 )* ) )
            // InternalDsl.g:4728:2: ( ( rule__ReactApp__Group_5__0 ) ) ( ( rule__ReactApp__Group_5__0 )* )
            {
            // InternalDsl.g:4728:2: ( ( rule__ReactApp__Group_5__0 ) )
            // InternalDsl.g:4729:3: ( rule__ReactApp__Group_5__0 )
            {
             before(grammarAccess.getReactAppAccess().getGroup_5()); 
            // InternalDsl.g:4730:3: ( rule__ReactApp__Group_5__0 )
            // InternalDsl.g:4730:4: rule__ReactApp__Group_5__0
            {
            pushFollow(FOLLOW_58);
            rule__ReactApp__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getReactAppAccess().getGroup_5()); 

            }

            // InternalDsl.g:4733:2: ( ( rule__ReactApp__Group_5__0 )* )
            // InternalDsl.g:4734:3: ( rule__ReactApp__Group_5__0 )*
            {
             before(grammarAccess.getReactAppAccess().getGroup_5()); 
            // InternalDsl.g:4735:3: ( rule__ReactApp__Group_5__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==62) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDsl.g:4735:4: rule__ReactApp__Group_5__0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__ReactApp__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getReactAppAccess().getGroup_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__5__Impl"


    // $ANTLR start "rule__ReactApp__Group__6"
    // InternalDsl.g:4744:1: rule__ReactApp__Group__6 : rule__ReactApp__Group__6__Impl ;
    public final void rule__ReactApp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4748:1: ( rule__ReactApp__Group__6__Impl )
            // InternalDsl.g:4749:2: rule__ReactApp__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactApp__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__6"


    // $ANTLR start "rule__ReactApp__Group__6__Impl"
    // InternalDsl.g:4755:1: rule__ReactApp__Group__6__Impl : ( '}' ) ;
    public final void rule__ReactApp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4759:1: ( ( '}' ) )
            // InternalDsl.g:4760:1: ( '}' )
            {
            // InternalDsl.g:4760:1: ( '}' )
            // InternalDsl.g:4761:2: '}'
            {
             before(grammarAccess.getReactAppAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group__6__Impl"


    // $ANTLR start "rule__ReactApp__Group_3__0"
    // InternalDsl.g:4771:1: rule__ReactApp__Group_3__0 : rule__ReactApp__Group_3__0__Impl rule__ReactApp__Group_3__1 ;
    public final void rule__ReactApp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4775:1: ( rule__ReactApp__Group_3__0__Impl rule__ReactApp__Group_3__1 )
            // InternalDsl.g:4776:2: rule__ReactApp__Group_3__0__Impl rule__ReactApp__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ReactApp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactApp__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_3__0"


    // $ANTLR start "rule__ReactApp__Group_3__0__Impl"
    // InternalDsl.g:4783:1: rule__ReactApp__Group_3__0__Impl : ( 'performs:' ) ;
    public final void rule__ReactApp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4787:1: ( ( 'performs:' ) )
            // InternalDsl.g:4788:1: ( 'performs:' )
            {
            // InternalDsl.g:4788:1: ( 'performs:' )
            // InternalDsl.g:4789:2: 'performs:'
            {
             before(grammarAccess.getReactAppAccess().getPerformsKeyword_3_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getPerformsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_3__0__Impl"


    // $ANTLR start "rule__ReactApp__Group_3__1"
    // InternalDsl.g:4798:1: rule__ReactApp__Group_3__1 : rule__ReactApp__Group_3__1__Impl ;
    public final void rule__ReactApp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4802:1: ( rule__ReactApp__Group_3__1__Impl )
            // InternalDsl.g:4803:2: rule__ReactApp__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactApp__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_3__1"


    // $ANTLR start "rule__ReactApp__Group_3__1__Impl"
    // InternalDsl.g:4809:1: rule__ReactApp__Group_3__1__Impl : ( ( rule__ReactApp__FuncAssignment_3_1 ) ) ;
    public final void rule__ReactApp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4813:1: ( ( ( rule__ReactApp__FuncAssignment_3_1 ) ) )
            // InternalDsl.g:4814:1: ( ( rule__ReactApp__FuncAssignment_3_1 ) )
            {
            // InternalDsl.g:4814:1: ( ( rule__ReactApp__FuncAssignment_3_1 ) )
            // InternalDsl.g:4815:2: ( rule__ReactApp__FuncAssignment_3_1 )
            {
             before(grammarAccess.getReactAppAccess().getFuncAssignment_3_1()); 
            // InternalDsl.g:4816:2: ( rule__ReactApp__FuncAssignment_3_1 )
            // InternalDsl.g:4816:3: rule__ReactApp__FuncAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactApp__FuncAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReactAppAccess().getFuncAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_3__1__Impl"


    // $ANTLR start "rule__ReactApp__Group_4__0"
    // InternalDsl.g:4825:1: rule__ReactApp__Group_4__0 : rule__ReactApp__Group_4__0__Impl rule__ReactApp__Group_4__1 ;
    public final void rule__ReactApp__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4829:1: ( rule__ReactApp__Group_4__0__Impl rule__ReactApp__Group_4__1 )
            // InternalDsl.g:4830:2: rule__ReactApp__Group_4__0__Impl rule__ReactApp__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__ReactApp__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactApp__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_4__0"


    // $ANTLR start "rule__ReactApp__Group_4__0__Impl"
    // InternalDsl.g:4837:1: rule__ReactApp__Group_4__0__Impl : ( 'holds:' ) ;
    public final void rule__ReactApp__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4841:1: ( ( 'holds:' ) )
            // InternalDsl.g:4842:1: ( 'holds:' )
            {
            // InternalDsl.g:4842:1: ( 'holds:' )
            // InternalDsl.g:4843:2: 'holds:'
            {
             before(grammarAccess.getReactAppAccess().getHoldsKeyword_4_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getHoldsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_4__0__Impl"


    // $ANTLR start "rule__ReactApp__Group_4__1"
    // InternalDsl.g:4852:1: rule__ReactApp__Group_4__1 : rule__ReactApp__Group_4__1__Impl ;
    public final void rule__ReactApp__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4856:1: ( rule__ReactApp__Group_4__1__Impl )
            // InternalDsl.g:4857:2: rule__ReactApp__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactApp__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_4__1"


    // $ANTLR start "rule__ReactApp__Group_4__1__Impl"
    // InternalDsl.g:4863:1: rule__ReactApp__Group_4__1__Impl : ( ( rule__ReactApp__DirAssignment_4_1 ) ) ;
    public final void rule__ReactApp__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4867:1: ( ( ( rule__ReactApp__DirAssignment_4_1 ) ) )
            // InternalDsl.g:4868:1: ( ( rule__ReactApp__DirAssignment_4_1 ) )
            {
            // InternalDsl.g:4868:1: ( ( rule__ReactApp__DirAssignment_4_1 ) )
            // InternalDsl.g:4869:2: ( rule__ReactApp__DirAssignment_4_1 )
            {
             before(grammarAccess.getReactAppAccess().getDirAssignment_4_1()); 
            // InternalDsl.g:4870:2: ( rule__ReactApp__DirAssignment_4_1 )
            // InternalDsl.g:4870:3: rule__ReactApp__DirAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactApp__DirAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReactAppAccess().getDirAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_4__1__Impl"


    // $ANTLR start "rule__ReactApp__Group_5__0"
    // InternalDsl.g:4879:1: rule__ReactApp__Group_5__0 : rule__ReactApp__Group_5__0__Impl rule__ReactApp__Group_5__1 ;
    public final void rule__ReactApp__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4883:1: ( rule__ReactApp__Group_5__0__Impl rule__ReactApp__Group_5__1 )
            // InternalDsl.g:4884:2: rule__ReactApp__Group_5__0__Impl rule__ReactApp__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__ReactApp__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactApp__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_5__0"


    // $ANTLR start "rule__ReactApp__Group_5__0__Impl"
    // InternalDsl.g:4891:1: rule__ReactApp__Group_5__0__Impl : ( 'use:' ) ;
    public final void rule__ReactApp__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4895:1: ( ( 'use:' ) )
            // InternalDsl.g:4896:1: ( 'use:' )
            {
            // InternalDsl.g:4896:1: ( 'use:' )
            // InternalDsl.g:4897:2: 'use:'
            {
             before(grammarAccess.getReactAppAccess().getUseKeyword_5_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getUseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_5__0__Impl"


    // $ANTLR start "rule__ReactApp__Group_5__1"
    // InternalDsl.g:4906:1: rule__ReactApp__Group_5__1 : rule__ReactApp__Group_5__1__Impl ;
    public final void rule__ReactApp__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4910:1: ( rule__ReactApp__Group_5__1__Impl )
            // InternalDsl.g:4911:2: rule__ReactApp__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactApp__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_5__1"


    // $ANTLR start "rule__ReactApp__Group_5__1__Impl"
    // InternalDsl.g:4917:1: rule__ReactApp__Group_5__1__Impl : ( ( rule__ReactApp__ModAssignment_5_1 ) ) ;
    public final void rule__ReactApp__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4921:1: ( ( ( rule__ReactApp__ModAssignment_5_1 ) ) )
            // InternalDsl.g:4922:1: ( ( rule__ReactApp__ModAssignment_5_1 ) )
            {
            // InternalDsl.g:4922:1: ( ( rule__ReactApp__ModAssignment_5_1 ) )
            // InternalDsl.g:4923:2: ( rule__ReactApp__ModAssignment_5_1 )
            {
             before(grammarAccess.getReactAppAccess().getModAssignment_5_1()); 
            // InternalDsl.g:4924:2: ( rule__ReactApp__ModAssignment_5_1 )
            // InternalDsl.g:4924:3: rule__ReactApp__ModAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactApp__ModAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReactAppAccess().getModAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__Group_5__1__Impl"


    // $ANTLR start "rule__Functionality__Group__0"
    // InternalDsl.g:4933:1: rule__Functionality__Group__0 : rule__Functionality__Group__0__Impl rule__Functionality__Group__1 ;
    public final void rule__Functionality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4937:1: ( rule__Functionality__Group__0__Impl rule__Functionality__Group__1 )
            // InternalDsl.g:4938:2: rule__Functionality__Group__0__Impl rule__Functionality__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Functionality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__0"


    // $ANTLR start "rule__Functionality__Group__0__Impl"
    // InternalDsl.g:4945:1: rule__Functionality__Group__0__Impl : ( 'functionality' ) ;
    public final void rule__Functionality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4949:1: ( ( 'functionality' ) )
            // InternalDsl.g:4950:1: ( 'functionality' )
            {
            // InternalDsl.g:4950:1: ( 'functionality' )
            // InternalDsl.g:4951:2: 'functionality'
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalityKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getFunctionalityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__0__Impl"


    // $ANTLR start "rule__Functionality__Group__1"
    // InternalDsl.g:4960:1: rule__Functionality__Group__1 : rule__Functionality__Group__1__Impl rule__Functionality__Group__2 ;
    public final void rule__Functionality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4964:1: ( rule__Functionality__Group__1__Impl rule__Functionality__Group__2 )
            // InternalDsl.g:4965:2: rule__Functionality__Group__1__Impl rule__Functionality__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Functionality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__1"


    // $ANTLR start "rule__Functionality__Group__1__Impl"
    // InternalDsl.g:4972:1: rule__Functionality__Group__1__Impl : ( ( rule__Functionality__NameAssignment_1 ) ) ;
    public final void rule__Functionality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4976:1: ( ( ( rule__Functionality__NameAssignment_1 ) ) )
            // InternalDsl.g:4977:1: ( ( rule__Functionality__NameAssignment_1 ) )
            {
            // InternalDsl.g:4977:1: ( ( rule__Functionality__NameAssignment_1 ) )
            // InternalDsl.g:4978:2: ( rule__Functionality__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionalityAccess().getNameAssignment_1()); 
            // InternalDsl.g:4979:2: ( rule__Functionality__NameAssignment_1 )
            // InternalDsl.g:4979:3: rule__Functionality__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__1__Impl"


    // $ANTLR start "rule__Functionality__Group__2"
    // InternalDsl.g:4987:1: rule__Functionality__Group__2 : rule__Functionality__Group__2__Impl rule__Functionality__Group__3 ;
    public final void rule__Functionality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4991:1: ( rule__Functionality__Group__2__Impl rule__Functionality__Group__3 )
            // InternalDsl.g:4992:2: rule__Functionality__Group__2__Impl rule__Functionality__Group__3
            {
            pushFollow(FOLLOW_59);
            rule__Functionality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__2"


    // $ANTLR start "rule__Functionality__Group__2__Impl"
    // InternalDsl.g:4999:1: rule__Functionality__Group__2__Impl : ( '{' ) ;
    public final void rule__Functionality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5003:1: ( ( '{' ) )
            // InternalDsl.g:5004:1: ( '{' )
            {
            // InternalDsl.g:5004:1: ( '{' )
            // InternalDsl.g:5005:2: '{'
            {
             before(grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__2__Impl"


    // $ANTLR start "rule__Functionality__Group__3"
    // InternalDsl.g:5014:1: rule__Functionality__Group__3 : rule__Functionality__Group__3__Impl rule__Functionality__Group__4 ;
    public final void rule__Functionality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5018:1: ( rule__Functionality__Group__3__Impl rule__Functionality__Group__4 )
            // InternalDsl.g:5019:2: rule__Functionality__Group__3__Impl rule__Functionality__Group__4
            {
            pushFollow(FOLLOW_59);
            rule__Functionality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__3"


    // $ANTLR start "rule__Functionality__Group__3__Impl"
    // InternalDsl.g:5026:1: rule__Functionality__Group__3__Impl : ( ( rule__Functionality__Group_3__0 )* ) ;
    public final void rule__Functionality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5030:1: ( ( ( rule__Functionality__Group_3__0 )* ) )
            // InternalDsl.g:5031:1: ( ( rule__Functionality__Group_3__0 )* )
            {
            // InternalDsl.g:5031:1: ( ( rule__Functionality__Group_3__0 )* )
            // InternalDsl.g:5032:2: ( rule__Functionality__Group_3__0 )*
            {
             before(grammarAccess.getFunctionalityAccess().getGroup_3()); 
            // InternalDsl.g:5033:2: ( rule__Functionality__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==65) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDsl.g:5033:3: rule__Functionality__Group_3__0
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__Functionality__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getFunctionalityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__3__Impl"


    // $ANTLR start "rule__Functionality__Group__4"
    // InternalDsl.g:5041:1: rule__Functionality__Group__4 : rule__Functionality__Group__4__Impl rule__Functionality__Group__5 ;
    public final void rule__Functionality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5045:1: ( rule__Functionality__Group__4__Impl rule__Functionality__Group__5 )
            // InternalDsl.g:5046:2: rule__Functionality__Group__4__Impl rule__Functionality__Group__5
            {
            pushFollow(FOLLOW_59);
            rule__Functionality__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__4"


    // $ANTLR start "rule__Functionality__Group__4__Impl"
    // InternalDsl.g:5053:1: rule__Functionality__Group__4__Impl : ( ( rule__Functionality__Group_4__0 )* ) ;
    public final void rule__Functionality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5057:1: ( ( ( rule__Functionality__Group_4__0 )* ) )
            // InternalDsl.g:5058:1: ( ( rule__Functionality__Group_4__0 )* )
            {
            // InternalDsl.g:5058:1: ( ( rule__Functionality__Group_4__0 )* )
            // InternalDsl.g:5059:2: ( rule__Functionality__Group_4__0 )*
            {
             before(grammarAccess.getFunctionalityAccess().getGroup_4()); 
            // InternalDsl.g:5060:2: ( rule__Functionality__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==66) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDsl.g:5060:3: rule__Functionality__Group_4__0
            	    {
            	    pushFollow(FOLLOW_61);
            	    rule__Functionality__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getFunctionalityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__4__Impl"


    // $ANTLR start "rule__Functionality__Group__5"
    // InternalDsl.g:5068:1: rule__Functionality__Group__5 : rule__Functionality__Group__5__Impl rule__Functionality__Group__6 ;
    public final void rule__Functionality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5072:1: ( rule__Functionality__Group__5__Impl rule__Functionality__Group__6 )
            // InternalDsl.g:5073:2: rule__Functionality__Group__5__Impl rule__Functionality__Group__6
            {
            pushFollow(FOLLOW_62);
            rule__Functionality__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__5"


    // $ANTLR start "rule__Functionality__Group__5__Impl"
    // InternalDsl.g:5080:1: rule__Functionality__Group__5__Impl : ( ( ( rule__Functionality__Group_5__0 ) ) ( ( rule__Functionality__Group_5__0 )* ) ) ;
    public final void rule__Functionality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5084:1: ( ( ( ( rule__Functionality__Group_5__0 ) ) ( ( rule__Functionality__Group_5__0 )* ) ) )
            // InternalDsl.g:5085:1: ( ( ( rule__Functionality__Group_5__0 ) ) ( ( rule__Functionality__Group_5__0 )* ) )
            {
            // InternalDsl.g:5085:1: ( ( ( rule__Functionality__Group_5__0 ) ) ( ( rule__Functionality__Group_5__0 )* ) )
            // InternalDsl.g:5086:2: ( ( rule__Functionality__Group_5__0 ) ) ( ( rule__Functionality__Group_5__0 )* )
            {
            // InternalDsl.g:5086:2: ( ( rule__Functionality__Group_5__0 ) )
            // InternalDsl.g:5087:3: ( rule__Functionality__Group_5__0 )
            {
             before(grammarAccess.getFunctionalityAccess().getGroup_5()); 
            // InternalDsl.g:5088:3: ( rule__Functionality__Group_5__0 )
            // InternalDsl.g:5088:4: rule__Functionality__Group_5__0
            {
            pushFollow(FOLLOW_63);
            rule__Functionality__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getGroup_5()); 

            }

            // InternalDsl.g:5091:2: ( ( rule__Functionality__Group_5__0 )* )
            // InternalDsl.g:5092:3: ( rule__Functionality__Group_5__0 )*
            {
             before(grammarAccess.getFunctionalityAccess().getGroup_5()); 
            // InternalDsl.g:5093:3: ( rule__Functionality__Group_5__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==67) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDsl.g:5093:4: rule__Functionality__Group_5__0
            	    {
            	    pushFollow(FOLLOW_63);
            	    rule__Functionality__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getFunctionalityAccess().getGroup_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__5__Impl"


    // $ANTLR start "rule__Functionality__Group__6"
    // InternalDsl.g:5102:1: rule__Functionality__Group__6 : rule__Functionality__Group__6__Impl rule__Functionality__Group__7 ;
    public final void rule__Functionality__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5106:1: ( rule__Functionality__Group__6__Impl rule__Functionality__Group__7 )
            // InternalDsl.g:5107:2: rule__Functionality__Group__6__Impl rule__Functionality__Group__7
            {
            pushFollow(FOLLOW_62);
            rule__Functionality__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__6"


    // $ANTLR start "rule__Functionality__Group__6__Impl"
    // InternalDsl.g:5114:1: rule__Functionality__Group__6__Impl : ( ( rule__Functionality__Group_6__0 )* ) ;
    public final void rule__Functionality__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5118:1: ( ( ( rule__Functionality__Group_6__0 )* ) )
            // InternalDsl.g:5119:1: ( ( rule__Functionality__Group_6__0 )* )
            {
            // InternalDsl.g:5119:1: ( ( rule__Functionality__Group_6__0 )* )
            // InternalDsl.g:5120:2: ( rule__Functionality__Group_6__0 )*
            {
             before(grammarAccess.getFunctionalityAccess().getGroup_6()); 
            // InternalDsl.g:5121:2: ( rule__Functionality__Group_6__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==68) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDsl.g:5121:3: rule__Functionality__Group_6__0
            	    {
            	    pushFollow(FOLLOW_64);
            	    rule__Functionality__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getFunctionalityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__6__Impl"


    // $ANTLR start "rule__Functionality__Group__7"
    // InternalDsl.g:5129:1: rule__Functionality__Group__7 : rule__Functionality__Group__7__Impl rule__Functionality__Group__8 ;
    public final void rule__Functionality__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5133:1: ( rule__Functionality__Group__7__Impl rule__Functionality__Group__8 )
            // InternalDsl.g:5134:2: rule__Functionality__Group__7__Impl rule__Functionality__Group__8
            {
            pushFollow(FOLLOW_62);
            rule__Functionality__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__7"


    // $ANTLR start "rule__Functionality__Group__7__Impl"
    // InternalDsl.g:5141:1: rule__Functionality__Group__7__Impl : ( ( rule__Functionality__Group_7__0 )* ) ;
    public final void rule__Functionality__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5145:1: ( ( ( rule__Functionality__Group_7__0 )* ) )
            // InternalDsl.g:5146:1: ( ( rule__Functionality__Group_7__0 )* )
            {
            // InternalDsl.g:5146:1: ( ( rule__Functionality__Group_7__0 )* )
            // InternalDsl.g:5147:2: ( rule__Functionality__Group_7__0 )*
            {
             before(grammarAccess.getFunctionalityAccess().getGroup_7()); 
            // InternalDsl.g:5148:2: ( rule__Functionality__Group_7__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==69) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDsl.g:5148:3: rule__Functionality__Group_7__0
            	    {
            	    pushFollow(FOLLOW_65);
            	    rule__Functionality__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getFunctionalityAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__7__Impl"


    // $ANTLR start "rule__Functionality__Group__8"
    // InternalDsl.g:5156:1: rule__Functionality__Group__8 : rule__Functionality__Group__8__Impl rule__Functionality__Group__9 ;
    public final void rule__Functionality__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5160:1: ( rule__Functionality__Group__8__Impl rule__Functionality__Group__9 )
            // InternalDsl.g:5161:2: rule__Functionality__Group__8__Impl rule__Functionality__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Functionality__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__8"


    // $ANTLR start "rule__Functionality__Group__8__Impl"
    // InternalDsl.g:5168:1: rule__Functionality__Group__8__Impl : ( 'organizedBy:' ) ;
    public final void rule__Functionality__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5172:1: ( ( 'organizedBy:' ) )
            // InternalDsl.g:5173:1: ( 'organizedBy:' )
            {
            // InternalDsl.g:5173:1: ( 'organizedBy:' )
            // InternalDsl.g:5174:2: 'organizedBy:'
            {
             before(grammarAccess.getFunctionalityAccess().getOrganizedByKeyword_8()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getOrganizedByKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__8__Impl"


    // $ANTLR start "rule__Functionality__Group__9"
    // InternalDsl.g:5183:1: rule__Functionality__Group__9 : rule__Functionality__Group__9__Impl rule__Functionality__Group__10 ;
    public final void rule__Functionality__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5187:1: ( rule__Functionality__Group__9__Impl rule__Functionality__Group__10 )
            // InternalDsl.g:5188:2: rule__Functionality__Group__9__Impl rule__Functionality__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Functionality__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__9"


    // $ANTLR start "rule__Functionality__Group__9__Impl"
    // InternalDsl.g:5195:1: rule__Functionality__Group__9__Impl : ( ( rule__Functionality__TypeAssignment_9 ) ) ;
    public final void rule__Functionality__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5199:1: ( ( ( rule__Functionality__TypeAssignment_9 ) ) )
            // InternalDsl.g:5200:1: ( ( rule__Functionality__TypeAssignment_9 ) )
            {
            // InternalDsl.g:5200:1: ( ( rule__Functionality__TypeAssignment_9 ) )
            // InternalDsl.g:5201:2: ( rule__Functionality__TypeAssignment_9 )
            {
             before(grammarAccess.getFunctionalityAccess().getTypeAssignment_9()); 
            // InternalDsl.g:5202:2: ( rule__Functionality__TypeAssignment_9 )
            // InternalDsl.g:5202:3: rule__Functionality__TypeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__TypeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getTypeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__9__Impl"


    // $ANTLR start "rule__Functionality__Group__10"
    // InternalDsl.g:5210:1: rule__Functionality__Group__10 : rule__Functionality__Group__10__Impl ;
    public final void rule__Functionality__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5214:1: ( rule__Functionality__Group__10__Impl )
            // InternalDsl.g:5215:2: rule__Functionality__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__10"


    // $ANTLR start "rule__Functionality__Group__10__Impl"
    // InternalDsl.g:5221:1: rule__Functionality__Group__10__Impl : ( '}' ) ;
    public final void rule__Functionality__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5225:1: ( ( '}' ) )
            // InternalDsl.g:5226:1: ( '}' )
            {
            // InternalDsl.g:5226:1: ( '}' )
            // InternalDsl.g:5227:2: '}'
            {
             before(grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__10__Impl"


    // $ANTLR start "rule__Functionality__Group_3__0"
    // InternalDsl.g:5237:1: rule__Functionality__Group_3__0 : rule__Functionality__Group_3__0__Impl rule__Functionality__Group_3__1 ;
    public final void rule__Functionality__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5241:1: ( rule__Functionality__Group_3__0__Impl rule__Functionality__Group_3__1 )
            // InternalDsl.g:5242:2: rule__Functionality__Group_3__0__Impl rule__Functionality__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Functionality__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_3__0"


    // $ANTLR start "rule__Functionality__Group_3__0__Impl"
    // InternalDsl.g:5249:1: rule__Functionality__Group_3__0__Impl : ( 'uses:' ) ;
    public final void rule__Functionality__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5253:1: ( ( 'uses:' ) )
            // InternalDsl.g:5254:1: ( 'uses:' )
            {
            // InternalDsl.g:5254:1: ( 'uses:' )
            // InternalDsl.g:5255:2: 'uses:'
            {
             before(grammarAccess.getFunctionalityAccess().getUsesKeyword_3_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getUsesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_3__0__Impl"


    // $ANTLR start "rule__Functionality__Group_3__1"
    // InternalDsl.g:5264:1: rule__Functionality__Group_3__1 : rule__Functionality__Group_3__1__Impl ;
    public final void rule__Functionality__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5268:1: ( rule__Functionality__Group_3__1__Impl )
            // InternalDsl.g:5269:2: rule__Functionality__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_3__1"


    // $ANTLR start "rule__Functionality__Group_3__1__Impl"
    // InternalDsl.g:5275:1: rule__Functionality__Group_3__1__Impl : ( ( rule__Functionality__RouteAssignment_3_1 ) ) ;
    public final void rule__Functionality__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5279:1: ( ( ( rule__Functionality__RouteAssignment_3_1 ) ) )
            // InternalDsl.g:5280:1: ( ( rule__Functionality__RouteAssignment_3_1 ) )
            {
            // InternalDsl.g:5280:1: ( ( rule__Functionality__RouteAssignment_3_1 ) )
            // InternalDsl.g:5281:2: ( rule__Functionality__RouteAssignment_3_1 )
            {
             before(grammarAccess.getFunctionalityAccess().getRouteAssignment_3_1()); 
            // InternalDsl.g:5282:2: ( rule__Functionality__RouteAssignment_3_1 )
            // InternalDsl.g:5282:3: rule__Functionality__RouteAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__RouteAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getRouteAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_3__1__Impl"


    // $ANTLR start "rule__Functionality__Group_4__0"
    // InternalDsl.g:5291:1: rule__Functionality__Group_4__0 : rule__Functionality__Group_4__0__Impl rule__Functionality__Group_4__1 ;
    public final void rule__Functionality__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5295:1: ( rule__Functionality__Group_4__0__Impl rule__Functionality__Group_4__1 )
            // InternalDsl.g:5296:2: rule__Functionality__Group_4__0__Impl rule__Functionality__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Functionality__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_4__0"


    // $ANTLR start "rule__Functionality__Group_4__0__Impl"
    // InternalDsl.g:5303:1: rule__Functionality__Group_4__0__Impl : ( 'wraps:' ) ;
    public final void rule__Functionality__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5307:1: ( ( 'wraps:' ) )
            // InternalDsl.g:5308:1: ( 'wraps:' )
            {
            // InternalDsl.g:5308:1: ( 'wraps:' )
            // InternalDsl.g:5309:2: 'wraps:'
            {
             before(grammarAccess.getFunctionalityAccess().getWrapsKeyword_4_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getWrapsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_4__0__Impl"


    // $ANTLR start "rule__Functionality__Group_4__1"
    // InternalDsl.g:5318:1: rule__Functionality__Group_4__1 : rule__Functionality__Group_4__1__Impl ;
    public final void rule__Functionality__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5322:1: ( rule__Functionality__Group_4__1__Impl )
            // InternalDsl.g:5323:2: rule__Functionality__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_4__1"


    // $ANTLR start "rule__Functionality__Group_4__1__Impl"
    // InternalDsl.g:5329:1: rule__Functionality__Group_4__1__Impl : ( ( rule__Functionality__WrapAssignment_4_1 ) ) ;
    public final void rule__Functionality__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5333:1: ( ( ( rule__Functionality__WrapAssignment_4_1 ) ) )
            // InternalDsl.g:5334:1: ( ( rule__Functionality__WrapAssignment_4_1 ) )
            {
            // InternalDsl.g:5334:1: ( ( rule__Functionality__WrapAssignment_4_1 ) )
            // InternalDsl.g:5335:2: ( rule__Functionality__WrapAssignment_4_1 )
            {
             before(grammarAccess.getFunctionalityAccess().getWrapAssignment_4_1()); 
            // InternalDsl.g:5336:2: ( rule__Functionality__WrapAssignment_4_1 )
            // InternalDsl.g:5336:3: rule__Functionality__WrapAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__WrapAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getWrapAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_4__1__Impl"


    // $ANTLR start "rule__Functionality__Group_5__0"
    // InternalDsl.g:5345:1: rule__Functionality__Group_5__0 : rule__Functionality__Group_5__0__Impl rule__Functionality__Group_5__1 ;
    public final void rule__Functionality__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5349:1: ( rule__Functionality__Group_5__0__Impl rule__Functionality__Group_5__1 )
            // InternalDsl.g:5350:2: rule__Functionality__Group_5__0__Impl rule__Functionality__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Functionality__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_5__0"


    // $ANTLR start "rule__Functionality__Group_5__0__Impl"
    // InternalDsl.g:5357:1: rule__Functionality__Group_5__0__Impl : ( 'render:' ) ;
    public final void rule__Functionality__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5361:1: ( ( 'render:' ) )
            // InternalDsl.g:5362:1: ( 'render:' )
            {
            // InternalDsl.g:5362:1: ( 'render:' )
            // InternalDsl.g:5363:2: 'render:'
            {
             before(grammarAccess.getFunctionalityAccess().getRenderKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getRenderKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_5__0__Impl"


    // $ANTLR start "rule__Functionality__Group_5__1"
    // InternalDsl.g:5372:1: rule__Functionality__Group_5__1 : rule__Functionality__Group_5__1__Impl ;
    public final void rule__Functionality__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5376:1: ( rule__Functionality__Group_5__1__Impl )
            // InternalDsl.g:5377:2: rule__Functionality__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_5__1"


    // $ANTLR start "rule__Functionality__Group_5__1__Impl"
    // InternalDsl.g:5383:1: rule__Functionality__Group_5__1__Impl : ( ( rule__Functionality__RenderAssignment_5_1 ) ) ;
    public final void rule__Functionality__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5387:1: ( ( ( rule__Functionality__RenderAssignment_5_1 ) ) )
            // InternalDsl.g:5388:1: ( ( rule__Functionality__RenderAssignment_5_1 ) )
            {
            // InternalDsl.g:5388:1: ( ( rule__Functionality__RenderAssignment_5_1 ) )
            // InternalDsl.g:5389:2: ( rule__Functionality__RenderAssignment_5_1 )
            {
             before(grammarAccess.getFunctionalityAccess().getRenderAssignment_5_1()); 
            // InternalDsl.g:5390:2: ( rule__Functionality__RenderAssignment_5_1 )
            // InternalDsl.g:5390:3: rule__Functionality__RenderAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__RenderAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getRenderAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_5__1__Impl"


    // $ANTLR start "rule__Functionality__Group_6__0"
    // InternalDsl.g:5399:1: rule__Functionality__Group_6__0 : rule__Functionality__Group_6__0__Impl rule__Functionality__Group_6__1 ;
    public final void rule__Functionality__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5403:1: ( rule__Functionality__Group_6__0__Impl rule__Functionality__Group_6__1 )
            // InternalDsl.g:5404:2: rule__Functionality__Group_6__0__Impl rule__Functionality__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Functionality__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_6__0"


    // $ANTLR start "rule__Functionality__Group_6__0__Impl"
    // InternalDsl.g:5411:1: rule__Functionality__Group_6__0__Impl : ( 'state:' ) ;
    public final void rule__Functionality__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5415:1: ( ( 'state:' ) )
            // InternalDsl.g:5416:1: ( 'state:' )
            {
            // InternalDsl.g:5416:1: ( 'state:' )
            // InternalDsl.g:5417:2: 'state:'
            {
             before(grammarAccess.getFunctionalityAccess().getStateKeyword_6_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getStateKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_6__0__Impl"


    // $ANTLR start "rule__Functionality__Group_6__1"
    // InternalDsl.g:5426:1: rule__Functionality__Group_6__1 : rule__Functionality__Group_6__1__Impl ;
    public final void rule__Functionality__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5430:1: ( rule__Functionality__Group_6__1__Impl )
            // InternalDsl.g:5431:2: rule__Functionality__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_6__1"


    // $ANTLR start "rule__Functionality__Group_6__1__Impl"
    // InternalDsl.g:5437:1: rule__Functionality__Group_6__1__Impl : ( ( rule__Functionality__StateAssignment_6_1 ) ) ;
    public final void rule__Functionality__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5441:1: ( ( ( rule__Functionality__StateAssignment_6_1 ) ) )
            // InternalDsl.g:5442:1: ( ( rule__Functionality__StateAssignment_6_1 ) )
            {
            // InternalDsl.g:5442:1: ( ( rule__Functionality__StateAssignment_6_1 ) )
            // InternalDsl.g:5443:2: ( rule__Functionality__StateAssignment_6_1 )
            {
             before(grammarAccess.getFunctionalityAccess().getStateAssignment_6_1()); 
            // InternalDsl.g:5444:2: ( rule__Functionality__StateAssignment_6_1 )
            // InternalDsl.g:5444:3: rule__Functionality__StateAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__StateAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getStateAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_6__1__Impl"


    // $ANTLR start "rule__Functionality__Group_7__0"
    // InternalDsl.g:5453:1: rule__Functionality__Group_7__0 : rule__Functionality__Group_7__0__Impl rule__Functionality__Group_7__1 ;
    public final void rule__Functionality__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5457:1: ( rule__Functionality__Group_7__0__Impl rule__Functionality__Group_7__1 )
            // InternalDsl.g:5458:2: rule__Functionality__Group_7__0__Impl rule__Functionality__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Functionality__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_7__0"


    // $ANTLR start "rule__Functionality__Group_7__0__Impl"
    // InternalDsl.g:5465:1: rule__Functionality__Group_7__0__Impl : ( 'calls:' ) ;
    public final void rule__Functionality__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5469:1: ( ( 'calls:' ) )
            // InternalDsl.g:5470:1: ( 'calls:' )
            {
            // InternalDsl.g:5470:1: ( 'calls:' )
            // InternalDsl.g:5471:2: 'calls:'
            {
             before(grammarAccess.getFunctionalityAccess().getCallsKeyword_7_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getCallsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_7__0__Impl"


    // $ANTLR start "rule__Functionality__Group_7__1"
    // InternalDsl.g:5480:1: rule__Functionality__Group_7__1 : rule__Functionality__Group_7__1__Impl ;
    public final void rule__Functionality__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5484:1: ( rule__Functionality__Group_7__1__Impl )
            // InternalDsl.g:5485:2: rule__Functionality__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_7__1"


    // $ANTLR start "rule__Functionality__Group_7__1__Impl"
    // InternalDsl.g:5491:1: rule__Functionality__Group_7__1__Impl : ( ( rule__Functionality__ServiceAssignment_7_1 ) ) ;
    public final void rule__Functionality__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5495:1: ( ( ( rule__Functionality__ServiceAssignment_7_1 ) ) )
            // InternalDsl.g:5496:1: ( ( rule__Functionality__ServiceAssignment_7_1 ) )
            {
            // InternalDsl.g:5496:1: ( ( rule__Functionality__ServiceAssignment_7_1 ) )
            // InternalDsl.g:5497:2: ( rule__Functionality__ServiceAssignment_7_1 )
            {
             before(grammarAccess.getFunctionalityAccess().getServiceAssignment_7_1()); 
            // InternalDsl.g:5498:2: ( rule__Functionality__ServiceAssignment_7_1 )
            // InternalDsl.g:5498:3: rule__Functionality__ServiceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__ServiceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getServiceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group_7__1__Impl"


    // $ANTLR start "rule__RouterComponent__Group__0"
    // InternalDsl.g:5507:1: rule__RouterComponent__Group__0 : rule__RouterComponent__Group__0__Impl rule__RouterComponent__Group__1 ;
    public final void rule__RouterComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5511:1: ( rule__RouterComponent__Group__0__Impl rule__RouterComponent__Group__1 )
            // InternalDsl.g:5512:2: rule__RouterComponent__Group__0__Impl rule__RouterComponent__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RouterComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__0"


    // $ANTLR start "rule__RouterComponent__Group__0__Impl"
    // InternalDsl.g:5519:1: rule__RouterComponent__Group__0__Impl : ( 'router' ) ;
    public final void rule__RouterComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5523:1: ( ( 'router' ) )
            // InternalDsl.g:5524:1: ( 'router' )
            {
            // InternalDsl.g:5524:1: ( 'router' )
            // InternalDsl.g:5525:2: 'router'
            {
             before(grammarAccess.getRouterComponentAccess().getRouterKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getRouterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__0__Impl"


    // $ANTLR start "rule__RouterComponent__Group__1"
    // InternalDsl.g:5534:1: rule__RouterComponent__Group__1 : rule__RouterComponent__Group__1__Impl rule__RouterComponent__Group__2 ;
    public final void rule__RouterComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5538:1: ( rule__RouterComponent__Group__1__Impl rule__RouterComponent__Group__2 )
            // InternalDsl.g:5539:2: rule__RouterComponent__Group__1__Impl rule__RouterComponent__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RouterComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__1"


    // $ANTLR start "rule__RouterComponent__Group__1__Impl"
    // InternalDsl.g:5546:1: rule__RouterComponent__Group__1__Impl : ( ( rule__RouterComponent__NameAssignment_1 ) ) ;
    public final void rule__RouterComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5550:1: ( ( ( rule__RouterComponent__NameAssignment_1 ) ) )
            // InternalDsl.g:5551:1: ( ( rule__RouterComponent__NameAssignment_1 ) )
            {
            // InternalDsl.g:5551:1: ( ( rule__RouterComponent__NameAssignment_1 ) )
            // InternalDsl.g:5552:2: ( rule__RouterComponent__NameAssignment_1 )
            {
             before(grammarAccess.getRouterComponentAccess().getNameAssignment_1()); 
            // InternalDsl.g:5553:2: ( rule__RouterComponent__NameAssignment_1 )
            // InternalDsl.g:5553:3: rule__RouterComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RouterComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRouterComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__1__Impl"


    // $ANTLR start "rule__RouterComponent__Group__2"
    // InternalDsl.g:5561:1: rule__RouterComponent__Group__2 : rule__RouterComponent__Group__2__Impl rule__RouterComponent__Group__3 ;
    public final void rule__RouterComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5565:1: ( rule__RouterComponent__Group__2__Impl rule__RouterComponent__Group__3 )
            // InternalDsl.g:5566:2: rule__RouterComponent__Group__2__Impl rule__RouterComponent__Group__3
            {
            pushFollow(FOLLOW_66);
            rule__RouterComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__2"


    // $ANTLR start "rule__RouterComponent__Group__2__Impl"
    // InternalDsl.g:5573:1: rule__RouterComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__RouterComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5577:1: ( ( '{' ) )
            // InternalDsl.g:5578:1: ( '{' )
            {
            // InternalDsl.g:5578:1: ( '{' )
            // InternalDsl.g:5579:2: '{'
            {
             before(grammarAccess.getRouterComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__2__Impl"


    // $ANTLR start "rule__RouterComponent__Group__3"
    // InternalDsl.g:5588:1: rule__RouterComponent__Group__3 : rule__RouterComponent__Group__3__Impl rule__RouterComponent__Group__4 ;
    public final void rule__RouterComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5592:1: ( rule__RouterComponent__Group__3__Impl rule__RouterComponent__Group__4 )
            // InternalDsl.g:5593:2: rule__RouterComponent__Group__3__Impl rule__RouterComponent__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RouterComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__3"


    // $ANTLR start "rule__RouterComponent__Group__3__Impl"
    // InternalDsl.g:5600:1: rule__RouterComponent__Group__3__Impl : ( 'inWithin:' ) ;
    public final void rule__RouterComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5604:1: ( ( 'inWithin:' ) )
            // InternalDsl.g:5605:1: ( 'inWithin:' )
            {
            // InternalDsl.g:5605:1: ( 'inWithin:' )
            // InternalDsl.g:5606:2: 'inWithin:'
            {
             before(grammarAccess.getRouterComponentAccess().getInWithinKeyword_3()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getInWithinKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__3__Impl"


    // $ANTLR start "rule__RouterComponent__Group__4"
    // InternalDsl.g:5615:1: rule__RouterComponent__Group__4 : rule__RouterComponent__Group__4__Impl rule__RouterComponent__Group__5 ;
    public final void rule__RouterComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5619:1: ( rule__RouterComponent__Group__4__Impl rule__RouterComponent__Group__5 )
            // InternalDsl.g:5620:2: rule__RouterComponent__Group__4__Impl rule__RouterComponent__Group__5
            {
            pushFollow(FOLLOW_56);
            rule__RouterComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__4"


    // $ANTLR start "rule__RouterComponent__Group__4__Impl"
    // InternalDsl.g:5627:1: rule__RouterComponent__Group__4__Impl : ( ( rule__RouterComponent__TypeAssignment_4 ) ) ;
    public final void rule__RouterComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5631:1: ( ( ( rule__RouterComponent__TypeAssignment_4 ) ) )
            // InternalDsl.g:5632:1: ( ( rule__RouterComponent__TypeAssignment_4 ) )
            {
            // InternalDsl.g:5632:1: ( ( rule__RouterComponent__TypeAssignment_4 ) )
            // InternalDsl.g:5633:2: ( rule__RouterComponent__TypeAssignment_4 )
            {
             before(grammarAccess.getRouterComponentAccess().getTypeAssignment_4()); 
            // InternalDsl.g:5634:2: ( rule__RouterComponent__TypeAssignment_4 )
            // InternalDsl.g:5634:3: rule__RouterComponent__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RouterComponent__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRouterComponentAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__4__Impl"


    // $ANTLR start "rule__RouterComponent__Group__5"
    // InternalDsl.g:5642:1: rule__RouterComponent__Group__5 : rule__RouterComponent__Group__5__Impl rule__RouterComponent__Group__6 ;
    public final void rule__RouterComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5646:1: ( rule__RouterComponent__Group__5__Impl rule__RouterComponent__Group__6 )
            // InternalDsl.g:5647:2: rule__RouterComponent__Group__5__Impl rule__RouterComponent__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__RouterComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__5"


    // $ANTLR start "rule__RouterComponent__Group__5__Impl"
    // InternalDsl.g:5654:1: rule__RouterComponent__Group__5__Impl : ( 'use:' ) ;
    public final void rule__RouterComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5658:1: ( ( 'use:' ) )
            // InternalDsl.g:5659:1: ( 'use:' )
            {
            // InternalDsl.g:5659:1: ( 'use:' )
            // InternalDsl.g:5660:2: 'use:'
            {
             before(grammarAccess.getRouterComponentAccess().getUseKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getUseKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__5__Impl"


    // $ANTLR start "rule__RouterComponent__Group__6"
    // InternalDsl.g:5669:1: rule__RouterComponent__Group__6 : rule__RouterComponent__Group__6__Impl rule__RouterComponent__Group__7 ;
    public final void rule__RouterComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5673:1: ( rule__RouterComponent__Group__6__Impl rule__RouterComponent__Group__7 )
            // InternalDsl.g:5674:2: rule__RouterComponent__Group__6__Impl rule__RouterComponent__Group__7
            {
            pushFollow(FOLLOW_67);
            rule__RouterComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__6"


    // $ANTLR start "rule__RouterComponent__Group__6__Impl"
    // InternalDsl.g:5681:1: rule__RouterComponent__Group__6__Impl : ( ( rule__RouterComponent__TypeAssignment_6 ) ) ;
    public final void rule__RouterComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5685:1: ( ( ( rule__RouterComponent__TypeAssignment_6 ) ) )
            // InternalDsl.g:5686:1: ( ( rule__RouterComponent__TypeAssignment_6 ) )
            {
            // InternalDsl.g:5686:1: ( ( rule__RouterComponent__TypeAssignment_6 ) )
            // InternalDsl.g:5687:2: ( rule__RouterComponent__TypeAssignment_6 )
            {
             before(grammarAccess.getRouterComponentAccess().getTypeAssignment_6()); 
            // InternalDsl.g:5688:2: ( rule__RouterComponent__TypeAssignment_6 )
            // InternalDsl.g:5688:3: rule__RouterComponent__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RouterComponent__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRouterComponentAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__6__Impl"


    // $ANTLR start "rule__RouterComponent__Group__7"
    // InternalDsl.g:5696:1: rule__RouterComponent__Group__7 : rule__RouterComponent__Group__7__Impl rule__RouterComponent__Group__8 ;
    public final void rule__RouterComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5700:1: ( rule__RouterComponent__Group__7__Impl rule__RouterComponent__Group__8 )
            // InternalDsl.g:5701:2: rule__RouterComponent__Group__7__Impl rule__RouterComponent__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__RouterComponent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__7"


    // $ANTLR start "rule__RouterComponent__Group__7__Impl"
    // InternalDsl.g:5708:1: rule__RouterComponent__Group__7__Impl : ( 'route:' ) ;
    public final void rule__RouterComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5712:1: ( ( 'route:' ) )
            // InternalDsl.g:5713:1: ( 'route:' )
            {
            // InternalDsl.g:5713:1: ( 'route:' )
            // InternalDsl.g:5714:2: 'route:'
            {
             before(grammarAccess.getRouterComponentAccess().getRouteKeyword_7()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getRouteKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__7__Impl"


    // $ANTLR start "rule__RouterComponent__Group__8"
    // InternalDsl.g:5723:1: rule__RouterComponent__Group__8 : rule__RouterComponent__Group__8__Impl rule__RouterComponent__Group__9 ;
    public final void rule__RouterComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5727:1: ( rule__RouterComponent__Group__8__Impl rule__RouterComponent__Group__9 )
            // InternalDsl.g:5728:2: rule__RouterComponent__Group__8__Impl rule__RouterComponent__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__RouterComponent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__8"


    // $ANTLR start "rule__RouterComponent__Group__8__Impl"
    // InternalDsl.g:5735:1: rule__RouterComponent__Group__8__Impl : ( ( rule__RouterComponent__RouteAssignment_8 ) ) ;
    public final void rule__RouterComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5739:1: ( ( ( rule__RouterComponent__RouteAssignment_8 ) ) )
            // InternalDsl.g:5740:1: ( ( rule__RouterComponent__RouteAssignment_8 ) )
            {
            // InternalDsl.g:5740:1: ( ( rule__RouterComponent__RouteAssignment_8 ) )
            // InternalDsl.g:5741:2: ( rule__RouterComponent__RouteAssignment_8 )
            {
             before(grammarAccess.getRouterComponentAccess().getRouteAssignment_8()); 
            // InternalDsl.g:5742:2: ( rule__RouterComponent__RouteAssignment_8 )
            // InternalDsl.g:5742:3: rule__RouterComponent__RouteAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__RouterComponent__RouteAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRouterComponentAccess().getRouteAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__8__Impl"


    // $ANTLR start "rule__RouterComponent__Group__9"
    // InternalDsl.g:5750:1: rule__RouterComponent__Group__9 : rule__RouterComponent__Group__9__Impl ;
    public final void rule__RouterComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5754:1: ( rule__RouterComponent__Group__9__Impl )
            // InternalDsl.g:5755:2: rule__RouterComponent__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RouterComponent__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__9"


    // $ANTLR start "rule__RouterComponent__Group__9__Impl"
    // InternalDsl.g:5761:1: rule__RouterComponent__Group__9__Impl : ( '}' ) ;
    public final void rule__RouterComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5765:1: ( ( '}' ) )
            // InternalDsl.g:5766:1: ( '}' )
            {
            // InternalDsl.g:5766:1: ( '}' )
            // InternalDsl.g:5767:2: '}'
            {
             before(grammarAccess.getRouterComponentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__Group__9__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalDsl.g:5777:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5781:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalDsl.g:5782:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalDsl.g:5789:1: rule__Container__Group__0__Impl : ( 'container' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5793:1: ( ( 'container' ) )
            // InternalDsl.g:5794:1: ( 'container' )
            {
            // InternalDsl.g:5794:1: ( 'container' )
            // InternalDsl.g:5795:2: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalDsl.g:5804:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5808:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalDsl.g:5809:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalDsl.g:5816:1: rule__Container__Group__1__Impl : ( ( rule__Container__NameAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5820:1: ( ( ( rule__Container__NameAssignment_1 ) ) )
            // InternalDsl.g:5821:1: ( ( rule__Container__NameAssignment_1 ) )
            {
            // InternalDsl.g:5821:1: ( ( rule__Container__NameAssignment_1 ) )
            // InternalDsl.g:5822:2: ( rule__Container__NameAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_1()); 
            // InternalDsl.g:5823:2: ( rule__Container__NameAssignment_1 )
            // InternalDsl.g:5823:3: rule__Container__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalDsl.g:5831:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5835:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalDsl.g:5836:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_66);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalDsl.g:5843:1: rule__Container__Group__2__Impl : ( '{' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5847:1: ( ( '{' ) )
            // InternalDsl.g:5848:1: ( '{' )
            {
            // InternalDsl.g:5848:1: ( '{' )
            // InternalDsl.g:5849:2: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalDsl.g:5858:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5862:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalDsl.g:5863:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalDsl.g:5870:1: rule__Container__Group__3__Impl : ( 'inWithin:' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5874:1: ( ( 'inWithin:' ) )
            // InternalDsl.g:5875:1: ( 'inWithin:' )
            {
            // InternalDsl.g:5875:1: ( 'inWithin:' )
            // InternalDsl.g:5876:2: 'inWithin:'
            {
             before(grammarAccess.getContainerAccess().getInWithinKeyword_3()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getInWithinKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // InternalDsl.g:5885:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5889:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalDsl.g:5890:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_68);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalDsl.g:5897:1: rule__Container__Group__4__Impl : ( ( rule__Container__TypeAssignment_4 ) ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5901:1: ( ( ( rule__Container__TypeAssignment_4 ) ) )
            // InternalDsl.g:5902:1: ( ( rule__Container__TypeAssignment_4 ) )
            {
            // InternalDsl.g:5902:1: ( ( rule__Container__TypeAssignment_4 ) )
            // InternalDsl.g:5903:2: ( rule__Container__TypeAssignment_4 )
            {
             before(grammarAccess.getContainerAccess().getTypeAssignment_4()); 
            // InternalDsl.g:5904:2: ( rule__Container__TypeAssignment_4 )
            // InternalDsl.g:5904:3: rule__Container__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Container__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalDsl.g:5912:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5916:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // InternalDsl.g:5917:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_68);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalDsl.g:5924:1: rule__Container__Group__5__Impl : ( ( rule__Container__Group_5__0 )? ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5928:1: ( ( ( rule__Container__Group_5__0 )? ) )
            // InternalDsl.g:5929:1: ( ( rule__Container__Group_5__0 )? )
            {
            // InternalDsl.g:5929:1: ( ( rule__Container__Group_5__0 )? )
            // InternalDsl.g:5930:2: ( rule__Container__Group_5__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_5()); 
            // InternalDsl.g:5931:2: ( rule__Container__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==74) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:5931:3: rule__Container__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__6"
    // InternalDsl.g:5939:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5943:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // InternalDsl.g:5944:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_68);
            rule__Container__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__6"


    // $ANTLR start "rule__Container__Group__6__Impl"
    // InternalDsl.g:5951:1: rule__Container__Group__6__Impl : ( ( rule__Container__Group_6__0 )* ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5955:1: ( ( ( rule__Container__Group_6__0 )* ) )
            // InternalDsl.g:5956:1: ( ( rule__Container__Group_6__0 )* )
            {
            // InternalDsl.g:5956:1: ( ( rule__Container__Group_6__0 )* )
            // InternalDsl.g:5957:2: ( rule__Container__Group_6__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_6()); 
            // InternalDsl.g:5958:2: ( rule__Container__Group_6__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==75) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDsl.g:5958:3: rule__Container__Group_6__0
            	    {
            	    pushFollow(FOLLOW_69);
            	    rule__Container__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__6__Impl"


    // $ANTLR start "rule__Container__Group__7"
    // InternalDsl.g:5966:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5970:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // InternalDsl.g:5971:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Container__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__7"


    // $ANTLR start "rule__Container__Group__7__Impl"
    // InternalDsl.g:5978:1: rule__Container__Group__7__Impl : ( 'use:' ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5982:1: ( ( 'use:' ) )
            // InternalDsl.g:5983:1: ( 'use:' )
            {
            // InternalDsl.g:5983:1: ( 'use:' )
            // InternalDsl.g:5984:2: 'use:'
            {
             before(grammarAccess.getContainerAccess().getUseKeyword_7()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getUseKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__7__Impl"


    // $ANTLR start "rule__Container__Group__8"
    // InternalDsl.g:5993:1: rule__Container__Group__8 : rule__Container__Group__8__Impl rule__Container__Group__9 ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5997:1: ( rule__Container__Group__8__Impl rule__Container__Group__9 )
            // InternalDsl.g:5998:2: rule__Container__Group__8__Impl rule__Container__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Container__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__8"


    // $ANTLR start "rule__Container__Group__8__Impl"
    // InternalDsl.g:6005:1: rule__Container__Group__8__Impl : ( ( rule__Container__TypeAssignment_8 ) ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6009:1: ( ( ( rule__Container__TypeAssignment_8 ) ) )
            // InternalDsl.g:6010:1: ( ( rule__Container__TypeAssignment_8 ) )
            {
            // InternalDsl.g:6010:1: ( ( rule__Container__TypeAssignment_8 ) )
            // InternalDsl.g:6011:2: ( rule__Container__TypeAssignment_8 )
            {
             before(grammarAccess.getContainerAccess().getTypeAssignment_8()); 
            // InternalDsl.g:6012:2: ( rule__Container__TypeAssignment_8 )
            // InternalDsl.g:6012:3: rule__Container__TypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Container__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__8__Impl"


    // $ANTLR start "rule__Container__Group__9"
    // InternalDsl.g:6020:1: rule__Container__Group__9 : rule__Container__Group__9__Impl ;
    public final void rule__Container__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6024:1: ( rule__Container__Group__9__Impl )
            // InternalDsl.g:6025:2: rule__Container__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__9"


    // $ANTLR start "rule__Container__Group__9__Impl"
    // InternalDsl.g:6031:1: rule__Container__Group__9__Impl : ( '}' ) ;
    public final void rule__Container__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6035:1: ( ( '}' ) )
            // InternalDsl.g:6036:1: ( '}' )
            {
            // InternalDsl.g:6036:1: ( '}' )
            // InternalDsl.g:6037:2: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__9__Impl"


    // $ANTLR start "rule__Container__Group_5__0"
    // InternalDsl.g:6047:1: rule__Container__Group_5__0 : rule__Container__Group_5__0__Impl rule__Container__Group_5__1 ;
    public final void rule__Container__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6051:1: ( rule__Container__Group_5__0__Impl rule__Container__Group_5__1 )
            // InternalDsl.g:6052:2: rule__Container__Group_5__0__Impl rule__Container__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Container__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_5__0"


    // $ANTLR start "rule__Container__Group_5__0__Impl"
    // InternalDsl.g:6059:1: rule__Container__Group_5__0__Impl : ( 'dispatch:' ) ;
    public final void rule__Container__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6063:1: ( ( 'dispatch:' ) )
            // InternalDsl.g:6064:1: ( 'dispatch:' )
            {
            // InternalDsl.g:6064:1: ( 'dispatch:' )
            // InternalDsl.g:6065:2: 'dispatch:'
            {
             before(grammarAccess.getContainerAccess().getDispatchKeyword_5_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getDispatchKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_5__0__Impl"


    // $ANTLR start "rule__Container__Group_5__1"
    // InternalDsl.g:6074:1: rule__Container__Group_5__1 : rule__Container__Group_5__1__Impl ;
    public final void rule__Container__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6078:1: ( rule__Container__Group_5__1__Impl )
            // InternalDsl.g:6079:2: rule__Container__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_5__1"


    // $ANTLR start "rule__Container__Group_5__1__Impl"
    // InternalDsl.g:6085:1: rule__Container__Group_5__1__Impl : ( ( rule__Container__TypeAssignment_5_1 ) ) ;
    public final void rule__Container__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6089:1: ( ( ( rule__Container__TypeAssignment_5_1 ) ) )
            // InternalDsl.g:6090:1: ( ( rule__Container__TypeAssignment_5_1 ) )
            {
            // InternalDsl.g:6090:1: ( ( rule__Container__TypeAssignment_5_1 ) )
            // InternalDsl.g:6091:2: ( rule__Container__TypeAssignment_5_1 )
            {
             before(grammarAccess.getContainerAccess().getTypeAssignment_5_1()); 
            // InternalDsl.g:6092:2: ( rule__Container__TypeAssignment_5_1 )
            // InternalDsl.g:6092:3: rule__Container__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_5__1__Impl"


    // $ANTLR start "rule__Container__Group_6__0"
    // InternalDsl.g:6101:1: rule__Container__Group_6__0 : rule__Container__Group_6__0__Impl rule__Container__Group_6__1 ;
    public final void rule__Container__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6105:1: ( rule__Container__Group_6__0__Impl rule__Container__Group_6__1 )
            // InternalDsl.g:6106:2: rule__Container__Group_6__0__Impl rule__Container__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Container__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_6__0"


    // $ANTLR start "rule__Container__Group_6__0__Impl"
    // InternalDsl.g:6113:1: rule__Container__Group_6__0__Impl : ( 'map:' ) ;
    public final void rule__Container__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6117:1: ( ( 'map:' ) )
            // InternalDsl.g:6118:1: ( 'map:' )
            {
            // InternalDsl.g:6118:1: ( 'map:' )
            // InternalDsl.g:6119:2: 'map:'
            {
             before(grammarAccess.getContainerAccess().getMapKeyword_6_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getMapKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_6__0__Impl"


    // $ANTLR start "rule__Container__Group_6__1"
    // InternalDsl.g:6128:1: rule__Container__Group_6__1 : rule__Container__Group_6__1__Impl ;
    public final void rule__Container__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6132:1: ( rule__Container__Group_6__1__Impl )
            // InternalDsl.g:6133:2: rule__Container__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_6__1"


    // $ANTLR start "rule__Container__Group_6__1__Impl"
    // InternalDsl.g:6139:1: rule__Container__Group_6__1__Impl : ( ( rule__Container__TypeAssignment_6_1 ) ) ;
    public final void rule__Container__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6143:1: ( ( ( rule__Container__TypeAssignment_6_1 ) ) )
            // InternalDsl.g:6144:1: ( ( rule__Container__TypeAssignment_6_1 ) )
            {
            // InternalDsl.g:6144:1: ( ( rule__Container__TypeAssignment_6_1 ) )
            // InternalDsl.g:6145:2: ( rule__Container__TypeAssignment_6_1 )
            {
             before(grammarAccess.getContainerAccess().getTypeAssignment_6_1()); 
            // InternalDsl.g:6146:2: ( rule__Container__TypeAssignment_6_1 )
            // InternalDsl.g:6146:3: rule__Container__TypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_6__1__Impl"


    // $ANTLR start "rule__Visualizer__Group__0"
    // InternalDsl.g:6155:1: rule__Visualizer__Group__0 : rule__Visualizer__Group__0__Impl rule__Visualizer__Group__1 ;
    public final void rule__Visualizer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6159:1: ( rule__Visualizer__Group__0__Impl rule__Visualizer__Group__1 )
            // InternalDsl.g:6160:2: rule__Visualizer__Group__0__Impl rule__Visualizer__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Visualizer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__0"


    // $ANTLR start "rule__Visualizer__Group__0__Impl"
    // InternalDsl.g:6167:1: rule__Visualizer__Group__0__Impl : ( 'visualizer' ) ;
    public final void rule__Visualizer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6171:1: ( ( 'visualizer' ) )
            // InternalDsl.g:6172:1: ( 'visualizer' )
            {
            // InternalDsl.g:6172:1: ( 'visualizer' )
            // InternalDsl.g:6173:2: 'visualizer'
            {
             before(grammarAccess.getVisualizerAccess().getVisualizerKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getVisualizerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__0__Impl"


    // $ANTLR start "rule__Visualizer__Group__1"
    // InternalDsl.g:6182:1: rule__Visualizer__Group__1 : rule__Visualizer__Group__1__Impl rule__Visualizer__Group__2 ;
    public final void rule__Visualizer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6186:1: ( rule__Visualizer__Group__1__Impl rule__Visualizer__Group__2 )
            // InternalDsl.g:6187:2: rule__Visualizer__Group__1__Impl rule__Visualizer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Visualizer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__1"


    // $ANTLR start "rule__Visualizer__Group__1__Impl"
    // InternalDsl.g:6194:1: rule__Visualizer__Group__1__Impl : ( ( rule__Visualizer__NameAssignment_1 ) ) ;
    public final void rule__Visualizer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6198:1: ( ( ( rule__Visualizer__NameAssignment_1 ) ) )
            // InternalDsl.g:6199:1: ( ( rule__Visualizer__NameAssignment_1 ) )
            {
            // InternalDsl.g:6199:1: ( ( rule__Visualizer__NameAssignment_1 ) )
            // InternalDsl.g:6200:2: ( rule__Visualizer__NameAssignment_1 )
            {
             before(grammarAccess.getVisualizerAccess().getNameAssignment_1()); 
            // InternalDsl.g:6201:2: ( rule__Visualizer__NameAssignment_1 )
            // InternalDsl.g:6201:3: rule__Visualizer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Visualizer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualizerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__1__Impl"


    // $ANTLR start "rule__Visualizer__Group__2"
    // InternalDsl.g:6209:1: rule__Visualizer__Group__2 : rule__Visualizer__Group__2__Impl rule__Visualizer__Group__3 ;
    public final void rule__Visualizer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6213:1: ( rule__Visualizer__Group__2__Impl rule__Visualizer__Group__3 )
            // InternalDsl.g:6214:2: rule__Visualizer__Group__2__Impl rule__Visualizer__Group__3
            {
            pushFollow(FOLLOW_66);
            rule__Visualizer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__2"


    // $ANTLR start "rule__Visualizer__Group__2__Impl"
    // InternalDsl.g:6221:1: rule__Visualizer__Group__2__Impl : ( '{' ) ;
    public final void rule__Visualizer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6225:1: ( ( '{' ) )
            // InternalDsl.g:6226:1: ( '{' )
            {
            // InternalDsl.g:6226:1: ( '{' )
            // InternalDsl.g:6227:2: '{'
            {
             before(grammarAccess.getVisualizerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__2__Impl"


    // $ANTLR start "rule__Visualizer__Group__3"
    // InternalDsl.g:6236:1: rule__Visualizer__Group__3 : rule__Visualizer__Group__3__Impl rule__Visualizer__Group__4 ;
    public final void rule__Visualizer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6240:1: ( rule__Visualizer__Group__3__Impl rule__Visualizer__Group__4 )
            // InternalDsl.g:6241:2: rule__Visualizer__Group__3__Impl rule__Visualizer__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Visualizer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__3"


    // $ANTLR start "rule__Visualizer__Group__3__Impl"
    // InternalDsl.g:6248:1: rule__Visualizer__Group__3__Impl : ( 'inWithin:' ) ;
    public final void rule__Visualizer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6252:1: ( ( 'inWithin:' ) )
            // InternalDsl.g:6253:1: ( 'inWithin:' )
            {
            // InternalDsl.g:6253:1: ( 'inWithin:' )
            // InternalDsl.g:6254:2: 'inWithin:'
            {
             before(grammarAccess.getVisualizerAccess().getInWithinKeyword_3()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getInWithinKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__3__Impl"


    // $ANTLR start "rule__Visualizer__Group__4"
    // InternalDsl.g:6263:1: rule__Visualizer__Group__4 : rule__Visualizer__Group__4__Impl rule__Visualizer__Group__5 ;
    public final void rule__Visualizer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6267:1: ( rule__Visualizer__Group__4__Impl rule__Visualizer__Group__5 )
            // InternalDsl.g:6268:2: rule__Visualizer__Group__4__Impl rule__Visualizer__Group__5
            {
            pushFollow(FOLLOW_56);
            rule__Visualizer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__4"


    // $ANTLR start "rule__Visualizer__Group__4__Impl"
    // InternalDsl.g:6275:1: rule__Visualizer__Group__4__Impl : ( ( rule__Visualizer__TypeAssignment_4 ) ) ;
    public final void rule__Visualizer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6279:1: ( ( ( rule__Visualizer__TypeAssignment_4 ) ) )
            // InternalDsl.g:6280:1: ( ( rule__Visualizer__TypeAssignment_4 ) )
            {
            // InternalDsl.g:6280:1: ( ( rule__Visualizer__TypeAssignment_4 ) )
            // InternalDsl.g:6281:2: ( rule__Visualizer__TypeAssignment_4 )
            {
             before(grammarAccess.getVisualizerAccess().getTypeAssignment_4()); 
            // InternalDsl.g:6282:2: ( rule__Visualizer__TypeAssignment_4 )
            // InternalDsl.g:6282:3: rule__Visualizer__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Visualizer__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVisualizerAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__4__Impl"


    // $ANTLR start "rule__Visualizer__Group__5"
    // InternalDsl.g:6290:1: rule__Visualizer__Group__5 : rule__Visualizer__Group__5__Impl rule__Visualizer__Group__6 ;
    public final void rule__Visualizer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6294:1: ( rule__Visualizer__Group__5__Impl rule__Visualizer__Group__6 )
            // InternalDsl.g:6295:2: rule__Visualizer__Group__5__Impl rule__Visualizer__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Visualizer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__5"


    // $ANTLR start "rule__Visualizer__Group__5__Impl"
    // InternalDsl.g:6302:1: rule__Visualizer__Group__5__Impl : ( ( ( rule__Visualizer__Group_5__0 ) ) ( ( rule__Visualizer__Group_5__0 )* ) ) ;
    public final void rule__Visualizer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6306:1: ( ( ( ( rule__Visualizer__Group_5__0 ) ) ( ( rule__Visualizer__Group_5__0 )* ) ) )
            // InternalDsl.g:6307:1: ( ( ( rule__Visualizer__Group_5__0 ) ) ( ( rule__Visualizer__Group_5__0 )* ) )
            {
            // InternalDsl.g:6307:1: ( ( ( rule__Visualizer__Group_5__0 ) ) ( ( rule__Visualizer__Group_5__0 )* ) )
            // InternalDsl.g:6308:2: ( ( rule__Visualizer__Group_5__0 ) ) ( ( rule__Visualizer__Group_5__0 )* )
            {
            // InternalDsl.g:6308:2: ( ( rule__Visualizer__Group_5__0 ) )
            // InternalDsl.g:6309:3: ( rule__Visualizer__Group_5__0 )
            {
             before(grammarAccess.getVisualizerAccess().getGroup_5()); 
            // InternalDsl.g:6310:3: ( rule__Visualizer__Group_5__0 )
            // InternalDsl.g:6310:4: rule__Visualizer__Group_5__0
            {
            pushFollow(FOLLOW_58);
            rule__Visualizer__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualizerAccess().getGroup_5()); 

            }

            // InternalDsl.g:6313:2: ( ( rule__Visualizer__Group_5__0 )* )
            // InternalDsl.g:6314:3: ( rule__Visualizer__Group_5__0 )*
            {
             before(grammarAccess.getVisualizerAccess().getGroup_5()); 
            // InternalDsl.g:6315:3: ( rule__Visualizer__Group_5__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==62) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDsl.g:6315:4: rule__Visualizer__Group_5__0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__Visualizer__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getVisualizerAccess().getGroup_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__5__Impl"


    // $ANTLR start "rule__Visualizer__Group__6"
    // InternalDsl.g:6324:1: rule__Visualizer__Group__6 : rule__Visualizer__Group__6__Impl ;
    public final void rule__Visualizer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6328:1: ( rule__Visualizer__Group__6__Impl )
            // InternalDsl.g:6329:2: rule__Visualizer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visualizer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__6"


    // $ANTLR start "rule__Visualizer__Group__6__Impl"
    // InternalDsl.g:6335:1: rule__Visualizer__Group__6__Impl : ( '}' ) ;
    public final void rule__Visualizer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6339:1: ( ( '}' ) )
            // InternalDsl.g:6340:1: ( '}' )
            {
            // InternalDsl.g:6340:1: ( '}' )
            // InternalDsl.g:6341:2: '}'
            {
             before(grammarAccess.getVisualizerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group__6__Impl"


    // $ANTLR start "rule__Visualizer__Group_5__0"
    // InternalDsl.g:6351:1: rule__Visualizer__Group_5__0 : rule__Visualizer__Group_5__0__Impl rule__Visualizer__Group_5__1 ;
    public final void rule__Visualizer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6355:1: ( rule__Visualizer__Group_5__0__Impl rule__Visualizer__Group_5__1 )
            // InternalDsl.g:6356:2: rule__Visualizer__Group_5__0__Impl rule__Visualizer__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Visualizer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualizer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group_5__0"


    // $ANTLR start "rule__Visualizer__Group_5__0__Impl"
    // InternalDsl.g:6363:1: rule__Visualizer__Group_5__0__Impl : ( 'use:' ) ;
    public final void rule__Visualizer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6367:1: ( ( 'use:' ) )
            // InternalDsl.g:6368:1: ( 'use:' )
            {
            // InternalDsl.g:6368:1: ( 'use:' )
            // InternalDsl.g:6369:2: 'use:'
            {
             before(grammarAccess.getVisualizerAccess().getUseKeyword_5_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getUseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group_5__0__Impl"


    // $ANTLR start "rule__Visualizer__Group_5__1"
    // InternalDsl.g:6378:1: rule__Visualizer__Group_5__1 : rule__Visualizer__Group_5__1__Impl ;
    public final void rule__Visualizer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6382:1: ( rule__Visualizer__Group_5__1__Impl )
            // InternalDsl.g:6383:2: rule__Visualizer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visualizer__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group_5__1"


    // $ANTLR start "rule__Visualizer__Group_5__1__Impl"
    // InternalDsl.g:6389:1: rule__Visualizer__Group_5__1__Impl : ( ( rule__Visualizer__TypeAssignment_5_1 ) ) ;
    public final void rule__Visualizer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6393:1: ( ( ( rule__Visualizer__TypeAssignment_5_1 ) ) )
            // InternalDsl.g:6394:1: ( ( rule__Visualizer__TypeAssignment_5_1 ) )
            {
            // InternalDsl.g:6394:1: ( ( rule__Visualizer__TypeAssignment_5_1 ) )
            // InternalDsl.g:6395:2: ( rule__Visualizer__TypeAssignment_5_1 )
            {
             before(grammarAccess.getVisualizerAccess().getTypeAssignment_5_1()); 
            // InternalDsl.g:6396:2: ( rule__Visualizer__TypeAssignment_5_1 )
            // InternalDsl.g:6396:3: rule__Visualizer__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Visualizer__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualizerAccess().getTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__Group_5__1__Impl"


    // $ANTLR start "rule__ServiceFront__Group__0"
    // InternalDsl.g:6405:1: rule__ServiceFront__Group__0 : rule__ServiceFront__Group__0__Impl rule__ServiceFront__Group__1 ;
    public final void rule__ServiceFront__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6409:1: ( rule__ServiceFront__Group__0__Impl rule__ServiceFront__Group__1 )
            // InternalDsl.g:6410:2: rule__ServiceFront__Group__0__Impl rule__ServiceFront__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ServiceFront__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__0"


    // $ANTLR start "rule__ServiceFront__Group__0__Impl"
    // InternalDsl.g:6417:1: rule__ServiceFront__Group__0__Impl : ( 'service' ) ;
    public final void rule__ServiceFront__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6421:1: ( ( 'service' ) )
            // InternalDsl.g:6422:1: ( 'service' )
            {
            // InternalDsl.g:6422:1: ( 'service' )
            // InternalDsl.g:6423:2: 'service'
            {
             before(grammarAccess.getServiceFrontAccess().getServiceKeyword_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getServiceFrontAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__0__Impl"


    // $ANTLR start "rule__ServiceFront__Group__1"
    // InternalDsl.g:6432:1: rule__ServiceFront__Group__1 : rule__ServiceFront__Group__1__Impl rule__ServiceFront__Group__2 ;
    public final void rule__ServiceFront__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6436:1: ( rule__ServiceFront__Group__1__Impl rule__ServiceFront__Group__2 )
            // InternalDsl.g:6437:2: rule__ServiceFront__Group__1__Impl rule__ServiceFront__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ServiceFront__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__1"


    // $ANTLR start "rule__ServiceFront__Group__1__Impl"
    // InternalDsl.g:6444:1: rule__ServiceFront__Group__1__Impl : ( ( rule__ServiceFront__NameAssignment_1 ) ) ;
    public final void rule__ServiceFront__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6448:1: ( ( ( rule__ServiceFront__NameAssignment_1 ) ) )
            // InternalDsl.g:6449:1: ( ( rule__ServiceFront__NameAssignment_1 ) )
            {
            // InternalDsl.g:6449:1: ( ( rule__ServiceFront__NameAssignment_1 ) )
            // InternalDsl.g:6450:2: ( rule__ServiceFront__NameAssignment_1 )
            {
             before(grammarAccess.getServiceFrontAccess().getNameAssignment_1()); 
            // InternalDsl.g:6451:2: ( rule__ServiceFront__NameAssignment_1 )
            // InternalDsl.g:6451:3: rule__ServiceFront__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFront__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceFrontAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__1__Impl"


    // $ANTLR start "rule__ServiceFront__Group__2"
    // InternalDsl.g:6459:1: rule__ServiceFront__Group__2 : rule__ServiceFront__Group__2__Impl rule__ServiceFront__Group__3 ;
    public final void rule__ServiceFront__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6463:1: ( rule__ServiceFront__Group__2__Impl rule__ServiceFront__Group__3 )
            // InternalDsl.g:6464:2: rule__ServiceFront__Group__2__Impl rule__ServiceFront__Group__3
            {
            pushFollow(FOLLOW_56);
            rule__ServiceFront__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__2"


    // $ANTLR start "rule__ServiceFront__Group__2__Impl"
    // InternalDsl.g:6471:1: rule__ServiceFront__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceFront__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6475:1: ( ( '{' ) )
            // InternalDsl.g:6476:1: ( '{' )
            {
            // InternalDsl.g:6476:1: ( '{' )
            // InternalDsl.g:6477:2: '{'
            {
             before(grammarAccess.getServiceFrontAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServiceFrontAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__2__Impl"


    // $ANTLR start "rule__ServiceFront__Group__3"
    // InternalDsl.g:6486:1: rule__ServiceFront__Group__3 : rule__ServiceFront__Group__3__Impl rule__ServiceFront__Group__4 ;
    public final void rule__ServiceFront__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6490:1: ( rule__ServiceFront__Group__3__Impl rule__ServiceFront__Group__4 )
            // InternalDsl.g:6491:2: rule__ServiceFront__Group__3__Impl rule__ServiceFront__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ServiceFront__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__3"


    // $ANTLR start "rule__ServiceFront__Group__3__Impl"
    // InternalDsl.g:6498:1: rule__ServiceFront__Group__3__Impl : ( 'use:' ) ;
    public final void rule__ServiceFront__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6502:1: ( ( 'use:' ) )
            // InternalDsl.g:6503:1: ( 'use:' )
            {
            // InternalDsl.g:6503:1: ( 'use:' )
            // InternalDsl.g:6504:2: 'use:'
            {
             before(grammarAccess.getServiceFrontAccess().getUseKeyword_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getServiceFrontAccess().getUseKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__3__Impl"


    // $ANTLR start "rule__ServiceFront__Group__4"
    // InternalDsl.g:6513:1: rule__ServiceFront__Group__4 : rule__ServiceFront__Group__4__Impl rule__ServiceFront__Group__5 ;
    public final void rule__ServiceFront__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6517:1: ( rule__ServiceFront__Group__4__Impl rule__ServiceFront__Group__5 )
            // InternalDsl.g:6518:2: rule__ServiceFront__Group__4__Impl rule__ServiceFront__Group__5
            {
            pushFollow(FOLLOW_70);
            rule__ServiceFront__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__4"


    // $ANTLR start "rule__ServiceFront__Group__4__Impl"
    // InternalDsl.g:6525:1: rule__ServiceFront__Group__4__Impl : ( ( rule__ServiceFront__TypeAssignment_4 ) ) ;
    public final void rule__ServiceFront__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6529:1: ( ( ( rule__ServiceFront__TypeAssignment_4 ) ) )
            // InternalDsl.g:6530:1: ( ( rule__ServiceFront__TypeAssignment_4 ) )
            {
            // InternalDsl.g:6530:1: ( ( rule__ServiceFront__TypeAssignment_4 ) )
            // InternalDsl.g:6531:2: ( rule__ServiceFront__TypeAssignment_4 )
            {
             before(grammarAccess.getServiceFrontAccess().getTypeAssignment_4()); 
            // InternalDsl.g:6532:2: ( rule__ServiceFront__TypeAssignment_4 )
            // InternalDsl.g:6532:3: rule__ServiceFront__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFront__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceFrontAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__4__Impl"


    // $ANTLR start "rule__ServiceFront__Group__5"
    // InternalDsl.g:6540:1: rule__ServiceFront__Group__5 : rule__ServiceFront__Group__5__Impl rule__ServiceFront__Group__6 ;
    public final void rule__ServiceFront__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6544:1: ( rule__ServiceFront__Group__5__Impl rule__ServiceFront__Group__6 )
            // InternalDsl.g:6545:2: rule__ServiceFront__Group__5__Impl rule__ServiceFront__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ServiceFront__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__5"


    // $ANTLR start "rule__ServiceFront__Group__5__Impl"
    // InternalDsl.g:6552:1: rule__ServiceFront__Group__5__Impl : ( ( ( rule__ServiceFront__Group_5__0 ) ) ( ( rule__ServiceFront__Group_5__0 )* ) ) ;
    public final void rule__ServiceFront__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6556:1: ( ( ( ( rule__ServiceFront__Group_5__0 ) ) ( ( rule__ServiceFront__Group_5__0 )* ) ) )
            // InternalDsl.g:6557:1: ( ( ( rule__ServiceFront__Group_5__0 ) ) ( ( rule__ServiceFront__Group_5__0 )* ) )
            {
            // InternalDsl.g:6557:1: ( ( ( rule__ServiceFront__Group_5__0 ) ) ( ( rule__ServiceFront__Group_5__0 )* ) )
            // InternalDsl.g:6558:2: ( ( rule__ServiceFront__Group_5__0 ) ) ( ( rule__ServiceFront__Group_5__0 )* )
            {
            // InternalDsl.g:6558:2: ( ( rule__ServiceFront__Group_5__0 ) )
            // InternalDsl.g:6559:3: ( rule__ServiceFront__Group_5__0 )
            {
             before(grammarAccess.getServiceFrontAccess().getGroup_5()); 
            // InternalDsl.g:6560:3: ( rule__ServiceFront__Group_5__0 )
            // InternalDsl.g:6560:4: rule__ServiceFront__Group_5__0
            {
            pushFollow(FOLLOW_71);
            rule__ServiceFront__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceFrontAccess().getGroup_5()); 

            }

            // InternalDsl.g:6563:2: ( ( rule__ServiceFront__Group_5__0 )* )
            // InternalDsl.g:6564:3: ( rule__ServiceFront__Group_5__0 )*
            {
             before(grammarAccess.getServiceFrontAccess().getGroup_5()); 
            // InternalDsl.g:6565:3: ( rule__ServiceFront__Group_5__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==78) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDsl.g:6565:4: rule__ServiceFront__Group_5__0
            	    {
            	    pushFollow(FOLLOW_71);
            	    rule__ServiceFront__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getServiceFrontAccess().getGroup_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__5__Impl"


    // $ANTLR start "rule__ServiceFront__Group__6"
    // InternalDsl.g:6574:1: rule__ServiceFront__Group__6 : rule__ServiceFront__Group__6__Impl ;
    public final void rule__ServiceFront__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6578:1: ( rule__ServiceFront__Group__6__Impl )
            // InternalDsl.g:6579:2: rule__ServiceFront__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__6"


    // $ANTLR start "rule__ServiceFront__Group__6__Impl"
    // InternalDsl.g:6585:1: rule__ServiceFront__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceFront__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6589:1: ( ( '}' ) )
            // InternalDsl.g:6590:1: ( '}' )
            {
            // InternalDsl.g:6590:1: ( '}' )
            // InternalDsl.g:6591:2: '}'
            {
             before(grammarAccess.getServiceFrontAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServiceFrontAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group__6__Impl"


    // $ANTLR start "rule__ServiceFront__Group_5__0"
    // InternalDsl.g:6601:1: rule__ServiceFront__Group_5__0 : rule__ServiceFront__Group_5__0__Impl rule__ServiceFront__Group_5__1 ;
    public final void rule__ServiceFront__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6605:1: ( rule__ServiceFront__Group_5__0__Impl rule__ServiceFront__Group_5__1 )
            // InternalDsl.g:6606:2: rule__ServiceFront__Group_5__0__Impl rule__ServiceFront__Group_5__1
            {
            pushFollow(FOLLOW_72);
            rule__ServiceFront__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group_5__0"


    // $ANTLR start "rule__ServiceFront__Group_5__0__Impl"
    // InternalDsl.g:6613:1: rule__ServiceFront__Group_5__0__Impl : ( 'method:' ) ;
    public final void rule__ServiceFront__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6617:1: ( ( 'method:' ) )
            // InternalDsl.g:6618:1: ( 'method:' )
            {
            // InternalDsl.g:6618:1: ( 'method:' )
            // InternalDsl.g:6619:2: 'method:'
            {
             before(grammarAccess.getServiceFrontAccess().getMethodKeyword_5_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getServiceFrontAccess().getMethodKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group_5__0__Impl"


    // $ANTLR start "rule__ServiceFront__Group_5__1"
    // InternalDsl.g:6628:1: rule__ServiceFront__Group_5__1 : rule__ServiceFront__Group_5__1__Impl ;
    public final void rule__ServiceFront__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6632:1: ( rule__ServiceFront__Group_5__1__Impl )
            // InternalDsl.g:6633:2: rule__ServiceFront__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFront__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group_5__1"


    // $ANTLR start "rule__ServiceFront__Group_5__1__Impl"
    // InternalDsl.g:6639:1: rule__ServiceFront__Group_5__1__Impl : ( RULE_STRING ) ;
    public final void rule__ServiceFront__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6643:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6644:1: ( RULE_STRING )
            {
            // InternalDsl.g:6644:1: ( RULE_STRING )
            // InternalDsl.g:6645:2: RULE_STRING
            {
             before(grammarAccess.getServiceFrontAccess().getSTRINGTerminalRuleCall_5_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServiceFrontAccess().getSTRINGTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__Group_5__1__Impl"


    // $ANTLR start "rule__Directory__Group__0"
    // InternalDsl.g:6655:1: rule__Directory__Group__0 : rule__Directory__Group__0__Impl rule__Directory__Group__1 ;
    public final void rule__Directory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6659:1: ( rule__Directory__Group__0__Impl rule__Directory__Group__1 )
            // InternalDsl.g:6660:2: rule__Directory__Group__0__Impl rule__Directory__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Directory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__0"


    // $ANTLR start "rule__Directory__Group__0__Impl"
    // InternalDsl.g:6667:1: rule__Directory__Group__0__Impl : ( 'directory' ) ;
    public final void rule__Directory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6671:1: ( ( 'directory' ) )
            // InternalDsl.g:6672:1: ( 'directory' )
            {
            // InternalDsl.g:6672:1: ( 'directory' )
            // InternalDsl.g:6673:2: 'directory'
            {
             before(grammarAccess.getDirectoryAccess().getDirectoryKeyword_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getDirectoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__0__Impl"


    // $ANTLR start "rule__Directory__Group__1"
    // InternalDsl.g:6682:1: rule__Directory__Group__1 : rule__Directory__Group__1__Impl rule__Directory__Group__2 ;
    public final void rule__Directory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6686:1: ( rule__Directory__Group__1__Impl rule__Directory__Group__2 )
            // InternalDsl.g:6687:2: rule__Directory__Group__1__Impl rule__Directory__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Directory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__1"


    // $ANTLR start "rule__Directory__Group__1__Impl"
    // InternalDsl.g:6694:1: rule__Directory__Group__1__Impl : ( ( rule__Directory__NameAssignment_1 ) ) ;
    public final void rule__Directory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6698:1: ( ( ( rule__Directory__NameAssignment_1 ) ) )
            // InternalDsl.g:6699:1: ( ( rule__Directory__NameAssignment_1 ) )
            {
            // InternalDsl.g:6699:1: ( ( rule__Directory__NameAssignment_1 ) )
            // InternalDsl.g:6700:2: ( rule__Directory__NameAssignment_1 )
            {
             before(grammarAccess.getDirectoryAccess().getNameAssignment_1()); 
            // InternalDsl.g:6701:2: ( rule__Directory__NameAssignment_1 )
            // InternalDsl.g:6701:3: rule__Directory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Directory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__1__Impl"


    // $ANTLR start "rule__Directory__Group__2"
    // InternalDsl.g:6709:1: rule__Directory__Group__2 : rule__Directory__Group__2__Impl rule__Directory__Group__3 ;
    public final void rule__Directory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6713:1: ( rule__Directory__Group__2__Impl rule__Directory__Group__3 )
            // InternalDsl.g:6714:2: rule__Directory__Group__2__Impl rule__Directory__Group__3
            {
            pushFollow(FOLLOW_73);
            rule__Directory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__2"


    // $ANTLR start "rule__Directory__Group__2__Impl"
    // InternalDsl.g:6721:1: rule__Directory__Group__2__Impl : ( '{' ) ;
    public final void rule__Directory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6725:1: ( ( '{' ) )
            // InternalDsl.g:6726:1: ( '{' )
            {
            // InternalDsl.g:6726:1: ( '{' )
            // InternalDsl.g:6727:2: '{'
            {
             before(grammarAccess.getDirectoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__2__Impl"


    // $ANTLR start "rule__Directory__Group__3"
    // InternalDsl.g:6736:1: rule__Directory__Group__3 : rule__Directory__Group__3__Impl rule__Directory__Group__4 ;
    public final void rule__Directory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6740:1: ( rule__Directory__Group__3__Impl rule__Directory__Group__4 )
            // InternalDsl.g:6741:2: rule__Directory__Group__3__Impl rule__Directory__Group__4
            {
            pushFollow(FOLLOW_73);
            rule__Directory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__3"


    // $ANTLR start "rule__Directory__Group__3__Impl"
    // InternalDsl.g:6748:1: rule__Directory__Group__3__Impl : ( ( rule__Directory__Group_3__0 )* ) ;
    public final void rule__Directory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6752:1: ( ( ( rule__Directory__Group_3__0 )* ) )
            // InternalDsl.g:6753:1: ( ( rule__Directory__Group_3__0 )* )
            {
            // InternalDsl.g:6753:1: ( ( rule__Directory__Group_3__0 )* )
            // InternalDsl.g:6754:2: ( rule__Directory__Group_3__0 )*
            {
             before(grammarAccess.getDirectoryAccess().getGroup_3()); 
            // InternalDsl.g:6755:2: ( rule__Directory__Group_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==81) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDsl.g:6755:3: rule__Directory__Group_3__0
            	    {
            	    pushFollow(FOLLOW_74);
            	    rule__Directory__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getDirectoryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__3__Impl"


    // $ANTLR start "rule__Directory__Group__4"
    // InternalDsl.g:6763:1: rule__Directory__Group__4 : rule__Directory__Group__4__Impl rule__Directory__Group__5 ;
    public final void rule__Directory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6767:1: ( rule__Directory__Group__4__Impl rule__Directory__Group__5 )
            // InternalDsl.g:6768:2: rule__Directory__Group__4__Impl rule__Directory__Group__5
            {
            pushFollow(FOLLOW_73);
            rule__Directory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__4"


    // $ANTLR start "rule__Directory__Group__4__Impl"
    // InternalDsl.g:6775:1: rule__Directory__Group__4__Impl : ( ( rule__Directory__Group_4__0 )* ) ;
    public final void rule__Directory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6779:1: ( ( ( rule__Directory__Group_4__0 )* ) )
            // InternalDsl.g:6780:1: ( ( rule__Directory__Group_4__0 )* )
            {
            // InternalDsl.g:6780:1: ( ( rule__Directory__Group_4__0 )* )
            // InternalDsl.g:6781:2: ( rule__Directory__Group_4__0 )*
            {
             before(grammarAccess.getDirectoryAccess().getGroup_4()); 
            // InternalDsl.g:6782:2: ( rule__Directory__Group_4__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==82) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDsl.g:6782:3: rule__Directory__Group_4__0
            	    {
            	    pushFollow(FOLLOW_75);
            	    rule__Directory__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getDirectoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__4__Impl"


    // $ANTLR start "rule__Directory__Group__5"
    // InternalDsl.g:6790:1: rule__Directory__Group__5 : rule__Directory__Group__5__Impl rule__Directory__Group__6 ;
    public final void rule__Directory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6794:1: ( rule__Directory__Group__5__Impl rule__Directory__Group__6 )
            // InternalDsl.g:6795:2: rule__Directory__Group__5__Impl rule__Directory__Group__6
            {
            pushFollow(FOLLOW_72);
            rule__Directory__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__5"


    // $ANTLR start "rule__Directory__Group__5__Impl"
    // InternalDsl.g:6802:1: rule__Directory__Group__5__Impl : ( 'purpose:' ) ;
    public final void rule__Directory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6806:1: ( ( 'purpose:' ) )
            // InternalDsl.g:6807:1: ( 'purpose:' )
            {
            // InternalDsl.g:6807:1: ( 'purpose:' )
            // InternalDsl.g:6808:2: 'purpose:'
            {
             before(grammarAccess.getDirectoryAccess().getPurposeKeyword_5()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getPurposeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__5__Impl"


    // $ANTLR start "rule__Directory__Group__6"
    // InternalDsl.g:6817:1: rule__Directory__Group__6 : rule__Directory__Group__6__Impl rule__Directory__Group__7 ;
    public final void rule__Directory__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6821:1: ( rule__Directory__Group__6__Impl rule__Directory__Group__7 )
            // InternalDsl.g:6822:2: rule__Directory__Group__6__Impl rule__Directory__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Directory__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__6"


    // $ANTLR start "rule__Directory__Group__6__Impl"
    // InternalDsl.g:6829:1: rule__Directory__Group__6__Impl : ( RULE_STRING ) ;
    public final void rule__Directory__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6833:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6834:1: ( RULE_STRING )
            {
            // InternalDsl.g:6834:1: ( RULE_STRING )
            // InternalDsl.g:6835:2: RULE_STRING
            {
             before(grammarAccess.getDirectoryAccess().getSTRINGTerminalRuleCall_6()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getSTRINGTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__6__Impl"


    // $ANTLR start "rule__Directory__Group__7"
    // InternalDsl.g:6844:1: rule__Directory__Group__7 : rule__Directory__Group__7__Impl ;
    public final void rule__Directory__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6848:1: ( rule__Directory__Group__7__Impl )
            // InternalDsl.g:6849:2: rule__Directory__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Directory__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__7"


    // $ANTLR start "rule__Directory__Group__7__Impl"
    // InternalDsl.g:6855:1: rule__Directory__Group__7__Impl : ( '}' ) ;
    public final void rule__Directory__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6859:1: ( ( '}' ) )
            // InternalDsl.g:6860:1: ( '}' )
            {
            // InternalDsl.g:6860:1: ( '}' )
            // InternalDsl.g:6861:2: '}'
            {
             before(grammarAccess.getDirectoryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group__7__Impl"


    // $ANTLR start "rule__Directory__Group_3__0"
    // InternalDsl.g:6871:1: rule__Directory__Group_3__0 : rule__Directory__Group_3__0__Impl rule__Directory__Group_3__1 ;
    public final void rule__Directory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6875:1: ( rule__Directory__Group_3__0__Impl rule__Directory__Group_3__1 )
            // InternalDsl.g:6876:2: rule__Directory__Group_3__0__Impl rule__Directory__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Directory__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group_3__0"


    // $ANTLR start "rule__Directory__Group_3__0__Impl"
    // InternalDsl.g:6883:1: rule__Directory__Group_3__0__Impl : ( ( ( 'has:' ) ) ( ( 'has:' )* ) ) ;
    public final void rule__Directory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6887:1: ( ( ( ( 'has:' ) ) ( ( 'has:' )* ) ) )
            // InternalDsl.g:6888:1: ( ( ( 'has:' ) ) ( ( 'has:' )* ) )
            {
            // InternalDsl.g:6888:1: ( ( ( 'has:' ) ) ( ( 'has:' )* ) )
            // InternalDsl.g:6889:2: ( ( 'has:' ) ) ( ( 'has:' )* )
            {
            // InternalDsl.g:6889:2: ( ( 'has:' ) )
            // InternalDsl.g:6890:3: ( 'has:' )
            {
             before(grammarAccess.getDirectoryAccess().getHasKeyword_3_0()); 
            // InternalDsl.g:6891:3: ( 'has:' )
            // InternalDsl.g:6891:4: 'has:'
            {
            match(input,81,FOLLOW_74); 

            }

             after(grammarAccess.getDirectoryAccess().getHasKeyword_3_0()); 

            }

            // InternalDsl.g:6894:2: ( ( 'has:' )* )
            // InternalDsl.g:6895:3: ( 'has:' )*
            {
             before(grammarAccess.getDirectoryAccess().getHasKeyword_3_0()); 
            // InternalDsl.g:6896:3: ( 'has:' )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==81) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDsl.g:6896:4: 'has:'
            	    {
            	    match(input,81,FOLLOW_74); 

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getDirectoryAccess().getHasKeyword_3_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group_3__0__Impl"


    // $ANTLR start "rule__Directory__Group_3__1"
    // InternalDsl.g:6905:1: rule__Directory__Group_3__1 : rule__Directory__Group_3__1__Impl ;
    public final void rule__Directory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6909:1: ( rule__Directory__Group_3__1__Impl )
            // InternalDsl.g:6910:2: rule__Directory__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Directory__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group_3__1"


    // $ANTLR start "rule__Directory__Group_3__1__Impl"
    // InternalDsl.g:6916:1: rule__Directory__Group_3__1__Impl : ( ( rule__Directory__FileAssignment_3_1 ) ) ;
    public final void rule__Directory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6920:1: ( ( ( rule__Directory__FileAssignment_3_1 ) ) )
            // InternalDsl.g:6921:1: ( ( rule__Directory__FileAssignment_3_1 ) )
            {
            // InternalDsl.g:6921:1: ( ( rule__Directory__FileAssignment_3_1 ) )
            // InternalDsl.g:6922:2: ( rule__Directory__FileAssignment_3_1 )
            {
             before(grammarAccess.getDirectoryAccess().getFileAssignment_3_1()); 
            // InternalDsl.g:6923:2: ( rule__Directory__FileAssignment_3_1 )
            // InternalDsl.g:6923:3: rule__Directory__FileAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Directory__FileAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectoryAccess().getFileAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group_3__1__Impl"


    // $ANTLR start "rule__Directory__Group_4__0"
    // InternalDsl.g:6932:1: rule__Directory__Group_4__0 : rule__Directory__Group_4__0__Impl rule__Directory__Group_4__1 ;
    public final void rule__Directory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6936:1: ( rule__Directory__Group_4__0__Impl rule__Directory__Group_4__1 )
            // InternalDsl.g:6937:2: rule__Directory__Group_4__0__Impl rule__Directory__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Directory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group_4__0"


    // $ANTLR start "rule__Directory__Group_4__0__Impl"
    // InternalDsl.g:6944:1: rule__Directory__Group_4__0__Impl : ( 'contains:' ) ;
    public final void rule__Directory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6948:1: ( ( 'contains:' ) )
            // InternalDsl.g:6949:1: ( 'contains:' )
            {
            // InternalDsl.g:6949:1: ( 'contains:' )
            // InternalDsl.g:6950:2: 'contains:'
            {
             before(grammarAccess.getDirectoryAccess().getContainsKeyword_4_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getContainsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group_4__0__Impl"


    // $ANTLR start "rule__Directory__Group_4__1"
    // InternalDsl.g:6959:1: rule__Directory__Group_4__1 : rule__Directory__Group_4__1__Impl ;
    public final void rule__Directory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6963:1: ( rule__Directory__Group_4__1__Impl )
            // InternalDsl.g:6964:2: rule__Directory__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Directory__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group_4__1"


    // $ANTLR start "rule__Directory__Group_4__1__Impl"
    // InternalDsl.g:6970:1: rule__Directory__Group_4__1__Impl : ( ( rule__Directory__SubdirectoryAssignment_4_1 ) ) ;
    public final void rule__Directory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6974:1: ( ( ( rule__Directory__SubdirectoryAssignment_4_1 ) ) )
            // InternalDsl.g:6975:1: ( ( rule__Directory__SubdirectoryAssignment_4_1 ) )
            {
            // InternalDsl.g:6975:1: ( ( rule__Directory__SubdirectoryAssignment_4_1 ) )
            // InternalDsl.g:6976:2: ( rule__Directory__SubdirectoryAssignment_4_1 )
            {
             before(grammarAccess.getDirectoryAccess().getSubdirectoryAssignment_4_1()); 
            // InternalDsl.g:6977:2: ( rule__Directory__SubdirectoryAssignment_4_1 )
            // InternalDsl.g:6977:3: rule__Directory__SubdirectoryAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Directory__SubdirectoryAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectoryAccess().getSubdirectoryAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__Group_4__1__Impl"


    // $ANTLR start "rule__Md__Group__0"
    // InternalDsl.g:6986:1: rule__Md__Group__0 : rule__Md__Group__0__Impl rule__Md__Group__1 ;
    public final void rule__Md__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6990:1: ( rule__Md__Group__0__Impl rule__Md__Group__1 )
            // InternalDsl.g:6991:2: rule__Md__Group__0__Impl rule__Md__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Md__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Md__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__0"


    // $ANTLR start "rule__Md__Group__0__Impl"
    // InternalDsl.g:6998:1: rule__Md__Group__0__Impl : ( 'md' ) ;
    public final void rule__Md__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7002:1: ( ( 'md' ) )
            // InternalDsl.g:7003:1: ( 'md' )
            {
            // InternalDsl.g:7003:1: ( 'md' )
            // InternalDsl.g:7004:2: 'md'
            {
             before(grammarAccess.getMdAccess().getMdKeyword_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getMdAccess().getMdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__0__Impl"


    // $ANTLR start "rule__Md__Group__1"
    // InternalDsl.g:7013:1: rule__Md__Group__1 : rule__Md__Group__1__Impl rule__Md__Group__2 ;
    public final void rule__Md__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7017:1: ( rule__Md__Group__1__Impl rule__Md__Group__2 )
            // InternalDsl.g:7018:2: rule__Md__Group__1__Impl rule__Md__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Md__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Md__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__1"


    // $ANTLR start "rule__Md__Group__1__Impl"
    // InternalDsl.g:7025:1: rule__Md__Group__1__Impl : ( ( rule__Md__NameAssignment_1 ) ) ;
    public final void rule__Md__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7029:1: ( ( ( rule__Md__NameAssignment_1 ) ) )
            // InternalDsl.g:7030:1: ( ( rule__Md__NameAssignment_1 ) )
            {
            // InternalDsl.g:7030:1: ( ( rule__Md__NameAssignment_1 ) )
            // InternalDsl.g:7031:2: ( rule__Md__NameAssignment_1 )
            {
             before(grammarAccess.getMdAccess().getNameAssignment_1()); 
            // InternalDsl.g:7032:2: ( rule__Md__NameAssignment_1 )
            // InternalDsl.g:7032:3: rule__Md__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Md__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMdAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__1__Impl"


    // $ANTLR start "rule__Md__Group__2"
    // InternalDsl.g:7040:1: rule__Md__Group__2 : rule__Md__Group__2__Impl rule__Md__Group__3 ;
    public final void rule__Md__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7044:1: ( rule__Md__Group__2__Impl rule__Md__Group__3 )
            // InternalDsl.g:7045:2: rule__Md__Group__2__Impl rule__Md__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Md__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Md__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__2"


    // $ANTLR start "rule__Md__Group__2__Impl"
    // InternalDsl.g:7052:1: rule__Md__Group__2__Impl : ( '{' ) ;
    public final void rule__Md__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7056:1: ( ( '{' ) )
            // InternalDsl.g:7057:1: ( '{' )
            {
            // InternalDsl.g:7057:1: ( '{' )
            // InternalDsl.g:7058:2: '{'
            {
             before(grammarAccess.getMdAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMdAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__2__Impl"


    // $ANTLR start "rule__Md__Group__3"
    // InternalDsl.g:7067:1: rule__Md__Group__3 : rule__Md__Group__3__Impl rule__Md__Group__4 ;
    public final void rule__Md__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7071:1: ( rule__Md__Group__3__Impl rule__Md__Group__4 )
            // InternalDsl.g:7072:2: rule__Md__Group__3__Impl rule__Md__Group__4
            {
            pushFollow(FOLLOW_72);
            rule__Md__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Md__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__3"


    // $ANTLR start "rule__Md__Group__3__Impl"
    // InternalDsl.g:7079:1: rule__Md__Group__3__Impl : ( 'type:' ) ;
    public final void rule__Md__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7083:1: ( ( 'type:' ) )
            // InternalDsl.g:7084:1: ( 'type:' )
            {
            // InternalDsl.g:7084:1: ( 'type:' )
            // InternalDsl.g:7085:2: 'type:'
            {
             before(grammarAccess.getMdAccess().getTypeKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMdAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__3__Impl"


    // $ANTLR start "rule__Md__Group__4"
    // InternalDsl.g:7094:1: rule__Md__Group__4 : rule__Md__Group__4__Impl rule__Md__Group__5 ;
    public final void rule__Md__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7098:1: ( rule__Md__Group__4__Impl rule__Md__Group__5 )
            // InternalDsl.g:7099:2: rule__Md__Group__4__Impl rule__Md__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Md__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Md__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__4"


    // $ANTLR start "rule__Md__Group__4__Impl"
    // InternalDsl.g:7106:1: rule__Md__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__Md__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7110:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7111:1: ( RULE_STRING )
            {
            // InternalDsl.g:7111:1: ( RULE_STRING )
            // InternalDsl.g:7112:2: RULE_STRING
            {
             before(grammarAccess.getMdAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMdAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__4__Impl"


    // $ANTLR start "rule__Md__Group__5"
    // InternalDsl.g:7121:1: rule__Md__Group__5 : rule__Md__Group__5__Impl ;
    public final void rule__Md__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7125:1: ( rule__Md__Group__5__Impl )
            // InternalDsl.g:7126:2: rule__Md__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Md__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__5"


    // $ANTLR start "rule__Md__Group__5__Impl"
    // InternalDsl.g:7132:1: rule__Md__Group__5__Impl : ( '}' ) ;
    public final void rule__Md__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7136:1: ( ( '}' ) )
            // InternalDsl.g:7137:1: ( '}' )
            {
            // InternalDsl.g:7137:1: ( '}' )
            // InternalDsl.g:7138:2: '}'
            {
             before(grammarAccess.getMdAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMdAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__Group__5__Impl"


    // $ANTLR start "rule__Js__Group__0"
    // InternalDsl.g:7148:1: rule__Js__Group__0 : rule__Js__Group__0__Impl rule__Js__Group__1 ;
    public final void rule__Js__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7152:1: ( rule__Js__Group__0__Impl rule__Js__Group__1 )
            // InternalDsl.g:7153:2: rule__Js__Group__0__Impl rule__Js__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Js__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Js__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__0"


    // $ANTLR start "rule__Js__Group__0__Impl"
    // InternalDsl.g:7160:1: rule__Js__Group__0__Impl : ( 'js' ) ;
    public final void rule__Js__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7164:1: ( ( 'js' ) )
            // InternalDsl.g:7165:1: ( 'js' )
            {
            // InternalDsl.g:7165:1: ( 'js' )
            // InternalDsl.g:7166:2: 'js'
            {
             before(grammarAccess.getJsAccess().getJsKeyword_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getJsAccess().getJsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__0__Impl"


    // $ANTLR start "rule__Js__Group__1"
    // InternalDsl.g:7175:1: rule__Js__Group__1 : rule__Js__Group__1__Impl rule__Js__Group__2 ;
    public final void rule__Js__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7179:1: ( rule__Js__Group__1__Impl rule__Js__Group__2 )
            // InternalDsl.g:7180:2: rule__Js__Group__1__Impl rule__Js__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Js__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Js__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__1"


    // $ANTLR start "rule__Js__Group__1__Impl"
    // InternalDsl.g:7187:1: rule__Js__Group__1__Impl : ( ( rule__Js__NameAssignment_1 ) ) ;
    public final void rule__Js__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7191:1: ( ( ( rule__Js__NameAssignment_1 ) ) )
            // InternalDsl.g:7192:1: ( ( rule__Js__NameAssignment_1 ) )
            {
            // InternalDsl.g:7192:1: ( ( rule__Js__NameAssignment_1 ) )
            // InternalDsl.g:7193:2: ( rule__Js__NameAssignment_1 )
            {
             before(grammarAccess.getJsAccess().getNameAssignment_1()); 
            // InternalDsl.g:7194:2: ( rule__Js__NameAssignment_1 )
            // InternalDsl.g:7194:3: rule__Js__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Js__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__1__Impl"


    // $ANTLR start "rule__Js__Group__2"
    // InternalDsl.g:7202:1: rule__Js__Group__2 : rule__Js__Group__2__Impl rule__Js__Group__3 ;
    public final void rule__Js__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7206:1: ( rule__Js__Group__2__Impl rule__Js__Group__3 )
            // InternalDsl.g:7207:2: rule__Js__Group__2__Impl rule__Js__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Js__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Js__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__2"


    // $ANTLR start "rule__Js__Group__2__Impl"
    // InternalDsl.g:7214:1: rule__Js__Group__2__Impl : ( '{' ) ;
    public final void rule__Js__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7218:1: ( ( '{' ) )
            // InternalDsl.g:7219:1: ( '{' )
            {
            // InternalDsl.g:7219:1: ( '{' )
            // InternalDsl.g:7220:2: '{'
            {
             before(grammarAccess.getJsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__2__Impl"


    // $ANTLR start "rule__Js__Group__3"
    // InternalDsl.g:7229:1: rule__Js__Group__3 : rule__Js__Group__3__Impl rule__Js__Group__4 ;
    public final void rule__Js__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7233:1: ( rule__Js__Group__3__Impl rule__Js__Group__4 )
            // InternalDsl.g:7234:2: rule__Js__Group__3__Impl rule__Js__Group__4
            {
            pushFollow(FOLLOW_72);
            rule__Js__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Js__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__3"


    // $ANTLR start "rule__Js__Group__3__Impl"
    // InternalDsl.g:7241:1: rule__Js__Group__3__Impl : ( 'type:' ) ;
    public final void rule__Js__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7245:1: ( ( 'type:' ) )
            // InternalDsl.g:7246:1: ( 'type:' )
            {
            // InternalDsl.g:7246:1: ( 'type:' )
            // InternalDsl.g:7247:2: 'type:'
            {
             before(grammarAccess.getJsAccess().getTypeKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getJsAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__3__Impl"


    // $ANTLR start "rule__Js__Group__4"
    // InternalDsl.g:7256:1: rule__Js__Group__4 : rule__Js__Group__4__Impl rule__Js__Group__5 ;
    public final void rule__Js__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7260:1: ( rule__Js__Group__4__Impl rule__Js__Group__5 )
            // InternalDsl.g:7261:2: rule__Js__Group__4__Impl rule__Js__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Js__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Js__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__4"


    // $ANTLR start "rule__Js__Group__4__Impl"
    // InternalDsl.g:7268:1: rule__Js__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__Js__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7272:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7273:1: ( RULE_STRING )
            {
            // InternalDsl.g:7273:1: ( RULE_STRING )
            // InternalDsl.g:7274:2: RULE_STRING
            {
             before(grammarAccess.getJsAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJsAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__4__Impl"


    // $ANTLR start "rule__Js__Group__5"
    // InternalDsl.g:7283:1: rule__Js__Group__5 : rule__Js__Group__5__Impl ;
    public final void rule__Js__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7287:1: ( rule__Js__Group__5__Impl )
            // InternalDsl.g:7288:2: rule__Js__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Js__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__5"


    // $ANTLR start "rule__Js__Group__5__Impl"
    // InternalDsl.g:7294:1: rule__Js__Group__5__Impl : ( '}' ) ;
    public final void rule__Js__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7298:1: ( ( '}' ) )
            // InternalDsl.g:7299:1: ( '}' )
            {
            // InternalDsl.g:7299:1: ( '}' )
            // InternalDsl.g:7300:2: '}'
            {
             before(grammarAccess.getJsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getJsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__Group__5__Impl"


    // $ANTLR start "rule__Json__Group__0"
    // InternalDsl.g:7310:1: rule__Json__Group__0 : rule__Json__Group__0__Impl rule__Json__Group__1 ;
    public final void rule__Json__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7314:1: ( rule__Json__Group__0__Impl rule__Json__Group__1 )
            // InternalDsl.g:7315:2: rule__Json__Group__0__Impl rule__Json__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Json__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__0"


    // $ANTLR start "rule__Json__Group__0__Impl"
    // InternalDsl.g:7322:1: rule__Json__Group__0__Impl : ( 'json' ) ;
    public final void rule__Json__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7326:1: ( ( 'json' ) )
            // InternalDsl.g:7327:1: ( 'json' )
            {
            // InternalDsl.g:7327:1: ( 'json' )
            // InternalDsl.g:7328:2: 'json'
            {
             before(grammarAccess.getJsonAccess().getJsonKeyword_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getJsonAccess().getJsonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__0__Impl"


    // $ANTLR start "rule__Json__Group__1"
    // InternalDsl.g:7337:1: rule__Json__Group__1 : rule__Json__Group__1__Impl rule__Json__Group__2 ;
    public final void rule__Json__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7341:1: ( rule__Json__Group__1__Impl rule__Json__Group__2 )
            // InternalDsl.g:7342:2: rule__Json__Group__1__Impl rule__Json__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Json__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__1"


    // $ANTLR start "rule__Json__Group__1__Impl"
    // InternalDsl.g:7349:1: rule__Json__Group__1__Impl : ( ( rule__Json__NameAssignment_1 ) ) ;
    public final void rule__Json__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7353:1: ( ( ( rule__Json__NameAssignment_1 ) ) )
            // InternalDsl.g:7354:1: ( ( rule__Json__NameAssignment_1 ) )
            {
            // InternalDsl.g:7354:1: ( ( rule__Json__NameAssignment_1 ) )
            // InternalDsl.g:7355:2: ( rule__Json__NameAssignment_1 )
            {
             before(grammarAccess.getJsonAccess().getNameAssignment_1()); 
            // InternalDsl.g:7356:2: ( rule__Json__NameAssignment_1 )
            // InternalDsl.g:7356:3: rule__Json__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Json__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__1__Impl"


    // $ANTLR start "rule__Json__Group__2"
    // InternalDsl.g:7364:1: rule__Json__Group__2 : rule__Json__Group__2__Impl rule__Json__Group__3 ;
    public final void rule__Json__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7368:1: ( rule__Json__Group__2__Impl rule__Json__Group__3 )
            // InternalDsl.g:7369:2: rule__Json__Group__2__Impl rule__Json__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Json__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__2"


    // $ANTLR start "rule__Json__Group__2__Impl"
    // InternalDsl.g:7376:1: rule__Json__Group__2__Impl : ( '{' ) ;
    public final void rule__Json__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7380:1: ( ( '{' ) )
            // InternalDsl.g:7381:1: ( '{' )
            {
            // InternalDsl.g:7381:1: ( '{' )
            // InternalDsl.g:7382:2: '{'
            {
             before(grammarAccess.getJsonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJsonAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__2__Impl"


    // $ANTLR start "rule__Json__Group__3"
    // InternalDsl.g:7391:1: rule__Json__Group__3 : rule__Json__Group__3__Impl rule__Json__Group__4 ;
    public final void rule__Json__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7395:1: ( rule__Json__Group__3__Impl rule__Json__Group__4 )
            // InternalDsl.g:7396:2: rule__Json__Group__3__Impl rule__Json__Group__4
            {
            pushFollow(FOLLOW_72);
            rule__Json__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__3"


    // $ANTLR start "rule__Json__Group__3__Impl"
    // InternalDsl.g:7403:1: rule__Json__Group__3__Impl : ( 'type:' ) ;
    public final void rule__Json__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7407:1: ( ( 'type:' ) )
            // InternalDsl.g:7408:1: ( 'type:' )
            {
            // InternalDsl.g:7408:1: ( 'type:' )
            // InternalDsl.g:7409:2: 'type:'
            {
             before(grammarAccess.getJsonAccess().getTypeKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getJsonAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__3__Impl"


    // $ANTLR start "rule__Json__Group__4"
    // InternalDsl.g:7418:1: rule__Json__Group__4 : rule__Json__Group__4__Impl rule__Json__Group__5 ;
    public final void rule__Json__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7422:1: ( rule__Json__Group__4__Impl rule__Json__Group__5 )
            // InternalDsl.g:7423:2: rule__Json__Group__4__Impl rule__Json__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Json__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__4"


    // $ANTLR start "rule__Json__Group__4__Impl"
    // InternalDsl.g:7430:1: rule__Json__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__Json__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7434:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7435:1: ( RULE_STRING )
            {
            // InternalDsl.g:7435:1: ( RULE_STRING )
            // InternalDsl.g:7436:2: RULE_STRING
            {
             before(grammarAccess.getJsonAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJsonAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__4__Impl"


    // $ANTLR start "rule__Json__Group__5"
    // InternalDsl.g:7445:1: rule__Json__Group__5 : rule__Json__Group__5__Impl ;
    public final void rule__Json__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7449:1: ( rule__Json__Group__5__Impl )
            // InternalDsl.g:7450:2: rule__Json__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Json__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__5"


    // $ANTLR start "rule__Json__Group__5__Impl"
    // InternalDsl.g:7456:1: rule__Json__Group__5__Impl : ( '}' ) ;
    public final void rule__Json__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7460:1: ( ( '}' ) )
            // InternalDsl.g:7461:1: ( '}' )
            {
            // InternalDsl.g:7461:1: ( '}' )
            // InternalDsl.g:7462:2: '}'
            {
             before(grammarAccess.getJsonAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getJsonAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__5__Impl"


    // $ANTLR start "rule__Css__Group__0"
    // InternalDsl.g:7472:1: rule__Css__Group__0 : rule__Css__Group__0__Impl rule__Css__Group__1 ;
    public final void rule__Css__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7476:1: ( rule__Css__Group__0__Impl rule__Css__Group__1 )
            // InternalDsl.g:7477:2: rule__Css__Group__0__Impl rule__Css__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Css__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Css__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__0"


    // $ANTLR start "rule__Css__Group__0__Impl"
    // InternalDsl.g:7484:1: rule__Css__Group__0__Impl : ( 'css' ) ;
    public final void rule__Css__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7488:1: ( ( 'css' ) )
            // InternalDsl.g:7489:1: ( 'css' )
            {
            // InternalDsl.g:7489:1: ( 'css' )
            // InternalDsl.g:7490:2: 'css'
            {
             before(grammarAccess.getCssAccess().getCssKeyword_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getCssAccess().getCssKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__0__Impl"


    // $ANTLR start "rule__Css__Group__1"
    // InternalDsl.g:7499:1: rule__Css__Group__1 : rule__Css__Group__1__Impl rule__Css__Group__2 ;
    public final void rule__Css__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7503:1: ( rule__Css__Group__1__Impl rule__Css__Group__2 )
            // InternalDsl.g:7504:2: rule__Css__Group__1__Impl rule__Css__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Css__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Css__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__1"


    // $ANTLR start "rule__Css__Group__1__Impl"
    // InternalDsl.g:7511:1: rule__Css__Group__1__Impl : ( ( rule__Css__NameAssignment_1 ) ) ;
    public final void rule__Css__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7515:1: ( ( ( rule__Css__NameAssignment_1 ) ) )
            // InternalDsl.g:7516:1: ( ( rule__Css__NameAssignment_1 ) )
            {
            // InternalDsl.g:7516:1: ( ( rule__Css__NameAssignment_1 ) )
            // InternalDsl.g:7517:2: ( rule__Css__NameAssignment_1 )
            {
             before(grammarAccess.getCssAccess().getNameAssignment_1()); 
            // InternalDsl.g:7518:2: ( rule__Css__NameAssignment_1 )
            // InternalDsl.g:7518:3: rule__Css__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Css__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCssAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__1__Impl"


    // $ANTLR start "rule__Css__Group__2"
    // InternalDsl.g:7526:1: rule__Css__Group__2 : rule__Css__Group__2__Impl rule__Css__Group__3 ;
    public final void rule__Css__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7530:1: ( rule__Css__Group__2__Impl rule__Css__Group__3 )
            // InternalDsl.g:7531:2: rule__Css__Group__2__Impl rule__Css__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Css__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Css__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__2"


    // $ANTLR start "rule__Css__Group__2__Impl"
    // InternalDsl.g:7538:1: rule__Css__Group__2__Impl : ( '{' ) ;
    public final void rule__Css__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7542:1: ( ( '{' ) )
            // InternalDsl.g:7543:1: ( '{' )
            {
            // InternalDsl.g:7543:1: ( '{' )
            // InternalDsl.g:7544:2: '{'
            {
             before(grammarAccess.getCssAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCssAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__2__Impl"


    // $ANTLR start "rule__Css__Group__3"
    // InternalDsl.g:7553:1: rule__Css__Group__3 : rule__Css__Group__3__Impl rule__Css__Group__4 ;
    public final void rule__Css__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7557:1: ( rule__Css__Group__3__Impl rule__Css__Group__4 )
            // InternalDsl.g:7558:2: rule__Css__Group__3__Impl rule__Css__Group__4
            {
            pushFollow(FOLLOW_72);
            rule__Css__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Css__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__3"


    // $ANTLR start "rule__Css__Group__3__Impl"
    // InternalDsl.g:7565:1: rule__Css__Group__3__Impl : ( 'type:' ) ;
    public final void rule__Css__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7569:1: ( ( 'type:' ) )
            // InternalDsl.g:7570:1: ( 'type:' )
            {
            // InternalDsl.g:7570:1: ( 'type:' )
            // InternalDsl.g:7571:2: 'type:'
            {
             before(grammarAccess.getCssAccess().getTypeKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCssAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__3__Impl"


    // $ANTLR start "rule__Css__Group__4"
    // InternalDsl.g:7580:1: rule__Css__Group__4 : rule__Css__Group__4__Impl rule__Css__Group__5 ;
    public final void rule__Css__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7584:1: ( rule__Css__Group__4__Impl rule__Css__Group__5 )
            // InternalDsl.g:7585:2: rule__Css__Group__4__Impl rule__Css__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Css__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Css__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__4"


    // $ANTLR start "rule__Css__Group__4__Impl"
    // InternalDsl.g:7592:1: rule__Css__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__Css__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7596:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7597:1: ( RULE_STRING )
            {
            // InternalDsl.g:7597:1: ( RULE_STRING )
            // InternalDsl.g:7598:2: RULE_STRING
            {
             before(grammarAccess.getCssAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCssAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__4__Impl"


    // $ANTLR start "rule__Css__Group__5"
    // InternalDsl.g:7607:1: rule__Css__Group__5 : rule__Css__Group__5__Impl ;
    public final void rule__Css__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7611:1: ( rule__Css__Group__5__Impl )
            // InternalDsl.g:7612:2: rule__Css__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Css__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__5"


    // $ANTLR start "rule__Css__Group__5__Impl"
    // InternalDsl.g:7618:1: rule__Css__Group__5__Impl : ( '}' ) ;
    public final void rule__Css__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7622:1: ( ( '}' ) )
            // InternalDsl.g:7623:1: ( '}' )
            {
            // InternalDsl.g:7623:1: ( '}' )
            // InternalDsl.g:7624:2: '}'
            {
             before(grammarAccess.getCssAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCssAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__Group__5__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalDsl.g:7634:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7638:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalDsl.g:7639:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalDsl.g:7646:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7650:1: ( ( 'state' ) )
            // InternalDsl.g:7651:1: ( 'state' )
            {
            // InternalDsl.g:7651:1: ( 'state' )
            // InternalDsl.g:7652:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalDsl.g:7661:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7665:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalDsl.g:7666:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalDsl.g:7673:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7677:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalDsl.g:7678:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalDsl.g:7678:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalDsl.g:7679:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalDsl.g:7680:2: ( rule__State__NameAssignment_1 )
            // InternalDsl.g:7680:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalDsl.g:7688:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7692:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalDsl.g:7693:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_76);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalDsl.g:7700:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7704:1: ( ( '{' ) )
            // InternalDsl.g:7705:1: ( '{' )
            {
            // InternalDsl.g:7705:1: ( '{' )
            // InternalDsl.g:7706:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalDsl.g:7715:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7719:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalDsl.g:7720:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_76);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalDsl.g:7727:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7731:1: ( ( ( rule__State__Group_3__0 )* ) )
            // InternalDsl.g:7732:1: ( ( rule__State__Group_3__0 )* )
            {
            // InternalDsl.g:7732:1: ( ( rule__State__Group_3__0 )* )
            // InternalDsl.g:7733:2: ( rule__State__Group_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalDsl.g:7734:2: ( rule__State__Group_3__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==88) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDsl.g:7734:3: rule__State__Group_3__0
            	    {
            	    pushFollow(FOLLOW_77);
            	    rule__State__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalDsl.g:7742:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7746:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalDsl.g:7747:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_76);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalDsl.g:7754:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )* ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7758:1: ( ( ( rule__State__Group_4__0 )* ) )
            // InternalDsl.g:7759:1: ( ( rule__State__Group_4__0 )* )
            {
            // InternalDsl.g:7759:1: ( ( rule__State__Group_4__0 )* )
            // InternalDsl.g:7760:2: ( rule__State__Group_4__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalDsl.g:7761:2: ( rule__State__Group_4__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==89) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDsl.g:7761:3: rule__State__Group_4__0
            	    {
            	    pushFollow(FOLLOW_78);
            	    rule__State__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalDsl.g:7769:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7773:1: ( rule__State__Group__5__Impl )
            // InternalDsl.g:7774:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalDsl.g:7780:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7784:1: ( ( '}' ) )
            // InternalDsl.g:7785:1: ( '}' )
            {
            // InternalDsl.g:7785:1: ( '}' )
            // InternalDsl.g:7786:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group_3__0"
    // InternalDsl.g:7796:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7800:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalDsl.g:7801:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0"


    // $ANTLR start "rule__State__Group_3__0__Impl"
    // InternalDsl.g:7808:1: rule__State__Group_3__0__Impl : ( 'handleAction:' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7812:1: ( ( 'handleAction:' ) )
            // InternalDsl.g:7813:1: ( 'handleAction:' )
            {
            // InternalDsl.g:7813:1: ( 'handleAction:' )
            // InternalDsl.g:7814:2: 'handleAction:'
            {
             before(grammarAccess.getStateAccess().getHandleActionKeyword_3_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getHandleActionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0__Impl"


    // $ANTLR start "rule__State__Group_3__1"
    // InternalDsl.g:7823:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7827:1: ( rule__State__Group_3__1__Impl )
            // InternalDsl.g:7828:2: rule__State__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1"


    // $ANTLR start "rule__State__Group_3__1__Impl"
    // InternalDsl.g:7834:1: rule__State__Group_3__1__Impl : ( ( rule__State__ActionAssignment_3_1 ) ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7838:1: ( ( ( rule__State__ActionAssignment_3_1 ) ) )
            // InternalDsl.g:7839:1: ( ( rule__State__ActionAssignment_3_1 ) )
            {
            // InternalDsl.g:7839:1: ( ( rule__State__ActionAssignment_3_1 ) )
            // InternalDsl.g:7840:2: ( rule__State__ActionAssignment_3_1 )
            {
             before(grammarAccess.getStateAccess().getActionAssignment_3_1()); 
            // InternalDsl.g:7841:2: ( rule__State__ActionAssignment_3_1 )
            // InternalDsl.g:7841:3: rule__State__ActionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__State__ActionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1__Impl"


    // $ANTLR start "rule__State__Group_4__0"
    // InternalDsl.g:7850:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7854:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalDsl.g:7855:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0"


    // $ANTLR start "rule__State__Group_4__0__Impl"
    // InternalDsl.g:7862:1: rule__State__Group_4__0__Impl : ( 'handleReducer:' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7866:1: ( ( 'handleReducer:' ) )
            // InternalDsl.g:7867:1: ( 'handleReducer:' )
            {
            // InternalDsl.g:7867:1: ( 'handleReducer:' )
            // InternalDsl.g:7868:2: 'handleReducer:'
            {
             before(grammarAccess.getStateAccess().getHandleReducerKeyword_4_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getHandleReducerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0__Impl"


    // $ANTLR start "rule__State__Group_4__1"
    // InternalDsl.g:7877:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7881:1: ( rule__State__Group_4__1__Impl )
            // InternalDsl.g:7882:2: rule__State__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1"


    // $ANTLR start "rule__State__Group_4__1__Impl"
    // InternalDsl.g:7888:1: rule__State__Group_4__1__Impl : ( ( rule__State__ReducerAssignment_4_1 ) ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7892:1: ( ( ( rule__State__ReducerAssignment_4_1 ) ) )
            // InternalDsl.g:7893:1: ( ( rule__State__ReducerAssignment_4_1 ) )
            {
            // InternalDsl.g:7893:1: ( ( rule__State__ReducerAssignment_4_1 ) )
            // InternalDsl.g:7894:2: ( rule__State__ReducerAssignment_4_1 )
            {
             before(grammarAccess.getStateAccess().getReducerAssignment_4_1()); 
            // InternalDsl.g:7895:2: ( rule__State__ReducerAssignment_4_1 )
            // InternalDsl.g:7895:3: rule__State__ReducerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__State__ReducerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getReducerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalDsl.g:7904:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7908:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalDsl.g:7909:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalDsl.g:7916:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7920:1: ( ( 'action' ) )
            // InternalDsl.g:7921:1: ( 'action' )
            {
            // InternalDsl.g:7921:1: ( 'action' )
            // InternalDsl.g:7922:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalDsl.g:7931:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7935:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalDsl.g:7936:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalDsl.g:7943:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7947:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalDsl.g:7948:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalDsl.g:7948:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalDsl.g:7949:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalDsl.g:7950:2: ( rule__Action__NameAssignment_1 )
            // InternalDsl.g:7950:3: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalDsl.g:7958:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7962:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalDsl.g:7963:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_79);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalDsl.g:7970:1: rule__Action__Group__2__Impl : ( '{' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7974:1: ( ( '{' ) )
            // InternalDsl.g:7975:1: ( '{' )
            {
            // InternalDsl.g:7975:1: ( '{' )
            // InternalDsl.g:7976:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalDsl.g:7985:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7989:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalDsl.g:7990:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_79);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalDsl.g:7997:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )* ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8001:1: ( ( ( rule__Action__Group_3__0 )* ) )
            // InternalDsl.g:8002:1: ( ( rule__Action__Group_3__0 )* )
            {
            // InternalDsl.g:8002:1: ( ( rule__Action__Group_3__0 )* )
            // InternalDsl.g:8003:2: ( rule__Action__Group_3__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // InternalDsl.g:8004:2: ( rule__Action__Group_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==92) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDsl.g:8004:3: rule__Action__Group_3__0
            	    {
            	    pushFollow(FOLLOW_80);
            	    rule__Action__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalDsl.g:8012:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8016:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalDsl.g:8017:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_79);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalDsl.g:8024:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )* ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8028:1: ( ( ( rule__Action__Group_4__0 )* ) )
            // InternalDsl.g:8029:1: ( ( rule__Action__Group_4__0 )* )
            {
            // InternalDsl.g:8029:1: ( ( rule__Action__Group_4__0 )* )
            // InternalDsl.g:8030:2: ( rule__Action__Group_4__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_4()); 
            // InternalDsl.g:8031:2: ( rule__Action__Group_4__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==74) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDsl.g:8031:3: rule__Action__Group_4__0
            	    {
            	    pushFollow(FOLLOW_81);
            	    rule__Action__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalDsl.g:8039:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8043:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalDsl.g:8044:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalDsl.g:8051:1: rule__Action__Group__5__Impl : ( 'actionDirectory:' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8055:1: ( ( 'actionDirectory:' ) )
            // InternalDsl.g:8056:1: ( 'actionDirectory:' )
            {
            // InternalDsl.g:8056:1: ( 'actionDirectory:' )
            // InternalDsl.g:8057:2: 'actionDirectory:'
            {
             before(grammarAccess.getActionAccess().getActionDirectoryKeyword_5()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionDirectoryKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalDsl.g:8066:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8070:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // InternalDsl.g:8071:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Action__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalDsl.g:8078:1: rule__Action__Group__6__Impl : ( ( rule__Action__DirAssignment_6 ) ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8082:1: ( ( ( rule__Action__DirAssignment_6 ) ) )
            // InternalDsl.g:8083:1: ( ( rule__Action__DirAssignment_6 ) )
            {
            // InternalDsl.g:8083:1: ( ( rule__Action__DirAssignment_6 ) )
            // InternalDsl.g:8084:2: ( rule__Action__DirAssignment_6 )
            {
             before(grammarAccess.getActionAccess().getDirAssignment_6()); 
            // InternalDsl.g:8085:2: ( rule__Action__DirAssignment_6 )
            // InternalDsl.g:8085:3: rule__Action__DirAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Action__DirAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDirAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group__7"
    // InternalDsl.g:8093:1: rule__Action__Group__7 : rule__Action__Group__7__Impl ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8097:1: ( rule__Action__Group__7__Impl )
            // InternalDsl.g:8098:2: rule__Action__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7"


    // $ANTLR start "rule__Action__Group__7__Impl"
    // InternalDsl.g:8104:1: rule__Action__Group__7__Impl : ( '}' ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8108:1: ( ( '}' ) )
            // InternalDsl.g:8109:1: ( '}' )
            {
            // InternalDsl.g:8109:1: ( '}' )
            // InternalDsl.g:8110:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7__Impl"


    // $ANTLR start "rule__Action__Group_3__0"
    // InternalDsl.g:8120:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8124:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // InternalDsl.g:8125:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Action__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0"


    // $ANTLR start "rule__Action__Group_3__0__Impl"
    // InternalDsl.g:8132:1: rule__Action__Group_3__0__Impl : ( 'create:' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8136:1: ( ( 'create:' ) )
            // InternalDsl.g:8137:1: ( 'create:' )
            {
            // InternalDsl.g:8137:1: ( 'create:' )
            // InternalDsl.g:8138:2: 'create:'
            {
             before(grammarAccess.getActionAccess().getCreateKeyword_3_0()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCreateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0__Impl"


    // $ANTLR start "rule__Action__Group_3__1"
    // InternalDsl.g:8147:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8151:1: ( rule__Action__Group_3__1__Impl )
            // InternalDsl.g:8152:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1"


    // $ANTLR start "rule__Action__Group_3__1__Impl"
    // InternalDsl.g:8158:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__ActionCreatorAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8162:1: ( ( ( rule__Action__ActionCreatorAssignment_3_1 ) ) )
            // InternalDsl.g:8163:1: ( ( rule__Action__ActionCreatorAssignment_3_1 ) )
            {
            // InternalDsl.g:8163:1: ( ( rule__Action__ActionCreatorAssignment_3_1 ) )
            // InternalDsl.g:8164:2: ( rule__Action__ActionCreatorAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getActionCreatorAssignment_3_1()); 
            // InternalDsl.g:8165:2: ( rule__Action__ActionCreatorAssignment_3_1 )
            // InternalDsl.g:8165:3: rule__Action__ActionCreatorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionCreatorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionCreatorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1__Impl"


    // $ANTLR start "rule__Action__Group_4__0"
    // InternalDsl.g:8174:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8178:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // InternalDsl.g:8179:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Action__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0"


    // $ANTLR start "rule__Action__Group_4__0__Impl"
    // InternalDsl.g:8186:1: rule__Action__Group_4__0__Impl : ( 'dispatch:' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8190:1: ( ( 'dispatch:' ) )
            // InternalDsl.g:8191:1: ( 'dispatch:' )
            {
            // InternalDsl.g:8191:1: ( 'dispatch:' )
            // InternalDsl.g:8192:2: 'dispatch:'
            {
             before(grammarAccess.getActionAccess().getDispatchKeyword_4_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDispatchKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0__Impl"


    // $ANTLR start "rule__Action__Group_4__1"
    // InternalDsl.g:8201:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8205:1: ( rule__Action__Group_4__1__Impl )
            // InternalDsl.g:8206:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1"


    // $ANTLR start "rule__Action__Group_4__1__Impl"
    // InternalDsl.g:8212:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__ActionDispatcherAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8216:1: ( ( ( rule__Action__ActionDispatcherAssignment_4_1 ) ) )
            // InternalDsl.g:8217:1: ( ( rule__Action__ActionDispatcherAssignment_4_1 ) )
            {
            // InternalDsl.g:8217:1: ( ( rule__Action__ActionDispatcherAssignment_4_1 ) )
            // InternalDsl.g:8218:2: ( rule__Action__ActionDispatcherAssignment_4_1 )
            {
             before(grammarAccess.getActionAccess().getActionDispatcherAssignment_4_1()); 
            // InternalDsl.g:8219:2: ( rule__Action__ActionDispatcherAssignment_4_1 )
            // InternalDsl.g:8219:3: rule__Action__ActionDispatcherAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionDispatcherAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionDispatcherAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1__Impl"


    // $ANTLR start "rule__ActionCreator__Group__0"
    // InternalDsl.g:8228:1: rule__ActionCreator__Group__0 : rule__ActionCreator__Group__0__Impl rule__ActionCreator__Group__1 ;
    public final void rule__ActionCreator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8232:1: ( rule__ActionCreator__Group__0__Impl rule__ActionCreator__Group__1 )
            // InternalDsl.g:8233:2: rule__ActionCreator__Group__0__Impl rule__ActionCreator__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ActionCreator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCreator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__0"


    // $ANTLR start "rule__ActionCreator__Group__0__Impl"
    // InternalDsl.g:8240:1: rule__ActionCreator__Group__0__Impl : ( 'actionCreator' ) ;
    public final void rule__ActionCreator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8244:1: ( ( 'actionCreator' ) )
            // InternalDsl.g:8245:1: ( 'actionCreator' )
            {
            // InternalDsl.g:8245:1: ( 'actionCreator' )
            // InternalDsl.g:8246:2: 'actionCreator'
            {
             before(grammarAccess.getActionCreatorAccess().getActionCreatorKeyword_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getActionCreatorAccess().getActionCreatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__0__Impl"


    // $ANTLR start "rule__ActionCreator__Group__1"
    // InternalDsl.g:8255:1: rule__ActionCreator__Group__1 : rule__ActionCreator__Group__1__Impl rule__ActionCreator__Group__2 ;
    public final void rule__ActionCreator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8259:1: ( rule__ActionCreator__Group__1__Impl rule__ActionCreator__Group__2 )
            // InternalDsl.g:8260:2: rule__ActionCreator__Group__1__Impl rule__ActionCreator__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ActionCreator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCreator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__1"


    // $ANTLR start "rule__ActionCreator__Group__1__Impl"
    // InternalDsl.g:8267:1: rule__ActionCreator__Group__1__Impl : ( ( rule__ActionCreator__NameAssignment_1 ) ) ;
    public final void rule__ActionCreator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8271:1: ( ( ( rule__ActionCreator__NameAssignment_1 ) ) )
            // InternalDsl.g:8272:1: ( ( rule__ActionCreator__NameAssignment_1 ) )
            {
            // InternalDsl.g:8272:1: ( ( rule__ActionCreator__NameAssignment_1 ) )
            // InternalDsl.g:8273:2: ( rule__ActionCreator__NameAssignment_1 )
            {
             before(grammarAccess.getActionCreatorAccess().getNameAssignment_1()); 
            // InternalDsl.g:8274:2: ( rule__ActionCreator__NameAssignment_1 )
            // InternalDsl.g:8274:3: rule__ActionCreator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionCreator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionCreatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__1__Impl"


    // $ANTLR start "rule__ActionCreator__Group__2"
    // InternalDsl.g:8282:1: rule__ActionCreator__Group__2 : rule__ActionCreator__Group__2__Impl rule__ActionCreator__Group__3 ;
    public final void rule__ActionCreator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8286:1: ( rule__ActionCreator__Group__2__Impl rule__ActionCreator__Group__3 )
            // InternalDsl.g:8287:2: rule__ActionCreator__Group__2__Impl rule__ActionCreator__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ActionCreator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCreator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__2"


    // $ANTLR start "rule__ActionCreator__Group__2__Impl"
    // InternalDsl.g:8294:1: rule__ActionCreator__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionCreator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8298:1: ( ( '{' ) )
            // InternalDsl.g:8299:1: ( '{' )
            {
            // InternalDsl.g:8299:1: ( '{' )
            // InternalDsl.g:8300:2: '{'
            {
             before(grammarAccess.getActionCreatorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getActionCreatorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__2__Impl"


    // $ANTLR start "rule__ActionCreator__Group__3"
    // InternalDsl.g:8309:1: rule__ActionCreator__Group__3 : rule__ActionCreator__Group__3__Impl rule__ActionCreator__Group__4 ;
    public final void rule__ActionCreator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8313:1: ( rule__ActionCreator__Group__3__Impl rule__ActionCreator__Group__4 )
            // InternalDsl.g:8314:2: rule__ActionCreator__Group__3__Impl rule__ActionCreator__Group__4
            {
            pushFollow(FOLLOW_72);
            rule__ActionCreator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCreator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__3"


    // $ANTLR start "rule__ActionCreator__Group__3__Impl"
    // InternalDsl.g:8321:1: rule__ActionCreator__Group__3__Impl : ( 'type:' ) ;
    public final void rule__ActionCreator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8325:1: ( ( 'type:' ) )
            // InternalDsl.g:8326:1: ( 'type:' )
            {
            // InternalDsl.g:8326:1: ( 'type:' )
            // InternalDsl.g:8327:2: 'type:'
            {
             before(grammarAccess.getActionCreatorAccess().getTypeKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getActionCreatorAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__3__Impl"


    // $ANTLR start "rule__ActionCreator__Group__4"
    // InternalDsl.g:8336:1: rule__ActionCreator__Group__4 : rule__ActionCreator__Group__4__Impl rule__ActionCreator__Group__5 ;
    public final void rule__ActionCreator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8340:1: ( rule__ActionCreator__Group__4__Impl rule__ActionCreator__Group__5 )
            // InternalDsl.g:8341:2: rule__ActionCreator__Group__4__Impl rule__ActionCreator__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ActionCreator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCreator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__4"


    // $ANTLR start "rule__ActionCreator__Group__4__Impl"
    // InternalDsl.g:8348:1: rule__ActionCreator__Group__4__Impl : ( RULE_STRING ) ;
    public final void rule__ActionCreator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8352:1: ( ( RULE_STRING ) )
            // InternalDsl.g:8353:1: ( RULE_STRING )
            {
            // InternalDsl.g:8353:1: ( RULE_STRING )
            // InternalDsl.g:8354:2: RULE_STRING
            {
             before(grammarAccess.getActionCreatorAccess().getSTRINGTerminalRuleCall_4()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionCreatorAccess().getSTRINGTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__4__Impl"


    // $ANTLR start "rule__ActionCreator__Group__5"
    // InternalDsl.g:8363:1: rule__ActionCreator__Group__5 : rule__ActionCreator__Group__5__Impl ;
    public final void rule__ActionCreator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8367:1: ( rule__ActionCreator__Group__5__Impl )
            // InternalDsl.g:8368:2: rule__ActionCreator__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionCreator__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__5"


    // $ANTLR start "rule__ActionCreator__Group__5__Impl"
    // InternalDsl.g:8374:1: rule__ActionCreator__Group__5__Impl : ( '}' ) ;
    public final void rule__ActionCreator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8378:1: ( ( '}' ) )
            // InternalDsl.g:8379:1: ( '}' )
            {
            // InternalDsl.g:8379:1: ( '}' )
            // InternalDsl.g:8380:2: '}'
            {
             before(grammarAccess.getActionCreatorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActionCreatorAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__Group__5__Impl"


    // $ANTLR start "rule__ActionDispatcher__Group__0"
    // InternalDsl.g:8390:1: rule__ActionDispatcher__Group__0 : rule__ActionDispatcher__Group__0__Impl rule__ActionDispatcher__Group__1 ;
    public final void rule__ActionDispatcher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8394:1: ( rule__ActionDispatcher__Group__0__Impl rule__ActionDispatcher__Group__1 )
            // InternalDsl.g:8395:2: rule__ActionDispatcher__Group__0__Impl rule__ActionDispatcher__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ActionDispatcher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__0"


    // $ANTLR start "rule__ActionDispatcher__Group__0__Impl"
    // InternalDsl.g:8402:1: rule__ActionDispatcher__Group__0__Impl : ( 'actionDispatcher' ) ;
    public final void rule__ActionDispatcher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8406:1: ( ( 'actionDispatcher' ) )
            // InternalDsl.g:8407:1: ( 'actionDispatcher' )
            {
            // InternalDsl.g:8407:1: ( 'actionDispatcher' )
            // InternalDsl.g:8408:2: 'actionDispatcher'
            {
             before(grammarAccess.getActionDispatcherAccess().getActionDispatcherKeyword_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getActionDispatcherAccess().getActionDispatcherKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__0__Impl"


    // $ANTLR start "rule__ActionDispatcher__Group__1"
    // InternalDsl.g:8417:1: rule__ActionDispatcher__Group__1 : rule__ActionDispatcher__Group__1__Impl rule__ActionDispatcher__Group__2 ;
    public final void rule__ActionDispatcher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8421:1: ( rule__ActionDispatcher__Group__1__Impl rule__ActionDispatcher__Group__2 )
            // InternalDsl.g:8422:2: rule__ActionDispatcher__Group__1__Impl rule__ActionDispatcher__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ActionDispatcher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__1"


    // $ANTLR start "rule__ActionDispatcher__Group__1__Impl"
    // InternalDsl.g:8429:1: rule__ActionDispatcher__Group__1__Impl : ( ( rule__ActionDispatcher__NameAssignment_1 ) ) ;
    public final void rule__ActionDispatcher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8433:1: ( ( ( rule__ActionDispatcher__NameAssignment_1 ) ) )
            // InternalDsl.g:8434:1: ( ( rule__ActionDispatcher__NameAssignment_1 ) )
            {
            // InternalDsl.g:8434:1: ( ( rule__ActionDispatcher__NameAssignment_1 ) )
            // InternalDsl.g:8435:2: ( rule__ActionDispatcher__NameAssignment_1 )
            {
             before(grammarAccess.getActionDispatcherAccess().getNameAssignment_1()); 
            // InternalDsl.g:8436:2: ( rule__ActionDispatcher__NameAssignment_1 )
            // InternalDsl.g:8436:3: rule__ActionDispatcher__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionDispatcherAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__1__Impl"


    // $ANTLR start "rule__ActionDispatcher__Group__2"
    // InternalDsl.g:8444:1: rule__ActionDispatcher__Group__2 : rule__ActionDispatcher__Group__2__Impl rule__ActionDispatcher__Group__3 ;
    public final void rule__ActionDispatcher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8448:1: ( rule__ActionDispatcher__Group__2__Impl rule__ActionDispatcher__Group__3 )
            // InternalDsl.g:8449:2: rule__ActionDispatcher__Group__2__Impl rule__ActionDispatcher__Group__3
            {
            pushFollow(FOLLOW_82);
            rule__ActionDispatcher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__2"


    // $ANTLR start "rule__ActionDispatcher__Group__2__Impl"
    // InternalDsl.g:8456:1: rule__ActionDispatcher__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionDispatcher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8460:1: ( ( '{' ) )
            // InternalDsl.g:8461:1: ( '{' )
            {
            // InternalDsl.g:8461:1: ( '{' )
            // InternalDsl.g:8462:2: '{'
            {
             before(grammarAccess.getActionDispatcherAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getActionDispatcherAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__2__Impl"


    // $ANTLR start "rule__ActionDispatcher__Group__3"
    // InternalDsl.g:8471:1: rule__ActionDispatcher__Group__3 : rule__ActionDispatcher__Group__3__Impl rule__ActionDispatcher__Group__4 ;
    public final void rule__ActionDispatcher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8475:1: ( rule__ActionDispatcher__Group__3__Impl rule__ActionDispatcher__Group__4 )
            // InternalDsl.g:8476:2: rule__ActionDispatcher__Group__3__Impl rule__ActionDispatcher__Group__4
            {
            pushFollow(FOLLOW_82);
            rule__ActionDispatcher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__3"


    // $ANTLR start "rule__ActionDispatcher__Group__3__Impl"
    // InternalDsl.g:8483:1: rule__ActionDispatcher__Group__3__Impl : ( ( rule__ActionDispatcher__Group_3__0 )* ) ;
    public final void rule__ActionDispatcher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8487:1: ( ( ( rule__ActionDispatcher__Group_3__0 )* ) )
            // InternalDsl.g:8488:1: ( ( rule__ActionDispatcher__Group_3__0 )* )
            {
            // InternalDsl.g:8488:1: ( ( rule__ActionDispatcher__Group_3__0 )* )
            // InternalDsl.g:8489:2: ( rule__ActionDispatcher__Group_3__0 )*
            {
             before(grammarAccess.getActionDispatcherAccess().getGroup_3()); 
            // InternalDsl.g:8490:2: ( rule__ActionDispatcher__Group_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==62) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDsl.g:8490:3: rule__ActionDispatcher__Group_3__0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__ActionDispatcher__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getActionDispatcherAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__3__Impl"


    // $ANTLR start "rule__ActionDispatcher__Group__4"
    // InternalDsl.g:8498:1: rule__ActionDispatcher__Group__4 : rule__ActionDispatcher__Group__4__Impl ;
    public final void rule__ActionDispatcher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8502:1: ( rule__ActionDispatcher__Group__4__Impl )
            // InternalDsl.g:8503:2: rule__ActionDispatcher__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__4"


    // $ANTLR start "rule__ActionDispatcher__Group__4__Impl"
    // InternalDsl.g:8509:1: rule__ActionDispatcher__Group__4__Impl : ( '}' ) ;
    public final void rule__ActionDispatcher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8513:1: ( ( '}' ) )
            // InternalDsl.g:8514:1: ( '}' )
            {
            // InternalDsl.g:8514:1: ( '}' )
            // InternalDsl.g:8515:2: '}'
            {
             before(grammarAccess.getActionDispatcherAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActionDispatcherAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group__4__Impl"


    // $ANTLR start "rule__ActionDispatcher__Group_3__0"
    // InternalDsl.g:8525:1: rule__ActionDispatcher__Group_3__0 : rule__ActionDispatcher__Group_3__0__Impl rule__ActionDispatcher__Group_3__1 ;
    public final void rule__ActionDispatcher__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8529:1: ( rule__ActionDispatcher__Group_3__0__Impl rule__ActionDispatcher__Group_3__1 )
            // InternalDsl.g:8530:2: rule__ActionDispatcher__Group_3__0__Impl rule__ActionDispatcher__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ActionDispatcher__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group_3__0"


    // $ANTLR start "rule__ActionDispatcher__Group_3__0__Impl"
    // InternalDsl.g:8537:1: rule__ActionDispatcher__Group_3__0__Impl : ( 'use:' ) ;
    public final void rule__ActionDispatcher__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8541:1: ( ( 'use:' ) )
            // InternalDsl.g:8542:1: ( 'use:' )
            {
            // InternalDsl.g:8542:1: ( 'use:' )
            // InternalDsl.g:8543:2: 'use:'
            {
             before(grammarAccess.getActionDispatcherAccess().getUseKeyword_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getActionDispatcherAccess().getUseKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group_3__0__Impl"


    // $ANTLR start "rule__ActionDispatcher__Group_3__1"
    // InternalDsl.g:8552:1: rule__ActionDispatcher__Group_3__1 : rule__ActionDispatcher__Group_3__1__Impl ;
    public final void rule__ActionDispatcher__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8556:1: ( rule__ActionDispatcher__Group_3__1__Impl )
            // InternalDsl.g:8557:2: rule__ActionDispatcher__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group_3__1"


    // $ANTLR start "rule__ActionDispatcher__Group_3__1__Impl"
    // InternalDsl.g:8563:1: rule__ActionDispatcher__Group_3__1__Impl : ( ( rule__ActionDispatcher__TypeAssignment_3_1 ) ) ;
    public final void rule__ActionDispatcher__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8567:1: ( ( ( rule__ActionDispatcher__TypeAssignment_3_1 ) ) )
            // InternalDsl.g:8568:1: ( ( rule__ActionDispatcher__TypeAssignment_3_1 ) )
            {
            // InternalDsl.g:8568:1: ( ( rule__ActionDispatcher__TypeAssignment_3_1 ) )
            // InternalDsl.g:8569:2: ( rule__ActionDispatcher__TypeAssignment_3_1 )
            {
             before(grammarAccess.getActionDispatcherAccess().getTypeAssignment_3_1()); 
            // InternalDsl.g:8570:2: ( rule__ActionDispatcher__TypeAssignment_3_1 )
            // InternalDsl.g:8570:3: rule__ActionDispatcher__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionDispatcher__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionDispatcherAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__Group_3__1__Impl"


    // $ANTLR start "rule__Reducer__Group__0"
    // InternalDsl.g:8579:1: rule__Reducer__Group__0 : rule__Reducer__Group__0__Impl rule__Reducer__Group__1 ;
    public final void rule__Reducer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8583:1: ( rule__Reducer__Group__0__Impl rule__Reducer__Group__1 )
            // InternalDsl.g:8584:2: rule__Reducer__Group__0__Impl rule__Reducer__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Reducer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reducer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__0"


    // $ANTLR start "rule__Reducer__Group__0__Impl"
    // InternalDsl.g:8591:1: rule__Reducer__Group__0__Impl : ( 'reducer' ) ;
    public final void rule__Reducer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8595:1: ( ( 'reducer' ) )
            // InternalDsl.g:8596:1: ( 'reducer' )
            {
            // InternalDsl.g:8596:1: ( 'reducer' )
            // InternalDsl.g:8597:2: 'reducer'
            {
             before(grammarAccess.getReducerAccess().getReducerKeyword_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getReducerAccess().getReducerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__0__Impl"


    // $ANTLR start "rule__Reducer__Group__1"
    // InternalDsl.g:8606:1: rule__Reducer__Group__1 : rule__Reducer__Group__1__Impl rule__Reducer__Group__2 ;
    public final void rule__Reducer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8610:1: ( rule__Reducer__Group__1__Impl rule__Reducer__Group__2 )
            // InternalDsl.g:8611:2: rule__Reducer__Group__1__Impl rule__Reducer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Reducer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reducer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__1"


    // $ANTLR start "rule__Reducer__Group__1__Impl"
    // InternalDsl.g:8618:1: rule__Reducer__Group__1__Impl : ( ( rule__Reducer__NameAssignment_1 ) ) ;
    public final void rule__Reducer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8622:1: ( ( ( rule__Reducer__NameAssignment_1 ) ) )
            // InternalDsl.g:8623:1: ( ( rule__Reducer__NameAssignment_1 ) )
            {
            // InternalDsl.g:8623:1: ( ( rule__Reducer__NameAssignment_1 ) )
            // InternalDsl.g:8624:2: ( rule__Reducer__NameAssignment_1 )
            {
             before(grammarAccess.getReducerAccess().getNameAssignment_1()); 
            // InternalDsl.g:8625:2: ( rule__Reducer__NameAssignment_1 )
            // InternalDsl.g:8625:3: rule__Reducer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reducer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReducerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__1__Impl"


    // $ANTLR start "rule__Reducer__Group__2"
    // InternalDsl.g:8633:1: rule__Reducer__Group__2 : rule__Reducer__Group__2__Impl rule__Reducer__Group__3 ;
    public final void rule__Reducer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8637:1: ( rule__Reducer__Group__2__Impl rule__Reducer__Group__3 )
            // InternalDsl.g:8638:2: rule__Reducer__Group__2__Impl rule__Reducer__Group__3
            {
            pushFollow(FOLLOW_83);
            rule__Reducer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reducer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__2"


    // $ANTLR start "rule__Reducer__Group__2__Impl"
    // InternalDsl.g:8645:1: rule__Reducer__Group__2__Impl : ( '{' ) ;
    public final void rule__Reducer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8649:1: ( ( '{' ) )
            // InternalDsl.g:8650:1: ( '{' )
            {
            // InternalDsl.g:8650:1: ( '{' )
            // InternalDsl.g:8651:2: '{'
            {
             before(grammarAccess.getReducerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReducerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__2__Impl"


    // $ANTLR start "rule__Reducer__Group__3"
    // InternalDsl.g:8660:1: rule__Reducer__Group__3 : rule__Reducer__Group__3__Impl rule__Reducer__Group__4 ;
    public final void rule__Reducer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8664:1: ( rule__Reducer__Group__3__Impl rule__Reducer__Group__4 )
            // InternalDsl.g:8665:2: rule__Reducer__Group__3__Impl rule__Reducer__Group__4
            {
            pushFollow(FOLLOW_84);
            rule__Reducer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reducer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__3"


    // $ANTLR start "rule__Reducer__Group__3__Impl"
    // InternalDsl.g:8672:1: rule__Reducer__Group__3__Impl : ( ( ( rule__Reducer__Group_3__0 ) ) ( ( rule__Reducer__Group_3__0 )* ) ) ;
    public final void rule__Reducer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8676:1: ( ( ( ( rule__Reducer__Group_3__0 ) ) ( ( rule__Reducer__Group_3__0 )* ) ) )
            // InternalDsl.g:8677:1: ( ( ( rule__Reducer__Group_3__0 ) ) ( ( rule__Reducer__Group_3__0 )* ) )
            {
            // InternalDsl.g:8677:1: ( ( ( rule__Reducer__Group_3__0 ) ) ( ( rule__Reducer__Group_3__0 )* ) )
            // InternalDsl.g:8678:2: ( ( rule__Reducer__Group_3__0 ) ) ( ( rule__Reducer__Group_3__0 )* )
            {
            // InternalDsl.g:8678:2: ( ( rule__Reducer__Group_3__0 ) )
            // InternalDsl.g:8679:3: ( rule__Reducer__Group_3__0 )
            {
             before(grammarAccess.getReducerAccess().getGroup_3()); 
            // InternalDsl.g:8680:3: ( rule__Reducer__Group_3__0 )
            // InternalDsl.g:8680:4: rule__Reducer__Group_3__0
            {
            pushFollow(FOLLOW_85);
            rule__Reducer__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getReducerAccess().getGroup_3()); 

            }

            // InternalDsl.g:8683:2: ( ( rule__Reducer__Group_3__0 )* )
            // InternalDsl.g:8684:3: ( rule__Reducer__Group_3__0 )*
            {
             before(grammarAccess.getReducerAccess().getGroup_3()); 
            // InternalDsl.g:8685:3: ( rule__Reducer__Group_3__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==97) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDsl.g:8685:4: rule__Reducer__Group_3__0
            	    {
            	    pushFollow(FOLLOW_85);
            	    rule__Reducer__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getReducerAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__3__Impl"


    // $ANTLR start "rule__Reducer__Group__4"
    // InternalDsl.g:8694:1: rule__Reducer__Group__4 : rule__Reducer__Group__4__Impl rule__Reducer__Group__5 ;
    public final void rule__Reducer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8698:1: ( rule__Reducer__Group__4__Impl rule__Reducer__Group__5 )
            // InternalDsl.g:8699:2: rule__Reducer__Group__4__Impl rule__Reducer__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Reducer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reducer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__4"


    // $ANTLR start "rule__Reducer__Group__4__Impl"
    // InternalDsl.g:8706:1: rule__Reducer__Group__4__Impl : ( 'reducerDirectory:' ) ;
    public final void rule__Reducer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8710:1: ( ( 'reducerDirectory:' ) )
            // InternalDsl.g:8711:1: ( 'reducerDirectory:' )
            {
            // InternalDsl.g:8711:1: ( 'reducerDirectory:' )
            // InternalDsl.g:8712:2: 'reducerDirectory:'
            {
             before(grammarAccess.getReducerAccess().getReducerDirectoryKeyword_4()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getReducerAccess().getReducerDirectoryKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__4__Impl"


    // $ANTLR start "rule__Reducer__Group__5"
    // InternalDsl.g:8721:1: rule__Reducer__Group__5 : rule__Reducer__Group__5__Impl rule__Reducer__Group__6 ;
    public final void rule__Reducer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8725:1: ( rule__Reducer__Group__5__Impl rule__Reducer__Group__6 )
            // InternalDsl.g:8726:2: rule__Reducer__Group__5__Impl rule__Reducer__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Reducer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reducer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__5"


    // $ANTLR start "rule__Reducer__Group__5__Impl"
    // InternalDsl.g:8733:1: rule__Reducer__Group__5__Impl : ( ( rule__Reducer__TypeAssignment_5 ) ) ;
    public final void rule__Reducer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8737:1: ( ( ( rule__Reducer__TypeAssignment_5 ) ) )
            // InternalDsl.g:8738:1: ( ( rule__Reducer__TypeAssignment_5 ) )
            {
            // InternalDsl.g:8738:1: ( ( rule__Reducer__TypeAssignment_5 ) )
            // InternalDsl.g:8739:2: ( rule__Reducer__TypeAssignment_5 )
            {
             before(grammarAccess.getReducerAccess().getTypeAssignment_5()); 
            // InternalDsl.g:8740:2: ( rule__Reducer__TypeAssignment_5 )
            // InternalDsl.g:8740:3: rule__Reducer__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Reducer__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReducerAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__5__Impl"


    // $ANTLR start "rule__Reducer__Group__6"
    // InternalDsl.g:8748:1: rule__Reducer__Group__6 : rule__Reducer__Group__6__Impl ;
    public final void rule__Reducer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8752:1: ( rule__Reducer__Group__6__Impl )
            // InternalDsl.g:8753:2: rule__Reducer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reducer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__6"


    // $ANTLR start "rule__Reducer__Group__6__Impl"
    // InternalDsl.g:8759:1: rule__Reducer__Group__6__Impl : ( '}' ) ;
    public final void rule__Reducer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8763:1: ( ( '}' ) )
            // InternalDsl.g:8764:1: ( '}' )
            {
            // InternalDsl.g:8764:1: ( '}' )
            // InternalDsl.g:8765:2: '}'
            {
             before(grammarAccess.getReducerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReducerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group__6__Impl"


    // $ANTLR start "rule__Reducer__Group_3__0"
    // InternalDsl.g:8775:1: rule__Reducer__Group_3__0 : rule__Reducer__Group_3__0__Impl rule__Reducer__Group_3__1 ;
    public final void rule__Reducer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8779:1: ( rule__Reducer__Group_3__0__Impl rule__Reducer__Group_3__1 )
            // InternalDsl.g:8780:2: rule__Reducer__Group_3__0__Impl rule__Reducer__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Reducer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reducer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group_3__0"


    // $ANTLR start "rule__Reducer__Group_3__0__Impl"
    // InternalDsl.g:8787:1: rule__Reducer__Group_3__0__Impl : ( 'catch:' ) ;
    public final void rule__Reducer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8791:1: ( ( 'catch:' ) )
            // InternalDsl.g:8792:1: ( 'catch:' )
            {
            // InternalDsl.g:8792:1: ( 'catch:' )
            // InternalDsl.g:8793:2: 'catch:'
            {
             before(grammarAccess.getReducerAccess().getCatchKeyword_3_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getReducerAccess().getCatchKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group_3__0__Impl"


    // $ANTLR start "rule__Reducer__Group_3__1"
    // InternalDsl.g:8802:1: rule__Reducer__Group_3__1 : rule__Reducer__Group_3__1__Impl ;
    public final void rule__Reducer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8806:1: ( rule__Reducer__Group_3__1__Impl )
            // InternalDsl.g:8807:2: rule__Reducer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reducer__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group_3__1"


    // $ANTLR start "rule__Reducer__Group_3__1__Impl"
    // InternalDsl.g:8813:1: rule__Reducer__Group_3__1__Impl : ( ( rule__Reducer__TypeAssignment_3_1 ) ) ;
    public final void rule__Reducer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8817:1: ( ( ( rule__Reducer__TypeAssignment_3_1 ) ) )
            // InternalDsl.g:8818:1: ( ( rule__Reducer__TypeAssignment_3_1 ) )
            {
            // InternalDsl.g:8818:1: ( ( rule__Reducer__TypeAssignment_3_1 ) )
            // InternalDsl.g:8819:2: ( rule__Reducer__TypeAssignment_3_1 )
            {
             before(grammarAccess.getReducerAccess().getTypeAssignment_3_1()); 
            // InternalDsl.g:8820:2: ( rule__Reducer__TypeAssignment_3_1 )
            // InternalDsl.g:8820:3: rule__Reducer__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Reducer__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReducerAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__Group_3__1__Impl"


    // $ANTLR start "rule__JsModule__Group__0"
    // InternalDsl.g:8829:1: rule__JsModule__Group__0 : rule__JsModule__Group__0__Impl rule__JsModule__Group__1 ;
    public final void rule__JsModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8833:1: ( rule__JsModule__Group__0__Impl rule__JsModule__Group__1 )
            // InternalDsl.g:8834:2: rule__JsModule__Group__0__Impl rule__JsModule__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__JsModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsModule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__0"


    // $ANTLR start "rule__JsModule__Group__0__Impl"
    // InternalDsl.g:8841:1: rule__JsModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__JsModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8845:1: ( ( 'module' ) )
            // InternalDsl.g:8846:1: ( 'module' )
            {
            // InternalDsl.g:8846:1: ( 'module' )
            // InternalDsl.g:8847:2: 'module'
            {
             before(grammarAccess.getJsModuleAccess().getModuleKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getJsModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__0__Impl"


    // $ANTLR start "rule__JsModule__Group__1"
    // InternalDsl.g:8856:1: rule__JsModule__Group__1 : rule__JsModule__Group__1__Impl rule__JsModule__Group__2 ;
    public final void rule__JsModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8860:1: ( rule__JsModule__Group__1__Impl rule__JsModule__Group__2 )
            // InternalDsl.g:8861:2: rule__JsModule__Group__1__Impl rule__JsModule__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__JsModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsModule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__1"


    // $ANTLR start "rule__JsModule__Group__1__Impl"
    // InternalDsl.g:8868:1: rule__JsModule__Group__1__Impl : ( ( rule__JsModule__NameAssignment_1 ) ) ;
    public final void rule__JsModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8872:1: ( ( ( rule__JsModule__NameAssignment_1 ) ) )
            // InternalDsl.g:8873:1: ( ( rule__JsModule__NameAssignment_1 ) )
            {
            // InternalDsl.g:8873:1: ( ( rule__JsModule__NameAssignment_1 ) )
            // InternalDsl.g:8874:2: ( rule__JsModule__NameAssignment_1 )
            {
             before(grammarAccess.getJsModuleAccess().getNameAssignment_1()); 
            // InternalDsl.g:8875:2: ( rule__JsModule__NameAssignment_1 )
            // InternalDsl.g:8875:3: rule__JsModule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JsModule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJsModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__1__Impl"


    // $ANTLR start "rule__JsModule__Group__2"
    // InternalDsl.g:8883:1: rule__JsModule__Group__2 : rule__JsModule__Group__2__Impl rule__JsModule__Group__3 ;
    public final void rule__JsModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8887:1: ( rule__JsModule__Group__2__Impl rule__JsModule__Group__3 )
            // InternalDsl.g:8888:2: rule__JsModule__Group__2__Impl rule__JsModule__Group__3
            {
            pushFollow(FOLLOW_86);
            rule__JsModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsModule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__2"


    // $ANTLR start "rule__JsModule__Group__2__Impl"
    // InternalDsl.g:8895:1: rule__JsModule__Group__2__Impl : ( '{' ) ;
    public final void rule__JsModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8899:1: ( ( '{' ) )
            // InternalDsl.g:8900:1: ( '{' )
            {
            // InternalDsl.g:8900:1: ( '{' )
            // InternalDsl.g:8901:2: '{'
            {
             before(grammarAccess.getJsModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJsModuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__2__Impl"


    // $ANTLR start "rule__JsModule__Group__3"
    // InternalDsl.g:8910:1: rule__JsModule__Group__3 : rule__JsModule__Group__3__Impl rule__JsModule__Group__4 ;
    public final void rule__JsModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8914:1: ( rule__JsModule__Group__3__Impl rule__JsModule__Group__4 )
            // InternalDsl.g:8915:2: rule__JsModule__Group__3__Impl rule__JsModule__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__JsModule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsModule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__3"


    // $ANTLR start "rule__JsModule__Group__3__Impl"
    // InternalDsl.g:8922:1: rule__JsModule__Group__3__Impl : ( 'presentIn:' ) ;
    public final void rule__JsModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8926:1: ( ( 'presentIn:' ) )
            // InternalDsl.g:8927:1: ( 'presentIn:' )
            {
            // InternalDsl.g:8927:1: ( 'presentIn:' )
            // InternalDsl.g:8928:2: 'presentIn:'
            {
             before(grammarAccess.getJsModuleAccess().getPresentInKeyword_3()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getJsModuleAccess().getPresentInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__3__Impl"


    // $ANTLR start "rule__JsModule__Group__4"
    // InternalDsl.g:8937:1: rule__JsModule__Group__4 : rule__JsModule__Group__4__Impl rule__JsModule__Group__5 ;
    public final void rule__JsModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8941:1: ( rule__JsModule__Group__4__Impl rule__JsModule__Group__5 )
            // InternalDsl.g:8942:2: rule__JsModule__Group__4__Impl rule__JsModule__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__JsModule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsModule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__4"


    // $ANTLR start "rule__JsModule__Group__4__Impl"
    // InternalDsl.g:8949:1: rule__JsModule__Group__4__Impl : ( ( rule__JsModule__TypeAssignment_4 ) ) ;
    public final void rule__JsModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8953:1: ( ( ( rule__JsModule__TypeAssignment_4 ) ) )
            // InternalDsl.g:8954:1: ( ( rule__JsModule__TypeAssignment_4 ) )
            {
            // InternalDsl.g:8954:1: ( ( rule__JsModule__TypeAssignment_4 ) )
            // InternalDsl.g:8955:2: ( rule__JsModule__TypeAssignment_4 )
            {
             before(grammarAccess.getJsModuleAccess().getTypeAssignment_4()); 
            // InternalDsl.g:8956:2: ( rule__JsModule__TypeAssignment_4 )
            // InternalDsl.g:8956:3: rule__JsModule__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__JsModule__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJsModuleAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__4__Impl"


    // $ANTLR start "rule__JsModule__Group__5"
    // InternalDsl.g:8964:1: rule__JsModule__Group__5 : rule__JsModule__Group__5__Impl ;
    public final void rule__JsModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8968:1: ( rule__JsModule__Group__5__Impl )
            // InternalDsl.g:8969:2: rule__JsModule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsModule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__5"


    // $ANTLR start "rule__JsModule__Group__5__Impl"
    // InternalDsl.g:8975:1: rule__JsModule__Group__5__Impl : ( '}' ) ;
    public final void rule__JsModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8979:1: ( ( '}' ) )
            // InternalDsl.g:8980:1: ( '}' )
            {
            // InternalDsl.g:8980:1: ( '}' )
            // InternalDsl.g:8981:2: '}'
            {
             before(grammarAccess.getJsModuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getJsModuleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__Group__5__Impl"


    // $ANTLR start "rule__System__DomAssignment_2"
    // InternalDsl.g:8991:1: rule__System__DomAssignment_2 : ( ruleDomain ) ;
    public final void rule__System__DomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8995:1: ( ( ruleDomain ) )
            // InternalDsl.g:8996:2: ( ruleDomain )
            {
            // InternalDsl.g:8996:2: ( ruleDomain )
            // InternalDsl.g:8997:3: ruleDomain
            {
             before(grammarAccess.getSystemAccess().getDomDomainParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getDomDomainParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__DomAssignment_2"


    // $ANTLR start "rule__System__ArchAssignment_3"
    // InternalDsl.g:9006:1: rule__System__ArchAssignment_3 : ( ruleArchitecture ) ;
    public final void rule__System__ArchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9010:1: ( ( ruleArchitecture ) )
            // InternalDsl.g:9011:2: ( ruleArchitecture )
            {
            // InternalDsl.g:9011:2: ( ruleArchitecture )
            // InternalDsl.g:9012:3: ruleArchitecture
            {
             before(grammarAccess.getSystemAccess().getArchArchitectureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getArchArchitectureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ArchAssignment_3"


    // $ANTLR start "rule__System__TechAssignment_4"
    // InternalDsl.g:9021:1: rule__System__TechAssignment_4 : ( ruleTechnology ) ;
    public final void rule__System__TechAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9025:1: ( ( ruleTechnology ) )
            // InternalDsl.g:9026:2: ( ruleTechnology )
            {
            // InternalDsl.g:9026:2: ( ruleTechnology )
            // InternalDsl.g:9027:3: ruleTechnology
            {
             before(grammarAccess.getSystemAccess().getTechTechnologyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTechnology();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getTechTechnologyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__TechAssignment_4"


    // $ANTLR start "rule__Domain__TypesAssignment_2"
    // InternalDsl.g:9036:1: rule__Domain__TypesAssignment_2 : ( ruleType ) ;
    public final void rule__Domain__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9040:1: ( ( ruleType ) )
            // InternalDsl.g:9041:2: ( ruleType )
            {
            // InternalDsl.g:9041:2: ( ruleType )
            // InternalDsl.g:9042:3: ruleType
            {
             before(grammarAccess.getDomainAccess().getTypesTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getTypesTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__TypesAssignment_2"


    // $ANTLR start "rule__Domain__ModulesAssignment_3"
    // InternalDsl.g:9051:1: rule__Domain__ModulesAssignment_3 : ( ruleModule ) ;
    public final void rule__Domain__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9055:1: ( ( ruleModule ) )
            // InternalDsl.g:9056:2: ( ruleModule )
            {
            // InternalDsl.g:9056:2: ( ruleModule )
            // InternalDsl.g:9057:3: ruleModule
            {
             before(grammarAccess.getDomainAccess().getModulesModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getModulesModuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ModulesAssignment_3"


    // $ANTLR start "rule__Domain__RelationsAssignment_4"
    // InternalDsl.g:9066:1: rule__Domain__RelationsAssignment_4 : ( ruleRelationDom ) ;
    public final void rule__Domain__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9070:1: ( ( ruleRelationDom ) )
            // InternalDsl.g:9071:2: ( ruleRelationDom )
            {
            // InternalDsl.g:9071:2: ( ruleRelationDom )
            // InternalDsl.g:9072:3: ruleRelationDom
            {
             before(grammarAccess.getDomainAccess().getRelationsRelationDomParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationDom();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getRelationsRelationDomParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__RelationsAssignment_4"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // InternalDsl.g:9081:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9085:1: ( ( RULE_ID ) )
            // InternalDsl.g:9086:2: ( RULE_ID )
            {
            // InternalDsl.g:9086:2: ( RULE_ID )
            // InternalDsl.g:9087:3: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__SubmodulesAssignment_3"
    // InternalDsl.g:9096:1: rule__Module__SubmodulesAssignment_3 : ( ruleSubmodule ) ;
    public final void rule__Module__SubmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9100:1: ( ( ruleSubmodule ) )
            // InternalDsl.g:9101:2: ( ruleSubmodule )
            {
            // InternalDsl.g:9101:2: ( ruleSubmodule )
            // InternalDsl.g:9102:3: ruleSubmodule
            {
             before(grammarAccess.getModuleAccess().getSubmodulesSubmoduleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSubmodule();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getSubmodulesSubmoduleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__SubmodulesAssignment_3"


    // $ANTLR start "rule__Submodule__NameAssignment_1"
    // InternalDsl.g:9111:1: rule__Submodule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Submodule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9115:1: ( ( RULE_ID ) )
            // InternalDsl.g:9116:2: ( RULE_ID )
            {
            // InternalDsl.g:9116:2: ( RULE_ID )
            // InternalDsl.g:9117:3: RULE_ID
            {
             before(grammarAccess.getSubmoduleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubmoduleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__NameAssignment_1"


    // $ANTLR start "rule__Submodule__OperationsAssignment_3"
    // InternalDsl.g:9126:1: rule__Submodule__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Submodule__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9130:1: ( ( ruleOperation ) )
            // InternalDsl.g:9131:2: ( ruleOperation )
            {
            // InternalDsl.g:9131:2: ( ruleOperation )
            // InternalDsl.g:9132:3: ruleOperation
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getSubmoduleAccess().getOperationsOperationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__OperationsAssignment_3"


    // $ANTLR start "rule__Submodule__EntitiesAssignment_4"
    // InternalDsl.g:9141:1: rule__Submodule__EntitiesAssignment_4 : ( ( rule__Submodule__EntitiesAlternatives_4_0 ) ) ;
    public final void rule__Submodule__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9145:1: ( ( ( rule__Submodule__EntitiesAlternatives_4_0 ) ) )
            // InternalDsl.g:9146:2: ( ( rule__Submodule__EntitiesAlternatives_4_0 ) )
            {
            // InternalDsl.g:9146:2: ( ( rule__Submodule__EntitiesAlternatives_4_0 ) )
            // InternalDsl.g:9147:3: ( rule__Submodule__EntitiesAlternatives_4_0 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAlternatives_4_0()); 
            // InternalDsl.g:9148:3: ( rule__Submodule__EntitiesAlternatives_4_0 )
            // InternalDsl.g:9148:4: rule__Submodule__EntitiesAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Submodule__EntitiesAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getEntitiesAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__EntitiesAssignment_4"


    // $ANTLR start "rule__Operation__TargetAssignment_5"
    // InternalDsl.g:9156:1: rule__Operation__TargetAssignment_5 : ( ruleEntityName ) ;
    public final void rule__Operation__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9160:1: ( ( ruleEntityName ) )
            // InternalDsl.g:9161:2: ( ruleEntityName )
            {
            // InternalDsl.g:9161:2: ( ruleEntityName )
            // InternalDsl.g:9162:3: ruleEntityName
            {
             before(grammarAccess.getOperationAccess().getTargetEntityNameParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getTargetEntityNameParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__TargetAssignment_5"


    // $ANTLR start "rule__EntityName__NameAssignment"
    // InternalDsl.g:9171:1: rule__EntityName__NameAssignment : ( RULE_ID ) ;
    public final void rule__EntityName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9175:1: ( ( RULE_ID ) )
            // InternalDsl.g:9176:2: ( RULE_ID )
            {
            // InternalDsl.g:9176:2: ( RULE_ID )
            // InternalDsl.g:9177:3: RULE_ID
            {
             before(grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityName__NameAssignment"


    // $ANTLR start "rule__GeneralEntity__PropertiesAssignment_3"
    // InternalDsl.g:9186:1: rule__GeneralEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__GeneralEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9190:1: ( ( ruleProperty ) )
            // InternalDsl.g:9191:2: ( ruleProperty )
            {
            // InternalDsl.g:9191:2: ( ruleProperty )
            // InternalDsl.g:9192:3: ruleProperty
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getGeneralEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__PropertiesAssignment_3"


    // $ANTLR start "rule__Property__NameAssignment_0"
    // InternalDsl.g:9201:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9205:1: ( ( RULE_ID ) )
            // InternalDsl.g:9206:2: ( RULE_ID )
            {
            // InternalDsl.g:9206:2: ( RULE_ID )
            // InternalDsl.g:9207:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__TypeAssignment_2"
    // InternalDsl.g:9216:1: rule__Property__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9220:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9221:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9221:2: ( ( RULE_ID ) )
            // InternalDsl.g:9222:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 
            // InternalDsl.g:9223:3: ( RULE_ID )
            // InternalDsl.g:9224:4: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_2"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalDsl.g:9235:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9239:1: ( ( RULE_ID ) )
            // InternalDsl.g:9240:2: ( RULE_ID )
            {
            // InternalDsl.g:9240:2: ( RULE_ID )
            // InternalDsl.g:9241:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__SpecialEntity__PropertiesAssignment_3"
    // InternalDsl.g:9250:1: rule__SpecialEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__SpecialEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9254:1: ( ( ruleProperty ) )
            // InternalDsl.g:9255:2: ( ruleProperty )
            {
            // InternalDsl.g:9255:2: ( ruleProperty )
            // InternalDsl.g:9256:3: ruleProperty
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSpecialEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__PropertiesAssignment_3"


    // $ANTLR start "rule__SpecialEntity__TransactionsAssignment_4"
    // InternalDsl.g:9265:1: rule__SpecialEntity__TransactionsAssignment_4 : ( ruleTransaction ) ;
    public final void rule__SpecialEntity__TransactionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9269:1: ( ( ruleTransaction ) )
            // InternalDsl.g:9270:2: ( ruleTransaction )
            {
            // InternalDsl.g:9270:2: ( ruleTransaction )
            // InternalDsl.g:9271:3: ruleTransaction
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsTransactionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getSpecialEntityAccess().getTransactionsTransactionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__TransactionsAssignment_4"


    // $ANTLR start "rule__Transaction__OperatesonAssignment_4"
    // InternalDsl.g:9280:1: rule__Transaction__OperatesonAssignment_4 : ( ruleOperateson ) ;
    public final void rule__Transaction__OperatesonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9284:1: ( ( ruleOperateson ) )
            // InternalDsl.g:9285:2: ( ruleOperateson )
            {
            // InternalDsl.g:9285:2: ( ruleOperateson )
            // InternalDsl.g:9286:3: ruleOperateson
            {
             before(grammarAccess.getTransactionAccess().getOperatesonOperatesonParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperateson();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getOperatesonOperatesonParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__OperatesonAssignment_4"


    // $ANTLR start "rule__Operateson__OperatesonAssignment_1"
    // InternalDsl.g:9295:1: rule__Operateson__OperatesonAssignment_1 : ( ruleEntityName ) ;
    public final void rule__Operateson__OperatesonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9299:1: ( ( ruleEntityName ) )
            // InternalDsl.g:9300:2: ( ruleEntityName )
            {
            // InternalDsl.g:9300:2: ( ruleEntityName )
            // InternalDsl.g:9301:3: ruleEntityName
            {
             before(grammarAccess.getOperatesonAccess().getOperatesonEntityNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getOperatesonAccess().getOperatesonEntityNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateson__OperatesonAssignment_1"


    // $ANTLR start "rule__RelationDom__SourceAssignment_5"
    // InternalDsl.g:9310:1: rule__RelationDom__SourceAssignment_5 : ( ruleEntityName ) ;
    public final void rule__RelationDom__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9314:1: ( ( ruleEntityName ) )
            // InternalDsl.g:9315:2: ( ruleEntityName )
            {
            // InternalDsl.g:9315:2: ( ruleEntityName )
            // InternalDsl.g:9316:3: ruleEntityName
            {
             before(grammarAccess.getRelationDomAccess().getSourceEntityNameParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getRelationDomAccess().getSourceEntityNameParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__SourceAssignment_5"


    // $ANTLR start "rule__RelationDom__TargetAssignment_7"
    // InternalDsl.g:9325:1: rule__RelationDom__TargetAssignment_7 : ( ruleEntityName ) ;
    public final void rule__RelationDom__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9329:1: ( ( ruleEntityName ) )
            // InternalDsl.g:9330:2: ( ruleEntityName )
            {
            // InternalDsl.g:9330:2: ( ruleEntityName )
            // InternalDsl.g:9331:3: ruleEntityName
            {
             before(grammarAccess.getRelationDomAccess().getTargetEntityNameParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getRelationDomAccess().getTargetEntityNameParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__TargetAssignment_7"


    // $ANTLR start "rule__Architecture__ComponentesAssignment_2"
    // InternalDsl.g:9340:1: rule__Architecture__ComponentesAssignment_2 : ( ruleComponent ) ;
    public final void rule__Architecture__ComponentesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9344:1: ( ( ruleComponent ) )
            // InternalDsl.g:9345:2: ( ruleComponent )
            {
            // InternalDsl.g:9345:2: ( ruleComponent )
            // InternalDsl.g:9346:3: ruleComponent
            {
             before(grammarAccess.getArchitectureAccess().getComponentesComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getComponentesComponentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__ComponentesAssignment_2"


    // $ANTLR start "rule__Architecture__RelationArchAssignment_3"
    // InternalDsl.g:9355:1: rule__Architecture__RelationArchAssignment_3 : ( ruleRelationArch ) ;
    public final void rule__Architecture__RelationArchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9359:1: ( ( ruleRelationArch ) )
            // InternalDsl.g:9360:2: ( ruleRelationArch )
            {
            // InternalDsl.g:9360:2: ( ruleRelationArch )
            // InternalDsl.g:9361:3: ruleRelationArch
            {
             before(grammarAccess.getArchitectureAccess().getRelationArchRelationArchParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationArch();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getRelationArchRelationArchParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__RelationArchAssignment_3"


    // $ANTLR start "rule__Component__LayerAssignment_3"
    // InternalDsl.g:9370:1: rule__Component__LayerAssignment_3 : ( ruleLayer ) ;
    public final void rule__Component__LayerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9374:1: ( ( ruleLayer ) )
            // InternalDsl.g:9375:2: ( ruleLayer )
            {
            // InternalDsl.g:9375:2: ( ruleLayer )
            // InternalDsl.g:9376:3: ruleLayer
            {
             before(grammarAccess.getComponentAccess().getLayerLayerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getLayerLayerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__LayerAssignment_3"


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // InternalDsl.g:9385:1: rule__Layer__NameAssignment_1 : ( ruleLayerName ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9389:1: ( ( ruleLayerName ) )
            // InternalDsl.g:9390:2: ( ruleLayerName )
            {
            // InternalDsl.g:9390:2: ( ruleLayerName )
            // InternalDsl.g:9391:3: ruleLayerName
            {
             before(grammarAccess.getLayerAccess().getNameLayerNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerName();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getNameLayerNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__NameAssignment_1"


    // $ANTLR start "rule__Layer__LayerSegmentsAssignment_3"
    // InternalDsl.g:9400:1: rule__Layer__LayerSegmentsAssignment_3 : ( ruleLayerSegment ) ;
    public final void rule__Layer__LayerSegmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9404:1: ( ( ruleLayerSegment ) )
            // InternalDsl.g:9405:2: ( ruleLayerSegment )
            {
            // InternalDsl.g:9405:2: ( ruleLayerSegment )
            // InternalDsl.g:9406:3: ruleLayerSegment
            {
             before(grammarAccess.getLayerAccess().getLayerSegmentsLayerSegmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerSegment();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getLayerSegmentsLayerSegmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__LayerSegmentsAssignment_3"


    // $ANTLR start "rule__LayerSegment__NameAssignment_1"
    // InternalDsl.g:9415:1: rule__LayerSegment__NameAssignment_1 : ( ruleLayerSegmentName ) ;
    public final void rule__LayerSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9419:1: ( ( ruleLayerSegmentName ) )
            // InternalDsl.g:9420:2: ( ruleLayerSegmentName )
            {
            // InternalDsl.g:9420:2: ( ruleLayerSegmentName )
            // InternalDsl.g:9421:3: ruleLayerSegmentName
            {
             before(grammarAccess.getLayerSegmentAccess().getNameLayerSegmentNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerSegmentName();

            state._fsp--;

             after(grammarAccess.getLayerSegmentAccess().getNameLayerSegmentNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__NameAssignment_1"


    // $ANTLR start "rule__LayerSegment__RelationsAssignment_3_1"
    // InternalDsl.g:9430:1: rule__LayerSegment__RelationsAssignment_3_1 : ( ruleLayerSegmentRelation ) ;
    public final void rule__LayerSegment__RelationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9434:1: ( ( ruleLayerSegmentRelation ) )
            // InternalDsl.g:9435:2: ( ruleLayerSegmentRelation )
            {
            // InternalDsl.g:9435:2: ( ruleLayerSegmentRelation )
            // InternalDsl.g:9436:3: ruleLayerSegmentRelation
            {
             before(grammarAccess.getLayerSegmentAccess().getRelationsLayerSegmentRelationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerSegmentRelation();

            state._fsp--;

             after(grammarAccess.getLayerSegmentAccess().getRelationsLayerSegmentRelationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__RelationsAssignment_3_1"


    // $ANTLR start "rule__LayerSegment__SublayerSegmentsAssignment_4"
    // InternalDsl.g:9445:1: rule__LayerSegment__SublayerSegmentsAssignment_4 : ( ruleSublayerSegment ) ;
    public final void rule__LayerSegment__SublayerSegmentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9449:1: ( ( ruleSublayerSegment ) )
            // InternalDsl.g:9450:2: ( ruleSublayerSegment )
            {
            // InternalDsl.g:9450:2: ( ruleSublayerSegment )
            // InternalDsl.g:9451:3: ruleSublayerSegment
            {
             before(grammarAccess.getLayerSegmentAccess().getSublayerSegmentsSublayerSegmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSublayerSegment();

            state._fsp--;

             after(grammarAccess.getLayerSegmentAccess().getSublayerSegmentsSublayerSegmentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__SublayerSegmentsAssignment_4"


    // $ANTLR start "rule__SublayerSegment__NameAssignment_1"
    // InternalDsl.g:9460:1: rule__SublayerSegment__NameAssignment_1 : ( ruleSublayerSegmentName ) ;
    public final void rule__SublayerSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9464:1: ( ( ruleSublayerSegmentName ) )
            // InternalDsl.g:9465:2: ( ruleSublayerSegmentName )
            {
            // InternalDsl.g:9465:2: ( ruleSublayerSegmentName )
            // InternalDsl.g:9466:3: ruleSublayerSegmentName
            {
             before(grammarAccess.getSublayerSegmentAccess().getNameSublayerSegmentNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSublayerSegmentName();

            state._fsp--;

             after(grammarAccess.getSublayerSegmentAccess().getNameSublayerSegmentNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SublayerSegment__NameAssignment_1"


    // $ANTLR start "rule__RelationArch__NameAssignment_1"
    // InternalDsl.g:9475:1: rule__RelationArch__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RelationArch__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9479:1: ( ( RULE_ID ) )
            // InternalDsl.g:9480:2: ( RULE_ID )
            {
            // InternalDsl.g:9480:2: ( RULE_ID )
            // InternalDsl.g:9481:3: RULE_ID
            {
             before(grammarAccess.getRelationArchAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationArchAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationArch__NameAssignment_1"


    // $ANTLR start "rule__Technology__JavaAssignment_2"
    // InternalDsl.g:9490:1: rule__Technology__JavaAssignment_2 : ( ruleJavaApp ) ;
    public final void rule__Technology__JavaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9494:1: ( ( ruleJavaApp ) )
            // InternalDsl.g:9495:2: ( ruleJavaApp )
            {
            // InternalDsl.g:9495:2: ( ruleJavaApp )
            // InternalDsl.g:9496:3: ruleJavaApp
            {
             before(grammarAccess.getTechnologyAccess().getJavaJavaAppParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJavaApp();

            state._fsp--;

             after(grammarAccess.getTechnologyAccess().getJavaJavaAppParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__JavaAssignment_2"


    // $ANTLR start "rule__Technology__ReactAssignment_3"
    // InternalDsl.g:9505:1: rule__Technology__ReactAssignment_3 : ( ruleReactApp ) ;
    public final void rule__Technology__ReactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9509:1: ( ( ruleReactApp ) )
            // InternalDsl.g:9510:2: ( ruleReactApp )
            {
            // InternalDsl.g:9510:2: ( ruleReactApp )
            // InternalDsl.g:9511:3: ruleReactApp
            {
             before(grammarAccess.getTechnologyAccess().getReactReactAppParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReactApp();

            state._fsp--;

             after(grammarAccess.getTechnologyAccess().getReactReactAppParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__ReactAssignment_3"


    // $ANTLR start "rule__ReactApp__ElementsAssignment_2"
    // InternalDsl.g:9520:1: rule__ReactApp__ElementsAssignment_2 : ( ruleAbstractFrontElement ) ;
    public final void rule__ReactApp__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9524:1: ( ( ruleAbstractFrontElement ) )
            // InternalDsl.g:9525:2: ( ruleAbstractFrontElement )
            {
            // InternalDsl.g:9525:2: ( ruleAbstractFrontElement )
            // InternalDsl.g:9526:3: ruleAbstractFrontElement
            {
             before(grammarAccess.getReactAppAccess().getElementsAbstractFrontElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractFrontElement();

            state._fsp--;

             after(grammarAccess.getReactAppAccess().getElementsAbstractFrontElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__ElementsAssignment_2"


    // $ANTLR start "rule__ReactApp__FuncAssignment_3_1"
    // InternalDsl.g:9535:1: rule__ReactApp__FuncAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReactApp__FuncAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9539:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9540:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9540:2: ( ( RULE_ID ) )
            // InternalDsl.g:9541:3: ( RULE_ID )
            {
             before(grammarAccess.getReactAppAccess().getFuncFunctionalityCrossReference_3_1_0()); 
            // InternalDsl.g:9542:3: ( RULE_ID )
            // InternalDsl.g:9543:4: RULE_ID
            {
             before(grammarAccess.getReactAppAccess().getFuncFunctionalityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getFuncFunctionalityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getReactAppAccess().getFuncFunctionalityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__FuncAssignment_3_1"


    // $ANTLR start "rule__ReactApp__DirAssignment_4_1"
    // InternalDsl.g:9554:1: rule__ReactApp__DirAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReactApp__DirAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9558:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9559:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9559:2: ( ( RULE_ID ) )
            // InternalDsl.g:9560:3: ( RULE_ID )
            {
             before(grammarAccess.getReactAppAccess().getDirDirectoryCrossReference_4_1_0()); 
            // InternalDsl.g:9561:3: ( RULE_ID )
            // InternalDsl.g:9562:4: RULE_ID
            {
             before(grammarAccess.getReactAppAccess().getDirDirectoryIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getDirDirectoryIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getReactAppAccess().getDirDirectoryCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__DirAssignment_4_1"


    // $ANTLR start "rule__ReactApp__ModAssignment_5_1"
    // InternalDsl.g:9573:1: rule__ReactApp__ModAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReactApp__ModAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9577:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9578:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9578:2: ( ( RULE_ID ) )
            // InternalDsl.g:9579:3: ( RULE_ID )
            {
             before(grammarAccess.getReactAppAccess().getModJsModuleCrossReference_5_1_0()); 
            // InternalDsl.g:9580:3: ( RULE_ID )
            // InternalDsl.g:9581:4: RULE_ID
            {
             before(grammarAccess.getReactAppAccess().getModJsModuleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getModJsModuleIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getReactAppAccess().getModJsModuleCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactApp__ModAssignment_5_1"


    // $ANTLR start "rule__Functionality__NameAssignment_1"
    // InternalDsl.g:9592:1: rule__Functionality__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Functionality__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9596:1: ( ( RULE_ID ) )
            // InternalDsl.g:9597:2: ( RULE_ID )
            {
            // InternalDsl.g:9597:2: ( RULE_ID )
            // InternalDsl.g:9598:3: RULE_ID
            {
             before(grammarAccess.getFunctionalityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__NameAssignment_1"


    // $ANTLR start "rule__Functionality__RouteAssignment_3_1"
    // InternalDsl.g:9607:1: rule__Functionality__RouteAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Functionality__RouteAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9611:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9612:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9612:2: ( ( RULE_ID ) )
            // InternalDsl.g:9613:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionalityAccess().getRouteRouterComponentCrossReference_3_1_0()); 
            // InternalDsl.g:9614:3: ( RULE_ID )
            // InternalDsl.g:9615:4: RULE_ID
            {
             before(grammarAccess.getFunctionalityAccess().getRouteRouterComponentIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getRouteRouterComponentIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFunctionalityAccess().getRouteRouterComponentCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__RouteAssignment_3_1"


    // $ANTLR start "rule__Functionality__WrapAssignment_4_1"
    // InternalDsl.g:9626:1: rule__Functionality__WrapAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Functionality__WrapAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9630:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9631:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9631:2: ( ( RULE_ID ) )
            // InternalDsl.g:9632:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionalityAccess().getWrapContainerCrossReference_4_1_0()); 
            // InternalDsl.g:9633:3: ( RULE_ID )
            // InternalDsl.g:9634:4: RULE_ID
            {
             before(grammarAccess.getFunctionalityAccess().getWrapContainerIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getWrapContainerIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFunctionalityAccess().getWrapContainerCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__WrapAssignment_4_1"


    // $ANTLR start "rule__Functionality__RenderAssignment_5_1"
    // InternalDsl.g:9645:1: rule__Functionality__RenderAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Functionality__RenderAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9649:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9650:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9650:2: ( ( RULE_ID ) )
            // InternalDsl.g:9651:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionalityAccess().getRenderVisualizerCrossReference_5_1_0()); 
            // InternalDsl.g:9652:3: ( RULE_ID )
            // InternalDsl.g:9653:4: RULE_ID
            {
             before(grammarAccess.getFunctionalityAccess().getRenderVisualizerIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getRenderVisualizerIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getFunctionalityAccess().getRenderVisualizerCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__RenderAssignment_5_1"


    // $ANTLR start "rule__Functionality__StateAssignment_6_1"
    // InternalDsl.g:9664:1: rule__Functionality__StateAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Functionality__StateAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9668:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9669:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9669:2: ( ( RULE_ID ) )
            // InternalDsl.g:9670:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionalityAccess().getStateStateCrossReference_6_1_0()); 
            // InternalDsl.g:9671:3: ( RULE_ID )
            // InternalDsl.g:9672:4: RULE_ID
            {
             before(grammarAccess.getFunctionalityAccess().getStateStateIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getStateStateIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getFunctionalityAccess().getStateStateCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__StateAssignment_6_1"


    // $ANTLR start "rule__Functionality__ServiceAssignment_7_1"
    // InternalDsl.g:9683:1: rule__Functionality__ServiceAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Functionality__ServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9687:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9688:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9688:2: ( ( RULE_ID ) )
            // InternalDsl.g:9689:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionalityAccess().getServiceServiceFrontCrossReference_7_1_0()); 
            // InternalDsl.g:9690:3: ( RULE_ID )
            // InternalDsl.g:9691:4: RULE_ID
            {
             before(grammarAccess.getFunctionalityAccess().getServiceServiceFrontIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getServiceServiceFrontIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getFunctionalityAccess().getServiceServiceFrontCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__ServiceAssignment_7_1"


    // $ANTLR start "rule__Functionality__TypeAssignment_9"
    // InternalDsl.g:9702:1: rule__Functionality__TypeAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Functionality__TypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9706:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9707:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9707:2: ( ( RULE_ID ) )
            // InternalDsl.g:9708:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionalityAccess().getTypeDirectoryCrossReference_9_0()); 
            // InternalDsl.g:9709:3: ( RULE_ID )
            // InternalDsl.g:9710:4: RULE_ID
            {
             before(grammarAccess.getFunctionalityAccess().getTypeDirectoryIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getTypeDirectoryIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getFunctionalityAccess().getTypeDirectoryCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__TypeAssignment_9"


    // $ANTLR start "rule__RouterComponent__NameAssignment_1"
    // InternalDsl.g:9721:1: rule__RouterComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RouterComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9725:1: ( ( RULE_ID ) )
            // InternalDsl.g:9726:2: ( RULE_ID )
            {
            // InternalDsl.g:9726:2: ( RULE_ID )
            // InternalDsl.g:9727:3: RULE_ID
            {
             before(grammarAccess.getRouterComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__NameAssignment_1"


    // $ANTLR start "rule__RouterComponent__TypeAssignment_4"
    // InternalDsl.g:9736:1: rule__RouterComponent__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RouterComponent__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9740:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9741:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9741:2: ( ( RULE_ID ) )
            // InternalDsl.g:9742:3: ( RULE_ID )
            {
             before(grammarAccess.getRouterComponentAccess().getTypeDirectoryCrossReference_4_0()); 
            // InternalDsl.g:9743:3: ( RULE_ID )
            // InternalDsl.g:9744:4: RULE_ID
            {
             before(grammarAccess.getRouterComponentAccess().getTypeDirectoryIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getTypeDirectoryIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRouterComponentAccess().getTypeDirectoryCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__TypeAssignment_4"


    // $ANTLR start "rule__RouterComponent__TypeAssignment_6"
    // InternalDsl.g:9755:1: rule__RouterComponent__TypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__RouterComponent__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9759:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9760:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9760:2: ( ( RULE_ID ) )
            // InternalDsl.g:9761:3: ( RULE_ID )
            {
             before(grammarAccess.getRouterComponentAccess().getTypeJsModuleCrossReference_6_0()); 
            // InternalDsl.g:9762:3: ( RULE_ID )
            // InternalDsl.g:9763:4: RULE_ID
            {
             before(grammarAccess.getRouterComponentAccess().getTypeJsModuleIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getTypeJsModuleIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRouterComponentAccess().getTypeJsModuleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__TypeAssignment_6"


    // $ANTLR start "rule__RouterComponent__RouteAssignment_8"
    // InternalDsl.g:9774:1: rule__RouterComponent__RouteAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__RouterComponent__RouteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9778:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9779:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9779:2: ( ( RULE_ID ) )
            // InternalDsl.g:9780:3: ( RULE_ID )
            {
             before(grammarAccess.getRouterComponentAccess().getRouteUIComponentCrossReference_8_0()); 
            // InternalDsl.g:9781:3: ( RULE_ID )
            // InternalDsl.g:9782:4: RULE_ID
            {
             before(grammarAccess.getRouterComponentAccess().getRouteUIComponentIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouterComponentAccess().getRouteUIComponentIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRouterComponentAccess().getRouteUIComponentCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouterComponent__RouteAssignment_8"


    // $ANTLR start "rule__Container__NameAssignment_1"
    // InternalDsl.g:9793:1: rule__Container__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9797:1: ( ( RULE_ID ) )
            // InternalDsl.g:9798:2: ( RULE_ID )
            {
            // InternalDsl.g:9798:2: ( RULE_ID )
            // InternalDsl.g:9799:3: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__NameAssignment_1"


    // $ANTLR start "rule__Container__TypeAssignment_4"
    // InternalDsl.g:9808:1: rule__Container__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Container__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9812:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9813:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9813:2: ( ( RULE_ID ) )
            // InternalDsl.g:9814:3: ( RULE_ID )
            {
             before(grammarAccess.getContainerAccess().getTypeDirectoryCrossReference_4_0()); 
            // InternalDsl.g:9815:3: ( RULE_ID )
            // InternalDsl.g:9816:4: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getTypeDirectoryIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getTypeDirectoryIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getTypeDirectoryCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__TypeAssignment_4"


    // $ANTLR start "rule__Container__TypeAssignment_5_1"
    // InternalDsl.g:9827:1: rule__Container__TypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Container__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9831:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9832:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9832:2: ( ( RULE_ID ) )
            // InternalDsl.g:9833:3: ( RULE_ID )
            {
             before(grammarAccess.getContainerAccess().getTypeActionDispatcherCrossReference_5_1_0()); 
            // InternalDsl.g:9834:3: ( RULE_ID )
            // InternalDsl.g:9835:4: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getTypeActionDispatcherIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getTypeActionDispatcherIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getTypeActionDispatcherCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__TypeAssignment_5_1"


    // $ANTLR start "rule__Container__TypeAssignment_6_1"
    // InternalDsl.g:9846:1: rule__Container__TypeAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Container__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9850:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9851:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9851:2: ( ( RULE_ID ) )
            // InternalDsl.g:9852:3: ( RULE_ID )
            {
             before(grammarAccess.getContainerAccess().getTypeReducerCrossReference_6_1_0()); 
            // InternalDsl.g:9853:3: ( RULE_ID )
            // InternalDsl.g:9854:4: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getTypeReducerIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getTypeReducerIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getTypeReducerCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__TypeAssignment_6_1"


    // $ANTLR start "rule__Container__TypeAssignment_8"
    // InternalDsl.g:9865:1: rule__Container__TypeAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Container__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9869:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9870:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9870:2: ( ( RULE_ID ) )
            // InternalDsl.g:9871:3: ( RULE_ID )
            {
             before(grammarAccess.getContainerAccess().getTypeJsModuleCrossReference_8_0()); 
            // InternalDsl.g:9872:3: ( RULE_ID )
            // InternalDsl.g:9873:4: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getTypeJsModuleIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getTypeJsModuleIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getTypeJsModuleCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__TypeAssignment_8"


    // $ANTLR start "rule__Visualizer__NameAssignment_1"
    // InternalDsl.g:9884:1: rule__Visualizer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Visualizer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9888:1: ( ( RULE_ID ) )
            // InternalDsl.g:9889:2: ( RULE_ID )
            {
            // InternalDsl.g:9889:2: ( RULE_ID )
            // InternalDsl.g:9890:3: RULE_ID
            {
             before(grammarAccess.getVisualizerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__NameAssignment_1"


    // $ANTLR start "rule__Visualizer__TypeAssignment_4"
    // InternalDsl.g:9899:1: rule__Visualizer__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Visualizer__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9903:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9904:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9904:2: ( ( RULE_ID ) )
            // InternalDsl.g:9905:3: ( RULE_ID )
            {
             before(grammarAccess.getVisualizerAccess().getTypeDirectoryCrossReference_4_0()); 
            // InternalDsl.g:9906:3: ( RULE_ID )
            // InternalDsl.g:9907:4: RULE_ID
            {
             before(grammarAccess.getVisualizerAccess().getTypeDirectoryIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getTypeDirectoryIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getVisualizerAccess().getTypeDirectoryCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__TypeAssignment_4"


    // $ANTLR start "rule__Visualizer__TypeAssignment_5_1"
    // InternalDsl.g:9918:1: rule__Visualizer__TypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Visualizer__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9922:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9923:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9923:2: ( ( RULE_ID ) )
            // InternalDsl.g:9924:3: ( RULE_ID )
            {
             before(grammarAccess.getVisualizerAccess().getTypeJsModuleCrossReference_5_1_0()); 
            // InternalDsl.g:9925:3: ( RULE_ID )
            // InternalDsl.g:9926:4: RULE_ID
            {
             before(grammarAccess.getVisualizerAccess().getTypeJsModuleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVisualizerAccess().getTypeJsModuleIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getVisualizerAccess().getTypeJsModuleCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualizer__TypeAssignment_5_1"


    // $ANTLR start "rule__ServiceFront__NameAssignment_1"
    // InternalDsl.g:9937:1: rule__ServiceFront__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceFront__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9941:1: ( ( RULE_ID ) )
            // InternalDsl.g:9942:2: ( RULE_ID )
            {
            // InternalDsl.g:9942:2: ( RULE_ID )
            // InternalDsl.g:9943:3: RULE_ID
            {
             before(grammarAccess.getServiceFrontAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceFrontAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__NameAssignment_1"


    // $ANTLR start "rule__ServiceFront__TypeAssignment_4"
    // InternalDsl.g:9952:1: rule__ServiceFront__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ServiceFront__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9956:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9957:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9957:2: ( ( RULE_ID ) )
            // InternalDsl.g:9958:3: ( RULE_ID )
            {
             before(grammarAccess.getServiceFrontAccess().getTypeJsModuleCrossReference_4_0()); 
            // InternalDsl.g:9959:3: ( RULE_ID )
            // InternalDsl.g:9960:4: RULE_ID
            {
             before(grammarAccess.getServiceFrontAccess().getTypeJsModuleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceFrontAccess().getTypeJsModuleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getServiceFrontAccess().getTypeJsModuleCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceFront__TypeAssignment_4"


    // $ANTLR start "rule__Directory__NameAssignment_1"
    // InternalDsl.g:9971:1: rule__Directory__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Directory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9975:1: ( ( RULE_ID ) )
            // InternalDsl.g:9976:2: ( RULE_ID )
            {
            // InternalDsl.g:9976:2: ( RULE_ID )
            // InternalDsl.g:9977:3: RULE_ID
            {
             before(grammarAccess.getDirectoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__NameAssignment_1"


    // $ANTLR start "rule__Directory__FileAssignment_3_1"
    // InternalDsl.g:9986:1: rule__Directory__FileAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Directory__FileAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9990:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:9991:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:9991:2: ( ( RULE_ID ) )
            // InternalDsl.g:9992:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectoryAccess().getFileFileCrossReference_3_1_0()); 
            // InternalDsl.g:9993:3: ( RULE_ID )
            // InternalDsl.g:9994:4: RULE_ID
            {
             before(grammarAccess.getDirectoryAccess().getFileFileIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getFileFileIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDirectoryAccess().getFileFileCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__FileAssignment_3_1"


    // $ANTLR start "rule__Directory__SubdirectoryAssignment_4_1"
    // InternalDsl.g:10005:1: rule__Directory__SubdirectoryAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Directory__SubdirectoryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10009:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10010:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10010:2: ( ( RULE_ID ) )
            // InternalDsl.g:10011:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectoryAccess().getSubdirectoryDirectoryCrossReference_4_1_0()); 
            // InternalDsl.g:10012:3: ( RULE_ID )
            // InternalDsl.g:10013:4: RULE_ID
            {
             before(grammarAccess.getDirectoryAccess().getSubdirectoryDirectoryIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getSubdirectoryDirectoryIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getDirectoryAccess().getSubdirectoryDirectoryCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directory__SubdirectoryAssignment_4_1"


    // $ANTLR start "rule__Md__NameAssignment_1"
    // InternalDsl.g:10024:1: rule__Md__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Md__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10028:1: ( ( RULE_ID ) )
            // InternalDsl.g:10029:2: ( RULE_ID )
            {
            // InternalDsl.g:10029:2: ( RULE_ID )
            // InternalDsl.g:10030:3: RULE_ID
            {
             before(grammarAccess.getMdAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMdAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Md__NameAssignment_1"


    // $ANTLR start "rule__Js__NameAssignment_1"
    // InternalDsl.g:10039:1: rule__Js__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Js__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10043:1: ( ( RULE_ID ) )
            // InternalDsl.g:10044:2: ( RULE_ID )
            {
            // InternalDsl.g:10044:2: ( RULE_ID )
            // InternalDsl.g:10045:3: RULE_ID
            {
             before(grammarAccess.getJsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Js__NameAssignment_1"


    // $ANTLR start "rule__Json__NameAssignment_1"
    // InternalDsl.g:10054:1: rule__Json__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Json__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10058:1: ( ( RULE_ID ) )
            // InternalDsl.g:10059:2: ( RULE_ID )
            {
            // InternalDsl.g:10059:2: ( RULE_ID )
            // InternalDsl.g:10060:3: RULE_ID
            {
             before(grammarAccess.getJsonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJsonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__NameAssignment_1"


    // $ANTLR start "rule__Css__NameAssignment_1"
    // InternalDsl.g:10069:1: rule__Css__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Css__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10073:1: ( ( RULE_ID ) )
            // InternalDsl.g:10074:2: ( RULE_ID )
            {
            // InternalDsl.g:10074:2: ( RULE_ID )
            // InternalDsl.g:10075:3: RULE_ID
            {
             before(grammarAccess.getCssAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCssAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css__NameAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalDsl.g:10084:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10088:1: ( ( RULE_ID ) )
            // InternalDsl.g:10089:2: ( RULE_ID )
            {
            // InternalDsl.g:10089:2: ( RULE_ID )
            // InternalDsl.g:10090:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__ActionAssignment_3_1"
    // InternalDsl.g:10099:1: rule__State__ActionAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__State__ActionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10103:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10104:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10104:2: ( ( RULE_ID ) )
            // InternalDsl.g:10105:3: ( RULE_ID )
            {
             before(grammarAccess.getStateAccess().getActionActionCrossReference_3_1_0()); 
            // InternalDsl.g:10106:3: ( RULE_ID )
            // InternalDsl.g:10107:4: RULE_ID
            {
             before(grammarAccess.getStateAccess().getActionActionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getActionActionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getActionActionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionAssignment_3_1"


    // $ANTLR start "rule__State__ReducerAssignment_4_1"
    // InternalDsl.g:10118:1: rule__State__ReducerAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__State__ReducerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10122:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10123:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10123:2: ( ( RULE_ID ) )
            // InternalDsl.g:10124:3: ( RULE_ID )
            {
             before(grammarAccess.getStateAccess().getReducerReducerCrossReference_4_1_0()); 
            // InternalDsl.g:10125:3: ( RULE_ID )
            // InternalDsl.g:10126:4: RULE_ID
            {
             before(grammarAccess.getStateAccess().getReducerReducerIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getReducerReducerIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getReducerReducerCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ReducerAssignment_4_1"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // InternalDsl.g:10137:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10141:1: ( ( RULE_ID ) )
            // InternalDsl.g:10142:2: ( RULE_ID )
            {
            // InternalDsl.g:10142:2: ( RULE_ID )
            // InternalDsl.g:10143:3: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Action__ActionCreatorAssignment_3_1"
    // InternalDsl.g:10152:1: rule__Action__ActionCreatorAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ActionCreatorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10156:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10157:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10157:2: ( ( RULE_ID ) )
            // InternalDsl.g:10158:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getActionCreatorActionCreatorCrossReference_3_1_0()); 
            // InternalDsl.g:10159:3: ( RULE_ID )
            // InternalDsl.g:10160:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getActionCreatorActionCreatorIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionCreatorActionCreatorIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getActionCreatorActionCreatorCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionCreatorAssignment_3_1"


    // $ANTLR start "rule__Action__ActionDispatcherAssignment_4_1"
    // InternalDsl.g:10171:1: rule__Action__ActionDispatcherAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ActionDispatcherAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10175:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10176:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10176:2: ( ( RULE_ID ) )
            // InternalDsl.g:10177:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getActionDispatcherActionDispatcherCrossReference_4_1_0()); 
            // InternalDsl.g:10178:3: ( RULE_ID )
            // InternalDsl.g:10179:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getActionDispatcherActionDispatcherIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionDispatcherActionDispatcherIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getActionDispatcherActionDispatcherCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionDispatcherAssignment_4_1"


    // $ANTLR start "rule__Action__DirAssignment_6"
    // InternalDsl.g:10190:1: rule__Action__DirAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Action__DirAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10194:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10195:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10195:2: ( ( RULE_ID ) )
            // InternalDsl.g:10196:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getDirDirectoryCrossReference_6_0()); 
            // InternalDsl.g:10197:3: ( RULE_ID )
            // InternalDsl.g:10198:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getDirDirectoryIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDirDirectoryIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getActionAccess().getDirDirectoryCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DirAssignment_6"


    // $ANTLR start "rule__ActionCreator__NameAssignment_1"
    // InternalDsl.g:10209:1: rule__ActionCreator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionCreator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10213:1: ( ( RULE_ID ) )
            // InternalDsl.g:10214:2: ( RULE_ID )
            {
            // InternalDsl.g:10214:2: ( RULE_ID )
            // InternalDsl.g:10215:3: RULE_ID
            {
             before(grammarAccess.getActionCreatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionCreatorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCreator__NameAssignment_1"


    // $ANTLR start "rule__ActionDispatcher__NameAssignment_1"
    // InternalDsl.g:10224:1: rule__ActionDispatcher__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionDispatcher__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10228:1: ( ( RULE_ID ) )
            // InternalDsl.g:10229:2: ( RULE_ID )
            {
            // InternalDsl.g:10229:2: ( RULE_ID )
            // InternalDsl.g:10230:3: RULE_ID
            {
             before(grammarAccess.getActionDispatcherAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionDispatcherAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__NameAssignment_1"


    // $ANTLR start "rule__ActionDispatcher__TypeAssignment_3_1"
    // InternalDsl.g:10239:1: rule__ActionDispatcher__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActionDispatcher__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10243:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10244:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10244:2: ( ( RULE_ID ) )
            // InternalDsl.g:10245:3: ( RULE_ID )
            {
             before(grammarAccess.getActionDispatcherAccess().getTypeActionCreatorCrossReference_3_1_0()); 
            // InternalDsl.g:10246:3: ( RULE_ID )
            // InternalDsl.g:10247:4: RULE_ID
            {
             before(grammarAccess.getActionDispatcherAccess().getTypeActionCreatorIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionDispatcherAccess().getTypeActionCreatorIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getActionDispatcherAccess().getTypeActionCreatorCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDispatcher__TypeAssignment_3_1"


    // $ANTLR start "rule__Reducer__NameAssignment_1"
    // InternalDsl.g:10258:1: rule__Reducer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reducer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10262:1: ( ( RULE_ID ) )
            // InternalDsl.g:10263:2: ( RULE_ID )
            {
            // InternalDsl.g:10263:2: ( RULE_ID )
            // InternalDsl.g:10264:3: RULE_ID
            {
             before(grammarAccess.getReducerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReducerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__NameAssignment_1"


    // $ANTLR start "rule__Reducer__TypeAssignment_3_1"
    // InternalDsl.g:10273:1: rule__Reducer__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reducer__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10277:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10278:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10278:2: ( ( RULE_ID ) )
            // InternalDsl.g:10279:3: ( RULE_ID )
            {
             before(grammarAccess.getReducerAccess().getTypeActionCreatorCrossReference_3_1_0()); 
            // InternalDsl.g:10280:3: ( RULE_ID )
            // InternalDsl.g:10281:4: RULE_ID
            {
             before(grammarAccess.getReducerAccess().getTypeActionCreatorIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReducerAccess().getTypeActionCreatorIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getReducerAccess().getTypeActionCreatorCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__TypeAssignment_3_1"


    // $ANTLR start "rule__Reducer__TypeAssignment_5"
    // InternalDsl.g:10292:1: rule__Reducer__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Reducer__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10296:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10297:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10297:2: ( ( RULE_ID ) )
            // InternalDsl.g:10298:3: ( RULE_ID )
            {
             before(grammarAccess.getReducerAccess().getTypeDirectoryCrossReference_5_0()); 
            // InternalDsl.g:10299:3: ( RULE_ID )
            // InternalDsl.g:10300:4: RULE_ID
            {
             before(grammarAccess.getReducerAccess().getTypeDirectoryIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReducerAccess().getTypeDirectoryIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getReducerAccess().getTypeDirectoryCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reducer__TypeAssignment_5"


    // $ANTLR start "rule__JsModule__NameAssignment_1"
    // InternalDsl.g:10311:1: rule__JsModule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JsModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10315:1: ( ( RULE_ID ) )
            // InternalDsl.g:10316:2: ( RULE_ID )
            {
            // InternalDsl.g:10316:2: ( RULE_ID )
            // InternalDsl.g:10317:3: RULE_ID
            {
             before(grammarAccess.getJsModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJsModuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__NameAssignment_1"


    // $ANTLR start "rule__JsModule__TypeAssignment_4"
    // InternalDsl.g:10326:1: rule__JsModule__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__JsModule__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:10330:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:10331:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:10331:2: ( ( RULE_ID ) )
            // InternalDsl.g:10332:3: ( RULE_ID )
            {
             before(grammarAccess.getJsModuleAccess().getTypeDirectoryCrossReference_4_0()); 
            // InternalDsl.g:10333:3: ( RULE_ID )
            // InternalDsl.g:10334:4: RULE_ID
            {
             before(grammarAccess.getJsModuleAccess().getTypeDirectoryIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJsModuleAccess().getTypeDirectoryIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getJsModuleAccess().getTypeDirectoryCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsModule__TypeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040800000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000090000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000001FF00000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000300000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000200000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8800040800000000L,0x00000000E4F8B240L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8800040800000002L,0x00000000E4F8B240L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000200000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000400L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x4000000200000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});

}