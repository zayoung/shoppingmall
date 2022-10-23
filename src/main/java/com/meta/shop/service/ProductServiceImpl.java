package com.meta.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.shop.dao.ProductDao;
import com.meta.shop.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao pd;

	@Override
	public List<Product> selectPList(String sort) {
		return pd.selectPList(sort);
	}

	@Override
	public Product detailProduct(int pNum) {
		return pd.detailProduct(pNum);
	}

}
