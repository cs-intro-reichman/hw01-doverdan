/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo{
	public static void main(String[] args) {

		//receiving 2 integers 
		int a = Integer.parseInt(args[0]);   
		int b = Integer.parseInt(args[1]); 

		//Combining the values into a new integer
		int sum = a+b;  

		//Printing the answer
		System.out.println(a +" " +"+" +" " +b +" " +"=" +" " +sum);  
	}
}