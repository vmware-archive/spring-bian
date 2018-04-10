package io.pivotal.spring.bian.model.genericartifact;

public class Agreement extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Agreement";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
