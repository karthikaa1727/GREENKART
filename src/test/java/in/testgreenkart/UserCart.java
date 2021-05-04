package in.testgreenkart;

import org.junit.Test;

import com.plant.CartManager;

public class UserCart {

	
/**
 * This method is used to display the cart items 
 * We can add more than 1 plants in the cart
 */
	
	@Test
	public void testcase1() {
		CartManager add = new CartManager();
		add.addcart("Potato", 5);
		add.displayCart();
	}
	
	@Test
	public void testcase2() {
		CartManager add = new CartManager();
		add.addcart("Rose", 3);
		add.addcart("Mango Tree", 2);
		add.displayCart();
	}

}
