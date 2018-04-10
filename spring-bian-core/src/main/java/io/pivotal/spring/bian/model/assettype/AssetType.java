package io.pivotal.spring.bian.model.assettype;

import java.util.HashMap;
import java.util.Map;

public abstract class AssetType {
	private Map<Object, Object> map;

	public abstract String getAssetType();
	
	public AssetType() {
		super();
		map = new HashMap<>();
	}
	
	public AssetType(Map<Object, Object> map) {
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
