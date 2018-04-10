package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Test;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.Assessment;

public abstract class AssessServiceController extends BianServiceController {
	public AssessServiceController(ControlRecord<? extends AssetType, ? extends Assessment, ? extends Test> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "Assess";

	public String getFunctionalPattern() {
		return FUNCTIONAL_PATTERN;
	}
	public Object doCreate(Object request) {
		return new Object();
	}
	public Object doExecute(Object request) {
		return new Object();
	}
	public Object doInitiate(Object request) {
		return new Object();
	}
	public Object doNotify(Object request) {
		return new Object();
	}
	public Object doProvide(Object request) {
		return new Object();
	}
	public Object doRegister(Object request) {
		return new Object();
	}
	public Object doTerminate(Object request) {
		return new Object();
	}
	public Object doUpdate(Object request) {
		return new Object();
	}
}
