package io.pivotal.spring.bian.model.behaviorqualifier;

import java.util.HashMap;
import java.util.Map;

public abstract class BehaviorQualifier {
	private Map<Object, Object> map;

	public abstract String getBehaviorQualifierType();
	
	public BehaviorQualifier() {
		super();
		map = new HashMap<>();
	}
	
	public BehaviorQualifier(Map<Object, Object> map) {
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
