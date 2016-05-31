package DaoImpl;

import Entity.StyleInfo;

public interface StyleInfoMapper {
    int deleteByPrimaryKey(String styleNo);

    int insert(StyleInfo record);

    int insertSelective(StyleInfo record);

    StyleInfo selectByPrimaryKey(String styleNo);

    int updateByPrimaryKeySelective(StyleInfo record);

    int updateByPrimaryKey(StyleInfo record);
}