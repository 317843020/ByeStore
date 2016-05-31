package Servlet.User;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BaseServlet.BaseServlet;



public class UserServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;


	
	public String list(HttpServletRequest req,HttpServletResponse resp) {
		System.out.println("hello action");
		return "user/user.jsp";
	}
	
	
}
