package com.mvc.member.model.service;

import java.sql.Connection;

import static com.mvc.common.jdbc.JDBCTemplate.*;
import com.mvc.member.model.dao.MemberDao;
import com.mvc.member.model.vo.Member;

public class MemberService {
	private MemberDao dao = new MemberDao();
	
	public Member login(String id, String pwd) {
		
		return dao.findMemberByIdAndPwd(id, pwd);
		
		
		
	}

//	public int signupMember(Member member) {
//		return dao.insertMember();
//	}
}
