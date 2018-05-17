package output.actions;

import data.Data;
import data.Data1;

/*
 * GasPump1 SetPrice action responsible for setting
 * the proper price
 */

public class SetPrice1 implements SetPrice{

	/*
	 * Set price variable depending on the option
	 * selected
	 */
	@Override
	public void act(int g, Data d) {
		Data1 d1 = (Data1)d;
		if(g == SetPrice.REGULAR)
			d1.price = d1.regular_price;
		else if(g == SetPrice.DIESEL)
			d1.price = d1.diesel_price;
	}
}