package com.greenkart;

public class PlantStock {

	/**
	 * This method is used to display plants
	 */
	public static void viewPlant() {
		PlantCart.init();
		PlantCart.displayPlants();
		filter();
	}

	/**
	 * To apply filter by price
	 */
	public static void filter() {
		System.out.println("Filter by price");
		System.out.println("---------------");
		System.out.println("0 to 49    ----> press 1");
		System.out.println("50 to 99   ----> press 2");
		System.out.println("100 to 149 ----> press 3");
		System.out.println("150 to 200 ----> press 4");
		System.out.println("  ");
		int press1 = 2;
		PlantCart.searchPlantsByPrice(press1);
		int press2 = 3;
		PlantCart.searchPlantsByPrice(press2);
	}
}
