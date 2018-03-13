import java.util.Scanner;
public class VowelCountChiles {
//Brady Chiles
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String word = " ";
		
		System.out.print("Please enter a word: ");
		word = in.next();
		int vowels = 0;
		
		
		for (int i = 0; i < word.length(); i++){   
			char ch = word.charAt(i);   
			if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowels++;  
			}
		}
		if(vowels > 0){
			System.out.println("There are (" + vowels + ") vowels in " + word + ".");
			
		}else{
			for (int i = 0; i < word.length(); i++){   
			char ch = word.charAt(i);   
				if(ch=='y'){
				vowels++;
				}
			}
			if(vowels >0){
				System.out.println("There are (" + vowels + ") vowels in " + word + ".");	
			}else{
				System.out.println("You must have a spelling mistake somewhere.");
			}
		}
		
		
		
		
		in.close();
	}

}
