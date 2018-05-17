package output.actions;

import data.Data;
import data.Data1;

/*
 * GasPump1 InitializeData action responsible for storing
 * initialization data into the data store.
 */

public class InitializeData1 implements InitializeData{

	/*
	 * Store temporal data into the appropriate
	 * variables
	 */
	@Override
	public void act(Data d) {
		Data1 d1 = (Data1) d;
		d1.price = 0;
		d1.m = 1;
	}
}