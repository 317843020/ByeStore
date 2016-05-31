package Service;

import java.util.List;

import Dao.OrderDao;
import Entity.OrderInfo;

public class ShowOrderInfoService {
	OrderDao dao=new OrderDao();
	/**
	 * 显示用户订单信息
	 * @param userId
	 * @return
	 */
	public List<OrderInfo>showOrderInfo(String userId) 
	{
		List<OrderInfo> list=dao.showOrderInfo(userId);
		return list;
		
	}
}
