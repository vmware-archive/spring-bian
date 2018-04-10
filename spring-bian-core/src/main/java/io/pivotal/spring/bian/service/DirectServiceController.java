package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Goal;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.Strategy;

public abstract class DirectServiceController extends BianServiceController {
	public DirectServiceController(ControlRecord<? extends AssetType, ? extends Strategy, ? extends Goal> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "Direct";

	public String getFunctionalPattern() {
		return FUNCTIONAL_PATTERN;
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
