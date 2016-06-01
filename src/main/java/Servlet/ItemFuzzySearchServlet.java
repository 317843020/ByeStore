package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.ItemInfo;
import Service.ItemFuzzySearchService;

/**@author 杨凯伟
 * 商品信息模糊搜索
 * Servlet implementation class ItemFuzzySearchServlet
 */
@WebServlet("/ItemFuzzySearchServlet")
public class ItemFuzzySearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ItemFuzzySearchService service=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemFuzzySearchServlet() {
        super();
        service=new ItemFuzzySearchService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String searchstring=request.getParameter("searchstring");
		try {
			List<ItemInfo> list=service.search(searchstring);
			request.setAttribute("iteminfo", list);
			request.getRequestDispatcher("/ItemSearch.html").forward(request, response);
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
