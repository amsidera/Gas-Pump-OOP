package states;

import output.OutputProcessor;


/*
 * Idle State of the state machine
 */

public class S0 extends State {
	
	public S0(OutputProcessor op) {
		super(op);
	}

	/*
	 * Call to PayMsg action
	 */
	@Override
	public void Start() {
		op.PayMsg();
		op.InitializeData();
	}
	
}