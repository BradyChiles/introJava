import java.util.Scanner;
public class simpleArrayChiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int temperatures[ ] = new int[ 15 ] ;
		for(int i = 0; i<temperatures.length; i++){
			System.out.println("What is the temperature?");
			temperatures[i] = in.nextInt();
			System.out.println("temperatures element at index[" + i + "] = " + temperatures[i]);
			
		}
		
		
		
		in.close();
	}

}
