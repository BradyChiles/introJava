import java.util.Scanner;

public class AverageAgeCHiles {
		//Brady Chiles
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("This program will calculate average age.");
		System.out.print("How many ages will you be entering? ");
		int amountOfAges = in.nextInt();
		int personNumber = 1;
		int allAges = 0;
		double averageAge = 0;
		
		while(personNumber <= amountOfAges){
			System.out.print("Please enter the age for person " + personNumber + ": ");
			int age = in.nextInt();
			allAges = allAges + age;
			personNumber++;
		}
		
		averageAge = (double)allAges/ amountOfAges;
		
		System.out.printf("The average age is: %.2f ",averageAge);
		
		
	
	
		in.close();
				
		
	
		
		
	
		
		
		
		

	}

}
