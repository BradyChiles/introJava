import java.util.Scanner;
public class computeBalanceChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double finalBalance = 0;
		double initialBalance = 0;
		double interestRate = 0;
		int years = 0;
		
		System.out.println("What is the initial balance?");
		initialBalance = in.nextDouble();
		
		System.out.println("What is the interest rate?");
		interestRate = in.nextDouble();
		
		System.out.println("How many years would you like to compound?");
		years = in.nextInt();
		
		finalBalance = computeBalance(initialBalance,interestRate,years);
		System.out.printf("The balance after " + years + " years is: %.2f", finalBalance);
		
		
		
		in.close();
	}
	/**
	 * Computes the balance at a certain interest rate over a certain number of years
	 * @param initialBalance
	 * @param interestRate
	 * @param years
	 * @return the compounded balance at the end of the allotted time
	 */
	public static double computeBalance(double initialBalance, double interestRate, int years){
		double newBalance = initialBalance;
		for(int i = 1; i <= years; i++){
			double interestAmount = newBalance * interestRate;
			newBalance = newBalance + interestAmount;
		}
		return newBalance;
	}
	
}
