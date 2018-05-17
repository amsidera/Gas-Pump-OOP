package output.actions;

import data.Data;

/*
 * Interface of PrintReceipt action strategy
 * Groups all PrintReceipt actions under the same interface
 */

public interface PrintReceipt {
	public void act(Data d);
}