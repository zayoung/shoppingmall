package com.meta.shop.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meta.shop.model.Member;
import com.meta.shop.service.MemberService;



@Controller
public class MemberController {
	
	
	@Autowired
	private MemberService ms;  
	
    @Autowired
	private HttpSession session;
	
	@RequestMapping("loginForm") //로그인form
		public String loginForm(Model model, HttpServletRequest request) {
		String prevUrl = request.getHeader("referer");
		prevUrl = prevUrl.substring(21);
		request.getSession().setAttribute("prevUrl", prevUrl);
		return "member/loginForm";
		
	}
	@RequestMapping("joinForm")  //회원가입form
		public String joinForm(Model model, HttpServletRequest request) {
		String prevUrl = request.getHeader("referer");
		prevUrl = prevUrl.substring(21);
		request.getSession().setAttribute("prevUrl", prevUrl);
		return "member/joinForm";
	
	}
	
	@RequestMapping("joinAction")
		public String joinAction(Member member, HttpSession session, Model model, HttpServletRequest request) throws Exception {
		String prevUrl = (String) request.getAttribute("prevUrl");
		Member member1 = ms.select(member.getmId()); 
		int result = 0;
		if(member1 == null) {
			result = ms.insert(member);			
		}else if( member1 != null) {
			result = -1;
		}
		model.addAttribute("result", result);
		model.addAttribute("prevUrl", prevUrl);
		
		return "member/joinAction";
	}

	//고객 관리 목록 화면 <관리자> 
	@RequestMapping("memberList")
	public String memberList(Member member, HttpSession session, Model model) {
		List<Member> mList = ms.memberList(member);
		model.addAttribute("mList", mList);
		System.out.println(mList);
		return "member/memberList";
	}
}
