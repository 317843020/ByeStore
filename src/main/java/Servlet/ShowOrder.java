package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.OrderInfo;
import Service.ShowOrderInfoService;

/**显示用户订单信息
 * Servlet implementation class ShowOrder
 */
@WebServlet("/ShowOrder")
public class ShowOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private ShowOrderInfoService service;
      private List<OrderInfo> list;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowOrder() {
        super();
        service=new ShowOrderInfoService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId=request.getSession().getAttribute("userId").toString();
		list=service.showOrderInfo(userId);
		request.setAttribute("orderInfo", list);
		request.getRequestDispatcher("/orderInfo.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
