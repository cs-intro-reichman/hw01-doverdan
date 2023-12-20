/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

public class Gen3{
	public static void main(String[] args) {

		//Receiving the limits 
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]); 
		int minrange = Math.min(a,b);
		int maxrange = Math.max(a,b); 

		//Generating 3 randoms
		int rand1 = (int)(Math.random()*(maxrange-minrange))+minrange;
		int rand2 = (int)(Math.random()*(maxrange-minrange))+minrange;
		int rand3 = (int)(Math.random()*(maxrange-minrange))+minrange;

		//Checking for the minimal value generated
		int check_ans = Math.min(rand1,rand2);
		check_ans = Math.min(check_ans,rand3);

		//Printing the generated numbers
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);

		//Printing the answer
		System.out.println("The minimal generated number was " +check_ans);
	}
}