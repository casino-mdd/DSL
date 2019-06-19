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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Read'", "'Create'", "'Admin'", "'Aux'", "'Exchange'", "'Sale'", "'{'", "'}'", "'module'", "'submodule'", "'type:'", "'generalEntity'", "'property'", "'specialEntity'", "'operates_on:'", "'Composition'", "'source:'", "'target:'"
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



    // $ANTLR start "entryRuleDomain"
    // InternalDsl.g:53:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleDomain EOF )
            // InternalDsl.g:55:1: ruleDomain EOF
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
    // InternalDsl.g:62:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Domain__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Domain__Group__0 )
            // InternalDsl.g:69:4: rule__Domain__Group__0
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
    // InternalDsl.g:78:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleModule EOF )
            // InternalDsl.g:80:1: ruleModule EOF
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
    // InternalDsl.g:87:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Module__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Module__Group__0 )
            // InternalDsl.g:94:4: rule__Module__Group__0
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
    // InternalDsl.g:103:1: entryRuleSubmodule : ruleSubmodule EOF ;
    public final void entryRuleSubmodule() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleSubmodule EOF )
            // InternalDsl.g:105:1: ruleSubmodule EOF
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
    // InternalDsl.g:112:1: ruleSubmodule : ( ( rule__Submodule__Group__0 ) ) ;
    public final void ruleSubmodule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Submodule__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Submodule__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Submodule__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Submodule__Group__0 )
            {
             before(grammarAccess.getSubmoduleAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Submodule__Group__0 )
            // InternalDsl.g:119:4: rule__Submodule__Group__0
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
    // InternalDsl.g:128:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleOperation EOF )
            // InternalDsl.g:130:1: ruleOperation EOF
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
    // InternalDsl.g:137:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Operation__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Operation__Group__0 )
            // InternalDsl.g:144:4: rule__Operation__Group__0
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
    // InternalDsl.g:153:1: entryRuleSubOperation : ruleSubOperation EOF ;
    public final void entryRuleSubOperation() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleSubOperation EOF )
            // InternalDsl.g:155:1: ruleSubOperation EOF
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
    // InternalDsl.g:162:1: ruleSubOperation : ( ( rule__SubOperation__Alternatives ) ) ;
    public final void ruleSubOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__SubOperation__Alternatives ) ) )
            // InternalDsl.g:167:2: ( ( rule__SubOperation__Alternatives ) )
            {
            // InternalDsl.g:167:2: ( ( rule__SubOperation__Alternatives ) )
            // InternalDsl.g:168:3: ( rule__SubOperation__Alternatives )
            {
             before(grammarAccess.getSubOperationAccess().getAlternatives()); 
            // InternalDsl.g:169:3: ( rule__SubOperation__Alternatives )
            // InternalDsl.g:169:4: rule__SubOperation__Alternatives
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
    // InternalDsl.g:178:1: entryRuleGeneralEntity : ruleGeneralEntity EOF ;
    public final void entryRuleGeneralEntity() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleGeneralEntity EOF )
            // InternalDsl.g:180:1: ruleGeneralEntity EOF
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
    // InternalDsl.g:187:1: ruleGeneralEntity : ( ( rule__GeneralEntity__Group__0 ) ) ;
    public final void ruleGeneralEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__GeneralEntity__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__GeneralEntity__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__GeneralEntity__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__GeneralEntity__Group__0 )
            {
             before(grammarAccess.getGeneralEntityAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__GeneralEntity__Group__0 )
            // InternalDsl.g:194:4: rule__GeneralEntity__Group__0
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
    // InternalDsl.g:203:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleProperty EOF )
            // InternalDsl.g:205:1: ruleProperty EOF
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
    // InternalDsl.g:212:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Property__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Property__Group__0 )
            // InternalDsl.g:219:4: rule__Property__Group__0
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


    // $ANTLR start "entryRuleSpecialEntity"
    // InternalDsl.g:228:1: entryRuleSpecialEntity : ruleSpecialEntity EOF ;
    public final void entryRuleSpecialEntity() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleSpecialEntity EOF )
            // InternalDsl.g:230:1: ruleSpecialEntity EOF
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
    // InternalDsl.g:237:1: ruleSpecialEntity : ( ( rule__SpecialEntity__Group__0 ) ) ;
    public final void ruleSpecialEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__SpecialEntity__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__SpecialEntity__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__SpecialEntity__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__SpecialEntity__Group__0 )
            {
             before(grammarAccess.getSpecialEntityAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__SpecialEntity__Group__0 )
            // InternalDsl.g:244:4: rule__SpecialEntity__Group__0
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


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:253:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleRole EOF )
            // InternalDsl.g:255:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:262:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalDsl.g:267:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Role__Alternatives ) )
            // InternalDsl.g:268:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalDsl.g:269:3: ( rule__Role__Alternatives )
            // InternalDsl.g:269:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleTransaction"
    // InternalDsl.g:278:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleTransaction EOF )
            // InternalDsl.g:280:1: ruleTransaction EOF
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
    // InternalDsl.g:287:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Transaction__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Transaction__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Transaction__Group__0 )
            // InternalDsl.g:294:4: rule__Transaction__Group__0
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
    // InternalDsl.g:303:1: entryRuleSubTransaction : ruleSubTransaction EOF ;
    public final void entryRuleSubTransaction() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleSubTransaction EOF )
            // InternalDsl.g:305:1: ruleSubTransaction EOF
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
    // InternalDsl.g:312:1: ruleSubTransaction : ( ( rule__SubTransaction__Alternatives ) ) ;
    public final void ruleSubTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__SubTransaction__Alternatives ) ) )
            // InternalDsl.g:317:2: ( ( rule__SubTransaction__Alternatives ) )
            {
            // InternalDsl.g:317:2: ( ( rule__SubTransaction__Alternatives ) )
            // InternalDsl.g:318:3: ( rule__SubTransaction__Alternatives )
            {
             before(grammarAccess.getSubTransactionAccess().getAlternatives()); 
            // InternalDsl.g:319:3: ( rule__SubTransaction__Alternatives )
            // InternalDsl.g:319:4: rule__SubTransaction__Alternatives
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


    // $ANTLR start "entryRuleRelationDom"
    // InternalDsl.g:328:1: entryRuleRelationDom : ruleRelationDom EOF ;
    public final void entryRuleRelationDom() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleRelationDom EOF )
            // InternalDsl.g:330:1: ruleRelationDom EOF
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
    // InternalDsl.g:337:1: ruleRelationDom : ( ( rule__RelationDom__Alternatives ) ) ;
    public final void ruleRelationDom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__RelationDom__Alternatives ) ) )
            // InternalDsl.g:342:2: ( ( rule__RelationDom__Alternatives ) )
            {
            // InternalDsl.g:342:2: ( ( rule__RelationDom__Alternatives ) )
            // InternalDsl.g:343:3: ( rule__RelationDom__Alternatives )
            {
             before(grammarAccess.getRelationDomAccess().getAlternatives()); 
            // InternalDsl.g:344:3: ( rule__RelationDom__Alternatives )
            // InternalDsl.g:344:4: rule__RelationDom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationDomAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__Submodule__EntitiesAlternatives_4_0"
    // InternalDsl.g:352:1: rule__Submodule__EntitiesAlternatives_4_0 : ( ( ruleSpecialEntity ) | ( ruleGeneralEntity ) );
    public final void rule__Submodule__EntitiesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:356:1: ( ( ruleSpecialEntity ) | ( ruleGeneralEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:357:2: ( ruleSpecialEntity )
                    {
                    // InternalDsl.g:357:2: ( ruleSpecialEntity )
                    // InternalDsl.g:358:3: ruleSpecialEntity
                    {
                     before(grammarAccess.getSubmoduleAccess().getEntitiesSpecialEntityParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSpecialEntity();

                    state._fsp--;

                     after(grammarAccess.getSubmoduleAccess().getEntitiesSpecialEntityParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:363:2: ( ruleGeneralEntity )
                    {
                    // InternalDsl.g:363:2: ( ruleGeneralEntity )
                    // InternalDsl.g:364:3: ruleGeneralEntity
                    {
                     before(grammarAccess.getSubmoduleAccess().getEntitiesGeneralEntityParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralEntity();

                    state._fsp--;

                     after(grammarAccess.getSubmoduleAccess().getEntitiesGeneralEntityParserRuleCall_4_0_1()); 

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
    // InternalDsl.g:373:1: rule__SubOperation__Alternatives : ( ( 'Read' ) | ( 'Create' ) );
    public final void rule__SubOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:377:1: ( ( 'Read' ) | ( 'Create' ) )
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
                    // InternalDsl.g:378:2: ( 'Read' )
                    {
                    // InternalDsl.g:378:2: ( 'Read' )
                    // InternalDsl.g:379:3: 'Read'
                    {
                     before(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:384:2: ( 'Create' )
                    {
                    // InternalDsl.g:384:2: ( 'Create' )
                    // InternalDsl.g:385:3: 'Create'
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


    // $ANTLR start "rule__Role__Alternatives"
    // InternalDsl.g:394:1: rule__Role__Alternatives : ( ( 'Admin' ) | ( 'Aux' ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:398:1: ( ( 'Admin' ) | ( 'Aux' ) )
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
                    // InternalDsl.g:399:2: ( 'Admin' )
                    {
                    // InternalDsl.g:399:2: ( 'Admin' )
                    // InternalDsl.g:400:3: 'Admin'
                    {
                     before(grammarAccess.getRoleAccess().getAdminKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRoleAccess().getAdminKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:405:2: ( 'Aux' )
                    {
                    // InternalDsl.g:405:2: ( 'Aux' )
                    // InternalDsl.g:406:3: 'Aux'
                    {
                     before(grammarAccess.getRoleAccess().getAuxKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRoleAccess().getAuxKeyword_1()); 

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
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__SubTransaction__Alternatives"
    // InternalDsl.g:415:1: rule__SubTransaction__Alternatives : ( ( 'Exchange' ) | ( 'Sale' ) );
    public final void rule__SubTransaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:419:1: ( ( 'Exchange' ) | ( 'Sale' ) )
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
                    // InternalDsl.g:420:2: ( 'Exchange' )
                    {
                    // InternalDsl.g:420:2: ( 'Exchange' )
                    // InternalDsl.g:421:3: 'Exchange'
                    {
                     before(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:426:2: ( 'Sale' )
                    {
                    // InternalDsl.g:426:2: ( 'Sale' )
                    // InternalDsl.g:427:3: 'Sale'
                    {
                     before(grammarAccess.getSubTransactionAccess().getSaleKeyword_1()); 
                    match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__RelationDom__Alternatives"
    // InternalDsl.g:436:1: rule__RelationDom__Alternatives : ( ( ( rule__RelationDom__Group_0__0 ) ) | ( ( rule__RelationDom__Group_1__0 ) ) );
    public final void rule__RelationDom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:440:1: ( ( ( rule__RelationDom__Group_0__0 ) ) | ( ( rule__RelationDom__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:441:2: ( ( rule__RelationDom__Group_0__0 ) )
                    {
                    // InternalDsl.g:441:2: ( ( rule__RelationDom__Group_0__0 ) )
                    // InternalDsl.g:442:3: ( rule__RelationDom__Group_0__0 )
                    {
                     before(grammarAccess.getRelationDomAccess().getGroup_0()); 
                    // InternalDsl.g:443:3: ( rule__RelationDom__Group_0__0 )
                    // InternalDsl.g:443:4: rule__RelationDom__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationDom__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationDomAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:447:2: ( ( rule__RelationDom__Group_1__0 ) )
                    {
                    // InternalDsl.g:447:2: ( ( rule__RelationDom__Group_1__0 ) )
                    // InternalDsl.g:448:3: ( rule__RelationDom__Group_1__0 )
                    {
                     before(grammarAccess.getRelationDomAccess().getGroup_1()); 
                    // InternalDsl.g:449:3: ( rule__RelationDom__Group_1__0 )
                    // InternalDsl.g:449:4: rule__RelationDom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationDom__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationDomAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RelationDom__Alternatives"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalDsl.g:457:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:461:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalDsl.g:462:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalDsl.g:469:1: rule__Domain__Group__0__Impl : ( '{' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:473:1: ( ( '{' ) )
            // InternalDsl.g:474:1: ( '{' )
            {
            // InternalDsl.g:474:1: ( '{' )
            // InternalDsl.g:475:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalDsl.g:484:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:488:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalDsl.g:489:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:496:1: rule__Domain__Group__1__Impl : ( ( ( rule__Domain__ModulesAssignment_1 ) ) ( ( rule__Domain__ModulesAssignment_1 )* ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:500:1: ( ( ( ( rule__Domain__ModulesAssignment_1 ) ) ( ( rule__Domain__ModulesAssignment_1 )* ) ) )
            // InternalDsl.g:501:1: ( ( ( rule__Domain__ModulesAssignment_1 ) ) ( ( rule__Domain__ModulesAssignment_1 )* ) )
            {
            // InternalDsl.g:501:1: ( ( ( rule__Domain__ModulesAssignment_1 ) ) ( ( rule__Domain__ModulesAssignment_1 )* ) )
            // InternalDsl.g:502:2: ( ( rule__Domain__ModulesAssignment_1 ) ) ( ( rule__Domain__ModulesAssignment_1 )* )
            {
            // InternalDsl.g:502:2: ( ( rule__Domain__ModulesAssignment_1 ) )
            // InternalDsl.g:503:3: ( rule__Domain__ModulesAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_1()); 
            // InternalDsl.g:504:3: ( rule__Domain__ModulesAssignment_1 )
            // InternalDsl.g:504:4: rule__Domain__ModulesAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Domain__ModulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModulesAssignment_1()); 

            }

            // InternalDsl.g:507:2: ( ( rule__Domain__ModulesAssignment_1 )* )
            // InternalDsl.g:508:3: ( rule__Domain__ModulesAssignment_1 )*
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_1()); 
            // InternalDsl.g:509:3: ( rule__Domain__ModulesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:509:4: rule__Domain__ModulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Domain__ModulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getModulesAssignment_1()); 

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
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // InternalDsl.g:518:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:522:1: ( rule__Domain__Group__2__Impl )
            // InternalDsl.g:523:2: rule__Domain__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:529:1: rule__Domain__Group__2__Impl : ( '}' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:533:1: ( ( '}' ) )
            // InternalDsl.g:534:1: ( '}' )
            {
            // InternalDsl.g:534:1: ( '}' )
            // InternalDsl.g:535:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Module__Group__0"
    // InternalDsl.g:545:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:549:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalDsl.g:550:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:557:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:561:1: ( ( 'module' ) )
            // InternalDsl.g:562:1: ( 'module' )
            {
            // InternalDsl.g:562:1: ( 'module' )
            // InternalDsl.g:563:2: 'module'
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
    // InternalDsl.g:572:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:576:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalDsl.g:577:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:584:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:588:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalDsl.g:589:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalDsl.g:589:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalDsl.g:590:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalDsl.g:591:2: ( rule__Module__NameAssignment_1 )
            // InternalDsl.g:591:3: rule__Module__NameAssignment_1
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
    // InternalDsl.g:599:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:603:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalDsl.g:604:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:611:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:615:1: ( ( '{' ) )
            // InternalDsl.g:616:1: ( '{' )
            {
            // InternalDsl.g:616:1: ( '{' )
            // InternalDsl.g:617:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:626:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:630:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalDsl.g:631:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:638:1: rule__Module__Group__3__Impl : ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:642:1: ( ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) )
            // InternalDsl.g:643:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            {
            // InternalDsl.g:643:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            // InternalDsl.g:644:2: ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* )
            {
            // InternalDsl.g:644:2: ( ( rule__Module__SubmodulesAssignment_3 ) )
            // InternalDsl.g:645:3: ( rule__Module__SubmodulesAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:646:3: ( rule__Module__SubmodulesAssignment_3 )
            // InternalDsl.g:646:4: rule__Module__SubmodulesAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Module__SubmodulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 

            }

            // InternalDsl.g:649:2: ( ( rule__Module__SubmodulesAssignment_3 )* )
            // InternalDsl.g:650:3: ( rule__Module__SubmodulesAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:651:3: ( rule__Module__SubmodulesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:651:4: rule__Module__SubmodulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalDsl.g:660:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:664:1: ( rule__Module__Group__4__Impl )
            // InternalDsl.g:665:2: rule__Module__Group__4__Impl
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
    // InternalDsl.g:671:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:675:1: ( ( '}' ) )
            // InternalDsl.g:676:1: ( '}' )
            {
            // InternalDsl.g:676:1: ( '}' )
            // InternalDsl.g:677:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:687:1: rule__Submodule__Group__0 : rule__Submodule__Group__0__Impl rule__Submodule__Group__1 ;
    public final void rule__Submodule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:1: ( rule__Submodule__Group__0__Impl rule__Submodule__Group__1 )
            // InternalDsl.g:692:2: rule__Submodule__Group__0__Impl rule__Submodule__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:699:1: rule__Submodule__Group__0__Impl : ( 'submodule' ) ;
    public final void rule__Submodule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:703:1: ( ( 'submodule' ) )
            // InternalDsl.g:704:1: ( 'submodule' )
            {
            // InternalDsl.g:704:1: ( 'submodule' )
            // InternalDsl.g:705:2: 'submodule'
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
    // InternalDsl.g:714:1: rule__Submodule__Group__1 : rule__Submodule__Group__1__Impl rule__Submodule__Group__2 ;
    public final void rule__Submodule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:718:1: ( rule__Submodule__Group__1__Impl rule__Submodule__Group__2 )
            // InternalDsl.g:719:2: rule__Submodule__Group__1__Impl rule__Submodule__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:726:1: rule__Submodule__Group__1__Impl : ( ( rule__Submodule__NameAssignment_1 ) ) ;
    public final void rule__Submodule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:730:1: ( ( ( rule__Submodule__NameAssignment_1 ) ) )
            // InternalDsl.g:731:1: ( ( rule__Submodule__NameAssignment_1 ) )
            {
            // InternalDsl.g:731:1: ( ( rule__Submodule__NameAssignment_1 ) )
            // InternalDsl.g:732:2: ( rule__Submodule__NameAssignment_1 )
            {
             before(grammarAccess.getSubmoduleAccess().getNameAssignment_1()); 
            // InternalDsl.g:733:2: ( rule__Submodule__NameAssignment_1 )
            // InternalDsl.g:733:3: rule__Submodule__NameAssignment_1
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
    // InternalDsl.g:741:1: rule__Submodule__Group__2 : rule__Submodule__Group__2__Impl rule__Submodule__Group__3 ;
    public final void rule__Submodule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:745:1: ( rule__Submodule__Group__2__Impl rule__Submodule__Group__3 )
            // InternalDsl.g:746:2: rule__Submodule__Group__2__Impl rule__Submodule__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:753:1: rule__Submodule__Group__2__Impl : ( '{' ) ;
    public final void rule__Submodule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:757:1: ( ( '{' ) )
            // InternalDsl.g:758:1: ( '{' )
            {
            // InternalDsl.g:758:1: ( '{' )
            // InternalDsl.g:759:2: '{'
            {
             before(grammarAccess.getSubmoduleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:768:1: rule__Submodule__Group__3 : rule__Submodule__Group__3__Impl rule__Submodule__Group__4 ;
    public final void rule__Submodule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:772:1: ( rule__Submodule__Group__3__Impl rule__Submodule__Group__4 )
            // InternalDsl.g:773:2: rule__Submodule__Group__3__Impl rule__Submodule__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:780:1: rule__Submodule__Group__3__Impl : ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) ;
    public final void rule__Submodule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:784:1: ( ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) )
            // InternalDsl.g:785:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            {
            // InternalDsl.g:785:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            // InternalDsl.g:786:2: ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* )
            {
            // InternalDsl.g:786:2: ( ( rule__Submodule__OperationsAssignment_3 ) )
            // InternalDsl.g:787:3: ( rule__Submodule__OperationsAssignment_3 )
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:788:3: ( rule__Submodule__OperationsAssignment_3 )
            // InternalDsl.g:788:4: rule__Submodule__OperationsAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Submodule__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 

            }

            // InternalDsl.g:791:2: ( ( rule__Submodule__OperationsAssignment_3 )* )
            // InternalDsl.g:792:3: ( rule__Submodule__OperationsAssignment_3 )*
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:793:3: ( rule__Submodule__OperationsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:793:4: rule__Submodule__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalDsl.g:802:1: rule__Submodule__Group__4 : rule__Submodule__Group__4__Impl rule__Submodule__Group__5 ;
    public final void rule__Submodule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:806:1: ( rule__Submodule__Group__4__Impl rule__Submodule__Group__5 )
            // InternalDsl.g:807:2: rule__Submodule__Group__4__Impl rule__Submodule__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:814:1: rule__Submodule__Group__4__Impl : ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) ;
    public final void rule__Submodule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:818:1: ( ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) )
            // InternalDsl.g:819:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            {
            // InternalDsl.g:819:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            // InternalDsl.g:820:2: ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* )
            {
            // InternalDsl.g:820:2: ( ( rule__Submodule__EntitiesAssignment_4 ) )
            // InternalDsl.g:821:3: ( rule__Submodule__EntitiesAssignment_4 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:822:3: ( rule__Submodule__EntitiesAssignment_4 )
            // InternalDsl.g:822:4: rule__Submodule__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_13);
            rule__Submodule__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 

            }

            // InternalDsl.g:825:2: ( ( rule__Submodule__EntitiesAssignment_4 )* )
            // InternalDsl.g:826:3: ( rule__Submodule__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:827:3: ( rule__Submodule__EntitiesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22||LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:827:4: rule__Submodule__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalDsl.g:836:1: rule__Submodule__Group__5 : rule__Submodule__Group__5__Impl rule__Submodule__Group__6 ;
    public final void rule__Submodule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:840:1: ( rule__Submodule__Group__5__Impl rule__Submodule__Group__6 )
            // InternalDsl.g:841:2: rule__Submodule__Group__5__Impl rule__Submodule__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Submodule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Submodule__Group__6();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:848:1: rule__Submodule__Group__5__Impl : ( ( ( rule__Submodule__RelationsAssignment_5 ) ) ( ( rule__Submodule__RelationsAssignment_5 )* ) ) ;
    public final void rule__Submodule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:852:1: ( ( ( ( rule__Submodule__RelationsAssignment_5 ) ) ( ( rule__Submodule__RelationsAssignment_5 )* ) ) )
            // InternalDsl.g:853:1: ( ( ( rule__Submodule__RelationsAssignment_5 ) ) ( ( rule__Submodule__RelationsAssignment_5 )* ) )
            {
            // InternalDsl.g:853:1: ( ( ( rule__Submodule__RelationsAssignment_5 ) ) ( ( rule__Submodule__RelationsAssignment_5 )* ) )
            // InternalDsl.g:854:2: ( ( rule__Submodule__RelationsAssignment_5 ) ) ( ( rule__Submodule__RelationsAssignment_5 )* )
            {
            // InternalDsl.g:854:2: ( ( rule__Submodule__RelationsAssignment_5 ) )
            // InternalDsl.g:855:3: ( rule__Submodule__RelationsAssignment_5 )
            {
             before(grammarAccess.getSubmoduleAccess().getRelationsAssignment_5()); 
            // InternalDsl.g:856:3: ( rule__Submodule__RelationsAssignment_5 )
            // InternalDsl.g:856:4: rule__Submodule__RelationsAssignment_5
            {
            pushFollow(FOLLOW_14);
            rule__Submodule__RelationsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getRelationsAssignment_5()); 

            }

            // InternalDsl.g:859:2: ( ( rule__Submodule__RelationsAssignment_5 )* )
            // InternalDsl.g:860:3: ( rule__Submodule__RelationsAssignment_5 )*
            {
             before(grammarAccess.getSubmoduleAccess().getRelationsAssignment_5()); 
            // InternalDsl.g:861:3: ( rule__Submodule__RelationsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:861:4: rule__Submodule__RelationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Submodule__RelationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSubmoduleAccess().getRelationsAssignment_5()); 

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
    // $ANTLR end "rule__Submodule__Group__5__Impl"


    // $ANTLR start "rule__Submodule__Group__6"
    // InternalDsl.g:870:1: rule__Submodule__Group__6 : rule__Submodule__Group__6__Impl ;
    public final void rule__Submodule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:874:1: ( rule__Submodule__Group__6__Impl )
            // InternalDsl.g:875:2: rule__Submodule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Submodule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__6"


    // $ANTLR start "rule__Submodule__Group__6__Impl"
    // InternalDsl.g:881:1: rule__Submodule__Group__6__Impl : ( '}' ) ;
    public final void rule__Submodule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:885:1: ( ( '}' ) )
            // InternalDsl.g:886:1: ( '}' )
            {
            // InternalDsl.g:886:1: ( '}' )
            // InternalDsl.g:887:2: '}'
            {
             before(grammarAccess.getSubmoduleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubmoduleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalDsl.g:897:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:901:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalDsl.g:902:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:909:1: rule__Operation__Group__0__Impl : ( '{' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:913:1: ( ( '{' ) )
            // InternalDsl.g:914:1: ( '{' )
            {
            // InternalDsl.g:914:1: ( '{' )
            // InternalDsl.g:915:2: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalDsl.g:924:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:928:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalDsl.g:929:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:936:1: rule__Operation__Group__1__Impl : ( 'type:' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:940:1: ( ( 'type:' ) )
            // InternalDsl.g:941:1: ( 'type:' )
            {
            // InternalDsl.g:941:1: ( 'type:' )
            // InternalDsl.g:942:2: 'type:'
            {
             before(grammarAccess.getOperationAccess().getTypeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getTypeKeyword_1()); 

            }


            }

        }
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
    // InternalDsl.g:951:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:955:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalDsl.g:956:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:963:1: rule__Operation__Group__2__Impl : ( ruleSubOperation ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:967:1: ( ( ruleSubOperation ) )
            // InternalDsl.g:968:1: ( ruleSubOperation )
            {
            // InternalDsl.g:968:1: ( ruleSubOperation )
            // InternalDsl.g:969:2: ruleSubOperation
            {
             before(grammarAccess.getOperationAccess().getSubOperationParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleSubOperation();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getSubOperationParserRuleCall_2()); 

            }


            }

        }
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
    // InternalDsl.g:978:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:982:1: ( rule__Operation__Group__3__Impl )
            // InternalDsl.g:983:2: rule__Operation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:989:1: rule__Operation__Group__3__Impl : ( '}' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:993:1: ( ( '}' ) )
            // InternalDsl.g:994:1: ( '}' )
            {
            // InternalDsl.g:994:1: ( '}' )
            // InternalDsl.g:995:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__GeneralEntity__Group__0"
    // InternalDsl.g:1005:1: rule__GeneralEntity__Group__0 : rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 ;
    public final void rule__GeneralEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1009:1: ( rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 )
            // InternalDsl.g:1010:2: rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1017:1: rule__GeneralEntity__Group__0__Impl : ( 'generalEntity' ) ;
    public final void rule__GeneralEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1021:1: ( ( 'generalEntity' ) )
            // InternalDsl.g:1022:1: ( 'generalEntity' )
            {
            // InternalDsl.g:1022:1: ( 'generalEntity' )
            // InternalDsl.g:1023:2: 'generalEntity'
            {
             before(grammarAccess.getGeneralEntityAccess().getGeneralEntityKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:1032:1: rule__GeneralEntity__Group__1 : rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 ;
    public final void rule__GeneralEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1036:1: ( rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 )
            // InternalDsl.g:1037:2: rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1044:1: rule__GeneralEntity__Group__1__Impl : ( ( rule__GeneralEntity__NameAssignment_1 ) ) ;
    public final void rule__GeneralEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1048:1: ( ( ( rule__GeneralEntity__NameAssignment_1 ) ) )
            // InternalDsl.g:1049:1: ( ( rule__GeneralEntity__NameAssignment_1 ) )
            {
            // InternalDsl.g:1049:1: ( ( rule__GeneralEntity__NameAssignment_1 ) )
            // InternalDsl.g:1050:2: ( rule__GeneralEntity__NameAssignment_1 )
            {
             before(grammarAccess.getGeneralEntityAccess().getNameAssignment_1()); 
            // InternalDsl.g:1051:2: ( rule__GeneralEntity__NameAssignment_1 )
            // InternalDsl.g:1051:3: rule__GeneralEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralEntityAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalDsl.g:1059:1: rule__GeneralEntity__Group__2 : rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 ;
    public final void rule__GeneralEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1063:1: ( rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 )
            // InternalDsl.g:1064:2: rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1071:1: rule__GeneralEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1075:1: ( ( '{' ) )
            // InternalDsl.g:1076:1: ( '{' )
            {
            // InternalDsl.g:1076:1: ( '{' )
            // InternalDsl.g:1077:2: '{'
            {
             before(grammarAccess.getGeneralEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1086:1: rule__GeneralEntity__Group__3 : rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 ;
    public final void rule__GeneralEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1090:1: ( rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 )
            // InternalDsl.g:1091:2: rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:1098:1: rule__GeneralEntity__Group__3__Impl : ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__GeneralEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1102:1: ( ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1103:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1103:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1104:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1104:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1105:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1106:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1106:4: rule__GeneralEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__GeneralEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1109:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1110:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1111:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1111:4: rule__GeneralEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__GeneralEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDsl.g:1120:1: rule__GeneralEntity__Group__4 : rule__GeneralEntity__Group__4__Impl ;
    public final void rule__GeneralEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1124:1: ( rule__GeneralEntity__Group__4__Impl )
            // InternalDsl.g:1125:2: rule__GeneralEntity__Group__4__Impl
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
    // InternalDsl.g:1131:1: rule__GeneralEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1135:1: ( ( '}' ) )
            // InternalDsl.g:1136:1: ( '}' )
            {
            // InternalDsl.g:1136:1: ( '}' )
            // InternalDsl.g:1137:2: '}'
            {
             before(grammarAccess.getGeneralEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:1147:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1151:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDsl.g:1152:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1159:1: rule__Property__Group__0__Impl : ( 'property' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1163:1: ( ( 'property' ) )
            // InternalDsl.g:1164:1: ( 'property' )
            {
            // InternalDsl.g:1164:1: ( 'property' )
            // InternalDsl.g:1165:2: 'property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 

            }


            }

        }
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
    // InternalDsl.g:1174:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1178:1: ( rule__Property__Group__1__Impl )
            // InternalDsl.g:1179:2: rule__Property__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:1185:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1189:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalDsl.g:1190:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalDsl.g:1190:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalDsl.g:1191:2: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // InternalDsl.g:1192:2: ( rule__Property__NameAssignment_1 )
            // InternalDsl.g:1192:3: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SpecialEntity__Group__0"
    // InternalDsl.g:1201:1: rule__SpecialEntity__Group__0 : rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 ;
    public final void rule__SpecialEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1205:1: ( rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 )
            // InternalDsl.g:1206:2: rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1213:1: rule__SpecialEntity__Group__0__Impl : ( 'specialEntity' ) ;
    public final void rule__SpecialEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1217:1: ( ( 'specialEntity' ) )
            // InternalDsl.g:1218:1: ( 'specialEntity' )
            {
            // InternalDsl.g:1218:1: ( 'specialEntity' )
            // InternalDsl.g:1219:2: 'specialEntity'
            {
             before(grammarAccess.getSpecialEntityAccess().getSpecialEntityKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDsl.g:1228:1: rule__SpecialEntity__Group__1 : rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 ;
    public final void rule__SpecialEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1232:1: ( rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 )
            // InternalDsl.g:1233:2: rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1240:1: rule__SpecialEntity__Group__1__Impl : ( ( rule__SpecialEntity__NameAssignment_1 ) ) ;
    public final void rule__SpecialEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1244:1: ( ( ( rule__SpecialEntity__NameAssignment_1 ) ) )
            // InternalDsl.g:1245:1: ( ( rule__SpecialEntity__NameAssignment_1 ) )
            {
            // InternalDsl.g:1245:1: ( ( rule__SpecialEntity__NameAssignment_1 ) )
            // InternalDsl.g:1246:2: ( rule__SpecialEntity__NameAssignment_1 )
            {
             before(grammarAccess.getSpecialEntityAccess().getNameAssignment_1()); 
            // InternalDsl.g:1247:2: ( rule__SpecialEntity__NameAssignment_1 )
            // InternalDsl.g:1247:3: rule__SpecialEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecialEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalDsl.g:1255:1: rule__SpecialEntity__Group__2 : rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 ;
    public final void rule__SpecialEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1259:1: ( rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 )
            // InternalDsl.g:1260:2: rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1267:1: rule__SpecialEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SpecialEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1271:1: ( ( '{' ) )
            // InternalDsl.g:1272:1: ( '{' )
            {
            // InternalDsl.g:1272:1: ( '{' )
            // InternalDsl.g:1273:2: '{'
            {
             before(grammarAccess.getSpecialEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1282:1: rule__SpecialEntity__Group__3 : rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 ;
    public final void rule__SpecialEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1286:1: ( rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 )
            // InternalDsl.g:1287:2: rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1294:1: rule__SpecialEntity__Group__3__Impl : ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__SpecialEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1298:1: ( ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1299:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1299:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1300:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1300:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1301:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1302:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1302:4: rule__SpecialEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__SpecialEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1305:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1306:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1307:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1307:4: rule__SpecialEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SpecialEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDsl.g:1316:1: rule__SpecialEntity__Group__4 : rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 ;
    public final void rule__SpecialEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1320:1: ( rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 )
            // InternalDsl.g:1321:2: rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5
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
    // InternalDsl.g:1328:1: rule__SpecialEntity__Group__4__Impl : ( ruleRole ) ;
    public final void rule__SpecialEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1332:1: ( ( ruleRole ) )
            // InternalDsl.g:1333:1: ( ruleRole )
            {
            // InternalDsl.g:1333:1: ( ruleRole )
            // InternalDsl.g:1334:2: ruleRole
            {
             before(grammarAccess.getSpecialEntityAccess().getRoleParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getSpecialEntityAccess().getRoleParserRuleCall_4()); 

            }


            }

        }
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
    // InternalDsl.g:1343:1: rule__SpecialEntity__Group__5 : rule__SpecialEntity__Group__5__Impl rule__SpecialEntity__Group__6 ;
    public final void rule__SpecialEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1347:1: ( rule__SpecialEntity__Group__5__Impl rule__SpecialEntity__Group__6 )
            // InternalDsl.g:1348:2: rule__SpecialEntity__Group__5__Impl rule__SpecialEntity__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__SpecialEntity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialEntity__Group__6();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:1355:1: rule__SpecialEntity__Group__5__Impl : ( ( ( rule__SpecialEntity__TransactionsAssignment_5 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_5 )* ) ) ;
    public final void rule__SpecialEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1359:1: ( ( ( ( rule__SpecialEntity__TransactionsAssignment_5 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_5 )* ) ) )
            // InternalDsl.g:1360:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_5 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_5 )* ) )
            {
            // InternalDsl.g:1360:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_5 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_5 )* ) )
            // InternalDsl.g:1361:2: ( ( rule__SpecialEntity__TransactionsAssignment_5 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_5 )* )
            {
            // InternalDsl.g:1361:2: ( ( rule__SpecialEntity__TransactionsAssignment_5 ) )
            // InternalDsl.g:1362:3: ( rule__SpecialEntity__TransactionsAssignment_5 )
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_5()); 
            // InternalDsl.g:1363:3: ( rule__SpecialEntity__TransactionsAssignment_5 )
            // InternalDsl.g:1363:4: rule__SpecialEntity__TransactionsAssignment_5
            {
            pushFollow(FOLLOW_11);
            rule__SpecialEntity__TransactionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_5()); 

            }

            // InternalDsl.g:1366:2: ( ( rule__SpecialEntity__TransactionsAssignment_5 )* )
            // InternalDsl.g:1367:3: ( rule__SpecialEntity__TransactionsAssignment_5 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_5()); 
            // InternalDsl.g:1368:3: ( rule__SpecialEntity__TransactionsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1368:4: rule__SpecialEntity__TransactionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SpecialEntity__TransactionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_5()); 

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
    // $ANTLR end "rule__SpecialEntity__Group__5__Impl"


    // $ANTLR start "rule__SpecialEntity__Group__6"
    // InternalDsl.g:1377:1: rule__SpecialEntity__Group__6 : rule__SpecialEntity__Group__6__Impl ;
    public final void rule__SpecialEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1381:1: ( rule__SpecialEntity__Group__6__Impl )
            // InternalDsl.g:1382:2: rule__SpecialEntity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecialEntity__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__6"


    // $ANTLR start "rule__SpecialEntity__Group__6__Impl"
    // InternalDsl.g:1388:1: rule__SpecialEntity__Group__6__Impl : ( '}' ) ;
    public final void rule__SpecialEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1392:1: ( ( '}' ) )
            // InternalDsl.g:1393:1: ( '}' )
            {
            // InternalDsl.g:1393:1: ( '}' )
            // InternalDsl.g:1394:2: '}'
            {
             before(grammarAccess.getSpecialEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSpecialEntityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__Group__6__Impl"


    // $ANTLR start "rule__Transaction__Group__0"
    // InternalDsl.g:1404:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1408:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalDsl.g:1409:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1416:1: rule__Transaction__Group__0__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1420:1: ( ( '{' ) )
            // InternalDsl.g:1421:1: ( '{' )
            {
            // InternalDsl.g:1421:1: ( '{' )
            // InternalDsl.g:1422:2: '{'
            {
             before(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalDsl.g:1431:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1435:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalDsl.g:1436:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
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
    // InternalDsl.g:1443:1: rule__Transaction__Group__1__Impl : ( 'type:' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1447:1: ( ( 'type:' ) )
            // InternalDsl.g:1448:1: ( 'type:' )
            {
            // InternalDsl.g:1448:1: ( 'type:' )
            // InternalDsl.g:1449:2: 'type:'
            {
             before(grammarAccess.getTransactionAccess().getTypeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getTypeKeyword_1()); 

            }


            }

        }
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
    // InternalDsl.g:1458:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1462:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalDsl.g:1463:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalDsl.g:1470:1: rule__Transaction__Group__2__Impl : ( ruleSubTransaction ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1474:1: ( ( ruleSubTransaction ) )
            // InternalDsl.g:1475:1: ( ruleSubTransaction )
            {
            // InternalDsl.g:1475:1: ( ruleSubTransaction )
            // InternalDsl.g:1476:2: ruleSubTransaction
            {
             before(grammarAccess.getTransactionAccess().getSubTransactionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleSubTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getSubTransactionParserRuleCall_2()); 

            }


            }

        }
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
    // InternalDsl.g:1485:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1489:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalDsl.g:1490:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1497:1: rule__Transaction__Group__3__Impl : ( 'operates_on:' ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1501:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:1502:1: ( 'operates_on:' )
            {
            // InternalDsl.g:1502:1: ( 'operates_on:' )
            // InternalDsl.g:1503:2: 'operates_on:'
            {
             before(grammarAccess.getTransactionAccess().getOperates_onKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getOperates_onKeyword_3()); 

            }


            }

        }
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
    // InternalDsl.g:1512:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1516:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalDsl.g:1517:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:1524:1: rule__Transaction__Group__4__Impl : ( ruleGeneralEntity ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1528:1: ( ( ruleGeneralEntity ) )
            // InternalDsl.g:1529:1: ( ruleGeneralEntity )
            {
            // InternalDsl.g:1529:1: ( ruleGeneralEntity )
            // InternalDsl.g:1530:2: ruleGeneralEntity
            {
             before(grammarAccess.getTransactionAccess().getGeneralEntityParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleGeneralEntity();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getGeneralEntityParserRuleCall_4()); 

            }


            }

        }
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
    // InternalDsl.g:1539:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1543:1: ( rule__Transaction__Group__5__Impl )
            // InternalDsl.g:1544:2: rule__Transaction__Group__5__Impl
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
    // InternalDsl.g:1550:1: rule__Transaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1554:1: ( ( '}' ) )
            // InternalDsl.g:1555:1: ( '}' )
            {
            // InternalDsl.g:1555:1: ( '}' )
            // InternalDsl.g:1556:2: '}'
            {
             before(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__RelationDom__Group_0__0"
    // InternalDsl.g:1566:1: rule__RelationDom__Group_0__0 : rule__RelationDom__Group_0__0__Impl rule__RelationDom__Group_0__1 ;
    public final void rule__RelationDom__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1570:1: ( rule__RelationDom__Group_0__0__Impl rule__RelationDom__Group_0__1 )
            // InternalDsl.g:1571:2: rule__RelationDom__Group_0__0__Impl rule__RelationDom__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__RelationDom__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__0"


    // $ANTLR start "rule__RelationDom__Group_0__0__Impl"
    // InternalDsl.g:1578:1: rule__RelationDom__Group_0__0__Impl : ( '{' ) ;
    public final void rule__RelationDom__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1582:1: ( ( '{' ) )
            // InternalDsl.g:1583:1: ( '{' )
            {
            // InternalDsl.g:1583:1: ( '{' )
            // InternalDsl.g:1584:2: '{'
            {
             before(grammarAccess.getRelationDomAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__0__Impl"


    // $ANTLR start "rule__RelationDom__Group_0__1"
    // InternalDsl.g:1593:1: rule__RelationDom__Group_0__1 : rule__RelationDom__Group_0__1__Impl rule__RelationDom__Group_0__2 ;
    public final void rule__RelationDom__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1597:1: ( rule__RelationDom__Group_0__1__Impl rule__RelationDom__Group_0__2 )
            // InternalDsl.g:1598:2: rule__RelationDom__Group_0__1__Impl rule__RelationDom__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__RelationDom__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__1"


    // $ANTLR start "rule__RelationDom__Group_0__1__Impl"
    // InternalDsl.g:1605:1: rule__RelationDom__Group_0__1__Impl : ( 'type:' ) ;
    public final void rule__RelationDom__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1609:1: ( ( 'type:' ) )
            // InternalDsl.g:1610:1: ( 'type:' )
            {
            // InternalDsl.g:1610:1: ( 'type:' )
            // InternalDsl.g:1611:2: 'type:'
            {
             before(grammarAccess.getRelationDomAccess().getTypeKeyword_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getTypeKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__1__Impl"


    // $ANTLR start "rule__RelationDom__Group_0__2"
    // InternalDsl.g:1620:1: rule__RelationDom__Group_0__2 : rule__RelationDom__Group_0__2__Impl rule__RelationDom__Group_0__3 ;
    public final void rule__RelationDom__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1624:1: ( rule__RelationDom__Group_0__2__Impl rule__RelationDom__Group_0__3 )
            // InternalDsl.g:1625:2: rule__RelationDom__Group_0__2__Impl rule__RelationDom__Group_0__3
            {
            pushFollow(FOLLOW_23);
            rule__RelationDom__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__2"


    // $ANTLR start "rule__RelationDom__Group_0__2__Impl"
    // InternalDsl.g:1632:1: rule__RelationDom__Group_0__2__Impl : ( 'Composition' ) ;
    public final void rule__RelationDom__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1636:1: ( ( 'Composition' ) )
            // InternalDsl.g:1637:1: ( 'Composition' )
            {
            // InternalDsl.g:1637:1: ( 'Composition' )
            // InternalDsl.g:1638:2: 'Composition'
            {
             before(grammarAccess.getRelationDomAccess().getCompositionKeyword_0_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getCompositionKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__2__Impl"


    // $ANTLR start "rule__RelationDom__Group_0__3"
    // InternalDsl.g:1647:1: rule__RelationDom__Group_0__3 : rule__RelationDom__Group_0__3__Impl rule__RelationDom__Group_0__4 ;
    public final void rule__RelationDom__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1651:1: ( rule__RelationDom__Group_0__3__Impl rule__RelationDom__Group_0__4 )
            // InternalDsl.g:1652:2: rule__RelationDom__Group_0__3__Impl rule__RelationDom__Group_0__4
            {
            pushFollow(FOLLOW_10);
            rule__RelationDom__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__3"


    // $ANTLR start "rule__RelationDom__Group_0__3__Impl"
    // InternalDsl.g:1659:1: rule__RelationDom__Group_0__3__Impl : ( 'source:' ) ;
    public final void rule__RelationDom__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1663:1: ( ( 'source:' ) )
            // InternalDsl.g:1664:1: ( 'source:' )
            {
            // InternalDsl.g:1664:1: ( 'source:' )
            // InternalDsl.g:1665:2: 'source:'
            {
             before(grammarAccess.getRelationDomAccess().getSourceKeyword_0_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getSourceKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__3__Impl"


    // $ANTLR start "rule__RelationDom__Group_0__4"
    // InternalDsl.g:1674:1: rule__RelationDom__Group_0__4 : rule__RelationDom__Group_0__4__Impl rule__RelationDom__Group_0__5 ;
    public final void rule__RelationDom__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1678:1: ( rule__RelationDom__Group_0__4__Impl rule__RelationDom__Group_0__5 )
            // InternalDsl.g:1679:2: rule__RelationDom__Group_0__4__Impl rule__RelationDom__Group_0__5
            {
            pushFollow(FOLLOW_24);
            rule__RelationDom__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__4"


    // $ANTLR start "rule__RelationDom__Group_0__4__Impl"
    // InternalDsl.g:1686:1: rule__RelationDom__Group_0__4__Impl : ( ruleGeneralEntity ) ;
    public final void rule__RelationDom__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1690:1: ( ( ruleGeneralEntity ) )
            // InternalDsl.g:1691:1: ( ruleGeneralEntity )
            {
            // InternalDsl.g:1691:1: ( ruleGeneralEntity )
            // InternalDsl.g:1692:2: ruleGeneralEntity
            {
             before(grammarAccess.getRelationDomAccess().getGeneralEntityParserRuleCall_0_4()); 
            pushFollow(FOLLOW_2);
            ruleGeneralEntity();

            state._fsp--;

             after(grammarAccess.getRelationDomAccess().getGeneralEntityParserRuleCall_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__4__Impl"


    // $ANTLR start "rule__RelationDom__Group_0__5"
    // InternalDsl.g:1701:1: rule__RelationDom__Group_0__5 : rule__RelationDom__Group_0__5__Impl rule__RelationDom__Group_0__6 ;
    public final void rule__RelationDom__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1705:1: ( rule__RelationDom__Group_0__5__Impl rule__RelationDom__Group_0__6 )
            // InternalDsl.g:1706:2: rule__RelationDom__Group_0__5__Impl rule__RelationDom__Group_0__6
            {
            pushFollow(FOLLOW_6);
            rule__RelationDom__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__5"


    // $ANTLR start "rule__RelationDom__Group_0__5__Impl"
    // InternalDsl.g:1713:1: rule__RelationDom__Group_0__5__Impl : ( 'target:' ) ;
    public final void rule__RelationDom__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1717:1: ( ( 'target:' ) )
            // InternalDsl.g:1718:1: ( 'target:' )
            {
            // InternalDsl.g:1718:1: ( 'target:' )
            // InternalDsl.g:1719:2: 'target:'
            {
             before(grammarAccess.getRelationDomAccess().getTargetKeyword_0_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getTargetKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__5__Impl"


    // $ANTLR start "rule__RelationDom__Group_0__6"
    // InternalDsl.g:1728:1: rule__RelationDom__Group_0__6 : rule__RelationDom__Group_0__6__Impl ;
    public final void rule__RelationDom__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1732:1: ( rule__RelationDom__Group_0__6__Impl )
            // InternalDsl.g:1733:2: rule__RelationDom__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__6"


    // $ANTLR start "rule__RelationDom__Group_0__6__Impl"
    // InternalDsl.g:1739:1: rule__RelationDom__Group_0__6__Impl : ( ( rule__RelationDom__TypeAssignment_0_6 ) ) ;
    public final void rule__RelationDom__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1743:1: ( ( ( rule__RelationDom__TypeAssignment_0_6 ) ) )
            // InternalDsl.g:1744:1: ( ( rule__RelationDom__TypeAssignment_0_6 ) )
            {
            // InternalDsl.g:1744:1: ( ( rule__RelationDom__TypeAssignment_0_6 ) )
            // InternalDsl.g:1745:2: ( rule__RelationDom__TypeAssignment_0_6 )
            {
             before(grammarAccess.getRelationDomAccess().getTypeAssignment_0_6()); 
            // InternalDsl.g:1746:2: ( rule__RelationDom__TypeAssignment_0_6 )
            // InternalDsl.g:1746:3: rule__RelationDom__TypeAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__TypeAssignment_0_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationDomAccess().getTypeAssignment_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_0__6__Impl"


    // $ANTLR start "rule__RelationDom__Group_1__0"
    // InternalDsl.g:1755:1: rule__RelationDom__Group_1__0 : rule__RelationDom__Group_1__0__Impl rule__RelationDom__Group_1__1 ;
    public final void rule__RelationDom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1759:1: ( rule__RelationDom__Group_1__0__Impl rule__RelationDom__Group_1__1 )
            // InternalDsl.g:1760:2: rule__RelationDom__Group_1__0__Impl rule__RelationDom__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__RelationDom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDom__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_1__0"


    // $ANTLR start "rule__RelationDom__Group_1__0__Impl"
    // InternalDsl.g:1767:1: rule__RelationDom__Group_1__0__Impl : ( ( rule__RelationDom__TypeAssignment_1_0 ) ) ;
    public final void rule__RelationDom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1771:1: ( ( ( rule__RelationDom__TypeAssignment_1_0 ) ) )
            // InternalDsl.g:1772:1: ( ( rule__RelationDom__TypeAssignment_1_0 ) )
            {
            // InternalDsl.g:1772:1: ( ( rule__RelationDom__TypeAssignment_1_0 ) )
            // InternalDsl.g:1773:2: ( rule__RelationDom__TypeAssignment_1_0 )
            {
             before(grammarAccess.getRelationDomAccess().getTypeAssignment_1_0()); 
            // InternalDsl.g:1774:2: ( rule__RelationDom__TypeAssignment_1_0 )
            // InternalDsl.g:1774:3: rule__RelationDom__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationDomAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_1__0__Impl"


    // $ANTLR start "rule__RelationDom__Group_1__1"
    // InternalDsl.g:1782:1: rule__RelationDom__Group_1__1 : rule__RelationDom__Group_1__1__Impl ;
    public final void rule__RelationDom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1786:1: ( rule__RelationDom__Group_1__1__Impl )
            // InternalDsl.g:1787:2: rule__RelationDom__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationDom__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_1__1"


    // $ANTLR start "rule__RelationDom__Group_1__1__Impl"
    // InternalDsl.g:1793:1: rule__RelationDom__Group_1__1__Impl : ( '}' ) ;
    public final void rule__RelationDom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1797:1: ( ( '}' ) )
            // InternalDsl.g:1798:1: ( '}' )
            {
            // InternalDsl.g:1798:1: ( '}' )
            // InternalDsl.g:1799:2: '}'
            {
             before(grammarAccess.getRelationDomAccess().getRightCurlyBracketKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getRightCurlyBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__Group_1__1__Impl"


    // $ANTLR start "rule__Domain__ModulesAssignment_1"
    // InternalDsl.g:1809:1: rule__Domain__ModulesAssignment_1 : ( ruleModule ) ;
    public final void rule__Domain__ModulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1813:1: ( ( ruleModule ) )
            // InternalDsl.g:1814:2: ( ruleModule )
            {
            // InternalDsl.g:1814:2: ( ruleModule )
            // InternalDsl.g:1815:3: ruleModule
            {
             before(grammarAccess.getDomainAccess().getModulesModuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getModulesModuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ModulesAssignment_1"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // InternalDsl.g:1824:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1828:1: ( ( RULE_ID ) )
            // InternalDsl.g:1829:2: ( RULE_ID )
            {
            // InternalDsl.g:1829:2: ( RULE_ID )
            // InternalDsl.g:1830:3: RULE_ID
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
    // InternalDsl.g:1839:1: rule__Module__SubmodulesAssignment_3 : ( ruleSubmodule ) ;
    public final void rule__Module__SubmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1843:1: ( ( ruleSubmodule ) )
            // InternalDsl.g:1844:2: ( ruleSubmodule )
            {
            // InternalDsl.g:1844:2: ( ruleSubmodule )
            // InternalDsl.g:1845:3: ruleSubmodule
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
    // InternalDsl.g:1854:1: rule__Submodule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Submodule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1858:1: ( ( RULE_ID ) )
            // InternalDsl.g:1859:2: ( RULE_ID )
            {
            // InternalDsl.g:1859:2: ( RULE_ID )
            // InternalDsl.g:1860:3: RULE_ID
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
    // InternalDsl.g:1869:1: rule__Submodule__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Submodule__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1873:1: ( ( ruleOperation ) )
            // InternalDsl.g:1874:2: ( ruleOperation )
            {
            // InternalDsl.g:1874:2: ( ruleOperation )
            // InternalDsl.g:1875:3: ruleOperation
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
    // InternalDsl.g:1884:1: rule__Submodule__EntitiesAssignment_4 : ( ( rule__Submodule__EntitiesAlternatives_4_0 ) ) ;
    public final void rule__Submodule__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1888:1: ( ( ( rule__Submodule__EntitiesAlternatives_4_0 ) ) )
            // InternalDsl.g:1889:2: ( ( rule__Submodule__EntitiesAlternatives_4_0 ) )
            {
            // InternalDsl.g:1889:2: ( ( rule__Submodule__EntitiesAlternatives_4_0 ) )
            // InternalDsl.g:1890:3: ( rule__Submodule__EntitiesAlternatives_4_0 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAlternatives_4_0()); 
            // InternalDsl.g:1891:3: ( rule__Submodule__EntitiesAlternatives_4_0 )
            // InternalDsl.g:1891:4: rule__Submodule__EntitiesAlternatives_4_0
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


    // $ANTLR start "rule__Submodule__RelationsAssignment_5"
    // InternalDsl.g:1899:1: rule__Submodule__RelationsAssignment_5 : ( ruleRelationDom ) ;
    public final void rule__Submodule__RelationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1903:1: ( ( ruleRelationDom ) )
            // InternalDsl.g:1904:2: ( ruleRelationDom )
            {
            // InternalDsl.g:1904:2: ( ruleRelationDom )
            // InternalDsl.g:1905:3: ruleRelationDom
            {
             before(grammarAccess.getSubmoduleAccess().getRelationsRelationDomParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationDom();

            state._fsp--;

             after(grammarAccess.getSubmoduleAccess().getRelationsRelationDomParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submodule__RelationsAssignment_5"


    // $ANTLR start "rule__GeneralEntity__NameAssignment_1"
    // InternalDsl.g:1914:1: rule__GeneralEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GeneralEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1918:1: ( ( RULE_ID ) )
            // InternalDsl.g:1919:2: ( RULE_ID )
            {
            // InternalDsl.g:1919:2: ( RULE_ID )
            // InternalDsl.g:1920:3: RULE_ID
            {
             before(grammarAccess.getGeneralEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralEntity__NameAssignment_1"


    // $ANTLR start "rule__GeneralEntity__PropertiesAssignment_3"
    // InternalDsl.g:1929:1: rule__GeneralEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__GeneralEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1933:1: ( ( ruleProperty ) )
            // InternalDsl.g:1934:2: ( ruleProperty )
            {
            // InternalDsl.g:1934:2: ( ruleProperty )
            // InternalDsl.g:1935:3: ruleProperty
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


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalDsl.g:1944:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1948:1: ( ( RULE_ID ) )
            // InternalDsl.g:1949:2: ( RULE_ID )
            {
            // InternalDsl.g:1949:2: ( RULE_ID )
            // InternalDsl.g:1950:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__SpecialEntity__NameAssignment_1"
    // InternalDsl.g:1959:1: rule__SpecialEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SpecialEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1963:1: ( ( RULE_ID ) )
            // InternalDsl.g:1964:2: ( RULE_ID )
            {
            // InternalDsl.g:1964:2: ( RULE_ID )
            // InternalDsl.g:1965:3: RULE_ID
            {
             before(grammarAccess.getSpecialEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecialEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__NameAssignment_1"


    // $ANTLR start "rule__SpecialEntity__PropertiesAssignment_3"
    // InternalDsl.g:1974:1: rule__SpecialEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__SpecialEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1978:1: ( ( ruleProperty ) )
            // InternalDsl.g:1979:2: ( ruleProperty )
            {
            // InternalDsl.g:1979:2: ( ruleProperty )
            // InternalDsl.g:1980:3: ruleProperty
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


    // $ANTLR start "rule__SpecialEntity__TransactionsAssignment_5"
    // InternalDsl.g:1989:1: rule__SpecialEntity__TransactionsAssignment_5 : ( ruleTransaction ) ;
    public final void rule__SpecialEntity__TransactionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1993:1: ( ( ruleTransaction ) )
            // InternalDsl.g:1994:2: ( ruleTransaction )
            {
            // InternalDsl.g:1994:2: ( ruleTransaction )
            // InternalDsl.g:1995:3: ruleTransaction
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsTransactionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getSpecialEntityAccess().getTransactionsTransactionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialEntity__TransactionsAssignment_5"


    // $ANTLR start "rule__RelationDom__TypeAssignment_0_6"
    // InternalDsl.g:2004:1: rule__RelationDom__TypeAssignment_0_6 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDom__TypeAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2008:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2009:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2009:2: ( ( RULE_ID ) )
            // InternalDsl.g:2010:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationDomAccess().getTypeSpecialEntityCrossReference_0_6_0()); 
            // InternalDsl.g:2011:3: ( RULE_ID )
            // InternalDsl.g:2012:4: RULE_ID
            {
             before(grammarAccess.getRelationDomAccess().getTypeSpecialEntityIDTerminalRuleCall_0_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getTypeSpecialEntityIDTerminalRuleCall_0_6_0_1()); 

            }

             after(grammarAccess.getRelationDomAccess().getTypeSpecialEntityCrossReference_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__TypeAssignment_0_6"


    // $ANTLR start "rule__RelationDom__TypeAssignment_1_0"
    // InternalDsl.g:2023:1: rule__RelationDom__TypeAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDom__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2027:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2028:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2028:2: ( ( RULE_ID ) )
            // InternalDsl.g:2029:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationDomAccess().getTypeGeneralEntityCrossReference_1_0_0()); 
            // InternalDsl.g:2030:3: ( RULE_ID )
            // InternalDsl.g:2031:4: RULE_ID
            {
             before(grammarAccess.getRelationDomAccess().getTypeGeneralEntityIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationDomAccess().getTypeGeneralEntityIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getRelationDomAccess().getTypeGeneralEntityCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDom__TypeAssignment_1_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});

}