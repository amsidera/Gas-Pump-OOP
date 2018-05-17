package output.actions;

import data.Data;

/*
 * Interface of ReturnCash action strategy
 * Groups all ReturnCash actions under the same interface
 */

public interface ReturnCash {
	public void act(Data d);
}