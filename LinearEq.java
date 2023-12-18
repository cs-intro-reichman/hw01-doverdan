/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq{
	public static void main(String[] args) {

		//receiving 3 'double' values
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);   
		double c = Double.parseDouble(args[2]);

		//Calculating the x 
		double x = ((c-b)/a);

		//Printing the formula with given values
		System.out.println(a +" * X + " +b +" = " +c);

		//Priting the Answer
		System.out.println("X = " +x);
	}
}