package input;

import data.*;
import factory.AbstractFactory;
import mda.MDA_EFSM;
import output.OutputProcessor;

/*
 * Input processor for GasPump2
 */

public class GasPump2 {
	
	// Object where info is stored
	Data2 d;
	// State machine object
	MDA_EFSM m;
	
	/*
	 * Constructor
	 * @param af: Abstract factory to
	 * create dependencies.
	 */
	public GasPump2(AbstractFactory af){
		d = (Data2)af.getData();
		m = new MDA_EFSM(new OutputProcessor(af));
	}

	/*
	 * Activate operation
	 * Check if the arguments are valid
	 * @param a: price of regular gas
	 * @param b: price of premium gas
	 * @param c: price of super gas
	 */
	public void Activate(float a, float b, float c){
		if(a > 0 && b > 0 && c > 0){
			d.temp_a = a;
			d.temp_b = b;
			d.temp_c = c;
			m.Activate();
		}
	}
	
	/*
	 * PayCash event
	 */ 
	public void PayCash(float c) {
		if(c > 0){
			m.Start();
			d.temp_cash = c;
			m.PayType(MDA_EFSM.CASH_TYPE);	
		}
	}
	/*
	 * PayCredit event
	 */ 
	public void PayCredit(){
		m.Start();
		m.PayType(MDA_EFSM.CREDIT_TYPE);	
	}
	/*
	 * Reject event
	 */ 
	public void Reject(){
		m.Reject();	
	}
	
	/*
	 * Approved event
	 */ 
	public void Approved(){
		d.m = 1;
		m.Approved();	
	}
	
	/*
	 * Cancel event
	 */ 
	public void Cancel(){
		m.Cancel();
	}
	
	/*
	 * Super event
	 */ 
	public void Super(){
		m.SelectGas(MDA_EFSM.SUPER);
		System.out.println("a. StartPump");
		System.out.println("6. Cancel");
	}
	
	/*
	 * Premium event
	 */ 
	public void Premium(){
		m.SelectGas(MDA_EFSM.PREMIUM);
		System.out.println("a. StartPump");
		System.out.println("6. Cancel");
	}
	
	/*
	 * Regular event
	 */ 
	public void Regular(){
		m.SelectGas(MDA_EFSM.REGULAR);
		System.out.println("a. StartPump");
		System.out.println("6. Cancel");
	}
	

	/*
	 * StartPump event
	 */ 
	public void StartPump(){
		m.Continue();
		m.StartPump();
	}
	
	/*
	 * PumpLiter event
	 * Check if there is enough cash
	 * to continue pumping
	 */ 
	public void PumpLiter(){
		if (d.m == 0){
		if(d.cash<(d.L+1)*d.price){
			m.StopPump();}
		else {m.Pump();}
		}else if (d.m ==1) {m.Pump();}
	}
	
	/*
	 * Stop event
	 */ 
	public void Stop(){
		m.StopPump();
	}
	
	/*
	 * Receipt event
	 */ 
	public void Receipt(){
		m.Receipt();
	}
	
	/*
	 * NoReceipt event
	 */ 
	public void NoReceipt(){
		m.NoReceipt();
	}
}