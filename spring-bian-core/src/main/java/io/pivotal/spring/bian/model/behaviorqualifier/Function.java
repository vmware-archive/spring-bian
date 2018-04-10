package io.pivotal.spring.bian.model.behaviorqualifier;

public class Function extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Function";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
