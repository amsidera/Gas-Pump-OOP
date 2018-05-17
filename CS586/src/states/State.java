package states;

import output.OutputProcessor;

/*
 * This class is State superclass of the centralized State
 * Pattern. All operations implements a body to avoid the
 * implementation of all operations in all states, due to
 * each state will implement 1 or 2 operation. Each state
 * will override the appropriate operation/s. If a not
 * overriden operation is called, it will show a not
 * allowed message.
 */

public abstract class State {
	
	OutputProcessor op;

	public State(OutputProcessor op){
		this.op = op;
	}
	
	private String NotAllowedMessage = "Operation not allowed in this state.";
	
	public void Activate(){ System.out.println(NotAllowedMessage); }
	public void Start(){ System.out.println(NotAllowedMessage); }
	public void PayType(int type){ System.out.println(NotAllowedMessage); }
	public void Reject(){ System.out.println(NotAllowedMessage); }
	public void Cancel(){ System.out.println(NotAllowedMessage); }
	public void Approved(){ System.out.println(NotAllowedMessage); }
	public void SelectGas(int g){ System.out.println(NotAllowedMessage); }
	public void Continue(){ System.out.println(NotAllowedMessage); }
	public void StartPump(){ System.out.println(NotAllowedMessage); }
	public void Pump(){ System.out.println(NotAllowedMessage); }
	public void StopPump(){ System.out.println(NotAllowedMessage); }
	public void Receipt(){ System.out.println(NotAllowedMessage); }
	public void IncorrectPin(){ System.out.println(NotAllowedMessage); }
	public void CorrectPin(){ System.out.println(NotAllowedMessage); }
	public void NoReceipt(){ System.out.println(NotAllowedMessage); }
}