package output.actions;

import data.Data;
import data.Data1;

/*
 * GasPump1 PrintReceipt action responsible for
 * printing the receipt.
 */

public class PrintReceipt1 implements PrintReceipt{

	/*
	 * Prints the receipt
	 */
	@Override
	public void act(Data d) {
		Data1 d1 = (Data1)d;
		System.out.println("**********************************");
		System.out.println("Total gallons: " + d1.G);
		System.out.println("Price per gallon: " + d1.price);
		System.out.println("Total amount: $" + d1.G*d1.price);
		System.out.println("**********************************");
	}
}