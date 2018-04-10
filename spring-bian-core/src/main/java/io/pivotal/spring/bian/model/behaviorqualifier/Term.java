package io.pivotal.spring.bian.model.behaviorqualifier;

public class Term extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Term";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
