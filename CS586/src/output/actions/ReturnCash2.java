package output.actions;

import data.Data;
import data.Data2;

/*
 * GasPump2 ReturnCash action responsible for
 * returning cash
 */

public class ReturnCash2 implements ReturnCash{

	/*
	 * Calculate and return the remaining cash
	 */
	@Override
	public void act(Data d) {
		Data2 d2 = (Data2)d;
		if (d2.m ==0) {
		System.out.println("$"+(d2.cash-d2.L*d2.price) + " returned.");	}
	}
}