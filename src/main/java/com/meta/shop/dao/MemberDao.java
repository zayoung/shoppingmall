package com.meta.shop.dao;

import java.util.List;

import com.meta.shop.model.Member;

public interface MemberDao {
	
	//회원가입
	int insert(Member member)throws Exception;
	
	Member select(String mId)throws Exception;
	
	//회원 리스트
	List<Member> memberList(Member member)throws Exception;

	public Member login(Member member) throws Exception;

	int memberDelete(int mId) throws Exception;


	

}
