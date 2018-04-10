package io.pivotal.spring.bian.model.behaviorqualifier;

public class Signal extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Signal";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
