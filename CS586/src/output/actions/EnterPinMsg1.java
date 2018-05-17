package output.actions;

/*
 * GasPump1 EnterPinMsg1 action responsible for showing
 * wrong pin message.
 */

public class EnterPinMsg1 implements EnterPinMsg{

	/*
	 * Store temporal data into the appropriate
	 * variables
	 */
	@Override
	public void act() {
		System.out.println("Enter the pin");
	}
}