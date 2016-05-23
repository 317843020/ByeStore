package Dao;

import java.util.List;

import Entity.CourseInfo;

public interface CourseInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);

    CourseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseInfo record);

    int updateByPrimaryKey(CourseInfo record);
    
    List<CourseInfo> selectAll();
    
    int insertLinkcourseuser(int id,int uid,int cid);
}