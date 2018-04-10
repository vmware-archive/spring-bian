package io.pivotal.spring.bian.model.genericartifact;

public class FulfillmentArrangement extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "FullfillmentArrangement";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
