package Service;

import Dao.OrderDao;
import Entity.OrderInfo;

public class SummitOrderService {
	OrderDao dao=new OrderDao();
	private boolean flag;
	/**
	 * 付款完毕提交订单
	 * @param orderIndo
	 * @return
	 */
	public boolean summitOrder(OrderInfo orderIndo)
	{
		flag=dao.summitOrder(orderIndo);
		return flag;
		
	}
}
