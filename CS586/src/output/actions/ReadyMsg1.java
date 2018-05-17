package output.actions;

/*
 * GasPump1 ReadyMsg action responsible for showing
 * ready message.
 */

public class ReadyMsg1 implements ReadyMsg{
	
	/*
	 * Prints ready message.
	 */
	@Override
	public void act() {
		System.out.println("Ready to pump.");
		System.out.println("b. Pump Gallon");
	}
}