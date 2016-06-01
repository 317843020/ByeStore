package DaoImpl;

import Entity.BrandInfo;

public interface BrandInfoMapper {
    int deleteByPrimaryKey(String brandNo);

    int insert(BrandInfo record);

    int insertSelective(BrandInfo record);

    BrandInfo selectByPrimaryKey(String brandNo);

    int updateByPrimaryKeySelective(BrandInfo record);

    int updateByPrimaryKey(BrandInfo record);
}