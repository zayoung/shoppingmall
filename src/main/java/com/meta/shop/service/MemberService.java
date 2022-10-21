package com.meta.shop.service;

import com.meta.shop.model.Member;

public interface MemberService {

	// 회원가입
	public int insert(Member member) throws Exception;

	Member select(String mId); //회원가입

}
