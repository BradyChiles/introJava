import java.util.Scanner;
public class childcareChargesChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int age = 0;
		int days = 0;
		int cost = 0;
		
		int rates[][] = {      
				{30, 60, 88, 115, 140},
                {26, 52, 70, 96, 120},                 
                {24, 46, 67, 89, 110},
                {22, 40, 60, 75, 88},
                {20, 35, 50, 66, 84} };
		
		System.out.println("How old is the child(0-4).");
		age = in.nextInt();
		while(age != 999){
			System.out.println("How many days will your child attend? 1-5.");
			days = in.nextInt();
		
			for(int i = 0; i<rates.length; i++){
				if(age== i){
					for(int j = 0; j<rates[i].length; j++){
						if(days-1 == j){
							cost = rates[i][j];
						}
					}	
				}
			}
			System.out.println("The cost for a child of " + age + " years old, and attending for " + days + " days, is: " + cost + ".");
			System.out.println("Enter the age of the next child(0-4) or 999 to terminate.");
			age = in.nextInt();
		}
		System.out.println("Program terminated.");
		in.close();
	}

}
