package Service;

import java.util.List;

import Dao.ItemCommentsDao;
import Entity.ItemCommentsInfo;
import Entity.ItemInfo;

public class ItemShowCommentsService {
	
	ItemCommentsDao dao=new ItemCommentsDao();
	public List<ItemCommentsInfo> showComments(int wantPage,int pageSize,ItemInfo itemInfo) throws Exception
	{
		List<ItemCommentsInfo> list=null;
		list=dao.getCommentsByItemNo(wantPage, pageSize, itemInfo);
		return list;
		
	}
}
