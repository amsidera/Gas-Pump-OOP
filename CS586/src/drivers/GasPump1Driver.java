package drivers;

import java.util.Scanner;

import factory.ConcreteFactory1;
import input.GasPump1;

/*
 * GasPump1 driver
 */

public class GasPump1Driver {

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
	public static void start(){
		GasPump1 gp = new GasPump1(new ConcreteFactory1());
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
				gp.Activate(a, b);
				break;
			case '1':
				System.out.println("Start operation");
				gp.Start();
				break;
			case '2':
				System.out.println("PayCredit operation");
				gp.PayCredit();
				break;
			case '3':
				System.out.println("PayDebit operation");
				gp.PayDebit();
				break;
			case '4':
				System.out.println("Pin operation");
				String pin = s.nextLine();
				gp.Pin(pin);
				break;
			case '5':
				System.out.println("Reject operation");
				gp.Reject();
				break;
			case '6':
				System.out.println("Cancel operation");
				gp.Cancel();
				break;
			case '7':
				System.out.println("Approved operation");
				gp.Approved();
				break;
			case '8':
				System.out.println("Diesel operation");
				gp.Diesel();
				break;
			case '9':
				System.out.println("Regular operation");
				gp.Regular();
				break;
			case 's':
				System.out.println("StartPump operation");
				gp.StartPump();
				break;
			case 'b':
				System.out.println("PumpGallon operation");
				gp.PumpGallon();
				break;
			case 'a':
				System.out.println("StopPump operation");
				gp.StopPump();
				break;
			case 'f':
				System.out.println("FullTank operation");
				gp.FullTank();
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
			System.out.println("0. Activate(float, float), 1. Start(), 2. PayCredit(), 3. PayDebit(String), 4. Pin(String), 5. Reject(), ");
			System.out.println("6. Cancel(), 7. Approved(), 8. Diesel(), 9. Regular(), s. StartPump(), ");
			System.out.println("b. PumpGallon(), a. StopPump(), f. FullTank(), q. Quit");
		}else{
			clearTerminal();
			System.out.println("\t\tGasPump1");
			System.out.println("\t   Menu of Operations");
			System.out.println("\t0. Activate(float, float)");
			System.out.println("\t1. Start()");
			System.out.println("\t2. PayCredit()");
			System.out.println("\t3. PayDebit(String)");
			System.out.println("\t4. Pin(String)");
			System.out.println("\t5. Reject()");
			System.out.println("\t6. Cancel()");
			System.out.println("\t7. Approved()");
			System.out.println("\t8. Diesel()");
			System.out.println("\t9. Regular()");
			System.out.println("\ts. StartPump()");
			System.out.println("\tb. PumpGallon()");
			System.out.println("\ta. StopPump()");
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