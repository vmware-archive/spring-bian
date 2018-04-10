package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Event;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.Log;

public abstract class TrackServiceController extends BianServiceController {
	public TrackServiceController(ControlRecord<? extends AssetType, ? extends Log, ? extends Event> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "Track";

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
	public Object doRegister(Object request) {
		return new Object();
	}
	public Object doRequest(Object request) {
		return new Object();
	}
}
