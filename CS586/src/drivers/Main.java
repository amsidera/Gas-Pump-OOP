package drivers;

import java.util.Scanner;

/*
 * Main Driver. It has main function where the program
 * starts. It handles the GasPump version selection.
 */

public class Main {
	
	/*
	 * Main function. The first function executed
	 * when program starts.
	 */
	public static void main(String[] args){
		printTitle();
		int selection = printGasPumpSelection(null);
		if(selection == 1){
			GasPump1Driver.start();
		}else if (selection == 2){
			GasPump2Driver.start();
		}
	}
	
	/*
	 * Auxiliary function to clear the terminal
	 */
	private static void clearTerminal(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
						   "\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	/*
	 * Prints the welcome screen
	 */
	@SuppressWarnings("resource")
	private static void printTitle(){
		clearTerminal();
		System.out.println("\t\t\t\t\tCS586");
		System.out.println("\t\t\t\t     Spring 2018");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Press enter to continue");
		Scanner s = new Scanner(System.in);
		s.nextLine();
	}

	/*
	 * Prints the GasPump version selection menu
	 */
	@SuppressWarnings("resource")
	private static int printGasPumpSelection(String errorMessage){
		clearTerminal();
		if(errorMessage != null) System.out.println(errorMessage+"\n\n");
		System.out.println("Select GasPump1 or GasPump2");
		System.out.println("\n\n\t1. GasPump1");
		System.out.println("\t2. GasPump2");
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		int result = 1;
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		if(c == 49){
			result = 1;
		}else if(c == 50){
			result = 2;
		}else{
			printGasPumpSelection("Unknown option.");
		}
		return result;
	}
}