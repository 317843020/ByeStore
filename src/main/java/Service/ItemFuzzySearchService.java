package Service;

import java.util.List;


import Dao.ItemDao;
import Entity.ItemInfo;
/**
 * 模糊查找商品信息
 * @author 杨凯伟
 *
 * May 28, 2016
 */
public class ItemFuzzySearchService {
	ItemDao dao=new ItemDao();
	public List<ItemInfo> search(String searchstring) throws Exception
	{
		List<ItemInfo> list=null;
		
		list=dao.fuzzySearch(searchstring);
		return list;
	}
}
