package output.actions;

/*
 * GasPump1 StopMsg action responsible for showing
 * stop message.
 */

public class StopMsg1 implements StopMsg{

	/*
	 * Prints stop message.
	 */
	@Override
	public void act() {
		System.out.println("Pump stopped.");
	}
}