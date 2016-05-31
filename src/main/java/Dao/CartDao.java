package Dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;

import DaoImpl.CartInfoMapper;
import Entity.CartInfo;
import Entity.CartInfoKey;
import Entity.ItemInfo;
import Entity.UserInfo;
import Utils.MyBatisUtil;
/**
 * 购物车相关操作
 * @author 杨凯伟
 *
 * May 31, 2016
 */
public class CartDao {
	/**
	 * 把商品加入用户购物车
	 * @param itemInfo
	 * @param userInfo
	 * @return
	 * @throws Exception 
	 */
	public boolean addToCart(ItemInfo itemInfo,UserInfo userInfo) throws Exception
	{
		int flag=-1;
		SqlSession session = MyBatisUtil.getSession();
		CartInfoMapper mapper=session.getMapper(CartInfoMapper.class);
		CartInfoKey cartInfoKey=new CartInfoKey();
		cartInfoKey.setItemno(itemInfo.getItemno());
		cartInfoKey.setLoginid(userInfo.getLoginid());
		flag=mapper.insert(cartInfoKey);
		session.close();
		System.out.println(flag);
		if(flag>0)return true;
		else return false;

		
	}
	/**
	 * 从用户购物车中删除商品
	 * @param itemInfo
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	public boolean deleteFromCart(ItemInfo itemInfo,UserInfo userInfo) throws Exception
	{
		int flag=-1;
		SqlSession session = MyBatisUtil.getSession();
		CartInfoMapper mapper=session.getMapper(CartInfoMapper.class);
		CartInfoKey cartInfoKey=new CartInfoKey();
		cartInfoKey.setItemno(itemInfo.getItemno());
		cartInfoKey.setLoginid(userInfo.getLoginid());
		flag=mapper.deleteByPrimaryKey(cartInfoKey);
		//To-Do
		session.close();
		if(flag>0)return true;
		else return false;
		
	}
	/**
	 * 查询用户购物车中的商品信息
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	public List<ItemInfo> showCartInfo(String userId) throws Exception
	{
		
		List<ItemInfo> list=null;
		
		SqlSession session = MyBatisUtil.getSession();
		CartInfoMapper mapper=session.getMapper(CartInfoMapper.class);
		CartInfoKey cartInfoKey=new CartInfoKey();
		cartInfoKey.setLoginid(userId);
		list=mapper.showCartInfo(cartInfoKey);
		
		session.close();
		
		return list;
		
	}
	/**
	 * 修改购物车中某一商品购买数量
	 * @param cartInfo
	 * @return
	 * @throws Exception 
	 */
	public boolean auditItemQuantity(CartInfo cartInfo) throws Exception
	{
		boolean flag=false;
		SqlSession session = MyBatisUtil.getSession();
		CartInfoMapper mapper=session.getMapper(CartInfoMapper.class);
		flag=mapper.auditItemQuantity(cartInfo);
		return flag;
	}
	
}
