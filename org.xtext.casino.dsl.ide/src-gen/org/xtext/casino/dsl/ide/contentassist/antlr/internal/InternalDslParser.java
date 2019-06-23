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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDsl.g:103:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleAbstractElement EOF )
            // InternalDsl.g:105:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDsl.g:112:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__AbstractElement__Alternatives )
            // InternalDsl.g:119:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleModule"
    // InternalDsl.g:128:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleModule EOF )
            // InternalDsl.g:130:1: ruleModule EOF
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
    // InternalDsl.g:137:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Module__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Module__Group__0 )
            // InternalDsl.g:144:4: rule__Module__Group__0
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
    // InternalDsl.g:153:1: entryRuleSubmodule : ruleSubmodule EOF ;
    public final void entryRuleSubmodule() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleSubmodule EOF )
            // InternalDsl.g:155:1: ruleSubmodule EOF
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
    // InternalDsl.g:162:1: ruleSubmodule : ( ( rule__Submodule__Group__0 ) ) ;
    public final void ruleSubmodule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Submodule__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Submodule__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Submodule__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Submodule__Group__0 )
            {
             before(grammarAccess.getSubmoduleAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Submodule__Group__0 )
            // InternalDsl.g:169:4: rule__Submodule__Group__0
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


    // $ANTLR start "entryRuleEntity"
    // InternalDsl.g:178:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleEntity EOF )
            // InternalDsl.g:180:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDsl.g:187:1: ruleEntity : ( ( rule__Entity__TypeAssignment ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Entity__TypeAssignment ) ) )
            // InternalDsl.g:192:2: ( ( rule__Entity__TypeAssignment ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Entity__TypeAssignment ) )
            // InternalDsl.g:193:3: ( rule__Entity__TypeAssignment )
            {
             before(grammarAccess.getEntityAccess().getTypeAssignment()); 
            // InternalDsl.g:194:3: ( rule__Entity__TypeAssignment )
            // InternalDsl.g:194:4: rule__Entity__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Entity__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDsl.g:203:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleQualifiedName EOF )
            // InternalDsl.g:205:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDsl.g:212:1: ruleQualifiedName : ( ( rule__QualifiedName__NameAssignment ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__QualifiedName__NameAssignment ) ) )
            // InternalDsl.g:217:2: ( ( rule__QualifiedName__NameAssignment ) )
            {
            // InternalDsl.g:217:2: ( ( rule__QualifiedName__NameAssignment ) )
            // InternalDsl.g:218:3: ( rule__QualifiedName__NameAssignment )
            {
             before(grammarAccess.getQualifiedNameAccess().getNameAssignment()); 
            // InternalDsl.g:219:3: ( rule__QualifiedName__NameAssignment )
            // InternalDsl.g:219:4: rule__QualifiedName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleOperation"
    // InternalDsl.g:228:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleOperation EOF )
            // InternalDsl.g:230:1: ruleOperation EOF
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
    // InternalDsl.g:237:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Operation__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Operation__Group__0 )
            // InternalDsl.g:244:4: rule__Operation__Group__0
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


    // $ANTLR start "entryRuleSubOperation"
    // InternalDsl.g:253:1: entryRuleSubOperation : ruleSubOperation EOF ;
    public final void entryRuleSubOperation() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleSubOperation EOF )
            // InternalDsl.g:255:1: ruleSubOperation EOF
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
    // InternalDsl.g:262:1: ruleSubOperation : ( ( rule__SubOperation__Alternatives ) ) ;
    public final void ruleSubOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__SubOperation__Alternatives ) ) )
            // InternalDsl.g:267:2: ( ( rule__SubOperation__Alternatives ) )
            {
            // InternalDsl.g:267:2: ( ( rule__SubOperation__Alternatives ) )
            // InternalDsl.g:268:3: ( rule__SubOperation__Alternatives )
            {
             before(grammarAccess.getSubOperationAccess().getAlternatives()); 
            // InternalDsl.g:269:3: ( rule__SubOperation__Alternatives )
            // InternalDsl.g:269:4: rule__SubOperation__Alternatives
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
    // InternalDsl.g:278:1: entryRuleGeneralEntity : ruleGeneralEntity EOF ;
    public final void entryRuleGeneralEntity() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleGeneralEntity EOF )
            // InternalDsl.g:280:1: ruleGeneralEntity EOF
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
    // InternalDsl.g:287:1: ruleGeneralEntity : ( ( rule__GeneralEntity__Group__0 ) ) ;
    public final void ruleGeneralEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__GeneralEntity__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__GeneralEntity__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__GeneralEntity__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__GeneralEntity__Group__0 )
            {
             before(grammarAccess.getGeneralEntityAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__GeneralEntity__Group__0 )
            // InternalDsl.g:294:4: rule__GeneralEntity__Group__0
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
    // InternalDsl.g:303:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleProperty EOF )
            // InternalDsl.g:305:1: ruleProperty EOF
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
    // InternalDsl.g:312:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Property__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Property__Group__0 )
            // InternalDsl.g:319:4: rule__Property__Group__0
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
    // InternalDsl.g:328:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleType EOF )
            // InternalDsl.g:330:1: ruleType EOF
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
    // InternalDsl.g:337:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Type__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Type__Group__0 )
            // InternalDsl.g:344:4: rule__Type__Group__0
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
    // InternalDsl.g:353:1: entryRuleSpecialEntity : ruleSpecialEntity EOF ;
    public final void entryRuleSpecialEntity() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleSpecialEntity EOF )
            // InternalDsl.g:355:1: ruleSpecialEntity EOF
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
    // InternalDsl.g:362:1: ruleSpecialEntity : ( ( rule__SpecialEntity__Group__0 ) ) ;
    public final void ruleSpecialEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__SpecialEntity__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__SpecialEntity__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__SpecialEntity__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__SpecialEntity__Group__0 )
            {
             before(grammarAccess.getSpecialEntityAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__SpecialEntity__Group__0 )
            // InternalDsl.g:369:4: rule__SpecialEntity__Group__0
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
    // InternalDsl.g:378:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleTransaction EOF )
            // InternalDsl.g:380:1: ruleTransaction EOF
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
    // InternalDsl.g:387:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__Transaction__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Transaction__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__Transaction__Group__0 )
            // InternalDsl.g:394:4: rule__Transaction__Group__0
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
    // InternalDsl.g:403:1: entryRuleSubTransaction : ruleSubTransaction EOF ;
    public final void entryRuleSubTransaction() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleSubTransaction EOF )
            // InternalDsl.g:405:1: ruleSubTransaction EOF
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
    // InternalDsl.g:412:1: ruleSubTransaction : ( ( rule__SubTransaction__Alternatives ) ) ;
    public final void ruleSubTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__SubTransaction__Alternatives ) ) )
            // InternalDsl.g:417:2: ( ( rule__SubTransaction__Alternatives ) )
            {
            // InternalDsl.g:417:2: ( ( rule__SubTransaction__Alternatives ) )
            // InternalDsl.g:418:3: ( rule__SubTransaction__Alternatives )
            {
             before(grammarAccess.getSubTransactionAccess().getAlternatives()); 
            // InternalDsl.g:419:3: ( rule__SubTransaction__Alternatives )
            // InternalDsl.g:419:4: rule__SubTransaction__Alternatives
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
    // InternalDsl.g:428:1: entryRuleOperateson : ruleOperateson EOF ;
    public final void entryRuleOperateson() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleOperateson EOF )
            // InternalDsl.g:430:1: ruleOperateson EOF
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
    // InternalDsl.g:437:1: ruleOperateson : ( ( rule__Operateson__Group__0 ) ) ;
    public final void ruleOperateson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__Operateson__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__Operateson__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__Operateson__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__Operateson__Group__0 )
            {
             before(grammarAccess.getOperatesonAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__Operateson__Group__0 )
            // InternalDsl.g:444:4: rule__Operateson__Group__0
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
    // InternalDsl.g:453:1: entryRuleRelationDom : ruleRelationDom EOF ;
    public final void entryRuleRelationDom() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleRelationDom EOF )
            // InternalDsl.g:455:1: ruleRelationDom EOF
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
    // InternalDsl.g:462:1: ruleRelationDom : ( ( rule__RelationDom__Group__0 ) ) ;
    public final void ruleRelationDom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__RelationDom__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__RelationDom__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__RelationDom__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__RelationDom__Group__0 )
            {
             before(grammarAccess.getRelationDomAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__RelationDom__Group__0 )
            // InternalDsl.g:469:4: rule__RelationDom__Group__0
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
    // InternalDsl.g:478:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleArchitecture EOF )
            // InternalDsl.g:480:1: ruleArchitecture EOF
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
    // InternalDsl.g:487:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__Architecture__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__Architecture__Group__0 )
            // InternalDsl.g:494:4: rule__Architecture__Group__0
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
    // InternalDsl.g:503:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleComponent EOF )
            // InternalDsl.g:505:1: ruleComponent EOF
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
    // InternalDsl.g:512:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__Component__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__Component__Group__0 )
            // InternalDsl.g:519:4: rule__Component__Group__0
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
    // InternalDsl.g:528:1: entryRuleComponentName : ruleComponentName EOF ;
    public final void entryRuleComponentName() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleComponentName EOF )
            // InternalDsl.g:530:1: ruleComponentName EOF
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
    // InternalDsl.g:537:1: ruleComponentName : ( ( rule__ComponentName__Alternatives ) ) ;
    public final void ruleComponentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__ComponentName__Alternatives ) ) )
            // InternalDsl.g:542:2: ( ( rule__ComponentName__Alternatives ) )
            {
            // InternalDsl.g:542:2: ( ( rule__ComponentName__Alternatives ) )
            // InternalDsl.g:543:3: ( rule__ComponentName__Alternatives )
            {
             before(grammarAccess.getComponentNameAccess().getAlternatives()); 
            // InternalDsl.g:544:3: ( rule__ComponentName__Alternatives )
            // InternalDsl.g:544:4: rule__ComponentName__Alternatives
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
    // InternalDsl.g:553:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleLayer EOF )
            // InternalDsl.g:555:1: ruleLayer EOF
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
    // InternalDsl.g:562:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__Layer__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__Layer__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__Layer__Group__0 )
            // InternalDsl.g:569:4: rule__Layer__Group__0
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
    // InternalDsl.g:578:1: entryRuleLayerName : ruleLayerName EOF ;
    public final void entryRuleLayerName() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleLayerName EOF )
            // InternalDsl.g:580:1: ruleLayerName EOF
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
    // InternalDsl.g:587:1: ruleLayerName : ( ( rule__LayerName__Alternatives ) ) ;
    public final void ruleLayerName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__LayerName__Alternatives ) ) )
            // InternalDsl.g:592:2: ( ( rule__LayerName__Alternatives ) )
            {
            // InternalDsl.g:592:2: ( ( rule__LayerName__Alternatives ) )
            // InternalDsl.g:593:3: ( rule__LayerName__Alternatives )
            {
             before(grammarAccess.getLayerNameAccess().getAlternatives()); 
            // InternalDsl.g:594:3: ( rule__LayerName__Alternatives )
            // InternalDsl.g:594:4: rule__LayerName__Alternatives
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
    // InternalDsl.g:603:1: entryRuleLayerSegment : ruleLayerSegment EOF ;
    public final void entryRuleLayerSegment() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleLayerSegment EOF )
            // InternalDsl.g:605:1: ruleLayerSegment EOF
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
    // InternalDsl.g:612:1: ruleLayerSegment : ( ( rule__LayerSegment__Group__0 ) ) ;
    public final void ruleLayerSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__LayerSegment__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__LayerSegment__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__LayerSegment__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__LayerSegment__Group__0 )
            {
             before(grammarAccess.getLayerSegmentAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__LayerSegment__Group__0 )
            // InternalDsl.g:619:4: rule__LayerSegment__Group__0
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
    // InternalDsl.g:628:1: entryRuleLayerSegmentName : ruleLayerSegmentName EOF ;
    public final void entryRuleLayerSegmentName() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleLayerSegmentName EOF )
            // InternalDsl.g:630:1: ruleLayerSegmentName EOF
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
    // InternalDsl.g:637:1: ruleLayerSegmentName : ( ( rule__LayerSegmentName__Alternatives ) ) ;
    public final void ruleLayerSegmentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__LayerSegmentName__Alternatives ) ) )
            // InternalDsl.g:642:2: ( ( rule__LayerSegmentName__Alternatives ) )
            {
            // InternalDsl.g:642:2: ( ( rule__LayerSegmentName__Alternatives ) )
            // InternalDsl.g:643:3: ( rule__LayerSegmentName__Alternatives )
            {
             before(grammarAccess.getLayerSegmentNameAccess().getAlternatives()); 
            // InternalDsl.g:644:3: ( rule__LayerSegmentName__Alternatives )
            // InternalDsl.g:644:4: rule__LayerSegmentName__Alternatives
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
    // InternalDsl.g:653:1: entryRuleLayerSegmentRelation : ruleLayerSegmentRelation EOF ;
    public final void entryRuleLayerSegmentRelation() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleLayerSegmentRelation EOF )
            // InternalDsl.g:655:1: ruleLayerSegmentRelation EOF
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
    // InternalDsl.g:662:1: ruleLayerSegmentRelation : ( ( rule__LayerSegmentRelation__Group__0 ) ) ;
    public final void ruleLayerSegmentRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__LayerSegmentRelation__Group__0 ) ) )
            // InternalDsl.g:667:2: ( ( rule__LayerSegmentRelation__Group__0 ) )
            {
            // InternalDsl.g:667:2: ( ( rule__LayerSegmentRelation__Group__0 ) )
            // InternalDsl.g:668:3: ( rule__LayerSegmentRelation__Group__0 )
            {
             before(grammarAccess.getLayerSegmentRelationAccess().getGroup()); 
            // InternalDsl.g:669:3: ( rule__LayerSegmentRelation__Group__0 )
            // InternalDsl.g:669:4: rule__LayerSegmentRelation__Group__0
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
    // InternalDsl.g:678:1: entryRuleSublayerSegment : ruleSublayerSegment EOF ;
    public final void entryRuleSublayerSegment() throws RecognitionException {
        try {
            // InternalDsl.g:679:1: ( ruleSublayerSegment EOF )
            // InternalDsl.g:680:1: ruleSublayerSegment EOF
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
    // InternalDsl.g:687:1: ruleSublayerSegment : ( ( rule__SublayerSegment__Group__0 ) ) ;
    public final void ruleSublayerSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:2: ( ( ( rule__SublayerSegment__Group__0 ) ) )
            // InternalDsl.g:692:2: ( ( rule__SublayerSegment__Group__0 ) )
            {
            // InternalDsl.g:692:2: ( ( rule__SublayerSegment__Group__0 ) )
            // InternalDsl.g:693:3: ( rule__SublayerSegment__Group__0 )
            {
             before(grammarAccess.getSublayerSegmentAccess().getGroup()); 
            // InternalDsl.g:694:3: ( rule__SublayerSegment__Group__0 )
            // InternalDsl.g:694:4: rule__SublayerSegment__Group__0
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
    // InternalDsl.g:703:1: entryRuleSublayerSegmentName : ruleSublayerSegmentName EOF ;
    public final void entryRuleSublayerSegmentName() throws RecognitionException {
        try {
            // InternalDsl.g:704:1: ( ruleSublayerSegmentName EOF )
            // InternalDsl.g:705:1: ruleSublayerSegmentName EOF
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
    // InternalDsl.g:712:1: ruleSublayerSegmentName : ( ( rule__SublayerSegmentName__Alternatives ) ) ;
    public final void ruleSublayerSegmentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:2: ( ( ( rule__SublayerSegmentName__Alternatives ) ) )
            // InternalDsl.g:717:2: ( ( rule__SublayerSegmentName__Alternatives ) )
            {
            // InternalDsl.g:717:2: ( ( rule__SublayerSegmentName__Alternatives ) )
            // InternalDsl.g:718:3: ( rule__SublayerSegmentName__Alternatives )
            {
             before(grammarAccess.getSublayerSegmentNameAccess().getAlternatives()); 
            // InternalDsl.g:719:3: ( rule__SublayerSegmentName__Alternatives )
            // InternalDsl.g:719:4: rule__SublayerSegmentName__Alternatives
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
    // InternalDsl.g:728:1: entryRuleRelationArch : ruleRelationArch EOF ;
    public final void entryRuleRelationArch() throws RecognitionException {
        try {
            // InternalDsl.g:729:1: ( ruleRelationArch EOF )
            // InternalDsl.g:730:1: ruleRelationArch EOF
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
    // InternalDsl.g:737:1: ruleRelationArch : ( ( rule__RelationArch__Group__0 ) ) ;
    public final void ruleRelationArch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:741:2: ( ( ( rule__RelationArch__Group__0 ) ) )
            // InternalDsl.g:742:2: ( ( rule__RelationArch__Group__0 ) )
            {
            // InternalDsl.g:742:2: ( ( rule__RelationArch__Group__0 ) )
            // InternalDsl.g:743:3: ( rule__RelationArch__Group__0 )
            {
             before(grammarAccess.getRelationArchAccess().getGroup()); 
            // InternalDsl.g:744:3: ( rule__RelationArch__Group__0 )
            // InternalDsl.g:744:4: rule__RelationArch__Group__0
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
    // InternalDsl.g:753:1: entryRuleTechnology : ruleTechnology EOF ;
    public final void entryRuleTechnology() throws RecognitionException {
        try {
            // InternalDsl.g:754:1: ( ruleTechnology EOF )
            // InternalDsl.g:755:1: ruleTechnology EOF
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
    // InternalDsl.g:762:1: ruleTechnology : ( ( rule__Technology__Group__0 ) ) ;
    public final void ruleTechnology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:766:2: ( ( ( rule__Technology__Group__0 ) ) )
            // InternalDsl.g:767:2: ( ( rule__Technology__Group__0 ) )
            {
            // InternalDsl.g:767:2: ( ( rule__Technology__Group__0 ) )
            // InternalDsl.g:768:3: ( rule__Technology__Group__0 )
            {
             before(grammarAccess.getTechnologyAccess().getGroup()); 
            // InternalDsl.g:769:3: ( rule__Technology__Group__0 )
            // InternalDsl.g:769:4: rule__Technology__Group__0
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
    // InternalDsl.g:778:1: entryRuleJavaApp : ruleJavaApp EOF ;
    public final void entryRuleJavaApp() throws RecognitionException {
        try {
            // InternalDsl.g:779:1: ( ruleJavaApp EOF )
            // InternalDsl.g:780:1: ruleJavaApp EOF
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
    // InternalDsl.g:787:1: ruleJavaApp : ( ( rule__JavaApp__Group__0 ) ) ;
    public final void ruleJavaApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:791:2: ( ( ( rule__JavaApp__Group__0 ) ) )
            // InternalDsl.g:792:2: ( ( rule__JavaApp__Group__0 ) )
            {
            // InternalDsl.g:792:2: ( ( rule__JavaApp__Group__0 ) )
            // InternalDsl.g:793:3: ( rule__JavaApp__Group__0 )
            {
             before(grammarAccess.getJavaAppAccess().getGroup()); 
            // InternalDsl.g:794:3: ( rule__JavaApp__Group__0 )
            // InternalDsl.g:794:4: rule__JavaApp__Group__0
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
    // InternalDsl.g:803:1: entryRuleReactApp : ruleReactApp EOF ;
    public final void entryRuleReactApp() throws RecognitionException {
        try {
            // InternalDsl.g:804:1: ( ruleReactApp EOF )
            // InternalDsl.g:805:1: ruleReactApp EOF
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
    // InternalDsl.g:812:1: ruleReactApp : ( ( rule__ReactApp__Group__0 ) ) ;
    public final void ruleReactApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:816:2: ( ( ( rule__ReactApp__Group__0 ) ) )
            // InternalDsl.g:817:2: ( ( rule__ReactApp__Group__0 ) )
            {
            // InternalDsl.g:817:2: ( ( rule__ReactApp__Group__0 ) )
            // InternalDsl.g:818:3: ( rule__ReactApp__Group__0 )
            {
             before(grammarAccess.getReactAppAccess().getGroup()); 
            // InternalDsl.g:819:3: ( rule__ReactApp__Group__0 )
            // InternalDsl.g:819:4: rule__ReactApp__Group__0
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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDsl.g:827:1: rule__AbstractElement__Alternatives : ( ( ruleSpecialEntity ) | ( ruleGeneralEntity ) | ( ruleType ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:831:1: ( ( ruleSpecialEntity ) | ( ruleGeneralEntity ) | ( ruleType ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 42:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDsl.g:832:2: ( ruleSpecialEntity )
                    {
                    // InternalDsl.g:832:2: ( ruleSpecialEntity )
                    // InternalDsl.g:833:3: ruleSpecialEntity
                    {
                     before(grammarAccess.getAbstractElementAccess().getSpecialEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSpecialEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getSpecialEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:838:2: ( ruleGeneralEntity )
                    {
                    // InternalDsl.g:838:2: ( ruleGeneralEntity )
                    // InternalDsl.g:839:3: ruleGeneralEntity
                    {
                     before(grammarAccess.getAbstractElementAccess().getGeneralEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getGeneralEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:844:2: ( ruleType )
                    {
                    // InternalDsl.g:844:2: ( ruleType )
                    // InternalDsl.g:845:3: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__SubOperation__Alternatives"
    // InternalDsl.g:854:1: rule__SubOperation__Alternatives : ( ( 'Read' ) | ( 'Create' ) );
    public final void rule__SubOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:858:1: ( ( 'Read' ) | ( 'Create' ) )
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
                    // InternalDsl.g:859:2: ( 'Read' )
                    {
                    // InternalDsl.g:859:2: ( 'Read' )
                    // InternalDsl.g:860:3: 'Read'
                    {
                     before(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:865:2: ( 'Create' )
                    {
                    // InternalDsl.g:865:2: ( 'Create' )
                    // InternalDsl.g:866:3: 'Create'
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
    // InternalDsl.g:875:1: rule__SubTransaction__Alternatives : ( ( 'exchange' ) | ( 'sale' ) );
    public final void rule__SubTransaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:879:1: ( ( 'exchange' ) | ( 'sale' ) )
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
                    // InternalDsl.g:880:2: ( 'exchange' )
                    {
                    // InternalDsl.g:880:2: ( 'exchange' )
                    // InternalDsl.g:881:3: 'exchange'
                    {
                     before(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:886:2: ( 'sale' )
                    {
                    // InternalDsl.g:886:2: ( 'sale' )
                    // InternalDsl.g:887:3: 'sale'
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
    // InternalDsl.g:896:1: rule__ComponentName__Alternatives : ( ( 'Back' ) | ( 'Front' ) );
    public final void rule__ComponentName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:900:1: ( ( 'Back' ) | ( 'Front' ) )
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
                    // InternalDsl.g:901:2: ( 'Back' )
                    {
                    // InternalDsl.g:901:2: ( 'Back' )
                    // InternalDsl.g:902:3: 'Back'
                    {
                     before(grammarAccess.getComponentNameAccess().getBackKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComponentNameAccess().getBackKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:907:2: ( 'Front' )
                    {
                    // InternalDsl.g:907:2: ( 'Front' )
                    // InternalDsl.g:908:3: 'Front'
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
    // InternalDsl.g:917:1: rule__LayerName__Alternatives : ( ( 'JavaScript' ) | ( 'Ejb' ) | ( 'War' ) );
    public final void rule__LayerName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:921:1: ( ( 'JavaScript' ) | ( 'Ejb' ) | ( 'War' ) )
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
                    // InternalDsl.g:922:2: ( 'JavaScript' )
                    {
                    // InternalDsl.g:922:2: ( 'JavaScript' )
                    // InternalDsl.g:923:3: 'JavaScript'
                    {
                     before(grammarAccess.getLayerNameAccess().getJavaScriptKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLayerNameAccess().getJavaScriptKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:928:2: ( 'Ejb' )
                    {
                    // InternalDsl.g:928:2: ( 'Ejb' )
                    // InternalDsl.g:929:3: 'Ejb'
                    {
                     before(grammarAccess.getLayerNameAccess().getEjbKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLayerNameAccess().getEjbKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:934:2: ( 'War' )
                    {
                    // InternalDsl.g:934:2: ( 'War' )
                    // InternalDsl.g:935:3: 'War'
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
    // InternalDsl.g:944:1: rule__LayerSegmentName__Alternatives : ( ( 'Services' ) | ( 'Ui' ) | ( 'Store' ) | ( 'RestEntity' ) | ( 'Pojo' ) | ( 'Facade' ) | ( 'Dto' ) | ( 'Util' ) | ( 'Containers' ) );
    public final void rule__LayerSegmentName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:948:1: ( ( 'Services' ) | ( 'Ui' ) | ( 'Store' ) | ( 'RestEntity' ) | ( 'Pojo' ) | ( 'Facade' ) | ( 'Dto' ) | ( 'Util' ) | ( 'Containers' ) )
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
                    // InternalDsl.g:949:2: ( 'Services' )
                    {
                    // InternalDsl.g:949:2: ( 'Services' )
                    // InternalDsl.g:950:3: 'Services'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getServicesKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getServicesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:955:2: ( 'Ui' )
                    {
                    // InternalDsl.g:955:2: ( 'Ui' )
                    // InternalDsl.g:956:3: 'Ui'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getUiKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getUiKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:961:2: ( 'Store' )
                    {
                    // InternalDsl.g:961:2: ( 'Store' )
                    // InternalDsl.g:962:3: 'Store'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getStoreKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getStoreKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:967:2: ( 'RestEntity' )
                    {
                    // InternalDsl.g:967:2: ( 'RestEntity' )
                    // InternalDsl.g:968:3: 'RestEntity'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getRestEntityKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getRestEntityKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:973:2: ( 'Pojo' )
                    {
                    // InternalDsl.g:973:2: ( 'Pojo' )
                    // InternalDsl.g:974:3: 'Pojo'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getPojoKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getPojoKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:979:2: ( 'Facade' )
                    {
                    // InternalDsl.g:979:2: ( 'Facade' )
                    // InternalDsl.g:980:3: 'Facade'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getFacadeKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getFacadeKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:985:2: ( 'Dto' )
                    {
                    // InternalDsl.g:985:2: ( 'Dto' )
                    // InternalDsl.g:986:3: 'Dto'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getDtoKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getDtoKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:991:2: ( 'Util' )
                    {
                    // InternalDsl.g:991:2: ( 'Util' )
                    // InternalDsl.g:992:3: 'Util'
                    {
                     before(grammarAccess.getLayerSegmentNameAccess().getUtilKeyword_7()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getLayerSegmentNameAccess().getUtilKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:997:2: ( 'Containers' )
                    {
                    // InternalDsl.g:997:2: ( 'Containers' )
                    // InternalDsl.g:998:3: 'Containers'
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
    // InternalDsl.g:1007:1: rule__SublayerSegmentName__Alternatives : ( ( 'Actions' ) | ( 'Reducers' ) );
    public final void rule__SublayerSegmentName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1011:1: ( ( 'Actions' ) | ( 'Reducers' ) )
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
                    // InternalDsl.g:1012:2: ( 'Actions' )
                    {
                    // InternalDsl.g:1012:2: ( 'Actions' )
                    // InternalDsl.g:1013:3: 'Actions'
                    {
                     before(grammarAccess.getSublayerSegmentNameAccess().getActionsKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSublayerSegmentNameAccess().getActionsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1018:2: ( 'Reducers' )
                    {
                    // InternalDsl.g:1018:2: ( 'Reducers' )
                    // InternalDsl.g:1019:3: 'Reducers'
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
    // InternalDsl.g:1028:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1032:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalDsl.g:1033:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalDsl.g:1040:1: rule__System__Group__0__Impl : ( 'Casino' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1044:1: ( ( 'Casino' ) )
            // InternalDsl.g:1045:1: ( 'Casino' )
            {
            // InternalDsl.g:1045:1: ( 'Casino' )
            // InternalDsl.g:1046:2: 'Casino'
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
    // InternalDsl.g:1055:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1059:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalDsl.g:1060:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalDsl.g:1067:1: rule__System__Group__1__Impl : ( '{' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1071:1: ( ( '{' ) )
            // InternalDsl.g:1072:1: ( '{' )
            {
            // InternalDsl.g:1072:1: ( '{' )
            // InternalDsl.g:1073:2: '{'
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
    // InternalDsl.g:1082:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1086:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalDsl.g:1087:2: rule__System__Group__2__Impl rule__System__Group__3
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
    // InternalDsl.g:1094:1: rule__System__Group__2__Impl : ( ( rule__System__DomAssignment_2 ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1098:1: ( ( ( rule__System__DomAssignment_2 ) ) )
            // InternalDsl.g:1099:1: ( ( rule__System__DomAssignment_2 ) )
            {
            // InternalDsl.g:1099:1: ( ( rule__System__DomAssignment_2 ) )
            // InternalDsl.g:1100:2: ( rule__System__DomAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getDomAssignment_2()); 
            // InternalDsl.g:1101:2: ( rule__System__DomAssignment_2 )
            // InternalDsl.g:1101:3: rule__System__DomAssignment_2
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
    // InternalDsl.g:1109:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1113:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalDsl.g:1114:2: rule__System__Group__3__Impl rule__System__Group__4
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
    // InternalDsl.g:1121:1: rule__System__Group__3__Impl : ( ( rule__System__ArchAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1125:1: ( ( ( rule__System__ArchAssignment_3 ) ) )
            // InternalDsl.g:1126:1: ( ( rule__System__ArchAssignment_3 ) )
            {
            // InternalDsl.g:1126:1: ( ( rule__System__ArchAssignment_3 ) )
            // InternalDsl.g:1127:2: ( rule__System__ArchAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getArchAssignment_3()); 
            // InternalDsl.g:1128:2: ( rule__System__ArchAssignment_3 )
            // InternalDsl.g:1128:3: rule__System__ArchAssignment_3
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
    // InternalDsl.g:1136:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1140:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalDsl.g:1141:2: rule__System__Group__4__Impl rule__System__Group__5
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
    // InternalDsl.g:1148:1: rule__System__Group__4__Impl : ( ( rule__System__TechAssignment_4 ) ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1152:1: ( ( ( rule__System__TechAssignment_4 ) ) )
            // InternalDsl.g:1153:1: ( ( rule__System__TechAssignment_4 ) )
            {
            // InternalDsl.g:1153:1: ( ( rule__System__TechAssignment_4 ) )
            // InternalDsl.g:1154:2: ( rule__System__TechAssignment_4 )
            {
             before(grammarAccess.getSystemAccess().getTechAssignment_4()); 
            // InternalDsl.g:1155:2: ( rule__System__TechAssignment_4 )
            // InternalDsl.g:1155:3: rule__System__TechAssignment_4
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
    // InternalDsl.g:1163:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1167:1: ( rule__System__Group__5__Impl )
            // InternalDsl.g:1168:2: rule__System__Group__5__Impl
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
    // InternalDsl.g:1174:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1178:1: ( ( '}' ) )
            // InternalDsl.g:1179:1: ( '}' )
            {
            // InternalDsl.g:1179:1: ( '}' )
            // InternalDsl.g:1180:2: '}'
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
    // InternalDsl.g:1190:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1194:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalDsl.g:1195:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalDsl.g:1202:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1206:1: ( ( 'domain' ) )
            // InternalDsl.g:1207:1: ( 'domain' )
            {
            // InternalDsl.g:1207:1: ( 'domain' )
            // InternalDsl.g:1208:2: 'domain'
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
    // InternalDsl.g:1217:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1221:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalDsl.g:1222:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
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
    // InternalDsl.g:1229:1: rule__Domain__Group__1__Impl : ( '{' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1233:1: ( ( '{' ) )
            // InternalDsl.g:1234:1: ( '{' )
            {
            // InternalDsl.g:1234:1: ( '{' )
            // InternalDsl.g:1235:2: '{'
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
    // InternalDsl.g:1244:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1248:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalDsl.g:1249:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
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
    // InternalDsl.g:1256:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__ElementsAssignment_2 )* ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1260:1: ( ( ( rule__Domain__ElementsAssignment_2 )* ) )
            // InternalDsl.g:1261:1: ( ( rule__Domain__ElementsAssignment_2 )* )
            {
            // InternalDsl.g:1261:1: ( ( rule__Domain__ElementsAssignment_2 )* )
            // InternalDsl.g:1262:2: ( rule__Domain__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_2()); 
            // InternalDsl.g:1263:2: ( rule__Domain__ElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==40||(LA8_0>=42 && LA8_0<=43)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1263:3: rule__Domain__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Domain__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getElementsAssignment_2()); 

            }


            }

        }
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
    // InternalDsl.g:1271:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1275:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalDsl.g:1276:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
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
    // InternalDsl.g:1283:1: rule__Domain__Group__3__Impl : ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1287:1: ( ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) ) )
            // InternalDsl.g:1288:1: ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) )
            {
            // InternalDsl.g:1288:1: ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) )
            // InternalDsl.g:1289:2: ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* )
            {
            // InternalDsl.g:1289:2: ( ( rule__Domain__ModulesAssignment_3 ) )
            // InternalDsl.g:1290:3: ( rule__Domain__ModulesAssignment_3 )
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_3()); 
            // InternalDsl.g:1291:3: ( rule__Domain__ModulesAssignment_3 )
            // InternalDsl.g:1291:4: rule__Domain__ModulesAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Domain__ModulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModulesAssignment_3()); 

            }

            // InternalDsl.g:1294:2: ( ( rule__Domain__ModulesAssignment_3 )* )
            // InternalDsl.g:1295:3: ( rule__Domain__ModulesAssignment_3 )*
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_3()); 
            // InternalDsl.g:1296:3: ( rule__Domain__ModulesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1296:4: rule__Domain__ModulesAssignment_3
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
    // InternalDsl.g:1305:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1309:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalDsl.g:1310:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
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
    // InternalDsl.g:1317:1: rule__Domain__Group__4__Impl : ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1321:1: ( ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) ) )
            // InternalDsl.g:1322:1: ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) )
            {
            // InternalDsl.g:1322:1: ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) )
            // InternalDsl.g:1323:2: ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* )
            {
            // InternalDsl.g:1323:2: ( ( rule__Domain__RelationsAssignment_4 ) )
            // InternalDsl.g:1324:3: ( rule__Domain__RelationsAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 
            // InternalDsl.g:1325:3: ( rule__Domain__RelationsAssignment_4 )
            // InternalDsl.g:1325:4: rule__Domain__RelationsAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__Domain__RelationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 

            }

            // InternalDsl.g:1328:2: ( ( rule__Domain__RelationsAssignment_4 )* )
            // InternalDsl.g:1329:3: ( rule__Domain__RelationsAssignment_4 )*
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 
            // InternalDsl.g:1330:3: ( rule__Domain__RelationsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==45) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1330:4: rule__Domain__RelationsAssignment_4
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
    // InternalDsl.g:1339:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1343:1: ( rule__Domain__Group__5__Impl )
            // InternalDsl.g:1344:2: rule__Domain__Group__5__Impl
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
    // InternalDsl.g:1350:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1354:1: ( ( '}' ) )
            // InternalDsl.g:1355:1: ( '}' )
            {
            // InternalDsl.g:1355:1: ( '}' )
            // InternalDsl.g:1356:2: '}'
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
    // InternalDsl.g:1366:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1370:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalDsl.g:1371:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalDsl.g:1378:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1382:1: ( ( 'module' ) )
            // InternalDsl.g:1383:1: ( 'module' )
            {
            // InternalDsl.g:1383:1: ( 'module' )
            // InternalDsl.g:1384:2: 'module'
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
    // InternalDsl.g:1393:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1397:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalDsl.g:1398:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalDsl.g:1405:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1409:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalDsl.g:1410:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalDsl.g:1410:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalDsl.g:1411:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalDsl.g:1412:2: ( rule__Module__NameAssignment_1 )
            // InternalDsl.g:1412:3: rule__Module__NameAssignment_1
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
    // InternalDsl.g:1420:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1424:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalDsl.g:1425:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalDsl.g:1432:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1436:1: ( ( '{' ) )
            // InternalDsl.g:1437:1: ( '{' )
            {
            // InternalDsl.g:1437:1: ( '{' )
            // InternalDsl.g:1438:2: '{'
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
    // InternalDsl.g:1447:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1451:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalDsl.g:1452:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalDsl.g:1459:1: rule__Module__Group__3__Impl : ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1463:1: ( ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) )
            // InternalDsl.g:1464:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            {
            // InternalDsl.g:1464:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            // InternalDsl.g:1465:2: ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* )
            {
            // InternalDsl.g:1465:2: ( ( rule__Module__SubmodulesAssignment_3 ) )
            // InternalDsl.g:1466:3: ( rule__Module__SubmodulesAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:1467:3: ( rule__Module__SubmodulesAssignment_3 )
            // InternalDsl.g:1467:4: rule__Module__SubmodulesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__Module__SubmodulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 

            }

            // InternalDsl.g:1470:2: ( ( rule__Module__SubmodulesAssignment_3 )* )
            // InternalDsl.g:1471:3: ( rule__Module__SubmodulesAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:1472:3: ( rule__Module__SubmodulesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1472:4: rule__Module__SubmodulesAssignment_3
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
    // InternalDsl.g:1481:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1485:1: ( rule__Module__Group__4__Impl )
            // InternalDsl.g:1486:2: rule__Module__Group__4__Impl
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
    // InternalDsl.g:1492:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1496:1: ( ( '}' ) )
            // InternalDsl.g:1497:1: ( '}' )
            {
            // InternalDsl.g:1497:1: ( '}' )
            // InternalDsl.g:1498:2: '}'
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
    // InternalDsl.g:1508:1: rule__Submodule__Group__0 : rule__Submodule__Group__0__Impl rule__Submodule__Group__1 ;
    public final void rule__Submodule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1512:1: ( rule__Submodule__Group__0__Impl rule__Submodule__Group__1 )
            // InternalDsl.g:1513:2: rule__Submodule__Group__0__Impl rule__Submodule__Group__1
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
    // InternalDsl.g:1520:1: rule__Submodule__Group__0__Impl : ( 'submodule' ) ;
    public final void rule__Submodule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1524:1: ( ( 'submodule' ) )
            // InternalDsl.g:1525:1: ( 'submodule' )
            {
            // InternalDsl.g:1525:1: ( 'submodule' )
            // InternalDsl.g:1526:2: 'submodule'
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
    // InternalDsl.g:1535:1: rule__Submodule__Group__1 : rule__Submodule__Group__1__Impl rule__Submodule__Group__2 ;
    public final void rule__Submodule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1539:1: ( rule__Submodule__Group__1__Impl rule__Submodule__Group__2 )
            // InternalDsl.g:1540:2: rule__Submodule__Group__1__Impl rule__Submodule__Group__2
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
    // InternalDsl.g:1547:1: rule__Submodule__Group__1__Impl : ( ( rule__Submodule__NameAssignment_1 ) ) ;
    public final void rule__Submodule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1551:1: ( ( ( rule__Submodule__NameAssignment_1 ) ) )
            // InternalDsl.g:1552:1: ( ( rule__Submodule__NameAssignment_1 ) )
            {
            // InternalDsl.g:1552:1: ( ( rule__Submodule__NameAssignment_1 ) )
            // InternalDsl.g:1553:2: ( rule__Submodule__NameAssignment_1 )
            {
             before(grammarAccess.getSubmoduleAccess().getNameAssignment_1()); 
            // InternalDsl.g:1554:2: ( rule__Submodule__NameAssignment_1 )
            // InternalDsl.g:1554:3: rule__Submodule__NameAssignment_1
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
    // InternalDsl.g:1562:1: rule__Submodule__Group__2 : rule__Submodule__Group__2__Impl rule__Submodule__Group__3 ;
    public final void rule__Submodule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1566:1: ( rule__Submodule__Group__2__Impl rule__Submodule__Group__3 )
            // InternalDsl.g:1567:2: rule__Submodule__Group__2__Impl rule__Submodule__Group__3
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
    // InternalDsl.g:1574:1: rule__Submodule__Group__2__Impl : ( '{' ) ;
    public final void rule__Submodule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1578:1: ( ( '{' ) )
            // InternalDsl.g:1579:1: ( '{' )
            {
            // InternalDsl.g:1579:1: ( '{' )
            // InternalDsl.g:1580:2: '{'
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
    // InternalDsl.g:1589:1: rule__Submodule__Group__3 : rule__Submodule__Group__3__Impl rule__Submodule__Group__4 ;
    public final void rule__Submodule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1593:1: ( rule__Submodule__Group__3__Impl rule__Submodule__Group__4 )
            // InternalDsl.g:1594:2: rule__Submodule__Group__3__Impl rule__Submodule__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1601:1: rule__Submodule__Group__3__Impl : ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) ;
    public final void rule__Submodule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1605:1: ( ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) )
            // InternalDsl.g:1606:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            {
            // InternalDsl.g:1606:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            // InternalDsl.g:1607:2: ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* )
            {
            // InternalDsl.g:1607:2: ( ( rule__Submodule__OperationsAssignment_3 ) )
            // InternalDsl.g:1608:3: ( rule__Submodule__OperationsAssignment_3 )
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:1609:3: ( rule__Submodule__OperationsAssignment_3 )
            // InternalDsl.g:1609:4: rule__Submodule__OperationsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Submodule__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 

            }

            // InternalDsl.g:1612:2: ( ( rule__Submodule__OperationsAssignment_3 )* )
            // InternalDsl.g:1613:3: ( rule__Submodule__OperationsAssignment_3 )*
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:1614:3: ( rule__Submodule__OperationsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1614:4: rule__Submodule__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1623:1: rule__Submodule__Group__4 : rule__Submodule__Group__4__Impl rule__Submodule__Group__5 ;
    public final void rule__Submodule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1627:1: ( rule__Submodule__Group__4__Impl rule__Submodule__Group__5 )
            // InternalDsl.g:1628:2: rule__Submodule__Group__4__Impl rule__Submodule__Group__5
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
    // InternalDsl.g:1635:1: rule__Submodule__Group__4__Impl : ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) ;
    public final void rule__Submodule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1639:1: ( ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) )
            // InternalDsl.g:1640:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            {
            // InternalDsl.g:1640:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            // InternalDsl.g:1641:2: ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* )
            {
            // InternalDsl.g:1641:2: ( ( rule__Submodule__EntitiesAssignment_4 ) )
            // InternalDsl.g:1642:3: ( rule__Submodule__EntitiesAssignment_4 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:1643:3: ( rule__Submodule__EntitiesAssignment_4 )
            // InternalDsl.g:1643:4: rule__Submodule__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_18);
            rule__Submodule__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 

            }

            // InternalDsl.g:1646:2: ( ( rule__Submodule__EntitiesAssignment_4 )* )
            // InternalDsl.g:1647:3: ( rule__Submodule__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:1648:3: ( rule__Submodule__EntitiesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1648:4: rule__Submodule__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1657:1: rule__Submodule__Group__5 : rule__Submodule__Group__5__Impl ;
    public final void rule__Submodule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1661:1: ( rule__Submodule__Group__5__Impl )
            // InternalDsl.g:1662:2: rule__Submodule__Group__5__Impl
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
    // InternalDsl.g:1668:1: rule__Submodule__Group__5__Impl : ( '}' ) ;
    public final void rule__Submodule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1672:1: ( ( '}' ) )
            // InternalDsl.g:1673:1: ( '}' )
            {
            // InternalDsl.g:1673:1: ( '}' )
            // InternalDsl.g:1674:2: '}'
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
    // InternalDsl.g:1684:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1688:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalDsl.g:1689:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
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
    // InternalDsl.g:1696:1: rule__Operation__Group__0__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1700:1: ( ( 'op' ) )
            // InternalDsl.g:1701:1: ( 'op' )
            {
            // InternalDsl.g:1701:1: ( 'op' )
            // InternalDsl.g:1702:2: 'op'
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
    // InternalDsl.g:1711:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1715:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalDsl.g:1716:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1723:1: rule__Operation__Group__1__Impl : ( '{' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1727:1: ( ( '{' ) )
            // InternalDsl.g:1728:1: ( '{' )
            {
            // InternalDsl.g:1728:1: ( '{' )
            // InternalDsl.g:1729:2: '{'
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
    // InternalDsl.g:1738:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1742:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalDsl.g:1743:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:1750:1: rule__Operation__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1754:1: ( ( 'type:' ) )
            // InternalDsl.g:1755:1: ( 'type:' )
            {
            // InternalDsl.g:1755:1: ( 'type:' )
            // InternalDsl.g:1756:2: 'type:'
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
    // InternalDsl.g:1765:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1769:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalDsl.g:1770:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalDsl.g:1777:1: rule__Operation__Group__3__Impl : ( ruleSubOperation ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1781:1: ( ( ruleSubOperation ) )
            // InternalDsl.g:1782:1: ( ruleSubOperation )
            {
            // InternalDsl.g:1782:1: ( ruleSubOperation )
            // InternalDsl.g:1783:2: ruleSubOperation
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
    // InternalDsl.g:1792:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1796:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalDsl.g:1797:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
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
    // InternalDsl.g:1804:1: rule__Operation__Group__4__Impl : ( 'operates_on:' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1808:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:1809:1: ( 'operates_on:' )
            {
            // InternalDsl.g:1809:1: ( 'operates_on:' )
            // InternalDsl.g:1810:2: 'operates_on:'
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
    // InternalDsl.g:1819:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1823:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalDsl.g:1824:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
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
    // InternalDsl.g:1831:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__TargetAssignment_5 ) ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1835:1: ( ( ( rule__Operation__TargetAssignment_5 ) ) )
            // InternalDsl.g:1836:1: ( ( rule__Operation__TargetAssignment_5 ) )
            {
            // InternalDsl.g:1836:1: ( ( rule__Operation__TargetAssignment_5 ) )
            // InternalDsl.g:1837:2: ( rule__Operation__TargetAssignment_5 )
            {
             before(grammarAccess.getOperationAccess().getTargetAssignment_5()); 
            // InternalDsl.g:1838:2: ( rule__Operation__TargetAssignment_5 )
            // InternalDsl.g:1838:3: rule__Operation__TargetAssignment_5
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
    // InternalDsl.g:1846:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1850:1: ( rule__Operation__Group__6__Impl )
            // InternalDsl.g:1851:2: rule__Operation__Group__6__Impl
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
    // InternalDsl.g:1857:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1861:1: ( ( '}' ) )
            // InternalDsl.g:1862:1: ( '}' )
            {
            // InternalDsl.g:1862:1: ( '}' )
            // InternalDsl.g:1863:2: '}'
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
    // InternalDsl.g:1873:1: rule__GeneralEntity__Group__0 : rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 ;
    public final void rule__GeneralEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1877:1: ( rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 )
            // InternalDsl.g:1878:2: rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1
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
    // InternalDsl.g:1885:1: rule__GeneralEntity__Group__0__Impl : ( 'generalEntity' ) ;
    public final void rule__GeneralEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1889:1: ( ( 'generalEntity' ) )
            // InternalDsl.g:1890:1: ( 'generalEntity' )
            {
            // InternalDsl.g:1890:1: ( 'generalEntity' )
            // InternalDsl.g:1891:2: 'generalEntity'
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
    // InternalDsl.g:1900:1: rule__GeneralEntity__Group__1 : rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 ;
    public final void rule__GeneralEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1904:1: ( rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 )
            // InternalDsl.g:1905:2: rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2
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
    // InternalDsl.g:1912:1: rule__GeneralEntity__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__GeneralEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1916:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:1917:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:1917:1: ( ruleQualifiedName )
            // InternalDsl.g:1918:2: ruleQualifiedName
            {
             before(grammarAccess.getGeneralEntityAccess().getQualifiedNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralEntityAccess().getQualifiedNameParserRuleCall_1()); 

            }


            }

        }
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
    // InternalDsl.g:1927:1: rule__GeneralEntity__Group__2 : rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 ;
    public final void rule__GeneralEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1931:1: ( rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 )
            // InternalDsl.g:1932:2: rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3
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
    // InternalDsl.g:1939:1: rule__GeneralEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1943:1: ( ( '{' ) )
            // InternalDsl.g:1944:1: ( '{' )
            {
            // InternalDsl.g:1944:1: ( '{' )
            // InternalDsl.g:1945:2: '{'
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
    // InternalDsl.g:1954:1: rule__GeneralEntity__Group__3 : rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 ;
    public final void rule__GeneralEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1958:1: ( rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 )
            // InternalDsl.g:1959:2: rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4
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
    // InternalDsl.g:1966:1: rule__GeneralEntity__Group__3__Impl : ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__GeneralEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1970:1: ( ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1971:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1971:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1972:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1972:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1973:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1974:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1974:4: rule__GeneralEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__GeneralEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1977:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1978:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1979:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1979:4: rule__GeneralEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1988:1: rule__GeneralEntity__Group__4 : rule__GeneralEntity__Group__4__Impl ;
    public final void rule__GeneralEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1992:1: ( rule__GeneralEntity__Group__4__Impl )
            // InternalDsl.g:1993:2: rule__GeneralEntity__Group__4__Impl
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
    // InternalDsl.g:1999:1: rule__GeneralEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2003:1: ( ( '}' ) )
            // InternalDsl.g:2004:1: ( '}' )
            {
            // InternalDsl.g:2004:1: ( '}' )
            // InternalDsl.g:2005:2: '}'
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
    // InternalDsl.g:2015:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2019:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDsl.g:2020:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDsl.g:2027:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2031:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalDsl.g:2032:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalDsl.g:2032:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalDsl.g:2033:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalDsl.g:2034:2: ( rule__Property__NameAssignment_0 )
            // InternalDsl.g:2034:3: rule__Property__NameAssignment_0
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
    // InternalDsl.g:2042:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2046:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalDsl.g:2047:2: rule__Property__Group__1__Impl rule__Property__Group__2
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
    // InternalDsl.g:2054:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2058:1: ( ( ':' ) )
            // InternalDsl.g:2059:1: ( ':' )
            {
            // InternalDsl.g:2059:1: ( ':' )
            // InternalDsl.g:2060:2: ':'
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
    // InternalDsl.g:2069:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2073:1: ( rule__Property__Group__2__Impl )
            // InternalDsl.g:2074:2: rule__Property__Group__2__Impl
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
    // InternalDsl.g:2080:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2084:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalDsl.g:2085:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalDsl.g:2085:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalDsl.g:2086:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalDsl.g:2087:2: ( rule__Property__TypeAssignment_2 )
            // InternalDsl.g:2087:3: rule__Property__TypeAssignment_2
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
    // InternalDsl.g:2096:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2100:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDsl.g:2101:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalDsl.g:2108:1: rule__Type__Group__0__Impl : ( 'dataType' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2112:1: ( ( 'dataType' ) )
            // InternalDsl.g:2113:1: ( 'dataType' )
            {
            // InternalDsl.g:2113:1: ( 'dataType' )
            // InternalDsl.g:2114:2: 'dataType'
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
    // InternalDsl.g:2123:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2127:1: ( rule__Type__Group__1__Impl )
            // InternalDsl.g:2128:2: rule__Type__Group__1__Impl
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
    // InternalDsl.g:2134:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2138:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalDsl.g:2139:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalDsl.g:2139:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalDsl.g:2140:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalDsl.g:2141:2: ( rule__Type__NameAssignment_1 )
            // InternalDsl.g:2141:3: rule__Type__NameAssignment_1
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
    // InternalDsl.g:2150:1: rule__SpecialEntity__Group__0 : rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 ;
    public final void rule__SpecialEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2154:1: ( rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 )
            // InternalDsl.g:2155:2: rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1
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
    // InternalDsl.g:2162:1: rule__SpecialEntity__Group__0__Impl : ( 'specialEntity' ) ;
    public final void rule__SpecialEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2166:1: ( ( 'specialEntity' ) )
            // InternalDsl.g:2167:1: ( 'specialEntity' )
            {
            // InternalDsl.g:2167:1: ( 'specialEntity' )
            // InternalDsl.g:2168:2: 'specialEntity'
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
    // InternalDsl.g:2177:1: rule__SpecialEntity__Group__1 : rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 ;
    public final void rule__SpecialEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2181:1: ( rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 )
            // InternalDsl.g:2182:2: rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2
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
    // InternalDsl.g:2189:1: rule__SpecialEntity__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__SpecialEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2193:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:2194:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:2194:1: ( ruleQualifiedName )
            // InternalDsl.g:2195:2: ruleQualifiedName
            {
             before(grammarAccess.getSpecialEntityAccess().getQualifiedNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSpecialEntityAccess().getQualifiedNameParserRuleCall_1()); 

            }


            }

        }
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
    // InternalDsl.g:2204:1: rule__SpecialEntity__Group__2 : rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 ;
    public final void rule__SpecialEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2208:1: ( rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 )
            // InternalDsl.g:2209:2: rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3
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
    // InternalDsl.g:2216:1: rule__SpecialEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SpecialEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2220:1: ( ( '{' ) )
            // InternalDsl.g:2221:1: ( '{' )
            {
            // InternalDsl.g:2221:1: ( '{' )
            // InternalDsl.g:2222:2: '{'
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
    // InternalDsl.g:2231:1: rule__SpecialEntity__Group__3 : rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 ;
    public final void rule__SpecialEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2235:1: ( rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 )
            // InternalDsl.g:2236:2: rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:2243:1: rule__SpecialEntity__Group__3__Impl : ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__SpecialEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2247:1: ( ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:2248:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:2248:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:2249:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:2249:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:2250:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:2251:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            // InternalDsl.g:2251:4: rule__SpecialEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__SpecialEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:2254:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:2255:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:2256:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:2256:4: rule__SpecialEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalDsl.g:2265:1: rule__SpecialEntity__Group__4 : rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 ;
    public final void rule__SpecialEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2269:1: ( rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 )
            // InternalDsl.g:2270:2: rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5
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
    // InternalDsl.g:2277:1: rule__SpecialEntity__Group__4__Impl : ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) ;
    public final void rule__SpecialEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2281:1: ( ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) )
            // InternalDsl.g:2282:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            {
            // InternalDsl.g:2282:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            // InternalDsl.g:2283:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            {
            // InternalDsl.g:2283:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) )
            // InternalDsl.g:2284:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:2285:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            // InternalDsl.g:2285:4: rule__SpecialEntity__TransactionsAssignment_4
            {
            pushFollow(FOLLOW_24);
            rule__SpecialEntity__TransactionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 

            }

            // InternalDsl.g:2288:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            // InternalDsl.g:2289:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:2290:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:2290:4: rule__SpecialEntity__TransactionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
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
    // InternalDsl.g:2299:1: rule__SpecialEntity__Group__5 : rule__SpecialEntity__Group__5__Impl ;
    public final void rule__SpecialEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2303:1: ( rule__SpecialEntity__Group__5__Impl )
            // InternalDsl.g:2304:2: rule__SpecialEntity__Group__5__Impl
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
    // InternalDsl.g:2310:1: rule__SpecialEntity__Group__5__Impl : ( '}' ) ;
    public final void rule__SpecialEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2314:1: ( ( '}' ) )
            // InternalDsl.g:2315:1: ( '}' )
            {
            // InternalDsl.g:2315:1: ( '}' )
            // InternalDsl.g:2316:2: '}'
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
    // InternalDsl.g:2326:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2330:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalDsl.g:2331:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
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
    // InternalDsl.g:2338:1: rule__Transaction__Group__0__Impl : ( 'trx' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2342:1: ( ( 'trx' ) )
            // InternalDsl.g:2343:1: ( 'trx' )
            {
            // InternalDsl.g:2343:1: ( 'trx' )
            // InternalDsl.g:2344:2: 'trx'
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
    // InternalDsl.g:2353:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2357:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalDsl.g:2358:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:2365:1: rule__Transaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2369:1: ( ( '{' ) )
            // InternalDsl.g:2370:1: ( '{' )
            {
            // InternalDsl.g:2370:1: ( '{' )
            // InternalDsl.g:2371:2: '{'
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
    // InternalDsl.g:2380:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2384:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalDsl.g:2385:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:2392:1: rule__Transaction__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2396:1: ( ( 'type:' ) )
            // InternalDsl.g:2397:1: ( 'type:' )
            {
            // InternalDsl.g:2397:1: ( 'type:' )
            // InternalDsl.g:2398:2: 'type:'
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
    // InternalDsl.g:2407:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2411:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalDsl.g:2412:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalDsl.g:2419:1: rule__Transaction__Group__3__Impl : ( ruleSubTransaction ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2423:1: ( ( ruleSubTransaction ) )
            // InternalDsl.g:2424:1: ( ruleSubTransaction )
            {
            // InternalDsl.g:2424:1: ( ruleSubTransaction )
            // InternalDsl.g:2425:2: ruleSubTransaction
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
    // InternalDsl.g:2434:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2438:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalDsl.g:2439:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
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
    // InternalDsl.g:2446:1: rule__Transaction__Group__4__Impl : ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2450:1: ( ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) )
            // InternalDsl.g:2451:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            {
            // InternalDsl.g:2451:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            // InternalDsl.g:2452:2: ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* )
            {
            // InternalDsl.g:2452:2: ( ( rule__Transaction__OperatesonAssignment_4 ) )
            // InternalDsl.g:2453:3: ( rule__Transaction__OperatesonAssignment_4 )
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:2454:3: ( rule__Transaction__OperatesonAssignment_4 )
            // InternalDsl.g:2454:4: rule__Transaction__OperatesonAssignment_4
            {
            pushFollow(FOLLOW_26);
            rule__Transaction__OperatesonAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 

            }

            // InternalDsl.g:2457:2: ( ( rule__Transaction__OperatesonAssignment_4 )* )
            // InternalDsl.g:2458:3: ( rule__Transaction__OperatesonAssignment_4 )*
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:2459:3: ( rule__Transaction__OperatesonAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:2459:4: rule__Transaction__OperatesonAssignment_4
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalDsl.g:2468:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2472:1: ( rule__Transaction__Group__5__Impl )
            // InternalDsl.g:2473:2: rule__Transaction__Group__5__Impl
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
    // InternalDsl.g:2479:1: rule__Transaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2483:1: ( ( '}' ) )
            // InternalDsl.g:2484:1: ( '}' )
            {
            // InternalDsl.g:2484:1: ( '}' )
            // InternalDsl.g:2485:2: '}'
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
    // InternalDsl.g:2495:1: rule__Operateson__Group__0 : rule__Operateson__Group__0__Impl rule__Operateson__Group__1 ;
    public final void rule__Operateson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2499:1: ( rule__Operateson__Group__0__Impl rule__Operateson__Group__1 )
            // InternalDsl.g:2500:2: rule__Operateson__Group__0__Impl rule__Operateson__Group__1
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
    // InternalDsl.g:2507:1: rule__Operateson__Group__0__Impl : ( 'operates_on:' ) ;
    public final void rule__Operateson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2511:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:2512:1: ( 'operates_on:' )
            {
            // InternalDsl.g:2512:1: ( 'operates_on:' )
            // InternalDsl.g:2513:2: 'operates_on:'
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
    // InternalDsl.g:2522:1: rule__Operateson__Group__1 : rule__Operateson__Group__1__Impl ;
    public final void rule__Operateson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2526:1: ( rule__Operateson__Group__1__Impl )
            // InternalDsl.g:2527:2: rule__Operateson__Group__1__Impl
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
    // InternalDsl.g:2533:1: rule__Operateson__Group__1__Impl : ( ( rule__Operateson__TypeAssignment_1 ) ) ;
    public final void rule__Operateson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2537:1: ( ( ( rule__Operateson__TypeAssignment_1 ) ) )
            // InternalDsl.g:2538:1: ( ( rule__Operateson__TypeAssignment_1 ) )
            {
            // InternalDsl.g:2538:1: ( ( rule__Operateson__TypeAssignment_1 ) )
            // InternalDsl.g:2539:2: ( rule__Operateson__TypeAssignment_1 )
            {
             before(grammarAccess.getOperatesonAccess().getTypeAssignment_1()); 
            // InternalDsl.g:2540:2: ( rule__Operateson__TypeAssignment_1 )
            // InternalDsl.g:2540:3: rule__Operateson__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operateson__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatesonAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalDsl.g:2549:1: rule__RelationDom__Group__0 : rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 ;
    public final void rule__RelationDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2553:1: ( rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 )
            // InternalDsl.g:2554:2: rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1
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
    // InternalDsl.g:2561:1: rule__RelationDom__Group__0__Impl : ( 'rel' ) ;
    public final void rule__RelationDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2565:1: ( ( 'rel' ) )
            // InternalDsl.g:2566:1: ( 'rel' )
            {
            // InternalDsl.g:2566:1: ( 'rel' )
            // InternalDsl.g:2567:2: 'rel'
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
    // InternalDsl.g:2576:1: rule__RelationDom__Group__1 : rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 ;
    public final void rule__RelationDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2580:1: ( rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 )
            // InternalDsl.g:2581:2: rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:2588:1: rule__RelationDom__Group__1__Impl : ( '{' ) ;
    public final void rule__RelationDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2592:1: ( ( '{' ) )
            // InternalDsl.g:2593:1: ( '{' )
            {
            // InternalDsl.g:2593:1: ( '{' )
            // InternalDsl.g:2594:2: '{'
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
    // InternalDsl.g:2603:1: rule__RelationDom__Group__2 : rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 ;
    public final void rule__RelationDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2607:1: ( rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 )
            // InternalDsl.g:2608:2: rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:2615:1: rule__RelationDom__Group__2__Impl : ( 'type:' ) ;
    public final void rule__RelationDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2619:1: ( ( 'type:' ) )
            // InternalDsl.g:2620:1: ( 'type:' )
            {
            // InternalDsl.g:2620:1: ( 'type:' )
            // InternalDsl.g:2621:2: 'type:'
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
    // InternalDsl.g:2630:1: rule__RelationDom__Group__3 : rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 ;
    public final void rule__RelationDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2634:1: ( rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 )
            // InternalDsl.g:2635:2: rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:2642:1: rule__RelationDom__Group__3__Impl : ( 'Composition' ) ;
    public final void rule__RelationDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2646:1: ( ( 'Composition' ) )
            // InternalDsl.g:2647:1: ( 'Composition' )
            {
            // InternalDsl.g:2647:1: ( 'Composition' )
            // InternalDsl.g:2648:2: 'Composition'
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
    // InternalDsl.g:2657:1: rule__RelationDom__Group__4 : rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 ;
    public final void rule__RelationDom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2661:1: ( rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 )
            // InternalDsl.g:2662:2: rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5
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
    // InternalDsl.g:2669:1: rule__RelationDom__Group__4__Impl : ( 'source:' ) ;
    public final void rule__RelationDom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2673:1: ( ( 'source:' ) )
            // InternalDsl.g:2674:1: ( 'source:' )
            {
            // InternalDsl.g:2674:1: ( 'source:' )
            // InternalDsl.g:2675:2: 'source:'
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
    // InternalDsl.g:2684:1: rule__RelationDom__Group__5 : rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 ;
    public final void rule__RelationDom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2688:1: ( rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 )
            // InternalDsl.g:2689:2: rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:2696:1: rule__RelationDom__Group__5__Impl : ( ( rule__RelationDom__TypeAssignment_5 ) ) ;
    public final void rule__RelationDom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2700:1: ( ( ( rule__RelationDom__TypeAssignment_5 ) ) )
            // InternalDsl.g:2701:1: ( ( rule__RelationDom__TypeAssignment_5 ) )
            {
            // InternalDsl.g:2701:1: ( ( rule__RelationDom__TypeAssignment_5 ) )
            // InternalDsl.g:2702:2: ( rule__RelationDom__TypeAssignment_5 )
            {
             before(grammarAccess.getRelationDomAccess().getTypeAssignment_5()); 
            // InternalDsl.g:2703:2: ( rule__RelationDom__TypeAssignment_5 )
            // InternalDsl.g:2703:3: rule__RelationDom__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationDomAccess().getTypeAssignment_5()); 

            }


            }

        }
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
    // InternalDsl.g:2711:1: rule__RelationDom__Group__6 : rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 ;
    public final void rule__RelationDom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2715:1: ( rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 )
            // InternalDsl.g:2716:2: rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7
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
    // InternalDsl.g:2723:1: rule__RelationDom__Group__6__Impl : ( 'target:' ) ;
    public final void rule__RelationDom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2727:1: ( ( 'target:' ) )
            // InternalDsl.g:2728:1: ( 'target:' )
            {
            // InternalDsl.g:2728:1: ( 'target:' )
            // InternalDsl.g:2729:2: 'target:'
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
    // InternalDsl.g:2738:1: rule__RelationDom__Group__7 : rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 ;
    public final void rule__RelationDom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2742:1: ( rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 )
            // InternalDsl.g:2743:2: rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8
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
    // InternalDsl.g:2750:1: rule__RelationDom__Group__7__Impl : ( ( rule__RelationDom__TargetAssignment_7 ) ) ;
    public final void rule__RelationDom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2754:1: ( ( ( rule__RelationDom__TargetAssignment_7 ) ) )
            // InternalDsl.g:2755:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            {
            // InternalDsl.g:2755:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            // InternalDsl.g:2756:2: ( rule__RelationDom__TargetAssignment_7 )
            {
             before(grammarAccess.getRelationDomAccess().getTargetAssignment_7()); 
            // InternalDsl.g:2757:2: ( rule__RelationDom__TargetAssignment_7 )
            // InternalDsl.g:2757:3: rule__RelationDom__TargetAssignment_7
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
    // InternalDsl.g:2765:1: rule__RelationDom__Group__8 : rule__RelationDom__Group__8__Impl ;
    public final void rule__RelationDom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2769:1: ( rule__RelationDom__Group__8__Impl )
            // InternalDsl.g:2770:2: rule__RelationDom__Group__8__Impl
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
    // InternalDsl.g:2776:1: rule__RelationDom__Group__8__Impl : ( '}' ) ;
    public final void rule__RelationDom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2780:1: ( ( '}' ) )
            // InternalDsl.g:2781:1: ( '}' )
            {
            // InternalDsl.g:2781:1: ( '}' )
            // InternalDsl.g:2782:2: '}'
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
    // InternalDsl.g:2792:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2796:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalDsl.g:2797:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
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
    // InternalDsl.g:2804:1: rule__Architecture__Group__0__Impl : ( 'arch' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2808:1: ( ( 'arch' ) )
            // InternalDsl.g:2809:1: ( 'arch' )
            {
            // InternalDsl.g:2809:1: ( 'arch' )
            // InternalDsl.g:2810:2: 'arch'
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
    // InternalDsl.g:2819:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2823:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalDsl.g:2824:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2831:1: rule__Architecture__Group__1__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2835:1: ( ( '{' ) )
            // InternalDsl.g:2836:1: ( '{' )
            {
            // InternalDsl.g:2836:1: ( '{' )
            // InternalDsl.g:2837:2: '{'
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
    // InternalDsl.g:2846:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2850:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalDsl.g:2851:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalDsl.g:2858:1: rule__Architecture__Group__2__Impl : ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2862:1: ( ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) ) )
            // InternalDsl.g:2863:1: ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) )
            {
            // InternalDsl.g:2863:1: ( ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* ) )
            // InternalDsl.g:2864:2: ( ( rule__Architecture__ComponentesAssignment_2 ) ) ( ( rule__Architecture__ComponentesAssignment_2 )* )
            {
            // InternalDsl.g:2864:2: ( ( rule__Architecture__ComponentesAssignment_2 ) )
            // InternalDsl.g:2865:3: ( rule__Architecture__ComponentesAssignment_2 )
            {
             before(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 
            // InternalDsl.g:2866:3: ( rule__Architecture__ComponentesAssignment_2 )
            // InternalDsl.g:2866:4: rule__Architecture__ComponentesAssignment_2
            {
            pushFollow(FOLLOW_32);
            rule__Architecture__ComponentesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 

            }

            // InternalDsl.g:2869:2: ( ( rule__Architecture__ComponentesAssignment_2 )* )
            // InternalDsl.g:2870:3: ( rule__Architecture__ComponentesAssignment_2 )*
            {
             before(grammarAccess.getArchitectureAccess().getComponentesAssignment_2()); 
            // InternalDsl.g:2871:3: ( rule__Architecture__ComponentesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:2871:4: rule__Architecture__ComponentesAssignment_2
            	    {
            	    pushFollow(FOLLOW_32);
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
    // InternalDsl.g:2880:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2884:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalDsl.g:2885:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
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
    // InternalDsl.g:2892:1: rule__Architecture__Group__3__Impl : ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2896:1: ( ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) ) )
            // InternalDsl.g:2897:1: ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) )
            {
            // InternalDsl.g:2897:1: ( ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* ) )
            // InternalDsl.g:2898:2: ( ( rule__Architecture__RelationArchAssignment_3 ) ) ( ( rule__Architecture__RelationArchAssignment_3 )* )
            {
            // InternalDsl.g:2898:2: ( ( rule__Architecture__RelationArchAssignment_3 ) )
            // InternalDsl.g:2899:3: ( rule__Architecture__RelationArchAssignment_3 )
            {
             before(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 
            // InternalDsl.g:2900:3: ( rule__Architecture__RelationArchAssignment_3 )
            // InternalDsl.g:2900:4: rule__Architecture__RelationArchAssignment_3
            {
            pushFollow(FOLLOW_33);
            rule__Architecture__RelationArchAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 

            }

            // InternalDsl.g:2903:2: ( ( rule__Architecture__RelationArchAssignment_3 )* )
            // InternalDsl.g:2904:3: ( rule__Architecture__RelationArchAssignment_3 )*
            {
             before(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3()); 
            // InternalDsl.g:2905:3: ( rule__Architecture__RelationArchAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==55) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:2905:4: rule__Architecture__RelationArchAssignment_3
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalDsl.g:2914:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2918:1: ( rule__Architecture__Group__4__Impl )
            // InternalDsl.g:2919:2: rule__Architecture__Group__4__Impl
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
    // InternalDsl.g:2925:1: rule__Architecture__Group__4__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2929:1: ( ( '}' ) )
            // InternalDsl.g:2930:1: ( '}' )
            {
            // InternalDsl.g:2930:1: ( '}' )
            // InternalDsl.g:2931:2: '}'
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
    // InternalDsl.g:2941:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2945:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalDsl.g:2946:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDsl.g:2953:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2957:1: ( ( 'component' ) )
            // InternalDsl.g:2958:1: ( 'component' )
            {
            // InternalDsl.g:2958:1: ( 'component' )
            // InternalDsl.g:2959:2: 'component'
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
    // InternalDsl.g:2968:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2972:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalDsl.g:2973:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalDsl.g:2980:1: rule__Component__Group__1__Impl : ( ruleComponentName ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2984:1: ( ( ruleComponentName ) )
            // InternalDsl.g:2985:1: ( ruleComponentName )
            {
            // InternalDsl.g:2985:1: ( ruleComponentName )
            // InternalDsl.g:2986:2: ruleComponentName
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
    // InternalDsl.g:2995:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2999:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalDsl.g:3000:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalDsl.g:3007:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3011:1: ( ( '{' ) )
            // InternalDsl.g:3012:1: ( '{' )
            {
            // InternalDsl.g:3012:1: ( '{' )
            // InternalDsl.g:3013:2: '{'
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
    // InternalDsl.g:3022:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3026:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalDsl.g:3027:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalDsl.g:3034:1: rule__Component__Group__3__Impl : ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3038:1: ( ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) ) )
            // InternalDsl.g:3039:1: ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) )
            {
            // InternalDsl.g:3039:1: ( ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* ) )
            // InternalDsl.g:3040:2: ( ( rule__Component__LayerAssignment_3 ) ) ( ( rule__Component__LayerAssignment_3 )* )
            {
            // InternalDsl.g:3040:2: ( ( rule__Component__LayerAssignment_3 ) )
            // InternalDsl.g:3041:3: ( rule__Component__LayerAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getLayerAssignment_3()); 
            // InternalDsl.g:3042:3: ( rule__Component__LayerAssignment_3 )
            // InternalDsl.g:3042:4: rule__Component__LayerAssignment_3
            {
            pushFollow(FOLLOW_36);
            rule__Component__LayerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getLayerAssignment_3()); 

            }

            // InternalDsl.g:3045:2: ( ( rule__Component__LayerAssignment_3 )* )
            // InternalDsl.g:3046:3: ( rule__Component__LayerAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getLayerAssignment_3()); 
            // InternalDsl.g:3047:3: ( rule__Component__LayerAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==51) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:3047:4: rule__Component__LayerAssignment_3
            	    {
            	    pushFollow(FOLLOW_36);
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
    // InternalDsl.g:3056:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3060:1: ( rule__Component__Group__4__Impl )
            // InternalDsl.g:3061:2: rule__Component__Group__4__Impl
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
    // InternalDsl.g:3067:1: rule__Component__Group__4__Impl : ( '}' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3071:1: ( ( '}' ) )
            // InternalDsl.g:3072:1: ( '}' )
            {
            // InternalDsl.g:3072:1: ( '}' )
            // InternalDsl.g:3073:2: '}'
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
    // InternalDsl.g:3083:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3087:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalDsl.g:3088:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDsl.g:3095:1: rule__Layer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3099:1: ( ( 'layer' ) )
            // InternalDsl.g:3100:1: ( 'layer' )
            {
            // InternalDsl.g:3100:1: ( 'layer' )
            // InternalDsl.g:3101:2: 'layer'
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
    // InternalDsl.g:3110:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3114:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalDsl.g:3115:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
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
    // InternalDsl.g:3122:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3126:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // InternalDsl.g:3127:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // InternalDsl.g:3127:1: ( ( rule__Layer__NameAssignment_1 ) )
            // InternalDsl.g:3128:2: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // InternalDsl.g:3129:2: ( rule__Layer__NameAssignment_1 )
            // InternalDsl.g:3129:3: rule__Layer__NameAssignment_1
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
    // InternalDsl.g:3137:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3141:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalDsl.g:3142:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalDsl.g:3149:1: rule__Layer__Group__2__Impl : ( '{' ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3153:1: ( ( '{' ) )
            // InternalDsl.g:3154:1: ( '{' )
            {
            // InternalDsl.g:3154:1: ( '{' )
            // InternalDsl.g:3155:2: '{'
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
    // InternalDsl.g:3164:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3168:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalDsl.g:3169:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalDsl.g:3176:1: rule__Layer__Group__3__Impl : ( ( rule__Layer__LayerSegmentsAssignment_3 )* ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3180:1: ( ( ( rule__Layer__LayerSegmentsAssignment_3 )* ) )
            // InternalDsl.g:3181:1: ( ( rule__Layer__LayerSegmentsAssignment_3 )* )
            {
            // InternalDsl.g:3181:1: ( ( rule__Layer__LayerSegmentsAssignment_3 )* )
            // InternalDsl.g:3182:2: ( rule__Layer__LayerSegmentsAssignment_3 )*
            {
             before(grammarAccess.getLayerAccess().getLayerSegmentsAssignment_3()); 
            // InternalDsl.g:3183:2: ( rule__Layer__LayerSegmentsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==52) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:3183:3: rule__Layer__LayerSegmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_39);
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
    // InternalDsl.g:3191:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3195:1: ( rule__Layer__Group__4__Impl )
            // InternalDsl.g:3196:2: rule__Layer__Group__4__Impl
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
    // InternalDsl.g:3202:1: rule__Layer__Group__4__Impl : ( '}' ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3206:1: ( ( '}' ) )
            // InternalDsl.g:3207:1: ( '}' )
            {
            // InternalDsl.g:3207:1: ( '}' )
            // InternalDsl.g:3208:2: '}'
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
    // InternalDsl.g:3218:1: rule__LayerSegment__Group__0 : rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1 ;
    public final void rule__LayerSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3222:1: ( rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1 )
            // InternalDsl.g:3223:2: rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDsl.g:3230:1: rule__LayerSegment__Group__0__Impl : ( 'layerSegment' ) ;
    public final void rule__LayerSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3234:1: ( ( 'layerSegment' ) )
            // InternalDsl.g:3235:1: ( 'layerSegment' )
            {
            // InternalDsl.g:3235:1: ( 'layerSegment' )
            // InternalDsl.g:3236:2: 'layerSegment'
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
    // InternalDsl.g:3245:1: rule__LayerSegment__Group__1 : rule__LayerSegment__Group__1__Impl rule__LayerSegment__Group__2 ;
    public final void rule__LayerSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3249:1: ( rule__LayerSegment__Group__1__Impl rule__LayerSegment__Group__2 )
            // InternalDsl.g:3250:2: rule__LayerSegment__Group__1__Impl rule__LayerSegment__Group__2
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
    // InternalDsl.g:3257:1: rule__LayerSegment__Group__1__Impl : ( ( rule__LayerSegment__NameAssignment_1 ) ) ;
    public final void rule__LayerSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3261:1: ( ( ( rule__LayerSegment__NameAssignment_1 ) ) )
            // InternalDsl.g:3262:1: ( ( rule__LayerSegment__NameAssignment_1 ) )
            {
            // InternalDsl.g:3262:1: ( ( rule__LayerSegment__NameAssignment_1 ) )
            // InternalDsl.g:3263:2: ( rule__LayerSegment__NameAssignment_1 )
            {
             before(grammarAccess.getLayerSegmentAccess().getNameAssignment_1()); 
            // InternalDsl.g:3264:2: ( rule__LayerSegment__NameAssignment_1 )
            // InternalDsl.g:3264:3: rule__LayerSegment__NameAssignment_1
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
    // InternalDsl.g:3272:1: rule__LayerSegment__Group__2 : rule__LayerSegment__Group__2__Impl rule__LayerSegment__Group__3 ;
    public final void rule__LayerSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3276:1: ( rule__LayerSegment__Group__2__Impl rule__LayerSegment__Group__3 )
            // InternalDsl.g:3277:2: rule__LayerSegment__Group__2__Impl rule__LayerSegment__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalDsl.g:3284:1: rule__LayerSegment__Group__2__Impl : ( '{' ) ;
    public final void rule__LayerSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3288:1: ( ( '{' ) )
            // InternalDsl.g:3289:1: ( '{' )
            {
            // InternalDsl.g:3289:1: ( '{' )
            // InternalDsl.g:3290:2: '{'
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
    // InternalDsl.g:3299:1: rule__LayerSegment__Group__3 : rule__LayerSegment__Group__3__Impl rule__LayerSegment__Group__4 ;
    public final void rule__LayerSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3303:1: ( rule__LayerSegment__Group__3__Impl rule__LayerSegment__Group__4 )
            // InternalDsl.g:3304:2: rule__LayerSegment__Group__3__Impl rule__LayerSegment__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalDsl.g:3311:1: rule__LayerSegment__Group__3__Impl : ( ( rule__LayerSegment__Group_3__0 )? ) ;
    public final void rule__LayerSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3315:1: ( ( ( rule__LayerSegment__Group_3__0 )? ) )
            // InternalDsl.g:3316:1: ( ( rule__LayerSegment__Group_3__0 )? )
            {
            // InternalDsl.g:3316:1: ( ( rule__LayerSegment__Group_3__0 )? )
            // InternalDsl.g:3317:2: ( rule__LayerSegment__Group_3__0 )?
            {
             before(grammarAccess.getLayerSegmentAccess().getGroup_3()); 
            // InternalDsl.g:3318:2: ( rule__LayerSegment__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:3318:3: rule__LayerSegment__Group_3__0
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
    // InternalDsl.g:3326:1: rule__LayerSegment__Group__4 : rule__LayerSegment__Group__4__Impl rule__LayerSegment__Group__5 ;
    public final void rule__LayerSegment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3330:1: ( rule__LayerSegment__Group__4__Impl rule__LayerSegment__Group__5 )
            // InternalDsl.g:3331:2: rule__LayerSegment__Group__4__Impl rule__LayerSegment__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalDsl.g:3338:1: rule__LayerSegment__Group__4__Impl : ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* ) ;
    public final void rule__LayerSegment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3342:1: ( ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* ) )
            // InternalDsl.g:3343:1: ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* )
            {
            // InternalDsl.g:3343:1: ( ( rule__LayerSegment__SublayerSegmentsAssignment_4 )* )
            // InternalDsl.g:3344:2: ( rule__LayerSegment__SublayerSegmentsAssignment_4 )*
            {
             before(grammarAccess.getLayerSegmentAccess().getSublayerSegmentsAssignment_4()); 
            // InternalDsl.g:3345:2: ( rule__LayerSegment__SublayerSegmentsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==54) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:3345:3: rule__LayerSegment__SublayerSegmentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_42);
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
    // InternalDsl.g:3353:1: rule__LayerSegment__Group__5 : rule__LayerSegment__Group__5__Impl ;
    public final void rule__LayerSegment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3357:1: ( rule__LayerSegment__Group__5__Impl )
            // InternalDsl.g:3358:2: rule__LayerSegment__Group__5__Impl
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
    // InternalDsl.g:3364:1: rule__LayerSegment__Group__5__Impl : ( '}' ) ;
    public final void rule__LayerSegment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3368:1: ( ( '}' ) )
            // InternalDsl.g:3369:1: ( '}' )
            {
            // InternalDsl.g:3369:1: ( '}' )
            // InternalDsl.g:3370:2: '}'
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
    // InternalDsl.g:3380:1: rule__LayerSegment__Group_3__0 : rule__LayerSegment__Group_3__0__Impl rule__LayerSegment__Group_3__1 ;
    public final void rule__LayerSegment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3384:1: ( rule__LayerSegment__Group_3__0__Impl rule__LayerSegment__Group_3__1 )
            // InternalDsl.g:3385:2: rule__LayerSegment__Group_3__0__Impl rule__LayerSegment__Group_3__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalDsl.g:3392:1: rule__LayerSegment__Group_3__0__Impl : ( '{' ) ;
    public final void rule__LayerSegment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3396:1: ( ( '{' ) )
            // InternalDsl.g:3397:1: ( '{' )
            {
            // InternalDsl.g:3397:1: ( '{' )
            // InternalDsl.g:3398:2: '{'
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
    // InternalDsl.g:3407:1: rule__LayerSegment__Group_3__1 : rule__LayerSegment__Group_3__1__Impl rule__LayerSegment__Group_3__2 ;
    public final void rule__LayerSegment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3411:1: ( rule__LayerSegment__Group_3__1__Impl rule__LayerSegment__Group_3__2 )
            // InternalDsl.g:3412:2: rule__LayerSegment__Group_3__1__Impl rule__LayerSegment__Group_3__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalDsl.g:3419:1: rule__LayerSegment__Group_3__1__Impl : ( ( rule__LayerSegment__RelationsAssignment_3_1 )* ) ;
    public final void rule__LayerSegment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3423:1: ( ( ( rule__LayerSegment__RelationsAssignment_3_1 )* ) )
            // InternalDsl.g:3424:1: ( ( rule__LayerSegment__RelationsAssignment_3_1 )* )
            {
            // InternalDsl.g:3424:1: ( ( rule__LayerSegment__RelationsAssignment_3_1 )* )
            // InternalDsl.g:3425:2: ( rule__LayerSegment__RelationsAssignment_3_1 )*
            {
             before(grammarAccess.getLayerSegmentAccess().getRelationsAssignment_3_1()); 
            // InternalDsl.g:3426:2: ( rule__LayerSegment__RelationsAssignment_3_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:3426:3: rule__LayerSegment__RelationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_44);
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
    // InternalDsl.g:3434:1: rule__LayerSegment__Group_3__2 : rule__LayerSegment__Group_3__2__Impl ;
    public final void rule__LayerSegment__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3438:1: ( rule__LayerSegment__Group_3__2__Impl )
            // InternalDsl.g:3439:2: rule__LayerSegment__Group_3__2__Impl
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
    // InternalDsl.g:3445:1: rule__LayerSegment__Group_3__2__Impl : ( '}' ) ;
    public final void rule__LayerSegment__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3449:1: ( ( '}' ) )
            // InternalDsl.g:3450:1: ( '}' )
            {
            // InternalDsl.g:3450:1: ( '}' )
            // InternalDsl.g:3451:2: '}'
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
    // InternalDsl.g:3461:1: rule__LayerSegmentRelation__Group__0 : rule__LayerSegmentRelation__Group__0__Impl rule__LayerSegmentRelation__Group__1 ;
    public final void rule__LayerSegmentRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3465:1: ( rule__LayerSegmentRelation__Group__0__Impl rule__LayerSegmentRelation__Group__1 )
            // InternalDsl.g:3466:2: rule__LayerSegmentRelation__Group__0__Impl rule__LayerSegmentRelation__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDsl.g:3473:1: rule__LayerSegmentRelation__Group__0__Impl : ( 'allowedToUse:' ) ;
    public final void rule__LayerSegmentRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3477:1: ( ( 'allowedToUse:' ) )
            // InternalDsl.g:3478:1: ( 'allowedToUse:' )
            {
            // InternalDsl.g:3478:1: ( 'allowedToUse:' )
            // InternalDsl.g:3479:2: 'allowedToUse:'
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
    // InternalDsl.g:3488:1: rule__LayerSegmentRelation__Group__1 : rule__LayerSegmentRelation__Group__1__Impl ;
    public final void rule__LayerSegmentRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3492:1: ( rule__LayerSegmentRelation__Group__1__Impl )
            // InternalDsl.g:3493:2: rule__LayerSegmentRelation__Group__1__Impl
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
    // InternalDsl.g:3499:1: rule__LayerSegmentRelation__Group__1__Impl : ( ruleLayerSegmentName ) ;
    public final void rule__LayerSegmentRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3503:1: ( ( ruleLayerSegmentName ) )
            // InternalDsl.g:3504:1: ( ruleLayerSegmentName )
            {
            // InternalDsl.g:3504:1: ( ruleLayerSegmentName )
            // InternalDsl.g:3505:2: ruleLayerSegmentName
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
    // InternalDsl.g:3515:1: rule__SublayerSegment__Group__0 : rule__SublayerSegment__Group__0__Impl rule__SublayerSegment__Group__1 ;
    public final void rule__SublayerSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3519:1: ( rule__SublayerSegment__Group__0__Impl rule__SublayerSegment__Group__1 )
            // InternalDsl.g:3520:2: rule__SublayerSegment__Group__0__Impl rule__SublayerSegment__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalDsl.g:3527:1: rule__SublayerSegment__Group__0__Impl : ( 'sublayerSegment' ) ;
    public final void rule__SublayerSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3531:1: ( ( 'sublayerSegment' ) )
            // InternalDsl.g:3532:1: ( 'sublayerSegment' )
            {
            // InternalDsl.g:3532:1: ( 'sublayerSegment' )
            // InternalDsl.g:3533:2: 'sublayerSegment'
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
    // InternalDsl.g:3542:1: rule__SublayerSegment__Group__1 : rule__SublayerSegment__Group__1__Impl ;
    public final void rule__SublayerSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3546:1: ( rule__SublayerSegment__Group__1__Impl )
            // InternalDsl.g:3547:2: rule__SublayerSegment__Group__1__Impl
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
    // InternalDsl.g:3553:1: rule__SublayerSegment__Group__1__Impl : ( ( rule__SublayerSegment__NameAssignment_1 ) ) ;
    public final void rule__SublayerSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3557:1: ( ( ( rule__SublayerSegment__NameAssignment_1 ) ) )
            // InternalDsl.g:3558:1: ( ( rule__SublayerSegment__NameAssignment_1 ) )
            {
            // InternalDsl.g:3558:1: ( ( rule__SublayerSegment__NameAssignment_1 ) )
            // InternalDsl.g:3559:2: ( rule__SublayerSegment__NameAssignment_1 )
            {
             before(grammarAccess.getSublayerSegmentAccess().getNameAssignment_1()); 
            // InternalDsl.g:3560:2: ( rule__SublayerSegment__NameAssignment_1 )
            // InternalDsl.g:3560:3: rule__SublayerSegment__NameAssignment_1
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
    // InternalDsl.g:3569:1: rule__RelationArch__Group__0 : rule__RelationArch__Group__0__Impl rule__RelationArch__Group__1 ;
    public final void rule__RelationArch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3573:1: ( rule__RelationArch__Group__0__Impl rule__RelationArch__Group__1 )
            // InternalDsl.g:3574:2: rule__RelationArch__Group__0__Impl rule__RelationArch__Group__1
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
    // InternalDsl.g:3581:1: rule__RelationArch__Group__0__Impl : ( 'relationArch' ) ;
    public final void rule__RelationArch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3585:1: ( ( 'relationArch' ) )
            // InternalDsl.g:3586:1: ( 'relationArch' )
            {
            // InternalDsl.g:3586:1: ( 'relationArch' )
            // InternalDsl.g:3587:2: 'relationArch'
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
    // InternalDsl.g:3596:1: rule__RelationArch__Group__1 : rule__RelationArch__Group__1__Impl rule__RelationArch__Group__2 ;
    public final void rule__RelationArch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3600:1: ( rule__RelationArch__Group__1__Impl rule__RelationArch__Group__2 )
            // InternalDsl.g:3601:2: rule__RelationArch__Group__1__Impl rule__RelationArch__Group__2
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
    // InternalDsl.g:3608:1: rule__RelationArch__Group__1__Impl : ( ( rule__RelationArch__NameAssignment_1 ) ) ;
    public final void rule__RelationArch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3612:1: ( ( ( rule__RelationArch__NameAssignment_1 ) ) )
            // InternalDsl.g:3613:1: ( ( rule__RelationArch__NameAssignment_1 ) )
            {
            // InternalDsl.g:3613:1: ( ( rule__RelationArch__NameAssignment_1 ) )
            // InternalDsl.g:3614:2: ( rule__RelationArch__NameAssignment_1 )
            {
             before(grammarAccess.getRelationArchAccess().getNameAssignment_1()); 
            // InternalDsl.g:3615:2: ( rule__RelationArch__NameAssignment_1 )
            // InternalDsl.g:3615:3: rule__RelationArch__NameAssignment_1
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
    // InternalDsl.g:3623:1: rule__RelationArch__Group__2 : rule__RelationArch__Group__2__Impl rule__RelationArch__Group__3 ;
    public final void rule__RelationArch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3627:1: ( rule__RelationArch__Group__2__Impl rule__RelationArch__Group__3 )
            // InternalDsl.g:3628:2: rule__RelationArch__Group__2__Impl rule__RelationArch__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3635:1: rule__RelationArch__Group__2__Impl : ( '{' ) ;
    public final void rule__RelationArch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3639:1: ( ( '{' ) )
            // InternalDsl.g:3640:1: ( '{' )
            {
            // InternalDsl.g:3640:1: ( '{' )
            // InternalDsl.g:3641:2: '{'
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
    // InternalDsl.g:3650:1: rule__RelationArch__Group__3 : rule__RelationArch__Group__3__Impl rule__RelationArch__Group__4 ;
    public final void rule__RelationArch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3654:1: ( rule__RelationArch__Group__3__Impl rule__RelationArch__Group__4 )
            // InternalDsl.g:3655:2: rule__RelationArch__Group__3__Impl rule__RelationArch__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalDsl.g:3662:1: rule__RelationArch__Group__3__Impl : ( 'source:' ) ;
    public final void rule__RelationArch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3666:1: ( ( 'source:' ) )
            // InternalDsl.g:3667:1: ( 'source:' )
            {
            // InternalDsl.g:3667:1: ( 'source:' )
            // InternalDsl.g:3668:2: 'source:'
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
    // InternalDsl.g:3677:1: rule__RelationArch__Group__4 : rule__RelationArch__Group__4__Impl rule__RelationArch__Group__5 ;
    public final void rule__RelationArch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3681:1: ( rule__RelationArch__Group__4__Impl rule__RelationArch__Group__5 )
            // InternalDsl.g:3682:2: rule__RelationArch__Group__4__Impl rule__RelationArch__Group__5
            {
            pushFollow(FOLLOW_46);
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
    // InternalDsl.g:3689:1: rule__RelationArch__Group__4__Impl : ( ruleLayerName ) ;
    public final void rule__RelationArch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3693:1: ( ( ruleLayerName ) )
            // InternalDsl.g:3694:1: ( ruleLayerName )
            {
            // InternalDsl.g:3694:1: ( ruleLayerName )
            // InternalDsl.g:3695:2: ruleLayerName
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
    // InternalDsl.g:3704:1: rule__RelationArch__Group__5 : rule__RelationArch__Group__5__Impl rule__RelationArch__Group__6 ;
    public final void rule__RelationArch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3708:1: ( rule__RelationArch__Group__5__Impl rule__RelationArch__Group__6 )
            // InternalDsl.g:3709:2: rule__RelationArch__Group__5__Impl rule__RelationArch__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:3716:1: rule__RelationArch__Group__5__Impl : ( ',' ) ;
    public final void rule__RelationArch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3720:1: ( ( ',' ) )
            // InternalDsl.g:3721:1: ( ',' )
            {
            // InternalDsl.g:3721:1: ( ',' )
            // InternalDsl.g:3722:2: ','
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
    // InternalDsl.g:3731:1: rule__RelationArch__Group__6 : rule__RelationArch__Group__6__Impl rule__RelationArch__Group__7 ;
    public final void rule__RelationArch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3735:1: ( rule__RelationArch__Group__6__Impl rule__RelationArch__Group__7 )
            // InternalDsl.g:3736:2: rule__RelationArch__Group__6__Impl rule__RelationArch__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalDsl.g:3743:1: rule__RelationArch__Group__6__Impl : ( 'target:' ) ;
    public final void rule__RelationArch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3747:1: ( ( 'target:' ) )
            // InternalDsl.g:3748:1: ( 'target:' )
            {
            // InternalDsl.g:3748:1: ( 'target:' )
            // InternalDsl.g:3749:2: 'target:'
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
    // InternalDsl.g:3758:1: rule__RelationArch__Group__7 : rule__RelationArch__Group__7__Impl rule__RelationArch__Group__8 ;
    public final void rule__RelationArch__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3762:1: ( rule__RelationArch__Group__7__Impl rule__RelationArch__Group__8 )
            // InternalDsl.g:3763:2: rule__RelationArch__Group__7__Impl rule__RelationArch__Group__8
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
    // InternalDsl.g:3770:1: rule__RelationArch__Group__7__Impl : ( ruleLayerName ) ;
    public final void rule__RelationArch__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3774:1: ( ( ruleLayerName ) )
            // InternalDsl.g:3775:1: ( ruleLayerName )
            {
            // InternalDsl.g:3775:1: ( ruleLayerName )
            // InternalDsl.g:3776:2: ruleLayerName
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
    // InternalDsl.g:3785:1: rule__RelationArch__Group__8 : rule__RelationArch__Group__8__Impl ;
    public final void rule__RelationArch__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3789:1: ( rule__RelationArch__Group__8__Impl )
            // InternalDsl.g:3790:2: rule__RelationArch__Group__8__Impl
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
    // InternalDsl.g:3796:1: rule__RelationArch__Group__8__Impl : ( '}' ) ;
    public final void rule__RelationArch__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3800:1: ( ( '}' ) )
            // InternalDsl.g:3801:1: ( '}' )
            {
            // InternalDsl.g:3801:1: ( '}' )
            // InternalDsl.g:3802:2: '}'
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
    // InternalDsl.g:3812:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3816:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalDsl.g:3817:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
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
    // InternalDsl.g:3824:1: rule__Technology__Group__0__Impl : ( 'tech' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3828:1: ( ( 'tech' ) )
            // InternalDsl.g:3829:1: ( 'tech' )
            {
            // InternalDsl.g:3829:1: ( 'tech' )
            // InternalDsl.g:3830:2: 'tech'
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
    // InternalDsl.g:3839:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3843:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalDsl.g:3844:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalDsl.g:3851:1: rule__Technology__Group__1__Impl : ( '{' ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3855:1: ( ( '{' ) )
            // InternalDsl.g:3856:1: ( '{' )
            {
            // InternalDsl.g:3856:1: ( '{' )
            // InternalDsl.g:3857:2: '{'
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
    // InternalDsl.g:3866:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3870:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalDsl.g:3871:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalDsl.g:3878:1: rule__Technology__Group__2__Impl : ( ( rule__Technology__JavaAssignment_2 ) ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3882:1: ( ( ( rule__Technology__JavaAssignment_2 ) ) )
            // InternalDsl.g:3883:1: ( ( rule__Technology__JavaAssignment_2 ) )
            {
            // InternalDsl.g:3883:1: ( ( rule__Technology__JavaAssignment_2 ) )
            // InternalDsl.g:3884:2: ( rule__Technology__JavaAssignment_2 )
            {
             before(grammarAccess.getTechnologyAccess().getJavaAssignment_2()); 
            // InternalDsl.g:3885:2: ( rule__Technology__JavaAssignment_2 )
            // InternalDsl.g:3885:3: rule__Technology__JavaAssignment_2
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
    // InternalDsl.g:3893:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl rule__Technology__Group__4 ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3897:1: ( rule__Technology__Group__3__Impl rule__Technology__Group__4 )
            // InternalDsl.g:3898:2: rule__Technology__Group__3__Impl rule__Technology__Group__4
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
    // InternalDsl.g:3905:1: rule__Technology__Group__3__Impl : ( ( rule__Technology__ReactAssignment_3 ) ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3909:1: ( ( ( rule__Technology__ReactAssignment_3 ) ) )
            // InternalDsl.g:3910:1: ( ( rule__Technology__ReactAssignment_3 ) )
            {
            // InternalDsl.g:3910:1: ( ( rule__Technology__ReactAssignment_3 ) )
            // InternalDsl.g:3911:2: ( rule__Technology__ReactAssignment_3 )
            {
             before(grammarAccess.getTechnologyAccess().getReactAssignment_3()); 
            // InternalDsl.g:3912:2: ( rule__Technology__ReactAssignment_3 )
            // InternalDsl.g:3912:3: rule__Technology__ReactAssignment_3
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
    // InternalDsl.g:3920:1: rule__Technology__Group__4 : rule__Technology__Group__4__Impl ;
    public final void rule__Technology__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3924:1: ( rule__Technology__Group__4__Impl )
            // InternalDsl.g:3925:2: rule__Technology__Group__4__Impl
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
    // InternalDsl.g:3931:1: rule__Technology__Group__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3935:1: ( ( '}' ) )
            // InternalDsl.g:3936:1: ( '}' )
            {
            // InternalDsl.g:3936:1: ( '}' )
            // InternalDsl.g:3937:2: '}'
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
    // InternalDsl.g:3947:1: rule__JavaApp__Group__0 : rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1 ;
    public final void rule__JavaApp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3951:1: ( rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1 )
            // InternalDsl.g:3952:2: rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1
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
    // InternalDsl.g:3959:1: rule__JavaApp__Group__0__Impl : ( 'javaApp' ) ;
    public final void rule__JavaApp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3963:1: ( ( 'javaApp' ) )
            // InternalDsl.g:3964:1: ( 'javaApp' )
            {
            // InternalDsl.g:3964:1: ( 'javaApp' )
            // InternalDsl.g:3965:2: 'javaApp'
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
    // InternalDsl.g:3974:1: rule__JavaApp__Group__1 : rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2 ;
    public final void rule__JavaApp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3978:1: ( rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2 )
            // InternalDsl.g:3979:2: rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2
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
    // InternalDsl.g:3986:1: rule__JavaApp__Group__1__Impl : ( '{' ) ;
    public final void rule__JavaApp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3990:1: ( ( '{' ) )
            // InternalDsl.g:3991:1: ( '{' )
            {
            // InternalDsl.g:3991:1: ( '{' )
            // InternalDsl.g:3992:2: '{'
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
    // InternalDsl.g:4001:1: rule__JavaApp__Group__2 : rule__JavaApp__Group__2__Impl ;
    public final void rule__JavaApp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4005:1: ( rule__JavaApp__Group__2__Impl )
            // InternalDsl.g:4006:2: rule__JavaApp__Group__2__Impl
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
    // InternalDsl.g:4012:1: rule__JavaApp__Group__2__Impl : ( '}' ) ;
    public final void rule__JavaApp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4016:1: ( ( '}' ) )
            // InternalDsl.g:4017:1: ( '}' )
            {
            // InternalDsl.g:4017:1: ( '}' )
            // InternalDsl.g:4018:2: '}'
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
    // InternalDsl.g:4028:1: rule__ReactApp__Group__0 : rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1 ;
    public final void rule__ReactApp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4032:1: ( rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1 )
            // InternalDsl.g:4033:2: rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1
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
    // InternalDsl.g:4040:1: rule__ReactApp__Group__0__Impl : ( 'reactApp' ) ;
    public final void rule__ReactApp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4044:1: ( ( 'reactApp' ) )
            // InternalDsl.g:4045:1: ( 'reactApp' )
            {
            // InternalDsl.g:4045:1: ( 'reactApp' )
            // InternalDsl.g:4046:2: 'reactApp'
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
    // InternalDsl.g:4055:1: rule__ReactApp__Group__1 : rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2 ;
    public final void rule__ReactApp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4059:1: ( rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2 )
            // InternalDsl.g:4060:2: rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2
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
    // InternalDsl.g:4067:1: rule__ReactApp__Group__1__Impl : ( '{' ) ;
    public final void rule__ReactApp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4071:1: ( ( '{' ) )
            // InternalDsl.g:4072:1: ( '{' )
            {
            // InternalDsl.g:4072:1: ( '{' )
            // InternalDsl.g:4073:2: '{'
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
    // InternalDsl.g:4082:1: rule__ReactApp__Group__2 : rule__ReactApp__Group__2__Impl ;
    public final void rule__ReactApp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4086:1: ( rule__ReactApp__Group__2__Impl )
            // InternalDsl.g:4087:2: rule__ReactApp__Group__2__Impl
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
    // InternalDsl.g:4093:1: rule__ReactApp__Group__2__Impl : ( '}' ) ;
    public final void rule__ReactApp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4097:1: ( ( '}' ) )
            // InternalDsl.g:4098:1: ( '}' )
            {
            // InternalDsl.g:4098:1: ( '}' )
            // InternalDsl.g:4099:2: '}'
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
    // InternalDsl.g:4109:1: rule__System__DomAssignment_2 : ( ruleDomain ) ;
    public final void rule__System__DomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4113:1: ( ( ruleDomain ) )
            // InternalDsl.g:4114:2: ( ruleDomain )
            {
            // InternalDsl.g:4114:2: ( ruleDomain )
            // InternalDsl.g:4115:3: ruleDomain
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
    // InternalDsl.g:4124:1: rule__System__ArchAssignment_3 : ( ruleArchitecture ) ;
    public final void rule__System__ArchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4128:1: ( ( ruleArchitecture ) )
            // InternalDsl.g:4129:2: ( ruleArchitecture )
            {
            // InternalDsl.g:4129:2: ( ruleArchitecture )
            // InternalDsl.g:4130:3: ruleArchitecture
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
    // InternalDsl.g:4139:1: rule__System__TechAssignment_4 : ( ruleTechnology ) ;
    public final void rule__System__TechAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4143:1: ( ( ruleTechnology ) )
            // InternalDsl.g:4144:2: ( ruleTechnology )
            {
            // InternalDsl.g:4144:2: ( ruleTechnology )
            // InternalDsl.g:4145:3: ruleTechnology
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


    // $ANTLR start "rule__Domain__ElementsAssignment_2"
    // InternalDsl.g:4154:1: rule__Domain__ElementsAssignment_2 : ( ruleAbstractElement ) ;
    public final void rule__Domain__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4158:1: ( ( ruleAbstractElement ) )
            // InternalDsl.g:4159:2: ( ruleAbstractElement )
            {
            // InternalDsl.g:4159:2: ( ruleAbstractElement )
            // InternalDsl.g:4160:3: ruleAbstractElement
            {
             before(grammarAccess.getDomainAccess().getElementsAbstractElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsAbstractElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ElementsAssignment_2"


    // $ANTLR start "rule__Domain__ModulesAssignment_3"
    // InternalDsl.g:4169:1: rule__Domain__ModulesAssignment_3 : ( ruleModule ) ;
    public final void rule__Domain__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4173:1: ( ( ruleModule ) )
            // InternalDsl.g:4174:2: ( ruleModule )
            {
            // InternalDsl.g:4174:2: ( ruleModule )
            // InternalDsl.g:4175:3: ruleModule
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
    // InternalDsl.g:4184:1: rule__Domain__RelationsAssignment_4 : ( ruleRelationDom ) ;
    public final void rule__Domain__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4188:1: ( ( ruleRelationDom ) )
            // InternalDsl.g:4189:2: ( ruleRelationDom )
            {
            // InternalDsl.g:4189:2: ( ruleRelationDom )
            // InternalDsl.g:4190:3: ruleRelationDom
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
    // InternalDsl.g:4199:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4203:1: ( ( RULE_ID ) )
            // InternalDsl.g:4204:2: ( RULE_ID )
            {
            // InternalDsl.g:4204:2: ( RULE_ID )
            // InternalDsl.g:4205:3: RULE_ID
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
    // InternalDsl.g:4214:1: rule__Module__SubmodulesAssignment_3 : ( ruleSubmodule ) ;
    public final void rule__Module__SubmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4218:1: ( ( ruleSubmodule ) )
            // InternalDsl.g:4219:2: ( ruleSubmodule )
            {
            // InternalDsl.g:4219:2: ( ruleSubmodule )
            // InternalDsl.g:4220:3: ruleSubmodule
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
    // InternalDsl.g:4229:1: rule__Submodule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Submodule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4233:1: ( ( RULE_ID ) )
            // InternalDsl.g:4234:2: ( RULE_ID )
            {
            // InternalDsl.g:4234:2: ( RULE_ID )
            // InternalDsl.g:4235:3: RULE_ID
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
    // InternalDsl.g:4244:1: rule__Submodule__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Submodule__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4248:1: ( ( ruleOperation ) )
            // InternalDsl.g:4249:2: ( ruleOperation )
            {
            // InternalDsl.g:4249:2: ( ruleOperation )
            // InternalDsl.g:4250:3: ruleOperation
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
    // InternalDsl.g:4259:1: rule__Submodule__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Submodule__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4263:1: ( ( ruleEntity ) )
            // InternalDsl.g:4264:2: ( ruleEntity )
            {
            // InternalDsl.g:4264:2: ( ruleEntity )
            // InternalDsl.g:4265:3: ruleEntity
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSubmoduleAccess().getEntitiesEntityParserRuleCall_4_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__TypeAssignment"
    // InternalDsl.g:4274:1: rule__Entity__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Entity__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4278:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4279:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4279:2: ( ( RULE_ID ) )
            // InternalDsl.g:4280:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getTypeQualifiedNameCrossReference_0()); 
            // InternalDsl.g:4281:3: ( RULE_ID )
            // InternalDsl.g:4282:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getTypeQualifiedNameIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getTypeQualifiedNameIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getTypeQualifiedNameCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__TypeAssignment"


    // $ANTLR start "rule__QualifiedName__NameAssignment"
    // InternalDsl.g:4293:1: rule__QualifiedName__NameAssignment : ( RULE_ID ) ;
    public final void rule__QualifiedName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4297:1: ( ( RULE_ID ) )
            // InternalDsl.g:4298:2: ( RULE_ID )
            {
            // InternalDsl.g:4298:2: ( RULE_ID )
            // InternalDsl.g:4299:3: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__NameAssignment"


    // $ANTLR start "rule__Operation__TargetAssignment_5"
    // InternalDsl.g:4308:1: rule__Operation__TargetAssignment_5 : ( ruleEntity ) ;
    public final void rule__Operation__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4312:1: ( ( ruleEntity ) )
            // InternalDsl.g:4313:2: ( ruleEntity )
            {
            // InternalDsl.g:4313:2: ( ruleEntity )
            // InternalDsl.g:4314:3: ruleEntity
            {
             before(grammarAccess.getOperationAccess().getTargetEntityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getTargetEntityParserRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__GeneralEntity__PropertiesAssignment_3"
    // InternalDsl.g:4323:1: rule__GeneralEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__GeneralEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4327:1: ( ( ruleProperty ) )
            // InternalDsl.g:4328:2: ( ruleProperty )
            {
            // InternalDsl.g:4328:2: ( ruleProperty )
            // InternalDsl.g:4329:3: ruleProperty
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
    // InternalDsl.g:4338:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4342:1: ( ( RULE_ID ) )
            // InternalDsl.g:4343:2: ( RULE_ID )
            {
            // InternalDsl.g:4343:2: ( RULE_ID )
            // InternalDsl.g:4344:3: RULE_ID
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
    // InternalDsl.g:4353:1: rule__Property__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4357:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4358:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4358:2: ( ( RULE_ID ) )
            // InternalDsl.g:4359:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 
            // InternalDsl.g:4360:3: ( RULE_ID )
            // InternalDsl.g:4361:4: RULE_ID
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
    // InternalDsl.g:4372:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4376:1: ( ( RULE_ID ) )
            // InternalDsl.g:4377:2: ( RULE_ID )
            {
            // InternalDsl.g:4377:2: ( RULE_ID )
            // InternalDsl.g:4378:3: RULE_ID
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
    // InternalDsl.g:4387:1: rule__SpecialEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__SpecialEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4391:1: ( ( ruleProperty ) )
            // InternalDsl.g:4392:2: ( ruleProperty )
            {
            // InternalDsl.g:4392:2: ( ruleProperty )
            // InternalDsl.g:4393:3: ruleProperty
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
    // InternalDsl.g:4402:1: rule__SpecialEntity__TransactionsAssignment_4 : ( ruleTransaction ) ;
    public final void rule__SpecialEntity__TransactionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4406:1: ( ( ruleTransaction ) )
            // InternalDsl.g:4407:2: ( ruleTransaction )
            {
            // InternalDsl.g:4407:2: ( ruleTransaction )
            // InternalDsl.g:4408:3: ruleTransaction
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
    // InternalDsl.g:4417:1: rule__Transaction__OperatesonAssignment_4 : ( ruleOperateson ) ;
    public final void rule__Transaction__OperatesonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4421:1: ( ( ruleOperateson ) )
            // InternalDsl.g:4422:2: ( ruleOperateson )
            {
            // InternalDsl.g:4422:2: ( ruleOperateson )
            // InternalDsl.g:4423:3: ruleOperateson
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


    // $ANTLR start "rule__Operateson__TypeAssignment_1"
    // InternalDsl.g:4432:1: rule__Operateson__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Operateson__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4436:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4437:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4437:2: ( ( RULE_ID ) )
            // InternalDsl.g:4438:3: ( RULE_ID )
            {
             before(grammarAccess.getOperatesonAccess().getTypeGeneralEntityCrossReference_1_0()); 
            // InternalDsl.g:4439:3: ( RULE_ID )
            // InternalDsl.g:4440:4: RULE_ID
            {
             before(grammarAccess.getOperatesonAccess().getTypeGeneralEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperatesonAccess().getTypeGeneralEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOperatesonAccess().getTypeGeneralEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateson__TypeAssignment_1"


    // $ANTLR start "rule__RelationDom__TypeAssignment_5"
    // InternalDsl.g:4451:1: rule__RelationDom__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDom__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4455:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4456:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4456:2: ( ( RULE_ID ) )
            // InternalDsl.g:4457:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationDomAccess().getTypeGeneralEntityCrossReference_5_0()); 
            // InternalDsl.g:4458:3: ( RULE_ID )
            // InternalDsl.g:4459:4: RULE_ID
            {
             before(grammarAccess.getRelationDomAccess().getTypeGeneralEntityIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getTypeGeneralEntityIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRelationDomAccess().getTypeGeneralEntityCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__TypeAssignment_5"


    // $ANTLR start "rule__RelationDom__TargetAssignment_7"
    // InternalDsl.g:4470:1: rule__RelationDom__TargetAssignment_7 : ( ruleEntity ) ;
    public final void rule__RelationDom__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4474:1: ( ( ruleEntity ) )
            // InternalDsl.g:4475:2: ( ruleEntity )
            {
            // InternalDsl.g:4475:2: ( ruleEntity )
            // InternalDsl.g:4476:3: ruleEntity
            {
             before(grammarAccess.getRelationDomAccess().getTargetEntityParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getRelationDomAccess().getTargetEntityParserRuleCall_7_0()); 

            }


            }

        }
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
    // InternalDsl.g:4485:1: rule__Architecture__ComponentesAssignment_2 : ( ruleComponent ) ;
    public final void rule__Architecture__ComponentesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4489:1: ( ( ruleComponent ) )
            // InternalDsl.g:4490:2: ( ruleComponent )
            {
            // InternalDsl.g:4490:2: ( ruleComponent )
            // InternalDsl.g:4491:3: ruleComponent
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
    // InternalDsl.g:4500:1: rule__Architecture__RelationArchAssignment_3 : ( ruleRelationArch ) ;
    public final void rule__Architecture__RelationArchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4504:1: ( ( ruleRelationArch ) )
            // InternalDsl.g:4505:2: ( ruleRelationArch )
            {
            // InternalDsl.g:4505:2: ( ruleRelationArch )
            // InternalDsl.g:4506:3: ruleRelationArch
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
    // InternalDsl.g:4515:1: rule__Component__LayerAssignment_3 : ( ruleLayer ) ;
    public final void rule__Component__LayerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4519:1: ( ( ruleLayer ) )
            // InternalDsl.g:4520:2: ( ruleLayer )
            {
            // InternalDsl.g:4520:2: ( ruleLayer )
            // InternalDsl.g:4521:3: ruleLayer
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
    // InternalDsl.g:4530:1: rule__Layer__NameAssignment_1 : ( ruleLayerName ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4534:1: ( ( ruleLayerName ) )
            // InternalDsl.g:4535:2: ( ruleLayerName )
            {
            // InternalDsl.g:4535:2: ( ruleLayerName )
            // InternalDsl.g:4536:3: ruleLayerName
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
    // InternalDsl.g:4545:1: rule__Layer__LayerSegmentsAssignment_3 : ( ruleLayerSegment ) ;
    public final void rule__Layer__LayerSegmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4549:1: ( ( ruleLayerSegment ) )
            // InternalDsl.g:4550:2: ( ruleLayerSegment )
            {
            // InternalDsl.g:4550:2: ( ruleLayerSegment )
            // InternalDsl.g:4551:3: ruleLayerSegment
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
    // InternalDsl.g:4560:1: rule__LayerSegment__NameAssignment_1 : ( ruleLayerSegmentName ) ;
    public final void rule__LayerSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4564:1: ( ( ruleLayerSegmentName ) )
            // InternalDsl.g:4565:2: ( ruleLayerSegmentName )
            {
            // InternalDsl.g:4565:2: ( ruleLayerSegmentName )
            // InternalDsl.g:4566:3: ruleLayerSegmentName
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
    // InternalDsl.g:4575:1: rule__LayerSegment__RelationsAssignment_3_1 : ( ruleLayerSegmentRelation ) ;
    public final void rule__LayerSegment__RelationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4579:1: ( ( ruleLayerSegmentRelation ) )
            // InternalDsl.g:4580:2: ( ruleLayerSegmentRelation )
            {
            // InternalDsl.g:4580:2: ( ruleLayerSegmentRelation )
            // InternalDsl.g:4581:3: ruleLayerSegmentRelation
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
    // InternalDsl.g:4590:1: rule__LayerSegment__SublayerSegmentsAssignment_4 : ( ruleSublayerSegment ) ;
    public final void rule__LayerSegment__SublayerSegmentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4594:1: ( ( ruleSublayerSegment ) )
            // InternalDsl.g:4595:2: ( ruleSublayerSegment )
            {
            // InternalDsl.g:4595:2: ( ruleSublayerSegment )
            // InternalDsl.g:4596:3: ruleSublayerSegment
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
    // InternalDsl.g:4605:1: rule__SublayerSegment__NameAssignment_1 : ( ruleSublayerSegmentName ) ;
    public final void rule__SublayerSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4609:1: ( ( ruleSublayerSegmentName ) )
            // InternalDsl.g:4610:2: ( ruleSublayerSegmentName )
            {
            // InternalDsl.g:4610:2: ( ruleSublayerSegmentName )
            // InternalDsl.g:4611:3: ruleSublayerSegmentName
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
    // InternalDsl.g:4620:1: rule__RelationArch__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RelationArch__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4624:1: ( ( RULE_ID ) )
            // InternalDsl.g:4625:2: ( RULE_ID )
            {
            // InternalDsl.g:4625:2: ( RULE_ID )
            // InternalDsl.g:4626:3: RULE_ID
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
    // InternalDsl.g:4635:1: rule__Technology__JavaAssignment_2 : ( ruleJavaApp ) ;
    public final void rule__Technology__JavaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4639:1: ( ( ruleJavaApp ) )
            // InternalDsl.g:4640:2: ( ruleJavaApp )
            {
            // InternalDsl.g:4640:2: ( ruleJavaApp )
            // InternalDsl.g:4641:3: ruleJavaApp
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
    // InternalDsl.g:4650:1: rule__Technology__ReactAssignment_3 : ( ruleReactApp ) ;
    public final void rule__Technology__ReactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4654:1: ( ( ruleReactApp ) )
            // InternalDsl.g:4655:2: ( ruleReactApp )
            {
            // InternalDsl.g:4655:2: ( ruleReactApp )
            // InternalDsl.g:4656:3: ruleReactApp
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000D0800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000D0000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000D0800000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000001FF00000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000300000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000200000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000000L});

}