package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.ItemInfo;
import Entity.UserInfo;
import Service.ItemAddToCartService;

/** 添加商品到用户的购物车
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCartServlet")
public class ItemAddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private ItemAddToCartService service=new ItemAddToCartService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemAddToCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean flag=false;
		ItemInfo itemInfo=new ItemInfo();
		UserInfo userInfo=new UserInfo();
		itemInfo.setItemno(request.getParameter("itemNo"));
		userInfo.setLoginid(request.getParameter("userInfo"));
		
		try {
			flag=service.addToCart(itemInfo, userInfo);
			if(flag==true){
				//添加购物车成功
			}
			else{
				//添加购物车失败
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
