package com.meta.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.shop.dao.MemberDao;
import com.meta.shop.model.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDao md;

	@Override
	public Member select(String mId) {
		return md.select(mId);
	}

	@Override
	public int insert(Member member) throws Exception {
		return md.insert(member);
	}


}
