import java.util.Scanner;

//Brady Chiles

public class memberIdChiles {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
			System.out.print("Please enter your ID number: ");
			String idNumber = in.next();  //taking the input from the user
			
			String s1 = idNumber.substring(0, 1).toUpperCase();  //segmenting the input to resemble each of the sections in the key
			String s2 = idNumber.substring(1, 4);  
			String s3 = idNumber.substring(4, 8).toUpperCase();
			String s4 = idNumber.substring(8, 10).toUpperCase();
			String s5 = idNumber.substring(10, 13).toUpperCase();
			String s6 = idNumber.substring(13);
			
			String idNumberNew = (s1 + "-" + s2 + " " + s3 + " " + s4 + "-" + s5 + " (" + s6 + ")");  //taking the segments and manipulating them to meet the format of the key
					
		
			System.out.println(idNumberNew);
		
		in.close();
	}

	
	
}
