package DaoImpl;

import Entity.ExpressCompanyInfo;

public interface ExpressCompanyInfoMapper {
    int deleteByPrimaryKey(String companyNo);

    int insert(ExpressCompanyInfo record);

    int insertSelective(ExpressCompanyInfo record);

    ExpressCompanyInfo selectByPrimaryKey(String companyNo);

    int updateByPrimaryKeySelective(ExpressCompanyInfo record);

    int updateByPrimaryKey(ExpressCompanyInfo record);
}