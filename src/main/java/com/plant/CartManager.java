package com.plant;

import java.util.ArrayList;

public class CartManager {
	/**
	 * This array list is used to store the cart details
	 */
	public static ArrayList<CartPlant> myChoice = new ArrayList<CartPlant>();

	public static void addplant(CartPlant shop) {
		myChoice.add(shop);
	}

	/**
	 * This method is used to store the values to array list one by one
	 * 
	 * @param plant
	 * @param amount
	 * @param quantity
	 */
	public void addcart(String plant, int quantity) {
		// To add all pants to cart what you going to purchase
		CartPlant shop = new CartPlant();
		double amount=0;
		for (Plants find : PlantContainer.getPlants()) {
			if(find.plantName.equalsIgnoreCase(plant)) {
				amount=find.price;
			}
		}
		shop.name = plant;
		shop.rupee = amount;
		shop.qtyPlant = quantity;
		CartManager.addplant(shop);
	}

	/**
	 * This method is used to display the items in the cart
	 */
	public void displayCart() {
		// To display all plants in the cart
		System.out.println("YOUR CART");
		for (CartPlant plant : myChoice) {
			System.out.println(plant.name + "-" + plant.rupee + "-" + plant.qtyPlant);
		}
		// To generate the bill
		//BillManager bill = new BillManager();
		//bill.generateBill();
	}
}
