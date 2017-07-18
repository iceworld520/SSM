import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.iceworld.bean.UserInfo;
import com.cn.iceworld.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class UserServiceTest {

	private static Logger logger = LoggerFactory.getLogger(UserServiceTest.class);
	@Resource
	private UserService userService;
	
	
	@Test
	public void testInsertUserInfo(){
		
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1254l);
		userInfo.setLoginname("root");
		userInfo.setPassword("a4s56d45f64as");
		userInfo.setSalt("asjdfk");

		int i = userService.insertUserInfo(userInfo);
		logger.info("i={}",i);
		
		
	}
}
