import java.util.Scanner;
public class PrintStarsChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many rows of stars would you like printed? ");
		int numOfStars = in.nextInt();
	
		do{
			System.out.println("***********");
			counter++;
		}while(counter<numOfStars);
		
			
		
		
		
		in.close();
	}

}
