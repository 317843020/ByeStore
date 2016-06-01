package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.ItemInfo;
import Service.ShowCartInfoService;

/**
 * Servlet implementation class ShowCartInfoServlet
 */
@WebServlet("/ShowCartInfoServlet")
public class ShowCartInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private ShowCartInfoService service=null;
      private List<ItemInfo> list=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCartInfoServlet() {   	
        super();
        service=new ShowCartInfoService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId=request.getSession().getAttribute("userId").toString();
		try {
			list=service.showCartInfo(userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(list!=null){
			request.setAttribute("cartItemInfo", list);
			request.getRequestDispatcher("/CartInfo.html").forward(request, response);
			//执行成功
		}
		else{
			//执行失败或购物车无商品信息
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
