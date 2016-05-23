package ServiceImpl;

import java.util.List;

import Dao.CourseInfoDao;
import DaoImpl.CourseInfoDaoImpl;
import Entity.CourseInfo;
import Service.CourseService;

public class CourseServiceImpl implements CourseService {

	private CourseInfoDao CourseInfoDao = new CourseInfoDaoImpl();
	
	
	
	public CourseInfo getCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CourseInfo> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(CourseInfo CourseInfo) {
		int i = CourseInfoDao.insert(CourseInfo);
		return i;
	}
	


}
