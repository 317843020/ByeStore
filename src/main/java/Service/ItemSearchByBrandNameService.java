package Service;



import java.util.List;

import Dao.ItemDao;
import Entity.ItemInfo;

public class ItemSearchByBrandNameService {

	ItemDao dao=new ItemDao();
	
	public List<ItemInfo> searchByBrandName(String brandName) throws Exception
	{
		List<ItemInfo> list=dao.searchByBrandName(brandName);
		return list;
	}
}
