package DaoImpl;

import Entity.WorkerInfo;
import Entity.WorkerInfoKey;

public interface WorkerInfoMapper {
    int deleteByPrimaryKey(WorkerInfoKey key);

    int insert(WorkerInfo record);

    int insertSelective(WorkerInfo record);

    WorkerInfo selectByPrimaryKey(WorkerInfoKey key);

    int updateByPrimaryKeySelective(WorkerInfo record);

    int updateByPrimaryKey(WorkerInfo record);
}