package io.pivotal.spring.bian.samples.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.spring.bian.service.BianServiceController;


@RestController
@RequestMapping("/v1/test")
public class TestServiceEndpoint extends BianServiceController {

	@Override
	public String getServiceDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFunctionalPattern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doActivate(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doAuthorize(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doConfigure(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doCreate(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doEvaluate(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doExecute(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doInitiate(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doNotify(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doProvide(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doRecord(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doRegister(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doRequest(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doRetrieve(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doTerminate(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object doUpdate(Object request) {
		// TODO Auto-generated method stub
		return null;
	}

}
