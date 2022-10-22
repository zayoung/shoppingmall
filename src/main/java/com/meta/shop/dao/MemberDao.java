package com.meta.shop.dao;

import java.util.List;

import com.meta.shop.model.Member;

public interface MemberDao {
	
	//회원가입
	int insert(Member member);

	Member select(String mId);

	List<Member> memberList(Member member);

	

}
