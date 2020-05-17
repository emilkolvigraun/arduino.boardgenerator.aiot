/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.mdsd.arduino.boardgenerator.ide.contentassist.antlr.internal.InternalIoTParser;
import org.xtext.mdsd.arduino.boardgenerator.services.IoTGrammarAccess;

public class IoTParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(IoTGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, IoTGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getChannelTypeAccess().getAlternatives(), "rule__ChannelType__Alternatives");
			builder.put(grammarAccess.getChannelConfigAccess().getAlternatives(), "rule__ChannelConfig__Alternatives");
			builder.put(grammarAccess.getStopCharAccess().getAlternatives(), "rule__StopChar__Alternatives");
			builder.put(grammarAccess.getBoardAccess().getAlternatives_1(), "rule__Board__Alternatives_1");
			builder.put(grammarAccess.getSensorTypeAccess().getAlternatives(), "rule__SensorType__Alternatives");
			builder.put(grammarAccess.getSamplerAccess().getAlternatives(), "rule__Sampler__Alternatives");
			builder.put(grammarAccess.getResolutionAccess().getAlternatives(), "rule__Resolution__Alternatives");
			builder.put(grammarAccess.getPipelineAccess().getAlternatives_1(), "rule__Pipeline__Alternatives_1");
			builder.put(grammarAccess.getTuplePipelineAccess().getAlternatives_0(), "rule__TuplePipeline__Alternatives_0");
			builder.put(grammarAccess.getExecutePipelineAccess().getAlternatives(), "rule__ExecutePipeline__Alternatives");
			builder.put(grammarAccess.getEqualityAccess().getAlternatives_1(), "rule__Equality__Alternatives_1");
			builder.put(grammarAccess.getComparisonAccess().getAlternatives_1(), "rule__Comparison__Alternatives_1");
			builder.put(grammarAccess.getSubAddAccess().getAlternatives_1(), "rule__SubAdd__Alternatives_1");
			builder.put(grammarAccess.getMulDivAccess().getAlternatives_1(), "rule__MulDiv__Alternatives_1");
			builder.put(grammarAccess.getNegationAccess().getAlternatives(), "rule__Negation__Alternatives");
			builder.put(grammarAccess.getNotAccess().getAlternatives(), "rule__Not__Alternatives");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getNUMBERAccess().getAlternatives(), "rule__NUMBER__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
			builder.put(grammarAccess.getIncludeAccess().getGroup_2(), "rule__Include__Group_2__0");
			builder.put(grammarAccess.getChannelAccess().getGroup(), "rule__Channel__Group__0");
			builder.put(grammarAccess.getChannelAccess().getGroup_3(), "rule__Channel__Group_3__0");
			builder.put(grammarAccess.getChannelTypeAccess().getGroup_0(), "rule__ChannelType__Group_0__0");
			builder.put(grammarAccess.getChannelTypeAccess().getGroup_1(), "rule__ChannelType__Group_1__0");
			builder.put(grammarAccess.getChannelTypeAccess().getGroup_2(), "rule__ChannelType__Group_2__0");
			builder.put(grammarAccess.getWifiAccess().getGroup(), "rule__Wifi__Group__0");
			builder.put(grammarAccess.getSerialAccess().getGroup(), "rule__Serial__Group__0");
			builder.put(grammarAccess.getStopCharAccess().getGroup_0(), "rule__StopChar__Group_0__0");
			builder.put(grammarAccess.getStopCharAccess().getGroup_1(), "rule__StopChar__Group_1__0");
			builder.put(grammarAccess.getMqttClientAccess().getGroup(), "rule__MqttClient__Group__0");
			builder.put(grammarAccess.getMqttClientAccess().getGroup_4(), "rule__MqttClient__Group_4__0");
			builder.put(grammarAccess.getMqttClientAccess().getGroup_4_3(), "rule__MqttClient__Group_4_3__0");
			builder.put(grammarAccess.getBoardAccess().getGroup(), "rule__Board__Group__0");
			builder.put(grammarAccess.getNewBoardAccess().getGroup(), "rule__NewBoard__Group__0");
			builder.put(grammarAccess.getBoardVersionAccess().getGroup(), "rule__BoardVersion__Group__0");
			builder.put(grammarAccess.getExtendsBoardAccess().getGroup(), "rule__ExtendsBoard__Group__0");
			builder.put(grammarAccess.getExtendsBoardAccess().getGroup_3(), "rule__ExtendsBoard__Group_3__0");
			builder.put(grammarAccess.getAbstractBoardAccess().getGroup(), "rule__AbstractBoard__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_8(), "rule__Sensor__Group_8__0");
			builder.put(grammarAccess.getExternalSensorAccess().getGroup(), "rule__ExternalSensor__Group__0");
			builder.put(grammarAccess.getExternalSensorAccess().getGroup_3(), "rule__ExternalSensor__Group_3__0");
			builder.put(grammarAccess.getSensorVariablesAccess().getGroup(), "rule__SensorVariables__Group__0");
			builder.put(grammarAccess.getSensorVariablesAccess().getGroup_3(), "rule__SensorVariables__Group_3__0");
			builder.put(grammarAccess.getCommandAccess().getGroup(), "rule__Command__Group__0");
			builder.put(grammarAccess.getFrequencyAccess().getGroup(), "rule__Frequency__Group__0");
			builder.put(grammarAccess.getResolutionAccess().getGroup_0(), "rule__Resolution__Group_0__0");
			builder.put(grammarAccess.getResolutionAccess().getGroup_1(), "rule__Resolution__Group_1__0");
			builder.put(grammarAccess.getResolutionAccess().getGroup_2(), "rule__Resolution__Group_2__0");
			builder.put(grammarAccess.getSensorOutputAccess().getGroup(), "rule__SensorOutput__Group__0");
			builder.put(grammarAccess.getDataOutputAccess().getGroup(), "rule__DataOutput__Group__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup(), "rule__Pipeline__Group__0");
			builder.put(grammarAccess.getTuplePipelineAccess().getGroup(), "rule__TuplePipeline__Group__0");
			builder.put(grammarAccess.getTuplePipelineAccess().getGroup_0_0(), "rule__TuplePipeline__Group_0_0__0");
			builder.put(grammarAccess.getTuplePipelineAccess().getGroup_0_1(), "rule__TuplePipeline__Group_0_1__0");
			builder.put(grammarAccess.getMapPipelineAccess().getGroup(), "rule__MapPipeline__Group__0");
			builder.put(grammarAccess.getWindowPipelineAccess().getGroup(), "rule__WindowPipeline__Group__0");
			builder.put(grammarAccess.getExecutePipelineAccess().getGroup_0(), "rule__ExecutePipeline__Group_0__0");
			builder.put(grammarAccess.getExecutePipelineAccess().getGroup_1(), "rule__ExecutePipeline__Group_1__0");
			builder.put(grammarAccess.getExecutePipelineAccess().getGroup_2(), "rule__ExecutePipeline__Group_2__0");
			builder.put(grammarAccess.getExecutePipelineAccess().getGroup_3(), "rule__ExecutePipeline__Group_3__0");
			builder.put(grammarAccess.getExecutePipelineAccess().getGroup_4(), "rule__ExecutePipeline__Group_4__0");
			builder.put(grammarAccess.getExecutePipelineAccess().getGroup_5(), "rule__ExecutePipeline__Group_5__0");
			builder.put(grammarAccess.getExecutePipelineAccess().getGroup_6(), "rule__ExecutePipeline__Group_6__0");
			builder.put(grammarAccess.getConditionalAccess().getGroup(), "rule__Conditional__Group__0");
			builder.put(grammarAccess.getConditionalAccess().getGroup_1(), "rule__Conditional__Group_1__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1_0(), "rule__Equality__Group_1_0__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1_1(), "rule__Equality__Group_1_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_0(), "rule__Comparison__Group_1_0__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_1(), "rule__Comparison__Group_1_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_2(), "rule__Comparison__Group_1_2__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1_3(), "rule__Comparison__Group_1_3__0");
			builder.put(grammarAccess.getSubAddAccess().getGroup(), "rule__SubAdd__Group__0");
			builder.put(grammarAccess.getSubAddAccess().getGroup_1_0(), "rule__SubAdd__Group_1_0__0");
			builder.put(grammarAccess.getSubAddAccess().getGroup_1_1(), "rule__SubAdd__Group_1_1__0");
			builder.put(grammarAccess.getMulDivAccess().getGroup(), "rule__MulDiv__Group__0");
			builder.put(grammarAccess.getMulDivAccess().getGroup_1_0(), "rule__MulDiv__Group_1_0__0");
			builder.put(grammarAccess.getMulDivAccess().getGroup_1_1(), "rule__MulDiv__Group_1_1__0");
			builder.put(grammarAccess.getNegationAccess().getGroup_0(), "rule__Negation__Group_0__0");
			builder.put(grammarAccess.getExponentAccess().getGroup(), "rule__Exponent__Group__0");
			builder.put(grammarAccess.getExponentAccess().getGroup_1(), "rule__Exponent__Group_1__0");
			builder.put(grammarAccess.getNotAccess().getGroup_0(), "rule__Not__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getModelAccess().getIncludeAssignment_0(), "rule__Model__IncludeAssignment_0");
			builder.put(grammarAccess.getModelAccess().getChannelAssignment_1(), "rule__Model__ChannelAssignment_1");
			builder.put(grammarAccess.getModelAccess().getAbstractBoardAssignment_2(), "rule__Model__AbstractBoardAssignment_2");
			builder.put(grammarAccess.getModelAccess().getBoardAssignment_3(), "rule__Model__BoardAssignment_3");
			builder.put(grammarAccess.getIncludeAccess().getPathAssignment_1(), "rule__Include__PathAssignment_1");
			builder.put(grammarAccess.getIncludeAccess().getPathAssignment_2_1(), "rule__Include__PathAssignment_2_1");
			builder.put(grammarAccess.getChannelAccess().getChanneltypeAssignment_1(), "rule__Channel__ChanneltypeAssignment_1");
			builder.put(grammarAccess.getChannelAccess().getNameAssignment_2(), "rule__Channel__NameAssignment_2");
			builder.put(grammarAccess.getChannelAccess().getConfigAssignment_3_2(), "rule__Channel__ConfigAssignment_3_2");
			builder.put(grammarAccess.getWifiAccess().getSsidAssignment_1(), "rule__Wifi__SsidAssignment_1");
			builder.put(grammarAccess.getWifiAccess().getPassAssignment_3(), "rule__Wifi__PassAssignment_3");
			builder.put(grammarAccess.getSerialAccess().getBaudAssignment_1(), "rule__Serial__BaudAssignment_1");
			builder.put(grammarAccess.getSerialAccess().getStopAssignment_3(), "rule__Serial__StopAssignment_3");
			builder.put(grammarAccess.getStopCharAccess().getNameAssignment_0_2(), "rule__StopChar__NameAssignment_0_2");
			builder.put(grammarAccess.getStopCharAccess().getNameAssignment_1_2(), "rule__StopChar__NameAssignment_1_2");
			builder.put(grammarAccess.getMqttClientAccess().getBrokerAssignment_1(), "rule__MqttClient__BrokerAssignment_1");
			builder.put(grammarAccess.getMqttClientAccess().getClientAssignment_3(), "rule__MqttClient__ClientAssignment_3");
			builder.put(grammarAccess.getMqttClientAccess().getSubAssignment_4_2(), "rule__MqttClient__SubAssignment_4_2");
			builder.put(grammarAccess.getMqttClientAccess().getSubAssignment_4_3_1(), "rule__MqttClient__SubAssignment_4_3_1");
			builder.put(grammarAccess.getNewBoardAccess().getNameAssignment_0(), "rule__NewBoard__NameAssignment_0");
			builder.put(grammarAccess.getNewBoardAccess().getVersionAssignment_3(), "rule__NewBoard__VersionAssignment_3");
			builder.put(grammarAccess.getNewBoardAccess().getSensorsAssignment_4(), "rule__NewBoard__SensorsAssignment_4");
			builder.put(grammarAccess.getBoardVersionAccess().getTypeAssignment_1(), "rule__BoardVersion__TypeAssignment_1");
			builder.put(grammarAccess.getBoardVersionAccess().getModelAssignment_3(), "rule__BoardVersion__ModelAssignment_3");
			builder.put(grammarAccess.getExtendsBoardAccess().getNameAssignment_0(), "rule__ExtendsBoard__NameAssignment_0");
			builder.put(grammarAccess.getExtendsBoardAccess().getAbstractBoardAssignment_2(), "rule__ExtendsBoard__AbstractBoardAssignment_2");
			builder.put(grammarAccess.getExtendsBoardAccess().getSensorsAssignment_3_2(), "rule__ExtendsBoard__SensorsAssignment_3_2");
			builder.put(grammarAccess.getAbstractBoardAccess().getBoardAssignment_2(), "rule__AbstractBoard__BoardAssignment_2");
			builder.put(grammarAccess.getSensorAccess().getNameAssignment_1(), "rule__Sensor__NameAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getSensortypeAssignment_3(), "rule__Sensor__SensortypeAssignment_3");
			builder.put(grammarAccess.getSensorAccess().getVarsAssignment_5(), "rule__Sensor__VarsAssignment_5");
			builder.put(grammarAccess.getSensorAccess().getSamplerAssignment_8_1(), "rule__Sensor__SamplerAssignment_8_1");
			builder.put(grammarAccess.getSensorAccess().getOutputAssignment_9(), "rule__Sensor__OutputAssignment_9");
			builder.put(grammarAccess.getExternalSensorAccess().getSensorAssignment_0(), "rule__ExternalSensor__SensorAssignment_0");
			builder.put(grammarAccess.getExternalSensorAccess().getPinsAssignment_2(), "rule__ExternalSensor__PinsAssignment_2");
			builder.put(grammarAccess.getExternalSensorAccess().getPinsAssignment_3_1(), "rule__ExternalSensor__PinsAssignment_3_1");
			builder.put(grammarAccess.getOnboardSensorAccess().getSensorAssignment(), "rule__OnboardSensor__SensorAssignment");
			builder.put(grammarAccess.getSensorVariablesAccess().getNameAssignment_0(), "rule__SensorVariables__NameAssignment_0");
			builder.put(grammarAccess.getSensorVariablesAccess().getIdsAssignment_2(), "rule__SensorVariables__IdsAssignment_2");
			builder.put(grammarAccess.getSensorVariablesAccess().getIdsAssignment_3_1(), "rule__SensorVariables__IdsAssignment_3_1");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
			builder.put(grammarAccess.getCommandAccess().getCommandAssignment_1(), "rule__Command__CommandAssignment_1");
			builder.put(grammarAccess.getFrequencyAccess().getFrequencyAssignment_1(), "rule__Frequency__FrequencyAssignment_1");
			builder.put(grammarAccess.getFrequencyAccess().getResolutionAssignment_2(), "rule__Frequency__ResolutionAssignment_2");
			builder.put(grammarAccess.getSensorOutputAccess().getOutputAssignment_1(), "rule__SensorOutput__OutputAssignment_1");
			builder.put(grammarAccess.getSensorOutputAccess().getChannelAssignment_3(), "rule__SensorOutput__ChannelAssignment_3");
			builder.put(grammarAccess.getDataOutputAccess().getSensorvarAssignment_0(), "rule__DataOutput__SensorvarAssignment_0");
			builder.put(grammarAccess.getDataOutputAccess().getPipelineAssignment_1(), "rule__DataOutput__PipelineAssignment_1");
			builder.put(grammarAccess.getPipelineAccess().getNextAssignment_2(), "rule__Pipeline__NextAssignment_2");
			builder.put(grammarAccess.getTuplePipelineAccess().getExpressionAssignment_2(), "rule__TuplePipeline__ExpressionAssignment_2");
			builder.put(grammarAccess.getMapPipelineAccess().getExpressionAssignment_3(), "rule__MapPipeline__ExpressionAssignment_3");
			builder.put(grammarAccess.getMapPipelineAccess().getOutputAssignment_5(), "rule__MapPipeline__OutputAssignment_5");
			builder.put(grammarAccess.getWindowPipelineAccess().getWidthAssignment_3(), "rule__WindowPipeline__WidthAssignment_3");
			builder.put(grammarAccess.getWindowPipelineAccess().getExecuteAssignment_6(), "rule__WindowPipeline__ExecuteAssignment_6");
			builder.put(grammarAccess.getConditionalAccess().getCorrectAssignment_1_2(), "rule__Conditional__CorrectAssignment_1_2");
			builder.put(grammarAccess.getConditionalAccess().getIncorrectAssignment_1_4(), "rule__Conditional__IncorrectAssignment_1_4");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
			builder.put(grammarAccess.getEqualityAccess().getRightAssignment_1_0_2(), "rule__Equality__RightAssignment_1_0_2");
			builder.put(grammarAccess.getEqualityAccess().getRightAssignment_1_1_2(), "rule__Equality__RightAssignment_1_1_2");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_0_2(), "rule__Comparison__RightAssignment_1_0_2");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_1_2(), "rule__Comparison__RightAssignment_1_1_2");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_2_2(), "rule__Comparison__RightAssignment_1_2_2");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_3_2(), "rule__Comparison__RightAssignment_1_3_2");
			builder.put(grammarAccess.getSubAddAccess().getRightAssignment_1_0_2(), "rule__SubAdd__RightAssignment_1_0_2");
			builder.put(grammarAccess.getSubAddAccess().getRightAssignment_1_1_2(), "rule__SubAdd__RightAssignment_1_1_2");
			builder.put(grammarAccess.getMulDivAccess().getRightAssignment_1_0_2(), "rule__MulDiv__RightAssignment_1_0_2");
			builder.put(grammarAccess.getMulDivAccess().getRightAssignment_1_1_2(), "rule__MulDiv__RightAssignment_1_1_2");
			builder.put(grammarAccess.getNegationAccess().getValueAssignment_0_2(), "rule__Negation__ValueAssignment_0_2");
			builder.put(grammarAccess.getExponentAccess().getPowerAssignment_1_2(), "rule__Exponent__PowerAssignment_1_2");
			builder.put(grammarAccess.getNotAccess().getValueAssignment_0_2(), "rule__Not__ValueAssignment_0_2");
			builder.put(grammarAccess.getReferenceAccess().getRefAssignment(), "rule__Reference__RefAssignment");
			builder.put(grammarAccess.getStringLiteralAccess().getStrAssignment(), "rule__StringLiteral__StrAssignment");
			builder.put(grammarAccess.getNumberLiteralAccess().getNumbAssignment(), "rule__NumberLiteral__NumbAssignment");
			builder.put(grammarAccess.getBooleanLiteralAccess().getBoolAssignment(), "rule__BooleanLiteral__BoolAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private IoTGrammarAccess grammarAccess;

	@Override
	protected InternalIoTParser createParser() {
		InternalIoTParser result = new InternalIoTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new IoTTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public IoTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IoTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
