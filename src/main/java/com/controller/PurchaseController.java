package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Purchase;
import com.service.PurchaseService;

@RestController
public class PurchaseController {
	@Autowired
	PurchaseService purchaseService;
	@PostMapping("/createPurchase")
	public Purchase createPurchase(@RequestBody Purchase purchase) {
				
		return purchaseService.createPurchase(purchase);
	}

	@PutMapping("/purchase")
	public Purchase updatePurchase(@RequestBody Purchase purchase) {
		return purchaseService.updatePurchase(purchase);
	}

	@GetMapping("/purchase/{Id}")
	public Purchase getPurchaseById(@PathVariable (value="Id") int purchaseId) {
		return purchaseService.getPurchaseById(purchaseId);
	}

	@DeleteMapping("/purchase/{Id}")
	public void deletePurchaseById(@PathVariable (value="Id") int purchaseId) {
		purchaseService.deletePurchaseById(purchaseId);
	}
}
