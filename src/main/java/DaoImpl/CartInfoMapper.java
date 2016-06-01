package DaoImpl;

import java.util.List;

import Entity.CartInfo;
import Entity.CartInfoKey;
import Entity.ItemInfo;

public interface CartInfoMapper {
    int deleteByPrimaryKey(CartInfoKey key);

    int insert(CartInfoKey record);

    int insertSelective(CartInfoKey record);
    
    List<ItemInfo> showCartInfo(CartInfoKey record);
    
    boolean auditItemQuantity(CartInfo record);
}