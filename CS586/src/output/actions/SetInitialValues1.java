package output.actions;

import data.Data;
import data.Data1;

/*
 * GasPump1 SetInitialValues action responsible for
 * reseting G value
 */

public class SetInitialValues1 implements SetInitialValues{

	/*
	 * Resets G variable
	 */
	@Override
	public void act(Data d) {
		Data1 d1 = (Data1)d;
		d1.G = 0;
	}
}