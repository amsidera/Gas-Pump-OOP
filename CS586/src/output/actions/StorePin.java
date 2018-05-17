package output.actions;

import data.Data;

/*
 * Interface of StorePin action strategy
 * Groups all StorePin actions under the same interface
 */

public interface StorePin {
	public void act(Data d);
}