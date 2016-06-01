package Service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

import Entity.CourseInfo;
import Entity.UserInfo;
import ServiceImpl.CourseServiceImpl;
import ServiceImpl.UserServiceImpl;

public class TestUserService {

	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);

	private UserService userService= new UserServiceImpl();
	private CourseService courseService= new CourseServiceImpl();
	
	@Test
	public void testQueryById1() {
		UserInfo userInfo = userService.getUserById(1);
		LOGGER.info(JSON.toJSON(userInfo));
	}

	@Test
	public void testQueryAll() {
		List<UserInfo> userInfos = userService.getUsers();
		LOGGER.error(JSON.toJSON(userInfos));
		LOGGER.error("jsoooon");
	}

	
	@Test
	public void testInsertCourse(){
		CourseInfo couserInfo = new CourseInfo();
		
		couserInfo.setId("1");
		couserInfo.setCaddress("fefe");
		couserInfo.setCname("ffff");
		
	}
	
	@Test
	public void testInsert() {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(14);
		userInfo.setUname("xiaohua");
		userInfo.setUnumber(3);
		userService.insert(userInfo);
		
		CourseInfo couserInfo = new CourseInfo();
		
		couserInfo.setId("14");
		couserInfo.setCaddress("kkfk");
		couserInfo.setCname("ooo");
		courseService.insert(couserInfo);
		System.out.println("user"+userInfo.getId());
		System.out.println("course"+Integer.parseInt(couserInfo.getId()));
		
		userService.insertLinkcourseuser(1, userInfo.getId(), Integer.parseInt(couserInfo.getId()));
		
	}
}
