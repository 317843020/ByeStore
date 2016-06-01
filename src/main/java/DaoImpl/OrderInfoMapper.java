package DaoImpl;

import Entity.OrderInfo;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(String orderNo);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}