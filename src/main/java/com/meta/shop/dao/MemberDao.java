package com.meta.shop.dao;

import java.util.List;

import com.meta.shop.model.Member;

public interface MemberDao {
	
	//회원가입
	int insert(Member member);
	
	Member select(String mId);
	
	//회원 리스트
	List<Member> memberList(Member member);

	Member login(Member member);


	

}
