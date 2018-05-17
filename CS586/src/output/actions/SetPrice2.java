package output.actions;

import data.Data;
import data.Data2;

/*
 * GasPump2 SetPrice action responsible for setting
 * the proper price
 */

public class SetPrice2 implements SetPrice{

	/*
	 * Set price variable depending on the option
	 * selected
	 */
	@Override
	public void act(int g, Data d) {
		Data2 d2 = (Data2)d;
		float incre = 1.10f; 
		if(g == SetPrice.REGULAR)
			d2.price = d2.regular_price;
		else if(g == SetPrice.SUPER)
			d2.price = d2.super_price;
		else if(g == SetPrice.PREMIUM)
			d2.price = d2.premium_price;
		if (d2.m ==1) {
			d2.price = d2.price * incre;
		}
	}
}