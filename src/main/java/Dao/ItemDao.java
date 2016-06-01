package Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import DaoImpl.ItemInfoMapper;
import Entity.ItemInfo;
import Utils.MyBatisUtil;
/**
 * 商品信息相关操作
 * @author 杨凯伟
 *
 * May 31, 2016
 */
public class ItemDao {
	/**
	 * 通过品牌名查询商品信息
	 * @param searchString
	 * @return
	 * @throws Exception
	 */
	public List<ItemInfo> searchByBrandName(String brandName) throws Exception
	{
		List<ItemInfo> list=null;
		SqlSession session = MyBatisUtil.getSession();
		ItemInfoMapper mapper=session.getMapper(ItemInfoMapper.class);
		list=mapper.selectByBrandName(brandName);
		
		return list;
	}
	/**
	 * 通过风格名查询商品信息
	 * @param searchString
	 * @return
	 * @throws Exception
	 */
	public List<ItemInfo> searchByStyle(String styleName) throws Exception
	{
		List<ItemInfo> list=null;
		SqlSession session = MyBatisUtil.getSession();
		ItemInfoMapper mapper=session.getMapper(ItemInfoMapper.class);
		
		list=mapper.selectByStyleName(styleName);
		return list;
	}
	/**
	 * 通过商品编号查询单个商品信息
	 * @param itemNo
	 * @return
	 * @throws Exception
	 */
	public ItemInfo searchByItemNo(String itemNo) throws Exception
	{
		ItemInfo item=null;
		SqlSession session = MyBatisUtil.getSession();
		ItemInfoMapper mapper=session.getMapper(ItemInfoMapper.class);
		item=mapper.selectByPrimaryKey(itemNo);
		
		return item;
		
	}
	/**
	 * 模糊搜索商品信息
	 * @param searchString
	 * @return
	 * @throws Exception
	 */
	public List<ItemInfo> fuzzySearch(String searchString) throws Exception
	{
		List<ItemInfo> list=null;
		SqlSession session = MyBatisUtil.getSession();
		ItemInfoMapper mapper=session.getMapper(ItemInfoMapper.class);
		
		list=mapper.fuzzySelect(searchString);
		return list;
	}
	/**
	 * 展示所有商品信息 分页展示分页查询
	 * @param pageSize
	 * @param wantPage
	 * @return
	 * @throws Exception
	 */
	public List<ItemInfo> showAllItem(int pageSize,int wantPage) throws Exception
	{
		List<ItemInfo> list=null;
		SqlSession session = MyBatisUtil.getSession();
		ItemInfoMapper mapper=session.getMapper(ItemInfoMapper.class);
		int head=(wantPage-1)*pageSize;		
		list=mapper.selectAll(head, pageSize);
		return list;
	}
	
	/**
	 * 修改商品信息
	 * @param record
	 * @return
	 * @throws Exception
	 */
	
	public boolean updateByPrimaryKeySelective(ItemInfo record) throws Exception
	{
		int flag=-1;
		SqlSession session = MyBatisUtil.getSession();
		ItemInfoMapper mapper=session.getMapper(ItemInfoMapper.class);
		flag=mapper.updateByPrimaryKeySelective(record);
		if(flag>0){
			return true;		
		}
		else {
			return false;
		}
	
	}
}
