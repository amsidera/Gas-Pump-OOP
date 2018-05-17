package output.actions;

import data.Data;
import data.Data2;

/*
 * GasPump2 GasPumpedMsg action responsible for
 * showing gas pumped message.
 */

public class GasPumpedMsg2 implements GasPumpedMsg{

	/*
	 * Prints Gas Pumped Message
	 */
	@Override
	public void act(Data d) {
		Data2 d2 = (Data2)d;
		System.out.println("Disposed " + d2.L + " liters.");
	}
}