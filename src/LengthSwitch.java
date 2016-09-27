import java.util.Scanner;
public class LengthSwitch {
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length(in inches): "); //asking user for input of how many inches
		int inches = in.nextInt();
		System.out.println("1. Foot(1 inch  = .083333 feet"); //Conversion Chart or menu 
		System.out.println("2. Meter(1 inch = .0254 feet");
		System.out.println("3. Yard(1 inch = .027778 yards");
		System.out.println("Type number of Metric Conversion");
		int value = in.nextInt();
		switch(value){
		case 1: //switch case for the menu stated above 
			value = 1;
			double x = inches*.083333;
			System.out.println("Answer in feet: "+ (x));
			break;
		case 2: 
			value = 2;
			double y = inches*.0254;
			System.out.println("Answer in Meter: "+ (y));
			break;
		case 3:
			value = 3;
			double z = inches*.027778;
			System.out.println("Answer in yards: "+ (z));
			break;
			default: 
				System.out.println("Not a valid option"); //default option for user error
		}
	}
}
