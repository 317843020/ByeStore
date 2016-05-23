package DaoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Dao.UserInfoDao;
import Entity.UserInfo;
import Utils.MyBatisUtil;

public class UserInfoDaoImpl implements UserInfoDao {

	/*
	 * 1.读取配置文件信息 2.创建session工厂 3.获取session 4.启动事务 5.数据处理 6.提交、回滚事务 7.关闭session
	 */
	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(UserInfo userInfo) {
		int i = 0;
		SqlSession session = null;
		try {
			session =MyBatisUtil.getSession();
			
			// 第一个参数用来定位到SQL语句(命名空间+id)，第二个用来传参
			i = session.insert("Entity.UserInfoMapper.insert", userInfo);
			System.out.println(i);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		} finally {
			
			MyBatisUtil.closeSession();
		}
		return i;
	}

	public int insertSelective(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public UserInfo selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKeySelective(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<UserInfo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertLinkcourseuser(int id, int uid, int cid) {
		int i = 0;
		SqlSession session = null;
		try {
			session =MyBatisUtil.getSession();
		Map objmap =new HashMap();
		objmap.put("id", id);
		objmap.put("uid", uid);
		objmap.put("cid", cid);
		i = session.insert("Entity.UserInfoMapper.insertusercourse",objmap);
		if(i==1){
			System.out.println("插入成功!");
		}
		System.out.println(i);
		session.commit();
	}catch(Exception e){
		e.printStackTrace();
		session.rollback();
	} finally {
		
		MyBatisUtil.closeSession();
	}
		return i;
	}

}
