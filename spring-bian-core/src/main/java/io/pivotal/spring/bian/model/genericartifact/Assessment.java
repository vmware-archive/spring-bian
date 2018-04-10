package io.pivotal.spring.bian.model.genericartifact;

public class Assessment extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Assessment";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
