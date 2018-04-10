package io.pivotal.spring.bian.model;

import java.util.HashMap;
import java.util.Map;

public enum ProductCharacteristicsCode {
	BUYERS_ITEM_SPECIFICATION;	
	private static final Map<String, ProductCharacteristicsCode> nameIndex = new HashMap<>();
	static {
		for (ProductCharacteristicsCode productCharacteristicsCode : ProductCharacteristicsCode.values()) {
			nameIndex.put(productCharacteristicsCode.name(), productCharacteristicsCode);
		}
	}
	public static ProductCharacteristicsCode lookupByName(String name) {
		return nameIndex.get(name);
	}
}
