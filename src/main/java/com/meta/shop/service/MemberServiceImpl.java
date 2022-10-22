package com.meta.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.shop.dao.MemberDao;
import com.meta.shop.model.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao md;

	@Override
	public Member select(String mId) {
		return md.select(mId);
	}

	@Override
	public int insert(Member member) throws Exception {
		return md.insert(member);
	}

	@Override
	public List<Member> memberList(Member member) {
		return md.memberList(member);
	}

	@Override
	public void memberUpdate(Member member) {
		
	}

	@Override
	public void memverDelete(int mId) {
		// TODO Auto-generated method stub
		
	}


}
