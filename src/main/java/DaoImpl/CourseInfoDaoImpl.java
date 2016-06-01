package DaoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Dao.CourseInfoDao;
import Entity.CourseInfo;
import Utils.MyBatisUtil;

public class CourseInfoDaoImpl implements CourseInfoDao {

	/*
	 * 1.读取配置文件信息 2.创建session工厂 3.获取session 4.启动事务 5.数据处理 6.提交、回滚事务 7.关闭session
	 */
	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(CourseInfo courseInfo) {
		int i = 0;
		SqlSession session = null;
		try {
			session =MyBatisUtil.getSession();
			
			// 第一个参数用来定位到SQL语句(命名空间+id)，第二个用来传参
			i = session.insert("Entity.CourseInfoMapper.insert", courseInfo);
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

	public int insertSelective(CourseInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public CourseInfo selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKeySelective(CourseInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(CourseInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<CourseInfo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertLinkcourseuser(int id, int uid, int cid) {
		
		
		
		return 0;
	}

	

}
