/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins{
	public static void main(String[] args) {

		//Receiving amout value 
		int amount = Integer.parseInt(args[0]);   

		//Calculating number of quarters needed
		int quarters = amount/25;

		//Calculating number of cents needed
		int cents = amount%25;

		//Printing the answer
		System.out.println("Use " +quarters +" quarters and " +cents +" cents");
	}
}