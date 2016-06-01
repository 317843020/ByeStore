package Service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

import Entity.CourseInfo;
import ServiceImpl.CourseServiceImpl;

public class TestCourseService {

	private static final Logger LOGGER = Logger
			.getLogger(TestCourseService.class);

	private CourseService courseService= new CourseServiceImpl();

	
	@Test
	public void testQueryById1() {
		CourseInfo courseInfo = courseService.getCourseById(1);
		LOGGER.info(JSON.toJSON(courseInfo));
	}

	@Test
	public void testQueryAll() {
		List<CourseInfo> courseInfos = courseService.getCourses();
		LOGGER.info(JSON.toJSON(courseInfos));
	}

	
	@Test
	public void testInsertCourse(){
		CourseInfo courseInfo = new CourseInfo();
		
		courseInfo.setId("1");
		courseInfo.setCaddress("fefe");
		courseInfo.setCname("ffff");
		courseService.insert(courseInfo);
		
	}

}
