package com.meta.shop.dao;

import com.meta.shop.model.Member;

public interface MemberDao {
	
	//회원가입
	int insert(Member member);

	Member select(String mId);

	

}
