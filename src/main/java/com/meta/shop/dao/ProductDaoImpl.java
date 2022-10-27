package com.meta.shop.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meta.shop.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public List<Product> selectPList(String sort) {
		return sst.selectList("productns.selectPList", sort);
	}

	@Override
	public Product detailProduct(int pNum) {
		return sst.selectOne("productns.detail", pNum);
	}

	@Override
	public List<Product> bestBedList() {
		return sst.selectList("productns.bestBedList");
	}

	@Override
	public List<Product> bestKitchenList() {
		return sst.selectList("productns.bestKitchenList");
	}

	@Override
	public List<Product> bestLibraryList() {
		return sst.selectList("productns.bestLibraryList");
	}

	@Override
	public List<Product> bestLivingList() {
		return sst.selectList("productns.bestLivingList");
	}

	@Override
	public List<Product> bestPropList() {
		return sst.selectList("productns.bestPropList");
	}

}
