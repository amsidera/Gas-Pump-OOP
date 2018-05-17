package output.actions;

import data.Data;
import data.Data2;

/*
 * GasPump2 SetInitialValues action responsible for
 * reseting L value
 */

public class SetInitialValues2 implements SetInitialValues{

	/*
	 * Resets L variable
	 */
	@Override
	public void act(Data d) {
		Data2 d2 = (Data2)d;
		d2.L = 0;
	}
}