package com.plant;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class BillManager {
	/**
	 * This method is used to calculate the total bill
	 * 
	 * @param MyChoice
	 */
	public void generateBill() {
		double totalBill = 0;
		int totalQuantity = 0;
		for (CartPlant plant : CartManager.myChoice) {
			totalBill = (plant.rupee * plant.qtyPlant) + totalBill;
			totalQuantity = totalQuantity + plant.qtyPlant;
		}
		BillManager obj = new BillManager();
		obj.displayBill(totalBill, totalQuantity);
	}

	/**
	 * This method is used to display the total bill
	 * 
	 * @param totalBill
	 */
	public void displayBill(double totalBill, int totalQuantity) {
		// LocalDate today=LocalDate.now();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		String today = date.format(cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH, 3);
		String deliveryDate = date.format(cal.getTime());
		// System.out.println("Date after Addition: "+newDate);
		System.out.println("*******BILL*******");
		System.out.println("Booking Date :" + today);
		System.out.println("Delivery Date :" + deliveryDate);
		System.out.println("Total Bill :" + totalBill);
		if (totalQuantity > 5) {
			System.out.println("As you order more than five item, you will get 25% discount on your total bill ");
			System.out.println("Your Final Bill amount :" + totalBill * 0.75);
			System.out.println("THANK YOU");
		} else {
			System.out.println("THANK YOU");
		}

	}

}
