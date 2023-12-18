/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;

public class Gen3{
	public static void main(String[] args) {
		Random rand = new Random();

		//Receiving the limits 
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);  

		//Generating 3 randoms
		int rand1 = rand.nextInt(a,b);
		int rand2 = rand.nextInt(a,b);
		int rand3 = rand.nextInt(a,b);

		//Checking for the minimal value generated
		int check_ans = Math.min(rand1,rand2);
		int final_ans = Math.min(check_ans,rand3);

		//Printing the generated numbers
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);

		//Printing the answer
		System.out.println("The minimal generated number was " +final_ans);
	}
}