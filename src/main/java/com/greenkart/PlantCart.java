package com.greenkart;

import java.util.HashMap;

import com.plants.UserManager;

/**
 * This method is used to store all plants into hashmap
 * 
 * @author kart2672
 *
 */
public class PlantCart {

	public static HashMap<String, Integer> plants = new HashMap<String, Integer>();

	public static void init() {
		
	}
	static{
		plants.put("Neem Tree", 60);
		plants.put("Mango Tree", 40);
		plants.put("Pappaya Tree", 45);
		plants.put("Guava Tree", 70);
		plants.put("Apple Tree", 100);
		plants.put("Lemon Tree", 40);
		plants.put("Banyan Tree", 90);
		plants.put("Coconut Tree", 150);
		plants.put("Rose", 120);
		plants.put("Tulip", 100);
		plants.put("Lily", 130);
		plants.put("Jasmine", 140);
		plants.put("Sunflower", 60);
		plants.put("Lotus", 90);
		plants.put("Daisy", 80);
		plants.put("Onion", 50);
		plants.put("Tomato", 60);
		plants.put("Carrot", 40);
		plants.put("Potato", 50);
		plants.put("Mushroom", 200);
		plants.put("Capcicum", 100);
		plants.put("Pepper", 40);
		

	}

	/**
	 * This method is used to display plants
	 */
	public static void displayPlants() {
		UserManager obj = new UserManager();
		System.out.println("  ");
		obj.dispalyPlants();
		System.out.println("  ");
		System.out.println("Number of plant types in GREENKART :" + plants.size());
	}

	/**
	 * This method is used to display the filtered plants
	 * 
	 * @param press
	 */
	public static void searchPlantsByPrice(int press) {
		UserManager obj = new UserManager();
		obj.applyFilter(press, plants);
		System.out.println("   ");
		//buy(); 
	}

	/**
	 * This method is used to purchase plants
	 */
	public static void buy() {
		Purchase plant = new Purchase();
		plant.purchaseItems();
	}

	/**
	 * The method is used to find the given plant is exist in the list or not
	 * 
	 * @param plant
	 * @return
	 */
	public static boolean checkPlant(String plant) {
		boolean exists = plants.containsKey(plant);
		if (!exists) {
			return false;
		} else {
			return true;
		}

	}

}
