package com.meta.shop.controller;

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
	private MemberService ms;  //Memberservice.java가 membercontroller에 자동 주입
	
	@RequestMapping("loginForm") //로그인 페이지 이동
		public String loginForm(Model model, HttpServletRequest request) {
		String prevUrl = request.getHeader("referer");
		prevUrl = prevUrl.substring(21);
		request.getSession().setAttribute("prevUrl", prevUrl);
		return "member/loginForm";
		
	}
	
	@RequestMapping("joinForm")  //회원가입 페이지 이동
		public String joinForm(Model model, HttpServletRequest request) {
		String prevUrl = request.getHeader("referer");
		prevUrl = prevUrl.substring(21);
		request.getSession().setAttribute("prevUrl", prevUrl);
		return "member/joinForm";
	
	}
	
	@RequestMapping("joinAction")
		public String joinAction(Member member, HttpSession session, Model model, HttpServletRequest request) throws Exception {
		String prevUrl = (String) request.getAttribute("prevUrl");
		Member member1 = ms.select(member.getmId()); //아이디 찾아보기
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

}
