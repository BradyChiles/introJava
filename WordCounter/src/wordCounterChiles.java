import java.util.Scanner;
public class wordCounterChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		String phrase = "";
		int wordCount = 0;
		
		System.out.print("Please enter a phrase: ");
		phrase = in.nextLine();
		
		wordCount = countWords(phrase);
		System.out.println("There are " + wordCount + " words in the phrase: " + phrase + ".");
		
		in.close();
	}
	/**
	 * This will take a phrase and count the number of words
	 * @param str
	 * @return the number of words in the phrase
	 */
	public static int countWords(String str){
		int wordCount = 1;
		for(int i = 0; i<str.length(); i++){
			String sub = str.substring(i, i+1);
			if(sub.equals(" ")){
				wordCount++;
			}
		}
		return wordCount;
	}
}
