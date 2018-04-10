package io.pivotal.spring.bian.model;

public class ProductCategory {
	private String category;
	//public CardPaymentValidation relatedCardPaymentValidation;
	private ProductCategoryCode type;
	public ProductCategory(String category, ProductCategoryCode type) {
		super();
		this.category = category;
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public ProductCategoryCode getType() {
		return type;
	}
	public void setType(ProductCategoryCode type) {
		this.type = type;
	}
}
