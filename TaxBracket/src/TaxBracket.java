import java.util.Scanner;
public class TaxBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			
		System.out.println("Enter net annual income: ");
		double income = in.nextDouble();
		 double rate = .396;
		if (income <=9275){
			rate = .10;
		}else if ((income <= 37650) && (income >9275)){
			rate = .15;
			
		}else if ((income <= 91150) && (income >37650)){
			rate = .25;
			
		}else if ((income <= 190150) && (income >91150)){
			rate = .28;
			
		}else if ((income <= 413350) && (income > 190150)){
			rate = .33;
			
		}else if((income <= 415050) && (income > 413350)){
			rate = .35;
			
		}else{
			rate = .396;
		}
		
		double taxRate = income * rate;
		System.out.printf("You will owe %.2f in taxes.",taxRate);
		
		
		
		
		in.close();
	}

}
