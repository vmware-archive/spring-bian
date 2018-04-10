package io.pivotal.spring.bian.model.behaviorqualifier;

public class Event extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Event";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
