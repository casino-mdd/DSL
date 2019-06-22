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

                if ( (LA1_0==15||LA1_0==23||(LA1_0>=25 && LA1_0<=26)||LA1_0==28) ) {
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


    // $ANTLR start "entryRuleOperateson"
    // InternalDsl.g:403:1: entryRuleOperateson : ruleOperateson EOF ;
    public final void entryRuleOperateson() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleOperateson EOF )
            // InternalDsl.g:405:1: ruleOperateson EOF
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
    // InternalDsl.g:412:1: ruleOperateson : ( ( rule__Operateson__Group__0 ) ) ;
    public final void ruleOperateson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__Operateson__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__Operateson__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__Operateson__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__Operateson__Group__0 )
            {
             before(grammarAccess.getOperatesonAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__Operateson__Group__0 )
            // InternalDsl.g:419:4: rule__Operateson__Group__0
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


    // $ANTLR start "entryRuleSubTransaction"
    // InternalDsl.g:428:1: entryRuleSubTransaction : ruleSubTransaction EOF ;
    public final void entryRuleSubTransaction() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleSubTransaction EOF )
            // InternalDsl.g:430:1: ruleSubTransaction EOF
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
    // InternalDsl.g:437:1: ruleSubTransaction : ( ( rule__SubTransaction__Alternatives ) ) ;
    public final void ruleSubTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__SubTransaction__Alternatives ) ) )
            // InternalDsl.g:442:2: ( ( rule__SubTransaction__Alternatives ) )
            {
            // InternalDsl.g:442:2: ( ( rule__SubTransaction__Alternatives ) )
            // InternalDsl.g:443:3: ( rule__SubTransaction__Alternatives )
            {
             before(grammarAccess.getSubTransactionAccess().getAlternatives()); 
            // InternalDsl.g:444:3: ( rule__SubTransaction__Alternatives )
            // InternalDsl.g:444:4: rule__SubTransaction__Alternatives
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
    // InternalDsl.g:477:1: rule__AbstractElement__Alternatives : ( ( ruleDomain ) | ( ruleSpecialEntity ) | ( ruleGeneralEntity ) | ( ruleRelationDom ) | ( ruleType ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:481:1: ( ( ruleDomain ) | ( ruleSpecialEntity ) | ( ruleGeneralEntity ) | ( ruleRelationDom ) | ( ruleType ) )
            int alt2=5;
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
            case 28:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
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
                    // InternalDsl.g:500:2: ( ruleRelationDom )
                    {
                    // InternalDsl.g:500:2: ( ruleRelationDom )
                    // InternalDsl.g:501:3: ruleRelationDom
                    {
                     before(grammarAccess.getAbstractElementAccess().getRelationDomParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationDom();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getRelationDomParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:506:2: ( ruleType )
                    {
                    // InternalDsl.g:506:2: ( ruleType )
                    // InternalDsl.g:507:3: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_4()); 

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
    // InternalDsl.g:516:1: rule__SubOperation__Alternatives : ( ( 'Read' ) | ( 'Create' ) );
    public final void rule__SubOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:520:1: ( ( 'Read' ) | ( 'Create' ) )
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
                    // InternalDsl.g:521:2: ( 'Read' )
                    {
                    // InternalDsl.g:521:2: ( 'Read' )
                    // InternalDsl.g:522:3: 'Read'
                    {
                     before(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSubOperationAccess().getReadKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:527:2: ( 'Create' )
                    {
                    // InternalDsl.g:527:2: ( 'Create' )
                    // InternalDsl.g:528:3: 'Create'
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
    // InternalDsl.g:537:1: rule__SubTransaction__Alternatives : ( ( 'exchange' ) | ( 'sale' ) );
    public final void rule__SubTransaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:1: ( ( 'exchange' ) | ( 'sale' ) )
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
                    // InternalDsl.g:542:2: ( 'exchange' )
                    {
                    // InternalDsl.g:542:2: ( 'exchange' )
                    // InternalDsl.g:543:3: 'exchange'
                    {
                     before(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSubTransactionAccess().getExchangeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:548:2: ( 'sale' )
                    {
                    // InternalDsl.g:548:2: ( 'sale' )
                    // InternalDsl.g:549:3: 'sale'
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
    // InternalDsl.g:558:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:562:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalDsl.g:563:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalDsl.g:570:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:574:1: ( ( 'domain' ) )
            // InternalDsl.g:575:1: ( 'domain' )
            {
            // InternalDsl.g:575:1: ( 'domain' )
            // InternalDsl.g:576:2: 'domain'
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
    // InternalDsl.g:585:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:589:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalDsl.g:590:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
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
    // InternalDsl.g:597:1: rule__Domain__Group__1__Impl : ( '{' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:601:1: ( ( '{' ) )
            // InternalDsl.g:602:1: ( '{' )
            {
            // InternalDsl.g:602:1: ( '{' )
            // InternalDsl.g:603:2: '{'
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
    // InternalDsl.g:612:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalDsl.g:617:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
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
    // InternalDsl.g:624:1: rule__Domain__Group__2__Impl : ( ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:628:1: ( ( ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* ) ) )
            // InternalDsl.g:629:1: ( ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* ) )
            {
            // InternalDsl.g:629:1: ( ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* ) )
            // InternalDsl.g:630:2: ( ( rule__Domain__ModulesAssignment_2 ) ) ( ( rule__Domain__ModulesAssignment_2 )* )
            {
            // InternalDsl.g:630:2: ( ( rule__Domain__ModulesAssignment_2 ) )
            // InternalDsl.g:631:3: ( rule__Domain__ModulesAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_2()); 
            // InternalDsl.g:632:3: ( rule__Domain__ModulesAssignment_2 )
            // InternalDsl.g:632:4: rule__Domain__ModulesAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__Domain__ModulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModulesAssignment_2()); 

            }

            // InternalDsl.g:635:2: ( ( rule__Domain__ModulesAssignment_2 )* )
            // InternalDsl.g:636:3: ( rule__Domain__ModulesAssignment_2 )*
            {
             before(grammarAccess.getDomainAccess().getModulesAssignment_2()); 
            // InternalDsl.g:637:3: ( rule__Domain__ModulesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:637:4: rule__Domain__ModulesAssignment_2
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
    // InternalDsl.g:646:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:650:1: ( rule__Domain__Group__3__Impl )
            // InternalDsl.g:651:2: rule__Domain__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:657:1: rule__Domain__Group__3__Impl : ( '}' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:661:1: ( ( '}' ) )
            // InternalDsl.g:662:1: ( '}' )
            {
            // InternalDsl.g:662:1: ( '}' )
            // InternalDsl.g:663:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Module__Group__0"
    // InternalDsl.g:673:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:677:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalDsl.g:678:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:685:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:689:1: ( ( 'module' ) )
            // InternalDsl.g:690:1: ( 'module' )
            {
            // InternalDsl.g:690:1: ( 'module' )
            // InternalDsl.g:691:2: 'module'
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
    // InternalDsl.g:700:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:704:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalDsl.g:705:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalDsl.g:712:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalDsl.g:717:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalDsl.g:717:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalDsl.g:718:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalDsl.g:719:2: ( rule__Module__NameAssignment_1 )
            // InternalDsl.g:719:3: rule__Module__NameAssignment_1
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
    // InternalDsl.g:727:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:731:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalDsl.g:732:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:739:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:743:1: ( ( '{' ) )
            // InternalDsl.g:744:1: ( '{' )
            {
            // InternalDsl.g:744:1: ( '{' )
            // InternalDsl.g:745:2: '{'
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
    // InternalDsl.g:754:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:758:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalDsl.g:759:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:766:1: rule__Module__Group__3__Impl : ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:770:1: ( ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) ) )
            // InternalDsl.g:771:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            {
            // InternalDsl.g:771:1: ( ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* ) )
            // InternalDsl.g:772:2: ( ( rule__Module__SubmodulesAssignment_3 ) ) ( ( rule__Module__SubmodulesAssignment_3 )* )
            {
            // InternalDsl.g:772:2: ( ( rule__Module__SubmodulesAssignment_3 ) )
            // InternalDsl.g:773:3: ( rule__Module__SubmodulesAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:774:3: ( rule__Module__SubmodulesAssignment_3 )
            // InternalDsl.g:774:4: rule__Module__SubmodulesAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Module__SubmodulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 

            }

            // InternalDsl.g:777:2: ( ( rule__Module__SubmodulesAssignment_3 )* )
            // InternalDsl.g:778:3: ( rule__Module__SubmodulesAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getSubmodulesAssignment_3()); 
            // InternalDsl.g:779:3: ( rule__Module__SubmodulesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:779:4: rule__Module__SubmodulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Module__SubmodulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalDsl.g:788:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:792:1: ( rule__Module__Group__4__Impl )
            // InternalDsl.g:793:2: rule__Module__Group__4__Impl
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
    // InternalDsl.g:799:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:803:1: ( ( '}' ) )
            // InternalDsl.g:804:1: ( '}' )
            {
            // InternalDsl.g:804:1: ( '}' )
            // InternalDsl.g:805:2: '}'
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
    // InternalDsl.g:815:1: rule__Submodule__Group__0 : rule__Submodule__Group__0__Impl rule__Submodule__Group__1 ;
    public final void rule__Submodule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:819:1: ( rule__Submodule__Group__0__Impl rule__Submodule__Group__1 )
            // InternalDsl.g:820:2: rule__Submodule__Group__0__Impl rule__Submodule__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:827:1: rule__Submodule__Group__0__Impl : ( 'submodule' ) ;
    public final void rule__Submodule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:831:1: ( ( 'submodule' ) )
            // InternalDsl.g:832:1: ( 'submodule' )
            {
            // InternalDsl.g:832:1: ( 'submodule' )
            // InternalDsl.g:833:2: 'submodule'
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
    // InternalDsl.g:842:1: rule__Submodule__Group__1 : rule__Submodule__Group__1__Impl rule__Submodule__Group__2 ;
    public final void rule__Submodule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:846:1: ( rule__Submodule__Group__1__Impl rule__Submodule__Group__2 )
            // InternalDsl.g:847:2: rule__Submodule__Group__1__Impl rule__Submodule__Group__2
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
    // InternalDsl.g:854:1: rule__Submodule__Group__1__Impl : ( ( rule__Submodule__NameAssignment_1 ) ) ;
    public final void rule__Submodule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:858:1: ( ( ( rule__Submodule__NameAssignment_1 ) ) )
            // InternalDsl.g:859:1: ( ( rule__Submodule__NameAssignment_1 ) )
            {
            // InternalDsl.g:859:1: ( ( rule__Submodule__NameAssignment_1 ) )
            // InternalDsl.g:860:2: ( rule__Submodule__NameAssignment_1 )
            {
             before(grammarAccess.getSubmoduleAccess().getNameAssignment_1()); 
            // InternalDsl.g:861:2: ( rule__Submodule__NameAssignment_1 )
            // InternalDsl.g:861:3: rule__Submodule__NameAssignment_1
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
    // InternalDsl.g:869:1: rule__Submodule__Group__2 : rule__Submodule__Group__2__Impl rule__Submodule__Group__3 ;
    public final void rule__Submodule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:873:1: ( rule__Submodule__Group__2__Impl rule__Submodule__Group__3 )
            // InternalDsl.g:874:2: rule__Submodule__Group__2__Impl rule__Submodule__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:881:1: rule__Submodule__Group__2__Impl : ( '{' ) ;
    public final void rule__Submodule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:885:1: ( ( '{' ) )
            // InternalDsl.g:886:1: ( '{' )
            {
            // InternalDsl.g:886:1: ( '{' )
            // InternalDsl.g:887:2: '{'
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
    // InternalDsl.g:896:1: rule__Submodule__Group__3 : rule__Submodule__Group__3__Impl rule__Submodule__Group__4 ;
    public final void rule__Submodule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:900:1: ( rule__Submodule__Group__3__Impl rule__Submodule__Group__4 )
            // InternalDsl.g:901:2: rule__Submodule__Group__3__Impl rule__Submodule__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:908:1: rule__Submodule__Group__3__Impl : ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) ;
    public final void rule__Submodule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:912:1: ( ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) ) )
            // InternalDsl.g:913:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            {
            // InternalDsl.g:913:1: ( ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* ) )
            // InternalDsl.g:914:2: ( ( rule__Submodule__OperationsAssignment_3 ) ) ( ( rule__Submodule__OperationsAssignment_3 )* )
            {
            // InternalDsl.g:914:2: ( ( rule__Submodule__OperationsAssignment_3 ) )
            // InternalDsl.g:915:3: ( rule__Submodule__OperationsAssignment_3 )
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:916:3: ( rule__Submodule__OperationsAssignment_3 )
            // InternalDsl.g:916:4: rule__Submodule__OperationsAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__Submodule__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 

            }

            // InternalDsl.g:919:2: ( ( rule__Submodule__OperationsAssignment_3 )* )
            // InternalDsl.g:920:3: ( rule__Submodule__OperationsAssignment_3 )*
            {
             before(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3()); 
            // InternalDsl.g:921:3: ( rule__Submodule__OperationsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:921:4: rule__Submodule__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Submodule__OperationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalDsl.g:930:1: rule__Submodule__Group__4 : rule__Submodule__Group__4__Impl rule__Submodule__Group__5 ;
    public final void rule__Submodule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:934:1: ( rule__Submodule__Group__4__Impl rule__Submodule__Group__5 )
            // InternalDsl.g:935:2: rule__Submodule__Group__4__Impl rule__Submodule__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:942:1: rule__Submodule__Group__4__Impl : ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) ;
    public final void rule__Submodule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:946:1: ( ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) ) )
            // InternalDsl.g:947:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            {
            // InternalDsl.g:947:1: ( ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* ) )
            // InternalDsl.g:948:2: ( ( rule__Submodule__EntitiesAssignment_4 ) ) ( ( rule__Submodule__EntitiesAssignment_4 )* )
            {
            // InternalDsl.g:948:2: ( ( rule__Submodule__EntitiesAssignment_4 ) )
            // InternalDsl.g:949:3: ( rule__Submodule__EntitiesAssignment_4 )
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:950:3: ( rule__Submodule__EntitiesAssignment_4 )
            // InternalDsl.g:950:4: rule__Submodule__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_13);
            rule__Submodule__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 

            }

            // InternalDsl.g:953:2: ( ( rule__Submodule__EntitiesAssignment_4 )* )
            // InternalDsl.g:954:3: ( rule__Submodule__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4()); 
            // InternalDsl.g:955:3: ( rule__Submodule__EntitiesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:955:4: rule__Submodule__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Submodule__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDsl.g:964:1: rule__Submodule__Group__5 : rule__Submodule__Group__5__Impl ;
    public final void rule__Submodule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:968:1: ( rule__Submodule__Group__5__Impl )
            // InternalDsl.g:969:2: rule__Submodule__Group__5__Impl
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
    // InternalDsl.g:975:1: rule__Submodule__Group__5__Impl : ( '}' ) ;
    public final void rule__Submodule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:979:1: ( ( '}' ) )
            // InternalDsl.g:980:1: ( '}' )
            {
            // InternalDsl.g:980:1: ( '}' )
            // InternalDsl.g:981:2: '}'
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
    // InternalDsl.g:991:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:995:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalDsl.g:996:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
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
    // InternalDsl.g:1003:1: rule__Operation__Group__0__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1007:1: ( ( 'op' ) )
            // InternalDsl.g:1008:1: ( 'op' )
            {
            // InternalDsl.g:1008:1: ( 'op' )
            // InternalDsl.g:1009:2: 'op'
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
    // InternalDsl.g:1018:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1022:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalDsl.g:1023:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1030:1: rule__Operation__Group__1__Impl : ( '{' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1034:1: ( ( '{' ) )
            // InternalDsl.g:1035:1: ( '{' )
            {
            // InternalDsl.g:1035:1: ( '{' )
            // InternalDsl.g:1036:2: '{'
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
    // InternalDsl.g:1045:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1049:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalDsl.g:1050:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1057:1: rule__Operation__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1061:1: ( ( 'type:' ) )
            // InternalDsl.g:1062:1: ( 'type:' )
            {
            // InternalDsl.g:1062:1: ( 'type:' )
            // InternalDsl.g:1063:2: 'type:'
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
    // InternalDsl.g:1072:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1076:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalDsl.g:1077:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1084:1: rule__Operation__Group__3__Impl : ( ruleSubOperation ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1088:1: ( ( ruleSubOperation ) )
            // InternalDsl.g:1089:1: ( ruleSubOperation )
            {
            // InternalDsl.g:1089:1: ( ruleSubOperation )
            // InternalDsl.g:1090:2: ruleSubOperation
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
    // InternalDsl.g:1099:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1103:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalDsl.g:1104:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1111:1: rule__Operation__Group__4__Impl : ( 'operates_on:' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1115:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:1116:1: ( 'operates_on:' )
            {
            // InternalDsl.g:1116:1: ( 'operates_on:' )
            // InternalDsl.g:1117:2: 'operates_on:'
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
    // InternalDsl.g:1126:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1130:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalDsl.g:1131:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1138:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__TargetAssignment_5 ) ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1142:1: ( ( ( rule__Operation__TargetAssignment_5 ) ) )
            // InternalDsl.g:1143:1: ( ( rule__Operation__TargetAssignment_5 ) )
            {
            // InternalDsl.g:1143:1: ( ( rule__Operation__TargetAssignment_5 ) )
            // InternalDsl.g:1144:2: ( rule__Operation__TargetAssignment_5 )
            {
             before(grammarAccess.getOperationAccess().getTargetAssignment_5()); 
            // InternalDsl.g:1145:2: ( rule__Operation__TargetAssignment_5 )
            // InternalDsl.g:1145:3: rule__Operation__TargetAssignment_5
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
    // InternalDsl.g:1153:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1157:1: ( rule__Operation__Group__6__Impl )
            // InternalDsl.g:1158:2: rule__Operation__Group__6__Impl
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
    // InternalDsl.g:1164:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1168:1: ( ( '}' ) )
            // InternalDsl.g:1169:1: ( '}' )
            {
            // InternalDsl.g:1169:1: ( '}' )
            // InternalDsl.g:1170:2: '}'
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
    // InternalDsl.g:1180:1: rule__GeneralEntity__Group__0 : rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 ;
    public final void rule__GeneralEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1184:1: ( rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1 )
            // InternalDsl.g:1185:2: rule__GeneralEntity__Group__0__Impl rule__GeneralEntity__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1192:1: rule__GeneralEntity__Group__0__Impl : ( 'generalEntity' ) ;
    public final void rule__GeneralEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1196:1: ( ( 'generalEntity' ) )
            // InternalDsl.g:1197:1: ( 'generalEntity' )
            {
            // InternalDsl.g:1197:1: ( 'generalEntity' )
            // InternalDsl.g:1198:2: 'generalEntity'
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
    // InternalDsl.g:1207:1: rule__GeneralEntity__Group__1 : rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 ;
    public final void rule__GeneralEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1211:1: ( rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2 )
            // InternalDsl.g:1212:2: rule__GeneralEntity__Group__1__Impl rule__GeneralEntity__Group__2
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
    // InternalDsl.g:1219:1: rule__GeneralEntity__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__GeneralEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1223:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:1224:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:1224:1: ( ruleQualifiedName )
            // InternalDsl.g:1225:2: ruleQualifiedName
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
    // InternalDsl.g:1234:1: rule__GeneralEntity__Group__2 : rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 ;
    public final void rule__GeneralEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1238:1: ( rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3 )
            // InternalDsl.g:1239:2: rule__GeneralEntity__Group__2__Impl rule__GeneralEntity__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1246:1: rule__GeneralEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1250:1: ( ( '{' ) )
            // InternalDsl.g:1251:1: ( '{' )
            {
            // InternalDsl.g:1251:1: ( '{' )
            // InternalDsl.g:1252:2: '{'
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
    // InternalDsl.g:1261:1: rule__GeneralEntity__Group__3 : rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 ;
    public final void rule__GeneralEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1265:1: ( rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4 )
            // InternalDsl.g:1266:2: rule__GeneralEntity__Group__3__Impl rule__GeneralEntity__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1273:1: rule__GeneralEntity__Group__3__Impl : ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__GeneralEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1277:1: ( ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1278:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1278:1: ( ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1279:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) ) ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1279:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1280:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1281:3: ( rule__GeneralEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1281:4: rule__GeneralEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__GeneralEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1284:2: ( ( rule__GeneralEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1285:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1286:3: ( rule__GeneralEntity__PropertiesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1286:4: rule__GeneralEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GeneralEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDsl.g:1295:1: rule__GeneralEntity__Group__4 : rule__GeneralEntity__Group__4__Impl ;
    public final void rule__GeneralEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1299:1: ( rule__GeneralEntity__Group__4__Impl )
            // InternalDsl.g:1300:2: rule__GeneralEntity__Group__4__Impl
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
    // InternalDsl.g:1306:1: rule__GeneralEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1310:1: ( ( '}' ) )
            // InternalDsl.g:1311:1: ( '}' )
            {
            // InternalDsl.g:1311:1: ( '}' )
            // InternalDsl.g:1312:2: '}'
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
    // InternalDsl.g:1322:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1326:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDsl.g:1327:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1334:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1338:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalDsl.g:1339:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalDsl.g:1339:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalDsl.g:1340:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalDsl.g:1341:2: ( rule__Property__NameAssignment_0 )
            // InternalDsl.g:1341:3: rule__Property__NameAssignment_0
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
    // InternalDsl.g:1349:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1353:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalDsl.g:1354:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1361:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1365:1: ( ( ':' ) )
            // InternalDsl.g:1366:1: ( ':' )
            {
            // InternalDsl.g:1366:1: ( ':' )
            // InternalDsl.g:1367:2: ':'
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
    // InternalDsl.g:1376:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1380:1: ( rule__Property__Group__2__Impl )
            // InternalDsl.g:1381:2: rule__Property__Group__2__Impl
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
    // InternalDsl.g:1387:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1391:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalDsl.g:1392:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalDsl.g:1392:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalDsl.g:1393:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalDsl.g:1394:2: ( rule__Property__TypeAssignment_2 )
            // InternalDsl.g:1394:3: rule__Property__TypeAssignment_2
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
    // InternalDsl.g:1403:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1407:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDsl.g:1408:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1415:1: rule__Type__Group__0__Impl : ( 'dataType' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1419:1: ( ( 'dataType' ) )
            // InternalDsl.g:1420:1: ( 'dataType' )
            {
            // InternalDsl.g:1420:1: ( 'dataType' )
            // InternalDsl.g:1421:2: 'dataType'
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
    // InternalDsl.g:1430:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1434:1: ( rule__Type__Group__1__Impl )
            // InternalDsl.g:1435:2: rule__Type__Group__1__Impl
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
    // InternalDsl.g:1441:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1445:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalDsl.g:1446:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalDsl.g:1446:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalDsl.g:1447:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalDsl.g:1448:2: ( rule__Type__NameAssignment_1 )
            // InternalDsl.g:1448:3: rule__Type__NameAssignment_1
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
    // InternalDsl.g:1457:1: rule__SpecialEntity__Group__0 : rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 ;
    public final void rule__SpecialEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1461:1: ( rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1 )
            // InternalDsl.g:1462:2: rule__SpecialEntity__Group__0__Impl rule__SpecialEntity__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1469:1: rule__SpecialEntity__Group__0__Impl : ( 'specialEntity' ) ;
    public final void rule__SpecialEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1473:1: ( ( 'specialEntity' ) )
            // InternalDsl.g:1474:1: ( 'specialEntity' )
            {
            // InternalDsl.g:1474:1: ( 'specialEntity' )
            // InternalDsl.g:1475:2: 'specialEntity'
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
    // InternalDsl.g:1484:1: rule__SpecialEntity__Group__1 : rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 ;
    public final void rule__SpecialEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1488:1: ( rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2 )
            // InternalDsl.g:1489:2: rule__SpecialEntity__Group__1__Impl rule__SpecialEntity__Group__2
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
    // InternalDsl.g:1496:1: rule__SpecialEntity__Group__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__SpecialEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1500:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:1501:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:1501:1: ( ruleQualifiedName )
            // InternalDsl.g:1502:2: ruleQualifiedName
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
    // InternalDsl.g:1511:1: rule__SpecialEntity__Group__2 : rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 ;
    public final void rule__SpecialEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1515:1: ( rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3 )
            // InternalDsl.g:1516:2: rule__SpecialEntity__Group__2__Impl rule__SpecialEntity__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1523:1: rule__SpecialEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SpecialEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1527:1: ( ( '{' ) )
            // InternalDsl.g:1528:1: ( '{' )
            {
            // InternalDsl.g:1528:1: ( '{' )
            // InternalDsl.g:1529:2: '{'
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
    // InternalDsl.g:1538:1: rule__SpecialEntity__Group__3 : rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 ;
    public final void rule__SpecialEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1542:1: ( rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4 )
            // InternalDsl.g:1543:2: rule__SpecialEntity__Group__3__Impl rule__SpecialEntity__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1550:1: rule__SpecialEntity__Group__3__Impl : ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) ;
    public final void rule__SpecialEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1554:1: ( ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) ) )
            // InternalDsl.g:1555:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            {
            // InternalDsl.g:1555:1: ( ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* ) )
            // InternalDsl.g:1556:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) ) ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            {
            // InternalDsl.g:1556:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 ) )
            // InternalDsl.g:1557:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1558:3: ( rule__SpecialEntity__PropertiesAssignment_3 )
            // InternalDsl.g:1558:4: rule__SpecialEntity__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__SpecialEntity__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 

            }

            // InternalDsl.g:1561:2: ( ( rule__SpecialEntity__PropertiesAssignment_3 )* )
            // InternalDsl.g:1562:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3()); 
            // InternalDsl.g:1563:3: ( rule__SpecialEntity__PropertiesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1563:4: rule__SpecialEntity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SpecialEntity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDsl.g:1572:1: rule__SpecialEntity__Group__4 : rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 ;
    public final void rule__SpecialEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1576:1: ( rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5 )
            // InternalDsl.g:1577:2: rule__SpecialEntity__Group__4__Impl rule__SpecialEntity__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1584:1: rule__SpecialEntity__Group__4__Impl : ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) ;
    public final void rule__SpecialEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1588:1: ( ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) ) )
            // InternalDsl.g:1589:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            {
            // InternalDsl.g:1589:1: ( ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* ) )
            // InternalDsl.g:1590:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) ) ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            {
            // InternalDsl.g:1590:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 ) )
            // InternalDsl.g:1591:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:1592:3: ( rule__SpecialEntity__TransactionsAssignment_4 )
            // InternalDsl.g:1592:4: rule__SpecialEntity__TransactionsAssignment_4
            {
            pushFollow(FOLLOW_19);
            rule__SpecialEntity__TransactionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 

            }

            // InternalDsl.g:1595:2: ( ( rule__SpecialEntity__TransactionsAssignment_4 )* )
            // InternalDsl.g:1596:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            {
             before(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4()); 
            // InternalDsl.g:1597:3: ( rule__SpecialEntity__TransactionsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1597:4: rule__SpecialEntity__TransactionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__SpecialEntity__TransactionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDsl.g:1606:1: rule__SpecialEntity__Group__5 : rule__SpecialEntity__Group__5__Impl ;
    public final void rule__SpecialEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1610:1: ( rule__SpecialEntity__Group__5__Impl )
            // InternalDsl.g:1611:2: rule__SpecialEntity__Group__5__Impl
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
    // InternalDsl.g:1617:1: rule__SpecialEntity__Group__5__Impl : ( '}' ) ;
    public final void rule__SpecialEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1621:1: ( ( '}' ) )
            // InternalDsl.g:1622:1: ( '}' )
            {
            // InternalDsl.g:1622:1: ( '}' )
            // InternalDsl.g:1623:2: '}'
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
    // InternalDsl.g:1633:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1637:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalDsl.g:1638:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
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
    // InternalDsl.g:1645:1: rule__Transaction__Group__0__Impl : ( 'trx' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1649:1: ( ( 'trx' ) )
            // InternalDsl.g:1650:1: ( 'trx' )
            {
            // InternalDsl.g:1650:1: ( 'trx' )
            // InternalDsl.g:1651:2: 'trx'
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
    // InternalDsl.g:1660:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1664:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalDsl.g:1665:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1672:1: rule__Transaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1676:1: ( ( '{' ) )
            // InternalDsl.g:1677:1: ( '{' )
            {
            // InternalDsl.g:1677:1: ( '{' )
            // InternalDsl.g:1678:2: '{'
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
    // InternalDsl.g:1687:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1691:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalDsl.g:1692:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:1699:1: rule__Transaction__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1703:1: ( ( 'type:' ) )
            // InternalDsl.g:1704:1: ( 'type:' )
            {
            // InternalDsl.g:1704:1: ( 'type:' )
            // InternalDsl.g:1705:2: 'type:'
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
    // InternalDsl.g:1714:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1718:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalDsl.g:1719:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1726:1: rule__Transaction__Group__3__Impl : ( ruleSubTransaction ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1730:1: ( ( ruleSubTransaction ) )
            // InternalDsl.g:1731:1: ( ruleSubTransaction )
            {
            // InternalDsl.g:1731:1: ( ruleSubTransaction )
            // InternalDsl.g:1732:2: ruleSubTransaction
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
    // InternalDsl.g:1741:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1745:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalDsl.g:1746:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1753:1: rule__Transaction__Group__4__Impl : ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1757:1: ( ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) ) )
            // InternalDsl.g:1758:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            {
            // InternalDsl.g:1758:1: ( ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* ) )
            // InternalDsl.g:1759:2: ( ( rule__Transaction__OperatesonAssignment_4 ) ) ( ( rule__Transaction__OperatesonAssignment_4 )* )
            {
            // InternalDsl.g:1759:2: ( ( rule__Transaction__OperatesonAssignment_4 ) )
            // InternalDsl.g:1760:3: ( rule__Transaction__OperatesonAssignment_4 )
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:1761:3: ( rule__Transaction__OperatesonAssignment_4 )
            // InternalDsl.g:1761:4: rule__Transaction__OperatesonAssignment_4
            {
            pushFollow(FOLLOW_21);
            rule__Transaction__OperatesonAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 

            }

            // InternalDsl.g:1764:2: ( ( rule__Transaction__OperatesonAssignment_4 )* )
            // InternalDsl.g:1765:3: ( rule__Transaction__OperatesonAssignment_4 )*
            {
             before(grammarAccess.getTransactionAccess().getOperatesonAssignment_4()); 
            // InternalDsl.g:1766:3: ( rule__Transaction__OperatesonAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1766:4: rule__Transaction__OperatesonAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Transaction__OperatesonAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDsl.g:1775:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1779:1: ( rule__Transaction__Group__5__Impl )
            // InternalDsl.g:1780:2: rule__Transaction__Group__5__Impl
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
    // InternalDsl.g:1786:1: rule__Transaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1790:1: ( ( '}' ) )
            // InternalDsl.g:1791:1: ( '}' )
            {
            // InternalDsl.g:1791:1: ( '}' )
            // InternalDsl.g:1792:2: '}'
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
    // InternalDsl.g:1802:1: rule__Operateson__Group__0 : rule__Operateson__Group__0__Impl rule__Operateson__Group__1 ;
    public final void rule__Operateson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1806:1: ( rule__Operateson__Group__0__Impl rule__Operateson__Group__1 )
            // InternalDsl.g:1807:2: rule__Operateson__Group__0__Impl rule__Operateson__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1814:1: rule__Operateson__Group__0__Impl : ( 'operates_on:' ) ;
    public final void rule__Operateson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1818:1: ( ( 'operates_on:' ) )
            // InternalDsl.g:1819:1: ( 'operates_on:' )
            {
            // InternalDsl.g:1819:1: ( 'operates_on:' )
            // InternalDsl.g:1820:2: 'operates_on:'
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
    // InternalDsl.g:1829:1: rule__Operateson__Group__1 : rule__Operateson__Group__1__Impl ;
    public final void rule__Operateson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1833:1: ( rule__Operateson__Group__1__Impl )
            // InternalDsl.g:1834:2: rule__Operateson__Group__1__Impl
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
    // InternalDsl.g:1840:1: rule__Operateson__Group__1__Impl : ( ( rule__Operateson__TypeAssignment_1 ) ) ;
    public final void rule__Operateson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1844:1: ( ( ( rule__Operateson__TypeAssignment_1 ) ) )
            // InternalDsl.g:1845:1: ( ( rule__Operateson__TypeAssignment_1 ) )
            {
            // InternalDsl.g:1845:1: ( ( rule__Operateson__TypeAssignment_1 ) )
            // InternalDsl.g:1846:2: ( rule__Operateson__TypeAssignment_1 )
            {
             before(grammarAccess.getOperatesonAccess().getTypeAssignment_1()); 
            // InternalDsl.g:1847:2: ( rule__Operateson__TypeAssignment_1 )
            // InternalDsl.g:1847:3: rule__Operateson__TypeAssignment_1
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
    // InternalDsl.g:1856:1: rule__RelationDom__Group__0 : rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 ;
    public final void rule__RelationDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1860:1: ( rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1 )
            // InternalDsl.g:1861:2: rule__RelationDom__Group__0__Impl rule__RelationDom__Group__1
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
    // InternalDsl.g:1868:1: rule__RelationDom__Group__0__Impl : ( 'rel' ) ;
    public final void rule__RelationDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1872:1: ( ( 'rel' ) )
            // InternalDsl.g:1873:1: ( 'rel' )
            {
            // InternalDsl.g:1873:1: ( 'rel' )
            // InternalDsl.g:1874:2: 'rel'
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
    // InternalDsl.g:1883:1: rule__RelationDom__Group__1 : rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 ;
    public final void rule__RelationDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1887:1: ( rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2 )
            // InternalDsl.g:1888:2: rule__RelationDom__Group__1__Impl rule__RelationDom__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1895:1: rule__RelationDom__Group__1__Impl : ( '{' ) ;
    public final void rule__RelationDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1899:1: ( ( '{' ) )
            // InternalDsl.g:1900:1: ( '{' )
            {
            // InternalDsl.g:1900:1: ( '{' )
            // InternalDsl.g:1901:2: '{'
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
    // InternalDsl.g:1910:1: rule__RelationDom__Group__2 : rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 ;
    public final void rule__RelationDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1914:1: ( rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3 )
            // InternalDsl.g:1915:2: rule__RelationDom__Group__2__Impl rule__RelationDom__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalDsl.g:1922:1: rule__RelationDom__Group__2__Impl : ( 'type:' ) ;
    public final void rule__RelationDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1926:1: ( ( 'type:' ) )
            // InternalDsl.g:1927:1: ( 'type:' )
            {
            // InternalDsl.g:1927:1: ( 'type:' )
            // InternalDsl.g:1928:2: 'type:'
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
    // InternalDsl.g:1937:1: rule__RelationDom__Group__3 : rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 ;
    public final void rule__RelationDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1941:1: ( rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4 )
            // InternalDsl.g:1942:2: rule__RelationDom__Group__3__Impl rule__RelationDom__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:1949:1: rule__RelationDom__Group__3__Impl : ( 'Composition' ) ;
    public final void rule__RelationDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1953:1: ( ( 'Composition' ) )
            // InternalDsl.g:1954:1: ( 'Composition' )
            {
            // InternalDsl.g:1954:1: ( 'Composition' )
            // InternalDsl.g:1955:2: 'Composition'
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
    // InternalDsl.g:1964:1: rule__RelationDom__Group__4 : rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 ;
    public final void rule__RelationDom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1968:1: ( rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5 )
            // InternalDsl.g:1969:2: rule__RelationDom__Group__4__Impl rule__RelationDom__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1976:1: rule__RelationDom__Group__4__Impl : ( 'source:' ) ;
    public final void rule__RelationDom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1980:1: ( ( 'source:' ) )
            // InternalDsl.g:1981:1: ( 'source:' )
            {
            // InternalDsl.g:1981:1: ( 'source:' )
            // InternalDsl.g:1982:2: 'source:'
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
    // InternalDsl.g:1991:1: rule__RelationDom__Group__5 : rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 ;
    public final void rule__RelationDom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1995:1: ( rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6 )
            // InternalDsl.g:1996:2: rule__RelationDom__Group__5__Impl rule__RelationDom__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:2003:1: rule__RelationDom__Group__5__Impl : ( ( rule__RelationDom__TypeAssignment_5 ) ) ;
    public final void rule__RelationDom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2007:1: ( ( ( rule__RelationDom__TypeAssignment_5 ) ) )
            // InternalDsl.g:2008:1: ( ( rule__RelationDom__TypeAssignment_5 ) )
            {
            // InternalDsl.g:2008:1: ( ( rule__RelationDom__TypeAssignment_5 ) )
            // InternalDsl.g:2009:2: ( rule__RelationDom__TypeAssignment_5 )
            {
             before(grammarAccess.getRelationDomAccess().getTypeAssignment_5()); 
            // InternalDsl.g:2010:2: ( rule__RelationDom__TypeAssignment_5 )
            // InternalDsl.g:2010:3: rule__RelationDom__TypeAssignment_5
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
    // InternalDsl.g:2018:1: rule__RelationDom__Group__6 : rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 ;
    public final void rule__RelationDom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2022:1: ( rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7 )
            // InternalDsl.g:2023:2: rule__RelationDom__Group__6__Impl rule__RelationDom__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:2030:1: rule__RelationDom__Group__6__Impl : ( 'target:' ) ;
    public final void rule__RelationDom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2034:1: ( ( 'target:' ) )
            // InternalDsl.g:2035:1: ( 'target:' )
            {
            // InternalDsl.g:2035:1: ( 'target:' )
            // InternalDsl.g:2036:2: 'target:'
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
    // InternalDsl.g:2045:1: rule__RelationDom__Group__7 : rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 ;
    public final void rule__RelationDom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2049:1: ( rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8 )
            // InternalDsl.g:2050:2: rule__RelationDom__Group__7__Impl rule__RelationDom__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:2057:1: rule__RelationDom__Group__7__Impl : ( ( rule__RelationDom__TargetAssignment_7 ) ) ;
    public final void rule__RelationDom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2061:1: ( ( ( rule__RelationDom__TargetAssignment_7 ) ) )
            // InternalDsl.g:2062:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            {
            // InternalDsl.g:2062:1: ( ( rule__RelationDom__TargetAssignment_7 ) )
            // InternalDsl.g:2063:2: ( rule__RelationDom__TargetAssignment_7 )
            {
             before(grammarAccess.getRelationDomAccess().getTargetAssignment_7()); 
            // InternalDsl.g:2064:2: ( rule__RelationDom__TargetAssignment_7 )
            // InternalDsl.g:2064:3: rule__RelationDom__TargetAssignment_7
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
    // InternalDsl.g:2072:1: rule__RelationDom__Group__8 : rule__RelationDom__Group__8__Impl ;
    public final void rule__RelationDom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2076:1: ( rule__RelationDom__Group__8__Impl )
            // InternalDsl.g:2077:2: rule__RelationDom__Group__8__Impl
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
    // InternalDsl.g:2083:1: rule__RelationDom__Group__8__Impl : ( '}' ) ;
    public final void rule__RelationDom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2087:1: ( ( '}' ) )
            // InternalDsl.g:2088:1: ( '}' )
            {
            // InternalDsl.g:2088:1: ( '}' )
            // InternalDsl.g:2089:2: '}'
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
    // InternalDsl.g:2099:1: rule__Domainmodel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2103:1: ( ( ruleAbstractElement ) )
            // InternalDsl.g:2104:2: ( ruleAbstractElement )
            {
            // InternalDsl.g:2104:2: ( ruleAbstractElement )
            // InternalDsl.g:2105:3: ruleAbstractElement
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
    // InternalDsl.g:2114:1: rule__Domain__ModulesAssignment_2 : ( ruleModule ) ;
    public final void rule__Domain__ModulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2118:1: ( ( ruleModule ) )
            // InternalDsl.g:2119:2: ( ruleModule )
            {
            // InternalDsl.g:2119:2: ( ruleModule )
            // InternalDsl.g:2120:3: ruleModule
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


    // $ANTLR start "rule__Module__NameAssignment_1"
    // InternalDsl.g:2129:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2133:1: ( ( RULE_ID ) )
            // InternalDsl.g:2134:2: ( RULE_ID )
            {
            // InternalDsl.g:2134:2: ( RULE_ID )
            // InternalDsl.g:2135:3: RULE_ID
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
    // InternalDsl.g:2144:1: rule__Module__SubmodulesAssignment_3 : ( ruleSubmodule ) ;
    public final void rule__Module__SubmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2148:1: ( ( ruleSubmodule ) )
            // InternalDsl.g:2149:2: ( ruleSubmodule )
            {
            // InternalDsl.g:2149:2: ( ruleSubmodule )
            // InternalDsl.g:2150:3: ruleSubmodule
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
    // InternalDsl.g:2159:1: rule__Submodule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Submodule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2163:1: ( ( RULE_ID ) )
            // InternalDsl.g:2164:2: ( RULE_ID )
            {
            // InternalDsl.g:2164:2: ( RULE_ID )
            // InternalDsl.g:2165:3: RULE_ID
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
    // InternalDsl.g:2174:1: rule__Submodule__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Submodule__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2178:1: ( ( ruleOperation ) )
            // InternalDsl.g:2179:2: ( ruleOperation )
            {
            // InternalDsl.g:2179:2: ( ruleOperation )
            // InternalDsl.g:2180:3: ruleOperation
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
    // InternalDsl.g:2189:1: rule__Submodule__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Submodule__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2193:1: ( ( ruleEntity ) )
            // InternalDsl.g:2194:2: ( ruleEntity )
            {
            // InternalDsl.g:2194:2: ( ruleEntity )
            // InternalDsl.g:2195:3: ruleEntity
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
    // InternalDsl.g:2204:1: rule__Entity__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Entity__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2208:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2209:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2209:2: ( ( RULE_ID ) )
            // InternalDsl.g:2210:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getTypeQualifiedNameCrossReference_0()); 
            // InternalDsl.g:2211:3: ( RULE_ID )
            // InternalDsl.g:2212:4: RULE_ID
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
    // InternalDsl.g:2223:1: rule__QualifiedName__NameAssignment : ( RULE_ID ) ;
    public final void rule__QualifiedName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2227:1: ( ( RULE_ID ) )
            // InternalDsl.g:2228:2: ( RULE_ID )
            {
            // InternalDsl.g:2228:2: ( RULE_ID )
            // InternalDsl.g:2229:3: RULE_ID
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
    // InternalDsl.g:2238:1: rule__Operation__TargetAssignment_5 : ( ruleEntity ) ;
    public final void rule__Operation__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2242:1: ( ( ruleEntity ) )
            // InternalDsl.g:2243:2: ( ruleEntity )
            {
            // InternalDsl.g:2243:2: ( ruleEntity )
            // InternalDsl.g:2244:3: ruleEntity
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
    // InternalDsl.g:2253:1: rule__GeneralEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__GeneralEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2257:1: ( ( ruleProperty ) )
            // InternalDsl.g:2258:2: ( ruleProperty )
            {
            // InternalDsl.g:2258:2: ( ruleProperty )
            // InternalDsl.g:2259:3: ruleProperty
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
    // InternalDsl.g:2268:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2272:1: ( ( RULE_ID ) )
            // InternalDsl.g:2273:2: ( RULE_ID )
            {
            // InternalDsl.g:2273:2: ( RULE_ID )
            // InternalDsl.g:2274:3: RULE_ID
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
    // InternalDsl.g:2283:1: rule__Property__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2287:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2288:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2288:2: ( ( RULE_ID ) )
            // InternalDsl.g:2289:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 
            // InternalDsl.g:2290:3: ( RULE_ID )
            // InternalDsl.g:2291:4: RULE_ID
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
    // InternalDsl.g:2302:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2306:1: ( ( RULE_ID ) )
            // InternalDsl.g:2307:2: ( RULE_ID )
            {
            // InternalDsl.g:2307:2: ( RULE_ID )
            // InternalDsl.g:2308:3: RULE_ID
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
    // InternalDsl.g:2317:1: rule__SpecialEntity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__SpecialEntity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2321:1: ( ( ruleProperty ) )
            // InternalDsl.g:2322:2: ( ruleProperty )
            {
            // InternalDsl.g:2322:2: ( ruleProperty )
            // InternalDsl.g:2323:3: ruleProperty
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
    // InternalDsl.g:2332:1: rule__SpecialEntity__TransactionsAssignment_4 : ( ruleTransaction ) ;
    public final void rule__SpecialEntity__TransactionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2336:1: ( ( ruleTransaction ) )
            // InternalDsl.g:2337:2: ( ruleTransaction )
            {
            // InternalDsl.g:2337:2: ( ruleTransaction )
            // InternalDsl.g:2338:3: ruleTransaction
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
    // InternalDsl.g:2347:1: rule__Transaction__OperatesonAssignment_4 : ( ruleOperateson ) ;
    public final void rule__Transaction__OperatesonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2351:1: ( ( ruleOperateson ) )
            // InternalDsl.g:2352:2: ( ruleOperateson )
            {
            // InternalDsl.g:2352:2: ( ruleOperateson )
            // InternalDsl.g:2353:3: ruleOperateson
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
    // InternalDsl.g:2362:1: rule__Operateson__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Operateson__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2366:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2367:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2367:2: ( ( RULE_ID ) )
            // InternalDsl.g:2368:3: ( RULE_ID )
            {
             before(grammarAccess.getOperatesonAccess().getTypeGeneralEntityCrossReference_1_0()); 
            // InternalDsl.g:2369:3: ( RULE_ID )
            // InternalDsl.g:2370:4: RULE_ID
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
    // InternalDsl.g:2381:1: rule__RelationDom__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDom__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2385:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2386:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2386:2: ( ( RULE_ID ) )
            // InternalDsl.g:2387:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationDomAccess().getTypeGeneralEntityCrossReference_5_0()); 
            // InternalDsl.g:2388:3: ( RULE_ID )
            // InternalDsl.g:2389:4: RULE_ID
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
    // InternalDsl.g:2400:1: rule__RelationDom__TargetAssignment_7 : ( ruleEntity ) ;
    public final void rule__RelationDom__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2404:1: ( ( ruleEntity ) )
            // InternalDsl.g:2405:2: ( ruleEntity )
            {
            // InternalDsl.g:2405:2: ( ruleEntity )
            // InternalDsl.g:2406:3: ruleEntity
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000016808002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});

}