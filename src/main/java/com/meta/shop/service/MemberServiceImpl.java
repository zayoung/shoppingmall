package com.meta.shop.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.shop.dao.MemberDao;
import com.meta.shop.model.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao md;

	@Override
	public Member select(String mId) throws Exception {
		return md.select(mId);
	}

	@Override
	public int insert(Member member) throws Exception {
		return md.insert(member);
	}

	@Override
	public List<Member> memberList(Member member) throws Exception{
		return md.memberList(member);
	}

	@Override
	public void memberUpdate(Member member) throws Exception{
		
	}

	@Override
	public int memberDelete(int mId) throws Exception{
		return md.memberDelete(mId);
		
	}

	@Override
	public Member login(Member member) throws Exception{
		return md.login(member);
	}

	@Override
	public void logout(HttpSession session) throws Exception {
		session.invalidate();
		
	}

}
