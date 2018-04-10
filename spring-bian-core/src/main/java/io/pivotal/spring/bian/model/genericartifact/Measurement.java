package io.pivotal.spring.bian.model.genericartifact;

public class Measurement extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Measurement";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
