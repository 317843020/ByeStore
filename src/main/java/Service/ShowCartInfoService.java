package Service;

import java.util.List;

import Dao.CartDao;
import Entity.ItemInfo;

public class ShowCartInfoService { 
	CartDao dao =new CartDao();
	public List<ItemInfo> showCartInfo(String userId) throws Exception
	{
		List<ItemInfo> list=null;
		list=dao.showCartInfo(userId);
		return list;
		
	}
}
