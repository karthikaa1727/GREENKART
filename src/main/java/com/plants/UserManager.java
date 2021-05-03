package com.plants;

import java.util.HashMap;

import com.greenkart.PlantCart;

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

	/**
	 * This method is used to display the Plants in Hashmap
	 * 
	 * @param plants
	 */
	public void dispalyPlants() {
		for (String i : PlantCart.plants.keySet()) {
			int rupee = PlantCart.plants.get(i);
			System.out.println(i + ":    Rs." + rupee);
		}
	}

	/**
	 * This method is used to display the filtered plants
	 * 
	 * @param press
	 * @param plants
	 */
	public void applyFilter(int press, HashMap<String, Integer> plants) {
		switch (press) {
		case 1:// It print the plants that cast below 50
			System.out.println("Rs.1 to Rs.49");
			for (String i : plants.keySet()) {
				int rupee = plants.get(i);
				if (rupee < 50) {
					System.out.println(i + ":    Rs." + rupee);
				}
			}
			break;
		case 2:// It prints the plant which is in the range of 50-99
			System.out.println("Rs.50 to Rs.99");
			for (String i : plants.keySet()) {
				int rupee = plants.get(i);
				if (rupee < 100 && rupee >= 50) {
					System.out.println(i + ":    Rs." + rupee);
				}
			}
			break;
		case 3:// It prints the plant which is in the range of 100-149
			System.out.println("Rs.100 to Rs.149");
			for (String i : plants.keySet()) {
				int rupee = plants.get(i);
				if (rupee < 150 && rupee >= 100) {
					System.out.println(i + ":    Rs." + rupee);
				}
			}
			break;
		case 4:// It prints the plant which is in the range of 150-200
			System.out.println("Rs.149 to Rs.200");
			for (String i : plants.keySet()) {
				int rupee = plants.get(i);
				if (rupee <= 200 && rupee >= 150) {
					System.out.println(i + ":    Rs." + rupee);
				}
			}
			break;
		default:
			System.out.println();

		}

	}

}