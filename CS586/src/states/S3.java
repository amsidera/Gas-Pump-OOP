package states;

import output.OutputProcessor;

/*
 * GasSelection State of the state machine
 */

public class S3 extends State {

	public S3(OutputProcessor op) {
		super(op);
	}

	/*
	 * Call to CancelMsg and ReturnCash
	 * actions
	 */
	@Override
	public void Cancel() {
		op.CancelMsg();
		op.ReturnCash();
	}
	
	/*
	 * Call to SetPrice action
	 */
	@Override
	public void SelectGas(int g) {
		op.SetPrice(g);
	}
	/*
	 * Call to Continue action
	 */
	@Override
	public void Continue() {
	}
}