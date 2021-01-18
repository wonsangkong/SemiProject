package com.mvc.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.member.model.service.MemberService;
import com.mvc.member.model.vo.Member;


@WebServlet( name= "login", urlPatterns = "/login")
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MemberLoginServlet() {
    }
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		Member member = null;
		
		System.out.println("userId : " + userId + ", userPwd : " + userPwd);
		
		member = new MemberService().login(userId, userPwd);
		
		System.out.println("sql 확인용 : "+member);
		
		if(member != null) {
			HttpSession session = request.getSession();
			
			session.setAttribute("loginMember", member);
			
			System.out.println("Session ID : " + session.getId());
			
			// 로그인 완료시 메인화면으로 이동 
			response.sendRedirect(request.getContextPath() + "/");
			
		} else {
			request.setAttribute("msg", "아이디나 비밀번호가 일치하지 않습니다.");
			request.setAttribute("location", "/");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/common/msg.jsp");
			
			dispatcher.forward(request, response);
		}
		
	}

}
