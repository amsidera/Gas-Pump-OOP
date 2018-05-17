package output.actions;

import data.Data;
import data.Data2;

/*
 * GasPump2 PumpGasUnit action responsible for
 * counting liters pumped.
 */

public class PumpGasUnit2 implements PumpGasUnit{

	/*
	 * Add a new liter pumped 
	 */
	@Override
	public void act(Data d) {
		Data2 d2 = (Data2)d;
		d2.L += 1;
		System.out.println("Liters " + d2.L + " and $ "+(d2.L*d2.price) + ".");
		System.out.println("b. Pump");
		System.out.println("c. Stop");
	}
}