package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.ItemInfo;
import Service.ItemShowService;
/**
 * 用于商店主页面 分页显示商品信息
 * @author 杨凯伟
 *
 * May 28, 2016
 */

@WebServlet("/ItemShowServlet")
public class ItemShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ItemShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pagesize=Integer.parseInt(request.getParameter("pagesize"));
		int wantpage=Integer.parseInt(request.getParameter("wantpage"));
		ItemShowService service=new ItemShowService();
		try {
			List<ItemInfo> list=service.show(pagesize, wantpage);
			request.setAttribute("iteminfolist",list );
			request.getRequestDispatcher("/main.html").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
