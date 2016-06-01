package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.ItemInfo;
import Service.ItemSearchByBrandNameService;

/**
 * Servlet implementation class ItemSearchByBrand
 */
@WebServlet("/ItemSearchByBrand")
public class ItemSearchByBrandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ItemSearchByBrandNameService service=new ItemSearchByBrandNameService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemSearchByBrandServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String brandName=request.getParameter("brandName");
		try {
			List<ItemInfo> list=service.searchByBrandName(brandName);
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
