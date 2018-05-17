package output.actions;

import data.Data;

/*
 * Interface of SetInitialValues action strategy
 * Groups all SetInitialValues actions under the same interface
 */

public interface SetInitialValues {
	public void act(Data d);
}