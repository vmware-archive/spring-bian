package io.pivotal.spring.bian.model;

import java.util.HashMap;
import java.util.Map;

public enum ProductIdentifierCode {
	BUYERS_ITEM_NUMBER,
	COMMERCIAL_DESCRIPTION_CODE_NAME,
	EAN,
	MANUFACTERERS_ITEM_NUMBER,
	MODEL_NUMBER,
	PART_NUMBER,
	QUOTA_CATEGORY,
	STYLE_NUMBER,
	SUPPLIERS_ITEM_NUMBER,
	UNIVERSAL_PRODUCT_CODE;	
	private static final Map<String, ProductIdentifierCode> nameIndex = new HashMap<>();
	static {
		for (ProductIdentifierCode productIdentifierCode : ProductIdentifierCode.values()) {
			nameIndex.put(productIdentifierCode.name(), productIdentifierCode);
		}
	}
	public static ProductIdentifierCode lookupByName(String name) {
		return nameIndex.get(name);
	}
}
