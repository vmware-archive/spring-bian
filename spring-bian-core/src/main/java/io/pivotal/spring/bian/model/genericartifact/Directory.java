package io.pivotal.spring.bian.model.genericartifact;

public class Directory extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Directory";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
