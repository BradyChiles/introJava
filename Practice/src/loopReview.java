import java.util.Scanner;
public class loopReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		/*System.out.print("Please enter a number: ");
		int initalNumberA = in.nextInt();
		System.out.print("Please enter another number: ");
		int numberB = in.nextInt();
		int sumOfAllOdds = 0;
		int numberA = initalNumberA;
		
		while (numberA <=numberB){
			if(numberA % 2 ==1){
				sumOfAllOdds = sumOfAllOdds + numberA;
			}
			
			numberA++;
		}
		System.out.println("The sum of all odds between " + initalNumberA + " and " + numberB + " is " + sumOfAllOdds);
		
		*/
	
	System.out.println("Please enter a number: ");
	int num = in.nextInt();
	int sumOfAllOdds = 0;
	while (num > 0){
	int digit = num % 10;
		if (digit % 2 ==1){
			sumOfAllOdds = sumOfAllOdds + digit;
		}
		num = num / 10;
	}
	System.out.println(sumOfAllOdds);
		
		
		
		
		
		
		
		
		
		
		
		in.close();
	}
	
	

}
