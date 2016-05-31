package Dao;

import org.apache.ibatis.session.SqlSession;

import DaoImpl.BrandInfoMapper;
import Entity.BrandInfo;
import Utils.MyBatisUtil;
/**
 * 品牌相关操作
 * @author 杨凯伟
 *
 * May 31, 2016
 */
public class BrandDao {
	/**
	 * 插入新品牌信息
	 * @param brandInfo
	 * @return
	 * @throws Exception
	 */
	boolean insert(BrandInfo brandInfo) throws Exception
	{
		int flag=-1;
		SqlSession session = MyBatisUtil.getSession();
		BrandInfoMapper mapper=session.getMapper(BrandInfoMapper.class);
		flag=mapper.insert(brandInfo);
		if(flag>0)return true;
		else return false;
		
	}
	/**
	 * 删除品牌信息
	 * @param brandInfo
	 * @return
	 * @throws Exception
	 */
	boolean deleteByPrimaryKey(BrandInfo brandInfo) throws Exception
	{
		int flag=-1;
		SqlSession session = MyBatisUtil.getSession();
		BrandInfoMapper mapper=session.getMapper(BrandInfoMapper.class);
		flag=mapper.deleteByPrimaryKey(brandInfo.getBrandno());
		if(flag>0)return true;
		else return false;
		
	}
	/**
	 * 更新品牌信息
	 * @param brandInfo
	 * @return
	 * @throws Exception
	 */
	boolean updateByPrimaryKey(BrandInfo brandInfo) throws Exception
	{
		int flag=-1;
		SqlSession session = MyBatisUtil.getSession();
		BrandInfoMapper mapper=session.getMapper(BrandInfoMapper.class);
		flag=mapper.updateByPrimaryKey(brandInfo);
		if(flag>0)return true;
		else return false;
	
		
	}
}
