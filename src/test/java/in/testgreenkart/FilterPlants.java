package in.testgreenkart;

import org.junit.Test;

import com.greenkart.PlantCart;


public class FilterPlants {

	/**
	 * This method is used to filter the plants by price and it will display 
	 */
	
	@Test
	public void testcase1() {
		int press = 1;
		PlantCart.searchPlantsByPrice(press);
	}
	
	@Test
	public void testcase2() {
		int press = 2;
		PlantCart.searchPlantsByPrice(press);
	}
	
	@Test
	public void testcase3() {
		int press = 3;
		PlantCart.searchPlantsByPrice(press);
	}
	
	@Test
	public void testcase4() {
		int press = 4;
		PlantCart.searchPlantsByPrice(press);
	}

}
