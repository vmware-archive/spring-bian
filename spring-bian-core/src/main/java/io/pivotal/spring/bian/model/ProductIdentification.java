package io.pivotal.spring.bian.model;

public class ProductIdentification {
	public String globalSerialIdentifier;
	private String identifier;
	private ProductIdentifierCode type;
	public ProductIdentification(String globalSerialIdentifier, String identifier, ProductIdentifierCode type) {
		super();
		this.globalSerialIdentifier = globalSerialIdentifier;
		this.identifier = identifier;
		this.type = type;
	}
	public String getGlobalSerialIdentifier() {
		return globalSerialIdentifier;
	}
	public void setGlobalSerialIdentifier(String globalSerialIdentifier) {
		this.globalSerialIdentifier = globalSerialIdentifier;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public ProductIdentifierCode getType() {
		return type;
	}
	public void setType(ProductIdentifierCode type) {
		this.type = type;
	}
}
