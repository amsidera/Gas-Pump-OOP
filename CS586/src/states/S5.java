package states;

import output.OutputProcessor;

/*
 * Pumping State of the state machine
 */

public class S5 extends State {
	
	public S5(OutputProcessor op) {
		super(op);
	}

	/*
	 * Call to PumpGasUnit and
	 * GasPumpedMsg actions
	 */
	@Override
	public void Pump() {
		op.PumpGasUnit();
		op.GasPumpedMsg();
	}

	/*
	 * Call to StopMsg action
	 */
	@Override
	public void StopPump() {
		op.StopMsg();
	}
}