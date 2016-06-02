package DaoImpl;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import Entity.ItemCommentsInfo;
import Entity.ItemInfo;
import Utils.MyBatisUtil;

public class ItemCommentsInfoMapperTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCommentsByItemNo() throws Exception {
		int wantPage=1;
		int pageSize=2;
		ItemInfo itemInfo=new ItemInfo();
		itemInfo.setItemno("01");
		List<ItemCommentsInfo> list=null;		
		SqlSession session = MyBatisUtil.getSession();
		ItemCommentsInfoMapper mapper=session.getMapper(ItemCommentsInfoMapper.class);
		int head=(wantPage-1)*pageSize;		
		list=mapper.selectByItemNo(head, pageSize,itemInfo.getItemno());
		for(int i=0;i<list.size();i++ )
			System.out.println(list.get(i).getComments());
	}

}
