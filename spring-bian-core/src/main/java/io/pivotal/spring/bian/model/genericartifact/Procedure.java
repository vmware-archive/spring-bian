package io.pivotal.spring.bian.model.genericartifact;

public class Procedure extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Procedure";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
