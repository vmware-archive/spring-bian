package io.pivotal.spring.bian.model.behaviorqualifier;

public class Assignment extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Assignment";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
