package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.ItemInfo;
import Service.ItemSearchByNoService;

/**查看单个商品详细信息 返回商品信息及评论信息
 * Servlet implementation class ItemSearchByNo
 */
@WebServlet("/ItemSearchByNo")
public class ItemSearchByNoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ItemSearchByNoService service=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemSearchByNoServlet() {
        super();
        // TODO Auto-generated constructor stub
        service=new ItemSearchByNoService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ItemInfo itemInfo=new ItemInfo();
		ItemInfo result=null;
		itemInfo.setItemno(request.getParameter("itemNo"));
		try {
			result=service.searchByNo(itemInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result!=null){
			request.setAttribute("itemInfo", result);
			request.getRequestDispatcher("/ItemDetail.html").forward(request, response);
			//执行成功
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
