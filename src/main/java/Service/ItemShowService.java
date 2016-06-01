package Service;

import java.util.List;

import Dao.ItemDao;
import Entity.ItemInfo;

public class ItemShowService {
	
	ItemDao dao=new ItemDao();
	public List<ItemInfo> show(int pagesize,int wantpage) throws Exception
	{
		
		List<ItemInfo> list=dao.showAllItem(pagesize, wantpage);
		return list;
	}
}
