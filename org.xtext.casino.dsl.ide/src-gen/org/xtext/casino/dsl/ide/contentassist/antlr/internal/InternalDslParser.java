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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Read'", "'Create'", "'exchange'", "'sale'", "'domain'", "'{'", "'}'", "'module'", "'submodule'", "'op'", "'type:'", "'operates_on:'", "'generalEntity'", "':'", "'dataType'", "'specialEntity'", "'trx'", "'rel'", "'Composition'", "'source:'", "'target:'"
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
    public static final int T__30=30;
    public static final int T__31=31;
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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalDsl.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleDomainmodel EOF )
            // InternalDsl.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDsl.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalDsl.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalDsl.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==23||(LA1_0>=25 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDsl.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleAbstractElement EOF )
            // InternalDsl.g:80:1: ruleAbstractElement EOF
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
    // InternalDsl.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalDsl.g:94:4: rule__AbstractElement__Alternatives
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


    // $ANTLR start "entryRuleDomain"
    // InternalDsl.g:103:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleDomain EOF )
            // InternalDsl.g:105:1: ruleDomain EOF
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
    // InternalDsl.g:112:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Domain__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Domain__Group__0 )
            // InternalDsl.g:119:4: rule__Domain__Group__0
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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDsl.g:477:1: rule__AbstractElement__Alternatives : ( ( ruleDomain ) | ( ruleSpecialEntity ) | ( ruleGeneralEntity ) | ( ruleType ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:481:1: ( ( ruleDomain ) | ( ruleSpecialEntity ) | ( ruleGeneralEntity ) | ( ruleType ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:482:2: ( ruleDomain )
                    {
                    // InternalDsl.g:482:2: ( ruleDomain )
                    // InternalDsl.g:483:3: ruleDomain
                    {
                     before(grammarAccess.getAbstractElementAccess().getDomainParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDomain();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getDomainParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:488:2: ( ruleSpecialEntity )
                    {
                    // InternalDsl.g:488:2: ( ruleSpecialEntity )
                    // InternalDsl.g:489:3: ruleSpecialEntity
                    {
                     before(grammarAccess.getAbstractElementAccess().getSpecialEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpecialEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getSpecialEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:494:2: ( ruleGeneralEntity )
                    {
                    // InternalDsl.g:494:2: ( ruleGeneralEntity )
                    // InternalDsl.g:495:3: ruleGeneralEntity
                    {
                     before(grammarAccess.getAbstractElementAccess().getGeneralEntityParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getGeneralEntityParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:500:2: ( ruleType )
                    {
                    // InternalDsl.g:500:2: ( ruleType )
                    // InternalDsl.g:501:3: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_3()); 

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
    // InternalDsl.g:510:1: rule__SubOperation__Alternatives : ( ( 'Read' ) | ( 'Create' ) );
    public final void rule__SubOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:514:1: ( ( 'Read' ) | ( 'Create' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:515:2: ( 'Read' )
                    {
                    // InternalDsl.g:515:2: ( 'Read' )
                    // InternalDsl.g:516:3: 'Read'
                    {
                     before(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:521:2: ( 'Create' )
                    {
                    // InternalDsl.g:521:2: ( 'Create' )
                    // InternalDsl.g:522:3: 'Create'
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
    // InternalDsl.g:531:1: rule__SubTransaction__Alternatives : ( ( 'exchange' ) | ( 'sale' ) );
    public final void rule__SubTransaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:535:1: ( ( 'exchange' ) | ( 'sale' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:536:2: ( 'exchange' )
                    {
                    // InternalDsl.g:536:2: ( 'exchange' )
                    // InternalDsl.g:537:3: 'exchange'
                    {
                     before(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:542:2: ( 'sale' )
                    {
                    // InternalDsl.g:542:2: ( 'sale' )
                    // InternalDsl.g:543:3: 'sale'
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


    // $ANTLR start "rule__Domain__Group__0"
    // InternalDsl.g:552:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:556:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalDsl.g:557:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:564:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:568:1: ( ( 'domain' ) )
            // InternalDsl.g:569:1: ( 'domain' )
            {
            // InternalDsl.g:569:1: ( 'domain' )
            // InternalDsl.g:570:2: 'domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDsl.g:579:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:583:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalDsl.g:584:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDsl.g:591:1: rule__Domain__Group__1__Impl : ( '{' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:595:1: ( ( '{' ) )
            // InternalDsl.g:596:1: ( '{' )
            {
            // InternalDsl.g:596:1: ( '{' )
            // InternalDsl.g:597:2: '{'
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
    // InternalDsl.g:606:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:610:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalDsl.g:611:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:618:1: rule__Domain__Group__2__Impl : ( ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:622:1: ( ( ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* ) ) )
            // InternalDsl.g:623:1: ( ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* ) )
            {
            // InternalDsl.g:623:1: ( ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* ) )
            // InternalDsl.g:624:2: ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* )
            {
            // InternalDsl.g:624:2: ( ( rule__Domain__ModulesAssignment_2 ) )
            // InternalDsl.g:625:3: ( rule__Domain__ModulesAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_2()); 
            // InternalDsl.g:626:3: ( rule__Domain__ModulesAssignment_2 )
            // InternalDsl.g:626:4: rule__Domain__ModulesAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__Domain__ModulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModulesAssignment_2()); 

            }

            // InternalDsl.g:629:2: ( ( rule__Domain__ModulesAssignment_2 )* )
            // InternalDsl.g:630:3: ( rule__Domain__ModulesAssignment_2 )*
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_2()); 
            // InternalDsl.g:631:3: ( rule__Domain__ModulesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:631:4: rule__Domain__ModulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Domain__ModulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getModulesAssignment_2()); 

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
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // InternalDsl.g:640:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:644:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalDsl.g:645:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:652:1: rule__Domain__Group__3__Impl : ( ( ( rule__Domain__RelationsAssignment_3 ) ) ( ( rule__Domain__RelationsAssignment_3 )* ) ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:656:1: ( ( ( ( rule__Domain__RelationsAssignment_3 ) ) ( ( rule__Domain__RelationsAssignment_3 )* ) ) )
            // InternalDsl.g:657:1: ( ( ( rule__Domain__RelationsAssignment_3 ) ) ( ( rule__Domain__RelationsAssignment_3 )* ) )
            {
            // InternalDsl.g:657:1: ( ( ( rule__Domain__RelationsAssignment_3 ) ) ( ( rule__Domain__RelationsAssignment_3 )* ) )
            // InternalDsl.g:658:2: ( ( rule__Domain__RelationsAssignment_3 ) ) ( ( rule__Domain__RelationsAssignment_3 )* )
            {
            // InternalDsl.g:658:2: ( ( rule__Domain__RelationsAssignment_3 ) )
            // InternalDsl.g:659:3: ( rule__Domain__RelationsAssignment_3 )
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_3()); 
            // InternalDsl.g:660:3: ( rule__Domain__RelationsAssignment_3 )
            // InternalDsl.g:660:4: rule__Domain__RelationsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Domain__RelationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getRelationsAssignment_3()); 

            }

            // InternalDsl.g:663:2: ( ( rule__Domain__RelationsAssignment_3 )* )
            // InternalDsl.g:664:3: ( rule__Domain__RelationsAssignment_3 )*
            {
             before(grammarAccess.getDomainAccess().getRelationsAssignment_3()); 
            // InternalDsl.g:665:3: ( rule__Domain__RelationsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:665:4: rule__Domain__RelationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Domain__RelationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getRelationsAssignment_3()); 

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
    // InternalDsl.g:674:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:678:1: ( rule__Domain__Group__4__Impl )
            // InternalDsl.g:679:2: rule__Domain__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:685:1: rule__Domain__Group__4__Impl : ( '}' ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:689:1: ( ( '}' ) )
            // InternalDsl.g:690:1: ( '}' )
            {
            // InternalDsl.g:690:1: ( '}' )
            // InternalDsl.g:691:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Module__Group__0"
    // InternalDsl.g:701:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:705:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalDsl.g:706:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:713:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:717:1: ( ( 'module' ) )
            // InternalDsl.g:718:1: ( 'module' )
            {
            // InternalDsl.g:718:1: ( 'module' )
            // InternalDsl.g:719:2: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:728:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:732:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalDsl.g:733:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:740:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:744:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalDsl.g:745:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalDsl.g:745:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalDsl.g:746:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalDsl.g:747:2: ( rule__Module__NameAssignment_1 )
            // InternalDsl.g:747:3: rule__Module__NameAssignment_1
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
    // InternalDsl.g:755:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:759:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalDsl.g:760:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:767:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:771:1: ( ( '{' ) )
            // InternalDsl.g:772:1: ( '{' )
            {
            // InternalDsl.g:772:1: ( '{' )
            // InternalDsl.g:773:2: '{'
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
    // InternalDsl.g:782:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:786:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalDsl.g:787:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:794:1: rule__Module__Group__3__Impl : ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:798:1: ( ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) )
            // InternalDsl.g:799:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            {
            // InternalDsl.g:799:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            // InternalDsl.g:800:2: ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* )
            {
            // InternalDsl.g:800:2: ( ( rule__Module__SubmodulesAssignment_3 ) )
            // InternalDsl.g:801:3: ( rule__Module__SubmodulesAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:802:3: ( rule__Module__SubmodulesAssignment_3 )
            // InternalDsl.g:802:4: rule__Module__SubmodulesAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__Module__SubmodulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 

            }

            // InternalDsl.g:805:2: ( ( rule__Module__SubmodulesAssignment_3 )* )
            // InternalDsl.g:806:3: ( rule__Module__SubmodulesAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:807:3: ( rule__Module__SubmodulesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:807:4: rule__Module__SubmodulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalDsl.g:816:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:820:1: ( rule__Module__Group__4__Impl )
            // InternalDsl.g:821:2: rule__Module__Group__4__Impl
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
    // InternalDsl.g:827:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:831:1: ( ( '}' ) )
            // InternalDsl.g:832:1: ( '}' )
            {
            // InternalDsl.g:832:1: ( '}' )
            // InternalDsl.g:833:2: '}'
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
    // InternalDsl.g:843:1: rule__Submodule__Group__0 : rule__Submodule__Group__0__Impl rule__Submodule__Group__1 ;
    public final void rule__Submodule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:847:1: ( rule__Submodule__Group__0__Impl rule__Submodule__Group__1 )
            // InternalDsl.g:848:2: rule__Submodule__Group__0__Impl rule__Submodule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:855:1: rule__Submodule__Group__0__Impl : ( 'submodule' ) ;
    public final void rule__Submodule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:859:1: ( ( 'submodule' ) )
            // InternalDsl.g:860:1: ( 'submodule' )
            {
            // InternalDsl.g:860:1: ( 'submodule' )
            // InternalDsl.g:861:2: 'submodule'
            {
             before(grammarAccess.getSubmoduleAccess().getSubmoduleKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDsl.g:870:1: rule__Submodule__Group__1 : rule__Submodule__Group__1__Impl rule__Submodule__Group__2 ;
    public final void rule__Submodule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:874:1: ( rule__Submodule__Group__1__Impl rule__Submodule__Group__2 )
            // InternalDsl.g:875:2: rule__Submodule__Group__1__Impl rule__Submodule__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:882:1: rule__Submodule__Group__1__Impl : ( ( rule__Submodule__NameAssignment_1 ) ) ;
    public final void rule__Submodule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:886:1: ( ( ( rule__Submodule__NameAssignment_1 ) ) )
            // InternalDsl.g:887:1: ( ( rule__Submodule__NameAssignment_1 ) )
            {
            // InternalDsl.g:887:1: ( ( rule__Submodule__NameAssignment_1 ) )
            // InternalDsl.g:888:2: ( rule__Submodule__NameAssignment_1 )
            {
             before(grammarAccess.getSubmoduleAccess().getNameAssignment_1()); 
            // InternalDsl.g:889:2: ( rule__Submodule__NameAssignment_1 )
            // InternalDsl.g:889:3: rule__Submodule__NameAssignment_1
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
    // InternalDsl.g:897:1: rule__Submodule__Group__2 : rule__Submodule__Group__2__Impl rule__Submodule__Group__3 ;
    public final void rule__Submodule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:901:1: ( rule__Submodule__Group__2__Impl rule__Submodule__Group__3 )
            // InternalDsl.g:902:2: rule__Submodule__Group__2__Impl rule__Submodule__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:909:1: rule__Submodule__Group__2__Impl : ( '{' ) ;
    public final void rule__Submodule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:913:1: ( ( '{' ) )
            // InternalDsl.g:914:1: ( '{' )
            {
            // InternalDsl.g:914:1: ( '{' )
            // InternalDsl.g:915:2: '{'
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
    // InternalDsl.g:924:1: rule__Submodule__Group__3 : rule__Submodule__Group__3__Impl rule__Submodule__Group__4 ;
    public final void rule__Submodule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:928:1: ( rule__Submodule__Group__3__Impl rule__Submodule__Group__4 )
            // InternalDsl.g:929:2: rule__Submodule__Group__3__Impl rule__Submodule__Group__4
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
    // InternalDsl.g:936:1: rule__Submodule__Group__3__Impl : ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) ;
    public final void rule__Submodule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:940:1: ( ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) )
            // InternalDsl.g:941:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            {
            // InternalDsl.g:941:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            // InternalDsl.g:942:2: ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* )
            {
            // InternalDsl.g:942:2: ( ( rule__Submodule__OperationsAssignment_3 ) )
            // InternalDsl.g:943:3: ( rule__Submodule__OperationsAssignment_3 )
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:944:3: ( rule__Submodule__OperationsAssignment_3 )
            // InternalDsl.g:944:4: rule__Submodule__OperationsAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__Submodule__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 

            }

            // InternalDsl.g:947:2: ( ( rule__Submodule__OperationsAssignment_3 )* )
            // InternalDsl.g:948:3: ( rule__Submodule__OperationsAssignment_3 )*
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:949:3: ( rule__Submodule__OperationsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:949:4: rule__Submodule__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalDsl.g:958:1: rule__Submodule__Group__4 : rule__Submodule__Group__4__Impl rule__Submodule__Group__5 ;
    public final void rule__Submodule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:962:1: ( rule__Submodule__Group__4__Impl rule__Submodule__Group__5 )
            // InternalDsl.g:963:2: rule__Submodule__Group__4__Impl rule__Submodule__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:970:1: rule__Submodule__Group__4__Impl : ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) ;
    public final void rule__Submodule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:974:1: ( ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) )
            // InternalDsl.g:975:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            {
            // InternalDsl.g:975:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            // InternalDsl.g:976:2: ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* )
            {
            // InternalDsl.g:976:2: ( ( rule__Submodule__EntitiesAssignment_4 ) )
            // InternalDsl.g:977:3: ( rule__Submodule__EntitiesAssignment_4 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:978:3: ( rule__Submodule__EntitiesAssignment_4 )
            // InternalDsl.g:978:4: rule__Submodule__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_15);
            rule__Submodule__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 

            }

            // InternalDsl.g:981:2: ( ( rule__Submodule__EntitiesAssignment_4 )* )
            // InternalDsl.g:982:3: ( rule__Submodule__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:983:3: ( rule__Submodule__EntitiesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:983:4: rule__Submodule__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalDsl.g:992:1: rule__Submodule__Group__5 : rule__Submodule__Group__5__Impl ;
    public final void rule__Submodule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:996:1: ( rule__Submodule__Group__5__Impl )
            // InternalDsl.g:997:2: rule__Submodule__Group__5__Impl
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
    // InternalDsl.g:1003:1: rule__Submodule__Group__5__Impl : ( '}' ) ;
    public final void rule__Submodule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1007:1: ( ( '}' ) )
            // InternalDsl.g:1008:1: ( '}' )
            {
            // InternalDsl.g:1008:1: ( '}' )
            // InternalDsl.g:1009:2: '}'
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
    // InternalDsl.g:1019:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1023:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalDsl.g:1024:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:1031:1: rule__Operation__Group__0__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1035:1: ( ( 'op' ) )
            // InternalDsl.g:1036:1: ( 'op' )
            {
            // InternalDsl.g:1036:1: ( 'op' )
            // InternalDsl.g:1037:2: 'op'
            {
             before(grammarAccess.getOperationAccess().getOpKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDsl.g:1046:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1050:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalDsl.g:1051:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
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
    // InternalDsl.g:1058:1: rule__Operation__Group__1__Impl : ( '{' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1062:1: ( ( '{' ) )
            // InternalDsl.g:1063:1: ( '{' )
            {
            // InternalDsl.g:1063:1: ( '{' )
            // InternalDsl.g:1064:2: '{'
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
    // InternalDsl.g:1073:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1077:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalDsl.g:1078:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1085:1: rule__Operation__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1089:1: ( ( 'type:' ) )
            // InternalDsl.g:1090:1: ( 'type:' )
            {
            // InternalDsl.g:1090:1: ( 'type:' )
            // InternalDsl.g:1091:2: 'type:'
            {
             before(grammarAccess.getOperationAccess().getTypeKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDsl.g:1100:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1104:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalDsl.g:1105:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1112:1: rule__Operation__Group__3__Impl : ( ruleSubOperation ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1116:1: ( ( ruleSubOperation ) )
            // InternalDsl.g:1117:1: ( ruleSubOperation )
            {
            // InternalDsl.g:1117:1: ( ruleSubOperation )
            // InternalDsl.g:1118:2: ruleSubOperation
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
    // InternalDsl.g:1127:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1131:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalDsl.g:1132:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1139:1: rule__Operation__Group__4__Impl : ( 'operates_on:' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1143:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:1144:1: ( 'operates_on:' )
            {
            // InternalDsl.g:1144:1: ( 'operates_on:' )
            // InternalDsl.g:1145:2: 'operates_on:'
            {
             before(grammarAccess.getOperationAccess().getOperates_onKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:1154:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1158:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalDsl.g:1159:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1166:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__TargetAssignment_5 ) ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1170:1: ( ( ( rule__Operation__TargetAssignment_5 ) ) )
            // InternalDsl.g:1171:1: ( ( rule__Operation__TargetAssignment_5 ) )
            {
            // InternalDsl.g:1171:1: ( ( rule__Operation__TargetAssignment_5 ) )
            // InternalDsl.g:1172:2: ( rule__Operation__TargetAssignment_5 )
            {
             before(grammarAccess.getOperationAccess().getTargetAssignment_5()); 
            // InternalDsl.g:1173:2: ( rule__Operation__TargetAssignment_5 )
            // InternalDsl.g:1173:3: rule__Operation__TargetAssignment_5
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
    // InternalDsl.g:1181:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1185:1: ( rule__Operation__Group__6__Impl )
            // InternalDsl.g:1186:2: rule__Operation__Group__6__Impl
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
    // InternalDsl.g:1192:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1196:1: ( ( '}' ) )
            // InternalDsl.g:1197:1: ( '}' )
            {
            // InternalDsl.g:1197:1: ( '}' )
            // InternalDsl.g:1198:2: '}'
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
    // InternalDsl.g:1208:1: rule__GeneralEntity__Group__0 : rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 ;
    public final void rule__GeneralEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1212:1: ( rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 )
            // InternalDsl.g:1213:2: rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1220:1: rule__GeneralEntity__Group__0__Impl : ( 'generalEntity' ) ;
    public final void rule__GeneralEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1224:1: ( ( 'generalEntity' ) )
            // InternalDsl.g:1225:1: ( 'generalEntity' )
            {
            // InternalDsl.g:1225:1: ( 'generalEntity' )
            // InternalDsl.g:1226:2: 'generalEntity'
            {
             before(grammarAccess.getGeneralEntityAccess().getGeneralEntityKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:1235:1: rule__GeneralEntity__Group__1 : rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 ;
    public final void rule__GeneralEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1239:1: ( rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 )
            // InternalDsl.g:1240:2: rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:1247:1: rule__GeneralEntity__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__GeneralEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1251:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:1252:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:1252:1: ( ruleQualifiedName )
            // InternalDsl.g:1253:2: ruleQualifiedName
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
    // InternalDsl.g:1262:1: rule__GeneralEntity__Group__2 : rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 ;
    public final void rule__GeneralEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1266:1: ( rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 )
            // InternalDsl.g:1267:2: rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1274:1: rule__GeneralEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1278:1: ( ( '{' ) )
            // InternalDsl.g:1279:1: ( '{' )
            {
            // InternalDsl.g:1279:1: ( '{' )
            // InternalDsl.g:1280:2: '{'
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
    // InternalDsl.g:1289:1: rule__GeneralEntity__Group__3 : rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 ;
    public final void rule__GeneralEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1293:1: ( rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 )
            // InternalDsl.g:1294:2: rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1301:1: rule__GeneralEntity__Group__3__Impl : ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__GeneralEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1305:1: ( ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1306:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1306:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1307:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1307:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1308:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1309:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1309:4: rule__GeneralEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__GeneralEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1312:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1313:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1314:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1314:4: rule__GeneralEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1323:1: rule__GeneralEntity__Group__4 : rule__GeneralEntity__Group__4__Impl ;
    public final void rule__GeneralEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1327:1: ( rule__GeneralEntity__Group__4__Impl )
            // InternalDsl.g:1328:2: rule__GeneralEntity__Group__4__Impl
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
    // InternalDsl.g:1334:1: rule__GeneralEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1338:1: ( ( '}' ) )
            // InternalDsl.g:1339:1: ( '}' )
            {
            // InternalDsl.g:1339:1: ( '}' )
            // InternalDsl.g:1340:2: '}'
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
    // InternalDsl.g:1350:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1354:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDsl.g:1355:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1362:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1366:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalDsl.g:1367:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalDsl.g:1367:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalDsl.g:1368:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalDsl.g:1369:2: ( rule__Property__NameAssignment_0 )
            // InternalDsl.g:1369:3: rule__Property__NameAssignment_0
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
    // InternalDsl.g:1377:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1381:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalDsl.g:1382:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1389:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1393:1: ( ( ':' ) )
            // InternalDsl.g:1394:1: ( ':' )
            {
            // InternalDsl.g:1394:1: ( ':' )
            // InternalDsl.g:1395:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDsl.g:1404:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1408:1: ( rule__Property__Group__2__Impl )
            // InternalDsl.g:1409:2: rule__Property__Group__2__Impl
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
    // InternalDsl.g:1415:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1419:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalDsl.g:1420:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalDsl.g:1420:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalDsl.g:1421:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalDsl.g:1422:2: ( rule__Property__TypeAssignment_2 )
            // InternalDsl.g:1422:3: rule__Property__TypeAssignment_2
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
    // InternalDsl.g:1431:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1435:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDsl.g:1436:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1443:1: rule__Type__Group__0__Impl : ( 'dataType' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1447:1: ( ( 'dataType' ) )
            // InternalDsl.g:1448:1: ( 'dataType' )
            {
            // InternalDsl.g:1448:1: ( 'dataType' )
            // InternalDsl.g:1449:2: 'dataType'
            {
             before(grammarAccess.getTypeAccess().getDataTypeKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDsl.g:1458:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1462:1: ( rule__Type__Group__1__Impl )
            // InternalDsl.g:1463:2: rule__Type__Group__1__Impl
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
    // InternalDsl.g:1469:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1473:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalDsl.g:1474:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalDsl.g:1474:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalDsl.g:1475:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalDsl.g:1476:2: ( rule__Type__NameAssignment_1 )
            // InternalDsl.g:1476:3: rule__Type__NameAssignment_1
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
    // InternalDsl.g:1485:1: rule__SpecialEntity__Group__0 : rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 ;
    public final void rule__SpecialEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1489:1: ( rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 )
            // InternalDsl.g:1490:2: rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1497:1: rule__SpecialEntity__Group__0__Impl : ( 'specialEntity' ) ;
    public final void rule__SpecialEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1501:1: ( ( 'specialEntity' ) )
            // InternalDsl.g:1502:1: ( 'specialEntity' )
            {
            // InternalDsl.g:1502:1: ( 'specialEntity' )
            // InternalDsl.g:1503:2: 'specialEntity'
            {
             before(grammarAccess.getSpecialEntityAccess().getSpecialEntityKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDsl.g:1512:1: rule__SpecialEntity__Group__1 : rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 ;
    public final void rule__SpecialEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1516:1: ( rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 )
            // InternalDsl.g:1517:2: rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:1524:1: rule__SpecialEntity__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__SpecialEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1528:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:1529:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:1529:1: ( ruleQualifiedName )
            // InternalDsl.g:1530:2: ruleQualifiedName
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
    // InternalDsl.g:1539:1: rule__SpecialEntity__Group__2 : rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 ;
    public final void rule__SpecialEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1543:1: ( rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 )
            // InternalDsl.g:1544:2: rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1551:1: rule__SpecialEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SpecialEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1555:1: ( ( '{' ) )
            // InternalDsl.g:1556:1: ( '{' )
            {
            // InternalDsl.g:1556:1: ( '{' )
            // InternalDsl.g:1557:2: '{'
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
    // InternalDsl.g:1566:1: rule__SpecialEntity__Group__3 : rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 ;
    public final void rule__SpecialEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1570:1: ( rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 )
            // InternalDsl.g:1571:2: rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:1578:1: rule__SpecialEntity__Group__3__Impl : ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__SpecialEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1582:1: ( ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1583:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1583:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1584:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1584:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1585:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1586:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1586:4: rule__SpecialEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__SpecialEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1589:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1590:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1591:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1591:4: rule__SpecialEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1600:1: rule__SpecialEntity__Group__4 : rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 ;
    public final void rule__SpecialEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1604:1: ( rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 )
            // InternalDsl.g:1605:2: rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1612:1: rule__SpecialEntity__Group__4__Impl : ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) ;
    public final void rule__SpecialEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1616:1: ( ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) )
            // InternalDsl.g:1617:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            {
            // InternalDsl.g:1617:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            // InternalDsl.g:1618:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            {
            // InternalDsl.g:1618:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) )
            // InternalDsl.g:1619:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:1620:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            // InternalDsl.g:1620:4: rule__SpecialEntity__TransactionsAssignment_4
            {
            pushFollow(FOLLOW_21);
            rule__SpecialEntity__TransactionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 

            }

            // InternalDsl.g:1623:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            // InternalDsl.g:1624:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:1625:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1625:4: rule__SpecialEntity__TransactionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalDsl.g:1634:1: rule__SpecialEntity__Group__5 : rule__SpecialEntity__Group__5__Impl ;
    public final void rule__SpecialEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1638:1: ( rule__SpecialEntity__Group__5__Impl )
            // InternalDsl.g:1639:2: rule__SpecialEntity__Group__5__Impl
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
    // InternalDsl.g:1645:1: rule__SpecialEntity__Group__5__Impl : ( '}' ) ;
    public final void rule__SpecialEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1649:1: ( ( '}' ) )
            // InternalDsl.g:1650:1: ( '}' )
            {
            // InternalDsl.g:1650:1: ( '}' )
            // InternalDsl.g:1651:2: '}'
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
    // InternalDsl.g:1661:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1665:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalDsl.g:1666:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:1673:1: rule__Transaction__Group__0__Impl : ( 'trx' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1677:1: ( ( 'trx' ) )
            // InternalDsl.g:1678:1: ( 'trx' )
            {
            // InternalDsl.g:1678:1: ( 'trx' )
            // InternalDsl.g:1679:2: 'trx'
            {
             before(grammarAccess.getTransactionAccess().getTrxKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:1688:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1692:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalDsl.g:1693:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1700:1: rule__Transaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1704:1: ( ( '{' ) )
            // InternalDsl.g:1705:1: ( '{' )
            {
            // InternalDsl.g:1705:1: ( '{' )
            // InternalDsl.g:1706:2: '{'
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
    // InternalDsl.g:1715:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1719:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalDsl.g:1720:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalDsl.g:1727:1: rule__Transaction__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1731:1: ( ( 'type:' ) )
            // InternalDsl.g:1732:1: ( 'type:' )
            {
            // InternalDsl.g:1732:1: ( 'type:' )
            // InternalDsl.g:1733:2: 'type:'
            {
             before(grammarAccess.getTransactionAccess().getTypeKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDsl.g:1742:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1746:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalDsl.g:1747:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1754:1: rule__Transaction__Group__3__Impl : ( ruleSubTransaction ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1758:1: ( ( ruleSubTransaction ) )
            // InternalDsl.g:1759:1: ( ruleSubTransaction )
            {
            // InternalDsl.g:1759:1: ( ruleSubTransaction )
            // InternalDsl.g:1760:2: ruleSubTransaction
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
    // InternalDsl.g:1769:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1773:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalDsl.g:1774:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1781:1: rule__Transaction__Group__4__Impl : ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1785:1: ( ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) )
            // InternalDsl.g:1786:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            {
            // InternalDsl.g:1786:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            // InternalDsl.g:1787:2: ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* )
            {
            // InternalDsl.g:1787:2: ( ( rule__Transaction__OperatesonAssignment_4 ) )
            // InternalDsl.g:1788:3: ( rule__Transaction__OperatesonAssignment_4 )
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:1789:3: ( rule__Transaction__OperatesonAssignment_4 )
            // InternalDsl.g:1789:4: rule__Transaction__OperatesonAssignment_4
            {
            pushFollow(FOLLOW_23);
            rule__Transaction__OperatesonAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 

            }

            // InternalDsl.g:1792:2: ( ( rule__Transaction__OperatesonAssignment_4 )* )
            // InternalDsl.g:1793:3: ( rule__Transaction__OperatesonAssignment_4 )*
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:1794:3: ( rule__Transaction__OperatesonAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1794:4: rule__Transaction__OperatesonAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalDsl.g:1803:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1807:1: ( rule__Transaction__Group__5__Impl )
            // InternalDsl.g:1808:2: rule__Transaction__Group__5__Impl
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
    // InternalDsl.g:1814:1: rule__Transaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1818:1: ( ( '}' ) )
            // InternalDsl.g:1819:1: ( '}' )
            {
            // InternalDsl.g:1819:1: ( '}' )
            // InternalDsl.g:1820:2: '}'
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
    // InternalDsl.g:1830:1: rule__Operateson__Group__0 : rule__Operateson__Group__0__Impl rule__Operateson__Group__1 ;
    public final void rule__Operateson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1834:1: ( rule__Operateson__Group__0__Impl rule__Operateson__Group__1 )
            // InternalDsl.g:1835:2: rule__Operateson__Group__0__Impl rule__Operateson__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1842:1: rule__Operateson__Group__0__Impl : ( 'operates_on:' ) ;
    public final void rule__Operateson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1846:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:1847:1: ( 'operates_on:' )
            {
            // InternalDsl.g:1847:1: ( 'operates_on:' )
            // InternalDsl.g:1848:2: 'operates_on:'
            {
             before(grammarAccess.getOperatesonAccess().getOperates_onKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:1857:1: rule__Operateson__Group__1 : rule__Operateson__Group__1__Impl ;
    public final void rule__Operateson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1861:1: ( rule__Operateson__Group__1__Impl )
            // InternalDsl.g:1862:2: rule__Operateson__Group__1__Impl
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
    // InternalDsl.g:1868:1: rule__Operateson__Group__1__Impl : ( ( rule__Operateson__TypeAssignment_1 ) ) ;
    public final void rule__Operateson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1872:1: ( ( ( rule__Operateson__TypeAssignment_1 ) ) )
            // InternalDsl.g:1873:1: ( ( rule__Operateson__TypeAssignment_1 ) )
            {
            // InternalDsl.g:1873:1: ( ( rule__Operateson__TypeAssignment_1 ) )
            // InternalDsl.g:1874:2: ( rule__Operateson__TypeAssignment_1 )
            {
             before(grammarAccess.getOperatesonAccess().getTypeAssignment_1()); 
            // InternalDsl.g:1875:2: ( rule__Operateson__TypeAssignment_1 )
            // InternalDsl.g:1875:3: rule__Operateson__TypeAssignment_1
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
    // InternalDsl.g:1884:1: rule__RelationDom__Group__0 : rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 ;
    public final void rule__RelationDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1888:1: ( rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 )
            // InternalDsl.g:1889:2: rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:1896:1: rule__RelationDom__Group__0__Impl : ( 'rel' ) ;
    public final void rule__RelationDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1900:1: ( ( 'rel' ) )
            // InternalDsl.g:1901:1: ( 'rel' )
            {
            // InternalDsl.g:1901:1: ( 'rel' )
            // InternalDsl.g:1902:2: 'rel'
            {
             before(grammarAccess.getRelationDomAccess().getRelKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:1911:1: rule__RelationDom__Group__1 : rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 ;
    public final void rule__RelationDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1915:1: ( rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 )
            // InternalDsl.g:1916:2: rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1923:1: rule__RelationDom__Group__1__Impl : ( '{' ) ;
    public final void rule__RelationDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1927:1: ( ( '{' ) )
            // InternalDsl.g:1928:1: ( '{' )
            {
            // InternalDsl.g:1928:1: ( '{' )
            // InternalDsl.g:1929:2: '{'
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
    // InternalDsl.g:1938:1: rule__RelationDom__Group__2 : rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 ;
    public final void rule__RelationDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1942:1: ( rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 )
            // InternalDsl.g:1943:2: rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:1950:1: rule__RelationDom__Group__2__Impl : ( 'type:' ) ;
    public final void rule__RelationDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1954:1: ( ( 'type:' ) )
            // InternalDsl.g:1955:1: ( 'type:' )
            {
            // InternalDsl.g:1955:1: ( 'type:' )
            // InternalDsl.g:1956:2: 'type:'
            {
             before(grammarAccess.getRelationDomAccess().getTypeKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDsl.g:1965:1: rule__RelationDom__Group__3 : rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 ;
    public final void rule__RelationDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1969:1: ( rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 )
            // InternalDsl.g:1970:2: rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:1977:1: rule__RelationDom__Group__3__Impl : ( 'Composition' ) ;
    public final void rule__RelationDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1981:1: ( ( 'Composition' ) )
            // InternalDsl.g:1982:1: ( 'Composition' )
            {
            // InternalDsl.g:1982:1: ( 'Composition' )
            // InternalDsl.g:1983:2: 'Composition'
            {
             before(grammarAccess.getRelationDomAccess().getCompositionKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDsl.g:1992:1: rule__RelationDom__Group__4 : rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 ;
    public final void rule__RelationDom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1996:1: ( rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 )
            // InternalDsl.g:1997:2: rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:2004:1: rule__RelationDom__Group__4__Impl : ( 'source:' ) ;
    public final void rule__RelationDom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2008:1: ( ( 'source:' ) )
            // InternalDsl.g:2009:1: ( 'source:' )
            {
            // InternalDsl.g:2009:1: ( 'source:' )
            // InternalDsl.g:2010:2: 'source:'
            {
             before(grammarAccess.getRelationDomAccess().getSourceKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDsl.g:2019:1: rule__RelationDom__Group__5 : rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 ;
    public final void rule__RelationDom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2023:1: ( rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 )
            // InternalDsl.g:2024:2: rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalDsl.g:2031:1: rule__RelationDom__Group__5__Impl : ( ( rule__RelationDom__TypeAssignment_5 ) ) ;
    public final void rule__RelationDom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2035:1: ( ( ( rule__RelationDom__TypeAssignment_5 ) ) )
            // InternalDsl.g:2036:1: ( ( rule__RelationDom__TypeAssignment_5 ) )
            {
            // InternalDsl.g:2036:1: ( ( rule__RelationDom__TypeAssignment_5 ) )
            // InternalDsl.g:2037:2: ( rule__RelationDom__TypeAssignment_5 )
            {
             before(grammarAccess.getRelationDomAccess().getTypeAssignment_5()); 
            // InternalDsl.g:2038:2: ( rule__RelationDom__TypeAssignment_5 )
            // InternalDsl.g:2038:3: rule__RelationDom__TypeAssignment_5
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
    // InternalDsl.g:2046:1: rule__RelationDom__Group__6 : rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 ;
    public final void rule__RelationDom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2050:1: ( rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 )
            // InternalDsl.g:2051:2: rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:2058:1: rule__RelationDom__Group__6__Impl : ( 'target:' ) ;
    public final void rule__RelationDom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2062:1: ( ( 'target:' ) )
            // InternalDsl.g:2063:1: ( 'target:' )
            {
            // InternalDsl.g:2063:1: ( 'target:' )
            // InternalDsl.g:2064:2: 'target:'
            {
             before(grammarAccess.getRelationDomAccess().getTargetKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDsl.g:2073:1: rule__RelationDom__Group__7 : rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 ;
    public final void rule__RelationDom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2077:1: ( rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 )
            // InternalDsl.g:2078:2: rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:2085:1: rule__RelationDom__Group__7__Impl : ( ( rule__RelationDom__TargetAssignment_7 ) ) ;
    public final void rule__RelationDom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2089:1: ( ( ( rule__RelationDom__TargetAssignment_7 ) ) )
            // InternalDsl.g:2090:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            {
            // InternalDsl.g:2090:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            // InternalDsl.g:2091:2: ( rule__RelationDom__TargetAssignment_7 )
            {
             before(grammarAccess.getRelationDomAccess().getTargetAssignment_7()); 
            // InternalDsl.g:2092:2: ( rule__RelationDom__TargetAssignment_7 )
            // InternalDsl.g:2092:3: rule__RelationDom__TargetAssignment_7
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
    // InternalDsl.g:2100:1: rule__RelationDom__Group__8 : rule__RelationDom__Group__8__Impl ;
    public final void rule__RelationDom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2104:1: ( rule__RelationDom__Group__8__Impl )
            // InternalDsl.g:2105:2: rule__RelationDom__Group__8__Impl
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
    // InternalDsl.g:2111:1: rule__RelationDom__Group__8__Impl : ( '}' ) ;
    public final void rule__RelationDom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2115:1: ( ( '}' ) )
            // InternalDsl.g:2116:1: ( '}' )
            {
            // InternalDsl.g:2116:1: ( '}' )
            // InternalDsl.g:2117:2: '}'
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


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalDsl.g:2127:1: rule__Domainmodel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2131:1: ( ( ruleAbstractElement ) )
            // InternalDsl.g:2132:2: ( ruleAbstractElement )
            {
            // InternalDsl.g:2132:2: ( ruleAbstractElement )
            // InternalDsl.g:2133:3: ruleAbstractElement
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__Domain__ModulesAssignment_2"
    // InternalDsl.g:2142:1: rule__Domain__ModulesAssignment_2 : ( ruleModule ) ;
    public final void rule__Domain__ModulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2146:1: ( ( ruleModule ) )
            // InternalDsl.g:2147:2: ( ruleModule )
            {
            // InternalDsl.g:2147:2: ( ruleModule )
            // InternalDsl.g:2148:3: ruleModule
            {
             before(grammarAccess.getDomainAccess().getModulesModuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getModulesModuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ModulesAssignment_2"


    // $ANTLR start "rule__Domain__RelationsAssignment_3"
    // InternalDsl.g:2157:1: rule__Domain__RelationsAssignment_3 : ( ruleRelationDom ) ;
    public final void rule__Domain__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2161:1: ( ( ruleRelationDom ) )
            // InternalDsl.g:2162:2: ( ruleRelationDom )
            {
            // InternalDsl.g:2162:2: ( ruleRelationDom )
            // InternalDsl.g:2163:3: ruleRelationDom
            {
             before(grammarAccess.getDomainAccess().getRelationsRelationDomParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationDom();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getRelationsRelationDomParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__RelationsAssignment_3"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // InternalDsl.g:2172:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2176:1: ( ( RULE_ID ) )
            // InternalDsl.g:2177:2: ( RULE_ID )
            {
            // InternalDsl.g:2177:2: ( RULE_ID )
            // InternalDsl.g:2178:3: RULE_ID
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
    // InternalDsl.g:2187:1: rule__Module__SubmodulesAssignment_3 : ( ruleSubmodule ) ;
    public final void rule__Module__SubmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2191:1: ( ( ruleSubmodule ) )
            // InternalDsl.g:2192:2: ( ruleSubmodule )
            {
            // InternalDsl.g:2192:2: ( ruleSubmodule )
            // InternalDsl.g:2193:3: ruleSubmodule
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
    // InternalDsl.g:2202:1: rule__Submodule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Submodule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2206:1: ( ( RULE_ID ) )
            // InternalDsl.g:2207:2: ( RULE_ID )
            {
            // InternalDsl.g:2207:2: ( RULE_ID )
            // InternalDsl.g:2208:3: RULE_ID
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
    // InternalDsl.g:2217:1: rule__Submodule__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Submodule__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2221:1: ( ( ruleOperation ) )
            // InternalDsl.g:2222:2: ( ruleOperation )
            {
            // InternalDsl.g:2222:2: ( ruleOperation )
            // InternalDsl.g:2223:3: ruleOperation
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
    // InternalDsl.g:2232:1: rule__Submodule__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Submodule__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2236:1: ( ( ruleEntity ) )
            // InternalDsl.g:2237:2: ( ruleEntity )
            {
            // InternalDsl.g:2237:2: ( ruleEntity )
            // InternalDsl.g:2238:3: ruleEntity
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
    // InternalDsl.g:2247:1: rule__Entity__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Entity__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2251:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2252:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2252:2: ( ( RULE_ID ) )
            // InternalDsl.g:2253:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getTypeQualifiedNameCrossReference_0()); 
            // InternalDsl.g:2254:3: ( RULE_ID )
            // InternalDsl.g:2255:4: RULE_ID
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
    // InternalDsl.g:2266:1: rule__QualifiedName__NameAssignment : ( RULE_ID ) ;
    public final void rule__QualifiedName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2270:1: ( ( RULE_ID ) )
            // InternalDsl.g:2271:2: ( RULE_ID )
            {
            // InternalDsl.g:2271:2: ( RULE_ID )
            // InternalDsl.g:2272:3: RULE_ID
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
    // InternalDsl.g:2281:1: rule__Operation__TargetAssignment_5 : ( ruleEntity ) ;
    public final void rule__Operation__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2285:1: ( ( ruleEntity ) )
            // InternalDsl.g:2286:2: ( ruleEntity )
            {
            // InternalDsl.g:2286:2: ( ruleEntity )
            // InternalDsl.g:2287:3: ruleEntity
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
    // InternalDsl.g:2296:1: rule__GeneralEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__GeneralEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2300:1: ( ( ruleProperty ) )
            // InternalDsl.g:2301:2: ( ruleProperty )
            {
            // InternalDsl.g:2301:2: ( ruleProperty )
            // InternalDsl.g:2302:3: ruleProperty
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
    // InternalDsl.g:2311:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2315:1: ( ( RULE_ID ) )
            // InternalDsl.g:2316:2: ( RULE_ID )
            {
            // InternalDsl.g:2316:2: ( RULE_ID )
            // InternalDsl.g:2317:3: RULE_ID
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
    // InternalDsl.g:2326:1: rule__Property__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2330:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2331:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2331:2: ( ( RULE_ID ) )
            // InternalDsl.g:2332:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 
            // InternalDsl.g:2333:3: ( RULE_ID )
            // InternalDsl.g:2334:4: RULE_ID
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
    // InternalDsl.g:2345:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2349:1: ( ( RULE_ID ) )
            // InternalDsl.g:2350:2: ( RULE_ID )
            {
            // InternalDsl.g:2350:2: ( RULE_ID )
            // InternalDsl.g:2351:3: RULE_ID
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
    // InternalDsl.g:2360:1: rule__SpecialEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__SpecialEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2364:1: ( ( ruleProperty ) )
            // InternalDsl.g:2365:2: ( ruleProperty )
            {
            // InternalDsl.g:2365:2: ( ruleProperty )
            // InternalDsl.g:2366:3: ruleProperty
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
    // InternalDsl.g:2375:1: rule__SpecialEntity__TransactionsAssignment_4 : ( ruleTransaction ) ;
    public final void rule__SpecialEntity__TransactionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2379:1: ( ( ruleTransaction ) )
            // InternalDsl.g:2380:2: ( ruleTransaction )
            {
            // InternalDsl.g:2380:2: ( ruleTransaction )
            // InternalDsl.g:2381:3: ruleTransaction
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
    // InternalDsl.g:2390:1: rule__Transaction__OperatesonAssignment_4 : ( ruleOperateson ) ;
    public final void rule__Transaction__OperatesonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2394:1: ( ( ruleOperateson ) )
            // InternalDsl.g:2395:2: ( ruleOperateson )
            {
            // InternalDsl.g:2395:2: ( ruleOperateson )
            // InternalDsl.g:2396:3: ruleOperateson
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
    // InternalDsl.g:2405:1: rule__Operateson__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Operateson__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2409:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2410:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2410:2: ( ( RULE_ID ) )
            // InternalDsl.g:2411:3: ( RULE_ID )
            {
             before(grammarAccess.getOperatesonAccess().getTypeGeneralEntityCrossReference_1_0()); 
            // InternalDsl.g:2412:3: ( RULE_ID )
            // InternalDsl.g:2413:4: RULE_ID
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
    // InternalDsl.g:2424:1: rule__RelationDom__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDom__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2428:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2429:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2429:2: ( ( RULE_ID ) )
            // InternalDsl.g:2430:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationDomAccess().getTypeGeneralEntityCrossReference_5_0()); 
            // InternalDsl.g:2431:3: ( RULE_ID )
            // InternalDsl.g:2432:4: RULE_ID
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
    // InternalDsl.g:2443:1: rule__RelationDom__TargetAssignment_7 : ( ruleEntity ) ;
    public final void rule__RelationDom__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2447:1: ( ( ruleEntity ) )
            // InternalDsl.g:2448:2: ( ruleEntity )
            {
            // InternalDsl.g:2448:2: ( ruleEntity )
            // InternalDsl.g:2449:3: ruleEntity
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000006808002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});

}