package DaoImpl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Entity.ItemInfo;

public interface ItemInfoMapper {
    int deleteByPrimaryKey(String itemNo);

    int insert(ItemInfo record);

    int insertSelective(ItemInfo record);

    ItemInfo selectByPrimaryKey(String itemNo);

    int updateByPrimaryKeySelective(ItemInfo record);

    int updateByPrimaryKey(ItemInfo record);

    List<ItemInfo> selectByBrandName(String brandName);
    
    List<ItemInfo> selectByStyleName(String styleName);
    
    List<ItemInfo> fuzzySelect(String searchString);
    
    //public List<Teacher> selectTeacher(@Param(value="id") String id,@Param(value="sex") String sex); 
   /* http://blog.csdn.net/liaoxiaohua1981/article/details/6862764 
    	  基本数据类型：包含int,String,Date等。基本数据类型作为传参，只能传入一个。通过#{参数名} 即可获取传入的值
    	  另外MyBatis还提供了一个使用注解来参入多个参数的方式。这种方式需要在接口的参数上添加@Param注解
    	 */
    List<ItemInfo> selectAll(@Param(value="head")int head,@Param(value="count") int count);
}