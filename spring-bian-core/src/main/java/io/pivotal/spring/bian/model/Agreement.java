package io.pivotal.spring.bian.model;

import java.util.Date;
import java.util.List;

import io.pivotal.spring.bian.model.assettype.Product;

public class Agreement {
	public Date dateSigned;
	public String description;
	public List<Disclosure> disclosures;
	//private Document document;
	//private Jurisdiction jurisdiction;
	//public List<Obligation> obligations;
	public List<CustomerOffer> offersforAgreement;
	public List<Product> products;
	//public List<Role> rolesInAgreement;
	//public List<TermsAndConditions> termsAndConditions;
	//private CommercialTrade trade;
	public DateTimePeriod validityPeriod;
	public String version;
}
