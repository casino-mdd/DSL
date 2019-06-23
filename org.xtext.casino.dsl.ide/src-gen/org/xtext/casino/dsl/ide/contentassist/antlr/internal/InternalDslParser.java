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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Read'", "'Create'", "'exchange'", "'sale'", "'Casino'", "'{'", "'}'", "'domain'", "'module'", "'submodule'", "'op'", "'type:'", "'operates_on:'", "'generalEntity'", "':'", "'dataType'", "'specialEntity'", "'trx'", "'rel'", "'Composition'", "'source:'", "'target:'", "'arch'", "'tech'", "'javaApp'", "'reactApp'"
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


    // $ANTLR start "entryRuleTechnology"
    // InternalDsl.g:503:1: entryRuleTechnology : ruleTechnology EOF ;
    public final void entryRuleTechnology() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleTechnology EOF )
            // InternalDsl.g:505:1: ruleTechnology EOF
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
    // InternalDsl.g:512:1: ruleTechnology : ( ( rule__Technology__Group__0 ) ) ;
    public final void ruleTechnology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__Technology__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__Technology__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__Technology__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__Technology__Group__0 )
            {
             before(grammarAccess.getTechnologyAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__Technology__Group__0 )
            // InternalDsl.g:519:4: rule__Technology__Group__0
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
    // InternalDsl.g:528:1: entryRuleJavaApp : ruleJavaApp EOF ;
    public final void entryRuleJavaApp() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleJavaApp EOF )
            // InternalDsl.g:530:1: ruleJavaApp EOF
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
    // InternalDsl.g:537:1: ruleJavaApp : ( ( rule__JavaApp__Group__0 ) ) ;
    public final void ruleJavaApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__JavaApp__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__JavaApp__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__JavaApp__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__JavaApp__Group__0 )
            {
             before(grammarAccess.getJavaAppAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__JavaApp__Group__0 )
            // InternalDsl.g:544:4: rule__JavaApp__Group__0
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
    // InternalDsl.g:553:1: entryRuleReactApp : ruleReactApp EOF ;
    public final void entryRuleReactApp() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleReactApp EOF )
            // InternalDsl.g:555:1: ruleReactApp EOF
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
    // InternalDsl.g:562:1: ruleReactApp : ( ( rule__ReactApp__Group__0 ) ) ;
    public final void ruleReactApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__ReactApp__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__ReactApp__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__ReactApp__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__ReactApp__Group__0 )
            {
             before(grammarAccess.getReactAppAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__ReactApp__Group__0 )
            // InternalDsl.g:569:4: rule__ReactApp__Group__0
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
    // InternalDsl.g:577:1: rule__AbstractElement__Alternatives : ( ( ruleSpecialEntity ) | ( ruleGeneralEntity ) | ( ruleType ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:581:1: ( ( ruleSpecialEntity ) | ( ruleGeneralEntity ) | ( ruleType ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 26:
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
                    // InternalDsl.g:582:2: ( ruleSpecialEntity )
                    {
                    // InternalDsl.g:582:2: ( ruleSpecialEntity )
                    // InternalDsl.g:583:3: ruleSpecialEntity
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
                    // InternalDsl.g:588:2: ( ruleGeneralEntity )
                    {
                    // InternalDsl.g:588:2: ( ruleGeneralEntity )
                    // InternalDsl.g:589:3: ruleGeneralEntity
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
                    // InternalDsl.g:594:2: ( ruleType )
                    {
                    // InternalDsl.g:594:2: ( ruleType )
                    // InternalDsl.g:595:3: ruleType
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
    // InternalDsl.g:604:1: rule__SubOperation__Alternatives : ( ( 'Read' ) | ( 'Create' ) );
    public final void rule__SubOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:608:1: ( ( 'Read' ) | ( 'Create' ) )
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
                    // InternalDsl.g:609:2: ( 'Read' )
                    {
                    // InternalDsl.g:609:2: ( 'Read' )
                    // InternalDsl.g:610:3: 'Read'
                    {
                     before(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:615:2: ( 'Create' )
                    {
                    // InternalDsl.g:615:2: ( 'Create' )
                    // InternalDsl.g:616:3: 'Create'
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
    // InternalDsl.g:625:1: rule__SubTransaction__Alternatives : ( ( 'exchange' ) | ( 'sale' ) );
    public final void rule__SubTransaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:629:1: ( ( 'exchange' ) | ( 'sale' ) )
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
                    // InternalDsl.g:630:2: ( 'exchange' )
                    {
                    // InternalDsl.g:630:2: ( 'exchange' )
                    // InternalDsl.g:631:3: 'exchange'
                    {
                     before(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:636:2: ( 'sale' )
                    {
                    // InternalDsl.g:636:2: ( 'sale' )
                    // InternalDsl.g:637:3: 'sale'
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


    // $ANTLR start "rule__System__Group__0"
    // InternalDsl.g:646:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:650:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalDsl.g:651:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalDsl.g:658:1: rule__System__Group__0__Impl : ( 'Casino' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:662:1: ( ( 'Casino' ) )
            // InternalDsl.g:663:1: ( 'Casino' )
            {
            // InternalDsl.g:663:1: ( 'Casino' )
            // InternalDsl.g:664:2: 'Casino'
            {
             before(grammarAccess.getSystemAccess().getCasinoKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDsl.g:673:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:677:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalDsl.g:678:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalDsl.g:685:1: rule__System__Group__1__Impl : ( '{' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:689:1: ( ( '{' ) )
            // InternalDsl.g:690:1: ( '{' )
            {
            // InternalDsl.g:690:1: ( '{' )
            // InternalDsl.g:691:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:700:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:704:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalDsl.g:705:2: rule__System__Group__2__Impl rule__System__Group__3
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
    // InternalDsl.g:712:1: rule__System__Group__2__Impl : ( ( rule__System__DomAssignment_2 ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:1: ( ( ( rule__System__DomAssignment_2 ) ) )
            // InternalDsl.g:717:1: ( ( rule__System__DomAssignment_2 ) )
            {
            // InternalDsl.g:717:1: ( ( rule__System__DomAssignment_2 ) )
            // InternalDsl.g:718:2: ( rule__System__DomAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getDomAssignment_2()); 
            // InternalDsl.g:719:2: ( rule__System__DomAssignment_2 )
            // InternalDsl.g:719:3: rule__System__DomAssignment_2
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
    // InternalDsl.g:727:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:731:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalDsl.g:732:2: rule__System__Group__3__Impl rule__System__Group__4
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
    // InternalDsl.g:739:1: rule__System__Group__3__Impl : ( ( rule__System__ArchAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:743:1: ( ( ( rule__System__ArchAssignment_3 ) ) )
            // InternalDsl.g:744:1: ( ( rule__System__ArchAssignment_3 ) )
            {
            // InternalDsl.g:744:1: ( ( rule__System__ArchAssignment_3 ) )
            // InternalDsl.g:745:2: ( rule__System__ArchAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getArchAssignment_3()); 
            // InternalDsl.g:746:2: ( rule__System__ArchAssignment_3 )
            // InternalDsl.g:746:3: rule__System__ArchAssignment_3
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
    // InternalDsl.g:754:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:758:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalDsl.g:759:2: rule__System__Group__4__Impl rule__System__Group__5
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
    // InternalDsl.g:766:1: rule__System__Group__4__Impl : ( ( rule__System__TechAssignment_4 ) ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:770:1: ( ( ( rule__System__TechAssignment_4 ) ) )
            // InternalDsl.g:771:1: ( ( rule__System__TechAssignment_4 ) )
            {
            // InternalDsl.g:771:1: ( ( rule__System__TechAssignment_4 ) )
            // InternalDsl.g:772:2: ( rule__System__TechAssignment_4 )
            {
             before(grammarAccess.getSystemAccess().getTechAssignment_4()); 
            // InternalDsl.g:773:2: ( rule__System__TechAssignment_4 )
            // InternalDsl.g:773:3: rule__System__TechAssignment_4
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
    // InternalDsl.g:781:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:785:1: ( rule__System__Group__5__Impl )
            // InternalDsl.g:786:2: rule__System__Group__5__Impl
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
    // InternalDsl.g:792:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:796:1: ( ( '}' ) )
            // InternalDsl.g:797:1: ( '}' )
            {
            // InternalDsl.g:797:1: ( '}' )
            // InternalDsl.g:798:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:808:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:812:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalDsl.g:813:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalDsl.g:820:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:824:1: ( ( 'domain' ) )
            // InternalDsl.g:825:1: ( 'domain' )
            {
            // InternalDsl.g:825:1: ( 'domain' )
            // InternalDsl.g:826:2: 'domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:835:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:839:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalDsl.g:840:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
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
    // InternalDsl.g:847:1: rule__Domain__Group__1__Impl : ( '{' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:851:1: ( ( '{' ) )
            // InternalDsl.g:852:1: ( '{' )
            {
            // InternalDsl.g:852:1: ( '{' )
            // InternalDsl.g:853:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:862:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:866:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalDsl.g:867:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
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
    // InternalDsl.g:874:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__ElementsAssignment_2 )* ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:878:1: ( ( ( rule__Domain__ElementsAssignment_2 )* ) )
            // InternalDsl.g:879:1: ( ( rule__Domain__ElementsAssignment_2 )* )
            {
            // InternalDsl.g:879:1: ( ( rule__Domain__ElementsAssignment_2 )* )
            // InternalDsl.g:880:2: ( rule__Domain__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_2()); 
            // InternalDsl.g:881:2: ( rule__Domain__ElementsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24||(LA4_0>=26 && LA4_0<=27)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:881:3: rule__Domain__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Domain__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalDsl.g:889:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:893:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalDsl.g:894:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
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
    // InternalDsl.g:901:1: rule__Domain__Group__3__Impl : ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:905:1: ( ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) ) )
            // InternalDsl.g:906:1: ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) )
            {
            // InternalDsl.g:906:1: ( ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* ) )
            // InternalDsl.g:907:2: ( ( rule__Domain__ModulesAssignment_3 ) ) ( ( rule__Domain__ModulesAssignment_3 )* )
            {
            // InternalDsl.g:907:2: ( ( rule__Domain__ModulesAssignment_3 ) )
            // InternalDsl.g:908:3: ( rule__Domain__ModulesAssignment_3 )
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_3()); 
            // InternalDsl.g:909:3: ( rule__Domain__ModulesAssignment_3 )
            // InternalDsl.g:909:4: rule__Domain__ModulesAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Domain__ModulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModulesAssignment_3()); 

            }

            // InternalDsl.g:912:2: ( ( rule__Domain__ModulesAssignment_3 )* )
            // InternalDsl.g:913:3: ( rule__Domain__ModulesAssignment_3 )*
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_3()); 
            // InternalDsl.g:914:3: ( rule__Domain__ModulesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:914:4: rule__Domain__ModulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Domain__ModulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalDsl.g:923:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:927:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalDsl.g:928:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
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
    // InternalDsl.g:935:1: rule__Domain__Group__4__Impl : ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:939:1: ( ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) ) )
            // InternalDsl.g:940:1: ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) )
            {
            // InternalDsl.g:940:1: ( ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* ) )
            // InternalDsl.g:941:2: ( ( rule__Domain__RelationsAssignment_4 ) ) ( ( rule__Domain__RelationsAssignment_4 )* )
            {
            // InternalDsl.g:941:2: ( ( rule__Domain__RelationsAssignment_4 ) )
            // InternalDsl.g:942:3: ( rule__Domain__RelationsAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 
            // InternalDsl.g:943:3: ( rule__Domain__RelationsAssignment_4 )
            // InternalDsl.g:943:4: rule__Domain__RelationsAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__Domain__RelationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 

            }

            // InternalDsl.g:946:2: ( ( rule__Domain__RelationsAssignment_4 )* )
            // InternalDsl.g:947:3: ( rule__Domain__RelationsAssignment_4 )*
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_4()); 
            // InternalDsl.g:948:3: ( rule__Domain__RelationsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:948:4: rule__Domain__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Domain__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalDsl.g:957:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:961:1: ( rule__Domain__Group__5__Impl )
            // InternalDsl.g:962:2: rule__Domain__Group__5__Impl
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
    // InternalDsl.g:968:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:972:1: ( ( '}' ) )
            // InternalDsl.g:973:1: ( '}' )
            {
            // InternalDsl.g:973:1: ( '}' )
            // InternalDsl.g:974:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:984:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:988:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalDsl.g:989:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalDsl.g:996:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1000:1: ( ( 'module' ) )
            // InternalDsl.g:1001:1: ( 'module' )
            {
            // InternalDsl.g:1001:1: ( 'module' )
            // InternalDsl.g:1002:2: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDsl.g:1011:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1015:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalDsl.g:1016:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalDsl.g:1023:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1027:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalDsl.g:1028:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalDsl.g:1028:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalDsl.g:1029:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalDsl.g:1030:2: ( rule__Module__NameAssignment_1 )
            // InternalDsl.g:1030:3: rule__Module__NameAssignment_1
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
    // InternalDsl.g:1038:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1042:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalDsl.g:1043:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalDsl.g:1050:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1054:1: ( ( '{' ) )
            // InternalDsl.g:1055:1: ( '{' )
            {
            // InternalDsl.g:1055:1: ( '{' )
            // InternalDsl.g:1056:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:1065:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1069:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalDsl.g:1070:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalDsl.g:1077:1: rule__Module__Group__3__Impl : ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1081:1: ( ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) )
            // InternalDsl.g:1082:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            {
            // InternalDsl.g:1082:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            // InternalDsl.g:1083:2: ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* )
            {
            // InternalDsl.g:1083:2: ( ( rule__Module__SubmodulesAssignment_3 ) )
            // InternalDsl.g:1084:3: ( rule__Module__SubmodulesAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:1085:3: ( rule__Module__SubmodulesAssignment_3 )
            // InternalDsl.g:1085:4: rule__Module__SubmodulesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__Module__SubmodulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 

            }

            // InternalDsl.g:1088:2: ( ( rule__Module__SubmodulesAssignment_3 )* )
            // InternalDsl.g:1089:3: ( rule__Module__SubmodulesAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:1090:3: ( rule__Module__SubmodulesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:1090:4: rule__Module__SubmodulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Module__SubmodulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalDsl.g:1099:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1103:1: ( rule__Module__Group__4__Impl )
            // InternalDsl.g:1104:2: rule__Module__Group__4__Impl
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
    // InternalDsl.g:1110:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1114:1: ( ( '}' ) )
            // InternalDsl.g:1115:1: ( '}' )
            {
            // InternalDsl.g:1115:1: ( '}' )
            // InternalDsl.g:1116:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1126:1: rule__Submodule__Group__0 : rule__Submodule__Group__0__Impl rule__Submodule__Group__1 ;
    public final void rule__Submodule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1130:1: ( rule__Submodule__Group__0__Impl rule__Submodule__Group__1 )
            // InternalDsl.g:1131:2: rule__Submodule__Group__0__Impl rule__Submodule__Group__1
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
    // InternalDsl.g:1138:1: rule__Submodule__Group__0__Impl : ( 'submodule' ) ;
    public final void rule__Submodule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1142:1: ( ( 'submodule' ) )
            // InternalDsl.g:1143:1: ( 'submodule' )
            {
            // InternalDsl.g:1143:1: ( 'submodule' )
            // InternalDsl.g:1144:2: 'submodule'
            {
             before(grammarAccess.getSubmoduleAccess().getSubmoduleKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDsl.g:1153:1: rule__Submodule__Group__1 : rule__Submodule__Group__1__Impl rule__Submodule__Group__2 ;
    public final void rule__Submodule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1157:1: ( rule__Submodule__Group__1__Impl rule__Submodule__Group__2 )
            // InternalDsl.g:1158:2: rule__Submodule__Group__1__Impl rule__Submodule__Group__2
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
    // InternalDsl.g:1165:1: rule__Submodule__Group__1__Impl : ( ( rule__Submodule__NameAssignment_1 ) ) ;
    public final void rule__Submodule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1169:1: ( ( ( rule__Submodule__NameAssignment_1 ) ) )
            // InternalDsl.g:1170:1: ( ( rule__Submodule__NameAssignment_1 ) )
            {
            // InternalDsl.g:1170:1: ( ( rule__Submodule__NameAssignment_1 ) )
            // InternalDsl.g:1171:2: ( rule__Submodule__NameAssignment_1 )
            {
             before(grammarAccess.getSubmoduleAccess().getNameAssignment_1()); 
            // InternalDsl.g:1172:2: ( rule__Submodule__NameAssignment_1 )
            // InternalDsl.g:1172:3: rule__Submodule__NameAssignment_1
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
    // InternalDsl.g:1180:1: rule__Submodule__Group__2 : rule__Submodule__Group__2__Impl rule__Submodule__Group__3 ;
    public final void rule__Submodule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1184:1: ( rule__Submodule__Group__2__Impl rule__Submodule__Group__3 )
            // InternalDsl.g:1185:2: rule__Submodule__Group__2__Impl rule__Submodule__Group__3
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
    // InternalDsl.g:1192:1: rule__Submodule__Group__2__Impl : ( '{' ) ;
    public final void rule__Submodule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1196:1: ( ( '{' ) )
            // InternalDsl.g:1197:1: ( '{' )
            {
            // InternalDsl.g:1197:1: ( '{' )
            // InternalDsl.g:1198:2: '{'
            {
             before(grammarAccess.getSubmoduleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:1207:1: rule__Submodule__Group__3 : rule__Submodule__Group__3__Impl rule__Submodule__Group__4 ;
    public final void rule__Submodule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1211:1: ( rule__Submodule__Group__3__Impl rule__Submodule__Group__4 )
            // InternalDsl.g:1212:2: rule__Submodule__Group__3__Impl rule__Submodule__Group__4
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
    // InternalDsl.g:1219:1: rule__Submodule__Group__3__Impl : ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) ;
    public final void rule__Submodule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1223:1: ( ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) )
            // InternalDsl.g:1224:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            {
            // InternalDsl.g:1224:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            // InternalDsl.g:1225:2: ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* )
            {
            // InternalDsl.g:1225:2: ( ( rule__Submodule__OperationsAssignment_3 ) )
            // InternalDsl.g:1226:3: ( rule__Submodule__OperationsAssignment_3 )
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:1227:3: ( rule__Submodule__OperationsAssignment_3 )
            // InternalDsl.g:1227:4: rule__Submodule__OperationsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Submodule__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 

            }

            // InternalDsl.g:1230:2: ( ( rule__Submodule__OperationsAssignment_3 )* )
            // InternalDsl.g:1231:3: ( rule__Submodule__OperationsAssignment_3 )*
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:1232:3: ( rule__Submodule__OperationsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1232:4: rule__Submodule__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Submodule__OperationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDsl.g:1241:1: rule__Submodule__Group__4 : rule__Submodule__Group__4__Impl rule__Submodule__Group__5 ;
    public final void rule__Submodule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1245:1: ( rule__Submodule__Group__4__Impl rule__Submodule__Group__5 )
            // InternalDsl.g:1246:2: rule__Submodule__Group__4__Impl rule__Submodule__Group__5
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
    // InternalDsl.g:1253:1: rule__Submodule__Group__4__Impl : ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) ;
    public final void rule__Submodule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1257:1: ( ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) )
            // InternalDsl.g:1258:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            {
            // InternalDsl.g:1258:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            // InternalDsl.g:1259:2: ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* )
            {
            // InternalDsl.g:1259:2: ( ( rule__Submodule__EntitiesAssignment_4 ) )
            // InternalDsl.g:1260:3: ( rule__Submodule__EntitiesAssignment_4 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:1261:3: ( rule__Submodule__EntitiesAssignment_4 )
            // InternalDsl.g:1261:4: rule__Submodule__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_18);
            rule__Submodule__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 

            }

            // InternalDsl.g:1264:2: ( ( rule__Submodule__EntitiesAssignment_4 )* )
            // InternalDsl.g:1265:3: ( rule__Submodule__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:1266:3: ( rule__Submodule__EntitiesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1266:4: rule__Submodule__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Submodule__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDsl.g:1275:1: rule__Submodule__Group__5 : rule__Submodule__Group__5__Impl ;
    public final void rule__Submodule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1279:1: ( rule__Submodule__Group__5__Impl )
            // InternalDsl.g:1280:2: rule__Submodule__Group__5__Impl
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
    // InternalDsl.g:1286:1: rule__Submodule__Group__5__Impl : ( '}' ) ;
    public final void rule__Submodule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1290:1: ( ( '}' ) )
            // InternalDsl.g:1291:1: ( '}' )
            {
            // InternalDsl.g:1291:1: ( '}' )
            // InternalDsl.g:1292:2: '}'
            {
             before(grammarAccess.getSubmoduleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1302:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1306:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalDsl.g:1307:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
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
    // InternalDsl.g:1314:1: rule__Operation__Group__0__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1318:1: ( ( 'op' ) )
            // InternalDsl.g:1319:1: ( 'op' )
            {
            // InternalDsl.g:1319:1: ( 'op' )
            // InternalDsl.g:1320:2: 'op'
            {
             before(grammarAccess.getOperationAccess().getOpKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDsl.g:1329:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1333:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalDsl.g:1334:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
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
    // InternalDsl.g:1341:1: rule__Operation__Group__1__Impl : ( '{' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1345:1: ( ( '{' ) )
            // InternalDsl.g:1346:1: ( '{' )
            {
            // InternalDsl.g:1346:1: ( '{' )
            // InternalDsl.g:1347:2: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:1356:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1360:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalDsl.g:1361:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
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
    // InternalDsl.g:1368:1: rule__Operation__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1372:1: ( ( 'type:' ) )
            // InternalDsl.g:1373:1: ( 'type:' )
            {
            // InternalDsl.g:1373:1: ( 'type:' )
            // InternalDsl.g:1374:2: 'type:'
            {
             before(grammarAccess.getOperationAccess().getTypeKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:1383:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1387:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalDsl.g:1388:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
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
    // InternalDsl.g:1395:1: rule__Operation__Group__3__Impl : ( ruleSubOperation ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( ( ruleSubOperation ) )
            // InternalDsl.g:1400:1: ( ruleSubOperation )
            {
            // InternalDsl.g:1400:1: ( ruleSubOperation )
            // InternalDsl.g:1401:2: ruleSubOperation
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
    // InternalDsl.g:1410:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1414:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalDsl.g:1415:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
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
    // InternalDsl.g:1422:1: rule__Operation__Group__4__Impl : ( 'operates_on:' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1426:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:1427:1: ( 'operates_on:' )
            {
            // InternalDsl.g:1427:1: ( 'operates_on:' )
            // InternalDsl.g:1428:2: 'operates_on:'
            {
             before(grammarAccess.getOperationAccess().getOperates_onKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:1437:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1441:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalDsl.g:1442:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
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
    // InternalDsl.g:1449:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__TargetAssignment_5 ) ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1453:1: ( ( ( rule__Operation__TargetAssignment_5 ) ) )
            // InternalDsl.g:1454:1: ( ( rule__Operation__TargetAssignment_5 ) )
            {
            // InternalDsl.g:1454:1: ( ( rule__Operation__TargetAssignment_5 ) )
            // InternalDsl.g:1455:2: ( rule__Operation__TargetAssignment_5 )
            {
             before(grammarAccess.getOperationAccess().getTargetAssignment_5()); 
            // InternalDsl.g:1456:2: ( rule__Operation__TargetAssignment_5 )
            // InternalDsl.g:1456:3: rule__Operation__TargetAssignment_5
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
    // InternalDsl.g:1464:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1468:1: ( rule__Operation__Group__6__Impl )
            // InternalDsl.g:1469:2: rule__Operation__Group__6__Impl
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
    // InternalDsl.g:1475:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1479:1: ( ( '}' ) )
            // InternalDsl.g:1480:1: ( '}' )
            {
            // InternalDsl.g:1480:1: ( '}' )
            // InternalDsl.g:1481:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1491:1: rule__GeneralEntity__Group__0 : rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 ;
    public final void rule__GeneralEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1495:1: ( rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 )
            // InternalDsl.g:1496:2: rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1
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
    // InternalDsl.g:1503:1: rule__GeneralEntity__Group__0__Impl : ( 'generalEntity' ) ;
    public final void rule__GeneralEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1507:1: ( ( 'generalEntity' ) )
            // InternalDsl.g:1508:1: ( 'generalEntity' )
            {
            // InternalDsl.g:1508:1: ( 'generalEntity' )
            // InternalDsl.g:1509:2: 'generalEntity'
            {
             before(grammarAccess.getGeneralEntityAccess().getGeneralEntityKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDsl.g:1518:1: rule__GeneralEntity__Group__1 : rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 ;
    public final void rule__GeneralEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1522:1: ( rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 )
            // InternalDsl.g:1523:2: rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2
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
    // InternalDsl.g:1530:1: rule__GeneralEntity__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__GeneralEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1534:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:1535:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:1535:1: ( ruleQualifiedName )
            // InternalDsl.g:1536:2: ruleQualifiedName
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
    // InternalDsl.g:1545:1: rule__GeneralEntity__Group__2 : rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 ;
    public final void rule__GeneralEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1549:1: ( rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 )
            // InternalDsl.g:1550:2: rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3
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
    // InternalDsl.g:1557:1: rule__GeneralEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1561:1: ( ( '{' ) )
            // InternalDsl.g:1562:1: ( '{' )
            {
            // InternalDsl.g:1562:1: ( '{' )
            // InternalDsl.g:1563:2: '{'
            {
             before(grammarAccess.getGeneralEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:1572:1: rule__GeneralEntity__Group__3 : rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 ;
    public final void rule__GeneralEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1576:1: ( rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 )
            // InternalDsl.g:1577:2: rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4
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
    // InternalDsl.g:1584:1: rule__GeneralEntity__Group__3__Impl : ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__GeneralEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1588:1: ( ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1589:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1589:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1590:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1590:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1591:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1592:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1592:4: rule__GeneralEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__GeneralEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1595:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1596:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1597:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1597:4: rule__GeneralEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__GeneralEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDsl.g:1606:1: rule__GeneralEntity__Group__4 : rule__GeneralEntity__Group__4__Impl ;
    public final void rule__GeneralEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1610:1: ( rule__GeneralEntity__Group__4__Impl )
            // InternalDsl.g:1611:2: rule__GeneralEntity__Group__4__Impl
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
    // InternalDsl.g:1617:1: rule__GeneralEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1621:1: ( ( '}' ) )
            // InternalDsl.g:1622:1: ( '}' )
            {
            // InternalDsl.g:1622:1: ( '}' )
            // InternalDsl.g:1623:2: '}'
            {
             before(grammarAccess.getGeneralEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1633:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1637:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDsl.g:1638:2: rule__Property__Group__0__Impl rule__Property__Group__1
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
    // InternalDsl.g:1645:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1649:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalDsl.g:1650:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalDsl.g:1650:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalDsl.g:1651:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalDsl.g:1652:2: ( rule__Property__NameAssignment_0 )
            // InternalDsl.g:1652:3: rule__Property__NameAssignment_0
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
    // InternalDsl.g:1660:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1664:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalDsl.g:1665:2: rule__Property__Group__1__Impl rule__Property__Group__2
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
    // InternalDsl.g:1672:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1676:1: ( ( ':' ) )
            // InternalDsl.g:1677:1: ( ':' )
            {
            // InternalDsl.g:1677:1: ( ':' )
            // InternalDsl.g:1678:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDsl.g:1687:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1691:1: ( rule__Property__Group__2__Impl )
            // InternalDsl.g:1692:2: rule__Property__Group__2__Impl
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
    // InternalDsl.g:1698:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1702:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalDsl.g:1703:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalDsl.g:1703:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalDsl.g:1704:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalDsl.g:1705:2: ( rule__Property__TypeAssignment_2 )
            // InternalDsl.g:1705:3: rule__Property__TypeAssignment_2
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
    // InternalDsl.g:1714:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1718:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDsl.g:1719:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalDsl.g:1726:1: rule__Type__Group__0__Impl : ( 'dataType' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1730:1: ( ( 'dataType' ) )
            // InternalDsl.g:1731:1: ( 'dataType' )
            {
            // InternalDsl.g:1731:1: ( 'dataType' )
            // InternalDsl.g:1732:2: 'dataType'
            {
             before(grammarAccess.getTypeAccess().getDataTypeKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDsl.g:1741:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1745:1: ( rule__Type__Group__1__Impl )
            // InternalDsl.g:1746:2: rule__Type__Group__1__Impl
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
    // InternalDsl.g:1752:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1756:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalDsl.g:1757:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalDsl.g:1757:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalDsl.g:1758:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalDsl.g:1759:2: ( rule__Type__NameAssignment_1 )
            // InternalDsl.g:1759:3: rule__Type__NameAssignment_1
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
    // InternalDsl.g:1768:1: rule__SpecialEntity__Group__0 : rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 ;
    public final void rule__SpecialEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1772:1: ( rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 )
            // InternalDsl.g:1773:2: rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1
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
    // InternalDsl.g:1780:1: rule__SpecialEntity__Group__0__Impl : ( 'specialEntity' ) ;
    public final void rule__SpecialEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1784:1: ( ( 'specialEntity' ) )
            // InternalDsl.g:1785:1: ( 'specialEntity' )
            {
            // InternalDsl.g:1785:1: ( 'specialEntity' )
            // InternalDsl.g:1786:2: 'specialEntity'
            {
             before(grammarAccess.getSpecialEntityAccess().getSpecialEntityKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:1795:1: rule__SpecialEntity__Group__1 : rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 ;
    public final void rule__SpecialEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1799:1: ( rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 )
            // InternalDsl.g:1800:2: rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2
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
    // InternalDsl.g:1807:1: rule__SpecialEntity__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__SpecialEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1811:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:1812:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:1812:1: ( ruleQualifiedName )
            // InternalDsl.g:1813:2: ruleQualifiedName
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
    // InternalDsl.g:1822:1: rule__SpecialEntity__Group__2 : rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 ;
    public final void rule__SpecialEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1826:1: ( rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 )
            // InternalDsl.g:1827:2: rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3
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
    // InternalDsl.g:1834:1: rule__SpecialEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SpecialEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1838:1: ( ( '{' ) )
            // InternalDsl.g:1839:1: ( '{' )
            {
            // InternalDsl.g:1839:1: ( '{' )
            // InternalDsl.g:1840:2: '{'
            {
             before(grammarAccess.getSpecialEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:1849:1: rule__SpecialEntity__Group__3 : rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 ;
    public final void rule__SpecialEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1853:1: ( rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 )
            // InternalDsl.g:1854:2: rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4
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
    // InternalDsl.g:1861:1: rule__SpecialEntity__Group__3__Impl : ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__SpecialEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1865:1: ( ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1866:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1866:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1867:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1867:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1868:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1869:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1869:4: rule__SpecialEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__SpecialEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1872:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1873:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1874:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1874:4: rule__SpecialEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SpecialEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDsl.g:1883:1: rule__SpecialEntity__Group__4 : rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 ;
    public final void rule__SpecialEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1887:1: ( rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 )
            // InternalDsl.g:1888:2: rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5
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
    // InternalDsl.g:1895:1: rule__SpecialEntity__Group__4__Impl : ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) ;
    public final void rule__SpecialEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1899:1: ( ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) )
            // InternalDsl.g:1900:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            {
            // InternalDsl.g:1900:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            // InternalDsl.g:1901:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            {
            // InternalDsl.g:1901:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) )
            // InternalDsl.g:1902:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:1903:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            // InternalDsl.g:1903:4: rule__SpecialEntity__TransactionsAssignment_4
            {
            pushFollow(FOLLOW_24);
            rule__SpecialEntity__TransactionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 

            }

            // InternalDsl.g:1906:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            // InternalDsl.g:1907:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:1908:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1908:4: rule__SpecialEntity__TransactionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SpecialEntity__TransactionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDsl.g:1917:1: rule__SpecialEntity__Group__5 : rule__SpecialEntity__Group__5__Impl ;
    public final void rule__SpecialEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1921:1: ( rule__SpecialEntity__Group__5__Impl )
            // InternalDsl.g:1922:2: rule__SpecialEntity__Group__5__Impl
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
    // InternalDsl.g:1928:1: rule__SpecialEntity__Group__5__Impl : ( '}' ) ;
    public final void rule__SpecialEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1932:1: ( ( '}' ) )
            // InternalDsl.g:1933:1: ( '}' )
            {
            // InternalDsl.g:1933:1: ( '}' )
            // InternalDsl.g:1934:2: '}'
            {
             before(grammarAccess.getSpecialEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1944:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1948:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalDsl.g:1949:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
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
    // InternalDsl.g:1956:1: rule__Transaction__Group__0__Impl : ( 'trx' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1960:1: ( ( 'trx' ) )
            // InternalDsl.g:1961:1: ( 'trx' )
            {
            // InternalDsl.g:1961:1: ( 'trx' )
            // InternalDsl.g:1962:2: 'trx'
            {
             before(grammarAccess.getTransactionAccess().getTrxKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:1971:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1975:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalDsl.g:1976:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
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
    // InternalDsl.g:1983:1: rule__Transaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1987:1: ( ( '{' ) )
            // InternalDsl.g:1988:1: ( '{' )
            {
            // InternalDsl.g:1988:1: ( '{' )
            // InternalDsl.g:1989:2: '{'
            {
             before(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:1998:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2002:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalDsl.g:2003:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
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
    // InternalDsl.g:2010:1: rule__Transaction__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2014:1: ( ( 'type:' ) )
            // InternalDsl.g:2015:1: ( 'type:' )
            {
            // InternalDsl.g:2015:1: ( 'type:' )
            // InternalDsl.g:2016:2: 'type:'
            {
             before(grammarAccess.getTransactionAccess().getTypeKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:2025:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2029:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalDsl.g:2030:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
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
    // InternalDsl.g:2037:1: rule__Transaction__Group__3__Impl : ( ruleSubTransaction ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2041:1: ( ( ruleSubTransaction ) )
            // InternalDsl.g:2042:1: ( ruleSubTransaction )
            {
            // InternalDsl.g:2042:1: ( ruleSubTransaction )
            // InternalDsl.g:2043:2: ruleSubTransaction
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
    // InternalDsl.g:2052:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2056:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalDsl.g:2057:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
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
    // InternalDsl.g:2064:1: rule__Transaction__Group__4__Impl : ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2068:1: ( ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) )
            // InternalDsl.g:2069:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            {
            // InternalDsl.g:2069:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            // InternalDsl.g:2070:2: ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* )
            {
            // InternalDsl.g:2070:2: ( ( rule__Transaction__OperatesonAssignment_4 ) )
            // InternalDsl.g:2071:3: ( rule__Transaction__OperatesonAssignment_4 )
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:2072:3: ( rule__Transaction__OperatesonAssignment_4 )
            // InternalDsl.g:2072:4: rule__Transaction__OperatesonAssignment_4
            {
            pushFollow(FOLLOW_26);
            rule__Transaction__OperatesonAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 

            }

            // InternalDsl.g:2075:2: ( ( rule__Transaction__OperatesonAssignment_4 )* )
            // InternalDsl.g:2076:3: ( rule__Transaction__OperatesonAssignment_4 )*
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:2077:3: ( rule__Transaction__OperatesonAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:2077:4: rule__Transaction__OperatesonAssignment_4
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Transaction__OperatesonAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalDsl.g:2086:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2090:1: ( rule__Transaction__Group__5__Impl )
            // InternalDsl.g:2091:2: rule__Transaction__Group__5__Impl
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
    // InternalDsl.g:2097:1: rule__Transaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2101:1: ( ( '}' ) )
            // InternalDsl.g:2102:1: ( '}' )
            {
            // InternalDsl.g:2102:1: ( '}' )
            // InternalDsl.g:2103:2: '}'
            {
             before(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:2113:1: rule__Operateson__Group__0 : rule__Operateson__Group__0__Impl rule__Operateson__Group__1 ;
    public final void rule__Operateson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2117:1: ( rule__Operateson__Group__0__Impl rule__Operateson__Group__1 )
            // InternalDsl.g:2118:2: rule__Operateson__Group__0__Impl rule__Operateson__Group__1
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
    // InternalDsl.g:2125:1: rule__Operateson__Group__0__Impl : ( 'operates_on:' ) ;
    public final void rule__Operateson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2129:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:2130:1: ( 'operates_on:' )
            {
            // InternalDsl.g:2130:1: ( 'operates_on:' )
            // InternalDsl.g:2131:2: 'operates_on:'
            {
             before(grammarAccess.getOperatesonAccess().getOperates_onKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:2140:1: rule__Operateson__Group__1 : rule__Operateson__Group__1__Impl ;
    public final void rule__Operateson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2144:1: ( rule__Operateson__Group__1__Impl )
            // InternalDsl.g:2145:2: rule__Operateson__Group__1__Impl
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
    // InternalDsl.g:2151:1: rule__Operateson__Group__1__Impl : ( ( rule__Operateson__TypeAssignment_1 ) ) ;
    public final void rule__Operateson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2155:1: ( ( ( rule__Operateson__TypeAssignment_1 ) ) )
            // InternalDsl.g:2156:1: ( ( rule__Operateson__TypeAssignment_1 ) )
            {
            // InternalDsl.g:2156:1: ( ( rule__Operateson__TypeAssignment_1 ) )
            // InternalDsl.g:2157:2: ( rule__Operateson__TypeAssignment_1 )
            {
             before(grammarAccess.getOperatesonAccess().getTypeAssignment_1()); 
            // InternalDsl.g:2158:2: ( rule__Operateson__TypeAssignment_1 )
            // InternalDsl.g:2158:3: rule__Operateson__TypeAssignment_1
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
    // InternalDsl.g:2167:1: rule__RelationDom__Group__0 : rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 ;
    public final void rule__RelationDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2171:1: ( rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 )
            // InternalDsl.g:2172:2: rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1
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
    // InternalDsl.g:2179:1: rule__RelationDom__Group__0__Impl : ( 'rel' ) ;
    public final void rule__RelationDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2183:1: ( ( 'rel' ) )
            // InternalDsl.g:2184:1: ( 'rel' )
            {
            // InternalDsl.g:2184:1: ( 'rel' )
            // InternalDsl.g:2185:2: 'rel'
            {
             before(grammarAccess.getRelationDomAccess().getRelKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDsl.g:2194:1: rule__RelationDom__Group__1 : rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 ;
    public final void rule__RelationDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2198:1: ( rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 )
            // InternalDsl.g:2199:2: rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2
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
    // InternalDsl.g:2206:1: rule__RelationDom__Group__1__Impl : ( '{' ) ;
    public final void rule__RelationDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2210:1: ( ( '{' ) )
            // InternalDsl.g:2211:1: ( '{' )
            {
            // InternalDsl.g:2211:1: ( '{' )
            // InternalDsl.g:2212:2: '{'
            {
             before(grammarAccess.getRelationDomAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:2221:1: rule__RelationDom__Group__2 : rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 ;
    public final void rule__RelationDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2225:1: ( rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 )
            // InternalDsl.g:2226:2: rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3
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
    // InternalDsl.g:2233:1: rule__RelationDom__Group__2__Impl : ( 'type:' ) ;
    public final void rule__RelationDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2237:1: ( ( 'type:' ) )
            // InternalDsl.g:2238:1: ( 'type:' )
            {
            // InternalDsl.g:2238:1: ( 'type:' )
            // InternalDsl.g:2239:2: 'type:'
            {
             before(grammarAccess.getRelationDomAccess().getTypeKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:2248:1: rule__RelationDom__Group__3 : rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 ;
    public final void rule__RelationDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2252:1: ( rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 )
            // InternalDsl.g:2253:2: rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4
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
    // InternalDsl.g:2260:1: rule__RelationDom__Group__3__Impl : ( 'Composition' ) ;
    public final void rule__RelationDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2264:1: ( ( 'Composition' ) )
            // InternalDsl.g:2265:1: ( 'Composition' )
            {
            // InternalDsl.g:2265:1: ( 'Composition' )
            // InternalDsl.g:2266:2: 'Composition'
            {
             before(grammarAccess.getRelationDomAccess().getCompositionKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDsl.g:2275:1: rule__RelationDom__Group__4 : rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 ;
    public final void rule__RelationDom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2279:1: ( rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 )
            // InternalDsl.g:2280:2: rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5
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
    // InternalDsl.g:2287:1: rule__RelationDom__Group__4__Impl : ( 'source:' ) ;
    public final void rule__RelationDom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2291:1: ( ( 'source:' ) )
            // InternalDsl.g:2292:1: ( 'source:' )
            {
            // InternalDsl.g:2292:1: ( 'source:' )
            // InternalDsl.g:2293:2: 'source:'
            {
             before(grammarAccess.getRelationDomAccess().getSourceKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDsl.g:2302:1: rule__RelationDom__Group__5 : rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 ;
    public final void rule__RelationDom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2306:1: ( rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 )
            // InternalDsl.g:2307:2: rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6
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
    // InternalDsl.g:2314:1: rule__RelationDom__Group__5__Impl : ( ( rule__RelationDom__TypeAssignment_5 ) ) ;
    public final void rule__RelationDom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2318:1: ( ( ( rule__RelationDom__TypeAssignment_5 ) ) )
            // InternalDsl.g:2319:1: ( ( rule__RelationDom__TypeAssignment_5 ) )
            {
            // InternalDsl.g:2319:1: ( ( rule__RelationDom__TypeAssignment_5 ) )
            // InternalDsl.g:2320:2: ( rule__RelationDom__TypeAssignment_5 )
            {
             before(grammarAccess.getRelationDomAccess().getTypeAssignment_5()); 
            // InternalDsl.g:2321:2: ( rule__RelationDom__TypeAssignment_5 )
            // InternalDsl.g:2321:3: rule__RelationDom__TypeAssignment_5
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
    // InternalDsl.g:2329:1: rule__RelationDom__Group__6 : rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 ;
    public final void rule__RelationDom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2333:1: ( rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 )
            // InternalDsl.g:2334:2: rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7
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
    // InternalDsl.g:2341:1: rule__RelationDom__Group__6__Impl : ( 'target:' ) ;
    public final void rule__RelationDom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2345:1: ( ( 'target:' ) )
            // InternalDsl.g:2346:1: ( 'target:' )
            {
            // InternalDsl.g:2346:1: ( 'target:' )
            // InternalDsl.g:2347:2: 'target:'
            {
             before(grammarAccess.getRelationDomAccess().getTargetKeyword_6()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDsl.g:2356:1: rule__RelationDom__Group__7 : rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 ;
    public final void rule__RelationDom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2360:1: ( rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 )
            // InternalDsl.g:2361:2: rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8
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
    // InternalDsl.g:2368:1: rule__RelationDom__Group__7__Impl : ( ( rule__RelationDom__TargetAssignment_7 ) ) ;
    public final void rule__RelationDom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2372:1: ( ( ( rule__RelationDom__TargetAssignment_7 ) ) )
            // InternalDsl.g:2373:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            {
            // InternalDsl.g:2373:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            // InternalDsl.g:2374:2: ( rule__RelationDom__TargetAssignment_7 )
            {
             before(grammarAccess.getRelationDomAccess().getTargetAssignment_7()); 
            // InternalDsl.g:2375:2: ( rule__RelationDom__TargetAssignment_7 )
            // InternalDsl.g:2375:3: rule__RelationDom__TargetAssignment_7
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
    // InternalDsl.g:2383:1: rule__RelationDom__Group__8 : rule__RelationDom__Group__8__Impl ;
    public final void rule__RelationDom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2387:1: ( rule__RelationDom__Group__8__Impl )
            // InternalDsl.g:2388:2: rule__RelationDom__Group__8__Impl
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
    // InternalDsl.g:2394:1: rule__RelationDom__Group__8__Impl : ( '}' ) ;
    public final void rule__RelationDom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2398:1: ( ( '}' ) )
            // InternalDsl.g:2399:1: ( '}' )
            {
            // InternalDsl.g:2399:1: ( '}' )
            // InternalDsl.g:2400:2: '}'
            {
             before(grammarAccess.getRelationDomAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:2410:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2414:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalDsl.g:2415:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
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
    // InternalDsl.g:2422:1: rule__Architecture__Group__0__Impl : ( 'arch' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2426:1: ( ( 'arch' ) )
            // InternalDsl.g:2427:1: ( 'arch' )
            {
            // InternalDsl.g:2427:1: ( 'arch' )
            // InternalDsl.g:2428:2: 'arch'
            {
             before(grammarAccess.getArchitectureAccess().getArchKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDsl.g:2437:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2441:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalDsl.g:2442:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:2449:1: rule__Architecture__Group__1__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2453:1: ( ( '{' ) )
            // InternalDsl.g:2454:1: ( '{' )
            {
            // InternalDsl.g:2454:1: ( '{' )
            // InternalDsl.g:2455:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:2464:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2468:1: ( rule__Architecture__Group__2__Impl )
            // InternalDsl.g:2469:2: rule__Architecture__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:2475:1: rule__Architecture__Group__2__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2479:1: ( ( '}' ) )
            // InternalDsl.g:2480:1: ( '}' )
            {
            // InternalDsl.g:2480:1: ( '}' )
            // InternalDsl.g:2481:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Technology__Group__0"
    // InternalDsl.g:2491:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2495:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalDsl.g:2496:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
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
    // InternalDsl.g:2503:1: rule__Technology__Group__0__Impl : ( 'tech' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2507:1: ( ( 'tech' ) )
            // InternalDsl.g:2508:1: ( 'tech' )
            {
            // InternalDsl.g:2508:1: ( 'tech' )
            // InternalDsl.g:2509:2: 'tech'
            {
             before(grammarAccess.getTechnologyAccess().getTechKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDsl.g:2518:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2522:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalDsl.g:2523:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:2530:1: rule__Technology__Group__1__Impl : ( '{' ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2534:1: ( ( '{' ) )
            // InternalDsl.g:2535:1: ( '{' )
            {
            // InternalDsl.g:2535:1: ( '{' )
            // InternalDsl.g:2536:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:2545:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2549:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalDsl.g:2550:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalDsl.g:2557:1: rule__Technology__Group__2__Impl : ( ( rule__Technology__JavaAssignment_2 ) ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2561:1: ( ( ( rule__Technology__JavaAssignment_2 ) ) )
            // InternalDsl.g:2562:1: ( ( rule__Technology__JavaAssignment_2 ) )
            {
            // InternalDsl.g:2562:1: ( ( rule__Technology__JavaAssignment_2 ) )
            // InternalDsl.g:2563:2: ( rule__Technology__JavaAssignment_2 )
            {
             before(grammarAccess.getTechnologyAccess().getJavaAssignment_2()); 
            // InternalDsl.g:2564:2: ( rule__Technology__JavaAssignment_2 )
            // InternalDsl.g:2564:3: rule__Technology__JavaAssignment_2
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
    // InternalDsl.g:2572:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl rule__Technology__Group__4 ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2576:1: ( rule__Technology__Group__3__Impl rule__Technology__Group__4 )
            // InternalDsl.g:2577:2: rule__Technology__Group__3__Impl rule__Technology__Group__4
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
    // InternalDsl.g:2584:1: rule__Technology__Group__3__Impl : ( ( rule__Technology__ReactAssignment_3 ) ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2588:1: ( ( ( rule__Technology__ReactAssignment_3 ) ) )
            // InternalDsl.g:2589:1: ( ( rule__Technology__ReactAssignment_3 ) )
            {
            // InternalDsl.g:2589:1: ( ( rule__Technology__ReactAssignment_3 ) )
            // InternalDsl.g:2590:2: ( rule__Technology__ReactAssignment_3 )
            {
             before(grammarAccess.getTechnologyAccess().getReactAssignment_3()); 
            // InternalDsl.g:2591:2: ( rule__Technology__ReactAssignment_3 )
            // InternalDsl.g:2591:3: rule__Technology__ReactAssignment_3
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
    // InternalDsl.g:2599:1: rule__Technology__Group__4 : rule__Technology__Group__4__Impl ;
    public final void rule__Technology__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2603:1: ( rule__Technology__Group__4__Impl )
            // InternalDsl.g:2604:2: rule__Technology__Group__4__Impl
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
    // InternalDsl.g:2610:1: rule__Technology__Group__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2614:1: ( ( '}' ) )
            // InternalDsl.g:2615:1: ( '}' )
            {
            // InternalDsl.g:2615:1: ( '}' )
            // InternalDsl.g:2616:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:2626:1: rule__JavaApp__Group__0 : rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1 ;
    public final void rule__JavaApp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2630:1: ( rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1 )
            // InternalDsl.g:2631:2: rule__JavaApp__Group__0__Impl rule__JavaApp__Group__1
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
    // InternalDsl.g:2638:1: rule__JavaApp__Group__0__Impl : ( 'javaApp' ) ;
    public final void rule__JavaApp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2642:1: ( ( 'javaApp' ) )
            // InternalDsl.g:2643:1: ( 'javaApp' )
            {
            // InternalDsl.g:2643:1: ( 'javaApp' )
            // InternalDsl.g:2644:2: 'javaApp'
            {
             before(grammarAccess.getJavaAppAccess().getJavaAppKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDsl.g:2653:1: rule__JavaApp__Group__1 : rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2 ;
    public final void rule__JavaApp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2657:1: ( rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2 )
            // InternalDsl.g:2658:2: rule__JavaApp__Group__1__Impl rule__JavaApp__Group__2
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
    // InternalDsl.g:2665:1: rule__JavaApp__Group__1__Impl : ( '{' ) ;
    public final void rule__JavaApp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2669:1: ( ( '{' ) )
            // InternalDsl.g:2670:1: ( '{' )
            {
            // InternalDsl.g:2670:1: ( '{' )
            // InternalDsl.g:2671:2: '{'
            {
             before(grammarAccess.getJavaAppAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:2680:1: rule__JavaApp__Group__2 : rule__JavaApp__Group__2__Impl ;
    public final void rule__JavaApp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2684:1: ( rule__JavaApp__Group__2__Impl )
            // InternalDsl.g:2685:2: rule__JavaApp__Group__2__Impl
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
    // InternalDsl.g:2691:1: rule__JavaApp__Group__2__Impl : ( '}' ) ;
    public final void rule__JavaApp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2695:1: ( ( '}' ) )
            // InternalDsl.g:2696:1: ( '}' )
            {
            // InternalDsl.g:2696:1: ( '}' )
            // InternalDsl.g:2697:2: '}'
            {
             before(grammarAccess.getJavaAppAccess().getRightCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:2707:1: rule__ReactApp__Group__0 : rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1 ;
    public final void rule__ReactApp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2711:1: ( rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1 )
            // InternalDsl.g:2712:2: rule__ReactApp__Group__0__Impl rule__ReactApp__Group__1
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
    // InternalDsl.g:2719:1: rule__ReactApp__Group__0__Impl : ( 'reactApp' ) ;
    public final void rule__ReactApp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2723:1: ( ( 'reactApp' ) )
            // InternalDsl.g:2724:1: ( 'reactApp' )
            {
            // InternalDsl.g:2724:1: ( 'reactApp' )
            // InternalDsl.g:2725:2: 'reactApp'
            {
             before(grammarAccess.getReactAppAccess().getReactAppKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDsl.g:2734:1: rule__ReactApp__Group__1 : rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2 ;
    public final void rule__ReactApp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2738:1: ( rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2 )
            // InternalDsl.g:2739:2: rule__ReactApp__Group__1__Impl rule__ReactApp__Group__2
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
    // InternalDsl.g:2746:1: rule__ReactApp__Group__1__Impl : ( '{' ) ;
    public final void rule__ReactApp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2750:1: ( ( '{' ) )
            // InternalDsl.g:2751:1: ( '{' )
            {
            // InternalDsl.g:2751:1: ( '{' )
            // InternalDsl.g:2752:2: '{'
            {
             before(grammarAccess.getReactAppAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:2761:1: rule__ReactApp__Group__2 : rule__ReactApp__Group__2__Impl ;
    public final void rule__ReactApp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2765:1: ( rule__ReactApp__Group__2__Impl )
            // InternalDsl.g:2766:2: rule__ReactApp__Group__2__Impl
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
    // InternalDsl.g:2772:1: rule__ReactApp__Group__2__Impl : ( '}' ) ;
    public final void rule__ReactApp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2776:1: ( ( '}' ) )
            // InternalDsl.g:2777:1: ( '}' )
            {
            // InternalDsl.g:2777:1: ( '}' )
            // InternalDsl.g:2778:2: '}'
            {
             before(grammarAccess.getReactAppAccess().getRightCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:2788:1: rule__System__DomAssignment_2 : ( ruleDomain ) ;
    public final void rule__System__DomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2792:1: ( ( ruleDomain ) )
            // InternalDsl.g:2793:2: ( ruleDomain )
            {
            // InternalDsl.g:2793:2: ( ruleDomain )
            // InternalDsl.g:2794:3: ruleDomain
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
    // InternalDsl.g:2803:1: rule__System__ArchAssignment_3 : ( ruleArchitecture ) ;
    public final void rule__System__ArchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2807:1: ( ( ruleArchitecture ) )
            // InternalDsl.g:2808:2: ( ruleArchitecture )
            {
            // InternalDsl.g:2808:2: ( ruleArchitecture )
            // InternalDsl.g:2809:3: ruleArchitecture
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
    // InternalDsl.g:2818:1: rule__System__TechAssignment_4 : ( ruleTechnology ) ;
    public final void rule__System__TechAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2822:1: ( ( ruleTechnology ) )
            // InternalDsl.g:2823:2: ( ruleTechnology )
            {
            // InternalDsl.g:2823:2: ( ruleTechnology )
            // InternalDsl.g:2824:3: ruleTechnology
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
    // InternalDsl.g:2833:1: rule__Domain__ElementsAssignment_2 : ( ruleAbstractElement ) ;
    public final void rule__Domain__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2837:1: ( ( ruleAbstractElement ) )
            // InternalDsl.g:2838:2: ( ruleAbstractElement )
            {
            // InternalDsl.g:2838:2: ( ruleAbstractElement )
            // InternalDsl.g:2839:3: ruleAbstractElement
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
    // InternalDsl.g:2848:1: rule__Domain__ModulesAssignment_3 : ( ruleModule ) ;
    public final void rule__Domain__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2852:1: ( ( ruleModule ) )
            // InternalDsl.g:2853:2: ( ruleModule )
            {
            // InternalDsl.g:2853:2: ( ruleModule )
            // InternalDsl.g:2854:3: ruleModule
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
    // InternalDsl.g:2863:1: rule__Domain__RelationsAssignment_4 : ( ruleRelationDom ) ;
    public final void rule__Domain__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2867:1: ( ( ruleRelationDom ) )
            // InternalDsl.g:2868:2: ( ruleRelationDom )
            {
            // InternalDsl.g:2868:2: ( ruleRelationDom )
            // InternalDsl.g:2869:3: ruleRelationDom
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
    // InternalDsl.g:2878:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2882:1: ( ( RULE_ID ) )
            // InternalDsl.g:2883:2: ( RULE_ID )
            {
            // InternalDsl.g:2883:2: ( RULE_ID )
            // InternalDsl.g:2884:3: RULE_ID
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
    // InternalDsl.g:2893:1: rule__Module__SubmodulesAssignment_3 : ( ruleSubmodule ) ;
    public final void rule__Module__SubmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2897:1: ( ( ruleSubmodule ) )
            // InternalDsl.g:2898:2: ( ruleSubmodule )
            {
            // InternalDsl.g:2898:2: ( ruleSubmodule )
            // InternalDsl.g:2899:3: ruleSubmodule
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
    // InternalDsl.g:2908:1: rule__Submodule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Submodule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2912:1: ( ( RULE_ID ) )
            // InternalDsl.g:2913:2: ( RULE_ID )
            {
            // InternalDsl.g:2913:2: ( RULE_ID )
            // InternalDsl.g:2914:3: RULE_ID
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
    // InternalDsl.g:2923:1: rule__Submodule__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Submodule__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2927:1: ( ( ruleOperation ) )
            // InternalDsl.g:2928:2: ( ruleOperation )
            {
            // InternalDsl.g:2928:2: ( ruleOperation )
            // InternalDsl.g:2929:3: ruleOperation
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
    // InternalDsl.g:2938:1: rule__Submodule__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Submodule__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2942:1: ( ( ruleEntity ) )
            // InternalDsl.g:2943:2: ( ruleEntity )
            {
            // InternalDsl.g:2943:2: ( ruleEntity )
            // InternalDsl.g:2944:3: ruleEntity
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
    // InternalDsl.g:2953:1: rule__Entity__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Entity__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2957:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2958:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2958:2: ( ( RULE_ID ) )
            // InternalDsl.g:2959:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getTypeQualifiedNameCrossReference_0()); 
            // InternalDsl.g:2960:3: ( RULE_ID )
            // InternalDsl.g:2961:4: RULE_ID
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
    // InternalDsl.g:2972:1: rule__QualifiedName__NameAssignment : ( RULE_ID ) ;
    public final void rule__QualifiedName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2976:1: ( ( RULE_ID ) )
            // InternalDsl.g:2977:2: ( RULE_ID )
            {
            // InternalDsl.g:2977:2: ( RULE_ID )
            // InternalDsl.g:2978:3: RULE_ID
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
    // InternalDsl.g:2987:1: rule__Operation__TargetAssignment_5 : ( ruleEntity ) ;
    public final void rule__Operation__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2991:1: ( ( ruleEntity ) )
            // InternalDsl.g:2992:2: ( ruleEntity )
            {
            // InternalDsl.g:2992:2: ( ruleEntity )
            // InternalDsl.g:2993:3: ruleEntity
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
    // InternalDsl.g:3002:1: rule__GeneralEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__GeneralEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3006:1: ( ( ruleProperty ) )
            // InternalDsl.g:3007:2: ( ruleProperty )
            {
            // InternalDsl.g:3007:2: ( ruleProperty )
            // InternalDsl.g:3008:3: ruleProperty
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
    // InternalDsl.g:3017:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3021:1: ( ( RULE_ID ) )
            // InternalDsl.g:3022:2: ( RULE_ID )
            {
            // InternalDsl.g:3022:2: ( RULE_ID )
            // InternalDsl.g:3023:3: RULE_ID
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
    // InternalDsl.g:3032:1: rule__Property__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3036:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:3037:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:3037:2: ( ( RULE_ID ) )
            // InternalDsl.g:3038:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 
            // InternalDsl.g:3039:3: ( RULE_ID )
            // InternalDsl.g:3040:4: RULE_ID
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
    // InternalDsl.g:3051:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3055:1: ( ( RULE_ID ) )
            // InternalDsl.g:3056:2: ( RULE_ID )
            {
            // InternalDsl.g:3056:2: ( RULE_ID )
            // InternalDsl.g:3057:3: RULE_ID
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
    // InternalDsl.g:3066:1: rule__SpecialEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__SpecialEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3070:1: ( ( ruleProperty ) )
            // InternalDsl.g:3071:2: ( ruleProperty )
            {
            // InternalDsl.g:3071:2: ( ruleProperty )
            // InternalDsl.g:3072:3: ruleProperty
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
    // InternalDsl.g:3081:1: rule__SpecialEntity__TransactionsAssignment_4 : ( ruleTransaction ) ;
    public final void rule__SpecialEntity__TransactionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3085:1: ( ( ruleTransaction ) )
            // InternalDsl.g:3086:2: ( ruleTransaction )
            {
            // InternalDsl.g:3086:2: ( ruleTransaction )
            // InternalDsl.g:3087:3: ruleTransaction
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
    // InternalDsl.g:3096:1: rule__Transaction__OperatesonAssignment_4 : ( ruleOperateson ) ;
    public final void rule__Transaction__OperatesonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3100:1: ( ( ruleOperateson ) )
            // InternalDsl.g:3101:2: ( ruleOperateson )
            {
            // InternalDsl.g:3101:2: ( ruleOperateson )
            // InternalDsl.g:3102:3: ruleOperateson
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
    // InternalDsl.g:3111:1: rule__Operateson__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Operateson__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3115:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:3116:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:3116:2: ( ( RULE_ID ) )
            // InternalDsl.g:3117:3: ( RULE_ID )
            {
             before(grammarAccess.getOperatesonAccess().getTypeGeneralEntityCrossReference_1_0()); 
            // InternalDsl.g:3118:3: ( RULE_ID )
            // InternalDsl.g:3119:4: RULE_ID
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
    // InternalDsl.g:3130:1: rule__RelationDom__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDom__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3134:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:3135:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:3135:2: ( ( RULE_ID ) )
            // InternalDsl.g:3136:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationDomAccess().getTypeGeneralEntityCrossReference_5_0()); 
            // InternalDsl.g:3137:3: ( RULE_ID )
            // InternalDsl.g:3138:4: RULE_ID
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
    // InternalDsl.g:3149:1: rule__RelationDom__TargetAssignment_7 : ( ruleEntity ) ;
    public final void rule__RelationDom__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3153:1: ( ( ruleEntity ) )
            // InternalDsl.g:3154:2: ( ruleEntity )
            {
            // InternalDsl.g:3154:2: ( ruleEntity )
            // InternalDsl.g:3155:3: ruleEntity
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


    // $ANTLR start "rule__Technology__JavaAssignment_2"
    // InternalDsl.g:3164:1: rule__Technology__JavaAssignment_2 : ( ruleJavaApp ) ;
    public final void rule__Technology__JavaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3168:1: ( ( ruleJavaApp ) )
            // InternalDsl.g:3169:2: ( ruleJavaApp )
            {
            // InternalDsl.g:3169:2: ( ruleJavaApp )
            // InternalDsl.g:3170:3: ruleJavaApp
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
    // InternalDsl.g:3179:1: rule__Technology__ReactAssignment_3 : ( ruleReactApp ) ;
    public final void rule__Technology__ReactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3183:1: ( ( ruleReactApp ) )
            // InternalDsl.g:3184:2: ( ruleReactApp )
            {
            // InternalDsl.g:3184:2: ( ruleReactApp )
            // InternalDsl.g:3185:3: ruleReactApp
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000D080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000D000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000D080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});

}