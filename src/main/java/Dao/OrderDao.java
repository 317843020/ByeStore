package Dao;

import java.util.List;

import Entity.OrderInfo;
/**
 * 订单相关操作
 * @author 杨凯伟
 *
 * May 31, 2016
 */
public class OrderDao {
	/**
	 * 付款完毕提交订单
	 * @param orderIndo
	 * @return
	 */
	public boolean summitOrder(OrderInfo orderIndo)
	{
		return false;
		
	}
	/**
	 * 显示用户订单信息
	 * @param userId
	 * @return
	 */
	public List<OrderInfo>showOrderInfo(String userId) 
	{
		List<OrderInfo> list=null;
		return list;
		
	}
}
