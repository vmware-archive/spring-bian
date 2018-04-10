package io.pivotal.spring.bian.model;

import java.util.HashMap;
import java.util.Map;

public enum ProductCategoryCode {
	LINE_OF_BUSINESS,
	PRODUCT_GROUP,
	QUOTA_CATEGORY;	
	private static final Map<String, ProductCategoryCode> nameIndex = new HashMap<>();
	static {
		for (ProductCategoryCode productCategoryCode : ProductCategoryCode.values()) {
			nameIndex.put(productCategoryCode.name(), productCategoryCode);
		}
	}
	public static ProductCategoryCode lookupByName(String name) {
		return nameIndex.get(name);
	}
}
