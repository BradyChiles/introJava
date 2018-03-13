
public class BankAccount {

	private double balance;
	
	public BankAccount(double iB){
		balance = iB;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double deposit){
		balance = balance + deposit;
		return balance;
	}
	public double withdrawl(double withdrawl){
		balance = balance - withdrawl;
		return balance;
	}
}
