package com.meta.shop.dao;

import com.meta.shop.model.Member;

public interface MemberDao {
	
	//ȸ������
	int insert(Member member);

	Member select(String mId);

	

}
