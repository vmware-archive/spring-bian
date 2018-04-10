package io.pivotal.spring.bian.model.behaviorqualifier;

public class Duty extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Duty";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
