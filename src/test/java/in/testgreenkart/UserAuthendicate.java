package in.testgreenkart;

import static org.junit.Assert.*;

import org.junit.Test;

import com.plants.UserManager;


public class UserAuthendicate {

	/**
	 * This method is used to validate the user id and password
	 */
	
	@Test
	public void testcase1() {
		UserManager.userDetails.put(9090909090L, "pass1");
		Long userId = 9090909090L;
		String password = "pass1";
		boolean valid = UserManager.login(userId, password);
		assertEquals(true, valid);
	}
	
	@Test
	public void testcase2() {
		UserManager.userDetails.put(9090909090L, "pass1");
		Long userId = 9090909090L;
		String password = "1";
		boolean valid = UserManager.login(userId, password);
		assertEquals(false, valid);
	}
	
	@Test
	public void testcase3() {
		UserManager.userDetails.put(9090909090L, "pass1");
		Long userId = 9002131453L;
		String password = "pass1";
		boolean valid = UserManager.login(userId, password);
		assertEquals(false, valid);
	}
	
	@Test
	public void testcase4() {
		UserManager.userDetails.put(9090909090L, "pass1");
		Long userId = 90911111190L;
		String password = "pass3";
		boolean valid = UserManager.login(userId, password);
		assertEquals(false, valid);
	}

}
