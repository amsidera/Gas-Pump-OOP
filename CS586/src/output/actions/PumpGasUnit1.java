package output.actions;

import data.Data;
import data.Data1;

/*
 * GasPump1 PumpGasUnit action responsible for
 * counting gallons pumped.
 */

public class PumpGasUnit1 implements PumpGasUnit{

	/*
	 * Add a new gallon pumped 
	 */
	@Override
	public void act(Data d) {
		Data1 d1 = (Data1)d;
		d1.G += 1;
	}
}