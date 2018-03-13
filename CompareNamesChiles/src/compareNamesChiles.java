import java.util.Scanner;

public class compareNamesChiles {
	
	//Brady Chiles

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		String firstName = in.next();
		
		String s1 = firstName.substring(0, 1).toUpperCase();
		String s2 = firstName.substring(1).toLowerCase();
		String firstNameCapitalized = s1 + s2;
		
		System.out.print("Enter another name: ");
		String secondName = in.next();
		String s3 = secondName.substring(0, 1).toUpperCase();
		String s4 = secondName.substring(1).toLowerCase();
		String secondNameCapitalized = s3 + s4;
		
		boolean compare = firstNameCapitalized.equals(secondNameCapitalized);
		
		System.out.println(firstNameCapitalized + " is equal to " + secondNameCapitalized + ": " + compare);
		
		
		
		
		in.close();
	}
}
