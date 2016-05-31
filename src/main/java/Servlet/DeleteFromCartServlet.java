package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.ItemInfo;
import Entity.UserInfo;
import Service.ItemDeleteFromCartService;

/**从用户购物车中删除商品
 * Servlet implementation class DeleteFromCartServlet
 */
@WebServlet("/DeleteFromCartServlet")
public class DeleteFromCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ItemDeleteFromCartService service=new ItemDeleteFromCartService();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFromCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean flag=false;
		UserInfo userInfo=new UserInfo();
		ItemInfo itemInfo=new ItemInfo();
		userInfo.setLoginid(request.getParameter("userId"));
		itemInfo.setItemno(request.getParameter("itemNo"));
		try {
			flag=service.deleteFromCart(itemInfo, userInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag==true){
			//删除成功
		}
		else{
			//删除失败
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
