package Service;

import Dao.CartDao;
import Entity.CartInfo;


public class AuditCartItemQuantityService {
	private boolean flag;
	CartDao dao=new CartDao();
	/**
	 * 修改购物车中某一商品购买数量
	 * @param userInfo
	 * @param itemNo
	 * @return
	 * @throws Exception 
	 */
	public boolean auditItemQuantity(CartInfo cartInfo) throws Exception
	{
		flag=false;
		flag=dao.auditItemQuantity(cartInfo);
		return flag;
	}
	
}
