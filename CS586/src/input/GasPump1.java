package input;

import java.util.Scanner;

import data.*;
import factory.AbstractFactory;
import mda.MDA_EFSM;
import output.OutputProcessor;

/*
 * Input processor for GasPump1
 */

public class GasPump1 {

	// Object where info is stored
	Data1 d;
	// State machine object
	MDA_EFSM m;

	/*
	 * Constructor
	 * @param af: Abstract factory to
	 * create dependencies.
	 */
	public GasPump1(AbstractFactory af){
		d = (Data1)af.getData();
		m = new MDA_EFSM(new OutputProcessor(af));
	}
	
	/*
	 * Activate operation
	 * Check if the arguments are valid
	 * @param a: price of regular gas
	 * @param b: price of Diesel gas
	 */
	public void Activate(float a, float b){
		if(a > 0 && b > 0){
			d.temp_a = a;
			d.temp_b = b;
			m.Activate();
		}
	}
	
	/*
	 * Start event
	 */ 
	public void Start(){
		m.Start();
	}
	
	/*
	 * PayCredit event
	 */ 
	public void PayCredit() {
		m.PayType(MDA_EFSM.CREDIT_TYPE);
		System.out.println("7. Approved");
		System.out.println("5. Reject");
	}
	
	/*
	 * PayDebit event
	 */ 
	public void PayDebit() {
		System.out.println("Debit card pin:");
		Scanner s = new Scanner(System.in);
		String pin = s.nextLine();
		d.temp_pin = pin;
		m.PayType(MDA_EFSM.DEBIT_TYPE);
	}
	/*
	 * Pin event
	 */ 
	public void Pin(String pin){

		if (pin.equals(d.pin))
		{
			m.CorrectPin();
		}
		else{
			m.IncorrectPin();
		}
	}
	
	/*
	 * Reject event
	 */ 
	public void Reject(){
		m.Reject();
	}
	
	/*
	 * Cancel event
	 */ 
	public void Cancel(){
		m.Cancel();
	}
	
	/*
	 * Approved event
	 */ 	
	public void Approved(){
		m.Approved();
	}
	
	/*
	 * Diesel event
	 */ 
	public void Diesel(){
		m.SelectGas(MDA_EFSM.DIESEL);
		System.out.println("s. StartPump");
		System.out.println("6. Cancel");
	}
	
	/*
	 * Regular event
	 */ 
	public void Regular(){
		m.SelectGas(MDA_EFSM.REGULAR);
		System.out.println("s. StartPump");
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
	 * PumpGallon event
	 */ 
	public void PumpGallon(){
		m.Pump();
	}
	
	/*
	 * StopPump event
	 */ 
	public void StopPump(){
		m.StopPump();
		m.Receipt();
	}
	/*
	 * FullTank event
	 */ 
	public void FullTank(){
		m.StopPump();
		m.Receipt();
	}
}