package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	@Column(name="productid")
	private int productId;
	@Column(name="category")
	private String productCategory;
	@Column(name="productname")
	private String productName;
	@Column(name="price")
	private int productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCategory=" + productCategory + ", productName="
				+ productName + ", productPrice=" + productPrice + "]";
	}
}
