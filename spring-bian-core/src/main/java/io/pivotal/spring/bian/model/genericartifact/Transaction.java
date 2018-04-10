package io.pivotal.spring.bian.model.genericartifact;

public class Transaction extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "Transaction";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
