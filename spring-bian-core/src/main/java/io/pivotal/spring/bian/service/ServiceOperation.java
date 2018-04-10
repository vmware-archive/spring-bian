package io.pivotal.spring.bian.service;

import java.util.HashMap;
import java.util.Map;

public enum ServiceOperation {
	INITIATE,
	CREATE,
	ACTIVATE,
	CONFIGURE,
	UPDATE,
	REGISTER,
	RECORD,
	EXECUTE,
	EVALUATE,
	PROVIDE,
	AUTHORIZE,
	REQUEST,
	TERMINATE,
	NOTIFY,
	RETRIEVE;
	
	private static final Map<String, ServiceOperation> nameIndex = new HashMap<>();
	static {
		for (ServiceOperation serviceOperation : ServiceOperation.values()) {
			nameIndex.put(serviceOperation.name(), serviceOperation);
		}
	}
	public static ServiceOperation lookupByName(String name) {
		return nameIndex.get(name);
	}
}
