package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.OrderInfo;
import Service.SummitOrderService;

/**
 * Servlet implementation class SummitOrder
 */
@WebServlet("/SummitOrder")
public class SummitOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private SummitOrderService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummitOrder() {
        super();
        service=new SummitOrderService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//接收数据
		
		OrderInfo orderInfo=new OrderInfo();		
		service.summitOrder(orderInfo);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
