import java.util.Scanner;
public class HalfFull {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a number between 0 and 100.");
		int num = in.nextInt();
		String message = "";
		
		if(num <= 49){
			message = "half empty";
		}else{
			message = "half full";
		}
		
		System.out.println("The glass is " + message + ".");
		System.out.println("Please enter a number.");
		int n = in.nextInt();
		
		
		if (n > 10) {
		       System.out.print("*****");
		} else if (n > 7) { 

		       System.out.print("****"); 
		} else if (n > 4) { 

		       System.out.print("***"); 
		} else if (n > 1) { 

		       System.out.print("**"); 
		}

		System.out.println("*");
		
		
		
		
		in.close();
		
		
		
		
		
	}
}
	