import java.util.Scanner;

//Created by Brady Chiles

public class ABC {

	public static void main(String[] args) {

		// Variables
		double firstNumber;
		double secondNumber;
	

		// Scanner
		Scanner in = new Scanner(System.in);

		// Gather first number
		System.out.print("Enter the first number: ");
		firstNumber = in.nextDouble();

		// Gather second number
		System.out.print("Enter the second number: ");
		secondNumber = in.nextDouble();

		// Sum of both numbers
		add(firstNumber,secondNumber);
		
		// Difference of both numbers
		subtract(firstNumber,secondNumber);

		// Sum of both numbers
		multiply(firstNumber,secondNumber);

		// Quotient of both numbers
		divide(firstNumber,secondNumber);
	}

	public static void add(double fN, double sN){
		double sum = fN + sN;
		System.out.println("The sum is: " + sum);
	}
	
	public static void subtract(double fN, double sN){
		double difference = fN - sN;
		System.out.println("The difference is: " + difference);
	}
	
	public static void multiply(double fN, double sN){
		double product = fN * sN;
		System.out.println("The product is: " + product);
	}
	
	public static void divide(double fN, double sN){
		double difference = fN / sN;
		System.out.println("The difference is: " + difference);
	}
}
