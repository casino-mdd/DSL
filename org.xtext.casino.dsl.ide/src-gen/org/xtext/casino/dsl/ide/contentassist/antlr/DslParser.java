/*
 * generated by Xtext 2.17.0
 */
package org.xtext.casino.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.casino.dsl.ide.contentassist.antlr.internal.InternalDslParser;
import org.xtext.casino.dsl.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSubmoduleAccess().getEntitiesAlternatives_4_0(), "rule__Submodule__EntitiesAlternatives_4_0");
			builder.put(grammarAccess.getSubOperationAccess().getAlternatives(), "rule__SubOperation__Alternatives");
			builder.put(grammarAccess.getSubTransactionAccess().getAlternatives(), "rule__SubTransaction__Alternatives");
			builder.put(grammarAccess.getComponentNameAccess().getAlternatives(), "rule__ComponentName__Alternatives");
			builder.put(grammarAccess.getLayerNameAccess().getAlternatives(), "rule__LayerName__Alternatives");
			builder.put(grammarAccess.getLayerSegmentNameAccess().getAlternatives(), "rule__LayerSegmentName__Alternatives");
			builder.put(grammarAccess.getSublayerSegmentNameAccess().getAlternatives(), "rule__SublayerSegmentName__Alternatives");
			builder.put(grammarAccess.getEclassAccess().getAlternatives(), "rule__Eclass__Alternatives");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getAbstractFrontElementAccess().getAlternatives(), "rule__AbstractFrontElement__Alternatives");
			builder.put(grammarAccess.getUIComponentAccess().getAlternatives(), "rule__UIComponent__Alternatives");
			builder.put(grammarAccess.getFileAccess().getAlternatives(), "rule__File__Alternatives");
			builder.put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
			builder.put(grammarAccess.getDomainAccess().getGroup(), "rule__Domain__Group__0");
			builder.put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
			builder.put(grammarAccess.getSubmoduleAccess().getGroup(), "rule__Submodule__Group__0");
			builder.put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
			builder.put(grammarAccess.getGeneralEntityAccess().getGroup(), "rule__GeneralEntity__Group__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
			builder.put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
			builder.put(grammarAccess.getSpecialEntityAccess().getGroup(), "rule__SpecialEntity__Group__0");
			builder.put(grammarAccess.getTransactionAccess().getGroup(), "rule__Transaction__Group__0");
			builder.put(grammarAccess.getOperatesonAccess().getGroup(), "rule__Operateson__Group__0");
			builder.put(grammarAccess.getRelationDomAccess().getGroup(), "rule__RelationDom__Group__0");
			builder.put(grammarAccess.getArchitectureAccess().getGroup(), "rule__Architecture__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getLayerAccess().getGroup(), "rule__Layer__Group__0");
			builder.put(grammarAccess.getLayerSegmentAccess().getGroup(), "rule__LayerSegment__Group__0");
			builder.put(grammarAccess.getLayerSegmentAccess().getGroup_3(), "rule__LayerSegment__Group_3__0");
			builder.put(grammarAccess.getLayerSegmentRelationAccess().getGroup(), "rule__LayerSegmentRelation__Group__0");
			builder.put(grammarAccess.getSublayerSegmentAccess().getGroup(), "rule__SublayerSegment__Group__0");
			builder.put(grammarAccess.getRelationArchAccess().getGroup(), "rule__RelationArch__Group__0");
			builder.put(grammarAccess.getTechnologyAccess().getGroup(), "rule__Technology__Group__0");
			builder.put(grammarAccess.getJavaAppAccess().getGroup(), "rule__JavaApp__Group__0");
			builder.put(grammarAccess.getJeeProjectAccess().getGroup(), "rule__JeeProject__Group__0");
			builder.put(grammarAccess.getSubprojectAccess().getGroup(), "rule__Subproject__Group__0");
			builder.put(grammarAccess.getAbstractClassAccess().getGroup(), "rule__AbstractClass__Group__0");
			builder.put(grammarAccess.getAbstractClassAccess().getGroup_5(), "rule__AbstractClass__Group_5__0");
			builder.put(grammarAccess.getGenericClassAccess().getGroup(), "rule__GenericClass__Group__0");
			builder.put(grammarAccess.getGenericClassAccess().getGroup_5(), "rule__GenericClass__Group_5__0");
			builder.put(grammarAccess.getGenericClassAccess().getGroup_6(), "rule__GenericClass__Group_6__0");
			builder.put(grammarAccess.getGenericClassAccess().getGroup_7(), "rule__GenericClass__Group_7__0");
			builder.put(grammarAccess.getEinterfaceAccess().getGroup(), "rule__Einterface__Group__0");
			builder.put(grammarAccess.getNativeClassAccess().getGroup(), "rule__NativeClass__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getEpackageAccess().getGroup(), "rule__Epackage__Group__0");
			builder.put(grammarAccess.getMethodBackAccess().getGroup(), "rule__MethodBack__Group__0");
			builder.put(grammarAccess.getMethodBackAccess().getGroup_3(), "rule__MethodBack__Group_3__0");
			builder.put(grammarAccess.getMethodBackAccess().getGroup_4(), "rule__MethodBack__Group_4__0");
			builder.put(grammarAccess.getAbstractMethodAccess().getGroup(), "rule__AbstractMethod__Group__0");
			builder.put(grammarAccess.getAbstractMethodAccess().getGroup_3(), "rule__AbstractMethod__Group_3__0");
			builder.put(grammarAccess.getAbstractMethodAccess().getGroup_4(), "rule__AbstractMethod__Group_4__0");
			builder.put(grammarAccess.getDescriptorAccess().getGroup(), "rule__Descriptor__Group__0");
			builder.put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
			builder.put(grammarAccess.getAnnotationAccess().getGroup_3(), "rule__Annotation__Group_3__0");
			builder.put(grammarAccess.getLibraryAccess().getGroup(), "rule__Library__Group__0");
			builder.put(grammarAccess.getReactAppAccess().getGroup(), "rule__ReactApp__Group__0");
			builder.put(grammarAccess.getReactAppAccess().getGroup_3(), "rule__ReactApp__Group_3__0");
			builder.put(grammarAccess.getReactAppAccess().getGroup_4(), "rule__ReactApp__Group_4__0");
			builder.put(grammarAccess.getReactAppAccess().getGroup_5(), "rule__ReactApp__Group_5__0");
			builder.put(grammarAccess.getFunctionalityAccess().getGroup(), "rule__Functionality__Group__0");
			builder.put(grammarAccess.getFunctionalityAccess().getGroup_3(), "rule__Functionality__Group_3__0");
			builder.put(grammarAccess.getFunctionalityAccess().getGroup_4(), "rule__Functionality__Group_4__0");
			builder.put(grammarAccess.getFunctionalityAccess().getGroup_5(), "rule__Functionality__Group_5__0");
			builder.put(grammarAccess.getFunctionalityAccess().getGroup_6(), "rule__Functionality__Group_6__0");
			builder.put(grammarAccess.getFunctionalityAccess().getGroup_7(), "rule__Functionality__Group_7__0");
			builder.put(grammarAccess.getRouterComponentAccess().getGroup(), "rule__RouterComponent__Group__0");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getContainerAccess().getGroup_5(), "rule__Container__Group_5__0");
			builder.put(grammarAccess.getContainerAccess().getGroup_6(), "rule__Container__Group_6__0");
			builder.put(grammarAccess.getVisualizerAccess().getGroup(), "rule__Visualizer__Group__0");
			builder.put(grammarAccess.getVisualizerAccess().getGroup_5(), "rule__Visualizer__Group_5__0");
			builder.put(grammarAccess.getServiceFrontAccess().getGroup(), "rule__ServiceFront__Group__0");
			builder.put(grammarAccess.getServiceFrontAccess().getGroup_5(), "rule__ServiceFront__Group_5__0");
			builder.put(grammarAccess.getDirectoryAccess().getGroup(), "rule__Directory__Group__0");
			builder.put(grammarAccess.getDirectoryAccess().getGroup_3(), "rule__Directory__Group_3__0");
			builder.put(grammarAccess.getDirectoryAccess().getGroup_4(), "rule__Directory__Group_4__0");
			builder.put(grammarAccess.getMdAccess().getGroup(), "rule__Md__Group__0");
			builder.put(grammarAccess.getJsAccess().getGroup(), "rule__Js__Group__0");
			builder.put(grammarAccess.getJsonAccess().getGroup(), "rule__Json__Group__0");
			builder.put(grammarAccess.getCssAccess().getGroup(), "rule__Css__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup_3(), "rule__State__Group_3__0");
			builder.put(grammarAccess.getStateAccess().getGroup_4(), "rule__State__Group_4__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup_3(), "rule__Action__Group_3__0");
			builder.put(grammarAccess.getActionAccess().getGroup_4(), "rule__Action__Group_4__0");
			builder.put(grammarAccess.getActionCreatorAccess().getGroup(), "rule__ActionCreator__Group__0");
			builder.put(grammarAccess.getActionDispatcherAccess().getGroup(), "rule__ActionDispatcher__Group__0");
			builder.put(grammarAccess.getActionDispatcherAccess().getGroup_3(), "rule__ActionDispatcher__Group_3__0");
			builder.put(grammarAccess.getReducerAccess().getGroup(), "rule__Reducer__Group__0");
			builder.put(grammarAccess.getReducerAccess().getGroup_3(), "rule__Reducer__Group_3__0");
			builder.put(grammarAccess.getJsModuleAccess().getGroup(), "rule__JsModule__Group__0");
			builder.put(grammarAccess.getSystemAccess().getDomAssignment_2(), "rule__System__DomAssignment_2");
			builder.put(grammarAccess.getSystemAccess().getArchAssignment_3(), "rule__System__ArchAssignment_3");
			builder.put(grammarAccess.getSystemAccess().getTechAssignment_4(), "rule__System__TechAssignment_4");
			builder.put(grammarAccess.getDomainAccess().getTypesAssignment_2(), "rule__Domain__TypesAssignment_2");
			builder.put(grammarAccess.getDomainAccess().getModulesAssignment_3(), "rule__Domain__ModulesAssignment_3");
			builder.put(grammarAccess.getDomainAccess().getRelationsAssignment_4(), "rule__Domain__RelationsAssignment_4");
			builder.put(grammarAccess.getModuleAccess().getNameAssignment_1(), "rule__Module__NameAssignment_1");
			builder.put(grammarAccess.getModuleAccess().getSubmodulesAssignment_3(), "rule__Module__SubmodulesAssignment_3");
			builder.put(grammarAccess.getSubmoduleAccess().getNameAssignment_1(), "rule__Submodule__NameAssignment_1");
			builder.put(grammarAccess.getSubmoduleAccess().getOperationsAssignment_3(), "rule__Submodule__OperationsAssignment_3");
			builder.put(grammarAccess.getSubmoduleAccess().getEntitiesAssignment_4(), "rule__Submodule__EntitiesAssignment_4");
			builder.put(grammarAccess.getOperationAccess().getTargetAssignment_5(), "rule__Operation__TargetAssignment_5");
			builder.put(grammarAccess.getEntityNameAccess().getNameAssignment(), "rule__EntityName__NameAssignment");
			builder.put(grammarAccess.getGeneralEntityAccess().getPropertiesAssignment_3(), "rule__GeneralEntity__PropertiesAssignment_3");
			builder.put(grammarAccess.getPropertyAccess().getNameAssignment_0(), "rule__Property__NameAssignment_0");
			builder.put(grammarAccess.getPropertyAccess().getTypeAssignment_2(), "rule__Property__TypeAssignment_2");
			builder.put(grammarAccess.getTypeAccess().getNameAssignment_1(), "rule__Type__NameAssignment_1");
			builder.put(grammarAccess.getSpecialEntityAccess().getPropertiesAssignment_3(), "rule__SpecialEntity__PropertiesAssignment_3");
			builder.put(grammarAccess.getSpecialEntityAccess().getTransactionsAssignment_4(), "rule__SpecialEntity__TransactionsAssignment_4");
			builder.put(grammarAccess.getTransactionAccess().getOperatesonAssignment_4(), "rule__Transaction__OperatesonAssignment_4");
			builder.put(grammarAccess.getOperatesonAccess().getOperatesonAssignment_1(), "rule__Operateson__OperatesonAssignment_1");
			builder.put(grammarAccess.getRelationDomAccess().getSourceAssignment_5(), "rule__RelationDom__SourceAssignment_5");
			builder.put(grammarAccess.getRelationDomAccess().getTargetAssignment_7(), "rule__RelationDom__TargetAssignment_7");
			builder.put(grammarAccess.getArchitectureAccess().getComponentesAssignment_2(), "rule__Architecture__ComponentesAssignment_2");
			builder.put(grammarAccess.getArchitectureAccess().getRelationArchAssignment_3(), "rule__Architecture__RelationArchAssignment_3");
			builder.put(grammarAccess.getComponentAccess().getLayerAssignment_3(), "rule__Component__LayerAssignment_3");
			builder.put(grammarAccess.getLayerAccess().getNameAssignment_1(), "rule__Layer__NameAssignment_1");
			builder.put(grammarAccess.getLayerAccess().getLayerSegmentsAssignment_3(), "rule__Layer__LayerSegmentsAssignment_3");
			builder.put(grammarAccess.getLayerSegmentAccess().getNameAssignment_1(), "rule__LayerSegment__NameAssignment_1");
			builder.put(grammarAccess.getLayerSegmentAccess().getRelationsAssignment_3_1(), "rule__LayerSegment__RelationsAssignment_3_1");
			builder.put(grammarAccess.getLayerSegmentAccess().getSublayerSegmentsAssignment_4(), "rule__LayerSegment__SublayerSegmentsAssignment_4");
			builder.put(grammarAccess.getSublayerSegmentAccess().getNameAssignment_1(), "rule__SublayerSegment__NameAssignment_1");
			builder.put(grammarAccess.getRelationArchAccess().getNameAssignment_1(), "rule__RelationArch__NameAssignment_1");
			builder.put(grammarAccess.getTechnologyAccess().getJavaAssignment_2(), "rule__Technology__JavaAssignment_2");
			builder.put(grammarAccess.getTechnologyAccess().getReactAssignment_3(), "rule__Technology__ReactAssignment_3");
			builder.put(grammarAccess.getJavaAppAccess().getJeeprojectAssignment_2(), "rule__JavaApp__JeeprojectAssignment_2");
			builder.put(grammarAccess.getJeeProjectAccess().getNameAssignment_1(), "rule__JeeProject__NameAssignment_1");
			builder.put(grammarAccess.getJeeProjectAccess().getSubprojectAssignment_3(), "rule__JeeProject__SubprojectAssignment_3");
			builder.put(grammarAccess.getSubprojectAccess().getNameAssignment_1(), "rule__Subproject__NameAssignment_1");
			builder.put(grammarAccess.getSubprojectAccess().getEpackageAssignment_3(), "rule__Subproject__EpackageAssignment_3");
			builder.put(grammarAccess.getSubprojectAccess().getLibraryAssignment_5(), "rule__Subproject__LibraryAssignment_5");
			builder.put(grammarAccess.getSubprojectAccess().getDescriptorAssignment_7(), "rule__Subproject__DescriptorAssignment_7");
			builder.put(grammarAccess.getAbstractClassAccess().getNameAssignment_1(), "rule__AbstractClass__NameAssignment_1");
			builder.put(grammarAccess.getAbstractClassAccess().getAttributeAssignment_3(), "rule__AbstractClass__AttributeAssignment_3");
			builder.put(grammarAccess.getAbstractClassAccess().getMethodClassAssignment_4(), "rule__AbstractClass__MethodClassAssignment_4");
			builder.put(grammarAccess.getAbstractClassAccess().getAnnotationAssignment_5_1(), "rule__AbstractClass__AnnotationAssignment_5_1");
			builder.put(grammarAccess.getAbstractClassAccess().getAbstractMethodAssignment_6(), "rule__AbstractClass__AbstractMethodAssignment_6");
			builder.put(grammarAccess.getGenericClassAccess().getNameAssignment_1(), "rule__GenericClass__NameAssignment_1");
			builder.put(grammarAccess.getGenericClassAccess().getAttributeAssignment_3(), "rule__GenericClass__AttributeAssignment_3");
			builder.put(grammarAccess.getGenericClassAccess().getMethodClassAssignment_4(), "rule__GenericClass__MethodClassAssignment_4");
			builder.put(grammarAccess.getGenericClassAccess().getAnnotationAssignment_5_1(), "rule__GenericClass__AnnotationAssignment_5_1");
			builder.put(grammarAccess.getGenericClassAccess().getAbsAssignment_6_1(), "rule__GenericClass__AbsAssignment_6_1");
			builder.put(grammarAccess.getGenericClassAccess().getImpAssignment_7_1(), "rule__GenericClass__ImpAssignment_7_1");
			builder.put(grammarAccess.getEinterfaceAccess().getNameAssignment_1(), "rule__Einterface__NameAssignment_1");
			builder.put(grammarAccess.getEinterfaceAccess().getAttributeAssignment_3(), "rule__Einterface__AttributeAssignment_3");
			builder.put(grammarAccess.getEinterfaceAccess().getAbstractMethodAssignment_4(), "rule__Einterface__AbstractMethodAssignment_4");
			builder.put(grammarAccess.getNativeClassAccess().getNameAssignment_1(), "rule__NativeClass__NameAssignment_1");
			builder.put(grammarAccess.getNativeClassAccess().getAttributeAssignment_3(), "rule__NativeClass__AttributeAssignment_3");
			builder.put(grammarAccess.getNativeClassAccess().getMethodClassAssignment_4(), "rule__NativeClass__MethodClassAssignment_4");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
			builder.put(grammarAccess.getEpackageAccess().getNameAssignment_1(), "rule__Epackage__NameAssignment_1");
			builder.put(grammarAccess.getEpackageAccess().getEclassAssignment_3(), "rule__Epackage__EclassAssignment_3");
			builder.put(grammarAccess.getMethodBackAccess().getNameAssignment_1(), "rule__MethodBack__NameAssignment_1");
			builder.put(grammarAccess.getMethodBackAccess().getArgAssignment_3_1(), "rule__MethodBack__ArgAssignment_3_1");
			builder.put(grammarAccess.getMethodBackAccess().getTypeAssignment_4_1(), "rule__MethodBack__TypeAssignment_4_1");
			builder.put(grammarAccess.getAbstractMethodAccess().getNameAssignment_1(), "rule__AbstractMethod__NameAssignment_1");
			builder.put(grammarAccess.getAbstractMethodAccess().getArgAssignment_3_1(), "rule__AbstractMethod__ArgAssignment_3_1");
			builder.put(grammarAccess.getAbstractMethodAccess().getTypeAssignment_4_1(), "rule__AbstractMethod__TypeAssignment_4_1");
			builder.put(grammarAccess.getDescriptorAccess().getNameAssignment_1(), "rule__Descriptor__NameAssignment_1");
			builder.put(grammarAccess.getDescriptorAccess().getNameAssignment_4(), "rule__Descriptor__NameAssignment_4");
			builder.put(grammarAccess.getAnnotationAccess().getNameAssignment_1(), "rule__Annotation__NameAssignment_1");
			builder.put(grammarAccess.getAnnotationAccess().getNameAssignment_3_1(), "rule__Annotation__NameAssignment_3_1");
			builder.put(grammarAccess.getLibraryAccess().getNameAssignment_1(), "rule__Library__NameAssignment_1");
			builder.put(grammarAccess.getLibraryAccess().getAnnotationAssignment_5(), "rule__Library__AnnotationAssignment_5");
			builder.put(grammarAccess.getReactAppAccess().getElementsAssignment_2(), "rule__ReactApp__ElementsAssignment_2");
			builder.put(grammarAccess.getReactAppAccess().getFuncAssignment_3_1(), "rule__ReactApp__FuncAssignment_3_1");
			builder.put(grammarAccess.getReactAppAccess().getDirAssignment_4_1(), "rule__ReactApp__DirAssignment_4_1");
			builder.put(grammarAccess.getReactAppAccess().getModAssignment_5_1(), "rule__ReactApp__ModAssignment_5_1");
			builder.put(grammarAccess.getFunctionalityAccess().getNameAssignment_1(), "rule__Functionality__NameAssignment_1");
			builder.put(grammarAccess.getFunctionalityAccess().getRouteAssignment_3_1(), "rule__Functionality__RouteAssignment_3_1");
			builder.put(grammarAccess.getFunctionalityAccess().getWrapAssignment_4_1(), "rule__Functionality__WrapAssignment_4_1");
			builder.put(grammarAccess.getFunctionalityAccess().getRenderAssignment_5_1(), "rule__Functionality__RenderAssignment_5_1");
			builder.put(grammarAccess.getFunctionalityAccess().getStateAssignment_6_1(), "rule__Functionality__StateAssignment_6_1");
			builder.put(grammarAccess.getFunctionalityAccess().getServiceAssignment_7_1(), "rule__Functionality__ServiceAssignment_7_1");
			builder.put(grammarAccess.getFunctionalityAccess().getTypeAssignment_9(), "rule__Functionality__TypeAssignment_9");
			builder.put(grammarAccess.getRouterComponentAccess().getNameAssignment_1(), "rule__RouterComponent__NameAssignment_1");
			builder.put(grammarAccess.getRouterComponentAccess().getTypeAssignment_4(), "rule__RouterComponent__TypeAssignment_4");
			builder.put(grammarAccess.getRouterComponentAccess().getTypeAssignment_6(), "rule__RouterComponent__TypeAssignment_6");
			builder.put(grammarAccess.getRouterComponentAccess().getRouteAssignment_8(), "rule__RouterComponent__RouteAssignment_8");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_1(), "rule__Container__NameAssignment_1");
			builder.put(grammarAccess.getContainerAccess().getTypeAssignment_4(), "rule__Container__TypeAssignment_4");
			builder.put(grammarAccess.getContainerAccess().getTypeAssignment_5_1(), "rule__Container__TypeAssignment_5_1");
			builder.put(grammarAccess.getContainerAccess().getTypeAssignment_6_1(), "rule__Container__TypeAssignment_6_1");
			builder.put(grammarAccess.getContainerAccess().getTypeAssignment_8(), "rule__Container__TypeAssignment_8");
			builder.put(grammarAccess.getVisualizerAccess().getNameAssignment_1(), "rule__Visualizer__NameAssignment_1");
			builder.put(grammarAccess.getVisualizerAccess().getTypeAssignment_4(), "rule__Visualizer__TypeAssignment_4");
			builder.put(grammarAccess.getVisualizerAccess().getTypeAssignment_5_1(), "rule__Visualizer__TypeAssignment_5_1");
			builder.put(grammarAccess.getServiceFrontAccess().getNameAssignment_1(), "rule__ServiceFront__NameAssignment_1");
			builder.put(grammarAccess.getServiceFrontAccess().getTypeAssignment_4(), "rule__ServiceFront__TypeAssignment_4");
			builder.put(grammarAccess.getDirectoryAccess().getNameAssignment_1(), "rule__Directory__NameAssignment_1");
			builder.put(grammarAccess.getDirectoryAccess().getFileAssignment_3_1(), "rule__Directory__FileAssignment_3_1");
			builder.put(grammarAccess.getDirectoryAccess().getSubdirectoryAssignment_4_1(), "rule__Directory__SubdirectoryAssignment_4_1");
			builder.put(grammarAccess.getMdAccess().getNameAssignment_1(), "rule__Md__NameAssignment_1");
			builder.put(grammarAccess.getJsAccess().getNameAssignment_1(), "rule__Js__NameAssignment_1");
			builder.put(grammarAccess.getJsonAccess().getNameAssignment_1(), "rule__Json__NameAssignment_1");
			builder.put(grammarAccess.getCssAccess().getNameAssignment_1(), "rule__Css__NameAssignment_1");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
			builder.put(grammarAccess.getStateAccess().getActionAssignment_3_1(), "rule__State__ActionAssignment_3_1");
			builder.put(grammarAccess.getStateAccess().getReducerAssignment_4_1(), "rule__State__ReducerAssignment_4_1");
			builder.put(grammarAccess.getActionAccess().getNameAssignment_1(), "rule__Action__NameAssignment_1");
			builder.put(grammarAccess.getActionAccess().getActionCreatorAssignment_3_1(), "rule__Action__ActionCreatorAssignment_3_1");
			builder.put(grammarAccess.getActionAccess().getActionDispatcherAssignment_4_1(), "rule__Action__ActionDispatcherAssignment_4_1");
			builder.put(grammarAccess.getActionAccess().getDirAssignment_6(), "rule__Action__DirAssignment_6");
			builder.put(grammarAccess.getActionCreatorAccess().getNameAssignment_1(), "rule__ActionCreator__NameAssignment_1");
			builder.put(grammarAccess.getActionDispatcherAccess().getNameAssignment_1(), "rule__ActionDispatcher__NameAssignment_1");
			builder.put(grammarAccess.getActionDispatcherAccess().getTypeAssignment_3_1(), "rule__ActionDispatcher__TypeAssignment_3_1");
			builder.put(grammarAccess.getReducerAccess().getNameAssignment_1(), "rule__Reducer__NameAssignment_1");
			builder.put(grammarAccess.getReducerAccess().getTypeAssignment_3_1(), "rule__Reducer__TypeAssignment_3_1");
			builder.put(grammarAccess.getReducerAccess().getTypeAssignment_5(), "rule__Reducer__TypeAssignment_5");
			builder.put(grammarAccess.getJsModuleAccess().getNameAssignment_1(), "rule__JsModule__NameAssignment_1");
			builder.put(grammarAccess.getJsModuleAccess().getTypeAssignment_4(), "rule__JsModule__TypeAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
