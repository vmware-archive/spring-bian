package io.pivotal.spring.bian.model.behaviorqualifier;

public class Feature extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Feature";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
