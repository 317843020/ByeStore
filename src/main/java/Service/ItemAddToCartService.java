package Service;

import Dao.CartDao;
import Entity.ItemInfo;
import Entity.UserInfo;

public class ItemAddToCartService {
	CartDao dao=new CartDao();
	public boolean addToCart(ItemInfo itemInfo,UserInfo userInfo) throws Exception
	{
		boolean flag=false;
		flag=dao.addToCart(itemInfo, userInfo);
		return flag;
		
	}
}
