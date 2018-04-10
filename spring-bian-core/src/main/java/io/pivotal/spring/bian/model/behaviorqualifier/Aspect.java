package io.pivotal.spring.bian.model.behaviorqualifier;

public class Aspect extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Aspect";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
