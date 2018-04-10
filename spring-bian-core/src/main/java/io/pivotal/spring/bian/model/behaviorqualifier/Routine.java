package io.pivotal.spring.bian.model.behaviorqualifier;

public class Routine extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Routine";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
