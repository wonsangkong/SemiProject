package com.mvc.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.member.model.service.MemberService;
import com.mvc.member.model.vo.Member;


@WebServlet("/member/signup")
public class MemberSignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MemberSignupServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 회원가입 페이지로 전환
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/signup.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member member = new Member();
		String msg = null;
		
		member.setUserId(request.getParameter("userId"));
		member.setUserPwd(request.getParameter("userPwd"));
		member.setUserName(request.getParameter("userName"));
		member.setPhone(request.getParameter("phone"));
		member.setEmail(request.getParameter("email"));
		member.setAddress(request.getParameter("address"));
		
		System.out.println(member);
		
		// DB에 저장하기
//		int result = new MemberService().signupMember(member);
		
		request.setAttribute("msg", "회원가입 성공! 환영합니다.^^");
		request.setAttribute("location", "/");
		
		request.getRequestDispatcher("/views/common/msg.jsp").forward(request, response);
	}

}
