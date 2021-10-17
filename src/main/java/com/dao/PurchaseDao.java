package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Purchase;

@Repository
public interface PurchaseDao extends JpaRepository<Purchase, Integer>{

}
