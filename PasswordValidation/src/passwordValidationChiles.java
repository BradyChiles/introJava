import java.util.Scanner;
public class passwordValidationChiles {
//Brady Chiles
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		String password = "";
		String passwordAgain = "";
		boolean passwordMatch = false;
		boolean passwordValid = false;
		
		System.out.println("Your password must be at least 8 characters long and include an uppercase letter, a lowercase letter, and a number.");
	

	while(passwordValid == false){	
		while(passwordMatch == false){
				System.out.println("Please enter your new password: ");
				password = in.nextLine();
				System.out.println("Please enter it again: ");
				passwordAgain = in.nextLine();
				if(password.equals(passwordAgain)){
					passwordMatch = true;
				}else{
					System.out.println("The passwords did not match. Please try again.");
					passwordMatch = false;
				}
		}		
		passwordValid = passwordValidation(password);
			if(passwordValid == true){
				System.out.println("Your password has been changed!");
			}else{ 
				System.out.println("Your password was not valid, it must be at least 8 characters long and include an uppercase letter, a lowercase letter, and a number.");
				passwordValid = false;
				passwordMatch = false;
			}
	}	
		in.close();
	}




	

	/**
	 * This will validate an entered password to see if it meets the parameters of an upper case character, lower case character, and a digit.
	 * @param str
	 * @return true or false validation of the password
	 */
	public static boolean passwordValidation(String str){
		boolean passwordValid = false;
		boolean lowercaseValid = false;
		boolean uppercaseValid = false;
		boolean digitValid = false;
		boolean lengthValid = false;
		
		for(int i = 0; i < str.length(); i++){
			 char character = str.charAt(i);
			 boolean characterLowerCase = Character.isLowerCase(character);
			 boolean characterUpperCase = Character.isUpperCase(character);
			 boolean characterDigit = Character.isDigit(character);
			 if (characterLowerCase == true){
				 lowercaseValid = true;
			 }
			 if(characterUpperCase == true){
				 uppercaseValid = true;
			 }
			 if(characterDigit == true){
				 digitValid = true;
			 }
		}
		if(str.length() >= 8){
			lengthValid = true;
		}
		if(lowercaseValid == true && uppercaseValid == true && digitValid == true && lengthValid == true){
			passwordValid = true;
		}
	
		 
		return passwordValid;
	}
}

