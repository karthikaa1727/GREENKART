package in.testgreenkart;

import org.junit.Test;

import com.plants.UserManager;

public class Userdetails {
	
	/**
	 * This method is used to display all user's details
	 */

	@Test
	public void test() {
		UserManager.userDetails.put(9090909090L, "pass1");
		UserManager.userDetails.put(9987654321L, "12345");
		UserManager.userDetails.put(9080908090L, "67890");
		UserManager.displayAllUsers();
	}

}
