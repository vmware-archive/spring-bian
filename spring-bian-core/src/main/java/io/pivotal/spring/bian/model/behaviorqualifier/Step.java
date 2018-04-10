package io.pivotal.spring.bian.model.behaviorqualifier;

public class Step extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Step";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
