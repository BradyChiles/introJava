import java.util.Scanner;
public class CompareNumbersChiles {
	
	//Brady Chiles 
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double firstNumber = in.nextDouble();
		
		System.out.print("Enter another number: ");
		double secondNumber = in.nextDouble();
		String answer = " ";
		if(firstNumber > secondNumber){
			answer = " is greater than ";
		}else if(firstNumber < secondNumber){
			answer = " is leass than ";
		}else{
			answer = " is equal to ";
		}
		
		System.out.println(firstNumber + answer + secondNumber);
		
		
		
		in.close();
		
		
	}

}
