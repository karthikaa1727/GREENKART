package com.greenkart;

import com.plants.CartManager;

public class Purchase {

	/**
	 * This method is used to validate whether the plant name exists and if exists it will add it to cart.
	 * else if plant does not exists, it will print error message choose plants
	 */
	//public void purchaseItem(String plant, int quantity) {
	public void purchaseItems() {
		String plant1 = "Rose";
		boolean exists = PlantCart.checkPlant(plant1);
		if (exists) {
			int quantity1 = 2;
			CartManager add = new CartManager();
			add.addcart(plant1, quantity1);
			addToCart();
		} else {
			System.err.println("Enter the correct plant name ");
		}

	}

	/**
	 * This method is used to add more plant to cart
	 */
	private void addToCart() {
		CartManager add = new CartManager();
		System.out.println("If you want to purchase more press 1 else press 0");
		int choice = 1;
		if (choice == 1) {
			// To buy more than 1 plant
			String plant2 = "Neem Tree";
			boolean exists = PlantCart.checkPlant(plant2);
			if (exists) {
				int quantity2 = 5;
				add.addcart(plant2, quantity2);
				add.displayCart();
			} else {
				System.out.println("Enter the correct plant name ");
			}

		} else if (choice == 0) {
			// To buy one plant
			add.displayCart();
		}

	}

}
