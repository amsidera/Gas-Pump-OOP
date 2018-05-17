package states;

import output.OutputProcessor;

/*
 * SelectReceipt State of the state machine
 */

public class S6 extends State {

	public S6(OutputProcessor op) {
		super(op);
	}

	/*
	 * Call to PrintReceipt and
	 * ReturnCash actions
	 */
	@Override
	public void Receipt() {
		op.PrintReceipt();
		op.ReturnCash();
	}

	/*
	 * Call to ReturnCash action
	 */
	@Override
	public void NoReceipt() {
		op.ReturnCash();
	}
}