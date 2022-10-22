package com.meta.shop.service;

import java.util.List;

import com.meta.shop.model.Member;

public interface MemberService {

	// 고객정보 insert
	public int insert(Member member) throws Exception;

	// id 조회
	Member select(String mId); 
	
	//목록 조회
	List<Member> memberList(Member member);
	
	//고객 정보 update
	void memberUpdate(Member member);
	
	//고객 정보 삭제
	void memverDelete(int mId);

}
