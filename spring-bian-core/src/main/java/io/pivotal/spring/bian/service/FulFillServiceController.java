package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Feature;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.FulfillmentArrangement;

public abstract class FulFillServiceController extends BianServiceController {
	public FulFillServiceController(ControlRecord<? extends AssetType, ? extends FulfillmentArrangement, ? extends Feature> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "FulFill";

	public String getFunctionalPattern() {
		return FUNCTIONAL_PATTERN;
	}
	public Object doActivate(Object request) {
		return new Object();
	}
	public Object doAuthorize(Object request) {
		return new Object();
	}
	public Object doConfigure(Object request) {
		return new Object();
	}
	public Object doCreate(Object request) {
		return new Object();
	}
	public Object doEvaluate(Object request) {
		return new Object();
	}
	public Object doProvide(Object request) {
		return new Object();
	}
	public Object doRegister(Object request) {
		return new Object();
	}
}
