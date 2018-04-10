package io.pivotal.spring.bian.model;

public class CustomerOffer {
	public CustomerOfferManagement customerOfferManagement;
	public Agreement offeredAgreement;
	public CustomerPartyRole targetCustomer;
	public CustomerOffer(CustomerOfferManagement customerOfferManagement, Agreement offeredAgreement,
			CustomerPartyRole targetCustomer) {
		super();
		this.customerOfferManagement = customerOfferManagement;
		this.offeredAgreement = offeredAgreement;
		this.targetCustomer = targetCustomer;
	}
	public CustomerOfferManagement getCustomerOfferManagement() {
		return customerOfferManagement;
	}
	public void setCustomerOfferManagement(CustomerOfferManagement customerOfferManagement) {
		this.customerOfferManagement = customerOfferManagement;
	}
	public Agreement getOfferedAgreement() {
		return offeredAgreement;
	}
	public void setOfferedAgreement(Agreement offeredAgreement) {
		this.offeredAgreement = offeredAgreement;
	}
	public CustomerPartyRole getTargetCustomer() {
		return targetCustomer;
	}
	public void setTargetCustomer(CustomerPartyRole targetCustomer) {
		this.targetCustomer = targetCustomer;
	}
}
