package io.pivotal.spring.bian.model.behaviorqualifier;

public class Algorithm extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Algorithm";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
