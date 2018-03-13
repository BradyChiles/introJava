import java.util.Scanner;

//Brady Chiles

public class MadLibsChiles {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
			System.out.print("Enter a name: ");
			String name = in.next();
		   
			System.out.print("Enter a verb: ");
			String verb1 = in.next();
			
			System.out.print("Enter a noun: ");
			String noun1 = in.next();
			
			System.out.print("Enter a verb: ");
			String verb2 = in.next();
			
			System.out.print("Enter a noun:");
			String noun2 = in.next();
			
			System.out.print("Enter an color: ");
			String color1 = in.next();
			
			System.out.print("Enter an color: ");
			String color2 = in.next();
			
			System.out.println("-------------------------------------------------------------------");
					
			String s1 = name.substring(0, 1).toUpperCase();
			String s2 = name.substring(1).toLowerCase();
			String nameCapitalized = s1 + s2;     //This area is where the problem is stemming from. I have gotten the UpperCAse to work correctly but not the LowerCase
		    
		    String s3 = verb2.substring(0, 1).toUpperCase();
		    String s4 = verb2.substring(1).toLowerCase();
		    String verbCapitalized = s3 + s4;
		    
		    
		    
		    System.out.println("King " + nameCapitalized + " he " + verb1.toLowerCase() + " a fine new " + noun1.toLowerCase() + " ;");
		    System.out.println("Pastry and piecrust, that was the walls;");
		    System.out.println("The windows were made of " + color1.toLowerCase() + " pudding and " + color2.toLowerCase() + " ;");
		    System.out.println(verbCapitalized + " with " + noun2.toLowerCase() + " --you never saw the like.");
		    


		    
		    
		
		
		
		
		
		
		
		
		
		in.close();
		
	}
	

}
