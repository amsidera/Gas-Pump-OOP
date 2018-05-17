package output.actions;

import data.Data;

/*
 * Interface of PumpGasUnit action strategy
 * Groups all PumpGasUnit actions under the same interface
 */

public interface PumpGasUnit {
	public void act(Data d);
}