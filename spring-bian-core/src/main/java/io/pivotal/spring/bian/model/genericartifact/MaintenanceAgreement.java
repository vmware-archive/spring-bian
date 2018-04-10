package io.pivotal.spring.bian.model.genericartifact;

public class MaintenanceAgreement extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "MaintenanceAgreement";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
