package output.actions;

/*
 * GasPump2 ReadyMsg action responsible for showing
 * ready message.
 */

public class ReadyMsg2 implements ReadyMsg{
	
	/*
	 * Prints ready message.
	 */
	@Override
	public void act() {
		System.out.println("Ready to pump.");
		System.out.println("b. Pump Liter");
	}
}