package com.plant;

import java.util.ArrayList;

public class PlantManager {
	
	public static void displayAllPlants() {
		System.out.println("PLANTS IN STOCK");
		for (Plants plant : PlantContainer.getPlants()) {
			System.out.println(plant.plantName + "   Rs." + plant.price);
	}
	}
	
	public static void addPlants(String plant, double amount, String type, String category ) {
		Plants addplant = new Plants();
		addplant.plantName = plant;
		addplant.price = amount;
		addplant.plantType=type;
		PlantContainer.addProduct(addplant);
	}
	
	public static ArrayList<Plants> applyfilter(String type) {
		ArrayList<Plants> filterPlant = new ArrayList<Plants>();
		System.out.println("    ");
		System.out.println(type);
		System.out.println("---------");
			for (Plants plant : PlantContainer.getPlants()) {
				if(plant.plantType != null &&plant.plantType.equalsIgnoreCase(type)) {
					filterPlant.add(plant);
					//System.out.println(plant.plantName + "   Rs." + plant.price);
				}
				else if(plant.category != null &&plant.category.equalsIgnoreCase(type)){
					filterPlant.add(plant);
				}
			}
		return filterPlant;
	}

	public static boolean checkPlant(String plant1) {
		boolean exist = false;
		for (Plants plant : PlantContainer.getPlants()) {
			if(plant.plantName.equalsIgnoreCase(plant1)) {
				exist= true;
				break;
			}
		}
		return exist;
	}

}
