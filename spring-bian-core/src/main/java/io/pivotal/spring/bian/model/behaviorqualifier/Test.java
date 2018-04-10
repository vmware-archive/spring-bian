package io.pivotal.spring.bian.model.behaviorqualifier;

public class Test extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Test";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
