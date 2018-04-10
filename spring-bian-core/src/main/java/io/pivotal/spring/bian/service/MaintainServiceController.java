package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Task;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.MaintenanceAgreement;

public abstract class MaintainServiceController extends BianServiceController {
	public MaintainServiceController(ControlRecord<? extends AssetType, ? extends MaintenanceAgreement, ? extends Task> controlRecord) {
		super(controlRecord);
	}
	
	private static final String FUNCTIONAL_PATTERN = "Maintain";

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
