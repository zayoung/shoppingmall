package com.meta.shop.service;

import com.meta.shop.model.Member;

public interface MemberService {

	// ȸ������
	public int insert(Member member) throws Exception;

	Member select(String mId); //ȸ������

}
