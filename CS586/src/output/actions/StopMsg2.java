package output.actions;

/*
 * GasPump2 StopMsg action responsible for showing
 * stop message and show select receipt menu.
 */

public class StopMsg2 implements StopMsg{

	/*
	 * Prints stop message and receipt menu.
	 */
	@Override
	public void act() {
		System.out.println("Pump stopped.");
		System.out.println("Want receipt?");
		System.out.println("e. Receipt.");
		System.out.println("f. No Receipt.");
	}
}