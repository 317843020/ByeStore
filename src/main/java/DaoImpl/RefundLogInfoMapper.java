package DaoImpl;

import Entity.RefundLogInfo;

public interface RefundLogInfoMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(RefundLogInfo record);

    int insertSelective(RefundLogInfo record);

    RefundLogInfo selectByPrimaryKey(String orderNo);

    int updateByPrimaryKeySelective(RefundLogInfo record);

    int updateByPrimaryKey(RefundLogInfo record);
}