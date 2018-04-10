package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Aspect;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.Specification;

public abstract class DesignServiceController extends BianServiceController {
	public DesignServiceController(ControlRecord<? extends AssetType, ? extends Specification, ? extends Aspect> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "Design";

	public String getFunctionalPattern() {
		return FUNCTIONAL_PATTERN;
	}
	public Object doAuthorize(Object request) {
		return new Object();
	}
	public Object doActivate(Object request) {
		return new Object();
	}
	public Object doConfigure(Object request) {
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
	public Object doRegister(Object request) {
		return new Object();
	}
}
