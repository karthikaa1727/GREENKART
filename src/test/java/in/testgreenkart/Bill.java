package in.testgreenkart;

import org.junit.Test;

import com.plants.BillManager;
import com.plants.CartManager;


public class Bill {
	
	/**
	 * This method is used generate the total bill
	 */

	@Test
	public void testcase1() {
		CartManager add = new CartManager();
		add.addcart("Rose", 3);
		BillManager bill = new BillManager();
		bill.generateBill();
	}
	
	@Test
	public void testcase2() {
		CartManager add = new CartManager();
		add.addcart("Rose", 3);
		add.addcart("Mango Tree", 2);
		BillManager bill = new BillManager();
		bill.generateBill();
	}

}
