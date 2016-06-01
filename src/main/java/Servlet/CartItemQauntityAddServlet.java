package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.CartInfo;
import Service.AuditCartItemQuantityService;

/**
 * Servlet implementation class CartItemQauntityAddServlet
 */
@WebServlet("/CartItemQauntityAddServlet")
public class CartItemQauntityAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private boolean flag;   
    private AuditCartItemQuantityService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartItemQauntityAddServlet() {
        super();
        service=new AuditCartItemQuantityService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		flag = false;
		int itemQuantity=Integer.parseInt(request.getParameter("itemQuantity"));
		/*String itemNo=request.getParameter("itemNo");
		String userId=request.getSession().getAttribute("userId").toString();*/
		CartInfo cartInfo=new CartInfo();
		if(itemQuantity<=0){
			return;
		}
		
		try {
			flag=service.auditItemQuantity(cartInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag==true){
			//执行成功 跳转到ShowCartInfoServlet
			request.getRequestDispatcher("/ShowCartInfoServlet").forward(request, response);
		}
		else{
			//执行失败
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
