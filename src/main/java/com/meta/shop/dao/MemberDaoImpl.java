package com.meta.shop.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meta.shop.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public int insert(Member member) {
		return sst.insert("memberns.insert", member);
	}

	@Override
	public Member select(String mId) {
		return sst.selectOne("memberns.select", mId);
	}

}
