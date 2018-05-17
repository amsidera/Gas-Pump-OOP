package output.actions;

import data.Data;

/*
 * Interface of StoreCash action strategy
 * Groups all StoreCash actions under the same interface
 */

public interface StoreCash {
	public void act(Data d);
}