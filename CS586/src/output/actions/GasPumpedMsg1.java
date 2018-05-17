package output.actions;

import data.Data;
import data.Data1;

/*
 * GasPump1 GasPumpedMsg action responsible for
 * showing gas pumped message.
 */

public class GasPumpedMsg1 implements GasPumpedMsg{

	/*
	 * Prints Gas Pumped Message
	 */
	@Override
	public void act(Data d) {
		Data1 d1 = (Data1)d;
		System.out.println("Gallon " + d1.G + " and $"+(d1.G*d1.price) + ".");
	}
}