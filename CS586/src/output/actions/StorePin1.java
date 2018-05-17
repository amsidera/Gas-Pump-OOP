package output.actions;

import data.Data;
import data.Data1;

/*
 * GasPump1 StorePin action responsible for storing
 * initialization data into the pin data store.
 */

public class StorePin1 implements StorePin{

	/*
	 * Store temporal data into the appropriate
	 * variables
	 */
	@Override
	public void act(Data d) {
		Data1 d1 = (Data1)d;
		d1.pin = d1.temp_pin;
	}
}