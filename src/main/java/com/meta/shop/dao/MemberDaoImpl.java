package com.meta.shop.dao;

import java.util.HashMap;
import java.util.List;

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

	@Override
	public List<Member> memberList(Member member) {
		return sst.selectList("memberns.mList", member);
	}
	
	@Override
	public Member login(Member member) {
		return sst.selectOne("memberns.login", member);
	}
}
