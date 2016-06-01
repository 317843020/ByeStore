package Service;

import java.util.List;

import Entity.UserInfo;

public interface UserService {
	UserInfo getUserById(int id);
	
	List<UserInfo> getUsers();
	
	int insert(UserInfo userInfo);
	
	int insertLinkcourseuser(int id,int uid,int cid);
	
}
