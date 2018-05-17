package states;

import output.OutputProcessor;

/*
 * VerifyCard State of the state machine
 */

public class S2 extends State {

	public S2(OutputProcessor op) {
		super(op);
	}
	
	/*
	 * Call to DisplayMenu action
	 */
	@Override
	public void Approved() {
		op.DisplayMenu();
	}

	/*
	 * Call to RejectMsg action
	 */
	@Override
	public void Reject() {
		op.RejectMsg();
	}
}