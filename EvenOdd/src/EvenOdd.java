import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int num = in.nextInt();
		String message = "";
		if (num % 2 == 0){
		message = "even";
		}else{
			message = "odd";
		}
			System.out.println(num + " is an " + message + " number.");
	
		
		in.close();
	}	

}
