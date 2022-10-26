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
	
    //로그인
	@RequestMapping("loginForm") 
		public String loginForm(Model model, HttpServletRequest request) {
		String prevUrl = request.getHeader("referer");
		prevUrl = prevUrl.substring(21);
		request.getSession().setAttribute("prevUrl", prevUrl);
		return "member/loginForm";
		
	}
	 @RequestMapping("loginAction")
	   	public String loginAction(Member member, Model model, HttpServletRequest request) throws Exception {
		 String prevUrl = (String) request.getSession().getAttribute("prevUrl");
		 Member login = ms.login(member);
		 session = request.getSession();
		 
		 String id = member.getmId();
		 String pw = member.getmPw();
		 
		 Member member2 = ms.select(id);
		 if(login != null) {
			 session.setAttribute("login", login);
			 session.setAttribute("id", id);
			 session.setAttribute("pw", pw);
		}else {
			session.setAttribute("login", null);
		}
		 model.addAttribute("login", login);
		 model.addAttribute("prevUrl", prevUrl);
		 
	       	return "member/loginAction";
	       	
	   	}
	
	//회원가입
	@RequestMapping("joinForm")  //회원가입form
		public String joinForm(Model model, HttpServletRequest request) {
		String prevUrl = request.getHeader("referer");
		prevUrl = prevUrl.substring(21);
		request.getSession().setAttribute("prevUrl", prevUrl);
		return "member/joinForm";
	
	}
	
	@RequestMapping("joinAction")
		public String joinAction(Member member, Model model, HttpServletRequest request) throws Exception {
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
	public String memberList(Member member, HttpSession session, Model model) throws Exception {
		List<Member> mList = ms.memberList(member);
		model.addAttribute("mList", mList);
		return "member/memberList";
	}
	
	//로그아웃 
	@RequestMapping("logout")
	public String logout(HttpSession session) throws Exception {
		ms.logout(session);
		return "member/logout";
	}
	
	//마이페이지 이동
	@RequestMapping("myPage")
	public String myPage(Model model, HttpServletRequest request)throws Exception{
		String prevUrl = request.getHeader("referer");
		prevUrl = prevUrl.substring(21);
		request.getSession().setAttribute("prevUrl", prevUrl);
			return "mypage/myPage";
	}
	//내 정보 리스트
	@RequestMapping("myInfo")
	public String myInfo(String mId, HttpSession session, Model model)throws Exception{
			Member mList = (Member)session.getAttribute("loginAction");
			Member members = ms.select(mList.getmId());
			model.addAttribute("members", members);
			System.out.println(mList);
			return "mypage/myInfo";
	}
	
	
}
