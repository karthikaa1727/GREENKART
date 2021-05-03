package in.testgreenkart;

import org.junit.Test;

import com.greenkart.PlantCart;


public class DisplayPlants {

	/**
	 * This method id used to display all plants in the list
	 */
	
	@Test
	public void test() {
		PlantCart.init();
		PlantCart.displayPlants();
	}

}
