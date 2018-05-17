package states;

import output.OutputProcessor;

/*
 * Payment State of the state machine
 */

public class S1 extends State {

	public final static int CREDIT_TYPE = 1;
	public final static int CASH_TYPE = 2;
	public final static int DEBIT_TYPE = 3;

	public S1(OutputProcessor op) {
		super(op);
	}

	/*
	 * If cash, call to StoreCash and
	 * DisplayMenu actions
	 */
	@Override
	public void PayType(int type) {
		if(type == CREDIT_TYPE){
			
		}else if(type == CASH_TYPE){
			op.StoreCash();
			op.DisplayMenu();
		}else if(type == DEBIT_TYPE){
			op.EnterPinMsg();
			op.StorePin();
		}
		
	}	
}