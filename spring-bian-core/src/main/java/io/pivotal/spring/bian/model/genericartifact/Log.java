package io.pivotal.spring.bian.model.genericartifact;

public class Log extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Log";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
