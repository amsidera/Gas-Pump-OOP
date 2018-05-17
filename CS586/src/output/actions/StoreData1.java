package output.actions;

import data.Data;
import data.Data1;

/*
 * GasPump1 StoreData action responsible for storing
 * initialization data into the data store.
 */

public class StoreData1 implements StoreData{

	/*
	 * Store temporal data into the appropriate
	 * variables
	 */
	@Override
	public void act(Data d) {
		Data1 d1 = (Data1)d;
		d1.regular_price = d1.temp_a;
		d1.diesel_price = d1.temp_b;
	}
}