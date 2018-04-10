package io.pivotal.spring.bian.model.behaviorqualifier;

public class Task extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Task";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
