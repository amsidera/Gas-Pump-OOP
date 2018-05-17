package output.actions;

import data.Data;

/*
 * Interface of SetPrice action strategy
 * Groups all SetPrice actions under the same interface
 */

public interface SetPrice {

	public final static int REGULAR = 1;
	public final static int SUPER = 2;
	public final static int PREMIUM = 3;
	public final static int DIESEL = 4;
	
	public void act(int g, Data d);
}