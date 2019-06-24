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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Read'", "'Create'", "'exchange'", "'sale'", "'Back'", "'Front'", "'JavaScript'", "'Ejb'", "'War'", "'Services'", "'Ui'", "'Store'", "'RestEntity'", "'Pojo'", "'Facade'", "'Dto'", "'Util'", "'Containers'", "'Actions'", "'Reducers'", "'Casino'", "'{'", "'}'", "'domain'", "'module'", "'submodule'", "'op'", "'type:'", "'operates_on:'", "'generalEntity'", "':'", "'dataType'", "'specialEntity'", "'trx'", "'rel'", "'Composition'", "'source:'", "'target:'", "'arch'", "'component'", "'layer'", "'layerSegment'", "'allowedToUse:'", "'sublayerSegment'", "'relationArch'", "','", "'tech'", "'javaApp'", "'reactApp'"
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


    // $ANTLR start "entryRuleReactApp"
    // InternalDsl.g:753:1: entryRuleReactApp : ruleReactApp EOF ;
    public final void entryRuleReactApp() throws RecognitionException {
        try {
            // InternalDsl.g:754:1: ( ruleReactApp EOF )
            // InternalDsl.g:755:1: ruleReactApp EOF
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
    // InternalDsl.g:762:1: ruleReactApp : ( ( rule__ReactApp__Group__0 ) ) ;
    public final void ruleReactApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:766:2: ( ( ( rule__ReactApp__Group__0 ) ) )
            // InternalDsl.g:767:2: ( ( rule__ReactApp__Group__0 ) )
            {
            // InternalDsl.g:767:2: ( ( rule__ReactApp__Group__0 ) )
            // InternalDsl.g:768:3: ( rule__ReactApp__Group__0 )
            {
             before(grammarAccess.getReactAppAccess().getGroup()); 
            // InternalDsl.g:769:3: ( rule__ReactApp__Group__0 )
            // InternalDsl.g:769:4: rule__ReactApp__Group__0
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


    // $ANTLR start "rule__Submodule__EntitiesAlternatives_4_0"
    // InternalDsl.g:777:1: rule__Submodule__EntitiesAlternatives_4_0 : ( ( ruleGeneralEntity ) | ( ruleSpecialEntity ) );
    public final void rule__Submodule__EntitiesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:781:1: ( ( ruleGeneralEntity ) | ( ruleSpecialEntity ) )
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
                    // InternalDsl.g:782:2: ( ruleGeneralEntity )
                    {
                    // InternalDsl.g:782:2: ( ruleGeneralEntity )
                    // InternalDsl.g:783:3: ruleGeneralEntity
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
                    // InternalDsl.g:788:2: ( ruleSpecialEntity )
                    {
                    // InternalDsl.g:788:2: ( ruleSpecialEntity )
                    // InternalDsl.g:789:3: ruleSpecialEntity
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
    // InternalDsl.g:798:1: rule__SubOperation__Alternatives : ( ( 'Read' ) | ( 'Create' ) );
    public final void rule__SubOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:802:1: ( ( 'Read' ) | ( 'Create' ) )
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
                    // InternalDsl.g:803:2: ( 'Read' )
                    {
                    // InternalDsl.g:803:2: ( 'Read' )
                    // InternalDsl.g:804:3: 'Read'
                    {
                     before(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:809:2: ( 'Create' )
                    {
                    // InternalDsl.g:809:2: ( 'Create' )
                    // InternalDsl.g:810:3: 'Create'
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
    // InternalDsl.g:819:1: rule__SubTransaction__Alternatives : ( ( 'exchange' ) | ( 'sale' ) );
    public final void rule__SubTransaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:823:1: ( ( 'exchange' ) | ( 'sale' ) )
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
                    // InternalDsl.g:824:2: ( 'exchange' )
                    {
                    // InternalDsl.g:824:2: ( 'exchange' )
                    // InternalDsl.g:825:3: 'exchange'
                    {
                     before(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:830:2: ( 'sale' )
                    {
                    // InternalDsl.g:830:2: ( 'sale' )
                    // InternalDsl.g:831:3: 'sale'
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
    // InternalDsl.g:840:1: rule__ComponentName__Alternatives : ( ( 'Back' ) | ( 'Front' ) );
    public final void rule__ComponentName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:844:1: ( ( 'Back' ) | ( 'Front' ) )
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
                    // InternalDsl.g:845:2: ( 'Back' )
                    {
                    // InternalDsl.g:845:2: ( 'Back' )
                    // InternalDsl.g:846:3: 'Back'
                    {
                     before(grammarAccess.getComponentNameAccess().getBackKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComponentNameAccess().getBackKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:851:2: ( 'Front' )
                    {
                    // InternalDsl.g:851:2: ( 'Front' )
                    // InternalDsl.g:852:3: 'Front'
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
    // InternalDsl.g:861:1: rule__LayerName__Alternatives : ( ( 'JavaScript' ) | ( 'Ejb' ) | ( 'War' ) );
    public final void rule__LayerName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:865:1: ( ( 'JavaScript' ) | ( 'Ejb' ) | ( 'War' ) )
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
                    // InternalDsl.g:866:2: ( 'JavaScript' )
                    {
                    // InternalDsl.g:866:2: ( 'JavaScript' )
                    // InternalDsl.g:867:3: 'JavaScript'
                    {
                     before(grammarAccess.getLayerNameAccess().getJavaScriptKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLayerNameAccess().getJavaScriptKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:872:2: ( 'Ejb' )
                    {
                    // InternalDsl.g:872:2: ( 'Ejb' )
                    // InternalDsl.g:873:3: 'Ejb'
                    {
                     before(grammarAccess.getLayerNameAccess().getEjbKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLayerNameAccess().getEjbKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:878:2: ( 'War' )
                    {
                    // InternalDsl.g:878:2: ( 'War' )
                    // InternalDsl.g:879:3: 'War'
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
    // InternalDsl.g:888:1: rule__LayerSegmentName__Alternatives : ( ( 'Services' ) | ( 'Ui' ) | ( 'Store' ) | ( 'RestEntity' ) | ( 'Pojo' ) | ( 'Facade' ) | ( 'Dto' ) | ( 'Util' ) | ( 'Containers' ) );
    public final void rule__LayerSegmentName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:892:1: ( ( 'Services' ) | ( 'Ui' ) | ( 'Store' ) | ( 'RestEntity' ) | ( 'Pojo' ) | ( 'Facade' ) | ( 'Dto' ) | ( 'Util' ) | ( 'Containers' ) )
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
                    // InternalDsl.g:893:2: ( 'Services' )
                    {
                    // InternalDsl.g:893:2: ( 'Services' )
                    // InternalDsl.g:894:3: 'Services'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getServicesKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getServicesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:899:2: ( 'Ui' )
                    {
                    // InternalDsl.g:899:2: ( 'Ui' )
                    // InternalDsl.g:900:3: 'Ui'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getUiKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getUiKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:905:2: ( 'Store' )
                    {
                    // InternalDsl.g:905:2: ( 'Store' )
                    // InternalDsl.g:906:3: 'Store'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getStoreKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getStoreKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:911:2: ( 'RestEntity' )
                    {
                    // InternalDsl.g:911:2: ( 'RestEntity' )
                    // InternalDsl.g:912:3: 'RestEntity'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getRestEntityKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getRestEntityKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:917:2: ( 'Pojo' )
                    {
                    // InternalDsl.g:917:2: ( 'Pojo' )
                    // InternalDsl.g:918:3: 'Pojo'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getPojoKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getPojoKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:923:2: ( 'Facade' )
                    {
                    // InternalDsl.g:923:2: ( 'Facade' )
                    // InternalDsl.g:924:3: 'Facade'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getFacadeKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getFacadeKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:929:2: ( 'Dto' )
                    {
                    // InternalDsl.g:929:2: ( 'Dto' )
                    // InternalDsl.g:930:3: 'Dto'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getDtoKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getDtoKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:935:2: ( 'Util' )
                    {
                    // InternalDsl.g:935:2: ( 'Util' )
                    // InternalDsl.g:936:3: 'Util'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getUtilKeyword_7()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getUtilKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:941:2: ( 'Containers' )
                    {
                    // InternalDsl.g:941:2: ( 'Containers' )
                    // InternalDsl.g:942:3: 'Containers'
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
    // InternalDsl.g:951:1: rule__SublayerSegmentName__Alternatives : ( ( 'Actions' ) | ( 'Reducers' ) );
    public final void rule__SublayerSegmentName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:955:1: ( ( 'Actions' ) | ( 'Reducers' ) )
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
                    // InternalDsl.g:956:2: ( 'Actions' )
                    {
                    // InternalDsl.g:956:2: ( 'Actions' )
                    // InternalDsl.g:957:3: 'Actions'
                    {
                     before(grammarAccess.getSublayerSegmentNameAccess().getActionsKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSublayerSegmentNameAccess().getActionsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:962:2: ( 'Reducers' )
                    {
                    // InternalDsl.g:962:2: ( 'Reducers' )
                    // InternalDsl.g:963:3: 'Reducers'
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


    // $ANTLR start "rule__System__Group__0"
    // InternalDsl.g:972:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:976:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalDsl.g:977:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalDsl.g:984:1: rule__System__Group__0__Impl : ( 'Casino' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:988:1: ( ( 'Casino' ) )
            // InternalDsl.g:989:1: ( 'Casino' )
            {
            // InternalDsl.g:989:1: ( 'Casino' )
            // InternalDsl.g:990:2: 'Casino'
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
    // InternalDsl.g:999:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1003:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalDsl.g:1004:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalDsl.g:1011:1: rule__System__Group__1__Impl : ( '{' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1015:1: ( ( '{' ) )
            // InternalDsl.g:1016:1: ( '{' )
            {
            // InternalDsl.g:1016:1: ( '{' )
            // InternalDsl.g:1017:2: '{'
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
    // InternalDsl.g:1026:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1030:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalDsl.g:1031:2: rule__System__Group__2__Impl rule__System__Group__3
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
    // InternalDsl.g:1038:1: rule__System__Group__2__Impl : ( ( rule__System__DomAssignment_2 ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1042:1: ( ( ( rule__System__DomAssignment_2 ) ) )
            // InternalDsl.g:1043:1: ( ( rule__System__DomAssignment_2 ) )
            {
            // InternalDsl.g:1043:1: ( ( rule__System__DomAssignment_2 ) )
            // InternalDsl.g:1044:2: ( rule__System__DomAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getDomAssignment_2()); 
            // InternalDsl.g:1045:2: ( rule__System__DomAssignment_2 )
            // InternalDsl.g:1045:3: rule__System__DomAssignment_2
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
    // InternalDsl.g:1053:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1057:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalDsl.g:1058:2: rule__System__Group__3__Impl rule__System__Group__4
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
    // InternalDsl.g:1065:1: rule__System__Group__3__Impl : ( ( rule__System__ArchAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1069:1: ( ( ( rule__System__ArchAssignment_3 ) ) )
            // InternalDsl.g:1070:1: ( ( rule__System__ArchAssignment_3 ) )
            {
            // InternalDsl.g:1070:1: ( ( rule__System__ArchAssignment_3 ) )
            // InternalDsl.g:1071:2: ( rule__System__ArchAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getArchAssignment_3()); 
            // InternalDsl.g:1072:2: ( rule__System__ArchAssignment_3 )
            // InternalDsl.g:1072:3: rule__System__ArchAssignment_3
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
    // InternalDsl.g:1080:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1084:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalDsl.g:1085:2: rule__System__Group__4__Impl rule__System__Group__5
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
    // InternalDsl.g:1092:1: rule__System__Group__4__Impl : ( ( rule__System__TechAssignment_4 ) ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1096:1: ( ( ( rule__System__TechAssignment_4 ) ) )
            // InternalDsl.g:1097:1: ( ( rule__System__TechAssignment_4 ) )
            {
            // InternalDsl.g:1097:1: ( ( rule__System__TechAssignment_4 ) )
            // InternalDsl.g:1098:2: ( rule__System__TechAssignment_4 )
            {
             before(grammarAccess.getSystemAccess().getTechAssignment_4()); 
            // InternalDsl.g:1099:2: ( rule__System__TechAssignment_4 )
            // InternalDsl.g:1099:3: rule__System__TechAssignment_4
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
    // InternalDsl.g:1107:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1111:1: ( rule__System__Group__5__Impl )
            // InternalDsl.g:1112:2: rule__System__Group__5__Impl
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
    // InternalDsl.g:1118:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1122:1: ( ( '}' ) )
            // InternalDsl.g:1123:1: ( '}' )
            {
            // InternalDsl.g:1123:1: ( '}' )
            // InternalDsl.g:1124:2: '}'
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
    // InternalDsl.g:1134:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1138:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalDsl.g:1139:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalDsl.g:1146:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1150:1: ( ( 'domain' ) )
            // InternalDsl.g:1151:1: ( 'domain' )
            {
            // InternalDsl.g:1151:1: ( 'domain' )
            // InternalDsl.g:1152:2: 'domain'
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
    // InternalDsl.g:1161:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1165:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalDsl.g:1166:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
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
    // InternalDsl.g:1173:1: rule__Domain__Group__1__Impl : ( '{' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1177:1: ( ( '{' ) )
            // InternalDsl.g:1178:1: ( '{' )
            {
            // InternalDsl.g:1178:1: ( '{' )
            // InternalDsl.g:1179:2: '{'
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
    // InternalDsl.g:1188:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1192:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalDsl.g:1193:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
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
    // InternalDsl.g:1200:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__TypesAssignment_2 )* ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1204:1: ( ( ( rule__Domain__TypesAssignment_2 )* ) )
            // InternalDsl.g:1205:1: ( ( rule__Domain__TypesAssignment_2 )* )
            {
            // InternalDsl.g:1205:1: ( ( rule__Domain__TypesAssignment_2 )* )
            // InternalDsl.g:1206:2: ( rule__Domain__TypesAssignment_2 )*
            {
             before(grammarAccess.getDomainAccess().getTypesAssignment_2()); 
            // InternalDsl.g:1207:2: ( rule__Domain__TypesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==42) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1207:3: rule__Domain__TypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Domain__TypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDsl.g:1215:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1219:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalDsl.g:1220:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
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
    // InternalDsl.g:1227:1: rule__Domain__Group__3__Impl : ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1231:1: ( ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) ) )
            // InternalDsl.g:1232:1: ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) )
            {
            // InternalDsl.g:1232:1: ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) )
            // InternalDsl.g:1233:2: ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* )
            {
            // InternalDsl.g:1233:2: ( ( rule__Domain__ModulesAssignment_3 ) )
            // InternalDsl.g:1234:3: ( rule__Domain__ModulesAssignment_3 )
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_3()); 
            // InternalDsl.g:1235:3: ( rule__Domain__ModulesAssignment_3 )
            // InternalDsl.g:1235:4: rule__Domain__ModulesAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Domain__ModulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModulesAssignment_3()); 

            }

            // InternalDsl.g:1238:2: ( ( rule__Domain__ModulesAssignment_3 )* )
            // InternalDsl.g:1239:3: ( rule__Domain__ModulesAssignment_3 )*
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_3()); 
            // InternalDsl.g:1240:3: ( rule__Domain__ModulesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1240:4: rule__Domain__ModulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Domain__ModulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDsl.g:1249:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1253:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalDsl.g:1254:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
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
    // InternalDsl.g:1261:1: rule__Domain__Group__4__Impl : ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1265:1: ( ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) ) )
            // InternalDsl.g:1266:1: ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) )
            {
            // InternalDsl.g:1266:1: ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) )
            // InternalDsl.g:1267:2: ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* )
            {
            // InternalDsl.g:1267:2: ( ( rule__Domain__RelationsAssignment_4 ) )
            // InternalDsl.g:1268:3: ( rule__Domain__RelationsAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 
            // InternalDsl.g:1269:3: ( rule__Domain__RelationsAssignment_4 )
            // InternalDsl.g:1269:4: rule__Domain__RelationsAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__Domain__RelationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 

            }

            // InternalDsl.g:1272:2: ( ( rule__Domain__RelationsAssignment_4 )* )
            // InternalDsl.g:1273:3: ( rule__Domain__RelationsAssignment_4 )*
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 
            // InternalDsl.g:1274:3: ( rule__Domain__RelationsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==45) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1274:4: rule__Domain__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Domain__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDsl.g:1283:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1287:1: ( rule__Domain__Group__5__Impl )
            // InternalDsl.g:1288:2: rule__Domain__Group__5__Impl
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
    // InternalDsl.g:1294:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1298:1: ( ( '}' ) )
            // InternalDsl.g:1299:1: ( '}' )
            {
            // InternalDsl.g:1299:1: ( '}' )
            // InternalDsl.g:1300:2: '}'
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
    // InternalDsl.g:1310:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1314:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalDsl.g:1315:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalDsl.g:1322:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1326:1: ( ( 'module' ) )
            // InternalDsl.g:1327:1: ( 'module' )
            {
            // InternalDsl.g:1327:1: ( 'module' )
            // InternalDsl.g:1328:2: 'module'
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
    // InternalDsl.g:1337:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1341:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalDsl.g:1342:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalDsl.g:1349:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1353:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalDsl.g:1354:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalDsl.g:1354:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalDsl.g:1355:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalDsl.g:1356:2: ( rule__Module__NameAssignment_1 )
            // InternalDsl.g:1356:3: rule__Module__NameAssignment_1
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
    // InternalDsl.g:1364:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1368:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalDsl.g:1369:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalDsl.g:1376:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1380:1: ( ( '{' ) )
            // InternalDsl.g:1381:1: ( '{' )
            {
            // InternalDsl.g:1381:1: ( '{' )
            // InternalDsl.g:1382:2: '{'
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
    // InternalDsl.g:1391:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1395:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalDsl.g:1396:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalDsl.g:1403:1: rule__Module__Group__3__Impl : ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1407:1: ( ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) )
            // InternalDsl.g:1408:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            {
            // InternalDsl.g:1408:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            // InternalDsl.g:1409:2: ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* )
            {
            // InternalDsl.g:1409:2: ( ( rule__Module__SubmodulesAssignment_3 ) )
            // InternalDsl.g:1410:3: ( rule__Module__SubmodulesAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:1411:3: ( rule__Module__SubmodulesAssignment_3 )
            // InternalDsl.g:1411:4: rule__Module__SubmodulesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__Module__SubmodulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 

            }

            // InternalDsl.g:1414:2: ( ( rule__Module__SubmodulesAssignment_3 )* )
            // InternalDsl.g:1415:3: ( rule__Module__SubmodulesAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:1416:3: ( rule__Module__SubmodulesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1416:4: rule__Module__SubmodulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Module__SubmodulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDsl.g:1425:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1429:1: ( rule__Module__Group__4__Impl )
            // InternalDsl.g:1430:2: rule__Module__Group__4__Impl
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
    // InternalDsl.g:1436:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1440:1: ( ( '}' ) )
            // InternalDsl.g:1441:1: ( '}' )
            {
            // InternalDsl.g:1441:1: ( '}' )
            // InternalDsl.g:1442:2: '}'
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
    // InternalDsl.g:1452:1: rule__Submodule__Group__0 : rule__Submodule__Group__0__Impl rule__Submodule__Group__1 ;
    public final void rule__Submodule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1456:1: ( rule__Submodule__Group__0__Impl rule__Submodule__Group__1 )
            // InternalDsl.g:1457:2: rule__Submodule__Group__0__Impl rule__Submodule__Group__1
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
    // InternalDsl.g:1464:1: rule__Submodule__Group__0__Impl : ( 'submodule' ) ;
    public final void rule__Submodule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1468:1: ( ( 'submodule' ) )
            // InternalDsl.g:1469:1: ( 'submodule' )
            {
            // InternalDsl.g:1469:1: ( 'submodule' )
            // InternalDsl.g:1470:2: 'submodule'
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
    // InternalDsl.g:1479:1: rule__Submodule__Group__1 : rule__Submodule__Group__1__Impl rule__Submodule__Group__2 ;
    public final void rule__Submodule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1483:1: ( rule__Submodule__Group__1__Impl rule__Submodule__Group__2 )
            // InternalDsl.g:1484:2: rule__Submodule__Group__1__Impl rule__Submodule__Group__2
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
    // InternalDsl.g:1491:1: rule__Submodule__Group__1__Impl : ( ( rule__Submodule__NameAssignment_1 ) ) ;
    public final void rule__Submodule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1495:1: ( ( ( rule__Submodule__NameAssignment_1 ) ) )
            // InternalDsl.g:1496:1: ( ( rule__Submodule__NameAssignment_1 ) )
            {
            // InternalDsl.g:1496:1: ( ( rule__Submodule__NameAssignment_1 ) )
            // InternalDsl.g:1497:2: ( rule__Submodule__NameAssignment_1 )
            {
             before(grammarAccess.getSubmoduleAccess().getNameAssignment_1()); 
            // InternalDsl.g:1498:2: ( rule__Submodule__NameAssignment_1 )
            // InternalDsl.g:1498:3: rule__Submodule__NameAssignment_1
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
    // InternalDsl.g:1506:1: rule__Submodule__Group__2 : rule__Submodule__Group__2__Impl rule__Submodule__Group__3 ;
    public final void rule__Submodule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1510:1: ( rule__Submodule__Group__2__Impl rule__Submodule__Group__3 )
            // InternalDsl.g:1511:2: rule__Submodule__Group__2__Impl rule__Submodule__Group__3
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
    // InternalDsl.g:1518:1: rule__Submodule__Group__2__Impl : ( '{' ) ;
    public final void rule__Submodule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1522:1: ( ( '{' ) )
            // InternalDsl.g:1523:1: ( '{' )
            {
            // InternalDsl.g:1523:1: ( '{' )
            // InternalDsl.g:1524:2: '{'
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
    // InternalDsl.g:1533:1: rule__Submodule__Group__3 : rule__Submodule__Group__3__Impl rule__Submodule__Group__4 ;
    public final void rule__Submodule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1537:1: ( rule__Submodule__Group__3__Impl rule__Submodule__Group__4 )
            // InternalDsl.g:1538:2: rule__Submodule__Group__3__Impl rule__Submodule__Group__4
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
    // InternalDsl.g:1545:1: rule__Submodule__Group__3__Impl : ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) ;
    public final void rule__Submodule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1549:1: ( ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) )
            // InternalDsl.g:1550:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            {
            // InternalDsl.g:1550:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            // InternalDsl.g:1551:2: ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* )
            {
            // InternalDsl.g:1551:2: ( ( rule__Submodule__OperationsAssignment_3 ) )
            // InternalDsl.g:1552:3: ( rule__Submodule__OperationsAssignment_3 )
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:1553:3: ( rule__Submodule__OperationsAssignment_3 )
            // InternalDsl.g:1553:4: rule__Submodule__OperationsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__Submodule__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 

            }

            // InternalDsl.g:1556:2: ( ( rule__Submodule__OperationsAssignment_3 )* )
            // InternalDsl.g:1557:3: ( rule__Submodule__OperationsAssignment_3 )*
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:1558:3: ( rule__Submodule__OperationsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1558:4: rule__Submodule__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Submodule__OperationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDsl.g:1567:1: rule__Submodule__Group__4 : rule__Submodule__Group__4__Impl rule__Submodule__Group__5 ;
    public final void rule__Submodule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1571:1: ( rule__Submodule__Group__4__Impl rule__Submodule__Group__5 )
            // InternalDsl.g:1572:2: rule__Submodule__Group__4__Impl rule__Submodule__Group__5
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
    // InternalDsl.g:1579:1: rule__Submodule__Group__4__Impl : ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) ;
    public final void rule__Submodule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1583:1: ( ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) )
            // InternalDsl.g:1584:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            {
            // InternalDsl.g:1584:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            // InternalDsl.g:1585:2: ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* )
            {
            // InternalDsl.g:1585:2: ( ( rule__Submodule__EntitiesAssignment_4 ) )
            // InternalDsl.g:1586:3: ( rule__Submodule__EntitiesAssignment_4 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:1587:3: ( rule__Submodule__EntitiesAssignment_4 )
            // InternalDsl.g:1587:4: rule__Submodule__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_19);
            rule__Submodule__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 

            }

            // InternalDsl.g:1590:2: ( ( rule__Submodule__EntitiesAssignment_4 )* )
            // InternalDsl.g:1591:3: ( rule__Submodule__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:1592:3: ( rule__Submodule__EntitiesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40||LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1592:4: rule__Submodule__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Submodule__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalDsl.g:1601:1: rule__Submodule__Group__5 : rule__Submodule__Group__5__Impl ;
    public final void rule__Submodule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1605:1: ( rule__Submodule__Group__5__Impl )
            // InternalDsl.g:1606:2: rule__Submodule__Group__5__Impl
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
    // InternalDsl.g:1612:1: rule__Submodule__Group__5__Impl : ( '}' ) ;
    public final void rule__Submodule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1616:1: ( ( '}' ) )
            // InternalDsl.g:1617:1: ( '}' )
            {
            // InternalDsl.g:1617:1: ( '}' )
            // InternalDsl.g:1618:2: '}'
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
    // InternalDsl.g:1628:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1632:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalDsl.g:1633:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
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
    // InternalDsl.g:1640:1: rule__Operation__Group__0__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1644:1: ( ( 'op' ) )
            // InternalDsl.g:1645:1: ( 'op' )
            {
            // InternalDsl.g:1645:1: ( 'op' )
            // InternalDsl.g:1646:2: 'op'
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
    // InternalDsl.g:1655:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1659:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalDsl.g:1660:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
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
    // InternalDsl.g:1667:1: rule__Operation__Group__1__Impl : ( '{' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1671:1: ( ( '{' ) )
            // InternalDsl.g:1672:1: ( '{' )
            {
            // InternalDsl.g:1672:1: ( '{' )
            // InternalDsl.g:1673:2: '{'
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
    // InternalDsl.g:1682:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1686:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalDsl.g:1687:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
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
    // InternalDsl.g:1694:1: rule__Operation__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1698:1: ( ( 'type:' ) )
            // InternalDsl.g:1699:1: ( 'type:' )
            {
            // InternalDsl.g:1699:1: ( 'type:' )
            // InternalDsl.g:1700:2: 'type:'
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
    // InternalDsl.g:1709:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1713:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalDsl.g:1714:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
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
    // InternalDsl.g:1721:1: rule__Operation__Group__3__Impl : ( ruleSubOperation ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1725:1: ( ( ruleSubOperation ) )
            // InternalDsl.g:1726:1: ( ruleSubOperation )
            {
            // InternalDsl.g:1726:1: ( ruleSubOperation )
            // InternalDsl.g:1727:2: ruleSubOperation
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
    // InternalDsl.g:1736:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1740:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalDsl.g:1741:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
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
    // InternalDsl.g:1748:1: rule__Operation__Group__4__Impl : ( 'operates_on:' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1752:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:1753:1: ( 'operates_on:' )
            {
            // InternalDsl.g:1753:1: ( 'operates_on:' )
            // InternalDsl.g:1754:2: 'operates_on:'
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
    // InternalDsl.g:1763:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1767:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalDsl.g:1768:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
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
    // InternalDsl.g:1775:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__TargetAssignment_5 ) ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1779:1: ( ( ( rule__Operation__TargetAssignment_5 ) ) )
            // InternalDsl.g:1780:1: ( ( rule__Operation__TargetAssignment_5 ) )
            {
            // InternalDsl.g:1780:1: ( ( rule__Operation__TargetAssignment_5 ) )
            // InternalDsl.g:1781:2: ( rule__Operation__TargetAssignment_5 )
            {
             before(grammarAccess.getOperationAccess().getTargetAssignment_5()); 
            // InternalDsl.g:1782:2: ( rule__Operation__TargetAssignment_5 )
            // InternalDsl.g:1782:3: rule__Operation__TargetAssignment_5
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
    // InternalDsl.g:1790:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1794:1: ( rule__Operation__Group__6__Impl )
            // InternalDsl.g:1795:2: rule__Operation__Group__6__Impl
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
    // InternalDsl.g:1801:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1805:1: ( ( '}' ) )
            // InternalDsl.g:1806:1: ( '}' )
            {
            // InternalDsl.g:1806:1: ( '}' )
            // InternalDsl.g:1807:2: '}'
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
    // InternalDsl.g:1817:1: rule__GeneralEntity__Group__0 : rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 ;
    public final void rule__GeneralEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1821:1: ( rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 )
            // InternalDsl.g:1822:2: rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1
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
    // InternalDsl.g:1829:1: rule__GeneralEntity__Group__0__Impl : ( 'generalEntity' ) ;
    public final void rule__GeneralEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1833:1: ( ( 'generalEntity' ) )
            // InternalDsl.g:1834:1: ( 'generalEntity' )
            {
            // InternalDsl.g:1834:1: ( 'generalEntity' )
            // InternalDsl.g:1835:2: 'generalEntity'
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
    // InternalDsl.g:1844:1: rule__GeneralEntity__Group__1 : rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 ;
    public final void rule__GeneralEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1848:1: ( rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 )
            // InternalDsl.g:1849:2: rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2
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
    // InternalDsl.g:1856:1: rule__GeneralEntity__Group__1__Impl : ( ruleEntityName ) ;
    public final void rule__GeneralEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1860:1: ( ( ruleEntityName ) )
            // InternalDsl.g:1861:1: ( ruleEntityName )
            {
            // InternalDsl.g:1861:1: ( ruleEntityName )
            // InternalDsl.g:1862:2: ruleEntityName
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
    // InternalDsl.g:1871:1: rule__GeneralEntity__Group__2 : rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 ;
    public final void rule__GeneralEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1875:1: ( rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 )
            // InternalDsl.g:1876:2: rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3
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
    // InternalDsl.g:1883:1: rule__GeneralEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1887:1: ( ( '{' ) )
            // InternalDsl.g:1888:1: ( '{' )
            {
            // InternalDsl.g:1888:1: ( '{' )
            // InternalDsl.g:1889:2: '{'
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
    // InternalDsl.g:1898:1: rule__GeneralEntity__Group__3 : rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 ;
    public final void rule__GeneralEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1902:1: ( rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 )
            // InternalDsl.g:1903:2: rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4
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
    // InternalDsl.g:1910:1: rule__GeneralEntity__Group__3__Impl : ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__GeneralEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1914:1: ( ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1915:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1915:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1916:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1916:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1917:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1918:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1918:4: rule__GeneralEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_23);
            rule__GeneralEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1921:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1922:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1923:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1923:4: rule__GeneralEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__GeneralEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDsl.g:1932:1: rule__GeneralEntity__Group__4 : rule__GeneralEntity__Group__4__Impl ;
    public final void rule__GeneralEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1936:1: ( rule__GeneralEntity__Group__4__Impl )
            // InternalDsl.g:1937:2: rule__GeneralEntity__Group__4__Impl
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
    // InternalDsl.g:1943:1: rule__GeneralEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1947:1: ( ( '}' ) )
            // InternalDsl.g:1948:1: ( '}' )
            {
            // InternalDsl.g:1948:1: ( '}' )
            // InternalDsl.g:1949:2: '}'
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
    // InternalDsl.g:1959:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1963:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDsl.g:1964:2: rule__Property__Group__0__Impl rule__Property__Group__1
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
    // InternalDsl.g:1971:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1975:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalDsl.g:1976:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalDsl.g:1976:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalDsl.g:1977:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalDsl.g:1978:2: ( rule__Property__NameAssignment_0 )
            // InternalDsl.g:1978:3: rule__Property__NameAssignment_0
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
    // InternalDsl.g:1986:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1990:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalDsl.g:1991:2: rule__Property__Group__1__Impl rule__Property__Group__2
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
    // InternalDsl.g:1998:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2002:1: ( ( ':' ) )
            // InternalDsl.g:2003:1: ( ':' )
            {
            // InternalDsl.g:2003:1: ( ':' )
            // InternalDsl.g:2004:2: ':'
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
    // InternalDsl.g:2013:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2017:1: ( rule__Property__Group__2__Impl )
            // InternalDsl.g:2018:2: rule__Property__Group__2__Impl
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
    // InternalDsl.g:2024:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2028:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalDsl.g:2029:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalDsl.g:2029:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalDsl.g:2030:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalDsl.g:2031:2: ( rule__Property__TypeAssignment_2 )
            // InternalDsl.g:2031:3: rule__Property__TypeAssignment_2
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
    // InternalDsl.g:2040:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2044:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDsl.g:2045:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalDsl.g:2052:1: rule__Type__Group__0__Impl : ( 'dataType' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2056:1: ( ( 'dataType' ) )
            // InternalDsl.g:2057:1: ( 'dataType' )
            {
            // InternalDsl.g:2057:1: ( 'dataType' )
            // InternalDsl.g:2058:2: 'dataType'
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
    // InternalDsl.g:2067:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2071:1: ( rule__Type__Group__1__Impl )
            // InternalDsl.g:2072:2: rule__Type__Group__1__Impl
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
    // InternalDsl.g:2078:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2082:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalDsl.g:2083:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalDsl.g:2083:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalDsl.g:2084:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalDsl.g:2085:2: ( rule__Type__NameAssignment_1 )
            // InternalDsl.g:2085:3: rule__Type__NameAssignment_1
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
    // InternalDsl.g:2094:1: rule__SpecialEntity__Group__0 : rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 ;
    public final void rule__SpecialEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2098:1: ( rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 )
            // InternalDsl.g:2099:2: rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1
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
    // InternalDsl.g:2106:1: rule__SpecialEntity__Group__0__Impl : ( 'specialEntity' ) ;
    public final void rule__SpecialEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2110:1: ( ( 'specialEntity' ) )
            // InternalDsl.g:2111:1: ( 'specialEntity' )
            {
            // InternalDsl.g:2111:1: ( 'specialEntity' )
            // InternalDsl.g:2112:2: 'specialEntity'
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
    // InternalDsl.g:2121:1: rule__SpecialEntity__Group__1 : rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 ;
    public final void rule__SpecialEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2125:1: ( rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 )
            // InternalDsl.g:2126:2: rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2
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
    // InternalDsl.g:2133:1: rule__SpecialEntity__Group__1__Impl : ( ruleEntityName ) ;
    public final void rule__SpecialEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2137:1: ( ( ruleEntityName ) )
            // InternalDsl.g:2138:1: ( ruleEntityName )
            {
            // InternalDsl.g:2138:1: ( ruleEntityName )
            // InternalDsl.g:2139:2: ruleEntityName
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
    // InternalDsl.g:2148:1: rule__SpecialEntity__Group__2 : rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 ;
    public final void rule__SpecialEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2152:1: ( rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 )
            // InternalDsl.g:2153:2: rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3
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
    // InternalDsl.g:2160:1: rule__SpecialEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SpecialEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2164:1: ( ( '{' ) )
            // InternalDsl.g:2165:1: ( '{' )
            {
            // InternalDsl.g:2165:1: ( '{' )
            // InternalDsl.g:2166:2: '{'
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
    // InternalDsl.g:2175:1: rule__SpecialEntity__Group__3 : rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 ;
    public final void rule__SpecialEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2179:1: ( rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 )
            // InternalDsl.g:2180:2: rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4
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
    // InternalDsl.g:2187:1: rule__SpecialEntity__Group__3__Impl : ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__SpecialEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2191:1: ( ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:2192:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:2192:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:2193:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:2193:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:2194:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:2195:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            // InternalDsl.g:2195:4: rule__SpecialEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_23);
            rule__SpecialEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:2198:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:2199:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:2200:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:2200:4: rule__SpecialEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SpecialEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDsl.g:2209:1: rule__SpecialEntity__Group__4 : rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 ;
    public final void rule__SpecialEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2213:1: ( rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 )
            // InternalDsl.g:2214:2: rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5
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
    // InternalDsl.g:2221:1: rule__SpecialEntity__Group__4__Impl : ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) ;
    public final void rule__SpecialEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2225:1: ( ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) )
            // InternalDsl.g:2226:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            {
            // InternalDsl.g:2226:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            // InternalDsl.g:2227:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            {
            // InternalDsl.g:2227:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) )
            // InternalDsl.g:2228:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:2229:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            // InternalDsl.g:2229:4: rule__SpecialEntity__TransactionsAssignment_4
            {
            pushFollow(FOLLOW_26);
            rule__SpecialEntity__TransactionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 

            }

            // InternalDsl.g:2232:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            // InternalDsl.g:2233:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:2234:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:2234:4: rule__SpecialEntity__TransactionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__SpecialEntity__TransactionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDsl.g:2243:1: rule__SpecialEntity__Group__5 : rule__SpecialEntity__Group__5__Impl ;
    public final void rule__SpecialEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2247:1: ( rule__SpecialEntity__Group__5__Impl )
            // InternalDsl.g:2248:2: rule__SpecialEntity__Group__5__Impl
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
    // InternalDsl.g:2254:1: rule__SpecialEntity__Group__5__Impl : ( '}' ) ;
    public final void rule__SpecialEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2258:1: ( ( '}' ) )
            // InternalDsl.g:2259:1: ( '}' )
            {
            // InternalDsl.g:2259:1: ( '}' )
            // InternalDsl.g:2260:2: '}'
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
    // InternalDsl.g:2270:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2274:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalDsl.g:2275:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
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
    // InternalDsl.g:2282:1: rule__Transaction__Group__0__Impl : ( 'trx' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2286:1: ( ( 'trx' ) )
            // InternalDsl.g:2287:1: ( 'trx' )
            {
            // InternalDsl.g:2287:1: ( 'trx' )
            // InternalDsl.g:2288:2: 'trx'
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
    // InternalDsl.g:2297:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2301:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalDsl.g:2302:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
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
    // InternalDsl.g:2309:1: rule__Transaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2313:1: ( ( '{' ) )
            // InternalDsl.g:2314:1: ( '{' )
            {
            // InternalDsl.g:2314:1: ( '{' )
            // InternalDsl.g:2315:2: '{'
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
    // InternalDsl.g:2324:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2328:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalDsl.g:2329:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
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
    // InternalDsl.g:2336:1: rule__Transaction__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2340:1: ( ( 'type:' ) )
            // InternalDsl.g:2341:1: ( 'type:' )
            {
            // InternalDsl.g:2341:1: ( 'type:' )
            // InternalDsl.g:2342:2: 'type:'
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
    // InternalDsl.g:2351:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2355:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalDsl.g:2356:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
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
    // InternalDsl.g:2363:1: rule__Transaction__Group__3__Impl : ( ruleSubTransaction ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2367:1: ( ( ruleSubTransaction ) )
            // InternalDsl.g:2368:1: ( ruleSubTransaction )
            {
            // InternalDsl.g:2368:1: ( ruleSubTransaction )
            // InternalDsl.g:2369:2: ruleSubTransaction
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
    // InternalDsl.g:2378:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2382:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalDsl.g:2383:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
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
    // InternalDsl.g:2390:1: rule__Transaction__Group__4__Impl : ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2394:1: ( ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) )
            // InternalDsl.g:2395:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            {
            // InternalDsl.g:2395:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            // InternalDsl.g:2396:2: ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* )
            {
            // InternalDsl.g:2396:2: ( ( rule__Transaction__OperatesonAssignment_4 ) )
            // InternalDsl.g:2397:3: ( rule__Transaction__OperatesonAssignment_4 )
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:2398:3: ( rule__Transaction__OperatesonAssignment_4 )
            // InternalDsl.g:2398:4: rule__Transaction__OperatesonAssignment_4
            {
            pushFollow(FOLLOW_28);
            rule__Transaction__OperatesonAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 

            }

            // InternalDsl.g:2401:2: ( ( rule__Transaction__OperatesonAssignment_4 )* )
            // InternalDsl.g:2402:3: ( rule__Transaction__OperatesonAssignment_4 )*
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:2403:3: ( rule__Transaction__OperatesonAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:2403:4: rule__Transaction__OperatesonAssignment_4
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Transaction__OperatesonAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDsl.g:2412:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2416:1: ( rule__Transaction__Group__5__Impl )
            // InternalDsl.g:2417:2: rule__Transaction__Group__5__Impl
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
    // InternalDsl.g:2423:1: rule__Transaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2427:1: ( ( '}' ) )
            // InternalDsl.g:2428:1: ( '}' )
            {
            // InternalDsl.g:2428:1: ( '}' )
            // InternalDsl.g:2429:2: '}'
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
    // InternalDsl.g:2439:1: rule__Operateson__Group__0 : rule__Operateson__Group__0__Impl rule__Operateson__Group__1 ;
    public final void rule__Operateson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2443:1: ( rule__Operateson__Group__0__Impl rule__Operateson__Group__1 )
            // InternalDsl.g:2444:2: rule__Operateson__Group__0__Impl rule__Operateson__Group__1
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
    // InternalDsl.g:2451:1: rule__Operateson__Group__0__Impl : ( 'operates_on:' ) ;
    public final void rule__Operateson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2455:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:2456:1: ( 'operates_on:' )
            {
            // InternalDsl.g:2456:1: ( 'operates_on:' )
            // InternalDsl.g:2457:2: 'operates_on:'
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
    // InternalDsl.g:2466:1: rule__Operateson__Group__1 : rule__Operateson__Group__1__Impl ;
    public final void rule__Operateson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2470:1: ( rule__Operateson__Group__1__Impl )
            // InternalDsl.g:2471:2: rule__Operateson__Group__1__Impl
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
    // InternalDsl.g:2477:1: rule__Operateson__Group__1__Impl : ( ( rule__Operateson__OperatesonAssignment_1 ) ) ;
    public final void rule__Operateson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2481:1: ( ( ( rule__Operateson__OperatesonAssignment_1 ) ) )
            // InternalDsl.g:2482:1: ( ( rule__Operateson__OperatesonAssignment_1 ) )
            {
            // InternalDsl.g:2482:1: ( ( rule__Operateson__OperatesonAssignment_1 ) )
            // InternalDsl.g:2483:2: ( rule__Operateson__OperatesonAssignment_1 )
            {
             before(grammarAccess.getOperatesonAccess().getOperatesonAssignment_1()); 
            // InternalDsl.g:2484:2: ( rule__Operateson__OperatesonAssignment_1 )
            // InternalDsl.g:2484:3: rule__Operateson__OperatesonAssignment_1
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
    // InternalDsl.g:2493:1: rule__RelationDom__Group__0 : rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 ;
    public final void rule__RelationDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2497:1: ( rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 )
            // InternalDsl.g:2498:2: rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1
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
    // InternalDsl.g:2505:1: rule__RelationDom__Group__0__Impl : ( 'rel' ) ;
    public final void rule__RelationDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2509:1: ( ( 'rel' ) )
            // InternalDsl.g:2510:1: ( 'rel' )
            {
            // InternalDsl.g:2510:1: ( 'rel' )
            // InternalDsl.g:2511:2: 'rel'
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
    // InternalDsl.g:2520:1: rule__RelationDom__Group__1 : rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 ;
    public final void rule__RelationDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2524:1: ( rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 )
            // InternalDsl.g:2525:2: rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2
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
    // InternalDsl.g:2532:1: rule__RelationDom__Group__1__Impl : ( '{' ) ;
    public final void rule__RelationDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2536:1: ( ( '{' ) )
            // InternalDsl.g:2537:1: ( '{' )
            {
            // InternalDsl.g:2537:1: ( '{' )
            // InternalDsl.g:2538:2: '{'
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
    // InternalDsl.g:2547:1: rule__RelationDom__Group__2 : rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 ;
    public final void rule__RelationDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2551:1: ( rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 )
            // InternalDsl.g:2552:2: rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3
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
    // InternalDsl.g:2559:1: rule__RelationDom__Group__2__Impl : ( 'type:' ) ;
    public final void rule__RelationDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2563:1: ( ( 'type:' ) )
            // InternalDsl.g:2564:1: ( 'type:' )
            {
            // InternalDsl.g:2564:1: ( 'type:' )
            // InternalDsl.g:2565:2: 'type:'
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
    // InternalDsl.g:2574:1: rule__RelationDom__Group__3 : rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 ;
    public final void rule__RelationDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2578:1: ( rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 )
            // InternalDsl.g:2579:2: rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4
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
    // InternalDsl.g:2586:1: rule__RelationDom__Group__3__Impl : ( 'Composition' ) ;
    public final void rule__RelationDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2590:1: ( ( 'Composition' ) )
            // InternalDsl.g:2591:1: ( 'Composition' )
            {
            // InternalDsl.g:2591:1: ( 'Composition' )
            // InternalDsl.g:2592:2: 'Composition'
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
    // InternalDsl.g:2601:1: rule__RelationDom__Group__4 : rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 ;
    public final void rule__RelationDom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2605:1: ( rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 )
            // InternalDsl.g:2606:2: rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5
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
    // InternalDsl.g:2613:1: rule__RelationDom__Group__4__Impl : ( 'source:' ) ;
    public final void rule__RelationDom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2617:1: ( ( 'source:' ) )
            // InternalDsl.g:2618:1: ( 'source:' )
            {
            // InternalDsl.g:2618:1: ( 'source:' )
            // InternalDsl.g:2619:2: 'source:'
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
    // InternalDsl.g:2628:1: rule__RelationDom__Group__5 : rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 ;
    public final void rule__RelationDom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2632:1: ( rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 )
            // InternalDsl.g:2633:2: rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6
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
    // InternalDsl.g:2640:1: rule__RelationDom__Group__5__Impl : ( ( rule__RelationDom__SourceAssignment_5 ) ) ;
    public final void rule__RelationDom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2644:1: ( ( ( rule__RelationDom__SourceAssignment_5 ) ) )
            // InternalDsl.g:2645:1: ( ( rule__RelationDom__SourceAssignment_5 ) )
            {
            // InternalDsl.g:2645:1: ( ( rule__RelationDom__SourceAssignment_5 ) )
            // InternalDsl.g:2646:2: ( rule__RelationDom__SourceAssignment_5 )
            {
             before(grammarAccess.getRelationDomAccess().getSourceAssignment_5()); 
            // InternalDsl.g:2647:2: ( rule__RelationDom__SourceAssignment_5 )
            // InternalDsl.g:2647:3: rule__RelationDom__SourceAssignment_5
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
    // InternalDsl.g:2655:1: rule__RelationDom__Group__6 : rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 ;
    public final void rule__RelationDom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2659:1: ( rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 )
            // InternalDsl.g:2660:2: rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7
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
    // InternalDsl.g:2667:1: rule__RelationDom__Group__6__Impl : ( 'target:' ) ;
    public final void rule__RelationDom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2671:1: ( ( 'target:' ) )
            // InternalDsl.g:2672:1: ( 'target:' )
            {
            // InternalDsl.g:2672:1: ( 'target:' )
            // InternalDsl.g:2673:2: 'target:'
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
    // InternalDsl.g:2682:1: rule__RelationDom__Group__7 : rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 ;
    public final void rule__RelationDom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2686:1: ( rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 )
            // InternalDsl.g:2687:2: rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8
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
    // InternalDsl.g:2694:1: rule__RelationDom__Group__7__Impl : ( ( rule__RelationDom__TargetAssignment_7 ) ) ;
    public final void rule__RelationDom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2698:1: ( ( ( rule__RelationDom__TargetAssignment_7 ) ) )
            // InternalDsl.g:2699:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            {
            // InternalDsl.g:2699:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            // InternalDsl.g:2700:2: ( rule__RelationDom__TargetAssignment_7 )
            {
             before(grammarAccess.getRelationDomAccess().getTargetAssignment_7()); 
            // InternalDsl.g:2701:2: ( rule__RelationDom__TargetAssignment_7 )
            // InternalDsl.g:2701:3: rule__RelationDom__TargetAssignment_7
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
    // InternalDsl.g:2709:1: rule__RelationDom__Group__8 : rule__RelationDom__Group__8__Impl ;
    public final void rule__RelationDom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2713:1: ( rule__RelationDom__Group__8__Impl )
            // InternalDsl.g:2714:2: rule__RelationDom__Group__8__Impl
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
    // InternalDsl.g:2720:1: rule__RelationDom__Group__8__Impl : ( '}' ) ;
    public final void rule__RelationDom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2724:1: ( ( '}' ) )
            // InternalDsl.g:2725:1: ( '}' )
            {
            // InternalDsl.g:2725:1: ( '}' )
            // InternalDsl.g:2726:2: '}'
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
    // InternalDsl.g:2736:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2740:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalDsl.g:2741:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
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
    // InternalDsl.g:2748:1: rule__Architecture__Group__0__Impl : ( 'arch' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2752:1: ( ( 'arch' ) )
            // InternalDsl.g:2753:1: ( 'arch' )
            {
            // InternalDsl.g:2753:1: ( 'arch' )
            // InternalDsl.g:2754:2: 'arch'
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
    // InternalDsl.g:2763:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2767:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalDsl.g:2768:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
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
    // InternalDsl.g:2775:1: rule__Architecture__Group__1__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2779:1: ( ( '{' ) )
            // InternalDsl.g:2780:1: ( '{' )
            {
            // InternalDsl.g:2780:1: ( '{' )
            // InternalDsl.g:2781:2: '{'
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
    // InternalDsl.g:2790:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2794:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalDsl.g:2795:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
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
    // InternalDsl.g:2802:1: rule__Architecture__Group__2__Impl : ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2806:1: ( ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) ) )
            // InternalDsl.g:2807:1: ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) )
            {
            // InternalDsl.g:2807:1: ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) )
            // InternalDsl.g:2808:2: ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* )
            {
            // InternalDsl.g:2808:2: ( ( rule__Architecture__ComponentesAssignment_2 ) )
            // InternalDsl.g:2809:3: ( rule__Architecture__ComponentesAssignment_2 )
            {
             before(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 
            // InternalDsl.g:2810:3: ( rule__Architecture__ComponentesAssignment_2 )
            // InternalDsl.g:2810:4: rule__Architecture__ComponentesAssignment_2
            {
            pushFollow(FOLLOW_34);
            rule__Architecture__ComponentesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 

            }

            // InternalDsl.g:2813:2: ( ( rule__Architecture__ComponentesAssignment_2 )* )
            // InternalDsl.g:2814:3: ( rule__Architecture__ComponentesAssignment_2 )*
            {
             before(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 
            // InternalDsl.g:2815:3: ( rule__Architecture__ComponentesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:2815:4: rule__Architecture__ComponentesAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Architecture__ComponentesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDsl.g:2824:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2828:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalDsl.g:2829:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
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
    // InternalDsl.g:2836:1: rule__Architecture__Group__3__Impl : ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2840:1: ( ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) ) )
            // InternalDsl.g:2841:1: ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) )
            {
            // InternalDsl.g:2841:1: ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) )
            // InternalDsl.g:2842:2: ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* )
            {
            // InternalDsl.g:2842:2: ( ( rule__Architecture__RelationArchAssignment_3 ) )
            // InternalDsl.g:2843:3: ( rule__Architecture__RelationArchAssignment_3 )
            {
             before(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 
            // InternalDsl.g:2844:3: ( rule__Architecture__RelationArchAssignment_3 )
            // InternalDsl.g:2844:4: rule__Architecture__RelationArchAssignment_3
            {
            pushFollow(FOLLOW_35);
            rule__Architecture__RelationArchAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 

            }

            // InternalDsl.g:2847:2: ( ( rule__Architecture__RelationArchAssignment_3 )* )
            // InternalDsl.g:2848:3: ( rule__Architecture__RelationArchAssignment_3 )*
            {
             before(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 
            // InternalDsl.g:2849:3: ( rule__Architecture__RelationArchAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==55) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:2849:4: rule__Architecture__RelationArchAssignment_3
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Architecture__RelationArchAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalDsl.g:2858:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2862:1: ( rule__Architecture__Group__4__Impl )
            // InternalDsl.g:2863:2: rule__Architecture__Group__4__Impl
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
    // InternalDsl.g:2869:1: rule__Architecture__Group__4__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2873:1: ( ( '}' ) )
            // InternalDsl.g:2874:1: ( '}' )
            {
            // InternalDsl.g:2874:1: ( '}' )
            // InternalDsl.g:2875:2: '}'
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
    // InternalDsl.g:2885:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2889:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalDsl.g:2890:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalDsl.g:2897:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2901:1: ( ( 'component' ) )
            // InternalDsl.g:2902:1: ( 'component' )
            {
            // InternalDsl.g:2902:1: ( 'component' )
            // InternalDsl.g:2903:2: 'component'
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
    // InternalDsl.g:2912:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2916:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalDsl.g:2917:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalDsl.g:2924:1: rule__Component__Group__1__Impl : ( ruleComponentName ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2928:1: ( ( ruleComponentName ) )
            // InternalDsl.g:2929:1: ( ruleComponentName )
            {
            // InternalDsl.g:2929:1: ( ruleComponentName )
            // InternalDsl.g:2930:2: ruleComponentName
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
    // InternalDsl.g:2939:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2943:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalDsl.g:2944:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalDsl.g:2951:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2955:1: ( ( '{' ) )
            // InternalDsl.g:2956:1: ( '{' )
            {
            // InternalDsl.g:2956:1: ( '{' )
            // InternalDsl.g:2957:2: '{'
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
    // InternalDsl.g:2966:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2970:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalDsl.g:2971:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalDsl.g:2978:1: rule__Component__Group__3__Impl : ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2982:1: ( ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) ) )
            // InternalDsl.g:2983:1: ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) )
            {
            // InternalDsl.g:2983:1: ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) )
            // InternalDsl.g:2984:2: ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* )
            {
            // InternalDsl.g:2984:2: ( ( rule__Component__LayerAssignment_3 ) )
            // InternalDsl.g:2985:3: ( rule__Component__LayerAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getLayerAssignment_3()); 
            // InternalDsl.g:2986:3: ( rule__Component__LayerAssignment_3 )
            // InternalDsl.g:2986:4: rule__Component__LayerAssignment_3
            {
            pushFollow(FOLLOW_38);
            rule__Component__LayerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getLayerAssignment_3()); 

            }

            // InternalDsl.g:2989:2: ( ( rule__Component__LayerAssignment_3 )* )
            // InternalDsl.g:2990:3: ( rule__Component__LayerAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getLayerAssignment_3()); 
            // InternalDsl.g:2991:3: ( rule__Component__LayerAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==51) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:2991:4: rule__Component__LayerAssignment_3
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Component__LayerAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalDsl.g:3000:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3004:1: ( rule__Component__Group__4__Impl )
            // InternalDsl.g:3005:2: rule__Component__Group__4__Impl
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
    // InternalDsl.g:3011:1: rule__Component__Group__4__Impl : ( '}' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3015:1: ( ( '}' ) )
            // InternalDsl.g:3016:1: ( '}' )
            {
            // InternalDsl.g:3016:1: ( '}' )
            // InternalDsl.g:3017:2: '}'
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
    // InternalDsl.g:3027:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3031:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalDsl.g:3032:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
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
    // InternalDsl.g:3039:1: rule__Layer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3043:1: ( ( 'layer' ) )
            // InternalDsl.g:3044:1: ( 'layer' )
            {
            // InternalDsl.g:3044:1: ( 'layer' )
            // InternalDsl.g:3045:2: 'layer'
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
    // InternalDsl.g:3054:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3058:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalDsl.g:3059:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
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
    // InternalDsl.g:3066:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3070:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // InternalDsl.g:3071:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // InternalDsl.g:3071:1: ( ( rule__Layer__NameAssignment_1 ) )
            // InternalDsl.g:3072:2: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // InternalDsl.g:3073:2: ( rule__Layer__NameAssignment_1 )
            // InternalDsl.g:3073:3: rule__Layer__NameAssignment_1
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
    // InternalDsl.g:3081:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3085:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalDsl.g:3086:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
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
    // InternalDsl.g:3093:1: rule__Layer__Group__2__Impl : ( '{' ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3097:1: ( ( '{' ) )
            // InternalDsl.g:3098:1: ( '{' )
            {
            // InternalDsl.g:3098:1: ( '{' )
            // InternalDsl.g:3099:2: '{'
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
    // InternalDsl.g:3108:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3112:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalDsl.g:3113:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
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
    // InternalDsl.g:3120:1: rule__Layer__Group__3__Impl : ( ( rule__Layer__LayerSegmentsAssignment_3 )* ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3124:1: ( ( ( rule__Layer__LayerSegmentsAssignment_3 )* ) )
            // InternalDsl.g:3125:1: ( ( rule__Layer__LayerSegmentsAssignment_3 )* )
            {
            // InternalDsl.g:3125:1: ( ( rule__Layer__LayerSegmentsAssignment_3 )* )
            // InternalDsl.g:3126:2: ( rule__Layer__LayerSegmentsAssignment_3 )*
            {
             before(grammarAccess.getLayerAccess().getLayerSegmentsAssignment_3()); 
            // InternalDsl.g:3127:2: ( rule__Layer__LayerSegmentsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==52) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:3127:3: rule__Layer__LayerSegmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Layer__LayerSegmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDsl.g:3135:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3139:1: ( rule__Layer__Group__4__Impl )
            // InternalDsl.g:3140:2: rule__Layer__Group__4__Impl
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
    // InternalDsl.g:3146:1: rule__Layer__Group__4__Impl : ( '}' ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3150:1: ( ( '}' ) )
            // InternalDsl.g:3151:1: ( '}' )
            {
            // InternalDsl.g:3151:1: ( '}' )
            // InternalDsl.g:3152:2: '}'
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
    // InternalDsl.g:3162:1: rule__LayerSegment__Group__0 : rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1 ;
    public final void rule__LayerSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3166:1: ( rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1 )
            // InternalDsl.g:3167:2: rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1
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
    // InternalDsl.g:3174:1: rule__LayerSegment__Group__0__Impl : ( 'layerSegment' ) ;
    public final void rule__LayerSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3178:1: ( ( 'layerSegment' ) )
            // InternalDsl.g:3179:1: ( 'layerSegment' )
            {
            // InternalDsl.g:3179:1: ( 'layerSegment' )
            // InternalDsl.g:3180:2: 'layerSegment'
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
    // InternalDsl.g:3189:1: rule__LayerSegment__Group__1 : rule__LayerSegment__Group__1__Impl rule__LayerSegment__Group__2 ;
    public final void rule__LayerSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3193:1: ( rule__LayerSegment__Group__1__Impl rule__LayerSegment__Group__2 )
            // InternalDsl.g:3194:2: rule__LayerSegment__Group__1__Impl rule__LayerSegment__Group__2
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
    // InternalDsl.g:3201:1: rule__LayerSegment__Group__1__Impl : ( ( rule__LayerSegment__NameAssignment_1 ) ) ;
    public final void rule__LayerSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3205:1: ( ( ( rule__LayerSegment__NameAssignment_1 ) ) )
            // InternalDsl.g:3206:1: ( ( rule__LayerSegment__NameAssignment_1 ) )
            {
            // InternalDsl.g:3206:1: ( ( rule__LayerSegment__NameAssignment_1 ) )
            // InternalDsl.g:3207:2: ( rule__LayerSegment__NameAssignment_1 )
            {
             before(grammarAccess.getLayerSegmentAccess().getNameAssignment_1()); 
            // InternalDsl.g:3208:2: ( rule__LayerSegment__NameAssignment_1 )
            // InternalDsl.g:3208:3: rule__LayerSegment__NameAssignment_1
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
    // InternalDsl.g:3216:1: rule__LayerSegment__Group__2 : rule__LayerSegment__Group__2__Impl rule__LayerSegment__Group__3 ;
    public final void rule__LayerSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3220:1: ( rule__LayerSegment__Group__2__Impl rule__LayerSegment__Group__3 )
            // InternalDsl.g:3221:2: rule__LayerSegment__Group__2__Impl rule__LayerSegment__Group__3
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
    // InternalDsl.g:3228:1: rule__LayerSegment__Group__2__Impl : ( '{' ) ;
    public final void rule__LayerSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3232:1: ( ( '{' ) )
            // InternalDsl.g:3233:1: ( '{' )
            {
            // InternalDsl.g:3233:1: ( '{' )
            // InternalDsl.g:3234:2: '{'
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
    // InternalDsl.g:3243:1: rule__LayerSegment__Group__3 : rule__LayerSegment__Group__3__Impl rule__LayerSegment__Group__4 ;
    public final void rule__LayerSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3247:1: ( rule__LayerSegment__Group__3__Impl rule__LayerSegment__Group__4 )
            // InternalDsl.g:3248:2: rule__LayerSegment__Group__3__Impl rule__LayerSegment__Group__4
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
    // InternalDsl.g:3255:1: rule__LayerSegment__Group__3__Impl : ( ( rule__LayerSegment__Group_3__0 )? ) ;
    public final void rule__LayerSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3259:1: ( ( ( rule__LayerSegment__Group_3__0 )? ) )
            // InternalDsl.g:3260:1: ( ( rule__LayerSegment__Group_3__0 )? )
            {
            // InternalDsl.g:3260:1: ( ( rule__LayerSegment__Group_3__0 )? )
            // InternalDsl.g:3261:2: ( rule__LayerSegment__Group_3__0 )?
            {
             before(grammarAccess.getLayerSegmentAccess().getGroup_3()); 
            // InternalDsl.g:3262:2: ( rule__LayerSegment__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:3262:3: rule__LayerSegment__Group_3__0
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
    // InternalDsl.g:3270:1: rule__LayerSegment__Group__4 : rule__LayerSegment__Group__4__Impl rule__LayerSegment__Group__5 ;
    public final void rule__LayerSegment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3274:1: ( rule__LayerSegment__Group__4__Impl rule__LayerSegment__Group__5 )
            // InternalDsl.g:3275:2: rule__LayerSegment__Group__4__Impl rule__LayerSegment__Group__5
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
    // InternalDsl.g:3282:1: rule__LayerSegment__Group__4__Impl : ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* ) ;
    public final void rule__LayerSegment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3286:1: ( ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* ) )
            // InternalDsl.g:3287:1: ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* )
            {
            // InternalDsl.g:3287:1: ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* )
            // InternalDsl.g:3288:2: ( rule__LayerSegment__SublayerSegmentsAssignment_4 )*
            {
             before(grammarAccess.getLayerSegmentAccess().getSublayerSegmentsAssignment_4()); 
            // InternalDsl.g:3289:2: ( rule__LayerSegment__SublayerSegmentsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==54) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:3289:3: rule__LayerSegment__SublayerSegmentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__LayerSegment__SublayerSegmentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalDsl.g:3297:1: rule__LayerSegment__Group__5 : rule__LayerSegment__Group__5__Impl ;
    public final void rule__LayerSegment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3301:1: ( rule__LayerSegment__Group__5__Impl )
            // InternalDsl.g:3302:2: rule__LayerSegment__Group__5__Impl
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
    // InternalDsl.g:3308:1: rule__LayerSegment__Group__5__Impl : ( '}' ) ;
    public final void rule__LayerSegment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3312:1: ( ( '}' ) )
            // InternalDsl.g:3313:1: ( '}' )
            {
            // InternalDsl.g:3313:1: ( '}' )
            // InternalDsl.g:3314:2: '}'
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
    // InternalDsl.g:3324:1: rule__LayerSegment__Group_3__0 : rule__LayerSegment__Group_3__0__Impl rule__LayerSegment__Group_3__1 ;
    public final void rule__LayerSegment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3328:1: ( rule__LayerSegment__Group_3__0__Impl rule__LayerSegment__Group_3__1 )
            // InternalDsl.g:3329:2: rule__LayerSegment__Group_3__0__Impl rule__LayerSegment__Group_3__1
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
    // InternalDsl.g:3336:1: rule__LayerSegment__Group_3__0__Impl : ( '{' ) ;
    public final void rule__LayerSegment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3340:1: ( ( '{' ) )
            // InternalDsl.g:3341:1: ( '{' )
            {
            // InternalDsl.g:3341:1: ( '{' )
            // InternalDsl.g:3342:2: '{'
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
    // InternalDsl.g:3351:1: rule__LayerSegment__Group_3__1 : rule__LayerSegment__Group_3__1__Impl rule__LayerSegment__Group_3__2 ;
    public final void rule__LayerSegment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3355:1: ( rule__LayerSegment__Group_3__1__Impl rule__LayerSegment__Group_3__2 )
            // InternalDsl.g:3356:2: rule__LayerSegment__Group_3__1__Impl rule__LayerSegment__Group_3__2
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
    // InternalDsl.g:3363:1: rule__LayerSegment__Group_3__1__Impl : ( ( rule__LayerSegment__RelationsAssignment_3_1 )* ) ;
    public final void rule__LayerSegment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3367:1: ( ( ( rule__LayerSegment__RelationsAssignment_3_1 )* ) )
            // InternalDsl.g:3368:1: ( ( rule__LayerSegment__RelationsAssignment_3_1 )* )
            {
            // InternalDsl.g:3368:1: ( ( rule__LayerSegment__RelationsAssignment_3_1 )* )
            // InternalDsl.g:3369:2: ( rule__LayerSegment__RelationsAssignment_3_1 )*
            {
             before(grammarAccess.getLayerSegmentAccess().getRelationsAssignment_3_1()); 
            // InternalDsl.g:3370:2: ( rule__LayerSegment__RelationsAssignment_3_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:3370:3: rule__LayerSegment__RelationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__LayerSegment__RelationsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalDsl.g:3378:1: rule__LayerSegment__Group_3__2 : rule__LayerSegment__Group_3__2__Impl ;
    public final void rule__LayerSegment__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3382:1: ( rule__LayerSegment__Group_3__2__Impl )
            // InternalDsl.g:3383:2: rule__LayerSegment__Group_3__2__Impl
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
    // InternalDsl.g:3389:1: rule__LayerSegment__Group_3__2__Impl : ( '}' ) ;
    public final void rule__LayerSegment__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3393:1: ( ( '}' ) )
            // InternalDsl.g:3394:1: ( '}' )
            {
            // InternalDsl.g:3394:1: ( '}' )
            // InternalDsl.g:3395:2: '}'
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
    // InternalDsl.g:3405:1: rule__LayerSegmentRelation__Group__0 : rule__LayerSegmentRelation__Group__0__Impl rule__LayerSegmentRelation__Group__1 ;
    public final void rule__LayerSegmentRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3409:1: ( rule__LayerSegmentRelation__Group__0__Impl rule__LayerSegmentRelation__Group__1 )
            // InternalDsl.g:3410:2: rule__LayerSegmentRelation__Group__0__Impl rule__LayerSegmentRelation__Group__1
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
    // InternalDsl.g:3417:1: rule__LayerSegmentRelation__Group__0__Impl : ( 'allowedToUse:' ) ;
    public final void rule__LayerSegmentRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3421:1: ( ( 'allowedToUse:' ) )
            // InternalDsl.g:3422:1: ( 'allowedToUse:' )
            {
            // InternalDsl.g:3422:1: ( 'allowedToUse:' )
            // InternalDsl.g:3423:2: 'allowedToUse:'
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
    // InternalDsl.g:3432:1: rule__LayerSegmentRelation__Group__1 : rule__LayerSegmentRelation__Group__1__Impl ;
    public final void rule__LayerSegmentRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3436:1: ( rule__LayerSegmentRelation__Group__1__Impl )
            // InternalDsl.g:3437:2: rule__LayerSegmentRelation__Group__1__Impl
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
    // InternalDsl.g:3443:1: rule__LayerSegmentRelation__Group__1__Impl : ( ruleLayerSegmentName ) ;
    public final void rule__LayerSegmentRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3447:1: ( ( ruleLayerSegmentName ) )
            // InternalDsl.g:3448:1: ( ruleLayerSegmentName )
            {
            // InternalDsl.g:3448:1: ( ruleLayerSegmentName )
            // InternalDsl.g:3449:2: ruleLayerSegmentName
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
    // InternalDsl.g:3459:1: rule__SublayerSegment__Group__0 : rule__SublayerSegment__Group__0__Impl rule__SublayerSegment__Group__1 ;
    public final void rule__SublayerSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3463:1: ( rule__SublayerSegment__Group__0__Impl rule__SublayerSegment__Group__1 )
            // InternalDsl.g:3464:2: rule__SublayerSegment__Group__0__Impl rule__SublayerSegment__Group__1
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
    // InternalDsl.g:3471:1: rule__SublayerSegment__Group__0__Impl : ( 'sublayerSegment' ) ;
    public final void rule__SublayerSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3475:1: ( ( 'sublayerSegment' ) )
            // InternalDsl.g:3476:1: ( 'sublayerSegment' )
            {
            // InternalDsl.g:3476:1: ( 'sublayerSegment' )
            // InternalDsl.g:3477:2: 'sublayerSegment'
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
    // InternalDsl.g:3486:1: rule__SublayerSegment__Group__1 : rule__SublayerSegment__Group__1__Impl ;
    public final void rule__SublayerSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3490:1: ( rule__SublayerSegment__Group__1__Impl )
            // InternalDsl.g:3491:2: rule__SublayerSegment__Group__1__Impl
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
    // InternalDsl.g:3497:1: rule__SublayerSegment__Group__1__Impl : ( ( rule__SublayerSegment__NameAssignment_1 ) ) ;
    public final void rule__SublayerSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3501:1: ( ( ( rule__SublayerSegment__NameAssignment_1 ) ) )
            // InternalDsl.g:3502:1: ( ( rule__SublayerSegment__NameAssignment_1 ) )
            {
            // InternalDsl.g:3502:1: ( ( rule__SublayerSegment__NameAssignment_1 ) )
            // InternalDsl.g:3503:2: ( rule__SublayerSegment__NameAssignment_1 )
            {
             before(grammarAccess.getSublayerSegmentAccess().getNameAssignment_1()); 
            // InternalDsl.g:3504:2: ( rule__SublayerSegment__NameAssignment_1 )
            // InternalDsl.g:3504:3: rule__SublayerSegment__NameAssignment_1
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
    // InternalDsl.g:3513:1: rule__RelationArch__Group__0 : rule__RelationArch__Group__0__Impl rule__RelationArch__Group__1 ;
    public final void rule__RelationArch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3517:1: ( rule__RelationArch__Group__0__Impl rule__RelationArch__Group__1 )
            // InternalDsl.g:3518:2: rule__RelationArch__Group__0__Impl rule__RelationArch__Group__1
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
    // InternalDsl.g:3525:1: rule__RelationArch__Group__0__Impl : ( 'relationArch' ) ;
    public final void rule__RelationArch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3529:1: ( ( 'relationArch' ) )
            // InternalDsl.g:3530:1: ( 'relationArch' )
            {
            // InternalDsl.g:3530:1: ( 'relationArch' )
            // InternalDsl.g:3531:2: 'relationArch'
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
    // InternalDsl.g:3540:1: rule__RelationArch__Group__1 : rule__RelationArch__Group__1__Impl rule__RelationArch__Group__2 ;
    public final void rule__RelationArch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3544:1: ( rule__RelationArch__Group__1__Impl rule__RelationArch__Group__2 )
            // InternalDsl.g:3545:2: rule__RelationArch__Group__1__Impl rule__RelationArch__Group__2
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
    // InternalDsl.g:3552:1: rule__RelationArch__Group__1__Impl : ( ( rule__RelationArch__NameAssignment_1 ) ) ;
    public final void rule__RelationArch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3556:1: ( ( ( rule__RelationArch__NameAssignment_1 ) ) )
            // InternalDsl.g:3557:1: ( ( rule__RelationArch__NameAssignment_1 ) )
            {
            // InternalDsl.g:3557:1: ( ( rule__RelationArch__NameAssignment_1 ) )
            // InternalDsl.g:3558:2: ( rule__RelationArch__NameAssignment_1 )
            {
             before(grammarAccess.getRelationArchAccess().getNameAssignment_1()); 
            // InternalDsl.g:3559:2: ( rule__RelationArch__NameAssignment_1 )
            // InternalDsl.g:3559:3: rule__RelationArch__NameAssignment_1
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
    // InternalDsl.g:3567:1: rule__RelationArch__Group__2 : rule__RelationArch__Group__2__Impl rule__RelationArch__Group__3 ;
    public final void rule__RelationArch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3571:1: ( rule__RelationArch__Group__2__Impl rule__RelationArch__Group__3 )
            // InternalDsl.g:3572:2: rule__RelationArch__Group__2__Impl rule__RelationArch__Group__3
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
    // InternalDsl.g:3579:1: rule__RelationArch__Group__2__Impl : ( '{' ) ;
    public final void rule__RelationArch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3583:1: ( ( '{' ) )
            // InternalDsl.g:3584:1: ( '{' )
            {
            // InternalDsl.g:3584:1: ( '{' )
            // InternalDsl.g:3585:2: '{'
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
    // InternalDsl.g:3594:1: rule__RelationArch__Group__3 : rule__RelationArch__Group__3__Impl rule__RelationArch__Group__4 ;
    public final void rule__RelationArch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3598:1: ( rule__RelationArch__Group__3__Impl rule__RelationArch__Group__4 )
            // InternalDsl.g:3599:2: rule__RelationArch__Group__3__Impl rule__RelationArch__Group__4
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
    // InternalDsl.g:3606:1: rule__RelationArch__Group__3__Impl : ( 'source:' ) ;
    public final void rule__RelationArch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3610:1: ( ( 'source:' ) )
            // InternalDsl.g:3611:1: ( 'source:' )
            {
            // InternalDsl.g:3611:1: ( 'source:' )
            // InternalDsl.g:3612:2: 'source:'
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
    // InternalDsl.g:3621:1: rule__RelationArch__Group__4 : rule__RelationArch__Group__4__Impl rule__RelationArch__Group__5 ;
    public final void rule__RelationArch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3625:1: ( rule__RelationArch__Group__4__Impl rule__RelationArch__Group__5 )
            // InternalDsl.g:3626:2: rule__RelationArch__Group__4__Impl rule__RelationArch__Group__5
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
    // InternalDsl.g:3633:1: rule__RelationArch__Group__4__Impl : ( ruleLayerName ) ;
    public final void rule__RelationArch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3637:1: ( ( ruleLayerName ) )
            // InternalDsl.g:3638:1: ( ruleLayerName )
            {
            // InternalDsl.g:3638:1: ( ruleLayerName )
            // InternalDsl.g:3639:2: ruleLayerName
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
    // InternalDsl.g:3648:1: rule__RelationArch__Group__5 : rule__RelationArch__Group__5__Impl rule__RelationArch__Group__6 ;
    public final void rule__RelationArch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3652:1: ( rule__RelationArch__Group__5__Impl rule__RelationArch__Group__6 )
            // InternalDsl.g:3653:2: rule__RelationArch__Group__5__Impl rule__RelationArch__Group__6
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
    // InternalDsl.g:3660:1: rule__RelationArch__Group__5__Impl : ( ',' ) ;
    public final void rule__RelationArch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3664:1: ( ( ',' ) )
            // InternalDsl.g:3665:1: ( ',' )
            {
            // InternalDsl.g:3665:1: ( ',' )
            // InternalDsl.g:3666:2: ','
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
    // InternalDsl.g:3675:1: rule__RelationArch__Group__6 : rule__RelationArch__Group__6__Impl rule__RelationArch__Group__7 ;
    public final void rule__RelationArch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3679:1: ( rule__RelationArch__Group__6__Impl rule__RelationArch__Group__7 )
            // InternalDsl.g:3680:2: rule__RelationArch__Group__6__Impl rule__RelationArch__Group__7
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
    // InternalDsl.g:3687:1: rule__RelationArch__Group__6__Impl : ( 'target:' ) ;
    public final void rule__RelationArch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3691:1: ( ( 'target:' ) )
            // InternalDsl.g:3692:1: ( 'target:' )
            {
            // InternalDsl.g:3692:1: ( 'target:' )
            // InternalDsl.g:3693:2: 'target:'
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
    // InternalDsl.g:3702:1: rule__RelationArch__Group__7 : rule__RelationArch__Group__7__Impl rule__RelationArch__Group__8 ;
    public final void rule__RelationArch__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3706:1: ( rule__RelationArch__Group__7__Impl rule__RelationArch__Group__8 )
            // InternalDsl.g:3707:2: rule__RelationArch__Group__7__Impl rule__RelationArch__Group__8
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
    // InternalDsl.g:3714:1: rule__RelationArch__Group__7__Impl : ( ruleLayerName ) ;
    public final void rule__RelationArch__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3718:1: ( ( ruleLayerName ) )
            // InternalDsl.g:3719:1: ( ruleLayerName )
            {
            // InternalDsl.g:3719:1: ( ruleLayerName )
            // InternalDsl.g:3720:2: ruleLayerName
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
    // InternalDsl.g:3729:1: rule__RelationArch__Group__8 : rule__RelationArch__Group__8__Impl ;
    public final void rule__RelationArch__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3733:1: ( rule__RelationArch__Group__8__Impl )
            // InternalDsl.g:3734:2: rule__RelationArch__Group__8__Impl
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
    // InternalDsl.g:3740:1: rule__RelationArch__Group__8__Impl : ( '}' ) ;
    public final void rule__RelationArch__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3744:1: ( ( '}' ) )
            // InternalDsl.g:3745:1: ( '}' )
            {
            // InternalDsl.g:3745:1: ( '}' )
            // InternalDsl.g:3746:2: '}'
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
    // InternalDsl.g:3756:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3760:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalDsl.g:3761:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
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
    // InternalDsl.g:3768:1: rule__Technology__Group__0__Impl : ( 'tech' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3772:1: ( ( 'tech' ) )
            // InternalDsl.g:3773:1: ( 'tech' )
            {
            // InternalDsl.g:3773:1: ( 'tech' )
            // InternalDsl.g:3774:2: 'tech'
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
    // InternalDsl.g:3783:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3787:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalDsl.g:3788:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
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
    // InternalDsl.g:3795:1: rule__Technology__Group__1__Impl : ( '{' ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3799:1: ( ( '{' ) )
            // InternalDsl.g:3800:1: ( '{' )
            {
            // InternalDsl.g:3800:1: ( '{' )
            // InternalDsl.g:3801:2: '{'
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
    // InternalDsl.g:3810:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3814:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalDsl.g:3815:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
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
    // InternalDsl.g:3822:1: rule__Technology__Group__2__Impl : ( ( rule__Technology__JavaAssignment_2 ) ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3826:1: ( ( ( rule__Technology__JavaAssignment_2 ) ) )
            // InternalDsl.g:3827:1: ( ( rule__Technology__JavaAssignment_2 ) )
            {
            // InternalDsl.g:3827:1: ( ( rule__Technology__JavaAssignment_2 ) )
            // InternalDsl.g:3828:2: ( rule__Technology__JavaAssignment_2 )
            {
             before(grammarAccess.getTechnologyAccess().getJavaAssignment_2()); 
            // InternalDsl.g:3829:2: ( rule__Technology__JavaAssignment_2 )
            // InternalDsl.g:3829:3: rule__Technology__JavaAssignment_2
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
    // InternalDsl.g:3837:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl rule__Technology__Group__4 ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3841:1: ( rule__Technology__Group__3__Impl rule__Technology__Group__4 )
            // InternalDsl.g:3842:2: rule__Technology__Group__3__Impl rule__Technology__Group__4
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
    // InternalDsl.g:3849:1: rule__Technology__Group__3__Impl : ( ( rule__Technology__ReactAssignment_3 ) ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3853:1: ( ( ( rule__Technology__ReactAssignment_3 ) ) )
            // InternalDsl.g:3854:1: ( ( rule__Technology__ReactAssignment_3 ) )
            {
            // InternalDsl.g:3854:1: ( ( rule__Technology__ReactAssignment_3 ) )
            // InternalDsl.g:3855:2: ( rule__Technology__ReactAssignment_3 )
            {
             before(grammarAccess.getTechnologyAccess().getReactAssignment_3()); 
            // InternalDsl.g:3856:2: ( rule__Technology__ReactAssignment_3 )
            // InternalDsl.g:3856:3: rule__Technology__ReactAssignment_3
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
    // InternalDsl.g:3864:1: rule__Technology__Group__4 : rule__Technology__Group__4__Impl ;
    public final void rule__Technology__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3868:1: ( rule__Technology__Group__4__Impl )
            // InternalDsl.g:3869:2: rule__Technology__Group__4__Impl
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
    // InternalDsl.g:3875:1: rule__Technology__Group__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3879:1: ( ( '}' ) )
            // InternalDsl.g:3880:1: ( '}' )
            {
            // InternalDsl.g:3880:1: ( '}' )
            // InternalDsl.g:3881:2: '}'
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
    // InternalDsl.g:3891:1: rule__JavaApp__Group__0 : rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1 ;
    public final void rule__JavaApp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3895:1: ( rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1 )
            // InternalDsl.g:3896:2: rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1
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
    // InternalDsl.g:3903:1: rule__JavaApp__Group__0__Impl : ( 'javaApp' ) ;
    public final void rule__JavaApp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3907:1: ( ( 'javaApp' ) )
            // InternalDsl.g:3908:1: ( 'javaApp' )
            {
            // InternalDsl.g:3908:1: ( 'javaApp' )
            // InternalDsl.g:3909:2: 'javaApp'
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
    // InternalDsl.g:3918:1: rule__JavaApp__Group__1 : rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2 ;
    public final void rule__JavaApp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3922:1: ( rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2 )
            // InternalDsl.g:3923:2: rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2
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
    // InternalDsl.g:3930:1: rule__JavaApp__Group__1__Impl : ( '{' ) ;
    public final void rule__JavaApp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3934:1: ( ( '{' ) )
            // InternalDsl.g:3935:1: ( '{' )
            {
            // InternalDsl.g:3935:1: ( '{' )
            // InternalDsl.g:3936:2: '{'
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
    // InternalDsl.g:3945:1: rule__JavaApp__Group__2 : rule__JavaApp__Group__2__Impl ;
    public final void rule__JavaApp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3949:1: ( rule__JavaApp__Group__2__Impl )
            // InternalDsl.g:3950:2: rule__JavaApp__Group__2__Impl
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
    // InternalDsl.g:3956:1: rule__JavaApp__Group__2__Impl : ( '}' ) ;
    public final void rule__JavaApp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3960:1: ( ( '}' ) )
            // InternalDsl.g:3961:1: ( '}' )
            {
            // InternalDsl.g:3961:1: ( '}' )
            // InternalDsl.g:3962:2: '}'
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
    // InternalDsl.g:3972:1: rule__ReactApp__Group__0 : rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1 ;
    public final void rule__ReactApp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3976:1: ( rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1 )
            // InternalDsl.g:3977:2: rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1
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
    // InternalDsl.g:3984:1: rule__ReactApp__Group__0__Impl : ( 'reactApp' ) ;
    public final void rule__ReactApp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3988:1: ( ( 'reactApp' ) )
            // InternalDsl.g:3989:1: ( 'reactApp' )
            {
            // InternalDsl.g:3989:1: ( 'reactApp' )
            // InternalDsl.g:3990:2: 'reactApp'
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
    // InternalDsl.g:3999:1: rule__ReactApp__Group__1 : rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2 ;
    public final void rule__ReactApp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4003:1: ( rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2 )
            // InternalDsl.g:4004:2: rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:4011:1: rule__ReactApp__Group__1__Impl : ( '{' ) ;
    public final void rule__ReactApp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4015:1: ( ( '{' ) )
            // InternalDsl.g:4016:1: ( '{' )
            {
            // InternalDsl.g:4016:1: ( '{' )
            // InternalDsl.g:4017:2: '{'
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
    // InternalDsl.g:4026:1: rule__ReactApp__Group__2 : rule__ReactApp__Group__2__Impl ;
    public final void rule__ReactApp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4030:1: ( rule__ReactApp__Group__2__Impl )
            // InternalDsl.g:4031:2: rule__ReactApp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactApp__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:4037:1: rule__ReactApp__Group__2__Impl : ( '}' ) ;
    public final void rule__ReactApp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4041:1: ( ( '}' ) )
            // InternalDsl.g:4042:1: ( '}' )
            {
            // InternalDsl.g:4042:1: ( '}' )
            // InternalDsl.g:4043:2: '}'
            {
             before(grammarAccess.getReactAppAccess().getRightCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReactAppAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__System__DomAssignment_2"
    // InternalDsl.g:4053:1: rule__System__DomAssignment_2 : ( ruleDomain ) ;
    public final void rule__System__DomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4057:1: ( ( ruleDomain ) )
            // InternalDsl.g:4058:2: ( ruleDomain )
            {
            // InternalDsl.g:4058:2: ( ruleDomain )
            // InternalDsl.g:4059:3: ruleDomain
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
    // InternalDsl.g:4068:1: rule__System__ArchAssignment_3 : ( ruleArchitecture ) ;
    public final void rule__System__ArchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4072:1: ( ( ruleArchitecture ) )
            // InternalDsl.g:4073:2: ( ruleArchitecture )
            {
            // InternalDsl.g:4073:2: ( ruleArchitecture )
            // InternalDsl.g:4074:3: ruleArchitecture
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
    // InternalDsl.g:4083:1: rule__System__TechAssignment_4 : ( ruleTechnology ) ;
    public final void rule__System__TechAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4087:1: ( ( ruleTechnology ) )
            // InternalDsl.g:4088:2: ( ruleTechnology )
            {
            // InternalDsl.g:4088:2: ( ruleTechnology )
            // InternalDsl.g:4089:3: ruleTechnology
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
    // InternalDsl.g:4098:1: rule__Domain__TypesAssignment_2 : ( ruleType ) ;
    public final void rule__Domain__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4102:1: ( ( ruleType ) )
            // InternalDsl.g:4103:2: ( ruleType )
            {
            // InternalDsl.g:4103:2: ( ruleType )
            // InternalDsl.g:4104:3: ruleType
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
    // InternalDsl.g:4113:1: rule__Domain__ModulesAssignment_3 : ( ruleModule ) ;
    public final void rule__Domain__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4117:1: ( ( ruleModule ) )
            // InternalDsl.g:4118:2: ( ruleModule )
            {
            // InternalDsl.g:4118:2: ( ruleModule )
            // InternalDsl.g:4119:3: ruleModule
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
    // InternalDsl.g:4128:1: rule__Domain__RelationsAssignment_4 : ( ruleRelationDom ) ;
    public final void rule__Domain__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4132:1: ( ( ruleRelationDom ) )
            // InternalDsl.g:4133:2: ( ruleRelationDom )
            {
            // InternalDsl.g:4133:2: ( ruleRelationDom )
            // InternalDsl.g:4134:3: ruleRelationDom
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
    // InternalDsl.g:4143:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4147:1: ( ( RULE_ID ) )
            // InternalDsl.g:4148:2: ( RULE_ID )
            {
            // InternalDsl.g:4148:2: ( RULE_ID )
            // InternalDsl.g:4149:3: RULE_ID
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
    // InternalDsl.g:4158:1: rule__Module__SubmodulesAssignment_3 : ( ruleSubmodule ) ;
    public final void rule__Module__SubmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4162:1: ( ( ruleSubmodule ) )
            // InternalDsl.g:4163:2: ( ruleSubmodule )
            {
            // InternalDsl.g:4163:2: ( ruleSubmodule )
            // InternalDsl.g:4164:3: ruleSubmodule
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
    // InternalDsl.g:4173:1: rule__Submodule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Submodule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4177:1: ( ( RULE_ID ) )
            // InternalDsl.g:4178:2: ( RULE_ID )
            {
            // InternalDsl.g:4178:2: ( RULE_ID )
            // InternalDsl.g:4179:3: RULE_ID
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
    // InternalDsl.g:4188:1: rule__Submodule__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Submodule__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4192:1: ( ( ruleOperation ) )
            // InternalDsl.g:4193:2: ( ruleOperation )
            {
            // InternalDsl.g:4193:2: ( ruleOperation )
            // InternalDsl.g:4194:3: ruleOperation
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
    // InternalDsl.g:4203:1: rule__Submodule__EntitiesAssignment_4 : ( ( rule__Submodule__EntitiesAlternatives_4_0 ) ) ;
    public final void rule__Submodule__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4207:1: ( ( ( rule__Submodule__EntitiesAlternatives_4_0 ) ) )
            // InternalDsl.g:4208:2: ( ( rule__Submodule__EntitiesAlternatives_4_0 ) )
            {
            // InternalDsl.g:4208:2: ( ( rule__Submodule__EntitiesAlternatives_4_0 ) )
            // InternalDsl.g:4209:3: ( rule__Submodule__EntitiesAlternatives_4_0 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAlternatives_4_0()); 
            // InternalDsl.g:4210:3: ( rule__Submodule__EntitiesAlternatives_4_0 )
            // InternalDsl.g:4210:4: rule__Submodule__EntitiesAlternatives_4_0
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
    // InternalDsl.g:4218:1: rule__Operation__TargetAssignment_5 : ( ruleEntityName ) ;
    public final void rule__Operation__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4222:1: ( ( ruleEntityName ) )
            // InternalDsl.g:4223:2: ( ruleEntityName )
            {
            // InternalDsl.g:4223:2: ( ruleEntityName )
            // InternalDsl.g:4224:3: ruleEntityName
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
    // InternalDsl.g:4233:1: rule__EntityName__NameAssignment : ( RULE_ID ) ;
    public final void rule__EntityName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4237:1: ( ( RULE_ID ) )
            // InternalDsl.g:4238:2: ( RULE_ID )
            {
            // InternalDsl.g:4238:2: ( RULE_ID )
            // InternalDsl.g:4239:3: RULE_ID
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
    // InternalDsl.g:4248:1: rule__GeneralEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__GeneralEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4252:1: ( ( ruleProperty ) )
            // InternalDsl.g:4253:2: ( ruleProperty )
            {
            // InternalDsl.g:4253:2: ( ruleProperty )
            // InternalDsl.g:4254:3: ruleProperty
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
    // InternalDsl.g:4263:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4267:1: ( ( RULE_ID ) )
            // InternalDsl.g:4268:2: ( RULE_ID )
            {
            // InternalDsl.g:4268:2: ( RULE_ID )
            // InternalDsl.g:4269:3: RULE_ID
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
    // InternalDsl.g:4278:1: rule__Property__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4282:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4283:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4283:2: ( ( RULE_ID ) )
            // InternalDsl.g:4284:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 
            // InternalDsl.g:4285:3: ( RULE_ID )
            // InternalDsl.g:4286:4: RULE_ID
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
    // InternalDsl.g:4297:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4301:1: ( ( RULE_ID ) )
            // InternalDsl.g:4302:2: ( RULE_ID )
            {
            // InternalDsl.g:4302:2: ( RULE_ID )
            // InternalDsl.g:4303:3: RULE_ID
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
    // InternalDsl.g:4312:1: rule__SpecialEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__SpecialEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4316:1: ( ( ruleProperty ) )
            // InternalDsl.g:4317:2: ( ruleProperty )
            {
            // InternalDsl.g:4317:2: ( ruleProperty )
            // InternalDsl.g:4318:3: ruleProperty
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
    // InternalDsl.g:4327:1: rule__SpecialEntity__TransactionsAssignment_4 : ( ruleTransaction ) ;
    public final void rule__SpecialEntity__TransactionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4331:1: ( ( ruleTransaction ) )
            // InternalDsl.g:4332:2: ( ruleTransaction )
            {
            // InternalDsl.g:4332:2: ( ruleTransaction )
            // InternalDsl.g:4333:3: ruleTransaction
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
    // InternalDsl.g:4342:1: rule__Transaction__OperatesonAssignment_4 : ( ruleOperateson ) ;
    public final void rule__Transaction__OperatesonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4346:1: ( ( ruleOperateson ) )
            // InternalDsl.g:4347:2: ( ruleOperateson )
            {
            // InternalDsl.g:4347:2: ( ruleOperateson )
            // InternalDsl.g:4348:3: ruleOperateson
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
    // InternalDsl.g:4357:1: rule__Operateson__OperatesonAssignment_1 : ( ruleEntityName ) ;
    public final void rule__Operateson__OperatesonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4361:1: ( ( ruleEntityName ) )
            // InternalDsl.g:4362:2: ( ruleEntityName )
            {
            // InternalDsl.g:4362:2: ( ruleEntityName )
            // InternalDsl.g:4363:3: ruleEntityName
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
    // InternalDsl.g:4372:1: rule__RelationDom__SourceAssignment_5 : ( ruleEntityName ) ;
    public final void rule__RelationDom__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4376:1: ( ( ruleEntityName ) )
            // InternalDsl.g:4377:2: ( ruleEntityName )
            {
            // InternalDsl.g:4377:2: ( ruleEntityName )
            // InternalDsl.g:4378:3: ruleEntityName
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
    // InternalDsl.g:4387:1: rule__RelationDom__TargetAssignment_7 : ( ruleEntityName ) ;
    public final void rule__RelationDom__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4391:1: ( ( ruleEntityName ) )
            // InternalDsl.g:4392:2: ( ruleEntityName )
            {
            // InternalDsl.g:4392:2: ( ruleEntityName )
            // InternalDsl.g:4393:3: ruleEntityName
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
    // InternalDsl.g:4402:1: rule__Architecture__ComponentesAssignment_2 : ( ruleComponent ) ;
    public final void rule__Architecture__ComponentesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4406:1: ( ( ruleComponent ) )
            // InternalDsl.g:4407:2: ( ruleComponent )
            {
            // InternalDsl.g:4407:2: ( ruleComponent )
            // InternalDsl.g:4408:3: ruleComponent
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
    // InternalDsl.g:4417:1: rule__Architecture__RelationArchAssignment_3 : ( ruleRelationArch ) ;
    public final void rule__Architecture__RelationArchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4421:1: ( ( ruleRelationArch ) )
            // InternalDsl.g:4422:2: ( ruleRelationArch )
            {
            // InternalDsl.g:4422:2: ( ruleRelationArch )
            // InternalDsl.g:4423:3: ruleRelationArch
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
    // InternalDsl.g:4432:1: rule__Component__LayerAssignment_3 : ( ruleLayer ) ;
    public final void rule__Component__LayerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4436:1: ( ( ruleLayer ) )
            // InternalDsl.g:4437:2: ( ruleLayer )
            {
            // InternalDsl.g:4437:2: ( ruleLayer )
            // InternalDsl.g:4438:3: ruleLayer
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
    // InternalDsl.g:4447:1: rule__Layer__NameAssignment_1 : ( ruleLayerName ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4451:1: ( ( ruleLayerName ) )
            // InternalDsl.g:4452:2: ( ruleLayerName )
            {
            // InternalDsl.g:4452:2: ( ruleLayerName )
            // InternalDsl.g:4453:3: ruleLayerName
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
    // InternalDsl.g:4462:1: rule__Layer__LayerSegmentsAssignment_3 : ( ruleLayerSegment ) ;
    public final void rule__Layer__LayerSegmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4466:1: ( ( ruleLayerSegment ) )
            // InternalDsl.g:4467:2: ( ruleLayerSegment )
            {
            // InternalDsl.g:4467:2: ( ruleLayerSegment )
            // InternalDsl.g:4468:3: ruleLayerSegment
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
    // InternalDsl.g:4477:1: rule__LayerSegment__NameAssignment_1 : ( ruleLayerSegmentName ) ;
    public final void rule__LayerSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4481:1: ( ( ruleLayerSegmentName ) )
            // InternalDsl.g:4482:2: ( ruleLayerSegmentName )
            {
            // InternalDsl.g:4482:2: ( ruleLayerSegmentName )
            // InternalDsl.g:4483:3: ruleLayerSegmentName
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
    // InternalDsl.g:4492:1: rule__LayerSegment__RelationsAssignment_3_1 : ( ruleLayerSegmentRelation ) ;
    public final void rule__LayerSegment__RelationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4496:1: ( ( ruleLayerSegmentRelation ) )
            // InternalDsl.g:4497:2: ( ruleLayerSegmentRelation )
            {
            // InternalDsl.g:4497:2: ( ruleLayerSegmentRelation )
            // InternalDsl.g:4498:3: ruleLayerSegmentRelation
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
    // InternalDsl.g:4507:1: rule__LayerSegment__SublayerSegmentsAssignment_4 : ( ruleSublayerSegment ) ;
    public final void rule__LayerSegment__SublayerSegmentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4511:1: ( ( ruleSublayerSegment ) )
            // InternalDsl.g:4512:2: ( ruleSublayerSegment )
            {
            // InternalDsl.g:4512:2: ( ruleSublayerSegment )
            // InternalDsl.g:4513:3: ruleSublayerSegment
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
    // InternalDsl.g:4522:1: rule__SublayerSegment__NameAssignment_1 : ( ruleSublayerSegmentName ) ;
    public final void rule__SublayerSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4526:1: ( ( ruleSublayerSegmentName ) )
            // InternalDsl.g:4527:2: ( ruleSublayerSegmentName )
            {
            // InternalDsl.g:4527:2: ( ruleSublayerSegmentName )
            // InternalDsl.g:4528:3: ruleSublayerSegmentName
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
    // InternalDsl.g:4537:1: rule__RelationArch__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RelationArch__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4541:1: ( ( RULE_ID ) )
            // InternalDsl.g:4542:2: ( RULE_ID )
            {
            // InternalDsl.g:4542:2: ( RULE_ID )
            // InternalDsl.g:4543:3: RULE_ID
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
    // InternalDsl.g:4552:1: rule__Technology__JavaAssignment_2 : ( ruleJavaApp ) ;
    public final void rule__Technology__JavaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4556:1: ( ( ruleJavaApp ) )
            // InternalDsl.g:4557:2: ( ruleJavaApp )
            {
            // InternalDsl.g:4557:2: ( ruleJavaApp )
            // InternalDsl.g:4558:3: ruleJavaApp
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
    // InternalDsl.g:4567:1: rule__Technology__ReactAssignment_3 : ( ruleReactApp ) ;
    public final void rule__Technology__ReactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4571:1: ( ( ruleReactApp ) )
            // InternalDsl.g:4572:2: ( ruleReactApp )
            {
            // InternalDsl.g:4572:2: ( ruleReactApp )
            // InternalDsl.g:4573:3: ruleReactApp
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000090000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L});
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

}