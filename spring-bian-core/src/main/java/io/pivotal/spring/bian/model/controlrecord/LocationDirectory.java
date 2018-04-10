package io.pivotal.spring.bian.model.controlrecord;

import io.pivotal.spring.bian.model.assettype.Location;
import io.pivotal.spring.bian.model.assettype.Product;
import io.pivotal.spring.bian.model.behaviorqualifier.Property;
import io.pivotal.spring.bian.model.genericartifact.Directory;

public class LocationDirectory extends ControlRecord<Location, Directory, Property> {
	public LocationDirectory() throws InstantiationException, IllegalAccessException {
		super(Location.class, Directory.class, Property.class);
	}
	
	public LocationDirectory(Location location, Directory directory, Property property) {
		super(location, directory, property);
	}
}
