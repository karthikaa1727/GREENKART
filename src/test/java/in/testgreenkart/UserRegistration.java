package in.testgreenkart;

import static org.junit.Assert.*;

import org.junit.Test;

import com.plant.UserManager;

public class UserRegistration {

	/**
	 * This method is used to register user details
	 * The phone number should not start with 0 and it should be in 10 digit
	 * The password should be contain 5 characters
	 * It will not accept if the user gives wrong details
	 */
	
	@Test
	public void testcase1() {
		Long userId = 9090909090L;
		String password = "pass1";
		boolean insert = UserManager.addUser(userId, password);
		assertEquals(true, insert);
	}
	
	@Test
	public void testcase2() {
		Long userId = 9876543210L;
		String password = "12345";
		boolean insert = UserManager.addUser(userId, password);
		assertEquals(true, insert);
	}

	@Test
	public void testcase3() {
		Long userId = 8080808080L;
		String password = "pass";
		boolean insert = UserManager.addUser(userId, password);
		assertEquals(false, insert);
	}

	@Test
	public void testcase4() {
		Long userId = 0000000000L;
		String password = "pass1";
		boolean insert = UserManager.addUser(userId, password);
		assertEquals(false, insert);
	}

	@Test
	public void testcase5() {
		Long userId = 9009090L;
		String password = "pa";
		boolean insert = UserManager.addUser(userId, password);
		assertEquals(false, insert);
	}

}
