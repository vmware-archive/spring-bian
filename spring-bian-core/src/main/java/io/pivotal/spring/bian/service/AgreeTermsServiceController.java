package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Term;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.Agreement;

public abstract class AgreeTermsServiceController extends BianServiceController {
	public AgreeTermsServiceController(ControlRecord<? extends AssetType, ? extends Agreement, ? extends Term> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "Agree Terms";

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
	public Object doExecute(Object request) {
		return new Object();
	}
	public Object doProvide(Object request) {
		return new Object();
	}
	public Object doRecord(Object request) {
		return new Object();
	}
	public Object doRegister(Object request) {
		return new Object();
	}
}
