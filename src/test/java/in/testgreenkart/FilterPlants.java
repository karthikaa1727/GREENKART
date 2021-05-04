package in.testgreenkart;

import java.util.ArrayList;

import org.junit.Test;

import com.plant.PlantManager;
import com.plant.Plants;


public class FilterPlants {

	/**
	 * This method is used to filter the plants by price and it will display 
	 */
	
	@Test
	public void testcase1() {
		String type = "plant";
		ArrayList<Plants>plants=PlantManager.applyfilter(type);
		for(Plants plant:plants) {
			System.out.println(plant.plantName + "   Rs." + plant.price);
		}
	}
	
	@Test
	public void testcase2() {
		String type = "vegetable";
		ArrayList<Plants>plants=PlantManager.applyfilter(type);
		for(Plants plant:plants) {
			System.out.println(plant.plantName + "   Rs." + plant.price);
		}
	}
	
	@Test
	public void testcase3() {
		String type = "fruit";
		ArrayList<Plants>plants=PlantManager.applyfilter(type);
		for(Plants plant:plants) {
			System.out.println(plant.plantName + "   Rs." + plant.price);
		}
	}
	
	@Test
	public void testcase4() {
		String type = "tree";
		ArrayList<Plants>plants=PlantManager.applyfilter(type);
		for(Plants plant:plants) {
			System.out.println(plant.plantName + "   Rs." + plant.price);
		}
	}
	
	@Test
	public void testcase5() {
		String type = "flower";
		ArrayList<Plants>plants=PlantManager.applyfilter(type);
		for(Plants plant:plants) {
			System.out.println(plant.plantName + "   Rs." + plant.price);
		}
	}
	

}
