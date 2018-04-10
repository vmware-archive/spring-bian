package io.pivotal.spring.bian.model.genericartifact;

public class Analysis extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Analysis";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
