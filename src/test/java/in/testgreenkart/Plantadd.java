package in.testgreenkart;

import org.junit.Test;

import com.plant.PlantManager;

public class Plantadd {

	@Test
	public void test() {
		PlantManager.addPlants( "Watermelon", 20,"Plant","Fruit");
		PlantManager.displayAllPlants();
	}

}
