package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Step;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.Transaction;

public abstract class TransactServiceController extends BianServiceController {
	public TransactServiceController(ControlRecord<? extends AssetType, ? extends Transaction, ? extends Step> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "Transact";

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
	public Object doRecord(Object request) {
		return new Object();
	}
	public Object doRegister(Object request) {
		return new Object();
	}
	public Object doTerminate(Object request) {
		return new Object();
	}
}
