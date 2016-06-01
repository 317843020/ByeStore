package Service;

import Dao.CartDao;
import Entity.ItemInfo;
import Entity.UserInfo;

public class ItemDeleteFromCartService {
	CartDao dao=new CartDao();
	public boolean deleteFromCart(ItemInfo itemInfo,UserInfo userInfo) throws Exception
	{
		boolean flag=false;
		flag=dao.deleteFromCart(itemInfo, userInfo);
		return flag;
		
	}
}
