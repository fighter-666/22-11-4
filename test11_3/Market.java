package test11_3;

public class Market {
	private String  marketName;
	private Product[] productArr;//仓库，存储商品，里面存储若干商品
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public Product[] getProductArr() {
		return productArr;
	}
	public void setProductArr(Product[] productArr) {
		this.productArr = productArr;
	}
	public Product sell(String name) {
		for(int i = 0;i<productArr.length;i++) {
			if(productArr[i].getProName() == name) {
				return productArr[i];
			}
		}
		return null;
	}
}
