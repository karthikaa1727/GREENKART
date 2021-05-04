package com.plant;

import java.util.ArrayList;


public class PlantContainer {
	private static ArrayList<Plants> plantList = new ArrayList<Plants>();
	public static void addProduct(Plants ...plant) {
		for(Plants addplant:plant) {
			plantList.add(addplant);
		}
		
	}

    static {
    	
		Plants plant1 = new Plants();
		plant1.plantName = "Neem Tree";
		plant1.price = 60 ;
		plant1.plantType="Tree";
		
		Plants plant2 = new Plants();
		plant2.plantName = "Mango Tree";
		plant2.price = 40 ;
		plant2.plantType="Tree";
		plant2.category="Fruit";
		
		Plants plant3 = new Plants();
		plant3.plantName = "Pappaya Tree";
		plant3.price = 45 ;
		plant3.plantType="Tree";
		plant3.category="Fruit";
		
		Plants plant4 = new Plants();
		plant4.plantName = "Guava Tree";
		plant4.price = 70 ;
		plant4.plantType="Tree";
		plant4.category="Fruit";
		
		Plants plant5 = new Plants();
		plant5.plantName = "Apple Tree";
		plant5.price = 100 ;
		plant5.plantType="Tree";
		plant5.category="Fruit";
		
		Plants plant6 = new Plants();
		plant6.plantName = "Lemon Tree";
		plant6.price = 40 ;
		plant6.plantType="Tree";
		plant6.category="Fruit";
		
		Plants plant7 = new Plants();
		plant7.plantName = "Coconut Tree";
		plant7.price = 50 ;
		plant7.plantType="Tree";
		plant7.category="Vegetable";
		
		Plants plant8 = new Plants();
		plant8.plantName = "Rose";
		plant8.price = 100 ;
		plant8.plantType="plant";
		plant8.category="Flower";
		
		Plants plant9 = new Plants();
		plant9.plantName = "Tulip";
		plant9.price = 120 ;
		plant9.plantType="plant";
		plant9.category="Flower";
		
		
		Plants plant10 = new Plants();
		plant10.plantName = "Lily";
		plant10.price = 130 ;
		plant10.plantType="plant";
		plant10.category="Flower";
		
		Plants plant11 = new Plants();
		plant11.plantName = "Jasmine";
		plant11.price = 140 ;
		plant11.plantType="plant";
		plant11.category="Flower";
		
		Plants plant12 = new Plants();
		plant12.plantName = "Sunflower";
		plant12.price = 100 ;
		plant12.plantType="plant";
		plant12.category="Flower";
		
		Plants plant13 = new Plants();
		plant13.plantName = "Lotus";
		plant13.price = 90 ;
		plant13.plantType="plant";
		plant13.category="Flower";
		
		Plants plant14 = new Plants();
		plant14.plantName = "Daisy";
		plant14.price = 80 ;
		plant14.plantType="plant";
		plant14.category="Flower";
		
		Plants plant15 = new Plants();
		plant15.plantName = "Onion";
		plant15.price = 60 ;
		plant15.plantType="plant";
		plant15.category="Vegetable";
		
		Plants plant16 = new Plants();
		plant16.plantName = "Tomato";
		plant16.price = 30 ;
		plant16.plantType="plant";
		plant16.category="Vegetable";
		
		Plants plant17 = new Plants();
		plant17.plantName = "carrot";
		plant17.price = 40 ;
		plant17.plantType="plant";
		plant17.category="Vegetable";
		
		Plants plant18 = new Plants();
		plant18.plantName = "Pea";
		plant18.price = 50 ;
		plant18.plantType="plant";
		plant18.category="Vegetable";
		
		Plants plant19 = new Plants();
		plant19.plantName = "Potato";
		plant19.price = 70 ;
		plant19.plantType="plant";
		plant19.category="Vegetable";
		
		Plants plant20 = new Plants();
		plant20.plantName = "Radish";
		plant20.price = 40 ;
		plant20.plantType="plant";
		plant20.category="Vegetable";
		
		Plants plant21 = new Plants();
		plant21.plantName = "Mushroom";
		plant21.price = 120 ;
		plant21.category="Vegetable";
		
		Plants plant22 = new Plants();
		plant22.plantName = "Capcicum";
		plant22.price = 100 ;
		plant22.plantType="plant";
		plant22.category="Vegetable";
		
		Plants plant23 = new Plants();
		plant23.plantName = "Pepper";
		plant23.price = 30 ;
		plant23.plantType="plant";
		plant23.category="Vegetable";
		
		PlantContainer.addProduct(plant1, plant2, plant3, plant4, plant5, plant6, plant7, plant8, plant9, plant10, plant11, plant12, plant13, plant14, plant15, plant16, plant17, plant18, plant19, plant20, plant21, plant22, plant23);
	}
    
    public static ArrayList<Plants> getPlants() {
    	return plantList;
    }


}
