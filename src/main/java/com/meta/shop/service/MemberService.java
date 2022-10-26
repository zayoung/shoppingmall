package com.meta.shop.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.meta.shop.model.Member;

public interface MemberService {

	// 고객정보 insert
	public int insert(Member member) throws Exception;

	// id 조회
	public Member select(String mId)throws Exception; 
	
	//목록 조회
	public List<Member> memberList(Member member)throws Exception;
	
	//고객 정보 update
	public void memberUpdate(Member member)throws Exception;
	
	//고객 정보 삭제
	public int memberDelete(int mId)throws Exception;

	//로그인
	public Member login(Member member)throws Exception;
	
	//로그아웃
	public void logout(HttpSession session)throws Exception;


}
