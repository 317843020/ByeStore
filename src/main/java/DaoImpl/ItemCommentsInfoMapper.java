package DaoImpl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Entity.ItemCommentsInfo;

public interface ItemCommentsInfoMapper {
    int insert(ItemCommentsInfo record);

    int insertSelective(ItemCommentsInfo record);
    
    //根据商品编号（itemNO）选取从第head条记录开始 的count条记录
    List<ItemCommentsInfo> selectByItemNo(@Param(value="head")int head,@Param(value="count")int count,@Param(value="itemNo") String itemNo);
    
}