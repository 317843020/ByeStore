package DaoImpl;

import Entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer username);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer username);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}