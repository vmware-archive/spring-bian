package io.pivotal.spring.bian.model.genericartifact;

import java.util.HashMap;
import java.util.Map;

public abstract class GenericArtifact {
	private Map<Object, Object> map;

	public abstract String getGenericArtifactType();
	
	public GenericArtifact() {
		super();
		map = new HashMap<>();
	}
	
	public GenericArtifact(Map<Object, Object> map) {
		super();
		this.map = map;
	}
	
	public Object get(Object key) {
		return map.get(key);
	}
	
	public void put(Object key, Object value) {
		map.put(key, value);
	}

}
