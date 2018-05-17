package drivers;


import java.util.Scanner;


import factory.ConcreteFactory2;
import input.GasPump2;

/*
 * GasPump2 driver
 */

public class GasPump2Driver {
	
	/*
	 * Auxiliary function to clear the terminal
	 */
	private static void clearTerminal(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
				   "\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	/*
	 * Start function of the driver
	 */
	@SuppressWarnings("resource")
	public static void start(){
		GasPump2 gp = new GasPump2(new ConcreteFactory2());
		char option = 0;
		boolean shortMenu = false;
		while((option = printMenu(shortMenu)) != 'q'){
			shortMenu = true;
			System.out.println("\n");
			Scanner s = new Scanner(System.in);
			switch(option){
			case '0':
				System.out.println("Activate operation");
				System.out.print("Enter value of float a: ");
				float a = s.nextFloat();
				System.out.print("\nEnter value of float b: ");
				float b = s.nextFloat();
				System.out.print("\nEnter value of float c: ");
				float c = s.nextFloat();
				gp.Activate(a, b, c);
				break;
			case '1':
				System.out.println("PayCash(float) operation");
				System.out.print("Enter value of float cash: ");
				float cash = s.nextFloat();
				gp.PayCash(cash);
				break;
			case '2':
				System.out.println("PayCredit operation");
				gp.PayCredit();
				break;
			case '3':
				System.out.println("Reject operation");
				gp.Reject();
				break;
			case '4':
				System.out.println("Approved operation");
				gp.Approved();
				break;
			case '5':
				System.out.println("Cancel operation");
				gp.Cancel();
				break;
			case '6':
				System.out.println("Premium operation");
				gp.Premium();
				break;
			case '7':
				System.out.println("Regular operation");
				gp.Regular();
				break;
			case '8':
				System.out.println("Super operation");
				gp.Super();
				break;
			case 'a':
				System.out.println("StartPump operation");
				gp.StartPump();
				break;
			case 'b':
				System.out.println("PumpLiter operation");
				gp.PumpLiter();
				break;
			case 'c':
				System.out.println("Stop operation");
				gp.Stop();
				break;
			case 'e':
				System.out.println("Receipt operation");
				gp.Receipt();
				break;
			case 'f':
				System.out.println("NoReceipt operation");
				gp.NoReceipt();
				break;
			default:
				System.out.println("Unknown option.");
				break;
			}
		}
		System.out.println("Execution finished");
	}
	
	/*
	 * Prints the menu
	 */
	@SuppressWarnings("resource")
	public static char printMenu(boolean shortMenu){
		if(shortMenu){
			System.out.println("\n");
			System.out.println("0. Activate(int, int, int), 1. PayCash(float),");
			System.out.println("2. PayCredit(), 3.Reject(), 4.Approved(), 5. Cancel(), 6. Premium(),");
			System.out.println("7. Regular(), 8. Super(), a. StartPump(), b. PumpLiter(),");
			System.out.println("c. Stop(),  e. Receipt(), f. NoReceipt(), q. Quit");
		}else{
			clearTerminal();
			System.out.println("\t\tGasPump2");
			System.out.println("\t   Menu of Operations");
			System.out.println("\t0. Activate(float, float, float)");
			System.out.println("\t1. PayCash(float)");
			System.out.println("\t2. PayCredit()");
			System.out.println("\t3. Reject()");
			System.out.println("\t4. Approved()");
			System.out.println("\t5. Cancel()");
			System.out.println("\t6. Premium()");
			System.out.println("\t7. Regular()");
			System.out.println("\t8. Super()");
			System.out.println("\ta. StartPump()");
			System.out.println("\tb. PumpLiter()");
			System.out.println("\tc. Stop()");
			System.out.println("\te. Receipt()");
			System.out.println("\tf. NoReceipt()");
			System.out.println("\tq. Quit");
			System.out.println("\n\n\n");
		}
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(str.length() > 0)
			return str.charAt(0);
		else return 0;
	}
}