import java.util.Scanner;
public class VowelFoundChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String word = " ";
		int vowel = 0;
		int reset = 1;
		String message = "Please enter another word, or 'exit' to end. ";
		
		System.out.print("Please enter a word, or 'exit to end. ");
		word = in.next().toLowerCase();
		
		while(reset >0){
			for (int i = 0; i < word.length(); i++){   
				char ch = word.charAt(i);   
				if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y'){
					vowel++;
					break;
				}
			}
				
			if(vowel>0){
				System.out.println("A vowel has been found! ");	
				vowel = 0;
				System.out.println(message);
				word = in.next().toLowerCase();
				if(word.equals("exit")){
					reset = 0;
				}
			}else if(vowel==0){
				System.out.println("No vowel has been found... There must be a spelling mistake. ");
				System.out.println(message);
				word = in.next().toLowerCase();
				if(message.equals("exit")){
					reset = 0;
				}
			}
			
		}
		
		System.out.println("Thank you, Goodbye. ");
		
		in.close();

	}

}
