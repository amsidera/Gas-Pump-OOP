package output.actions;

/*
 * GasPump2 CancelMsg action responsible for
 * showing cancel message.
 */

public class CancelMsg2 implements CancelMsg{

	/*
	 * Prints cancel message.
	 */
	@Override
	public void act() {
		System.out.println("The operation has been canceled.");
	}
}