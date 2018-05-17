package output.actions;

import data.Data;

/*
 * Interface of GasPumpedMsg action strategy
 * Groups all GasPumpedMsg actions under the same interface
 */

public interface GasPumpedMsg {
	public void act(Data d);
}