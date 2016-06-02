package Service;

import Dao.ItemDao;
import Entity.ItemInfo;

public class ItemSearchByNoService {
	ItemDao dao=new ItemDao();
	 
	public ItemInfo searchByNo(ItemInfo itemInfo) throws Exception
	{
		dao.searchByItemNo(itemInfo.getItemno());
		return itemInfo;
		
	}
}
