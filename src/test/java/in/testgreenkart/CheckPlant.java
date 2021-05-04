package in.testgreenkart;

import static org.junit.Assert.*;

import org.junit.Test;

import com.plant.PlantManager;

public class CheckPlant {
	
	/**
	 * This method is used to find the plant exist in the PlantList or not 
	 * 
	 */

	@Test
	public void testcase1() {
		String plant = "Neem Tree";
		boolean exists = PlantManager.checkPlant(plant);
		assertEquals(true, exists);
	}
	
	@Test
	public void testcase2() {
		String plant = "Conifer";
		boolean exists = PlantManager.checkPlant(plant);
		assertEquals(false, exists);
	}
	
	@Test
	public void testcase3() {
		String plant = "rose";
		boolean exists = PlantManager.checkPlant(plant);
		assertEquals(true, exists);
	}

}
