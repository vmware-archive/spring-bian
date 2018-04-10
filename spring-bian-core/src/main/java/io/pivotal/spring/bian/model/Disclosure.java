package io.pivotal.spring.bian.model;

import java.util.List;

public class Disclosure {
	public List<Agreement> disclosedForAgreements;

	public Disclosure(List<Agreement> disclosedForAgreements) {
		super();
		this.disclosedForAgreements = disclosedForAgreements;
	}

	public List<Agreement> getDisclosedForAgreements() {
		return disclosedForAgreements;
	}

	public void setDisclosedForAgreements(List<Agreement> disclosedForAgreements) {
		this.disclosedForAgreements = disclosedForAgreements;
	}
}
