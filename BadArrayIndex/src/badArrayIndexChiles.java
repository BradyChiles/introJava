import java.util.Scanner;
public class badArrayIndexChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int index = 0;
		String[] names = {"Bob","Nick","Kate","Clarence","Liam","Cilian","Lemmy","Geof","Johan","Lars"};
		
		try{
			System.out.print("Please enter an index for the array of names: ");
			index = in.nextInt();
			System.out.println("The name in index " + index + " is: " + names[index]);
		}catch(IndexOutOfBoundsException exception){
			System.out.println("The index does not exist for this array.");
		}

		
		
		
		
		
		in.close();
		
	}

}
