package output.actions;



/*
 * GasPump1 WrongPinMsg action responsible for showing
 * wrong pin message.
 */

public class WrongPinMsg1 implements WrongPinMsg{

	/*
	 * Store temporal data into the appropriate
	 * variables
	 */
	@Override
	public void act() {
		System.out.println("Wrong pin!");
	}
}