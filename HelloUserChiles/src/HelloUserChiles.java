import javax.swing.JOptionPane;

public class HelloUserChiles {
	
		//Brady Chiles
	public static void main(String[] args){
		
		String firstName;
		firstName = JOptionPane.showInputDialog("Wat is your first name?");
		String s1 = firstName.substring(0,1).toUpperCase();
		String s2 = firstName.substring(1).toLowerCase();
		String nameCapitalized = s1 + s2;
		
		String age;
		age = JOptionPane.showInputDialog("What is your age?");
		int agePlusOne = Integer.parseInt(age) + 1;
		
		String nameAge = ("Howdy, " + nameCapitalized + ". ") + "Next year you will be " + agePlusOne + " years old." ;
		
		JOptionPane.showMessageDialog(null, nameAge);
		
		System.exit(0);
	}
}
