package Dao;

import org.apache.ibatis.session.SqlSession;
import DaoImpl.StyleInfoMapper;
import Entity.StyleInfo;
import Utils.MyBatisUtil;

/**
 * 风格相关操作
 * @author 杨凯伟
 *
 * May 31, 2016
 */
public class StyleDao {
	/**
	 * 插入新风格信息
	 * @param styleInfo
	 * @return
	 * @throws Exception
	 */
	boolean insert(StyleInfo styleInfo) throws Exception
	{
		int flag=-1;
		SqlSession session = MyBatisUtil.getSession();
		StyleInfoMapper mapper=session.getMapper(StyleInfoMapper.class);
		flag=mapper.insert(styleInfo);
		if(flag>0)return true;
		else return false;		
	}
	/**
	 * 删除风格信息
	 * @param styleInfo
	 * @return
	 * @throws Exception
	 */
	boolean deleteByPrimaryKey(StyleInfo styleInfo) throws Exception
	{
		int flag=-1;
		SqlSession session = MyBatisUtil.getSession();
		StyleInfoMapper mapper=session.getMapper(StyleInfoMapper.class);
		flag=mapper.deleteByPrimaryKey(styleInfo.getStyleno());
		if(flag>0)return true;
		else return false;
		
	}
	/**
	 * 更新风格信息
	 * @param styleInfo
	 * @return
	 * @throws Exception
	 */
	boolean updateByPrimaryKey(StyleInfo styleInfo) throws Exception
	{
		int flag=-1;
		SqlSession session = MyBatisUtil.getSession();
		StyleInfoMapper mapper=session.getMapper(StyleInfoMapper.class);
		flag=mapper.updateByPrimaryKey(styleInfo);
		if(flag>0)return true;
		else return false;			
	}
}
