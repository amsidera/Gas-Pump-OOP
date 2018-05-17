package output.actions;

import data.Data;
import data.Data2;

/*
 * GasPump2 StoreData action responsible for storing
 * initialization data into the data store.
 */

public class StoreData2 implements StoreData{

	/*
	 * Store temporal data into the appropriate
	 * variables
	 */
	@Override
	public void act(Data d) {
		Data2 d2 = (Data2)d;
		d2.super_price = d2.temp_a;
		d2.regular_price = d2.temp_b;
		d2.premium_price = d2.temp_c;		
	}
}