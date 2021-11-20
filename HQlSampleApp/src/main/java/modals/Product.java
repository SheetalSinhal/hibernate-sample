package modals;

import java.io.Serializable;

import databaseUtils.ValueFetcher;

public class Product implements Serializable {
	private static int product_counter = 0;

	int productId;
	String productName;
	double productPrice;
	String productCategory;
	
	static {
		System.out.println("Product class loaded");
		product_counter=ValueFetcher.getMaxProductId();
	}

	public Product() {
	}

	public Product(String name, double price, String category) {
		productId = ++product_counter;
		productName = name;
		productPrice = price;
		productCategory = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

}
