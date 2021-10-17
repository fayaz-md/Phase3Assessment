package com.bean;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.OneToOne;

@Entity
public class Purchase {
	@Id
	@Column(name="purchaseid")
	private int purchaseId;
	@Column(name="purchasedate")
	private LocalDate purchaseDate;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user")
	private User user;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="product")
	private Product product;
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + ", user=" + user + ", product="
				+ product + "]";
	}
	

	

	
}
