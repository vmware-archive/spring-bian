package io.pivotal.spring.bian.model.genericartifact;

public class AdministrativePlan extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "AdministrativePlan";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
