/*package Base;
import java.util.HashMap;
import java.util.Map;
public class ProductServiceImpl extends AbstractService<Product,Long> implements ProductService {
  private ProductMapper productMapper;
  private AdMapper adMapper;
  //这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseMapper调用，而是这个productMapper
  public void setBaseMapper(){
    super.setBaseMapper(productMapper);
  }
  @Override
  public Map<String,Object> testTwo() {
    Product product = productMapper.selectByPrimaryKey(1l);
    Ad ad = adMapper.selectByPrimaryKey(1l);
    Map<String,Object> map = new HashMap<String,Object>();
    map.put("product", product);
    map.put("ad", ad);
    return map;
  }
}*/