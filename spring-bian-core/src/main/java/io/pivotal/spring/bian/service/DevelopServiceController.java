package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Deliverable;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.DevelopmentProject;

public abstract class DevelopServiceController extends BianServiceController {
	public DevelopServiceController(ControlRecord<? extends AssetType, ? extends DevelopmentProject, ? extends Deliverable> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "Develop";

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
	public Object doEvaluate(Object request) {
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
