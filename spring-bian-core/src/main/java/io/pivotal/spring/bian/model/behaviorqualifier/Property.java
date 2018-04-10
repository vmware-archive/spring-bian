package io.pivotal.spring.bian.model.behaviorqualifier;

public class Property extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Property";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
