package output.actions;

/*
 * GasPump1 CancelMsg action responsible for
 * showing cancel message.
 */

public class CancelMsg1 implements CancelMsg{

	/*
	 * Prints cancel message.
	 */
	@Override
	public void act() {
		System.out.println("The operation has been canceled.");
	}
}