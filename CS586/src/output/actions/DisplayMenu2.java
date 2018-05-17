package output.actions;

/*
 * GasPump2 DisplayMenu action responsible for
 * showing gas selection menu.
 */

public class DisplayMenu2 implements DisplayMenu{

	/*
	 * Prints gas selection menu
	 */
	@Override
	public void act() {
		System.out.println("6. Premium gas.");
		System.out.println("7. Regular gas.");
		System.out.println("8. Super gas.");
	}
}