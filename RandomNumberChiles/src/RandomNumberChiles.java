import java.util.Scanner;
import java.util.Random;
public class RandomNumberChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int totalNumbers = 0;
		int lowest = 0;
		int highest = 0;
		Random rn = new Random();
		
		System.out.print("How many numbers would you like to see? ");
		totalNumbers=in.nextInt();
		
		System.out.print("What is the lowest number you would like to see? ");
		lowest = in.nextInt();
		
		System.out.print("What is the highest number you would like to see? ");
		highest = in.nextInt();
		
		for(int i = 1; i <= totalNumbers; i++){
			int answer = rn.nextInt(highest) + lowest;
			System.out.println(answer);
		}
		
		
		
		in.close();

	}

}
