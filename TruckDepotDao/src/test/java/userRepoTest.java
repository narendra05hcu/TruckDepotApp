import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.truckdepot.common.dao.entities.User;
import com.truckdepot.common.dao.enums.UserType;
import com.truckdepot.common.dao.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/jpa-config.xml" })
public class userRepoTest {
	@Autowired
	UserRepository userRepository;

	@Test
	public void createUserTest() {
		User user = new User();
		user.setEmailId("sdsd");
		user.setCompanyName("sdsd");
		user.setFirstName("sdsd");
		user.setLastName("sdsd");
		user.setMobileNumber("sdsd");
		user.setUserType(UserType.SHIPPER);
		user.setPassword("dfdfdsfsd");
		user.setEmailId("sdsd");
		user.setEmailId("sdsd");
		userRepository.save(user);
	}
}
