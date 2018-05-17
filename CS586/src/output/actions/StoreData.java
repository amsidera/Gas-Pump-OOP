package output.actions;

import data.Data;

/*
 * Interface of StoreData action strategy
 * Groups all StoreData actions under the same interface
 */

public interface StoreData {
	public void act(Data d);
}