package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Property;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.Directory;

public abstract class RegisterServiceController extends BianServiceController {
	public RegisterServiceController(ControlRecord<? extends AssetType, ? extends Directory, ? extends Property> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "Register";

	public String getFunctionalPattern() {
		return FUNCTIONAL_PATTERN;
	}
	public Object doAuthorize(Object request) {
		return new Object();
	}
	public Object doCreate(Object request) {
		return new Object();
	}
	public Object doEvaluate(Object request) {
		return new Object();
	}
	public Object doExecute(Object request) {
		return new Object();
	}
	public Object doInitiate(Object request) {
		return new Object();
	}
	public Object doProvide(Object request) {
		return new Object();
	}
	public Object doRecord(Object request) {
		return new Object();
	}
}
