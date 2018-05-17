package output.actions;

/*
 * GasPump1 RejectMsg action responsible for showing
 * reject message.
 */

public class RejectMsg1 implements RejectMsg{

	/*
	 * Prints reject message.
	 */
	@Override
	public void act() {
		System.out.println("The card has been rejected.");
	}
}