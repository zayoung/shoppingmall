package com.meta.shop.service;

import java.util.List;

import com.meta.shop.model.Product;

public interface ProductService {

	List<Product> selectPList(String sort);

	Product detailProduct(int pNum);
	
	

}
