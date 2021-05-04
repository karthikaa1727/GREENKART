package com.greenkart;

import com.plant.PlantManager;

public class PlantStock {

	/**
	 * This method is used to display plants
	 */
	public static void viewPlant() {
		PlantManager.displayAllPlants();
		filter();
	}

	/**
	 * To apply filter by price
	 */
	public static void filter() {
		System.out.println("Filter");
		System.out.println("------");
		System.out.println("If you want Plant     ----> type plant");
		System.out.println("If you want Tree      ----> type tree");
		System.out.println("If you want Fruit     ----> type fruit");
		System.out.println("If you want Vegetable ----> type Vegetable");
		System.out.println("If you want Flower    ----> type flower");
		System.out.println("  ");
		
		String type="plant";
		PlantManager.applyfilter(type);
		
		Purchase buy=new Purchase();
		buy.purchaseItems();
	}
}
