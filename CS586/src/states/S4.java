package states;

import output.OutputProcessor;

/*
 * GasSelected State of the state machine
 */

public class S4 extends State {
	
	public S4(OutputProcessor op) {
		super(op);
	}
	
	/*
	 * Call to SetInitialValues and
	 * ReadyMsg actions
	 */
	@Override
	public void StartPump() {
		op.SetInitialValues();
		op.ReadyMsg();
	}
}