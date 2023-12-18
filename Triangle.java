/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle{
	public static void main(String[] args) {

		//Receving 3 integers
		int side1 = Integer.parseInt(args[0]);
		int side2 = Integer.parseInt(args[1]);  
		int side3 = Integer.parseInt(args[2]);

		//Checking for the answer true or false by trying all possible outcoms
		boolean t = (side1+side2>side3)&&(side1+side3>side2)&&(side3+side2>side1);

		//Printing the answer
		System.out.println(side1 +", " +side2 +", " +side3 +": " +t);
	}
}