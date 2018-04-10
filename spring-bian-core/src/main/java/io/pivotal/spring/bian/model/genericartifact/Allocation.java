package io.pivotal.spring.bian.model.genericartifact;

public class Allocation extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Allocation";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
