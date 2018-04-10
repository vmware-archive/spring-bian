package io.pivotal.spring.bian.model.behaviorqualifier;

public class Deliverable extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Deliverable";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
