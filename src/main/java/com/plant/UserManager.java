package com.plant;

import java.util.HashMap;

public class UserManager {

	public static HashMap<Long, String> userDetails = new HashMap<Long, String>();

	/**
	 * This method is used to store all user details
	 * 
	 * @param mobileNo
	 * @param password
	 */
	public static boolean addUser(Long mobileNo, String password) {
		String phoneNumber = String.valueOf(mobileNo);
		if (phoneNumber.length() == 10 && mobileNo % 1000000000 != 0 && password.length() == 5) {
			userDetails.put(mobileNo, password);
			return true;
		} else {
			return false;
		}

	}

	/**
	 * This Method is used to display all User Details
	 */
	public static void displayAllUsers() {
		for (Long mobileNo : userDetails.keySet()) {
			String password = userDetails.get(mobileNo);
			System.out.println("Username:" + mobileNo + ", password = " + password);

		}
	}

	/**
	 * This method is used to check the user id and password
	 * 
	 * @param userId
	 * @param password
	 * @return
	 */
	public static boolean login(long userId, String password) {
		boolean exists = userDetails.containsKey(userId);
		if (exists) {
			String checkPSW = userDetails.get(userId);
			if (password.equals(checkPSW)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}




}