package io.pivotal.spring.bian.model.behaviorqualifier;

public class Goal extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Goal";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
