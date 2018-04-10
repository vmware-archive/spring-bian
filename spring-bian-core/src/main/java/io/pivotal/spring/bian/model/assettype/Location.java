package io.pivotal.spring.bian.model.assettype;

public class Location extends AssetType {
	private static final String ASSET_TYPE = "Product";

	@Override
	public String getAssetType() {
		return ASSET_TYPE;
	}

}
