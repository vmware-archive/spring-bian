package io.pivotal.spring.bian.model.controlrecord;

import io.pivotal.spring.bian.model.assettype.Product;
import io.pivotal.spring.bian.model.behaviorqualifier.Property;
import io.pivotal.spring.bian.model.genericartifact.Directory;

public class ProductDirectory extends ControlRecord<Product, Directory, Property> {
	public ProductDirectory() throws InstantiationException, IllegalAccessException {
		super(Product.class, Directory.class, Property.class);
	}
	
	public ProductDirectory(Product product, Directory directory, Property property) {
		super(product, directory, property);
	}
}
