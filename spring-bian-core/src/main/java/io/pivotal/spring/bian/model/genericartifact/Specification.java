package io.pivotal.spring.bian.model.genericartifact;

public class Specification extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Specification";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
