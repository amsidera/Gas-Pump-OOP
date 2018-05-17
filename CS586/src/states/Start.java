package states;

import output.OutputProcessor;

/*
 * Initial State of the state machine
 */

public class Start extends State {

	public Start(OutputProcessor op) {
		super(op);
	}

	/*
	 * Call to StoreData action
	 */
	@Override
	public void Activate() {
		op.StoreData();
	}
}