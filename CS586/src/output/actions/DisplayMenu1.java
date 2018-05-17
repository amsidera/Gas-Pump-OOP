package output.actions;

/*
 * GasPump1 DisplayMenu action responsible for
 * showing gas selection menu.
 */

public class DisplayMenu1 implements DisplayMenu{

	/*
	 * Prints gas selection menu
	 */
	@Override
	public void act() {
		System.out.println("8. Diesel gas.");
		System.out.println("9. Regular gas.");
	}
}