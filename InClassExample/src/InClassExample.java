import java.util.Scanner;
public class InClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a pet: ");
		String pet = in.nextLine();
		
		if(pet.equalsIgnoreCase("cat")){
			System.out.println("meow meow");
		}else if(pet.equalsIgnoreCase("dog")){
			System.out.println("bow wow");
		}else if((pet.equalsIgnoreCase("snake")) || (pet.equalsIgnoreCase("Lizard")) || (pet.equalsIgnoreCase("snail"))){
			System.out.println("Ssssss");
		}else{
			System.out.println("Cats rule");
		}
			
		System.out.println("Outside of the if statement");	
			
		System.out.println("Enter a score: ");
		int score = in.nextInt();
		String letterGrade = "";
		
		if(score >=90){
			letterGrade = "A";
		}else if ((score>=80) && (score<90)){
			letterGrade = "B";
		}else if ((score>=70) && (score<80)){
			letterGrade = "C";
		}else if((score>60) && (score<70)){
			letterGrade = "D";
		}else{
			letterGrade = "F";
		}
		
		System.out.println("Your letter grade is: " + letterGrade);
		
		
		in.close();

	}

}
