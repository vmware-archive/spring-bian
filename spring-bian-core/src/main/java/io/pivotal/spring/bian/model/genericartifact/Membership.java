package io.pivotal.spring.bian.model.genericartifact;

public class Membership extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Membership";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
