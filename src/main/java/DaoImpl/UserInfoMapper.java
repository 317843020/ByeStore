package DaoImpl;

import Entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String loginid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String loginid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}