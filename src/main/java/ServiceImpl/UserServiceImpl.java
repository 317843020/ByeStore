package ServiceImpl;

import java.util.List;

import Dao.UserInfoDao;
import DaoImpl.UserInfoDaoImpl;
import Entity.UserInfo;
import Service.UserService;

public class UserServiceImpl implements UserService {

	private UserInfoDao userInfoDao = new UserInfoDaoImpl();
	
	
	
	public UserInfo getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserInfo> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(UserInfo userInfo) {
		int i = userInfoDao.insert(userInfo);
		return i;
	}
	
	public static void main(String[] args){
		 UserInfoDao userInfoDao = new UserInfoDaoImpl();
		 UserInfo userInfo = new UserInfo();
		 userInfo.setId(1);
		 userInfo.setUname("haha");
		 userInfo.setUnumber(123);
		 
		 
		 userInfoDao.insert(userInfo);
	}

	public int insertLinkcourseuser(int id, int uid, int cid) {
		int i = userInfoDao.insertLinkcourseuser(id, uid, cid);
		return i;
	}

}
