package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.ItemCommentsInfo;
import Entity.ItemInfo;
import Service.ItemShowCommentsService;

/**
 * Servlet implementation class ItemShowCommentsServlet
 */
@WebServlet("/ItemShowCommentsServlet")
public class ItemShowCommentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ItemShowCommentsService service=new ItemShowCommentsService(); 
    private List<ItemCommentsInfo> result=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemShowCommentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		result=null;
		ItemInfo itemInfo=new ItemInfo();
		int wantPage=Integer.getInteger(request.getParameter("wantpage"));
		int pageSize=Integer.getInteger(request.getParameter("pageSize"));
		itemInfo.setItemno(request.getParameter("itemNo"));
		try {
			result=service.showComments(wantPage, pageSize, itemInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result!=null){
			request.setAttribute("itemCommentsInfo", result);
			request.getRequestDispatcher("/itemCommentsInfo.html").forward(request, response);
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
