package states;

import output.OutputProcessor;

/*
 * VerifyCard State of the state machine
 */

public class S8 extends State {

	public S8(OutputProcessor op) {
		super(op);
	}
	
	/*
	 * Call to DisplayMenu action
	 */
	@Override
	public void CorrectPin() {
		op.DisplayMenu();
	}

	/*
	 * Call to RejectMsg action
	 */
	@Override
	public void IncorrectPin() {
		op.WrongPinMsg();
	}
}