import java.util.Scanner;
public class BankTransactionChiles {
	//Brady Chiles
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double checkingBalance = 0;
		double savingsBalance = 0;
		double transactionAmount = 0;
		String accountType = "";
		String transactionType = "";
		String positiveMessage = "Please enter a positive amount: ";
		int counter = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your checking account balance? ");
		 checkingBalance = in.nextDouble();
		
		while(checkingBalance < 0){
			System.out.print(positiveMessage);
			 checkingBalance = in.nextDouble();
		}
		
		System.out.print("What is your savings account balance? ");
		 savingsBalance = in.nextDouble();
		
		while(savingsBalance < 0){
			System.out.println(positiveMessage);
			savingsBalance = in.nextDouble();
		}
		while(counter > 0){
		System.out.println("What type of transaction would you like to make? [D]eposit, [W]ithdrawal, or [T]ransfer?");
		transactionType = in.next().toUpperCase();
		
		if(transactionType.equals("D")){
			System.out.println("Which account would you like to make a deposit in? [C]hecking or [S]avings?");
			 accountType = in.next().toUpperCase();
			
				if(accountType.equals("C")){
					System.out.println("How much would you like to deposit into checking? ");
					transactionAmount = in.nextDouble();
					while(transactionAmount < 0){
						System.out.println(positiveMessage);
						transactionAmount = in.nextDouble();	
					}	
					checkingBalance = checkingBalance + transactionAmount;
				}else if(accountType.equals("S")){
					System.out.println("How much would you like to deposit into savings? ");
					transactionAmount = in.nextDouble();
					while(transactionAmount < 0){
						System.out.println(positiveMessage);
						transactionAmount = in.nextDouble();	
					}
					savingsBalance = savingsBalance + transactionAmount;
				}
				
		}else if(transactionType.equals("W")){
			System.out.println("Which account would you like to withdraw from? [C]hecking or [S]avings? ");
			accountType = in.next().toUpperCase();
				if(accountType.equals("C")){
					System.out.println("How much would you like to withdraw from checking? ");
					transactionAmount = in.nextDouble();
					while(transactionAmount < 0){
						System.out.println(positiveMessage);
						transactionAmount = in.nextDouble();
					}while(transactionAmount > checkingBalance){
						System.out.println("You cannot overdraw your account. Please enter an amount that is less than or equal to " + checkingBalance + ".");
						transactionAmount = in.nextDouble();
					}
					checkingBalance = checkingBalance - transactionAmount;
				}else if(accountType.equals("S")){
					System.out.println("How much would you like to withdraw from savings? ");
					transactionAmount = in.nextDouble();
					while(transactionAmount < 0){
						System.out.println(positiveMessage);
						transactionAmount = in.nextDouble();
					}while(transactionAmount > savingsBalance){
						System.out.println("You cannot overdraw your account. Please enter a number less than or equal to " + savingsBalance + ".");
						transactionAmount = in.nextDouble();
					}
					savingsBalance = savingsBalance - transactionAmount;
				}
		}else if(transactionType.equals("T")){
			System.out.println("Which account would you like to transfer from? [C]hecking or [S]avings?");
			accountType = in.next().toUpperCase();
			if(accountType.equals("C")){
				System.out.println("How much would you like to transfer from checking to savings? ");
				transactionAmount = in.nextDouble();
				while(transactionAmount < 0){
					System.out.println(positiveMessage);
					transactionAmount = in.nextDouble();
				}while(transactionAmount > checkingBalance){
					System.out.println("You cannot overdraw your account. Please enter an amount that is less than or equal to " + checkingBalance + ".");
					transactionAmount = in.nextDouble();
				}	
				checkingBalance = checkingBalance - transactionAmount;
				savingsBalance = savingsBalance + transactionAmount;
			}else if(accountType.equals("S")){
				System.out.println("How much would you like to transfer from savings to checking?");
				transactionAmount = in.nextDouble();
				while(transactionAmount < 0){
					System.out.println(positiveMessage);
					transactionAmount = in.nextDouble();
				}while(transactionAmount > savingsBalance){
					System.out.println("You cannot overdraw your account. Please enter a number less than or equal to " + savingsBalance + ".");
					transactionAmount = in.nextDouble();
				}
				checkingBalance = checkingBalance + transactionAmount;
				savingsBalance = savingsBalance - transactionAmount;
			}
		}else{
				System.out.println("*Error* Please enter [D] for Deposit, [W] for Withdrawal or [T] for Transfer.");
				
		}
		
		
		System.out.printf("Your checking balance is %.2f\n",checkingBalance);
		System.out.printf("Your savings balance is %.2f\n", savingsBalance);
		System.out.println("Would you like to make another transaction? [Y]es or [N]o? ");
		String anotherTransaction = in.next().toUpperCase();
		if(anotherTransaction.equals("Y")){
			counter++;
		}else if(anotherTransaction.equals("N")){
			counter = counter - counter;
			System.out.println("Thank you, and have a nice day.");
		}
			
		}
		
		in.close();
	}

}
