package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Purchase;
import com.dao.PurchaseDao;

@Service
public class PurchaseService {

	@Autowired
	PurchaseDao purchaseDao;
	
	public Purchase createPurchase(Purchase purchase) {
		return purchaseDao.save(purchase);
	}

	public Purchase updatePurchase(Purchase purchase) {
		return purchaseDao.save(purchase);
	}

	public Purchase getPurchaseById(int id) {
		return purchaseDao.findById(id).get();
	}

	public void deletePurchaseById(int id) {
		purchaseDao.deleteById(id);
		
	}
}
