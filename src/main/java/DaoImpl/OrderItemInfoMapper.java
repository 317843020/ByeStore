package DaoImpl;

import Entity.OrderItemInfo;
import Entity.OrderItemInfoKey;

public interface OrderItemInfoMapper {
    int deleteByPrimaryKey(OrderItemInfoKey key);

    int insert(OrderItemInfo record);

    int insertSelective(OrderItemInfo record);

    OrderItemInfo selectByPrimaryKey(OrderItemInfoKey key);

    int updateByPrimaryKeySelective(OrderItemInfo record);

    int updateByPrimaryKey(OrderItemInfo record);
}