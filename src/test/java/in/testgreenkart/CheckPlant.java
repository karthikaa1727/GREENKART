package in.testgreenkart;

import static org.junit.Assert.*;

import org.junit.Test;

import com.greenkart.PlantCart;

public class CheckPlant {
	
	/**
	 * This method is used to find the plant exist in the PlantList or not 
	 * 
	 */

	@Test
	public void testcase1() {
		String plant2 = "Neem Tree";
		boolean exists = PlantCart.checkPlant(plant2);
		assertEquals(true, exists);
	}
	
	@Test
	public void testcase2() {
		String plant2 = "Conifer";
		boolean exists = PlantCart.checkPlant(plant2);
		assertEquals(false, exists);
	}
	
	@Test
	public void testcase3() {
		String plant2 = "Rose";
		boolean exists = PlantCart.checkPlant(plant2);
		assertEquals(true, exists);
	}

}
