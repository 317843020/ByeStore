package Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import DaoImpl.ItemCommentsInfoMapper;
import Entity.ItemCommentsInfo;
import Entity.ItemInfo;
import Utils.MyBatisUtil;
/**
 * 商品评论信息相关操作
 * @author 杨凯伟
 *
 * May 31, 2016
 */
public class ItemCommentsDao {
	/**
	 * 查询单个商品评论记录
	 * @param wantPage 请求页号
	 * @param pageSize 每一页的显示记录数
	 * @param itemInfo 商品信息
	 * @return
	 * @throws Exception
	 */
	public List<ItemCommentsInfo> getCommentsByItemNo(int wantPage,int pageSize,ItemInfo itemInfo) throws Exception
	{
		List<ItemCommentsInfo> list=null;		
		SqlSession session = MyBatisUtil.getSession();
		ItemCommentsInfoMapper mapper=session.getMapper(ItemCommentsInfoMapper.class);
		int head=(wantPage-1)*pageSize;		
		list=mapper.selectByItemNo(head, pageSize,itemInfo.getItemno());
		//To-Do
		return list;
		
	}
}
