package output.actions;

import data.Data;
import data.Data2;

/*
 * GasPump2 PrintReceipt action responsible for
 * printing the receipt.
 */

public class PrintReceipt2 implements PrintReceipt{

	/*
	 * Prints the receipt
	 */
	@Override
	public void act(Data d) {
		Data2 d2 = (Data2)d;
		System.out.println("**********************************");
		System.out.println("Total liters: " + d2.L);
		System.out.println("Price per liter: " + d2.price);
		System.out.println("Total amout: $" + d2.L*d2.price);
		System.out.println("**********************************");
	}
}