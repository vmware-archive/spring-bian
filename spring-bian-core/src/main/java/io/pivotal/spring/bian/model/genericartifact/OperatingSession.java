package io.pivotal.spring.bian.model.genericartifact;

public class OperatingSession extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "OperatingSession";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
