package output.actions;

import data.Data;
import data.Data2;

/*
 * GasPump2 StoreCash action responsible for storing
 * cash value into the data store.
 */

public class StoreCash2 implements StoreCash{

	/*
	 * Store temporal data into the appropriate
	 * variables
	 */
	@Override
	public void act(Data d) {
		Data2 d2 = (Data2) d;
		d2.cash = d2.temp_cash;
		d2.m =0;
	}
}