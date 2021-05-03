package com.greenkart;

import com.plants.UserManager;

public class User {

	/**
	 * This main method is used to get the used id and password
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Long userId = 9090909090L;
		String password = "pass1";
		boolean insert = UserManager.addUser(userId, password);
		if (insert) {
			System.out.println("The user id " + userId + " is valid ");
			login(userId, password);
		} else {
			System.out.println("The user id should be your phone number and the password should contain 5 characters");
		}

	}

	/**
	 * This method is used to check the used Id
	 * 
	 * @param userId
	 * @param passWord
	 */
	public static void login(long userId, String password) {
		boolean valid = UserManager.login(userId, password);
		if (valid) {
			authenticate();
		} else {
			System.out.println("Invalid credentials");
		}
	}

	/**
	 * This method is used if the password is valid, it will print welcome
	 * 
	 * @param y
	 */
	public static void authenticate() {
		System.out.println(" ");
		System.out.println("Welcome");
		System.out.println("  ");
		PlantStock.viewPlant();
	}

}
