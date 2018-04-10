package io.pivotal.spring.bian.model.controlrecord;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.BehaviorQualifier;
import io.pivotal.spring.bian.model.genericartifact.GenericArtifact;

public class ControlRecord<T extends AssetType, U extends GenericArtifact, V extends BehaviorQualifier> {
	private T assetType;
	private U genericArtifact;
	private V behaviorQualifier;

	public ControlRecord(Class<T> tClass, Class<U> uClass, Class<V> vClass) throws InstantiationException, IllegalAccessException {
		assetType = tClass.newInstance();
		genericArtifact = uClass.newInstance();
		behaviorQualifier = vClass.newInstance();
	}

	public ControlRecord(T assetType, U genericArtifact, V behaviorQualifier) {
		super();
		this.assetType = assetType;
		this.genericArtifact = genericArtifact;
		this.behaviorQualifier = behaviorQualifier;
	}
	
	public Object get(Object key) {
		Object value = assetType.get(key);
		if (value == null) value = genericArtifact.get(key);
		if (value == null) value = behaviorQualifier.get(key);
		return value;
	}
	
	public String getAssetType() {
		return assetType.getAssetType();
	}
	
	public String getGenericArtifactType() {
		return genericArtifact.getGenericArtifactType();
	}
	
	public String getBehaviorQualifierType() {
		return behaviorQualifier.getBehaviorQualifierType();
	}
	
	public Object getAssetTypeValue(Object key) {
		return assetType.get(key);
	}

	public void putAssetTypeValue(Object key, Object value) {
		assetType.put(key, value);
	}
	
	public Object getGenericArtifactValue(Object key) {
		return genericArtifact.get(key);
	}

	public void putGenericArtifactValue(Object key, Object value) {
		genericArtifact.put(key, value);
	}
	
	public Object getBehaviorQualifierValue(Object key) {
		return behaviorQualifier.get(key);
	}

	public void putBehaviorQualifierValue(Object key, Object value) {
		behaviorQualifier.put(key, value);
	}
}
