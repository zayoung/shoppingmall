package com.meta.shop.dao;

import java.util.List;

import com.meta.shop.model.Product;

public interface ProductDao {
	List<Product> selectPList(String sort);

	Product detailProduct(int pNum);

}
