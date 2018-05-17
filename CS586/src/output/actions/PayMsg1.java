package output.actions;

/*
 * GasPump1 PayMsg action responsible for showing
 * pay message.
 */

public class PayMsg1 implements PayMsg{

	/*
	 * Prints pay message.
	 */
	@Override
	public void act() {
		System.out.println("Please, insert credit or debit card.");
	}
}