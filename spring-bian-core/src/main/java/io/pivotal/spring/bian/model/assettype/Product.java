package io.pivotal.spring.bian.model.assettype;

import java.util.List;

import io.pivotal.spring.bian.model.Agreement;
import io.pivotal.spring.bian.model.ProductCategory;
import io.pivotal.spring.bian.model.ProductCharacteristic;
import io.pivotal.spring.bian.model.ProductDelivery;
import io.pivotal.spring.bian.model.ProductIdentification;
import io.pivotal.spring.bian.model.ProductQuantity;

public class Product extends AssetType {
	private static final String ASSET_TYPE = "Product";
	
	public List<Agreement> agreements;
	public List<ProductCharacteristic> characteristics;
	public ProductDelivery delivery;
	private String description;
	private String name;
	//public ProductBrokerMasterAgreement productBrokerMasterAgreement;
	public List<ProductCategory> productCategories;
	public List<ProductIdentification> productIdentifications;
	private String quality;
	public List<ProductQuantity> quantities;
	
	@Override
	public String getAssetType() {
		return ASSET_TYPE;
	}

	public List<Agreement> getAgreements() {
		return agreements;
	}

	public void setAgreements(List<Agreement> agreements) {
		this.agreements = agreements;
	}

	public List<ProductCharacteristic> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(List<ProductCharacteristic> characteristics) {
		this.characteristics = characteristics;
	}

	public ProductDelivery getDelivery() {
		return delivery;
	}

	public void setDelivery(ProductDelivery delivery) {
		this.delivery = delivery;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductCategory> getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(List<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}

	public List<ProductIdentification> getProductIdentifications() {
		return productIdentifications;
	}

	public void setProductIdentifications(List<ProductIdentification> productIdentifications) {
		this.productIdentifications = productIdentifications;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public List<ProductQuantity> getQuantities() {
		return quantities;
	}

	public void setQuantities(List<ProductQuantity> quantities) {
		this.quantities = quantities;
	}


}
