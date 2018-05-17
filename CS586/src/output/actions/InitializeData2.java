package output.actions;

import data.Data;
import data.Data2;

/*
 * GasPump2 InitializeData action responsible for storing
 * initialization data into the data store.
 */

public class InitializeData2 implements InitializeData{

	/*
	 * Store temporal data into the appropriate
	 * variables
	 */
	@Override
	public void act(Data d) {
		Data2 d2 = (Data2)d;
		d2.price = 0;
		d2.m= 1; 

	}
}