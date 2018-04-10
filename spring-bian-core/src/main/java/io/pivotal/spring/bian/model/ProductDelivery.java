package io.pivotal.spring.bian.model;

public class ProductDelivery {
	public DateTimePeriod deliveryPeriod;

	public ProductDelivery(DateTimePeriod deliveryPeriod) {
		super();
		this.deliveryPeriod = deliveryPeriod;
	}

	public DateTimePeriod getDeliveryPeriod() {
		return deliveryPeriod;
	}

	public void setDeliveryPeriod(DateTimePeriod deliveryPeriod) {
		this.deliveryPeriod = deliveryPeriod;
	}
	
}
