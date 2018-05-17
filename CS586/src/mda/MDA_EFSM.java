package mda;

import output.OutputProcessor;
import states.*;

/*
 * This class represents a centralized state machine.
 * This class is responsible of state transition and the
 * states are the responsible of action performing.
 */
public class MDA_EFSM {
	
	
	public final static int CREDIT_TYPE = 1;
	public final static int CASH_TYPE = 2;
	public final static int DEBIT_TYPE = 3;
	
	public final static int REGULAR = 1;
	public final static int SUPER = 2;
	public final static int PREMIUM = 3;
	public final static int DIESEL = 4;
	
	// List of states
	private State[] states;
	// This variable stores current state index.
	private StateEnum state = StateEnum.Start;
	
	public MDA_EFSM(OutputProcessor op){
		// Instantiate each state and store it in the list.
		states = new State[] {new Start(op), new S0(op), new S1(op), new S2(op), 
				new S3(op), new S4(op), new S5(op), new S6(op), new S8(op)};
	}

	/*
	 * Activate operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void Activate() {
		states[state.id()].Activate();
		if(state == StateEnum.Start){
			state = StateEnum.S0;
			System.out.println("Current State: S0");
		}
	}

	/*
	 * Start operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void Start() {
		states[state.id()].Start();
		if(state == StateEnum.S0){
			state = StateEnum.S1;
			System.out.println("Current State: S1");
		}
	}

	/*
	 * PayType operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void PayType(int type){
		states[state.id()].PayType(type);
		if(state == StateEnum.S1){
			if(type == CREDIT_TYPE){
				state = StateEnum.S2;
				System.out.println("Current State: S2");
			}else if (type == CASH_TYPE){
				state = StateEnum.S3;
				System.out.println("Current State: S3");
			}else if (type == DEBIT_TYPE){
				state = StateEnum.S8;
				System.out.println("Current State: S8");
			}
		}
	}

	/*
	 * Approved operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void Approved() {
		states[state.id()].Approved();
		if(state == StateEnum.S2){
			state = StateEnum.S3;
			System.out.println("Current State: S3");
		}
	}

	/*
	 * Reject operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void Reject() {
		states[state.id()].Reject();
		if(state == StateEnum.S2){
			state = StateEnum.S0;
			System.out.println("Current State: S0");
		}
	}
	/*
	 * IncorrectPin operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void IncorrectPin() {
		states[state.id()].IncorrectPin();
		if(state == StateEnum.S8){
			state = StateEnum.S0;
			System.out.println("Current State: S0");
		}
	}

	/*
	 * Correct operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void CorrectPin() {
		states[state.id()].CorrectPin();
		if(state == StateEnum.S8){
			state = StateEnum.S3;
			System.out.println("Current State: S3");
		}
	}
	/*
	 * Cancel operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void Cancel() {
		states[state.id()].Cancel();
		if(state == StateEnum.S3){
			state = StateEnum.S0;
			System.out.println("Current State: S0");
		}
	}

	/*
	 * SelectGas operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void SelectGas(int g){
		states[state.id()].SelectGas(g);
		if(state == StateEnum.S3){
			state = StateEnum.S3;
			System.out.println("Current State: S3");
		}
	}

	/*
	 * Continue operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void Continue() {
		states[state.id()].Continue();
		if(state == StateEnum.S3){
			state = StateEnum.S4;
			System.out.println("Current State: S4");
		}
	}
	/*
	 * StartPump operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void StartPump() {
		states[state.id()].StartPump();
		if(state == StateEnum.S4){
			state = StateEnum.S5;
			System.out.println("Current State: S5");
		}
	}

	/*
	 * Pump operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void Pump(){
		states[state.id()].Pump();
		if(state == StateEnum.S5){
			state = StateEnum.S5;
			System.out.println("Current State: S5");
		}
	}

	/*
	 * StopPump operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void StopPump() {
		states[state.id()].StopPump();
		if(state == StateEnum.S5){
			state = StateEnum.S6;
			System.out.println("Current State: S6");
		}
	}

	/*
	 * Receipt operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void Receipt() {
		states[state.id()].Receipt();
		if(state == StateEnum.S6){
			state = StateEnum.S0;
			System.out.println("Current State: S0");
		}
	}

	/*
	 * NoReceipt operation. It is forwarded to the state.
	 * If necessary, the state is changed. 
	 */
	public void NoReceipt() {
		states[state.id()].NoReceipt();
		if(state == StateEnum.S6){
			state = StateEnum.S0;
			System.out.println("Current State: S0");
		}
	}
}
